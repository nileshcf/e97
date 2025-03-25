package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class SvindxHexGroupSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SvindxHexGroupSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(SvindxHexGroupSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int SVINDX_HEX_GROUP_LENGTH = 4;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginSvindxHex;

  /** Constructor for SvindxHexGroupSerialized */
  public SvindxHexGroupSerialized() {
    init(0);
  }

  /** initializes the field in SvindxHexGroupSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(SVINDX_HEX_GROUP_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginSvindxHex = getStartOffset() + 0; // set offset for serialization

    /*  end of offset */
  }

  int localSvindxHexCounter = -1;

  public boolean isSvindxHexModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localSvindxHexCounter != sharedCounter;
    localSvindxHexCounter = sharedCounter;
    return hasModified;
  }

  protected static final int SVINDX_HEX_LEN = 4;
  /** serializeSvindxHex */
  protected void serializeSvindxHex(int svindxHex) {
    replaceValue( //  save the value as string
        getBinaryString(svindxHex, SVINDX_HEX_LEN), beginSvindxHex, SVINDX_HEX_LEN);
    localSvindxHexCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkSvindxHexMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshSvindxHex is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public int refreshSvindxHex() {
    return (getInt(beginSvindxHex));
  }
}
