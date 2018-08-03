/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.apache.flink.formats.avro.generated;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class SdkLog extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 6251478077737953385L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SdkLog\",\"namespace\":\"org.apache.flink.formats.avro.generated\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"name\",\"type\":[\"null\",\"string\"]},{\"name\":\"age\",\"type\":[\"null\",\"int\"]},{\"name\":\"event\",\"type\":{\"type\":\"map\",\"values\":\"string\"}},{\"name\":\"intMap\",\"type\":{\"type\":\"map\",\"values\":\"int\"}},{\"name\":\"strArray\",\"type\":{\"type\":\"array\",\"items\":\"string\"}},{\"name\":\"recMap\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"record\",\"name\":\"SdkLogRecord\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"}]}}},{\"name\":\"recArray\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"OSInstallRecord\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<SdkLog> ENCODER =
      new BinaryMessageEncoder<SdkLog>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<SdkLog> DECODER =
      new BinaryMessageDecoder<SdkLog>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<SdkLog> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<SdkLog> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<SdkLog>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this SdkLog to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a SdkLog from a ByteBuffer. */
  public static SdkLog fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public int id;
  @Deprecated public java.lang.CharSequence name;
  @Deprecated public java.lang.Integer age;
  @Deprecated public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> event;
  @Deprecated public java.util.Map<java.lang.CharSequence,java.lang.Integer> intMap;
  @Deprecated public java.util.List<java.lang.CharSequence> strArray;
  @Deprecated public java.util.Map<java.lang.CharSequence,org.apache.flink.formats.avro.generated.SdkLogRecord> recMap;
  @Deprecated public java.util.List<org.apache.flink.formats.avro.generated.OSInstallRecord> recArray;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public SdkLog() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param name The new value for name
   * @param age The new value for age
   * @param event The new value for event
   * @param intMap The new value for intMap
   * @param strArray The new value for strArray
   * @param recMap The new value for recMap
   * @param recArray The new value for recArray
   */
  public SdkLog(java.lang.Integer id, java.lang.CharSequence name, java.lang.Integer age, java.util.Map<java.lang.CharSequence,java.lang.CharSequence> event, java.util.Map<java.lang.CharSequence,java.lang.Integer> intMap, java.util.List<java.lang.CharSequence> strArray, java.util.Map<java.lang.CharSequence,org.apache.flink.formats.avro.generated.SdkLogRecord> recMap, java.util.List<org.apache.flink.formats.avro.generated.OSInstallRecord> recArray) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.event = event;
    this.intMap = intMap;
    this.strArray = strArray;
    this.recMap = recMap;
    this.recArray = recArray;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return age;
    case 3: return event;
    case 4: return intMap;
    case 5: return strArray;
    case 6: return recMap;
    case 7: return recArray;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Integer)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: age = (java.lang.Integer)value$; break;
    case 3: event = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>)value$; break;
    case 4: intMap = (java.util.Map<java.lang.CharSequence,java.lang.Integer>)value$; break;
    case 5: strArray = (java.util.List<java.lang.CharSequence>)value$; break;
    case 6: recMap = (java.util.Map<java.lang.CharSequence,org.apache.flink.formats.avro.generated.SdkLogRecord>)value$; break;
    case 7: recArray = (java.util.List<org.apache.flink.formats.avro.generated.OSInstallRecord>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.Integer getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.Integer value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'age' field.
   * @return The value of the 'age' field.
   */
  public java.lang.Integer getAge() {
    return age;
  }

  /**
   * Sets the value of the 'age' field.
   * @param value the value to set.
   */
  public void setAge(java.lang.Integer value) {
    this.age = value;
  }

  /**
   * Gets the value of the 'event' field.
   * @return The value of the 'event' field.
   */
  public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getEvent() {
    return event;
  }

  /**
   * Sets the value of the 'event' field.
   * @param value the value to set.
   */
  public void setEvent(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
    this.event = value;
  }

  /**
   * Gets the value of the 'intMap' field.
   * @return The value of the 'intMap' field.
   */
  public java.util.Map<java.lang.CharSequence,java.lang.Integer> getIntMap() {
    return intMap;
  }

  /**
   * Sets the value of the 'intMap' field.
   * @param value the value to set.
   */
  public void setIntMap(java.util.Map<java.lang.CharSequence,java.lang.Integer> value) {
    this.intMap = value;
  }

  /**
   * Gets the value of the 'strArray' field.
   * @return The value of the 'strArray' field.
   */
  public java.util.List<java.lang.CharSequence> getStrArray() {
    return strArray;
  }

  /**
   * Sets the value of the 'strArray' field.
   * @param value the value to set.
   */
  public void setStrArray(java.util.List<java.lang.CharSequence> value) {
    this.strArray = value;
  }

  /**
   * Gets the value of the 'recMap' field.
   * @return The value of the 'recMap' field.
   */
  public java.util.Map<java.lang.CharSequence,org.apache.flink.formats.avro.generated.SdkLogRecord> getRecMap() {
    return recMap;
  }

  /**
   * Sets the value of the 'recMap' field.
   * @param value the value to set.
   */
  public void setRecMap(java.util.Map<java.lang.CharSequence,org.apache.flink.formats.avro.generated.SdkLogRecord> value) {
    this.recMap = value;
  }

  /**
   * Gets the value of the 'recArray' field.
   * @return The value of the 'recArray' field.
   */
  public java.util.List<org.apache.flink.formats.avro.generated.OSInstallRecord> getRecArray() {
    return recArray;
  }

  /**
   * Sets the value of the 'recArray' field.
   * @param value the value to set.
   */
  public void setRecArray(java.util.List<org.apache.flink.formats.avro.generated.OSInstallRecord> value) {
    this.recArray = value;
  }

  /**
   * Creates a new SdkLog RecordBuilder.
   * @return A new SdkLog RecordBuilder
   */
  public static org.apache.flink.formats.avro.generated.SdkLog.Builder newBuilder() {
    return new org.apache.flink.formats.avro.generated.SdkLog.Builder();
  }

  /**
   * Creates a new SdkLog RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new SdkLog RecordBuilder
   */
  public static org.apache.flink.formats.avro.generated.SdkLog.Builder newBuilder(org.apache.flink.formats.avro.generated.SdkLog.Builder other) {
    return new org.apache.flink.formats.avro.generated.SdkLog.Builder(other);
  }

  /**
   * Creates a new SdkLog RecordBuilder by copying an existing SdkLog instance.
   * @param other The existing instance to copy.
   * @return A new SdkLog RecordBuilder
   */
  public static org.apache.flink.formats.avro.generated.SdkLog.Builder newBuilder(org.apache.flink.formats.avro.generated.SdkLog other) {
    return new org.apache.flink.formats.avro.generated.SdkLog.Builder(other);
  }

  /**
   * RecordBuilder for SdkLog instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SdkLog>
    implements org.apache.avro.data.RecordBuilder<SdkLog> {

    private int id;
    private java.lang.CharSequence name;
    private java.lang.Integer age;
    private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> event;
    private java.util.Map<java.lang.CharSequence,java.lang.Integer> intMap;
    private java.util.List<java.lang.CharSequence> strArray;
    private java.util.Map<java.lang.CharSequence,org.apache.flink.formats.avro.generated.SdkLogRecord> recMap;
    private java.util.List<org.apache.flink.formats.avro.generated.OSInstallRecord> recArray;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.flink.formats.avro.generated.SdkLog.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.age)) {
        this.age = data().deepCopy(fields()[2].schema(), other.age);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.event)) {
        this.event = data().deepCopy(fields()[3].schema(), other.event);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.intMap)) {
        this.intMap = data().deepCopy(fields()[4].schema(), other.intMap);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.strArray)) {
        this.strArray = data().deepCopy(fields()[5].schema(), other.strArray);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.recMap)) {
        this.recMap = data().deepCopy(fields()[6].schema(), other.recMap);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.recArray)) {
        this.recArray = data().deepCopy(fields()[7].schema(), other.recArray);
        fieldSetFlags()[7] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing SdkLog instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.flink.formats.avro.generated.SdkLog other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.age)) {
        this.age = data().deepCopy(fields()[2].schema(), other.age);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.event)) {
        this.event = data().deepCopy(fields()[3].schema(), other.event);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.intMap)) {
        this.intMap = data().deepCopy(fields()[4].schema(), other.intMap);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.strArray)) {
        this.strArray = data().deepCopy(fields()[5].schema(), other.strArray);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.recMap)) {
        this.recMap = data().deepCopy(fields()[6].schema(), other.recMap);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.recArray)) {
        this.recArray = data().deepCopy(fields()[7].schema(), other.recArray);
        fieldSetFlags()[7] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.Integer getId() {
      return id;
    }

    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public org.apache.flink.formats.avro.generated.SdkLog.Builder setId(int value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public org.apache.flink.formats.avro.generated.SdkLog.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }

    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public org.apache.flink.formats.avro.generated.SdkLog.Builder setName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public org.apache.flink.formats.avro.generated.SdkLog.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'age' field.
      * @return The value.
      */
    public java.lang.Integer getAge() {
      return age;
    }

    /**
      * Sets the value of the 'age' field.
      * @param value The value of 'age'.
      * @return This builder.
      */
    public org.apache.flink.formats.avro.generated.SdkLog.Builder setAge(java.lang.Integer value) {
      validate(fields()[2], value);
      this.age = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'age' field has been set.
      * @return True if the 'age' field has been set, false otherwise.
      */
    public boolean hasAge() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'age' field.
      * @return This builder.
      */
    public org.apache.flink.formats.avro.generated.SdkLog.Builder clearAge() {
      age = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'event' field.
      * @return The value.
      */
    public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getEvent() {
      return event;
    }

    /**
      * Sets the value of the 'event' field.
      * @param value The value of 'event'.
      * @return This builder.
      */
    public org.apache.flink.formats.avro.generated.SdkLog.Builder setEvent(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
      validate(fields()[3], value);
      this.event = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'event' field has been set.
      * @return True if the 'event' field has been set, false otherwise.
      */
    public boolean hasEvent() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'event' field.
      * @return This builder.
      */
    public org.apache.flink.formats.avro.generated.SdkLog.Builder clearEvent() {
      event = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'intMap' field.
      * @return The value.
      */
    public java.util.Map<java.lang.CharSequence,java.lang.Integer> getIntMap() {
      return intMap;
    }

    /**
      * Sets the value of the 'intMap' field.
      * @param value The value of 'intMap'.
      * @return This builder.
      */
    public org.apache.flink.formats.avro.generated.SdkLog.Builder setIntMap(java.util.Map<java.lang.CharSequence,java.lang.Integer> value) {
      validate(fields()[4], value);
      this.intMap = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'intMap' field has been set.
      * @return True if the 'intMap' field has been set, false otherwise.
      */
    public boolean hasIntMap() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'intMap' field.
      * @return This builder.
      */
    public org.apache.flink.formats.avro.generated.SdkLog.Builder clearIntMap() {
      intMap = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'strArray' field.
      * @return The value.
      */
    public java.util.List<java.lang.CharSequence> getStrArray() {
      return strArray;
    }

    /**
      * Sets the value of the 'strArray' field.
      * @param value The value of 'strArray'.
      * @return This builder.
      */
    public org.apache.flink.formats.avro.generated.SdkLog.Builder setStrArray(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[5], value);
      this.strArray = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'strArray' field has been set.
      * @return True if the 'strArray' field has been set, false otherwise.
      */
    public boolean hasStrArray() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'strArray' field.
      * @return This builder.
      */
    public org.apache.flink.formats.avro.generated.SdkLog.Builder clearStrArray() {
      strArray = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'recMap' field.
      * @return The value.
      */
    public java.util.Map<java.lang.CharSequence,org.apache.flink.formats.avro.generated.SdkLogRecord> getRecMap() {
      return recMap;
    }

    /**
      * Sets the value of the 'recMap' field.
      * @param value The value of 'recMap'.
      * @return This builder.
      */
    public org.apache.flink.formats.avro.generated.SdkLog.Builder setRecMap(java.util.Map<java.lang.CharSequence,org.apache.flink.formats.avro.generated.SdkLogRecord> value) {
      validate(fields()[6], value);
      this.recMap = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'recMap' field has been set.
      * @return True if the 'recMap' field has been set, false otherwise.
      */
    public boolean hasRecMap() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'recMap' field.
      * @return This builder.
      */
    public org.apache.flink.formats.avro.generated.SdkLog.Builder clearRecMap() {
      recMap = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'recArray' field.
      * @return The value.
      */
    public java.util.List<org.apache.flink.formats.avro.generated.OSInstallRecord> getRecArray() {
      return recArray;
    }

    /**
      * Sets the value of the 'recArray' field.
      * @param value The value of 'recArray'.
      * @return This builder.
      */
    public org.apache.flink.formats.avro.generated.SdkLog.Builder setRecArray(java.util.List<org.apache.flink.formats.avro.generated.OSInstallRecord> value) {
      validate(fields()[7], value);
      this.recArray = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'recArray' field has been set.
      * @return True if the 'recArray' field has been set, false otherwise.
      */
    public boolean hasRecArray() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'recArray' field.
      * @return This builder.
      */
    public org.apache.flink.formats.avro.generated.SdkLog.Builder clearRecArray() {
      recArray = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public SdkLog build() {
      try {
        SdkLog record = new SdkLog();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Integer) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.age = fieldSetFlags()[2] ? this.age : (java.lang.Integer) defaultValue(fields()[2]);
        record.event = fieldSetFlags()[3] ? this.event : (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) defaultValue(fields()[3]);
        record.intMap = fieldSetFlags()[4] ? this.intMap : (java.util.Map<java.lang.CharSequence,java.lang.Integer>) defaultValue(fields()[4]);
        record.strArray = fieldSetFlags()[5] ? this.strArray : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[5]);
        record.recMap = fieldSetFlags()[6] ? this.recMap : (java.util.Map<java.lang.CharSequence,org.apache.flink.formats.avro.generated.SdkLogRecord>) defaultValue(fields()[6]);
        record.recArray = fieldSetFlags()[7] ? this.recArray : (java.util.List<org.apache.flink.formats.avro.generated.OSInstallRecord>) defaultValue(fields()[7]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<SdkLog>
    WRITER$ = (org.apache.avro.io.DatumWriter<SdkLog>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<SdkLog>
    READER$ = (org.apache.avro.io.DatumReader<SdkLog>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}