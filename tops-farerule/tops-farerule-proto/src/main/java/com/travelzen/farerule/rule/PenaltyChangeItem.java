/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.travelzen.farerule.rule;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PenaltyChangeItem implements org.apache.thrift.TBase<PenaltyChangeItem, PenaltyChangeItem._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PenaltyChangeItem");

  private static final org.apache.thrift.protocol.TField PENALTY_CHANGE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("penaltyChangeType", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField USED_FIELD_DESC = new org.apache.thrift.protocol.TField("used", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField PENALTY_CONDITION_FIELD_DESC = new org.apache.thrift.protocol.TField("penaltyCondition", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField PENALTY_CONTENT_FIELD_DESC = new org.apache.thrift.protocol.TField("penaltyContent", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PenaltyChangeItemStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PenaltyChangeItemTupleSchemeFactory());
  }

  /**
   * 
   * @see PenaltyChangeTypeEnum
   */
  public PenaltyChangeTypeEnum penaltyChangeType; // required
  public boolean used; // optional
  public PenaltyCondition penaltyCondition; // optional
  public PenaltyContent penaltyContent; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see PenaltyChangeTypeEnum
     */
    PENALTY_CHANGE_TYPE((short)1, "penaltyChangeType"),
    USED((short)2, "used"),
    PENALTY_CONDITION((short)3, "penaltyCondition"),
    PENALTY_CONTENT((short)4, "penaltyContent");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PENALTY_CHANGE_TYPE
          return PENALTY_CHANGE_TYPE;
        case 2: // USED
          return USED;
        case 3: // PENALTY_CONDITION
          return PENALTY_CONDITION;
        case 4: // PENALTY_CONTENT
          return PENALTY_CONTENT;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __USED_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.USED,_Fields.PENALTY_CONDITION,_Fields.PENALTY_CONTENT};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PENALTY_CHANGE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("penaltyChangeType", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, PenaltyChangeTypeEnum.class)));
    tmpMap.put(_Fields.USED, new org.apache.thrift.meta_data.FieldMetaData("used", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.PENALTY_CONDITION, new org.apache.thrift.meta_data.FieldMetaData("penaltyCondition", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PenaltyCondition.class)));
    tmpMap.put(_Fields.PENALTY_CONTENT, new org.apache.thrift.meta_data.FieldMetaData("penaltyContent", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PenaltyContent.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PenaltyChangeItem.class, metaDataMap);
  }

  public PenaltyChangeItem() {
  }

  public PenaltyChangeItem(
    PenaltyChangeTypeEnum penaltyChangeType)
  {
    this();
    this.penaltyChangeType = penaltyChangeType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PenaltyChangeItem(PenaltyChangeItem other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetPenaltyChangeType()) {
      this.penaltyChangeType = other.penaltyChangeType;
    }
    this.used = other.used;
    if (other.isSetPenaltyCondition()) {
      this.penaltyCondition = new PenaltyCondition(other.penaltyCondition);
    }
    if (other.isSetPenaltyContent()) {
      this.penaltyContent = new PenaltyContent(other.penaltyContent);
    }
  }

  public PenaltyChangeItem deepCopy() {
    return new PenaltyChangeItem(this);
  }

  @Override
  public void clear() {
    this.penaltyChangeType = null;
    setUsedIsSet(false);
    this.used = false;
    this.penaltyCondition = null;
    this.penaltyContent = null;
  }

  /**
   * 
   * @see PenaltyChangeTypeEnum
   */
  public PenaltyChangeTypeEnum getPenaltyChangeType() {
    return this.penaltyChangeType;
  }

  /**
   * 
   * @see PenaltyChangeTypeEnum
   */
  public PenaltyChangeItem setPenaltyChangeType(PenaltyChangeTypeEnum penaltyChangeType) {
    this.penaltyChangeType = penaltyChangeType;
    return this;
  }

  public void unsetPenaltyChangeType() {
    this.penaltyChangeType = null;
  }

  /** Returns true if field penaltyChangeType is set (has been assigned a value) and false otherwise */
  public boolean isSetPenaltyChangeType() {
    return this.penaltyChangeType != null;
  }

  public void setPenaltyChangeTypeIsSet(boolean value) {
    if (!value) {
      this.penaltyChangeType = null;
    }
  }

  public boolean isUsed() {
    return this.used;
  }

  public PenaltyChangeItem setUsed(boolean used) {
    this.used = used;
    setUsedIsSet(true);
    return this;
  }

  public void unsetUsed() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __USED_ISSET_ID);
  }

  /** Returns true if field used is set (has been assigned a value) and false otherwise */
  public boolean isSetUsed() {
    return EncodingUtils.testBit(__isset_bitfield, __USED_ISSET_ID);
  }

  public void setUsedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __USED_ISSET_ID, value);
  }

  public PenaltyCondition getPenaltyCondition() {
    return this.penaltyCondition;
  }

  public PenaltyChangeItem setPenaltyCondition(PenaltyCondition penaltyCondition) {
    this.penaltyCondition = penaltyCondition;
    return this;
  }

  public void unsetPenaltyCondition() {
    this.penaltyCondition = null;
  }

  /** Returns true if field penaltyCondition is set (has been assigned a value) and false otherwise */
  public boolean isSetPenaltyCondition() {
    return this.penaltyCondition != null;
  }

  public void setPenaltyConditionIsSet(boolean value) {
    if (!value) {
      this.penaltyCondition = null;
    }
  }

  public PenaltyContent getPenaltyContent() {
    return this.penaltyContent;
  }

  public PenaltyChangeItem setPenaltyContent(PenaltyContent penaltyContent) {
    this.penaltyContent = penaltyContent;
    return this;
  }

  public void unsetPenaltyContent() {
    this.penaltyContent = null;
  }

  /** Returns true if field penaltyContent is set (has been assigned a value) and false otherwise */
  public boolean isSetPenaltyContent() {
    return this.penaltyContent != null;
  }

  public void setPenaltyContentIsSet(boolean value) {
    if (!value) {
      this.penaltyContent = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PENALTY_CHANGE_TYPE:
      if (value == null) {
        unsetPenaltyChangeType();
      } else {
        setPenaltyChangeType((PenaltyChangeTypeEnum)value);
      }
      break;

    case USED:
      if (value == null) {
        unsetUsed();
      } else {
        setUsed((Boolean)value);
      }
      break;

    case PENALTY_CONDITION:
      if (value == null) {
        unsetPenaltyCondition();
      } else {
        setPenaltyCondition((PenaltyCondition)value);
      }
      break;

    case PENALTY_CONTENT:
      if (value == null) {
        unsetPenaltyContent();
      } else {
        setPenaltyContent((PenaltyContent)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PENALTY_CHANGE_TYPE:
      return getPenaltyChangeType();

    case USED:
      return Boolean.valueOf(isUsed());

    case PENALTY_CONDITION:
      return getPenaltyCondition();

    case PENALTY_CONTENT:
      return getPenaltyContent();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PENALTY_CHANGE_TYPE:
      return isSetPenaltyChangeType();
    case USED:
      return isSetUsed();
    case PENALTY_CONDITION:
      return isSetPenaltyCondition();
    case PENALTY_CONTENT:
      return isSetPenaltyContent();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PenaltyChangeItem)
      return this.equals((PenaltyChangeItem)that);
    return false;
  }

  public boolean equals(PenaltyChangeItem that) {
    if (that == null)
      return false;

    boolean this_present_penaltyChangeType = true && this.isSetPenaltyChangeType();
    boolean that_present_penaltyChangeType = true && that.isSetPenaltyChangeType();
    if (this_present_penaltyChangeType || that_present_penaltyChangeType) {
      if (!(this_present_penaltyChangeType && that_present_penaltyChangeType))
        return false;
      if (!this.penaltyChangeType.equals(that.penaltyChangeType))
        return false;
    }

    boolean this_present_used = true && this.isSetUsed();
    boolean that_present_used = true && that.isSetUsed();
    if (this_present_used || that_present_used) {
      if (!(this_present_used && that_present_used))
        return false;
      if (this.used != that.used)
        return false;
    }

    boolean this_present_penaltyCondition = true && this.isSetPenaltyCondition();
    boolean that_present_penaltyCondition = true && that.isSetPenaltyCondition();
    if (this_present_penaltyCondition || that_present_penaltyCondition) {
      if (!(this_present_penaltyCondition && that_present_penaltyCondition))
        return false;
      if (!this.penaltyCondition.equals(that.penaltyCondition))
        return false;
    }

    boolean this_present_penaltyContent = true && this.isSetPenaltyContent();
    boolean that_present_penaltyContent = true && that.isSetPenaltyContent();
    if (this_present_penaltyContent || that_present_penaltyContent) {
      if (!(this_present_penaltyContent && that_present_penaltyContent))
        return false;
      if (!this.penaltyContent.equals(that.penaltyContent))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(PenaltyChangeItem other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    PenaltyChangeItem typedOther = (PenaltyChangeItem)other;

    lastComparison = Boolean.valueOf(isSetPenaltyChangeType()).compareTo(typedOther.isSetPenaltyChangeType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPenaltyChangeType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.penaltyChangeType, typedOther.penaltyChangeType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUsed()).compareTo(typedOther.isSetUsed());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsed()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.used, typedOther.used);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPenaltyCondition()).compareTo(typedOther.isSetPenaltyCondition());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPenaltyCondition()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.penaltyCondition, typedOther.penaltyCondition);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPenaltyContent()).compareTo(typedOther.isSetPenaltyContent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPenaltyContent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.penaltyContent, typedOther.penaltyContent);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("PenaltyChangeItem(");
    boolean first = true;

    sb.append("penaltyChangeType:");
    if (this.penaltyChangeType == null) {
      sb.append("null");
    } else {
      sb.append(this.penaltyChangeType);
    }
    first = false;
    if (isSetUsed()) {
      if (!first) sb.append(", ");
      sb.append("used:");
      sb.append(this.used);
      first = false;
    }
    if (isSetPenaltyCondition()) {
      if (!first) sb.append(", ");
      sb.append("penaltyCondition:");
      if (this.penaltyCondition == null) {
        sb.append("null");
      } else {
        sb.append(this.penaltyCondition);
      }
      first = false;
    }
    if (isSetPenaltyContent()) {
      if (!first) sb.append(", ");
      sb.append("penaltyContent:");
      if (this.penaltyContent == null) {
        sb.append("null");
      } else {
        sb.append(this.penaltyContent);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (penaltyChangeType == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'penaltyChangeType' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (penaltyCondition != null) {
      penaltyCondition.validate();
    }
    if (penaltyContent != null) {
      penaltyContent.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PenaltyChangeItemStandardSchemeFactory implements SchemeFactory {
    public PenaltyChangeItemStandardScheme getScheme() {
      return new PenaltyChangeItemStandardScheme();
    }
  }

  private static class PenaltyChangeItemStandardScheme extends StandardScheme<PenaltyChangeItem> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PenaltyChangeItem struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PENALTY_CHANGE_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.penaltyChangeType = PenaltyChangeTypeEnum.findByValue(iprot.readI32());
              struct.setPenaltyChangeTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.used = iprot.readBool();
              struct.setUsedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PENALTY_CONDITION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.penaltyCondition = new PenaltyCondition();
              struct.penaltyCondition.read(iprot);
              struct.setPenaltyConditionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PENALTY_CONTENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.penaltyContent = new PenaltyContent();
              struct.penaltyContent.read(iprot);
              struct.setPenaltyContentIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, PenaltyChangeItem struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.penaltyChangeType != null) {
        oprot.writeFieldBegin(PENALTY_CHANGE_TYPE_FIELD_DESC);
        oprot.writeI32(struct.penaltyChangeType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.isSetUsed()) {
        oprot.writeFieldBegin(USED_FIELD_DESC);
        oprot.writeBool(struct.used);
        oprot.writeFieldEnd();
      }
      if (struct.penaltyCondition != null) {
        if (struct.isSetPenaltyCondition()) {
          oprot.writeFieldBegin(PENALTY_CONDITION_FIELD_DESC);
          struct.penaltyCondition.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.penaltyContent != null) {
        if (struct.isSetPenaltyContent()) {
          oprot.writeFieldBegin(PENALTY_CONTENT_FIELD_DESC);
          struct.penaltyContent.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PenaltyChangeItemTupleSchemeFactory implements SchemeFactory {
    public PenaltyChangeItemTupleScheme getScheme() {
      return new PenaltyChangeItemTupleScheme();
    }
  }

  private static class PenaltyChangeItemTupleScheme extends TupleScheme<PenaltyChangeItem> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PenaltyChangeItem struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.penaltyChangeType.getValue());
      BitSet optionals = new BitSet();
      if (struct.isSetUsed()) {
        optionals.set(0);
      }
      if (struct.isSetPenaltyCondition()) {
        optionals.set(1);
      }
      if (struct.isSetPenaltyContent()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetUsed()) {
        oprot.writeBool(struct.used);
      }
      if (struct.isSetPenaltyCondition()) {
        struct.penaltyCondition.write(oprot);
      }
      if (struct.isSetPenaltyContent()) {
        struct.penaltyContent.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PenaltyChangeItem struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.penaltyChangeType = PenaltyChangeTypeEnum.findByValue(iprot.readI32());
      struct.setPenaltyChangeTypeIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.used = iprot.readBool();
        struct.setUsedIsSet(true);
      }
      if (incoming.get(1)) {
        struct.penaltyCondition = new PenaltyCondition();
        struct.penaltyCondition.read(iprot);
        struct.setPenaltyConditionIsSet(true);
      }
      if (incoming.get(2)) {
        struct.penaltyContent = new PenaltyContent();
        struct.penaltyContent.read(iprot);
        struct.setPenaltyContentIsSet(true);
      }
    }
  }

}

