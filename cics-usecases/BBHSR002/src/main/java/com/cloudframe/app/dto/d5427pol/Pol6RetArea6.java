package com.cloudframe.app.dto.d5427pol;

/**
 * The class Pol6RetArea6 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427pol.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Pol6RetArea6 extends Pol6RetArea6Serialized {

  private char[] pol6RetStdPolNbr = Field.fillLowValue(6);

  private int pol6RetStdPlnNbr;

  private int pol6RetStdClssNbr;

  private char[] pol6RetSrvCatTableId = Field.fillLowValue(3);

  private long pol6RetLftMaxAmt;

  private int pol6RetNewCoinsPd;

  private char[] pol6RetNewCoinsSalItype = Field.fillLowValue(1);

  private long pol6RetNewCoinsAmt;

  private char[] pol6RetPayLocCd = Field.fillLowValue(3);

  private char[] pol6RetPayLocCd2 = Field.fillLowValue(3);

  private char[] pol6RetSrvcCdNSetInd = Field.fillLowValue(1);

  private char[] pol6RetSrvcCdPSetInd = Field.fillLowValue(1);

  private char[] pol6RetSrvcCdTSetInd = Field.fillLowValue(1);

  private char[] pol6PcpSpecCoinsInd = Field.fillLowValue(1);
  private List<Pol6RetIndvData> pol6RetIndvData = new ArrayList<>();

  private List<Pol6RetFamData> pol6RetFamData = new ArrayList<>();

  private char[] pol6RetXrfLmtSrvcCd = Field.fillLowValue(1);

  private char[] pol6BenMaxCombPriCd = Field.fillLowValue(1);

  private char[] pol6SpineManipPriCd = Field.fillLowValue(1);

  private char[] pol6PhysTrpyPriCd = Field.fillLowValue(1);

  private char[] pol6PhyOcpTrpyPriCd = Field.fillLowValue(1);

  private char[] pol6SpchTrpyPriCd = Field.fillLowValue(1);

  private char[] pol6OcpTrpyPriCd = Field.fillLowValue(1);

  private char[] pol6PhyOcpSpchPriCd = Field.fillLowValue(1);

  private char[] pol6CrdcRehabPriCd = Field.fillLowValue(1);

  private char[] pol6MmlCovSetNbr = Field.fillLowValue(3);

  /** Constructor for Pol6RetArea6 */
  public Pol6RetArea6() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for Pol6RetArea6. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public Pol6RetArea6(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of pol6RetStdPolNbr
   *
   * @return pol6RetStdPolNbr
   */
  public char[] getPol6RetStdPolNbr() throws CFException {
    if (isPol6RetStdPolNbrModified()) {
      pol6RetStdPolNbr = refreshPol6RetStdPolNbr();
    }
    return pol6RetStdPolNbr;
  }

  /**
   * set variable pol6RetStdPolNbr Corresponding COBOL Variable is POL6-RET-STD-POL-NBR
   *
   * @param value
   */
  public void setPol6RetStdPolNbr(char[] value) {
    pol6RetStdPolNbr = checkPol6RetStdPolNbrConstraints(value);
    serializePol6RetStdPolNbr(pol6RetStdPolNbr);
  }

  /**
   * Update Pol6RetStdPolNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol6RetStdPolNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol6RetStdPolNbr, pol6RetStdPolNbr.length);
  }

  public void setPol6RetStdPolNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetStdPolNbr, pol6RetStdPolNbr.length);
  }

  /**
   * Update Pol6RetStdPolNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol6RetStdPolNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetStdPolNbr + targetIndex, targetLen);
  }

  /**
   * Update Pol6RetStdPolNbr with another Field
   *
   * @param value
   */
  public void setPol6RetStdPolNbr(Field source) {
    replace(source, 0, source.length(), beginPol6RetStdPolNbr, POL_6_RET_STD_POL_NBR_LEN);
  }

  /**
   * Update Pol6RetStdPolNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setPol6RetStdPolNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetStdPolNbr, POL_6_RET_STD_POL_NBR_LEN);
  }

  /**
   * Update Pol6RetStdPolNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol6RetStdPolNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetStdPolNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol6RetStdPlnNbr
   *
   * @return pol6RetStdPlnNbr
   */
  public int getPol6RetStdPlnNbr() throws CFException {
    if (isPol6RetStdPlnNbrModified()) {
      pol6RetStdPlnNbr = refreshPol6RetStdPlnNbr();
    }
    return pol6RetStdPlnNbr;
  }

  /**
   * Update Pol6RetStdPlnNbr with the passed value Corresponding COBOL Variable is
   * POL6-RET-STD-PLN-NBR
   *
   * @param number
   */
  public void setPol6RetStdPlnNbr(int number) {
    // Truncate if the number is beyond +/- Max range
    pol6RetStdPlnNbr = checkPol6RetStdPlnNbrMaxLimit(number);
    serializePol6RetStdPlnNbr(pol6RetStdPlnNbr);
  }

  public void setPol6RetStdPlnNbr(long number) {
    number = checkPol6RetStdPlnNbrMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPol6RetStdPlnNbr((int) number);
  }

  /**
   * Update Pol6RetStdPlnNbr with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol6RetStdPlnNbr(char[] value) throws CFException {
    pol6RetStdPlnNbr = serializePol6RetStdPlnNbr(value);
  }
  /**
   * Update Pol6RetStdPlnNbr with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol6RetStdPlnNbrString(char[] value) throws CFException {
    setPol6RetStdPlnNbr(value);
  }
  /**
   * Returns the value of pol6RetStdClssNbr
   *
   * @return pol6RetStdClssNbr
   */
  public int getPol6RetStdClssNbr() throws CFException {
    if (isPol6RetStdClssNbrModified()) {
      pol6RetStdClssNbr = refreshPol6RetStdClssNbr();
    }
    return pol6RetStdClssNbr;
  }

  /**
   * Update Pol6RetStdClssNbr with the passed value Corresponding COBOL Variable is
   * POL6-RET-STD-CLSS-NBR
   *
   * @param number
   */
  public void setPol6RetStdClssNbr(int number) {
    // Truncate if the number is beyond +/- Max range
    pol6RetStdClssNbr = checkPol6RetStdClssNbrMaxLimit(number);
    serializePol6RetStdClssNbr(pol6RetStdClssNbr);
  }

  public void setPol6RetStdClssNbr(long number) {
    number = checkPol6RetStdClssNbrMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPol6RetStdClssNbr((int) number);
  }

  /**
   * Update Pol6RetStdClssNbr with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol6RetStdClssNbr(char[] value) throws CFException {
    pol6RetStdClssNbr = serializePol6RetStdClssNbr(value);
  }
  /**
   * Update Pol6RetStdClssNbr with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol6RetStdClssNbrString(char[] value) throws CFException {
    setPol6RetStdClssNbr(value);
  }
  /**
   * Returns the value of pol6RetSrvCatTableId
   *
   * @return pol6RetSrvCatTableId
   */
  public char[] getPol6RetSrvCatTableId() throws CFException {
    if (isPol6RetSrvCatTableIdModified()) {
      pol6RetSrvCatTableId = refreshPol6RetSrvCatTableId();
    }
    return pol6RetSrvCatTableId;
  }

  /**
   * set variable pol6RetSrvCatTableId Corresponding COBOL Variable is POL6-RET-SRV-CAT-TABLE-ID
   *
   * @param value
   */
  public void setPol6RetSrvCatTableId(char[] value) {
    pol6RetSrvCatTableId = checkPol6RetSrvCatTableIdConstraints(value);
    serializePol6RetSrvCatTableId(pol6RetSrvCatTableId);
  }

  /**
   * Update Pol6RetSrvCatTableId with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol6RetSrvCatTableId(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol6RetSrvCatTableId, pol6RetSrvCatTableId.length);
  }

  public void setPol6RetSrvCatTableId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetSrvCatTableId, pol6RetSrvCatTableId.length);
  }

  /**
   * Update Pol6RetSrvCatTableId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol6RetSrvCatTableId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetSrvCatTableId + targetIndex, targetLen);
  }

  /**
   * Update Pol6RetSrvCatTableId with another Field
   *
   * @param value
   */
  public void setPol6RetSrvCatTableId(Field source) {
    replace(source, 0, source.length(), beginPol6RetSrvCatTableId, POL_6_RET_SRV_CAT_TABLE_ID_LEN);
  }

  /**
   * Update Pol6RetSrvCatTableId with another Field from an offset and length
   *
   * @param value
   */
  public void setPol6RetSrvCatTableId(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol6RetSrvCatTableId, POL_6_RET_SRV_CAT_TABLE_ID_LEN);
  }

  /**
   * Update Pol6RetSrvCatTableId with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol6RetSrvCatTableId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetSrvCatTableId + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol6RetLftMaxAmt
   *
   * @return pol6RetLftMaxAmt
   */
  public long getPol6RetLftMaxAmt() throws CFException {
    if (isPol6RetLftMaxAmtModified()) {
      pol6RetLftMaxAmt = refreshPol6RetLftMaxAmt();
    }
    return pol6RetLftMaxAmt;
  }

  /**
   * Update Pol6RetLftMaxAmt with the passed value Corresponding COBOL Variable is
   * POL6-RET-LFT-MAX-AMT
   *
   * @param number
   */
  public void setPol6RetLftMaxAmt(long number) {
    // Truncate if the number is beyond +/- Max range
    pol6RetLftMaxAmt = checkPol6RetLftMaxAmtMaxLimit(number);
    serializePol6RetLftMaxAmt(pol6RetLftMaxAmt);
  }

  /**
   * Update Pol6RetLftMaxAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol6RetLftMaxAmt(char[] value) throws CFException {
    pol6RetLftMaxAmt = serializePol6RetLftMaxAmt(value);
  }
  /**
   * Update Pol6RetLftMaxAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol6RetLftMaxAmtString(char[] value) throws CFException {
    setPol6RetLftMaxAmt(value);
  }
  /**
   * Returns the value of pol6RetNewCoinsPd
   *
   * @return pol6RetNewCoinsPd
   */
  public int getPol6RetNewCoinsPd() throws CFException {
    if (isPol6RetNewCoinsPdModified()) {
      pol6RetNewCoinsPd = refreshPol6RetNewCoinsPd();
    }
    return pol6RetNewCoinsPd;
  }

  /**
   * Update Pol6RetNewCoinsPd with the passed value Corresponding COBOL Variable is
   * POL6-RET-NEW-COINS-PD
   *
   * @param number
   */
  public void setPol6RetNewCoinsPd(int number) {
    // Truncate if the number is beyond +/- Max range
    pol6RetNewCoinsPd = checkPol6RetNewCoinsPdMaxLimit(number);
    serializePol6RetNewCoinsPd(pol6RetNewCoinsPd);
  }

  public void setPol6RetNewCoinsPd(long number) {
    number = checkPol6RetNewCoinsPdMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPol6RetNewCoinsPd((int) number);
  }

  /**
   * Update Pol6RetNewCoinsPd with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol6RetNewCoinsPd(char[] value) throws CFException {
    pol6RetNewCoinsPd = serializePol6RetNewCoinsPd(value);
  }
  /**
   * Update Pol6RetNewCoinsPd with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol6RetNewCoinsPdString(char[] value) throws CFException {
    setPol6RetNewCoinsPd(value);
  }
  /**
   * Returns the value of pol6RetNewCoinsSalItype
   *
   * @return pol6RetNewCoinsSalItype
   */
  public char[] getPol6RetNewCoinsSalItype() throws CFException {
    if (isPol6RetNewCoinsSalItypeModified()) {
      pol6RetNewCoinsSalItype = refreshPol6RetNewCoinsSalItype();
    }
    return pol6RetNewCoinsSalItype;
  }

  /**
   * set variable pol6RetNewCoinsSalItype Corresponding COBOL Variable is
   * POL6-RET-NEW-COINS-SAL-ITYPE
   *
   * @param value
   */
  public void setPol6RetNewCoinsSalItype(char[] value) {
    pol6RetNewCoinsSalItype = checkPol6RetNewCoinsSalItypeConstraints(value);
    serializePol6RetNewCoinsSalItype(pol6RetNewCoinsSalItype);
  }

  /**
   * Update Pol6RetNewCoinsSalItype with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol6RetNewCoinsSalItype(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol6RetNewCoinsSalItype,
        pol6RetNewCoinsSalItype.length);
  }

  public void setPol6RetNewCoinsSalItype(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol6RetNewCoinsSalItype,
        pol6RetNewCoinsSalItype.length);
  }

  /**
   * Update Pol6RetNewCoinsSalItype with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol6RetNewCoinsSalItype(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetNewCoinsSalItype + targetIndex, targetLen);
  }

  /**
   * Update Pol6RetNewCoinsSalItype with another Field
   *
   * @param value
   */
  public void setPol6RetNewCoinsSalItype(Field source) {
    replace(
        source,
        0,
        source.length(),
        beginPol6RetNewCoinsSalItype,
        POL_6_RET_NEW_COINS_SAL_ITYPE_LEN);
  }

  /**
   * Update Pol6RetNewCoinsSalItype with another Field from an offset and length
   *
   * @param value
   */
  public void setPol6RetNewCoinsSalItype(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol6RetNewCoinsSalItype,
        POL_6_RET_NEW_COINS_SAL_ITYPE_LEN);
  }

  /**
   * Update Pol6RetNewCoinsSalItype with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol6RetNewCoinsSalItype(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetNewCoinsSalItype + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol6RetNewCoinsAmt
   *
   * @return pol6RetNewCoinsAmt
   */
  public long getPol6RetNewCoinsAmt() throws CFException {
    if (isPol6RetNewCoinsAmtModified()) {
      pol6RetNewCoinsAmt = refreshPol6RetNewCoinsAmt();
    }
    return pol6RetNewCoinsAmt;
  }

  /**
   * Update Pol6RetNewCoinsAmt with the passed value Corresponding COBOL Variable is
   * POL6-RET-NEW-COINS-AMT
   *
   * @param number
   */
  public void setPol6RetNewCoinsAmt(long number) {
    // Truncate if the number is beyond +/- Max range
    pol6RetNewCoinsAmt = checkPol6RetNewCoinsAmtMaxLimit(number);
    serializePol6RetNewCoinsAmt(pol6RetNewCoinsAmt);
  }

  /**
   * Update Pol6RetNewCoinsAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol6RetNewCoinsAmt(char[] value) throws CFException {
    pol6RetNewCoinsAmt = serializePol6RetNewCoinsAmt(value);
  }
  /**
   * Update Pol6RetNewCoinsAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol6RetNewCoinsAmtString(char[] value) throws CFException {
    setPol6RetNewCoinsAmt(value);
  }
  /**
   * Returns the value of pol6RetPayLocCd
   *
   * @return pol6RetPayLocCd
   */
  public char[] getPol6RetPayLocCd() throws CFException {
    if (isPol6RetPayLocCdModified()) {
      pol6RetPayLocCd = refreshPol6RetPayLocCd();
    }
    return pol6RetPayLocCd;
  }

  /**
   * set variable pol6RetPayLocCd Corresponding COBOL Variable is POL6-RET-PAY-LOC-CD
   *
   * @param value
   */
  public void setPol6RetPayLocCd(char[] value) {
    pol6RetPayLocCd = checkPol6RetPayLocCdConstraints(value);
    serializePol6RetPayLocCd(pol6RetPayLocCd);
  }

  /**
   * Update Pol6RetPayLocCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol6RetPayLocCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol6RetPayLocCd, pol6RetPayLocCd.length);
  }

  public void setPol6RetPayLocCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetPayLocCd, pol6RetPayLocCd.length);
  }

  /**
   * Update Pol6RetPayLocCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol6RetPayLocCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetPayLocCd + targetIndex, targetLen);
  }

  /**
   * Update Pol6RetPayLocCd with another Field
   *
   * @param value
   */
  public void setPol6RetPayLocCd(Field source) {
    replace(source, 0, source.length(), beginPol6RetPayLocCd, POL_6_RET_PAY_LOC_CD_LEN);
  }

  /**
   * Update Pol6RetPayLocCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol6RetPayLocCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetPayLocCd, POL_6_RET_PAY_LOC_CD_LEN);
  }

  /**
   * Update Pol6RetPayLocCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol6RetPayLocCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetPayLocCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol6RetPayLocCd2
   *
   * @return pol6RetPayLocCd2
   */
  public char[] getPol6RetPayLocCd2() throws CFException {
    if (isPol6RetPayLocCd2Modified()) {
      pol6RetPayLocCd2 = refreshPol6RetPayLocCd2();
    }
    return pol6RetPayLocCd2;
  }

  /**
   * set variable pol6RetPayLocCd2 Corresponding COBOL Variable is POL6-RET-PAY-LOC-CD2
   *
   * @param value
   */
  public void setPol6RetPayLocCd2(char[] value) {
    pol6RetPayLocCd2 = checkPol6RetPayLocCd2Constraints(value);
    serializePol6RetPayLocCd2(pol6RetPayLocCd2);
  }

  /**
   * Update Pol6RetPayLocCd2 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol6RetPayLocCd2(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol6RetPayLocCd2, pol6RetPayLocCd2.length);
  }

  public void setPol6RetPayLocCd2(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetPayLocCd2, pol6RetPayLocCd2.length);
  }

  /**
   * Update Pol6RetPayLocCd2 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol6RetPayLocCd2(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetPayLocCd2 + targetIndex, targetLen);
  }

  /**
   * Update Pol6RetPayLocCd2 with another Field
   *
   * @param value
   */
  public void setPol6RetPayLocCd2(Field source) {
    replace(source, 0, source.length(), beginPol6RetPayLocCd2, POL_6_RET_PAY_LOC_CD_2_LEN);
  }

  /**
   * Update Pol6RetPayLocCd2 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol6RetPayLocCd2(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetPayLocCd2, POL_6_RET_PAY_LOC_CD_2_LEN);
  }

  /**
   * Update Pol6RetPayLocCd2 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol6RetPayLocCd2(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetPayLocCd2 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol6RetSrvcCdNSetInd
   *
   * @return pol6RetSrvcCdNSetInd
   */
  public char[] getPol6RetSrvcCdNSetInd() throws CFException {
    if (isPol6RetSrvcCdNSetIndModified()) {
      pol6RetSrvcCdNSetInd = refreshPol6RetSrvcCdNSetInd();
    }
    return pol6RetSrvcCdNSetInd;
  }

  /**
   * set variable pol6RetSrvcCdNSetInd Corresponding COBOL Variable is POL6-RET-SRVC-CD-N-SET-IND
   *
   * @param value
   */
  public void setPol6RetSrvcCdNSetInd(char[] value) {
    pol6RetSrvcCdNSetInd = checkPol6RetSrvcCdNSetIndConstraints(value);
    serializePol6RetSrvcCdNSetInd(pol6RetSrvcCdNSetInd);
  }

  /**
   * Update Pol6RetSrvcCdNSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol6RetSrvcCdNSetInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol6RetSrvcCdNSetInd, pol6RetSrvcCdNSetInd.length);
  }

  public void setPol6RetSrvcCdNSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetSrvcCdNSetInd, pol6RetSrvcCdNSetInd.length);
  }

  /**
   * Update Pol6RetSrvcCdNSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol6RetSrvcCdNSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetSrvcCdNSetInd + targetIndex, targetLen);
  }

  /**
   * Update Pol6RetSrvcCdNSetInd with another Field
   *
   * @param value
   */
  public void setPol6RetSrvcCdNSetInd(Field source) {
    replace(source, 0, source.length(), beginPol6RetSrvcCdNSetInd, POL_6_RET_SRVC_CD_NSET_IND_LEN);
  }

  /**
   * Update Pol6RetSrvcCdNSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol6RetSrvcCdNSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol6RetSrvcCdNSetInd, POL_6_RET_SRVC_CD_NSET_IND_LEN);
  }

  /**
   * Update Pol6RetSrvcCdNSetInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol6RetSrvcCdNSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetSrvcCdNSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol6RetSrvcCdPSetInd
   *
   * @return pol6RetSrvcCdPSetInd
   */
  public char[] getPol6RetSrvcCdPSetInd() throws CFException {
    if (isPol6RetSrvcCdPSetIndModified()) {
      pol6RetSrvcCdPSetInd = refreshPol6RetSrvcCdPSetInd();
    }
    return pol6RetSrvcCdPSetInd;
  }

  /**
   * set variable pol6RetSrvcCdPSetInd Corresponding COBOL Variable is POL6-RET-SRVC-CD-P-SET-IND
   *
   * @param value
   */
  public void setPol6RetSrvcCdPSetInd(char[] value) {
    pol6RetSrvcCdPSetInd = checkPol6RetSrvcCdPSetIndConstraints(value);
    serializePol6RetSrvcCdPSetInd(pol6RetSrvcCdPSetInd);
  }

  /**
   * Update Pol6RetSrvcCdPSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol6RetSrvcCdPSetInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol6RetSrvcCdPSetInd, pol6RetSrvcCdPSetInd.length);
  }

  public void setPol6RetSrvcCdPSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetSrvcCdPSetInd, pol6RetSrvcCdPSetInd.length);
  }

  /**
   * Update Pol6RetSrvcCdPSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol6RetSrvcCdPSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetSrvcCdPSetInd + targetIndex, targetLen);
  }

  /**
   * Update Pol6RetSrvcCdPSetInd with another Field
   *
   * @param value
   */
  public void setPol6RetSrvcCdPSetInd(Field source) {
    replace(source, 0, source.length(), beginPol6RetSrvcCdPSetInd, POL_6_RET_SRVC_CD_PSET_IND_LEN);
  }

  /**
   * Update Pol6RetSrvcCdPSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol6RetSrvcCdPSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol6RetSrvcCdPSetInd, POL_6_RET_SRVC_CD_PSET_IND_LEN);
  }

  /**
   * Update Pol6RetSrvcCdPSetInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol6RetSrvcCdPSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetSrvcCdPSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol6RetSrvcCdTSetInd
   *
   * @return pol6RetSrvcCdTSetInd
   */
  public char[] getPol6RetSrvcCdTSetInd() throws CFException {
    if (isPol6RetSrvcCdTSetIndModified()) {
      pol6RetSrvcCdTSetInd = refreshPol6RetSrvcCdTSetInd();
    }
    return pol6RetSrvcCdTSetInd;
  }

  /**
   * set variable pol6RetSrvcCdTSetInd Corresponding COBOL Variable is POL6-RET-SRVC-CD-T-SET-IND
   *
   * @param value
   */
  public void setPol6RetSrvcCdTSetInd(char[] value) {
    pol6RetSrvcCdTSetInd = checkPol6RetSrvcCdTSetIndConstraints(value);
    serializePol6RetSrvcCdTSetInd(pol6RetSrvcCdTSetInd);
  }

  /**
   * Update Pol6RetSrvcCdTSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol6RetSrvcCdTSetInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol6RetSrvcCdTSetInd, pol6RetSrvcCdTSetInd.length);
  }

  public void setPol6RetSrvcCdTSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetSrvcCdTSetInd, pol6RetSrvcCdTSetInd.length);
  }

  /**
   * Update Pol6RetSrvcCdTSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol6RetSrvcCdTSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetSrvcCdTSetInd + targetIndex, targetLen);
  }

  /**
   * Update Pol6RetSrvcCdTSetInd with another Field
   *
   * @param value
   */
  public void setPol6RetSrvcCdTSetInd(Field source) {
    replace(source, 0, source.length(), beginPol6RetSrvcCdTSetInd, POL_6_RET_SRVC_CD_TSET_IND_LEN);
  }

  /**
   * Update Pol6RetSrvcCdTSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol6RetSrvcCdTSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol6RetSrvcCdTSetInd, POL_6_RET_SRVC_CD_TSET_IND_LEN);
  }

  /**
   * Update Pol6RetSrvcCdTSetInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol6RetSrvcCdTSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetSrvcCdTSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol6PcpSpecCoinsInd
   *
   * @return pol6PcpSpecCoinsInd
   */
  public char[] getPol6PcpSpecCoinsInd() throws CFException {
    if (isPol6PcpSpecCoinsIndModified()) {
      pol6PcpSpecCoinsInd = refreshPol6PcpSpecCoinsInd();
    }
    return pol6PcpSpecCoinsInd;
  }

  /**
   * set variable pol6PcpSpecCoinsInd Corresponding COBOL Variable is POL6-PCP-SPEC-COINS-IND
   *
   * @param value
   */
  public void setPol6PcpSpecCoinsInd(char[] value) {
    pol6PcpSpecCoinsInd = checkPol6PcpSpecCoinsIndConstraints(value);
    serializePol6PcpSpecCoinsInd(pol6PcpSpecCoinsInd);
  }

  /**
   * Update Pol6PcpSpecCoinsInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol6PcpSpecCoinsInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol6PcpSpecCoinsInd, pol6PcpSpecCoinsInd.length);
  }

  public void setPol6PcpSpecCoinsInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol6PcpSpecCoinsInd, pol6PcpSpecCoinsInd.length);
  }

  /**
   * Update Pol6PcpSpecCoinsInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol6PcpSpecCoinsInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6PcpSpecCoinsInd + targetIndex, targetLen);
  }

  /**
   * Update Pol6PcpSpecCoinsInd with another Field
   *
   * @param value
   */
  public void setPol6PcpSpecCoinsInd(Field source) {
    replace(source, 0, source.length(), beginPol6PcpSpecCoinsInd, POL_6_PCP_SPEC_COINS_IND_LEN);
  }

  /**
   * Update Pol6PcpSpecCoinsInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol6PcpSpecCoinsInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol6PcpSpecCoinsInd, POL_6_PCP_SPEC_COINS_IND_LEN);
  }

  /**
   * Update Pol6PcpSpecCoinsInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol6PcpSpecCoinsInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6PcpSpecCoinsInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol6RetIndvData Corresponding COBOL Variable is POL6-RET-INDV-DATA
   *
   * @return pol6RetIndvData
   */
  public List<Pol6RetIndvData> getPol6RetIndvData() {
    return pol6RetIndvData;
  }

  /**
   * Returns the element at the specified position in this list.
   *
   * @param index
   * @return pol6RetIndvData
   */
  public Pol6RetIndvData getPol6RetIndvData(int index) {
    if (index < 0) {
      logger.trace("Array index was {} for getPol6RetIndvData(), resetting it to 0", index);
      index = 0;
    } else if (index >= POL_6_RET_INDV_DATA_SIZE) {
      index = POL_6_RET_INDV_DATA_SIZE - 1; // can't exceed max array size
      logger.trace(
          "pol6RetIndvData - Array index exceeded max Size {}, resetting it to max allowed",
          POL_6_RET_INDV_DATA_SIZE);
    }
    if (index >= pol6RetIndvData.size()) {
      for (int fillIndex = pol6RetIndvData.size() - 1; fillIndex < index; fillIndex++) {
        pol6RetIndvData.add(null);
      }
      pol6RetIndvData.set(
          index,
          new Pol6RetIndvData(
              this,
              beginPol6RetIndvData + index * Pol6RetIndvData.getPol6RetIndvDataFieldLength()));
    }
    Pol6RetIndvData value = pol6RetIndvData.get(index);
    if (value == null) {
      pol6RetIndvData.set(
          index,
          new Pol6RetIndvData(
              this,
              beginPol6RetIndvData + index * Pol6RetIndvData.getPol6RetIndvDataFieldLength()));
      value = pol6RetIndvData.get(index);
    }
    return value;
  }

  /**
   * Update Pol6RetIndvData at index with the passed value Corresponding COBOL Variable is
   * POL6-RET-INDV-DATA
   *
   * @param index
   * @param value
   */
  public void setPol6RetIndvData(int index, char[] value) {
    getPol6RetIndvData(index).setString(value);
  }

  /**
   * Returns the value of pol6RetFamData Corresponding COBOL Variable is POL6-RET-FAM-DATA
   *
   * @return pol6RetFamData
   */
  public List<Pol6RetFamData> getPol6RetFamData() {
    return pol6RetFamData;
  }

  /**
   * Returns the element at the specified position in this list.
   *
   * @param index
   * @return pol6RetFamData
   */
  public Pol6RetFamData getPol6RetFamData(int index) {
    if (index < 0) {
      logger.trace("Array index was {} for getPol6RetFamData(), resetting it to 0", index);
      index = 0;
    } else if (index >= POL_6_RET_FAM_DATA_SIZE) {
      index = POL_6_RET_FAM_DATA_SIZE - 1; // can't exceed max array size
      logger.trace(
          "pol6RetFamData - Array index exceeded max Size {}, resetting it to max allowed",
          POL_6_RET_FAM_DATA_SIZE);
    }
    if (index >= pol6RetFamData.size()) {
      for (int fillIndex = pol6RetFamData.size() - 1; fillIndex < index; fillIndex++) {
        pol6RetFamData.add(null);
      }
      pol6RetFamData.set(
          index,
          new Pol6RetFamData(
              this, beginPol6RetFamData + index * Pol6RetFamData.getPol6RetFamDataFieldLength()));
    }
    Pol6RetFamData value = pol6RetFamData.get(index);
    if (value == null) {
      pol6RetFamData.set(
          index,
          new Pol6RetFamData(
              this, beginPol6RetFamData + index * Pol6RetFamData.getPol6RetFamDataFieldLength()));
      value = pol6RetFamData.get(index);
    }
    return value;
  }

  /**
   * Update Pol6RetFamData at index with the passed value Corresponding COBOL Variable is
   * POL6-RET-FAM-DATA
   *
   * @param index
   * @param value
   */
  public void setPol6RetFamData(int index, char[] value) {
    getPol6RetFamData(index).setString(value);
  }

  /**
   * Returns the value of pol6RetXrfLmtSrvcCd
   *
   * @return pol6RetXrfLmtSrvcCd
   */
  public char[] getPol6RetXrfLmtSrvcCd() throws CFException {
    if (isPol6RetXrfLmtSrvcCdModified()) {
      pol6RetXrfLmtSrvcCd = refreshPol6RetXrfLmtSrvcCd();
    }
    return pol6RetXrfLmtSrvcCd;
  }

  /**
   * set variable pol6RetXrfLmtSrvcCd Corresponding COBOL Variable is POL6-RET-XRF-LMT-SRVC-CD
   *
   * @param value
   */
  public void setPol6RetXrfLmtSrvcCd(char[] value) {
    pol6RetXrfLmtSrvcCd = checkPol6RetXrfLmtSrvcCdConstraints(value);
    serializePol6RetXrfLmtSrvcCd(pol6RetXrfLmtSrvcCd);
  }

  /**
   * Update Pol6RetXrfLmtSrvcCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol6RetXrfLmtSrvcCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol6RetXrfLmtSrvcCd, pol6RetXrfLmtSrvcCd.length);
  }

  public void setPol6RetXrfLmtSrvcCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetXrfLmtSrvcCd, pol6RetXrfLmtSrvcCd.length);
  }

  /**
   * Update Pol6RetXrfLmtSrvcCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol6RetXrfLmtSrvcCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetXrfLmtSrvcCd + targetIndex, targetLen);
  }

  /**
   * Update Pol6RetXrfLmtSrvcCd with another Field
   *
   * @param value
   */
  public void setPol6RetXrfLmtSrvcCd(Field source) {
    replace(source, 0, source.length(), beginPol6RetXrfLmtSrvcCd, POL_6_RET_XRF_LMT_SRVC_CD_LEN);
  }

  /**
   * Update Pol6RetXrfLmtSrvcCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol6RetXrfLmtSrvcCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol6RetXrfLmtSrvcCd, POL_6_RET_XRF_LMT_SRVC_CD_LEN);
  }

  /**
   * Update Pol6RetXrfLmtSrvcCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol6RetXrfLmtSrvcCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetXrfLmtSrvcCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol6BenMaxCombPriCd
   *
   * @return pol6BenMaxCombPriCd
   */
  public char[] getPol6BenMaxCombPriCd() throws CFException {
    if (isPol6BenMaxCombPriCdModified()) {
      pol6BenMaxCombPriCd = refreshPol6BenMaxCombPriCd();
    }
    return pol6BenMaxCombPriCd;
  }

  /**
   * set variable pol6BenMaxCombPriCd Corresponding COBOL Variable is POL6-BEN-MAX-COMB-PRI-CD
   *
   * @param value
   */
  public void setPol6BenMaxCombPriCd(char[] value) {
    pol6BenMaxCombPriCd = checkPol6BenMaxCombPriCdConstraints(value);
    serializePol6BenMaxCombPriCd(pol6BenMaxCombPriCd);
  }

  /**
   * Update Pol6BenMaxCombPriCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol6BenMaxCombPriCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol6BenMaxCombPriCd, pol6BenMaxCombPriCd.length);
  }

  public void setPol6BenMaxCombPriCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol6BenMaxCombPriCd, pol6BenMaxCombPriCd.length);
  }

  /**
   * Update Pol6BenMaxCombPriCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol6BenMaxCombPriCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6BenMaxCombPriCd + targetIndex, targetLen);
  }

  /**
   * Update Pol6BenMaxCombPriCd with another Field
   *
   * @param value
   */
  public void setPol6BenMaxCombPriCd(Field source) {
    replace(source, 0, source.length(), beginPol6BenMaxCombPriCd, POL_6_BEN_MAX_COMB_PRI_CD_LEN);
  }

  /**
   * Update Pol6BenMaxCombPriCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol6BenMaxCombPriCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol6BenMaxCombPriCd, POL_6_BEN_MAX_COMB_PRI_CD_LEN);
  }

  /**
   * Update Pol6BenMaxCombPriCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol6BenMaxCombPriCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6BenMaxCombPriCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol6SpineManipPriCd
   *
   * @return pol6SpineManipPriCd
   */
  public char[] getPol6SpineManipPriCd() throws CFException {
    if (isPol6SpineManipPriCdModified()) {
      pol6SpineManipPriCd = refreshPol6SpineManipPriCd();
    }
    return pol6SpineManipPriCd;
  }

  /**
   * set variable pol6SpineManipPriCd Corresponding COBOL Variable is POL6-SPINE-MANIP-PRI-CD
   *
   * @param value
   */
  public void setPol6SpineManipPriCd(char[] value) {
    pol6SpineManipPriCd = checkPol6SpineManipPriCdConstraints(value);
    serializePol6SpineManipPriCd(pol6SpineManipPriCd);
  }

  /**
   * Update Pol6SpineManipPriCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol6SpineManipPriCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol6SpineManipPriCd, pol6SpineManipPriCd.length);
  }

  public void setPol6SpineManipPriCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol6SpineManipPriCd, pol6SpineManipPriCd.length);
  }

  /**
   * Update Pol6SpineManipPriCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol6SpineManipPriCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6SpineManipPriCd + targetIndex, targetLen);
  }

  /**
   * Update Pol6SpineManipPriCd with another Field
   *
   * @param value
   */
  public void setPol6SpineManipPriCd(Field source) {
    replace(source, 0, source.length(), beginPol6SpineManipPriCd, POL_6_SPINE_MANIP_PRI_CD_LEN);
  }

  /**
   * Update Pol6SpineManipPriCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol6SpineManipPriCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol6SpineManipPriCd, POL_6_SPINE_MANIP_PRI_CD_LEN);
  }

  /**
   * Update Pol6SpineManipPriCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol6SpineManipPriCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6SpineManipPriCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol6PhysTrpyPriCd
   *
   * @return pol6PhysTrpyPriCd
   */
  public char[] getPol6PhysTrpyPriCd() throws CFException {
    if (isPol6PhysTrpyPriCdModified()) {
      pol6PhysTrpyPriCd = refreshPol6PhysTrpyPriCd();
    }
    return pol6PhysTrpyPriCd;
  }

  /**
   * set variable pol6PhysTrpyPriCd Corresponding COBOL Variable is POL6-PHYS-TRPY-PRI-CD
   *
   * @param value
   */
  public void setPol6PhysTrpyPriCd(char[] value) {
    pol6PhysTrpyPriCd = checkPol6PhysTrpyPriCdConstraints(value);
    serializePol6PhysTrpyPriCd(pol6PhysTrpyPriCd);
  }

  /**
   * Update Pol6PhysTrpyPriCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol6PhysTrpyPriCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol6PhysTrpyPriCd, pol6PhysTrpyPriCd.length);
  }

  public void setPol6PhysTrpyPriCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol6PhysTrpyPriCd, pol6PhysTrpyPriCd.length);
  }

  /**
   * Update Pol6PhysTrpyPriCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol6PhysTrpyPriCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6PhysTrpyPriCd + targetIndex, targetLen);
  }

  /**
   * Update Pol6PhysTrpyPriCd with another Field
   *
   * @param value
   */
  public void setPol6PhysTrpyPriCd(Field source) {
    replace(source, 0, source.length(), beginPol6PhysTrpyPriCd, POL_6_PHYS_TRPY_PRI_CD_LEN);
  }

  /**
   * Update Pol6PhysTrpyPriCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol6PhysTrpyPriCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol6PhysTrpyPriCd, POL_6_PHYS_TRPY_PRI_CD_LEN);
  }

  /**
   * Update Pol6PhysTrpyPriCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol6PhysTrpyPriCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6PhysTrpyPriCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol6PhyOcpTrpyPriCd
   *
   * @return pol6PhyOcpTrpyPriCd
   */
  public char[] getPol6PhyOcpTrpyPriCd() throws CFException {
    if (isPol6PhyOcpTrpyPriCdModified()) {
      pol6PhyOcpTrpyPriCd = refreshPol6PhyOcpTrpyPriCd();
    }
    return pol6PhyOcpTrpyPriCd;
  }

  /**
   * set variable pol6PhyOcpTrpyPriCd Corresponding COBOL Variable is POL6-PHY-OCP-TRPY-PRI-CD
   *
   * @param value
   */
  public void setPol6PhyOcpTrpyPriCd(char[] value) {
    pol6PhyOcpTrpyPriCd = checkPol6PhyOcpTrpyPriCdConstraints(value);
    serializePol6PhyOcpTrpyPriCd(pol6PhyOcpTrpyPriCd);
  }

  /**
   * Update Pol6PhyOcpTrpyPriCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol6PhyOcpTrpyPriCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol6PhyOcpTrpyPriCd, pol6PhyOcpTrpyPriCd.length);
  }

  public void setPol6PhyOcpTrpyPriCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol6PhyOcpTrpyPriCd, pol6PhyOcpTrpyPriCd.length);
  }

  /**
   * Update Pol6PhyOcpTrpyPriCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol6PhyOcpTrpyPriCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6PhyOcpTrpyPriCd + targetIndex, targetLen);
  }

  /**
   * Update Pol6PhyOcpTrpyPriCd with another Field
   *
   * @param value
   */
  public void setPol6PhyOcpTrpyPriCd(Field source) {
    replace(source, 0, source.length(), beginPol6PhyOcpTrpyPriCd, POL_6_PHY_OCP_TRPY_PRI_CD_LEN);
  }

  /**
   * Update Pol6PhyOcpTrpyPriCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol6PhyOcpTrpyPriCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol6PhyOcpTrpyPriCd, POL_6_PHY_OCP_TRPY_PRI_CD_LEN);
  }

  /**
   * Update Pol6PhyOcpTrpyPriCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol6PhyOcpTrpyPriCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6PhyOcpTrpyPriCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol6SpchTrpyPriCd
   *
   * @return pol6SpchTrpyPriCd
   */
  public char[] getPol6SpchTrpyPriCd() throws CFException {
    if (isPol6SpchTrpyPriCdModified()) {
      pol6SpchTrpyPriCd = refreshPol6SpchTrpyPriCd();
    }
    return pol6SpchTrpyPriCd;
  }

  /**
   * set variable pol6SpchTrpyPriCd Corresponding COBOL Variable is POL6-SPCH-TRPY-PRI-CD
   *
   * @param value
   */
  public void setPol6SpchTrpyPriCd(char[] value) {
    pol6SpchTrpyPriCd = checkPol6SpchTrpyPriCdConstraints(value);
    serializePol6SpchTrpyPriCd(pol6SpchTrpyPriCd);
  }

  /**
   * Update Pol6SpchTrpyPriCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol6SpchTrpyPriCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol6SpchTrpyPriCd, pol6SpchTrpyPriCd.length);
  }

  public void setPol6SpchTrpyPriCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol6SpchTrpyPriCd, pol6SpchTrpyPriCd.length);
  }

  /**
   * Update Pol6SpchTrpyPriCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol6SpchTrpyPriCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6SpchTrpyPriCd + targetIndex, targetLen);
  }

  /**
   * Update Pol6SpchTrpyPriCd with another Field
   *
   * @param value
   */
  public void setPol6SpchTrpyPriCd(Field source) {
    replace(source, 0, source.length(), beginPol6SpchTrpyPriCd, POL_6_SPCH_TRPY_PRI_CD_LEN);
  }

  /**
   * Update Pol6SpchTrpyPriCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol6SpchTrpyPriCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol6SpchTrpyPriCd, POL_6_SPCH_TRPY_PRI_CD_LEN);
  }

  /**
   * Update Pol6SpchTrpyPriCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol6SpchTrpyPriCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6SpchTrpyPriCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol6OcpTrpyPriCd
   *
   * @return pol6OcpTrpyPriCd
   */
  public char[] getPol6OcpTrpyPriCd() throws CFException {
    if (isPol6OcpTrpyPriCdModified()) {
      pol6OcpTrpyPriCd = refreshPol6OcpTrpyPriCd();
    }
    return pol6OcpTrpyPriCd;
  }

  /**
   * set variable pol6OcpTrpyPriCd Corresponding COBOL Variable is POL6-OCP-TRPY-PRI-CD
   *
   * @param value
   */
  public void setPol6OcpTrpyPriCd(char[] value) {
    pol6OcpTrpyPriCd = checkPol6OcpTrpyPriCdConstraints(value);
    serializePol6OcpTrpyPriCd(pol6OcpTrpyPriCd);
  }

  /**
   * Update Pol6OcpTrpyPriCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol6OcpTrpyPriCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol6OcpTrpyPriCd, pol6OcpTrpyPriCd.length);
  }

  public void setPol6OcpTrpyPriCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol6OcpTrpyPriCd, pol6OcpTrpyPriCd.length);
  }

  /**
   * Update Pol6OcpTrpyPriCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol6OcpTrpyPriCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6OcpTrpyPriCd + targetIndex, targetLen);
  }

  /**
   * Update Pol6OcpTrpyPriCd with another Field
   *
   * @param value
   */
  public void setPol6OcpTrpyPriCd(Field source) {
    replace(source, 0, source.length(), beginPol6OcpTrpyPriCd, POL_6_OCP_TRPY_PRI_CD_LEN);
  }

  /**
   * Update Pol6OcpTrpyPriCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol6OcpTrpyPriCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol6OcpTrpyPriCd, POL_6_OCP_TRPY_PRI_CD_LEN);
  }

  /**
   * Update Pol6OcpTrpyPriCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol6OcpTrpyPriCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6OcpTrpyPriCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol6PhyOcpSpchPriCd
   *
   * @return pol6PhyOcpSpchPriCd
   */
  public char[] getPol6PhyOcpSpchPriCd() throws CFException {
    if (isPol6PhyOcpSpchPriCdModified()) {
      pol6PhyOcpSpchPriCd = refreshPol6PhyOcpSpchPriCd();
    }
    return pol6PhyOcpSpchPriCd;
  }

  /**
   * set variable pol6PhyOcpSpchPriCd Corresponding COBOL Variable is POL6-PHY-OCP-SPCH-PRI-CD
   *
   * @param value
   */
  public void setPol6PhyOcpSpchPriCd(char[] value) {
    pol6PhyOcpSpchPriCd = checkPol6PhyOcpSpchPriCdConstraints(value);
    serializePol6PhyOcpSpchPriCd(pol6PhyOcpSpchPriCd);
  }

  /**
   * Update Pol6PhyOcpSpchPriCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol6PhyOcpSpchPriCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol6PhyOcpSpchPriCd, pol6PhyOcpSpchPriCd.length);
  }

  public void setPol6PhyOcpSpchPriCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol6PhyOcpSpchPriCd, pol6PhyOcpSpchPriCd.length);
  }

  /**
   * Update Pol6PhyOcpSpchPriCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol6PhyOcpSpchPriCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6PhyOcpSpchPriCd + targetIndex, targetLen);
  }

  /**
   * Update Pol6PhyOcpSpchPriCd with another Field
   *
   * @param value
   */
  public void setPol6PhyOcpSpchPriCd(Field source) {
    replace(source, 0, source.length(), beginPol6PhyOcpSpchPriCd, POL_6_PHY_OCP_SPCH_PRI_CD_LEN);
  }

  /**
   * Update Pol6PhyOcpSpchPriCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol6PhyOcpSpchPriCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol6PhyOcpSpchPriCd, POL_6_PHY_OCP_SPCH_PRI_CD_LEN);
  }

  /**
   * Update Pol6PhyOcpSpchPriCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol6PhyOcpSpchPriCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6PhyOcpSpchPriCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol6CrdcRehabPriCd
   *
   * @return pol6CrdcRehabPriCd
   */
  public char[] getPol6CrdcRehabPriCd() throws CFException {
    if (isPol6CrdcRehabPriCdModified()) {
      pol6CrdcRehabPriCd = refreshPol6CrdcRehabPriCd();
    }
    return pol6CrdcRehabPriCd;
  }

  /**
   * set variable pol6CrdcRehabPriCd Corresponding COBOL Variable is POL6-CRDC-REHAB-PRI-CD
   *
   * @param value
   */
  public void setPol6CrdcRehabPriCd(char[] value) {
    pol6CrdcRehabPriCd = checkPol6CrdcRehabPriCdConstraints(value);
    serializePol6CrdcRehabPriCd(pol6CrdcRehabPriCd);
  }

  /**
   * Update Pol6CrdcRehabPriCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol6CrdcRehabPriCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol6CrdcRehabPriCd, pol6CrdcRehabPriCd.length);
  }

  public void setPol6CrdcRehabPriCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol6CrdcRehabPriCd, pol6CrdcRehabPriCd.length);
  }

  /**
   * Update Pol6CrdcRehabPriCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol6CrdcRehabPriCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6CrdcRehabPriCd + targetIndex, targetLen);
  }

  /**
   * Update Pol6CrdcRehabPriCd with another Field
   *
   * @param value
   */
  public void setPol6CrdcRehabPriCd(Field source) {
    replace(source, 0, source.length(), beginPol6CrdcRehabPriCd, POL_6_CRDC_REHAB_PRI_CD_LEN);
  }

  /**
   * Update Pol6CrdcRehabPriCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol6CrdcRehabPriCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol6CrdcRehabPriCd, POL_6_CRDC_REHAB_PRI_CD_LEN);
  }

  /**
   * Update Pol6CrdcRehabPriCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol6CrdcRehabPriCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6CrdcRehabPriCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol6MmlCovSetNbr
   *
   * @return pol6MmlCovSetNbr
   */
  public char[] getPol6MmlCovSetNbr() throws CFException {
    if (isPol6MmlCovSetNbrModified()) {
      pol6MmlCovSetNbr = refreshPol6MmlCovSetNbr();
    }
    return pol6MmlCovSetNbr;
  }

  /**
   * set variable pol6MmlCovSetNbr Corresponding COBOL Variable is POL6-MML-COV-SET-NBR
   *
   * @param value
   */
  public void setPol6MmlCovSetNbr(char[] value) {
    pol6MmlCovSetNbr = checkPol6MmlCovSetNbrConstraints(value);
    serializePol6MmlCovSetNbr(pol6MmlCovSetNbr);
  }

  /**
   * Update Pol6MmlCovSetNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol6MmlCovSetNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol6MmlCovSetNbr, pol6MmlCovSetNbr.length);
  }

  public void setPol6MmlCovSetNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol6MmlCovSetNbr, pol6MmlCovSetNbr.length);
  }

  /**
   * Update Pol6MmlCovSetNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol6MmlCovSetNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6MmlCovSetNbr + targetIndex, targetLen);
  }

  /**
   * Update Pol6MmlCovSetNbr with another Field
   *
   * @param value
   */
  public void setPol6MmlCovSetNbr(Field source) {
    replace(source, 0, source.length(), beginPol6MmlCovSetNbr, POL_6_MML_COV_SET_NBR_LEN);
  }

  /**
   * Update Pol6MmlCovSetNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setPol6MmlCovSetNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol6MmlCovSetNbr, POL_6_MML_COV_SET_NBR_LEN);
  }

  /**
   * Update Pol6MmlCovSetNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol6MmlCovSetNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6MmlCovSetNbr + targetIndex, targetLen);
  }

  /**
   * initializes Pol6RetArea6 String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setPol6RetStdPolNbr(CONSTANTS.SPACE_6);
    setPol6RetStdPlnNbr(0);
    setPol6RetStdClssNbr(0);
    setPol6RetSrvCatTableId(CONSTANTS.SPACE_3);
    setPol6RetLftMaxAmt(0);
    setPol6RetNewCoinsPd(0);
    setPol6RetNewCoinsSalItype(CONSTANTS.SPACE);
    setPol6RetNewCoinsAmt(0);
    setPol6RetPayLocCd(CONSTANTS.SPACE_3);
    setPol6RetPayLocCd2(CONSTANTS.SPACE_3);
    setPol6RetSrvcCdNSetInd(CONSTANTS.SPACE);
    setPol6RetSrvcCdPSetInd(CONSTANTS.SPACE);
    setPol6RetSrvcCdTSetInd(CONSTANTS.SPACE);
    setPol6PcpSpecCoinsInd(CONSTANTS.SPACE);
    if (pol6RetIndvData.isEmpty()) {
      // fill the Array to the full capacity
      for (int index = 0; index < POL_6_RET_INDV_DATA_SIZE; index++) {
        Pol6RetIndvData newElement =
            new Pol6RetIndvData(
                this,
                beginPol6RetIndvData + index * Pol6RetIndvData.getPol6RetIndvDataFieldLength());
        newElement.initialize();
        pol6RetIndvData.add(newElement);
      }
    } else {
      if (pol6RetIndvData.size() < POL_6_RET_INDV_DATA_SIZE) {
        // prefill it first
        for (int index = pol6RetIndvData.size(); index < POL_6_RET_INDV_DATA_SIZE; index++) {
          Pol6RetIndvData newElement =
              new Pol6RetIndvData(
                  this,
                  beginPol6RetIndvData + index * Pol6RetIndvData.getPol6RetIndvDataFieldLength());
          pol6RetIndvData.add(newElement);
        }
      }

      for (int index = 0; index < POL_6_RET_INDV_DATA_SIZE; index++) {
        Pol6RetIndvData pol6RetIndvDataVar = pol6RetIndvData.get(index);
        if (pol6RetIndvDataVar == null) {
          pol6RetIndvDataVar =
              new Pol6RetIndvData(
                  this,
                  beginPol6RetIndvData + index * Pol6RetIndvData.getPol6RetIndvDataFieldLength());
          pol6RetIndvData.set(index, pol6RetIndvDataVar);
        }
        pol6RetIndvDataVar.initialize();
      }
    }
    if (pol6RetFamData.isEmpty()) {
      // fill the Array to the full capacity
      for (int index = 0; index < POL_6_RET_FAM_DATA_SIZE; index++) {
        Pol6RetFamData newElement =
            new Pol6RetFamData(
                this, beginPol6RetFamData + index * Pol6RetFamData.getPol6RetFamDataFieldLength());
        newElement.initialize();
        pol6RetFamData.add(newElement);
      }
    } else {
      if (pol6RetFamData.size() < POL_6_RET_FAM_DATA_SIZE) {
        // prefill it first
        for (int index = pol6RetFamData.size(); index < POL_6_RET_FAM_DATA_SIZE; index++) {
          Pol6RetFamData newElement =
              new Pol6RetFamData(
                  this,
                  beginPol6RetFamData + index * Pol6RetFamData.getPol6RetFamDataFieldLength());
          pol6RetFamData.add(newElement);
        }
      }

      for (int index = 0; index < POL_6_RET_FAM_DATA_SIZE; index++) {
        Pol6RetFamData pol6RetFamDataVar = pol6RetFamData.get(index);
        if (pol6RetFamDataVar == null) {
          pol6RetFamDataVar =
              new Pol6RetFamData(
                  this,
                  beginPol6RetFamData + index * Pol6RetFamData.getPol6RetFamDataFieldLength());
          pol6RetFamData.set(index, pol6RetFamDataVar);
        }
        pol6RetFamDataVar.initialize();
      }
    }
    setPol6RetXrfLmtSrvcCd(CONSTANTS.SPACE);
    setPol6BenMaxCombPriCd(CONSTANTS.SPACE);
    setPol6SpineManipPriCd(CONSTANTS.SPACE);
    setPol6PhysTrpyPriCd(CONSTANTS.SPACE);
    setPol6PhyOcpTrpyPriCd(CONSTANTS.SPACE);
    setPol6SpchTrpyPriCd(CONSTANTS.SPACE);
    setPol6OcpTrpyPriCd(CONSTANTS.SPACE);
    setPol6PhyOcpSpchPriCd(CONSTANTS.SPACE);
    setPol6CrdcRehabPriCd(CONSTANTS.SPACE);
    setPol6MmlCovSetNbr(CONSTANTS.SPACE_3);
  }

  public static int getPol6RetArea6FieldLength() {
    return POL_6_RET_AREA_6_LENGTH;
  }
}
