/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.oppo.dc.data.avro.generated;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class TagRecord extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7283049786261776174L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TagRecord\",\"namespace\":\"com.oppo.dc.data.avro.generated\",\"fields\":[{\"name\":\"imei\",\"type\":[\"null\",\"string\"]},{\"name\":\"tagKey\",\"type\":[\"null\",\"string\"]},{\"name\":\"tagValues\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"TagValue\",\"fields\":[{\"name\":\"value\",\"type\":[\"null\",\"string\"]},{\"name\":\"weight\",\"type\":[\"null\",\"string\"]},{\"name\":\"updateDate\",\"type\":[\"null\",\"string\"]}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<TagRecord> ENCODER =
      new BinaryMessageEncoder<TagRecord>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<TagRecord> DECODER =
      new BinaryMessageDecoder<TagRecord>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<TagRecord> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<TagRecord> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<TagRecord>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this TagRecord to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a TagRecord from a ByteBuffer. */
  public static TagRecord fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence imei;
  @Deprecated public java.lang.CharSequence tagKey;
  @Deprecated public java.util.List<com.oppo.dc.data.avro.generated.TagValue> tagValues;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public TagRecord() {}

  /**
   * All-args constructor.
   * @param imei The new value for imei
   * @param tagKey The new value for tagKey
   * @param tagValues The new value for tagValues
   */
  public TagRecord(java.lang.CharSequence imei, java.lang.CharSequence tagKey, java.util.List<com.oppo.dc.data.avro.generated.TagValue> tagValues) {
    this.imei = imei;
    this.tagKey = tagKey;
    this.tagValues = tagValues;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return imei;
    case 1: return tagKey;
    case 2: return tagValues;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: imei = (java.lang.CharSequence)value$; break;
    case 1: tagKey = (java.lang.CharSequence)value$; break;
    case 2: tagValues = (java.util.List<com.oppo.dc.data.avro.generated.TagValue>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'imei' field.
   * @return The value of the 'imei' field.
   */
  public java.lang.CharSequence getImei() {
    return imei;
  }

  /**
   * Sets the value of the 'imei' field.
   * @param value the value to set.
   */
  public void setImei(java.lang.CharSequence value) {
    this.imei = value;
  }

  /**
   * Gets the value of the 'tagKey' field.
   * @return The value of the 'tagKey' field.
   */
  public java.lang.CharSequence getTagKey() {
    return tagKey;
  }

  /**
   * Sets the value of the 'tagKey' field.
   * @param value the value to set.
   */
  public void setTagKey(java.lang.CharSequence value) {
    this.tagKey = value;
  }

  /**
   * Gets the value of the 'tagValues' field.
   * @return The value of the 'tagValues' field.
   */
  public java.util.List<com.oppo.dc.data.avro.generated.TagValue> getTagValues() {
    return tagValues;
  }

  /**
   * Sets the value of the 'tagValues' field.
   * @param value the value to set.
   */
  public void setTagValues(java.util.List<com.oppo.dc.data.avro.generated.TagValue> value) {
    this.tagValues = value;
  }

  /**
   * Creates a new TagRecord RecordBuilder.
   * @return A new TagRecord RecordBuilder
   */
  public static com.oppo.dc.data.avro.generated.TagRecord.Builder newBuilder() {
    return new com.oppo.dc.data.avro.generated.TagRecord.Builder();
  }

  /**
   * Creates a new TagRecord RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new TagRecord RecordBuilder
   */
  public static com.oppo.dc.data.avro.generated.TagRecord.Builder newBuilder(com.oppo.dc.data.avro.generated.TagRecord.Builder other) {
    return new com.oppo.dc.data.avro.generated.TagRecord.Builder(other);
  }

  /**
   * Creates a new TagRecord RecordBuilder by copying an existing TagRecord instance.
   * @param other The existing instance to copy.
   * @return A new TagRecord RecordBuilder
   */
  public static com.oppo.dc.data.avro.generated.TagRecord.Builder newBuilder(com.oppo.dc.data.avro.generated.TagRecord other) {
    return new com.oppo.dc.data.avro.generated.TagRecord.Builder(other);
  }

  /**
   * RecordBuilder for TagRecord instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TagRecord>
    implements org.apache.avro.data.RecordBuilder<TagRecord> {

    private java.lang.CharSequence imei;
    private java.lang.CharSequence tagKey;
    private java.util.List<com.oppo.dc.data.avro.generated.TagValue> tagValues;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.oppo.dc.data.avro.generated.TagRecord.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.imei)) {
        this.imei = data().deepCopy(fields()[0].schema(), other.imei);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.tagKey)) {
        this.tagKey = data().deepCopy(fields()[1].schema(), other.tagKey);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.tagValues)) {
        this.tagValues = data().deepCopy(fields()[2].schema(), other.tagValues);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing TagRecord instance
     * @param other The existing instance to copy.
     */
    private Builder(com.oppo.dc.data.avro.generated.TagRecord other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.imei)) {
        this.imei = data().deepCopy(fields()[0].schema(), other.imei);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.tagKey)) {
        this.tagKey = data().deepCopy(fields()[1].schema(), other.tagKey);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.tagValues)) {
        this.tagValues = data().deepCopy(fields()[2].schema(), other.tagValues);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'imei' field.
      * @return The value.
      */
    public java.lang.CharSequence getImei() {
      return imei;
    }

    /**
      * Sets the value of the 'imei' field.
      * @param value The value of 'imei'.
      * @return This builder.
      */
    public com.oppo.dc.data.avro.generated.TagRecord.Builder setImei(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.imei = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'imei' field has been set.
      * @return True if the 'imei' field has been set, false otherwise.
      */
    public boolean hasImei() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'imei' field.
      * @return This builder.
      */
    public com.oppo.dc.data.avro.generated.TagRecord.Builder clearImei() {
      imei = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'tagKey' field.
      * @return The value.
      */
    public java.lang.CharSequence getTagKey() {
      return tagKey;
    }

    /**
      * Sets the value of the 'tagKey' field.
      * @param value The value of 'tagKey'.
      * @return This builder.
      */
    public com.oppo.dc.data.avro.generated.TagRecord.Builder setTagKey(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.tagKey = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'tagKey' field has been set.
      * @return True if the 'tagKey' field has been set, false otherwise.
      */
    public boolean hasTagKey() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'tagKey' field.
      * @return This builder.
      */
    public com.oppo.dc.data.avro.generated.TagRecord.Builder clearTagKey() {
      tagKey = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'tagValues' field.
      * @return The value.
      */
    public java.util.List<com.oppo.dc.data.avro.generated.TagValue> getTagValues() {
      return tagValues;
    }

    /**
      * Sets the value of the 'tagValues' field.
      * @param value The value of 'tagValues'.
      * @return This builder.
      */
    public com.oppo.dc.data.avro.generated.TagRecord.Builder setTagValues(java.util.List<com.oppo.dc.data.avro.generated.TagValue> value) {
      validate(fields()[2], value);
      this.tagValues = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'tagValues' field has been set.
      * @return True if the 'tagValues' field has been set, false otherwise.
      */
    public boolean hasTagValues() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'tagValues' field.
      * @return This builder.
      */
    public com.oppo.dc.data.avro.generated.TagRecord.Builder clearTagValues() {
      tagValues = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public TagRecord build() {
      try {
        TagRecord record = new TagRecord();
        record.imei = fieldSetFlags()[0] ? this.imei : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.tagKey = fieldSetFlags()[1] ? this.tagKey : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.tagValues = fieldSetFlags()[2] ? this.tagValues : (java.util.List<com.oppo.dc.data.avro.generated.TagValue>) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<TagRecord>
    WRITER$ = (org.apache.avro.io.DatumWriter<TagRecord>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<TagRecord>
    READER$ = (org.apache.avro.io.DatumReader<TagRecord>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
