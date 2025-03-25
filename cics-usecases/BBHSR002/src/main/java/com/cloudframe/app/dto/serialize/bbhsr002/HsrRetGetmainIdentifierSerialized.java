package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class HsrRetGetmainIdentifierSerialized is used to define offsets in order to serialize in a
 * fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HsrRetGetmainIdentifierSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(HsrRetGetmainIdentifierSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int HSR_RET_GETMAIN_IDENTIFIER_LENGTH = 16;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginHsrRetGetmainCreator;
  protected int beginHsrRetGetmainCopybook;

  /** Constructor for HsrRetGetmainIdentifierSerialized */
  public HsrRetGetmainIdentifierSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for HsrRetGetmainIdentifierSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public HsrRetGetmainIdentifierSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this HsrRetGetmainIdentifierSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 0); // serialize this field at offset 0 by default
  }

  /**
   * sets parent for this HsrRetGetmainIdentifierSerialized to the parent and set the serialize
   * offset to parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 0 by default
  }
  /** initializes the field in HsrRetGetmainIdentifierSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(HSR_RET_GETMAIN_IDENTIFIER_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginHsrRetGetmainCreator = getStartOffset() + 0; // set offset for serialization

    beginHsrRetGetmainCopybook = getStartOffset() + 8; // set offset for serialization

    /*  end of offset */
  }

  int localHsrRetGetmainCreatorCounter = -1;

  public boolean isHsrRetGetmainCreatorModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHsrRetGetmainCreatorCounter != sharedCounter;
    localHsrRetGetmainCreatorCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HSR_RET_GETMAIN_CREATOR_LEN = 8;
  /** serialize this HsrRetGetmainCreator */
  protected void serializeHsrRetGetmainCreator(char[] hsrRetGetmainCreator) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        hsrRetGetmainCreator,
        0,
        getStringValue(),
        beginHsrRetGetmainCreator,
        HSR_RET_GETMAIN_CREATOR_LEN);
    localHsrRetGetmainCreatorCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHsrRetGetmainCreatorConstraints(char[] value) {
    return super.checkConstraints(value, 8, false, false);
  }
  /**
   * refreshHsrRetGetmainCreator is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshHsrRetGetmainCreator() {
    return (substring(
        getStringValue(),
        beginHsrRetGetmainCreator,
        beginHsrRetGetmainCreator + HSR_RET_GETMAIN_CREATOR_LEN));
  }

  int localHsrRetGetmainCopybookCounter = -1;

  public boolean isHsrRetGetmainCopybookModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHsrRetGetmainCopybookCounter != sharedCounter;
    localHsrRetGetmainCopybookCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HSR_RET_GETMAIN_COPYBOOK_LEN = 8;
  /** serialize this HsrRetGetmainCopybook */
  protected void serializeHsrRetGetmainCopybook(char[] hsrRetGetmainCopybook) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        hsrRetGetmainCopybook,
        0,
        getStringValue(),
        beginHsrRetGetmainCopybook,
        HSR_RET_GETMAIN_COPYBOOK_LEN);
    localHsrRetGetmainCopybookCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHsrRetGetmainCopybookConstraints(char[] value) {
    return super.checkConstraints(value, 8, false, false);
  }
  /**
   * refreshHsrRetGetmainCopybook is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshHsrRetGetmainCopybook() {
    return (substring(
        getStringValue(),
        beginHsrRetGetmainCopybook,
        beginHsrRetGetmainCopybook + HSR_RET_GETMAIN_COPYBOOK_LEN));
  }
}
