package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class SvindxHexRedefinedSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SvindxHexRedefinedSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(SvindxHexRedefinedSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int SVINDX_HEX_REDEFINED_LENGTH = 4;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginSvindxHexLowHword;

  /** Constructor for SvindxHexRedefinedSerialized */
  public SvindxHexRedefinedSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for SvindxHexRedefinedSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public SvindxHexRedefinedSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this SvindxHexRedefinedSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 0); // serialize this field at offset 0 by default
  }

  /**
   * sets parent for this SvindxHexRedefinedSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 0 by default
  }
  /** initializes the field in SvindxHexRedefinedSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(SVINDX_HEX_REDEFINED_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginSvindxHexLowHword = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localSvindxHexLowHwordCounter = -1;

  public boolean isSvindxHexLowHwordModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localSvindxHexLowHwordCounter != sharedCounter;
    localSvindxHexLowHwordCounter = sharedCounter;
    return hasModified;
  }

  protected static final int SVINDX_HEX_LOW_HWORD_LEN = 2;
  /** serializeSvindxHexLowHword */
  protected void serializeSvindxHexLowHword(short svindxHexLowHword) {
    replaceValue( //  save the value as string
        getBinaryString(svindxHexLowHword, SVINDX_HEX_LOW_HWORD_LEN),
        beginSvindxHexLowHword,
        SVINDX_HEX_LOW_HWORD_LEN);
    localSvindxHexLowHwordCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkSvindxHexLowHwordMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshSvindxHexLowHword is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshSvindxHexLowHword() {
    return (getShort(beginSvindxHexLowHword));
  }
}
