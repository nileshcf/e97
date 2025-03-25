package com.cloudframe.app.dto.d5427pol;

/**
 * The class Pol4FamDed is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427pol.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Pol4FamDed extends Pol4FamDedSerialized {

  private int pol4DfdeSeqNbr;

  private long pol4DfdeDedAmt;

  private int pol4DfdeDedCaroCd;

  private int pol4DfdeDedCd;

  private char[] pol4DfdeDedMbrDesc = Field.fillLowValue(6);

  private int pol4DfdeDedMultFct;

  private BigDecimal pol4DfdeDedMultSalryPct = BigDecimal.ZERO;

  private BigDecimal pol4DfdeOopMultFct = BigDecimal.ZERO;

  private long pol4DedEePls1Amt;

  private long pol4DedEeSpoAmt;

  private long pol4DedEeChrgAmt;

  /** Constructor for Pol4FamDed */
  public Pol4FamDed() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for Pol4FamDed. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public Pol4FamDed(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of pol4DfdeSeqNbr
   *
   * @return pol4DfdeSeqNbr
   */
  public int getPol4DfdeSeqNbr() throws CFException {
    if (isPol4DfdeSeqNbrModified()) {
      pol4DfdeSeqNbr = refreshPol4DfdeSeqNbr();
    }
    return pol4DfdeSeqNbr;
  }

  /**
   * Update Pol4DfdeSeqNbr with the passed value Corresponding COBOL Variable is POL4-DFDE-SEQ-NBR
   *
   * @param number
   */
  public void setPol4DfdeSeqNbr(int number) {
    // Truncate if the number is beyond +/- Max range
    pol4DfdeSeqNbr = checkPol4DfdeSeqNbrMaxLimit(number);
    serializePol4DfdeSeqNbr(pol4DfdeSeqNbr);
  }

  public void setPol4DfdeSeqNbr(long number) {
    number = checkPol4DfdeSeqNbrMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPol4DfdeSeqNbr((int) number);
  }

  /**
   * Update Pol4DfdeSeqNbr with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4DfdeSeqNbr(char[] value) throws CFException {
    pol4DfdeSeqNbr = serializePol4DfdeSeqNbr(value);
  }
  /**
   * Update Pol4DfdeSeqNbr with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4DfdeSeqNbrString(char[] value) throws CFException {
    setPol4DfdeSeqNbr(value);
  }
  /**
   * Returns the value of pol4DfdeDedAmt
   *
   * @return pol4DfdeDedAmt
   */
  public long getPol4DfdeDedAmt() throws CFException {
    if (isPol4DfdeDedAmtModified()) {
      pol4DfdeDedAmt = refreshPol4DfdeDedAmt();
    }
    return pol4DfdeDedAmt;
  }

  /**
   * Update Pol4DfdeDedAmt with the passed value Corresponding COBOL Variable is POL4-DFDE-DED-AMT
   *
   * @param number
   */
  public void setPol4DfdeDedAmt(long number) {
    // Truncate if the number is beyond +/- Max range
    pol4DfdeDedAmt = checkPol4DfdeDedAmtMaxLimit(number);
    serializePol4DfdeDedAmt(pol4DfdeDedAmt);
  }

  /**
   * Update Pol4DfdeDedAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4DfdeDedAmt(char[] value) throws CFException {
    pol4DfdeDedAmt = serializePol4DfdeDedAmt(value);
  }
  /**
   * Update Pol4DfdeDedAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4DfdeDedAmtString(char[] value) throws CFException {
    setPol4DfdeDedAmt(value);
  }
  /**
   * Returns the value of pol4DfdeDedCaroCd
   *
   * @return pol4DfdeDedCaroCd
   */
  public int getPol4DfdeDedCaroCd() throws CFException {
    if (isPol4DfdeDedCaroCdModified()) {
      pol4DfdeDedCaroCd = refreshPol4DfdeDedCaroCd();
    }
    return pol4DfdeDedCaroCd;
  }

  /**
   * Update Pol4DfdeDedCaroCd with the passed value Corresponding COBOL Variable is
   * POL4-DFDE-DED-CARO-CD
   *
   * @param number
   */
  public void setPol4DfdeDedCaroCd(int number) {
    // Truncate if the number is beyond +/- Max range
    pol4DfdeDedCaroCd = checkPol4DfdeDedCaroCdMaxLimit(number);
    serializePol4DfdeDedCaroCd(pol4DfdeDedCaroCd);
  }

  public void setPol4DfdeDedCaroCd(long number) {
    number = checkPol4DfdeDedCaroCdMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPol4DfdeDedCaroCd((int) number);
  }

  /**
   * Update Pol4DfdeDedCaroCd with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4DfdeDedCaroCd(char[] value) throws CFException {
    pol4DfdeDedCaroCd = serializePol4DfdeDedCaroCd(value);
  }
  /**
   * Update Pol4DfdeDedCaroCd with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4DfdeDedCaroCdString(char[] value) throws CFException {
    setPol4DfdeDedCaroCd(value);
  }
  /**
   * Returns the value of pol4DfdeDedCd
   *
   * @return pol4DfdeDedCd
   */
  public int getPol4DfdeDedCd() throws CFException {
    if (isPol4DfdeDedCdModified()) {
      pol4DfdeDedCd = refreshPol4DfdeDedCd();
    }
    return pol4DfdeDedCd;
  }

  /**
   * Update Pol4DfdeDedCd with the passed value Corresponding COBOL Variable is POL4-DFDE-DED-CD
   *
   * @param number
   */
  public void setPol4DfdeDedCd(int number) {
    // Truncate if the number is beyond +/- Max range
    pol4DfdeDedCd = checkPol4DfdeDedCdMaxLimit(number);
    serializePol4DfdeDedCd(pol4DfdeDedCd);
  }

  public void setPol4DfdeDedCd(long number) {
    number = checkPol4DfdeDedCdMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPol4DfdeDedCd((int) number);
  }

  /**
   * Update Pol4DfdeDedCd with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4DfdeDedCd(char[] value) throws CFException {
    pol4DfdeDedCd = serializePol4DfdeDedCd(value);
  }
  /**
   * Update Pol4DfdeDedCd with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4DfdeDedCdString(char[] value) throws CFException {
    setPol4DfdeDedCd(value);
  }
  /**
   * Returns the value of pol4DfdeDedMbrDesc
   *
   * @return pol4DfdeDedMbrDesc
   */
  public char[] getPol4DfdeDedMbrDesc() throws CFException {
    if (isPol4DfdeDedMbrDescModified()) {
      pol4DfdeDedMbrDesc = refreshPol4DfdeDedMbrDesc();
    }
    return pol4DfdeDedMbrDesc;
  }

  /**
   * set variable pol4DfdeDedMbrDesc Corresponding COBOL Variable is POL4-DFDE-DED-MBR-DESC
   *
   * @param value
   */
  public void setPol4DfdeDedMbrDesc(char[] value) {
    pol4DfdeDedMbrDesc = checkPol4DfdeDedMbrDescConstraints(value);
    serializePol4DfdeDedMbrDesc(pol4DfdeDedMbrDesc);
  }

  /**
   * Update Pol4DfdeDedMbrDesc with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4DfdeDedMbrDesc(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol4DfdeDedMbrDesc, pol4DfdeDedMbrDesc.length);
  }

  public void setPol4DfdeDedMbrDesc(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4DfdeDedMbrDesc, pol4DfdeDedMbrDesc.length);
  }

  /**
   * Update Pol4DfdeDedMbrDesc with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4DfdeDedMbrDesc(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4DfdeDedMbrDesc + targetIndex, targetLen);
  }

  /**
   * Update Pol4DfdeDedMbrDesc with another Field
   *
   * @param value
   */
  public void setPol4DfdeDedMbrDesc(Field source) {
    replace(source, 0, source.length(), beginPol4DfdeDedMbrDesc, POL_4_DFDE_DED_MBR_DESC_LEN);
  }

  /**
   * Update Pol4DfdeDedMbrDesc with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4DfdeDedMbrDesc(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4DfdeDedMbrDesc, POL_4_DFDE_DED_MBR_DESC_LEN);
  }

  /**
   * Update Pol4DfdeDedMbrDesc with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4DfdeDedMbrDesc(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4DfdeDedMbrDesc + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4DfdeDedMultFct
   *
   * @return pol4DfdeDedMultFct
   */
  public int getPol4DfdeDedMultFct() throws CFException {
    if (isPol4DfdeDedMultFctModified()) {
      pol4DfdeDedMultFct = refreshPol4DfdeDedMultFct();
    }
    return pol4DfdeDedMultFct;
  }

  /**
   * Update Pol4DfdeDedMultFct with the passed value Corresponding COBOL Variable is
   * POL4-DFDE-DED-MULT-FCT
   *
   * @param number
   */
  public void setPol4DfdeDedMultFct(int number) {
    // Truncate if the number is beyond +/- Max range
    pol4DfdeDedMultFct = checkPol4DfdeDedMultFctMaxLimit(number);
    serializePol4DfdeDedMultFct(pol4DfdeDedMultFct);
  }

  public void setPol4DfdeDedMultFct(long number) {
    number = checkPol4DfdeDedMultFctMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPol4DfdeDedMultFct((int) number);
  }

  /**
   * Update Pol4DfdeDedMultFct with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4DfdeDedMultFct(char[] value) throws CFException {
    pol4DfdeDedMultFct = serializePol4DfdeDedMultFct(value);
  }
  /**
   * Update Pol4DfdeDedMultFct with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4DfdeDedMultFctString(char[] value) throws CFException {
    setPol4DfdeDedMultFct(value);
  }

  public BigDecimal getPol4DfdeDedMultSalryPct() throws CFException {
    if (isPol4DfdeDedMultSalryPctModified()) {
      pol4DfdeDedMultSalryPct = refreshPol4DfdeDedMultSalryPct();
    }
    return pol4DfdeDedMultSalryPct;
  }

  public char[] getPol4DfdeDedMultSalryPctString() {
    return pol4DfdeDedMultSalryPctString();
  }

  /**
   * Update Pol4DfdeDedMultSalryPct with the passed number Corresponding COBOL Variable is
   * POL4-DFDE-DED-MULT-SALRY-PCT
   *
   * @param number
   */
  public void setPol4DfdeDedMultSalryPct(BigDecimal number) {
    pol4DfdeDedMultSalryPct = checkPol4DfdeDedMultSalryPctMaxLimit(number);
    serializePol4DfdeDedMultSalryPct(pol4DfdeDedMultSalryPct);
  }

  public BigDecimal getPol4DfdeOopMultFct() throws CFException {
    if (isPol4DfdeOopMultFctModified()) {
      pol4DfdeOopMultFct = refreshPol4DfdeOopMultFct();
    }
    return pol4DfdeOopMultFct;
  }

  public char[] getPol4DfdeOopMultFctString() {
    return pol4DfdeOopMultFctString();
  }

  /**
   * Update Pol4DfdeOopMultFct with the passed number Corresponding COBOL Variable is
   * POL4-DFDE-OOP-MULT-FCT
   *
   * @param number
   */
  public void setPol4DfdeOopMultFct(BigDecimal number) {
    pol4DfdeOopMultFct = checkPol4DfdeOopMultFctMaxLimit(number);
    serializePol4DfdeOopMultFct(pol4DfdeOopMultFct);
  }
  /**
   * Returns the value of pol4DedEePls1Amt
   *
   * @return pol4DedEePls1Amt
   */
  public long getPol4DedEePls1Amt() throws CFException {
    if (isPol4DedEePls1AmtModified()) {
      pol4DedEePls1Amt = refreshPol4DedEePls1Amt();
    }
    return pol4DedEePls1Amt;
  }

  /**
   * Update Pol4DedEePls1Amt with the passed value Corresponding COBOL Variable is
   * POL4-DED-EE-PLS-1-AMT
   *
   * @param number
   */
  public void setPol4DedEePls1Amt(long number) {
    // Truncate if the number is beyond +/- Max range
    pol4DedEePls1Amt = checkPol4DedEePls1AmtMaxLimit(number);
    serializePol4DedEePls1Amt(pol4DedEePls1Amt);
  }

  /**
   * Update Pol4DedEePls1Amt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4DedEePls1Amt(char[] value) throws CFException {
    pol4DedEePls1Amt = serializePol4DedEePls1Amt(value);
  }
  /**
   * Update Pol4DedEePls1Amt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4DedEePls1AmtString(char[] value) throws CFException {
    setPol4DedEePls1Amt(value);
  }
  /**
   * Returns the value of pol4DedEeSpoAmt
   *
   * @return pol4DedEeSpoAmt
   */
  public long getPol4DedEeSpoAmt() throws CFException {
    if (isPol4DedEeSpoAmtModified()) {
      pol4DedEeSpoAmt = refreshPol4DedEeSpoAmt();
    }
    return pol4DedEeSpoAmt;
  }

  /**
   * Update Pol4DedEeSpoAmt with the passed value Corresponding COBOL Variable is
   * POL4-DED-EE-SPO-AMT
   *
   * @param number
   */
  public void setPol4DedEeSpoAmt(long number) {
    // Truncate if the number is beyond +/- Max range
    pol4DedEeSpoAmt = checkPol4DedEeSpoAmtMaxLimit(number);
    serializePol4DedEeSpoAmt(pol4DedEeSpoAmt);
  }

  /**
   * Update Pol4DedEeSpoAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4DedEeSpoAmt(char[] value) throws CFException {
    pol4DedEeSpoAmt = serializePol4DedEeSpoAmt(value);
  }
  /**
   * Update Pol4DedEeSpoAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4DedEeSpoAmtString(char[] value) throws CFException {
    setPol4DedEeSpoAmt(value);
  }
  /**
   * Returns the value of pol4DedEeChrgAmt
   *
   * @return pol4DedEeChrgAmt
   */
  public long getPol4DedEeChrgAmt() throws CFException {
    if (isPol4DedEeChrgAmtModified()) {
      pol4DedEeChrgAmt = refreshPol4DedEeChrgAmt();
    }
    return pol4DedEeChrgAmt;
  }

  /**
   * Update Pol4DedEeChrgAmt with the passed value Corresponding COBOL Variable is
   * POL4-DED-EE-CHRG-AMT
   *
   * @param number
   */
  public void setPol4DedEeChrgAmt(long number) {
    // Truncate if the number is beyond +/- Max range
    pol4DedEeChrgAmt = checkPol4DedEeChrgAmtMaxLimit(number);
    serializePol4DedEeChrgAmt(pol4DedEeChrgAmt);
  }

  /**
   * Update Pol4DedEeChrgAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4DedEeChrgAmt(char[] value) throws CFException {
    pol4DedEeChrgAmt = serializePol4DedEeChrgAmt(value);
  }
  /**
   * Update Pol4DedEeChrgAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4DedEeChrgAmtString(char[] value) throws CFException {
    setPol4DedEeChrgAmt(value);
  }

  /**
   * initializes Pol4FamDed String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setPol4DfdeSeqNbr(0);
    setPol4DfdeDedAmt(0);
    setPol4DfdeDedCaroCd(0);
    setPol4DfdeDedCd(0);
    setPol4DfdeDedMbrDesc(CONSTANTS.SPACE_6);
    setPol4DfdeDedMultFct(0);
    setPol4DfdeDedMultSalryPct(BigDecimal.ZERO);
    setPol4DfdeOopMultFct(BigDecimal.ZERO);
    setPol4DedEePls1Amt(0);
    setPol4DedEeSpoAmt(0);
    setPol4DedEeChrgAmt(0);
  }

  public static int getPol4FamDedFieldLength() {
    return POL_4_FAM_DED_LENGTH;
  }
}
