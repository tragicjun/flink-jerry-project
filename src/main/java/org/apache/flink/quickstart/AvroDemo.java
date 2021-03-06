package org.apache.flink.quickstart;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.*;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;
import org.apache.flink.formats.avro.AvroRowSerializationSchema;
import org.apache.flink.formats.avro.generated.SdkLog;
import org.apache.flink.types.Row;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jerryjzhang on 18/5/19.
 */
public class AvroDemo {
    private static final String AVRO_SCHEMA = "\n" +
            "{\"namespace\": \"org.apache.flink.formats.avro.generated\",\n" +
            " \"type\": \"record\",\n" +
            " \"name\": \"SdkLog\",\n" +
            " \"fields\": [\n" +
            "     {\"name\": \"id\", \"type\": \"int\"},\n" +
            "     {\"name\": \"name\", \"type\": \"string\"},\n" +
            "     {\"name\": \"age\", \"type\": \"int\"},\n" +
            "     {\"name\":\"event\", \"type\": {\"type\": \"map\", \"values\": \"string\"}}\n" +
            "  ]\n" +
            "}\n";

    public static void main(String [] args)throws Exception{
        byte[] content = serializeToByteArray();

        // deserialize with code generation
        BinaryDecoder decoder = DecoderFactory.get().binaryDecoder(content, null);
        DatumReader<SdkLog> datumReader = new SpecificDatumReader<>(SdkLog.getClassSchema());
        SdkLog sl = datumReader.read(null, decoder);
        System.out.println(sl.getAge());

        // deserialize without code generation
        decoder = DecoderFactory.get().binaryDecoder(content, null);
        Schema schema = new Schema.Parser().parse(AVRO_SCHEMA);
        DatumReader<GenericRecord> genericDatumReader = new GenericDatumReader<>(schema);
        GenericRecord genericRecord = genericDatumReader.read(null, decoder);
        System.out.println(genericRecord.get("age"));
    }

    private static byte[] serializeToByteArray()throws Exception{
        Map<CharSequence, CharSequence> event = new HashMap<>();
        event.put("eventTag", "10004");
        event.put("eventLog", "info");
        SdkLog record = SdkLog.newBuilder()
                .setId(1)
                .setName("jerryjzhang")
                .setAge(32)
                .setEvent(event)
                .build();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        BinaryEncoder encoder = EncoderFactory.get().binaryEncoder(out, null);
        DatumWriter<SdkLog> writer = new SpecificDatumWriter<>(SdkLog.getClassSchema());
        writer.write(record, encoder);
        encoder.flush();
        out.close();
        return out.toByteArray();
    }

    private static byte[] serializeToByteArrayWithFlink(){
        Map<String, String> event = new HashMap<>();
        event.put("eventTag", "10004");
        event.put("eventLog", "info");

        Row row = new Row(4);
        row.setField(0, 1);
        row.setField(1, "jerryjzhang");
        row.setField(2, 32);
        row.setField(3, event);

        AvroRowSerializationSchema serializationSchema = new AvroRowSerializationSchema(SdkLog.class);
        byte[] content = serializationSchema.serialize(row);
        return content;
    }
}
