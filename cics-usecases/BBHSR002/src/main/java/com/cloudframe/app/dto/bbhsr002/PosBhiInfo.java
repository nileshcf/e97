package com.cloudframe.app.dto.bbhsr002;

/**
 * The class PosBhiInfo is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;

public class PosBhiInfo extends PosBhiInfoSerialized {

  private char[] posHipaaCd = Field.fillLowValue(2);

  private char[] posHipaaCdMod = Field.fillLowValue(2);

  private char[] posGrnrcReqCd = Field.fillLowValue(1);

  private char[] posInnCovIndicator = Field.fillLowValue(1);

  private char[] posT1CovIndicator = Field.fillLowValue(1);

  private char[] posOonCovIndicator = Field.fillLowValue(1);

  private int posNetCnt;
  private List<PosNetInfo> posNetInfo = new ArrayList<>();

  /** Constructor for PosBhiInfo */
  public PosBhiInfo() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for PosBhiInfo. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public PosBhiInfo(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of posHipaaCd
   *
   * @return posHipaaCd
   */
  public char[] getPosHipaaCd() throws CFException {
    if (isPosHipaaCdModified()) {
      posHipaaCd = refreshPosHipaaCd();
    }
    return posHipaaCd;
  }

  /**
   * set variable posHipaaCd Corresponding COBOL Variable is WS-POS-HIPAA-CD
   *
   * @param value
   */
  public void setPosHipaaCd(char[] value) {
    posHipaaCd = checkPosHipaaCdConstraints(value);
    serializePosHipaaCd(posHipaaCd);
  }

  /**
   * Update PosHipaaCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPosHipaaCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPosHipaaCd, posHipaaCd.length);
  }

  public void setPosHipaaCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPosHipaaCd, posHipaaCd.length);
  }

  /**
   * Update PosHipaaCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPosHipaaCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPosHipaaCd + targetIndex, targetLen);
  }

  /**
   * Update PosHipaaCd with another Field
   *
   * @param value
   */
  public void setPosHipaaCd(Field source) {
    replace(source, 0, source.length(), beginPosHipaaCd, POS_HIPAA_CD_LEN);
  }

  /**
   * Update PosHipaaCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPosHipaaCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPosHipaaCd, POS_HIPAA_CD_LEN);
  }

  /**
   * Update PosHipaaCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPosHipaaCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPosHipaaCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of posHipaaCdMod
   *
   * @return posHipaaCdMod
   */
  public char[] getPosHipaaCdMod() throws CFException {
    if (isPosHipaaCdModModified()) {
      posHipaaCdMod = refreshPosHipaaCdMod();
    }
    return posHipaaCdMod;
  }

  /**
   * set variable posHipaaCdMod Corresponding COBOL Variable is WS-POS-HIPAA-CD-MOD
   *
   * @param value
   */
  public void setPosHipaaCdMod(char[] value) {
    posHipaaCdMod = checkPosHipaaCdModConstraints(value);
    serializePosHipaaCdMod(posHipaaCdMod);
  }

  /**
   * Update PosHipaaCdMod with a char[] from an offset and length
   *
   * @param value
   */
  public void setPosHipaaCdMod(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPosHipaaCdMod, posHipaaCdMod.length);
  }

  public void setPosHipaaCdMod(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPosHipaaCdMod, posHipaaCdMod.length);
  }

  /**
   * Update PosHipaaCdMod with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPosHipaaCdMod(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPosHipaaCdMod + targetIndex, targetLen);
  }

  /**
   * Update PosHipaaCdMod with another Field
   *
   * @param value
   */
  public void setPosHipaaCdMod(Field source) {
    replace(source, 0, source.length(), beginPosHipaaCdMod, POS_HIPAA_CD_MOD_LEN);
  }

  /**
   * Update PosHipaaCdMod with another Field from an offset and length
   *
   * @param value
   */
  public void setPosHipaaCdMod(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPosHipaaCdMod, POS_HIPAA_CD_MOD_LEN);
  }

  /**
   * Update PosHipaaCdMod with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPosHipaaCdMod(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPosHipaaCdMod + targetIndex, targetLen);
  }
  /**
   * Returns the value of posGrnrcReqCd
   *
   * @return posGrnrcReqCd
   */
  public char[] getPosGrnrcReqCd() throws CFException {
    if (isPosGrnrcReqCdModified()) {
      posGrnrcReqCd = refreshPosGrnrcReqCd();
    }
    return posGrnrcReqCd;
  }

  /**
   * set variable posGrnrcReqCd Corresponding COBOL Variable is WS-POS-GRNRC-REQ-CD
   *
   * @param value
   */
  public void setPosGrnrcReqCd(char[] value) {
    posGrnrcReqCd = checkPosGrnrcReqCdConstraints(value);
    serializePosGrnrcReqCd(posGrnrcReqCd);
  }

  /**
   * Update PosGrnrcReqCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPosGrnrcReqCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPosGrnrcReqCd, posGrnrcReqCd.length);
  }

  public void setPosGrnrcReqCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPosGrnrcReqCd, posGrnrcReqCd.length);
  }

  /**
   * Update PosGrnrcReqCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPosGrnrcReqCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPosGrnrcReqCd + targetIndex, targetLen);
  }

  /**
   * Update PosGrnrcReqCd with another Field
   *
   * @param value
   */
  public void setPosGrnrcReqCd(Field source) {
    replace(source, 0, source.length(), beginPosGrnrcReqCd, POS_GRNRC_REQ_CD_LEN);
  }

  /**
   * Update PosGrnrcReqCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPosGrnrcReqCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPosGrnrcReqCd, POS_GRNRC_REQ_CD_LEN);
  }

  /**
   * Update PosGrnrcReqCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPosGrnrcReqCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPosGrnrcReqCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of posInnCovIndicator
   *
   * @return posInnCovIndicator
   */
  public char[] getPosInnCovIndicator() throws CFException {
    if (isPosInnCovIndicatorModified()) {
      posInnCovIndicator = refreshPosInnCovIndicator();
    }
    return posInnCovIndicator;
  }

  /**
   * set variable posInnCovIndicator Corresponding COBOL Variable is WS-POS-INN-COV-INDICATOR
   *
   * @param value
   */
  public void setPosInnCovIndicator(char[] value) {
    posInnCovIndicator = checkPosInnCovIndicatorConstraints(value);
    serializePosInnCovIndicator(posInnCovIndicator);
  }

  /**
   * Update PosInnCovIndicator with a char[] from an offset and length
   *
   * @param value
   */
  public void setPosInnCovIndicator(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPosInnCovIndicator, posInnCovIndicator.length);
  }

  public void setPosInnCovIndicator(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPosInnCovIndicator, posInnCovIndicator.length);
  }

  /**
   * Update PosInnCovIndicator with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPosInnCovIndicator(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPosInnCovIndicator + targetIndex, targetLen);
  }

  /**
   * Update PosInnCovIndicator with another Field
   *
   * @param value
   */
  public void setPosInnCovIndicator(Field source) {
    replace(source, 0, source.length(), beginPosInnCovIndicator, POS_INN_COV_INDICATOR_LEN);
  }

  /**
   * Update PosInnCovIndicator with another Field from an offset and length
   *
   * @param value
   */
  public void setPosInnCovIndicator(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPosInnCovIndicator, POS_INN_COV_INDICATOR_LEN);
  }

  /**
   * Update PosInnCovIndicator with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPosInnCovIndicator(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPosInnCovIndicator + targetIndex, targetLen);
  }
  /**
   * Returns the value of posT1CovIndicator
   *
   * @return posT1CovIndicator
   */
  public char[] getPosT1CovIndicator() throws CFException {
    if (isPosT1CovIndicatorModified()) {
      posT1CovIndicator = refreshPosT1CovIndicator();
    }
    return posT1CovIndicator;
  }

  /**
   * set variable posT1CovIndicator Corresponding COBOL Variable is WS-POS-T1-COV-INDICATOR
   *
   * @param value
   */
  public void setPosT1CovIndicator(char[] value) {
    posT1CovIndicator = checkPosT1CovIndicatorConstraints(value);
    serializePosT1CovIndicator(posT1CovIndicator);
  }

  /**
   * Update PosT1CovIndicator with a char[] from an offset and length
   *
   * @param value
   */
  public void setPosT1CovIndicator(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPosT1CovIndicator, posT1CovIndicator.length);
  }

  public void setPosT1CovIndicator(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPosT1CovIndicator, posT1CovIndicator.length);
  }

  /**
   * Update PosT1CovIndicator with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPosT1CovIndicator(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPosT1CovIndicator + targetIndex, targetLen);
  }

  /**
   * Update PosT1CovIndicator with another Field
   *
   * @param value
   */
  public void setPosT1CovIndicator(Field source) {
    replace(source, 0, source.length(), beginPosT1CovIndicator, POS_T_1_COV_INDICATOR_LEN);
  }

  /**
   * Update PosT1CovIndicator with another Field from an offset and length
   *
   * @param value
   */
  public void setPosT1CovIndicator(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPosT1CovIndicator, POS_T_1_COV_INDICATOR_LEN);
  }

  /**
   * Update PosT1CovIndicator with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPosT1CovIndicator(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPosT1CovIndicator + targetIndex, targetLen);
  }
  /**
   * Returns the value of posOonCovIndicator
   *
   * @return posOonCovIndicator
   */
  public char[] getPosOonCovIndicator() throws CFException {
    if (isPosOonCovIndicatorModified()) {
      posOonCovIndicator = refreshPosOonCovIndicator();
    }
    return posOonCovIndicator;
  }

  /**
   * set variable posOonCovIndicator Corresponding COBOL Variable is WS-POS-OON-COV-INDICATOR
   *
   * @param value
   */
  public void setPosOonCovIndicator(char[] value) {
    posOonCovIndicator = checkPosOonCovIndicatorConstraints(value);
    serializePosOonCovIndicator(posOonCovIndicator);
  }

  /**
   * Update PosOonCovIndicator with a char[] from an offset and length
   *
   * @param value
   */
  public void setPosOonCovIndicator(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPosOonCovIndicator, posOonCovIndicator.length);
  }

  public void setPosOonCovIndicator(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPosOonCovIndicator, posOonCovIndicator.length);
  }

  /**
   * Update PosOonCovIndicator with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPosOonCovIndicator(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPosOonCovIndicator + targetIndex, targetLen);
  }

  /**
   * Update PosOonCovIndicator with another Field
   *
   * @param value
   */
  public void setPosOonCovIndicator(Field source) {
    replace(source, 0, source.length(), beginPosOonCovIndicator, POS_OON_COV_INDICATOR_LEN);
  }

  /**
   * Update PosOonCovIndicator with another Field from an offset and length
   *
   * @param value
   */
  public void setPosOonCovIndicator(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPosOonCovIndicator, POS_OON_COV_INDICATOR_LEN);
  }

  /**
   * Update PosOonCovIndicator with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPosOonCovIndicator(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPosOonCovIndicator + targetIndex, targetLen);
  }
  /**
   * Returns the value of posNetCnt
   *
   * @return posNetCnt
   */
  public int getPosNetCnt() throws CFException {
    if (isPosNetCntModified()) {
      posNetCnt = refreshPosNetCnt();
    }
    return posNetCnt;
  }

  /**
   * Update PosNetCnt with the passed value Corresponding COBOL Variable is WS-POS-NET-CNT
   *
   * @param number
   */
  public void setPosNetCnt(int number) {
    // Truncate if the number is beyond +/- Max range
    posNetCnt = checkPosNetCntMaxLimit(number);
    serializePosNetCnt(posNetCnt);
  }

  public void setPosNetCnt(long number) {
    number = checkPosNetCntMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPosNetCnt((int) number);
  }

  /**
   * Update PosNetCnt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPosNetCnt(char[] value) throws CFException {
    posNetCnt = serializePosNetCnt(value);
  }
  /**
   * Update PosNetCnt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPosNetCntString(char[] value) throws CFException {
    setPosNetCnt(value);
  }
  /**
   * Returns the value of posNetInfo Corresponding COBOL Variable is WS-POS-NET-INFO
   *
   * @return posNetInfo
   */
  public List<PosNetInfo> getPosNetInfo() {
    return posNetInfo;
  }

  /**
   * Returns the element at the specified position in this list.
   *
   * @param index
   * @return posNetInfo
   */
  public PosNetInfo getPosNetInfo(int index) {
    if (index < 0) {
      logger.trace("Array index was {} for getPosNetInfo(), resetting it to 0", index);
      index = 0;
    } else if (index >= POS_NET_INFO_SIZE) {
      index = POS_NET_INFO_SIZE - 1; // can't exceed max array size
      logger.trace(
          "posNetInfo - Array index exceeded max Size {}, resetting it to max allowed",
          POS_NET_INFO_SIZE);
    }
    if (index >= posNetInfo.size()) {
      for (int fillIndex = posNetInfo.size() - 1; fillIndex < index; fillIndex++) {
        posNetInfo.add(null);
      }
      posNetInfo.set(
          index,
          new PosNetInfo(this, beginPosNetInfo + index * PosNetInfo.getPosNetInfoFieldLength()));
    }
    PosNetInfo value = posNetInfo.get(index);
    if (value == null) {
      posNetInfo.set(
          index,
          new PosNetInfo(this, beginPosNetInfo + index * PosNetInfo.getPosNetInfoFieldLength()));
      value = posNetInfo.get(index);
    }
    return value;
  }

  /**
   * Update PosNetInfo at index with the passed value Corresponding COBOL Variable is
   * WS-POS-NET-INFO
   *
   * @param index
   * @param value
   */
  public void setPosNetInfo(int index, char[] value) {
    getPosNetInfo(index).setString(value);
  }

  public static int getPosBhiInfoFieldLength() {
    return POS_BHI_INFO_LENGTH;
  }
}
