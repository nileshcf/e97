package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class WtdqRequestAreaSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WtdqRequestAreaSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(WtdqRequestAreaSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int WTDQ_REQUEST_AREA_LENGTH = 5043;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginWtdqMessageTyp;
  protected int beginWtdqApplication;
  protected int beginWtdqProgram;
  protected int beginWtdqParagraph;
  protected int beginWtdqMessage;

  /** Constructor for WtdqRequestAreaSerialized */
  public WtdqRequestAreaSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for WtdqRequestAreaSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public WtdqRequestAreaSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this WtdqRequestAreaSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 0); // serialize this field at offset 0 by default
  }

  /**
   * sets parent for this WtdqRequestAreaSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 0 by default
  }
  /** initializes the field in WtdqRequestAreaSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(WTDQ_REQUEST_AREA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginWtdqMessageTyp = getStartOffset() + 0; // set offset for serialization

    beginWtdqApplication = getStartOffset() + 1; // set offset for serialization

    beginWtdqProgram = getStartOffset() + 5; // set offset for serialization

    beginWtdqParagraph = getStartOffset() + 13; // set offset for serialization

    beginWtdqMessage = getStartOffset() + 43; // set offset for serialization

    /*  end of offset */
  }

  int localWtdqMessageTypCounter = -1;

  public boolean isWtdqMessageTypModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localWtdqMessageTypCounter != sharedCounter;
    localWtdqMessageTypCounter = sharedCounter;
    return hasModified;
  }

  protected static final int WTDQ_MESSAGE_TYP_LEN = 1;
  /** serialize this WtdqMessageTyp */
  protected void serializeWtdqMessageTyp(char[] wtdqMessageTyp) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(wtdqMessageTyp, 0, getStringValue(), beginWtdqMessageTyp, WTDQ_MESSAGE_TYP_LEN);
    localWtdqMessageTypCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkWtdqMessageTypConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshWtdqMessageTyp is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshWtdqMessageTyp() {
    return (substring(
        getStringValue(), beginWtdqMessageTyp, beginWtdqMessageTyp + WTDQ_MESSAGE_TYP_LEN));
  }

  int localWtdqApplicationCounter = -1;

  public boolean isWtdqApplicationModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localWtdqApplicationCounter != sharedCounter;
    localWtdqApplicationCounter = sharedCounter;
    return hasModified;
  }

  protected static final int WTDQ_APPLICATION_LEN = 4;
  /** serialize this WtdqApplication */
  protected void serializeWtdqApplication(char[] wtdqApplication) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(wtdqApplication, 0, getStringValue(), beginWtdqApplication, WTDQ_APPLICATION_LEN);
    localWtdqApplicationCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkWtdqApplicationConstraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshWtdqApplication is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshWtdqApplication() {
    return (substring(
        getStringValue(), beginWtdqApplication, beginWtdqApplication + WTDQ_APPLICATION_LEN));
  }

  int localWtdqProgramCounter = -1;

  public boolean isWtdqProgramModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localWtdqProgramCounter != sharedCounter;
    localWtdqProgramCounter = sharedCounter;
    return hasModified;
  }

  protected static final int WTDQ_PROGRAM_LEN = 8;
  /** serialize this WtdqProgram */
  protected void serializeWtdqProgram(char[] wtdqProgram) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(wtdqProgram, 0, getStringValue(), beginWtdqProgram, WTDQ_PROGRAM_LEN);
    localWtdqProgramCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkWtdqProgramConstraints(char[] value) {
    return super.checkConstraints(value, 8, false, false);
  }
  /**
   * refreshWtdqProgram is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshWtdqProgram() {
    return (substring(getStringValue(), beginWtdqProgram, beginWtdqProgram + WTDQ_PROGRAM_LEN));
  }

  int localWtdqParagraphCounter = -1;

  public boolean isWtdqParagraphModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localWtdqParagraphCounter != sharedCounter;
    localWtdqParagraphCounter = sharedCounter;
    return hasModified;
  }

  protected static final int WTDQ_PARAGRAPH_LEN = 30;
  /** serialize this WtdqParagraph */
  protected void serializeWtdqParagraph(char[] wtdqParagraph) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(wtdqParagraph, 0, getStringValue(), beginWtdqParagraph, WTDQ_PARAGRAPH_LEN);
    localWtdqParagraphCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkWtdqParagraphConstraints(char[] value) {
    return super.checkConstraints(value, 30, false, false);
  }
  /**
   * refreshWtdqParagraph is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshWtdqParagraph() {
    return (substring(
        getStringValue(), beginWtdqParagraph, beginWtdqParagraph + WTDQ_PARAGRAPH_LEN));
  }

  int localWtdqMessageCounter = -1;

  public boolean isWtdqMessageModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localWtdqMessageCounter != sharedCounter;
    localWtdqMessageCounter = sharedCounter;
    return hasModified;
  }

  protected static final int WTDQ_MESSAGE_LEN = 5000;
  /** serialize this WtdqMessage */
  protected void serializeWtdqMessage(char[] wtdqMessage) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(wtdqMessage, 0, getStringValue(), beginWtdqMessage, WTDQ_MESSAGE_LEN);
    localWtdqMessageCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkWtdqMessageConstraints(char[] value) {
    return super.checkConstraints(value, 5000, false, false);
  }
  /**
   * refreshWtdqMessage is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshWtdqMessage() {
    return (substring(getStringValue(), beginWtdqMessage, beginWtdqMessage + WTDQ_MESSAGE_LEN));
  }
}
