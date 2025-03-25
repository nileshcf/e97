package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdSqlcaLineSizeGroupSerialized is used to define offsets in order to serialize in a
 * fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdSqlcaLineSizeGroupSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdSqlcaLineSizeGroupSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_SQLCA_LINE_SIZE_GROUP_LENGTH = 4;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdSqlcaLineSize;

  /** Constructor for GdSqlcaLineSizeGroupSerialized */
  public GdSqlcaLineSizeGroupSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdSqlcaLineSizeGroupSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdSqlcaLineSizeGroupSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdSqlcaLineSizeGroupSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 2581); // serialize this field at offset 2581 by default
  }

  /**
   * sets parent for this GdSqlcaLineSizeGroupSerialized to the parent and set the serialize offset
   * to parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 2581 by default
  }
  /** initializes the field in GdSqlcaLineSizeGroupSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_SQLCA_LINE_SIZE_GROUP_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdSqlcaLineSize = getStartOffset() + 0; // set offset for serialization

    /*  end of offset */
  }

  int localGdSqlcaLineSizeCounter = -1;

  public boolean isGdSqlcaLineSizeModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdSqlcaLineSizeCounter != sharedCounter;
    localGdSqlcaLineSizeCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_SQLCA_LINE_SIZE_LEN = 4;
  /** serializeGdSqlcaLineSize */
  protected void serializeGdSqlcaLineSize(int gdSqlcaLineSize) {
    replaceValue( //  save the value as string
        getBinaryString(gdSqlcaLineSize, GD_SQLCA_LINE_SIZE_LEN),
        beginGdSqlcaLineSize,
        GD_SQLCA_LINE_SIZE_LEN);
    localGdSqlcaLineSizeCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkGdSqlcaLineSizeMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshGdSqlcaLineSize is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshGdSqlcaLineSize() {
    return (getInt(beginGdSqlcaLineSize));
  }
}
