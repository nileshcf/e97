package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class HostVarArrayAreaSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HostVarArrayAreaSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(HostVarArrayAreaSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int HOST_VAR_ARRAY_AREA_LENGTH = 2400;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginHvQueryTyp;
  protected static final int HV_QUERY_TYP_SIZE = 100;
  protected int beginHvHipaaVerNbr;
  protected static final int HV_HIPAA_VER_NBR_SIZE = 100;
  protected int beginHvSortCol1;
  protected static final int HV_SORT_COL_1_SIZE = 100;
  protected int beginHvHipaaCd;
  protected static final int HV_HIPAA_CD_SIZE = 100;
  protected int beginHvGrnrcRqstCd;
  protected static final int HV_GRNRC_RQST_CD_SIZE = 100;
  protected int beginHvHipaaGrpCd;
  protected static final int HV_HIPAA_GRP_CD_SIZE = 100;
  protected int beginHvDataTyp;
  protected static final int HV_DATA_TYP_SIZE = 100;
  protected int beginHvKeyCnt;
  protected static final int HV_KEY_CNT_SIZE = 100;
  protected int beginHvDataCnt;
  protected static final int HV_DATA_CNT_SIZE = 100;

  /** Constructor for HostVarArrayAreaSerialized */
  public HostVarArrayAreaSerialized() {
    init(0);
  }

  /** initializes the field in HostVarArrayAreaSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(HOST_VAR_ARRAY_AREA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginHvQueryTyp = getStartOffset() + 0; // set offset for serialization

    beginHvHipaaVerNbr = getStartOffset() + 400; // set offset for serialization

    beginHvSortCol1 = getStartOffset() + 500; // set offset for serialization

    beginHvHipaaCd = getStartOffset() + 700; // set offset for serialization

    beginHvGrnrcRqstCd = getStartOffset() + 900; // set offset for serialization

    beginHvHipaaGrpCd = getStartOffset() + 1000; // set offset for serialization

    beginHvDataTyp = getStartOffset() + 1200; // set offset for serialization

    beginHvKeyCnt = getStartOffset() + 1600; // set offset for serialization

    beginHvDataCnt = getStartOffset() + 2000; // set offset for serialization

    /*  end of offset */
  }

  protected static final int HV_QUERY_TYP_LEN = 4;
  /**
   * serialize this HvQueryTyp as String
   *
   * @param index
   * @param value
   */
  protected void serializeHvQueryTyp(int index, int value) {
    int number = value;
    replaceValue(
        getBinaryString(number), (beginHvQueryTyp + index * HV_QUERY_TYP_LEN), HV_QUERY_TYP_LEN);
  }

  protected static final int HV_HIPAA_VER_NBR_LEN = 1;
  /**
   * serializeHvHipaaVerNbr as String
   *
   * @param index
   * @param value
   */
  protected void serializeHvHipaaVerNbr(int index, char[] value) {
    replaceValue(value, (beginHvHipaaVerNbr + index * HV_HIPAA_VER_NBR_LEN), HV_HIPAA_VER_NBR_LEN);
  }

  protected static final int HV_SORT_COL_1_LEN = 2;
  /**
   * serializeHvSortCol1 as String
   *
   * @param index
   * @param value
   */
  protected void serializeHvSortCol1(int index, char[] value) {
    replaceValue(value, (beginHvSortCol1 + index * HV_SORT_COL_1_LEN), HV_SORT_COL_1_LEN);
  }

  protected static final int HV_HIPAA_CD_LEN = 2;
  /**
   * serializeHvHipaaCd as String
   *
   * @param index
   * @param value
   */
  protected void serializeHvHipaaCd(int index, char[] value) {
    replaceValue(value, (beginHvHipaaCd + index * HV_HIPAA_CD_LEN), HV_HIPAA_CD_LEN);
  }

  protected static final int HV_GRNRC_RQST_CD_LEN = 1;
  /**
   * serializeHvGrnrcRqstCd as String
   *
   * @param index
   * @param value
   */
  protected void serializeHvGrnrcRqstCd(int index, char[] value) {
    replaceValue(value, (beginHvGrnrcRqstCd + index * HV_GRNRC_RQST_CD_LEN), HV_GRNRC_RQST_CD_LEN);
  }

  protected static final int HV_HIPAA_GRP_CD_LEN = 2;
  /**
   * serializeHvHipaaGrpCd as String
   *
   * @param index
   * @param value
   */
  protected void serializeHvHipaaGrpCd(int index, char[] value) {
    replaceValue(value, (beginHvHipaaGrpCd + index * HV_HIPAA_GRP_CD_LEN), HV_HIPAA_GRP_CD_LEN);
  }

  protected static final int HV_DATA_TYP_LEN = 4;
  /**
   * serialize this HvDataTyp as String
   *
   * @param index
   * @param value
   */
  protected void serializeHvDataTyp(int index, int value) {
    int number = value;
    replaceValue(
        getBinaryString(number), (beginHvDataTyp + index * HV_DATA_TYP_LEN), HV_DATA_TYP_LEN);
  }

  protected static final int HV_KEY_CNT_LEN = 4;
  /**
   * serialize this HvKeyCnt as String
   *
   * @param index
   * @param value
   */
  protected void serializeHvKeyCnt(int index, int value) {
    int number = value;
    replaceValue(getBinaryString(number), (beginHvKeyCnt + index * HV_KEY_CNT_LEN), HV_KEY_CNT_LEN);
  }

  protected static final int HV_DATA_CNT_LEN = 4;
  /**
   * serialize this HvDataCnt as String
   *
   * @param index
   * @param value
   */
  protected void serializeHvDataCnt(int index, int value) {
    int number = value;
    replaceValue(
        getBinaryString(number), (beginHvDataCnt + index * HV_DATA_CNT_LEN), HV_DATA_CNT_LEN);
  }

  public int hvQueryTypSize() {
    return HV_QUERY_TYP_SIZE;
  }

  public int hvHipaaVerNbrSize() {
    return HV_HIPAA_VER_NBR_SIZE;
  }

  public int hvSortCol1Size() {
    return HV_SORT_COL_1_SIZE;
  }

  public int hvHipaaCdSize() {
    return HV_HIPAA_CD_SIZE;
  }

  public int hvGrnrcRqstCdSize() {
    return HV_GRNRC_RQST_CD_SIZE;
  }

  public int hvHipaaGrpCdSize() {
    return HV_HIPAA_GRP_CD_SIZE;
  }

  public int hvDataTypSize() {
    return HV_DATA_TYP_SIZE;
  }

  public int hvKeyCntSize() {
    return HV_KEY_CNT_SIZE;
  }

  public int hvDataCntSize() {
    return HV_DATA_CNT_SIZE;
  }
}
