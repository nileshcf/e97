package com.cloudframe.app.dto.bbhsr002;

/**
 * The class HsrRetBhiInfo is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class HsrRetBhiInfo extends HsrRetBhiInfoSerialized {

  private char[] hsrRetHipaaCd = Field.fillLowValue(2);

  private char[] hsrRetHipaaCdMod = Field.fillLowValue(2);

  private char[] hsrRetGrnrcReqCd = Field.fillLowValue(1);

  private char[] hsrRetInnCovIndicator = Field.fillLowValue(1);

  private char[] hsrRetT1CovIndicator = Field.fillLowValue(1);

  private char[] hsrRetOonCovIndicator = Field.fillLowValue(1);

  private int hsrRetNetCnt;
  private List<HsrRetNetInfo> hsrRetNetInfo = new ArrayList<>();

  /** Constructor for HsrRetBhiInfo */
  public HsrRetBhiInfo() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for HsrRetBhiInfo. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public HsrRetBhiInfo(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of hsrRetHipaaCd
   *
   * @return hsrRetHipaaCd
   */
  public char[] getHsrRetHipaaCd() throws CFException {
    if (isHsrRetHipaaCdModified()) {
      hsrRetHipaaCd = refreshHsrRetHipaaCd();
    }
    return hsrRetHipaaCd;
  }

  /**
   * set variable hsrRetHipaaCd Corresponding COBOL Variable is HSR-RET-HIPAA-CD
   *
   * @param value
   */
  public void setHsrRetHipaaCd(char[] value) {
    hsrRetHipaaCd = checkHsrRetHipaaCdConstraints(value);
    serializeHsrRetHipaaCd(hsrRetHipaaCd);
  }

  /**
   * Update HsrRetHipaaCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setHsrRetHipaaCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHsrRetHipaaCd, hsrRetHipaaCd.length);
  }

  public void setHsrRetHipaaCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetHipaaCd, hsrRetHipaaCd.length);
  }

  /**
   * Update HsrRetHipaaCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetHipaaCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetHipaaCd + targetIndex, targetLen);
  }

  /**
   * Update HsrRetHipaaCd with another Field
   *
   * @param value
   */
  public void setHsrRetHipaaCd(Field source) {
    replace(source, 0, source.length(), beginHsrRetHipaaCd, HSR_RET_HIPAA_CD_LEN);
  }

  /**
   * Update HsrRetHipaaCd with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrRetHipaaCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetHipaaCd, HSR_RET_HIPAA_CD_LEN);
  }

  /**
   * Update HsrRetHipaaCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetHipaaCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetHipaaCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of hsrRetHipaaCdMod
   *
   * @return hsrRetHipaaCdMod
   */
  public char[] getHsrRetHipaaCdMod() throws CFException {
    if (isHsrRetHipaaCdModModified()) {
      hsrRetHipaaCdMod = refreshHsrRetHipaaCdMod();
    }
    return hsrRetHipaaCdMod;
  }

  /**
   * set variable hsrRetHipaaCdMod Corresponding COBOL Variable is HSR-RET-HIPAA-CD-MOD
   *
   * @param value
   */
  public void setHsrRetHipaaCdMod(char[] value) {
    hsrRetHipaaCdMod = checkHsrRetHipaaCdModConstraints(value);
    serializeHsrRetHipaaCdMod(hsrRetHipaaCdMod);
  }

  /**
   * Update HsrRetHipaaCdMod with a char[] from an offset and length
   *
   * @param value
   */
  public void setHsrRetHipaaCdMod(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHsrRetHipaaCdMod, hsrRetHipaaCdMod.length);
  }

  public void setHsrRetHipaaCdMod(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetHipaaCdMod, hsrRetHipaaCdMod.length);
  }

  /**
   * Update HsrRetHipaaCdMod with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetHipaaCdMod(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetHipaaCdMod + targetIndex, targetLen);
  }

  /**
   * Update HsrRetHipaaCdMod with another Field
   *
   * @param value
   */
  public void setHsrRetHipaaCdMod(Field source) {
    replace(source, 0, source.length(), beginHsrRetHipaaCdMod, HSR_RET_HIPAA_CD_MOD_LEN);
  }

  /**
   * Update HsrRetHipaaCdMod with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrRetHipaaCdMod(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetHipaaCdMod, HSR_RET_HIPAA_CD_MOD_LEN);
  }

  /**
   * Update HsrRetHipaaCdMod with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetHipaaCdMod(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetHipaaCdMod + targetIndex, targetLen);
  }
  /**
   * Returns the value of hsrRetGrnrcReqCd
   *
   * @return hsrRetGrnrcReqCd
   */
  public char[] getHsrRetGrnrcReqCd() throws CFException {
    if (isHsrRetGrnrcReqCdModified()) {
      hsrRetGrnrcReqCd = refreshHsrRetGrnrcReqCd();
    }
    return hsrRetGrnrcReqCd;
  }

  /**
   * set variable hsrRetGrnrcReqCd Corresponding COBOL Variable is HSR-RET-GRNRC-REQ-CD
   *
   * @param value
   */
  public void setHsrRetGrnrcReqCd(char[] value) {
    hsrRetGrnrcReqCd = checkHsrRetGrnrcReqCdConstraints(value);
    serializeHsrRetGrnrcReqCd(hsrRetGrnrcReqCd);
  }

  /**
   * Update HsrRetGrnrcReqCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setHsrRetGrnrcReqCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHsrRetGrnrcReqCd, hsrRetGrnrcReqCd.length);
  }

  public void setHsrRetGrnrcReqCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetGrnrcReqCd, hsrRetGrnrcReqCd.length);
  }

  /**
   * Update HsrRetGrnrcReqCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetGrnrcReqCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetGrnrcReqCd + targetIndex, targetLen);
  }

  /**
   * Update HsrRetGrnrcReqCd with another Field
   *
   * @param value
   */
  public void setHsrRetGrnrcReqCd(Field source) {
    replace(source, 0, source.length(), beginHsrRetGrnrcReqCd, HSR_RET_GRNRC_REQ_CD_LEN);
  }

  /**
   * Update HsrRetGrnrcReqCd with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrRetGrnrcReqCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetGrnrcReqCd, HSR_RET_GRNRC_REQ_CD_LEN);
  }

  /**
   * Update HsrRetGrnrcReqCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetGrnrcReqCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetGrnrcReqCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of hsrRetInnCovIndicator
   *
   * @return hsrRetInnCovIndicator
   */
  public char[] getHsrRetInnCovIndicator() throws CFException {
    if (isHsrRetInnCovIndicatorModified()) {
      hsrRetInnCovIndicator = refreshHsrRetInnCovIndicator();
    }
    return hsrRetInnCovIndicator;
  }

  /**
   * set variable hsrRetInnCovIndicator Corresponding COBOL Variable is HSR-RET-INN-COV-INDICATOR
   *
   * @param value
   */
  public void setHsrRetInnCovIndicator(char[] value) {
    hsrRetInnCovIndicator = checkHsrRetInnCovIndicatorConstraints(value);
    serializeHsrRetInnCovIndicator(hsrRetInnCovIndicator);
  }

  /**
   * Update HsrRetInnCovIndicator with a char[] from an offset and length
   *
   * @param value
   */
  public void setHsrRetInnCovIndicator(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginHsrRetInnCovIndicator,
        hsrRetInnCovIndicator.length);
  }

  public void setHsrRetInnCovIndicator(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginHsrRetInnCovIndicator, hsrRetInnCovIndicator.length);
  }

  /**
   * Update HsrRetInnCovIndicator with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetInnCovIndicator(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetInnCovIndicator + targetIndex, targetLen);
  }

  /**
   * Update HsrRetInnCovIndicator with another Field
   *
   * @param value
   */
  public void setHsrRetInnCovIndicator(Field source) {
    replace(source, 0, source.length(), beginHsrRetInnCovIndicator, HSR_RET_INN_COV_INDICATOR_LEN);
  }

  /**
   * Update HsrRetInnCovIndicator with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrRetInnCovIndicator(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginHsrRetInnCovIndicator, HSR_RET_INN_COV_INDICATOR_LEN);
  }

  /**
   * Update HsrRetInnCovIndicator with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setHsrRetInnCovIndicator(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetInnCovIndicator + targetIndex, targetLen);
  }
  /**
   * Returns the value of hsrRetT1CovIndicator
   *
   * @return hsrRetT1CovIndicator
   */
  public char[] getHsrRetT1CovIndicator() throws CFException {
    if (isHsrRetT1CovIndicatorModified()) {
      hsrRetT1CovIndicator = refreshHsrRetT1CovIndicator();
    }
    return hsrRetT1CovIndicator;
  }

  /**
   * set variable hsrRetT1CovIndicator Corresponding COBOL Variable is HSR-RET-T1-COV-INDICATOR
   *
   * @param value
   */
  public void setHsrRetT1CovIndicator(char[] value) {
    hsrRetT1CovIndicator = checkHsrRetT1CovIndicatorConstraints(value);
    serializeHsrRetT1CovIndicator(hsrRetT1CovIndicator);
  }

  /**
   * Update HsrRetT1CovIndicator with a char[] from an offset and length
   *
   * @param value
   */
  public void setHsrRetT1CovIndicator(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginHsrRetT1CovIndicator, hsrRetT1CovIndicator.length);
  }

  public void setHsrRetT1CovIndicator(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetT1CovIndicator, hsrRetT1CovIndicator.length);
  }

  /**
   * Update HsrRetT1CovIndicator with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetT1CovIndicator(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetT1CovIndicator + targetIndex, targetLen);
  }

  /**
   * Update HsrRetT1CovIndicator with another Field
   *
   * @param value
   */
  public void setHsrRetT1CovIndicator(Field source) {
    replace(source, 0, source.length(), beginHsrRetT1CovIndicator, HSR_RET_T_1_COV_INDICATOR_LEN);
  }

  /**
   * Update HsrRetT1CovIndicator with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrRetT1CovIndicator(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginHsrRetT1CovIndicator, HSR_RET_T_1_COV_INDICATOR_LEN);
  }

  /**
   * Update HsrRetT1CovIndicator with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setHsrRetT1CovIndicator(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetT1CovIndicator + targetIndex, targetLen);
  }
  /**
   * Returns the value of hsrRetOonCovIndicator
   *
   * @return hsrRetOonCovIndicator
   */
  public char[] getHsrRetOonCovIndicator() throws CFException {
    if (isHsrRetOonCovIndicatorModified()) {
      hsrRetOonCovIndicator = refreshHsrRetOonCovIndicator();
    }
    return hsrRetOonCovIndicator;
  }

  /**
   * set variable hsrRetOonCovIndicator Corresponding COBOL Variable is HSR-RET-OON-COV-INDICATOR
   *
   * @param value
   */
  public void setHsrRetOonCovIndicator(char[] value) {
    hsrRetOonCovIndicator = checkHsrRetOonCovIndicatorConstraints(value);
    serializeHsrRetOonCovIndicator(hsrRetOonCovIndicator);
  }

  /**
   * Update HsrRetOonCovIndicator with a char[] from an offset and length
   *
   * @param value
   */
  public void setHsrRetOonCovIndicator(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginHsrRetOonCovIndicator,
        hsrRetOonCovIndicator.length);
  }

  public void setHsrRetOonCovIndicator(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginHsrRetOonCovIndicator, hsrRetOonCovIndicator.length);
  }

  /**
   * Update HsrRetOonCovIndicator with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetOonCovIndicator(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetOonCovIndicator + targetIndex, targetLen);
  }

  /**
   * Update HsrRetOonCovIndicator with another Field
   *
   * @param value
   */
  public void setHsrRetOonCovIndicator(Field source) {
    replace(source, 0, source.length(), beginHsrRetOonCovIndicator, HSR_RET_OON_COV_INDICATOR_LEN);
  }

  /**
   * Update HsrRetOonCovIndicator with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrRetOonCovIndicator(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginHsrRetOonCovIndicator, HSR_RET_OON_COV_INDICATOR_LEN);
  }

  /**
   * Update HsrRetOonCovIndicator with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setHsrRetOonCovIndicator(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetOonCovIndicator + targetIndex, targetLen);
  }
  /**
   * Returns the value of hsrRetNetCnt
   *
   * @return hsrRetNetCnt
   */
  public int getHsrRetNetCnt() throws CFException {
    if (isHsrRetNetCntModified()) {
      hsrRetNetCnt = refreshHsrRetNetCnt();
    }
    return hsrRetNetCnt;
  }

  /**
   * Update HsrRetNetCnt with the passed value Corresponding COBOL Variable is HSR-RET-NET-CNT
   *
   * @param number
   */
  public void setHsrRetNetCnt(int number) {
    // Truncate if the number is beyond +/- Max range
    hsrRetNetCnt = checkHsrRetNetCntMaxLimit(number);
    serializeHsrRetNetCnt(hsrRetNetCnt);
  }

  public void setHsrRetNetCnt(long number) {
    number = checkHsrRetNetCntMaxLimit(number); // Truncate if value is beyond +/- Max range
    setHsrRetNetCnt((int) number);
  }

  /**
   * Update HsrRetNetCnt with the passed value
   *
   * @param value (String or char[])
   */
  public void setHsrRetNetCnt(char[] value) throws CFException {
    hsrRetNetCnt = serializeHsrRetNetCnt(value);
  }
  /**
   * Update HsrRetNetCnt with the passed value
   *
   * @param value (String or char[])
   */
  public void setHsrRetNetCntString(char[] value) throws CFException {
    setHsrRetNetCnt(value);
  }
  /**
   * Returns the value of hsrRetNetInfo Corresponding COBOL Variable is HSR-RET-NET-INFO
   *
   * @return hsrRetNetInfo
   */
  public List<HsrRetNetInfo> getHsrRetNetInfo() {
    return hsrRetNetInfo;
  }

  /**
   * Returns the element at the specified position in this list.
   *
   * @param index
   * @return hsrRetNetInfo
   */
  public HsrRetNetInfo getHsrRetNetInfo(int index) {
    if (index < 0) {
      logger.trace("Array index was {} for getHsrRetNetInfo(), resetting it to 0", index);
      index = 0;
    } else if (index >= HSR_RET_NET_INFO_SIZE) {
      index = HSR_RET_NET_INFO_SIZE - 1; // can't exceed max array size
      logger.trace(
          "hsrRetNetInfo - Array index exceeded max Size {}, resetting it to max allowed",
          HSR_RET_NET_INFO_SIZE);
    }
    if (index >= hsrRetNetInfo.size()) {
      for (int fillIndex = hsrRetNetInfo.size() - 1; fillIndex < index; fillIndex++) {
        hsrRetNetInfo.add(null);
      }
      hsrRetNetInfo.set(
          index,
          new HsrRetNetInfo(
              this, beginHsrRetNetInfo + index * HsrRetNetInfo.getHsrRetNetInfoFieldLength()));
    }
    HsrRetNetInfo value = hsrRetNetInfo.get(index);
    if (value == null) {
      hsrRetNetInfo.set(
          index,
          new HsrRetNetInfo(
              this, beginHsrRetNetInfo + index * HsrRetNetInfo.getHsrRetNetInfoFieldLength()));
      value = hsrRetNetInfo.get(index);
    }
    return value;
  }

  /**
   * Update HsrRetNetInfo at index with the passed value Corresponding COBOL Variable is
   * HSR-RET-NET-INFO
   *
   * @param index
   * @param value
   */
  public void setHsrRetNetInfo(int index, char[] value) {
    getHsrRetNetInfo(index).setString(value);
  }

  /**
   * initializes HsrRetBhiInfo String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setHsrRetHipaaCd(CONSTANTS.SPACE_2);
    setHsrRetHipaaCdMod(CONSTANTS.SPACE_2);
    setHsrRetGrnrcReqCd(CONSTANTS.SPACE);
    setHsrRetInnCovIndicator(CONSTANTS.SPACE);
    setHsrRetT1CovIndicator(CONSTANTS.SPACE);
    setHsrRetOonCovIndicator(CONSTANTS.SPACE);
    setHsrRetNetCnt(0);
    if (hsrRetNetInfo.isEmpty()) {
      // fill the Array to the full capacity
      for (int index = 0; index < HSR_RET_NET_INFO_SIZE; index++) {
        HsrRetNetInfo newElement =
            new HsrRetNetInfo(
                this, beginHsrRetNetInfo + index * HsrRetNetInfo.getHsrRetNetInfoFieldLength());
        newElement.initialize();
        hsrRetNetInfo.add(newElement);
      }
    } else {
      if (hsrRetNetInfo.size() < HSR_RET_NET_INFO_SIZE) {
        // prefill it first
        for (int index = hsrRetNetInfo.size(); index < HSR_RET_NET_INFO_SIZE; index++) {
          HsrRetNetInfo newElement =
              new HsrRetNetInfo(
                  this, beginHsrRetNetInfo + index * HsrRetNetInfo.getHsrRetNetInfoFieldLength());
          hsrRetNetInfo.add(newElement);
        }
      }

      for (int index = 0; index < HSR_RET_NET_INFO_SIZE; index++) {
        HsrRetNetInfo hsrRetNetInfoVar = hsrRetNetInfo.get(index);
        if (hsrRetNetInfoVar == null) {
          hsrRetNetInfoVar =
              new HsrRetNetInfo(
                  this, beginHsrRetNetInfo + index * HsrRetNetInfo.getHsrRetNetInfoFieldLength());
          hsrRetNetInfo.set(index, hsrRetNetInfoVar);
        }
        hsrRetNetInfoVar.initialize();
      }
    }
  }

  public static int getHsrRetBhiInfoFieldLength() {
    return HSR_RET_BHI_INFO_LENGTH;
  }
}
