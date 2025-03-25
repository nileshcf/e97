package com.cloudframe.app.dto.serialize.d5427scn;

/**
 * The class CsrchSearchKeySerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CsrchSearchKeySerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(CsrchSearchKeySerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int CSRCH_SEARCH_KEY_LENGTH = 6;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginCsrchSrvcCd;

  /** Constructor for CsrchSearchKeySerialized */
  public CsrchSearchKeySerialized() {
    init(0);
  }

  /** initializes the field in CsrchSearchKeySerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(CSRCH_SEARCH_KEY_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginCsrchSrvcCd = getStartOffset() + 0; // set offset for serialization

    /*  end of offset */
  }

  int localCsrchSrvcCdCounter = -1;

  public boolean isCsrchSrvcCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCsrchSrvcCdCounter != sharedCounter;
    localCsrchSrvcCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CSRCH_SRVC_CD_LEN = 6;
  /** serialize this CsrchSrvcCd */
  protected void serializeCsrchSrvcCd(char[] csrchSrvcCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(csrchSrvcCd, 0, getStringValue(), beginCsrchSrvcCd, CSRCH_SRVC_CD_LEN);
    localCsrchSrvcCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCsrchSrvcCdConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshCsrchSrvcCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshCsrchSrvcCd() {
    return (substring(getStringValue(), beginCsrchSrvcCd, beginCsrchSrvcCd + CSRCH_SRVC_CD_LEN));
  }
}
