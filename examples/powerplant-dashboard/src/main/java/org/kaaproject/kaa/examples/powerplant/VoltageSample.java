/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.examples.powerplant;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class VoltageSample extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"VoltageSample\",\"namespace\":\"org.kaaproject.kaa.examples.powerplant\",\"fields\":[{\"name\":\"panelId\",\"type\":\"int\"},{\"name\":\"voltage\",\"type\":\"double\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private int panelId;
   private double voltage;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public VoltageSample() {}

  /**
   * All-args constructor.
   */
  public VoltageSample(java.lang.Integer panelId, java.lang.Double voltage) {
    this.panelId = panelId;
    this.voltage = voltage;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return panelId;
    case 1: return voltage;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: panelId = (java.lang.Integer)value$; break;
    case 1: voltage = (java.lang.Double)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'panelId' field.
   */
  public java.lang.Integer getPanelId() {
    return panelId;
  }

  /**
   * Sets the value of the 'panelId' field.
   * @param value the value to set.
   */
  public void setPanelId(java.lang.Integer value) {
    this.panelId = value;
  }

  /**
   * Gets the value of the 'voltage' field.
   */
  public java.lang.Double getVoltage() {
    return voltage;
  }

  /**
   * Sets the value of the 'voltage' field.
   * @param value the value to set.
   */
  public void setVoltage(java.lang.Double value) {
    this.voltage = value;
  }

  /** Creates a new VoltageSample RecordBuilder */
  public static org.kaaproject.kaa.examples.powerplant.VoltageSample.Builder newBuilder() {
    return new org.kaaproject.kaa.examples.powerplant.VoltageSample.Builder();
  }
  
  /** Creates a new VoltageSample RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.examples.powerplant.VoltageSample.Builder newBuilder(org.kaaproject.kaa.examples.powerplant.VoltageSample.Builder other) {
    return new org.kaaproject.kaa.examples.powerplant.VoltageSample.Builder(other);
  }
  
  /** Creates a new VoltageSample RecordBuilder by copying an existing VoltageSample instance */
  public static org.kaaproject.kaa.examples.powerplant.VoltageSample.Builder newBuilder(org.kaaproject.kaa.examples.powerplant.VoltageSample other) {
    return new org.kaaproject.kaa.examples.powerplant.VoltageSample.Builder(other);
  }
  
  /**
   * RecordBuilder for VoltageSample instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<VoltageSample>
    implements org.apache.avro.data.RecordBuilder<VoltageSample> {

    private int panelId;
    private double voltage;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.examples.powerplant.VoltageSample.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.examples.powerplant.VoltageSample.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.panelId)) {
        this.panelId = data().deepCopy(fields()[0].schema(), other.panelId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.voltage)) {
        this.voltage = data().deepCopy(fields()[1].schema(), other.voltage);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing VoltageSample instance */
    private Builder(org.kaaproject.kaa.examples.powerplant.VoltageSample other) {
            super(org.kaaproject.kaa.examples.powerplant.VoltageSample.SCHEMA$);
      if (isValidValue(fields()[0], other.panelId)) {
        this.panelId = data().deepCopy(fields()[0].schema(), other.panelId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.voltage)) {
        this.voltage = data().deepCopy(fields()[1].schema(), other.voltage);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'panelId' field */
    public java.lang.Integer getPanelId() {
      return panelId;
    }
    
    /** Sets the value of the 'panelId' field */
    public org.kaaproject.kaa.examples.powerplant.VoltageSample.Builder setPanelId(int value) {
      validate(fields()[0], value);
      this.panelId = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'panelId' field has been set */
    public boolean hasPanelId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'panelId' field */
    public org.kaaproject.kaa.examples.powerplant.VoltageSample.Builder clearPanelId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'voltage' field */
    public java.lang.Double getVoltage() {
      return voltage;
    }
    
    /** Sets the value of the 'voltage' field */
    public org.kaaproject.kaa.examples.powerplant.VoltageSample.Builder setVoltage(double value) {
      validate(fields()[1], value);
      this.voltage = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'voltage' field has been set */
    public boolean hasVoltage() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'voltage' field */
    public org.kaaproject.kaa.examples.powerplant.VoltageSample.Builder clearVoltage() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public VoltageSample build() {
      try {
        VoltageSample record = new VoltageSample();
        record.panelId = fieldSetFlags()[0] ? this.panelId : (java.lang.Integer) defaultValue(fields()[0]);
        record.voltage = fieldSetFlags()[1] ? this.voltage : (java.lang.Double) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}