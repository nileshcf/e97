package com.cloudframe.app.dto.serialize.d5427pol;

/**
 * The class DclpolPlnMstrSviInfoSerialized is used to define offsets in order to serialize in a
 * fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DclpolPlnMstrSviInfoSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(DclpolPlnMstrSviInfoSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int DCLPOL_PLN_MSTR_SVI_INFO_LENGTH = 78;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginDsviPolNbr;
  protected int beginDsviPlnNbr;
  protected int beginDsviClssNbr;
  protected int beginDsviCovTypCd;

  /** Constructor for DclpolPlnMstrSviInfoSerialized */
  public DclpolPlnMstrSviInfoSerialized() {
    init(0);
  }

  /** initializes the field in DclpolPlnMstrSviInfoSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(DCLPOL_PLN_MSTR_SVI_INFO_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginDsviPolNbr = getStartOffset() + 0; // set offset for serialization

    beginDsviPlnNbr = getStartOffset() + 6; // set offset for serialization

    beginDsviClssNbr = getStartOffset() + 10; // set offset for serialization

    beginDsviCovTypCd = getStartOffset() + 14; // set offset for serialization

    /*  end of offset */
  }

  int localDsviPolNbrCounter = -1;

  public boolean isDsviPolNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDsviPolNbrCounter != sharedCounter;
    localDsviPolNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DSVI_POL_NBR_LEN = 6;
  /** serialize this DsviPolNbr */
  protected void serializeDsviPolNbr(char[] dsviPolNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dsviPolNbr, 0, getStringValue(), beginDsviPolNbr, DSVI_POL_NBR_LEN);
    localDsviPolNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDsviPolNbrConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshDsviPolNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDsviPolNbr() {
    return (substring(getStringValue(), beginDsviPolNbr, beginDsviPolNbr + DSVI_POL_NBR_LEN));
  }

  int localDsviPlnNbrCounter = -1;

  public boolean isDsviPlnNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDsviPlnNbrCounter != sharedCounter;
    localDsviPlnNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DSVI_PLN_NBR_LEN = 4;
  /** serialize this DsviPlnNbr */
  protected void serializeDsviPlnNbr(char[] dsviPlnNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dsviPlnNbr, 0, getStringValue(), beginDsviPlnNbr, DSVI_PLN_NBR_LEN);
    localDsviPlnNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDsviPlnNbrConstraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshDsviPlnNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDsviPlnNbr() {
    return (substring(getStringValue(), beginDsviPlnNbr, beginDsviPlnNbr + DSVI_PLN_NBR_LEN));
  }

  int localDsviClssNbrCounter = -1;

  public boolean isDsviClssNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDsviClssNbrCounter != sharedCounter;
    localDsviClssNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DSVI_CLSS_NBR_LEN = 4;
  /** serialize this DsviClssNbr */
  protected void serializeDsviClssNbr(char[] dsviClssNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dsviClssNbr, 0, getStringValue(), beginDsviClssNbr, DSVI_CLSS_NBR_LEN);
    localDsviClssNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDsviClssNbrConstraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshDsviClssNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDsviClssNbr() {
    return (substring(getStringValue(), beginDsviClssNbr, beginDsviClssNbr + DSVI_CLSS_NBR_LEN));
  }

  int localDsviCovTypCdCounter = -1;

  public boolean isDsviCovTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDsviCovTypCdCounter != sharedCounter;
    localDsviCovTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DSVI_COV_TYP_CD_LEN = 1;
  /** serialize this DsviCovTypCd */
  protected void serializeDsviCovTypCd(char[] dsviCovTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dsviCovTypCd, 0, getStringValue(), beginDsviCovTypCd, DSVI_COV_TYP_CD_LEN);
    localDsviCovTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDsviCovTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDsviCovTypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDsviCovTypCd() {
    return (substring(
        getStringValue(), beginDsviCovTypCd, beginDsviCovTypCd + DSVI_COV_TYP_CD_LEN));
  }
}
