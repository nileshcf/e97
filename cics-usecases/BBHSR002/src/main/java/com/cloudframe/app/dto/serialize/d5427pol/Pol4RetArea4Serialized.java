package com.cloudframe.app.dto.serialize.d5427pol;

/**
 * The class Pol4RetArea4Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pol4RetArea4Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(Pol4RetArea4Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int POL_4_RET_AREA_4_LENGTH = 746;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginPol4CovTypCd;
  protected int beginPol4StdPolNbr;
  protected int beginPol4StdPlnNbr;
  protected int beginPol4StdClssNbr;
  protected int beginPol4CopayVarId;
  protected int beginPol4CombPrscDedPriCd;
  protected int beginPol4CombPrscDedQualCd;
  protected int beginPol4CombPrscDedSecCd;
  protected int beginPol4CombPrscDedTirCd;
  protected int beginPol4ContrStCd;
  protected int beginPol4CopayAmt;
  protected int beginPol4FamNewCoinsAmt;
  protected int beginPol4FamTxtSwapCd;
  protected int beginPol4FamMbrCnt;
  protected int beginPol4NewCoinsAmt;
  protected int beginPol4NewCoinsCombPrscCd;
  protected int beginPol4NewCoinsPrdCd;
  protected int beginPol4NcinsSlryFamMultFct;
  protected int beginPol4NcinsSlryFamTypCd;
  protected int beginPol4NcinsSlryIndvTypCd;
  protected int beginPol4NonEmbdDedCd;
  protected int beginPol4NtwkPcpCopayAmt;
  protected int beginPol4ObligId;
  protected int beginPol4OopCombFamAmt;
  protected int beginPol4OopCombIndvAmt;
  protected int beginPol4OopCombPrscCd;
  protected int beginPol4PcpCopayCd;
  protected int beginPol4PcpSpecCoinsInd;
  protected int beginPol4RcprctyTblId;
  protected int beginPol4ShrArngCd;
  protected int beginPol4SlotTblId;
  protected int beginPol4RetSrvcCdNSetInd;
  protected int beginPol4RetSrvcCdPSetInd;
  protected int beginPol4RetSrvcCdTSetInd;
  protected int beginPol4RetSrvcCdASetInd;
  protected int beginPol4RetSrvcCdBSetInd;
  protected int beginPol4RetSrvcCdCSetInd;
  protected int beginPol4RetSrvcCdDSetInd;
  protected int beginPol4RetSrvcCdESetInd;
  protected int beginPol4RetSrvcCdFSetInd;
  protected int beginPol4RetSrvcCdGSetInd;
  protected int beginPol4RetSrvcCdHSetInd;
  protected int beginPol4RetSrvcCdISetInd;
  protected int beginPol4RetSrvcCdJSetInd;
  protected int beginPol4RetSrvcCdKSetInd;
  protected int beginPol4RetSrvcCdLSetInd;
  protected int beginPol4RetSrvcCdMSetInd;
  protected int beginPol4RetSrvcCdOSetInd;
  protected int beginPol4RetSrvcCdQSetInd;
  protected int beginPol4RetSrvcCdRSetInd;
  protected int beginPol4RetSrvcCdSSetInd;
  protected int beginPol4RetSrvcCdUSetInd;
  protected int beginPol4RetSrvcCdVSetInd;
  protected int beginPol4RetSrvcCdWSetInd;
  protected int beginPol4RetSrvcCdXSetInd;
  protected int beginPol4RetSrvcCdYSetInd;
  protected int beginPol4RetSrvcCdZSetInd;
  protected int beginPol4SviTblPriNbr;
  protected int beginPol4Tier1CopayAmt;
  protected int beginPol4Tier1FamNewCoinsAmt;
  protected int beginPol4Tier1NewCoinsAmt;
  protected int beginPol4Tier1UrgntCareAmt;
  protected int beginPol4UrgntCareAmt;
  protected int beginPol4XtraTerrStMandInd;
  protected int beginPol4TierLabelInd;
  protected int beginPol4DedSpecialProcessCd;
  protected int beginPol4OopInNtwkEePls1Amt;
  protected int beginPol4OopInNtwkEeSpoAmt;
  protected int beginPol4OopInNtwkEeChrgAmt;
  protected int beginPol4OopCombEePls1Amt;
  protected int beginPol4OopCombEeSpoAmt;
  protected int beginPol4OopCombEeChrgAmt;
  protected int beginPol4IplnTypCd;
  protected int beginPol4IndNewCoinsMaxInd;
  protected int beginPol4IndNewCoinsMaxPd;
  protected int beginPol4CoinsCopayApplyInd;
  protected int beginPol4CopayMaxAmt;
  protected int beginPol4FamDedMaxInd;
  protected int beginPol4OhbsProductCd;
  protected int beginPol4TciTableNumber;
  protected int beginPol4CapitationExclInd;
  protected int beginPol4IndemnityInd;
  protected int beginPol4AnnualRCInd;
  protected int beginPol4DefaultRCPercent;
  protected int beginPol4FacSharedSavInd;
  protected int beginPol4PhysSharedSavInd;
  protected int beginPol4PlanFeatures;
  protected int beginPol4PlanFeaturesInd;
  protected int beginPol4AllncCd;
  protected int beginPol4FundTypCd;
  protected int beginPol4PrdctCdId;
  protected int beginPol4EmergentWrapInd;
  protected int beginPol4RetOopMaxCovCd;
  protected int beginPol4SpecialProcessCd6;
  protected int beginPol4SpecialProcessCd1;
  protected int beginPol4SpecialProcessCd2;
  protected int beginPol4SpecialProcessCd4;
  protected int beginPol4SpecialProcessCd5;
  protected int beginPol4SpecialProcessCd7;
  protected int beginPol4SpecialProcessCd8;
  protected int beginPol4SpecialProcessCd9;
  protected int beginPol4SpecialProcessCd10;
  protected int beginPol4IndCoreMaxInd;
  protected int beginPol4IndCoreMaxPd;
  protected int beginPol4InnIndCoreAmt;
  protected int beginPol4OonIndCoreAmt;
  protected int beginPol4T1IndCoreAmt;
  protected int beginPol4InnFamCoreAmt;
  protected int beginPol4T1FamCoreAmt;
  protected int beginPol4OonFamCoreAmt;
  protected int beginPol4CrossApplyCoreInd;
  protected int beginPol4CopayIndMaxInn;
  protected int beginPol4CopayIndMaxOon;
  protected int beginPol4CopayIndMaxT1;
  protected int beginPol4CopayFamMaxInn;
  protected int beginPol4CopayFamMaxOon;
  protected int beginPol4CopayFamMaxT1;
  protected int beginPol4CrossApplyCopayInd;
  protected int beginPol4NonEmbMaxCopay;
  protected int beginPol4NonEmbMaxCore;
  protected int beginPol4NonEmbMaxDed;
  protected int beginPol4NonEmbMaxOop;
  protected int beginPol4CoreSlryFamMultFct;
  protected int beginPol4CoreSlryFamTypCd;
  protected int beginPol4CoreSlryIndvTypCd;
  protected int beginPol4CoreInNtwkEePls1Amt;
  protected int beginPol4CoreInNtwkEeSpoAmt;
  protected int beginPol4CoreInNtwkEeChrgAmt;
  protected int beginPol4CoreCombEePls1Amt;
  protected int beginPol4CoreCombEeSpoAmt;
  protected int beginPol4CoreCombEeChrgAmt;
  protected int beginPol4RetLmtSrvcCd;
  protected int beginPol4NptRulePkgId;
  protected int beginPol4RetDualOopNbrInd;
  protected int beginPol4PolBenLvl;
  protected static final int POL_4_POL_BEN_LVL_SIZE = 6;
  protected int beginPol4FamDed;
  protected static final int POL_4_FAM_DED_SIZE = 4;
  protected int beginPol4IndDed;
  protected static final int POL_4_IND_DED_SIZE = 6;
  protected int beginPol4RetRhabCombPtLmtCd;
  protected int beginPol4RetRhabCombOtLmtCd;
  protected int beginPol4RetRhabCombStLmtCd;
  protected int beginPol4RetRhabCombSmLmtCd;
  protected int beginPol4RetRhabCombCiLmtCd;
  protected int beginPol4RetRhabCombCtLmtCd;
  protected int beginPol4RetRhabCombCrLmtCd;
  protected int beginPol4RetRhabCombPrLmtCd;
  protected int beginPol4RetRhabCombMtLmtCd;
  protected int beginPol4RetHabCombPtLmtCd;
  protected int beginPol4RetHabCombOtLmtCd;
  protected int beginPol4RetHabCombStLmtCd;
  protected int beginPol4RetHabCombSmLmtCd;
  protected int beginPol4RetHabCombCiLmtCd;
  protected int beginPol4RetHabCombCtLmtCd;
  protected int beginPol4RetHabCombMtLmtCd;
  protected int beginPol4RetUgiInd;
  protected int beginPol4RetLgiInd;
  protected int beginPol4RetExdInd;
  protected int beginPol4MmlCovSetNbr;

  /** Constructor for Pol4RetArea4Serialized */
  public Pol4RetArea4Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for Pol4RetArea4Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public Pol4RetArea4Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this Pol4RetArea4Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 0); // serialize this field at offset 0 by default
  }

  /**
   * sets parent for this Pol4RetArea4Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 0 by default
  }
  /** initializes the field in Pol4RetArea4Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(POL_4_RET_AREA_4_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginPol4CovTypCd = getStartOffset() + 0; // set offset for serialization

    beginPol4StdPolNbr = getStartOffset() + 1; // set offset for serialization

    beginPol4StdPlnNbr = getStartOffset() + 7; // set offset for serialization

    beginPol4StdClssNbr = getStartOffset() + 11; // set offset for serialization

    beginPol4CopayVarId = getStartOffset() + 15; // set offset for serialization

    beginPol4CombPrscDedPriCd = getStartOffset() + 24; // set offset for serialization

    beginPol4CombPrscDedQualCd = getStartOffset() + 25; // set offset for serialization

    beginPol4CombPrscDedSecCd = getStartOffset() + 26; // set offset for serialization

    beginPol4CombPrscDedTirCd = getStartOffset() + 27; // set offset for serialization

    beginPol4ContrStCd = getStartOffset() + 28; // set offset for serialization

    beginPol4CopayAmt = getStartOffset() + 30; // set offset for serialization

    beginPol4FamNewCoinsAmt = getStartOffset() + 35; // set offset for serialization

    beginPol4FamTxtSwapCd = getStartOffset() + 40; // set offset for serialization

    beginPol4FamMbrCnt = getStartOffset() + 41; // set offset for serialization

    beginPol4NewCoinsAmt = getStartOffset() + 43; // set offset for serialization

    beginPol4NewCoinsCombPrscCd = getStartOffset() + 48; // set offset for serialization

    beginPol4NewCoinsPrdCd = getStartOffset() + 49; // set offset for serialization

    beginPol4NcinsSlryFamMultFct = getStartOffset() + 50; // set offset for serialization

    beginPol4NcinsSlryFamTypCd = getStartOffset() + 52; // set offset for serialization

    beginPol4NcinsSlryIndvTypCd = getStartOffset() + 53; // set offset for serialization

    beginPol4NonEmbdDedCd = getStartOffset() + 54; // set offset for serialization

    beginPol4NtwkPcpCopayAmt = getStartOffset() + 55; // set offset for serialization

    beginPol4ObligId = getStartOffset() + 60; // set offset for serialization

    beginPol4OopCombFamAmt = getStartOffset() + 62; // set offset for serialization

    beginPol4OopCombIndvAmt = getStartOffset() + 67; // set offset for serialization

    beginPol4OopCombPrscCd = getStartOffset() + 72; // set offset for serialization

    beginPol4PcpCopayCd = getStartOffset() + 73; // set offset for serialization

    beginPol4PcpSpecCoinsInd = getStartOffset() + 74; // set offset for serialization

    beginPol4RcprctyTblId = getStartOffset() + 75; // set offset for serialization

    beginPol4ShrArngCd = getStartOffset() + 77; // set offset for serialization

    beginPol4SlotTblId = getStartOffset() + 79; // set offset for serialization

    beginPol4RetSrvcCdNSetInd = getStartOffset() + 85; // set offset for serialization

    beginPol4RetSrvcCdPSetInd = getStartOffset() + 86; // set offset for serialization

    beginPol4RetSrvcCdTSetInd = getStartOffset() + 87; // set offset for serialization

    beginPol4RetSrvcCdASetInd = getStartOffset() + 88; // set offset for serialization

    beginPol4RetSrvcCdBSetInd = getStartOffset() + 89; // set offset for serialization

    beginPol4RetSrvcCdCSetInd = getStartOffset() + 90; // set offset for serialization

    beginPol4RetSrvcCdDSetInd = getStartOffset() + 91; // set offset for serialization

    beginPol4RetSrvcCdESetInd = getStartOffset() + 92; // set offset for serialization

    beginPol4RetSrvcCdFSetInd = getStartOffset() + 93; // set offset for serialization

    beginPol4RetSrvcCdGSetInd = getStartOffset() + 94; // set offset for serialization

    beginPol4RetSrvcCdHSetInd = getStartOffset() + 95; // set offset for serialization

    beginPol4RetSrvcCdISetInd = getStartOffset() + 96; // set offset for serialization

    beginPol4RetSrvcCdJSetInd = getStartOffset() + 97; // set offset for serialization

    beginPol4RetSrvcCdKSetInd = getStartOffset() + 98; // set offset for serialization

    beginPol4RetSrvcCdLSetInd = getStartOffset() + 99; // set offset for serialization

    beginPol4RetSrvcCdMSetInd = getStartOffset() + 100; // set offset for serialization

    beginPol4RetSrvcCdOSetInd = getStartOffset() + 101; // set offset for serialization

    beginPol4RetSrvcCdQSetInd = getStartOffset() + 102; // set offset for serialization

    beginPol4RetSrvcCdRSetInd = getStartOffset() + 103; // set offset for serialization

    beginPol4RetSrvcCdSSetInd = getStartOffset() + 104; // set offset for serialization

    beginPol4RetSrvcCdUSetInd = getStartOffset() + 105; // set offset for serialization

    beginPol4RetSrvcCdVSetInd = getStartOffset() + 106; // set offset for serialization

    beginPol4RetSrvcCdWSetInd = getStartOffset() + 107; // set offset for serialization

    beginPol4RetSrvcCdXSetInd = getStartOffset() + 108; // set offset for serialization

    beginPol4RetSrvcCdYSetInd = getStartOffset() + 109; // set offset for serialization

    beginPol4RetSrvcCdZSetInd = getStartOffset() + 110; // set offset for serialization

    beginPol4SviTblPriNbr = getStartOffset() + 111; // set offset for serialization

    beginPol4Tier1CopayAmt = getStartOffset() + 117; // set offset for serialization

    beginPol4Tier1FamNewCoinsAmt = getStartOffset() + 122; // set offset for serialization

    beginPol4Tier1NewCoinsAmt = getStartOffset() + 128; // set offset for serialization

    beginPol4Tier1UrgntCareAmt = getStartOffset() + 134; // set offset for serialization

    beginPol4UrgntCareAmt = getStartOffset() + 139; // set offset for serialization

    beginPol4XtraTerrStMandInd = getStartOffset() + 144; // set offset for serialization

    beginPol4TierLabelInd = getStartOffset() + 145; // set offset for serialization

    beginPol4DedSpecialProcessCd = getStartOffset() + 146; // set offset for serialization

    beginPol4OopInNtwkEePls1Amt = getStartOffset() + 147; // set offset for serialization

    beginPol4OopInNtwkEeSpoAmt = getStartOffset() + 152; // set offset for serialization

    beginPol4OopInNtwkEeChrgAmt = getStartOffset() + 157; // set offset for serialization

    beginPol4OopCombEePls1Amt = getStartOffset() + 162; // set offset for serialization

    beginPol4OopCombEeSpoAmt = getStartOffset() + 167; // set offset for serialization

    beginPol4OopCombEeChrgAmt = getStartOffset() + 172; // set offset for serialization

    beginPol4IplnTypCd = getStartOffset() + 177; // set offset for serialization

    beginPol4IndNewCoinsMaxInd = getStartOffset() + 178; // set offset for serialization

    beginPol4IndNewCoinsMaxPd = getStartOffset() + 179; // set offset for serialization

    beginPol4CoinsCopayApplyInd = getStartOffset() + 180; // set offset for serialization

    beginPol4CopayMaxAmt = getStartOffset() + 182; // set offset for serialization

    beginPol4FamDedMaxInd = getStartOffset() + 191; // set offset for serialization

    beginPol4OhbsProductCd = getStartOffset() + 192; // set offset for serialization

    beginPol4TciTableNumber = getStartOffset() + 193; // set offset for serialization

    beginPol4CapitationExclInd = getStartOffset() + 199; // set offset for serialization

    beginPol4IndemnityInd = getStartOffset() + 200; // set offset for serialization

    beginPol4AnnualRCInd = getStartOffset() + 203; // set offset for serialization

    beginPol4DefaultRCPercent = getStartOffset() + 204; // set offset for serialization

    beginPol4FacSharedSavInd = getStartOffset() + 206; // set offset for serialization

    beginPol4PhysSharedSavInd = getStartOffset() + 207; // set offset for serialization

    beginPol4PlanFeatures = getStartOffset() + 208; // set offset for serialization

    beginPol4PlanFeaturesInd = getStartOffset() + 210; // set offset for serialization

    beginPol4AllncCd = getStartOffset() + 211; // set offset for serialization

    beginPol4FundTypCd = getStartOffset() + 212; // set offset for serialization

    beginPol4PrdctCdId = getStartOffset() + 213; // set offset for serialization

    beginPol4EmergentWrapInd = getStartOffset() + 217; // set offset for serialization

    beginPol4RetOopMaxCovCd = getStartOffset() + 218; // set offset for serialization

    beginPol4SpecialProcessCd6 = getStartOffset() + 219; // set offset for serialization

    beginPol4SpecialProcessCd1 = getStartOffset() + 220; // set offset for serialization

    beginPol4SpecialProcessCd2 = getStartOffset() + 221; // set offset for serialization

    beginPol4SpecialProcessCd4 = getStartOffset() + 222; // set offset for serialization

    beginPol4SpecialProcessCd5 = getStartOffset() + 223; // set offset for serialization

    beginPol4SpecialProcessCd7 = getStartOffset() + 224; // set offset for serialization

    beginPol4SpecialProcessCd8 = getStartOffset() + 225; // set offset for serialization

    beginPol4SpecialProcessCd9 = getStartOffset() + 226; // set offset for serialization

    beginPol4SpecialProcessCd10 = getStartOffset() + 227; // set offset for serialization

    beginPol4IndCoreMaxInd = getStartOffset() + 228; // set offset for serialization

    beginPol4IndCoreMaxPd = getStartOffset() + 229; // set offset for serialization

    beginPol4InnIndCoreAmt = getStartOffset() + 230; // set offset for serialization

    beginPol4OonIndCoreAmt = getStartOffset() + 239; // set offset for serialization

    beginPol4T1IndCoreAmt = getStartOffset() + 248; // set offset for serialization

    beginPol4InnFamCoreAmt = getStartOffset() + 257; // set offset for serialization

    beginPol4T1FamCoreAmt = getStartOffset() + 266; // set offset for serialization

    beginPol4OonFamCoreAmt = getStartOffset() + 275; // set offset for serialization

    beginPol4CrossApplyCoreInd = getStartOffset() + 284; // set offset for serialization

    beginPol4CopayIndMaxInn = getStartOffset() + 285; // set offset for serialization

    beginPol4CopayIndMaxOon = getStartOffset() + 294; // set offset for serialization

    beginPol4CopayIndMaxT1 = getStartOffset() + 303; // set offset for serialization

    beginPol4CopayFamMaxInn = getStartOffset() + 312; // set offset for serialization

    beginPol4CopayFamMaxOon = getStartOffset() + 321; // set offset for serialization

    beginPol4CopayFamMaxT1 = getStartOffset() + 330; // set offset for serialization

    beginPol4CrossApplyCopayInd = getStartOffset() + 339; // set offset for serialization

    beginPol4NonEmbMaxCopay = getStartOffset() + 340; // set offset for serialization

    beginPol4NonEmbMaxCore = getStartOffset() + 341; // set offset for serialization

    beginPol4NonEmbMaxDed = getStartOffset() + 342; // set offset for serialization

    beginPol4NonEmbMaxOop = getStartOffset() + 343; // set offset for serialization

    beginPol4CoreSlryFamMultFct = getStartOffset() + 344; // set offset for serialization

    beginPol4CoreSlryFamTypCd = getStartOffset() + 346; // set offset for serialization

    beginPol4CoreSlryIndvTypCd = getStartOffset() + 347; // set offset for serialization

    beginPol4CoreInNtwkEePls1Amt = getStartOffset() + 348; // set offset for serialization

    beginPol4CoreInNtwkEeSpoAmt = getStartOffset() + 353; // set offset for serialization

    beginPol4CoreInNtwkEeChrgAmt = getStartOffset() + 358; // set offset for serialization

    beginPol4CoreCombEePls1Amt = getStartOffset() + 363; // set offset for serialization

    beginPol4CoreCombEeSpoAmt = getStartOffset() + 368; // set offset for serialization

    beginPol4CoreCombEeChrgAmt = getStartOffset() + 373; // set offset for serialization

    beginPol4RetLmtSrvcCd = getStartOffset() + 378; // set offset for serialization

    beginPol4NptRulePkgId = getStartOffset() + 379; // set offset for serialization

    beginPol4RetDualOopNbrInd = getStartOffset() + 385; // set offset for serialization

    beginPol4PolBenLvl = getStartOffset() + 386; // set offset for serialization

    beginPol4FamDed = getStartOffset() + 482; // set offset for serialization

    beginPol4IndDed = getStartOffset() + 618; // set offset for serialization

    beginPol4RetRhabCombPtLmtCd = getStartOffset() + 708; // set offset for serialization

    beginPol4RetRhabCombOtLmtCd = getStartOffset() + 710; // set offset for serialization

    beginPol4RetRhabCombStLmtCd = getStartOffset() + 712; // set offset for serialization

    beginPol4RetRhabCombSmLmtCd = getStartOffset() + 714; // set offset for serialization

    beginPol4RetRhabCombCiLmtCd = getStartOffset() + 716; // set offset for serialization

    beginPol4RetRhabCombCtLmtCd = getStartOffset() + 718; // set offset for serialization

    beginPol4RetRhabCombCrLmtCd = getStartOffset() + 720; // set offset for serialization

    beginPol4RetRhabCombPrLmtCd = getStartOffset() + 722; // set offset for serialization

    beginPol4RetRhabCombMtLmtCd = getStartOffset() + 724; // set offset for serialization

    beginPol4RetHabCombPtLmtCd = getStartOffset() + 726; // set offset for serialization

    beginPol4RetHabCombOtLmtCd = getStartOffset() + 728; // set offset for serialization

    beginPol4RetHabCombStLmtCd = getStartOffset() + 730; // set offset for serialization

    beginPol4RetHabCombSmLmtCd = getStartOffset() + 732; // set offset for serialization

    beginPol4RetHabCombCiLmtCd = getStartOffset() + 734; // set offset for serialization

    beginPol4RetHabCombCtLmtCd = getStartOffset() + 736; // set offset for serialization

    beginPol4RetHabCombMtLmtCd = getStartOffset() + 738; // set offset for serialization

    beginPol4RetUgiInd = getStartOffset() + 740; // set offset for serialization

    beginPol4RetLgiInd = getStartOffset() + 741; // set offset for serialization

    beginPol4RetExdInd = getStartOffset() + 742; // set offset for serialization

    beginPol4MmlCovSetNbr = getStartOffset() + 743; // set offset for serialization

    /*  end of offset */
  }

  int localPol4CovTypCdCounter = -1;

  public boolean isPol4CovTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4CovTypCdCounter != sharedCounter;
    localPol4CovTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_COV_TYP_CD_LEN = 1;
  /** serialize this Pol4CovTypCd */
  protected void serializePol4CovTypCd(char[] pol4CovTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol4CovTypCd, 0, getStringValue(), beginPol4CovTypCd, POL_4_COV_TYP_CD_LEN);
    localPol4CovTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4CovTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4CovTypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol4CovTypCd() {
    return (substring(
        getStringValue(), beginPol4CovTypCd, beginPol4CovTypCd + POL_4_COV_TYP_CD_LEN));
  }

  int localPol4StdPolNbrCounter = -1;

  public boolean isPol4StdPolNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4StdPolNbrCounter != sharedCounter;
    localPol4StdPolNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_STD_POL_NBR_LEN = 6;
  /** serialize this Pol4StdPolNbr */
  protected void serializePol4StdPolNbr(char[] pol4StdPolNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol4StdPolNbr, 0, getStringValue(), beginPol4StdPolNbr, POL_4_STD_POL_NBR_LEN);
    localPol4StdPolNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4StdPolNbrConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPol4StdPolNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol4StdPolNbr() {
    return (substring(
        getStringValue(), beginPol4StdPolNbr, beginPol4StdPolNbr + POL_4_STD_POL_NBR_LEN));
  }

  int localPol4StdPlnNbrCounter = -1;

  public boolean isPol4StdPlnNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4StdPlnNbrCounter != sharedCounter;
    localPol4StdPlnNbrCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4StdPlnNbr
   *
   * @return pol4StdPlnNbr
   */
  public char[] getPol4StdPlnNbrString() {
    return getCharArray(beginPol4StdPlnNbr, POL_4_STD_PLN_NBR_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4StdPlnNbrIsNumeric() {
    return isNumeric(
        beginPol4StdPlnNbr,
        beginPol4StdPlnNbr + POL_4_STD_PLN_NBR_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_STD_PLN_NBR_LEN = 4;
  /** serializePol4StdPlnNbr */
  protected void serializePol4StdPlnNbr(int pol4StdPlnNbr) {
    putNumber(
        beginPol4StdPlnNbr,
        pol4StdPlnNbr,
        POL_4_STD_PLN_NBR_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4StdPlnNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol4StdPlnNbr */
  protected int serializePol4StdPlnNbr(char[] value) {
    int pol4StdPlnNbr;
    if (value.length > 0 && value.length != 4) value = new String(value).trim().toCharArray();
    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
    else if (value.length > 4) value = substring(value, 0, 4);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol4StdPlnNbr =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(4, value, false /*isSigned?*/), beginPol4StdPlnNbr, 4);
    localPol4StdPlnNbrCounter = shareString.getSerializedField().getModifiedCounter();
    return pol4StdPlnNbr;
  }

  protected int checkPol4StdPlnNbrMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_10K /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol4StdPlnNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshPol4StdPlnNbr() throws CFException {
    try {
      return (getIntNumber(
          beginPol4StdPlnNbr,
          POL_4_STD_PLN_NBR_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("pol4StdPlnNbr", beginPol4StdPlnNbr, POL_4_STD_PLN_NBR_LEN);
    }
  }

  int localPol4StdClssNbrCounter = -1;

  public boolean isPol4StdClssNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4StdClssNbrCounter != sharedCounter;
    localPol4StdClssNbrCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4StdClssNbr
   *
   * @return pol4StdClssNbr
   */
  public char[] getPol4StdClssNbrString() {
    return getCharArray(beginPol4StdClssNbr, POL_4_STD_CLSS_NBR_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4StdClssNbrIsNumeric() {
    return isNumeric(
        beginPol4StdClssNbr,
        beginPol4StdClssNbr + POL_4_STD_CLSS_NBR_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_STD_CLSS_NBR_LEN = 4;
  /** serializePol4StdClssNbr */
  protected void serializePol4StdClssNbr(int pol4StdClssNbr) {
    putNumber(
        beginPol4StdClssNbr,
        pol4StdClssNbr,
        POL_4_STD_CLSS_NBR_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4StdClssNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol4StdClssNbr */
  protected int serializePol4StdClssNbr(char[] value) {
    int pol4StdClssNbr;
    if (value.length > 0 && value.length != 4) value = new String(value).trim().toCharArray();
    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
    else if (value.length > 4) value = substring(value, 0, 4);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol4StdClssNbr =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(4, value, false /*isSigned?*/), beginPol4StdClssNbr, 4);
    localPol4StdClssNbrCounter = shareString.getSerializedField().getModifiedCounter();
    return pol4StdClssNbr;
  }

  protected int checkPol4StdClssNbrMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_10K /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol4StdClssNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshPol4StdClssNbr() throws CFException {
    try {
      return (getIntNumber(
          beginPol4StdClssNbr,
          POL_4_STD_CLSS_NBR_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("pol4StdClssNbr", beginPol4StdClssNbr, POL_4_STD_CLSS_NBR_LEN);
    }
  }

  int localPol4CopayVarIdCounter = -1;

  public boolean isPol4CopayVarIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4CopayVarIdCounter != sharedCounter;
    localPol4CopayVarIdCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4CopayVarId
   *
   * @return pol4CopayVarId
   */
  public char[] getPol4CopayVarIdString() {
    return getCharArray(beginPol4CopayVarId, POL_4_COPAY_VAR_ID_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4CopayVarIdIsNumeric() {
    return isNumeric(
        beginPol4CopayVarId,
        beginPol4CopayVarId + POL_4_COPAY_VAR_ID_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_COPAY_VAR_ID_LEN = 9;
  /** serializePol4CopayVarId */
  protected void serializePol4CopayVarId(int pol4CopayVarId) {
    putNumber(
        beginPol4CopayVarId,
        pol4CopayVarId,
        POL_4_COPAY_VAR_ID_LEN,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4CopayVarIdCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol4CopayVarId */
  protected int serializePol4CopayVarId(char[] value) {
    int pol4CopayVarId;
    if (value.length > 0 && value.length != 9) value = new String(value).trim().toCharArray();
    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
    else if (value.length > 9) value = substring(value, 0, 9);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol4CopayVarId =
        (int)
            convertString2Number(
                value, true /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(9, value, true /*isSigned?*/), beginPol4CopayVarId, 9);
    localPol4CopayVarIdCounter = shareString.getSerializedField().getModifiedCounter();
    return pol4CopayVarId;
  }

  protected int checkPol4CopayVarIdMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1G /*limit*/, true /*isSigned*/);
  }
  /**
   * refreshPol4CopayVarId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshPol4CopayVarId() throws CFException {
    try {
      return (getIntNumber(
          beginPol4CopayVarId,
          POL_4_COPAY_VAR_ID_LEN,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("pol4CopayVarId", beginPol4CopayVarId, POL_4_COPAY_VAR_ID_LEN);
    }
  }

  int localPol4CombPrscDedPriCdCounter = -1;

  public boolean isPol4CombPrscDedPriCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4CombPrscDedPriCdCounter != sharedCounter;
    localPol4CombPrscDedPriCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_COMB_PRSC_DED_PRI_CD_LEN = 1;
  /** serialize this Pol4CombPrscDedPriCd */
  protected void serializePol4CombPrscDedPriCd(char[] pol4CombPrscDedPriCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4CombPrscDedPriCd,
        0,
        getStringValue(),
        beginPol4CombPrscDedPriCd,
        POL_4_COMB_PRSC_DED_PRI_CD_LEN);
    localPol4CombPrscDedPriCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4CombPrscDedPriCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4CombPrscDedPriCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4CombPrscDedPriCd() {
    return (substring(
        getStringValue(),
        beginPol4CombPrscDedPriCd,
        beginPol4CombPrscDedPriCd + POL_4_COMB_PRSC_DED_PRI_CD_LEN));
  }

  int localPol4CombPrscDedQualCdCounter = -1;

  public boolean isPol4CombPrscDedQualCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4CombPrscDedQualCdCounter != sharedCounter;
    localPol4CombPrscDedQualCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_COMB_PRSC_DED_QUAL_CD_LEN = 1;
  /** serialize this Pol4CombPrscDedQualCd */
  protected void serializePol4CombPrscDedQualCd(char[] pol4CombPrscDedQualCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4CombPrscDedQualCd,
        0,
        getStringValue(),
        beginPol4CombPrscDedQualCd,
        POL_4_COMB_PRSC_DED_QUAL_CD_LEN);
    localPol4CombPrscDedQualCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4CombPrscDedQualCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4CombPrscDedQualCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4CombPrscDedQualCd() {
    return (substring(
        getStringValue(),
        beginPol4CombPrscDedQualCd,
        beginPol4CombPrscDedQualCd + POL_4_COMB_PRSC_DED_QUAL_CD_LEN));
  }

  int localPol4CombPrscDedSecCdCounter = -1;

  public boolean isPol4CombPrscDedSecCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4CombPrscDedSecCdCounter != sharedCounter;
    localPol4CombPrscDedSecCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_COMB_PRSC_DED_SEC_CD_LEN = 1;
  /** serialize this Pol4CombPrscDedSecCd */
  protected void serializePol4CombPrscDedSecCd(char[] pol4CombPrscDedSecCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4CombPrscDedSecCd,
        0,
        getStringValue(),
        beginPol4CombPrscDedSecCd,
        POL_4_COMB_PRSC_DED_SEC_CD_LEN);
    localPol4CombPrscDedSecCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4CombPrscDedSecCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4CombPrscDedSecCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4CombPrscDedSecCd() {
    return (substring(
        getStringValue(),
        beginPol4CombPrscDedSecCd,
        beginPol4CombPrscDedSecCd + POL_4_COMB_PRSC_DED_SEC_CD_LEN));
  }

  int localPol4CombPrscDedTirCdCounter = -1;

  public boolean isPol4CombPrscDedTirCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4CombPrscDedTirCdCounter != sharedCounter;
    localPol4CombPrscDedTirCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_COMB_PRSC_DED_TIR_CD_LEN = 1;
  /** serialize this Pol4CombPrscDedTirCd */
  protected void serializePol4CombPrscDedTirCd(char[] pol4CombPrscDedTirCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4CombPrscDedTirCd,
        0,
        getStringValue(),
        beginPol4CombPrscDedTirCd,
        POL_4_COMB_PRSC_DED_TIR_CD_LEN);
    localPol4CombPrscDedTirCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4CombPrscDedTirCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4CombPrscDedTirCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4CombPrscDedTirCd() {
    return (substring(
        getStringValue(),
        beginPol4CombPrscDedTirCd,
        beginPol4CombPrscDedTirCd + POL_4_COMB_PRSC_DED_TIR_CD_LEN));
  }

  int localPol4ContrStCdCounter = -1;

  public boolean isPol4ContrStCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4ContrStCdCounter != sharedCounter;
    localPol4ContrStCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_CONTR_ST_CD_LEN = 2;
  /** serialize this Pol4ContrStCd */
  protected void serializePol4ContrStCd(char[] pol4ContrStCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol4ContrStCd, 0, getStringValue(), beginPol4ContrStCd, POL_4_CONTR_ST_CD_LEN);
    localPol4ContrStCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4ContrStCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol4ContrStCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol4ContrStCd() {
    return (substring(
        getStringValue(), beginPol4ContrStCd, beginPol4ContrStCd + POL_4_CONTR_ST_CD_LEN));
  }

  int localPol4CopayAmtCounter = -1;

  public boolean isPol4CopayAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4CopayAmtCounter != sharedCounter;
    localPol4CopayAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4CopayAmt
   *
   * @return pol4CopayAmt
   */
  public char[] getPol4CopayAmtString() {
    return getCharArray(beginPol4CopayAmt, POL_4_COPAY_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4CopayAmtIsNumeric() {
    return isNumeric(
        beginPol4CopayAmt,
        beginPol4CopayAmt + POL_4_COPAY_AMT_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_COPAY_AMT_LEN = 5;
  protected static final int POL_4_COPAY_AMT_SCALE = 2;

  protected BigDecimal checkPol4CopayAmtMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 5 /*precision*/);
  }

  /** serializePol4CopayAmt */
  protected void serializePol4CopayAmt(BigDecimal pol4CopayAmt) {
    putNumber(
        beginPol4CopayAmt,
        pol4CopayAmt,
        POL_4_COPAY_AMT_LEN,
        POL_4_COPAY_AMT_SCALE,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4CopayAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  /** serializePol4CopayAmt */
  protected BigDecimal serializePol4CopayAmt(char[] value) throws CFException {
    if (value.length < 5) value = pad(5, value, ' ', RIGHT_PAD);
    replaceValue(padNumber(5, value, true /*isSigned?*/), beginPol4CopayAmt, 5);
    localPol4CopayAmtCounter = shareString.getSerializedField().getModifiedCounter();
    try {
      return convertString2Decimal(
          value,
          POL_4_COPAY_AMT_LEN,
          POL_4_COPAY_AMT_SCALE,
          true /*isSigned?*/,
          true /*signTrailing?*/,
          false /*storeSignSeparate?*/);
    } catch (Exception ex) {
      throw getSoc7ABend("pol4CopayAmt", beginPol4CopayAmt, POL_4_COPAY_AMT_LEN);
    }
  }
  /**
   * refreshPol4CopayAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshPol4CopayAmt() throws CFException {
    try {
      return (getDecimalNumber(
          beginPol4CopayAmt,
          POL_4_COPAY_AMT_LEN,
          POL_4_COPAY_AMT_SCALE,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("pol4CopayAmt", beginPol4CopayAmt, POL_4_COPAY_AMT_LEN);
    }
  }

  int localPol4FamNewCoinsAmtCounter = -1;

  public boolean isPol4FamNewCoinsAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4FamNewCoinsAmtCounter != sharedCounter;
    localPol4FamNewCoinsAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4FamNewCoinsAmt
   *
   * @return pol4FamNewCoinsAmt
   */
  public char[] getPol4FamNewCoinsAmtString() {
    return getCharArray(beginPol4FamNewCoinsAmt, POL_4_FAM_NEW_COINS_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4FamNewCoinsAmtIsNumeric() {
    return isNumeric(
        beginPol4FamNewCoinsAmt,
        beginPol4FamNewCoinsAmt + POL_4_FAM_NEW_COINS_AMT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_FAM_NEW_COINS_AMT_LEN = 5;
  /** serializePol4FamNewCoinsAmt */
  protected void serializePol4FamNewCoinsAmt(long pol4FamNewCoinsAmt) {
    putNumber(
        beginPol4FamNewCoinsAmt,
        pol4FamNewCoinsAmt,
        POL_4_FAM_NEW_COINS_AMT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4FamNewCoinsAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol4FamNewCoinsAmt */
  protected long serializePol4FamNewCoinsAmt(char[] value) {
    long pol4FamNewCoinsAmt;
    if (value.length > 0 && value.length != 5) value = new String(value).trim().toCharArray();
    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
    else if (value.length > 5) value = substring(value, 0, 5);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol4FamNewCoinsAmt =
        convertString2Number(
            value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(5, value, false /*isSigned?*/), beginPol4FamNewCoinsAmt, 5);
    localPol4FamNewCoinsAmtCounter = shareString.getSerializedField().getModifiedCounter();
    return pol4FamNewCoinsAmt;
  }

  protected long checkPol4FamNewCoinsAmtMaxLimit(long number) {

    return checkMaxLimit(number, MAX_100K /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol4FamNewCoinsAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public long refreshPol4FamNewCoinsAmt() throws CFException {
    try {
      return (getLongNumber(
          beginPol4FamNewCoinsAmt,
          POL_4_FAM_NEW_COINS_AMT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol4FamNewCoinsAmt", beginPol4FamNewCoinsAmt, POL_4_FAM_NEW_COINS_AMT_LEN);
    }
  }

  int localPol4FamTxtSwapCdCounter = -1;

  public boolean isPol4FamTxtSwapCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4FamTxtSwapCdCounter != sharedCounter;
    localPol4FamTxtSwapCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_FAM_TXT_SWAP_CD_LEN = 1;
  /** serialize this Pol4FamTxtSwapCd */
  protected void serializePol4FamTxtSwapCd(char[] pol4FamTxtSwapCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4FamTxtSwapCd, 0, getStringValue(), beginPol4FamTxtSwapCd, POL_4_FAM_TXT_SWAP_CD_LEN);
    localPol4FamTxtSwapCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4FamTxtSwapCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4FamTxtSwapCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol4FamTxtSwapCd() {
    return (substring(
        getStringValue(),
        beginPol4FamTxtSwapCd,
        beginPol4FamTxtSwapCd + POL_4_FAM_TXT_SWAP_CD_LEN));
  }

  int localPol4FamMbrCntCounter = -1;

  public boolean isPol4FamMbrCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4FamMbrCntCounter != sharedCounter;
    localPol4FamMbrCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_FAM_MBR_CNT_LEN = 2;
  /** serializePol4FamMbrCnt */
  protected void serializePol4FamMbrCnt(short pol4FamMbrCnt) {
    replaceValue( //  save the value as string
        getBinaryString(pol4FamMbrCnt, POL_4_FAM_MBR_CNT_LEN),
        beginPol4FamMbrCnt,
        POL_4_FAM_MBR_CNT_LEN);
    localPol4FamMbrCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkPol4FamMbrCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshPol4FamMbrCnt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshPol4FamMbrCnt() {
    return (getShort(beginPol4FamMbrCnt));
  }

  int localPol4NewCoinsAmtCounter = -1;

  public boolean isPol4NewCoinsAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4NewCoinsAmtCounter != sharedCounter;
    localPol4NewCoinsAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4NewCoinsAmt
   *
   * @return pol4NewCoinsAmt
   */
  public char[] getPol4NewCoinsAmtString() {
    return getCharArray(beginPol4NewCoinsAmt, POL_4_NEW_COINS_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4NewCoinsAmtIsNumeric() {
    return isNumeric(
        beginPol4NewCoinsAmt,
        beginPol4NewCoinsAmt + POL_4_NEW_COINS_AMT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_NEW_COINS_AMT_LEN = 5;
  /** serializePol4NewCoinsAmt */
  protected void serializePol4NewCoinsAmt(long pol4NewCoinsAmt) {
    putNumber(
        beginPol4NewCoinsAmt,
        pol4NewCoinsAmt,
        POL_4_NEW_COINS_AMT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4NewCoinsAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol4NewCoinsAmt */
  protected long serializePol4NewCoinsAmt(char[] value) {
    long pol4NewCoinsAmt;
    if (value.length > 0 && value.length != 5) value = new String(value).trim().toCharArray();
    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
    else if (value.length > 5) value = substring(value, 0, 5);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol4NewCoinsAmt =
        convertString2Number(
            value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(5, value, false /*isSigned?*/), beginPol4NewCoinsAmt, 5);
    localPol4NewCoinsAmtCounter = shareString.getSerializedField().getModifiedCounter();
    return pol4NewCoinsAmt;
  }

  protected long checkPol4NewCoinsAmtMaxLimit(long number) {

    return checkMaxLimit(number, MAX_100K /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol4NewCoinsAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public long refreshPol4NewCoinsAmt() throws CFException {
    try {
      return (getLongNumber(
          beginPol4NewCoinsAmt,
          POL_4_NEW_COINS_AMT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("pol4NewCoinsAmt", beginPol4NewCoinsAmt, POL_4_NEW_COINS_AMT_LEN);
    }
  }

  int localPol4NewCoinsCombPrscCdCounter = -1;

  public boolean isPol4NewCoinsCombPrscCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4NewCoinsCombPrscCdCounter != sharedCounter;
    localPol4NewCoinsCombPrscCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_NEW_COINS_COMB_PRSC_CD_LEN = 1;
  /** serialize this Pol4NewCoinsCombPrscCd */
  protected void serializePol4NewCoinsCombPrscCd(char[] pol4NewCoinsCombPrscCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4NewCoinsCombPrscCd,
        0,
        getStringValue(),
        beginPol4NewCoinsCombPrscCd,
        POL_4_NEW_COINS_COMB_PRSC_CD_LEN);
    localPol4NewCoinsCombPrscCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4NewCoinsCombPrscCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4NewCoinsCombPrscCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4NewCoinsCombPrscCd() {
    return (substring(
        getStringValue(),
        beginPol4NewCoinsCombPrscCd,
        beginPol4NewCoinsCombPrscCd + POL_4_NEW_COINS_COMB_PRSC_CD_LEN));
  }

  int localPol4NewCoinsPrdCdCounter = -1;

  public boolean isPol4NewCoinsPrdCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4NewCoinsPrdCdCounter != sharedCounter;
    localPol4NewCoinsPrdCdCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4NewCoinsPrdCd
   *
   * @return pol4NewCoinsPrdCd
   */
  public char[] getPol4NewCoinsPrdCdString() {
    return getCharArray(beginPol4NewCoinsPrdCd, POL_4_NEW_COINS_PRD_CD_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4NewCoinsPrdCdIsNumeric() {
    return isNumeric(
        beginPol4NewCoinsPrdCd,
        beginPol4NewCoinsPrdCd + POL_4_NEW_COINS_PRD_CD_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_NEW_COINS_PRD_CD_LEN = 1;
  /** serializePol4NewCoinsPrdCd */
  protected void serializePol4NewCoinsPrdCd(short pol4NewCoinsPrdCd) {
    putNumber(
        beginPol4NewCoinsPrdCd,
        pol4NewCoinsPrdCd,
        POL_4_NEW_COINS_PRD_CD_LEN,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4NewCoinsPrdCdCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol4NewCoinsPrdCd */
  protected short serializePol4NewCoinsPrdCd(char[] value) {
    short pol4NewCoinsPrdCd;
    if (value.length > 0 && value.length != 1) value = new String(value).trim().toCharArray();
    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
    else if (value.length > 1) value = substring(value, 0, 1);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol4NewCoinsPrdCd =
        (short)
            convertString2Number(
                value, true /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(1, value, true /*isSigned?*/), beginPol4NewCoinsPrdCd, 1);
    localPol4NewCoinsPrdCdCounter = shareString.getSerializedField().getModifiedCounter();
    return pol4NewCoinsPrdCd;
  }

  protected short checkPol4NewCoinsPrdCdMaxLimit(long number) {

    return (short) checkMaxLimit(number, MAX_10 /*limit*/, true /*isSigned*/);
  }
  /**
   * refreshPol4NewCoinsPrdCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshPol4NewCoinsPrdCd() throws CFException {
    try {
      return (getShortNumber(
          beginPol4NewCoinsPrdCd,
          POL_4_NEW_COINS_PRD_CD_LEN,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("pol4NewCoinsPrdCd", beginPol4NewCoinsPrdCd, POL_4_NEW_COINS_PRD_CD_LEN);
    }
  }

  int localPol4NcinsSlryFamMultFctCounter = -1;

  public boolean isPol4NcinsSlryFamMultFctModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4NcinsSlryFamMultFctCounter != sharedCounter;
    localPol4NcinsSlryFamMultFctCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4NcinsSlryFamMultFct
   *
   * @return pol4NcinsSlryFamMultFct
   */
  public char[] getPol4NcinsSlryFamMultFctString() {
    return getCharArray(beginPol4NcinsSlryFamMultFct, POL_4_NCINS_SLRY_FAM_MULT_FCT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4NcinsSlryFamMultFctIsNumeric() {
    return isNumeric(
        beginPol4NcinsSlryFamMultFct,
        beginPol4NcinsSlryFamMultFct + POL_4_NCINS_SLRY_FAM_MULT_FCT_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_NCINS_SLRY_FAM_MULT_FCT_LEN = 2;
  protected static final int POL_4_NCINS_SLRY_FAM_MULT_FCT_SCALE = 1;

  protected BigDecimal checkPol4NcinsSlryFamMultFctMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 1 /*scale*/, 2 /*precision*/);
  }

  /** serializePol4NcinsSlryFamMultFct */
  protected void serializePol4NcinsSlryFamMultFct(BigDecimal pol4NcinsSlryFamMultFct) {
    putNumber(
        beginPol4NcinsSlryFamMultFct,
        pol4NcinsSlryFamMultFct,
        POL_4_NCINS_SLRY_FAM_MULT_FCT_LEN,
        POL_4_NCINS_SLRY_FAM_MULT_FCT_SCALE,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4NcinsSlryFamMultFctCounter = shareString.getSerializedField().getModifiedCounter();
  }

  /** serializePol4NcinsSlryFamMultFct */
  protected BigDecimal serializePol4NcinsSlryFamMultFct(char[] value) throws CFException {
    if (value.length < 2) value = pad(2, value, ' ', RIGHT_PAD);
    replaceValue(padNumber(2, value, true /*isSigned?*/), beginPol4NcinsSlryFamMultFct, 2);
    localPol4NcinsSlryFamMultFctCounter = shareString.getSerializedField().getModifiedCounter();
    try {
      return convertString2Decimal(
          value,
          POL_4_NCINS_SLRY_FAM_MULT_FCT_LEN,
          POL_4_NCINS_SLRY_FAM_MULT_FCT_SCALE,
          true /*isSigned?*/,
          true /*signTrailing?*/,
          false /*storeSignSeparate?*/);
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol4NcinsSlryFamMultFct",
          beginPol4NcinsSlryFamMultFct,
          POL_4_NCINS_SLRY_FAM_MULT_FCT_LEN);
    }
  }
  /**
   * refreshPol4NcinsSlryFamMultFct is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public BigDecimal refreshPol4NcinsSlryFamMultFct() throws CFException {
    try {
      return (getDecimalNumber(
          beginPol4NcinsSlryFamMultFct,
          POL_4_NCINS_SLRY_FAM_MULT_FCT_LEN,
          POL_4_NCINS_SLRY_FAM_MULT_FCT_SCALE,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol4NcinsSlryFamMultFct",
          beginPol4NcinsSlryFamMultFct,
          POL_4_NCINS_SLRY_FAM_MULT_FCT_LEN);
    }
  }

  int localPol4NcinsSlryFamTypCdCounter = -1;

  public boolean isPol4NcinsSlryFamTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4NcinsSlryFamTypCdCounter != sharedCounter;
    localPol4NcinsSlryFamTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_NCINS_SLRY_FAM_TYP_CD_LEN = 1;
  /** serialize this Pol4NcinsSlryFamTypCd */
  protected void serializePol4NcinsSlryFamTypCd(char[] pol4NcinsSlryFamTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4NcinsSlryFamTypCd,
        0,
        getStringValue(),
        beginPol4NcinsSlryFamTypCd,
        POL_4_NCINS_SLRY_FAM_TYP_CD_LEN);
    localPol4NcinsSlryFamTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4NcinsSlryFamTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4NcinsSlryFamTypCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4NcinsSlryFamTypCd() {
    return (substring(
        getStringValue(),
        beginPol4NcinsSlryFamTypCd,
        beginPol4NcinsSlryFamTypCd + POL_4_NCINS_SLRY_FAM_TYP_CD_LEN));
  }

  int localPol4NcinsSlryIndvTypCdCounter = -1;

  public boolean isPol4NcinsSlryIndvTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4NcinsSlryIndvTypCdCounter != sharedCounter;
    localPol4NcinsSlryIndvTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_NCINS_SLRY_INDV_TYP_CD_LEN = 1;
  /** serialize this Pol4NcinsSlryIndvTypCd */
  protected void serializePol4NcinsSlryIndvTypCd(char[] pol4NcinsSlryIndvTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4NcinsSlryIndvTypCd,
        0,
        getStringValue(),
        beginPol4NcinsSlryIndvTypCd,
        POL_4_NCINS_SLRY_INDV_TYP_CD_LEN);
    localPol4NcinsSlryIndvTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4NcinsSlryIndvTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4NcinsSlryIndvTypCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4NcinsSlryIndvTypCd() {
    return (substring(
        getStringValue(),
        beginPol4NcinsSlryIndvTypCd,
        beginPol4NcinsSlryIndvTypCd + POL_4_NCINS_SLRY_INDV_TYP_CD_LEN));
  }

  int localPol4NonEmbdDedCdCounter = -1;

  public boolean isPol4NonEmbdDedCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4NonEmbdDedCdCounter != sharedCounter;
    localPol4NonEmbdDedCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_NON_EMBD_DED_CD_LEN = 1;
  /** serialize this Pol4NonEmbdDedCd */
  protected void serializePol4NonEmbdDedCd(char[] pol4NonEmbdDedCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4NonEmbdDedCd, 0, getStringValue(), beginPol4NonEmbdDedCd, POL_4_NON_EMBD_DED_CD_LEN);
    localPol4NonEmbdDedCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4NonEmbdDedCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4NonEmbdDedCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol4NonEmbdDedCd() {
    return (substring(
        getStringValue(),
        beginPol4NonEmbdDedCd,
        beginPol4NonEmbdDedCd + POL_4_NON_EMBD_DED_CD_LEN));
  }

  int localPol4NtwkPcpCopayAmtCounter = -1;

  public boolean isPol4NtwkPcpCopayAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4NtwkPcpCopayAmtCounter != sharedCounter;
    localPol4NtwkPcpCopayAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4NtwkPcpCopayAmt
   *
   * @return pol4NtwkPcpCopayAmt
   */
  public char[] getPol4NtwkPcpCopayAmtString() {
    return getCharArray(beginPol4NtwkPcpCopayAmt, POL_4_NTWK_PCP_COPAY_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4NtwkPcpCopayAmtIsNumeric() {
    return isNumeric(
        beginPol4NtwkPcpCopayAmt,
        beginPol4NtwkPcpCopayAmt + POL_4_NTWK_PCP_COPAY_AMT_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_NTWK_PCP_COPAY_AMT_LEN = 5;
  protected static final int POL_4_NTWK_PCP_COPAY_AMT_SCALE = 2;

  protected BigDecimal checkPol4NtwkPcpCopayAmtMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 5 /*precision*/);
  }

  /** serializePol4NtwkPcpCopayAmt */
  protected void serializePol4NtwkPcpCopayAmt(BigDecimal pol4NtwkPcpCopayAmt) {
    putNumber(
        beginPol4NtwkPcpCopayAmt,
        pol4NtwkPcpCopayAmt,
        POL_4_NTWK_PCP_COPAY_AMT_LEN,
        POL_4_NTWK_PCP_COPAY_AMT_SCALE,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4NtwkPcpCopayAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  /** serializePol4NtwkPcpCopayAmt */
  protected BigDecimal serializePol4NtwkPcpCopayAmt(char[] value) throws CFException {
    if (value.length < 5) value = pad(5, value, ' ', RIGHT_PAD);
    replaceValue(padNumber(5, value, true /*isSigned?*/), beginPol4NtwkPcpCopayAmt, 5);
    localPol4NtwkPcpCopayAmtCounter = shareString.getSerializedField().getModifiedCounter();
    try {
      return convertString2Decimal(
          value,
          POL_4_NTWK_PCP_COPAY_AMT_LEN,
          POL_4_NTWK_PCP_COPAY_AMT_SCALE,
          true /*isSigned?*/,
          true /*signTrailing?*/,
          false /*storeSignSeparate?*/);
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol4NtwkPcpCopayAmt", beginPol4NtwkPcpCopayAmt, POL_4_NTWK_PCP_COPAY_AMT_LEN);
    }
  }
  /**
   * refreshPol4NtwkPcpCopayAmt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public BigDecimal refreshPol4NtwkPcpCopayAmt() throws CFException {
    try {
      return (getDecimalNumber(
          beginPol4NtwkPcpCopayAmt,
          POL_4_NTWK_PCP_COPAY_AMT_LEN,
          POL_4_NTWK_PCP_COPAY_AMT_SCALE,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol4NtwkPcpCopayAmt", beginPol4NtwkPcpCopayAmt, POL_4_NTWK_PCP_COPAY_AMT_LEN);
    }
  }

  int localPol4ObligIdCounter = -1;

  public boolean isPol4ObligIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4ObligIdCounter != sharedCounter;
    localPol4ObligIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_OBLIG_ID_LEN = 2;
  /** serialize this Pol4ObligId */
  protected void serializePol4ObligId(char[] pol4ObligId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol4ObligId, 0, getStringValue(), beginPol4ObligId, POL_4_OBLIG_ID_LEN);
    localPol4ObligIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4ObligIdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol4ObligId is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshPol4ObligId() {
    return (substring(getStringValue(), beginPol4ObligId, beginPol4ObligId + POL_4_OBLIG_ID_LEN));
  }

  int localPol4OopCombFamAmtCounter = -1;

  public boolean isPol4OopCombFamAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4OopCombFamAmtCounter != sharedCounter;
    localPol4OopCombFamAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4OopCombFamAmt
   *
   * @return pol4OopCombFamAmt
   */
  public char[] getPol4OopCombFamAmtString() {
    return getCharArray(beginPol4OopCombFamAmt, POL_4_OOP_COMB_FAM_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4OopCombFamAmtIsNumeric() {
    return isNumeric(
        beginPol4OopCombFamAmt,
        beginPol4OopCombFamAmt + POL_4_OOP_COMB_FAM_AMT_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_OOP_COMB_FAM_AMT_LEN = 5;
  /** serializePol4OopCombFamAmt */
  protected void serializePol4OopCombFamAmt(int pol4OopCombFamAmt) {
    putNumber(
        beginPol4OopCombFamAmt,
        pol4OopCombFamAmt,
        POL_4_OOP_COMB_FAM_AMT_LEN,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4OopCombFamAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol4OopCombFamAmt */
  protected int serializePol4OopCombFamAmt(char[] value) {
    int pol4OopCombFamAmt;
    if (value.length > 0 && value.length != 5) value = new String(value).trim().toCharArray();
    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
    else if (value.length > 5) value = substring(value, 0, 5);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol4OopCombFamAmt =
        (int)
            convertString2Number(
                value, true /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(5, value, true /*isSigned?*/), beginPol4OopCombFamAmt, 5);
    localPol4OopCombFamAmtCounter = shareString.getSerializedField().getModifiedCounter();
    return pol4OopCombFamAmt;
  }

  protected int checkPol4OopCombFamAmtMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_100K /*limit*/, true /*isSigned*/);
  }
  /**
   * refreshPol4OopCombFamAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshPol4OopCombFamAmt() throws CFException {
    try {
      return (getIntNumber(
          beginPol4OopCombFamAmt,
          POL_4_OOP_COMB_FAM_AMT_LEN,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("pol4OopCombFamAmt", beginPol4OopCombFamAmt, POL_4_OOP_COMB_FAM_AMT_LEN);
    }
  }

  int localPol4OopCombIndvAmtCounter = -1;

  public boolean isPol4OopCombIndvAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4OopCombIndvAmtCounter != sharedCounter;
    localPol4OopCombIndvAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4OopCombIndvAmt
   *
   * @return pol4OopCombIndvAmt
   */
  public char[] getPol4OopCombIndvAmtString() {
    return getCharArray(beginPol4OopCombIndvAmt, POL_4_OOP_COMB_INDV_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4OopCombIndvAmtIsNumeric() {
    return isNumeric(
        beginPol4OopCombIndvAmt,
        beginPol4OopCombIndvAmt + POL_4_OOP_COMB_INDV_AMT_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_OOP_COMB_INDV_AMT_LEN = 5;
  /** serializePol4OopCombIndvAmt */
  protected void serializePol4OopCombIndvAmt(int pol4OopCombIndvAmt) {
    putNumber(
        beginPol4OopCombIndvAmt,
        pol4OopCombIndvAmt,
        POL_4_OOP_COMB_INDV_AMT_LEN,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4OopCombIndvAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol4OopCombIndvAmt */
  protected int serializePol4OopCombIndvAmt(char[] value) {
    int pol4OopCombIndvAmt;
    if (value.length > 0 && value.length != 5) value = new String(value).trim().toCharArray();
    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
    else if (value.length > 5) value = substring(value, 0, 5);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol4OopCombIndvAmt =
        (int)
            convertString2Number(
                value, true /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(5, value, true /*isSigned?*/), beginPol4OopCombIndvAmt, 5);
    localPol4OopCombIndvAmtCounter = shareString.getSerializedField().getModifiedCounter();
    return pol4OopCombIndvAmt;
  }

  protected int checkPol4OopCombIndvAmtMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_100K /*limit*/, true /*isSigned*/);
  }
  /**
   * refreshPol4OopCombIndvAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshPol4OopCombIndvAmt() throws CFException {
    try {
      return (getIntNumber(
          beginPol4OopCombIndvAmt,
          POL_4_OOP_COMB_INDV_AMT_LEN,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol4OopCombIndvAmt", beginPol4OopCombIndvAmt, POL_4_OOP_COMB_INDV_AMT_LEN);
    }
  }

  int localPol4OopCombPrscCdCounter = -1;

  public boolean isPol4OopCombPrscCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4OopCombPrscCdCounter != sharedCounter;
    localPol4OopCombPrscCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_OOP_COMB_PRSC_CD_LEN = 1;
  /** serialize this Pol4OopCombPrscCd */
  protected void serializePol4OopCombPrscCd(char[] pol4OopCombPrscCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4OopCombPrscCd, 0, getStringValue(), beginPol4OopCombPrscCd, POL_4_OOP_COMB_PRSC_CD_LEN);
    localPol4OopCombPrscCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4OopCombPrscCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4OopCombPrscCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol4OopCombPrscCd() {
    return (substring(
        getStringValue(),
        beginPol4OopCombPrscCd,
        beginPol4OopCombPrscCd + POL_4_OOP_COMB_PRSC_CD_LEN));
  }

  int localPol4PcpCopayCdCounter = -1;

  public boolean isPol4PcpCopayCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4PcpCopayCdCounter != sharedCounter;
    localPol4PcpCopayCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_PCP_COPAY_CD_LEN = 1;
  /** serialize this Pol4PcpCopayCd */
  protected void serializePol4PcpCopayCd(char[] pol4PcpCopayCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol4PcpCopayCd, 0, getStringValue(), beginPol4PcpCopayCd, POL_4_PCP_COPAY_CD_LEN);
    localPol4PcpCopayCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4PcpCopayCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4PcpCopayCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol4PcpCopayCd() {
    return (substring(
        getStringValue(), beginPol4PcpCopayCd, beginPol4PcpCopayCd + POL_4_PCP_COPAY_CD_LEN));
  }

  int localPol4PcpSpecCoinsIndCounter = -1;

  public boolean isPol4PcpSpecCoinsIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4PcpSpecCoinsIndCounter != sharedCounter;
    localPol4PcpSpecCoinsIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_PCP_SPEC_COINS_IND_LEN = 1;
  /** serialize this Pol4PcpSpecCoinsInd */
  protected void serializePol4PcpSpecCoinsInd(char[] pol4PcpSpecCoinsInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4PcpSpecCoinsInd,
        0,
        getStringValue(),
        beginPol4PcpSpecCoinsInd,
        POL_4_PCP_SPEC_COINS_IND_LEN);
    localPol4PcpSpecCoinsIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4PcpSpecCoinsIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4PcpSpecCoinsInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4PcpSpecCoinsInd() {
    return (substring(
        getStringValue(),
        beginPol4PcpSpecCoinsInd,
        beginPol4PcpSpecCoinsInd + POL_4_PCP_SPEC_COINS_IND_LEN));
  }

  int localPol4RcprctyTblIdCounter = -1;

  public boolean isPol4RcprctyTblIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RcprctyTblIdCounter != sharedCounter;
    localPol4RcprctyTblIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RCPRCTY_TBL_ID_LEN = 2;
  /** serialize this Pol4RcprctyTblId */
  protected void serializePol4RcprctyTblId(char[] pol4RcprctyTblId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RcprctyTblId, 0, getStringValue(), beginPol4RcprctyTblId, POL_4_RCPRCTY_TBL_ID_LEN);
    localPol4RcprctyTblIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RcprctyTblIdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol4RcprctyTblId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol4RcprctyTblId() {
    return (substring(
        getStringValue(), beginPol4RcprctyTblId, beginPol4RcprctyTblId + POL_4_RCPRCTY_TBL_ID_LEN));
  }

  int localPol4ShrArngCdCounter = -1;

  public boolean isPol4ShrArngCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4ShrArngCdCounter != sharedCounter;
    localPol4ShrArngCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_SHR_ARNG_CD_LEN = 2;
  /** serialize this Pol4ShrArngCd */
  protected void serializePol4ShrArngCd(char[] pol4ShrArngCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol4ShrArngCd, 0, getStringValue(), beginPol4ShrArngCd, POL_4_SHR_ARNG_CD_LEN);
    localPol4ShrArngCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4ShrArngCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol4ShrArngCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol4ShrArngCd() {
    return (substring(
        getStringValue(), beginPol4ShrArngCd, beginPol4ShrArngCd + POL_4_SHR_ARNG_CD_LEN));
  }

  int localPol4SlotTblIdCounter = -1;

  public boolean isPol4SlotTblIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4SlotTblIdCounter != sharedCounter;
    localPol4SlotTblIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_SLOT_TBL_ID_LEN = 6;
  /** serialize this Pol4SlotTblId */
  protected void serializePol4SlotTblId(char[] pol4SlotTblId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol4SlotTblId, 0, getStringValue(), beginPol4SlotTblId, POL_4_SLOT_TBL_ID_LEN);
    localPol4SlotTblIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4SlotTblIdConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPol4SlotTblId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol4SlotTblId() {
    return (substring(
        getStringValue(), beginPol4SlotTblId, beginPol4SlotTblId + POL_4_SLOT_TBL_ID_LEN));
  }

  int localPol4RetSrvcCdNSetIndCounter = -1;

  public boolean isPol4RetSrvcCdNSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetSrvcCdNSetIndCounter != sharedCounter;
    localPol4RetSrvcCdNSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_SRVC_CD_NSET_IND_LEN = 1;
  /** serialize this Pol4RetSrvcCdNSetInd */
  protected void serializePol4RetSrvcCdNSetInd(char[] pol4RetSrvcCdNSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetSrvcCdNSetInd,
        0,
        getStringValue(),
        beginPol4RetSrvcCdNSetInd,
        POL_4_RET_SRVC_CD_NSET_IND_LEN);
    localPol4RetSrvcCdNSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetSrvcCdNSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4RetSrvcCdNSetInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetSrvcCdNSetInd() {
    return (substring(
        getStringValue(),
        beginPol4RetSrvcCdNSetInd,
        beginPol4RetSrvcCdNSetInd + POL_4_RET_SRVC_CD_NSET_IND_LEN));
  }

  int localPol4RetSrvcCdPSetIndCounter = -1;

  public boolean isPol4RetSrvcCdPSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetSrvcCdPSetIndCounter != sharedCounter;
    localPol4RetSrvcCdPSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_SRVC_CD_PSET_IND_LEN = 1;
  /** serialize this Pol4RetSrvcCdPSetInd */
  protected void serializePol4RetSrvcCdPSetInd(char[] pol4RetSrvcCdPSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetSrvcCdPSetInd,
        0,
        getStringValue(),
        beginPol4RetSrvcCdPSetInd,
        POL_4_RET_SRVC_CD_PSET_IND_LEN);
    localPol4RetSrvcCdPSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetSrvcCdPSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4RetSrvcCdPSetInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetSrvcCdPSetInd() {
    return (substring(
        getStringValue(),
        beginPol4RetSrvcCdPSetInd,
        beginPol4RetSrvcCdPSetInd + POL_4_RET_SRVC_CD_PSET_IND_LEN));
  }

  int localPol4RetSrvcCdTSetIndCounter = -1;

  public boolean isPol4RetSrvcCdTSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetSrvcCdTSetIndCounter != sharedCounter;
    localPol4RetSrvcCdTSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_SRVC_CD_TSET_IND_LEN = 1;
  /** serialize this Pol4RetSrvcCdTSetInd */
  protected void serializePol4RetSrvcCdTSetInd(char[] pol4RetSrvcCdTSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetSrvcCdTSetInd,
        0,
        getStringValue(),
        beginPol4RetSrvcCdTSetInd,
        POL_4_RET_SRVC_CD_TSET_IND_LEN);
    localPol4RetSrvcCdTSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetSrvcCdTSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4RetSrvcCdTSetInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetSrvcCdTSetInd() {
    return (substring(
        getStringValue(),
        beginPol4RetSrvcCdTSetInd,
        beginPol4RetSrvcCdTSetInd + POL_4_RET_SRVC_CD_TSET_IND_LEN));
  }

  int localPol4RetSrvcCdASetIndCounter = -1;

  public boolean isPol4RetSrvcCdASetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetSrvcCdASetIndCounter != sharedCounter;
    localPol4RetSrvcCdASetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_SRVC_CD_ASET_IND_LEN = 1;
  /** serialize this Pol4RetSrvcCdASetInd */
  protected void serializePol4RetSrvcCdASetInd(char[] pol4RetSrvcCdASetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetSrvcCdASetInd,
        0,
        getStringValue(),
        beginPol4RetSrvcCdASetInd,
        POL_4_RET_SRVC_CD_ASET_IND_LEN);
    localPol4RetSrvcCdASetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetSrvcCdASetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4RetSrvcCdASetInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetSrvcCdASetInd() {
    return (substring(
        getStringValue(),
        beginPol4RetSrvcCdASetInd,
        beginPol4RetSrvcCdASetInd + POL_4_RET_SRVC_CD_ASET_IND_LEN));
  }

  int localPol4RetSrvcCdBSetIndCounter = -1;

  public boolean isPol4RetSrvcCdBSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetSrvcCdBSetIndCounter != sharedCounter;
    localPol4RetSrvcCdBSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_SRVC_CD_BSET_IND_LEN = 1;
  /** serialize this Pol4RetSrvcCdBSetInd */
  protected void serializePol4RetSrvcCdBSetInd(char[] pol4RetSrvcCdBSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetSrvcCdBSetInd,
        0,
        getStringValue(),
        beginPol4RetSrvcCdBSetInd,
        POL_4_RET_SRVC_CD_BSET_IND_LEN);
    localPol4RetSrvcCdBSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetSrvcCdBSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4RetSrvcCdBSetInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetSrvcCdBSetInd() {
    return (substring(
        getStringValue(),
        beginPol4RetSrvcCdBSetInd,
        beginPol4RetSrvcCdBSetInd + POL_4_RET_SRVC_CD_BSET_IND_LEN));
  }

  int localPol4RetSrvcCdCSetIndCounter = -1;

  public boolean isPol4RetSrvcCdCSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetSrvcCdCSetIndCounter != sharedCounter;
    localPol4RetSrvcCdCSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_SRVC_CD_CSET_IND_LEN = 1;
  /** serialize this Pol4RetSrvcCdCSetInd */
  protected void serializePol4RetSrvcCdCSetInd(char[] pol4RetSrvcCdCSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetSrvcCdCSetInd,
        0,
        getStringValue(),
        beginPol4RetSrvcCdCSetInd,
        POL_4_RET_SRVC_CD_CSET_IND_LEN);
    localPol4RetSrvcCdCSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetSrvcCdCSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4RetSrvcCdCSetInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetSrvcCdCSetInd() {
    return (substring(
        getStringValue(),
        beginPol4RetSrvcCdCSetInd,
        beginPol4RetSrvcCdCSetInd + POL_4_RET_SRVC_CD_CSET_IND_LEN));
  }

  int localPol4RetSrvcCdDSetIndCounter = -1;

  public boolean isPol4RetSrvcCdDSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetSrvcCdDSetIndCounter != sharedCounter;
    localPol4RetSrvcCdDSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_SRVC_CD_DSET_IND_LEN = 1;
  /** serialize this Pol4RetSrvcCdDSetInd */
  protected void serializePol4RetSrvcCdDSetInd(char[] pol4RetSrvcCdDSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetSrvcCdDSetInd,
        0,
        getStringValue(),
        beginPol4RetSrvcCdDSetInd,
        POL_4_RET_SRVC_CD_DSET_IND_LEN);
    localPol4RetSrvcCdDSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetSrvcCdDSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4RetSrvcCdDSetInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetSrvcCdDSetInd() {
    return (substring(
        getStringValue(),
        beginPol4RetSrvcCdDSetInd,
        beginPol4RetSrvcCdDSetInd + POL_4_RET_SRVC_CD_DSET_IND_LEN));
  }

  int localPol4RetSrvcCdESetIndCounter = -1;

  public boolean isPol4RetSrvcCdESetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetSrvcCdESetIndCounter != sharedCounter;
    localPol4RetSrvcCdESetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_SRVC_CD_ESET_IND_LEN = 1;
  /** serialize this Pol4RetSrvcCdESetInd */
  protected void serializePol4RetSrvcCdESetInd(char[] pol4RetSrvcCdESetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetSrvcCdESetInd,
        0,
        getStringValue(),
        beginPol4RetSrvcCdESetInd,
        POL_4_RET_SRVC_CD_ESET_IND_LEN);
    localPol4RetSrvcCdESetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetSrvcCdESetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4RetSrvcCdESetInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetSrvcCdESetInd() {
    return (substring(
        getStringValue(),
        beginPol4RetSrvcCdESetInd,
        beginPol4RetSrvcCdESetInd + POL_4_RET_SRVC_CD_ESET_IND_LEN));
  }

  int localPol4RetSrvcCdFSetIndCounter = -1;

  public boolean isPol4RetSrvcCdFSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetSrvcCdFSetIndCounter != sharedCounter;
    localPol4RetSrvcCdFSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_SRVC_CD_FSET_IND_LEN = 1;
  /** serialize this Pol4RetSrvcCdFSetInd */
  protected void serializePol4RetSrvcCdFSetInd(char[] pol4RetSrvcCdFSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetSrvcCdFSetInd,
        0,
        getStringValue(),
        beginPol4RetSrvcCdFSetInd,
        POL_4_RET_SRVC_CD_FSET_IND_LEN);
    localPol4RetSrvcCdFSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetSrvcCdFSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4RetSrvcCdFSetInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetSrvcCdFSetInd() {
    return (substring(
        getStringValue(),
        beginPol4RetSrvcCdFSetInd,
        beginPol4RetSrvcCdFSetInd + POL_4_RET_SRVC_CD_FSET_IND_LEN));
  }

  int localPol4RetSrvcCdGSetIndCounter = -1;

  public boolean isPol4RetSrvcCdGSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetSrvcCdGSetIndCounter != sharedCounter;
    localPol4RetSrvcCdGSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_SRVC_CD_GSET_IND_LEN = 1;
  /** serialize this Pol4RetSrvcCdGSetInd */
  protected void serializePol4RetSrvcCdGSetInd(char[] pol4RetSrvcCdGSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetSrvcCdGSetInd,
        0,
        getStringValue(),
        beginPol4RetSrvcCdGSetInd,
        POL_4_RET_SRVC_CD_GSET_IND_LEN);
    localPol4RetSrvcCdGSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetSrvcCdGSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4RetSrvcCdGSetInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetSrvcCdGSetInd() {
    return (substring(
        getStringValue(),
        beginPol4RetSrvcCdGSetInd,
        beginPol4RetSrvcCdGSetInd + POL_4_RET_SRVC_CD_GSET_IND_LEN));
  }

  int localPol4RetSrvcCdHSetIndCounter = -1;

  public boolean isPol4RetSrvcCdHSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetSrvcCdHSetIndCounter != sharedCounter;
    localPol4RetSrvcCdHSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_SRVC_CD_HSET_IND_LEN = 1;
  /** serialize this Pol4RetSrvcCdHSetInd */
  protected void serializePol4RetSrvcCdHSetInd(char[] pol4RetSrvcCdHSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetSrvcCdHSetInd,
        0,
        getStringValue(),
        beginPol4RetSrvcCdHSetInd,
        POL_4_RET_SRVC_CD_HSET_IND_LEN);
    localPol4RetSrvcCdHSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetSrvcCdHSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4RetSrvcCdHSetInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetSrvcCdHSetInd() {
    return (substring(
        getStringValue(),
        beginPol4RetSrvcCdHSetInd,
        beginPol4RetSrvcCdHSetInd + POL_4_RET_SRVC_CD_HSET_IND_LEN));
  }

  int localPol4RetSrvcCdISetIndCounter = -1;

  public boolean isPol4RetSrvcCdISetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetSrvcCdISetIndCounter != sharedCounter;
    localPol4RetSrvcCdISetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_SRVC_CD_ISET_IND_LEN = 1;
  /** serialize this Pol4RetSrvcCdISetInd */
  protected void serializePol4RetSrvcCdISetInd(char[] pol4RetSrvcCdISetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetSrvcCdISetInd,
        0,
        getStringValue(),
        beginPol4RetSrvcCdISetInd,
        POL_4_RET_SRVC_CD_ISET_IND_LEN);
    localPol4RetSrvcCdISetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetSrvcCdISetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4RetSrvcCdISetInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetSrvcCdISetInd() {
    return (substring(
        getStringValue(),
        beginPol4RetSrvcCdISetInd,
        beginPol4RetSrvcCdISetInd + POL_4_RET_SRVC_CD_ISET_IND_LEN));
  }

  int localPol4RetSrvcCdJSetIndCounter = -1;

  public boolean isPol4RetSrvcCdJSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetSrvcCdJSetIndCounter != sharedCounter;
    localPol4RetSrvcCdJSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_SRVC_CD_JSET_IND_LEN = 1;
  /** serialize this Pol4RetSrvcCdJSetInd */
  protected void serializePol4RetSrvcCdJSetInd(char[] pol4RetSrvcCdJSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetSrvcCdJSetInd,
        0,
        getStringValue(),
        beginPol4RetSrvcCdJSetInd,
        POL_4_RET_SRVC_CD_JSET_IND_LEN);
    localPol4RetSrvcCdJSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetSrvcCdJSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4RetSrvcCdJSetInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetSrvcCdJSetInd() {
    return (substring(
        getStringValue(),
        beginPol4RetSrvcCdJSetInd,
        beginPol4RetSrvcCdJSetInd + POL_4_RET_SRVC_CD_JSET_IND_LEN));
  }

  int localPol4RetSrvcCdKSetIndCounter = -1;

  public boolean isPol4RetSrvcCdKSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetSrvcCdKSetIndCounter != sharedCounter;
    localPol4RetSrvcCdKSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_SRVC_CD_KSET_IND_LEN = 1;
  /** serialize this Pol4RetSrvcCdKSetInd */
  protected void serializePol4RetSrvcCdKSetInd(char[] pol4RetSrvcCdKSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetSrvcCdKSetInd,
        0,
        getStringValue(),
        beginPol4RetSrvcCdKSetInd,
        POL_4_RET_SRVC_CD_KSET_IND_LEN);
    localPol4RetSrvcCdKSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetSrvcCdKSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4RetSrvcCdKSetInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetSrvcCdKSetInd() {
    return (substring(
        getStringValue(),
        beginPol4RetSrvcCdKSetInd,
        beginPol4RetSrvcCdKSetInd + POL_4_RET_SRVC_CD_KSET_IND_LEN));
  }

  int localPol4RetSrvcCdLSetIndCounter = -1;

  public boolean isPol4RetSrvcCdLSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetSrvcCdLSetIndCounter != sharedCounter;
    localPol4RetSrvcCdLSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_SRVC_CD_LSET_IND_LEN = 1;
  /** serialize this Pol4RetSrvcCdLSetInd */
  protected void serializePol4RetSrvcCdLSetInd(char[] pol4RetSrvcCdLSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetSrvcCdLSetInd,
        0,
        getStringValue(),
        beginPol4RetSrvcCdLSetInd,
        POL_4_RET_SRVC_CD_LSET_IND_LEN);
    localPol4RetSrvcCdLSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetSrvcCdLSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4RetSrvcCdLSetInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetSrvcCdLSetInd() {
    return (substring(
        getStringValue(),
        beginPol4RetSrvcCdLSetInd,
        beginPol4RetSrvcCdLSetInd + POL_4_RET_SRVC_CD_LSET_IND_LEN));
  }

  int localPol4RetSrvcCdMSetIndCounter = -1;

  public boolean isPol4RetSrvcCdMSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetSrvcCdMSetIndCounter != sharedCounter;
    localPol4RetSrvcCdMSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_SRVC_CD_MSET_IND_LEN = 1;
  /** serialize this Pol4RetSrvcCdMSetInd */
  protected void serializePol4RetSrvcCdMSetInd(char[] pol4RetSrvcCdMSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetSrvcCdMSetInd,
        0,
        getStringValue(),
        beginPol4RetSrvcCdMSetInd,
        POL_4_RET_SRVC_CD_MSET_IND_LEN);
    localPol4RetSrvcCdMSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetSrvcCdMSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4RetSrvcCdMSetInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetSrvcCdMSetInd() {
    return (substring(
        getStringValue(),
        beginPol4RetSrvcCdMSetInd,
        beginPol4RetSrvcCdMSetInd + POL_4_RET_SRVC_CD_MSET_IND_LEN));
  }

  int localPol4RetSrvcCdOSetIndCounter = -1;

  public boolean isPol4RetSrvcCdOSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetSrvcCdOSetIndCounter != sharedCounter;
    localPol4RetSrvcCdOSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_SRVC_CD_OSET_IND_LEN = 1;
  /** serialize this Pol4RetSrvcCdOSetInd */
  protected void serializePol4RetSrvcCdOSetInd(char[] pol4RetSrvcCdOSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetSrvcCdOSetInd,
        0,
        getStringValue(),
        beginPol4RetSrvcCdOSetInd,
        POL_4_RET_SRVC_CD_OSET_IND_LEN);
    localPol4RetSrvcCdOSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetSrvcCdOSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4RetSrvcCdOSetInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetSrvcCdOSetInd() {
    return (substring(
        getStringValue(),
        beginPol4RetSrvcCdOSetInd,
        beginPol4RetSrvcCdOSetInd + POL_4_RET_SRVC_CD_OSET_IND_LEN));
  }

  int localPol4RetSrvcCdQSetIndCounter = -1;

  public boolean isPol4RetSrvcCdQSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetSrvcCdQSetIndCounter != sharedCounter;
    localPol4RetSrvcCdQSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_SRVC_CD_QSET_IND_LEN = 1;
  /** serialize this Pol4RetSrvcCdQSetInd */
  protected void serializePol4RetSrvcCdQSetInd(char[] pol4RetSrvcCdQSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetSrvcCdQSetInd,
        0,
        getStringValue(),
        beginPol4RetSrvcCdQSetInd,
        POL_4_RET_SRVC_CD_QSET_IND_LEN);
    localPol4RetSrvcCdQSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetSrvcCdQSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4RetSrvcCdQSetInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetSrvcCdQSetInd() {
    return (substring(
        getStringValue(),
        beginPol4RetSrvcCdQSetInd,
        beginPol4RetSrvcCdQSetInd + POL_4_RET_SRVC_CD_QSET_IND_LEN));
  }

  int localPol4RetSrvcCdRSetIndCounter = -1;

  public boolean isPol4RetSrvcCdRSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetSrvcCdRSetIndCounter != sharedCounter;
    localPol4RetSrvcCdRSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_SRVC_CD_RSET_IND_LEN = 1;
  /** serialize this Pol4RetSrvcCdRSetInd */
  protected void serializePol4RetSrvcCdRSetInd(char[] pol4RetSrvcCdRSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetSrvcCdRSetInd,
        0,
        getStringValue(),
        beginPol4RetSrvcCdRSetInd,
        POL_4_RET_SRVC_CD_RSET_IND_LEN);
    localPol4RetSrvcCdRSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetSrvcCdRSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4RetSrvcCdRSetInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetSrvcCdRSetInd() {
    return (substring(
        getStringValue(),
        beginPol4RetSrvcCdRSetInd,
        beginPol4RetSrvcCdRSetInd + POL_4_RET_SRVC_CD_RSET_IND_LEN));
  }

  int localPol4RetSrvcCdSSetIndCounter = -1;

  public boolean isPol4RetSrvcCdSSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetSrvcCdSSetIndCounter != sharedCounter;
    localPol4RetSrvcCdSSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_SRVC_CD_SSET_IND_LEN = 1;
  /** serialize this Pol4RetSrvcCdSSetInd */
  protected void serializePol4RetSrvcCdSSetInd(char[] pol4RetSrvcCdSSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetSrvcCdSSetInd,
        0,
        getStringValue(),
        beginPol4RetSrvcCdSSetInd,
        POL_4_RET_SRVC_CD_SSET_IND_LEN);
    localPol4RetSrvcCdSSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetSrvcCdSSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4RetSrvcCdSSetInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetSrvcCdSSetInd() {
    return (substring(
        getStringValue(),
        beginPol4RetSrvcCdSSetInd,
        beginPol4RetSrvcCdSSetInd + POL_4_RET_SRVC_CD_SSET_IND_LEN));
  }

  int localPol4RetSrvcCdUSetIndCounter = -1;

  public boolean isPol4RetSrvcCdUSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetSrvcCdUSetIndCounter != sharedCounter;
    localPol4RetSrvcCdUSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_SRVC_CD_USET_IND_LEN = 1;
  /** serialize this Pol4RetSrvcCdUSetInd */
  protected void serializePol4RetSrvcCdUSetInd(char[] pol4RetSrvcCdUSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetSrvcCdUSetInd,
        0,
        getStringValue(),
        beginPol4RetSrvcCdUSetInd,
        POL_4_RET_SRVC_CD_USET_IND_LEN);
    localPol4RetSrvcCdUSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetSrvcCdUSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4RetSrvcCdUSetInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetSrvcCdUSetInd() {
    return (substring(
        getStringValue(),
        beginPol4RetSrvcCdUSetInd,
        beginPol4RetSrvcCdUSetInd + POL_4_RET_SRVC_CD_USET_IND_LEN));
  }

  int localPol4RetSrvcCdVSetIndCounter = -1;

  public boolean isPol4RetSrvcCdVSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetSrvcCdVSetIndCounter != sharedCounter;
    localPol4RetSrvcCdVSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_SRVC_CD_VSET_IND_LEN = 1;
  /** serialize this Pol4RetSrvcCdVSetInd */
  protected void serializePol4RetSrvcCdVSetInd(char[] pol4RetSrvcCdVSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetSrvcCdVSetInd,
        0,
        getStringValue(),
        beginPol4RetSrvcCdVSetInd,
        POL_4_RET_SRVC_CD_VSET_IND_LEN);
    localPol4RetSrvcCdVSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetSrvcCdVSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4RetSrvcCdVSetInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetSrvcCdVSetInd() {
    return (substring(
        getStringValue(),
        beginPol4RetSrvcCdVSetInd,
        beginPol4RetSrvcCdVSetInd + POL_4_RET_SRVC_CD_VSET_IND_LEN));
  }

  int localPol4RetSrvcCdWSetIndCounter = -1;

  public boolean isPol4RetSrvcCdWSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetSrvcCdWSetIndCounter != sharedCounter;
    localPol4RetSrvcCdWSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_SRVC_CD_WSET_IND_LEN = 1;
  /** serialize this Pol4RetSrvcCdWSetInd */
  protected void serializePol4RetSrvcCdWSetInd(char[] pol4RetSrvcCdWSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetSrvcCdWSetInd,
        0,
        getStringValue(),
        beginPol4RetSrvcCdWSetInd,
        POL_4_RET_SRVC_CD_WSET_IND_LEN);
    localPol4RetSrvcCdWSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetSrvcCdWSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4RetSrvcCdWSetInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetSrvcCdWSetInd() {
    return (substring(
        getStringValue(),
        beginPol4RetSrvcCdWSetInd,
        beginPol4RetSrvcCdWSetInd + POL_4_RET_SRVC_CD_WSET_IND_LEN));
  }

  int localPol4RetSrvcCdXSetIndCounter = -1;

  public boolean isPol4RetSrvcCdXSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetSrvcCdXSetIndCounter != sharedCounter;
    localPol4RetSrvcCdXSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_SRVC_CD_XSET_IND_LEN = 1;
  /** serialize this Pol4RetSrvcCdXSetInd */
  protected void serializePol4RetSrvcCdXSetInd(char[] pol4RetSrvcCdXSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetSrvcCdXSetInd,
        0,
        getStringValue(),
        beginPol4RetSrvcCdXSetInd,
        POL_4_RET_SRVC_CD_XSET_IND_LEN);
    localPol4RetSrvcCdXSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetSrvcCdXSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4RetSrvcCdXSetInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetSrvcCdXSetInd() {
    return (substring(
        getStringValue(),
        beginPol4RetSrvcCdXSetInd,
        beginPol4RetSrvcCdXSetInd + POL_4_RET_SRVC_CD_XSET_IND_LEN));
  }

  int localPol4RetSrvcCdYSetIndCounter = -1;

  public boolean isPol4RetSrvcCdYSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetSrvcCdYSetIndCounter != sharedCounter;
    localPol4RetSrvcCdYSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_SRVC_CD_YSET_IND_LEN = 1;
  /** serialize this Pol4RetSrvcCdYSetInd */
  protected void serializePol4RetSrvcCdYSetInd(char[] pol4RetSrvcCdYSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetSrvcCdYSetInd,
        0,
        getStringValue(),
        beginPol4RetSrvcCdYSetInd,
        POL_4_RET_SRVC_CD_YSET_IND_LEN);
    localPol4RetSrvcCdYSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetSrvcCdYSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4RetSrvcCdYSetInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetSrvcCdYSetInd() {
    return (substring(
        getStringValue(),
        beginPol4RetSrvcCdYSetInd,
        beginPol4RetSrvcCdYSetInd + POL_4_RET_SRVC_CD_YSET_IND_LEN));
  }

  int localPol4RetSrvcCdZSetIndCounter = -1;

  public boolean isPol4RetSrvcCdZSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetSrvcCdZSetIndCounter != sharedCounter;
    localPol4RetSrvcCdZSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_SRVC_CD_ZSET_IND_LEN = 1;
  /** serialize this Pol4RetSrvcCdZSetInd */
  protected void serializePol4RetSrvcCdZSetInd(char[] pol4RetSrvcCdZSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetSrvcCdZSetInd,
        0,
        getStringValue(),
        beginPol4RetSrvcCdZSetInd,
        POL_4_RET_SRVC_CD_ZSET_IND_LEN);
    localPol4RetSrvcCdZSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetSrvcCdZSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4RetSrvcCdZSetInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetSrvcCdZSetInd() {
    return (substring(
        getStringValue(),
        beginPol4RetSrvcCdZSetInd,
        beginPol4RetSrvcCdZSetInd + POL_4_RET_SRVC_CD_ZSET_IND_LEN));
  }

  int localPol4SviTblPriNbrCounter = -1;

  public boolean isPol4SviTblPriNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4SviTblPriNbrCounter != sharedCounter;
    localPol4SviTblPriNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_SVI_TBL_PRI_NBR_LEN = 6;
  /** serialize this Pol4SviTblPriNbr */
  protected void serializePol4SviTblPriNbr(char[] pol4SviTblPriNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4SviTblPriNbr, 0, getStringValue(), beginPol4SviTblPriNbr, POL_4_SVI_TBL_PRI_NBR_LEN);
    localPol4SviTblPriNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4SviTblPriNbrConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPol4SviTblPriNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol4SviTblPriNbr() {
    return (substring(
        getStringValue(),
        beginPol4SviTblPriNbr,
        beginPol4SviTblPriNbr + POL_4_SVI_TBL_PRI_NBR_LEN));
  }

  int localPol4Tier1CopayAmtCounter = -1;

  public boolean isPol4Tier1CopayAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4Tier1CopayAmtCounter != sharedCounter;
    localPol4Tier1CopayAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4Tier1CopayAmt
   *
   * @return pol4Tier1CopayAmt
   */
  public char[] getPol4Tier1CopayAmtString() {
    return getCharArray(beginPol4Tier1CopayAmt, POL_4_TIER_1_COPAY_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4Tier1CopayAmtIsNumeric() {
    return isNumeric(
        beginPol4Tier1CopayAmt,
        beginPol4Tier1CopayAmt + POL_4_TIER_1_COPAY_AMT_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_TIER_1_COPAY_AMT_LEN = 5;
  protected static final int POL_4_TIER_1_COPAY_AMT_SCALE = 2;

  protected BigDecimal checkPol4Tier1CopayAmtMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 5 /*precision*/);
  }

  /** serializePol4Tier1CopayAmt */
  protected void serializePol4Tier1CopayAmt(BigDecimal pol4Tier1CopayAmt) {
    putNumber(
        beginPol4Tier1CopayAmt,
        pol4Tier1CopayAmt,
        POL_4_TIER_1_COPAY_AMT_LEN,
        POL_4_TIER_1_COPAY_AMT_SCALE,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4Tier1CopayAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  /** serializePol4Tier1CopayAmt */
  protected BigDecimal serializePol4Tier1CopayAmt(char[] value) throws CFException {
    if (value.length < 5) value = pad(5, value, ' ', RIGHT_PAD);
    replaceValue(padNumber(5, value, true /*isSigned?*/), beginPol4Tier1CopayAmt, 5);
    localPol4Tier1CopayAmtCounter = shareString.getSerializedField().getModifiedCounter();
    try {
      return convertString2Decimal(
          value,
          POL_4_TIER_1_COPAY_AMT_LEN,
          POL_4_TIER_1_COPAY_AMT_SCALE,
          true /*isSigned?*/,
          true /*signTrailing?*/,
          false /*storeSignSeparate?*/);
    } catch (Exception ex) {
      throw getSoc7ABend("pol4Tier1CopayAmt", beginPol4Tier1CopayAmt, POL_4_TIER_1_COPAY_AMT_LEN);
    }
  }
  /**
   * refreshPol4Tier1CopayAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshPol4Tier1CopayAmt() throws CFException {
    try {
      return (getDecimalNumber(
          beginPol4Tier1CopayAmt,
          POL_4_TIER_1_COPAY_AMT_LEN,
          POL_4_TIER_1_COPAY_AMT_SCALE,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("pol4Tier1CopayAmt", beginPol4Tier1CopayAmt, POL_4_TIER_1_COPAY_AMT_LEN);
    }
  }

  int localPol4Tier1FamNewCoinsAmtCounter = -1;

  public boolean isPol4Tier1FamNewCoinsAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4Tier1FamNewCoinsAmtCounter != sharedCounter;
    localPol4Tier1FamNewCoinsAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4Tier1FamNewCoinsAmt
   *
   * @return pol4Tier1FamNewCoinsAmt
   */
  public char[] getPol4Tier1FamNewCoinsAmtString() {
    return getCharArray(beginPol4Tier1FamNewCoinsAmt, POL_4_TIER_1_FAM_NEW_COINS_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4Tier1FamNewCoinsAmtIsNumeric() {
    return isNumeric(
        beginPol4Tier1FamNewCoinsAmt,
        beginPol4Tier1FamNewCoinsAmt + POL_4_TIER_1_FAM_NEW_COINS_AMT_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_TIER_1_FAM_NEW_COINS_AMT_LEN = 6;
  /** serializePol4Tier1FamNewCoinsAmt */
  protected void serializePol4Tier1FamNewCoinsAmt(int pol4Tier1FamNewCoinsAmt) {
    putNumber(
        beginPol4Tier1FamNewCoinsAmt,
        pol4Tier1FamNewCoinsAmt,
        POL_4_TIER_1_FAM_NEW_COINS_AMT_LEN,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4Tier1FamNewCoinsAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol4Tier1FamNewCoinsAmt */
  protected int serializePol4Tier1FamNewCoinsAmt(char[] value) {
    int pol4Tier1FamNewCoinsAmt;
    if (value.length > 0 && value.length != 6) value = new String(value).trim().toCharArray();
    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
    else if (value.length > 6) value = substring(value, 0, 6);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol4Tier1FamNewCoinsAmt =
        (int)
            convertString2Number(
                value, true /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(6, value, true /*isSigned?*/), beginPol4Tier1FamNewCoinsAmt, 6);
    localPol4Tier1FamNewCoinsAmtCounter = shareString.getSerializedField().getModifiedCounter();
    return pol4Tier1FamNewCoinsAmt;
  }

  protected int checkPol4Tier1FamNewCoinsAmtMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1M /*limit*/, true /*isSigned*/);
  }
  /**
   * refreshPol4Tier1FamNewCoinsAmt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol4Tier1FamNewCoinsAmt() throws CFException {
    try {
      return (getIntNumber(
          beginPol4Tier1FamNewCoinsAmt,
          POL_4_TIER_1_FAM_NEW_COINS_AMT_LEN,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol4Tier1FamNewCoinsAmt",
          beginPol4Tier1FamNewCoinsAmt,
          POL_4_TIER_1_FAM_NEW_COINS_AMT_LEN);
    }
  }

  int localPol4Tier1NewCoinsAmtCounter = -1;

  public boolean isPol4Tier1NewCoinsAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4Tier1NewCoinsAmtCounter != sharedCounter;
    localPol4Tier1NewCoinsAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4Tier1NewCoinsAmt
   *
   * @return pol4Tier1NewCoinsAmt
   */
  public char[] getPol4Tier1NewCoinsAmtString() {
    return getCharArray(beginPol4Tier1NewCoinsAmt, POL_4_TIER_1_NEW_COINS_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4Tier1NewCoinsAmtIsNumeric() {
    return isNumeric(
        beginPol4Tier1NewCoinsAmt,
        beginPol4Tier1NewCoinsAmt + POL_4_TIER_1_NEW_COINS_AMT_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_TIER_1_NEW_COINS_AMT_LEN = 6;
  /** serializePol4Tier1NewCoinsAmt */
  protected void serializePol4Tier1NewCoinsAmt(int pol4Tier1NewCoinsAmt) {
    putNumber(
        beginPol4Tier1NewCoinsAmt,
        pol4Tier1NewCoinsAmt,
        POL_4_TIER_1_NEW_COINS_AMT_LEN,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4Tier1NewCoinsAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol4Tier1NewCoinsAmt */
  protected int serializePol4Tier1NewCoinsAmt(char[] value) {
    int pol4Tier1NewCoinsAmt;
    if (value.length > 0 && value.length != 6) value = new String(value).trim().toCharArray();
    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
    else if (value.length > 6) value = substring(value, 0, 6);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol4Tier1NewCoinsAmt =
        (int)
            convertString2Number(
                value, true /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(6, value, true /*isSigned?*/), beginPol4Tier1NewCoinsAmt, 6);
    localPol4Tier1NewCoinsAmtCounter = shareString.getSerializedField().getModifiedCounter();
    return pol4Tier1NewCoinsAmt;
  }

  protected int checkPol4Tier1NewCoinsAmtMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1M /*limit*/, true /*isSigned*/);
  }
  /**
   * refreshPol4Tier1NewCoinsAmt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol4Tier1NewCoinsAmt() throws CFException {
    try {
      return (getIntNumber(
          beginPol4Tier1NewCoinsAmt,
          POL_4_TIER_1_NEW_COINS_AMT_LEN,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol4Tier1NewCoinsAmt", beginPol4Tier1NewCoinsAmt, POL_4_TIER_1_NEW_COINS_AMT_LEN);
    }
  }

  int localPol4Tier1UrgntCareAmtCounter = -1;

  public boolean isPol4Tier1UrgntCareAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4Tier1UrgntCareAmtCounter != sharedCounter;
    localPol4Tier1UrgntCareAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4Tier1UrgntCareAmt
   *
   * @return pol4Tier1UrgntCareAmt
   */
  public char[] getPol4Tier1UrgntCareAmtString() {
    return getCharArray(beginPol4Tier1UrgntCareAmt, POL_4_TIER_1_URGNT_CARE_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4Tier1UrgntCareAmtIsNumeric() {
    return isNumeric(
        beginPol4Tier1UrgntCareAmt,
        beginPol4Tier1UrgntCareAmt + POL_4_TIER_1_URGNT_CARE_AMT_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_TIER_1_URGNT_CARE_AMT_LEN = 5;
  protected static final int POL_4_TIER_1_URGNT_CARE_AMT_SCALE = 2;

  protected BigDecimal checkPol4Tier1UrgntCareAmtMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 5 /*precision*/);
  }

  /** serializePol4Tier1UrgntCareAmt */
  protected void serializePol4Tier1UrgntCareAmt(BigDecimal pol4Tier1UrgntCareAmt) {
    putNumber(
        beginPol4Tier1UrgntCareAmt,
        pol4Tier1UrgntCareAmt,
        POL_4_TIER_1_URGNT_CARE_AMT_LEN,
        POL_4_TIER_1_URGNT_CARE_AMT_SCALE,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4Tier1UrgntCareAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  /** serializePol4Tier1UrgntCareAmt */
  protected BigDecimal serializePol4Tier1UrgntCareAmt(char[] value) throws CFException {
    if (value.length < 5) value = pad(5, value, ' ', RIGHT_PAD);
    replaceValue(padNumber(5, value, true /*isSigned?*/), beginPol4Tier1UrgntCareAmt, 5);
    localPol4Tier1UrgntCareAmtCounter = shareString.getSerializedField().getModifiedCounter();
    try {
      return convertString2Decimal(
          value,
          POL_4_TIER_1_URGNT_CARE_AMT_LEN,
          POL_4_TIER_1_URGNT_CARE_AMT_SCALE,
          true /*isSigned?*/,
          true /*signTrailing?*/,
          false /*storeSignSeparate?*/);
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol4Tier1UrgntCareAmt", beginPol4Tier1UrgntCareAmt, POL_4_TIER_1_URGNT_CARE_AMT_LEN);
    }
  }
  /**
   * refreshPol4Tier1UrgntCareAmt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public BigDecimal refreshPol4Tier1UrgntCareAmt() throws CFException {
    try {
      return (getDecimalNumber(
          beginPol4Tier1UrgntCareAmt,
          POL_4_TIER_1_URGNT_CARE_AMT_LEN,
          POL_4_TIER_1_URGNT_CARE_AMT_SCALE,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol4Tier1UrgntCareAmt", beginPol4Tier1UrgntCareAmt, POL_4_TIER_1_URGNT_CARE_AMT_LEN);
    }
  }

  int localPol4UrgntCareAmtCounter = -1;

  public boolean isPol4UrgntCareAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4UrgntCareAmtCounter != sharedCounter;
    localPol4UrgntCareAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4UrgntCareAmt
   *
   * @return pol4UrgntCareAmt
   */
  public char[] getPol4UrgntCareAmtString() {
    return getCharArray(beginPol4UrgntCareAmt, POL_4_URGNT_CARE_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4UrgntCareAmtIsNumeric() {
    return isNumeric(
        beginPol4UrgntCareAmt,
        beginPol4UrgntCareAmt + POL_4_URGNT_CARE_AMT_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_URGNT_CARE_AMT_LEN = 5;
  protected static final int POL_4_URGNT_CARE_AMT_SCALE = 2;

  protected BigDecimal checkPol4UrgntCareAmtMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 5 /*precision*/);
  }

  /** serializePol4UrgntCareAmt */
  protected void serializePol4UrgntCareAmt(BigDecimal pol4UrgntCareAmt) {
    putNumber(
        beginPol4UrgntCareAmt,
        pol4UrgntCareAmt,
        POL_4_URGNT_CARE_AMT_LEN,
        POL_4_URGNT_CARE_AMT_SCALE,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4UrgntCareAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  /** serializePol4UrgntCareAmt */
  protected BigDecimal serializePol4UrgntCareAmt(char[] value) throws CFException {
    if (value.length < 5) value = pad(5, value, ' ', RIGHT_PAD);
    replaceValue(padNumber(5, value, true /*isSigned?*/), beginPol4UrgntCareAmt, 5);
    localPol4UrgntCareAmtCounter = shareString.getSerializedField().getModifiedCounter();
    try {
      return convertString2Decimal(
          value,
          POL_4_URGNT_CARE_AMT_LEN,
          POL_4_URGNT_CARE_AMT_SCALE,
          true /*isSigned?*/,
          true /*signTrailing?*/,
          false /*storeSignSeparate?*/);
    } catch (Exception ex) {
      throw getSoc7ABend("pol4UrgntCareAmt", beginPol4UrgntCareAmt, POL_4_URGNT_CARE_AMT_LEN);
    }
  }
  /**
   * refreshPol4UrgntCareAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshPol4UrgntCareAmt() throws CFException {
    try {
      return (getDecimalNumber(
          beginPol4UrgntCareAmt,
          POL_4_URGNT_CARE_AMT_LEN,
          POL_4_URGNT_CARE_AMT_SCALE,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("pol4UrgntCareAmt", beginPol4UrgntCareAmt, POL_4_URGNT_CARE_AMT_LEN);
    }
  }

  int localPol4XtraTerrStMandIndCounter = -1;

  public boolean isPol4XtraTerrStMandIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4XtraTerrStMandIndCounter != sharedCounter;
    localPol4XtraTerrStMandIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_XTRA_TERR_ST_MAND_IND_LEN = 1;
  /** serialize this Pol4XtraTerrStMandInd */
  protected void serializePol4XtraTerrStMandInd(char[] pol4XtraTerrStMandInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4XtraTerrStMandInd,
        0,
        getStringValue(),
        beginPol4XtraTerrStMandInd,
        POL_4_XTRA_TERR_ST_MAND_IND_LEN);
    localPol4XtraTerrStMandIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4XtraTerrStMandIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4XtraTerrStMandInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4XtraTerrStMandInd() {
    return (substring(
        getStringValue(),
        beginPol4XtraTerrStMandInd,
        beginPol4XtraTerrStMandInd + POL_4_XTRA_TERR_ST_MAND_IND_LEN));
  }

  int localPol4TierLabelIndCounter = -1;

  public boolean isPol4TierLabelIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4TierLabelIndCounter != sharedCounter;
    localPol4TierLabelIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_TIER_LABEL_IND_LEN = 1;
  /** serialize this Pol4TierLabelInd */
  protected void serializePol4TierLabelInd(char[] pol4TierLabelInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4TierLabelInd, 0, getStringValue(), beginPol4TierLabelInd, POL_4_TIER_LABEL_IND_LEN);
    localPol4TierLabelIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4TierLabelIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4TierLabelInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol4TierLabelInd() {
    return (substring(
        getStringValue(), beginPol4TierLabelInd, beginPol4TierLabelInd + POL_4_TIER_LABEL_IND_LEN));
  }

  int localPol4DedSpecialProcessCdCounter = -1;

  public boolean isPol4DedSpecialProcessCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4DedSpecialProcessCdCounter != sharedCounter;
    localPol4DedSpecialProcessCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_DED_SPECIAL_PROCESS_CD_LEN = 1;
  /** serialize this Pol4DedSpecialProcessCd */
  protected void serializePol4DedSpecialProcessCd(char[] pol4DedSpecialProcessCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4DedSpecialProcessCd,
        0,
        getStringValue(),
        beginPol4DedSpecialProcessCd,
        POL_4_DED_SPECIAL_PROCESS_CD_LEN);
    localPol4DedSpecialProcessCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4DedSpecialProcessCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4DedSpecialProcessCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4DedSpecialProcessCd() {
    return (substring(
        getStringValue(),
        beginPol4DedSpecialProcessCd,
        beginPol4DedSpecialProcessCd + POL_4_DED_SPECIAL_PROCESS_CD_LEN));
  }

  int localPol4OopInNtwkEePls1AmtCounter = -1;

  public boolean isPol4OopInNtwkEePls1AmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4OopInNtwkEePls1AmtCounter != sharedCounter;
    localPol4OopInNtwkEePls1AmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4OopInNtwkEePls1Amt
   *
   * @return pol4OopInNtwkEePls1Amt
   */
  public char[] getPol4OopInNtwkEePls1AmtString() {
    return getCharArray(beginPol4OopInNtwkEePls1Amt, POL_4_OOP_IN_NTWK_EE_PLS_1_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4OopInNtwkEePls1AmtIsNumeric() {
    return isNumeric(
        beginPol4OopInNtwkEePls1Amt,
        beginPol4OopInNtwkEePls1Amt + POL_4_OOP_IN_NTWK_EE_PLS_1_AMT_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_OOP_IN_NTWK_EE_PLS_1_AMT_LEN = 5;
  /** serializePol4OopInNtwkEePls1Amt */
  protected void serializePol4OopInNtwkEePls1Amt(int pol4OopInNtwkEePls1Amt) {
    putNumber(
        beginPol4OopInNtwkEePls1Amt,
        pol4OopInNtwkEePls1Amt,
        POL_4_OOP_IN_NTWK_EE_PLS_1_AMT_LEN,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4OopInNtwkEePls1AmtCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol4OopInNtwkEePls1Amt */
  protected int serializePol4OopInNtwkEePls1Amt(char[] value) {
    int pol4OopInNtwkEePls1Amt;
    if (value.length > 0 && value.length != 5) value = new String(value).trim().toCharArray();
    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
    else if (value.length > 5) value = substring(value, 0, 5);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol4OopInNtwkEePls1Amt =
        (int)
            convertString2Number(
                value, true /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(5, value, true /*isSigned?*/), beginPol4OopInNtwkEePls1Amt, 5);
    localPol4OopInNtwkEePls1AmtCounter = shareString.getSerializedField().getModifiedCounter();
    return pol4OopInNtwkEePls1Amt;
  }

  protected int checkPol4OopInNtwkEePls1AmtMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_100K /*limit*/, true /*isSigned*/);
  }
  /**
   * refreshPol4OopInNtwkEePls1Amt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol4OopInNtwkEePls1Amt() throws CFException {
    try {
      return (getIntNumber(
          beginPol4OopInNtwkEePls1Amt,
          POL_4_OOP_IN_NTWK_EE_PLS_1_AMT_LEN,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol4OopInNtwkEePls1Amt",
          beginPol4OopInNtwkEePls1Amt,
          POL_4_OOP_IN_NTWK_EE_PLS_1_AMT_LEN);
    }
  }

  int localPol4OopInNtwkEeSpoAmtCounter = -1;

  public boolean isPol4OopInNtwkEeSpoAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4OopInNtwkEeSpoAmtCounter != sharedCounter;
    localPol4OopInNtwkEeSpoAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4OopInNtwkEeSpoAmt
   *
   * @return pol4OopInNtwkEeSpoAmt
   */
  public char[] getPol4OopInNtwkEeSpoAmtString() {
    return getCharArray(beginPol4OopInNtwkEeSpoAmt, POL_4_OOP_IN_NTWK_EE_SPO_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4OopInNtwkEeSpoAmtIsNumeric() {
    return isNumeric(
        beginPol4OopInNtwkEeSpoAmt,
        beginPol4OopInNtwkEeSpoAmt + POL_4_OOP_IN_NTWK_EE_SPO_AMT_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_OOP_IN_NTWK_EE_SPO_AMT_LEN = 5;
  /** serializePol4OopInNtwkEeSpoAmt */
  protected void serializePol4OopInNtwkEeSpoAmt(int pol4OopInNtwkEeSpoAmt) {
    putNumber(
        beginPol4OopInNtwkEeSpoAmt,
        pol4OopInNtwkEeSpoAmt,
        POL_4_OOP_IN_NTWK_EE_SPO_AMT_LEN,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4OopInNtwkEeSpoAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol4OopInNtwkEeSpoAmt */
  protected int serializePol4OopInNtwkEeSpoAmt(char[] value) {
    int pol4OopInNtwkEeSpoAmt;
    if (value.length > 0 && value.length != 5) value = new String(value).trim().toCharArray();
    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
    else if (value.length > 5) value = substring(value, 0, 5);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol4OopInNtwkEeSpoAmt =
        (int)
            convertString2Number(
                value, true /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(5, value, true /*isSigned?*/), beginPol4OopInNtwkEeSpoAmt, 5);
    localPol4OopInNtwkEeSpoAmtCounter = shareString.getSerializedField().getModifiedCounter();
    return pol4OopInNtwkEeSpoAmt;
  }

  protected int checkPol4OopInNtwkEeSpoAmtMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_100K /*limit*/, true /*isSigned*/);
  }
  /**
   * refreshPol4OopInNtwkEeSpoAmt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol4OopInNtwkEeSpoAmt() throws CFException {
    try {
      return (getIntNumber(
          beginPol4OopInNtwkEeSpoAmt,
          POL_4_OOP_IN_NTWK_EE_SPO_AMT_LEN,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol4OopInNtwkEeSpoAmt", beginPol4OopInNtwkEeSpoAmt, POL_4_OOP_IN_NTWK_EE_SPO_AMT_LEN);
    }
  }

  int localPol4OopInNtwkEeChrgAmtCounter = -1;

  public boolean isPol4OopInNtwkEeChrgAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4OopInNtwkEeChrgAmtCounter != sharedCounter;
    localPol4OopInNtwkEeChrgAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4OopInNtwkEeChrgAmt
   *
   * @return pol4OopInNtwkEeChrgAmt
   */
  public char[] getPol4OopInNtwkEeChrgAmtString() {
    return getCharArray(beginPol4OopInNtwkEeChrgAmt, POL_4_OOP_IN_NTWK_EE_CHRG_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4OopInNtwkEeChrgAmtIsNumeric() {
    return isNumeric(
        beginPol4OopInNtwkEeChrgAmt,
        beginPol4OopInNtwkEeChrgAmt + POL_4_OOP_IN_NTWK_EE_CHRG_AMT_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_OOP_IN_NTWK_EE_CHRG_AMT_LEN = 5;
  /** serializePol4OopInNtwkEeChrgAmt */
  protected void serializePol4OopInNtwkEeChrgAmt(int pol4OopInNtwkEeChrgAmt) {
    putNumber(
        beginPol4OopInNtwkEeChrgAmt,
        pol4OopInNtwkEeChrgAmt,
        POL_4_OOP_IN_NTWK_EE_CHRG_AMT_LEN,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4OopInNtwkEeChrgAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol4OopInNtwkEeChrgAmt */
  protected int serializePol4OopInNtwkEeChrgAmt(char[] value) {
    int pol4OopInNtwkEeChrgAmt;
    if (value.length > 0 && value.length != 5) value = new String(value).trim().toCharArray();
    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
    else if (value.length > 5) value = substring(value, 0, 5);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol4OopInNtwkEeChrgAmt =
        (int)
            convertString2Number(
                value, true /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(5, value, true /*isSigned?*/), beginPol4OopInNtwkEeChrgAmt, 5);
    localPol4OopInNtwkEeChrgAmtCounter = shareString.getSerializedField().getModifiedCounter();
    return pol4OopInNtwkEeChrgAmt;
  }

  protected int checkPol4OopInNtwkEeChrgAmtMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_100K /*limit*/, true /*isSigned*/);
  }
  /**
   * refreshPol4OopInNtwkEeChrgAmt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol4OopInNtwkEeChrgAmt() throws CFException {
    try {
      return (getIntNumber(
          beginPol4OopInNtwkEeChrgAmt,
          POL_4_OOP_IN_NTWK_EE_CHRG_AMT_LEN,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol4OopInNtwkEeChrgAmt", beginPol4OopInNtwkEeChrgAmt, POL_4_OOP_IN_NTWK_EE_CHRG_AMT_LEN);
    }
  }

  int localPol4OopCombEePls1AmtCounter = -1;

  public boolean isPol4OopCombEePls1AmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4OopCombEePls1AmtCounter != sharedCounter;
    localPol4OopCombEePls1AmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4OopCombEePls1Amt
   *
   * @return pol4OopCombEePls1Amt
   */
  public char[] getPol4OopCombEePls1AmtString() {
    return getCharArray(beginPol4OopCombEePls1Amt, POL_4_OOP_COMB_EE_PLS_1_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4OopCombEePls1AmtIsNumeric() {
    return isNumeric(
        beginPol4OopCombEePls1Amt,
        beginPol4OopCombEePls1Amt + POL_4_OOP_COMB_EE_PLS_1_AMT_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_OOP_COMB_EE_PLS_1_AMT_LEN = 5;
  /** serializePol4OopCombEePls1Amt */
  protected void serializePol4OopCombEePls1Amt(int pol4OopCombEePls1Amt) {
    putNumber(
        beginPol4OopCombEePls1Amt,
        pol4OopCombEePls1Amt,
        POL_4_OOP_COMB_EE_PLS_1_AMT_LEN,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4OopCombEePls1AmtCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol4OopCombEePls1Amt */
  protected int serializePol4OopCombEePls1Amt(char[] value) {
    int pol4OopCombEePls1Amt;
    if (value.length > 0 && value.length != 5) value = new String(value).trim().toCharArray();
    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
    else if (value.length > 5) value = substring(value, 0, 5);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol4OopCombEePls1Amt =
        (int)
            convertString2Number(
                value, true /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(5, value, true /*isSigned?*/), beginPol4OopCombEePls1Amt, 5);
    localPol4OopCombEePls1AmtCounter = shareString.getSerializedField().getModifiedCounter();
    return pol4OopCombEePls1Amt;
  }

  protected int checkPol4OopCombEePls1AmtMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_100K /*limit*/, true /*isSigned*/);
  }
  /**
   * refreshPol4OopCombEePls1Amt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol4OopCombEePls1Amt() throws CFException {
    try {
      return (getIntNumber(
          beginPol4OopCombEePls1Amt,
          POL_4_OOP_COMB_EE_PLS_1_AMT_LEN,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol4OopCombEePls1Amt", beginPol4OopCombEePls1Amt, POL_4_OOP_COMB_EE_PLS_1_AMT_LEN);
    }
  }

  int localPol4OopCombEeSpoAmtCounter = -1;

  public boolean isPol4OopCombEeSpoAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4OopCombEeSpoAmtCounter != sharedCounter;
    localPol4OopCombEeSpoAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4OopCombEeSpoAmt
   *
   * @return pol4OopCombEeSpoAmt
   */
  public char[] getPol4OopCombEeSpoAmtString() {
    return getCharArray(beginPol4OopCombEeSpoAmt, POL_4_OOP_COMB_EE_SPO_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4OopCombEeSpoAmtIsNumeric() {
    return isNumeric(
        beginPol4OopCombEeSpoAmt,
        beginPol4OopCombEeSpoAmt + POL_4_OOP_COMB_EE_SPO_AMT_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_OOP_COMB_EE_SPO_AMT_LEN = 5;
  /** serializePol4OopCombEeSpoAmt */
  protected void serializePol4OopCombEeSpoAmt(int pol4OopCombEeSpoAmt) {
    putNumber(
        beginPol4OopCombEeSpoAmt,
        pol4OopCombEeSpoAmt,
        POL_4_OOP_COMB_EE_SPO_AMT_LEN,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4OopCombEeSpoAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol4OopCombEeSpoAmt */
  protected int serializePol4OopCombEeSpoAmt(char[] value) {
    int pol4OopCombEeSpoAmt;
    if (value.length > 0 && value.length != 5) value = new String(value).trim().toCharArray();
    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
    else if (value.length > 5) value = substring(value, 0, 5);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol4OopCombEeSpoAmt =
        (int)
            convertString2Number(
                value, true /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(5, value, true /*isSigned?*/), beginPol4OopCombEeSpoAmt, 5);
    localPol4OopCombEeSpoAmtCounter = shareString.getSerializedField().getModifiedCounter();
    return pol4OopCombEeSpoAmt;
  }

  protected int checkPol4OopCombEeSpoAmtMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_100K /*limit*/, true /*isSigned*/);
  }
  /**
   * refreshPol4OopCombEeSpoAmt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol4OopCombEeSpoAmt() throws CFException {
    try {
      return (getIntNumber(
          beginPol4OopCombEeSpoAmt,
          POL_4_OOP_COMB_EE_SPO_AMT_LEN,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol4OopCombEeSpoAmt", beginPol4OopCombEeSpoAmt, POL_4_OOP_COMB_EE_SPO_AMT_LEN);
    }
  }

  int localPol4OopCombEeChrgAmtCounter = -1;

  public boolean isPol4OopCombEeChrgAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4OopCombEeChrgAmtCounter != sharedCounter;
    localPol4OopCombEeChrgAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4OopCombEeChrgAmt
   *
   * @return pol4OopCombEeChrgAmt
   */
  public char[] getPol4OopCombEeChrgAmtString() {
    return getCharArray(beginPol4OopCombEeChrgAmt, POL_4_OOP_COMB_EE_CHRG_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4OopCombEeChrgAmtIsNumeric() {
    return isNumeric(
        beginPol4OopCombEeChrgAmt,
        beginPol4OopCombEeChrgAmt + POL_4_OOP_COMB_EE_CHRG_AMT_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_OOP_COMB_EE_CHRG_AMT_LEN = 5;
  /** serializePol4OopCombEeChrgAmt */
  protected void serializePol4OopCombEeChrgAmt(int pol4OopCombEeChrgAmt) {
    putNumber(
        beginPol4OopCombEeChrgAmt,
        pol4OopCombEeChrgAmt,
        POL_4_OOP_COMB_EE_CHRG_AMT_LEN,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4OopCombEeChrgAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol4OopCombEeChrgAmt */
  protected int serializePol4OopCombEeChrgAmt(char[] value) {
    int pol4OopCombEeChrgAmt;
    if (value.length > 0 && value.length != 5) value = new String(value).trim().toCharArray();
    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
    else if (value.length > 5) value = substring(value, 0, 5);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol4OopCombEeChrgAmt =
        (int)
            convertString2Number(
                value, true /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(5, value, true /*isSigned?*/), beginPol4OopCombEeChrgAmt, 5);
    localPol4OopCombEeChrgAmtCounter = shareString.getSerializedField().getModifiedCounter();
    return pol4OopCombEeChrgAmt;
  }

  protected int checkPol4OopCombEeChrgAmtMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_100K /*limit*/, true /*isSigned*/);
  }
  /**
   * refreshPol4OopCombEeChrgAmt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol4OopCombEeChrgAmt() throws CFException {
    try {
      return (getIntNumber(
          beginPol4OopCombEeChrgAmt,
          POL_4_OOP_COMB_EE_CHRG_AMT_LEN,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol4OopCombEeChrgAmt", beginPol4OopCombEeChrgAmt, POL_4_OOP_COMB_EE_CHRG_AMT_LEN);
    }
  }

  int localPol4IplnTypCdCounter = -1;

  public boolean isPol4IplnTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4IplnTypCdCounter != sharedCounter;
    localPol4IplnTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_IPLN_TYP_CD_LEN = 1;
  /** serialize this Pol4IplnTypCd */
  protected void serializePol4IplnTypCd(char[] pol4IplnTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol4IplnTypCd, 0, getStringValue(), beginPol4IplnTypCd, POL_4_IPLN_TYP_CD_LEN);
    localPol4IplnTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4IplnTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4IplnTypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol4IplnTypCd() {
    return (substring(
        getStringValue(), beginPol4IplnTypCd, beginPol4IplnTypCd + POL_4_IPLN_TYP_CD_LEN));
  }

  int localPol4IndNewCoinsMaxIndCounter = -1;

  public boolean isPol4IndNewCoinsMaxIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4IndNewCoinsMaxIndCounter != sharedCounter;
    localPol4IndNewCoinsMaxIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_IND_NEW_COINS_MAX_IND_LEN = 1;
  /** serialize this Pol4IndNewCoinsMaxInd */
  protected void serializePol4IndNewCoinsMaxInd(char[] pol4IndNewCoinsMaxInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4IndNewCoinsMaxInd,
        0,
        getStringValue(),
        beginPol4IndNewCoinsMaxInd,
        POL_4_IND_NEW_COINS_MAX_IND_LEN);
    localPol4IndNewCoinsMaxIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4IndNewCoinsMaxIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4IndNewCoinsMaxInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4IndNewCoinsMaxInd() {
    return (substring(
        getStringValue(),
        beginPol4IndNewCoinsMaxInd,
        beginPol4IndNewCoinsMaxInd + POL_4_IND_NEW_COINS_MAX_IND_LEN));
  }

  int localPol4IndNewCoinsMaxPdCounter = -1;

  public boolean isPol4IndNewCoinsMaxPdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4IndNewCoinsMaxPdCounter != sharedCounter;
    localPol4IndNewCoinsMaxPdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_IND_NEW_COINS_MAX_PD_LEN = 1;
  /** serialize this Pol4IndNewCoinsMaxPd */
  protected void serializePol4IndNewCoinsMaxPd(char[] pol4IndNewCoinsMaxPd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4IndNewCoinsMaxPd,
        0,
        getStringValue(),
        beginPol4IndNewCoinsMaxPd,
        POL_4_IND_NEW_COINS_MAX_PD_LEN);
    localPol4IndNewCoinsMaxPdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4IndNewCoinsMaxPdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4IndNewCoinsMaxPd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4IndNewCoinsMaxPd() {
    return (substring(
        getStringValue(),
        beginPol4IndNewCoinsMaxPd,
        beginPol4IndNewCoinsMaxPd + POL_4_IND_NEW_COINS_MAX_PD_LEN));
  }

  int localPol4CoinsCopayApplyIndCounter = -1;

  public boolean isPol4CoinsCopayApplyIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4CoinsCopayApplyIndCounter != sharedCounter;
    localPol4CoinsCopayApplyIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_COINS_COPAY_APPLY_IND_LEN = 2;
  /** serialize this Pol4CoinsCopayApplyInd */
  protected void serializePol4CoinsCopayApplyInd(char[] pol4CoinsCopayApplyInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4CoinsCopayApplyInd,
        0,
        getStringValue(),
        beginPol4CoinsCopayApplyInd,
        POL_4_COINS_COPAY_APPLY_IND_LEN);
    localPol4CoinsCopayApplyIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4CoinsCopayApplyIndConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol4CoinsCopayApplyInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4CoinsCopayApplyInd() {
    return (substring(
        getStringValue(),
        beginPol4CoinsCopayApplyInd,
        beginPol4CoinsCopayApplyInd + POL_4_COINS_COPAY_APPLY_IND_LEN));
  }

  int localPol4CopayMaxAmtCounter = -1;

  public boolean isPol4CopayMaxAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4CopayMaxAmtCounter != sharedCounter;
    localPol4CopayMaxAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4CopayMaxAmt
   *
   * @return pol4CopayMaxAmt
   */
  public char[] getPol4CopayMaxAmtString() {
    return getCharArray(beginPol4CopayMaxAmt, POL_4_COPAY_MAX_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4CopayMaxAmtIsNumeric() {
    return isNumeric(
        beginPol4CopayMaxAmt,
        beginPol4CopayMaxAmt + POL_4_COPAY_MAX_AMT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_COPAY_MAX_AMT_LEN = 9;
  protected static final int POL_4_COPAY_MAX_AMT_SCALE = 2;

  protected BigDecimal checkPol4CopayMaxAmtMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 9 /*precision*/);
  }

  /** serializePol4CopayMaxAmt */
  protected void serializePol4CopayMaxAmt(BigDecimal pol4CopayMaxAmt) {
    putNumber(
        beginPol4CopayMaxAmt,
        pol4CopayMaxAmt,
        POL_4_COPAY_MAX_AMT_LEN,
        POL_4_COPAY_MAX_AMT_SCALE,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4CopayMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  /** serializePol4CopayMaxAmt */
  protected BigDecimal serializePol4CopayMaxAmt(char[] value) throws CFException {
    if (value.length < 9) value = pad(9, value, ' ', RIGHT_PAD);
    replaceValue(padNumber(9, value, false /*isSigned?*/), beginPol4CopayMaxAmt, 9);
    localPol4CopayMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
    try {
      return convertString2Decimal(
          value,
          POL_4_COPAY_MAX_AMT_LEN,
          POL_4_COPAY_MAX_AMT_SCALE,
          false /*isSigned?*/,
          true /*signTrailing?*/,
          false /*storeSignSeparate?*/);
    } catch (Exception ex) {
      throw getSoc7ABend("pol4CopayMaxAmt", beginPol4CopayMaxAmt, POL_4_COPAY_MAX_AMT_LEN);
    }
  }
  /**
   * refreshPol4CopayMaxAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshPol4CopayMaxAmt() throws CFException {
    try {
      return (getDecimalNumber(
          beginPol4CopayMaxAmt,
          POL_4_COPAY_MAX_AMT_LEN,
          POL_4_COPAY_MAX_AMT_SCALE,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("pol4CopayMaxAmt", beginPol4CopayMaxAmt, POL_4_COPAY_MAX_AMT_LEN);
    }
  }

  int localPol4FamDedMaxIndCounter = -1;

  public boolean isPol4FamDedMaxIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4FamDedMaxIndCounter != sharedCounter;
    localPol4FamDedMaxIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_FAM_DED_MAX_IND_LEN = 1;
  /** serialize this Pol4FamDedMaxInd */
  protected void serializePol4FamDedMaxInd(char[] pol4FamDedMaxInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4FamDedMaxInd, 0, getStringValue(), beginPol4FamDedMaxInd, POL_4_FAM_DED_MAX_IND_LEN);
    localPol4FamDedMaxIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4FamDedMaxIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4FamDedMaxInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol4FamDedMaxInd() {
    return (substring(
        getStringValue(),
        beginPol4FamDedMaxInd,
        beginPol4FamDedMaxInd + POL_4_FAM_DED_MAX_IND_LEN));
  }

  int localPol4OhbsProductCdCounter = -1;

  public boolean isPol4OhbsProductCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4OhbsProductCdCounter != sharedCounter;
    localPol4OhbsProductCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_OHBS_PRODUCT_CD_LEN = 1;
  /** serialize this Pol4OhbsProductCd */
  protected void serializePol4OhbsProductCd(char[] pol4OhbsProductCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4OhbsProductCd, 0, getStringValue(), beginPol4OhbsProductCd, POL_4_OHBS_PRODUCT_CD_LEN);
    localPol4OhbsProductCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4OhbsProductCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4OhbsProductCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol4OhbsProductCd() {
    return (substring(
        getStringValue(),
        beginPol4OhbsProductCd,
        beginPol4OhbsProductCd + POL_4_OHBS_PRODUCT_CD_LEN));
  }

  int localPol4TciTableNumberCounter = -1;

  public boolean isPol4TciTableNumberModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4TciTableNumberCounter != sharedCounter;
    localPol4TciTableNumberCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_TCI_TABLE_NUMBER_LEN = 6;
  /** serialize this Pol4TciTableNumber */
  protected void serializePol4TciTableNumber(char[] pol4TciTableNumber) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4TciTableNumber,
        0,
        getStringValue(),
        beginPol4TciTableNumber,
        POL_4_TCI_TABLE_NUMBER_LEN);
    localPol4TciTableNumberCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4TciTableNumberConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPol4TciTableNumber is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol4TciTableNumber() {
    return (substring(
        getStringValue(),
        beginPol4TciTableNumber,
        beginPol4TciTableNumber + POL_4_TCI_TABLE_NUMBER_LEN));
  }

  int localPol4CapitationExclIndCounter = -1;

  public boolean isPol4CapitationExclIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4CapitationExclIndCounter != sharedCounter;
    localPol4CapitationExclIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_CAPITATION_EXCL_IND_LEN = 1;
  /** serialize this Pol4CapitationExclInd */
  protected void serializePol4CapitationExclInd(char[] pol4CapitationExclInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4CapitationExclInd,
        0,
        getStringValue(),
        beginPol4CapitationExclInd,
        POL_4_CAPITATION_EXCL_IND_LEN);
    localPol4CapitationExclIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4CapitationExclIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4CapitationExclInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4CapitationExclInd() {
    return (substring(
        getStringValue(),
        beginPol4CapitationExclInd,
        beginPol4CapitationExclInd + POL_4_CAPITATION_EXCL_IND_LEN));
  }

  int localPol4IndemnityIndCounter = -1;

  public boolean isPol4IndemnityIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4IndemnityIndCounter != sharedCounter;
    localPol4IndemnityIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_INDEMNITY_IND_LEN = 3;
  /** serialize this Pol4IndemnityInd */
  protected void serializePol4IndemnityInd(char[] pol4IndemnityInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4IndemnityInd, 0, getStringValue(), beginPol4IndemnityInd, POL_4_INDEMNITY_IND_LEN);
    localPol4IndemnityIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4IndemnityIndConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshPol4IndemnityInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol4IndemnityInd() {
    return (substring(
        getStringValue(), beginPol4IndemnityInd, beginPol4IndemnityInd + POL_4_INDEMNITY_IND_LEN));
  }

  int localPol4AnnualRCIndCounter = -1;

  public boolean isPol4AnnualRCIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4AnnualRCIndCounter != sharedCounter;
    localPol4AnnualRCIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_ANNUAL_RCIND_LEN = 1;
  /** serialize this Pol4AnnualRCInd */
  protected void serializePol4AnnualRCInd(char[] pol4AnnualRCInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol4AnnualRCInd, 0, getStringValue(), beginPol4AnnualRCInd, POL_4_ANNUAL_RCIND_LEN);
    localPol4AnnualRCIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4AnnualRCIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4AnnualRCInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol4AnnualRCInd() {
    return (substring(
        getStringValue(), beginPol4AnnualRCInd, beginPol4AnnualRCInd + POL_4_ANNUAL_RCIND_LEN));
  }

  int localPol4DefaultRCPercentCounter = -1;

  public boolean isPol4DefaultRCPercentModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4DefaultRCPercentCounter != sharedCounter;
    localPol4DefaultRCPercentCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_DEFAULT_RCPERCENT_LEN = 2;
  /** serialize this Pol4DefaultRCPercent */
  protected void serializePol4DefaultRCPercent(char[] pol4DefaultRCPercent) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4DefaultRCPercent,
        0,
        getStringValue(),
        beginPol4DefaultRCPercent,
        POL_4_DEFAULT_RCPERCENT_LEN);
    localPol4DefaultRCPercentCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4DefaultRCPercentConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol4DefaultRCPercent is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4DefaultRCPercent() {
    return (substring(
        getStringValue(),
        beginPol4DefaultRCPercent,
        beginPol4DefaultRCPercent + POL_4_DEFAULT_RCPERCENT_LEN));
  }

  int localPol4FacSharedSavIndCounter = -1;

  public boolean isPol4FacSharedSavIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4FacSharedSavIndCounter != sharedCounter;
    localPol4FacSharedSavIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_FAC_SHARED_SAV_IND_LEN = 1;
  /** serialize this Pol4FacSharedSavInd */
  protected void serializePol4FacSharedSavInd(char[] pol4FacSharedSavInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4FacSharedSavInd,
        0,
        getStringValue(),
        beginPol4FacSharedSavInd,
        POL_4_FAC_SHARED_SAV_IND_LEN);
    localPol4FacSharedSavIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4FacSharedSavIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4FacSharedSavInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4FacSharedSavInd() {
    return (substring(
        getStringValue(),
        beginPol4FacSharedSavInd,
        beginPol4FacSharedSavInd + POL_4_FAC_SHARED_SAV_IND_LEN));
  }

  int localPol4PhysSharedSavIndCounter = -1;

  public boolean isPol4PhysSharedSavIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4PhysSharedSavIndCounter != sharedCounter;
    localPol4PhysSharedSavIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_PHYS_SHARED_SAV_IND_LEN = 1;
  /** serialize this Pol4PhysSharedSavInd */
  protected void serializePol4PhysSharedSavInd(char[] pol4PhysSharedSavInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4PhysSharedSavInd,
        0,
        getStringValue(),
        beginPol4PhysSharedSavInd,
        POL_4_PHYS_SHARED_SAV_IND_LEN);
    localPol4PhysSharedSavIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4PhysSharedSavIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4PhysSharedSavInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4PhysSharedSavInd() {
    return (substring(
        getStringValue(),
        beginPol4PhysSharedSavInd,
        beginPol4PhysSharedSavInd + POL_4_PHYS_SHARED_SAV_IND_LEN));
  }

  int localPol4PlanFeaturesCounter = -1;

  public boolean isPol4PlanFeaturesModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4PlanFeaturesCounter != sharedCounter;
    localPol4PlanFeaturesCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_PLAN_FEATURES_LEN = 2;
  /** serialize this Pol4PlanFeatures */
  protected void serializePol4PlanFeatures(char[] pol4PlanFeatures) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4PlanFeatures, 0, getStringValue(), beginPol4PlanFeatures, POL_4_PLAN_FEATURES_LEN);
    localPol4PlanFeaturesCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4PlanFeaturesConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol4PlanFeatures is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol4PlanFeatures() {
    return (substring(
        getStringValue(), beginPol4PlanFeatures, beginPol4PlanFeatures + POL_4_PLAN_FEATURES_LEN));
  }

  int localPol4PlanFeaturesIndCounter = -1;

  public boolean isPol4PlanFeaturesIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4PlanFeaturesIndCounter != sharedCounter;
    localPol4PlanFeaturesIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_PLAN_FEATURES_IND_LEN = 1;
  /** serialize this Pol4PlanFeaturesInd */
  protected void serializePol4PlanFeaturesInd(char[] pol4PlanFeaturesInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4PlanFeaturesInd,
        0,
        getStringValue(),
        beginPol4PlanFeaturesInd,
        POL_4_PLAN_FEATURES_IND_LEN);
    localPol4PlanFeaturesIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4PlanFeaturesIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4PlanFeaturesInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4PlanFeaturesInd() {
    return (substring(
        getStringValue(),
        beginPol4PlanFeaturesInd,
        beginPol4PlanFeaturesInd + POL_4_PLAN_FEATURES_IND_LEN));
  }

  int localPol4AllncCdCounter = -1;

  public boolean isPol4AllncCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4AllncCdCounter != sharedCounter;
    localPol4AllncCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_ALLNC_CD_LEN = 1;
  /** serialize this Pol4AllncCd */
  protected void serializePol4AllncCd(char[] pol4AllncCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol4AllncCd, 0, getStringValue(), beginPol4AllncCd, POL_4_ALLNC_CD_LEN);
    localPol4AllncCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4AllncCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4AllncCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshPol4AllncCd() {
    return (substring(getStringValue(), beginPol4AllncCd, beginPol4AllncCd + POL_4_ALLNC_CD_LEN));
  }

  int localPol4FundTypCdCounter = -1;

  public boolean isPol4FundTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4FundTypCdCounter != sharedCounter;
    localPol4FundTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_FUND_TYP_CD_LEN = 1;
  /** serialize this Pol4FundTypCd */
  protected void serializePol4FundTypCd(char[] pol4FundTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol4FundTypCd, 0, getStringValue(), beginPol4FundTypCd, POL_4_FUND_TYP_CD_LEN);
    localPol4FundTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4FundTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4FundTypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol4FundTypCd() {
    return (substring(
        getStringValue(), beginPol4FundTypCd, beginPol4FundTypCd + POL_4_FUND_TYP_CD_LEN));
  }

  int localPol4PrdctCdIdCounter = -1;

  public boolean isPol4PrdctCdIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4PrdctCdIdCounter != sharedCounter;
    localPol4PrdctCdIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_PRDCT_CD_ID_LEN = 4;
  /** serialize this Pol4PrdctCdId */
  protected void serializePol4PrdctCdId(char[] pol4PrdctCdId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol4PrdctCdId, 0, getStringValue(), beginPol4PrdctCdId, POL_4_PRDCT_CD_ID_LEN);
    localPol4PrdctCdIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4PrdctCdIdConstraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshPol4PrdctCdId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol4PrdctCdId() {
    return (substring(
        getStringValue(), beginPol4PrdctCdId, beginPol4PrdctCdId + POL_4_PRDCT_CD_ID_LEN));
  }

  int localPol4EmergentWrapIndCounter = -1;

  public boolean isPol4EmergentWrapIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4EmergentWrapIndCounter != sharedCounter;
    localPol4EmergentWrapIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_EMERGENT_WRAP_IND_LEN = 1;
  /** serialize this Pol4EmergentWrapInd */
  protected void serializePol4EmergentWrapInd(char[] pol4EmergentWrapInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4EmergentWrapInd,
        0,
        getStringValue(),
        beginPol4EmergentWrapInd,
        POL_4_EMERGENT_WRAP_IND_LEN);
    localPol4EmergentWrapIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4EmergentWrapIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4EmergentWrapInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4EmergentWrapInd() {
    return (substring(
        getStringValue(),
        beginPol4EmergentWrapInd,
        beginPol4EmergentWrapInd + POL_4_EMERGENT_WRAP_IND_LEN));
  }

  int localPol4RetOopMaxCovCdCounter = -1;

  public boolean isPol4RetOopMaxCovCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetOopMaxCovCdCounter != sharedCounter;
    localPol4RetOopMaxCovCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_OOP_MAX_COV_CD_LEN = 1;
  /** serialize this Pol4RetOopMaxCovCd */
  protected void serializePol4RetOopMaxCovCd(char[] pol4RetOopMaxCovCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetOopMaxCovCd,
        0,
        getStringValue(),
        beginPol4RetOopMaxCovCd,
        POL_4_RET_OOP_MAX_COV_CD_LEN);
    localPol4RetOopMaxCovCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetOopMaxCovCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4RetOopMaxCovCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetOopMaxCovCd() {
    return (substring(
        getStringValue(),
        beginPol4RetOopMaxCovCd,
        beginPol4RetOopMaxCovCd + POL_4_RET_OOP_MAX_COV_CD_LEN));
  }

  int localPol4SpecialProcessCd6Counter = -1;

  public boolean isPol4SpecialProcessCd6Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4SpecialProcessCd6Counter != sharedCounter;
    localPol4SpecialProcessCd6Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_SPECIAL_PROCESS_CD_6_LEN = 1;
  /** serialize this Pol4SpecialProcessCd6 */
  protected void serializePol4SpecialProcessCd6(char[] pol4SpecialProcessCd6) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4SpecialProcessCd6,
        0,
        getStringValue(),
        beginPol4SpecialProcessCd6,
        POL_4_SPECIAL_PROCESS_CD_6_LEN);
    localPol4SpecialProcessCd6Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4SpecialProcessCd6Constraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4SpecialProcessCd6 is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4SpecialProcessCd6() {
    return (substring(
        getStringValue(),
        beginPol4SpecialProcessCd6,
        beginPol4SpecialProcessCd6 + POL_4_SPECIAL_PROCESS_CD_6_LEN));
  }

  int localPol4SpecialProcessCd1Counter = -1;

  public boolean isPol4SpecialProcessCd1Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4SpecialProcessCd1Counter != sharedCounter;
    localPol4SpecialProcessCd1Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_SPECIAL_PROCESS_CD_1_LEN = 1;
  /** serialize this Pol4SpecialProcessCd1 */
  protected void serializePol4SpecialProcessCd1(char[] pol4SpecialProcessCd1) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4SpecialProcessCd1,
        0,
        getStringValue(),
        beginPol4SpecialProcessCd1,
        POL_4_SPECIAL_PROCESS_CD_1_LEN);
    localPol4SpecialProcessCd1Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4SpecialProcessCd1Constraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4SpecialProcessCd1 is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4SpecialProcessCd1() {
    return (substring(
        getStringValue(),
        beginPol4SpecialProcessCd1,
        beginPol4SpecialProcessCd1 + POL_4_SPECIAL_PROCESS_CD_1_LEN));
  }

  int localPol4SpecialProcessCd2Counter = -1;

  public boolean isPol4SpecialProcessCd2Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4SpecialProcessCd2Counter != sharedCounter;
    localPol4SpecialProcessCd2Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_SPECIAL_PROCESS_CD_2_LEN = 1;
  /** serialize this Pol4SpecialProcessCd2 */
  protected void serializePol4SpecialProcessCd2(char[] pol4SpecialProcessCd2) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4SpecialProcessCd2,
        0,
        getStringValue(),
        beginPol4SpecialProcessCd2,
        POL_4_SPECIAL_PROCESS_CD_2_LEN);
    localPol4SpecialProcessCd2Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4SpecialProcessCd2Constraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4SpecialProcessCd2 is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4SpecialProcessCd2() {
    return (substring(
        getStringValue(),
        beginPol4SpecialProcessCd2,
        beginPol4SpecialProcessCd2 + POL_4_SPECIAL_PROCESS_CD_2_LEN));
  }

  int localPol4SpecialProcessCd4Counter = -1;

  public boolean isPol4SpecialProcessCd4Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4SpecialProcessCd4Counter != sharedCounter;
    localPol4SpecialProcessCd4Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_SPECIAL_PROCESS_CD_4_LEN = 1;
  /** serialize this Pol4SpecialProcessCd4 */
  protected void serializePol4SpecialProcessCd4(char[] pol4SpecialProcessCd4) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4SpecialProcessCd4,
        0,
        getStringValue(),
        beginPol4SpecialProcessCd4,
        POL_4_SPECIAL_PROCESS_CD_4_LEN);
    localPol4SpecialProcessCd4Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4SpecialProcessCd4Constraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4SpecialProcessCd4 is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4SpecialProcessCd4() {
    return (substring(
        getStringValue(),
        beginPol4SpecialProcessCd4,
        beginPol4SpecialProcessCd4 + POL_4_SPECIAL_PROCESS_CD_4_LEN));
  }

  int localPol4SpecialProcessCd5Counter = -1;

  public boolean isPol4SpecialProcessCd5Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4SpecialProcessCd5Counter != sharedCounter;
    localPol4SpecialProcessCd5Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_SPECIAL_PROCESS_CD_5_LEN = 1;
  /** serialize this Pol4SpecialProcessCd5 */
  protected void serializePol4SpecialProcessCd5(char[] pol4SpecialProcessCd5) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4SpecialProcessCd5,
        0,
        getStringValue(),
        beginPol4SpecialProcessCd5,
        POL_4_SPECIAL_PROCESS_CD_5_LEN);
    localPol4SpecialProcessCd5Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4SpecialProcessCd5Constraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4SpecialProcessCd5 is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4SpecialProcessCd5() {
    return (substring(
        getStringValue(),
        beginPol4SpecialProcessCd5,
        beginPol4SpecialProcessCd5 + POL_4_SPECIAL_PROCESS_CD_5_LEN));
  }

  int localPol4SpecialProcessCd7Counter = -1;

  public boolean isPol4SpecialProcessCd7Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4SpecialProcessCd7Counter != sharedCounter;
    localPol4SpecialProcessCd7Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_SPECIAL_PROCESS_CD_7_LEN = 1;
  /** serialize this Pol4SpecialProcessCd7 */
  protected void serializePol4SpecialProcessCd7(char[] pol4SpecialProcessCd7) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4SpecialProcessCd7,
        0,
        getStringValue(),
        beginPol4SpecialProcessCd7,
        POL_4_SPECIAL_PROCESS_CD_7_LEN);
    localPol4SpecialProcessCd7Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4SpecialProcessCd7Constraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4SpecialProcessCd7 is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4SpecialProcessCd7() {
    return (substring(
        getStringValue(),
        beginPol4SpecialProcessCd7,
        beginPol4SpecialProcessCd7 + POL_4_SPECIAL_PROCESS_CD_7_LEN));
  }

  int localPol4SpecialProcessCd8Counter = -1;

  public boolean isPol4SpecialProcessCd8Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4SpecialProcessCd8Counter != sharedCounter;
    localPol4SpecialProcessCd8Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_SPECIAL_PROCESS_CD_8_LEN = 1;
  /** serialize this Pol4SpecialProcessCd8 */
  protected void serializePol4SpecialProcessCd8(char[] pol4SpecialProcessCd8) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4SpecialProcessCd8,
        0,
        getStringValue(),
        beginPol4SpecialProcessCd8,
        POL_4_SPECIAL_PROCESS_CD_8_LEN);
    localPol4SpecialProcessCd8Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4SpecialProcessCd8Constraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4SpecialProcessCd8 is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4SpecialProcessCd8() {
    return (substring(
        getStringValue(),
        beginPol4SpecialProcessCd8,
        beginPol4SpecialProcessCd8 + POL_4_SPECIAL_PROCESS_CD_8_LEN));
  }

  int localPol4SpecialProcessCd9Counter = -1;

  public boolean isPol4SpecialProcessCd9Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4SpecialProcessCd9Counter != sharedCounter;
    localPol4SpecialProcessCd9Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_SPECIAL_PROCESS_CD_9_LEN = 1;
  /** serialize this Pol4SpecialProcessCd9 */
  protected void serializePol4SpecialProcessCd9(char[] pol4SpecialProcessCd9) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4SpecialProcessCd9,
        0,
        getStringValue(),
        beginPol4SpecialProcessCd9,
        POL_4_SPECIAL_PROCESS_CD_9_LEN);
    localPol4SpecialProcessCd9Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4SpecialProcessCd9Constraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4SpecialProcessCd9 is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4SpecialProcessCd9() {
    return (substring(
        getStringValue(),
        beginPol4SpecialProcessCd9,
        beginPol4SpecialProcessCd9 + POL_4_SPECIAL_PROCESS_CD_9_LEN));
  }

  int localPol4SpecialProcessCd10Counter = -1;

  public boolean isPol4SpecialProcessCd10Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4SpecialProcessCd10Counter != sharedCounter;
    localPol4SpecialProcessCd10Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_SPECIAL_PROCESS_CD_10_LEN = 1;
  /** serialize this Pol4SpecialProcessCd10 */
  protected void serializePol4SpecialProcessCd10(char[] pol4SpecialProcessCd10) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4SpecialProcessCd10,
        0,
        getStringValue(),
        beginPol4SpecialProcessCd10,
        POL_4_SPECIAL_PROCESS_CD_10_LEN);
    localPol4SpecialProcessCd10Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4SpecialProcessCd10Constraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4SpecialProcessCd10 is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4SpecialProcessCd10() {
    return (substring(
        getStringValue(),
        beginPol4SpecialProcessCd10,
        beginPol4SpecialProcessCd10 + POL_4_SPECIAL_PROCESS_CD_10_LEN));
  }

  int localPol4IndCoreMaxIndCounter = -1;

  public boolean isPol4IndCoreMaxIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4IndCoreMaxIndCounter != sharedCounter;
    localPol4IndCoreMaxIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_IND_CORE_MAX_IND_LEN = 1;
  /** serialize this Pol4IndCoreMaxInd */
  protected void serializePol4IndCoreMaxInd(char[] pol4IndCoreMaxInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4IndCoreMaxInd, 0, getStringValue(), beginPol4IndCoreMaxInd, POL_4_IND_CORE_MAX_IND_LEN);
    localPol4IndCoreMaxIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4IndCoreMaxIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4IndCoreMaxInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol4IndCoreMaxInd() {
    return (substring(
        getStringValue(),
        beginPol4IndCoreMaxInd,
        beginPol4IndCoreMaxInd + POL_4_IND_CORE_MAX_IND_LEN));
  }

  int localPol4IndCoreMaxPdCounter = -1;

  public boolean isPol4IndCoreMaxPdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4IndCoreMaxPdCounter != sharedCounter;
    localPol4IndCoreMaxPdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_IND_CORE_MAX_PD_LEN = 1;
  /** serialize this Pol4IndCoreMaxPd */
  protected void serializePol4IndCoreMaxPd(char[] pol4IndCoreMaxPd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4IndCoreMaxPd, 0, getStringValue(), beginPol4IndCoreMaxPd, POL_4_IND_CORE_MAX_PD_LEN);
    localPol4IndCoreMaxPdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4IndCoreMaxPdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4IndCoreMaxPd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol4IndCoreMaxPd() {
    return (substring(
        getStringValue(),
        beginPol4IndCoreMaxPd,
        beginPol4IndCoreMaxPd + POL_4_IND_CORE_MAX_PD_LEN));
  }

  int localPol4InnIndCoreAmtCounter = -1;

  public boolean isPol4InnIndCoreAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4InnIndCoreAmtCounter != sharedCounter;
    localPol4InnIndCoreAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4InnIndCoreAmt
   *
   * @return pol4InnIndCoreAmt
   */
  public char[] getPol4InnIndCoreAmtString() {
    return getCharArray(beginPol4InnIndCoreAmt, POL_4_INN_IND_CORE_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4InnIndCoreAmtIsNumeric() {
    return isNumeric(
        beginPol4InnIndCoreAmt,
        beginPol4InnIndCoreAmt + POL_4_INN_IND_CORE_AMT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_INN_IND_CORE_AMT_LEN = 9;
  protected static final int POL_4_INN_IND_CORE_AMT_SCALE = 2;

  protected BigDecimal checkPol4InnIndCoreAmtMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 9 /*precision*/);
  }

  /** serializePol4InnIndCoreAmt */
  protected void serializePol4InnIndCoreAmt(BigDecimal pol4InnIndCoreAmt) {
    putNumber(
        beginPol4InnIndCoreAmt,
        pol4InnIndCoreAmt,
        POL_4_INN_IND_CORE_AMT_LEN,
        POL_4_INN_IND_CORE_AMT_SCALE,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4InnIndCoreAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  /** serializePol4InnIndCoreAmt */
  protected BigDecimal serializePol4InnIndCoreAmt(char[] value) throws CFException {
    if (value.length < 9) value = pad(9, value, ' ', RIGHT_PAD);
    replaceValue(padNumber(9, value, false /*isSigned?*/), beginPol4InnIndCoreAmt, 9);
    localPol4InnIndCoreAmtCounter = shareString.getSerializedField().getModifiedCounter();
    try {
      return convertString2Decimal(
          value,
          POL_4_INN_IND_CORE_AMT_LEN,
          POL_4_INN_IND_CORE_AMT_SCALE,
          false /*isSigned?*/,
          true /*signTrailing?*/,
          false /*storeSignSeparate?*/);
    } catch (Exception ex) {
      throw getSoc7ABend("pol4InnIndCoreAmt", beginPol4InnIndCoreAmt, POL_4_INN_IND_CORE_AMT_LEN);
    }
  }
  /**
   * refreshPol4InnIndCoreAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshPol4InnIndCoreAmt() throws CFException {
    try {
      return (getDecimalNumber(
          beginPol4InnIndCoreAmt,
          POL_4_INN_IND_CORE_AMT_LEN,
          POL_4_INN_IND_CORE_AMT_SCALE,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("pol4InnIndCoreAmt", beginPol4InnIndCoreAmt, POL_4_INN_IND_CORE_AMT_LEN);
    }
  }

  int localPol4OonIndCoreAmtCounter = -1;

  public boolean isPol4OonIndCoreAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4OonIndCoreAmtCounter != sharedCounter;
    localPol4OonIndCoreAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4OonIndCoreAmt
   *
   * @return pol4OonIndCoreAmt
   */
  public char[] getPol4OonIndCoreAmtString() {
    return getCharArray(beginPol4OonIndCoreAmt, POL_4_OON_IND_CORE_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4OonIndCoreAmtIsNumeric() {
    return isNumeric(
        beginPol4OonIndCoreAmt,
        beginPol4OonIndCoreAmt + POL_4_OON_IND_CORE_AMT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_OON_IND_CORE_AMT_LEN = 9;
  protected static final int POL_4_OON_IND_CORE_AMT_SCALE = 2;

  protected BigDecimal checkPol4OonIndCoreAmtMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 9 /*precision*/);
  }

  /** serializePol4OonIndCoreAmt */
  protected void serializePol4OonIndCoreAmt(BigDecimal pol4OonIndCoreAmt) {
    putNumber(
        beginPol4OonIndCoreAmt,
        pol4OonIndCoreAmt,
        POL_4_OON_IND_CORE_AMT_LEN,
        POL_4_OON_IND_CORE_AMT_SCALE,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4OonIndCoreAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  /** serializePol4OonIndCoreAmt */
  protected BigDecimal serializePol4OonIndCoreAmt(char[] value) throws CFException {
    if (value.length < 9) value = pad(9, value, ' ', RIGHT_PAD);
    replaceValue(padNumber(9, value, false /*isSigned?*/), beginPol4OonIndCoreAmt, 9);
    localPol4OonIndCoreAmtCounter = shareString.getSerializedField().getModifiedCounter();
    try {
      return convertString2Decimal(
          value,
          POL_4_OON_IND_CORE_AMT_LEN,
          POL_4_OON_IND_CORE_AMT_SCALE,
          false /*isSigned?*/,
          true /*signTrailing?*/,
          false /*storeSignSeparate?*/);
    } catch (Exception ex) {
      throw getSoc7ABend("pol4OonIndCoreAmt", beginPol4OonIndCoreAmt, POL_4_OON_IND_CORE_AMT_LEN);
    }
  }
  /**
   * refreshPol4OonIndCoreAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshPol4OonIndCoreAmt() throws CFException {
    try {
      return (getDecimalNumber(
          beginPol4OonIndCoreAmt,
          POL_4_OON_IND_CORE_AMT_LEN,
          POL_4_OON_IND_CORE_AMT_SCALE,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("pol4OonIndCoreAmt", beginPol4OonIndCoreAmt, POL_4_OON_IND_CORE_AMT_LEN);
    }
  }

  int localPol4T1IndCoreAmtCounter = -1;

  public boolean isPol4T1IndCoreAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4T1IndCoreAmtCounter != sharedCounter;
    localPol4T1IndCoreAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4T1IndCoreAmt
   *
   * @return pol4T1IndCoreAmt
   */
  public char[] getPol4T1IndCoreAmtString() {
    return getCharArray(beginPol4T1IndCoreAmt, POL_4_T_1_IND_CORE_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4T1IndCoreAmtIsNumeric() {
    return isNumeric(
        beginPol4T1IndCoreAmt,
        beginPol4T1IndCoreAmt + POL_4_T_1_IND_CORE_AMT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_T_1_IND_CORE_AMT_LEN = 9;
  protected static final int POL_4_T_1_IND_CORE_AMT_SCALE = 2;

  protected BigDecimal checkPol4T1IndCoreAmtMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 9 /*precision*/);
  }

  /** serializePol4T1IndCoreAmt */
  protected void serializePol4T1IndCoreAmt(BigDecimal pol4T1IndCoreAmt) {
    putNumber(
        beginPol4T1IndCoreAmt,
        pol4T1IndCoreAmt,
        POL_4_T_1_IND_CORE_AMT_LEN,
        POL_4_T_1_IND_CORE_AMT_SCALE,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4T1IndCoreAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  /** serializePol4T1IndCoreAmt */
  protected BigDecimal serializePol4T1IndCoreAmt(char[] value) throws CFException {
    if (value.length < 9) value = pad(9, value, ' ', RIGHT_PAD);
    replaceValue(padNumber(9, value, false /*isSigned?*/), beginPol4T1IndCoreAmt, 9);
    localPol4T1IndCoreAmtCounter = shareString.getSerializedField().getModifiedCounter();
    try {
      return convertString2Decimal(
          value,
          POL_4_T_1_IND_CORE_AMT_LEN,
          POL_4_T_1_IND_CORE_AMT_SCALE,
          false /*isSigned?*/,
          true /*signTrailing?*/,
          false /*storeSignSeparate?*/);
    } catch (Exception ex) {
      throw getSoc7ABend("pol4T1IndCoreAmt", beginPol4T1IndCoreAmt, POL_4_T_1_IND_CORE_AMT_LEN);
    }
  }
  /**
   * refreshPol4T1IndCoreAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshPol4T1IndCoreAmt() throws CFException {
    try {
      return (getDecimalNumber(
          beginPol4T1IndCoreAmt,
          POL_4_T_1_IND_CORE_AMT_LEN,
          POL_4_T_1_IND_CORE_AMT_SCALE,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("pol4T1IndCoreAmt", beginPol4T1IndCoreAmt, POL_4_T_1_IND_CORE_AMT_LEN);
    }
  }

  int localPol4InnFamCoreAmtCounter = -1;

  public boolean isPol4InnFamCoreAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4InnFamCoreAmtCounter != sharedCounter;
    localPol4InnFamCoreAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4InnFamCoreAmt
   *
   * @return pol4InnFamCoreAmt
   */
  public char[] getPol4InnFamCoreAmtString() {
    return getCharArray(beginPol4InnFamCoreAmt, POL_4_INN_FAM_CORE_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4InnFamCoreAmtIsNumeric() {
    return isNumeric(
        beginPol4InnFamCoreAmt,
        beginPol4InnFamCoreAmt + POL_4_INN_FAM_CORE_AMT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_INN_FAM_CORE_AMT_LEN = 9;
  protected static final int POL_4_INN_FAM_CORE_AMT_SCALE = 2;

  protected BigDecimal checkPol4InnFamCoreAmtMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 9 /*precision*/);
  }

  /** serializePol4InnFamCoreAmt */
  protected void serializePol4InnFamCoreAmt(BigDecimal pol4InnFamCoreAmt) {
    putNumber(
        beginPol4InnFamCoreAmt,
        pol4InnFamCoreAmt,
        POL_4_INN_FAM_CORE_AMT_LEN,
        POL_4_INN_FAM_CORE_AMT_SCALE,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4InnFamCoreAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  /** serializePol4InnFamCoreAmt */
  protected BigDecimal serializePol4InnFamCoreAmt(char[] value) throws CFException {
    if (value.length < 9) value = pad(9, value, ' ', RIGHT_PAD);
    replaceValue(padNumber(9, value, false /*isSigned?*/), beginPol4InnFamCoreAmt, 9);
    localPol4InnFamCoreAmtCounter = shareString.getSerializedField().getModifiedCounter();
    try {
      return convertString2Decimal(
          value,
          POL_4_INN_FAM_CORE_AMT_LEN,
          POL_4_INN_FAM_CORE_AMT_SCALE,
          false /*isSigned?*/,
          true /*signTrailing?*/,
          false /*storeSignSeparate?*/);
    } catch (Exception ex) {
      throw getSoc7ABend("pol4InnFamCoreAmt", beginPol4InnFamCoreAmt, POL_4_INN_FAM_CORE_AMT_LEN);
    }
  }
  /**
   * refreshPol4InnFamCoreAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshPol4InnFamCoreAmt() throws CFException {
    try {
      return (getDecimalNumber(
          beginPol4InnFamCoreAmt,
          POL_4_INN_FAM_CORE_AMT_LEN,
          POL_4_INN_FAM_CORE_AMT_SCALE,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("pol4InnFamCoreAmt", beginPol4InnFamCoreAmt, POL_4_INN_FAM_CORE_AMT_LEN);
    }
  }

  int localPol4T1FamCoreAmtCounter = -1;

  public boolean isPol4T1FamCoreAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4T1FamCoreAmtCounter != sharedCounter;
    localPol4T1FamCoreAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4T1FamCoreAmt
   *
   * @return pol4T1FamCoreAmt
   */
  public char[] getPol4T1FamCoreAmtString() {
    return getCharArray(beginPol4T1FamCoreAmt, POL_4_T_1_FAM_CORE_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4T1FamCoreAmtIsNumeric() {
    return isNumeric(
        beginPol4T1FamCoreAmt,
        beginPol4T1FamCoreAmt + POL_4_T_1_FAM_CORE_AMT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_T_1_FAM_CORE_AMT_LEN = 9;
  protected static final int POL_4_T_1_FAM_CORE_AMT_SCALE = 2;

  protected BigDecimal checkPol4T1FamCoreAmtMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 9 /*precision*/);
  }

  /** serializePol4T1FamCoreAmt */
  protected void serializePol4T1FamCoreAmt(BigDecimal pol4T1FamCoreAmt) {
    putNumber(
        beginPol4T1FamCoreAmt,
        pol4T1FamCoreAmt,
        POL_4_T_1_FAM_CORE_AMT_LEN,
        POL_4_T_1_FAM_CORE_AMT_SCALE,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4T1FamCoreAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  /** serializePol4T1FamCoreAmt */
  protected BigDecimal serializePol4T1FamCoreAmt(char[] value) throws CFException {
    if (value.length < 9) value = pad(9, value, ' ', RIGHT_PAD);
    replaceValue(padNumber(9, value, false /*isSigned?*/), beginPol4T1FamCoreAmt, 9);
    localPol4T1FamCoreAmtCounter = shareString.getSerializedField().getModifiedCounter();
    try {
      return convertString2Decimal(
          value,
          POL_4_T_1_FAM_CORE_AMT_LEN,
          POL_4_T_1_FAM_CORE_AMT_SCALE,
          false /*isSigned?*/,
          true /*signTrailing?*/,
          false /*storeSignSeparate?*/);
    } catch (Exception ex) {
      throw getSoc7ABend("pol4T1FamCoreAmt", beginPol4T1FamCoreAmt, POL_4_T_1_FAM_CORE_AMT_LEN);
    }
  }
  /**
   * refreshPol4T1FamCoreAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshPol4T1FamCoreAmt() throws CFException {
    try {
      return (getDecimalNumber(
          beginPol4T1FamCoreAmt,
          POL_4_T_1_FAM_CORE_AMT_LEN,
          POL_4_T_1_FAM_CORE_AMT_SCALE,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("pol4T1FamCoreAmt", beginPol4T1FamCoreAmt, POL_4_T_1_FAM_CORE_AMT_LEN);
    }
  }

  int localPol4OonFamCoreAmtCounter = -1;

  public boolean isPol4OonFamCoreAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4OonFamCoreAmtCounter != sharedCounter;
    localPol4OonFamCoreAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4OonFamCoreAmt
   *
   * @return pol4OonFamCoreAmt
   */
  public char[] getPol4OonFamCoreAmtString() {
    return getCharArray(beginPol4OonFamCoreAmt, POL_4_OON_FAM_CORE_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4OonFamCoreAmtIsNumeric() {
    return isNumeric(
        beginPol4OonFamCoreAmt,
        beginPol4OonFamCoreAmt + POL_4_OON_FAM_CORE_AMT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_OON_FAM_CORE_AMT_LEN = 9;
  protected static final int POL_4_OON_FAM_CORE_AMT_SCALE = 2;

  protected BigDecimal checkPol4OonFamCoreAmtMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 9 /*precision*/);
  }

  /** serializePol4OonFamCoreAmt */
  protected void serializePol4OonFamCoreAmt(BigDecimal pol4OonFamCoreAmt) {
    putNumber(
        beginPol4OonFamCoreAmt,
        pol4OonFamCoreAmt,
        POL_4_OON_FAM_CORE_AMT_LEN,
        POL_4_OON_FAM_CORE_AMT_SCALE,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4OonFamCoreAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  /** serializePol4OonFamCoreAmt */
  protected BigDecimal serializePol4OonFamCoreAmt(char[] value) throws CFException {
    if (value.length < 9) value = pad(9, value, ' ', RIGHT_PAD);
    replaceValue(padNumber(9, value, false /*isSigned?*/), beginPol4OonFamCoreAmt, 9);
    localPol4OonFamCoreAmtCounter = shareString.getSerializedField().getModifiedCounter();
    try {
      return convertString2Decimal(
          value,
          POL_4_OON_FAM_CORE_AMT_LEN,
          POL_4_OON_FAM_CORE_AMT_SCALE,
          false /*isSigned?*/,
          true /*signTrailing?*/,
          false /*storeSignSeparate?*/);
    } catch (Exception ex) {
      throw getSoc7ABend("pol4OonFamCoreAmt", beginPol4OonFamCoreAmt, POL_4_OON_FAM_CORE_AMT_LEN);
    }
  }
  /**
   * refreshPol4OonFamCoreAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshPol4OonFamCoreAmt() throws CFException {
    try {
      return (getDecimalNumber(
          beginPol4OonFamCoreAmt,
          POL_4_OON_FAM_CORE_AMT_LEN,
          POL_4_OON_FAM_CORE_AMT_SCALE,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("pol4OonFamCoreAmt", beginPol4OonFamCoreAmt, POL_4_OON_FAM_CORE_AMT_LEN);
    }
  }

  int localPol4CrossApplyCoreIndCounter = -1;

  public boolean isPol4CrossApplyCoreIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4CrossApplyCoreIndCounter != sharedCounter;
    localPol4CrossApplyCoreIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_CROSS_APPLY_CORE_IND_LEN = 1;
  /** serialize this Pol4CrossApplyCoreInd */
  protected void serializePol4CrossApplyCoreInd(char[] pol4CrossApplyCoreInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4CrossApplyCoreInd,
        0,
        getStringValue(),
        beginPol4CrossApplyCoreInd,
        POL_4_CROSS_APPLY_CORE_IND_LEN);
    localPol4CrossApplyCoreIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4CrossApplyCoreIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4CrossApplyCoreInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4CrossApplyCoreInd() {
    return (substring(
        getStringValue(),
        beginPol4CrossApplyCoreInd,
        beginPol4CrossApplyCoreInd + POL_4_CROSS_APPLY_CORE_IND_LEN));
  }

  int localPol4CopayIndMaxInnCounter = -1;

  public boolean isPol4CopayIndMaxInnModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4CopayIndMaxInnCounter != sharedCounter;
    localPol4CopayIndMaxInnCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4CopayIndMaxInn
   *
   * @return pol4CopayIndMaxInn
   */
  public char[] getPol4CopayIndMaxInnString() {
    return getCharArray(beginPol4CopayIndMaxInn, POL_4_COPAY_IND_MAX_INN_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4CopayIndMaxInnIsNumeric() {
    return isNumeric(
        beginPol4CopayIndMaxInn,
        beginPol4CopayIndMaxInn + POL_4_COPAY_IND_MAX_INN_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_COPAY_IND_MAX_INN_LEN = 9;
  protected static final int POL_4_COPAY_IND_MAX_INN_SCALE = 2;

  protected BigDecimal checkPol4CopayIndMaxInnMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 9 /*precision*/);
  }

  /** serializePol4CopayIndMaxInn */
  protected void serializePol4CopayIndMaxInn(BigDecimal pol4CopayIndMaxInn) {
    putNumber(
        beginPol4CopayIndMaxInn,
        pol4CopayIndMaxInn,
        POL_4_COPAY_IND_MAX_INN_LEN,
        POL_4_COPAY_IND_MAX_INN_SCALE,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4CopayIndMaxInnCounter = shareString.getSerializedField().getModifiedCounter();
  }

  /** serializePol4CopayIndMaxInn */
  protected BigDecimal serializePol4CopayIndMaxInn(char[] value) throws CFException {
    if (value.length < 9) value = pad(9, value, ' ', RIGHT_PAD);
    replaceValue(padNumber(9, value, false /*isSigned?*/), beginPol4CopayIndMaxInn, 9);
    localPol4CopayIndMaxInnCounter = shareString.getSerializedField().getModifiedCounter();
    try {
      return convertString2Decimal(
          value,
          POL_4_COPAY_IND_MAX_INN_LEN,
          POL_4_COPAY_IND_MAX_INN_SCALE,
          false /*isSigned?*/,
          true /*signTrailing?*/,
          false /*storeSignSeparate?*/);
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol4CopayIndMaxInn", beginPol4CopayIndMaxInn, POL_4_COPAY_IND_MAX_INN_LEN);
    }
  }
  /**
   * refreshPol4CopayIndMaxInn is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshPol4CopayIndMaxInn() throws CFException {
    try {
      return (getDecimalNumber(
          beginPol4CopayIndMaxInn,
          POL_4_COPAY_IND_MAX_INN_LEN,
          POL_4_COPAY_IND_MAX_INN_SCALE,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol4CopayIndMaxInn", beginPol4CopayIndMaxInn, POL_4_COPAY_IND_MAX_INN_LEN);
    }
  }

  int localPol4CopayIndMaxOonCounter = -1;

  public boolean isPol4CopayIndMaxOonModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4CopayIndMaxOonCounter != sharedCounter;
    localPol4CopayIndMaxOonCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4CopayIndMaxOon
   *
   * @return pol4CopayIndMaxOon
   */
  public char[] getPol4CopayIndMaxOonString() {
    return getCharArray(beginPol4CopayIndMaxOon, POL_4_COPAY_IND_MAX_OON_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4CopayIndMaxOonIsNumeric() {
    return isNumeric(
        beginPol4CopayIndMaxOon,
        beginPol4CopayIndMaxOon + POL_4_COPAY_IND_MAX_OON_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_COPAY_IND_MAX_OON_LEN = 9;
  protected static final int POL_4_COPAY_IND_MAX_OON_SCALE = 2;

  protected BigDecimal checkPol4CopayIndMaxOonMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 9 /*precision*/);
  }

  /** serializePol4CopayIndMaxOon */
  protected void serializePol4CopayIndMaxOon(BigDecimal pol4CopayIndMaxOon) {
    putNumber(
        beginPol4CopayIndMaxOon,
        pol4CopayIndMaxOon,
        POL_4_COPAY_IND_MAX_OON_LEN,
        POL_4_COPAY_IND_MAX_OON_SCALE,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4CopayIndMaxOonCounter = shareString.getSerializedField().getModifiedCounter();
  }

  /** serializePol4CopayIndMaxOon */
  protected BigDecimal serializePol4CopayIndMaxOon(char[] value) throws CFException {
    if (value.length < 9) value = pad(9, value, ' ', RIGHT_PAD);
    replaceValue(padNumber(9, value, false /*isSigned?*/), beginPol4CopayIndMaxOon, 9);
    localPol4CopayIndMaxOonCounter = shareString.getSerializedField().getModifiedCounter();
    try {
      return convertString2Decimal(
          value,
          POL_4_COPAY_IND_MAX_OON_LEN,
          POL_4_COPAY_IND_MAX_OON_SCALE,
          false /*isSigned?*/,
          true /*signTrailing?*/,
          false /*storeSignSeparate?*/);
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol4CopayIndMaxOon", beginPol4CopayIndMaxOon, POL_4_COPAY_IND_MAX_OON_LEN);
    }
  }
  /**
   * refreshPol4CopayIndMaxOon is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshPol4CopayIndMaxOon() throws CFException {
    try {
      return (getDecimalNumber(
          beginPol4CopayIndMaxOon,
          POL_4_COPAY_IND_MAX_OON_LEN,
          POL_4_COPAY_IND_MAX_OON_SCALE,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol4CopayIndMaxOon", beginPol4CopayIndMaxOon, POL_4_COPAY_IND_MAX_OON_LEN);
    }
  }

  int localPol4CopayIndMaxT1Counter = -1;

  public boolean isPol4CopayIndMaxT1Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4CopayIndMaxT1Counter != sharedCounter;
    localPol4CopayIndMaxT1Counter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4CopayIndMaxT1
   *
   * @return pol4CopayIndMaxT1
   */
  public char[] getPol4CopayIndMaxT1String() {
    return getCharArray(beginPol4CopayIndMaxT1, POL_4_COPAY_IND_MAX_T_1_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4CopayIndMaxT1IsNumeric() {
    return isNumeric(
        beginPol4CopayIndMaxT1,
        beginPol4CopayIndMaxT1 + POL_4_COPAY_IND_MAX_T_1_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_COPAY_IND_MAX_T_1_LEN = 9;
  protected static final int POL_4_COPAY_IND_MAX_T_1_SCALE = 2;

  protected BigDecimal checkPol4CopayIndMaxT1MaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 9 /*precision*/);
  }

  /** serializePol4CopayIndMaxT1 */
  protected void serializePol4CopayIndMaxT1(BigDecimal pol4CopayIndMaxT1) {
    putNumber(
        beginPol4CopayIndMaxT1,
        pol4CopayIndMaxT1,
        POL_4_COPAY_IND_MAX_T_1_LEN,
        POL_4_COPAY_IND_MAX_T_1_SCALE,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4CopayIndMaxT1Counter = shareString.getSerializedField().getModifiedCounter();
  }

  /** serializePol4CopayIndMaxT1 */
  protected BigDecimal serializePol4CopayIndMaxT1(char[] value) throws CFException {
    if (value.length < 9) value = pad(9, value, ' ', RIGHT_PAD);
    replaceValue(padNumber(9, value, false /*isSigned?*/), beginPol4CopayIndMaxT1, 9);
    localPol4CopayIndMaxT1Counter = shareString.getSerializedField().getModifiedCounter();
    try {
      return convertString2Decimal(
          value,
          POL_4_COPAY_IND_MAX_T_1_LEN,
          POL_4_COPAY_IND_MAX_T_1_SCALE,
          false /*isSigned?*/,
          true /*signTrailing?*/,
          false /*storeSignSeparate?*/);
    } catch (Exception ex) {
      throw getSoc7ABend("pol4CopayIndMaxT1", beginPol4CopayIndMaxT1, POL_4_COPAY_IND_MAX_T_1_LEN);
    }
  }
  /**
   * refreshPol4CopayIndMaxT1 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshPol4CopayIndMaxT1() throws CFException {
    try {
      return (getDecimalNumber(
          beginPol4CopayIndMaxT1,
          POL_4_COPAY_IND_MAX_T_1_LEN,
          POL_4_COPAY_IND_MAX_T_1_SCALE,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("pol4CopayIndMaxT1", beginPol4CopayIndMaxT1, POL_4_COPAY_IND_MAX_T_1_LEN);
    }
  }

  int localPol4CopayFamMaxInnCounter = -1;

  public boolean isPol4CopayFamMaxInnModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4CopayFamMaxInnCounter != sharedCounter;
    localPol4CopayFamMaxInnCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4CopayFamMaxInn
   *
   * @return pol4CopayFamMaxInn
   */
  public char[] getPol4CopayFamMaxInnString() {
    return getCharArray(beginPol4CopayFamMaxInn, POL_4_COPAY_FAM_MAX_INN_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4CopayFamMaxInnIsNumeric() {
    return isNumeric(
        beginPol4CopayFamMaxInn,
        beginPol4CopayFamMaxInn + POL_4_COPAY_FAM_MAX_INN_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_COPAY_FAM_MAX_INN_LEN = 9;
  protected static final int POL_4_COPAY_FAM_MAX_INN_SCALE = 2;

  protected BigDecimal checkPol4CopayFamMaxInnMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 9 /*precision*/);
  }

  /** serializePol4CopayFamMaxInn */
  protected void serializePol4CopayFamMaxInn(BigDecimal pol4CopayFamMaxInn) {
    putNumber(
        beginPol4CopayFamMaxInn,
        pol4CopayFamMaxInn,
        POL_4_COPAY_FAM_MAX_INN_LEN,
        POL_4_COPAY_FAM_MAX_INN_SCALE,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4CopayFamMaxInnCounter = shareString.getSerializedField().getModifiedCounter();
  }

  /** serializePol4CopayFamMaxInn */
  protected BigDecimal serializePol4CopayFamMaxInn(char[] value) throws CFException {
    if (value.length < 9) value = pad(9, value, ' ', RIGHT_PAD);
    replaceValue(padNumber(9, value, false /*isSigned?*/), beginPol4CopayFamMaxInn, 9);
    localPol4CopayFamMaxInnCounter = shareString.getSerializedField().getModifiedCounter();
    try {
      return convertString2Decimal(
          value,
          POL_4_COPAY_FAM_MAX_INN_LEN,
          POL_4_COPAY_FAM_MAX_INN_SCALE,
          false /*isSigned?*/,
          true /*signTrailing?*/,
          false /*storeSignSeparate?*/);
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol4CopayFamMaxInn", beginPol4CopayFamMaxInn, POL_4_COPAY_FAM_MAX_INN_LEN);
    }
  }
  /**
   * refreshPol4CopayFamMaxInn is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshPol4CopayFamMaxInn() throws CFException {
    try {
      return (getDecimalNumber(
          beginPol4CopayFamMaxInn,
          POL_4_COPAY_FAM_MAX_INN_LEN,
          POL_4_COPAY_FAM_MAX_INN_SCALE,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol4CopayFamMaxInn", beginPol4CopayFamMaxInn, POL_4_COPAY_FAM_MAX_INN_LEN);
    }
  }

  int localPol4CopayFamMaxOonCounter = -1;

  public boolean isPol4CopayFamMaxOonModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4CopayFamMaxOonCounter != sharedCounter;
    localPol4CopayFamMaxOonCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4CopayFamMaxOon
   *
   * @return pol4CopayFamMaxOon
   */
  public char[] getPol4CopayFamMaxOonString() {
    return getCharArray(beginPol4CopayFamMaxOon, POL_4_COPAY_FAM_MAX_OON_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4CopayFamMaxOonIsNumeric() {
    return isNumeric(
        beginPol4CopayFamMaxOon,
        beginPol4CopayFamMaxOon + POL_4_COPAY_FAM_MAX_OON_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_COPAY_FAM_MAX_OON_LEN = 9;
  protected static final int POL_4_COPAY_FAM_MAX_OON_SCALE = 2;

  protected BigDecimal checkPol4CopayFamMaxOonMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 9 /*precision*/);
  }

  /** serializePol4CopayFamMaxOon */
  protected void serializePol4CopayFamMaxOon(BigDecimal pol4CopayFamMaxOon) {
    putNumber(
        beginPol4CopayFamMaxOon,
        pol4CopayFamMaxOon,
        POL_4_COPAY_FAM_MAX_OON_LEN,
        POL_4_COPAY_FAM_MAX_OON_SCALE,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4CopayFamMaxOonCounter = shareString.getSerializedField().getModifiedCounter();
  }

  /** serializePol4CopayFamMaxOon */
  protected BigDecimal serializePol4CopayFamMaxOon(char[] value) throws CFException {
    if (value.length < 9) value = pad(9, value, ' ', RIGHT_PAD);
    replaceValue(padNumber(9, value, false /*isSigned?*/), beginPol4CopayFamMaxOon, 9);
    localPol4CopayFamMaxOonCounter = shareString.getSerializedField().getModifiedCounter();
    try {
      return convertString2Decimal(
          value,
          POL_4_COPAY_FAM_MAX_OON_LEN,
          POL_4_COPAY_FAM_MAX_OON_SCALE,
          false /*isSigned?*/,
          true /*signTrailing?*/,
          false /*storeSignSeparate?*/);
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol4CopayFamMaxOon", beginPol4CopayFamMaxOon, POL_4_COPAY_FAM_MAX_OON_LEN);
    }
  }
  /**
   * refreshPol4CopayFamMaxOon is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshPol4CopayFamMaxOon() throws CFException {
    try {
      return (getDecimalNumber(
          beginPol4CopayFamMaxOon,
          POL_4_COPAY_FAM_MAX_OON_LEN,
          POL_4_COPAY_FAM_MAX_OON_SCALE,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol4CopayFamMaxOon", beginPol4CopayFamMaxOon, POL_4_COPAY_FAM_MAX_OON_LEN);
    }
  }

  int localPol4CopayFamMaxT1Counter = -1;

  public boolean isPol4CopayFamMaxT1Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4CopayFamMaxT1Counter != sharedCounter;
    localPol4CopayFamMaxT1Counter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4CopayFamMaxT1
   *
   * @return pol4CopayFamMaxT1
   */
  public char[] getPol4CopayFamMaxT1String() {
    return getCharArray(beginPol4CopayFamMaxT1, POL_4_COPAY_FAM_MAX_T_1_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4CopayFamMaxT1IsNumeric() {
    return isNumeric(
        beginPol4CopayFamMaxT1,
        beginPol4CopayFamMaxT1 + POL_4_COPAY_FAM_MAX_T_1_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_COPAY_FAM_MAX_T_1_LEN = 9;
  protected static final int POL_4_COPAY_FAM_MAX_T_1_SCALE = 2;

  protected BigDecimal checkPol4CopayFamMaxT1MaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 9 /*precision*/);
  }

  /** serializePol4CopayFamMaxT1 */
  protected void serializePol4CopayFamMaxT1(BigDecimal pol4CopayFamMaxT1) {
    putNumber(
        beginPol4CopayFamMaxT1,
        pol4CopayFamMaxT1,
        POL_4_COPAY_FAM_MAX_T_1_LEN,
        POL_4_COPAY_FAM_MAX_T_1_SCALE,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4CopayFamMaxT1Counter = shareString.getSerializedField().getModifiedCounter();
  }

  /** serializePol4CopayFamMaxT1 */
  protected BigDecimal serializePol4CopayFamMaxT1(char[] value) throws CFException {
    if (value.length < 9) value = pad(9, value, ' ', RIGHT_PAD);
    replaceValue(padNumber(9, value, false /*isSigned?*/), beginPol4CopayFamMaxT1, 9);
    localPol4CopayFamMaxT1Counter = shareString.getSerializedField().getModifiedCounter();
    try {
      return convertString2Decimal(
          value,
          POL_4_COPAY_FAM_MAX_T_1_LEN,
          POL_4_COPAY_FAM_MAX_T_1_SCALE,
          false /*isSigned?*/,
          true /*signTrailing?*/,
          false /*storeSignSeparate?*/);
    } catch (Exception ex) {
      throw getSoc7ABend("pol4CopayFamMaxT1", beginPol4CopayFamMaxT1, POL_4_COPAY_FAM_MAX_T_1_LEN);
    }
  }
  /**
   * refreshPol4CopayFamMaxT1 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshPol4CopayFamMaxT1() throws CFException {
    try {
      return (getDecimalNumber(
          beginPol4CopayFamMaxT1,
          POL_4_COPAY_FAM_MAX_T_1_LEN,
          POL_4_COPAY_FAM_MAX_T_1_SCALE,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("pol4CopayFamMaxT1", beginPol4CopayFamMaxT1, POL_4_COPAY_FAM_MAX_T_1_LEN);
    }
  }

  int localPol4CrossApplyCopayIndCounter = -1;

  public boolean isPol4CrossApplyCopayIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4CrossApplyCopayIndCounter != sharedCounter;
    localPol4CrossApplyCopayIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_CROSS_APPLY_COPAY_IND_LEN = 1;
  /** serialize this Pol4CrossApplyCopayInd */
  protected void serializePol4CrossApplyCopayInd(char[] pol4CrossApplyCopayInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4CrossApplyCopayInd,
        0,
        getStringValue(),
        beginPol4CrossApplyCopayInd,
        POL_4_CROSS_APPLY_COPAY_IND_LEN);
    localPol4CrossApplyCopayIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4CrossApplyCopayIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4CrossApplyCopayInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4CrossApplyCopayInd() {
    return (substring(
        getStringValue(),
        beginPol4CrossApplyCopayInd,
        beginPol4CrossApplyCopayInd + POL_4_CROSS_APPLY_COPAY_IND_LEN));
  }

  int localPol4NonEmbMaxCopayCounter = -1;

  public boolean isPol4NonEmbMaxCopayModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4NonEmbMaxCopayCounter != sharedCounter;
    localPol4NonEmbMaxCopayCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_NON_EMB_MAX_COPAY_LEN = 1;
  /** serialize this Pol4NonEmbMaxCopay */
  protected void serializePol4NonEmbMaxCopay(char[] pol4NonEmbMaxCopay) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4NonEmbMaxCopay,
        0,
        getStringValue(),
        beginPol4NonEmbMaxCopay,
        POL_4_NON_EMB_MAX_COPAY_LEN);
    localPol4NonEmbMaxCopayCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4NonEmbMaxCopayConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4NonEmbMaxCopay is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol4NonEmbMaxCopay() {
    return (substring(
        getStringValue(),
        beginPol4NonEmbMaxCopay,
        beginPol4NonEmbMaxCopay + POL_4_NON_EMB_MAX_COPAY_LEN));
  }

  int localPol4NonEmbMaxCoreCounter = -1;

  public boolean isPol4NonEmbMaxCoreModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4NonEmbMaxCoreCounter != sharedCounter;
    localPol4NonEmbMaxCoreCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_NON_EMB_MAX_CORE_LEN = 1;
  /** serialize this Pol4NonEmbMaxCore */
  protected void serializePol4NonEmbMaxCore(char[] pol4NonEmbMaxCore) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4NonEmbMaxCore, 0, getStringValue(), beginPol4NonEmbMaxCore, POL_4_NON_EMB_MAX_CORE_LEN);
    localPol4NonEmbMaxCoreCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4NonEmbMaxCoreConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4NonEmbMaxCore is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol4NonEmbMaxCore() {
    return (substring(
        getStringValue(),
        beginPol4NonEmbMaxCore,
        beginPol4NonEmbMaxCore + POL_4_NON_EMB_MAX_CORE_LEN));
  }

  int localPol4NonEmbMaxDedCounter = -1;

  public boolean isPol4NonEmbMaxDedModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4NonEmbMaxDedCounter != sharedCounter;
    localPol4NonEmbMaxDedCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_NON_EMB_MAX_DED_LEN = 1;
  /** serialize this Pol4NonEmbMaxDed */
  protected void serializePol4NonEmbMaxDed(char[] pol4NonEmbMaxDed) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4NonEmbMaxDed, 0, getStringValue(), beginPol4NonEmbMaxDed, POL_4_NON_EMB_MAX_DED_LEN);
    localPol4NonEmbMaxDedCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4NonEmbMaxDedConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4NonEmbMaxDed is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol4NonEmbMaxDed() {
    return (substring(
        getStringValue(),
        beginPol4NonEmbMaxDed,
        beginPol4NonEmbMaxDed + POL_4_NON_EMB_MAX_DED_LEN));
  }

  int localPol4NonEmbMaxOopCounter = -1;

  public boolean isPol4NonEmbMaxOopModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4NonEmbMaxOopCounter != sharedCounter;
    localPol4NonEmbMaxOopCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_NON_EMB_MAX_OOP_LEN = 1;
  /** serialize this Pol4NonEmbMaxOop */
  protected void serializePol4NonEmbMaxOop(char[] pol4NonEmbMaxOop) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4NonEmbMaxOop, 0, getStringValue(), beginPol4NonEmbMaxOop, POL_4_NON_EMB_MAX_OOP_LEN);
    localPol4NonEmbMaxOopCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4NonEmbMaxOopConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4NonEmbMaxOop is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol4NonEmbMaxOop() {
    return (substring(
        getStringValue(),
        beginPol4NonEmbMaxOop,
        beginPol4NonEmbMaxOop + POL_4_NON_EMB_MAX_OOP_LEN));
  }

  int localPol4CoreSlryFamMultFctCounter = -1;

  public boolean isPol4CoreSlryFamMultFctModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4CoreSlryFamMultFctCounter != sharedCounter;
    localPol4CoreSlryFamMultFctCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4CoreSlryFamMultFct
   *
   * @return pol4CoreSlryFamMultFct
   */
  public char[] getPol4CoreSlryFamMultFctString() {
    return getCharArray(beginPol4CoreSlryFamMultFct, POL_4_CORE_SLRY_FAM_MULT_FCT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4CoreSlryFamMultFctIsNumeric() {
    return isNumeric(
        beginPol4CoreSlryFamMultFct,
        beginPol4CoreSlryFamMultFct + POL_4_CORE_SLRY_FAM_MULT_FCT_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_CORE_SLRY_FAM_MULT_FCT_LEN = 2;
  protected static final int POL_4_CORE_SLRY_FAM_MULT_FCT_SCALE = 1;

  protected BigDecimal checkPol4CoreSlryFamMultFctMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 1 /*scale*/, 2 /*precision*/);
  }

  /** serializePol4CoreSlryFamMultFct */
  protected void serializePol4CoreSlryFamMultFct(BigDecimal pol4CoreSlryFamMultFct) {
    putNumber(
        beginPol4CoreSlryFamMultFct,
        pol4CoreSlryFamMultFct,
        POL_4_CORE_SLRY_FAM_MULT_FCT_LEN,
        POL_4_CORE_SLRY_FAM_MULT_FCT_SCALE,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4CoreSlryFamMultFctCounter = shareString.getSerializedField().getModifiedCounter();
  }

  /** serializePol4CoreSlryFamMultFct */
  protected BigDecimal serializePol4CoreSlryFamMultFct(char[] value) throws CFException {
    if (value.length < 2) value = pad(2, value, ' ', RIGHT_PAD);
    replaceValue(padNumber(2, value, true /*isSigned?*/), beginPol4CoreSlryFamMultFct, 2);
    localPol4CoreSlryFamMultFctCounter = shareString.getSerializedField().getModifiedCounter();
    try {
      return convertString2Decimal(
          value,
          POL_4_CORE_SLRY_FAM_MULT_FCT_LEN,
          POL_4_CORE_SLRY_FAM_MULT_FCT_SCALE,
          true /*isSigned?*/,
          true /*signTrailing?*/,
          false /*storeSignSeparate?*/);
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol4CoreSlryFamMultFct", beginPol4CoreSlryFamMultFct, POL_4_CORE_SLRY_FAM_MULT_FCT_LEN);
    }
  }
  /**
   * refreshPol4CoreSlryFamMultFct is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public BigDecimal refreshPol4CoreSlryFamMultFct() throws CFException {
    try {
      return (getDecimalNumber(
          beginPol4CoreSlryFamMultFct,
          POL_4_CORE_SLRY_FAM_MULT_FCT_LEN,
          POL_4_CORE_SLRY_FAM_MULT_FCT_SCALE,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol4CoreSlryFamMultFct", beginPol4CoreSlryFamMultFct, POL_4_CORE_SLRY_FAM_MULT_FCT_LEN);
    }
  }

  int localPol4CoreSlryFamTypCdCounter = -1;

  public boolean isPol4CoreSlryFamTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4CoreSlryFamTypCdCounter != sharedCounter;
    localPol4CoreSlryFamTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_CORE_SLRY_FAM_TYP_CD_LEN = 1;
  /** serialize this Pol4CoreSlryFamTypCd */
  protected void serializePol4CoreSlryFamTypCd(char[] pol4CoreSlryFamTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4CoreSlryFamTypCd,
        0,
        getStringValue(),
        beginPol4CoreSlryFamTypCd,
        POL_4_CORE_SLRY_FAM_TYP_CD_LEN);
    localPol4CoreSlryFamTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4CoreSlryFamTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4CoreSlryFamTypCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4CoreSlryFamTypCd() {
    return (substring(
        getStringValue(),
        beginPol4CoreSlryFamTypCd,
        beginPol4CoreSlryFamTypCd + POL_4_CORE_SLRY_FAM_TYP_CD_LEN));
  }

  int localPol4CoreSlryIndvTypCdCounter = -1;

  public boolean isPol4CoreSlryIndvTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4CoreSlryIndvTypCdCounter != sharedCounter;
    localPol4CoreSlryIndvTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_CORE_SLRY_INDV_TYP_CD_LEN = 1;
  /** serialize this Pol4CoreSlryIndvTypCd */
  protected void serializePol4CoreSlryIndvTypCd(char[] pol4CoreSlryIndvTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4CoreSlryIndvTypCd,
        0,
        getStringValue(),
        beginPol4CoreSlryIndvTypCd,
        POL_4_CORE_SLRY_INDV_TYP_CD_LEN);
    localPol4CoreSlryIndvTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4CoreSlryIndvTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4CoreSlryIndvTypCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4CoreSlryIndvTypCd() {
    return (substring(
        getStringValue(),
        beginPol4CoreSlryIndvTypCd,
        beginPol4CoreSlryIndvTypCd + POL_4_CORE_SLRY_INDV_TYP_CD_LEN));
  }

  int localPol4CoreInNtwkEePls1AmtCounter = -1;

  public boolean isPol4CoreInNtwkEePls1AmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4CoreInNtwkEePls1AmtCounter != sharedCounter;
    localPol4CoreInNtwkEePls1AmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4CoreInNtwkEePls1Amt
   *
   * @return pol4CoreInNtwkEePls1Amt
   */
  public char[] getPol4CoreInNtwkEePls1AmtString() {
    return getCharArray(beginPol4CoreInNtwkEePls1Amt, POL_4_CORE_IN_NTWK_EE_PLS_1_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4CoreInNtwkEePls1AmtIsNumeric() {
    return isNumeric(
        beginPol4CoreInNtwkEePls1Amt,
        beginPol4CoreInNtwkEePls1Amt + POL_4_CORE_IN_NTWK_EE_PLS_1_AMT_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_CORE_IN_NTWK_EE_PLS_1_AMT_LEN = 5;
  /** serializePol4CoreInNtwkEePls1Amt */
  protected void serializePol4CoreInNtwkEePls1Amt(int pol4CoreInNtwkEePls1Amt) {
    putNumber(
        beginPol4CoreInNtwkEePls1Amt,
        pol4CoreInNtwkEePls1Amt,
        POL_4_CORE_IN_NTWK_EE_PLS_1_AMT_LEN,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4CoreInNtwkEePls1AmtCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol4CoreInNtwkEePls1Amt */
  protected int serializePol4CoreInNtwkEePls1Amt(char[] value) {
    int pol4CoreInNtwkEePls1Amt;
    if (value.length > 0 && value.length != 5) value = new String(value).trim().toCharArray();
    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
    else if (value.length > 5) value = substring(value, 0, 5);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol4CoreInNtwkEePls1Amt =
        (int)
            convertString2Number(
                value, true /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(5, value, true /*isSigned?*/), beginPol4CoreInNtwkEePls1Amt, 5);
    localPol4CoreInNtwkEePls1AmtCounter = shareString.getSerializedField().getModifiedCounter();
    return pol4CoreInNtwkEePls1Amt;
  }

  protected int checkPol4CoreInNtwkEePls1AmtMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_100K /*limit*/, true /*isSigned*/);
  }
  /**
   * refreshPol4CoreInNtwkEePls1Amt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol4CoreInNtwkEePls1Amt() throws CFException {
    try {
      return (getIntNumber(
          beginPol4CoreInNtwkEePls1Amt,
          POL_4_CORE_IN_NTWK_EE_PLS_1_AMT_LEN,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol4CoreInNtwkEePls1Amt",
          beginPol4CoreInNtwkEePls1Amt,
          POL_4_CORE_IN_NTWK_EE_PLS_1_AMT_LEN);
    }
  }

  int localPol4CoreInNtwkEeSpoAmtCounter = -1;

  public boolean isPol4CoreInNtwkEeSpoAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4CoreInNtwkEeSpoAmtCounter != sharedCounter;
    localPol4CoreInNtwkEeSpoAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4CoreInNtwkEeSpoAmt
   *
   * @return pol4CoreInNtwkEeSpoAmt
   */
  public char[] getPol4CoreInNtwkEeSpoAmtString() {
    return getCharArray(beginPol4CoreInNtwkEeSpoAmt, POL_4_CORE_IN_NTWK_EE_SPO_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4CoreInNtwkEeSpoAmtIsNumeric() {
    return isNumeric(
        beginPol4CoreInNtwkEeSpoAmt,
        beginPol4CoreInNtwkEeSpoAmt + POL_4_CORE_IN_NTWK_EE_SPO_AMT_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_CORE_IN_NTWK_EE_SPO_AMT_LEN = 5;
  /** serializePol4CoreInNtwkEeSpoAmt */
  protected void serializePol4CoreInNtwkEeSpoAmt(int pol4CoreInNtwkEeSpoAmt) {
    putNumber(
        beginPol4CoreInNtwkEeSpoAmt,
        pol4CoreInNtwkEeSpoAmt,
        POL_4_CORE_IN_NTWK_EE_SPO_AMT_LEN,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4CoreInNtwkEeSpoAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol4CoreInNtwkEeSpoAmt */
  protected int serializePol4CoreInNtwkEeSpoAmt(char[] value) {
    int pol4CoreInNtwkEeSpoAmt;
    if (value.length > 0 && value.length != 5) value = new String(value).trim().toCharArray();
    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
    else if (value.length > 5) value = substring(value, 0, 5);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol4CoreInNtwkEeSpoAmt =
        (int)
            convertString2Number(
                value, true /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(5, value, true /*isSigned?*/), beginPol4CoreInNtwkEeSpoAmt, 5);
    localPol4CoreInNtwkEeSpoAmtCounter = shareString.getSerializedField().getModifiedCounter();
    return pol4CoreInNtwkEeSpoAmt;
  }

  protected int checkPol4CoreInNtwkEeSpoAmtMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_100K /*limit*/, true /*isSigned*/);
  }
  /**
   * refreshPol4CoreInNtwkEeSpoAmt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol4CoreInNtwkEeSpoAmt() throws CFException {
    try {
      return (getIntNumber(
          beginPol4CoreInNtwkEeSpoAmt,
          POL_4_CORE_IN_NTWK_EE_SPO_AMT_LEN,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol4CoreInNtwkEeSpoAmt", beginPol4CoreInNtwkEeSpoAmt, POL_4_CORE_IN_NTWK_EE_SPO_AMT_LEN);
    }
  }

  int localPol4CoreInNtwkEeChrgAmtCounter = -1;

  public boolean isPol4CoreInNtwkEeChrgAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4CoreInNtwkEeChrgAmtCounter != sharedCounter;
    localPol4CoreInNtwkEeChrgAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4CoreInNtwkEeChrgAmt
   *
   * @return pol4CoreInNtwkEeChrgAmt
   */
  public char[] getPol4CoreInNtwkEeChrgAmtString() {
    return getCharArray(beginPol4CoreInNtwkEeChrgAmt, POL_4_CORE_IN_NTWK_EE_CHRG_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4CoreInNtwkEeChrgAmtIsNumeric() {
    return isNumeric(
        beginPol4CoreInNtwkEeChrgAmt,
        beginPol4CoreInNtwkEeChrgAmt + POL_4_CORE_IN_NTWK_EE_CHRG_AMT_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_CORE_IN_NTWK_EE_CHRG_AMT_LEN = 5;
  /** serializePol4CoreInNtwkEeChrgAmt */
  protected void serializePol4CoreInNtwkEeChrgAmt(int pol4CoreInNtwkEeChrgAmt) {
    putNumber(
        beginPol4CoreInNtwkEeChrgAmt,
        pol4CoreInNtwkEeChrgAmt,
        POL_4_CORE_IN_NTWK_EE_CHRG_AMT_LEN,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4CoreInNtwkEeChrgAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol4CoreInNtwkEeChrgAmt */
  protected int serializePol4CoreInNtwkEeChrgAmt(char[] value) {
    int pol4CoreInNtwkEeChrgAmt;
    if (value.length > 0 && value.length != 5) value = new String(value).trim().toCharArray();
    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
    else if (value.length > 5) value = substring(value, 0, 5);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol4CoreInNtwkEeChrgAmt =
        (int)
            convertString2Number(
                value, true /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(5, value, true /*isSigned?*/), beginPol4CoreInNtwkEeChrgAmt, 5);
    localPol4CoreInNtwkEeChrgAmtCounter = shareString.getSerializedField().getModifiedCounter();
    return pol4CoreInNtwkEeChrgAmt;
  }

  protected int checkPol4CoreInNtwkEeChrgAmtMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_100K /*limit*/, true /*isSigned*/);
  }
  /**
   * refreshPol4CoreInNtwkEeChrgAmt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol4CoreInNtwkEeChrgAmt() throws CFException {
    try {
      return (getIntNumber(
          beginPol4CoreInNtwkEeChrgAmt,
          POL_4_CORE_IN_NTWK_EE_CHRG_AMT_LEN,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol4CoreInNtwkEeChrgAmt",
          beginPol4CoreInNtwkEeChrgAmt,
          POL_4_CORE_IN_NTWK_EE_CHRG_AMT_LEN);
    }
  }

  int localPol4CoreCombEePls1AmtCounter = -1;

  public boolean isPol4CoreCombEePls1AmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4CoreCombEePls1AmtCounter != sharedCounter;
    localPol4CoreCombEePls1AmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4CoreCombEePls1Amt
   *
   * @return pol4CoreCombEePls1Amt
   */
  public char[] getPol4CoreCombEePls1AmtString() {
    return getCharArray(beginPol4CoreCombEePls1Amt, POL_4_CORE_COMB_EE_PLS_1_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4CoreCombEePls1AmtIsNumeric() {
    return isNumeric(
        beginPol4CoreCombEePls1Amt,
        beginPol4CoreCombEePls1Amt + POL_4_CORE_COMB_EE_PLS_1_AMT_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_CORE_COMB_EE_PLS_1_AMT_LEN = 5;
  /** serializePol4CoreCombEePls1Amt */
  protected void serializePol4CoreCombEePls1Amt(int pol4CoreCombEePls1Amt) {
    putNumber(
        beginPol4CoreCombEePls1Amt,
        pol4CoreCombEePls1Amt,
        POL_4_CORE_COMB_EE_PLS_1_AMT_LEN,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4CoreCombEePls1AmtCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol4CoreCombEePls1Amt */
  protected int serializePol4CoreCombEePls1Amt(char[] value) {
    int pol4CoreCombEePls1Amt;
    if (value.length > 0 && value.length != 5) value = new String(value).trim().toCharArray();
    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
    else if (value.length > 5) value = substring(value, 0, 5);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol4CoreCombEePls1Amt =
        (int)
            convertString2Number(
                value, true /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(5, value, true /*isSigned?*/), beginPol4CoreCombEePls1Amt, 5);
    localPol4CoreCombEePls1AmtCounter = shareString.getSerializedField().getModifiedCounter();
    return pol4CoreCombEePls1Amt;
  }

  protected int checkPol4CoreCombEePls1AmtMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_100K /*limit*/, true /*isSigned*/);
  }
  /**
   * refreshPol4CoreCombEePls1Amt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol4CoreCombEePls1Amt() throws CFException {
    try {
      return (getIntNumber(
          beginPol4CoreCombEePls1Amt,
          POL_4_CORE_COMB_EE_PLS_1_AMT_LEN,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol4CoreCombEePls1Amt", beginPol4CoreCombEePls1Amt, POL_4_CORE_COMB_EE_PLS_1_AMT_LEN);
    }
  }

  int localPol4CoreCombEeSpoAmtCounter = -1;

  public boolean isPol4CoreCombEeSpoAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4CoreCombEeSpoAmtCounter != sharedCounter;
    localPol4CoreCombEeSpoAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4CoreCombEeSpoAmt
   *
   * @return pol4CoreCombEeSpoAmt
   */
  public char[] getPol4CoreCombEeSpoAmtString() {
    return getCharArray(beginPol4CoreCombEeSpoAmt, POL_4_CORE_COMB_EE_SPO_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4CoreCombEeSpoAmtIsNumeric() {
    return isNumeric(
        beginPol4CoreCombEeSpoAmt,
        beginPol4CoreCombEeSpoAmt + POL_4_CORE_COMB_EE_SPO_AMT_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_CORE_COMB_EE_SPO_AMT_LEN = 5;
  /** serializePol4CoreCombEeSpoAmt */
  protected void serializePol4CoreCombEeSpoAmt(int pol4CoreCombEeSpoAmt) {
    putNumber(
        beginPol4CoreCombEeSpoAmt,
        pol4CoreCombEeSpoAmt,
        POL_4_CORE_COMB_EE_SPO_AMT_LEN,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4CoreCombEeSpoAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol4CoreCombEeSpoAmt */
  protected int serializePol4CoreCombEeSpoAmt(char[] value) {
    int pol4CoreCombEeSpoAmt;
    if (value.length > 0 && value.length != 5) value = new String(value).trim().toCharArray();
    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
    else if (value.length > 5) value = substring(value, 0, 5);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol4CoreCombEeSpoAmt =
        (int)
            convertString2Number(
                value, true /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(5, value, true /*isSigned?*/), beginPol4CoreCombEeSpoAmt, 5);
    localPol4CoreCombEeSpoAmtCounter = shareString.getSerializedField().getModifiedCounter();
    return pol4CoreCombEeSpoAmt;
  }

  protected int checkPol4CoreCombEeSpoAmtMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_100K /*limit*/, true /*isSigned*/);
  }
  /**
   * refreshPol4CoreCombEeSpoAmt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol4CoreCombEeSpoAmt() throws CFException {
    try {
      return (getIntNumber(
          beginPol4CoreCombEeSpoAmt,
          POL_4_CORE_COMB_EE_SPO_AMT_LEN,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol4CoreCombEeSpoAmt", beginPol4CoreCombEeSpoAmt, POL_4_CORE_COMB_EE_SPO_AMT_LEN);
    }
  }

  int localPol4CoreCombEeChrgAmtCounter = -1;

  public boolean isPol4CoreCombEeChrgAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4CoreCombEeChrgAmtCounter != sharedCounter;
    localPol4CoreCombEeChrgAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4CoreCombEeChrgAmt
   *
   * @return pol4CoreCombEeChrgAmt
   */
  public char[] getPol4CoreCombEeChrgAmtString() {
    return getCharArray(beginPol4CoreCombEeChrgAmt, POL_4_CORE_COMB_EE_CHRG_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4CoreCombEeChrgAmtIsNumeric() {
    return isNumeric(
        beginPol4CoreCombEeChrgAmt,
        beginPol4CoreCombEeChrgAmt + POL_4_CORE_COMB_EE_CHRG_AMT_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_CORE_COMB_EE_CHRG_AMT_LEN = 5;
  /** serializePol4CoreCombEeChrgAmt */
  protected void serializePol4CoreCombEeChrgAmt(int pol4CoreCombEeChrgAmt) {
    putNumber(
        beginPol4CoreCombEeChrgAmt,
        pol4CoreCombEeChrgAmt,
        POL_4_CORE_COMB_EE_CHRG_AMT_LEN,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4CoreCombEeChrgAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol4CoreCombEeChrgAmt */
  protected int serializePol4CoreCombEeChrgAmt(char[] value) {
    int pol4CoreCombEeChrgAmt;
    if (value.length > 0 && value.length != 5) value = new String(value).trim().toCharArray();
    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
    else if (value.length > 5) value = substring(value, 0, 5);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol4CoreCombEeChrgAmt =
        (int)
            convertString2Number(
                value, true /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(5, value, true /*isSigned?*/), beginPol4CoreCombEeChrgAmt, 5);
    localPol4CoreCombEeChrgAmtCounter = shareString.getSerializedField().getModifiedCounter();
    return pol4CoreCombEeChrgAmt;
  }

  protected int checkPol4CoreCombEeChrgAmtMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_100K /*limit*/, true /*isSigned*/);
  }
  /**
   * refreshPol4CoreCombEeChrgAmt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol4CoreCombEeChrgAmt() throws CFException {
    try {
      return (getIntNumber(
          beginPol4CoreCombEeChrgAmt,
          POL_4_CORE_COMB_EE_CHRG_AMT_LEN,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol4CoreCombEeChrgAmt", beginPol4CoreCombEeChrgAmt, POL_4_CORE_COMB_EE_CHRG_AMT_LEN);
    }
  }

  int localPol4RetLmtSrvcCdCounter = -1;

  public boolean isPol4RetLmtSrvcCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetLmtSrvcCdCounter != sharedCounter;
    localPol4RetLmtSrvcCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_LMT_SRVC_CD_LEN = 1;
  /** serialize this Pol4RetLmtSrvcCd */
  protected void serializePol4RetLmtSrvcCd(char[] pol4RetLmtSrvcCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetLmtSrvcCd, 0, getStringValue(), beginPol4RetLmtSrvcCd, POL_4_RET_LMT_SRVC_CD_LEN);
    localPol4RetLmtSrvcCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetLmtSrvcCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4RetLmtSrvcCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetLmtSrvcCd() {
    return (substring(
        getStringValue(),
        beginPol4RetLmtSrvcCd,
        beginPol4RetLmtSrvcCd + POL_4_RET_LMT_SRVC_CD_LEN));
  }

  int localPol4NptRulePkgIdCounter = -1;

  public boolean isPol4NptRulePkgIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4NptRulePkgIdCounter != sharedCounter;
    localPol4NptRulePkgIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_NPT_RULE_PKG_ID_LEN = 6;
  /** serialize this Pol4NptRulePkgId */
  protected void serializePol4NptRulePkgId(char[] pol4NptRulePkgId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4NptRulePkgId, 0, getStringValue(), beginPol4NptRulePkgId, POL_4_NPT_RULE_PKG_ID_LEN);
    localPol4NptRulePkgIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4NptRulePkgIdConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPol4NptRulePkgId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol4NptRulePkgId() {
    return (substring(
        getStringValue(),
        beginPol4NptRulePkgId,
        beginPol4NptRulePkgId + POL_4_NPT_RULE_PKG_ID_LEN));
  }

  int localPol4RetDualOopNbrIndCounter = -1;

  public boolean isPol4RetDualOopNbrIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetDualOopNbrIndCounter != sharedCounter;
    localPol4RetDualOopNbrIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_DUAL_OOP_NBR_IND_LEN = 1;
  /** serialize this Pol4RetDualOopNbrInd */
  protected void serializePol4RetDualOopNbrInd(char[] pol4RetDualOopNbrInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetDualOopNbrInd,
        0,
        getStringValue(),
        beginPol4RetDualOopNbrInd,
        POL_4_RET_DUAL_OOP_NBR_IND_LEN);
    localPol4RetDualOopNbrIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetDualOopNbrIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4RetDualOopNbrInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetDualOopNbrInd() {
    return (substring(
        getStringValue(),
        beginPol4RetDualOopNbrInd,
        beginPol4RetDualOopNbrInd + POL_4_RET_DUAL_OOP_NBR_IND_LEN));
  }

  int localPol4RetRhabCombPtLmtCdCounter = -1;

  public boolean isPol4RetRhabCombPtLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetRhabCombPtLmtCdCounter != sharedCounter;
    localPol4RetRhabCombPtLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_RHAB_COMB_PT_LMT_CD_LEN = 2;
  /** serialize this Pol4RetRhabCombPtLmtCd */
  protected void serializePol4RetRhabCombPtLmtCd(char[] pol4RetRhabCombPtLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetRhabCombPtLmtCd,
        0,
        getStringValue(),
        beginPol4RetRhabCombPtLmtCd,
        POL_4_RET_RHAB_COMB_PT_LMT_CD_LEN);
    localPol4RetRhabCombPtLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetRhabCombPtLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol4RetRhabCombPtLmtCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetRhabCombPtLmtCd() {
    return (substring(
        getStringValue(),
        beginPol4RetRhabCombPtLmtCd,
        beginPol4RetRhabCombPtLmtCd + POL_4_RET_RHAB_COMB_PT_LMT_CD_LEN));
  }

  int localPol4RetRhabCombOtLmtCdCounter = -1;

  public boolean isPol4RetRhabCombOtLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetRhabCombOtLmtCdCounter != sharedCounter;
    localPol4RetRhabCombOtLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_RHAB_COMB_OT_LMT_CD_LEN = 2;
  /** serialize this Pol4RetRhabCombOtLmtCd */
  protected void serializePol4RetRhabCombOtLmtCd(char[] pol4RetRhabCombOtLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetRhabCombOtLmtCd,
        0,
        getStringValue(),
        beginPol4RetRhabCombOtLmtCd,
        POL_4_RET_RHAB_COMB_OT_LMT_CD_LEN);
    localPol4RetRhabCombOtLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetRhabCombOtLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol4RetRhabCombOtLmtCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetRhabCombOtLmtCd() {
    return (substring(
        getStringValue(),
        beginPol4RetRhabCombOtLmtCd,
        beginPol4RetRhabCombOtLmtCd + POL_4_RET_RHAB_COMB_OT_LMT_CD_LEN));
  }

  int localPol4RetRhabCombStLmtCdCounter = -1;

  public boolean isPol4RetRhabCombStLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetRhabCombStLmtCdCounter != sharedCounter;
    localPol4RetRhabCombStLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_RHAB_COMB_ST_LMT_CD_LEN = 2;
  /** serialize this Pol4RetRhabCombStLmtCd */
  protected void serializePol4RetRhabCombStLmtCd(char[] pol4RetRhabCombStLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetRhabCombStLmtCd,
        0,
        getStringValue(),
        beginPol4RetRhabCombStLmtCd,
        POL_4_RET_RHAB_COMB_ST_LMT_CD_LEN);
    localPol4RetRhabCombStLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetRhabCombStLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol4RetRhabCombStLmtCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetRhabCombStLmtCd() {
    return (substring(
        getStringValue(),
        beginPol4RetRhabCombStLmtCd,
        beginPol4RetRhabCombStLmtCd + POL_4_RET_RHAB_COMB_ST_LMT_CD_LEN));
  }

  int localPol4RetRhabCombSmLmtCdCounter = -1;

  public boolean isPol4RetRhabCombSmLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetRhabCombSmLmtCdCounter != sharedCounter;
    localPol4RetRhabCombSmLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_RHAB_COMB_SM_LMT_CD_LEN = 2;
  /** serialize this Pol4RetRhabCombSmLmtCd */
  protected void serializePol4RetRhabCombSmLmtCd(char[] pol4RetRhabCombSmLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetRhabCombSmLmtCd,
        0,
        getStringValue(),
        beginPol4RetRhabCombSmLmtCd,
        POL_4_RET_RHAB_COMB_SM_LMT_CD_LEN);
    localPol4RetRhabCombSmLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetRhabCombSmLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol4RetRhabCombSmLmtCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetRhabCombSmLmtCd() {
    return (substring(
        getStringValue(),
        beginPol4RetRhabCombSmLmtCd,
        beginPol4RetRhabCombSmLmtCd + POL_4_RET_RHAB_COMB_SM_LMT_CD_LEN));
  }

  int localPol4RetRhabCombCiLmtCdCounter = -1;

  public boolean isPol4RetRhabCombCiLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetRhabCombCiLmtCdCounter != sharedCounter;
    localPol4RetRhabCombCiLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_RHAB_COMB_CI_LMT_CD_LEN = 2;
  /** serialize this Pol4RetRhabCombCiLmtCd */
  protected void serializePol4RetRhabCombCiLmtCd(char[] pol4RetRhabCombCiLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetRhabCombCiLmtCd,
        0,
        getStringValue(),
        beginPol4RetRhabCombCiLmtCd,
        POL_4_RET_RHAB_COMB_CI_LMT_CD_LEN);
    localPol4RetRhabCombCiLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetRhabCombCiLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol4RetRhabCombCiLmtCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetRhabCombCiLmtCd() {
    return (substring(
        getStringValue(),
        beginPol4RetRhabCombCiLmtCd,
        beginPol4RetRhabCombCiLmtCd + POL_4_RET_RHAB_COMB_CI_LMT_CD_LEN));
  }

  int localPol4RetRhabCombCtLmtCdCounter = -1;

  public boolean isPol4RetRhabCombCtLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetRhabCombCtLmtCdCounter != sharedCounter;
    localPol4RetRhabCombCtLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_RHAB_COMB_CT_LMT_CD_LEN = 2;
  /** serialize this Pol4RetRhabCombCtLmtCd */
  protected void serializePol4RetRhabCombCtLmtCd(char[] pol4RetRhabCombCtLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetRhabCombCtLmtCd,
        0,
        getStringValue(),
        beginPol4RetRhabCombCtLmtCd,
        POL_4_RET_RHAB_COMB_CT_LMT_CD_LEN);
    localPol4RetRhabCombCtLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetRhabCombCtLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol4RetRhabCombCtLmtCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetRhabCombCtLmtCd() {
    return (substring(
        getStringValue(),
        beginPol4RetRhabCombCtLmtCd,
        beginPol4RetRhabCombCtLmtCd + POL_4_RET_RHAB_COMB_CT_LMT_CD_LEN));
  }

  int localPol4RetRhabCombCrLmtCdCounter = -1;

  public boolean isPol4RetRhabCombCrLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetRhabCombCrLmtCdCounter != sharedCounter;
    localPol4RetRhabCombCrLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_RHAB_COMB_CR_LMT_CD_LEN = 2;
  /** serialize this Pol4RetRhabCombCrLmtCd */
  protected void serializePol4RetRhabCombCrLmtCd(char[] pol4RetRhabCombCrLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetRhabCombCrLmtCd,
        0,
        getStringValue(),
        beginPol4RetRhabCombCrLmtCd,
        POL_4_RET_RHAB_COMB_CR_LMT_CD_LEN);
    localPol4RetRhabCombCrLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetRhabCombCrLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol4RetRhabCombCrLmtCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetRhabCombCrLmtCd() {
    return (substring(
        getStringValue(),
        beginPol4RetRhabCombCrLmtCd,
        beginPol4RetRhabCombCrLmtCd + POL_4_RET_RHAB_COMB_CR_LMT_CD_LEN));
  }

  int localPol4RetRhabCombPrLmtCdCounter = -1;

  public boolean isPol4RetRhabCombPrLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetRhabCombPrLmtCdCounter != sharedCounter;
    localPol4RetRhabCombPrLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_RHAB_COMB_PR_LMT_CD_LEN = 2;
  /** serialize this Pol4RetRhabCombPrLmtCd */
  protected void serializePol4RetRhabCombPrLmtCd(char[] pol4RetRhabCombPrLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetRhabCombPrLmtCd,
        0,
        getStringValue(),
        beginPol4RetRhabCombPrLmtCd,
        POL_4_RET_RHAB_COMB_PR_LMT_CD_LEN);
    localPol4RetRhabCombPrLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetRhabCombPrLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol4RetRhabCombPrLmtCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetRhabCombPrLmtCd() {
    return (substring(
        getStringValue(),
        beginPol4RetRhabCombPrLmtCd,
        beginPol4RetRhabCombPrLmtCd + POL_4_RET_RHAB_COMB_PR_LMT_CD_LEN));
  }

  int localPol4RetRhabCombMtLmtCdCounter = -1;

  public boolean isPol4RetRhabCombMtLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetRhabCombMtLmtCdCounter != sharedCounter;
    localPol4RetRhabCombMtLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_RHAB_COMB_MT_LMT_CD_LEN = 2;
  /** serialize this Pol4RetRhabCombMtLmtCd */
  protected void serializePol4RetRhabCombMtLmtCd(char[] pol4RetRhabCombMtLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetRhabCombMtLmtCd,
        0,
        getStringValue(),
        beginPol4RetRhabCombMtLmtCd,
        POL_4_RET_RHAB_COMB_MT_LMT_CD_LEN);
    localPol4RetRhabCombMtLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetRhabCombMtLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol4RetRhabCombMtLmtCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetRhabCombMtLmtCd() {
    return (substring(
        getStringValue(),
        beginPol4RetRhabCombMtLmtCd,
        beginPol4RetRhabCombMtLmtCd + POL_4_RET_RHAB_COMB_MT_LMT_CD_LEN));
  }

  int localPol4RetHabCombPtLmtCdCounter = -1;

  public boolean isPol4RetHabCombPtLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetHabCombPtLmtCdCounter != sharedCounter;
    localPol4RetHabCombPtLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_HAB_COMB_PT_LMT_CD_LEN = 2;
  /** serialize this Pol4RetHabCombPtLmtCd */
  protected void serializePol4RetHabCombPtLmtCd(char[] pol4RetHabCombPtLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetHabCombPtLmtCd,
        0,
        getStringValue(),
        beginPol4RetHabCombPtLmtCd,
        POL_4_RET_HAB_COMB_PT_LMT_CD_LEN);
    localPol4RetHabCombPtLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetHabCombPtLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol4RetHabCombPtLmtCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetHabCombPtLmtCd() {
    return (substring(
        getStringValue(),
        beginPol4RetHabCombPtLmtCd,
        beginPol4RetHabCombPtLmtCd + POL_4_RET_HAB_COMB_PT_LMT_CD_LEN));
  }

  int localPol4RetHabCombOtLmtCdCounter = -1;

  public boolean isPol4RetHabCombOtLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetHabCombOtLmtCdCounter != sharedCounter;
    localPol4RetHabCombOtLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_HAB_COMB_OT_LMT_CD_LEN = 2;
  /** serialize this Pol4RetHabCombOtLmtCd */
  protected void serializePol4RetHabCombOtLmtCd(char[] pol4RetHabCombOtLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetHabCombOtLmtCd,
        0,
        getStringValue(),
        beginPol4RetHabCombOtLmtCd,
        POL_4_RET_HAB_COMB_OT_LMT_CD_LEN);
    localPol4RetHabCombOtLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetHabCombOtLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol4RetHabCombOtLmtCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetHabCombOtLmtCd() {
    return (substring(
        getStringValue(),
        beginPol4RetHabCombOtLmtCd,
        beginPol4RetHabCombOtLmtCd + POL_4_RET_HAB_COMB_OT_LMT_CD_LEN));
  }

  int localPol4RetHabCombStLmtCdCounter = -1;

  public boolean isPol4RetHabCombStLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetHabCombStLmtCdCounter != sharedCounter;
    localPol4RetHabCombStLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_HAB_COMB_ST_LMT_CD_LEN = 2;
  /** serialize this Pol4RetHabCombStLmtCd */
  protected void serializePol4RetHabCombStLmtCd(char[] pol4RetHabCombStLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetHabCombStLmtCd,
        0,
        getStringValue(),
        beginPol4RetHabCombStLmtCd,
        POL_4_RET_HAB_COMB_ST_LMT_CD_LEN);
    localPol4RetHabCombStLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetHabCombStLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol4RetHabCombStLmtCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetHabCombStLmtCd() {
    return (substring(
        getStringValue(),
        beginPol4RetHabCombStLmtCd,
        beginPol4RetHabCombStLmtCd + POL_4_RET_HAB_COMB_ST_LMT_CD_LEN));
  }

  int localPol4RetHabCombSmLmtCdCounter = -1;

  public boolean isPol4RetHabCombSmLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetHabCombSmLmtCdCounter != sharedCounter;
    localPol4RetHabCombSmLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_HAB_COMB_SM_LMT_CD_LEN = 2;
  /** serialize this Pol4RetHabCombSmLmtCd */
  protected void serializePol4RetHabCombSmLmtCd(char[] pol4RetHabCombSmLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetHabCombSmLmtCd,
        0,
        getStringValue(),
        beginPol4RetHabCombSmLmtCd,
        POL_4_RET_HAB_COMB_SM_LMT_CD_LEN);
    localPol4RetHabCombSmLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetHabCombSmLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol4RetHabCombSmLmtCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetHabCombSmLmtCd() {
    return (substring(
        getStringValue(),
        beginPol4RetHabCombSmLmtCd,
        beginPol4RetHabCombSmLmtCd + POL_4_RET_HAB_COMB_SM_LMT_CD_LEN));
  }

  int localPol4RetHabCombCiLmtCdCounter = -1;

  public boolean isPol4RetHabCombCiLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetHabCombCiLmtCdCounter != sharedCounter;
    localPol4RetHabCombCiLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_HAB_COMB_CI_LMT_CD_LEN = 2;
  /** serialize this Pol4RetHabCombCiLmtCd */
  protected void serializePol4RetHabCombCiLmtCd(char[] pol4RetHabCombCiLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetHabCombCiLmtCd,
        0,
        getStringValue(),
        beginPol4RetHabCombCiLmtCd,
        POL_4_RET_HAB_COMB_CI_LMT_CD_LEN);
    localPol4RetHabCombCiLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetHabCombCiLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol4RetHabCombCiLmtCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetHabCombCiLmtCd() {
    return (substring(
        getStringValue(),
        beginPol4RetHabCombCiLmtCd,
        beginPol4RetHabCombCiLmtCd + POL_4_RET_HAB_COMB_CI_LMT_CD_LEN));
  }

  int localPol4RetHabCombCtLmtCdCounter = -1;

  public boolean isPol4RetHabCombCtLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetHabCombCtLmtCdCounter != sharedCounter;
    localPol4RetHabCombCtLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_HAB_COMB_CT_LMT_CD_LEN = 2;
  /** serialize this Pol4RetHabCombCtLmtCd */
  protected void serializePol4RetHabCombCtLmtCd(char[] pol4RetHabCombCtLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetHabCombCtLmtCd,
        0,
        getStringValue(),
        beginPol4RetHabCombCtLmtCd,
        POL_4_RET_HAB_COMB_CT_LMT_CD_LEN);
    localPol4RetHabCombCtLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetHabCombCtLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol4RetHabCombCtLmtCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetHabCombCtLmtCd() {
    return (substring(
        getStringValue(),
        beginPol4RetHabCombCtLmtCd,
        beginPol4RetHabCombCtLmtCd + POL_4_RET_HAB_COMB_CT_LMT_CD_LEN));
  }

  int localPol4RetHabCombMtLmtCdCounter = -1;

  public boolean isPol4RetHabCombMtLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetHabCombMtLmtCdCounter != sharedCounter;
    localPol4RetHabCombMtLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_HAB_COMB_MT_LMT_CD_LEN = 2;
  /** serialize this Pol4RetHabCombMtLmtCd */
  protected void serializePol4RetHabCombMtLmtCd(char[] pol4RetHabCombMtLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4RetHabCombMtLmtCd,
        0,
        getStringValue(),
        beginPol4RetHabCombMtLmtCd,
        POL_4_RET_HAB_COMB_MT_LMT_CD_LEN);
    localPol4RetHabCombMtLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetHabCombMtLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol4RetHabCombMtLmtCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetHabCombMtLmtCd() {
    return (substring(
        getStringValue(),
        beginPol4RetHabCombMtLmtCd,
        beginPol4RetHabCombMtLmtCd + POL_4_RET_HAB_COMB_MT_LMT_CD_LEN));
  }

  int localPol4RetUgiIndCounter = -1;

  public boolean isPol4RetUgiIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetUgiIndCounter != sharedCounter;
    localPol4RetUgiIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_UGI_IND_LEN = 1;
  /** serialize this Pol4RetUgiInd */
  protected void serializePol4RetUgiInd(char[] pol4RetUgiInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol4RetUgiInd, 0, getStringValue(), beginPol4RetUgiInd, POL_4_RET_UGI_IND_LEN);
    localPol4RetUgiIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetUgiIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4RetUgiInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetUgiInd() {
    return (substring(
        getStringValue(), beginPol4RetUgiInd, beginPol4RetUgiInd + POL_4_RET_UGI_IND_LEN));
  }

  int localPol4RetLgiIndCounter = -1;

  public boolean isPol4RetLgiIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetLgiIndCounter != sharedCounter;
    localPol4RetLgiIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_LGI_IND_LEN = 1;
  /** serialize this Pol4RetLgiInd */
  protected void serializePol4RetLgiInd(char[] pol4RetLgiInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol4RetLgiInd, 0, getStringValue(), beginPol4RetLgiInd, POL_4_RET_LGI_IND_LEN);
    localPol4RetLgiIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetLgiIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4RetLgiInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetLgiInd() {
    return (substring(
        getStringValue(), beginPol4RetLgiInd, beginPol4RetLgiInd + POL_4_RET_LGI_IND_LEN));
  }

  int localPol4RetExdIndCounter = -1;

  public boolean isPol4RetExdIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4RetExdIndCounter != sharedCounter;
    localPol4RetExdIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_RET_EXD_IND_LEN = 1;
  /** serialize this Pol4RetExdInd */
  protected void serializePol4RetExdInd(char[] pol4RetExdInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol4RetExdInd, 0, getStringValue(), beginPol4RetExdInd, POL_4_RET_EXD_IND_LEN);
    localPol4RetExdIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4RetExdIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4RetExdInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol4RetExdInd() {
    return (substring(
        getStringValue(), beginPol4RetExdInd, beginPol4RetExdInd + POL_4_RET_EXD_IND_LEN));
  }

  int localPol4MmlCovSetNbrCounter = -1;

  public boolean isPol4MmlCovSetNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4MmlCovSetNbrCounter != sharedCounter;
    localPol4MmlCovSetNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_MML_COV_SET_NBR_LEN = 3;
  /** serialize this Pol4MmlCovSetNbr */
  protected void serializePol4MmlCovSetNbr(char[] pol4MmlCovSetNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4MmlCovSetNbr, 0, getStringValue(), beginPol4MmlCovSetNbr, POL_4_MML_COV_SET_NBR_LEN);
    localPol4MmlCovSetNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4MmlCovSetNbrConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshPol4MmlCovSetNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol4MmlCovSetNbr() {
    return (substring(
        getStringValue(),
        beginPol4MmlCovSetNbr,
        beginPol4MmlCovSetNbr + POL_4_MML_COV_SET_NBR_LEN));
  }

  public int pol4PolBenLvlSize() {
    return POL_4_POL_BEN_LVL_SIZE;
  }

  public int pol4FamDedSize() {
    return POL_4_FAM_DED_SIZE;
  }

  public int pol4IndDedSize() {
    return POL_4_IND_DED_SIZE;
  }
}
