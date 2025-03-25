package com.cloudframe.app.dto.bbhsr002;

/**
 * The class Pol4RetArea4 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Pol4RetArea4 extends Pol4RetArea4Serialized {

  private char[] pol4CovTypCd = Field.fillLowValue(1);

  private char[] pol4StdPolNbr = Field.fillLowValue(6);

  private int pol4StdPlnNbr;

  private int pol4StdClssNbr;

  private int pol4CopayVarId;

  private char[] pol4CombPrscDedPriCd = Field.fillLowValue(1);

  private char[] pol4CombPrscDedQualCd = Field.fillLowValue(1);

  private char[] pol4CombPrscDedSecCd = Field.fillLowValue(1);

  private char[] pol4CombPrscDedTirCd = Field.fillLowValue(1);

  private char[] pol4ContrStCd = Field.fillLowValue(2);

  private BigDecimal pol4CopayAmt = BigDecimal.ZERO;

  private long pol4FamNewCoinsAmt;

  private char[] pol4FamTxtSwapCd = Field.fillLowValue(1);

  private short pol4FamMbrCnt;

  private long pol4NewCoinsAmt;

  private char[] pol4NewCoinsCombPrscCd = Field.fillLowValue(1);

  private short pol4NewCoinsPrdCd;

  private BigDecimal pol4NcinsSlryFamMultFct = BigDecimal.ZERO;

  private char[] pol4NcinsSlryFamTypCd = Field.fillLowValue(1);

  private char[] pol4NcinsSlryIndvTypCd = Field.fillLowValue(1);

  private char[] pol4NonEmbdDedCd = Field.fillLowValue(1);

  private BigDecimal pol4NtwkPcpCopayAmt = BigDecimal.ZERO;

  private char[] pol4ObligId = Field.fillLowValue(2);

  private int pol4OopCombFamAmt;

  private int pol4OopCombIndvAmt;

  private char[] pol4OopCombPrscCd = Field.fillLowValue(1);

  private char[] pol4PcpCopayCd = Field.fillLowValue(1);

  private char[] pol4PcpSpecCoinsInd = Field.fillLowValue(1);

  private char[] pol4RcprctyTblId = Field.fillLowValue(2);

  private char[] pol4ShrArngCd = Field.fillLowValue(2);

  private char[] pol4SlotTblId = Field.fillLowValue(6);

  private char[] pol4RetSrvcCdNSetInd = Field.fillLowValue(1);

  private char[] pol4RetSrvcCdPSetInd = Field.fillLowValue(1);

  private char[] pol4RetSrvcCdTSetInd = Field.fillLowValue(1);

  private char[] pol4RetSrvcCdASetInd = Field.fillLowValue(1);

  private char[] pol4RetSrvcCdBSetInd = Field.fillLowValue(1);

  private char[] pol4RetSrvcCdCSetInd = Field.fillLowValue(1);

  private char[] pol4RetSrvcCdDSetInd = Field.fillLowValue(1);

  private char[] pol4RetSrvcCdESetInd = Field.fillLowValue(1);

  private char[] pol4RetSrvcCdFSetInd = Field.fillLowValue(1);

  private char[] pol4RetSrvcCdGSetInd = Field.fillLowValue(1);

  private char[] pol4RetSrvcCdHSetInd = Field.fillLowValue(1);

  private char[] pol4RetSrvcCdISetInd = Field.fillLowValue(1);

  private char[] pol4RetSrvcCdJSetInd = Field.fillLowValue(1);

  private char[] pol4RetSrvcCdKSetInd = Field.fillLowValue(1);

  private char[] pol4RetSrvcCdLSetInd = Field.fillLowValue(1);

  private char[] pol4RetSrvcCdMSetInd = Field.fillLowValue(1);

  private char[] pol4RetSrvcCdOSetInd = Field.fillLowValue(1);

  private char[] pol4RetSrvcCdQSetInd = Field.fillLowValue(1);

  private char[] pol4RetSrvcCdRSetInd = Field.fillLowValue(1);

  private char[] pol4RetSrvcCdSSetInd = Field.fillLowValue(1);

  private char[] pol4RetSrvcCdUSetInd = Field.fillLowValue(1);

  private char[] pol4RetSrvcCdVSetInd = Field.fillLowValue(1);

  private char[] pol4RetSrvcCdWSetInd = Field.fillLowValue(1);

  private char[] pol4RetSrvcCdXSetInd = Field.fillLowValue(1);

  private char[] pol4RetSrvcCdYSetInd = Field.fillLowValue(1);

  private char[] pol4RetSrvcCdZSetInd = Field.fillLowValue(1);

  private char[] pol4SviTblPriNbr = Field.fillLowValue(6);

  private BigDecimal pol4Tier1CopayAmt = BigDecimal.ZERO;

  private int pol4Tier1FamNewCoinsAmt;

  private int pol4Tier1NewCoinsAmt;

  private BigDecimal pol4Tier1UrgntCareAmt = BigDecimal.ZERO;

  private BigDecimal pol4UrgntCareAmt = BigDecimal.ZERO;

  private char[] pol4XtraTerrStMandInd = Field.fillLowValue(1);

  private char[] pol4TierLabelInd = Field.fillLowValue(1);

  private char[] pol4DedSpecialProcessCd = Field.fillLowValue(1);

  private int pol4OopInNtwkEePls1Amt;

  private int pol4OopInNtwkEeSpoAmt;

  private int pol4OopInNtwkEeChrgAmt;

  private int pol4OopCombEePls1Amt;

  private int pol4OopCombEeSpoAmt;

  private int pol4OopCombEeChrgAmt;

  private char[] pol4IplnTypCd = Field.fillLowValue(1);

  private char[] pol4IndNewCoinsMaxInd = Field.fillLowValue(1);

  private char[] pol4IndNewCoinsMaxPd = Field.fillLowValue(1);

  private char[] pol4CoinsCopayApplyInd = Field.fillLowValue(2);

  private BigDecimal pol4CopayMaxAmt = BigDecimal.ZERO;

  private char[] pol4FamDedMaxInd = Field.fillLowValue(1);

  private char[] pol4OhbsProductCd = Field.fillLowValue(1);

  private char[] pol4TciTableNumber = Field.fillLowValue(6);

  private char[] pol4CapitationExclInd = Field.fillLowValue(1);

  private char[] pol4IndemnityInd = Field.fillLowValue(3);

  private char[] pol4AnnualRCInd = Field.fillLowValue(1);

  private char[] pol4DefaultRCPercent = Field.fillLowValue(2);

  private char[] pol4FacSharedSavInd = Field.fillLowValue(1);

  private char[] pol4PhysSharedSavInd = Field.fillLowValue(1);

  private char[] pol4PlanFeatures = Field.fillLowValue(2);

  private char[] pol4PlanFeaturesInd = Field.fillLowValue(1);

  private char[] pol4AllncCd = Field.fillLowValue(1);

  private char[] pol4FundTypCd = Field.fillLowValue(1);

  private char[] pol4PrdctCdId = Field.fillLowValue(4);

  private char[] pol4EmergentWrapInd = Field.fillLowValue(1);

  private char[] pol4RetOopMaxCovCd = Field.fillLowValue(1);

  private char[] pol4SpecialProcessCd6 = Field.fillLowValue(1);

  private char[] pol4SpecialProcessCd1 = Field.fillLowValue(1);

  private char[] pol4SpecialProcessCd2 = Field.fillLowValue(1);

  private char[] pol4SpecialProcessCd4 = Field.fillLowValue(1);

  private char[] pol4SpecialProcessCd5 = Field.fillLowValue(1);

  private char[] pol4SpecialProcessCd7 = Field.fillLowValue(1);

  private char[] pol4SpecialProcessCd8 = Field.fillLowValue(1);

  private char[] pol4SpecialProcessCd9 = Field.fillLowValue(1);

  private char[] pol4SpecialProcessCd10 = Field.fillLowValue(1);

  private char[] pol4IndCoreMaxInd = Field.fillLowValue(1);

  private char[] pol4IndCoreMaxPd = Field.fillLowValue(1);

  private BigDecimal pol4InnIndCoreAmt = BigDecimal.ZERO;

  private BigDecimal pol4OonIndCoreAmt = BigDecimal.ZERO;

  private BigDecimal pol4T1IndCoreAmt = BigDecimal.ZERO;

  private BigDecimal pol4InnFamCoreAmt = BigDecimal.ZERO;

  private BigDecimal pol4T1FamCoreAmt = BigDecimal.ZERO;

  private BigDecimal pol4OonFamCoreAmt = BigDecimal.ZERO;

  private char[] pol4CrossApplyCoreInd = Field.fillLowValue(1);

  private BigDecimal pol4CopayIndMaxInn = BigDecimal.ZERO;

  private BigDecimal pol4CopayIndMaxOon = BigDecimal.ZERO;

  private BigDecimal pol4CopayIndMaxT1 = BigDecimal.ZERO;

  private BigDecimal pol4CopayFamMaxInn = BigDecimal.ZERO;

  private BigDecimal pol4CopayFamMaxOon = BigDecimal.ZERO;

  private BigDecimal pol4CopayFamMaxT1 = BigDecimal.ZERO;

  private char[] pol4CrossApplyCopayInd = Field.fillLowValue(1);

  private char[] pol4NonEmbMaxCopay = Field.fillLowValue(1);

  private char[] pol4NonEmbMaxCore = Field.fillLowValue(1);

  private char[] pol4NonEmbMaxDed = Field.fillLowValue(1);

  private char[] pol4NonEmbMaxOop = Field.fillLowValue(1);

  private BigDecimal pol4CoreSlryFamMultFct = BigDecimal.ZERO;

  private char[] pol4CoreSlryFamTypCd = Field.fillLowValue(1);

  private char[] pol4CoreSlryIndvTypCd = Field.fillLowValue(1);

  private int pol4CoreInNtwkEePls1Amt;

  private int pol4CoreInNtwkEeSpoAmt;

  private int pol4CoreInNtwkEeChrgAmt;

  private int pol4CoreCombEePls1Amt;

  private int pol4CoreCombEeSpoAmt;

  private int pol4CoreCombEeChrgAmt;

  private char[] pol4RetLmtSrvcCd = Field.fillLowValue(1);

  private char[] pol4NptRulePkgId = Field.fillLowValue(6);

  private char[] pol4RetDualOopNbrInd = Field.fillLowValue(1);
  private List<Pol4PolBenLvl> pol4PolBenLvl = new ArrayList<>();

  private List<Pol4FamDed> pol4FamDed = new ArrayList<>();

  private List<Pol4IndDed> pol4IndDed = new ArrayList<>();

  private char[] pol4RetRhabCombPtLmtCd = Field.fillLowValue(2);

  private char[] pol4RetRhabCombOtLmtCd = Field.fillLowValue(2);

  private char[] pol4RetRhabCombStLmtCd = Field.fillLowValue(2);

  private char[] pol4RetRhabCombSmLmtCd = Field.fillLowValue(2);

  private char[] pol4RetRhabCombCiLmtCd = Field.fillLowValue(2);

  private char[] pol4RetRhabCombCtLmtCd = Field.fillLowValue(2);

  private char[] pol4RetRhabCombCrLmtCd = Field.fillLowValue(2);

  private char[] pol4RetRhabCombPrLmtCd = Field.fillLowValue(2);

  private char[] pol4RetRhabCombMtLmtCd = Field.fillLowValue(2);

  private char[] pol4RetHabCombPtLmtCd = Field.fillLowValue(2);

  private char[] pol4RetHabCombOtLmtCd = Field.fillLowValue(2);

  private char[] pol4RetHabCombStLmtCd = Field.fillLowValue(2);

  private char[] pol4RetHabCombSmLmtCd = Field.fillLowValue(2);

  private char[] pol4RetHabCombCiLmtCd = Field.fillLowValue(2);

  private char[] pol4RetHabCombCtLmtCd = Field.fillLowValue(2);

  private char[] pol4RetHabCombMtLmtCd = Field.fillLowValue(2);

  private char[] pol4RetUgiInd = Field.fillLowValue(1);

  private char[] pol4RetLgiInd = Field.fillLowValue(1);

  private char[] pol4RetExdInd = Field.fillLowValue(1);

  private char[] pol4MmlCovSetNbr = Field.fillLowValue(3);

  /** Constructor for Pol4RetArea4 */
  public Pol4RetArea4() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for Pol4RetArea4. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public Pol4RetArea4(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of pol4CovTypCd
   *
   * @return pol4CovTypCd
   */
  public char[] getPol4CovTypCd() throws CFException {
    if (isPol4CovTypCdModified()) {
      pol4CovTypCd = refreshPol4CovTypCd();
    }
    return pol4CovTypCd;
  }

  /**
   * set variable pol4CovTypCd Corresponding COBOL Variable is POL4-COV-TYP-CD
   *
   * @param value
   */
  public void setPol4CovTypCd(char[] value) {
    pol4CovTypCd = checkPol4CovTypCdConstraints(value);
    serializePol4CovTypCd(pol4CovTypCd);
  }

  /**
   * Update Pol4CovTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4CovTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol4CovTypCd, pol4CovTypCd.length);
  }

  public void setPol4CovTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4CovTypCd, pol4CovTypCd.length);
  }

  /**
   * Update Pol4CovTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4CovTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4CovTypCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4CovTypCd with another Field
   *
   * @param value
   */
  public void setPol4CovTypCd(Field source) {
    replace(source, 0, source.length(), beginPol4CovTypCd, POL_4_COV_TYP_CD_LEN);
  }

  /**
   * Update Pol4CovTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4CovTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4CovTypCd, POL_4_COV_TYP_CD_LEN);
  }

  /**
   * Update Pol4CovTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4CovTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4CovTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4StdPolNbr
   *
   * @return pol4StdPolNbr
   */
  public char[] getPol4StdPolNbr() throws CFException {
    if (isPol4StdPolNbrModified()) {
      pol4StdPolNbr = refreshPol4StdPolNbr();
    }
    return pol4StdPolNbr;
  }

  /**
   * set variable pol4StdPolNbr Corresponding COBOL Variable is POL4-STD-POL-NBR
   *
   * @param value
   */
  public void setPol4StdPolNbr(char[] value) {
    pol4StdPolNbr = checkPol4StdPolNbrConstraints(value);
    serializePol4StdPolNbr(pol4StdPolNbr);
  }

  /**
   * Update Pol4StdPolNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4StdPolNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol4StdPolNbr, pol4StdPolNbr.length);
  }

  public void setPol4StdPolNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4StdPolNbr, pol4StdPolNbr.length);
  }

  /**
   * Update Pol4StdPolNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4StdPolNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4StdPolNbr + targetIndex, targetLen);
  }

  /**
   * Update Pol4StdPolNbr with another Field
   *
   * @param value
   */
  public void setPol4StdPolNbr(Field source) {
    replace(source, 0, source.length(), beginPol4StdPolNbr, POL_4_STD_POL_NBR_LEN);
  }

  /**
   * Update Pol4StdPolNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4StdPolNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4StdPolNbr, POL_4_STD_POL_NBR_LEN);
  }

  /**
   * Update Pol4StdPolNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4StdPolNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4StdPolNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4StdPlnNbr
   *
   * @return pol4StdPlnNbr
   */
  public int getPol4StdPlnNbr() throws CFException {
    if (isPol4StdPlnNbrModified()) {
      pol4StdPlnNbr = refreshPol4StdPlnNbr();
    }
    return pol4StdPlnNbr;
  }

  /**
   * Update Pol4StdPlnNbr with the passed value Corresponding COBOL Variable is POL4-STD-PLN-NBR
   *
   * @param number
   */
  public void setPol4StdPlnNbr(int number) {
    // Truncate if the number is beyond +/- Max range
    pol4StdPlnNbr = checkPol4StdPlnNbrMaxLimit(number);
    serializePol4StdPlnNbr(pol4StdPlnNbr);
  }

  public void setPol4StdPlnNbr(long number) {
    number = checkPol4StdPlnNbrMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPol4StdPlnNbr((int) number);
  }

  /**
   * Update Pol4StdPlnNbr with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4StdPlnNbr(char[] value) throws CFException {
    pol4StdPlnNbr = serializePol4StdPlnNbr(value);
  }
  /**
   * Update Pol4StdPlnNbr with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4StdPlnNbrString(char[] value) throws CFException {
    setPol4StdPlnNbr(value);
  }
  /**
   * Returns the value of pol4StdClssNbr
   *
   * @return pol4StdClssNbr
   */
  public int getPol4StdClssNbr() throws CFException {
    if (isPol4StdClssNbrModified()) {
      pol4StdClssNbr = refreshPol4StdClssNbr();
    }
    return pol4StdClssNbr;
  }

  /**
   * Update Pol4StdClssNbr with the passed value Corresponding COBOL Variable is POL4-STD-CLSS-NBR
   *
   * @param number
   */
  public void setPol4StdClssNbr(int number) {
    // Truncate if the number is beyond +/- Max range
    pol4StdClssNbr = checkPol4StdClssNbrMaxLimit(number);
    serializePol4StdClssNbr(pol4StdClssNbr);
  }

  public void setPol4StdClssNbr(long number) {
    number = checkPol4StdClssNbrMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPol4StdClssNbr((int) number);
  }

  /**
   * Update Pol4StdClssNbr with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4StdClssNbr(char[] value) throws CFException {
    pol4StdClssNbr = serializePol4StdClssNbr(value);
  }
  /**
   * Update Pol4StdClssNbr with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4StdClssNbrString(char[] value) throws CFException {
    setPol4StdClssNbr(value);
  }
  /**
   * Returns the value of pol4CopayVarId
   *
   * @return pol4CopayVarId
   */
  public int getPol4CopayVarId() throws CFException {
    if (isPol4CopayVarIdModified()) {
      pol4CopayVarId = refreshPol4CopayVarId();
    }
    return pol4CopayVarId;
  }

  /**
   * Returns the String value of pol4CopayVarId
   *
   * @return pol4CopayVarId
   */
  public char[] getPol4CopayVarIdActualString() {
    String value = String.valueOf(pol4CopayVarId).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update Pol4CopayVarId with the passed value Corresponding COBOL Variable is POL4-COPAY-VAR-ID
   *
   * @param number
   */
  public void setPol4CopayVarId(int number) {
    // Truncate if the number is beyond +/- Max range
    pol4CopayVarId = checkPol4CopayVarIdMaxLimit(number);
    serializePol4CopayVarId(pol4CopayVarId);
  }

  public void setPol4CopayVarId(long number) {
    number = checkPol4CopayVarIdMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPol4CopayVarId((int) number);
  }

  /**
   * Update Pol4CopayVarId with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4CopayVarId(char[] value) throws CFException {
    pol4CopayVarId = serializePol4CopayVarId(value);
  }
  /**
   * Update Pol4CopayVarId with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4CopayVarIdString(char[] value) throws CFException {
    setPol4CopayVarId(value);
  }
  /**
   * Returns the value of pol4CombPrscDedPriCd
   *
   * @return pol4CombPrscDedPriCd
   */
  public char[] getPol4CombPrscDedPriCd() throws CFException {
    if (isPol4CombPrscDedPriCdModified()) {
      pol4CombPrscDedPriCd = refreshPol4CombPrscDedPriCd();
    }
    return pol4CombPrscDedPriCd;
  }

  /**
   * set variable pol4CombPrscDedPriCd Corresponding COBOL Variable is POL4-COMB-PRSC-DED-PRI-CD
   *
   * @param value
   */
  public void setPol4CombPrscDedPriCd(char[] value) {
    pol4CombPrscDedPriCd = checkPol4CombPrscDedPriCdConstraints(value);
    serializePol4CombPrscDedPriCd(pol4CombPrscDedPriCd);
  }

  /**
   * Update Pol4CombPrscDedPriCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4CombPrscDedPriCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol4CombPrscDedPriCd, pol4CombPrscDedPriCd.length);
  }

  public void setPol4CombPrscDedPriCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4CombPrscDedPriCd, pol4CombPrscDedPriCd.length);
  }

  /**
   * Update Pol4CombPrscDedPriCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4CombPrscDedPriCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4CombPrscDedPriCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4CombPrscDedPriCd with another Field
   *
   * @param value
   */
  public void setPol4CombPrscDedPriCd(Field source) {
    replace(source, 0, source.length(), beginPol4CombPrscDedPriCd, POL_4_COMB_PRSC_DED_PRI_CD_LEN);
  }

  /**
   * Update Pol4CombPrscDedPriCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4CombPrscDedPriCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4CombPrscDedPriCd, POL_4_COMB_PRSC_DED_PRI_CD_LEN);
  }

  /**
   * Update Pol4CombPrscDedPriCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4CombPrscDedPriCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4CombPrscDedPriCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4CombPrscDedQualCd
   *
   * @return pol4CombPrscDedQualCd
   */
  public char[] getPol4CombPrscDedQualCd() throws CFException {
    if (isPol4CombPrscDedQualCdModified()) {
      pol4CombPrscDedQualCd = refreshPol4CombPrscDedQualCd();
    }
    return pol4CombPrscDedQualCd;
  }

  /**
   * set variable pol4CombPrscDedQualCd Corresponding COBOL Variable is POL4-COMB-PRSC-DED-QUAL-CD
   *
   * @param value
   */
  public void setPol4CombPrscDedQualCd(char[] value) {
    pol4CombPrscDedQualCd = checkPol4CombPrscDedQualCdConstraints(value);
    serializePol4CombPrscDedQualCd(pol4CombPrscDedQualCd);
  }

  /**
   * Update Pol4CombPrscDedQualCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4CombPrscDedQualCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol4CombPrscDedQualCd,
        pol4CombPrscDedQualCd.length);
  }

  public void setPol4CombPrscDedQualCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4CombPrscDedQualCd, pol4CombPrscDedQualCd.length);
  }

  /**
   * Update Pol4CombPrscDedQualCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4CombPrscDedQualCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4CombPrscDedQualCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4CombPrscDedQualCd with another Field
   *
   * @param value
   */
  public void setPol4CombPrscDedQualCd(Field source) {
    replace(
        source, 0, source.length(), beginPol4CombPrscDedQualCd, POL_4_COMB_PRSC_DED_QUAL_CD_LEN);
  }

  /**
   * Update Pol4CombPrscDedQualCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4CombPrscDedQualCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol4CombPrscDedQualCd,
        POL_4_COMB_PRSC_DED_QUAL_CD_LEN);
  }

  /**
   * Update Pol4CombPrscDedQualCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4CombPrscDedQualCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4CombPrscDedQualCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4CombPrscDedSecCd
   *
   * @return pol4CombPrscDedSecCd
   */
  public char[] getPol4CombPrscDedSecCd() throws CFException {
    if (isPol4CombPrscDedSecCdModified()) {
      pol4CombPrscDedSecCd = refreshPol4CombPrscDedSecCd();
    }
    return pol4CombPrscDedSecCd;
  }

  /**
   * set variable pol4CombPrscDedSecCd Corresponding COBOL Variable is POL4-COMB-PRSC-DED-SEC-CD
   *
   * @param value
   */
  public void setPol4CombPrscDedSecCd(char[] value) {
    pol4CombPrscDedSecCd = checkPol4CombPrscDedSecCdConstraints(value);
    serializePol4CombPrscDedSecCd(pol4CombPrscDedSecCd);
  }

  /**
   * Update Pol4CombPrscDedSecCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4CombPrscDedSecCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol4CombPrscDedSecCd, pol4CombPrscDedSecCd.length);
  }

  public void setPol4CombPrscDedSecCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4CombPrscDedSecCd, pol4CombPrscDedSecCd.length);
  }

  /**
   * Update Pol4CombPrscDedSecCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4CombPrscDedSecCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4CombPrscDedSecCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4CombPrscDedSecCd with another Field
   *
   * @param value
   */
  public void setPol4CombPrscDedSecCd(Field source) {
    replace(source, 0, source.length(), beginPol4CombPrscDedSecCd, POL_4_COMB_PRSC_DED_SEC_CD_LEN);
  }

  /**
   * Update Pol4CombPrscDedSecCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4CombPrscDedSecCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4CombPrscDedSecCd, POL_4_COMB_PRSC_DED_SEC_CD_LEN);
  }

  /**
   * Update Pol4CombPrscDedSecCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4CombPrscDedSecCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4CombPrscDedSecCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4CombPrscDedTirCd
   *
   * @return pol4CombPrscDedTirCd
   */
  public char[] getPol4CombPrscDedTirCd() throws CFException {
    if (isPol4CombPrscDedTirCdModified()) {
      pol4CombPrscDedTirCd = refreshPol4CombPrscDedTirCd();
    }
    return pol4CombPrscDedTirCd;
  }

  /**
   * set variable pol4CombPrscDedTirCd Corresponding COBOL Variable is POL4-COMB-PRSC-DED-TIR-CD
   *
   * @param value
   */
  public void setPol4CombPrscDedTirCd(char[] value) {
    pol4CombPrscDedTirCd = checkPol4CombPrscDedTirCdConstraints(value);
    serializePol4CombPrscDedTirCd(pol4CombPrscDedTirCd);
  }

  /**
   * Update Pol4CombPrscDedTirCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4CombPrscDedTirCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol4CombPrscDedTirCd, pol4CombPrscDedTirCd.length);
  }

  public void setPol4CombPrscDedTirCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4CombPrscDedTirCd, pol4CombPrscDedTirCd.length);
  }

  /**
   * Update Pol4CombPrscDedTirCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4CombPrscDedTirCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4CombPrscDedTirCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4CombPrscDedTirCd with another Field
   *
   * @param value
   */
  public void setPol4CombPrscDedTirCd(Field source) {
    replace(source, 0, source.length(), beginPol4CombPrscDedTirCd, POL_4_COMB_PRSC_DED_TIR_CD_LEN);
  }

  /**
   * Update Pol4CombPrscDedTirCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4CombPrscDedTirCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4CombPrscDedTirCd, POL_4_COMB_PRSC_DED_TIR_CD_LEN);
  }

  /**
   * Update Pol4CombPrscDedTirCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4CombPrscDedTirCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4CombPrscDedTirCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4ContrStCd
   *
   * @return pol4ContrStCd
   */
  public char[] getPol4ContrStCd() throws CFException {
    if (isPol4ContrStCdModified()) {
      pol4ContrStCd = refreshPol4ContrStCd();
    }
    return pol4ContrStCd;
  }

  /**
   * set variable pol4ContrStCd Corresponding COBOL Variable is POL4-CONTR-ST-CD
   *
   * @param value
   */
  public void setPol4ContrStCd(char[] value) {
    pol4ContrStCd = checkPol4ContrStCdConstraints(value);
    serializePol4ContrStCd(pol4ContrStCd);
  }

  /**
   * Update Pol4ContrStCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4ContrStCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol4ContrStCd, pol4ContrStCd.length);
  }

  public void setPol4ContrStCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4ContrStCd, pol4ContrStCd.length);
  }

  /**
   * Update Pol4ContrStCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4ContrStCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4ContrStCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4ContrStCd with another Field
   *
   * @param value
   */
  public void setPol4ContrStCd(Field source) {
    replace(source, 0, source.length(), beginPol4ContrStCd, POL_4_CONTR_ST_CD_LEN);
  }

  /**
   * Update Pol4ContrStCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4ContrStCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4ContrStCd, POL_4_CONTR_ST_CD_LEN);
  }

  /**
   * Update Pol4ContrStCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4ContrStCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4ContrStCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4CopayAmt
   *
   * @return pol4CopayAmt
   */
  public BigDecimal getPol4CopayAmt() throws CFException {
    if (isPol4CopayAmtModified()) {
      pol4CopayAmt = refreshPol4CopayAmt();
    }
    return pol4CopayAmt;
  }

  /**
   * Returns the String value of pol4CopayAmt
   *
   * @return pol4CopayAmt
   */
  public char[] getPol4CopayAmtActualString() {
    String value = String.valueOf(pol4CopayAmt).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update Pol4CopayAmt with the passed number Corresponding COBOL Variable is POL4-COPAY-AMT
   *
   * @param number
   */
  public void setPol4CopayAmt(BigDecimal number) {
    pol4CopayAmt = checkPol4CopayAmtMaxLimit(number);
    serializePol4CopayAmt(pol4CopayAmt);
  }
  /**
   * Update Pol4CopayAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4CopayAmt(char[] value) throws CFException {
    pol4CopayAmt = serializePol4CopayAmt(value);
  }
  /**
   * Returns the value of pol4FamNewCoinsAmt
   *
   * @return pol4FamNewCoinsAmt
   */
  public long getPol4FamNewCoinsAmt() throws CFException {
    if (isPol4FamNewCoinsAmtModified()) {
      pol4FamNewCoinsAmt = refreshPol4FamNewCoinsAmt();
    }
    return pol4FamNewCoinsAmt;
  }

  /**
   * Update Pol4FamNewCoinsAmt with the passed value Corresponding COBOL Variable is
   * POL4-FAM-NEW-COINS-AMT
   *
   * @param number
   */
  public void setPol4FamNewCoinsAmt(long number) {
    // Truncate if the number is beyond +/- Max range
    pol4FamNewCoinsAmt = checkPol4FamNewCoinsAmtMaxLimit(number);
    serializePol4FamNewCoinsAmt(pol4FamNewCoinsAmt);
  }

  /**
   * Update Pol4FamNewCoinsAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4FamNewCoinsAmt(char[] value) throws CFException {
    pol4FamNewCoinsAmt = serializePol4FamNewCoinsAmt(value);
  }
  /**
   * Update Pol4FamNewCoinsAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4FamNewCoinsAmtString(char[] value) throws CFException {
    setPol4FamNewCoinsAmt(value);
  }
  /**
   * Returns the value of pol4FamTxtSwapCd
   *
   * @return pol4FamTxtSwapCd
   */
  public char[] getPol4FamTxtSwapCd() throws CFException {
    if (isPol4FamTxtSwapCdModified()) {
      pol4FamTxtSwapCd = refreshPol4FamTxtSwapCd();
    }
    return pol4FamTxtSwapCd;
  }

  /**
   * set variable pol4FamTxtSwapCd Corresponding COBOL Variable is POL4-FAM-TXT-SWAP-CD
   *
   * @param value
   */
  public void setPol4FamTxtSwapCd(char[] value) {
    pol4FamTxtSwapCd = checkPol4FamTxtSwapCdConstraints(value);
    serializePol4FamTxtSwapCd(pol4FamTxtSwapCd);
  }

  /**
   * Update Pol4FamTxtSwapCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4FamTxtSwapCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol4FamTxtSwapCd, pol4FamTxtSwapCd.length);
  }

  public void setPol4FamTxtSwapCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4FamTxtSwapCd, pol4FamTxtSwapCd.length);
  }

  /**
   * Update Pol4FamTxtSwapCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4FamTxtSwapCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4FamTxtSwapCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4FamTxtSwapCd with another Field
   *
   * @param value
   */
  public void setPol4FamTxtSwapCd(Field source) {
    replace(source, 0, source.length(), beginPol4FamTxtSwapCd, POL_4_FAM_TXT_SWAP_CD_LEN);
  }

  /**
   * Update Pol4FamTxtSwapCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4FamTxtSwapCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4FamTxtSwapCd, POL_4_FAM_TXT_SWAP_CD_LEN);
  }

  /**
   * Update Pol4FamTxtSwapCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4FamTxtSwapCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4FamTxtSwapCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4FamMbrCnt
   *
   * @return pol4FamMbrCnt
   */
  public short getPol4FamMbrCnt() throws CFException {
    if (isPol4FamMbrCntModified()) {
      pol4FamMbrCnt = refreshPol4FamMbrCnt();
    }
    return pol4FamMbrCnt;
  }

  /**
   * Update Pol4FamMbrCnt with the passed value Corresponding COBOL Variable is POL4-FAM-MBR-CNT
   *
   * @param number
   */
  public void setPol4FamMbrCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    pol4FamMbrCnt = checkPol4FamMbrCntMaxLimit(number);
    serializePol4FamMbrCnt(pol4FamMbrCnt);
  }

  public void setPol4FamMbrCnt(int number) {
    number =
        checkPol4FamMbrCntMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setPol4FamMbrCnt((short) number);
  }

  public void setPol4FamMbrCnt(long number) {
    number =
        checkPol4FamMbrCntMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setPol4FamMbrCnt((short) number);
  }

  /**
   * Returns the value of pol4NewCoinsAmt
   *
   * @return pol4NewCoinsAmt
   */
  public long getPol4NewCoinsAmt() throws CFException {
    if (isPol4NewCoinsAmtModified()) {
      pol4NewCoinsAmt = refreshPol4NewCoinsAmt();
    }
    return pol4NewCoinsAmt;
  }

  /**
   * Update Pol4NewCoinsAmt with the passed value Corresponding COBOL Variable is POL4-NEW-COINS-AMT
   *
   * @param number
   */
  public void setPol4NewCoinsAmt(long number) {
    // Truncate if the number is beyond +/- Max range
    pol4NewCoinsAmt = checkPol4NewCoinsAmtMaxLimit(number);
    serializePol4NewCoinsAmt(pol4NewCoinsAmt);
  }

  /**
   * Update Pol4NewCoinsAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4NewCoinsAmt(char[] value) throws CFException {
    pol4NewCoinsAmt = serializePol4NewCoinsAmt(value);
  }
  /**
   * Update Pol4NewCoinsAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4NewCoinsAmtString(char[] value) throws CFException {
    setPol4NewCoinsAmt(value);
  }
  /**
   * Returns the value of pol4NewCoinsCombPrscCd
   *
   * @return pol4NewCoinsCombPrscCd
   */
  public char[] getPol4NewCoinsCombPrscCd() throws CFException {
    if (isPol4NewCoinsCombPrscCdModified()) {
      pol4NewCoinsCombPrscCd = refreshPol4NewCoinsCombPrscCd();
    }
    return pol4NewCoinsCombPrscCd;
  }

  /**
   * set variable pol4NewCoinsCombPrscCd Corresponding COBOL Variable is POL4-NEW-COINS-COMB-PRSC-CD
   *
   * @param value
   */
  public void setPol4NewCoinsCombPrscCd(char[] value) {
    pol4NewCoinsCombPrscCd = checkPol4NewCoinsCombPrscCdConstraints(value);
    serializePol4NewCoinsCombPrscCd(pol4NewCoinsCombPrscCd);
  }

  /**
   * Update Pol4NewCoinsCombPrscCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4NewCoinsCombPrscCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol4NewCoinsCombPrscCd,
        pol4NewCoinsCombPrscCd.length);
  }

  public void setPol4NewCoinsCombPrscCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4NewCoinsCombPrscCd, pol4NewCoinsCombPrscCd.length);
  }

  /**
   * Update Pol4NewCoinsCombPrscCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4NewCoinsCombPrscCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4NewCoinsCombPrscCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4NewCoinsCombPrscCd with another Field
   *
   * @param value
   */
  public void setPol4NewCoinsCombPrscCd(Field source) {
    replace(
        source, 0, source.length(), beginPol4NewCoinsCombPrscCd, POL_4_NEW_COINS_COMB_PRSC_CD_LEN);
  }

  /**
   * Update Pol4NewCoinsCombPrscCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4NewCoinsCombPrscCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol4NewCoinsCombPrscCd,
        POL_4_NEW_COINS_COMB_PRSC_CD_LEN);
  }

  /**
   * Update Pol4NewCoinsCombPrscCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4NewCoinsCombPrscCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4NewCoinsCombPrscCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4NewCoinsPrdCd
   *
   * @return pol4NewCoinsPrdCd
   */
  public short getPol4NewCoinsPrdCd() throws CFException {
    if (isPol4NewCoinsPrdCdModified()) {
      pol4NewCoinsPrdCd = refreshPol4NewCoinsPrdCd();
    }
    return pol4NewCoinsPrdCd;
  }

  /**
   * Returns the String value of pol4NewCoinsPrdCd
   *
   * @return pol4NewCoinsPrdCd
   */
  public char[] getPol4NewCoinsPrdCdActualString() {
    String value = String.valueOf(pol4NewCoinsPrdCd).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update Pol4NewCoinsPrdCd with the passed value Corresponding COBOL Variable is
   * POL4-NEW-COINS-PRD-CD
   *
   * @param number
   */
  public void setPol4NewCoinsPrdCd(short number) {
    // Truncate if the number is beyond +/- Max range
    pol4NewCoinsPrdCd = checkPol4NewCoinsPrdCdMaxLimit(number);
    serializePol4NewCoinsPrdCd(pol4NewCoinsPrdCd);
  }

  public void setPol4NewCoinsPrdCd(int number) {
    number =
        checkPol4NewCoinsPrdCdMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setPol4NewCoinsPrdCd((short) number);
  }

  public void setPol4NewCoinsPrdCd(long number) {
    number =
        checkPol4NewCoinsPrdCdMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setPol4NewCoinsPrdCd((short) number);
  }

  /**
   * Update Pol4NewCoinsPrdCd with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4NewCoinsPrdCd(char[] value) throws CFException {
    pol4NewCoinsPrdCd = serializePol4NewCoinsPrdCd(value);
  }
  /**
   * Update Pol4NewCoinsPrdCd with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4NewCoinsPrdCdString(char[] value) throws CFException {
    setPol4NewCoinsPrdCd(value);
  }
  /**
   * Returns the value of pol4NcinsSlryFamMultFct
   *
   * @return pol4NcinsSlryFamMultFct
   */
  public BigDecimal getPol4NcinsSlryFamMultFct() throws CFException {
    if (isPol4NcinsSlryFamMultFctModified()) {
      pol4NcinsSlryFamMultFct = refreshPol4NcinsSlryFamMultFct();
    }
    return pol4NcinsSlryFamMultFct;
  }

  /**
   * Returns the String value of pol4NcinsSlryFamMultFct
   *
   * @return pol4NcinsSlryFamMultFct
   */
  public char[] getPol4NcinsSlryFamMultFctActualString() {
    String value = String.valueOf(pol4NcinsSlryFamMultFct).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update Pol4NcinsSlryFamMultFct with the passed number Corresponding COBOL Variable is
   * POL4-NCINS-SLRY-FAM-MULT-FCT
   *
   * @param number
   */
  public void setPol4NcinsSlryFamMultFct(BigDecimal number) {
    pol4NcinsSlryFamMultFct = checkPol4NcinsSlryFamMultFctMaxLimit(number);
    serializePol4NcinsSlryFamMultFct(pol4NcinsSlryFamMultFct);
  }
  /**
   * Update Pol4NcinsSlryFamMultFct with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4NcinsSlryFamMultFct(char[] value) throws CFException {
    pol4NcinsSlryFamMultFct = serializePol4NcinsSlryFamMultFct(value);
  }
  /**
   * Returns the value of pol4NcinsSlryFamTypCd
   *
   * @return pol4NcinsSlryFamTypCd
   */
  public char[] getPol4NcinsSlryFamTypCd() throws CFException {
    if (isPol4NcinsSlryFamTypCdModified()) {
      pol4NcinsSlryFamTypCd = refreshPol4NcinsSlryFamTypCd();
    }
    return pol4NcinsSlryFamTypCd;
  }

  /**
   * set variable pol4NcinsSlryFamTypCd Corresponding COBOL Variable is POL4-NCINS-SLRY-FAM-TYP-CD
   *
   * @param value
   */
  public void setPol4NcinsSlryFamTypCd(char[] value) {
    pol4NcinsSlryFamTypCd = checkPol4NcinsSlryFamTypCdConstraints(value);
    serializePol4NcinsSlryFamTypCd(pol4NcinsSlryFamTypCd);
  }

  /**
   * Update Pol4NcinsSlryFamTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4NcinsSlryFamTypCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol4NcinsSlryFamTypCd,
        pol4NcinsSlryFamTypCd.length);
  }

  public void setPol4NcinsSlryFamTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4NcinsSlryFamTypCd, pol4NcinsSlryFamTypCd.length);
  }

  /**
   * Update Pol4NcinsSlryFamTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4NcinsSlryFamTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4NcinsSlryFamTypCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4NcinsSlryFamTypCd with another Field
   *
   * @param value
   */
  public void setPol4NcinsSlryFamTypCd(Field source) {
    replace(
        source, 0, source.length(), beginPol4NcinsSlryFamTypCd, POL_4_NCINS_SLRY_FAM_TYP_CD_LEN);
  }

  /**
   * Update Pol4NcinsSlryFamTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4NcinsSlryFamTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol4NcinsSlryFamTypCd,
        POL_4_NCINS_SLRY_FAM_TYP_CD_LEN);
  }

  /**
   * Update Pol4NcinsSlryFamTypCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4NcinsSlryFamTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4NcinsSlryFamTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4NcinsSlryIndvTypCd
   *
   * @return pol4NcinsSlryIndvTypCd
   */
  public char[] getPol4NcinsSlryIndvTypCd() throws CFException {
    if (isPol4NcinsSlryIndvTypCdModified()) {
      pol4NcinsSlryIndvTypCd = refreshPol4NcinsSlryIndvTypCd();
    }
    return pol4NcinsSlryIndvTypCd;
  }

  /**
   * set variable pol4NcinsSlryIndvTypCd Corresponding COBOL Variable is POL4-NCINS-SLRY-INDV-TYP-CD
   *
   * @param value
   */
  public void setPol4NcinsSlryIndvTypCd(char[] value) {
    pol4NcinsSlryIndvTypCd = checkPol4NcinsSlryIndvTypCdConstraints(value);
    serializePol4NcinsSlryIndvTypCd(pol4NcinsSlryIndvTypCd);
  }

  /**
   * Update Pol4NcinsSlryIndvTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4NcinsSlryIndvTypCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol4NcinsSlryIndvTypCd,
        pol4NcinsSlryIndvTypCd.length);
  }

  public void setPol4NcinsSlryIndvTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4NcinsSlryIndvTypCd, pol4NcinsSlryIndvTypCd.length);
  }

  /**
   * Update Pol4NcinsSlryIndvTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4NcinsSlryIndvTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4NcinsSlryIndvTypCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4NcinsSlryIndvTypCd with another Field
   *
   * @param value
   */
  public void setPol4NcinsSlryIndvTypCd(Field source) {
    replace(
        source, 0, source.length(), beginPol4NcinsSlryIndvTypCd, POL_4_NCINS_SLRY_INDV_TYP_CD_LEN);
  }

  /**
   * Update Pol4NcinsSlryIndvTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4NcinsSlryIndvTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol4NcinsSlryIndvTypCd,
        POL_4_NCINS_SLRY_INDV_TYP_CD_LEN);
  }

  /**
   * Update Pol4NcinsSlryIndvTypCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4NcinsSlryIndvTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4NcinsSlryIndvTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4NonEmbdDedCd
   *
   * @return pol4NonEmbdDedCd
   */
  public char[] getPol4NonEmbdDedCd() throws CFException {
    if (isPol4NonEmbdDedCdModified()) {
      pol4NonEmbdDedCd = refreshPol4NonEmbdDedCd();
    }
    return pol4NonEmbdDedCd;
  }

  /**
   * set variable pol4NonEmbdDedCd Corresponding COBOL Variable is POL4-NON-EMBD-DED-CD
   *
   * @param value
   */
  public void setPol4NonEmbdDedCd(char[] value) {
    pol4NonEmbdDedCd = checkPol4NonEmbdDedCdConstraints(value);
    serializePol4NonEmbdDedCd(pol4NonEmbdDedCd);
  }

  /**
   * Update Pol4NonEmbdDedCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4NonEmbdDedCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol4NonEmbdDedCd, pol4NonEmbdDedCd.length);
  }

  public void setPol4NonEmbdDedCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4NonEmbdDedCd, pol4NonEmbdDedCd.length);
  }

  /**
   * Update Pol4NonEmbdDedCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4NonEmbdDedCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4NonEmbdDedCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4NonEmbdDedCd with another Field
   *
   * @param value
   */
  public void setPol4NonEmbdDedCd(Field source) {
    replace(source, 0, source.length(), beginPol4NonEmbdDedCd, POL_4_NON_EMBD_DED_CD_LEN);
  }

  /**
   * Update Pol4NonEmbdDedCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4NonEmbdDedCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4NonEmbdDedCd, POL_4_NON_EMBD_DED_CD_LEN);
  }

  /**
   * Update Pol4NonEmbdDedCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4NonEmbdDedCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4NonEmbdDedCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4NtwkPcpCopayAmt
   *
   * @return pol4NtwkPcpCopayAmt
   */
  public BigDecimal getPol4NtwkPcpCopayAmt() throws CFException {
    if (isPol4NtwkPcpCopayAmtModified()) {
      pol4NtwkPcpCopayAmt = refreshPol4NtwkPcpCopayAmt();
    }
    return pol4NtwkPcpCopayAmt;
  }

  /**
   * Returns the String value of pol4NtwkPcpCopayAmt
   *
   * @return pol4NtwkPcpCopayAmt
   */
  public char[] getPol4NtwkPcpCopayAmtActualString() {
    String value = String.valueOf(pol4NtwkPcpCopayAmt).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update Pol4NtwkPcpCopayAmt with the passed number Corresponding COBOL Variable is
   * POL4-NTWK-PCP-COPAY-AMT
   *
   * @param number
   */
  public void setPol4NtwkPcpCopayAmt(BigDecimal number) {
    pol4NtwkPcpCopayAmt = checkPol4NtwkPcpCopayAmtMaxLimit(number);
    serializePol4NtwkPcpCopayAmt(pol4NtwkPcpCopayAmt);
  }
  /**
   * Update Pol4NtwkPcpCopayAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4NtwkPcpCopayAmt(char[] value) throws CFException {
    pol4NtwkPcpCopayAmt = serializePol4NtwkPcpCopayAmt(value);
  }
  /**
   * Returns the value of pol4ObligId
   *
   * @return pol4ObligId
   */
  public char[] getPol4ObligId() throws CFException {
    if (isPol4ObligIdModified()) {
      pol4ObligId = refreshPol4ObligId();
    }
    return pol4ObligId;
  }

  /**
   * set variable pol4ObligId Corresponding COBOL Variable is POL4-OBLIG-ID
   *
   * @param value
   */
  public void setPol4ObligId(char[] value) {
    pol4ObligId = checkPol4ObligIdConstraints(value);
    serializePol4ObligId(pol4ObligId);
  }

  /**
   * Update Pol4ObligId with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4ObligId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol4ObligId, pol4ObligId.length);
  }

  public void setPol4ObligId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4ObligId, pol4ObligId.length);
  }

  /**
   * Update Pol4ObligId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4ObligId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4ObligId + targetIndex, targetLen);
  }

  /**
   * Update Pol4ObligId with another Field
   *
   * @param value
   */
  public void setPol4ObligId(Field source) {
    replace(source, 0, source.length(), beginPol4ObligId, POL_4_OBLIG_ID_LEN);
  }

  /**
   * Update Pol4ObligId with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4ObligId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4ObligId, POL_4_OBLIG_ID_LEN);
  }

  /**
   * Update Pol4ObligId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4ObligId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4ObligId + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4OopCombFamAmt
   *
   * @return pol4OopCombFamAmt
   */
  public int getPol4OopCombFamAmt() throws CFException {
    if (isPol4OopCombFamAmtModified()) {
      pol4OopCombFamAmt = refreshPol4OopCombFamAmt();
    }
    return pol4OopCombFamAmt;
  }

  /**
   * Returns the String value of pol4OopCombFamAmt
   *
   * @return pol4OopCombFamAmt
   */
  public char[] getPol4OopCombFamAmtActualString() {
    String value = String.valueOf(pol4OopCombFamAmt).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update Pol4OopCombFamAmt with the passed value Corresponding COBOL Variable is
   * POL4-OOP-COMB-FAM-AMT
   *
   * @param number
   */
  public void setPol4OopCombFamAmt(int number) {
    // Truncate if the number is beyond +/- Max range
    pol4OopCombFamAmt = checkPol4OopCombFamAmtMaxLimit(number);
    serializePol4OopCombFamAmt(pol4OopCombFamAmt);
  }

  public void setPol4OopCombFamAmt(long number) {
    number = checkPol4OopCombFamAmtMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPol4OopCombFamAmt((int) number);
  }

  /**
   * Update Pol4OopCombFamAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4OopCombFamAmt(char[] value) throws CFException {
    pol4OopCombFamAmt = serializePol4OopCombFamAmt(value);
  }
  /**
   * Update Pol4OopCombFamAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4OopCombFamAmtString(char[] value) throws CFException {
    setPol4OopCombFamAmt(value);
  }
  /**
   * Returns the value of pol4OopCombIndvAmt
   *
   * @return pol4OopCombIndvAmt
   */
  public int getPol4OopCombIndvAmt() throws CFException {
    if (isPol4OopCombIndvAmtModified()) {
      pol4OopCombIndvAmt = refreshPol4OopCombIndvAmt();
    }
    return pol4OopCombIndvAmt;
  }

  /**
   * Returns the String value of pol4OopCombIndvAmt
   *
   * @return pol4OopCombIndvAmt
   */
  public char[] getPol4OopCombIndvAmtActualString() {
    String value = String.valueOf(pol4OopCombIndvAmt).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update Pol4OopCombIndvAmt with the passed value Corresponding COBOL Variable is
   * POL4-OOP-COMB-INDV-AMT
   *
   * @param number
   */
  public void setPol4OopCombIndvAmt(int number) {
    // Truncate if the number is beyond +/- Max range
    pol4OopCombIndvAmt = checkPol4OopCombIndvAmtMaxLimit(number);
    serializePol4OopCombIndvAmt(pol4OopCombIndvAmt);
  }

  public void setPol4OopCombIndvAmt(long number) {
    number = checkPol4OopCombIndvAmtMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPol4OopCombIndvAmt((int) number);
  }

  /**
   * Update Pol4OopCombIndvAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4OopCombIndvAmt(char[] value) throws CFException {
    pol4OopCombIndvAmt = serializePol4OopCombIndvAmt(value);
  }
  /**
   * Update Pol4OopCombIndvAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4OopCombIndvAmtString(char[] value) throws CFException {
    setPol4OopCombIndvAmt(value);
  }
  /**
   * Returns the value of pol4OopCombPrscCd
   *
   * @return pol4OopCombPrscCd
   */
  public char[] getPol4OopCombPrscCd() throws CFException {
    if (isPol4OopCombPrscCdModified()) {
      pol4OopCombPrscCd = refreshPol4OopCombPrscCd();
    }
    return pol4OopCombPrscCd;
  }

  /**
   * set variable pol4OopCombPrscCd Corresponding COBOL Variable is POL4-OOP-COMB-PRSC-CD
   *
   * @param value
   */
  public void setPol4OopCombPrscCd(char[] value) {
    pol4OopCombPrscCd = checkPol4OopCombPrscCdConstraints(value);
    serializePol4OopCombPrscCd(pol4OopCombPrscCd);
  }

  /**
   * Update Pol4OopCombPrscCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4OopCombPrscCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol4OopCombPrscCd, pol4OopCombPrscCd.length);
  }

  public void setPol4OopCombPrscCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4OopCombPrscCd, pol4OopCombPrscCd.length);
  }

  /**
   * Update Pol4OopCombPrscCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4OopCombPrscCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4OopCombPrscCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4OopCombPrscCd with another Field
   *
   * @param value
   */
  public void setPol4OopCombPrscCd(Field source) {
    replace(source, 0, source.length(), beginPol4OopCombPrscCd, POL_4_OOP_COMB_PRSC_CD_LEN);
  }

  /**
   * Update Pol4OopCombPrscCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4OopCombPrscCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4OopCombPrscCd, POL_4_OOP_COMB_PRSC_CD_LEN);
  }

  /**
   * Update Pol4OopCombPrscCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4OopCombPrscCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4OopCombPrscCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4PcpCopayCd
   *
   * @return pol4PcpCopayCd
   */
  public char[] getPol4PcpCopayCd() throws CFException {
    if (isPol4PcpCopayCdModified()) {
      pol4PcpCopayCd = refreshPol4PcpCopayCd();
    }
    return pol4PcpCopayCd;
  }

  /**
   * set variable pol4PcpCopayCd Corresponding COBOL Variable is POL4-PCP-COPAY-CD
   *
   * @param value
   */
  public void setPol4PcpCopayCd(char[] value) {
    pol4PcpCopayCd = checkPol4PcpCopayCdConstraints(value);
    serializePol4PcpCopayCd(pol4PcpCopayCd);
  }

  /**
   * Update Pol4PcpCopayCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4PcpCopayCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol4PcpCopayCd, pol4PcpCopayCd.length);
  }

  public void setPol4PcpCopayCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4PcpCopayCd, pol4PcpCopayCd.length);
  }

  /**
   * Update Pol4PcpCopayCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4PcpCopayCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4PcpCopayCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4PcpCopayCd with another Field
   *
   * @param value
   */
  public void setPol4PcpCopayCd(Field source) {
    replace(source, 0, source.length(), beginPol4PcpCopayCd, POL_4_PCP_COPAY_CD_LEN);
  }

  /**
   * Update Pol4PcpCopayCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4PcpCopayCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4PcpCopayCd, POL_4_PCP_COPAY_CD_LEN);
  }

  /**
   * Update Pol4PcpCopayCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4PcpCopayCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4PcpCopayCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4PcpSpecCoinsInd
   *
   * @return pol4PcpSpecCoinsInd
   */
  public char[] getPol4PcpSpecCoinsInd() throws CFException {
    if (isPol4PcpSpecCoinsIndModified()) {
      pol4PcpSpecCoinsInd = refreshPol4PcpSpecCoinsInd();
    }
    return pol4PcpSpecCoinsInd;
  }

  /**
   * set variable pol4PcpSpecCoinsInd Corresponding COBOL Variable is POL4-PCP-SPEC-COINS-IND
   *
   * @param value
   */
  public void setPol4PcpSpecCoinsInd(char[] value) {
    pol4PcpSpecCoinsInd = checkPol4PcpSpecCoinsIndConstraints(value);
    serializePol4PcpSpecCoinsInd(pol4PcpSpecCoinsInd);
  }

  /**
   * Update Pol4PcpSpecCoinsInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4PcpSpecCoinsInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol4PcpSpecCoinsInd, pol4PcpSpecCoinsInd.length);
  }

  public void setPol4PcpSpecCoinsInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4PcpSpecCoinsInd, pol4PcpSpecCoinsInd.length);
  }

  /**
   * Update Pol4PcpSpecCoinsInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4PcpSpecCoinsInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4PcpSpecCoinsInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4PcpSpecCoinsInd with another Field
   *
   * @param value
   */
  public void setPol4PcpSpecCoinsInd(Field source) {
    replace(source, 0, source.length(), beginPol4PcpSpecCoinsInd, POL_4_PCP_SPEC_COINS_IND_LEN);
  }

  /**
   * Update Pol4PcpSpecCoinsInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4PcpSpecCoinsInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4PcpSpecCoinsInd, POL_4_PCP_SPEC_COINS_IND_LEN);
  }

  /**
   * Update Pol4PcpSpecCoinsInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4PcpSpecCoinsInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4PcpSpecCoinsInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RcprctyTblId
   *
   * @return pol4RcprctyTblId
   */
  public char[] getPol4RcprctyTblId() throws CFException {
    if (isPol4RcprctyTblIdModified()) {
      pol4RcprctyTblId = refreshPol4RcprctyTblId();
    }
    return pol4RcprctyTblId;
  }

  /**
   * set variable pol4RcprctyTblId Corresponding COBOL Variable is POL4-RCPRCTY-TBL-ID
   *
   * @param value
   */
  public void setPol4RcprctyTblId(char[] value) {
    pol4RcprctyTblId = checkPol4RcprctyTblIdConstraints(value);
    serializePol4RcprctyTblId(pol4RcprctyTblId);
  }

  /**
   * Update Pol4RcprctyTblId with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RcprctyTblId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol4RcprctyTblId, pol4RcprctyTblId.length);
  }

  public void setPol4RcprctyTblId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RcprctyTblId, pol4RcprctyTblId.length);
  }

  /**
   * Update Pol4RcprctyTblId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RcprctyTblId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RcprctyTblId + targetIndex, targetLen);
  }

  /**
   * Update Pol4RcprctyTblId with another Field
   *
   * @param value
   */
  public void setPol4RcprctyTblId(Field source) {
    replace(source, 0, source.length(), beginPol4RcprctyTblId, POL_4_RCPRCTY_TBL_ID_LEN);
  }

  /**
   * Update Pol4RcprctyTblId with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RcprctyTblId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RcprctyTblId, POL_4_RCPRCTY_TBL_ID_LEN);
  }

  /**
   * Update Pol4RcprctyTblId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RcprctyTblId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RcprctyTblId + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4ShrArngCd
   *
   * @return pol4ShrArngCd
   */
  public char[] getPol4ShrArngCd() throws CFException {
    if (isPol4ShrArngCdModified()) {
      pol4ShrArngCd = refreshPol4ShrArngCd();
    }
    return pol4ShrArngCd;
  }

  /**
   * set variable pol4ShrArngCd Corresponding COBOL Variable is POL4-SHR-ARNG-CD
   *
   * @param value
   */
  public void setPol4ShrArngCd(char[] value) {
    pol4ShrArngCd = checkPol4ShrArngCdConstraints(value);
    serializePol4ShrArngCd(pol4ShrArngCd);
  }

  /**
   * Update Pol4ShrArngCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4ShrArngCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol4ShrArngCd, pol4ShrArngCd.length);
  }

  public void setPol4ShrArngCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4ShrArngCd, pol4ShrArngCd.length);
  }

  /**
   * Update Pol4ShrArngCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4ShrArngCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4ShrArngCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4ShrArngCd with another Field
   *
   * @param value
   */
  public void setPol4ShrArngCd(Field source) {
    replace(source, 0, source.length(), beginPol4ShrArngCd, POL_4_SHR_ARNG_CD_LEN);
  }

  /**
   * Update Pol4ShrArngCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4ShrArngCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4ShrArngCd, POL_4_SHR_ARNG_CD_LEN);
  }

  /**
   * Update Pol4ShrArngCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4ShrArngCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4ShrArngCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4SlotTblId
   *
   * @return pol4SlotTblId
   */
  public char[] getPol4SlotTblId() throws CFException {
    if (isPol4SlotTblIdModified()) {
      pol4SlotTblId = refreshPol4SlotTblId();
    }
    return pol4SlotTblId;
  }

  /**
   * set variable pol4SlotTblId Corresponding COBOL Variable is POL4-SLOT-TBL-ID
   *
   * @param value
   */
  public void setPol4SlotTblId(char[] value) {
    pol4SlotTblId = checkPol4SlotTblIdConstraints(value);
    serializePol4SlotTblId(pol4SlotTblId);
  }

  /**
   * Update Pol4SlotTblId with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4SlotTblId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol4SlotTblId, pol4SlotTblId.length);
  }

  public void setPol4SlotTblId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4SlotTblId, pol4SlotTblId.length);
  }

  /**
   * Update Pol4SlotTblId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4SlotTblId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4SlotTblId + targetIndex, targetLen);
  }

  /**
   * Update Pol4SlotTblId with another Field
   *
   * @param value
   */
  public void setPol4SlotTblId(Field source) {
    replace(source, 0, source.length(), beginPol4SlotTblId, POL_4_SLOT_TBL_ID_LEN);
  }

  /**
   * Update Pol4SlotTblId with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4SlotTblId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4SlotTblId, POL_4_SLOT_TBL_ID_LEN);
  }

  /**
   * Update Pol4SlotTblId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4SlotTblId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4SlotTblId + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetSrvcCdNSetInd
   *
   * @return pol4RetSrvcCdNSetInd
   */
  public char[] getPol4RetSrvcCdNSetInd() throws CFException {
    if (isPol4RetSrvcCdNSetIndModified()) {
      pol4RetSrvcCdNSetInd = refreshPol4RetSrvcCdNSetInd();
    }
    return pol4RetSrvcCdNSetInd;
  }

  /**
   * set variable pol4RetSrvcCdNSetInd Corresponding COBOL Variable is POL4-RET-SRVC-CD-N-SET-IND
   *
   * @param value
   */
  public void setPol4RetSrvcCdNSetInd(char[] value) {
    pol4RetSrvcCdNSetInd = checkPol4RetSrvcCdNSetIndConstraints(value);
    serializePol4RetSrvcCdNSetInd(pol4RetSrvcCdNSetInd);
  }

  /**
   * Update Pol4RetSrvcCdNSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdNSetInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol4RetSrvcCdNSetInd, pol4RetSrvcCdNSetInd.length);
  }

  public void setPol4RetSrvcCdNSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdNSetInd, pol4RetSrvcCdNSetInd.length);
  }

  /**
   * Update Pol4RetSrvcCdNSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdNSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdNSetInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetSrvcCdNSetInd with another Field
   *
   * @param value
   */
  public void setPol4RetSrvcCdNSetInd(Field source) {
    replace(source, 0, source.length(), beginPol4RetSrvcCdNSetInd, POL_4_RET_SRVC_CD_NSET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdNSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdNSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4RetSrvcCdNSetInd, POL_4_RET_SRVC_CD_NSET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdNSetInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4RetSrvcCdNSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdNSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetSrvcCdPSetInd
   *
   * @return pol4RetSrvcCdPSetInd
   */
  public char[] getPol4RetSrvcCdPSetInd() throws CFException {
    if (isPol4RetSrvcCdPSetIndModified()) {
      pol4RetSrvcCdPSetInd = refreshPol4RetSrvcCdPSetInd();
    }
    return pol4RetSrvcCdPSetInd;
  }

  /**
   * set variable pol4RetSrvcCdPSetInd Corresponding COBOL Variable is POL4-RET-SRVC-CD-P-SET-IND
   *
   * @param value
   */
  public void setPol4RetSrvcCdPSetInd(char[] value) {
    pol4RetSrvcCdPSetInd = checkPol4RetSrvcCdPSetIndConstraints(value);
    serializePol4RetSrvcCdPSetInd(pol4RetSrvcCdPSetInd);
  }

  /**
   * Update Pol4RetSrvcCdPSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdPSetInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol4RetSrvcCdPSetInd, pol4RetSrvcCdPSetInd.length);
  }

  public void setPol4RetSrvcCdPSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdPSetInd, pol4RetSrvcCdPSetInd.length);
  }

  /**
   * Update Pol4RetSrvcCdPSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdPSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdPSetInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetSrvcCdPSetInd with another Field
   *
   * @param value
   */
  public void setPol4RetSrvcCdPSetInd(Field source) {
    replace(source, 0, source.length(), beginPol4RetSrvcCdPSetInd, POL_4_RET_SRVC_CD_PSET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdPSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdPSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4RetSrvcCdPSetInd, POL_4_RET_SRVC_CD_PSET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdPSetInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4RetSrvcCdPSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdPSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetSrvcCdTSetInd
   *
   * @return pol4RetSrvcCdTSetInd
   */
  public char[] getPol4RetSrvcCdTSetInd() throws CFException {
    if (isPol4RetSrvcCdTSetIndModified()) {
      pol4RetSrvcCdTSetInd = refreshPol4RetSrvcCdTSetInd();
    }
    return pol4RetSrvcCdTSetInd;
  }

  /**
   * set variable pol4RetSrvcCdTSetInd Corresponding COBOL Variable is POL4-RET-SRVC-CD-T-SET-IND
   *
   * @param value
   */
  public void setPol4RetSrvcCdTSetInd(char[] value) {
    pol4RetSrvcCdTSetInd = checkPol4RetSrvcCdTSetIndConstraints(value);
    serializePol4RetSrvcCdTSetInd(pol4RetSrvcCdTSetInd);
  }

  /**
   * Update Pol4RetSrvcCdTSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdTSetInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol4RetSrvcCdTSetInd, pol4RetSrvcCdTSetInd.length);
  }

  public void setPol4RetSrvcCdTSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdTSetInd, pol4RetSrvcCdTSetInd.length);
  }

  /**
   * Update Pol4RetSrvcCdTSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdTSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdTSetInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetSrvcCdTSetInd with another Field
   *
   * @param value
   */
  public void setPol4RetSrvcCdTSetInd(Field source) {
    replace(source, 0, source.length(), beginPol4RetSrvcCdTSetInd, POL_4_RET_SRVC_CD_TSET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdTSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdTSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4RetSrvcCdTSetInd, POL_4_RET_SRVC_CD_TSET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdTSetInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4RetSrvcCdTSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdTSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetSrvcCdASetInd
   *
   * @return pol4RetSrvcCdASetInd
   */
  public char[] getPol4RetSrvcCdASetInd() throws CFException {
    if (isPol4RetSrvcCdASetIndModified()) {
      pol4RetSrvcCdASetInd = refreshPol4RetSrvcCdASetInd();
    }
    return pol4RetSrvcCdASetInd;
  }

  /**
   * set variable pol4RetSrvcCdASetInd Corresponding COBOL Variable is POL4-RET-SRVC-CD-A-SET-IND
   *
   * @param value
   */
  public void setPol4RetSrvcCdASetInd(char[] value) {
    pol4RetSrvcCdASetInd = checkPol4RetSrvcCdASetIndConstraints(value);
    serializePol4RetSrvcCdASetInd(pol4RetSrvcCdASetInd);
  }

  /**
   * Update Pol4RetSrvcCdASetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdASetInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol4RetSrvcCdASetInd, pol4RetSrvcCdASetInd.length);
  }

  public void setPol4RetSrvcCdASetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdASetInd, pol4RetSrvcCdASetInd.length);
  }

  /**
   * Update Pol4RetSrvcCdASetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdASetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdASetInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetSrvcCdASetInd with another Field
   *
   * @param value
   */
  public void setPol4RetSrvcCdASetInd(Field source) {
    replace(source, 0, source.length(), beginPol4RetSrvcCdASetInd, POL_4_RET_SRVC_CD_ASET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdASetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdASetInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4RetSrvcCdASetInd, POL_4_RET_SRVC_CD_ASET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdASetInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4RetSrvcCdASetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdASetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetSrvcCdBSetInd
   *
   * @return pol4RetSrvcCdBSetInd
   */
  public char[] getPol4RetSrvcCdBSetInd() throws CFException {
    if (isPol4RetSrvcCdBSetIndModified()) {
      pol4RetSrvcCdBSetInd = refreshPol4RetSrvcCdBSetInd();
    }
    return pol4RetSrvcCdBSetInd;
  }

  /**
   * set variable pol4RetSrvcCdBSetInd Corresponding COBOL Variable is POL4-RET-SRVC-CD-B-SET-IND
   *
   * @param value
   */
  public void setPol4RetSrvcCdBSetInd(char[] value) {
    pol4RetSrvcCdBSetInd = checkPol4RetSrvcCdBSetIndConstraints(value);
    serializePol4RetSrvcCdBSetInd(pol4RetSrvcCdBSetInd);
  }

  /**
   * Update Pol4RetSrvcCdBSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdBSetInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol4RetSrvcCdBSetInd, pol4RetSrvcCdBSetInd.length);
  }

  public void setPol4RetSrvcCdBSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdBSetInd, pol4RetSrvcCdBSetInd.length);
  }

  /**
   * Update Pol4RetSrvcCdBSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdBSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdBSetInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetSrvcCdBSetInd with another Field
   *
   * @param value
   */
  public void setPol4RetSrvcCdBSetInd(Field source) {
    replace(source, 0, source.length(), beginPol4RetSrvcCdBSetInd, POL_4_RET_SRVC_CD_BSET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdBSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdBSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4RetSrvcCdBSetInd, POL_4_RET_SRVC_CD_BSET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdBSetInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4RetSrvcCdBSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdBSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetSrvcCdCSetInd
   *
   * @return pol4RetSrvcCdCSetInd
   */
  public char[] getPol4RetSrvcCdCSetInd() throws CFException {
    if (isPol4RetSrvcCdCSetIndModified()) {
      pol4RetSrvcCdCSetInd = refreshPol4RetSrvcCdCSetInd();
    }
    return pol4RetSrvcCdCSetInd;
  }

  /**
   * set variable pol4RetSrvcCdCSetInd Corresponding COBOL Variable is POL4-RET-SRVC-CD-C-SET-IND
   *
   * @param value
   */
  public void setPol4RetSrvcCdCSetInd(char[] value) {
    pol4RetSrvcCdCSetInd = checkPol4RetSrvcCdCSetIndConstraints(value);
    serializePol4RetSrvcCdCSetInd(pol4RetSrvcCdCSetInd);
  }

  /**
   * Update Pol4RetSrvcCdCSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdCSetInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol4RetSrvcCdCSetInd, pol4RetSrvcCdCSetInd.length);
  }

  public void setPol4RetSrvcCdCSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdCSetInd, pol4RetSrvcCdCSetInd.length);
  }

  /**
   * Update Pol4RetSrvcCdCSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdCSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdCSetInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetSrvcCdCSetInd with another Field
   *
   * @param value
   */
  public void setPol4RetSrvcCdCSetInd(Field source) {
    replace(source, 0, source.length(), beginPol4RetSrvcCdCSetInd, POL_4_RET_SRVC_CD_CSET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdCSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdCSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4RetSrvcCdCSetInd, POL_4_RET_SRVC_CD_CSET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdCSetInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4RetSrvcCdCSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdCSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetSrvcCdDSetInd
   *
   * @return pol4RetSrvcCdDSetInd
   */
  public char[] getPol4RetSrvcCdDSetInd() throws CFException {
    if (isPol4RetSrvcCdDSetIndModified()) {
      pol4RetSrvcCdDSetInd = refreshPol4RetSrvcCdDSetInd();
    }
    return pol4RetSrvcCdDSetInd;
  }

  /**
   * set variable pol4RetSrvcCdDSetInd Corresponding COBOL Variable is POL4-RET-SRVC-CD-D-SET-IND
   *
   * @param value
   */
  public void setPol4RetSrvcCdDSetInd(char[] value) {
    pol4RetSrvcCdDSetInd = checkPol4RetSrvcCdDSetIndConstraints(value);
    serializePol4RetSrvcCdDSetInd(pol4RetSrvcCdDSetInd);
  }

  /**
   * Update Pol4RetSrvcCdDSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdDSetInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol4RetSrvcCdDSetInd, pol4RetSrvcCdDSetInd.length);
  }

  public void setPol4RetSrvcCdDSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdDSetInd, pol4RetSrvcCdDSetInd.length);
  }

  /**
   * Update Pol4RetSrvcCdDSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdDSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdDSetInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetSrvcCdDSetInd with another Field
   *
   * @param value
   */
  public void setPol4RetSrvcCdDSetInd(Field source) {
    replace(source, 0, source.length(), beginPol4RetSrvcCdDSetInd, POL_4_RET_SRVC_CD_DSET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdDSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdDSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4RetSrvcCdDSetInd, POL_4_RET_SRVC_CD_DSET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdDSetInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4RetSrvcCdDSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdDSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetSrvcCdESetInd
   *
   * @return pol4RetSrvcCdESetInd
   */
  public char[] getPol4RetSrvcCdESetInd() throws CFException {
    if (isPol4RetSrvcCdESetIndModified()) {
      pol4RetSrvcCdESetInd = refreshPol4RetSrvcCdESetInd();
    }
    return pol4RetSrvcCdESetInd;
  }

  /**
   * set variable pol4RetSrvcCdESetInd Corresponding COBOL Variable is POL4-RET-SRVC-CD-E-SET-IND
   *
   * @param value
   */
  public void setPol4RetSrvcCdESetInd(char[] value) {
    pol4RetSrvcCdESetInd = checkPol4RetSrvcCdESetIndConstraints(value);
    serializePol4RetSrvcCdESetInd(pol4RetSrvcCdESetInd);
  }

  /**
   * Update Pol4RetSrvcCdESetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdESetInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol4RetSrvcCdESetInd, pol4RetSrvcCdESetInd.length);
  }

  public void setPol4RetSrvcCdESetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdESetInd, pol4RetSrvcCdESetInd.length);
  }

  /**
   * Update Pol4RetSrvcCdESetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdESetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdESetInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetSrvcCdESetInd with another Field
   *
   * @param value
   */
  public void setPol4RetSrvcCdESetInd(Field source) {
    replace(source, 0, source.length(), beginPol4RetSrvcCdESetInd, POL_4_RET_SRVC_CD_ESET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdESetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdESetInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4RetSrvcCdESetInd, POL_4_RET_SRVC_CD_ESET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdESetInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4RetSrvcCdESetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdESetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetSrvcCdFSetInd
   *
   * @return pol4RetSrvcCdFSetInd
   */
  public char[] getPol4RetSrvcCdFSetInd() throws CFException {
    if (isPol4RetSrvcCdFSetIndModified()) {
      pol4RetSrvcCdFSetInd = refreshPol4RetSrvcCdFSetInd();
    }
    return pol4RetSrvcCdFSetInd;
  }

  /**
   * set variable pol4RetSrvcCdFSetInd Corresponding COBOL Variable is POL4-RET-SRVC-CD-F-SET-IND
   *
   * @param value
   */
  public void setPol4RetSrvcCdFSetInd(char[] value) {
    pol4RetSrvcCdFSetInd = checkPol4RetSrvcCdFSetIndConstraints(value);
    serializePol4RetSrvcCdFSetInd(pol4RetSrvcCdFSetInd);
  }

  /**
   * Update Pol4RetSrvcCdFSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdFSetInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol4RetSrvcCdFSetInd, pol4RetSrvcCdFSetInd.length);
  }

  public void setPol4RetSrvcCdFSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdFSetInd, pol4RetSrvcCdFSetInd.length);
  }

  /**
   * Update Pol4RetSrvcCdFSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdFSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdFSetInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetSrvcCdFSetInd with another Field
   *
   * @param value
   */
  public void setPol4RetSrvcCdFSetInd(Field source) {
    replace(source, 0, source.length(), beginPol4RetSrvcCdFSetInd, POL_4_RET_SRVC_CD_FSET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdFSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdFSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4RetSrvcCdFSetInd, POL_4_RET_SRVC_CD_FSET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdFSetInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4RetSrvcCdFSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdFSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetSrvcCdGSetInd
   *
   * @return pol4RetSrvcCdGSetInd
   */
  public char[] getPol4RetSrvcCdGSetInd() throws CFException {
    if (isPol4RetSrvcCdGSetIndModified()) {
      pol4RetSrvcCdGSetInd = refreshPol4RetSrvcCdGSetInd();
    }
    return pol4RetSrvcCdGSetInd;
  }

  /**
   * set variable pol4RetSrvcCdGSetInd Corresponding COBOL Variable is POL4-RET-SRVC-CD-G-SET-IND
   *
   * @param value
   */
  public void setPol4RetSrvcCdGSetInd(char[] value) {
    pol4RetSrvcCdGSetInd = checkPol4RetSrvcCdGSetIndConstraints(value);
    serializePol4RetSrvcCdGSetInd(pol4RetSrvcCdGSetInd);
  }

  /**
   * Update Pol4RetSrvcCdGSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdGSetInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol4RetSrvcCdGSetInd, pol4RetSrvcCdGSetInd.length);
  }

  public void setPol4RetSrvcCdGSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdGSetInd, pol4RetSrvcCdGSetInd.length);
  }

  /**
   * Update Pol4RetSrvcCdGSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdGSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdGSetInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetSrvcCdGSetInd with another Field
   *
   * @param value
   */
  public void setPol4RetSrvcCdGSetInd(Field source) {
    replace(source, 0, source.length(), beginPol4RetSrvcCdGSetInd, POL_4_RET_SRVC_CD_GSET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdGSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdGSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4RetSrvcCdGSetInd, POL_4_RET_SRVC_CD_GSET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdGSetInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4RetSrvcCdGSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdGSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetSrvcCdHSetInd
   *
   * @return pol4RetSrvcCdHSetInd
   */
  public char[] getPol4RetSrvcCdHSetInd() throws CFException {
    if (isPol4RetSrvcCdHSetIndModified()) {
      pol4RetSrvcCdHSetInd = refreshPol4RetSrvcCdHSetInd();
    }
    return pol4RetSrvcCdHSetInd;
  }

  /**
   * set variable pol4RetSrvcCdHSetInd Corresponding COBOL Variable is POL4-RET-SRVC-CD-H-SET-IND
   *
   * @param value
   */
  public void setPol4RetSrvcCdHSetInd(char[] value) {
    pol4RetSrvcCdHSetInd = checkPol4RetSrvcCdHSetIndConstraints(value);
    serializePol4RetSrvcCdHSetInd(pol4RetSrvcCdHSetInd);
  }

  /**
   * Update Pol4RetSrvcCdHSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdHSetInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol4RetSrvcCdHSetInd, pol4RetSrvcCdHSetInd.length);
  }

  public void setPol4RetSrvcCdHSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdHSetInd, pol4RetSrvcCdHSetInd.length);
  }

  /**
   * Update Pol4RetSrvcCdHSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdHSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdHSetInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetSrvcCdHSetInd with another Field
   *
   * @param value
   */
  public void setPol4RetSrvcCdHSetInd(Field source) {
    replace(source, 0, source.length(), beginPol4RetSrvcCdHSetInd, POL_4_RET_SRVC_CD_HSET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdHSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdHSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4RetSrvcCdHSetInd, POL_4_RET_SRVC_CD_HSET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdHSetInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4RetSrvcCdHSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdHSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetSrvcCdISetInd
   *
   * @return pol4RetSrvcCdISetInd
   */
  public char[] getPol4RetSrvcCdISetInd() throws CFException {
    if (isPol4RetSrvcCdISetIndModified()) {
      pol4RetSrvcCdISetInd = refreshPol4RetSrvcCdISetInd();
    }
    return pol4RetSrvcCdISetInd;
  }

  /**
   * set variable pol4RetSrvcCdISetInd Corresponding COBOL Variable is POL4-RET-SRVC-CD-I-SET-IND
   *
   * @param value
   */
  public void setPol4RetSrvcCdISetInd(char[] value) {
    pol4RetSrvcCdISetInd = checkPol4RetSrvcCdISetIndConstraints(value);
    serializePol4RetSrvcCdISetInd(pol4RetSrvcCdISetInd);
  }

  /**
   * Update Pol4RetSrvcCdISetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdISetInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol4RetSrvcCdISetInd, pol4RetSrvcCdISetInd.length);
  }

  public void setPol4RetSrvcCdISetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdISetInd, pol4RetSrvcCdISetInd.length);
  }

  /**
   * Update Pol4RetSrvcCdISetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdISetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdISetInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetSrvcCdISetInd with another Field
   *
   * @param value
   */
  public void setPol4RetSrvcCdISetInd(Field source) {
    replace(source, 0, source.length(), beginPol4RetSrvcCdISetInd, POL_4_RET_SRVC_CD_ISET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdISetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdISetInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4RetSrvcCdISetInd, POL_4_RET_SRVC_CD_ISET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdISetInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4RetSrvcCdISetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdISetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetSrvcCdJSetInd
   *
   * @return pol4RetSrvcCdJSetInd
   */
  public char[] getPol4RetSrvcCdJSetInd() throws CFException {
    if (isPol4RetSrvcCdJSetIndModified()) {
      pol4RetSrvcCdJSetInd = refreshPol4RetSrvcCdJSetInd();
    }
    return pol4RetSrvcCdJSetInd;
  }

  /**
   * set variable pol4RetSrvcCdJSetInd Corresponding COBOL Variable is POL4-RET-SRVC-CD-J-SET-IND
   *
   * @param value
   */
  public void setPol4RetSrvcCdJSetInd(char[] value) {
    pol4RetSrvcCdJSetInd = checkPol4RetSrvcCdJSetIndConstraints(value);
    serializePol4RetSrvcCdJSetInd(pol4RetSrvcCdJSetInd);
  }

  /**
   * Update Pol4RetSrvcCdJSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdJSetInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol4RetSrvcCdJSetInd, pol4RetSrvcCdJSetInd.length);
  }

  public void setPol4RetSrvcCdJSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdJSetInd, pol4RetSrvcCdJSetInd.length);
  }

  /**
   * Update Pol4RetSrvcCdJSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdJSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdJSetInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetSrvcCdJSetInd with another Field
   *
   * @param value
   */
  public void setPol4RetSrvcCdJSetInd(Field source) {
    replace(source, 0, source.length(), beginPol4RetSrvcCdJSetInd, POL_4_RET_SRVC_CD_JSET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdJSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdJSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4RetSrvcCdJSetInd, POL_4_RET_SRVC_CD_JSET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdJSetInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4RetSrvcCdJSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdJSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetSrvcCdKSetInd
   *
   * @return pol4RetSrvcCdKSetInd
   */
  public char[] getPol4RetSrvcCdKSetInd() throws CFException {
    if (isPol4RetSrvcCdKSetIndModified()) {
      pol4RetSrvcCdKSetInd = refreshPol4RetSrvcCdKSetInd();
    }
    return pol4RetSrvcCdKSetInd;
  }

  /**
   * set variable pol4RetSrvcCdKSetInd Corresponding COBOL Variable is POL4-RET-SRVC-CD-K-SET-IND
   *
   * @param value
   */
  public void setPol4RetSrvcCdKSetInd(char[] value) {
    pol4RetSrvcCdKSetInd = checkPol4RetSrvcCdKSetIndConstraints(value);
    serializePol4RetSrvcCdKSetInd(pol4RetSrvcCdKSetInd);
  }

  /**
   * Update Pol4RetSrvcCdKSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdKSetInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol4RetSrvcCdKSetInd, pol4RetSrvcCdKSetInd.length);
  }

  public void setPol4RetSrvcCdKSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdKSetInd, pol4RetSrvcCdKSetInd.length);
  }

  /**
   * Update Pol4RetSrvcCdKSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdKSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdKSetInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetSrvcCdKSetInd with another Field
   *
   * @param value
   */
  public void setPol4RetSrvcCdKSetInd(Field source) {
    replace(source, 0, source.length(), beginPol4RetSrvcCdKSetInd, POL_4_RET_SRVC_CD_KSET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdKSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdKSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4RetSrvcCdKSetInd, POL_4_RET_SRVC_CD_KSET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdKSetInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4RetSrvcCdKSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdKSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetSrvcCdLSetInd
   *
   * @return pol4RetSrvcCdLSetInd
   */
  public char[] getPol4RetSrvcCdLSetInd() throws CFException {
    if (isPol4RetSrvcCdLSetIndModified()) {
      pol4RetSrvcCdLSetInd = refreshPol4RetSrvcCdLSetInd();
    }
    return pol4RetSrvcCdLSetInd;
  }

  /**
   * set variable pol4RetSrvcCdLSetInd Corresponding COBOL Variable is POL4-RET-SRVC-CD-L-SET-IND
   *
   * @param value
   */
  public void setPol4RetSrvcCdLSetInd(char[] value) {
    pol4RetSrvcCdLSetInd = checkPol4RetSrvcCdLSetIndConstraints(value);
    serializePol4RetSrvcCdLSetInd(pol4RetSrvcCdLSetInd);
  }

  /**
   * Update Pol4RetSrvcCdLSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdLSetInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol4RetSrvcCdLSetInd, pol4RetSrvcCdLSetInd.length);
  }

  public void setPol4RetSrvcCdLSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdLSetInd, pol4RetSrvcCdLSetInd.length);
  }

  /**
   * Update Pol4RetSrvcCdLSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdLSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdLSetInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetSrvcCdLSetInd with another Field
   *
   * @param value
   */
  public void setPol4RetSrvcCdLSetInd(Field source) {
    replace(source, 0, source.length(), beginPol4RetSrvcCdLSetInd, POL_4_RET_SRVC_CD_LSET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdLSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdLSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4RetSrvcCdLSetInd, POL_4_RET_SRVC_CD_LSET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdLSetInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4RetSrvcCdLSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdLSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetSrvcCdMSetInd
   *
   * @return pol4RetSrvcCdMSetInd
   */
  public char[] getPol4RetSrvcCdMSetInd() throws CFException {
    if (isPol4RetSrvcCdMSetIndModified()) {
      pol4RetSrvcCdMSetInd = refreshPol4RetSrvcCdMSetInd();
    }
    return pol4RetSrvcCdMSetInd;
  }

  /**
   * set variable pol4RetSrvcCdMSetInd Corresponding COBOL Variable is POL4-RET-SRVC-CD-M-SET-IND
   *
   * @param value
   */
  public void setPol4RetSrvcCdMSetInd(char[] value) {
    pol4RetSrvcCdMSetInd = checkPol4RetSrvcCdMSetIndConstraints(value);
    serializePol4RetSrvcCdMSetInd(pol4RetSrvcCdMSetInd);
  }

  /**
   * Update Pol4RetSrvcCdMSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdMSetInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol4RetSrvcCdMSetInd, pol4RetSrvcCdMSetInd.length);
  }

  public void setPol4RetSrvcCdMSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdMSetInd, pol4RetSrvcCdMSetInd.length);
  }

  /**
   * Update Pol4RetSrvcCdMSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdMSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdMSetInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetSrvcCdMSetInd with another Field
   *
   * @param value
   */
  public void setPol4RetSrvcCdMSetInd(Field source) {
    replace(source, 0, source.length(), beginPol4RetSrvcCdMSetInd, POL_4_RET_SRVC_CD_MSET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdMSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdMSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4RetSrvcCdMSetInd, POL_4_RET_SRVC_CD_MSET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdMSetInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4RetSrvcCdMSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdMSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetSrvcCdOSetInd
   *
   * @return pol4RetSrvcCdOSetInd
   */
  public char[] getPol4RetSrvcCdOSetInd() throws CFException {
    if (isPol4RetSrvcCdOSetIndModified()) {
      pol4RetSrvcCdOSetInd = refreshPol4RetSrvcCdOSetInd();
    }
    return pol4RetSrvcCdOSetInd;
  }

  /**
   * set variable pol4RetSrvcCdOSetInd Corresponding COBOL Variable is POL4-RET-SRVC-CD-O-SET-IND
   *
   * @param value
   */
  public void setPol4RetSrvcCdOSetInd(char[] value) {
    pol4RetSrvcCdOSetInd = checkPol4RetSrvcCdOSetIndConstraints(value);
    serializePol4RetSrvcCdOSetInd(pol4RetSrvcCdOSetInd);
  }

  /**
   * Update Pol4RetSrvcCdOSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdOSetInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol4RetSrvcCdOSetInd, pol4RetSrvcCdOSetInd.length);
  }

  public void setPol4RetSrvcCdOSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdOSetInd, pol4RetSrvcCdOSetInd.length);
  }

  /**
   * Update Pol4RetSrvcCdOSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdOSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdOSetInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetSrvcCdOSetInd with another Field
   *
   * @param value
   */
  public void setPol4RetSrvcCdOSetInd(Field source) {
    replace(source, 0, source.length(), beginPol4RetSrvcCdOSetInd, POL_4_RET_SRVC_CD_OSET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdOSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdOSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4RetSrvcCdOSetInd, POL_4_RET_SRVC_CD_OSET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdOSetInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4RetSrvcCdOSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdOSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetSrvcCdQSetInd
   *
   * @return pol4RetSrvcCdQSetInd
   */
  public char[] getPol4RetSrvcCdQSetInd() throws CFException {
    if (isPol4RetSrvcCdQSetIndModified()) {
      pol4RetSrvcCdQSetInd = refreshPol4RetSrvcCdQSetInd();
    }
    return pol4RetSrvcCdQSetInd;
  }

  /**
   * set variable pol4RetSrvcCdQSetInd Corresponding COBOL Variable is POL4-RET-SRVC-CD-Q-SET-IND
   *
   * @param value
   */
  public void setPol4RetSrvcCdQSetInd(char[] value) {
    pol4RetSrvcCdQSetInd = checkPol4RetSrvcCdQSetIndConstraints(value);
    serializePol4RetSrvcCdQSetInd(pol4RetSrvcCdQSetInd);
  }

  /**
   * Update Pol4RetSrvcCdQSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdQSetInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol4RetSrvcCdQSetInd, pol4RetSrvcCdQSetInd.length);
  }

  public void setPol4RetSrvcCdQSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdQSetInd, pol4RetSrvcCdQSetInd.length);
  }

  /**
   * Update Pol4RetSrvcCdQSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdQSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdQSetInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetSrvcCdQSetInd with another Field
   *
   * @param value
   */
  public void setPol4RetSrvcCdQSetInd(Field source) {
    replace(source, 0, source.length(), beginPol4RetSrvcCdQSetInd, POL_4_RET_SRVC_CD_QSET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdQSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdQSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4RetSrvcCdQSetInd, POL_4_RET_SRVC_CD_QSET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdQSetInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4RetSrvcCdQSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdQSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetSrvcCdRSetInd
   *
   * @return pol4RetSrvcCdRSetInd
   */
  public char[] getPol4RetSrvcCdRSetInd() throws CFException {
    if (isPol4RetSrvcCdRSetIndModified()) {
      pol4RetSrvcCdRSetInd = refreshPol4RetSrvcCdRSetInd();
    }
    return pol4RetSrvcCdRSetInd;
  }

  /**
   * set variable pol4RetSrvcCdRSetInd Corresponding COBOL Variable is POL4-RET-SRVC-CD-R-SET-IND
   *
   * @param value
   */
  public void setPol4RetSrvcCdRSetInd(char[] value) {
    pol4RetSrvcCdRSetInd = checkPol4RetSrvcCdRSetIndConstraints(value);
    serializePol4RetSrvcCdRSetInd(pol4RetSrvcCdRSetInd);
  }

  /**
   * Update Pol4RetSrvcCdRSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdRSetInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol4RetSrvcCdRSetInd, pol4RetSrvcCdRSetInd.length);
  }

  public void setPol4RetSrvcCdRSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdRSetInd, pol4RetSrvcCdRSetInd.length);
  }

  /**
   * Update Pol4RetSrvcCdRSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdRSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdRSetInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetSrvcCdRSetInd with another Field
   *
   * @param value
   */
  public void setPol4RetSrvcCdRSetInd(Field source) {
    replace(source, 0, source.length(), beginPol4RetSrvcCdRSetInd, POL_4_RET_SRVC_CD_RSET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdRSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdRSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4RetSrvcCdRSetInd, POL_4_RET_SRVC_CD_RSET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdRSetInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4RetSrvcCdRSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdRSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetSrvcCdSSetInd
   *
   * @return pol4RetSrvcCdSSetInd
   */
  public char[] getPol4RetSrvcCdSSetInd() throws CFException {
    if (isPol4RetSrvcCdSSetIndModified()) {
      pol4RetSrvcCdSSetInd = refreshPol4RetSrvcCdSSetInd();
    }
    return pol4RetSrvcCdSSetInd;
  }

  /**
   * set variable pol4RetSrvcCdSSetInd Corresponding COBOL Variable is POL4-RET-SRVC-CD-S-SET-IND
   *
   * @param value
   */
  public void setPol4RetSrvcCdSSetInd(char[] value) {
    pol4RetSrvcCdSSetInd = checkPol4RetSrvcCdSSetIndConstraints(value);
    serializePol4RetSrvcCdSSetInd(pol4RetSrvcCdSSetInd);
  }

  /**
   * Update Pol4RetSrvcCdSSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdSSetInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol4RetSrvcCdSSetInd, pol4RetSrvcCdSSetInd.length);
  }

  public void setPol4RetSrvcCdSSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdSSetInd, pol4RetSrvcCdSSetInd.length);
  }

  /**
   * Update Pol4RetSrvcCdSSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdSSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdSSetInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetSrvcCdSSetInd with another Field
   *
   * @param value
   */
  public void setPol4RetSrvcCdSSetInd(Field source) {
    replace(source, 0, source.length(), beginPol4RetSrvcCdSSetInd, POL_4_RET_SRVC_CD_SSET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdSSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdSSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4RetSrvcCdSSetInd, POL_4_RET_SRVC_CD_SSET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdSSetInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4RetSrvcCdSSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdSSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetSrvcCdUSetInd
   *
   * @return pol4RetSrvcCdUSetInd
   */
  public char[] getPol4RetSrvcCdUSetInd() throws CFException {
    if (isPol4RetSrvcCdUSetIndModified()) {
      pol4RetSrvcCdUSetInd = refreshPol4RetSrvcCdUSetInd();
    }
    return pol4RetSrvcCdUSetInd;
  }

  /**
   * set variable pol4RetSrvcCdUSetInd Corresponding COBOL Variable is POL4-RET-SRVC-CD-U-SET-IND
   *
   * @param value
   */
  public void setPol4RetSrvcCdUSetInd(char[] value) {
    pol4RetSrvcCdUSetInd = checkPol4RetSrvcCdUSetIndConstraints(value);
    serializePol4RetSrvcCdUSetInd(pol4RetSrvcCdUSetInd);
  }

  /**
   * Update Pol4RetSrvcCdUSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdUSetInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol4RetSrvcCdUSetInd, pol4RetSrvcCdUSetInd.length);
  }

  public void setPol4RetSrvcCdUSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdUSetInd, pol4RetSrvcCdUSetInd.length);
  }

  /**
   * Update Pol4RetSrvcCdUSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdUSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdUSetInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetSrvcCdUSetInd with another Field
   *
   * @param value
   */
  public void setPol4RetSrvcCdUSetInd(Field source) {
    replace(source, 0, source.length(), beginPol4RetSrvcCdUSetInd, POL_4_RET_SRVC_CD_USET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdUSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdUSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4RetSrvcCdUSetInd, POL_4_RET_SRVC_CD_USET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdUSetInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4RetSrvcCdUSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdUSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetSrvcCdVSetInd
   *
   * @return pol4RetSrvcCdVSetInd
   */
  public char[] getPol4RetSrvcCdVSetInd() throws CFException {
    if (isPol4RetSrvcCdVSetIndModified()) {
      pol4RetSrvcCdVSetInd = refreshPol4RetSrvcCdVSetInd();
    }
    return pol4RetSrvcCdVSetInd;
  }

  /**
   * set variable pol4RetSrvcCdVSetInd Corresponding COBOL Variable is POL4-RET-SRVC-CD-V-SET-IND
   *
   * @param value
   */
  public void setPol4RetSrvcCdVSetInd(char[] value) {
    pol4RetSrvcCdVSetInd = checkPol4RetSrvcCdVSetIndConstraints(value);
    serializePol4RetSrvcCdVSetInd(pol4RetSrvcCdVSetInd);
  }

  /**
   * Update Pol4RetSrvcCdVSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdVSetInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol4RetSrvcCdVSetInd, pol4RetSrvcCdVSetInd.length);
  }

  public void setPol4RetSrvcCdVSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdVSetInd, pol4RetSrvcCdVSetInd.length);
  }

  /**
   * Update Pol4RetSrvcCdVSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdVSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdVSetInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetSrvcCdVSetInd with another Field
   *
   * @param value
   */
  public void setPol4RetSrvcCdVSetInd(Field source) {
    replace(source, 0, source.length(), beginPol4RetSrvcCdVSetInd, POL_4_RET_SRVC_CD_VSET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdVSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdVSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4RetSrvcCdVSetInd, POL_4_RET_SRVC_CD_VSET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdVSetInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4RetSrvcCdVSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdVSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetSrvcCdWSetInd
   *
   * @return pol4RetSrvcCdWSetInd
   */
  public char[] getPol4RetSrvcCdWSetInd() throws CFException {
    if (isPol4RetSrvcCdWSetIndModified()) {
      pol4RetSrvcCdWSetInd = refreshPol4RetSrvcCdWSetInd();
    }
    return pol4RetSrvcCdWSetInd;
  }

  /**
   * set variable pol4RetSrvcCdWSetInd Corresponding COBOL Variable is POL4-RET-SRVC-CD-W-SET-IND
   *
   * @param value
   */
  public void setPol4RetSrvcCdWSetInd(char[] value) {
    pol4RetSrvcCdWSetInd = checkPol4RetSrvcCdWSetIndConstraints(value);
    serializePol4RetSrvcCdWSetInd(pol4RetSrvcCdWSetInd);
  }

  /**
   * Update Pol4RetSrvcCdWSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdWSetInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol4RetSrvcCdWSetInd, pol4RetSrvcCdWSetInd.length);
  }

  public void setPol4RetSrvcCdWSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdWSetInd, pol4RetSrvcCdWSetInd.length);
  }

  /**
   * Update Pol4RetSrvcCdWSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdWSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdWSetInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetSrvcCdWSetInd with another Field
   *
   * @param value
   */
  public void setPol4RetSrvcCdWSetInd(Field source) {
    replace(source, 0, source.length(), beginPol4RetSrvcCdWSetInd, POL_4_RET_SRVC_CD_WSET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdWSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdWSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4RetSrvcCdWSetInd, POL_4_RET_SRVC_CD_WSET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdWSetInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4RetSrvcCdWSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdWSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetSrvcCdXSetInd
   *
   * @return pol4RetSrvcCdXSetInd
   */
  public char[] getPol4RetSrvcCdXSetInd() throws CFException {
    if (isPol4RetSrvcCdXSetIndModified()) {
      pol4RetSrvcCdXSetInd = refreshPol4RetSrvcCdXSetInd();
    }
    return pol4RetSrvcCdXSetInd;
  }

  /**
   * set variable pol4RetSrvcCdXSetInd Corresponding COBOL Variable is POL4-RET-SRVC-CD-X-SET-IND
   *
   * @param value
   */
  public void setPol4RetSrvcCdXSetInd(char[] value) {
    pol4RetSrvcCdXSetInd = checkPol4RetSrvcCdXSetIndConstraints(value);
    serializePol4RetSrvcCdXSetInd(pol4RetSrvcCdXSetInd);
  }

  /**
   * Update Pol4RetSrvcCdXSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdXSetInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol4RetSrvcCdXSetInd, pol4RetSrvcCdXSetInd.length);
  }

  public void setPol4RetSrvcCdXSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdXSetInd, pol4RetSrvcCdXSetInd.length);
  }

  /**
   * Update Pol4RetSrvcCdXSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdXSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdXSetInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetSrvcCdXSetInd with another Field
   *
   * @param value
   */
  public void setPol4RetSrvcCdXSetInd(Field source) {
    replace(source, 0, source.length(), beginPol4RetSrvcCdXSetInd, POL_4_RET_SRVC_CD_XSET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdXSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdXSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4RetSrvcCdXSetInd, POL_4_RET_SRVC_CD_XSET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdXSetInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4RetSrvcCdXSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdXSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetSrvcCdYSetInd
   *
   * @return pol4RetSrvcCdYSetInd
   */
  public char[] getPol4RetSrvcCdYSetInd() throws CFException {
    if (isPol4RetSrvcCdYSetIndModified()) {
      pol4RetSrvcCdYSetInd = refreshPol4RetSrvcCdYSetInd();
    }
    return pol4RetSrvcCdYSetInd;
  }

  /**
   * set variable pol4RetSrvcCdYSetInd Corresponding COBOL Variable is POL4-RET-SRVC-CD-Y-SET-IND
   *
   * @param value
   */
  public void setPol4RetSrvcCdYSetInd(char[] value) {
    pol4RetSrvcCdYSetInd = checkPol4RetSrvcCdYSetIndConstraints(value);
    serializePol4RetSrvcCdYSetInd(pol4RetSrvcCdYSetInd);
  }

  /**
   * Update Pol4RetSrvcCdYSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdYSetInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol4RetSrvcCdYSetInd, pol4RetSrvcCdYSetInd.length);
  }

  public void setPol4RetSrvcCdYSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdYSetInd, pol4RetSrvcCdYSetInd.length);
  }

  /**
   * Update Pol4RetSrvcCdYSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdYSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdYSetInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetSrvcCdYSetInd with another Field
   *
   * @param value
   */
  public void setPol4RetSrvcCdYSetInd(Field source) {
    replace(source, 0, source.length(), beginPol4RetSrvcCdYSetInd, POL_4_RET_SRVC_CD_YSET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdYSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdYSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4RetSrvcCdYSetInd, POL_4_RET_SRVC_CD_YSET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdYSetInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4RetSrvcCdYSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdYSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetSrvcCdZSetInd
   *
   * @return pol4RetSrvcCdZSetInd
   */
  public char[] getPol4RetSrvcCdZSetInd() throws CFException {
    if (isPol4RetSrvcCdZSetIndModified()) {
      pol4RetSrvcCdZSetInd = refreshPol4RetSrvcCdZSetInd();
    }
    return pol4RetSrvcCdZSetInd;
  }

  /**
   * set variable pol4RetSrvcCdZSetInd Corresponding COBOL Variable is POL4-RET-SRVC-CD-Z-SET-IND
   *
   * @param value
   */
  public void setPol4RetSrvcCdZSetInd(char[] value) {
    pol4RetSrvcCdZSetInd = checkPol4RetSrvcCdZSetIndConstraints(value);
    serializePol4RetSrvcCdZSetInd(pol4RetSrvcCdZSetInd);
  }

  /**
   * Update Pol4RetSrvcCdZSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdZSetInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol4RetSrvcCdZSetInd, pol4RetSrvcCdZSetInd.length);
  }

  public void setPol4RetSrvcCdZSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdZSetInd, pol4RetSrvcCdZSetInd.length);
  }

  /**
   * Update Pol4RetSrvcCdZSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdZSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdZSetInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetSrvcCdZSetInd with another Field
   *
   * @param value
   */
  public void setPol4RetSrvcCdZSetInd(Field source) {
    replace(source, 0, source.length(), beginPol4RetSrvcCdZSetInd, POL_4_RET_SRVC_CD_ZSET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdZSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetSrvcCdZSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4RetSrvcCdZSetInd, POL_4_RET_SRVC_CD_ZSET_IND_LEN);
  }

  /**
   * Update Pol4RetSrvcCdZSetInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4RetSrvcCdZSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetSrvcCdZSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4SviTblPriNbr
   *
   * @return pol4SviTblPriNbr
   */
  public char[] getPol4SviTblPriNbr() throws CFException {
    if (isPol4SviTblPriNbrModified()) {
      pol4SviTblPriNbr = refreshPol4SviTblPriNbr();
    }
    return pol4SviTblPriNbr;
  }

  /**
   * set variable pol4SviTblPriNbr Corresponding COBOL Variable is POL4-SVI-TBL-PRI-NBR
   *
   * @param value
   */
  public void setPol4SviTblPriNbr(char[] value) {
    pol4SviTblPriNbr = checkPol4SviTblPriNbrConstraints(value);
    serializePol4SviTblPriNbr(pol4SviTblPriNbr);
  }

  /**
   * Update Pol4SviTblPriNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4SviTblPriNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol4SviTblPriNbr, pol4SviTblPriNbr.length);
  }

  public void setPol4SviTblPriNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4SviTblPriNbr, pol4SviTblPriNbr.length);
  }

  /**
   * Update Pol4SviTblPriNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4SviTblPriNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4SviTblPriNbr + targetIndex, targetLen);
  }

  /**
   * Update Pol4SviTblPriNbr with another Field
   *
   * @param value
   */
  public void setPol4SviTblPriNbr(Field source) {
    replace(source, 0, source.length(), beginPol4SviTblPriNbr, POL_4_SVI_TBL_PRI_NBR_LEN);
  }

  /**
   * Update Pol4SviTblPriNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4SviTblPriNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4SviTblPriNbr, POL_4_SVI_TBL_PRI_NBR_LEN);
  }

  /**
   * Update Pol4SviTblPriNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4SviTblPriNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4SviTblPriNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4Tier1CopayAmt
   *
   * @return pol4Tier1CopayAmt
   */
  public BigDecimal getPol4Tier1CopayAmt() throws CFException {
    if (isPol4Tier1CopayAmtModified()) {
      pol4Tier1CopayAmt = refreshPol4Tier1CopayAmt();
    }
    return pol4Tier1CopayAmt;
  }

  /**
   * Returns the String value of pol4Tier1CopayAmt
   *
   * @return pol4Tier1CopayAmt
   */
  public char[] getPol4Tier1CopayAmtActualString() {
    String value = String.valueOf(pol4Tier1CopayAmt).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update Pol4Tier1CopayAmt with the passed number Corresponding COBOL Variable is
   * POL4-TIER-1-COPAY-AMT
   *
   * @param number
   */
  public void setPol4Tier1CopayAmt(BigDecimal number) {
    pol4Tier1CopayAmt = checkPol4Tier1CopayAmtMaxLimit(number);
    serializePol4Tier1CopayAmt(pol4Tier1CopayAmt);
  }
  /**
   * Update Pol4Tier1CopayAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4Tier1CopayAmt(char[] value) throws CFException {
    pol4Tier1CopayAmt = serializePol4Tier1CopayAmt(value);
  }
  /**
   * Returns the value of pol4Tier1FamNewCoinsAmt
   *
   * @return pol4Tier1FamNewCoinsAmt
   */
  public int getPol4Tier1FamNewCoinsAmt() throws CFException {
    if (isPol4Tier1FamNewCoinsAmtModified()) {
      pol4Tier1FamNewCoinsAmt = refreshPol4Tier1FamNewCoinsAmt();
    }
    return pol4Tier1FamNewCoinsAmt;
  }

  /**
   * Returns the String value of pol4Tier1FamNewCoinsAmt
   *
   * @return pol4Tier1FamNewCoinsAmt
   */
  public char[] getPol4Tier1FamNewCoinsAmtActualString() {
    String value = String.valueOf(pol4Tier1FamNewCoinsAmt).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update Pol4Tier1FamNewCoinsAmt with the passed value Corresponding COBOL Variable is
   * POL4-TIER-1-FAM-NEW-COINS-AMT
   *
   * @param number
   */
  public void setPol4Tier1FamNewCoinsAmt(int number) {
    // Truncate if the number is beyond +/- Max range
    pol4Tier1FamNewCoinsAmt = checkPol4Tier1FamNewCoinsAmtMaxLimit(number);
    serializePol4Tier1FamNewCoinsAmt(pol4Tier1FamNewCoinsAmt);
  }

  public void setPol4Tier1FamNewCoinsAmt(long number) {
    number =
        checkPol4Tier1FamNewCoinsAmtMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPol4Tier1FamNewCoinsAmt((int) number);
  }

  /**
   * Update Pol4Tier1FamNewCoinsAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4Tier1FamNewCoinsAmt(char[] value) throws CFException {
    pol4Tier1FamNewCoinsAmt = serializePol4Tier1FamNewCoinsAmt(value);
  }
  /**
   * Update Pol4Tier1FamNewCoinsAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4Tier1FamNewCoinsAmtString(char[] value) throws CFException {
    setPol4Tier1FamNewCoinsAmt(value);
  }
  /**
   * Returns the value of pol4Tier1NewCoinsAmt
   *
   * @return pol4Tier1NewCoinsAmt
   */
  public int getPol4Tier1NewCoinsAmt() throws CFException {
    if (isPol4Tier1NewCoinsAmtModified()) {
      pol4Tier1NewCoinsAmt = refreshPol4Tier1NewCoinsAmt();
    }
    return pol4Tier1NewCoinsAmt;
  }

  /**
   * Returns the String value of pol4Tier1NewCoinsAmt
   *
   * @return pol4Tier1NewCoinsAmt
   */
  public char[] getPol4Tier1NewCoinsAmtActualString() {
    String value = String.valueOf(pol4Tier1NewCoinsAmt).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update Pol4Tier1NewCoinsAmt with the passed value Corresponding COBOL Variable is
   * POL4-TIER-1-NEW-COINS-AMT
   *
   * @param number
   */
  public void setPol4Tier1NewCoinsAmt(int number) {
    // Truncate if the number is beyond +/- Max range
    pol4Tier1NewCoinsAmt = checkPol4Tier1NewCoinsAmtMaxLimit(number);
    serializePol4Tier1NewCoinsAmt(pol4Tier1NewCoinsAmt);
  }

  public void setPol4Tier1NewCoinsAmt(long number) {
    number = checkPol4Tier1NewCoinsAmtMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPol4Tier1NewCoinsAmt((int) number);
  }

  /**
   * Update Pol4Tier1NewCoinsAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4Tier1NewCoinsAmt(char[] value) throws CFException {
    pol4Tier1NewCoinsAmt = serializePol4Tier1NewCoinsAmt(value);
  }
  /**
   * Update Pol4Tier1NewCoinsAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4Tier1NewCoinsAmtString(char[] value) throws CFException {
    setPol4Tier1NewCoinsAmt(value);
  }
  /**
   * Returns the value of pol4Tier1UrgntCareAmt
   *
   * @return pol4Tier1UrgntCareAmt
   */
  public BigDecimal getPol4Tier1UrgntCareAmt() throws CFException {
    if (isPol4Tier1UrgntCareAmtModified()) {
      pol4Tier1UrgntCareAmt = refreshPol4Tier1UrgntCareAmt();
    }
    return pol4Tier1UrgntCareAmt;
  }

  /**
   * Returns the String value of pol4Tier1UrgntCareAmt
   *
   * @return pol4Tier1UrgntCareAmt
   */
  public char[] getPol4Tier1UrgntCareAmtActualString() {
    String value = String.valueOf(pol4Tier1UrgntCareAmt).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update Pol4Tier1UrgntCareAmt with the passed number Corresponding COBOL Variable is
   * POL4-TIER-1-URGNT-CARE-AMT
   *
   * @param number
   */
  public void setPol4Tier1UrgntCareAmt(BigDecimal number) {
    pol4Tier1UrgntCareAmt = checkPol4Tier1UrgntCareAmtMaxLimit(number);
    serializePol4Tier1UrgntCareAmt(pol4Tier1UrgntCareAmt);
  }
  /**
   * Update Pol4Tier1UrgntCareAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4Tier1UrgntCareAmt(char[] value) throws CFException {
    pol4Tier1UrgntCareAmt = serializePol4Tier1UrgntCareAmt(value);
  }
  /**
   * Returns the value of pol4UrgntCareAmt
   *
   * @return pol4UrgntCareAmt
   */
  public BigDecimal getPol4UrgntCareAmt() throws CFException {
    if (isPol4UrgntCareAmtModified()) {
      pol4UrgntCareAmt = refreshPol4UrgntCareAmt();
    }
    return pol4UrgntCareAmt;
  }

  /**
   * Returns the String value of pol4UrgntCareAmt
   *
   * @return pol4UrgntCareAmt
   */
  public char[] getPol4UrgntCareAmtActualString() {
    String value = String.valueOf(pol4UrgntCareAmt).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update Pol4UrgntCareAmt with the passed number Corresponding COBOL Variable is
   * POL4-URGNT-CARE-AMT
   *
   * @param number
   */
  public void setPol4UrgntCareAmt(BigDecimal number) {
    pol4UrgntCareAmt = checkPol4UrgntCareAmtMaxLimit(number);
    serializePol4UrgntCareAmt(pol4UrgntCareAmt);
  }
  /**
   * Update Pol4UrgntCareAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4UrgntCareAmt(char[] value) throws CFException {
    pol4UrgntCareAmt = serializePol4UrgntCareAmt(value);
  }
  /**
   * Returns the value of pol4XtraTerrStMandInd
   *
   * @return pol4XtraTerrStMandInd
   */
  public char[] getPol4XtraTerrStMandInd() throws CFException {
    if (isPol4XtraTerrStMandIndModified()) {
      pol4XtraTerrStMandInd = refreshPol4XtraTerrStMandInd();
    }
    return pol4XtraTerrStMandInd;
  }

  /**
   * set variable pol4XtraTerrStMandInd Corresponding COBOL Variable is POL4-XTRA-TERR-ST-MAND-IND
   *
   * @param value
   */
  public void setPol4XtraTerrStMandInd(char[] value) {
    pol4XtraTerrStMandInd = checkPol4XtraTerrStMandIndConstraints(value);
    serializePol4XtraTerrStMandInd(pol4XtraTerrStMandInd);
  }

  /**
   * Update Pol4XtraTerrStMandInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4XtraTerrStMandInd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol4XtraTerrStMandInd,
        pol4XtraTerrStMandInd.length);
  }

  public void setPol4XtraTerrStMandInd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4XtraTerrStMandInd, pol4XtraTerrStMandInd.length);
  }

  /**
   * Update Pol4XtraTerrStMandInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4XtraTerrStMandInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4XtraTerrStMandInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4XtraTerrStMandInd with another Field
   *
   * @param value
   */
  public void setPol4XtraTerrStMandInd(Field source) {
    replace(
        source, 0, source.length(), beginPol4XtraTerrStMandInd, POL_4_XTRA_TERR_ST_MAND_IND_LEN);
  }

  /**
   * Update Pol4XtraTerrStMandInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4XtraTerrStMandInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol4XtraTerrStMandInd,
        POL_4_XTRA_TERR_ST_MAND_IND_LEN);
  }

  /**
   * Update Pol4XtraTerrStMandInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4XtraTerrStMandInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4XtraTerrStMandInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4TierLabelInd
   *
   * @return pol4TierLabelInd
   */
  public char[] getPol4TierLabelInd() throws CFException {
    if (isPol4TierLabelIndModified()) {
      pol4TierLabelInd = refreshPol4TierLabelInd();
    }
    return pol4TierLabelInd;
  }

  /**
   * set variable pol4TierLabelInd Corresponding COBOL Variable is POL4-TIER-LABEL-IND
   *
   * @param value
   */
  public void setPol4TierLabelInd(char[] value) {
    pol4TierLabelInd = checkPol4TierLabelIndConstraints(value);
    serializePol4TierLabelInd(pol4TierLabelInd);
  }

  /**
   * Update Pol4TierLabelInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4TierLabelInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol4TierLabelInd, pol4TierLabelInd.length);
  }

  public void setPol4TierLabelInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4TierLabelInd, pol4TierLabelInd.length);
  }

  /**
   * Update Pol4TierLabelInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4TierLabelInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4TierLabelInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4TierLabelInd with another Field
   *
   * @param value
   */
  public void setPol4TierLabelInd(Field source) {
    replace(source, 0, source.length(), beginPol4TierLabelInd, POL_4_TIER_LABEL_IND_LEN);
  }

  /**
   * Update Pol4TierLabelInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4TierLabelInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4TierLabelInd, POL_4_TIER_LABEL_IND_LEN);
  }

  /**
   * Update Pol4TierLabelInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4TierLabelInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4TierLabelInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4DedSpecialProcessCd
   *
   * @return pol4DedSpecialProcessCd
   */
  public char[] getPol4DedSpecialProcessCd() throws CFException {
    if (isPol4DedSpecialProcessCdModified()) {
      pol4DedSpecialProcessCd = refreshPol4DedSpecialProcessCd();
    }
    return pol4DedSpecialProcessCd;
  }

  /**
   * set variable pol4DedSpecialProcessCd Corresponding COBOL Variable is
   * POL4-DED-SPECIAL-PROCESS-CD
   *
   * @param value
   */
  public void setPol4DedSpecialProcessCd(char[] value) {
    pol4DedSpecialProcessCd = checkPol4DedSpecialProcessCdConstraints(value);
    serializePol4DedSpecialProcessCd(pol4DedSpecialProcessCd);
  }

  /**
   * Update Pol4DedSpecialProcessCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4DedSpecialProcessCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol4DedSpecialProcessCd,
        pol4DedSpecialProcessCd.length);
  }

  public void setPol4DedSpecialProcessCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol4DedSpecialProcessCd,
        pol4DedSpecialProcessCd.length);
  }

  /**
   * Update Pol4DedSpecialProcessCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4DedSpecialProcessCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4DedSpecialProcessCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4DedSpecialProcessCd with another Field
   *
   * @param value
   */
  public void setPol4DedSpecialProcessCd(Field source) {
    replace(
        source, 0, source.length(), beginPol4DedSpecialProcessCd, POL_4_DED_SPECIAL_PROCESS_CD_LEN);
  }

  /**
   * Update Pol4DedSpecialProcessCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4DedSpecialProcessCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol4DedSpecialProcessCd,
        POL_4_DED_SPECIAL_PROCESS_CD_LEN);
  }

  /**
   * Update Pol4DedSpecialProcessCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4DedSpecialProcessCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4DedSpecialProcessCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4OopInNtwkEePls1Amt
   *
   * @return pol4OopInNtwkEePls1Amt
   */
  public int getPol4OopInNtwkEePls1Amt() throws CFException {
    if (isPol4OopInNtwkEePls1AmtModified()) {
      pol4OopInNtwkEePls1Amt = refreshPol4OopInNtwkEePls1Amt();
    }
    return pol4OopInNtwkEePls1Amt;
  }

  /**
   * Returns the String value of pol4OopInNtwkEePls1Amt
   *
   * @return pol4OopInNtwkEePls1Amt
   */
  public char[] getPol4OopInNtwkEePls1AmtActualString() {
    String value = String.valueOf(pol4OopInNtwkEePls1Amt).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update Pol4OopInNtwkEePls1Amt with the passed value Corresponding COBOL Variable is
   * POL4-OOP-IN-NTWK-EE-PLS-1-AMT
   *
   * @param number
   */
  public void setPol4OopInNtwkEePls1Amt(int number) {
    // Truncate if the number is beyond +/- Max range
    pol4OopInNtwkEePls1Amt = checkPol4OopInNtwkEePls1AmtMaxLimit(number);
    serializePol4OopInNtwkEePls1Amt(pol4OopInNtwkEePls1Amt);
  }

  public void setPol4OopInNtwkEePls1Amt(long number) {
    number =
        checkPol4OopInNtwkEePls1AmtMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPol4OopInNtwkEePls1Amt((int) number);
  }

  /**
   * Update Pol4OopInNtwkEePls1Amt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4OopInNtwkEePls1Amt(char[] value) throws CFException {
    pol4OopInNtwkEePls1Amt = serializePol4OopInNtwkEePls1Amt(value);
  }
  /**
   * Update Pol4OopInNtwkEePls1Amt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4OopInNtwkEePls1AmtString(char[] value) throws CFException {
    setPol4OopInNtwkEePls1Amt(value);
  }
  /**
   * Returns the value of pol4OopInNtwkEeSpoAmt
   *
   * @return pol4OopInNtwkEeSpoAmt
   */
  public int getPol4OopInNtwkEeSpoAmt() throws CFException {
    if (isPol4OopInNtwkEeSpoAmtModified()) {
      pol4OopInNtwkEeSpoAmt = refreshPol4OopInNtwkEeSpoAmt();
    }
    return pol4OopInNtwkEeSpoAmt;
  }

  /**
   * Returns the String value of pol4OopInNtwkEeSpoAmt
   *
   * @return pol4OopInNtwkEeSpoAmt
   */
  public char[] getPol4OopInNtwkEeSpoAmtActualString() {
    String value = String.valueOf(pol4OopInNtwkEeSpoAmt).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update Pol4OopInNtwkEeSpoAmt with the passed value Corresponding COBOL Variable is
   * POL4-OOP-IN-NTWK-EE-SPO-AMT
   *
   * @param number
   */
  public void setPol4OopInNtwkEeSpoAmt(int number) {
    // Truncate if the number is beyond +/- Max range
    pol4OopInNtwkEeSpoAmt = checkPol4OopInNtwkEeSpoAmtMaxLimit(number);
    serializePol4OopInNtwkEeSpoAmt(pol4OopInNtwkEeSpoAmt);
  }

  public void setPol4OopInNtwkEeSpoAmt(long number) {
    number =
        checkPol4OopInNtwkEeSpoAmtMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPol4OopInNtwkEeSpoAmt((int) number);
  }

  /**
   * Update Pol4OopInNtwkEeSpoAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4OopInNtwkEeSpoAmt(char[] value) throws CFException {
    pol4OopInNtwkEeSpoAmt = serializePol4OopInNtwkEeSpoAmt(value);
  }
  /**
   * Update Pol4OopInNtwkEeSpoAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4OopInNtwkEeSpoAmtString(char[] value) throws CFException {
    setPol4OopInNtwkEeSpoAmt(value);
  }
  /**
   * Returns the value of pol4OopInNtwkEeChrgAmt
   *
   * @return pol4OopInNtwkEeChrgAmt
   */
  public int getPol4OopInNtwkEeChrgAmt() throws CFException {
    if (isPol4OopInNtwkEeChrgAmtModified()) {
      pol4OopInNtwkEeChrgAmt = refreshPol4OopInNtwkEeChrgAmt();
    }
    return pol4OopInNtwkEeChrgAmt;
  }

  /**
   * Returns the String value of pol4OopInNtwkEeChrgAmt
   *
   * @return pol4OopInNtwkEeChrgAmt
   */
  public char[] getPol4OopInNtwkEeChrgAmtActualString() {
    String value = String.valueOf(pol4OopInNtwkEeChrgAmt).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update Pol4OopInNtwkEeChrgAmt with the passed value Corresponding COBOL Variable is
   * POL4-OOP-IN-NTWK-EE-CHRG-AMT
   *
   * @param number
   */
  public void setPol4OopInNtwkEeChrgAmt(int number) {
    // Truncate if the number is beyond +/- Max range
    pol4OopInNtwkEeChrgAmt = checkPol4OopInNtwkEeChrgAmtMaxLimit(number);
    serializePol4OopInNtwkEeChrgAmt(pol4OopInNtwkEeChrgAmt);
  }

  public void setPol4OopInNtwkEeChrgAmt(long number) {
    number =
        checkPol4OopInNtwkEeChrgAmtMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPol4OopInNtwkEeChrgAmt((int) number);
  }

  /**
   * Update Pol4OopInNtwkEeChrgAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4OopInNtwkEeChrgAmt(char[] value) throws CFException {
    pol4OopInNtwkEeChrgAmt = serializePol4OopInNtwkEeChrgAmt(value);
  }
  /**
   * Update Pol4OopInNtwkEeChrgAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4OopInNtwkEeChrgAmtString(char[] value) throws CFException {
    setPol4OopInNtwkEeChrgAmt(value);
  }
  /**
   * Returns the value of pol4OopCombEePls1Amt
   *
   * @return pol4OopCombEePls1Amt
   */
  public int getPol4OopCombEePls1Amt() throws CFException {
    if (isPol4OopCombEePls1AmtModified()) {
      pol4OopCombEePls1Amt = refreshPol4OopCombEePls1Amt();
    }
    return pol4OopCombEePls1Amt;
  }

  /**
   * Returns the String value of pol4OopCombEePls1Amt
   *
   * @return pol4OopCombEePls1Amt
   */
  public char[] getPol4OopCombEePls1AmtActualString() {
    String value = String.valueOf(pol4OopCombEePls1Amt).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update Pol4OopCombEePls1Amt with the passed value Corresponding COBOL Variable is
   * POL4-OOP-COMB-EE-PLS-1-AMT
   *
   * @param number
   */
  public void setPol4OopCombEePls1Amt(int number) {
    // Truncate if the number is beyond +/- Max range
    pol4OopCombEePls1Amt = checkPol4OopCombEePls1AmtMaxLimit(number);
    serializePol4OopCombEePls1Amt(pol4OopCombEePls1Amt);
  }

  public void setPol4OopCombEePls1Amt(long number) {
    number = checkPol4OopCombEePls1AmtMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPol4OopCombEePls1Amt((int) number);
  }

  /**
   * Update Pol4OopCombEePls1Amt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4OopCombEePls1Amt(char[] value) throws CFException {
    pol4OopCombEePls1Amt = serializePol4OopCombEePls1Amt(value);
  }
  /**
   * Update Pol4OopCombEePls1Amt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4OopCombEePls1AmtString(char[] value) throws CFException {
    setPol4OopCombEePls1Amt(value);
  }
  /**
   * Returns the value of pol4OopCombEeSpoAmt
   *
   * @return pol4OopCombEeSpoAmt
   */
  public int getPol4OopCombEeSpoAmt() throws CFException {
    if (isPol4OopCombEeSpoAmtModified()) {
      pol4OopCombEeSpoAmt = refreshPol4OopCombEeSpoAmt();
    }
    return pol4OopCombEeSpoAmt;
  }

  /**
   * Returns the String value of pol4OopCombEeSpoAmt
   *
   * @return pol4OopCombEeSpoAmt
   */
  public char[] getPol4OopCombEeSpoAmtActualString() {
    String value = String.valueOf(pol4OopCombEeSpoAmt).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update Pol4OopCombEeSpoAmt with the passed value Corresponding COBOL Variable is
   * POL4-OOP-COMB-EE-SPO-AMT
   *
   * @param number
   */
  public void setPol4OopCombEeSpoAmt(int number) {
    // Truncate if the number is beyond +/- Max range
    pol4OopCombEeSpoAmt = checkPol4OopCombEeSpoAmtMaxLimit(number);
    serializePol4OopCombEeSpoAmt(pol4OopCombEeSpoAmt);
  }

  public void setPol4OopCombEeSpoAmt(long number) {
    number = checkPol4OopCombEeSpoAmtMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPol4OopCombEeSpoAmt((int) number);
  }

  /**
   * Update Pol4OopCombEeSpoAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4OopCombEeSpoAmt(char[] value) throws CFException {
    pol4OopCombEeSpoAmt = serializePol4OopCombEeSpoAmt(value);
  }
  /**
   * Update Pol4OopCombEeSpoAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4OopCombEeSpoAmtString(char[] value) throws CFException {
    setPol4OopCombEeSpoAmt(value);
  }
  /**
   * Returns the value of pol4OopCombEeChrgAmt
   *
   * @return pol4OopCombEeChrgAmt
   */
  public int getPol4OopCombEeChrgAmt() throws CFException {
    if (isPol4OopCombEeChrgAmtModified()) {
      pol4OopCombEeChrgAmt = refreshPol4OopCombEeChrgAmt();
    }
    return pol4OopCombEeChrgAmt;
  }

  /**
   * Returns the String value of pol4OopCombEeChrgAmt
   *
   * @return pol4OopCombEeChrgAmt
   */
  public char[] getPol4OopCombEeChrgAmtActualString() {
    String value = String.valueOf(pol4OopCombEeChrgAmt).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update Pol4OopCombEeChrgAmt with the passed value Corresponding COBOL Variable is
   * POL4-OOP-COMB-EE-CHRG-AMT
   *
   * @param number
   */
  public void setPol4OopCombEeChrgAmt(int number) {
    // Truncate if the number is beyond +/- Max range
    pol4OopCombEeChrgAmt = checkPol4OopCombEeChrgAmtMaxLimit(number);
    serializePol4OopCombEeChrgAmt(pol4OopCombEeChrgAmt);
  }

  public void setPol4OopCombEeChrgAmt(long number) {
    number = checkPol4OopCombEeChrgAmtMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPol4OopCombEeChrgAmt((int) number);
  }

  /**
   * Update Pol4OopCombEeChrgAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4OopCombEeChrgAmt(char[] value) throws CFException {
    pol4OopCombEeChrgAmt = serializePol4OopCombEeChrgAmt(value);
  }
  /**
   * Update Pol4OopCombEeChrgAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4OopCombEeChrgAmtString(char[] value) throws CFException {
    setPol4OopCombEeChrgAmt(value);
  }
  /**
   * Returns the value of pol4IplnTypCd
   *
   * @return pol4IplnTypCd
   */
  public char[] getPol4IplnTypCd() throws CFException {
    if (isPol4IplnTypCdModified()) {
      pol4IplnTypCd = refreshPol4IplnTypCd();
    }
    return pol4IplnTypCd;
  }

  /**
   * set variable pol4IplnTypCd Corresponding COBOL Variable is POL4-IPLN-TYP-CD
   *
   * @param value
   */
  public void setPol4IplnTypCd(char[] value) {
    pol4IplnTypCd = checkPol4IplnTypCdConstraints(value);
    serializePol4IplnTypCd(pol4IplnTypCd);
  }

  /**
   * Update Pol4IplnTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4IplnTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol4IplnTypCd, pol4IplnTypCd.length);
  }

  public void setPol4IplnTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4IplnTypCd, pol4IplnTypCd.length);
  }

  /**
   * Update Pol4IplnTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4IplnTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4IplnTypCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4IplnTypCd with another Field
   *
   * @param value
   */
  public void setPol4IplnTypCd(Field source) {
    replace(source, 0, source.length(), beginPol4IplnTypCd, POL_4_IPLN_TYP_CD_LEN);
  }

  /**
   * Update Pol4IplnTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4IplnTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4IplnTypCd, POL_4_IPLN_TYP_CD_LEN);
  }

  /**
   * Update Pol4IplnTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4IplnTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4IplnTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4IndNewCoinsMaxInd
   *
   * @return pol4IndNewCoinsMaxInd
   */
  public char[] getPol4IndNewCoinsMaxInd() throws CFException {
    if (isPol4IndNewCoinsMaxIndModified()) {
      pol4IndNewCoinsMaxInd = refreshPol4IndNewCoinsMaxInd();
    }
    return pol4IndNewCoinsMaxInd;
  }

  /**
   * set variable pol4IndNewCoinsMaxInd Corresponding COBOL Variable is POL4-IND-NEW-COINS-MAX-IND
   *
   * @param value
   */
  public void setPol4IndNewCoinsMaxInd(char[] value) {
    pol4IndNewCoinsMaxInd = checkPol4IndNewCoinsMaxIndConstraints(value);
    serializePol4IndNewCoinsMaxInd(pol4IndNewCoinsMaxInd);
  }

  /**
   * Update Pol4IndNewCoinsMaxInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4IndNewCoinsMaxInd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol4IndNewCoinsMaxInd,
        pol4IndNewCoinsMaxInd.length);
  }

  public void setPol4IndNewCoinsMaxInd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4IndNewCoinsMaxInd, pol4IndNewCoinsMaxInd.length);
  }

  /**
   * Update Pol4IndNewCoinsMaxInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4IndNewCoinsMaxInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4IndNewCoinsMaxInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4IndNewCoinsMaxInd with another Field
   *
   * @param value
   */
  public void setPol4IndNewCoinsMaxInd(Field source) {
    replace(
        source, 0, source.length(), beginPol4IndNewCoinsMaxInd, POL_4_IND_NEW_COINS_MAX_IND_LEN);
  }

  /**
   * Update Pol4IndNewCoinsMaxInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4IndNewCoinsMaxInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol4IndNewCoinsMaxInd,
        POL_4_IND_NEW_COINS_MAX_IND_LEN);
  }

  /**
   * Update Pol4IndNewCoinsMaxInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4IndNewCoinsMaxInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4IndNewCoinsMaxInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4IndNewCoinsMaxPd
   *
   * @return pol4IndNewCoinsMaxPd
   */
  public char[] getPol4IndNewCoinsMaxPd() throws CFException {
    if (isPol4IndNewCoinsMaxPdModified()) {
      pol4IndNewCoinsMaxPd = refreshPol4IndNewCoinsMaxPd();
    }
    return pol4IndNewCoinsMaxPd;
  }

  /**
   * set variable pol4IndNewCoinsMaxPd Corresponding COBOL Variable is POL4-IND-NEW-COINS-MAX-PD
   *
   * @param value
   */
  public void setPol4IndNewCoinsMaxPd(char[] value) {
    pol4IndNewCoinsMaxPd = checkPol4IndNewCoinsMaxPdConstraints(value);
    serializePol4IndNewCoinsMaxPd(pol4IndNewCoinsMaxPd);
  }

  /**
   * Update Pol4IndNewCoinsMaxPd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4IndNewCoinsMaxPd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol4IndNewCoinsMaxPd, pol4IndNewCoinsMaxPd.length);
  }

  public void setPol4IndNewCoinsMaxPd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4IndNewCoinsMaxPd, pol4IndNewCoinsMaxPd.length);
  }

  /**
   * Update Pol4IndNewCoinsMaxPd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4IndNewCoinsMaxPd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4IndNewCoinsMaxPd + targetIndex, targetLen);
  }

  /**
   * Update Pol4IndNewCoinsMaxPd with another Field
   *
   * @param value
   */
  public void setPol4IndNewCoinsMaxPd(Field source) {
    replace(source, 0, source.length(), beginPol4IndNewCoinsMaxPd, POL_4_IND_NEW_COINS_MAX_PD_LEN);
  }

  /**
   * Update Pol4IndNewCoinsMaxPd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4IndNewCoinsMaxPd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4IndNewCoinsMaxPd, POL_4_IND_NEW_COINS_MAX_PD_LEN);
  }

  /**
   * Update Pol4IndNewCoinsMaxPd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4IndNewCoinsMaxPd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4IndNewCoinsMaxPd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4CoinsCopayApplyInd
   *
   * @return pol4CoinsCopayApplyInd
   */
  public char[] getPol4CoinsCopayApplyInd() throws CFException {
    if (isPol4CoinsCopayApplyIndModified()) {
      pol4CoinsCopayApplyInd = refreshPol4CoinsCopayApplyInd();
    }
    return pol4CoinsCopayApplyInd;
  }

  /**
   * set variable pol4CoinsCopayApplyInd Corresponding COBOL Variable is POL4-COINS-COPAY-APPLY-IND
   *
   * @param value
   */
  public void setPol4CoinsCopayApplyInd(char[] value) {
    pol4CoinsCopayApplyInd = checkPol4CoinsCopayApplyIndConstraints(value);
    serializePol4CoinsCopayApplyInd(pol4CoinsCopayApplyInd);
  }

  /**
   * Update Pol4CoinsCopayApplyInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4CoinsCopayApplyInd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol4CoinsCopayApplyInd,
        pol4CoinsCopayApplyInd.length);
  }

  public void setPol4CoinsCopayApplyInd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4CoinsCopayApplyInd, pol4CoinsCopayApplyInd.length);
  }

  /**
   * Update Pol4CoinsCopayApplyInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4CoinsCopayApplyInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4CoinsCopayApplyInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4CoinsCopayApplyInd with another Field
   *
   * @param value
   */
  public void setPol4CoinsCopayApplyInd(Field source) {
    replace(
        source, 0, source.length(), beginPol4CoinsCopayApplyInd, POL_4_COINS_COPAY_APPLY_IND_LEN);
  }

  /**
   * Update Pol4CoinsCopayApplyInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4CoinsCopayApplyInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol4CoinsCopayApplyInd,
        POL_4_COINS_COPAY_APPLY_IND_LEN);
  }

  /**
   * Update Pol4CoinsCopayApplyInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4CoinsCopayApplyInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4CoinsCopayApplyInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4CopayMaxAmt
   *
   * @return pol4CopayMaxAmt
   */
  public BigDecimal getPol4CopayMaxAmt() throws CFException {
    if (isPol4CopayMaxAmtModified()) {
      pol4CopayMaxAmt = refreshPol4CopayMaxAmt();
    }
    return pol4CopayMaxAmt;
  }

  /**
   * Update Pol4CopayMaxAmt with the passed number Corresponding COBOL Variable is
   * POL4-COPAY-MAX-AMT
   *
   * @param number
   */
  public void setPol4CopayMaxAmt(BigDecimal number) {
    number = (number.signum() < 0) ? number.negate() : number; // Only positive number allowed
    pol4CopayMaxAmt = checkPol4CopayMaxAmtMaxLimit(number);
    serializePol4CopayMaxAmt(pol4CopayMaxAmt);
  }
  /**
   * Update Pol4CopayMaxAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4CopayMaxAmt(char[] value) throws CFException {
    pol4CopayMaxAmt = serializePol4CopayMaxAmt(value);
  }
  /**
   * Returns the value of pol4FamDedMaxInd
   *
   * @return pol4FamDedMaxInd
   */
  public char[] getPol4FamDedMaxInd() throws CFException {
    if (isPol4FamDedMaxIndModified()) {
      pol4FamDedMaxInd = refreshPol4FamDedMaxInd();
    }
    return pol4FamDedMaxInd;
  }

  /**
   * set variable pol4FamDedMaxInd Corresponding COBOL Variable is POL4-FAM-DED-MAX-IND
   *
   * @param value
   */
  public void setPol4FamDedMaxInd(char[] value) {
    pol4FamDedMaxInd = checkPol4FamDedMaxIndConstraints(value);
    serializePol4FamDedMaxInd(pol4FamDedMaxInd);
  }

  /**
   * Update Pol4FamDedMaxInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4FamDedMaxInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol4FamDedMaxInd, pol4FamDedMaxInd.length);
  }

  public void setPol4FamDedMaxInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4FamDedMaxInd, pol4FamDedMaxInd.length);
  }

  /**
   * Update Pol4FamDedMaxInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4FamDedMaxInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4FamDedMaxInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4FamDedMaxInd with another Field
   *
   * @param value
   */
  public void setPol4FamDedMaxInd(Field source) {
    replace(source, 0, source.length(), beginPol4FamDedMaxInd, POL_4_FAM_DED_MAX_IND_LEN);
  }

  /**
   * Update Pol4FamDedMaxInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4FamDedMaxInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4FamDedMaxInd, POL_4_FAM_DED_MAX_IND_LEN);
  }

  /**
   * Update Pol4FamDedMaxInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4FamDedMaxInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4FamDedMaxInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4OhbsProductCd
   *
   * @return pol4OhbsProductCd
   */
  public char[] getPol4OhbsProductCd() throws CFException {
    if (isPol4OhbsProductCdModified()) {
      pol4OhbsProductCd = refreshPol4OhbsProductCd();
    }
    return pol4OhbsProductCd;
  }

  /**
   * set variable pol4OhbsProductCd Corresponding COBOL Variable is POL4-OHBS-PRODUCT-CD
   *
   * @param value
   */
  public void setPol4OhbsProductCd(char[] value) {
    pol4OhbsProductCd = checkPol4OhbsProductCdConstraints(value);
    serializePol4OhbsProductCd(pol4OhbsProductCd);
  }

  /**
   * Update Pol4OhbsProductCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4OhbsProductCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol4OhbsProductCd, pol4OhbsProductCd.length);
  }

  public void setPol4OhbsProductCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4OhbsProductCd, pol4OhbsProductCd.length);
  }

  /**
   * Update Pol4OhbsProductCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4OhbsProductCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4OhbsProductCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4OhbsProductCd with another Field
   *
   * @param value
   */
  public void setPol4OhbsProductCd(Field source) {
    replace(source, 0, source.length(), beginPol4OhbsProductCd, POL_4_OHBS_PRODUCT_CD_LEN);
  }

  /**
   * Update Pol4OhbsProductCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4OhbsProductCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4OhbsProductCd, POL_4_OHBS_PRODUCT_CD_LEN);
  }

  /**
   * Update Pol4OhbsProductCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4OhbsProductCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4OhbsProductCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4TciTableNumber
   *
   * @return pol4TciTableNumber
   */
  public char[] getPol4TciTableNumber() throws CFException {
    if (isPol4TciTableNumberModified()) {
      pol4TciTableNumber = refreshPol4TciTableNumber();
    }
    return pol4TciTableNumber;
  }

  /**
   * set variable pol4TciTableNumber Corresponding COBOL Variable is POL4-TCI-TABLE-NUMBER
   *
   * @param value
   */
  public void setPol4TciTableNumber(char[] value) {
    pol4TciTableNumber = checkPol4TciTableNumberConstraints(value);
    serializePol4TciTableNumber(pol4TciTableNumber);
  }

  /**
   * Update Pol4TciTableNumber with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4TciTableNumber(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol4TciTableNumber, pol4TciTableNumber.length);
  }

  public void setPol4TciTableNumber(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4TciTableNumber, pol4TciTableNumber.length);
  }

  /**
   * Update Pol4TciTableNumber with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4TciTableNumber(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4TciTableNumber + targetIndex, targetLen);
  }

  /**
   * Update Pol4TciTableNumber with another Field
   *
   * @param value
   */
  public void setPol4TciTableNumber(Field source) {
    replace(source, 0, source.length(), beginPol4TciTableNumber, POL_4_TCI_TABLE_NUMBER_LEN);
  }

  /**
   * Update Pol4TciTableNumber with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4TciTableNumber(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4TciTableNumber, POL_4_TCI_TABLE_NUMBER_LEN);
  }

  /**
   * Update Pol4TciTableNumber with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4TciTableNumber(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4TciTableNumber + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4CapitationExclInd
   *
   * @return pol4CapitationExclInd
   */
  public char[] getPol4CapitationExclInd() throws CFException {
    if (isPol4CapitationExclIndModified()) {
      pol4CapitationExclInd = refreshPol4CapitationExclInd();
    }
    return pol4CapitationExclInd;
  }

  /**
   * set variable pol4CapitationExclInd Corresponding COBOL Variable is POL4-CAPITATION-EXCL-IND
   *
   * @param value
   */
  public void setPol4CapitationExclInd(char[] value) {
    pol4CapitationExclInd = checkPol4CapitationExclIndConstraints(value);
    serializePol4CapitationExclInd(pol4CapitationExclInd);
  }

  /**
   * Update Pol4CapitationExclInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4CapitationExclInd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol4CapitationExclInd,
        pol4CapitationExclInd.length);
  }

  public void setPol4CapitationExclInd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4CapitationExclInd, pol4CapitationExclInd.length);
  }

  /**
   * Update Pol4CapitationExclInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4CapitationExclInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4CapitationExclInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4CapitationExclInd with another Field
   *
   * @param value
   */
  public void setPol4CapitationExclInd(Field source) {
    replace(source, 0, source.length(), beginPol4CapitationExclInd, POL_4_CAPITATION_EXCL_IND_LEN);
  }

  /**
   * Update Pol4CapitationExclInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4CapitationExclInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4CapitationExclInd, POL_4_CAPITATION_EXCL_IND_LEN);
  }

  /**
   * Update Pol4CapitationExclInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4CapitationExclInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4CapitationExclInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4IndemnityInd
   *
   * @return pol4IndemnityInd
   */
  public char[] getPol4IndemnityInd() throws CFException {
    if (isPol4IndemnityIndModified()) {
      pol4IndemnityInd = refreshPol4IndemnityInd();
    }
    return pol4IndemnityInd;
  }

  /**
   * set variable pol4IndemnityInd Corresponding COBOL Variable is POL4-INDEMNITY-IND
   *
   * @param value
   */
  public void setPol4IndemnityInd(char[] value) {
    pol4IndemnityInd = checkPol4IndemnityIndConstraints(value);
    serializePol4IndemnityInd(pol4IndemnityInd);
  }

  /**
   * Update Pol4IndemnityInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4IndemnityInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol4IndemnityInd, pol4IndemnityInd.length);
  }

  public void setPol4IndemnityInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4IndemnityInd, pol4IndemnityInd.length);
  }

  /**
   * Update Pol4IndemnityInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4IndemnityInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4IndemnityInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4IndemnityInd with another Field
   *
   * @param value
   */
  public void setPol4IndemnityInd(Field source) {
    replace(source, 0, source.length(), beginPol4IndemnityInd, POL_4_INDEMNITY_IND_LEN);
  }

  /**
   * Update Pol4IndemnityInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4IndemnityInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4IndemnityInd, POL_4_INDEMNITY_IND_LEN);
  }

  /**
   * Update Pol4IndemnityInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4IndemnityInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4IndemnityInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4AnnualRCInd
   *
   * @return pol4AnnualRCInd
   */
  public char[] getPol4AnnualRCInd() throws CFException {
    if (isPol4AnnualRCIndModified()) {
      pol4AnnualRCInd = refreshPol4AnnualRCInd();
    }
    return pol4AnnualRCInd;
  }

  /**
   * set variable pol4AnnualRCInd Corresponding COBOL Variable is POL4-ANNUAL-R-C-IND
   *
   * @param value
   */
  public void setPol4AnnualRCInd(char[] value) {
    pol4AnnualRCInd = checkPol4AnnualRCIndConstraints(value);
    serializePol4AnnualRCInd(pol4AnnualRCInd);
  }

  /**
   * Update Pol4AnnualRCInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4AnnualRCInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol4AnnualRCInd, pol4AnnualRCInd.length);
  }

  public void setPol4AnnualRCInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4AnnualRCInd, pol4AnnualRCInd.length);
  }

  /**
   * Update Pol4AnnualRCInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4AnnualRCInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4AnnualRCInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4AnnualRCInd with another Field
   *
   * @param value
   */
  public void setPol4AnnualRCInd(Field source) {
    replace(source, 0, source.length(), beginPol4AnnualRCInd, POL_4_ANNUAL_RCIND_LEN);
  }

  /**
   * Update Pol4AnnualRCInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4AnnualRCInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4AnnualRCInd, POL_4_ANNUAL_RCIND_LEN);
  }

  /**
   * Update Pol4AnnualRCInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4AnnualRCInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4AnnualRCInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4DefaultRCPercent
   *
   * @return pol4DefaultRCPercent
   */
  public char[] getPol4DefaultRCPercent() throws CFException {
    if (isPol4DefaultRCPercentModified()) {
      pol4DefaultRCPercent = refreshPol4DefaultRCPercent();
    }
    return pol4DefaultRCPercent;
  }

  /**
   * set variable pol4DefaultRCPercent Corresponding COBOL Variable is POL4-DEFAULT-R-C-PERCENT
   *
   * @param value
   */
  public void setPol4DefaultRCPercent(char[] value) {
    pol4DefaultRCPercent = checkPol4DefaultRCPercentConstraints(value);
    serializePol4DefaultRCPercent(pol4DefaultRCPercent);
  }

  /**
   * Update Pol4DefaultRCPercent with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4DefaultRCPercent(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol4DefaultRCPercent, pol4DefaultRCPercent.length);
  }

  public void setPol4DefaultRCPercent(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4DefaultRCPercent, pol4DefaultRCPercent.length);
  }

  /**
   * Update Pol4DefaultRCPercent with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4DefaultRCPercent(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4DefaultRCPercent + targetIndex, targetLen);
  }

  /**
   * Update Pol4DefaultRCPercent with another Field
   *
   * @param value
   */
  public void setPol4DefaultRCPercent(Field source) {
    replace(source, 0, source.length(), beginPol4DefaultRCPercent, POL_4_DEFAULT_RCPERCENT_LEN);
  }

  /**
   * Update Pol4DefaultRCPercent with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4DefaultRCPercent(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4DefaultRCPercent, POL_4_DEFAULT_RCPERCENT_LEN);
  }

  /**
   * Update Pol4DefaultRCPercent with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4DefaultRCPercent(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4DefaultRCPercent + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4FacSharedSavInd
   *
   * @return pol4FacSharedSavInd
   */
  public char[] getPol4FacSharedSavInd() throws CFException {
    if (isPol4FacSharedSavIndModified()) {
      pol4FacSharedSavInd = refreshPol4FacSharedSavInd();
    }
    return pol4FacSharedSavInd;
  }

  /**
   * set variable pol4FacSharedSavInd Corresponding COBOL Variable is POL4-FAC-SHARED-SAV-IND
   *
   * @param value
   */
  public void setPol4FacSharedSavInd(char[] value) {
    pol4FacSharedSavInd = checkPol4FacSharedSavIndConstraints(value);
    serializePol4FacSharedSavInd(pol4FacSharedSavInd);
  }

  /**
   * Update Pol4FacSharedSavInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4FacSharedSavInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol4FacSharedSavInd, pol4FacSharedSavInd.length);
  }

  public void setPol4FacSharedSavInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4FacSharedSavInd, pol4FacSharedSavInd.length);
  }

  /**
   * Update Pol4FacSharedSavInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4FacSharedSavInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4FacSharedSavInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4FacSharedSavInd with another Field
   *
   * @param value
   */
  public void setPol4FacSharedSavInd(Field source) {
    replace(source, 0, source.length(), beginPol4FacSharedSavInd, POL_4_FAC_SHARED_SAV_IND_LEN);
  }

  /**
   * Update Pol4FacSharedSavInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4FacSharedSavInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4FacSharedSavInd, POL_4_FAC_SHARED_SAV_IND_LEN);
  }

  /**
   * Update Pol4FacSharedSavInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4FacSharedSavInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4FacSharedSavInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4PhysSharedSavInd
   *
   * @return pol4PhysSharedSavInd
   */
  public char[] getPol4PhysSharedSavInd() throws CFException {
    if (isPol4PhysSharedSavIndModified()) {
      pol4PhysSharedSavInd = refreshPol4PhysSharedSavInd();
    }
    return pol4PhysSharedSavInd;
  }

  /**
   * set variable pol4PhysSharedSavInd Corresponding COBOL Variable is POL4-PHYS-SHARED-SAV-IND
   *
   * @param value
   */
  public void setPol4PhysSharedSavInd(char[] value) {
    pol4PhysSharedSavInd = checkPol4PhysSharedSavIndConstraints(value);
    serializePol4PhysSharedSavInd(pol4PhysSharedSavInd);
  }

  /**
   * Update Pol4PhysSharedSavInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4PhysSharedSavInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol4PhysSharedSavInd, pol4PhysSharedSavInd.length);
  }

  public void setPol4PhysSharedSavInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4PhysSharedSavInd, pol4PhysSharedSavInd.length);
  }

  /**
   * Update Pol4PhysSharedSavInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4PhysSharedSavInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4PhysSharedSavInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4PhysSharedSavInd with another Field
   *
   * @param value
   */
  public void setPol4PhysSharedSavInd(Field source) {
    replace(source, 0, source.length(), beginPol4PhysSharedSavInd, POL_4_PHYS_SHARED_SAV_IND_LEN);
  }

  /**
   * Update Pol4PhysSharedSavInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4PhysSharedSavInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4PhysSharedSavInd, POL_4_PHYS_SHARED_SAV_IND_LEN);
  }

  /**
   * Update Pol4PhysSharedSavInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4PhysSharedSavInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4PhysSharedSavInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4PlanFeatures
   *
   * @return pol4PlanFeatures
   */
  public char[] getPol4PlanFeatures() throws CFException {
    if (isPol4PlanFeaturesModified()) {
      pol4PlanFeatures = refreshPol4PlanFeatures();
    }
    return pol4PlanFeatures;
  }

  /**
   * set variable pol4PlanFeatures Corresponding COBOL Variable is POL4-PLAN-FEATURES
   *
   * @param value
   */
  public void setPol4PlanFeatures(char[] value) {
    pol4PlanFeatures = checkPol4PlanFeaturesConstraints(value);
    serializePol4PlanFeatures(pol4PlanFeatures);
  }

  /**
   * Update Pol4PlanFeatures with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4PlanFeatures(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol4PlanFeatures, pol4PlanFeatures.length);
  }

  public void setPol4PlanFeatures(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4PlanFeatures, pol4PlanFeatures.length);
  }

  /**
   * Update Pol4PlanFeatures with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4PlanFeatures(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4PlanFeatures + targetIndex, targetLen);
  }

  /**
   * Update Pol4PlanFeatures with another Field
   *
   * @param value
   */
  public void setPol4PlanFeatures(Field source) {
    replace(source, 0, source.length(), beginPol4PlanFeatures, POL_4_PLAN_FEATURES_LEN);
  }

  /**
   * Update Pol4PlanFeatures with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4PlanFeatures(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4PlanFeatures, POL_4_PLAN_FEATURES_LEN);
  }

  /**
   * Update Pol4PlanFeatures with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4PlanFeatures(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4PlanFeatures + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4PlanFeaturesInd
   *
   * @return pol4PlanFeaturesInd
   */
  public char[] getPol4PlanFeaturesInd() throws CFException {
    if (isPol4PlanFeaturesIndModified()) {
      pol4PlanFeaturesInd = refreshPol4PlanFeaturesInd();
    }
    return pol4PlanFeaturesInd;
  }

  /**
   * set variable pol4PlanFeaturesInd Corresponding COBOL Variable is POL4-PLAN-FEATURES-IND
   *
   * @param value
   */
  public void setPol4PlanFeaturesInd(char[] value) {
    pol4PlanFeaturesInd = checkPol4PlanFeaturesIndConstraints(value);
    serializePol4PlanFeaturesInd(pol4PlanFeaturesInd);
  }

  /**
   * Update Pol4PlanFeaturesInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4PlanFeaturesInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol4PlanFeaturesInd, pol4PlanFeaturesInd.length);
  }

  public void setPol4PlanFeaturesInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4PlanFeaturesInd, pol4PlanFeaturesInd.length);
  }

  /**
   * Update Pol4PlanFeaturesInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4PlanFeaturesInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4PlanFeaturesInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4PlanFeaturesInd with another Field
   *
   * @param value
   */
  public void setPol4PlanFeaturesInd(Field source) {
    replace(source, 0, source.length(), beginPol4PlanFeaturesInd, POL_4_PLAN_FEATURES_IND_LEN);
  }

  /**
   * Update Pol4PlanFeaturesInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4PlanFeaturesInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4PlanFeaturesInd, POL_4_PLAN_FEATURES_IND_LEN);
  }

  /**
   * Update Pol4PlanFeaturesInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4PlanFeaturesInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4PlanFeaturesInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4AllncCd
   *
   * @return pol4AllncCd
   */
  public char[] getPol4AllncCd() throws CFException {
    if (isPol4AllncCdModified()) {
      pol4AllncCd = refreshPol4AllncCd();
    }
    return pol4AllncCd;
  }

  /**
   * set variable pol4AllncCd Corresponding COBOL Variable is POL4-ALLNC-CD
   *
   * @param value
   */
  public void setPol4AllncCd(char[] value) {
    pol4AllncCd = checkPol4AllncCdConstraints(value);
    serializePol4AllncCd(pol4AllncCd);
  }

  /**
   * Update Pol4AllncCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4AllncCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol4AllncCd, pol4AllncCd.length);
  }

  public void setPol4AllncCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4AllncCd, pol4AllncCd.length);
  }

  /**
   * Update Pol4AllncCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4AllncCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4AllncCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4AllncCd with another Field
   *
   * @param value
   */
  public void setPol4AllncCd(Field source) {
    replace(source, 0, source.length(), beginPol4AllncCd, POL_4_ALLNC_CD_LEN);
  }

  /**
   * Update Pol4AllncCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4AllncCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4AllncCd, POL_4_ALLNC_CD_LEN);
  }

  /**
   * Update Pol4AllncCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4AllncCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4AllncCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4FundTypCd
   *
   * @return pol4FundTypCd
   */
  public char[] getPol4FundTypCd() throws CFException {
    if (isPol4FundTypCdModified()) {
      pol4FundTypCd = refreshPol4FundTypCd();
    }
    return pol4FundTypCd;
  }

  /**
   * set variable pol4FundTypCd Corresponding COBOL Variable is POL4-FUND-TYP-CD
   *
   * @param value
   */
  public void setPol4FundTypCd(char[] value) {
    pol4FundTypCd = checkPol4FundTypCdConstraints(value);
    serializePol4FundTypCd(pol4FundTypCd);
  }

  /**
   * Update Pol4FundTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4FundTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol4FundTypCd, pol4FundTypCd.length);
  }

  public void setPol4FundTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4FundTypCd, pol4FundTypCd.length);
  }

  /**
   * Update Pol4FundTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4FundTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4FundTypCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4FundTypCd with another Field
   *
   * @param value
   */
  public void setPol4FundTypCd(Field source) {
    replace(source, 0, source.length(), beginPol4FundTypCd, POL_4_FUND_TYP_CD_LEN);
  }

  /**
   * Update Pol4FundTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4FundTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4FundTypCd, POL_4_FUND_TYP_CD_LEN);
  }

  /**
   * Update Pol4FundTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4FundTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4FundTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4PrdctCdId
   *
   * @return pol4PrdctCdId
   */
  public char[] getPol4PrdctCdId() throws CFException {
    if (isPol4PrdctCdIdModified()) {
      pol4PrdctCdId = refreshPol4PrdctCdId();
    }
    return pol4PrdctCdId;
  }

  /**
   * set variable pol4PrdctCdId Corresponding COBOL Variable is POL4-PRDCT-CD-ID
   *
   * @param value
   */
  public void setPol4PrdctCdId(char[] value) {
    pol4PrdctCdId = checkPol4PrdctCdIdConstraints(value);
    serializePol4PrdctCdId(pol4PrdctCdId);
  }

  /**
   * Update Pol4PrdctCdId with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4PrdctCdId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol4PrdctCdId, pol4PrdctCdId.length);
  }

  public void setPol4PrdctCdId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4PrdctCdId, pol4PrdctCdId.length);
  }

  /**
   * Update Pol4PrdctCdId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4PrdctCdId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4PrdctCdId + targetIndex, targetLen);
  }

  /**
   * Update Pol4PrdctCdId with another Field
   *
   * @param value
   */
  public void setPol4PrdctCdId(Field source) {
    replace(source, 0, source.length(), beginPol4PrdctCdId, POL_4_PRDCT_CD_ID_LEN);
  }

  /**
   * Update Pol4PrdctCdId with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4PrdctCdId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4PrdctCdId, POL_4_PRDCT_CD_ID_LEN);
  }

  /**
   * Update Pol4PrdctCdId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4PrdctCdId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4PrdctCdId + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4EmergentWrapInd
   *
   * @return pol4EmergentWrapInd
   */
  public char[] getPol4EmergentWrapInd() throws CFException {
    if (isPol4EmergentWrapIndModified()) {
      pol4EmergentWrapInd = refreshPol4EmergentWrapInd();
    }
    return pol4EmergentWrapInd;
  }

  /**
   * set variable pol4EmergentWrapInd Corresponding COBOL Variable is POL4-EMERGENT-WRAP-IND
   *
   * @param value
   */
  public void setPol4EmergentWrapInd(char[] value) {
    pol4EmergentWrapInd = checkPol4EmergentWrapIndConstraints(value);
    serializePol4EmergentWrapInd(pol4EmergentWrapInd);
  }

  /**
   * Update Pol4EmergentWrapInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4EmergentWrapInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol4EmergentWrapInd, pol4EmergentWrapInd.length);
  }

  public void setPol4EmergentWrapInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4EmergentWrapInd, pol4EmergentWrapInd.length);
  }

  /**
   * Update Pol4EmergentWrapInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4EmergentWrapInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4EmergentWrapInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4EmergentWrapInd with another Field
   *
   * @param value
   */
  public void setPol4EmergentWrapInd(Field source) {
    replace(source, 0, source.length(), beginPol4EmergentWrapInd, POL_4_EMERGENT_WRAP_IND_LEN);
  }

  /**
   * Update Pol4EmergentWrapInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4EmergentWrapInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4EmergentWrapInd, POL_4_EMERGENT_WRAP_IND_LEN);
  }

  /**
   * Update Pol4EmergentWrapInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4EmergentWrapInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4EmergentWrapInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetOopMaxCovCd
   *
   * @return pol4RetOopMaxCovCd
   */
  public char[] getPol4RetOopMaxCovCd() throws CFException {
    if (isPol4RetOopMaxCovCdModified()) {
      pol4RetOopMaxCovCd = refreshPol4RetOopMaxCovCd();
    }
    return pol4RetOopMaxCovCd;
  }

  /**
   * set variable pol4RetOopMaxCovCd Corresponding COBOL Variable is POL4-RET-OOP-MAX-COV-CD
   *
   * @param value
   */
  public void setPol4RetOopMaxCovCd(char[] value) {
    pol4RetOopMaxCovCd = checkPol4RetOopMaxCovCdConstraints(value);
    serializePol4RetOopMaxCovCd(pol4RetOopMaxCovCd);
  }

  /**
   * Update Pol4RetOopMaxCovCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetOopMaxCovCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol4RetOopMaxCovCd, pol4RetOopMaxCovCd.length);
  }

  public void setPol4RetOopMaxCovCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetOopMaxCovCd, pol4RetOopMaxCovCd.length);
  }

  /**
   * Update Pol4RetOopMaxCovCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetOopMaxCovCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetOopMaxCovCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetOopMaxCovCd with another Field
   *
   * @param value
   */
  public void setPol4RetOopMaxCovCd(Field source) {
    replace(source, 0, source.length(), beginPol4RetOopMaxCovCd, POL_4_RET_OOP_MAX_COV_CD_LEN);
  }

  /**
   * Update Pol4RetOopMaxCovCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetOopMaxCovCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetOopMaxCovCd, POL_4_RET_OOP_MAX_COV_CD_LEN);
  }

  /**
   * Update Pol4RetOopMaxCovCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetOopMaxCovCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetOopMaxCovCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4SpecialProcessCd6
   *
   * @return pol4SpecialProcessCd6
   */
  public char[] getPol4SpecialProcessCd6() throws CFException {
    if (isPol4SpecialProcessCd6Modified()) {
      pol4SpecialProcessCd6 = refreshPol4SpecialProcessCd6();
    }
    return pol4SpecialProcessCd6;
  }

  /**
   * set variable pol4SpecialProcessCd6 Corresponding COBOL Variable is POL4-SPECIAL-PROCESS-CD-6
   *
   * @param value
   */
  public void setPol4SpecialProcessCd6(char[] value) {
    pol4SpecialProcessCd6 = checkPol4SpecialProcessCd6Constraints(value);
    serializePol4SpecialProcessCd6(pol4SpecialProcessCd6);
  }

  /**
   * Update Pol4SpecialProcessCd6 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4SpecialProcessCd6(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol4SpecialProcessCd6,
        pol4SpecialProcessCd6.length);
  }

  public void setPol4SpecialProcessCd6(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4SpecialProcessCd6, pol4SpecialProcessCd6.length);
  }

  /**
   * Update Pol4SpecialProcessCd6 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4SpecialProcessCd6(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4SpecialProcessCd6 + targetIndex, targetLen);
  }

  /**
   * Update Pol4SpecialProcessCd6 with another Field
   *
   * @param value
   */
  public void setPol4SpecialProcessCd6(Field source) {
    replace(source, 0, source.length(), beginPol4SpecialProcessCd6, POL_4_SPECIAL_PROCESS_CD_6_LEN);
  }

  /**
   * Update Pol4SpecialProcessCd6 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4SpecialProcessCd6(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4SpecialProcessCd6, POL_4_SPECIAL_PROCESS_CD_6_LEN);
  }

  /**
   * Update Pol4SpecialProcessCd6 with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4SpecialProcessCd6(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4SpecialProcessCd6 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4SpecialProcessCd1
   *
   * @return pol4SpecialProcessCd1
   */
  public char[] getPol4SpecialProcessCd1() throws CFException {
    if (isPol4SpecialProcessCd1Modified()) {
      pol4SpecialProcessCd1 = refreshPol4SpecialProcessCd1();
    }
    return pol4SpecialProcessCd1;
  }

  /**
   * set variable pol4SpecialProcessCd1 Corresponding COBOL Variable is POL4-SPECIAL-PROCESS-CD-1
   *
   * @param value
   */
  public void setPol4SpecialProcessCd1(char[] value) {
    pol4SpecialProcessCd1 = checkPol4SpecialProcessCd1Constraints(value);
    serializePol4SpecialProcessCd1(pol4SpecialProcessCd1);
  }

  /**
   * Update Pol4SpecialProcessCd1 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4SpecialProcessCd1(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol4SpecialProcessCd1,
        pol4SpecialProcessCd1.length);
  }

  public void setPol4SpecialProcessCd1(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4SpecialProcessCd1, pol4SpecialProcessCd1.length);
  }

  /**
   * Update Pol4SpecialProcessCd1 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4SpecialProcessCd1(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4SpecialProcessCd1 + targetIndex, targetLen);
  }

  /**
   * Update Pol4SpecialProcessCd1 with another Field
   *
   * @param value
   */
  public void setPol4SpecialProcessCd1(Field source) {
    replace(source, 0, source.length(), beginPol4SpecialProcessCd1, POL_4_SPECIAL_PROCESS_CD_1_LEN);
  }

  /**
   * Update Pol4SpecialProcessCd1 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4SpecialProcessCd1(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4SpecialProcessCd1, POL_4_SPECIAL_PROCESS_CD_1_LEN);
  }

  /**
   * Update Pol4SpecialProcessCd1 with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4SpecialProcessCd1(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4SpecialProcessCd1 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4SpecialProcessCd2
   *
   * @return pol4SpecialProcessCd2
   */
  public char[] getPol4SpecialProcessCd2() throws CFException {
    if (isPol4SpecialProcessCd2Modified()) {
      pol4SpecialProcessCd2 = refreshPol4SpecialProcessCd2();
    }
    return pol4SpecialProcessCd2;
  }

  /**
   * set variable pol4SpecialProcessCd2 Corresponding COBOL Variable is POL4-SPECIAL-PROCESS-CD-2
   *
   * @param value
   */
  public void setPol4SpecialProcessCd2(char[] value) {
    pol4SpecialProcessCd2 = checkPol4SpecialProcessCd2Constraints(value);
    serializePol4SpecialProcessCd2(pol4SpecialProcessCd2);
  }

  /**
   * Update Pol4SpecialProcessCd2 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4SpecialProcessCd2(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol4SpecialProcessCd2,
        pol4SpecialProcessCd2.length);
  }

  public void setPol4SpecialProcessCd2(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4SpecialProcessCd2, pol4SpecialProcessCd2.length);
  }

  /**
   * Update Pol4SpecialProcessCd2 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4SpecialProcessCd2(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4SpecialProcessCd2 + targetIndex, targetLen);
  }

  /**
   * Update Pol4SpecialProcessCd2 with another Field
   *
   * @param value
   */
  public void setPol4SpecialProcessCd2(Field source) {
    replace(source, 0, source.length(), beginPol4SpecialProcessCd2, POL_4_SPECIAL_PROCESS_CD_2_LEN);
  }

  /**
   * Update Pol4SpecialProcessCd2 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4SpecialProcessCd2(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4SpecialProcessCd2, POL_4_SPECIAL_PROCESS_CD_2_LEN);
  }

  /**
   * Update Pol4SpecialProcessCd2 with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4SpecialProcessCd2(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4SpecialProcessCd2 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4SpecialProcessCd4
   *
   * @return pol4SpecialProcessCd4
   */
  public char[] getPol4SpecialProcessCd4() throws CFException {
    if (isPol4SpecialProcessCd4Modified()) {
      pol4SpecialProcessCd4 = refreshPol4SpecialProcessCd4();
    }
    return pol4SpecialProcessCd4;
  }

  /**
   * set variable pol4SpecialProcessCd4 Corresponding COBOL Variable is POL4-SPECIAL-PROCESS-CD-4
   *
   * @param value
   */
  public void setPol4SpecialProcessCd4(char[] value) {
    pol4SpecialProcessCd4 = checkPol4SpecialProcessCd4Constraints(value);
    serializePol4SpecialProcessCd4(pol4SpecialProcessCd4);
  }

  /**
   * Update Pol4SpecialProcessCd4 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4SpecialProcessCd4(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol4SpecialProcessCd4,
        pol4SpecialProcessCd4.length);
  }

  public void setPol4SpecialProcessCd4(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4SpecialProcessCd4, pol4SpecialProcessCd4.length);
  }

  /**
   * Update Pol4SpecialProcessCd4 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4SpecialProcessCd4(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4SpecialProcessCd4 + targetIndex, targetLen);
  }

  /**
   * Update Pol4SpecialProcessCd4 with another Field
   *
   * @param value
   */
  public void setPol4SpecialProcessCd4(Field source) {
    replace(source, 0, source.length(), beginPol4SpecialProcessCd4, POL_4_SPECIAL_PROCESS_CD_4_LEN);
  }

  /**
   * Update Pol4SpecialProcessCd4 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4SpecialProcessCd4(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4SpecialProcessCd4, POL_4_SPECIAL_PROCESS_CD_4_LEN);
  }

  /**
   * Update Pol4SpecialProcessCd4 with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4SpecialProcessCd4(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4SpecialProcessCd4 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4SpecialProcessCd5
   *
   * @return pol4SpecialProcessCd5
   */
  public char[] getPol4SpecialProcessCd5() throws CFException {
    if (isPol4SpecialProcessCd5Modified()) {
      pol4SpecialProcessCd5 = refreshPol4SpecialProcessCd5();
    }
    return pol4SpecialProcessCd5;
  }

  /**
   * set variable pol4SpecialProcessCd5 Corresponding COBOL Variable is POL4-SPECIAL-PROCESS-CD-5
   *
   * @param value
   */
  public void setPol4SpecialProcessCd5(char[] value) {
    pol4SpecialProcessCd5 = checkPol4SpecialProcessCd5Constraints(value);
    serializePol4SpecialProcessCd5(pol4SpecialProcessCd5);
  }

  /**
   * Update Pol4SpecialProcessCd5 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4SpecialProcessCd5(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol4SpecialProcessCd5,
        pol4SpecialProcessCd5.length);
  }

  public void setPol4SpecialProcessCd5(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4SpecialProcessCd5, pol4SpecialProcessCd5.length);
  }

  /**
   * Update Pol4SpecialProcessCd5 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4SpecialProcessCd5(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4SpecialProcessCd5 + targetIndex, targetLen);
  }

  /**
   * Update Pol4SpecialProcessCd5 with another Field
   *
   * @param value
   */
  public void setPol4SpecialProcessCd5(Field source) {
    replace(source, 0, source.length(), beginPol4SpecialProcessCd5, POL_4_SPECIAL_PROCESS_CD_5_LEN);
  }

  /**
   * Update Pol4SpecialProcessCd5 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4SpecialProcessCd5(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4SpecialProcessCd5, POL_4_SPECIAL_PROCESS_CD_5_LEN);
  }

  /**
   * Update Pol4SpecialProcessCd5 with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4SpecialProcessCd5(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4SpecialProcessCd5 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4SpecialProcessCd7
   *
   * @return pol4SpecialProcessCd7
   */
  public char[] getPol4SpecialProcessCd7() throws CFException {
    if (isPol4SpecialProcessCd7Modified()) {
      pol4SpecialProcessCd7 = refreshPol4SpecialProcessCd7();
    }
    return pol4SpecialProcessCd7;
  }

  /**
   * set variable pol4SpecialProcessCd7 Corresponding COBOL Variable is POL4-SPECIAL-PROCESS-CD-7
   *
   * @param value
   */
  public void setPol4SpecialProcessCd7(char[] value) {
    pol4SpecialProcessCd7 = checkPol4SpecialProcessCd7Constraints(value);
    serializePol4SpecialProcessCd7(pol4SpecialProcessCd7);
  }

  /**
   * Update Pol4SpecialProcessCd7 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4SpecialProcessCd7(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol4SpecialProcessCd7,
        pol4SpecialProcessCd7.length);
  }

  public void setPol4SpecialProcessCd7(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4SpecialProcessCd7, pol4SpecialProcessCd7.length);
  }

  /**
   * Update Pol4SpecialProcessCd7 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4SpecialProcessCd7(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4SpecialProcessCd7 + targetIndex, targetLen);
  }

  /**
   * Update Pol4SpecialProcessCd7 with another Field
   *
   * @param value
   */
  public void setPol4SpecialProcessCd7(Field source) {
    replace(source, 0, source.length(), beginPol4SpecialProcessCd7, POL_4_SPECIAL_PROCESS_CD_7_LEN);
  }

  /**
   * Update Pol4SpecialProcessCd7 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4SpecialProcessCd7(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4SpecialProcessCd7, POL_4_SPECIAL_PROCESS_CD_7_LEN);
  }

  /**
   * Update Pol4SpecialProcessCd7 with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4SpecialProcessCd7(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4SpecialProcessCd7 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4SpecialProcessCd8
   *
   * @return pol4SpecialProcessCd8
   */
  public char[] getPol4SpecialProcessCd8() throws CFException {
    if (isPol4SpecialProcessCd8Modified()) {
      pol4SpecialProcessCd8 = refreshPol4SpecialProcessCd8();
    }
    return pol4SpecialProcessCd8;
  }

  /**
   * set variable pol4SpecialProcessCd8 Corresponding COBOL Variable is POL4-SPECIAL-PROCESS-CD-8
   *
   * @param value
   */
  public void setPol4SpecialProcessCd8(char[] value) {
    pol4SpecialProcessCd8 = checkPol4SpecialProcessCd8Constraints(value);
    serializePol4SpecialProcessCd8(pol4SpecialProcessCd8);
  }

  /**
   * Update Pol4SpecialProcessCd8 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4SpecialProcessCd8(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol4SpecialProcessCd8,
        pol4SpecialProcessCd8.length);
  }

  public void setPol4SpecialProcessCd8(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4SpecialProcessCd8, pol4SpecialProcessCd8.length);
  }

  /**
   * Update Pol4SpecialProcessCd8 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4SpecialProcessCd8(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4SpecialProcessCd8 + targetIndex, targetLen);
  }

  /**
   * Update Pol4SpecialProcessCd8 with another Field
   *
   * @param value
   */
  public void setPol4SpecialProcessCd8(Field source) {
    replace(source, 0, source.length(), beginPol4SpecialProcessCd8, POL_4_SPECIAL_PROCESS_CD_8_LEN);
  }

  /**
   * Update Pol4SpecialProcessCd8 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4SpecialProcessCd8(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4SpecialProcessCd8, POL_4_SPECIAL_PROCESS_CD_8_LEN);
  }

  /**
   * Update Pol4SpecialProcessCd8 with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4SpecialProcessCd8(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4SpecialProcessCd8 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4SpecialProcessCd9
   *
   * @return pol4SpecialProcessCd9
   */
  public char[] getPol4SpecialProcessCd9() throws CFException {
    if (isPol4SpecialProcessCd9Modified()) {
      pol4SpecialProcessCd9 = refreshPol4SpecialProcessCd9();
    }
    return pol4SpecialProcessCd9;
  }

  /**
   * set variable pol4SpecialProcessCd9 Corresponding COBOL Variable is POL4-SPECIAL-PROCESS-CD-9
   *
   * @param value
   */
  public void setPol4SpecialProcessCd9(char[] value) {
    pol4SpecialProcessCd9 = checkPol4SpecialProcessCd9Constraints(value);
    serializePol4SpecialProcessCd9(pol4SpecialProcessCd9);
  }

  /**
   * Update Pol4SpecialProcessCd9 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4SpecialProcessCd9(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol4SpecialProcessCd9,
        pol4SpecialProcessCd9.length);
  }

  public void setPol4SpecialProcessCd9(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4SpecialProcessCd9, pol4SpecialProcessCd9.length);
  }

  /**
   * Update Pol4SpecialProcessCd9 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4SpecialProcessCd9(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4SpecialProcessCd9 + targetIndex, targetLen);
  }

  /**
   * Update Pol4SpecialProcessCd9 with another Field
   *
   * @param value
   */
  public void setPol4SpecialProcessCd9(Field source) {
    replace(source, 0, source.length(), beginPol4SpecialProcessCd9, POL_4_SPECIAL_PROCESS_CD_9_LEN);
  }

  /**
   * Update Pol4SpecialProcessCd9 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4SpecialProcessCd9(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4SpecialProcessCd9, POL_4_SPECIAL_PROCESS_CD_9_LEN);
  }

  /**
   * Update Pol4SpecialProcessCd9 with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4SpecialProcessCd9(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4SpecialProcessCd9 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4SpecialProcessCd10
   *
   * @return pol4SpecialProcessCd10
   */
  public char[] getPol4SpecialProcessCd10() throws CFException {
    if (isPol4SpecialProcessCd10Modified()) {
      pol4SpecialProcessCd10 = refreshPol4SpecialProcessCd10();
    }
    return pol4SpecialProcessCd10;
  }

  /**
   * set variable pol4SpecialProcessCd10 Corresponding COBOL Variable is POL4-SPECIAL-PROCESS-CD-10
   *
   * @param value
   */
  public void setPol4SpecialProcessCd10(char[] value) {
    pol4SpecialProcessCd10 = checkPol4SpecialProcessCd10Constraints(value);
    serializePol4SpecialProcessCd10(pol4SpecialProcessCd10);
  }

  /**
   * Update Pol4SpecialProcessCd10 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4SpecialProcessCd10(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol4SpecialProcessCd10,
        pol4SpecialProcessCd10.length);
  }

  public void setPol4SpecialProcessCd10(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4SpecialProcessCd10, pol4SpecialProcessCd10.length);
  }

  /**
   * Update Pol4SpecialProcessCd10 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4SpecialProcessCd10(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4SpecialProcessCd10 + targetIndex, targetLen);
  }

  /**
   * Update Pol4SpecialProcessCd10 with another Field
   *
   * @param value
   */
  public void setPol4SpecialProcessCd10(Field source) {
    replace(
        source, 0, source.length(), beginPol4SpecialProcessCd10, POL_4_SPECIAL_PROCESS_CD_10_LEN);
  }

  /**
   * Update Pol4SpecialProcessCd10 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4SpecialProcessCd10(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol4SpecialProcessCd10,
        POL_4_SPECIAL_PROCESS_CD_10_LEN);
  }

  /**
   * Update Pol4SpecialProcessCd10 with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4SpecialProcessCd10(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4SpecialProcessCd10 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4IndCoreMaxInd
   *
   * @return pol4IndCoreMaxInd
   */
  public char[] getPol4IndCoreMaxInd() throws CFException {
    if (isPol4IndCoreMaxIndModified()) {
      pol4IndCoreMaxInd = refreshPol4IndCoreMaxInd();
    }
    return pol4IndCoreMaxInd;
  }

  /**
   * set variable pol4IndCoreMaxInd Corresponding COBOL Variable is POL4-IND-CORE-MAX-IND
   *
   * @param value
   */
  public void setPol4IndCoreMaxInd(char[] value) {
    pol4IndCoreMaxInd = checkPol4IndCoreMaxIndConstraints(value);
    serializePol4IndCoreMaxInd(pol4IndCoreMaxInd);
  }

  /**
   * Update Pol4IndCoreMaxInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4IndCoreMaxInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol4IndCoreMaxInd, pol4IndCoreMaxInd.length);
  }

  public void setPol4IndCoreMaxInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4IndCoreMaxInd, pol4IndCoreMaxInd.length);
  }

  /**
   * Update Pol4IndCoreMaxInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4IndCoreMaxInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4IndCoreMaxInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4IndCoreMaxInd with another Field
   *
   * @param value
   */
  public void setPol4IndCoreMaxInd(Field source) {
    replace(source, 0, source.length(), beginPol4IndCoreMaxInd, POL_4_IND_CORE_MAX_IND_LEN);
  }

  /**
   * Update Pol4IndCoreMaxInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4IndCoreMaxInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4IndCoreMaxInd, POL_4_IND_CORE_MAX_IND_LEN);
  }

  /**
   * Update Pol4IndCoreMaxInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4IndCoreMaxInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4IndCoreMaxInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4IndCoreMaxPd
   *
   * @return pol4IndCoreMaxPd
   */
  public char[] getPol4IndCoreMaxPd() throws CFException {
    if (isPol4IndCoreMaxPdModified()) {
      pol4IndCoreMaxPd = refreshPol4IndCoreMaxPd();
    }
    return pol4IndCoreMaxPd;
  }

  /**
   * set variable pol4IndCoreMaxPd Corresponding COBOL Variable is POL4-IND-CORE-MAX-PD
   *
   * @param value
   */
  public void setPol4IndCoreMaxPd(char[] value) {
    pol4IndCoreMaxPd = checkPol4IndCoreMaxPdConstraints(value);
    serializePol4IndCoreMaxPd(pol4IndCoreMaxPd);
  }

  /**
   * Update Pol4IndCoreMaxPd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4IndCoreMaxPd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol4IndCoreMaxPd, pol4IndCoreMaxPd.length);
  }

  public void setPol4IndCoreMaxPd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4IndCoreMaxPd, pol4IndCoreMaxPd.length);
  }

  /**
   * Update Pol4IndCoreMaxPd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4IndCoreMaxPd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4IndCoreMaxPd + targetIndex, targetLen);
  }

  /**
   * Update Pol4IndCoreMaxPd with another Field
   *
   * @param value
   */
  public void setPol4IndCoreMaxPd(Field source) {
    replace(source, 0, source.length(), beginPol4IndCoreMaxPd, POL_4_IND_CORE_MAX_PD_LEN);
  }

  /**
   * Update Pol4IndCoreMaxPd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4IndCoreMaxPd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4IndCoreMaxPd, POL_4_IND_CORE_MAX_PD_LEN);
  }

  /**
   * Update Pol4IndCoreMaxPd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4IndCoreMaxPd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4IndCoreMaxPd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4InnIndCoreAmt
   *
   * @return pol4InnIndCoreAmt
   */
  public BigDecimal getPol4InnIndCoreAmt() throws CFException {
    if (isPol4InnIndCoreAmtModified()) {
      pol4InnIndCoreAmt = refreshPol4InnIndCoreAmt();
    }
    return pol4InnIndCoreAmt;
  }

  /**
   * Update Pol4InnIndCoreAmt with the passed number Corresponding COBOL Variable is
   * POL4-INN-IND-CORE-AMT
   *
   * @param number
   */
  public void setPol4InnIndCoreAmt(BigDecimal number) {
    number = (number.signum() < 0) ? number.negate() : number; // Only positive number allowed
    pol4InnIndCoreAmt = checkPol4InnIndCoreAmtMaxLimit(number);
    serializePol4InnIndCoreAmt(pol4InnIndCoreAmt);
  }
  /**
   * Update Pol4InnIndCoreAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4InnIndCoreAmt(char[] value) throws CFException {
    pol4InnIndCoreAmt = serializePol4InnIndCoreAmt(value);
  }
  /**
   * Returns the value of pol4OonIndCoreAmt
   *
   * @return pol4OonIndCoreAmt
   */
  public BigDecimal getPol4OonIndCoreAmt() throws CFException {
    if (isPol4OonIndCoreAmtModified()) {
      pol4OonIndCoreAmt = refreshPol4OonIndCoreAmt();
    }
    return pol4OonIndCoreAmt;
  }

  /**
   * Update Pol4OonIndCoreAmt with the passed number Corresponding COBOL Variable is
   * POL4-OON-IND-CORE-AMT
   *
   * @param number
   */
  public void setPol4OonIndCoreAmt(BigDecimal number) {
    number = (number.signum() < 0) ? number.negate() : number; // Only positive number allowed
    pol4OonIndCoreAmt = checkPol4OonIndCoreAmtMaxLimit(number);
    serializePol4OonIndCoreAmt(pol4OonIndCoreAmt);
  }
  /**
   * Update Pol4OonIndCoreAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4OonIndCoreAmt(char[] value) throws CFException {
    pol4OonIndCoreAmt = serializePol4OonIndCoreAmt(value);
  }
  /**
   * Returns the value of pol4T1IndCoreAmt
   *
   * @return pol4T1IndCoreAmt
   */
  public BigDecimal getPol4T1IndCoreAmt() throws CFException {
    if (isPol4T1IndCoreAmtModified()) {
      pol4T1IndCoreAmt = refreshPol4T1IndCoreAmt();
    }
    return pol4T1IndCoreAmt;
  }

  /**
   * Update Pol4T1IndCoreAmt with the passed number Corresponding COBOL Variable is
   * POL4-T1-IND-CORE-AMT
   *
   * @param number
   */
  public void setPol4T1IndCoreAmt(BigDecimal number) {
    number = (number.signum() < 0) ? number.negate() : number; // Only positive number allowed
    pol4T1IndCoreAmt = checkPol4T1IndCoreAmtMaxLimit(number);
    serializePol4T1IndCoreAmt(pol4T1IndCoreAmt);
  }
  /**
   * Update Pol4T1IndCoreAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4T1IndCoreAmt(char[] value) throws CFException {
    pol4T1IndCoreAmt = serializePol4T1IndCoreAmt(value);
  }
  /**
   * Returns the value of pol4InnFamCoreAmt
   *
   * @return pol4InnFamCoreAmt
   */
  public BigDecimal getPol4InnFamCoreAmt() throws CFException {
    if (isPol4InnFamCoreAmtModified()) {
      pol4InnFamCoreAmt = refreshPol4InnFamCoreAmt();
    }
    return pol4InnFamCoreAmt;
  }

  /**
   * Update Pol4InnFamCoreAmt with the passed number Corresponding COBOL Variable is
   * POL4-INN-FAM-CORE-AMT
   *
   * @param number
   */
  public void setPol4InnFamCoreAmt(BigDecimal number) {
    number = (number.signum() < 0) ? number.negate() : number; // Only positive number allowed
    pol4InnFamCoreAmt = checkPol4InnFamCoreAmtMaxLimit(number);
    serializePol4InnFamCoreAmt(pol4InnFamCoreAmt);
  }
  /**
   * Update Pol4InnFamCoreAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4InnFamCoreAmt(char[] value) throws CFException {
    pol4InnFamCoreAmt = serializePol4InnFamCoreAmt(value);
  }
  /**
   * Returns the value of pol4T1FamCoreAmt
   *
   * @return pol4T1FamCoreAmt
   */
  public BigDecimal getPol4T1FamCoreAmt() throws CFException {
    if (isPol4T1FamCoreAmtModified()) {
      pol4T1FamCoreAmt = refreshPol4T1FamCoreAmt();
    }
    return pol4T1FamCoreAmt;
  }

  /**
   * Update Pol4T1FamCoreAmt with the passed number Corresponding COBOL Variable is
   * POL4-T1-FAM-CORE-AMT
   *
   * @param number
   */
  public void setPol4T1FamCoreAmt(BigDecimal number) {
    number = (number.signum() < 0) ? number.negate() : number; // Only positive number allowed
    pol4T1FamCoreAmt = checkPol4T1FamCoreAmtMaxLimit(number);
    serializePol4T1FamCoreAmt(pol4T1FamCoreAmt);
  }
  /**
   * Update Pol4T1FamCoreAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4T1FamCoreAmt(char[] value) throws CFException {
    pol4T1FamCoreAmt = serializePol4T1FamCoreAmt(value);
  }
  /**
   * Returns the value of pol4OonFamCoreAmt
   *
   * @return pol4OonFamCoreAmt
   */
  public BigDecimal getPol4OonFamCoreAmt() throws CFException {
    if (isPol4OonFamCoreAmtModified()) {
      pol4OonFamCoreAmt = refreshPol4OonFamCoreAmt();
    }
    return pol4OonFamCoreAmt;
  }

  /**
   * Update Pol4OonFamCoreAmt with the passed number Corresponding COBOL Variable is
   * POL4-OON-FAM-CORE-AMT
   *
   * @param number
   */
  public void setPol4OonFamCoreAmt(BigDecimal number) {
    number = (number.signum() < 0) ? number.negate() : number; // Only positive number allowed
    pol4OonFamCoreAmt = checkPol4OonFamCoreAmtMaxLimit(number);
    serializePol4OonFamCoreAmt(pol4OonFamCoreAmt);
  }
  /**
   * Update Pol4OonFamCoreAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4OonFamCoreAmt(char[] value) throws CFException {
    pol4OonFamCoreAmt = serializePol4OonFamCoreAmt(value);
  }
  /**
   * Returns the value of pol4CrossApplyCoreInd
   *
   * @return pol4CrossApplyCoreInd
   */
  public char[] getPol4CrossApplyCoreInd() throws CFException {
    if (isPol4CrossApplyCoreIndModified()) {
      pol4CrossApplyCoreInd = refreshPol4CrossApplyCoreInd();
    }
    return pol4CrossApplyCoreInd;
  }

  /**
   * set variable pol4CrossApplyCoreInd Corresponding COBOL Variable is POL4-CROSS-APPLY-CORE-IND
   *
   * @param value
   */
  public void setPol4CrossApplyCoreInd(char[] value) {
    pol4CrossApplyCoreInd = checkPol4CrossApplyCoreIndConstraints(value);
    serializePol4CrossApplyCoreInd(pol4CrossApplyCoreInd);
  }

  /**
   * Update Pol4CrossApplyCoreInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4CrossApplyCoreInd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol4CrossApplyCoreInd,
        pol4CrossApplyCoreInd.length);
  }

  public void setPol4CrossApplyCoreInd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4CrossApplyCoreInd, pol4CrossApplyCoreInd.length);
  }

  /**
   * Update Pol4CrossApplyCoreInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4CrossApplyCoreInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4CrossApplyCoreInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4CrossApplyCoreInd with another Field
   *
   * @param value
   */
  public void setPol4CrossApplyCoreInd(Field source) {
    replace(source, 0, source.length(), beginPol4CrossApplyCoreInd, POL_4_CROSS_APPLY_CORE_IND_LEN);
  }

  /**
   * Update Pol4CrossApplyCoreInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4CrossApplyCoreInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4CrossApplyCoreInd, POL_4_CROSS_APPLY_CORE_IND_LEN);
  }

  /**
   * Update Pol4CrossApplyCoreInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4CrossApplyCoreInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4CrossApplyCoreInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4CopayIndMaxInn
   *
   * @return pol4CopayIndMaxInn
   */
  public BigDecimal getPol4CopayIndMaxInn() throws CFException {
    if (isPol4CopayIndMaxInnModified()) {
      pol4CopayIndMaxInn = refreshPol4CopayIndMaxInn();
    }
    return pol4CopayIndMaxInn;
  }

  /**
   * Update Pol4CopayIndMaxInn with the passed number Corresponding COBOL Variable is
   * POL4-COPAY-IND-MAX-INN
   *
   * @param number
   */
  public void setPol4CopayIndMaxInn(BigDecimal number) {
    number = (number.signum() < 0) ? number.negate() : number; // Only positive number allowed
    pol4CopayIndMaxInn = checkPol4CopayIndMaxInnMaxLimit(number);
    serializePol4CopayIndMaxInn(pol4CopayIndMaxInn);
  }
  /**
   * Update Pol4CopayIndMaxInn with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4CopayIndMaxInn(char[] value) throws CFException {
    pol4CopayIndMaxInn = serializePol4CopayIndMaxInn(value);
  }
  /**
   * Returns the value of pol4CopayIndMaxOon
   *
   * @return pol4CopayIndMaxOon
   */
  public BigDecimal getPol4CopayIndMaxOon() throws CFException {
    if (isPol4CopayIndMaxOonModified()) {
      pol4CopayIndMaxOon = refreshPol4CopayIndMaxOon();
    }
    return pol4CopayIndMaxOon;
  }

  /**
   * Update Pol4CopayIndMaxOon with the passed number Corresponding COBOL Variable is
   * POL4-COPAY-IND-MAX-OON
   *
   * @param number
   */
  public void setPol4CopayIndMaxOon(BigDecimal number) {
    number = (number.signum() < 0) ? number.negate() : number; // Only positive number allowed
    pol4CopayIndMaxOon = checkPol4CopayIndMaxOonMaxLimit(number);
    serializePol4CopayIndMaxOon(pol4CopayIndMaxOon);
  }
  /**
   * Update Pol4CopayIndMaxOon with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4CopayIndMaxOon(char[] value) throws CFException {
    pol4CopayIndMaxOon = serializePol4CopayIndMaxOon(value);
  }
  /**
   * Returns the value of pol4CopayIndMaxT1
   *
   * @return pol4CopayIndMaxT1
   */
  public BigDecimal getPol4CopayIndMaxT1() throws CFException {
    if (isPol4CopayIndMaxT1Modified()) {
      pol4CopayIndMaxT1 = refreshPol4CopayIndMaxT1();
    }
    return pol4CopayIndMaxT1;
  }

  /**
   * Update Pol4CopayIndMaxT1 with the passed number Corresponding COBOL Variable is
   * POL4-COPAY-IND-MAX-T1
   *
   * @param number
   */
  public void setPol4CopayIndMaxT1(BigDecimal number) {
    number = (number.signum() < 0) ? number.negate() : number; // Only positive number allowed
    pol4CopayIndMaxT1 = checkPol4CopayIndMaxT1MaxLimit(number);
    serializePol4CopayIndMaxT1(pol4CopayIndMaxT1);
  }
  /**
   * Update Pol4CopayIndMaxT1 with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4CopayIndMaxT1(char[] value) throws CFException {
    pol4CopayIndMaxT1 = serializePol4CopayIndMaxT1(value);
  }
  /**
   * Returns the value of pol4CopayFamMaxInn
   *
   * @return pol4CopayFamMaxInn
   */
  public BigDecimal getPol4CopayFamMaxInn() throws CFException {
    if (isPol4CopayFamMaxInnModified()) {
      pol4CopayFamMaxInn = refreshPol4CopayFamMaxInn();
    }
    return pol4CopayFamMaxInn;
  }

  /**
   * Update Pol4CopayFamMaxInn with the passed number Corresponding COBOL Variable is
   * POL4-COPAY-FAM-MAX-INN
   *
   * @param number
   */
  public void setPol4CopayFamMaxInn(BigDecimal number) {
    number = (number.signum() < 0) ? number.negate() : number; // Only positive number allowed
    pol4CopayFamMaxInn = checkPol4CopayFamMaxInnMaxLimit(number);
    serializePol4CopayFamMaxInn(pol4CopayFamMaxInn);
  }
  /**
   * Update Pol4CopayFamMaxInn with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4CopayFamMaxInn(char[] value) throws CFException {
    pol4CopayFamMaxInn = serializePol4CopayFamMaxInn(value);
  }
  /**
   * Returns the value of pol4CopayFamMaxOon
   *
   * @return pol4CopayFamMaxOon
   */
  public BigDecimal getPol4CopayFamMaxOon() throws CFException {
    if (isPol4CopayFamMaxOonModified()) {
      pol4CopayFamMaxOon = refreshPol4CopayFamMaxOon();
    }
    return pol4CopayFamMaxOon;
  }

  /**
   * Update Pol4CopayFamMaxOon with the passed number Corresponding COBOL Variable is
   * POL4-COPAY-FAM-MAX-OON
   *
   * @param number
   */
  public void setPol4CopayFamMaxOon(BigDecimal number) {
    number = (number.signum() < 0) ? number.negate() : number; // Only positive number allowed
    pol4CopayFamMaxOon = checkPol4CopayFamMaxOonMaxLimit(number);
    serializePol4CopayFamMaxOon(pol4CopayFamMaxOon);
  }
  /**
   * Update Pol4CopayFamMaxOon with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4CopayFamMaxOon(char[] value) throws CFException {
    pol4CopayFamMaxOon = serializePol4CopayFamMaxOon(value);
  }
  /**
   * Returns the value of pol4CopayFamMaxT1
   *
   * @return pol4CopayFamMaxT1
   */
  public BigDecimal getPol4CopayFamMaxT1() throws CFException {
    if (isPol4CopayFamMaxT1Modified()) {
      pol4CopayFamMaxT1 = refreshPol4CopayFamMaxT1();
    }
    return pol4CopayFamMaxT1;
  }

  /**
   * Update Pol4CopayFamMaxT1 with the passed number Corresponding COBOL Variable is
   * POL4-COPAY-FAM-MAX-T1
   *
   * @param number
   */
  public void setPol4CopayFamMaxT1(BigDecimal number) {
    number = (number.signum() < 0) ? number.negate() : number; // Only positive number allowed
    pol4CopayFamMaxT1 = checkPol4CopayFamMaxT1MaxLimit(number);
    serializePol4CopayFamMaxT1(pol4CopayFamMaxT1);
  }
  /**
   * Update Pol4CopayFamMaxT1 with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4CopayFamMaxT1(char[] value) throws CFException {
    pol4CopayFamMaxT1 = serializePol4CopayFamMaxT1(value);
  }
  /**
   * Returns the value of pol4CrossApplyCopayInd
   *
   * @return pol4CrossApplyCopayInd
   */
  public char[] getPol4CrossApplyCopayInd() throws CFException {
    if (isPol4CrossApplyCopayIndModified()) {
      pol4CrossApplyCopayInd = refreshPol4CrossApplyCopayInd();
    }
    return pol4CrossApplyCopayInd;
  }

  /**
   * set variable pol4CrossApplyCopayInd Corresponding COBOL Variable is POL4-CROSS-APPLY-COPAY-IND
   *
   * @param value
   */
  public void setPol4CrossApplyCopayInd(char[] value) {
    pol4CrossApplyCopayInd = checkPol4CrossApplyCopayIndConstraints(value);
    serializePol4CrossApplyCopayInd(pol4CrossApplyCopayInd);
  }

  /**
   * Update Pol4CrossApplyCopayInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4CrossApplyCopayInd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol4CrossApplyCopayInd,
        pol4CrossApplyCopayInd.length);
  }

  public void setPol4CrossApplyCopayInd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4CrossApplyCopayInd, pol4CrossApplyCopayInd.length);
  }

  /**
   * Update Pol4CrossApplyCopayInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4CrossApplyCopayInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4CrossApplyCopayInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4CrossApplyCopayInd with another Field
   *
   * @param value
   */
  public void setPol4CrossApplyCopayInd(Field source) {
    replace(
        source, 0, source.length(), beginPol4CrossApplyCopayInd, POL_4_CROSS_APPLY_COPAY_IND_LEN);
  }

  /**
   * Update Pol4CrossApplyCopayInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4CrossApplyCopayInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol4CrossApplyCopayInd,
        POL_4_CROSS_APPLY_COPAY_IND_LEN);
  }

  /**
   * Update Pol4CrossApplyCopayInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4CrossApplyCopayInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4CrossApplyCopayInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4NonEmbMaxCopay
   *
   * @return pol4NonEmbMaxCopay
   */
  public char[] getPol4NonEmbMaxCopay() throws CFException {
    if (isPol4NonEmbMaxCopayModified()) {
      pol4NonEmbMaxCopay = refreshPol4NonEmbMaxCopay();
    }
    return pol4NonEmbMaxCopay;
  }

  /**
   * set variable pol4NonEmbMaxCopay Corresponding COBOL Variable is POL4-NON-EMB-MAX-COPAY
   *
   * @param value
   */
  public void setPol4NonEmbMaxCopay(char[] value) {
    pol4NonEmbMaxCopay = checkPol4NonEmbMaxCopayConstraints(value);
    serializePol4NonEmbMaxCopay(pol4NonEmbMaxCopay);
  }

  /**
   * Update Pol4NonEmbMaxCopay with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4NonEmbMaxCopay(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol4NonEmbMaxCopay, pol4NonEmbMaxCopay.length);
  }

  public void setPol4NonEmbMaxCopay(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4NonEmbMaxCopay, pol4NonEmbMaxCopay.length);
  }

  /**
   * Update Pol4NonEmbMaxCopay with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4NonEmbMaxCopay(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4NonEmbMaxCopay + targetIndex, targetLen);
  }

  /**
   * Update Pol4NonEmbMaxCopay with another Field
   *
   * @param value
   */
  public void setPol4NonEmbMaxCopay(Field source) {
    replace(source, 0, source.length(), beginPol4NonEmbMaxCopay, POL_4_NON_EMB_MAX_COPAY_LEN);
  }

  /**
   * Update Pol4NonEmbMaxCopay with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4NonEmbMaxCopay(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4NonEmbMaxCopay, POL_4_NON_EMB_MAX_COPAY_LEN);
  }

  /**
   * Update Pol4NonEmbMaxCopay with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4NonEmbMaxCopay(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4NonEmbMaxCopay + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4NonEmbMaxCore
   *
   * @return pol4NonEmbMaxCore
   */
  public char[] getPol4NonEmbMaxCore() throws CFException {
    if (isPol4NonEmbMaxCoreModified()) {
      pol4NonEmbMaxCore = refreshPol4NonEmbMaxCore();
    }
    return pol4NonEmbMaxCore;
  }

  /**
   * set variable pol4NonEmbMaxCore Corresponding COBOL Variable is POL4-NON-EMB-MAX-CORE
   *
   * @param value
   */
  public void setPol4NonEmbMaxCore(char[] value) {
    pol4NonEmbMaxCore = checkPol4NonEmbMaxCoreConstraints(value);
    serializePol4NonEmbMaxCore(pol4NonEmbMaxCore);
  }

  /**
   * Update Pol4NonEmbMaxCore with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4NonEmbMaxCore(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol4NonEmbMaxCore, pol4NonEmbMaxCore.length);
  }

  public void setPol4NonEmbMaxCore(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4NonEmbMaxCore, pol4NonEmbMaxCore.length);
  }

  /**
   * Update Pol4NonEmbMaxCore with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4NonEmbMaxCore(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4NonEmbMaxCore + targetIndex, targetLen);
  }

  /**
   * Update Pol4NonEmbMaxCore with another Field
   *
   * @param value
   */
  public void setPol4NonEmbMaxCore(Field source) {
    replace(source, 0, source.length(), beginPol4NonEmbMaxCore, POL_4_NON_EMB_MAX_CORE_LEN);
  }

  /**
   * Update Pol4NonEmbMaxCore with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4NonEmbMaxCore(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4NonEmbMaxCore, POL_4_NON_EMB_MAX_CORE_LEN);
  }

  /**
   * Update Pol4NonEmbMaxCore with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4NonEmbMaxCore(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4NonEmbMaxCore + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4NonEmbMaxDed
   *
   * @return pol4NonEmbMaxDed
   */
  public char[] getPol4NonEmbMaxDed() throws CFException {
    if (isPol4NonEmbMaxDedModified()) {
      pol4NonEmbMaxDed = refreshPol4NonEmbMaxDed();
    }
    return pol4NonEmbMaxDed;
  }

  /**
   * set variable pol4NonEmbMaxDed Corresponding COBOL Variable is POL4-NON-EMB-MAX-DED
   *
   * @param value
   */
  public void setPol4NonEmbMaxDed(char[] value) {
    pol4NonEmbMaxDed = checkPol4NonEmbMaxDedConstraints(value);
    serializePol4NonEmbMaxDed(pol4NonEmbMaxDed);
  }

  /**
   * Update Pol4NonEmbMaxDed with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4NonEmbMaxDed(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol4NonEmbMaxDed, pol4NonEmbMaxDed.length);
  }

  public void setPol4NonEmbMaxDed(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4NonEmbMaxDed, pol4NonEmbMaxDed.length);
  }

  /**
   * Update Pol4NonEmbMaxDed with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4NonEmbMaxDed(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4NonEmbMaxDed + targetIndex, targetLen);
  }

  /**
   * Update Pol4NonEmbMaxDed with another Field
   *
   * @param value
   */
  public void setPol4NonEmbMaxDed(Field source) {
    replace(source, 0, source.length(), beginPol4NonEmbMaxDed, POL_4_NON_EMB_MAX_DED_LEN);
  }

  /**
   * Update Pol4NonEmbMaxDed with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4NonEmbMaxDed(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4NonEmbMaxDed, POL_4_NON_EMB_MAX_DED_LEN);
  }

  /**
   * Update Pol4NonEmbMaxDed with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4NonEmbMaxDed(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4NonEmbMaxDed + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4NonEmbMaxOop
   *
   * @return pol4NonEmbMaxOop
   */
  public char[] getPol4NonEmbMaxOop() throws CFException {
    if (isPol4NonEmbMaxOopModified()) {
      pol4NonEmbMaxOop = refreshPol4NonEmbMaxOop();
    }
    return pol4NonEmbMaxOop;
  }

  /**
   * set variable pol4NonEmbMaxOop Corresponding COBOL Variable is POL4-NON-EMB-MAX-OOP
   *
   * @param value
   */
  public void setPol4NonEmbMaxOop(char[] value) {
    pol4NonEmbMaxOop = checkPol4NonEmbMaxOopConstraints(value);
    serializePol4NonEmbMaxOop(pol4NonEmbMaxOop);
  }

  /**
   * Update Pol4NonEmbMaxOop with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4NonEmbMaxOop(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol4NonEmbMaxOop, pol4NonEmbMaxOop.length);
  }

  public void setPol4NonEmbMaxOop(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4NonEmbMaxOop, pol4NonEmbMaxOop.length);
  }

  /**
   * Update Pol4NonEmbMaxOop with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4NonEmbMaxOop(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4NonEmbMaxOop + targetIndex, targetLen);
  }

  /**
   * Update Pol4NonEmbMaxOop with another Field
   *
   * @param value
   */
  public void setPol4NonEmbMaxOop(Field source) {
    replace(source, 0, source.length(), beginPol4NonEmbMaxOop, POL_4_NON_EMB_MAX_OOP_LEN);
  }

  /**
   * Update Pol4NonEmbMaxOop with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4NonEmbMaxOop(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4NonEmbMaxOop, POL_4_NON_EMB_MAX_OOP_LEN);
  }

  /**
   * Update Pol4NonEmbMaxOop with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4NonEmbMaxOop(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4NonEmbMaxOop + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4CoreSlryFamMultFct
   *
   * @return pol4CoreSlryFamMultFct
   */
  public BigDecimal getPol4CoreSlryFamMultFct() throws CFException {
    if (isPol4CoreSlryFamMultFctModified()) {
      pol4CoreSlryFamMultFct = refreshPol4CoreSlryFamMultFct();
    }
    return pol4CoreSlryFamMultFct;
  }

  /**
   * Returns the String value of pol4CoreSlryFamMultFct
   *
   * @return pol4CoreSlryFamMultFct
   */
  public char[] getPol4CoreSlryFamMultFctActualString() {
    String value = String.valueOf(pol4CoreSlryFamMultFct).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update Pol4CoreSlryFamMultFct with the passed number Corresponding COBOL Variable is
   * POL4-CORE-SLRY-FAM-MULT-FCT
   *
   * @param number
   */
  public void setPol4CoreSlryFamMultFct(BigDecimal number) {
    pol4CoreSlryFamMultFct = checkPol4CoreSlryFamMultFctMaxLimit(number);
    serializePol4CoreSlryFamMultFct(pol4CoreSlryFamMultFct);
  }
  /**
   * Update Pol4CoreSlryFamMultFct with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4CoreSlryFamMultFct(char[] value) throws CFException {
    pol4CoreSlryFamMultFct = serializePol4CoreSlryFamMultFct(value);
  }
  /**
   * Returns the value of pol4CoreSlryFamTypCd
   *
   * @return pol4CoreSlryFamTypCd
   */
  public char[] getPol4CoreSlryFamTypCd() throws CFException {
    if (isPol4CoreSlryFamTypCdModified()) {
      pol4CoreSlryFamTypCd = refreshPol4CoreSlryFamTypCd();
    }
    return pol4CoreSlryFamTypCd;
  }

  /**
   * set variable pol4CoreSlryFamTypCd Corresponding COBOL Variable is POL4-CORE-SLRY-FAM-TYP-CD
   *
   * @param value
   */
  public void setPol4CoreSlryFamTypCd(char[] value) {
    pol4CoreSlryFamTypCd = checkPol4CoreSlryFamTypCdConstraints(value);
    serializePol4CoreSlryFamTypCd(pol4CoreSlryFamTypCd);
  }

  /**
   * Update Pol4CoreSlryFamTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4CoreSlryFamTypCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol4CoreSlryFamTypCd, pol4CoreSlryFamTypCd.length);
  }

  public void setPol4CoreSlryFamTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4CoreSlryFamTypCd, pol4CoreSlryFamTypCd.length);
  }

  /**
   * Update Pol4CoreSlryFamTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4CoreSlryFamTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4CoreSlryFamTypCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4CoreSlryFamTypCd with another Field
   *
   * @param value
   */
  public void setPol4CoreSlryFamTypCd(Field source) {
    replace(source, 0, source.length(), beginPol4CoreSlryFamTypCd, POL_4_CORE_SLRY_FAM_TYP_CD_LEN);
  }

  /**
   * Update Pol4CoreSlryFamTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4CoreSlryFamTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4CoreSlryFamTypCd, POL_4_CORE_SLRY_FAM_TYP_CD_LEN);
  }

  /**
   * Update Pol4CoreSlryFamTypCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4CoreSlryFamTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4CoreSlryFamTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4CoreSlryIndvTypCd
   *
   * @return pol4CoreSlryIndvTypCd
   */
  public char[] getPol4CoreSlryIndvTypCd() throws CFException {
    if (isPol4CoreSlryIndvTypCdModified()) {
      pol4CoreSlryIndvTypCd = refreshPol4CoreSlryIndvTypCd();
    }
    return pol4CoreSlryIndvTypCd;
  }

  /**
   * set variable pol4CoreSlryIndvTypCd Corresponding COBOL Variable is POL4-CORE-SLRY-INDV-TYP-CD
   *
   * @param value
   */
  public void setPol4CoreSlryIndvTypCd(char[] value) {
    pol4CoreSlryIndvTypCd = checkPol4CoreSlryIndvTypCdConstraints(value);
    serializePol4CoreSlryIndvTypCd(pol4CoreSlryIndvTypCd);
  }

  /**
   * Update Pol4CoreSlryIndvTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4CoreSlryIndvTypCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol4CoreSlryIndvTypCd,
        pol4CoreSlryIndvTypCd.length);
  }

  public void setPol4CoreSlryIndvTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4CoreSlryIndvTypCd, pol4CoreSlryIndvTypCd.length);
  }

  /**
   * Update Pol4CoreSlryIndvTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4CoreSlryIndvTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4CoreSlryIndvTypCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4CoreSlryIndvTypCd with another Field
   *
   * @param value
   */
  public void setPol4CoreSlryIndvTypCd(Field source) {
    replace(
        source, 0, source.length(), beginPol4CoreSlryIndvTypCd, POL_4_CORE_SLRY_INDV_TYP_CD_LEN);
  }

  /**
   * Update Pol4CoreSlryIndvTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4CoreSlryIndvTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol4CoreSlryIndvTypCd,
        POL_4_CORE_SLRY_INDV_TYP_CD_LEN);
  }

  /**
   * Update Pol4CoreSlryIndvTypCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4CoreSlryIndvTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4CoreSlryIndvTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4CoreInNtwkEePls1Amt
   *
   * @return pol4CoreInNtwkEePls1Amt
   */
  public int getPol4CoreInNtwkEePls1Amt() throws CFException {
    if (isPol4CoreInNtwkEePls1AmtModified()) {
      pol4CoreInNtwkEePls1Amt = refreshPol4CoreInNtwkEePls1Amt();
    }
    return pol4CoreInNtwkEePls1Amt;
  }

  /**
   * Returns the String value of pol4CoreInNtwkEePls1Amt
   *
   * @return pol4CoreInNtwkEePls1Amt
   */
  public char[] getPol4CoreInNtwkEePls1AmtActualString() {
    String value = String.valueOf(pol4CoreInNtwkEePls1Amt).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update Pol4CoreInNtwkEePls1Amt with the passed value Corresponding COBOL Variable is
   * POL4-CORE-IN-NTWK-EE-PLS1-AMT
   *
   * @param number
   */
  public void setPol4CoreInNtwkEePls1Amt(int number) {
    // Truncate if the number is beyond +/- Max range
    pol4CoreInNtwkEePls1Amt = checkPol4CoreInNtwkEePls1AmtMaxLimit(number);
    serializePol4CoreInNtwkEePls1Amt(pol4CoreInNtwkEePls1Amt);
  }

  public void setPol4CoreInNtwkEePls1Amt(long number) {
    number =
        checkPol4CoreInNtwkEePls1AmtMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPol4CoreInNtwkEePls1Amt((int) number);
  }

  /**
   * Update Pol4CoreInNtwkEePls1Amt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4CoreInNtwkEePls1Amt(char[] value) throws CFException {
    pol4CoreInNtwkEePls1Amt = serializePol4CoreInNtwkEePls1Amt(value);
  }
  /**
   * Update Pol4CoreInNtwkEePls1Amt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4CoreInNtwkEePls1AmtString(char[] value) throws CFException {
    setPol4CoreInNtwkEePls1Amt(value);
  }
  /**
   * Returns the value of pol4CoreInNtwkEeSpoAmt
   *
   * @return pol4CoreInNtwkEeSpoAmt
   */
  public int getPol4CoreInNtwkEeSpoAmt() throws CFException {
    if (isPol4CoreInNtwkEeSpoAmtModified()) {
      pol4CoreInNtwkEeSpoAmt = refreshPol4CoreInNtwkEeSpoAmt();
    }
    return pol4CoreInNtwkEeSpoAmt;
  }

  /**
   * Returns the String value of pol4CoreInNtwkEeSpoAmt
   *
   * @return pol4CoreInNtwkEeSpoAmt
   */
  public char[] getPol4CoreInNtwkEeSpoAmtActualString() {
    String value = String.valueOf(pol4CoreInNtwkEeSpoAmt).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update Pol4CoreInNtwkEeSpoAmt with the passed value Corresponding COBOL Variable is
   * POL4-CORE-IN-NTWK-EE-SPO-AMT
   *
   * @param number
   */
  public void setPol4CoreInNtwkEeSpoAmt(int number) {
    // Truncate if the number is beyond +/- Max range
    pol4CoreInNtwkEeSpoAmt = checkPol4CoreInNtwkEeSpoAmtMaxLimit(number);
    serializePol4CoreInNtwkEeSpoAmt(pol4CoreInNtwkEeSpoAmt);
  }

  public void setPol4CoreInNtwkEeSpoAmt(long number) {
    number =
        checkPol4CoreInNtwkEeSpoAmtMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPol4CoreInNtwkEeSpoAmt((int) number);
  }

  /**
   * Update Pol4CoreInNtwkEeSpoAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4CoreInNtwkEeSpoAmt(char[] value) throws CFException {
    pol4CoreInNtwkEeSpoAmt = serializePol4CoreInNtwkEeSpoAmt(value);
  }
  /**
   * Update Pol4CoreInNtwkEeSpoAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4CoreInNtwkEeSpoAmtString(char[] value) throws CFException {
    setPol4CoreInNtwkEeSpoAmt(value);
  }
  /**
   * Returns the value of pol4CoreInNtwkEeChrgAmt
   *
   * @return pol4CoreInNtwkEeChrgAmt
   */
  public int getPol4CoreInNtwkEeChrgAmt() throws CFException {
    if (isPol4CoreInNtwkEeChrgAmtModified()) {
      pol4CoreInNtwkEeChrgAmt = refreshPol4CoreInNtwkEeChrgAmt();
    }
    return pol4CoreInNtwkEeChrgAmt;
  }

  /**
   * Returns the String value of pol4CoreInNtwkEeChrgAmt
   *
   * @return pol4CoreInNtwkEeChrgAmt
   */
  public char[] getPol4CoreInNtwkEeChrgAmtActualString() {
    String value = String.valueOf(pol4CoreInNtwkEeChrgAmt).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update Pol4CoreInNtwkEeChrgAmt with the passed value Corresponding COBOL Variable is
   * POL4-CORE-IN-NTWK-EE-CHRG-AMT
   *
   * @param number
   */
  public void setPol4CoreInNtwkEeChrgAmt(int number) {
    // Truncate if the number is beyond +/- Max range
    pol4CoreInNtwkEeChrgAmt = checkPol4CoreInNtwkEeChrgAmtMaxLimit(number);
    serializePol4CoreInNtwkEeChrgAmt(pol4CoreInNtwkEeChrgAmt);
  }

  public void setPol4CoreInNtwkEeChrgAmt(long number) {
    number =
        checkPol4CoreInNtwkEeChrgAmtMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPol4CoreInNtwkEeChrgAmt((int) number);
  }

  /**
   * Update Pol4CoreInNtwkEeChrgAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4CoreInNtwkEeChrgAmt(char[] value) throws CFException {
    pol4CoreInNtwkEeChrgAmt = serializePol4CoreInNtwkEeChrgAmt(value);
  }
  /**
   * Update Pol4CoreInNtwkEeChrgAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4CoreInNtwkEeChrgAmtString(char[] value) throws CFException {
    setPol4CoreInNtwkEeChrgAmt(value);
  }
  /**
   * Returns the value of pol4CoreCombEePls1Amt
   *
   * @return pol4CoreCombEePls1Amt
   */
  public int getPol4CoreCombEePls1Amt() throws CFException {
    if (isPol4CoreCombEePls1AmtModified()) {
      pol4CoreCombEePls1Amt = refreshPol4CoreCombEePls1Amt();
    }
    return pol4CoreCombEePls1Amt;
  }

  /**
   * Returns the String value of pol4CoreCombEePls1Amt
   *
   * @return pol4CoreCombEePls1Amt
   */
  public char[] getPol4CoreCombEePls1AmtActualString() {
    String value = String.valueOf(pol4CoreCombEePls1Amt).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update Pol4CoreCombEePls1Amt with the passed value Corresponding COBOL Variable is
   * POL4-CORE-COMB-EE-PLS-1-AMT
   *
   * @param number
   */
  public void setPol4CoreCombEePls1Amt(int number) {
    // Truncate if the number is beyond +/- Max range
    pol4CoreCombEePls1Amt = checkPol4CoreCombEePls1AmtMaxLimit(number);
    serializePol4CoreCombEePls1Amt(pol4CoreCombEePls1Amt);
  }

  public void setPol4CoreCombEePls1Amt(long number) {
    number =
        checkPol4CoreCombEePls1AmtMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPol4CoreCombEePls1Amt((int) number);
  }

  /**
   * Update Pol4CoreCombEePls1Amt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4CoreCombEePls1Amt(char[] value) throws CFException {
    pol4CoreCombEePls1Amt = serializePol4CoreCombEePls1Amt(value);
  }
  /**
   * Update Pol4CoreCombEePls1Amt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4CoreCombEePls1AmtString(char[] value) throws CFException {
    setPol4CoreCombEePls1Amt(value);
  }
  /**
   * Returns the value of pol4CoreCombEeSpoAmt
   *
   * @return pol4CoreCombEeSpoAmt
   */
  public int getPol4CoreCombEeSpoAmt() throws CFException {
    if (isPol4CoreCombEeSpoAmtModified()) {
      pol4CoreCombEeSpoAmt = refreshPol4CoreCombEeSpoAmt();
    }
    return pol4CoreCombEeSpoAmt;
  }

  /**
   * Returns the String value of pol4CoreCombEeSpoAmt
   *
   * @return pol4CoreCombEeSpoAmt
   */
  public char[] getPol4CoreCombEeSpoAmtActualString() {
    String value = String.valueOf(pol4CoreCombEeSpoAmt).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update Pol4CoreCombEeSpoAmt with the passed value Corresponding COBOL Variable is
   * POL4-CORE-COMB-EE-SPO-AMT
   *
   * @param number
   */
  public void setPol4CoreCombEeSpoAmt(int number) {
    // Truncate if the number is beyond +/- Max range
    pol4CoreCombEeSpoAmt = checkPol4CoreCombEeSpoAmtMaxLimit(number);
    serializePol4CoreCombEeSpoAmt(pol4CoreCombEeSpoAmt);
  }

  public void setPol4CoreCombEeSpoAmt(long number) {
    number = checkPol4CoreCombEeSpoAmtMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPol4CoreCombEeSpoAmt((int) number);
  }

  /**
   * Update Pol4CoreCombEeSpoAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4CoreCombEeSpoAmt(char[] value) throws CFException {
    pol4CoreCombEeSpoAmt = serializePol4CoreCombEeSpoAmt(value);
  }
  /**
   * Update Pol4CoreCombEeSpoAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4CoreCombEeSpoAmtString(char[] value) throws CFException {
    setPol4CoreCombEeSpoAmt(value);
  }
  /**
   * Returns the value of pol4CoreCombEeChrgAmt
   *
   * @return pol4CoreCombEeChrgAmt
   */
  public int getPol4CoreCombEeChrgAmt() throws CFException {
    if (isPol4CoreCombEeChrgAmtModified()) {
      pol4CoreCombEeChrgAmt = refreshPol4CoreCombEeChrgAmt();
    }
    return pol4CoreCombEeChrgAmt;
  }

  /**
   * Returns the String value of pol4CoreCombEeChrgAmt
   *
   * @return pol4CoreCombEeChrgAmt
   */
  public char[] getPol4CoreCombEeChrgAmtActualString() {
    String value = String.valueOf(pol4CoreCombEeChrgAmt).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update Pol4CoreCombEeChrgAmt with the passed value Corresponding COBOL Variable is
   * POL4-CORE-COMB-EE-CHRG-AMT
   *
   * @param number
   */
  public void setPol4CoreCombEeChrgAmt(int number) {
    // Truncate if the number is beyond +/- Max range
    pol4CoreCombEeChrgAmt = checkPol4CoreCombEeChrgAmtMaxLimit(number);
    serializePol4CoreCombEeChrgAmt(pol4CoreCombEeChrgAmt);
  }

  public void setPol4CoreCombEeChrgAmt(long number) {
    number =
        checkPol4CoreCombEeChrgAmtMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPol4CoreCombEeChrgAmt((int) number);
  }

  /**
   * Update Pol4CoreCombEeChrgAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4CoreCombEeChrgAmt(char[] value) throws CFException {
    pol4CoreCombEeChrgAmt = serializePol4CoreCombEeChrgAmt(value);
  }
  /**
   * Update Pol4CoreCombEeChrgAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4CoreCombEeChrgAmtString(char[] value) throws CFException {
    setPol4CoreCombEeChrgAmt(value);
  }
  /**
   * Returns the value of pol4RetLmtSrvcCd
   *
   * @return pol4RetLmtSrvcCd
   */
  public char[] getPol4RetLmtSrvcCd() throws CFException {
    if (isPol4RetLmtSrvcCdModified()) {
      pol4RetLmtSrvcCd = refreshPol4RetLmtSrvcCd();
    }
    return pol4RetLmtSrvcCd;
  }

  /**
   * set variable pol4RetLmtSrvcCd Corresponding COBOL Variable is POL4-RET-LMT-SRVC-CD
   *
   * @param value
   */
  public void setPol4RetLmtSrvcCd(char[] value) {
    pol4RetLmtSrvcCd = checkPol4RetLmtSrvcCdConstraints(value);
    serializePol4RetLmtSrvcCd(pol4RetLmtSrvcCd);
  }

  /**
   * Update Pol4RetLmtSrvcCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetLmtSrvcCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol4RetLmtSrvcCd, pol4RetLmtSrvcCd.length);
  }

  public void setPol4RetLmtSrvcCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetLmtSrvcCd, pol4RetLmtSrvcCd.length);
  }

  /**
   * Update Pol4RetLmtSrvcCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetLmtSrvcCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetLmtSrvcCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetLmtSrvcCd with another Field
   *
   * @param value
   */
  public void setPol4RetLmtSrvcCd(Field source) {
    replace(source, 0, source.length(), beginPol4RetLmtSrvcCd, POL_4_RET_LMT_SRVC_CD_LEN);
  }

  /**
   * Update Pol4RetLmtSrvcCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetLmtSrvcCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetLmtSrvcCd, POL_4_RET_LMT_SRVC_CD_LEN);
  }

  /**
   * Update Pol4RetLmtSrvcCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetLmtSrvcCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetLmtSrvcCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4NptRulePkgId
   *
   * @return pol4NptRulePkgId
   */
  public char[] getPol4NptRulePkgId() throws CFException {
    if (isPol4NptRulePkgIdModified()) {
      pol4NptRulePkgId = refreshPol4NptRulePkgId();
    }
    return pol4NptRulePkgId;
  }

  /**
   * set variable pol4NptRulePkgId Corresponding COBOL Variable is POL4-NPT-RULE-PKG-ID
   *
   * @param value
   */
  public void setPol4NptRulePkgId(char[] value) {
    pol4NptRulePkgId = checkPol4NptRulePkgIdConstraints(value);
    serializePol4NptRulePkgId(pol4NptRulePkgId);
  }

  /**
   * Update Pol4NptRulePkgId with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4NptRulePkgId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol4NptRulePkgId, pol4NptRulePkgId.length);
  }

  public void setPol4NptRulePkgId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4NptRulePkgId, pol4NptRulePkgId.length);
  }

  /**
   * Update Pol4NptRulePkgId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4NptRulePkgId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4NptRulePkgId + targetIndex, targetLen);
  }

  /**
   * Update Pol4NptRulePkgId with another Field
   *
   * @param value
   */
  public void setPol4NptRulePkgId(Field source) {
    replace(source, 0, source.length(), beginPol4NptRulePkgId, POL_4_NPT_RULE_PKG_ID_LEN);
  }

  /**
   * Update Pol4NptRulePkgId with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4NptRulePkgId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4NptRulePkgId, POL_4_NPT_RULE_PKG_ID_LEN);
  }

  /**
   * Update Pol4NptRulePkgId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4NptRulePkgId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4NptRulePkgId + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetDualOopNbrInd
   *
   * @return pol4RetDualOopNbrInd
   */
  public char[] getPol4RetDualOopNbrInd() throws CFException {
    if (isPol4RetDualOopNbrIndModified()) {
      pol4RetDualOopNbrInd = refreshPol4RetDualOopNbrInd();
    }
    return pol4RetDualOopNbrInd;
  }

  /**
   * set variable pol4RetDualOopNbrInd Corresponding COBOL Variable is POL4-RET-DUAL-OOP-NBR-IND
   *
   * @param value
   */
  public void setPol4RetDualOopNbrInd(char[] value) {
    pol4RetDualOopNbrInd = checkPol4RetDualOopNbrIndConstraints(value);
    serializePol4RetDualOopNbrInd(pol4RetDualOopNbrInd);
  }

  /**
   * Update Pol4RetDualOopNbrInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetDualOopNbrInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol4RetDualOopNbrInd, pol4RetDualOopNbrInd.length);
  }

  public void setPol4RetDualOopNbrInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetDualOopNbrInd, pol4RetDualOopNbrInd.length);
  }

  /**
   * Update Pol4RetDualOopNbrInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetDualOopNbrInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetDualOopNbrInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetDualOopNbrInd with another Field
   *
   * @param value
   */
  public void setPol4RetDualOopNbrInd(Field source) {
    replace(source, 0, source.length(), beginPol4RetDualOopNbrInd, POL_4_RET_DUAL_OOP_NBR_IND_LEN);
  }

  /**
   * Update Pol4RetDualOopNbrInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetDualOopNbrInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4RetDualOopNbrInd, POL_4_RET_DUAL_OOP_NBR_IND_LEN);
  }

  /**
   * Update Pol4RetDualOopNbrInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4RetDualOopNbrInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetDualOopNbrInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4PolBenLvl Corresponding COBOL Variable is POL4-POL-BEN-LVL
   *
   * @return pol4PolBenLvl
   */
  public List<Pol4PolBenLvl> getPol4PolBenLvl() {
    return pol4PolBenLvl;
  }

  /**
   * Returns the element at the specified position in this list.
   *
   * @param index
   * @return pol4PolBenLvl
   */
  public Pol4PolBenLvl getPol4PolBenLvl(int index) {
    if (index < 0) {
      logger.trace("Array index was {} for getPol4PolBenLvl(), resetting it to 0", index);
      index = 0;
    } else if (index >= POL_4_POL_BEN_LVL_SIZE) {
      index = POL_4_POL_BEN_LVL_SIZE - 1; // can't exceed max array size
      logger.trace(
          "pol4PolBenLvl - Array index exceeded max Size {}, resetting it to max allowed",
          POL_4_POL_BEN_LVL_SIZE);
    }
    if (index >= pol4PolBenLvl.size()) {
      for (int fillIndex = pol4PolBenLvl.size() - 1; fillIndex < index; fillIndex++) {
        pol4PolBenLvl.add(null);
      }
      pol4PolBenLvl.set(
          index,
          new Pol4PolBenLvl(
              this, beginPol4PolBenLvl + index * Pol4PolBenLvl.getPol4PolBenLvlFieldLength()));
    }
    Pol4PolBenLvl value = pol4PolBenLvl.get(index);
    if (value == null) {
      pol4PolBenLvl.set(
          index,
          new Pol4PolBenLvl(
              this, beginPol4PolBenLvl + index * Pol4PolBenLvl.getPol4PolBenLvlFieldLength()));
      value = pol4PolBenLvl.get(index);
    }
    return value;
  }

  /**
   * Update Pol4PolBenLvl at index with the passed value Corresponding COBOL Variable is
   * POL4-POL-BEN-LVL
   *
   * @param index
   * @param value
   */
  public void setPol4PolBenLvl(int index, char[] value) {
    getPol4PolBenLvl(index).setString(value);
  }

  /**
   * Returns the value of pol4FamDed Corresponding COBOL Variable is POL4-FAM-DED
   *
   * @return pol4FamDed
   */
  public List<Pol4FamDed> getPol4FamDed() {
    return pol4FamDed;
  }

  /**
   * Returns the element at the specified position in this list.
   *
   * @param index
   * @return pol4FamDed
   */
  public Pol4FamDed getPol4FamDed(int index) {
    if (index < 0) {
      logger.trace("Array index was {} for getPol4FamDed(), resetting it to 0", index);
      index = 0;
    } else if (index >= POL_4_FAM_DED_SIZE) {
      index = POL_4_FAM_DED_SIZE - 1; // can't exceed max array size
      logger.trace(
          "pol4FamDed - Array index exceeded max Size {}, resetting it to max allowed",
          POL_4_FAM_DED_SIZE);
    }
    if (index >= pol4FamDed.size()) {
      for (int fillIndex = pol4FamDed.size() - 1; fillIndex < index; fillIndex++) {
        pol4FamDed.add(null);
      }
      pol4FamDed.set(
          index,
          new Pol4FamDed(this, beginPol4FamDed + index * Pol4FamDed.getPol4FamDedFieldLength()));
    }
    Pol4FamDed value = pol4FamDed.get(index);
    if (value == null) {
      pol4FamDed.set(
          index,
          new Pol4FamDed(this, beginPol4FamDed + index * Pol4FamDed.getPol4FamDedFieldLength()));
      value = pol4FamDed.get(index);
    }
    return value;
  }

  /**
   * Update Pol4FamDed at index with the passed value Corresponding COBOL Variable is POL4-FAM-DED
   *
   * @param index
   * @param value
   */
  public void setPol4FamDed(int index, char[] value) {
    getPol4FamDed(index).setString(value);
  }

  /**
   * Returns the value of pol4IndDed Corresponding COBOL Variable is POL4-IND-DED
   *
   * @return pol4IndDed
   */
  public List<Pol4IndDed> getPol4IndDed() {
    return pol4IndDed;
  }

  /**
   * Returns the element at the specified position in this list.
   *
   * @param index
   * @return pol4IndDed
   */
  public Pol4IndDed getPol4IndDed(int index) {
    if (index < 0) {
      logger.trace("Array index was {} for getPol4IndDed(), resetting it to 0", index);
      index = 0;
    } else if (index >= POL_4_IND_DED_SIZE) {
      index = POL_4_IND_DED_SIZE - 1; // can't exceed max array size
      logger.trace(
          "pol4IndDed - Array index exceeded max Size {}, resetting it to max allowed",
          POL_4_IND_DED_SIZE);
    }
    if (index >= pol4IndDed.size()) {
      for (int fillIndex = pol4IndDed.size() - 1; fillIndex < index; fillIndex++) {
        pol4IndDed.add(null);
      }
      pol4IndDed.set(
          index,
          new Pol4IndDed(this, beginPol4IndDed + index * Pol4IndDed.getPol4IndDedFieldLength()));
    }
    Pol4IndDed value = pol4IndDed.get(index);
    if (value == null) {
      pol4IndDed.set(
          index,
          new Pol4IndDed(this, beginPol4IndDed + index * Pol4IndDed.getPol4IndDedFieldLength()));
      value = pol4IndDed.get(index);
    }
    return value;
  }

  /**
   * Update Pol4IndDed at index with the passed value Corresponding COBOL Variable is POL4-IND-DED
   *
   * @param index
   * @param value
   */
  public void setPol4IndDed(int index, char[] value) {
    getPol4IndDed(index).setString(value);
  }

  /**
   * Returns the value of pol4RetRhabCombPtLmtCd
   *
   * @return pol4RetRhabCombPtLmtCd
   */
  public char[] getPol4RetRhabCombPtLmtCd() throws CFException {
    if (isPol4RetRhabCombPtLmtCdModified()) {
      pol4RetRhabCombPtLmtCd = refreshPol4RetRhabCombPtLmtCd();
    }
    return pol4RetRhabCombPtLmtCd;
  }

  /**
   * set variable pol4RetRhabCombPtLmtCd Corresponding COBOL Variable is
   * POL4-RET-RHAB-COMB-PT-LMT-CD
   *
   * @param value
   */
  public void setPol4RetRhabCombPtLmtCd(char[] value) {
    pol4RetRhabCombPtLmtCd = checkPol4RetRhabCombPtLmtCdConstraints(value);
    serializePol4RetRhabCombPtLmtCd(pol4RetRhabCombPtLmtCd);
  }

  /**
   * Update Pol4RetRhabCombPtLmtCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetRhabCombPtLmtCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol4RetRhabCombPtLmtCd,
        pol4RetRhabCombPtLmtCd.length);
  }

  public void setPol4RetRhabCombPtLmtCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4RetRhabCombPtLmtCd, pol4RetRhabCombPtLmtCd.length);
  }

  /**
   * Update Pol4RetRhabCombPtLmtCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetRhabCombPtLmtCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetRhabCombPtLmtCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetRhabCombPtLmtCd with another Field
   *
   * @param value
   */
  public void setPol4RetRhabCombPtLmtCd(Field source) {
    replace(
        source, 0, source.length(), beginPol4RetRhabCombPtLmtCd, POL_4_RET_RHAB_COMB_PT_LMT_CD_LEN);
  }

  /**
   * Update Pol4RetRhabCombPtLmtCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetRhabCombPtLmtCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol4RetRhabCombPtLmtCd,
        POL_4_RET_RHAB_COMB_PT_LMT_CD_LEN);
  }

  /**
   * Update Pol4RetRhabCombPtLmtCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4RetRhabCombPtLmtCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetRhabCombPtLmtCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetRhabCombOtLmtCd
   *
   * @return pol4RetRhabCombOtLmtCd
   */
  public char[] getPol4RetRhabCombOtLmtCd() throws CFException {
    if (isPol4RetRhabCombOtLmtCdModified()) {
      pol4RetRhabCombOtLmtCd = refreshPol4RetRhabCombOtLmtCd();
    }
    return pol4RetRhabCombOtLmtCd;
  }

  /**
   * set variable pol4RetRhabCombOtLmtCd Corresponding COBOL Variable is
   * POL4-RET-RHAB-COMB-OT-LMT-CD
   *
   * @param value
   */
  public void setPol4RetRhabCombOtLmtCd(char[] value) {
    pol4RetRhabCombOtLmtCd = checkPol4RetRhabCombOtLmtCdConstraints(value);
    serializePol4RetRhabCombOtLmtCd(pol4RetRhabCombOtLmtCd);
  }

  /**
   * Update Pol4RetRhabCombOtLmtCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetRhabCombOtLmtCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol4RetRhabCombOtLmtCd,
        pol4RetRhabCombOtLmtCd.length);
  }

  public void setPol4RetRhabCombOtLmtCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4RetRhabCombOtLmtCd, pol4RetRhabCombOtLmtCd.length);
  }

  /**
   * Update Pol4RetRhabCombOtLmtCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetRhabCombOtLmtCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetRhabCombOtLmtCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetRhabCombOtLmtCd with another Field
   *
   * @param value
   */
  public void setPol4RetRhabCombOtLmtCd(Field source) {
    replace(
        source, 0, source.length(), beginPol4RetRhabCombOtLmtCd, POL_4_RET_RHAB_COMB_OT_LMT_CD_LEN);
  }

  /**
   * Update Pol4RetRhabCombOtLmtCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetRhabCombOtLmtCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol4RetRhabCombOtLmtCd,
        POL_4_RET_RHAB_COMB_OT_LMT_CD_LEN);
  }

  /**
   * Update Pol4RetRhabCombOtLmtCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4RetRhabCombOtLmtCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetRhabCombOtLmtCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetRhabCombStLmtCd
   *
   * @return pol4RetRhabCombStLmtCd
   */
  public char[] getPol4RetRhabCombStLmtCd() throws CFException {
    if (isPol4RetRhabCombStLmtCdModified()) {
      pol4RetRhabCombStLmtCd = refreshPol4RetRhabCombStLmtCd();
    }
    return pol4RetRhabCombStLmtCd;
  }

  /**
   * set variable pol4RetRhabCombStLmtCd Corresponding COBOL Variable is
   * POL4-RET-RHAB-COMB-ST-LMT-CD
   *
   * @param value
   */
  public void setPol4RetRhabCombStLmtCd(char[] value) {
    pol4RetRhabCombStLmtCd = checkPol4RetRhabCombStLmtCdConstraints(value);
    serializePol4RetRhabCombStLmtCd(pol4RetRhabCombStLmtCd);
  }

  /**
   * Update Pol4RetRhabCombStLmtCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetRhabCombStLmtCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol4RetRhabCombStLmtCd,
        pol4RetRhabCombStLmtCd.length);
  }

  public void setPol4RetRhabCombStLmtCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4RetRhabCombStLmtCd, pol4RetRhabCombStLmtCd.length);
  }

  /**
   * Update Pol4RetRhabCombStLmtCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetRhabCombStLmtCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetRhabCombStLmtCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetRhabCombStLmtCd with another Field
   *
   * @param value
   */
  public void setPol4RetRhabCombStLmtCd(Field source) {
    replace(
        source, 0, source.length(), beginPol4RetRhabCombStLmtCd, POL_4_RET_RHAB_COMB_ST_LMT_CD_LEN);
  }

  /**
   * Update Pol4RetRhabCombStLmtCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetRhabCombStLmtCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol4RetRhabCombStLmtCd,
        POL_4_RET_RHAB_COMB_ST_LMT_CD_LEN);
  }

  /**
   * Update Pol4RetRhabCombStLmtCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4RetRhabCombStLmtCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetRhabCombStLmtCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetRhabCombSmLmtCd
   *
   * @return pol4RetRhabCombSmLmtCd
   */
  public char[] getPol4RetRhabCombSmLmtCd() throws CFException {
    if (isPol4RetRhabCombSmLmtCdModified()) {
      pol4RetRhabCombSmLmtCd = refreshPol4RetRhabCombSmLmtCd();
    }
    return pol4RetRhabCombSmLmtCd;
  }

  /**
   * set variable pol4RetRhabCombSmLmtCd Corresponding COBOL Variable is
   * POL4-RET-RHAB-COMB-SM-LMT-CD
   *
   * @param value
   */
  public void setPol4RetRhabCombSmLmtCd(char[] value) {
    pol4RetRhabCombSmLmtCd = checkPol4RetRhabCombSmLmtCdConstraints(value);
    serializePol4RetRhabCombSmLmtCd(pol4RetRhabCombSmLmtCd);
  }

  /**
   * Update Pol4RetRhabCombSmLmtCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetRhabCombSmLmtCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol4RetRhabCombSmLmtCd,
        pol4RetRhabCombSmLmtCd.length);
  }

  public void setPol4RetRhabCombSmLmtCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4RetRhabCombSmLmtCd, pol4RetRhabCombSmLmtCd.length);
  }

  /**
   * Update Pol4RetRhabCombSmLmtCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetRhabCombSmLmtCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetRhabCombSmLmtCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetRhabCombSmLmtCd with another Field
   *
   * @param value
   */
  public void setPol4RetRhabCombSmLmtCd(Field source) {
    replace(
        source, 0, source.length(), beginPol4RetRhabCombSmLmtCd, POL_4_RET_RHAB_COMB_SM_LMT_CD_LEN);
  }

  /**
   * Update Pol4RetRhabCombSmLmtCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetRhabCombSmLmtCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol4RetRhabCombSmLmtCd,
        POL_4_RET_RHAB_COMB_SM_LMT_CD_LEN);
  }

  /**
   * Update Pol4RetRhabCombSmLmtCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4RetRhabCombSmLmtCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetRhabCombSmLmtCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetRhabCombCiLmtCd
   *
   * @return pol4RetRhabCombCiLmtCd
   */
  public char[] getPol4RetRhabCombCiLmtCd() throws CFException {
    if (isPol4RetRhabCombCiLmtCdModified()) {
      pol4RetRhabCombCiLmtCd = refreshPol4RetRhabCombCiLmtCd();
    }
    return pol4RetRhabCombCiLmtCd;
  }

  /**
   * set variable pol4RetRhabCombCiLmtCd Corresponding COBOL Variable is
   * POL4-RET-RHAB-COMB-CI-LMT-CD
   *
   * @param value
   */
  public void setPol4RetRhabCombCiLmtCd(char[] value) {
    pol4RetRhabCombCiLmtCd = checkPol4RetRhabCombCiLmtCdConstraints(value);
    serializePol4RetRhabCombCiLmtCd(pol4RetRhabCombCiLmtCd);
  }

  /**
   * Update Pol4RetRhabCombCiLmtCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetRhabCombCiLmtCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol4RetRhabCombCiLmtCd,
        pol4RetRhabCombCiLmtCd.length);
  }

  public void setPol4RetRhabCombCiLmtCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4RetRhabCombCiLmtCd, pol4RetRhabCombCiLmtCd.length);
  }

  /**
   * Update Pol4RetRhabCombCiLmtCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetRhabCombCiLmtCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetRhabCombCiLmtCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetRhabCombCiLmtCd with another Field
   *
   * @param value
   */
  public void setPol4RetRhabCombCiLmtCd(Field source) {
    replace(
        source, 0, source.length(), beginPol4RetRhabCombCiLmtCd, POL_4_RET_RHAB_COMB_CI_LMT_CD_LEN);
  }

  /**
   * Update Pol4RetRhabCombCiLmtCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetRhabCombCiLmtCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol4RetRhabCombCiLmtCd,
        POL_4_RET_RHAB_COMB_CI_LMT_CD_LEN);
  }

  /**
   * Update Pol4RetRhabCombCiLmtCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4RetRhabCombCiLmtCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetRhabCombCiLmtCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetRhabCombCtLmtCd
   *
   * @return pol4RetRhabCombCtLmtCd
   */
  public char[] getPol4RetRhabCombCtLmtCd() throws CFException {
    if (isPol4RetRhabCombCtLmtCdModified()) {
      pol4RetRhabCombCtLmtCd = refreshPol4RetRhabCombCtLmtCd();
    }
    return pol4RetRhabCombCtLmtCd;
  }

  /**
   * set variable pol4RetRhabCombCtLmtCd Corresponding COBOL Variable is
   * POL4-RET-RHAB-COMB-CT-LMT-CD
   *
   * @param value
   */
  public void setPol4RetRhabCombCtLmtCd(char[] value) {
    pol4RetRhabCombCtLmtCd = checkPol4RetRhabCombCtLmtCdConstraints(value);
    serializePol4RetRhabCombCtLmtCd(pol4RetRhabCombCtLmtCd);
  }

  /**
   * Update Pol4RetRhabCombCtLmtCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetRhabCombCtLmtCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol4RetRhabCombCtLmtCd,
        pol4RetRhabCombCtLmtCd.length);
  }

  public void setPol4RetRhabCombCtLmtCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4RetRhabCombCtLmtCd, pol4RetRhabCombCtLmtCd.length);
  }

  /**
   * Update Pol4RetRhabCombCtLmtCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetRhabCombCtLmtCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetRhabCombCtLmtCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetRhabCombCtLmtCd with another Field
   *
   * @param value
   */
  public void setPol4RetRhabCombCtLmtCd(Field source) {
    replace(
        source, 0, source.length(), beginPol4RetRhabCombCtLmtCd, POL_4_RET_RHAB_COMB_CT_LMT_CD_LEN);
  }

  /**
   * Update Pol4RetRhabCombCtLmtCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetRhabCombCtLmtCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol4RetRhabCombCtLmtCd,
        POL_4_RET_RHAB_COMB_CT_LMT_CD_LEN);
  }

  /**
   * Update Pol4RetRhabCombCtLmtCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4RetRhabCombCtLmtCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetRhabCombCtLmtCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetRhabCombCrLmtCd
   *
   * @return pol4RetRhabCombCrLmtCd
   */
  public char[] getPol4RetRhabCombCrLmtCd() throws CFException {
    if (isPol4RetRhabCombCrLmtCdModified()) {
      pol4RetRhabCombCrLmtCd = refreshPol4RetRhabCombCrLmtCd();
    }
    return pol4RetRhabCombCrLmtCd;
  }

  /**
   * set variable pol4RetRhabCombCrLmtCd Corresponding COBOL Variable is
   * POL4-RET-RHAB-COMB-CR-LMT-CD
   *
   * @param value
   */
  public void setPol4RetRhabCombCrLmtCd(char[] value) {
    pol4RetRhabCombCrLmtCd = checkPol4RetRhabCombCrLmtCdConstraints(value);
    serializePol4RetRhabCombCrLmtCd(pol4RetRhabCombCrLmtCd);
  }

  /**
   * Update Pol4RetRhabCombCrLmtCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetRhabCombCrLmtCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol4RetRhabCombCrLmtCd,
        pol4RetRhabCombCrLmtCd.length);
  }

  public void setPol4RetRhabCombCrLmtCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4RetRhabCombCrLmtCd, pol4RetRhabCombCrLmtCd.length);
  }

  /**
   * Update Pol4RetRhabCombCrLmtCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetRhabCombCrLmtCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetRhabCombCrLmtCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetRhabCombCrLmtCd with another Field
   *
   * @param value
   */
  public void setPol4RetRhabCombCrLmtCd(Field source) {
    replace(
        source, 0, source.length(), beginPol4RetRhabCombCrLmtCd, POL_4_RET_RHAB_COMB_CR_LMT_CD_LEN);
  }

  /**
   * Update Pol4RetRhabCombCrLmtCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetRhabCombCrLmtCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol4RetRhabCombCrLmtCd,
        POL_4_RET_RHAB_COMB_CR_LMT_CD_LEN);
  }

  /**
   * Update Pol4RetRhabCombCrLmtCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4RetRhabCombCrLmtCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetRhabCombCrLmtCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetRhabCombPrLmtCd
   *
   * @return pol4RetRhabCombPrLmtCd
   */
  public char[] getPol4RetRhabCombPrLmtCd() throws CFException {
    if (isPol4RetRhabCombPrLmtCdModified()) {
      pol4RetRhabCombPrLmtCd = refreshPol4RetRhabCombPrLmtCd();
    }
    return pol4RetRhabCombPrLmtCd;
  }

  /**
   * set variable pol4RetRhabCombPrLmtCd Corresponding COBOL Variable is
   * POL4-RET-RHAB-COMB-PR-LMT-CD
   *
   * @param value
   */
  public void setPol4RetRhabCombPrLmtCd(char[] value) {
    pol4RetRhabCombPrLmtCd = checkPol4RetRhabCombPrLmtCdConstraints(value);
    serializePol4RetRhabCombPrLmtCd(pol4RetRhabCombPrLmtCd);
  }

  /**
   * Update Pol4RetRhabCombPrLmtCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetRhabCombPrLmtCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol4RetRhabCombPrLmtCd,
        pol4RetRhabCombPrLmtCd.length);
  }

  public void setPol4RetRhabCombPrLmtCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4RetRhabCombPrLmtCd, pol4RetRhabCombPrLmtCd.length);
  }

  /**
   * Update Pol4RetRhabCombPrLmtCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetRhabCombPrLmtCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetRhabCombPrLmtCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetRhabCombPrLmtCd with another Field
   *
   * @param value
   */
  public void setPol4RetRhabCombPrLmtCd(Field source) {
    replace(
        source, 0, source.length(), beginPol4RetRhabCombPrLmtCd, POL_4_RET_RHAB_COMB_PR_LMT_CD_LEN);
  }

  /**
   * Update Pol4RetRhabCombPrLmtCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetRhabCombPrLmtCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol4RetRhabCombPrLmtCd,
        POL_4_RET_RHAB_COMB_PR_LMT_CD_LEN);
  }

  /**
   * Update Pol4RetRhabCombPrLmtCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4RetRhabCombPrLmtCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetRhabCombPrLmtCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetRhabCombMtLmtCd
   *
   * @return pol4RetRhabCombMtLmtCd
   */
  public char[] getPol4RetRhabCombMtLmtCd() throws CFException {
    if (isPol4RetRhabCombMtLmtCdModified()) {
      pol4RetRhabCombMtLmtCd = refreshPol4RetRhabCombMtLmtCd();
    }
    return pol4RetRhabCombMtLmtCd;
  }

  /**
   * set variable pol4RetRhabCombMtLmtCd Corresponding COBOL Variable is
   * POL4-RET-RHAB-COMB-MT-LMT-CD
   *
   * @param value
   */
  public void setPol4RetRhabCombMtLmtCd(char[] value) {
    pol4RetRhabCombMtLmtCd = checkPol4RetRhabCombMtLmtCdConstraints(value);
    serializePol4RetRhabCombMtLmtCd(pol4RetRhabCombMtLmtCd);
  }

  /**
   * Update Pol4RetRhabCombMtLmtCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetRhabCombMtLmtCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol4RetRhabCombMtLmtCd,
        pol4RetRhabCombMtLmtCd.length);
  }

  public void setPol4RetRhabCombMtLmtCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4RetRhabCombMtLmtCd, pol4RetRhabCombMtLmtCd.length);
  }

  /**
   * Update Pol4RetRhabCombMtLmtCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetRhabCombMtLmtCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetRhabCombMtLmtCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetRhabCombMtLmtCd with another Field
   *
   * @param value
   */
  public void setPol4RetRhabCombMtLmtCd(Field source) {
    replace(
        source, 0, source.length(), beginPol4RetRhabCombMtLmtCd, POL_4_RET_RHAB_COMB_MT_LMT_CD_LEN);
  }

  /**
   * Update Pol4RetRhabCombMtLmtCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetRhabCombMtLmtCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol4RetRhabCombMtLmtCd,
        POL_4_RET_RHAB_COMB_MT_LMT_CD_LEN);
  }

  /**
   * Update Pol4RetRhabCombMtLmtCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4RetRhabCombMtLmtCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetRhabCombMtLmtCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetHabCombPtLmtCd
   *
   * @return pol4RetHabCombPtLmtCd
   */
  public char[] getPol4RetHabCombPtLmtCd() throws CFException {
    if (isPol4RetHabCombPtLmtCdModified()) {
      pol4RetHabCombPtLmtCd = refreshPol4RetHabCombPtLmtCd();
    }
    return pol4RetHabCombPtLmtCd;
  }

  /**
   * set variable pol4RetHabCombPtLmtCd Corresponding COBOL Variable is POL4-RET-HAB-COMB-PT-LMT-CD
   *
   * @param value
   */
  public void setPol4RetHabCombPtLmtCd(char[] value) {
    pol4RetHabCombPtLmtCd = checkPol4RetHabCombPtLmtCdConstraints(value);
    serializePol4RetHabCombPtLmtCd(pol4RetHabCombPtLmtCd);
  }

  /**
   * Update Pol4RetHabCombPtLmtCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetHabCombPtLmtCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol4RetHabCombPtLmtCd,
        pol4RetHabCombPtLmtCd.length);
  }

  public void setPol4RetHabCombPtLmtCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4RetHabCombPtLmtCd, pol4RetHabCombPtLmtCd.length);
  }

  /**
   * Update Pol4RetHabCombPtLmtCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetHabCombPtLmtCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetHabCombPtLmtCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetHabCombPtLmtCd with another Field
   *
   * @param value
   */
  public void setPol4RetHabCombPtLmtCd(Field source) {
    replace(
        source, 0, source.length(), beginPol4RetHabCombPtLmtCd, POL_4_RET_HAB_COMB_PT_LMT_CD_LEN);
  }

  /**
   * Update Pol4RetHabCombPtLmtCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetHabCombPtLmtCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol4RetHabCombPtLmtCd,
        POL_4_RET_HAB_COMB_PT_LMT_CD_LEN);
  }

  /**
   * Update Pol4RetHabCombPtLmtCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4RetHabCombPtLmtCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetHabCombPtLmtCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetHabCombOtLmtCd
   *
   * @return pol4RetHabCombOtLmtCd
   */
  public char[] getPol4RetHabCombOtLmtCd() throws CFException {
    if (isPol4RetHabCombOtLmtCdModified()) {
      pol4RetHabCombOtLmtCd = refreshPol4RetHabCombOtLmtCd();
    }
    return pol4RetHabCombOtLmtCd;
  }

  /**
   * set variable pol4RetHabCombOtLmtCd Corresponding COBOL Variable is POL4-RET-HAB-COMB-OT-LMT-CD
   *
   * @param value
   */
  public void setPol4RetHabCombOtLmtCd(char[] value) {
    pol4RetHabCombOtLmtCd = checkPol4RetHabCombOtLmtCdConstraints(value);
    serializePol4RetHabCombOtLmtCd(pol4RetHabCombOtLmtCd);
  }

  /**
   * Update Pol4RetHabCombOtLmtCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetHabCombOtLmtCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol4RetHabCombOtLmtCd,
        pol4RetHabCombOtLmtCd.length);
  }

  public void setPol4RetHabCombOtLmtCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4RetHabCombOtLmtCd, pol4RetHabCombOtLmtCd.length);
  }

  /**
   * Update Pol4RetHabCombOtLmtCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetHabCombOtLmtCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetHabCombOtLmtCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetHabCombOtLmtCd with another Field
   *
   * @param value
   */
  public void setPol4RetHabCombOtLmtCd(Field source) {
    replace(
        source, 0, source.length(), beginPol4RetHabCombOtLmtCd, POL_4_RET_HAB_COMB_OT_LMT_CD_LEN);
  }

  /**
   * Update Pol4RetHabCombOtLmtCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetHabCombOtLmtCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol4RetHabCombOtLmtCd,
        POL_4_RET_HAB_COMB_OT_LMT_CD_LEN);
  }

  /**
   * Update Pol4RetHabCombOtLmtCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4RetHabCombOtLmtCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetHabCombOtLmtCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetHabCombStLmtCd
   *
   * @return pol4RetHabCombStLmtCd
   */
  public char[] getPol4RetHabCombStLmtCd() throws CFException {
    if (isPol4RetHabCombStLmtCdModified()) {
      pol4RetHabCombStLmtCd = refreshPol4RetHabCombStLmtCd();
    }
    return pol4RetHabCombStLmtCd;
  }

  /**
   * set variable pol4RetHabCombStLmtCd Corresponding COBOL Variable is POL4-RET-HAB-COMB-ST-LMT-CD
   *
   * @param value
   */
  public void setPol4RetHabCombStLmtCd(char[] value) {
    pol4RetHabCombStLmtCd = checkPol4RetHabCombStLmtCdConstraints(value);
    serializePol4RetHabCombStLmtCd(pol4RetHabCombStLmtCd);
  }

  /**
   * Update Pol4RetHabCombStLmtCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetHabCombStLmtCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol4RetHabCombStLmtCd,
        pol4RetHabCombStLmtCd.length);
  }

  public void setPol4RetHabCombStLmtCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4RetHabCombStLmtCd, pol4RetHabCombStLmtCd.length);
  }

  /**
   * Update Pol4RetHabCombStLmtCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetHabCombStLmtCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetHabCombStLmtCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetHabCombStLmtCd with another Field
   *
   * @param value
   */
  public void setPol4RetHabCombStLmtCd(Field source) {
    replace(
        source, 0, source.length(), beginPol4RetHabCombStLmtCd, POL_4_RET_HAB_COMB_ST_LMT_CD_LEN);
  }

  /**
   * Update Pol4RetHabCombStLmtCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetHabCombStLmtCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol4RetHabCombStLmtCd,
        POL_4_RET_HAB_COMB_ST_LMT_CD_LEN);
  }

  /**
   * Update Pol4RetHabCombStLmtCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4RetHabCombStLmtCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetHabCombStLmtCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetHabCombSmLmtCd
   *
   * @return pol4RetHabCombSmLmtCd
   */
  public char[] getPol4RetHabCombSmLmtCd() throws CFException {
    if (isPol4RetHabCombSmLmtCdModified()) {
      pol4RetHabCombSmLmtCd = refreshPol4RetHabCombSmLmtCd();
    }
    return pol4RetHabCombSmLmtCd;
  }

  /**
   * set variable pol4RetHabCombSmLmtCd Corresponding COBOL Variable is POL4-RET-HAB-COMB-SM-LMT-CD
   *
   * @param value
   */
  public void setPol4RetHabCombSmLmtCd(char[] value) {
    pol4RetHabCombSmLmtCd = checkPol4RetHabCombSmLmtCdConstraints(value);
    serializePol4RetHabCombSmLmtCd(pol4RetHabCombSmLmtCd);
  }

  /**
   * Update Pol4RetHabCombSmLmtCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetHabCombSmLmtCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol4RetHabCombSmLmtCd,
        pol4RetHabCombSmLmtCd.length);
  }

  public void setPol4RetHabCombSmLmtCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4RetHabCombSmLmtCd, pol4RetHabCombSmLmtCd.length);
  }

  /**
   * Update Pol4RetHabCombSmLmtCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetHabCombSmLmtCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetHabCombSmLmtCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetHabCombSmLmtCd with another Field
   *
   * @param value
   */
  public void setPol4RetHabCombSmLmtCd(Field source) {
    replace(
        source, 0, source.length(), beginPol4RetHabCombSmLmtCd, POL_4_RET_HAB_COMB_SM_LMT_CD_LEN);
  }

  /**
   * Update Pol4RetHabCombSmLmtCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetHabCombSmLmtCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol4RetHabCombSmLmtCd,
        POL_4_RET_HAB_COMB_SM_LMT_CD_LEN);
  }

  /**
   * Update Pol4RetHabCombSmLmtCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4RetHabCombSmLmtCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetHabCombSmLmtCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetHabCombCiLmtCd
   *
   * @return pol4RetHabCombCiLmtCd
   */
  public char[] getPol4RetHabCombCiLmtCd() throws CFException {
    if (isPol4RetHabCombCiLmtCdModified()) {
      pol4RetHabCombCiLmtCd = refreshPol4RetHabCombCiLmtCd();
    }
    return pol4RetHabCombCiLmtCd;
  }

  /**
   * set variable pol4RetHabCombCiLmtCd Corresponding COBOL Variable is POL4-RET-HAB-COMB-CI-LMT-CD
   *
   * @param value
   */
  public void setPol4RetHabCombCiLmtCd(char[] value) {
    pol4RetHabCombCiLmtCd = checkPol4RetHabCombCiLmtCdConstraints(value);
    serializePol4RetHabCombCiLmtCd(pol4RetHabCombCiLmtCd);
  }

  /**
   * Update Pol4RetHabCombCiLmtCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetHabCombCiLmtCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol4RetHabCombCiLmtCd,
        pol4RetHabCombCiLmtCd.length);
  }

  public void setPol4RetHabCombCiLmtCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4RetHabCombCiLmtCd, pol4RetHabCombCiLmtCd.length);
  }

  /**
   * Update Pol4RetHabCombCiLmtCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetHabCombCiLmtCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetHabCombCiLmtCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetHabCombCiLmtCd with another Field
   *
   * @param value
   */
  public void setPol4RetHabCombCiLmtCd(Field source) {
    replace(
        source, 0, source.length(), beginPol4RetHabCombCiLmtCd, POL_4_RET_HAB_COMB_CI_LMT_CD_LEN);
  }

  /**
   * Update Pol4RetHabCombCiLmtCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetHabCombCiLmtCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol4RetHabCombCiLmtCd,
        POL_4_RET_HAB_COMB_CI_LMT_CD_LEN);
  }

  /**
   * Update Pol4RetHabCombCiLmtCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4RetHabCombCiLmtCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetHabCombCiLmtCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetHabCombCtLmtCd
   *
   * @return pol4RetHabCombCtLmtCd
   */
  public char[] getPol4RetHabCombCtLmtCd() throws CFException {
    if (isPol4RetHabCombCtLmtCdModified()) {
      pol4RetHabCombCtLmtCd = refreshPol4RetHabCombCtLmtCd();
    }
    return pol4RetHabCombCtLmtCd;
  }

  /**
   * set variable pol4RetHabCombCtLmtCd Corresponding COBOL Variable is POL4-RET-HAB-COMB-CT-LMT-CD
   *
   * @param value
   */
  public void setPol4RetHabCombCtLmtCd(char[] value) {
    pol4RetHabCombCtLmtCd = checkPol4RetHabCombCtLmtCdConstraints(value);
    serializePol4RetHabCombCtLmtCd(pol4RetHabCombCtLmtCd);
  }

  /**
   * Update Pol4RetHabCombCtLmtCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetHabCombCtLmtCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol4RetHabCombCtLmtCd,
        pol4RetHabCombCtLmtCd.length);
  }

  public void setPol4RetHabCombCtLmtCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4RetHabCombCtLmtCd, pol4RetHabCombCtLmtCd.length);
  }

  /**
   * Update Pol4RetHabCombCtLmtCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetHabCombCtLmtCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetHabCombCtLmtCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetHabCombCtLmtCd with another Field
   *
   * @param value
   */
  public void setPol4RetHabCombCtLmtCd(Field source) {
    replace(
        source, 0, source.length(), beginPol4RetHabCombCtLmtCd, POL_4_RET_HAB_COMB_CT_LMT_CD_LEN);
  }

  /**
   * Update Pol4RetHabCombCtLmtCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetHabCombCtLmtCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol4RetHabCombCtLmtCd,
        POL_4_RET_HAB_COMB_CT_LMT_CD_LEN);
  }

  /**
   * Update Pol4RetHabCombCtLmtCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4RetHabCombCtLmtCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetHabCombCtLmtCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetHabCombMtLmtCd
   *
   * @return pol4RetHabCombMtLmtCd
   */
  public char[] getPol4RetHabCombMtLmtCd() throws CFException {
    if (isPol4RetHabCombMtLmtCdModified()) {
      pol4RetHabCombMtLmtCd = refreshPol4RetHabCombMtLmtCd();
    }
    return pol4RetHabCombMtLmtCd;
  }

  /**
   * set variable pol4RetHabCombMtLmtCd Corresponding COBOL Variable is POL4-RET-HAB-COMB-MT-LMT-CD
   *
   * @param value
   */
  public void setPol4RetHabCombMtLmtCd(char[] value) {
    pol4RetHabCombMtLmtCd = checkPol4RetHabCombMtLmtCdConstraints(value);
    serializePol4RetHabCombMtLmtCd(pol4RetHabCombMtLmtCd);
  }

  /**
   * Update Pol4RetHabCombMtLmtCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetHabCombMtLmtCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol4RetHabCombMtLmtCd,
        pol4RetHabCombMtLmtCd.length);
  }

  public void setPol4RetHabCombMtLmtCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4RetHabCombMtLmtCd, pol4RetHabCombMtLmtCd.length);
  }

  /**
   * Update Pol4RetHabCombMtLmtCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetHabCombMtLmtCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetHabCombMtLmtCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetHabCombMtLmtCd with another Field
   *
   * @param value
   */
  public void setPol4RetHabCombMtLmtCd(Field source) {
    replace(
        source, 0, source.length(), beginPol4RetHabCombMtLmtCd, POL_4_RET_HAB_COMB_MT_LMT_CD_LEN);
  }

  /**
   * Update Pol4RetHabCombMtLmtCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetHabCombMtLmtCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol4RetHabCombMtLmtCd,
        POL_4_RET_HAB_COMB_MT_LMT_CD_LEN);
  }

  /**
   * Update Pol4RetHabCombMtLmtCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4RetHabCombMtLmtCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetHabCombMtLmtCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetUgiInd
   *
   * @return pol4RetUgiInd
   */
  public char[] getPol4RetUgiInd() throws CFException {
    if (isPol4RetUgiIndModified()) {
      pol4RetUgiInd = refreshPol4RetUgiInd();
    }
    return pol4RetUgiInd;
  }

  /**
   * set variable pol4RetUgiInd Corresponding COBOL Variable is POL4-RET-UGI-IND
   *
   * @param value
   */
  public void setPol4RetUgiInd(char[] value) {
    pol4RetUgiInd = checkPol4RetUgiIndConstraints(value);
    serializePol4RetUgiInd(pol4RetUgiInd);
  }

  /**
   * Update Pol4RetUgiInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetUgiInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol4RetUgiInd, pol4RetUgiInd.length);
  }

  public void setPol4RetUgiInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetUgiInd, pol4RetUgiInd.length);
  }

  /**
   * Update Pol4RetUgiInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetUgiInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetUgiInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetUgiInd with another Field
   *
   * @param value
   */
  public void setPol4RetUgiInd(Field source) {
    replace(source, 0, source.length(), beginPol4RetUgiInd, POL_4_RET_UGI_IND_LEN);
  }

  /**
   * Update Pol4RetUgiInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetUgiInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetUgiInd, POL_4_RET_UGI_IND_LEN);
  }

  /**
   * Update Pol4RetUgiInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetUgiInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetUgiInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetLgiInd
   *
   * @return pol4RetLgiInd
   */
  public char[] getPol4RetLgiInd() throws CFException {
    if (isPol4RetLgiIndModified()) {
      pol4RetLgiInd = refreshPol4RetLgiInd();
    }
    return pol4RetLgiInd;
  }

  /**
   * set variable pol4RetLgiInd Corresponding COBOL Variable is POL4-RET-LGI-IND
   *
   * @param value
   */
  public void setPol4RetLgiInd(char[] value) {
    pol4RetLgiInd = checkPol4RetLgiIndConstraints(value);
    serializePol4RetLgiInd(pol4RetLgiInd);
  }

  /**
   * Update Pol4RetLgiInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetLgiInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol4RetLgiInd, pol4RetLgiInd.length);
  }

  public void setPol4RetLgiInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetLgiInd, pol4RetLgiInd.length);
  }

  /**
   * Update Pol4RetLgiInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetLgiInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetLgiInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetLgiInd with another Field
   *
   * @param value
   */
  public void setPol4RetLgiInd(Field source) {
    replace(source, 0, source.length(), beginPol4RetLgiInd, POL_4_RET_LGI_IND_LEN);
  }

  /**
   * Update Pol4RetLgiInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetLgiInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetLgiInd, POL_4_RET_LGI_IND_LEN);
  }

  /**
   * Update Pol4RetLgiInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetLgiInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetLgiInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4RetExdInd
   *
   * @return pol4RetExdInd
   */
  public char[] getPol4RetExdInd() throws CFException {
    if (isPol4RetExdIndModified()) {
      pol4RetExdInd = refreshPol4RetExdInd();
    }
    return pol4RetExdInd;
  }

  /**
   * set variable pol4RetExdInd Corresponding COBOL Variable is POL4-RET-EXD-IND
   *
   * @param value
   */
  public void setPol4RetExdInd(char[] value) {
    pol4RetExdInd = checkPol4RetExdIndConstraints(value);
    serializePol4RetExdInd(pol4RetExdInd);
  }

  /**
   * Update Pol4RetExdInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4RetExdInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol4RetExdInd, pol4RetExdInd.length);
  }

  public void setPol4RetExdInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetExdInd, pol4RetExdInd.length);
  }

  /**
   * Update Pol4RetExdInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetExdInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetExdInd + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetExdInd with another Field
   *
   * @param value
   */
  public void setPol4RetExdInd(Field source) {
    replace(source, 0, source.length(), beginPol4RetExdInd, POL_4_RET_EXD_IND_LEN);
  }

  /**
   * Update Pol4RetExdInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetExdInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetExdInd, POL_4_RET_EXD_IND_LEN);
  }

  /**
   * Update Pol4RetExdInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetExdInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4RetExdInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4MmlCovSetNbr
   *
   * @return pol4MmlCovSetNbr
   */
  public char[] getPol4MmlCovSetNbr() throws CFException {
    if (isPol4MmlCovSetNbrModified()) {
      pol4MmlCovSetNbr = refreshPol4MmlCovSetNbr();
    }
    return pol4MmlCovSetNbr;
  }

  /**
   * set variable pol4MmlCovSetNbr Corresponding COBOL Variable is POL4-MML-COV-SET-NBR
   *
   * @param value
   */
  public void setPol4MmlCovSetNbr(char[] value) {
    pol4MmlCovSetNbr = checkPol4MmlCovSetNbrConstraints(value);
    serializePol4MmlCovSetNbr(pol4MmlCovSetNbr);
  }

  /**
   * Update Pol4MmlCovSetNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4MmlCovSetNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol4MmlCovSetNbr, pol4MmlCovSetNbr.length);
  }

  public void setPol4MmlCovSetNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4MmlCovSetNbr, pol4MmlCovSetNbr.length);
  }

  /**
   * Update Pol4MmlCovSetNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4MmlCovSetNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4MmlCovSetNbr + targetIndex, targetLen);
  }

  /**
   * Update Pol4MmlCovSetNbr with another Field
   *
   * @param value
   */
  public void setPol4MmlCovSetNbr(Field source) {
    replace(source, 0, source.length(), beginPol4MmlCovSetNbr, POL_4_MML_COV_SET_NBR_LEN);
  }

  /**
   * Update Pol4MmlCovSetNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4MmlCovSetNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4MmlCovSetNbr, POL_4_MML_COV_SET_NBR_LEN);
  }

  /**
   * Update Pol4MmlCovSetNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4MmlCovSetNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4MmlCovSetNbr + targetIndex, targetLen);
  }

  /**
   * initializes Pol4RetArea4 String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setPol4CovTypCd(CONSTANTS.SPACE);
    setPol4StdPolNbr(CONSTANTS.SPACE_6);
    setPol4StdPlnNbr(0);
    setPol4StdClssNbr(0);
    setPol4CopayVarId(0);
    setPol4CombPrscDedPriCd(CONSTANTS.SPACE);
    setPol4CombPrscDedQualCd(CONSTANTS.SPACE);
    setPol4CombPrscDedSecCd(CONSTANTS.SPACE);
    setPol4CombPrscDedTirCd(CONSTANTS.SPACE);
    setPol4ContrStCd(CONSTANTS.SPACE_2);
    setPol4CopayAmt(BigDecimal.ZERO);
    setPol4FamNewCoinsAmt(0);
    setPol4FamTxtSwapCd(CONSTANTS.SPACE);
    setPol4FamMbrCnt((short) 0);
    setPol4NewCoinsAmt(0);
    setPol4NewCoinsCombPrscCd(CONSTANTS.SPACE);
    setPol4NewCoinsPrdCd((short) 0);
    setPol4NcinsSlryFamMultFct(BigDecimal.ZERO);
    setPol4NcinsSlryFamTypCd(CONSTANTS.SPACE);
    setPol4NcinsSlryIndvTypCd(CONSTANTS.SPACE);
    setPol4NonEmbdDedCd(CONSTANTS.SPACE);
    setPol4NtwkPcpCopayAmt(BigDecimal.ZERO);
    setPol4ObligId(CONSTANTS.SPACE_2);
    setPol4OopCombFamAmt(0);
    setPol4OopCombIndvAmt(0);
    setPol4OopCombPrscCd(CONSTANTS.SPACE);
    setPol4PcpCopayCd(CONSTANTS.SPACE);
    setPol4PcpSpecCoinsInd(CONSTANTS.SPACE);
    setPol4RcprctyTblId(CONSTANTS.SPACE_2);
    setPol4ShrArngCd(CONSTANTS.SPACE_2);
    setPol4SlotTblId(CONSTANTS.SPACE_6);
    setPol4RetSrvcCdNSetInd(CONSTANTS.SPACE);
    setPol4RetSrvcCdPSetInd(CONSTANTS.SPACE);
    setPol4RetSrvcCdTSetInd(CONSTANTS.SPACE);
    setPol4RetSrvcCdASetInd(CONSTANTS.SPACE);
    setPol4RetSrvcCdBSetInd(CONSTANTS.SPACE);
    setPol4RetSrvcCdCSetInd(CONSTANTS.SPACE);
    setPol4RetSrvcCdDSetInd(CONSTANTS.SPACE);
    setPol4RetSrvcCdESetInd(CONSTANTS.SPACE);
    setPol4RetSrvcCdFSetInd(CONSTANTS.SPACE);
    setPol4RetSrvcCdGSetInd(CONSTANTS.SPACE);
    setPol4RetSrvcCdHSetInd(CONSTANTS.SPACE);
    setPol4RetSrvcCdISetInd(CONSTANTS.SPACE);
    setPol4RetSrvcCdJSetInd(CONSTANTS.SPACE);
    setPol4RetSrvcCdKSetInd(CONSTANTS.SPACE);
    setPol4RetSrvcCdLSetInd(CONSTANTS.SPACE);
    setPol4RetSrvcCdMSetInd(CONSTANTS.SPACE);
    setPol4RetSrvcCdOSetInd(CONSTANTS.SPACE);
    setPol4RetSrvcCdQSetInd(CONSTANTS.SPACE);
    setPol4RetSrvcCdRSetInd(CONSTANTS.SPACE);
    setPol4RetSrvcCdSSetInd(CONSTANTS.SPACE);
    setPol4RetSrvcCdUSetInd(CONSTANTS.SPACE);
    setPol4RetSrvcCdVSetInd(CONSTANTS.SPACE);
    setPol4RetSrvcCdWSetInd(CONSTANTS.SPACE);
    setPol4RetSrvcCdXSetInd(CONSTANTS.SPACE);
    setPol4RetSrvcCdYSetInd(CONSTANTS.SPACE);
    setPol4RetSrvcCdZSetInd(CONSTANTS.SPACE);
    setPol4SviTblPriNbr(CONSTANTS.SPACE_6);
    setPol4Tier1CopayAmt(BigDecimal.ZERO);
    setPol4Tier1FamNewCoinsAmt(0);
    setPol4Tier1NewCoinsAmt(0);
    setPol4Tier1UrgntCareAmt(BigDecimal.ZERO);
    setPol4UrgntCareAmt(BigDecimal.ZERO);
    setPol4XtraTerrStMandInd(CONSTANTS.SPACE);
    setPol4TierLabelInd(CONSTANTS.SPACE);
    setPol4DedSpecialProcessCd(CONSTANTS.SPACE);
    setPol4OopInNtwkEePls1Amt(0);
    setPol4OopInNtwkEeSpoAmt(0);
    setPol4OopInNtwkEeChrgAmt(0);
    setPol4OopCombEePls1Amt(0);
    setPol4OopCombEeSpoAmt(0);
    setPol4OopCombEeChrgAmt(0);
    setPol4IplnTypCd(CONSTANTS.SPACE);
    setPol4IndNewCoinsMaxInd(CONSTANTS.SPACE);
    setPol4IndNewCoinsMaxPd(CONSTANTS.SPACE);
    setPol4CoinsCopayApplyInd(CONSTANTS.SPACE_2);
    setPol4CopayMaxAmt(BigDecimal.ZERO);
    setPol4FamDedMaxInd(CONSTANTS.SPACE);
    setPol4OhbsProductCd(CONSTANTS.SPACE);
    setPol4TciTableNumber(CONSTANTS.SPACE_6);
    setPol4CapitationExclInd(CONSTANTS.SPACE);
    setPol4IndemnityInd(CONSTANTS.SPACE_3);
    setPol4AnnualRCInd(CONSTANTS.SPACE);
    setPol4DefaultRCPercent(CONSTANTS.SPACE_2);
    setPol4FacSharedSavInd(CONSTANTS.SPACE);
    setPol4PhysSharedSavInd(CONSTANTS.SPACE);
    setPol4PlanFeatures(CONSTANTS.SPACE_2);
    setPol4PlanFeaturesInd(CONSTANTS.SPACE);
    setPol4AllncCd(CONSTANTS.SPACE);
    setPol4FundTypCd(CONSTANTS.SPACE);
    setPol4PrdctCdId(CONSTANTS.SPACE_4);
    setPol4EmergentWrapInd(CONSTANTS.SPACE);
    setPol4RetOopMaxCovCd(CONSTANTS.SPACE);
    setPol4SpecialProcessCd6(CONSTANTS.SPACE);
    setPol4SpecialProcessCd1(CONSTANTS.SPACE);
    setPol4SpecialProcessCd2(CONSTANTS.SPACE);
    setPol4SpecialProcessCd4(CONSTANTS.SPACE);
    setPol4SpecialProcessCd5(CONSTANTS.SPACE);
    setPol4SpecialProcessCd7(CONSTANTS.SPACE);
    setPol4SpecialProcessCd8(CONSTANTS.SPACE);
    setPol4SpecialProcessCd9(CONSTANTS.SPACE);
    setPol4SpecialProcessCd10(CONSTANTS.SPACE);
    setPol4IndCoreMaxInd(CONSTANTS.SPACE);
    setPol4IndCoreMaxPd(CONSTANTS.SPACE);
    setPol4InnIndCoreAmt(BigDecimal.ZERO);
    setPol4OonIndCoreAmt(BigDecimal.ZERO);
    setPol4T1IndCoreAmt(BigDecimal.ZERO);
    setPol4InnFamCoreAmt(BigDecimal.ZERO);
    setPol4T1FamCoreAmt(BigDecimal.ZERO);
    setPol4OonFamCoreAmt(BigDecimal.ZERO);
    setPol4CrossApplyCoreInd(CONSTANTS.SPACE);
    setPol4CopayIndMaxInn(BigDecimal.ZERO);
    setPol4CopayIndMaxOon(BigDecimal.ZERO);
    setPol4CopayIndMaxT1(BigDecimal.ZERO);
    setPol4CopayFamMaxInn(BigDecimal.ZERO);
    setPol4CopayFamMaxOon(BigDecimal.ZERO);
    setPol4CopayFamMaxT1(BigDecimal.ZERO);
    setPol4CrossApplyCopayInd(CONSTANTS.SPACE);
    setPol4NonEmbMaxCopay(CONSTANTS.SPACE);
    setPol4NonEmbMaxCore(CONSTANTS.SPACE);
    setPol4NonEmbMaxDed(CONSTANTS.SPACE);
    setPol4NonEmbMaxOop(CONSTANTS.SPACE);
    setPol4CoreSlryFamMultFct(BigDecimal.ZERO);
    setPol4CoreSlryFamTypCd(CONSTANTS.SPACE);
    setPol4CoreSlryIndvTypCd(CONSTANTS.SPACE);
    setPol4CoreInNtwkEePls1Amt(0);
    setPol4CoreInNtwkEeSpoAmt(0);
    setPol4CoreInNtwkEeChrgAmt(0);
    setPol4CoreCombEePls1Amt(0);
    setPol4CoreCombEeSpoAmt(0);
    setPol4CoreCombEeChrgAmt(0);
    setPol4RetLmtSrvcCd(CONSTANTS.SPACE);
    setPol4NptRulePkgId(CONSTANTS.SPACE_6);
    setPol4RetDualOopNbrInd(CONSTANTS.SPACE);
    if (pol4PolBenLvl.isEmpty()) {
      // fill the Array to the full capacity
      for (int index = 0; index < POL_4_POL_BEN_LVL_SIZE; index++) {
        Pol4PolBenLvl newElement =
            new Pol4PolBenLvl(
                this, beginPol4PolBenLvl + index * Pol4PolBenLvl.getPol4PolBenLvlFieldLength());
        newElement.initialize();
        pol4PolBenLvl.add(newElement);
      }
    } else {
      if (pol4PolBenLvl.size() < POL_4_POL_BEN_LVL_SIZE) {
        // prefill it first
        for (int index = pol4PolBenLvl.size(); index < POL_4_POL_BEN_LVL_SIZE; index++) {
          Pol4PolBenLvl newElement =
              new Pol4PolBenLvl(
                  this, beginPol4PolBenLvl + index * Pol4PolBenLvl.getPol4PolBenLvlFieldLength());
          pol4PolBenLvl.add(newElement);
        }
      }

      for (int index = 0; index < POL_4_POL_BEN_LVL_SIZE; index++) {
        Pol4PolBenLvl pol4PolBenLvlVar = pol4PolBenLvl.get(index);
        if (pol4PolBenLvlVar == null) {
          pol4PolBenLvlVar =
              new Pol4PolBenLvl(
                  this, beginPol4PolBenLvl + index * Pol4PolBenLvl.getPol4PolBenLvlFieldLength());
          pol4PolBenLvl.set(index, pol4PolBenLvlVar);
        }
        pol4PolBenLvlVar.initialize();
      }
    }
    if (pol4FamDed.isEmpty()) {
      // fill the Array to the full capacity
      for (int index = 0; index < POL_4_FAM_DED_SIZE; index++) {
        Pol4FamDed newElement =
            new Pol4FamDed(this, beginPol4FamDed + index * Pol4FamDed.getPol4FamDedFieldLength());
        newElement.initialize();
        pol4FamDed.add(newElement);
      }
    } else {
      if (pol4FamDed.size() < POL_4_FAM_DED_SIZE) {
        // prefill it first
        for (int index = pol4FamDed.size(); index < POL_4_FAM_DED_SIZE; index++) {
          Pol4FamDed newElement =
              new Pol4FamDed(this, beginPol4FamDed + index * Pol4FamDed.getPol4FamDedFieldLength());
          pol4FamDed.add(newElement);
        }
      }

      for (int index = 0; index < POL_4_FAM_DED_SIZE; index++) {
        Pol4FamDed pol4FamDedVar = pol4FamDed.get(index);
        if (pol4FamDedVar == null) {
          pol4FamDedVar =
              new Pol4FamDed(this, beginPol4FamDed + index * Pol4FamDed.getPol4FamDedFieldLength());
          pol4FamDed.set(index, pol4FamDedVar);
        }
        pol4FamDedVar.initialize();
      }
    }
    if (pol4IndDed.isEmpty()) {
      // fill the Array to the full capacity
      for (int index = 0; index < POL_4_IND_DED_SIZE; index++) {
        Pol4IndDed newElement =
            new Pol4IndDed(this, beginPol4IndDed + index * Pol4IndDed.getPol4IndDedFieldLength());
        newElement.initialize();
        pol4IndDed.add(newElement);
      }
    } else {
      if (pol4IndDed.size() < POL_4_IND_DED_SIZE) {
        // prefill it first
        for (int index = pol4IndDed.size(); index < POL_4_IND_DED_SIZE; index++) {
          Pol4IndDed newElement =
              new Pol4IndDed(this, beginPol4IndDed + index * Pol4IndDed.getPol4IndDedFieldLength());
          pol4IndDed.add(newElement);
        }
      }

      for (int index = 0; index < POL_4_IND_DED_SIZE; index++) {
        Pol4IndDed pol4IndDedVar = pol4IndDed.get(index);
        if (pol4IndDedVar == null) {
          pol4IndDedVar =
              new Pol4IndDed(this, beginPol4IndDed + index * Pol4IndDed.getPol4IndDedFieldLength());
          pol4IndDed.set(index, pol4IndDedVar);
        }
        pol4IndDedVar.initialize();
      }
    }
    setPol4RetRhabCombPtLmtCd(CONSTANTS.SPACE_2);
    setPol4RetRhabCombOtLmtCd(CONSTANTS.SPACE_2);
    setPol4RetRhabCombStLmtCd(CONSTANTS.SPACE_2);
    setPol4RetRhabCombSmLmtCd(CONSTANTS.SPACE_2);
    setPol4RetRhabCombCiLmtCd(CONSTANTS.SPACE_2);
    setPol4RetRhabCombCtLmtCd(CONSTANTS.SPACE_2);
    setPol4RetRhabCombCrLmtCd(CONSTANTS.SPACE_2);
    setPol4RetRhabCombPrLmtCd(CONSTANTS.SPACE_2);
    setPol4RetRhabCombMtLmtCd(CONSTANTS.SPACE_2);
    setPol4RetHabCombPtLmtCd(CONSTANTS.SPACE_2);
    setPol4RetHabCombOtLmtCd(CONSTANTS.SPACE_2);
    setPol4RetHabCombStLmtCd(CONSTANTS.SPACE_2);
    setPol4RetHabCombSmLmtCd(CONSTANTS.SPACE_2);
    setPol4RetHabCombCiLmtCd(CONSTANTS.SPACE_2);
    setPol4RetHabCombCtLmtCd(CONSTANTS.SPACE_2);
    setPol4RetHabCombMtLmtCd(CONSTANTS.SPACE_2);
    setPol4RetUgiInd(CONSTANTS.SPACE);
    setPol4RetLgiInd(CONSTANTS.SPACE);
    setPol4RetExdInd(CONSTANTS.SPACE);
    setPol4MmlCovSetNbr(CONSTANTS.SPACE_3);
  }

  public static int getPol4RetArea4FieldLength() {
    return POL_4_RET_AREA_4_LENGTH;
  }
}
