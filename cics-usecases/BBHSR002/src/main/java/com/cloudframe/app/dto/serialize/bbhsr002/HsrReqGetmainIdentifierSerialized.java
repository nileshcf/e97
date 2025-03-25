package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class HsrReqGetmainIdentifierSerialized is used to define offsets in order to serialize in a
 * fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HsrReqGetmainIdentifierSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(HsrReqGetmainIdentifierSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int HSR_REQ_GETMAIN_IDENTIFIER_LENGTH = 16;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginHsrReqGetmainCreator;
  protected int beginHsrReqGetmainCopybook;

  /** Constructor for HsrReqGetmainIdentifierSerialized */
  public HsrReqGetmainIdentifierSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for HsrReqGetmainIdentifierSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public HsrReqGetmainIdentifierSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this HsrReqGetmainIdentifierSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 23); // serialize this field at offset 23 by default
  }

  /**
   * sets parent for this HsrReqGetmainIdentifierSerialized to the parent and set the serialize
   * offset to parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 23 by default
  }
  /** initializes the field in HsrReqGetmainIdentifierSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(HSR_REQ_GETMAIN_IDENTIFIER_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginHsrReqGetmainCreator = getStartOffset() + 0; // set offset for serialization

    beginHsrReqGetmainCopybook = getStartOffset() + 8; // set offset for serialization

    /*  end of offset */
  }

  int localHsrReqGetmainCreatorCounter = -1;

  public boolean isHsrReqGetmainCreatorModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHsrReqGetmainCreatorCounter != sharedCounter;
    localHsrReqGetmainCreatorCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HSR_REQ_GETMAIN_CREATOR_LEN = 8;
  /** serialize this HsrReqGetmainCreator */
  protected void serializeHsrReqGetmainCreator(char[] hsrReqGetmainCreator) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        hsrReqGetmainCreator,
        0,
        getStringValue(),
        beginHsrReqGetmainCreator,
        HSR_REQ_GETMAIN_CREATOR_LEN);
    localHsrReqGetmainCreatorCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHsrReqGetmainCreatorConstraints(char[] value) {
    return super.checkConstraints(value, 8, false, false);
  }
  /**
   * refreshHsrReqGetmainCreator is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshHsrReqGetmainCreator() {
    return (substring(
        getStringValue(),
        beginHsrReqGetmainCreator,
        beginHsrReqGetmainCreator + HSR_REQ_GETMAIN_CREATOR_LEN));
  }

  int localHsrReqGetmainCopybookCounter = -1;

  public boolean isHsrReqGetmainCopybookModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHsrReqGetmainCopybookCounter != sharedCounter;
    localHsrReqGetmainCopybookCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HSR_REQ_GETMAIN_COPYBOOK_LEN = 8;
  /** serialize this HsrReqGetmainCopybook */
  protected void serializeHsrReqGetmainCopybook(char[] hsrReqGetmainCopybook) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        hsrReqGetmainCopybook,
        0,
        getStringValue(),
        beginHsrReqGetmainCopybook,
        HSR_REQ_GETMAIN_COPYBOOK_LEN);
    localHsrReqGetmainCopybookCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHsrReqGetmainCopybookConstraints(char[] value) {
    return super.checkConstraints(value, 8, false, false);
  }
  /**
   * refreshHsrReqGetmainCopybook is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshHsrReqGetmainCopybook() {
    return (substring(
        getStringValue(),
        beginHsrReqGetmainCopybook,
        beginHsrReqGetmainCopybook + HSR_REQ_GETMAIN_COPYBOOK_LEN));
  }
}
