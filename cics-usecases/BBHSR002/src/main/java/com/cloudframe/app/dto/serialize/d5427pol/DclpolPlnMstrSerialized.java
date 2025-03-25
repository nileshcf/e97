package com.cloudframe.app.dto.serialize.d5427pol;

/**
 * The class DclpolPlnMstrSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DclpolPlnMstrSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(DclpolPlnMstrSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int DCLPOL_PLN_MSTR_LENGTH = 589;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginMmiCovTypCd;
  protected int beginMmiPolNbr;
  protected int beginMmiPlnNbr;
  protected int beginMmiClssNbr;
  protected int beginMmiObsolete;
  protected int beginMmiSlotTblId;
  protected int beginMmiObligId;
  protected int beginMmiShrArngCd;
  protected int beginMmiRcprctyTblId;
  protected int beginMmiNewOldSrvcInd;
  protected int beginMmiCopayVarId;
  protected int beginMmiLstUpdtDttm;
  protected int beginMmiLstUpdtId;
  protected int beginMmiAllncCd;
  protected int beginMmiBenMaxCombPriCd;
  protected int beginMmiBenMaxCombPriCnt;
  protected int beginMmiBenMaxCombSecCd;
  protected int beginMmiBenMaxCombSecCnt;
  protected int beginMmiBenMaxCrdcRehabPriCd;
  protected int beginMmiBenMaxCrdcRehabPriCnt;
  protected int beginMmiBenMaxCrdcRehabSecCd;
  protected int beginMmiBenMaxCrdcRehabSecCnt;
  protected int beginMmiBenMaxOcpTrpyPriCd;
  protected int beginMmiBenMaxOcpTrpyPriCnt;
  protected int beginMmiBenMaxOcpTrpySecCd;
  protected int beginMmiBenMaxOcpTrpySecCnt;
  protected int beginMmiBenMaxPhOcSpchPriCd;
  protected int beginMmiBenMaxPhOcSpchPriCnt;
  protected int beginMmiBenMaxPhOcSpchSecCd;
  protected int beginMmiBenMaxPhOcSpchSecCnt;
  protected int beginMmiBenMaxPhOcTrpyPriCd;
  protected int beginMmiBenMaxPhOcTrpyPriCnt;
  protected int beginMmiBenMaxPhOcTrpySecCd;
  protected int beginMmiBenMaxPhOcTrpySecCnt;
  protected int beginMmiBenMaxPhysTrpyPriCd;
  protected int beginMmiBenMaxPhysTrpyPriCnt;
  protected int beginMmiBenMaxPhysTrpySecCd;
  protected int beginMmiBenMaxPhysTrpySecCnt;
  protected int beginMmiBenMaxPlmryRehbPriCnt;
  protected int beginMmiBenMaxSpchTrpyPriCd;
  protected int beginMmiBenMaxSpchTrpyPriCnt;
  protected int beginMmiBenMaxSpchTrpySecCd;
  protected int beginMmiBenMaxSpchTrpySecCnt;
  protected int beginMmiBenMaxSpneMnipPriCd;
  protected int beginMmiBenMaxSpneMnipPriCnt;
  protected int beginMmiBenMaxSpneMnipSecCd;
  protected int beginMmiBenMaxSpneMnipSecCnt;
  protected int beginMmiCancDt;
  protected int beginMmiCareMgtInd;
  protected int beginMmiChrpNtwkInd;
  protected int beginMmiClmAutoDenyInd;
  protected int beginMmiCoinsCopayCd;
  protected int beginMmiCombPrscDedPriCd;
  protected int beginMmiCombPrscDedQualCd;
  protected int beginMmiCombPrscDedSecCd;
  protected int beginMmiCombPrscDedTirCd;
  protected int beginMmiContrStCd;
  protected int beginMmiCopayAmt;
  protected int beginMmiCopayMaxAnnlAmt;
  protected int beginMmiCopayWaivTblId;
  protected int beginMmiDiagVsSurgInd;
  protected int beginMmiDolTlrInd;
  protected int beginMmiDsesStTblNbr;
  protected int beginMmiEffDt;
  protected int beginMmiEmrgParsNtfyInd;
  protected int beginMmiEmrgParsNtfyPrdCd;
  protected int beginMmiEvdBasDialgInd;
  protected int beginMmiEciTblId;
  protected int beginMmiEviTblId;
  protected int beginMmiFamMbrCnt;
  protected int beginMmiFamNewCoinsAmt;
  protected int beginMmiFamTxtSwapCd;
  protected int beginMmiFertCtrcptvCd;
  protected int beginMmiObsolete2;
  protected int beginMmiHiDedPlnCd;
  protected int beginMmiIplanTypCd;
  protected int beginMmiLftmMaxAmt;
  protected int beginMmiMbrNtwkKeyMtchCd;
  protected int beginMmiMbrPrdctCd;
  protected int beginMmiMbrPrdctTypCd;
  protected int beginMmiMnrpCd;
  protected int beginMmiMnrpPct;
  protected int beginMmiMntlUbhCd;
  protected int beginMmiNewCoinsAmt;
  protected int beginMmiNewCoinsCombPrscCd;
  protected int beginMmiNewCoinsPrdCd;
  protected int beginMmiNewCoinsSalFamMultFct;
  protected int beginMmiNewCoinsSalFamTypCd;
  protected int beginMmiNewCoinsSalIndvTypCd;
  protected int beginMmiNoblxLabInd;
  protected int beginMmiNonEmbdDedCd;
  protected int beginMmiNonEmrgInd;
  protected int beginMmiNtfyCrdcEpInd;
  protected int beginMmiNtwkPcpCopayAmt;
  protected int beginMmiObgynPcpCopayInd;
  protected int beginMmiOfcVstMaxRmrkCd;
  protected int beginMmiOopCombEeChrgAmt;
  protected int beginMmiOopCombEePls1Amt;
  protected int beginMmiOopCombEeSpoAmt;
  protected int beginMmiOopCombFamAmt;
  protected int beginMmiOopCombIndvAmt;
  protected int beginMmiOopCombNbrCd;
  protected int beginMmiOopCombPrscCd;
  protected int beginMmiOopInNtwkEeChrgAmt;
  protected int beginMmiOopInNtwkEePls1Amt;
  protected int beginMmiOopInNtwkEeSpoAmt;
  protected int beginMmiOopUrgntCareCd;
  protected int beginMmiOthrRmrkCd;
  protected int beginMmiParsMnlProcInd;
  protected int beginMmiParsOopLmtAmt;
  protected int beginMmiParsSurgSchedNbr;
  protected int beginMmiPayLocCd;
  protected int beginMmiPcpCopayCd;
  protected int beginMmiPcpSpecCoinsInd;
  protected int beginMmiPhysMedcnPrdCd;
  protected int beginMmiPolTypCd;
  protected int beginMmiPpoInd;
  protected int beginMmiPpoMinEmrgInd;
  protected int beginMmiPpoPmntCd;
  protected int beginMmiPrdctKeyCd;
  protected int beginMmiPrortEvntTypCd;
  protected int beginMmiPrortIntrvlFreqCd;
  protected int beginMmiPsyCyrCnfmMaxAmt;
  protected int beginMmiPsyCyrCombPrscMaxAmt;
  protected int beginMmiPsyCyrNonCnfmMaxAmt;
  protected int beginMmiPsyLftmCnfmMaxAmt;
  protected int beginMmiPsyLftmCombPrscMaxAmt;
  protected int beginMmiPsyLftmNonCnfmMaxAmt;
  protected int beginMmiRapl3TierInd;
  protected int beginMmiRhapsodyCopayCd;
  protected int beginMmiRhapsodyCopayDayCnt;
  protected int beginMmiRmrkCd;
  protected int beginMmiRmrkSpineManipCd;
  protected int beginMmiSpclProc1Cd;
  protected int beginMmiSpclProc2Cd;
  protected int beginMmiSpclProc3Cd;
  protected int beginMmiSpclProc4Cd;
  protected int beginMmiSpclProc5Cd;
  protected int beginMmiSpclProc6Cd;
  protected int beginMmiSpclProc7Cd;
  protected int beginMmiSpclProc8Cd;
  protected int beginMmiSpclProc9Cd;
  protected int beginMmiSpclProc10Cd;
  protected int beginMmiSrvcCatgyTblId;
  protected int beginMmiSrvcCdNSetInd;
  protected int beginMmiSrvcCdPSetInd;
  protected int beginMmiSrvcCdTSetInd;
  protected int beginMmiSviTblPriNbr;
  protected int beginMmiTierLblInd;
  protected int beginMmiTier1CopayAmt;
  protected int beginMmiTier1FamNewCoinsAmt;
  protected int beginMmiTier1LftmMaxAmt;
  protected int beginMmiTier1NewCoinsAmt;
  protected int beginMmiTier1UrgntCareAmt;
  protected int beginMmiTier1UrgntCareOopCd;
  protected int beginMmiTravBenMktNbr;
  protected int beginMmiTravBenTblNbr;
  protected int beginMmiUhpCd;
  protected int beginMmiUrgntCareAmt;
  protected int beginMmiVarPrdFct;
  protected int beginMmiXtraTerrStMandInd;
  protected int beginMmiRsnCustyPrdCd;
  protected int beginMmiDfltChrgPct;
  protected int beginMmiFaclShrSvCd;
  protected int beginMmiPhysnShrSvCd;
  protected int beginMmiCptnXclsInd;
  protected int beginMmiObsolete1;
  protected int beginMmiNewCoinsAccumCd;
  protected int beginMmiErisaInd;
  protected int beginMmiBhvHlthVendCd;
  protected int beginMmiEapVendCd;
  protected int beginMmiVisnCd;
  protected int beginMmiFaclClmEdtInd;
  protected int beginMmiPlnFturCd;
  protected int beginMmiFundTypCd;
  protected int beginMmiRxSbscrIdTypCd;
  protected int beginMmiPrdctCdId;
  protected int beginMmiEnrpEmrgFaclInd;
  protected int beginMmiEmergentWrpInd;
  protected int beginMmiOopMaxCovCd;
  protected int beginMmiOncPolPrtcpCd;
  protected int beginMmiPlnFturInd;
  protected int beginMmiSrvcCdASetInd;
  protected int beginMmiSrvcCdBSetInd;
  protected int beginMmiSrvcCdCSetInd;
  protected int beginMmiSrvcCdDSetInd;
  protected int beginMmiSrvcCdESetInd;
  protected int beginMmiSrvcCdFSetInd;
  protected int beginMmiSrvcCdGSetInd;
  protected int beginMmiSrvcCdHSetInd;
  protected int beginMmiSrvcCdISetInd;
  protected int beginMmiSrvcCdJSetInd;
  protected int beginMmiSrvcCdKSetInd;
  protected int beginMmiSrvcCdLSetInd;
  protected int beginMmiSrvcCdMSetInd;
  protected int beginMmiSrvcCdOSetInd;
  protected int beginMmiSrvcCdQSetInd;
  protected int beginMmiSrvcCdRSetInd;
  protected int beginMmiSrvcCdSSetInd;
  protected int beginMmiSrvcCdUSetInd;
  protected int beginMmiSrvcCdVSetInd;
  protected int beginMmiSrvcCdWSetInd;
  protected int beginMmiSrvcCdXSetInd;
  protected int beginMmiSrvcCdYSetInd;
  protected int beginMmiSrvcCdZSetInd;
  protected int beginMmiNonEmbdCopayCd;
  protected int beginMmiNonEmbdCoreOopCd;
  protected int beginMmiNewCoinsDedTypCd;
  protected int beginMmiNewCoinsIndvMinPct;
  protected int beginMmiNewCoinsIndvMaxPct;
  protected int beginMmiNonEmbdNewCoinsCd;
  protected int beginMmiNonEmbdCoreDedCd;
  protected int beginMmiIndvOopCd;
  protected int beginMmiIndvPrdCd;
  protected int beginMmiIndvSalryTypCd;
  protected int beginMmiFamSalryTypCd;
  protected int beginMmiFamMultPct;
  protected int beginMmiFamVal;
  protected int beginMmiXapplyOopCd;
  protected int beginMmiIndvCopayCaroCd;
  protected int beginMmiXapplyCopayCd;
  protected int beginMmiCoreOopNcapInd;
  protected int beginMmiMnnrpLabPct;
  protected int beginMmiMnnrpDmePct;
  protected int beginMmiOonLftmMaxAmt;
  protected int beginMmiBusSegPltfm;
  protected int beginMmiSviTblTerNbr;
  protected int beginMmiRelSrvcInd;
  protected int beginMmiCoreMedPrrAuthCd;
  protected int beginMmiPcpBenLvlRule;
  protected int beginMmiMcrCd;
  protected int beginMmiLmtSrvcCd;
  protected int beginMmiEligXrefCd;
  protected int beginMmiBenMaxAuralCiPriCd;
  protected int beginMmiBenMaxAuralCiPriCnt;
  protected int beginMmiBenMaxAuralCiSecCd;
  protected int beginMmiBenMaxAuralCiSecCnt;
  protected int beginMmiBenMaxCogTrpyPriCd;
  protected int beginMmiBenMaxCogTrpyPriCnt;
  protected int beginMmiBenMaxCogTrpySecCd;
  protected int beginMmiBenMaxCogTrpySecCnt;
  protected int beginMmiBenMaxCogTrpyExclCd;
  protected int beginMmiBenMaxEhbSpneRhabCnt;
  protected int beginMmiBenMaxEhbSpneHabCnt;
  protected int beginMmiBenMaxEhbPtRhabCnt;
  protected int beginMmiBenMaxEhbPtHabCnt;
  protected int beginMmiBenMaxEhbSpchRhabCnt;
  protected int beginMmiBenMaxEhbSpchHabCnt;
  protected int beginMmiBenMaxEhbCrdcRhabCnt;
  protected int beginMmiBenMaxEhbOtRhabCnt;
  protected int beginMmiBenMaxEhbOtHabCnt;
  protected int beginMmiBenMaxEhbPlmryRhabCnt;
  protected int beginMmiBenMaxEhbAuralRhabCnt;
  protected int beginMmiBenMaxEhbAuralHabCnt;
  protected int beginMmiBenMaxEhbCogRhabCnt;
  protected int beginMmiBenMaxEhbCogHabCnt;
  protected int beginMmiBenMaxEhbPostRhabCnt;
  protected int beginMmiBenMaxEhbPostHabCnt;
  protected int beginMmiBenMaxEhbPtotRhabCnt;
  protected int beginMmiBenMaxEhbPtotHabCnt;
  protected int beginMmiBenMaxEhbRhabRmrkCd;
  protected int beginMmiBenMaxEhbPosmRhabCnt;
  protected int beginMmiBenMaxEhbPosmHabCnt;
  protected int beginMmiBenMaxEhbHabRmrkCd;
  protected int beginMmiBenPhysMedcnPrdCd;
  protected int beginMmiBenAutsmAgeYrFrVal;
  protected int beginMmiBenAutsmAgeYrToVal;
  protected int beginMmiBenAutsmPostCd;
  protected int beginMmiBenAutsmAllCd;
  protected int beginMmiBenMaxPlmryRehbPriCd;
  protected int beginMmiBenMaxPlmryRehbSecCd;
  protected int beginMmiBenMaxPlmryRehbSecCnt;
  protected int beginMmiSiteSrvcPrtcpCd;
  protected int beginMmiBenAutsm2AgeYrFrVal;
  protected int beginMmiBenAutsm2AgeYrToVal;
  protected int beginMmiBenAutsm2PostCd;
  protected int beginMmiBenAutsm2AllCd;

  /** Constructor for DclpolPlnMstrSerialized */
  public DclpolPlnMstrSerialized() {
    init(0);
  }

  /** initializes the field in DclpolPlnMstrSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(DCLPOL_PLN_MSTR_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginMmiCovTypCd = getStartOffset() + 0; // set offset for serialization

    beginMmiPolNbr = getStartOffset() + 1; // set offset for serialization

    beginMmiPlnNbr = getStartOffset() + 7; // set offset for serialization

    beginMmiClssNbr = getStartOffset() + 11; // set offset for serialization

    beginMmiObsolete = getStartOffset() + 15; // set offset for serialization

    beginMmiSlotTblId = getStartOffset() + 21; // set offset for serialization

    beginMmiObligId = getStartOffset() + 27; // set offset for serialization

    beginMmiShrArngCd = getStartOffset() + 29; // set offset for serialization

    beginMmiRcprctyTblId = getStartOffset() + 31; // set offset for serialization

    beginMmiNewOldSrvcInd = getStartOffset() + 37; // set offset for serialization

    beginMmiCopayVarId = getStartOffset() + 38; // set offset for serialization

    beginMmiLstUpdtDttm = getStartOffset() + 42; // set offset for serialization

    beginMmiLstUpdtId = getStartOffset() + 68; // set offset for serialization

    beginMmiAllncCd = getStartOffset() + 77; // set offset for serialization

    beginMmiBenMaxCombPriCd = getStartOffset() + 78; // set offset for serialization

    beginMmiBenMaxCombPriCnt = getStartOffset() + 79; // set offset for serialization

    beginMmiBenMaxCombSecCd = getStartOffset() + 81; // set offset for serialization

    beginMmiBenMaxCombSecCnt = getStartOffset() + 82; // set offset for serialization

    beginMmiBenMaxCrdcRehabPriCd = getStartOffset() + 84; // set offset for serialization

    beginMmiBenMaxCrdcRehabPriCnt = getStartOffset() + 85; // set offset for serialization

    beginMmiBenMaxCrdcRehabSecCd = getStartOffset() + 87; // set offset for serialization

    beginMmiBenMaxCrdcRehabSecCnt = getStartOffset() + 88; // set offset for serialization

    beginMmiBenMaxOcpTrpyPriCd = getStartOffset() + 90; // set offset for serialization

    beginMmiBenMaxOcpTrpyPriCnt = getStartOffset() + 91; // set offset for serialization

    beginMmiBenMaxOcpTrpySecCd = getStartOffset() + 93; // set offset for serialization

    beginMmiBenMaxOcpTrpySecCnt = getStartOffset() + 94; // set offset for serialization

    beginMmiBenMaxPhOcSpchPriCd = getStartOffset() + 96; // set offset for serialization

    beginMmiBenMaxPhOcSpchPriCnt = getStartOffset() + 97; // set offset for serialization

    beginMmiBenMaxPhOcSpchSecCd = getStartOffset() + 99; // set offset for serialization

    beginMmiBenMaxPhOcSpchSecCnt = getStartOffset() + 100; // set offset for serialization

    beginMmiBenMaxPhOcTrpyPriCd = getStartOffset() + 102; // set offset for serialization

    beginMmiBenMaxPhOcTrpyPriCnt = getStartOffset() + 103; // set offset for serialization

    beginMmiBenMaxPhOcTrpySecCd = getStartOffset() + 105; // set offset for serialization

    beginMmiBenMaxPhOcTrpySecCnt = getStartOffset() + 106; // set offset for serialization

    beginMmiBenMaxPhysTrpyPriCd = getStartOffset() + 108; // set offset for serialization

    beginMmiBenMaxPhysTrpyPriCnt = getStartOffset() + 109; // set offset for serialization

    beginMmiBenMaxPhysTrpySecCd = getStartOffset() + 111; // set offset for serialization

    beginMmiBenMaxPhysTrpySecCnt = getStartOffset() + 112; // set offset for serialization

    beginMmiBenMaxPlmryRehbPriCnt = getStartOffset() + 114; // set offset for serialization

    beginMmiBenMaxSpchTrpyPriCd = getStartOffset() + 116; // set offset for serialization

    beginMmiBenMaxSpchTrpyPriCnt = getStartOffset() + 117; // set offset for serialization

    beginMmiBenMaxSpchTrpySecCd = getStartOffset() + 119; // set offset for serialization

    beginMmiBenMaxSpchTrpySecCnt = getStartOffset() + 120; // set offset for serialization

    beginMmiBenMaxSpneMnipPriCd = getStartOffset() + 122; // set offset for serialization

    beginMmiBenMaxSpneMnipPriCnt = getStartOffset() + 123; // set offset for serialization

    beginMmiBenMaxSpneMnipSecCd = getStartOffset() + 125; // set offset for serialization

    beginMmiBenMaxSpneMnipSecCnt = getStartOffset() + 126; // set offset for serialization

    beginMmiCancDt = getStartOffset() + 128; // set offset for serialization

    beginMmiCareMgtInd = getStartOffset() + 138; // set offset for serialization

    beginMmiChrpNtwkInd = getStartOffset() + 139; // set offset for serialization

    beginMmiClmAutoDenyInd = getStartOffset() + 140; // set offset for serialization

    beginMmiCoinsCopayCd = getStartOffset() + 141; // set offset for serialization

    beginMmiCombPrscDedPriCd = getStartOffset() + 143; // set offset for serialization

    beginMmiCombPrscDedQualCd = getStartOffset() + 144; // set offset for serialization

    beginMmiCombPrscDedSecCd = getStartOffset() + 145; // set offset for serialization

    beginMmiCombPrscDedTirCd = getStartOffset() + 146; // set offset for serialization

    beginMmiContrStCd = getStartOffset() + 147; // set offset for serialization

    beginMmiCopayAmt = getStartOffset() + 149; // set offset for serialization

    beginMmiCopayMaxAnnlAmt = getStartOffset() + 152; // set offset for serialization

    beginMmiCopayWaivTblId = getStartOffset() + 161; // set offset for serialization

    beginMmiDiagVsSurgInd = getStartOffset() + 167; // set offset for serialization

    beginMmiDolTlrInd = getStartOffset() + 168; // set offset for serialization

    beginMmiDsesStTblNbr = getStartOffset() + 169; // set offset for serialization

    beginMmiEffDt = getStartOffset() + 175; // set offset for serialization

    beginMmiEmrgParsNtfyInd = getStartOffset() + 185; // set offset for serialization

    beginMmiEmrgParsNtfyPrdCd = getStartOffset() + 186; // set offset for serialization

    beginMmiEvdBasDialgInd = getStartOffset() + 187; // set offset for serialization

    beginMmiEciTblId = getStartOffset() + 188; // set offset for serialization

    beginMmiEviTblId = getStartOffset() + 194; // set offset for serialization

    beginMmiFamMbrCnt = getStartOffset() + 200; // set offset for serialization

    beginMmiFamNewCoinsAmt = getStartOffset() + 202; // set offset for serialization

    beginMmiFamTxtSwapCd = getStartOffset() + 206; // set offset for serialization

    beginMmiFertCtrcptvCd = getStartOffset() + 207; // set offset for serialization

    beginMmiObsolete2 = getStartOffset() + 208; // set offset for serialization

    beginMmiHiDedPlnCd = getStartOffset() + 210; // set offset for serialization

    beginMmiIplanTypCd = getStartOffset() + 212; // set offset for serialization

    beginMmiLftmMaxAmt = getStartOffset() + 213; // set offset for serialization

    beginMmiMbrNtwkKeyMtchCd = getStartOffset() + 217; // set offset for serialization

    beginMmiMbrPrdctCd = getStartOffset() + 218; // set offset for serialization

    beginMmiMbrPrdctTypCd = getStartOffset() + 224; // set offset for serialization

    beginMmiMnrpCd = getStartOffset() + 227; // set offset for serialization

    beginMmiMnrpPct = getStartOffset() + 228; // set offset for serialization

    beginMmiMntlUbhCd = getStartOffset() + 230; // set offset for serialization

    beginMmiNewCoinsAmt = getStartOffset() + 232; // set offset for serialization

    beginMmiNewCoinsCombPrscCd = getStartOffset() + 236; // set offset for serialization

    beginMmiNewCoinsPrdCd = getStartOffset() + 237; // set offset for serialization

    beginMmiNewCoinsSalFamMultFct = getStartOffset() + 238; // set offset for serialization

    beginMmiNewCoinsSalFamTypCd = getStartOffset() + 240; // set offset for serialization

    beginMmiNewCoinsSalIndvTypCd = getStartOffset() + 241; // set offset for serialization

    beginMmiNoblxLabInd = getStartOffset() + 242; // set offset for serialization

    beginMmiNonEmbdDedCd = getStartOffset() + 243; // set offset for serialization

    beginMmiNonEmrgInd = getStartOffset() + 244; // set offset for serialization

    beginMmiNtfyCrdcEpInd = getStartOffset() + 245; // set offset for serialization

    beginMmiNtwkPcpCopayAmt = getStartOffset() + 246; // set offset for serialization

    beginMmiObgynPcpCopayInd = getStartOffset() + 249; // set offset for serialization

    beginMmiOfcVstMaxRmrkCd = getStartOffset() + 250; // set offset for serialization

    beginMmiOopCombEeChrgAmt = getStartOffset() + 253; // set offset for serialization

    beginMmiOopCombEePls1Amt = getStartOffset() + 257; // set offset for serialization

    beginMmiOopCombEeSpoAmt = getStartOffset() + 261; // set offset for serialization

    beginMmiOopCombFamAmt = getStartOffset() + 265; // set offset for serialization

    beginMmiOopCombIndvAmt = getStartOffset() + 269; // set offset for serialization

    beginMmiOopCombNbrCd = getStartOffset() + 273; // set offset for serialization

    beginMmiOopCombPrscCd = getStartOffset() + 274; // set offset for serialization

    beginMmiOopInNtwkEeChrgAmt = getStartOffset() + 275; // set offset for serialization

    beginMmiOopInNtwkEePls1Amt = getStartOffset() + 279; // set offset for serialization

    beginMmiOopInNtwkEeSpoAmt = getStartOffset() + 283; // set offset for serialization

    beginMmiOopUrgntCareCd = getStartOffset() + 287; // set offset for serialization

    beginMmiOthrRmrkCd = getStartOffset() + 288; // set offset for serialization

    beginMmiParsMnlProcInd = getStartOffset() + 291; // set offset for serialization

    beginMmiParsOopLmtAmt = getStartOffset() + 292; // set offset for serialization

    beginMmiParsSurgSchedNbr = getStartOffset() + 301; // set offset for serialization

    beginMmiPayLocCd = getStartOffset() + 303; // set offset for serialization

    beginMmiPcpCopayCd = getStartOffset() + 306; // set offset for serialization

    beginMmiPcpSpecCoinsInd = getStartOffset() + 307; // set offset for serialization

    beginMmiPhysMedcnPrdCd = getStartOffset() + 308; // set offset for serialization

    beginMmiPolTypCd = getStartOffset() + 309; // set offset for serialization

    beginMmiPpoInd = getStartOffset() + 311; // set offset for serialization

    beginMmiPpoMinEmrgInd = getStartOffset() + 312; // set offset for serialization

    beginMmiPpoPmntCd = getStartOffset() + 313; // set offset for serialization

    beginMmiPrdctKeyCd = getStartOffset() + 315; // set offset for serialization

    beginMmiPrortEvntTypCd = getStartOffset() + 318; // set offset for serialization

    beginMmiPrortIntrvlFreqCd = getStartOffset() + 319; // set offset for serialization

    beginMmiPsyCyrCnfmMaxAmt = getStartOffset() + 320; // set offset for serialization

    beginMmiPsyCyrCombPrscMaxAmt = getStartOffset() + 324; // set offset for serialization

    beginMmiPsyCyrNonCnfmMaxAmt = getStartOffset() + 328; // set offset for serialization

    beginMmiPsyLftmCnfmMaxAmt = getStartOffset() + 332; // set offset for serialization

    beginMmiPsyLftmCombPrscMaxAmt = getStartOffset() + 336; // set offset for serialization

    beginMmiPsyLftmNonCnfmMaxAmt = getStartOffset() + 340; // set offset for serialization

    beginMmiRapl3TierInd = getStartOffset() + 344; // set offset for serialization

    beginMmiRhapsodyCopayCd = getStartOffset() + 345; // set offset for serialization

    beginMmiRhapsodyCopayDayCnt = getStartOffset() + 346; // set offset for serialization

    beginMmiRmrkCd = getStartOffset() + 348; // set offset for serialization

    beginMmiRmrkSpineManipCd = getStartOffset() + 351; // set offset for serialization

    beginMmiSpclProc1Cd = getStartOffset() + 354; // set offset for serialization

    beginMmiSpclProc2Cd = getStartOffset() + 355; // set offset for serialization

    beginMmiSpclProc3Cd = getStartOffset() + 356; // set offset for serialization

    beginMmiSpclProc4Cd = getStartOffset() + 357; // set offset for serialization

    beginMmiSpclProc5Cd = getStartOffset() + 358; // set offset for serialization

    beginMmiSpclProc6Cd = getStartOffset() + 359; // set offset for serialization

    beginMmiSpclProc7Cd = getStartOffset() + 360; // set offset for serialization

    beginMmiSpclProc8Cd = getStartOffset() + 361; // set offset for serialization

    beginMmiSpclProc9Cd = getStartOffset() + 362; // set offset for serialization

    beginMmiSpclProc10Cd = getStartOffset() + 363; // set offset for serialization

    beginMmiSrvcCatgyTblId = getStartOffset() + 364; // set offset for serialization

    beginMmiSrvcCdNSetInd = getStartOffset() + 367; // set offset for serialization

    beginMmiSrvcCdPSetInd = getStartOffset() + 368; // set offset for serialization

    beginMmiSrvcCdTSetInd = getStartOffset() + 369; // set offset for serialization

    beginMmiSviTblPriNbr = getStartOffset() + 370; // set offset for serialization

    beginMmiTierLblInd = getStartOffset() + 376; // set offset for serialization

    beginMmiTier1CopayAmt = getStartOffset() + 377; // set offset for serialization

    beginMmiTier1FamNewCoinsAmt = getStartOffset() + 380; // set offset for serialization

    beginMmiTier1LftmMaxAmt = getStartOffset() + 384; // set offset for serialization

    beginMmiTier1NewCoinsAmt = getStartOffset() + 388; // set offset for serialization

    beginMmiTier1UrgntCareAmt = getStartOffset() + 392; // set offset for serialization

    beginMmiTier1UrgntCareOopCd = getStartOffset() + 395; // set offset for serialization

    beginMmiTravBenMktNbr = getStartOffset() + 396; // set offset for serialization

    beginMmiTravBenTblNbr = getStartOffset() + 400; // set offset for serialization

    beginMmiUhpCd = getStartOffset() + 404; // set offset for serialization

    beginMmiUrgntCareAmt = getStartOffset() + 405; // set offset for serialization

    beginMmiVarPrdFct = getStartOffset() + 408; // set offset for serialization

    beginMmiXtraTerrStMandInd = getStartOffset() + 410; // set offset for serialization

    beginMmiRsnCustyPrdCd = getStartOffset() + 411; // set offset for serialization

    beginMmiDfltChrgPct = getStartOffset() + 412; // set offset for serialization

    beginMmiFaclShrSvCd = getStartOffset() + 415; // set offset for serialization

    beginMmiPhysnShrSvCd = getStartOffset() + 416; // set offset for serialization

    beginMmiCptnXclsInd = getStartOffset() + 417; // set offset for serialization

    beginMmiObsolete1 = getStartOffset() + 418; // set offset for serialization

    beginMmiNewCoinsAccumCd = getStartOffset() + 422; // set offset for serialization

    beginMmiErisaInd = getStartOffset() + 423; // set offset for serialization

    beginMmiBhvHlthVendCd = getStartOffset() + 424; // set offset for serialization

    beginMmiEapVendCd = getStartOffset() + 425; // set offset for serialization

    beginMmiVisnCd = getStartOffset() + 426; // set offset for serialization

    beginMmiFaclClmEdtInd = getStartOffset() + 427; // set offset for serialization

    beginMmiPlnFturCd = getStartOffset() + 428; // set offset for serialization

    beginMmiFundTypCd = getStartOffset() + 430; // set offset for serialization

    beginMmiRxSbscrIdTypCd = getStartOffset() + 431; // set offset for serialization

    beginMmiPrdctCdId = getStartOffset() + 432; // set offset for serialization

    beginMmiEnrpEmrgFaclInd = getStartOffset() + 436; // set offset for serialization

    beginMmiEmergentWrpInd = getStartOffset() + 437; // set offset for serialization

    beginMmiOopMaxCovCd = getStartOffset() + 438; // set offset for serialization

    beginMmiOncPolPrtcpCd = getStartOffset() + 439; // set offset for serialization

    beginMmiPlnFturInd = getStartOffset() + 440; // set offset for serialization

    beginMmiSrvcCdASetInd = getStartOffset() + 441; // set offset for serialization

    beginMmiSrvcCdBSetInd = getStartOffset() + 442; // set offset for serialization

    beginMmiSrvcCdCSetInd = getStartOffset() + 443; // set offset for serialization

    beginMmiSrvcCdDSetInd = getStartOffset() + 444; // set offset for serialization

    beginMmiSrvcCdESetInd = getStartOffset() + 445; // set offset for serialization

    beginMmiSrvcCdFSetInd = getStartOffset() + 446; // set offset for serialization

    beginMmiSrvcCdGSetInd = getStartOffset() + 447; // set offset for serialization

    beginMmiSrvcCdHSetInd = getStartOffset() + 448; // set offset for serialization

    beginMmiSrvcCdISetInd = getStartOffset() + 449; // set offset for serialization

    beginMmiSrvcCdJSetInd = getStartOffset() + 450; // set offset for serialization

    beginMmiSrvcCdKSetInd = getStartOffset() + 451; // set offset for serialization

    beginMmiSrvcCdLSetInd = getStartOffset() + 452; // set offset for serialization

    beginMmiSrvcCdMSetInd = getStartOffset() + 453; // set offset for serialization

    beginMmiSrvcCdOSetInd = getStartOffset() + 454; // set offset for serialization

    beginMmiSrvcCdQSetInd = getStartOffset() + 455; // set offset for serialization

    beginMmiSrvcCdRSetInd = getStartOffset() + 456; // set offset for serialization

    beginMmiSrvcCdSSetInd = getStartOffset() + 457; // set offset for serialization

    beginMmiSrvcCdUSetInd = getStartOffset() + 458; // set offset for serialization

    beginMmiSrvcCdVSetInd = getStartOffset() + 459; // set offset for serialization

    beginMmiSrvcCdWSetInd = getStartOffset() + 460; // set offset for serialization

    beginMmiSrvcCdXSetInd = getStartOffset() + 461; // set offset for serialization

    beginMmiSrvcCdYSetInd = getStartOffset() + 462; // set offset for serialization

    beginMmiSrvcCdZSetInd = getStartOffset() + 463; // set offset for serialization

    beginMmiNonEmbdCopayCd = getStartOffset() + 464; // set offset for serialization

    beginMmiNonEmbdCoreOopCd = getStartOffset() + 465; // set offset for serialization

    beginMmiNewCoinsDedTypCd = getStartOffset() + 466; // set offset for serialization

    beginMmiNewCoinsIndvMinPct = getStartOffset() + 467; // set offset for serialization

    beginMmiNewCoinsIndvMaxPct = getStartOffset() + 470; // set offset for serialization

    beginMmiNonEmbdNewCoinsCd = getStartOffset() + 473; // set offset for serialization

    beginMmiNonEmbdCoreDedCd = getStartOffset() + 474; // set offset for serialization

    beginMmiIndvOopCd = getStartOffset() + 475; // set offset for serialization

    beginMmiIndvPrdCd = getStartOffset() + 476; // set offset for serialization

    beginMmiIndvSalryTypCd = getStartOffset() + 477; // set offset for serialization

    beginMmiFamSalryTypCd = getStartOffset() + 478; // set offset for serialization

    beginMmiFamMultPct = getStartOffset() + 479; // set offset for serialization

    beginMmiFamVal = getStartOffset() + 482; // set offset for serialization

    beginMmiXapplyOopCd = getStartOffset() + 483; // set offset for serialization

    beginMmiIndvCopayCaroCd = getStartOffset() + 484; // set offset for serialization

    beginMmiXapplyCopayCd = getStartOffset() + 485; // set offset for serialization

    beginMmiCoreOopNcapInd = getStartOffset() + 486; // set offset for serialization

    beginMmiMnnrpLabPct = getStartOffset() + 487; // set offset for serialization

    beginMmiMnnrpDmePct = getStartOffset() + 490; // set offset for serialization

    beginMmiOonLftmMaxAmt = getStartOffset() + 493; // set offset for serialization

    beginMmiBusSegPltfm = getStartOffset() + 497; // set offset for serialization

    beginMmiSviTblTerNbr = getStartOffset() + 500; // set offset for serialization

    beginMmiRelSrvcInd = getStartOffset() + 506; // set offset for serialization

    beginMmiCoreMedPrrAuthCd = getStartOffset() + 507; // set offset for serialization

    beginMmiPcpBenLvlRule = getStartOffset() + 508; // set offset for serialization

    beginMmiMcrCd = getStartOffset() + 509; // set offset for serialization

    beginMmiLmtSrvcCd = getStartOffset() + 510; // set offset for serialization

    beginMmiEligXrefCd = getStartOffset() + 511; // set offset for serialization

    beginMmiBenMaxAuralCiPriCd = getStartOffset() + 512; // set offset for serialization

    beginMmiBenMaxAuralCiPriCnt = getStartOffset() + 513; // set offset for serialization

    beginMmiBenMaxAuralCiSecCd = getStartOffset() + 515; // set offset for serialization

    beginMmiBenMaxAuralCiSecCnt = getStartOffset() + 516; // set offset for serialization

    beginMmiBenMaxCogTrpyPriCd = getStartOffset() + 518; // set offset for serialization

    beginMmiBenMaxCogTrpyPriCnt = getStartOffset() + 519; // set offset for serialization

    beginMmiBenMaxCogTrpySecCd = getStartOffset() + 521; // set offset for serialization

    beginMmiBenMaxCogTrpySecCnt = getStartOffset() + 522; // set offset for serialization

    beginMmiBenMaxCogTrpyExclCd = getStartOffset() + 524; // set offset for serialization

    beginMmiBenMaxEhbSpneRhabCnt = getStartOffset() + 525; // set offset for serialization

    beginMmiBenMaxEhbSpneHabCnt = getStartOffset() + 527; // set offset for serialization

    beginMmiBenMaxEhbPtRhabCnt = getStartOffset() + 529; // set offset for serialization

    beginMmiBenMaxEhbPtHabCnt = getStartOffset() + 531; // set offset for serialization

    beginMmiBenMaxEhbSpchRhabCnt = getStartOffset() + 533; // set offset for serialization

    beginMmiBenMaxEhbSpchHabCnt = getStartOffset() + 535; // set offset for serialization

    beginMmiBenMaxEhbCrdcRhabCnt = getStartOffset() + 537; // set offset for serialization

    beginMmiBenMaxEhbOtRhabCnt = getStartOffset() + 539; // set offset for serialization

    beginMmiBenMaxEhbOtHabCnt = getStartOffset() + 541; // set offset for serialization

    beginMmiBenMaxEhbPlmryRhabCnt = getStartOffset() + 543; // set offset for serialization

    beginMmiBenMaxEhbAuralRhabCnt = getStartOffset() + 545; // set offset for serialization

    beginMmiBenMaxEhbAuralHabCnt = getStartOffset() + 547; // set offset for serialization

    beginMmiBenMaxEhbCogRhabCnt = getStartOffset() + 549; // set offset for serialization

    beginMmiBenMaxEhbCogHabCnt = getStartOffset() + 551; // set offset for serialization

    beginMmiBenMaxEhbPostRhabCnt = getStartOffset() + 553; // set offset for serialization

    beginMmiBenMaxEhbPostHabCnt = getStartOffset() + 555; // set offset for serialization

    beginMmiBenMaxEhbPtotRhabCnt = getStartOffset() + 557; // set offset for serialization

    beginMmiBenMaxEhbPtotHabCnt = getStartOffset() + 559; // set offset for serialization

    beginMmiBenMaxEhbRhabRmrkCd = getStartOffset() + 561; // set offset for serialization

    beginMmiBenMaxEhbPosmRhabCnt = getStartOffset() + 564; // set offset for serialization

    beginMmiBenMaxEhbPosmHabCnt = getStartOffset() + 566; // set offset for serialization

    beginMmiBenMaxEhbHabRmrkCd = getStartOffset() + 568; // set offset for serialization

    beginMmiBenPhysMedcnPrdCd = getStartOffset() + 571; // set offset for serialization

    beginMmiBenAutsmAgeYrFrVal = getStartOffset() + 572; // set offset for serialization

    beginMmiBenAutsmAgeYrToVal = getStartOffset() + 574; // set offset for serialization

    beginMmiBenAutsmPostCd = getStartOffset() + 576; // set offset for serialization

    beginMmiBenAutsmAllCd = getStartOffset() + 577; // set offset for serialization

    beginMmiBenMaxPlmryRehbPriCd = getStartOffset() + 578; // set offset for serialization

    beginMmiBenMaxPlmryRehbSecCd = getStartOffset() + 579; // set offset for serialization

    beginMmiBenMaxPlmryRehbSecCnt = getStartOffset() + 580; // set offset for serialization

    beginMmiSiteSrvcPrtcpCd = getStartOffset() + 582; // set offset for serialization

    beginMmiBenAutsm2AgeYrFrVal = getStartOffset() + 583; // set offset for serialization

    beginMmiBenAutsm2AgeYrToVal = getStartOffset() + 585; // set offset for serialization

    beginMmiBenAutsm2PostCd = getStartOffset() + 587; // set offset for serialization

    beginMmiBenAutsm2AllCd = getStartOffset() + 588; // set offset for serialization

    /*  end of offset */
  }

  int localMmiCovTypCdCounter = -1;

  public boolean isMmiCovTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiCovTypCdCounter != sharedCounter;
    localMmiCovTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_COV_TYP_CD_LEN = 1;
  /** serialize this MmiCovTypCd */
  protected void serializeMmiCovTypCd(char[] mmiCovTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiCovTypCd, 0, getStringValue(), beginMmiCovTypCd, MMI_COV_TYP_CD_LEN);
    localMmiCovTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiCovTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiCovTypCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshMmiCovTypCd() {
    return (substring(getStringValue(), beginMmiCovTypCd, beginMmiCovTypCd + MMI_COV_TYP_CD_LEN));
  }

  int localMmiPolNbrCounter = -1;

  public boolean isMmiPolNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiPolNbrCounter != sharedCounter;
    localMmiPolNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_POL_NBR_LEN = 6;
  /** serialize this MmiPolNbr */
  protected void serializeMmiPolNbr(char[] mmiPolNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiPolNbr, 0, getStringValue(), beginMmiPolNbr, MMI_POL_NBR_LEN);
    localMmiPolNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiPolNbrConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshMmiPolNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshMmiPolNbr() {
    return (substring(getStringValue(), beginMmiPolNbr, beginMmiPolNbr + MMI_POL_NBR_LEN));
  }

  int localMmiPlnNbrCounter = -1;

  public boolean isMmiPlnNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiPlnNbrCounter != sharedCounter;
    localMmiPlnNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_PLN_NBR_LEN = 4;
  /** serialize this MmiPlnNbr */
  protected void serializeMmiPlnNbr(char[] mmiPlnNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiPlnNbr, 0, getStringValue(), beginMmiPlnNbr, MMI_PLN_NBR_LEN);
    localMmiPlnNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiPlnNbrConstraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshMmiPlnNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshMmiPlnNbr() {
    return (substring(getStringValue(), beginMmiPlnNbr, beginMmiPlnNbr + MMI_PLN_NBR_LEN));
  }

  int localMmiClssNbrCounter = -1;

  public boolean isMmiClssNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiClssNbrCounter != sharedCounter;
    localMmiClssNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_CLSS_NBR_LEN = 4;
  /** serialize this MmiClssNbr */
  protected void serializeMmiClssNbr(char[] mmiClssNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiClssNbr, 0, getStringValue(), beginMmiClssNbr, MMI_CLSS_NBR_LEN);
    localMmiClssNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiClssNbrConstraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshMmiClssNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshMmiClssNbr() {
    return (substring(getStringValue(), beginMmiClssNbr, beginMmiClssNbr + MMI_CLSS_NBR_LEN));
  }

  int localMmiObsoleteCounter = -1;

  public boolean isMmiObsoleteModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiObsoleteCounter != sharedCounter;
    localMmiObsoleteCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_OBSOLETE_LEN = 6;
  /** serialize this MmiObsolete */
  protected void serializeMmiObsolete(char[] mmiObsolete) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiObsolete, 0, getStringValue(), beginMmiObsolete, MMI_OBSOLETE_LEN);
    localMmiObsoleteCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiObsoleteConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshMmiObsolete is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshMmiObsolete() {
    return (substring(getStringValue(), beginMmiObsolete, beginMmiObsolete + MMI_OBSOLETE_LEN));
  }

  int localMmiSlotTblIdCounter = -1;

  public boolean isMmiSlotTblIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiSlotTblIdCounter != sharedCounter;
    localMmiSlotTblIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_SLOT_TBL_ID_LEN = 6;
  /** serialize this MmiSlotTblId */
  protected void serializeMmiSlotTblId(char[] mmiSlotTblId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiSlotTblId, 0, getStringValue(), beginMmiSlotTblId, MMI_SLOT_TBL_ID_LEN);
    localMmiSlotTblIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiSlotTblIdConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshMmiSlotTblId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiSlotTblId() {
    return (substring(
        getStringValue(), beginMmiSlotTblId, beginMmiSlotTblId + MMI_SLOT_TBL_ID_LEN));
  }

  int localMmiObligIdCounter = -1;

  public boolean isMmiObligIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiObligIdCounter != sharedCounter;
    localMmiObligIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_OBLIG_ID_LEN = 2;
  /** serialize this MmiObligId */
  protected void serializeMmiObligId(char[] mmiObligId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiObligId, 0, getStringValue(), beginMmiObligId, MMI_OBLIG_ID_LEN);
    localMmiObligIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiObligIdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshMmiObligId is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshMmiObligId() {
    return (substring(getStringValue(), beginMmiObligId, beginMmiObligId + MMI_OBLIG_ID_LEN));
  }

  int localMmiShrArngCdCounter = -1;

  public boolean isMmiShrArngCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiShrArngCdCounter != sharedCounter;
    localMmiShrArngCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_SHR_ARNG_CD_LEN = 2;
  /** serialize this MmiShrArngCd */
  protected void serializeMmiShrArngCd(char[] mmiShrArngCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiShrArngCd, 0, getStringValue(), beginMmiShrArngCd, MMI_SHR_ARNG_CD_LEN);
    localMmiShrArngCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiShrArngCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshMmiShrArngCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiShrArngCd() {
    return (substring(
        getStringValue(), beginMmiShrArngCd, beginMmiShrArngCd + MMI_SHR_ARNG_CD_LEN));
  }

  int localMmiRcprctyTblIdCounter = -1;

  public boolean isMmiRcprctyTblIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiRcprctyTblIdCounter != sharedCounter;
    localMmiRcprctyTblIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_RCPRCTY_TBL_ID_LEN = 6;
  /** serialize this MmiRcprctyTblId */
  protected void serializeMmiRcprctyTblId(char[] mmiRcprctyTblId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiRcprctyTblId, 0, getStringValue(), beginMmiRcprctyTblId, MMI_RCPRCTY_TBL_ID_LEN);
    localMmiRcprctyTblIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiRcprctyTblIdConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshMmiRcprctyTblId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiRcprctyTblId() {
    return (substring(
        getStringValue(), beginMmiRcprctyTblId, beginMmiRcprctyTblId + MMI_RCPRCTY_TBL_ID_LEN));
  }

  int localMmiNewOldSrvcIndCounter = -1;

  public boolean isMmiNewOldSrvcIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiNewOldSrvcIndCounter != sharedCounter;
    localMmiNewOldSrvcIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_NEW_OLD_SRVC_IND_LEN = 1;
  /** serialize this MmiNewOldSrvcInd */
  protected void serializeMmiNewOldSrvcInd(char[] mmiNewOldSrvcInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiNewOldSrvcInd, 0, getStringValue(), beginMmiNewOldSrvcInd, MMI_NEW_OLD_SRVC_IND_LEN);
    localMmiNewOldSrvcIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiNewOldSrvcIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiNewOldSrvcInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiNewOldSrvcInd() {
    return (substring(
        getStringValue(), beginMmiNewOldSrvcInd, beginMmiNewOldSrvcInd + MMI_NEW_OLD_SRVC_IND_LEN));
  }

  int localMmiCopayVarIdCounter = -1;

  public boolean isMmiCopayVarIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiCopayVarIdCounter != sharedCounter;
    localMmiCopayVarIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_COPAY_VAR_ID_LEN = 4;
  /** serializeMmiCopayVarId */
  protected void serializeMmiCopayVarId(int mmiCopayVarId) {
    replaceValue( //  save the value as string
        getBinaryString(mmiCopayVarId, MMI_COPAY_VAR_ID_LEN),
        beginMmiCopayVarId,
        MMI_COPAY_VAR_ID_LEN);
    localMmiCopayVarIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkMmiCopayVarIdMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshMmiCopayVarId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshMmiCopayVarId() {
    return (getInt(beginMmiCopayVarId));
  }

  int localMmiLstUpdtDttmCounter = -1;

  public boolean isMmiLstUpdtDttmModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiLstUpdtDttmCounter != sharedCounter;
    localMmiLstUpdtDttmCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_LST_UPDT_DTTM_LEN = 26;
  /** serialize this MmiLstUpdtDttm */
  protected void serializeMmiLstUpdtDttm(char[] mmiLstUpdtDttm) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiLstUpdtDttm, 0, getStringValue(), beginMmiLstUpdtDttm, MMI_LST_UPDT_DTTM_LEN);
    localMmiLstUpdtDttmCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiLstUpdtDttmConstraints(char[] value) {
    return super.checkConstraints(value, 26, false, false);
  }
  /**
   * refreshMmiLstUpdtDttm is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiLstUpdtDttm() {
    return (substring(
        getStringValue(), beginMmiLstUpdtDttm, beginMmiLstUpdtDttm + MMI_LST_UPDT_DTTM_LEN));
  }

  int localMmiLstUpdtIdCounter = -1;

  public boolean isMmiLstUpdtIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiLstUpdtIdCounter != sharedCounter;
    localMmiLstUpdtIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_LST_UPDT_ID_LEN = 9;
  /** serialize this MmiLstUpdtId */
  protected void serializeMmiLstUpdtId(char[] mmiLstUpdtId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiLstUpdtId, 0, getStringValue(), beginMmiLstUpdtId, MMI_LST_UPDT_ID_LEN);
    localMmiLstUpdtIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiLstUpdtIdConstraints(char[] value) {
    return super.checkConstraints(value, 9, false, false);
  }
  /**
   * refreshMmiLstUpdtId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiLstUpdtId() {
    return (substring(
        getStringValue(), beginMmiLstUpdtId, beginMmiLstUpdtId + MMI_LST_UPDT_ID_LEN));
  }

  int localMmiAllncCdCounter = -1;

  public boolean isMmiAllncCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiAllncCdCounter != sharedCounter;
    localMmiAllncCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_ALLNC_CD_LEN = 1;
  /** serialize this MmiAllncCd */
  protected void serializeMmiAllncCd(char[] mmiAllncCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiAllncCd, 0, getStringValue(), beginMmiAllncCd, MMI_ALLNC_CD_LEN);
    localMmiAllncCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiAllncCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiAllncCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshMmiAllncCd() {
    return (substring(getStringValue(), beginMmiAllncCd, beginMmiAllncCd + MMI_ALLNC_CD_LEN));
  }

  int localMmiBenMaxCombPriCdCounter = -1;

  public boolean isMmiBenMaxCombPriCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxCombPriCdCounter != sharedCounter;
    localMmiBenMaxCombPriCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_COMB_PRI_CD_LEN = 1;
  /** serialize this MmiBenMaxCombPriCd */
  protected void serializeMmiBenMaxCombPriCd(char[] mmiBenMaxCombPriCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiBenMaxCombPriCd,
        0,
        getStringValue(),
        beginMmiBenMaxCombPriCd,
        MMI_BEN_MAX_COMB_PRI_CD_LEN);
    localMmiBenMaxCombPriCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiBenMaxCombPriCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiBenMaxCombPriCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiBenMaxCombPriCd() {
    return (substring(
        getStringValue(),
        beginMmiBenMaxCombPriCd,
        beginMmiBenMaxCombPriCd + MMI_BEN_MAX_COMB_PRI_CD_LEN));
  }

  int localMmiBenMaxCombPriCntCounter = -1;

  public boolean isMmiBenMaxCombPriCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxCombPriCntCounter != sharedCounter;
    localMmiBenMaxCombPriCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_COMB_PRI_CNT_LEN = 2;
  /** serializeMmiBenMaxCombPriCnt */
  protected void serializeMmiBenMaxCombPriCnt(short mmiBenMaxCombPriCnt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenMaxCombPriCnt, MMI_BEN_MAX_COMB_PRI_CNT_LEN),
        beginMmiBenMaxCombPriCnt,
        MMI_BEN_MAX_COMB_PRI_CNT_LEN);
    localMmiBenMaxCombPriCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenMaxCombPriCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenMaxCombPriCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenMaxCombPriCnt() {
    return (getShort(beginMmiBenMaxCombPriCnt));
  }

  int localMmiBenMaxCombSecCdCounter = -1;

  public boolean isMmiBenMaxCombSecCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxCombSecCdCounter != sharedCounter;
    localMmiBenMaxCombSecCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_COMB_SEC_CD_LEN = 1;
  /** serialize this MmiBenMaxCombSecCd */
  protected void serializeMmiBenMaxCombSecCd(char[] mmiBenMaxCombSecCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiBenMaxCombSecCd,
        0,
        getStringValue(),
        beginMmiBenMaxCombSecCd,
        MMI_BEN_MAX_COMB_SEC_CD_LEN);
    localMmiBenMaxCombSecCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiBenMaxCombSecCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiBenMaxCombSecCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiBenMaxCombSecCd() {
    return (substring(
        getStringValue(),
        beginMmiBenMaxCombSecCd,
        beginMmiBenMaxCombSecCd + MMI_BEN_MAX_COMB_SEC_CD_LEN));
  }

  int localMmiBenMaxCombSecCntCounter = -1;

  public boolean isMmiBenMaxCombSecCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxCombSecCntCounter != sharedCounter;
    localMmiBenMaxCombSecCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_COMB_SEC_CNT_LEN = 2;
  /** serializeMmiBenMaxCombSecCnt */
  protected void serializeMmiBenMaxCombSecCnt(short mmiBenMaxCombSecCnt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenMaxCombSecCnt, MMI_BEN_MAX_COMB_SEC_CNT_LEN),
        beginMmiBenMaxCombSecCnt,
        MMI_BEN_MAX_COMB_SEC_CNT_LEN);
    localMmiBenMaxCombSecCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenMaxCombSecCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenMaxCombSecCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenMaxCombSecCnt() {
    return (getShort(beginMmiBenMaxCombSecCnt));
  }

  int localMmiBenMaxCrdcRehabPriCdCounter = -1;

  public boolean isMmiBenMaxCrdcRehabPriCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxCrdcRehabPriCdCounter != sharedCounter;
    localMmiBenMaxCrdcRehabPriCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_CRDC_REHAB_PRI_CD_LEN = 1;
  /** serialize this MmiBenMaxCrdcRehabPriCd */
  protected void serializeMmiBenMaxCrdcRehabPriCd(char[] mmiBenMaxCrdcRehabPriCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiBenMaxCrdcRehabPriCd,
        0,
        getStringValue(),
        beginMmiBenMaxCrdcRehabPriCd,
        MMI_BEN_MAX_CRDC_REHAB_PRI_CD_LEN);
    localMmiBenMaxCrdcRehabPriCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiBenMaxCrdcRehabPriCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiBenMaxCrdcRehabPriCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshMmiBenMaxCrdcRehabPriCd() {
    return (substring(
        getStringValue(),
        beginMmiBenMaxCrdcRehabPriCd,
        beginMmiBenMaxCrdcRehabPriCd + MMI_BEN_MAX_CRDC_REHAB_PRI_CD_LEN));
  }

  int localMmiBenMaxCrdcRehabPriCntCounter = -1;

  public boolean isMmiBenMaxCrdcRehabPriCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxCrdcRehabPriCntCounter != sharedCounter;
    localMmiBenMaxCrdcRehabPriCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_CRDC_REHAB_PRI_CNT_LEN = 2;
  /** serializeMmiBenMaxCrdcRehabPriCnt */
  protected void serializeMmiBenMaxCrdcRehabPriCnt(short mmiBenMaxCrdcRehabPriCnt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenMaxCrdcRehabPriCnt, MMI_BEN_MAX_CRDC_REHAB_PRI_CNT_LEN),
        beginMmiBenMaxCrdcRehabPriCnt,
        MMI_BEN_MAX_CRDC_REHAB_PRI_CNT_LEN);
    localMmiBenMaxCrdcRehabPriCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenMaxCrdcRehabPriCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenMaxCrdcRehabPriCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenMaxCrdcRehabPriCnt() {
    return (getShort(beginMmiBenMaxCrdcRehabPriCnt));
  }

  int localMmiBenMaxCrdcRehabSecCdCounter = -1;

  public boolean isMmiBenMaxCrdcRehabSecCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxCrdcRehabSecCdCounter != sharedCounter;
    localMmiBenMaxCrdcRehabSecCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_CRDC_REHAB_SEC_CD_LEN = 1;
  /** serialize this MmiBenMaxCrdcRehabSecCd */
  protected void serializeMmiBenMaxCrdcRehabSecCd(char[] mmiBenMaxCrdcRehabSecCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiBenMaxCrdcRehabSecCd,
        0,
        getStringValue(),
        beginMmiBenMaxCrdcRehabSecCd,
        MMI_BEN_MAX_CRDC_REHAB_SEC_CD_LEN);
    localMmiBenMaxCrdcRehabSecCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiBenMaxCrdcRehabSecCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiBenMaxCrdcRehabSecCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshMmiBenMaxCrdcRehabSecCd() {
    return (substring(
        getStringValue(),
        beginMmiBenMaxCrdcRehabSecCd,
        beginMmiBenMaxCrdcRehabSecCd + MMI_BEN_MAX_CRDC_REHAB_SEC_CD_LEN));
  }

  int localMmiBenMaxCrdcRehabSecCntCounter = -1;

  public boolean isMmiBenMaxCrdcRehabSecCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxCrdcRehabSecCntCounter != sharedCounter;
    localMmiBenMaxCrdcRehabSecCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_CRDC_REHAB_SEC_CNT_LEN = 2;
  /** serializeMmiBenMaxCrdcRehabSecCnt */
  protected void serializeMmiBenMaxCrdcRehabSecCnt(short mmiBenMaxCrdcRehabSecCnt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenMaxCrdcRehabSecCnt, MMI_BEN_MAX_CRDC_REHAB_SEC_CNT_LEN),
        beginMmiBenMaxCrdcRehabSecCnt,
        MMI_BEN_MAX_CRDC_REHAB_SEC_CNT_LEN);
    localMmiBenMaxCrdcRehabSecCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenMaxCrdcRehabSecCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenMaxCrdcRehabSecCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenMaxCrdcRehabSecCnt() {
    return (getShort(beginMmiBenMaxCrdcRehabSecCnt));
  }

  int localMmiBenMaxOcpTrpyPriCdCounter = -1;

  public boolean isMmiBenMaxOcpTrpyPriCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxOcpTrpyPriCdCounter != sharedCounter;
    localMmiBenMaxOcpTrpyPriCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_OCP_TRPY_PRI_CD_LEN = 1;
  /** serialize this MmiBenMaxOcpTrpyPriCd */
  protected void serializeMmiBenMaxOcpTrpyPriCd(char[] mmiBenMaxOcpTrpyPriCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiBenMaxOcpTrpyPriCd,
        0,
        getStringValue(),
        beginMmiBenMaxOcpTrpyPriCd,
        MMI_BEN_MAX_OCP_TRPY_PRI_CD_LEN);
    localMmiBenMaxOcpTrpyPriCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiBenMaxOcpTrpyPriCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiBenMaxOcpTrpyPriCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshMmiBenMaxOcpTrpyPriCd() {
    return (substring(
        getStringValue(),
        beginMmiBenMaxOcpTrpyPriCd,
        beginMmiBenMaxOcpTrpyPriCd + MMI_BEN_MAX_OCP_TRPY_PRI_CD_LEN));
  }

  int localMmiBenMaxOcpTrpyPriCntCounter = -1;

  public boolean isMmiBenMaxOcpTrpyPriCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxOcpTrpyPriCntCounter != sharedCounter;
    localMmiBenMaxOcpTrpyPriCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_OCP_TRPY_PRI_CNT_LEN = 2;
  /** serializeMmiBenMaxOcpTrpyPriCnt */
  protected void serializeMmiBenMaxOcpTrpyPriCnt(short mmiBenMaxOcpTrpyPriCnt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenMaxOcpTrpyPriCnt, MMI_BEN_MAX_OCP_TRPY_PRI_CNT_LEN),
        beginMmiBenMaxOcpTrpyPriCnt,
        MMI_BEN_MAX_OCP_TRPY_PRI_CNT_LEN);
    localMmiBenMaxOcpTrpyPriCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenMaxOcpTrpyPriCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenMaxOcpTrpyPriCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenMaxOcpTrpyPriCnt() {
    return (getShort(beginMmiBenMaxOcpTrpyPriCnt));
  }

  int localMmiBenMaxOcpTrpySecCdCounter = -1;

  public boolean isMmiBenMaxOcpTrpySecCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxOcpTrpySecCdCounter != sharedCounter;
    localMmiBenMaxOcpTrpySecCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_OCP_TRPY_SEC_CD_LEN = 1;
  /** serialize this MmiBenMaxOcpTrpySecCd */
  protected void serializeMmiBenMaxOcpTrpySecCd(char[] mmiBenMaxOcpTrpySecCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiBenMaxOcpTrpySecCd,
        0,
        getStringValue(),
        beginMmiBenMaxOcpTrpySecCd,
        MMI_BEN_MAX_OCP_TRPY_SEC_CD_LEN);
    localMmiBenMaxOcpTrpySecCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiBenMaxOcpTrpySecCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiBenMaxOcpTrpySecCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshMmiBenMaxOcpTrpySecCd() {
    return (substring(
        getStringValue(),
        beginMmiBenMaxOcpTrpySecCd,
        beginMmiBenMaxOcpTrpySecCd + MMI_BEN_MAX_OCP_TRPY_SEC_CD_LEN));
  }

  int localMmiBenMaxOcpTrpySecCntCounter = -1;

  public boolean isMmiBenMaxOcpTrpySecCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxOcpTrpySecCntCounter != sharedCounter;
    localMmiBenMaxOcpTrpySecCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_OCP_TRPY_SEC_CNT_LEN = 2;
  /** serializeMmiBenMaxOcpTrpySecCnt */
  protected void serializeMmiBenMaxOcpTrpySecCnt(short mmiBenMaxOcpTrpySecCnt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenMaxOcpTrpySecCnt, MMI_BEN_MAX_OCP_TRPY_SEC_CNT_LEN),
        beginMmiBenMaxOcpTrpySecCnt,
        MMI_BEN_MAX_OCP_TRPY_SEC_CNT_LEN);
    localMmiBenMaxOcpTrpySecCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenMaxOcpTrpySecCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenMaxOcpTrpySecCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenMaxOcpTrpySecCnt() {
    return (getShort(beginMmiBenMaxOcpTrpySecCnt));
  }

  int localMmiBenMaxPhOcSpchPriCdCounter = -1;

  public boolean isMmiBenMaxPhOcSpchPriCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxPhOcSpchPriCdCounter != sharedCounter;
    localMmiBenMaxPhOcSpchPriCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_PH_OC_SPCH_PRI_CD_LEN = 1;
  /** serialize this MmiBenMaxPhOcSpchPriCd */
  protected void serializeMmiBenMaxPhOcSpchPriCd(char[] mmiBenMaxPhOcSpchPriCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiBenMaxPhOcSpchPriCd,
        0,
        getStringValue(),
        beginMmiBenMaxPhOcSpchPriCd,
        MMI_BEN_MAX_PH_OC_SPCH_PRI_CD_LEN);
    localMmiBenMaxPhOcSpchPriCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiBenMaxPhOcSpchPriCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiBenMaxPhOcSpchPriCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshMmiBenMaxPhOcSpchPriCd() {
    return (substring(
        getStringValue(),
        beginMmiBenMaxPhOcSpchPriCd,
        beginMmiBenMaxPhOcSpchPriCd + MMI_BEN_MAX_PH_OC_SPCH_PRI_CD_LEN));
  }

  int localMmiBenMaxPhOcSpchPriCntCounter = -1;

  public boolean isMmiBenMaxPhOcSpchPriCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxPhOcSpchPriCntCounter != sharedCounter;
    localMmiBenMaxPhOcSpchPriCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_PH_OC_SPCH_PRI_CNT_LEN = 2;
  /** serializeMmiBenMaxPhOcSpchPriCnt */
  protected void serializeMmiBenMaxPhOcSpchPriCnt(short mmiBenMaxPhOcSpchPriCnt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenMaxPhOcSpchPriCnt, MMI_BEN_MAX_PH_OC_SPCH_PRI_CNT_LEN),
        beginMmiBenMaxPhOcSpchPriCnt,
        MMI_BEN_MAX_PH_OC_SPCH_PRI_CNT_LEN);
    localMmiBenMaxPhOcSpchPriCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenMaxPhOcSpchPriCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenMaxPhOcSpchPriCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenMaxPhOcSpchPriCnt() {
    return (getShort(beginMmiBenMaxPhOcSpchPriCnt));
  }

  int localMmiBenMaxPhOcSpchSecCdCounter = -1;

  public boolean isMmiBenMaxPhOcSpchSecCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxPhOcSpchSecCdCounter != sharedCounter;
    localMmiBenMaxPhOcSpchSecCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_PH_OC_SPCH_SEC_CD_LEN = 1;
  /** serialize this MmiBenMaxPhOcSpchSecCd */
  protected void serializeMmiBenMaxPhOcSpchSecCd(char[] mmiBenMaxPhOcSpchSecCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiBenMaxPhOcSpchSecCd,
        0,
        getStringValue(),
        beginMmiBenMaxPhOcSpchSecCd,
        MMI_BEN_MAX_PH_OC_SPCH_SEC_CD_LEN);
    localMmiBenMaxPhOcSpchSecCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiBenMaxPhOcSpchSecCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiBenMaxPhOcSpchSecCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshMmiBenMaxPhOcSpchSecCd() {
    return (substring(
        getStringValue(),
        beginMmiBenMaxPhOcSpchSecCd,
        beginMmiBenMaxPhOcSpchSecCd + MMI_BEN_MAX_PH_OC_SPCH_SEC_CD_LEN));
  }

  int localMmiBenMaxPhOcSpchSecCntCounter = -1;

  public boolean isMmiBenMaxPhOcSpchSecCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxPhOcSpchSecCntCounter != sharedCounter;
    localMmiBenMaxPhOcSpchSecCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_PH_OC_SPCH_SEC_CNT_LEN = 2;
  /** serializeMmiBenMaxPhOcSpchSecCnt */
  protected void serializeMmiBenMaxPhOcSpchSecCnt(short mmiBenMaxPhOcSpchSecCnt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenMaxPhOcSpchSecCnt, MMI_BEN_MAX_PH_OC_SPCH_SEC_CNT_LEN),
        beginMmiBenMaxPhOcSpchSecCnt,
        MMI_BEN_MAX_PH_OC_SPCH_SEC_CNT_LEN);
    localMmiBenMaxPhOcSpchSecCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenMaxPhOcSpchSecCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenMaxPhOcSpchSecCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenMaxPhOcSpchSecCnt() {
    return (getShort(beginMmiBenMaxPhOcSpchSecCnt));
  }

  int localMmiBenMaxPhOcTrpyPriCdCounter = -1;

  public boolean isMmiBenMaxPhOcTrpyPriCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxPhOcTrpyPriCdCounter != sharedCounter;
    localMmiBenMaxPhOcTrpyPriCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_PH_OC_TRPY_PRI_CD_LEN = 1;
  /** serialize this MmiBenMaxPhOcTrpyPriCd */
  protected void serializeMmiBenMaxPhOcTrpyPriCd(char[] mmiBenMaxPhOcTrpyPriCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiBenMaxPhOcTrpyPriCd,
        0,
        getStringValue(),
        beginMmiBenMaxPhOcTrpyPriCd,
        MMI_BEN_MAX_PH_OC_TRPY_PRI_CD_LEN);
    localMmiBenMaxPhOcTrpyPriCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiBenMaxPhOcTrpyPriCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiBenMaxPhOcTrpyPriCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshMmiBenMaxPhOcTrpyPriCd() {
    return (substring(
        getStringValue(),
        beginMmiBenMaxPhOcTrpyPriCd,
        beginMmiBenMaxPhOcTrpyPriCd + MMI_BEN_MAX_PH_OC_TRPY_PRI_CD_LEN));
  }

  int localMmiBenMaxPhOcTrpyPriCntCounter = -1;

  public boolean isMmiBenMaxPhOcTrpyPriCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxPhOcTrpyPriCntCounter != sharedCounter;
    localMmiBenMaxPhOcTrpyPriCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_PH_OC_TRPY_PRI_CNT_LEN = 2;
  /** serializeMmiBenMaxPhOcTrpyPriCnt */
  protected void serializeMmiBenMaxPhOcTrpyPriCnt(short mmiBenMaxPhOcTrpyPriCnt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenMaxPhOcTrpyPriCnt, MMI_BEN_MAX_PH_OC_TRPY_PRI_CNT_LEN),
        beginMmiBenMaxPhOcTrpyPriCnt,
        MMI_BEN_MAX_PH_OC_TRPY_PRI_CNT_LEN);
    localMmiBenMaxPhOcTrpyPriCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenMaxPhOcTrpyPriCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenMaxPhOcTrpyPriCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenMaxPhOcTrpyPriCnt() {
    return (getShort(beginMmiBenMaxPhOcTrpyPriCnt));
  }

  int localMmiBenMaxPhOcTrpySecCdCounter = -1;

  public boolean isMmiBenMaxPhOcTrpySecCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxPhOcTrpySecCdCounter != sharedCounter;
    localMmiBenMaxPhOcTrpySecCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_PH_OC_TRPY_SEC_CD_LEN = 1;
  /** serialize this MmiBenMaxPhOcTrpySecCd */
  protected void serializeMmiBenMaxPhOcTrpySecCd(char[] mmiBenMaxPhOcTrpySecCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiBenMaxPhOcTrpySecCd,
        0,
        getStringValue(),
        beginMmiBenMaxPhOcTrpySecCd,
        MMI_BEN_MAX_PH_OC_TRPY_SEC_CD_LEN);
    localMmiBenMaxPhOcTrpySecCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiBenMaxPhOcTrpySecCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiBenMaxPhOcTrpySecCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshMmiBenMaxPhOcTrpySecCd() {
    return (substring(
        getStringValue(),
        beginMmiBenMaxPhOcTrpySecCd,
        beginMmiBenMaxPhOcTrpySecCd + MMI_BEN_MAX_PH_OC_TRPY_SEC_CD_LEN));
  }

  int localMmiBenMaxPhOcTrpySecCntCounter = -1;

  public boolean isMmiBenMaxPhOcTrpySecCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxPhOcTrpySecCntCounter != sharedCounter;
    localMmiBenMaxPhOcTrpySecCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_PH_OC_TRPY_SEC_CNT_LEN = 2;
  /** serializeMmiBenMaxPhOcTrpySecCnt */
  protected void serializeMmiBenMaxPhOcTrpySecCnt(short mmiBenMaxPhOcTrpySecCnt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenMaxPhOcTrpySecCnt, MMI_BEN_MAX_PH_OC_TRPY_SEC_CNT_LEN),
        beginMmiBenMaxPhOcTrpySecCnt,
        MMI_BEN_MAX_PH_OC_TRPY_SEC_CNT_LEN);
    localMmiBenMaxPhOcTrpySecCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenMaxPhOcTrpySecCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenMaxPhOcTrpySecCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenMaxPhOcTrpySecCnt() {
    return (getShort(beginMmiBenMaxPhOcTrpySecCnt));
  }

  int localMmiBenMaxPhysTrpyPriCdCounter = -1;

  public boolean isMmiBenMaxPhysTrpyPriCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxPhysTrpyPriCdCounter != sharedCounter;
    localMmiBenMaxPhysTrpyPriCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_PHYS_TRPY_PRI_CD_LEN = 1;
  /** serialize this MmiBenMaxPhysTrpyPriCd */
  protected void serializeMmiBenMaxPhysTrpyPriCd(char[] mmiBenMaxPhysTrpyPriCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiBenMaxPhysTrpyPriCd,
        0,
        getStringValue(),
        beginMmiBenMaxPhysTrpyPriCd,
        MMI_BEN_MAX_PHYS_TRPY_PRI_CD_LEN);
    localMmiBenMaxPhysTrpyPriCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiBenMaxPhysTrpyPriCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiBenMaxPhysTrpyPriCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshMmiBenMaxPhysTrpyPriCd() {
    return (substring(
        getStringValue(),
        beginMmiBenMaxPhysTrpyPriCd,
        beginMmiBenMaxPhysTrpyPriCd + MMI_BEN_MAX_PHYS_TRPY_PRI_CD_LEN));
  }

  int localMmiBenMaxPhysTrpyPriCntCounter = -1;

  public boolean isMmiBenMaxPhysTrpyPriCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxPhysTrpyPriCntCounter != sharedCounter;
    localMmiBenMaxPhysTrpyPriCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_PHYS_TRPY_PRI_CNT_LEN = 2;
  /** serializeMmiBenMaxPhysTrpyPriCnt */
  protected void serializeMmiBenMaxPhysTrpyPriCnt(short mmiBenMaxPhysTrpyPriCnt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenMaxPhysTrpyPriCnt, MMI_BEN_MAX_PHYS_TRPY_PRI_CNT_LEN),
        beginMmiBenMaxPhysTrpyPriCnt,
        MMI_BEN_MAX_PHYS_TRPY_PRI_CNT_LEN);
    localMmiBenMaxPhysTrpyPriCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenMaxPhysTrpyPriCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenMaxPhysTrpyPriCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenMaxPhysTrpyPriCnt() {
    return (getShort(beginMmiBenMaxPhysTrpyPriCnt));
  }

  int localMmiBenMaxPhysTrpySecCdCounter = -1;

  public boolean isMmiBenMaxPhysTrpySecCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxPhysTrpySecCdCounter != sharedCounter;
    localMmiBenMaxPhysTrpySecCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_PHYS_TRPY_SEC_CD_LEN = 1;
  /** serialize this MmiBenMaxPhysTrpySecCd */
  protected void serializeMmiBenMaxPhysTrpySecCd(char[] mmiBenMaxPhysTrpySecCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiBenMaxPhysTrpySecCd,
        0,
        getStringValue(),
        beginMmiBenMaxPhysTrpySecCd,
        MMI_BEN_MAX_PHYS_TRPY_SEC_CD_LEN);
    localMmiBenMaxPhysTrpySecCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiBenMaxPhysTrpySecCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiBenMaxPhysTrpySecCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshMmiBenMaxPhysTrpySecCd() {
    return (substring(
        getStringValue(),
        beginMmiBenMaxPhysTrpySecCd,
        beginMmiBenMaxPhysTrpySecCd + MMI_BEN_MAX_PHYS_TRPY_SEC_CD_LEN));
  }

  int localMmiBenMaxPhysTrpySecCntCounter = -1;

  public boolean isMmiBenMaxPhysTrpySecCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxPhysTrpySecCntCounter != sharedCounter;
    localMmiBenMaxPhysTrpySecCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_PHYS_TRPY_SEC_CNT_LEN = 2;
  /** serializeMmiBenMaxPhysTrpySecCnt */
  protected void serializeMmiBenMaxPhysTrpySecCnt(short mmiBenMaxPhysTrpySecCnt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenMaxPhysTrpySecCnt, MMI_BEN_MAX_PHYS_TRPY_SEC_CNT_LEN),
        beginMmiBenMaxPhysTrpySecCnt,
        MMI_BEN_MAX_PHYS_TRPY_SEC_CNT_LEN);
    localMmiBenMaxPhysTrpySecCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenMaxPhysTrpySecCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenMaxPhysTrpySecCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenMaxPhysTrpySecCnt() {
    return (getShort(beginMmiBenMaxPhysTrpySecCnt));
  }

  int localMmiBenMaxPlmryRehbPriCntCounter = -1;

  public boolean isMmiBenMaxPlmryRehbPriCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxPlmryRehbPriCntCounter != sharedCounter;
    localMmiBenMaxPlmryRehbPriCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_PLMRY_REHB_PRI_CNT_LEN = 2;
  /** serializeMmiBenMaxPlmryRehbPriCnt */
  protected void serializeMmiBenMaxPlmryRehbPriCnt(short mmiBenMaxPlmryRehbPriCnt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenMaxPlmryRehbPriCnt, MMI_BEN_MAX_PLMRY_REHB_PRI_CNT_LEN),
        beginMmiBenMaxPlmryRehbPriCnt,
        MMI_BEN_MAX_PLMRY_REHB_PRI_CNT_LEN);
    localMmiBenMaxPlmryRehbPriCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenMaxPlmryRehbPriCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenMaxPlmryRehbPriCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenMaxPlmryRehbPriCnt() {
    return (getShort(beginMmiBenMaxPlmryRehbPriCnt));
  }

  int localMmiBenMaxSpchTrpyPriCdCounter = -1;

  public boolean isMmiBenMaxSpchTrpyPriCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxSpchTrpyPriCdCounter != sharedCounter;
    localMmiBenMaxSpchTrpyPriCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_SPCH_TRPY_PRI_CD_LEN = 1;
  /** serialize this MmiBenMaxSpchTrpyPriCd */
  protected void serializeMmiBenMaxSpchTrpyPriCd(char[] mmiBenMaxSpchTrpyPriCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiBenMaxSpchTrpyPriCd,
        0,
        getStringValue(),
        beginMmiBenMaxSpchTrpyPriCd,
        MMI_BEN_MAX_SPCH_TRPY_PRI_CD_LEN);
    localMmiBenMaxSpchTrpyPriCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiBenMaxSpchTrpyPriCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiBenMaxSpchTrpyPriCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshMmiBenMaxSpchTrpyPriCd() {
    return (substring(
        getStringValue(),
        beginMmiBenMaxSpchTrpyPriCd,
        beginMmiBenMaxSpchTrpyPriCd + MMI_BEN_MAX_SPCH_TRPY_PRI_CD_LEN));
  }

  int localMmiBenMaxSpchTrpyPriCntCounter = -1;

  public boolean isMmiBenMaxSpchTrpyPriCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxSpchTrpyPriCntCounter != sharedCounter;
    localMmiBenMaxSpchTrpyPriCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_SPCH_TRPY_PRI_CNT_LEN = 2;
  /** serializeMmiBenMaxSpchTrpyPriCnt */
  protected void serializeMmiBenMaxSpchTrpyPriCnt(short mmiBenMaxSpchTrpyPriCnt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenMaxSpchTrpyPriCnt, MMI_BEN_MAX_SPCH_TRPY_PRI_CNT_LEN),
        beginMmiBenMaxSpchTrpyPriCnt,
        MMI_BEN_MAX_SPCH_TRPY_PRI_CNT_LEN);
    localMmiBenMaxSpchTrpyPriCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenMaxSpchTrpyPriCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenMaxSpchTrpyPriCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenMaxSpchTrpyPriCnt() {
    return (getShort(beginMmiBenMaxSpchTrpyPriCnt));
  }

  int localMmiBenMaxSpchTrpySecCdCounter = -1;

  public boolean isMmiBenMaxSpchTrpySecCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxSpchTrpySecCdCounter != sharedCounter;
    localMmiBenMaxSpchTrpySecCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_SPCH_TRPY_SEC_CD_LEN = 1;
  /** serialize this MmiBenMaxSpchTrpySecCd */
  protected void serializeMmiBenMaxSpchTrpySecCd(char[] mmiBenMaxSpchTrpySecCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiBenMaxSpchTrpySecCd,
        0,
        getStringValue(),
        beginMmiBenMaxSpchTrpySecCd,
        MMI_BEN_MAX_SPCH_TRPY_SEC_CD_LEN);
    localMmiBenMaxSpchTrpySecCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiBenMaxSpchTrpySecCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiBenMaxSpchTrpySecCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshMmiBenMaxSpchTrpySecCd() {
    return (substring(
        getStringValue(),
        beginMmiBenMaxSpchTrpySecCd,
        beginMmiBenMaxSpchTrpySecCd + MMI_BEN_MAX_SPCH_TRPY_SEC_CD_LEN));
  }

  int localMmiBenMaxSpchTrpySecCntCounter = -1;

  public boolean isMmiBenMaxSpchTrpySecCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxSpchTrpySecCntCounter != sharedCounter;
    localMmiBenMaxSpchTrpySecCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_SPCH_TRPY_SEC_CNT_LEN = 2;
  /** serializeMmiBenMaxSpchTrpySecCnt */
  protected void serializeMmiBenMaxSpchTrpySecCnt(short mmiBenMaxSpchTrpySecCnt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenMaxSpchTrpySecCnt, MMI_BEN_MAX_SPCH_TRPY_SEC_CNT_LEN),
        beginMmiBenMaxSpchTrpySecCnt,
        MMI_BEN_MAX_SPCH_TRPY_SEC_CNT_LEN);
    localMmiBenMaxSpchTrpySecCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenMaxSpchTrpySecCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenMaxSpchTrpySecCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenMaxSpchTrpySecCnt() {
    return (getShort(beginMmiBenMaxSpchTrpySecCnt));
  }

  int localMmiBenMaxSpneMnipPriCdCounter = -1;

  public boolean isMmiBenMaxSpneMnipPriCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxSpneMnipPriCdCounter != sharedCounter;
    localMmiBenMaxSpneMnipPriCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_SPNE_MNIP_PRI_CD_LEN = 1;
  /** serialize this MmiBenMaxSpneMnipPriCd */
  protected void serializeMmiBenMaxSpneMnipPriCd(char[] mmiBenMaxSpneMnipPriCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiBenMaxSpneMnipPriCd,
        0,
        getStringValue(),
        beginMmiBenMaxSpneMnipPriCd,
        MMI_BEN_MAX_SPNE_MNIP_PRI_CD_LEN);
    localMmiBenMaxSpneMnipPriCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiBenMaxSpneMnipPriCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiBenMaxSpneMnipPriCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshMmiBenMaxSpneMnipPriCd() {
    return (substring(
        getStringValue(),
        beginMmiBenMaxSpneMnipPriCd,
        beginMmiBenMaxSpneMnipPriCd + MMI_BEN_MAX_SPNE_MNIP_PRI_CD_LEN));
  }

  int localMmiBenMaxSpneMnipPriCntCounter = -1;

  public boolean isMmiBenMaxSpneMnipPriCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxSpneMnipPriCntCounter != sharedCounter;
    localMmiBenMaxSpneMnipPriCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_SPNE_MNIP_PRI_CNT_LEN = 2;
  /** serializeMmiBenMaxSpneMnipPriCnt */
  protected void serializeMmiBenMaxSpneMnipPriCnt(short mmiBenMaxSpneMnipPriCnt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenMaxSpneMnipPriCnt, MMI_BEN_MAX_SPNE_MNIP_PRI_CNT_LEN),
        beginMmiBenMaxSpneMnipPriCnt,
        MMI_BEN_MAX_SPNE_MNIP_PRI_CNT_LEN);
    localMmiBenMaxSpneMnipPriCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenMaxSpneMnipPriCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenMaxSpneMnipPriCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenMaxSpneMnipPriCnt() {
    return (getShort(beginMmiBenMaxSpneMnipPriCnt));
  }

  int localMmiBenMaxSpneMnipSecCdCounter = -1;

  public boolean isMmiBenMaxSpneMnipSecCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxSpneMnipSecCdCounter != sharedCounter;
    localMmiBenMaxSpneMnipSecCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_SPNE_MNIP_SEC_CD_LEN = 1;
  /** serialize this MmiBenMaxSpneMnipSecCd */
  protected void serializeMmiBenMaxSpneMnipSecCd(char[] mmiBenMaxSpneMnipSecCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiBenMaxSpneMnipSecCd,
        0,
        getStringValue(),
        beginMmiBenMaxSpneMnipSecCd,
        MMI_BEN_MAX_SPNE_MNIP_SEC_CD_LEN);
    localMmiBenMaxSpneMnipSecCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiBenMaxSpneMnipSecCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiBenMaxSpneMnipSecCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshMmiBenMaxSpneMnipSecCd() {
    return (substring(
        getStringValue(),
        beginMmiBenMaxSpneMnipSecCd,
        beginMmiBenMaxSpneMnipSecCd + MMI_BEN_MAX_SPNE_MNIP_SEC_CD_LEN));
  }

  int localMmiBenMaxSpneMnipSecCntCounter = -1;

  public boolean isMmiBenMaxSpneMnipSecCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxSpneMnipSecCntCounter != sharedCounter;
    localMmiBenMaxSpneMnipSecCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_SPNE_MNIP_SEC_CNT_LEN = 2;
  /** serializeMmiBenMaxSpneMnipSecCnt */
  protected void serializeMmiBenMaxSpneMnipSecCnt(short mmiBenMaxSpneMnipSecCnt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenMaxSpneMnipSecCnt, MMI_BEN_MAX_SPNE_MNIP_SEC_CNT_LEN),
        beginMmiBenMaxSpneMnipSecCnt,
        MMI_BEN_MAX_SPNE_MNIP_SEC_CNT_LEN);
    localMmiBenMaxSpneMnipSecCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenMaxSpneMnipSecCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenMaxSpneMnipSecCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenMaxSpneMnipSecCnt() {
    return (getShort(beginMmiBenMaxSpneMnipSecCnt));
  }

  int localMmiCancDtCounter = -1;

  public boolean isMmiCancDtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiCancDtCounter != sharedCounter;
    localMmiCancDtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_CANC_DT_LEN = 10;
  /** serialize this MmiCancDt */
  protected void serializeMmiCancDt(char[] mmiCancDt) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiCancDt, 0, getStringValue(), beginMmiCancDt, MMI_CANC_DT_LEN);
    localMmiCancDtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiCancDtConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshMmiCancDt is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshMmiCancDt() {
    return (substring(getStringValue(), beginMmiCancDt, beginMmiCancDt + MMI_CANC_DT_LEN));
  }

  int localMmiCareMgtIndCounter = -1;

  public boolean isMmiCareMgtIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiCareMgtIndCounter != sharedCounter;
    localMmiCareMgtIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_CARE_MGT_IND_LEN = 1;
  /** serialize this MmiCareMgtInd */
  protected void serializeMmiCareMgtInd(char[] mmiCareMgtInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiCareMgtInd, 0, getStringValue(), beginMmiCareMgtInd, MMI_CARE_MGT_IND_LEN);
    localMmiCareMgtIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiCareMgtIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiCareMgtInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiCareMgtInd() {
    return (substring(
        getStringValue(), beginMmiCareMgtInd, beginMmiCareMgtInd + MMI_CARE_MGT_IND_LEN));
  }

  int localMmiChrpNtwkIndCounter = -1;

  public boolean isMmiChrpNtwkIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiChrpNtwkIndCounter != sharedCounter;
    localMmiChrpNtwkIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_CHRP_NTWK_IND_LEN = 1;
  /** serialize this MmiChrpNtwkInd */
  protected void serializeMmiChrpNtwkInd(char[] mmiChrpNtwkInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiChrpNtwkInd, 0, getStringValue(), beginMmiChrpNtwkInd, MMI_CHRP_NTWK_IND_LEN);
    localMmiChrpNtwkIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiChrpNtwkIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiChrpNtwkInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiChrpNtwkInd() {
    return (substring(
        getStringValue(), beginMmiChrpNtwkInd, beginMmiChrpNtwkInd + MMI_CHRP_NTWK_IND_LEN));
  }

  int localMmiClmAutoDenyIndCounter = -1;

  public boolean isMmiClmAutoDenyIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiClmAutoDenyIndCounter != sharedCounter;
    localMmiClmAutoDenyIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_CLM_AUTO_DENY_IND_LEN = 1;
  /** serialize this MmiClmAutoDenyInd */
  protected void serializeMmiClmAutoDenyInd(char[] mmiClmAutoDenyInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiClmAutoDenyInd, 0, getStringValue(), beginMmiClmAutoDenyInd, MMI_CLM_AUTO_DENY_IND_LEN);
    localMmiClmAutoDenyIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiClmAutoDenyIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiClmAutoDenyInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiClmAutoDenyInd() {
    return (substring(
        getStringValue(),
        beginMmiClmAutoDenyInd,
        beginMmiClmAutoDenyInd + MMI_CLM_AUTO_DENY_IND_LEN));
  }

  int localMmiCoinsCopayCdCounter = -1;

  public boolean isMmiCoinsCopayCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiCoinsCopayCdCounter != sharedCounter;
    localMmiCoinsCopayCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_COINS_COPAY_CD_LEN = 2;
  /** serialize this MmiCoinsCopayCd */
  protected void serializeMmiCoinsCopayCd(char[] mmiCoinsCopayCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiCoinsCopayCd, 0, getStringValue(), beginMmiCoinsCopayCd, MMI_COINS_COPAY_CD_LEN);
    localMmiCoinsCopayCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiCoinsCopayCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshMmiCoinsCopayCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiCoinsCopayCd() {
    return (substring(
        getStringValue(), beginMmiCoinsCopayCd, beginMmiCoinsCopayCd + MMI_COINS_COPAY_CD_LEN));
  }

  int localMmiCombPrscDedPriCdCounter = -1;

  public boolean isMmiCombPrscDedPriCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiCombPrscDedPriCdCounter != sharedCounter;
    localMmiCombPrscDedPriCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_COMB_PRSC_DED_PRI_CD_LEN = 1;
  /** serialize this MmiCombPrscDedPriCd */
  protected void serializeMmiCombPrscDedPriCd(char[] mmiCombPrscDedPriCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiCombPrscDedPriCd,
        0,
        getStringValue(),
        beginMmiCombPrscDedPriCd,
        MMI_COMB_PRSC_DED_PRI_CD_LEN);
    localMmiCombPrscDedPriCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiCombPrscDedPriCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiCombPrscDedPriCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshMmiCombPrscDedPriCd() {
    return (substring(
        getStringValue(),
        beginMmiCombPrscDedPriCd,
        beginMmiCombPrscDedPriCd + MMI_COMB_PRSC_DED_PRI_CD_LEN));
  }

  int localMmiCombPrscDedQualCdCounter = -1;

  public boolean isMmiCombPrscDedQualCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiCombPrscDedQualCdCounter != sharedCounter;
    localMmiCombPrscDedQualCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_COMB_PRSC_DED_QUAL_CD_LEN = 1;
  /** serialize this MmiCombPrscDedQualCd */
  protected void serializeMmiCombPrscDedQualCd(char[] mmiCombPrscDedQualCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiCombPrscDedQualCd,
        0,
        getStringValue(),
        beginMmiCombPrscDedQualCd,
        MMI_COMB_PRSC_DED_QUAL_CD_LEN);
    localMmiCombPrscDedQualCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiCombPrscDedQualCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiCombPrscDedQualCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshMmiCombPrscDedQualCd() {
    return (substring(
        getStringValue(),
        beginMmiCombPrscDedQualCd,
        beginMmiCombPrscDedQualCd + MMI_COMB_PRSC_DED_QUAL_CD_LEN));
  }

  int localMmiCombPrscDedSecCdCounter = -1;

  public boolean isMmiCombPrscDedSecCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiCombPrscDedSecCdCounter != sharedCounter;
    localMmiCombPrscDedSecCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_COMB_PRSC_DED_SEC_CD_LEN = 1;
  /** serialize this MmiCombPrscDedSecCd */
  protected void serializeMmiCombPrscDedSecCd(char[] mmiCombPrscDedSecCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiCombPrscDedSecCd,
        0,
        getStringValue(),
        beginMmiCombPrscDedSecCd,
        MMI_COMB_PRSC_DED_SEC_CD_LEN);
    localMmiCombPrscDedSecCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiCombPrscDedSecCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiCombPrscDedSecCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshMmiCombPrscDedSecCd() {
    return (substring(
        getStringValue(),
        beginMmiCombPrscDedSecCd,
        beginMmiCombPrscDedSecCd + MMI_COMB_PRSC_DED_SEC_CD_LEN));
  }

  int localMmiCombPrscDedTirCdCounter = -1;

  public boolean isMmiCombPrscDedTirCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiCombPrscDedTirCdCounter != sharedCounter;
    localMmiCombPrscDedTirCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_COMB_PRSC_DED_TIR_CD_LEN = 1;
  /** serialize this MmiCombPrscDedTirCd */
  protected void serializeMmiCombPrscDedTirCd(char[] mmiCombPrscDedTirCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiCombPrscDedTirCd,
        0,
        getStringValue(),
        beginMmiCombPrscDedTirCd,
        MMI_COMB_PRSC_DED_TIR_CD_LEN);
    localMmiCombPrscDedTirCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiCombPrscDedTirCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiCombPrscDedTirCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshMmiCombPrscDedTirCd() {
    return (substring(
        getStringValue(),
        beginMmiCombPrscDedTirCd,
        beginMmiCombPrscDedTirCd + MMI_COMB_PRSC_DED_TIR_CD_LEN));
  }

  int localMmiContrStCdCounter = -1;

  public boolean isMmiContrStCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiContrStCdCounter != sharedCounter;
    localMmiContrStCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_CONTR_ST_CD_LEN = 2;
  /** serialize this MmiContrStCd */
  protected void serializeMmiContrStCd(char[] mmiContrStCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiContrStCd, 0, getStringValue(), beginMmiContrStCd, MMI_CONTR_ST_CD_LEN);
    localMmiContrStCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiContrStCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshMmiContrStCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiContrStCd() {
    return (substring(
        getStringValue(), beginMmiContrStCd, beginMmiContrStCd + MMI_CONTR_ST_CD_LEN));
  }

  int localMmiCopayAmtCounter = -1;

  public boolean isMmiCopayAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiCopayAmtCounter != sharedCounter;
    localMmiCopayAmtCounter = sharedCounter;
    return hasModified;
  }

  public boolean mmiCopayAmtIsNumeric() {
    return decimalIsNumeric(
        beginMmiCopayAmt,
        MMI_COPAY_AMT_LEN); // check Packed Decimal field to see if it contains valid Number
  }
  /**
   * This method returns packed Decimal String in the mainframe format
   *
   * @return char[]
   */
  public char[] mmiCopayAmtString() {
    return getPackedString(beginMmiCopayAmt, MMI_COPAY_AMT_LEN);
  }

  protected static final int MMI_COPAY_AMT_LEN = 3;
  protected static final int MMI_COPAY_AMT_SCALE = 2;
  /** serializeMmiCopayAmt */
  protected void serializeMmiCopayAmt(BigDecimal mmiCopayAmt) {
    putDecimal(beginMmiCopayAmt, mmiCopayAmt, MMI_COPAY_AMT_LEN, MMI_COPAY_AMT_SCALE, true);
    localMmiCopayAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected BigDecimal checkMmiCopayAmtMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 5 /*precision*/);
  }
  /**
   * refreshMmiCopayAmt is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public BigDecimal refreshMmiCopayAmt() throws CFException {
    try {
      return (getDecimal(beginMmiCopayAmt, MMI_COPAY_AMT_LEN, MMI_COPAY_AMT_SCALE));
    } catch (Exception ex) {
      throw getSoc7ABend("mmiCopayAmt", beginMmiCopayAmt, MMI_COPAY_AMT_LEN);
    }
  }

  int localMmiCopayMaxAnnlAmtCounter = -1;

  public boolean isMmiCopayMaxAnnlAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiCopayMaxAnnlAmtCounter != sharedCounter;
    localMmiCopayMaxAnnlAmtCounter = sharedCounter;
    return hasModified;
  }

  public boolean mmiCopayMaxAnnlAmtIsNumeric() {
    return decimalIsNumeric(
        beginMmiCopayMaxAnnlAmt,
        MMI_COPAY_MAX_ANNL_AMT_LEN); // check Packed Decimal field to see if it contains valid
                                     // Number
  }
  /**
   * This method returns packed Decimal String in the mainframe format
   *
   * @return char[]
   */
  public char[] mmiCopayMaxAnnlAmtString() {
    return getPackedString(beginMmiCopayMaxAnnlAmt, MMI_COPAY_MAX_ANNL_AMT_LEN);
  }

  protected static final int MMI_COPAY_MAX_ANNL_AMT_LEN = 9;
  protected static final int MMI_COPAY_MAX_ANNL_AMT_SCALE = 2;
  /** serializeMmiCopayMaxAnnlAmt */
  protected void serializeMmiCopayMaxAnnlAmt(BigDecimal mmiCopayMaxAnnlAmt) {
    putDecimal(
        beginMmiCopayMaxAnnlAmt,
        mmiCopayMaxAnnlAmt,
        MMI_COPAY_MAX_ANNL_AMT_LEN,
        MMI_COPAY_MAX_ANNL_AMT_SCALE,
        true);
    localMmiCopayMaxAnnlAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected BigDecimal checkMmiCopayMaxAnnlAmtMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 16 /*precision*/);
  }
  /**
   * refreshMmiCopayMaxAnnlAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshMmiCopayMaxAnnlAmt() throws CFException {
    try {
      return (getDecimal(
          beginMmiCopayMaxAnnlAmt, MMI_COPAY_MAX_ANNL_AMT_LEN, MMI_COPAY_MAX_ANNL_AMT_SCALE));
    } catch (Exception ex) {
      throw getSoc7ABend("mmiCopayMaxAnnlAmt", beginMmiCopayMaxAnnlAmt, MMI_COPAY_MAX_ANNL_AMT_LEN);
    }
  }

  int localMmiCopayWaivTblIdCounter = -1;

  public boolean isMmiCopayWaivTblIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiCopayWaivTblIdCounter != sharedCounter;
    localMmiCopayWaivTblIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_COPAY_WAIV_TBL_ID_LEN = 6;
  /** serialize this MmiCopayWaivTblId */
  protected void serializeMmiCopayWaivTblId(char[] mmiCopayWaivTblId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiCopayWaivTblId, 0, getStringValue(), beginMmiCopayWaivTblId, MMI_COPAY_WAIV_TBL_ID_LEN);
    localMmiCopayWaivTblIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiCopayWaivTblIdConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshMmiCopayWaivTblId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiCopayWaivTblId() {
    return (substring(
        getStringValue(),
        beginMmiCopayWaivTblId,
        beginMmiCopayWaivTblId + MMI_COPAY_WAIV_TBL_ID_LEN));
  }

  int localMmiDiagVsSurgIndCounter = -1;

  public boolean isMmiDiagVsSurgIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiDiagVsSurgIndCounter != sharedCounter;
    localMmiDiagVsSurgIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_DIAG_VS_SURG_IND_LEN = 1;
  /** serialize this MmiDiagVsSurgInd */
  protected void serializeMmiDiagVsSurgInd(char[] mmiDiagVsSurgInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiDiagVsSurgInd, 0, getStringValue(), beginMmiDiagVsSurgInd, MMI_DIAG_VS_SURG_IND_LEN);
    localMmiDiagVsSurgIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiDiagVsSurgIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiDiagVsSurgInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiDiagVsSurgInd() {
    return (substring(
        getStringValue(), beginMmiDiagVsSurgInd, beginMmiDiagVsSurgInd + MMI_DIAG_VS_SURG_IND_LEN));
  }

  int localMmiDolTlrIndCounter = -1;

  public boolean isMmiDolTlrIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiDolTlrIndCounter != sharedCounter;
    localMmiDolTlrIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_DOL_TLR_IND_LEN = 1;
  /** serialize this MmiDolTlrInd */
  protected void serializeMmiDolTlrInd(char[] mmiDolTlrInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiDolTlrInd, 0, getStringValue(), beginMmiDolTlrInd, MMI_DOL_TLR_IND_LEN);
    localMmiDolTlrIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiDolTlrIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiDolTlrInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiDolTlrInd() {
    return (substring(
        getStringValue(), beginMmiDolTlrInd, beginMmiDolTlrInd + MMI_DOL_TLR_IND_LEN));
  }

  int localMmiDsesStTblNbrCounter = -1;

  public boolean isMmiDsesStTblNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiDsesStTblNbrCounter != sharedCounter;
    localMmiDsesStTblNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_DSES_ST_TBL_NBR_LEN = 6;
  /** serialize this MmiDsesStTblNbr */
  protected void serializeMmiDsesStTblNbr(char[] mmiDsesStTblNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiDsesStTblNbr, 0, getStringValue(), beginMmiDsesStTblNbr, MMI_DSES_ST_TBL_NBR_LEN);
    localMmiDsesStTblNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiDsesStTblNbrConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshMmiDsesStTblNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiDsesStTblNbr() {
    return (substring(
        getStringValue(), beginMmiDsesStTblNbr, beginMmiDsesStTblNbr + MMI_DSES_ST_TBL_NBR_LEN));
  }

  int localMmiEffDtCounter = -1;

  public boolean isMmiEffDtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiEffDtCounter != sharedCounter;
    localMmiEffDtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_EFF_DT_LEN = 10;
  /** serialize this MmiEffDt */
  protected void serializeMmiEffDt(char[] mmiEffDt) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiEffDt, 0, getStringValue(), beginMmiEffDt, MMI_EFF_DT_LEN);
    localMmiEffDtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiEffDtConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshMmiEffDt is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshMmiEffDt() {
    return (substring(getStringValue(), beginMmiEffDt, beginMmiEffDt + MMI_EFF_DT_LEN));
  }

  int localMmiEmrgParsNtfyIndCounter = -1;

  public boolean isMmiEmrgParsNtfyIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiEmrgParsNtfyIndCounter != sharedCounter;
    localMmiEmrgParsNtfyIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_EMRG_PARS_NTFY_IND_LEN = 1;
  /** serialize this MmiEmrgParsNtfyInd */
  protected void serializeMmiEmrgParsNtfyInd(char[] mmiEmrgParsNtfyInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiEmrgParsNtfyInd,
        0,
        getStringValue(),
        beginMmiEmrgParsNtfyInd,
        MMI_EMRG_PARS_NTFY_IND_LEN);
    localMmiEmrgParsNtfyIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiEmrgParsNtfyIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiEmrgParsNtfyInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiEmrgParsNtfyInd() {
    return (substring(
        getStringValue(),
        beginMmiEmrgParsNtfyInd,
        beginMmiEmrgParsNtfyInd + MMI_EMRG_PARS_NTFY_IND_LEN));
  }

  int localMmiEmrgParsNtfyPrdCdCounter = -1;

  public boolean isMmiEmrgParsNtfyPrdCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiEmrgParsNtfyPrdCdCounter != sharedCounter;
    localMmiEmrgParsNtfyPrdCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_EMRG_PARS_NTFY_PRD_CD_LEN = 1;
  /** serialize this MmiEmrgParsNtfyPrdCd */
  protected void serializeMmiEmrgParsNtfyPrdCd(char[] mmiEmrgParsNtfyPrdCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiEmrgParsNtfyPrdCd,
        0,
        getStringValue(),
        beginMmiEmrgParsNtfyPrdCd,
        MMI_EMRG_PARS_NTFY_PRD_CD_LEN);
    localMmiEmrgParsNtfyPrdCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiEmrgParsNtfyPrdCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiEmrgParsNtfyPrdCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshMmiEmrgParsNtfyPrdCd() {
    return (substring(
        getStringValue(),
        beginMmiEmrgParsNtfyPrdCd,
        beginMmiEmrgParsNtfyPrdCd + MMI_EMRG_PARS_NTFY_PRD_CD_LEN));
  }

  int localMmiEvdBasDialgIndCounter = -1;

  public boolean isMmiEvdBasDialgIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiEvdBasDialgIndCounter != sharedCounter;
    localMmiEvdBasDialgIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_EVD_BAS_DIALG_IND_LEN = 1;
  /** serialize this MmiEvdBasDialgInd */
  protected void serializeMmiEvdBasDialgInd(char[] mmiEvdBasDialgInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiEvdBasDialgInd, 0, getStringValue(), beginMmiEvdBasDialgInd, MMI_EVD_BAS_DIALG_IND_LEN);
    localMmiEvdBasDialgIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiEvdBasDialgIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiEvdBasDialgInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiEvdBasDialgInd() {
    return (substring(
        getStringValue(),
        beginMmiEvdBasDialgInd,
        beginMmiEvdBasDialgInd + MMI_EVD_BAS_DIALG_IND_LEN));
  }

  int localMmiEciTblIdCounter = -1;

  public boolean isMmiEciTblIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiEciTblIdCounter != sharedCounter;
    localMmiEciTblIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_ECI_TBL_ID_LEN = 6;
  /** serialize this MmiEciTblId */
  protected void serializeMmiEciTblId(char[] mmiEciTblId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiEciTblId, 0, getStringValue(), beginMmiEciTblId, MMI_ECI_TBL_ID_LEN);
    localMmiEciTblIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiEciTblIdConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshMmiEciTblId is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshMmiEciTblId() {
    return (substring(getStringValue(), beginMmiEciTblId, beginMmiEciTblId + MMI_ECI_TBL_ID_LEN));
  }

  int localMmiEviTblIdCounter = -1;

  public boolean isMmiEviTblIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiEviTblIdCounter != sharedCounter;
    localMmiEviTblIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_EVI_TBL_ID_LEN = 6;
  /** serialize this MmiEviTblId */
  protected void serializeMmiEviTblId(char[] mmiEviTblId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiEviTblId, 0, getStringValue(), beginMmiEviTblId, MMI_EVI_TBL_ID_LEN);
    localMmiEviTblIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiEviTblIdConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshMmiEviTblId is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshMmiEviTblId() {
    return (substring(getStringValue(), beginMmiEviTblId, beginMmiEviTblId + MMI_EVI_TBL_ID_LEN));
  }

  int localMmiFamMbrCntCounter = -1;

  public boolean isMmiFamMbrCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiFamMbrCntCounter != sharedCounter;
    localMmiFamMbrCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_FAM_MBR_CNT_LEN = 2;
  /** serializeMmiFamMbrCnt */
  protected void serializeMmiFamMbrCnt(short mmiFamMbrCnt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiFamMbrCnt, MMI_FAM_MBR_CNT_LEN), beginMmiFamMbrCnt, MMI_FAM_MBR_CNT_LEN);
    localMmiFamMbrCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiFamMbrCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiFamMbrCnt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshMmiFamMbrCnt() {
    return (getShort(beginMmiFamMbrCnt));
  }

  int localMmiFamNewCoinsAmtCounter = -1;

  public boolean isMmiFamNewCoinsAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiFamNewCoinsAmtCounter != sharedCounter;
    localMmiFamNewCoinsAmtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_FAM_NEW_COINS_AMT_LEN = 4;
  /** serializeMmiFamNewCoinsAmt */
  protected void serializeMmiFamNewCoinsAmt(int mmiFamNewCoinsAmt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiFamNewCoinsAmt, MMI_FAM_NEW_COINS_AMT_LEN),
        beginMmiFamNewCoinsAmt,
        MMI_FAM_NEW_COINS_AMT_LEN);
    localMmiFamNewCoinsAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkMmiFamNewCoinsAmtMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshMmiFamNewCoinsAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshMmiFamNewCoinsAmt() {
    return (getInt(beginMmiFamNewCoinsAmt));
  }

  int localMmiFamTxtSwapCdCounter = -1;

  public boolean isMmiFamTxtSwapCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiFamTxtSwapCdCounter != sharedCounter;
    localMmiFamTxtSwapCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_FAM_TXT_SWAP_CD_LEN = 1;
  /** serialize this MmiFamTxtSwapCd */
  protected void serializeMmiFamTxtSwapCd(char[] mmiFamTxtSwapCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiFamTxtSwapCd, 0, getStringValue(), beginMmiFamTxtSwapCd, MMI_FAM_TXT_SWAP_CD_LEN);
    localMmiFamTxtSwapCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiFamTxtSwapCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiFamTxtSwapCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiFamTxtSwapCd() {
    return (substring(
        getStringValue(), beginMmiFamTxtSwapCd, beginMmiFamTxtSwapCd + MMI_FAM_TXT_SWAP_CD_LEN));
  }

  int localMmiFertCtrcptvCdCounter = -1;

  public boolean isMmiFertCtrcptvCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiFertCtrcptvCdCounter != sharedCounter;
    localMmiFertCtrcptvCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_FERT_CTRCPTV_CD_LEN = 1;
  /** serialize this MmiFertCtrcptvCd */
  protected void serializeMmiFertCtrcptvCd(char[] mmiFertCtrcptvCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiFertCtrcptvCd, 0, getStringValue(), beginMmiFertCtrcptvCd, MMI_FERT_CTRCPTV_CD_LEN);
    localMmiFertCtrcptvCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiFertCtrcptvCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiFertCtrcptvCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiFertCtrcptvCd() {
    return (substring(
        getStringValue(), beginMmiFertCtrcptvCd, beginMmiFertCtrcptvCd + MMI_FERT_CTRCPTV_CD_LEN));
  }

  int localMmiObsolete2Counter = -1;

  public boolean isMmiObsolete2Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiObsolete2Counter != sharedCounter;
    localMmiObsolete2Counter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_OBSOLETE_2_LEN = 2;
  /** serialize this MmiObsolete2 */
  protected void serializeMmiObsolete2(char[] mmiObsolete2) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiObsolete2, 0, getStringValue(), beginMmiObsolete2, MMI_OBSOLETE_2_LEN);
    localMmiObsolete2Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiObsolete2Constraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshMmiObsolete2 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiObsolete2() {
    return (substring(getStringValue(), beginMmiObsolete2, beginMmiObsolete2 + MMI_OBSOLETE_2_LEN));
  }

  int localMmiHiDedPlnCdCounter = -1;

  public boolean isMmiHiDedPlnCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiHiDedPlnCdCounter != sharedCounter;
    localMmiHiDedPlnCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_HI_DED_PLN_CD_LEN = 2;
  /** serialize this MmiHiDedPlnCd */
  protected void serializeMmiHiDedPlnCd(char[] mmiHiDedPlnCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiHiDedPlnCd, 0, getStringValue(), beginMmiHiDedPlnCd, MMI_HI_DED_PLN_CD_LEN);
    localMmiHiDedPlnCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiHiDedPlnCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshMmiHiDedPlnCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiHiDedPlnCd() {
    return (substring(
        getStringValue(), beginMmiHiDedPlnCd, beginMmiHiDedPlnCd + MMI_HI_DED_PLN_CD_LEN));
  }

  int localMmiIplanTypCdCounter = -1;

  public boolean isMmiIplanTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiIplanTypCdCounter != sharedCounter;
    localMmiIplanTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_IPLAN_TYP_CD_LEN = 1;
  /** serialize this MmiIplanTypCd */
  protected void serializeMmiIplanTypCd(char[] mmiIplanTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiIplanTypCd, 0, getStringValue(), beginMmiIplanTypCd, MMI_IPLAN_TYP_CD_LEN);
    localMmiIplanTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiIplanTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiIplanTypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiIplanTypCd() {
    return (substring(
        getStringValue(), beginMmiIplanTypCd, beginMmiIplanTypCd + MMI_IPLAN_TYP_CD_LEN));
  }

  int localMmiLftmMaxAmtCounter = -1;

  public boolean isMmiLftmMaxAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiLftmMaxAmtCounter != sharedCounter;
    localMmiLftmMaxAmtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_LFTM_MAX_AMT_LEN = 4;
  /** serializeMmiLftmMaxAmt */
  protected void serializeMmiLftmMaxAmt(int mmiLftmMaxAmt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiLftmMaxAmt, MMI_LFTM_MAX_AMT_LEN),
        beginMmiLftmMaxAmt,
        MMI_LFTM_MAX_AMT_LEN);
    localMmiLftmMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkMmiLftmMaxAmtMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshMmiLftmMaxAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshMmiLftmMaxAmt() {
    return (getInt(beginMmiLftmMaxAmt));
  }

  int localMmiMbrNtwkKeyMtchCdCounter = -1;

  public boolean isMmiMbrNtwkKeyMtchCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiMbrNtwkKeyMtchCdCounter != sharedCounter;
    localMmiMbrNtwkKeyMtchCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_MBR_NTWK_KEY_MTCH_CD_LEN = 1;
  /** serialize this MmiMbrNtwkKeyMtchCd */
  protected void serializeMmiMbrNtwkKeyMtchCd(char[] mmiMbrNtwkKeyMtchCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiMbrNtwkKeyMtchCd,
        0,
        getStringValue(),
        beginMmiMbrNtwkKeyMtchCd,
        MMI_MBR_NTWK_KEY_MTCH_CD_LEN);
    localMmiMbrNtwkKeyMtchCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiMbrNtwkKeyMtchCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiMbrNtwkKeyMtchCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshMmiMbrNtwkKeyMtchCd() {
    return (substring(
        getStringValue(),
        beginMmiMbrNtwkKeyMtchCd,
        beginMmiMbrNtwkKeyMtchCd + MMI_MBR_NTWK_KEY_MTCH_CD_LEN));
  }

  int localMmiMbrPrdctCdCounter = -1;

  public boolean isMmiMbrPrdctCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiMbrPrdctCdCounter != sharedCounter;
    localMmiMbrPrdctCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_MBR_PRDCT_CD_LEN = 6;
  /** serialize this MmiMbrPrdctCd */
  protected void serializeMmiMbrPrdctCd(char[] mmiMbrPrdctCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiMbrPrdctCd, 0, getStringValue(), beginMmiMbrPrdctCd, MMI_MBR_PRDCT_CD_LEN);
    localMmiMbrPrdctCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiMbrPrdctCdConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshMmiMbrPrdctCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiMbrPrdctCd() {
    return (substring(
        getStringValue(), beginMmiMbrPrdctCd, beginMmiMbrPrdctCd + MMI_MBR_PRDCT_CD_LEN));
  }

  int localMmiMbrPrdctTypCdCounter = -1;

  public boolean isMmiMbrPrdctTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiMbrPrdctTypCdCounter != sharedCounter;
    localMmiMbrPrdctTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_MBR_PRDCT_TYP_CD_LEN = 3;
  /** serialize this MmiMbrPrdctTypCd */
  protected void serializeMmiMbrPrdctTypCd(char[] mmiMbrPrdctTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiMbrPrdctTypCd, 0, getStringValue(), beginMmiMbrPrdctTypCd, MMI_MBR_PRDCT_TYP_CD_LEN);
    localMmiMbrPrdctTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiMbrPrdctTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshMmiMbrPrdctTypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiMbrPrdctTypCd() {
    return (substring(
        getStringValue(), beginMmiMbrPrdctTypCd, beginMmiMbrPrdctTypCd + MMI_MBR_PRDCT_TYP_CD_LEN));
  }

  int localMmiMnrpCdCounter = -1;

  public boolean isMmiMnrpCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiMnrpCdCounter != sharedCounter;
    localMmiMnrpCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_MNRP_CD_LEN = 1;
  /** serialize this MmiMnrpCd */
  protected void serializeMmiMnrpCd(char[] mmiMnrpCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiMnrpCd, 0, getStringValue(), beginMmiMnrpCd, MMI_MNRP_CD_LEN);
    localMmiMnrpCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiMnrpCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiMnrpCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshMmiMnrpCd() {
    return (substring(getStringValue(), beginMmiMnrpCd, beginMmiMnrpCd + MMI_MNRP_CD_LEN));
  }

  int localMmiMnrpPctCounter = -1;

  public boolean isMmiMnrpPctModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiMnrpPctCounter != sharedCounter;
    localMmiMnrpPctCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_MNRP_PCT_LEN = 2;
  /** serializeMmiMnrpPct */
  protected void serializeMmiMnrpPct(short mmiMnrpPct) {
    replaceValue( //  save the value as string
        getBinaryString(mmiMnrpPct, MMI_MNRP_PCT_LEN), beginMmiMnrpPct, MMI_MNRP_PCT_LEN);
    localMmiMnrpPctCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiMnrpPctMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiMnrpPct is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public short refreshMmiMnrpPct() {
    return (getShort(beginMmiMnrpPct));
  }

  int localMmiMntlUbhCdCounter = -1;

  public boolean isMmiMntlUbhCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiMntlUbhCdCounter != sharedCounter;
    localMmiMntlUbhCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_MNTL_UBH_CD_LEN = 2;
  /** serialize this MmiMntlUbhCd */
  protected void serializeMmiMntlUbhCd(char[] mmiMntlUbhCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiMntlUbhCd, 0, getStringValue(), beginMmiMntlUbhCd, MMI_MNTL_UBH_CD_LEN);
    localMmiMntlUbhCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiMntlUbhCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshMmiMntlUbhCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiMntlUbhCd() {
    return (substring(
        getStringValue(), beginMmiMntlUbhCd, beginMmiMntlUbhCd + MMI_MNTL_UBH_CD_LEN));
  }

  int localMmiNewCoinsAmtCounter = -1;

  public boolean isMmiNewCoinsAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiNewCoinsAmtCounter != sharedCounter;
    localMmiNewCoinsAmtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_NEW_COINS_AMT_LEN = 4;
  /** serializeMmiNewCoinsAmt */
  protected void serializeMmiNewCoinsAmt(int mmiNewCoinsAmt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiNewCoinsAmt, MMI_NEW_COINS_AMT_LEN),
        beginMmiNewCoinsAmt,
        MMI_NEW_COINS_AMT_LEN);
    localMmiNewCoinsAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkMmiNewCoinsAmtMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshMmiNewCoinsAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshMmiNewCoinsAmt() {
    return (getInt(beginMmiNewCoinsAmt));
  }

  int localMmiNewCoinsCombPrscCdCounter = -1;

  public boolean isMmiNewCoinsCombPrscCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiNewCoinsCombPrscCdCounter != sharedCounter;
    localMmiNewCoinsCombPrscCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_NEW_COINS_COMB_PRSC_CD_LEN = 1;
  /** serialize this MmiNewCoinsCombPrscCd */
  protected void serializeMmiNewCoinsCombPrscCd(char[] mmiNewCoinsCombPrscCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiNewCoinsCombPrscCd,
        0,
        getStringValue(),
        beginMmiNewCoinsCombPrscCd,
        MMI_NEW_COINS_COMB_PRSC_CD_LEN);
    localMmiNewCoinsCombPrscCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiNewCoinsCombPrscCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiNewCoinsCombPrscCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshMmiNewCoinsCombPrscCd() {
    return (substring(
        getStringValue(),
        beginMmiNewCoinsCombPrscCd,
        beginMmiNewCoinsCombPrscCd + MMI_NEW_COINS_COMB_PRSC_CD_LEN));
  }

  int localMmiNewCoinsPrdCdCounter = -1;

  public boolean isMmiNewCoinsPrdCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiNewCoinsPrdCdCounter != sharedCounter;
    localMmiNewCoinsPrdCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_NEW_COINS_PRD_CD_LEN = 1;
  /** serialize this MmiNewCoinsPrdCd */
  protected void serializeMmiNewCoinsPrdCd(char[] mmiNewCoinsPrdCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiNewCoinsPrdCd, 0, getStringValue(), beginMmiNewCoinsPrdCd, MMI_NEW_COINS_PRD_CD_LEN);
    localMmiNewCoinsPrdCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiNewCoinsPrdCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiNewCoinsPrdCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiNewCoinsPrdCd() {
    return (substring(
        getStringValue(), beginMmiNewCoinsPrdCd, beginMmiNewCoinsPrdCd + MMI_NEW_COINS_PRD_CD_LEN));
  }

  int localMmiNewCoinsSalFamMultFctCounter = -1;

  public boolean isMmiNewCoinsSalFamMultFctModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiNewCoinsSalFamMultFctCounter != sharedCounter;
    localMmiNewCoinsSalFamMultFctCounter = sharedCounter;
    return hasModified;
  }

  public boolean mmiNewCoinsSalFamMultFctIsNumeric() {
    return decimalIsNumeric(
        beginMmiNewCoinsSalFamMultFct,
        MMI_NEW_COINS_SAL_FAM_MULT_FCT_LEN); // check Packed Decimal field to see if it contains
                                             // valid Number
  }
  /**
   * This method returns packed Decimal String in the mainframe format
   *
   * @return char[]
   */
  public char[] mmiNewCoinsSalFamMultFctString() {
    return getPackedString(beginMmiNewCoinsSalFamMultFct, MMI_NEW_COINS_SAL_FAM_MULT_FCT_LEN);
  }

  protected static final int MMI_NEW_COINS_SAL_FAM_MULT_FCT_LEN = 2;
  protected static final int MMI_NEW_COINS_SAL_FAM_MULT_FCT_SCALE = 2;
  /** serializeMmiNewCoinsSalFamMultFct */
  protected void serializeMmiNewCoinsSalFamMultFct(BigDecimal mmiNewCoinsSalFamMultFct) {
    putDecimal(
        beginMmiNewCoinsSalFamMultFct,
        mmiNewCoinsSalFamMultFct,
        MMI_NEW_COINS_SAL_FAM_MULT_FCT_LEN,
        MMI_NEW_COINS_SAL_FAM_MULT_FCT_SCALE,
        true);
    localMmiNewCoinsSalFamMultFctCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected BigDecimal checkMmiNewCoinsSalFamMultFctMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 3 /*precision*/);
  }
  /**
   * refreshMmiNewCoinsSalFamMultFct is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public BigDecimal refreshMmiNewCoinsSalFamMultFct() throws CFException {
    try {
      return (getDecimal(
          beginMmiNewCoinsSalFamMultFct,
          MMI_NEW_COINS_SAL_FAM_MULT_FCT_LEN,
          MMI_NEW_COINS_SAL_FAM_MULT_FCT_SCALE));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "mmiNewCoinsSalFamMultFct",
          beginMmiNewCoinsSalFamMultFct,
          MMI_NEW_COINS_SAL_FAM_MULT_FCT_LEN);
    }
  }

  int localMmiNewCoinsSalFamTypCdCounter = -1;

  public boolean isMmiNewCoinsSalFamTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiNewCoinsSalFamTypCdCounter != sharedCounter;
    localMmiNewCoinsSalFamTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_NEW_COINS_SAL_FAM_TYP_CD_LEN = 1;
  /** serialize this MmiNewCoinsSalFamTypCd */
  protected void serializeMmiNewCoinsSalFamTypCd(char[] mmiNewCoinsSalFamTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiNewCoinsSalFamTypCd,
        0,
        getStringValue(),
        beginMmiNewCoinsSalFamTypCd,
        MMI_NEW_COINS_SAL_FAM_TYP_CD_LEN);
    localMmiNewCoinsSalFamTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiNewCoinsSalFamTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiNewCoinsSalFamTypCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshMmiNewCoinsSalFamTypCd() {
    return (substring(
        getStringValue(),
        beginMmiNewCoinsSalFamTypCd,
        beginMmiNewCoinsSalFamTypCd + MMI_NEW_COINS_SAL_FAM_TYP_CD_LEN));
  }

  int localMmiNewCoinsSalIndvTypCdCounter = -1;

  public boolean isMmiNewCoinsSalIndvTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiNewCoinsSalIndvTypCdCounter != sharedCounter;
    localMmiNewCoinsSalIndvTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_NEW_COINS_SAL_INDV_TYP_CD_LEN = 1;
  /** serialize this MmiNewCoinsSalIndvTypCd */
  protected void serializeMmiNewCoinsSalIndvTypCd(char[] mmiNewCoinsSalIndvTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiNewCoinsSalIndvTypCd,
        0,
        getStringValue(),
        beginMmiNewCoinsSalIndvTypCd,
        MMI_NEW_COINS_SAL_INDV_TYP_CD_LEN);
    localMmiNewCoinsSalIndvTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiNewCoinsSalIndvTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiNewCoinsSalIndvTypCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshMmiNewCoinsSalIndvTypCd() {
    return (substring(
        getStringValue(),
        beginMmiNewCoinsSalIndvTypCd,
        beginMmiNewCoinsSalIndvTypCd + MMI_NEW_COINS_SAL_INDV_TYP_CD_LEN));
  }

  int localMmiNoblxLabIndCounter = -1;

  public boolean isMmiNoblxLabIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiNoblxLabIndCounter != sharedCounter;
    localMmiNoblxLabIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_NOBLX_LAB_IND_LEN = 1;
  /** serialize this MmiNoblxLabInd */
  protected void serializeMmiNoblxLabInd(char[] mmiNoblxLabInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiNoblxLabInd, 0, getStringValue(), beginMmiNoblxLabInd, MMI_NOBLX_LAB_IND_LEN);
    localMmiNoblxLabIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiNoblxLabIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiNoblxLabInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiNoblxLabInd() {
    return (substring(
        getStringValue(), beginMmiNoblxLabInd, beginMmiNoblxLabInd + MMI_NOBLX_LAB_IND_LEN));
  }

  int localMmiNonEmbdDedCdCounter = -1;

  public boolean isMmiNonEmbdDedCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiNonEmbdDedCdCounter != sharedCounter;
    localMmiNonEmbdDedCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_NON_EMBD_DED_CD_LEN = 1;
  /** serialize this MmiNonEmbdDedCd */
  protected void serializeMmiNonEmbdDedCd(char[] mmiNonEmbdDedCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiNonEmbdDedCd, 0, getStringValue(), beginMmiNonEmbdDedCd, MMI_NON_EMBD_DED_CD_LEN);
    localMmiNonEmbdDedCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiNonEmbdDedCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiNonEmbdDedCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiNonEmbdDedCd() {
    return (substring(
        getStringValue(), beginMmiNonEmbdDedCd, beginMmiNonEmbdDedCd + MMI_NON_EMBD_DED_CD_LEN));
  }

  int localMmiNonEmrgIndCounter = -1;

  public boolean isMmiNonEmrgIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiNonEmrgIndCounter != sharedCounter;
    localMmiNonEmrgIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_NON_EMRG_IND_LEN = 1;
  /** serialize this MmiNonEmrgInd */
  protected void serializeMmiNonEmrgInd(char[] mmiNonEmrgInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiNonEmrgInd, 0, getStringValue(), beginMmiNonEmrgInd, MMI_NON_EMRG_IND_LEN);
    localMmiNonEmrgIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiNonEmrgIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiNonEmrgInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiNonEmrgInd() {
    return (substring(
        getStringValue(), beginMmiNonEmrgInd, beginMmiNonEmrgInd + MMI_NON_EMRG_IND_LEN));
  }

  int localMmiNtfyCrdcEpIndCounter = -1;

  public boolean isMmiNtfyCrdcEpIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiNtfyCrdcEpIndCounter != sharedCounter;
    localMmiNtfyCrdcEpIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_NTFY_CRDC_EP_IND_LEN = 1;
  /** serialize this MmiNtfyCrdcEpInd */
  protected void serializeMmiNtfyCrdcEpInd(char[] mmiNtfyCrdcEpInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiNtfyCrdcEpInd, 0, getStringValue(), beginMmiNtfyCrdcEpInd, MMI_NTFY_CRDC_EP_IND_LEN);
    localMmiNtfyCrdcEpIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiNtfyCrdcEpIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiNtfyCrdcEpInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiNtfyCrdcEpInd() {
    return (substring(
        getStringValue(), beginMmiNtfyCrdcEpInd, beginMmiNtfyCrdcEpInd + MMI_NTFY_CRDC_EP_IND_LEN));
  }

  int localMmiNtwkPcpCopayAmtCounter = -1;

  public boolean isMmiNtwkPcpCopayAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiNtwkPcpCopayAmtCounter != sharedCounter;
    localMmiNtwkPcpCopayAmtCounter = sharedCounter;
    return hasModified;
  }

  public boolean mmiNtwkPcpCopayAmtIsNumeric() {
    return decimalIsNumeric(
        beginMmiNtwkPcpCopayAmt,
        MMI_NTWK_PCP_COPAY_AMT_LEN); // check Packed Decimal field to see if it contains valid
                                     // Number
  }
  /**
   * This method returns packed Decimal String in the mainframe format
   *
   * @return char[]
   */
  public char[] mmiNtwkPcpCopayAmtString() {
    return getPackedString(beginMmiNtwkPcpCopayAmt, MMI_NTWK_PCP_COPAY_AMT_LEN);
  }

  protected static final int MMI_NTWK_PCP_COPAY_AMT_LEN = 3;
  protected static final int MMI_NTWK_PCP_COPAY_AMT_SCALE = 2;
  /** serializeMmiNtwkPcpCopayAmt */
  protected void serializeMmiNtwkPcpCopayAmt(BigDecimal mmiNtwkPcpCopayAmt) {
    putDecimal(
        beginMmiNtwkPcpCopayAmt,
        mmiNtwkPcpCopayAmt,
        MMI_NTWK_PCP_COPAY_AMT_LEN,
        MMI_NTWK_PCP_COPAY_AMT_SCALE,
        true);
    localMmiNtwkPcpCopayAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected BigDecimal checkMmiNtwkPcpCopayAmtMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 5 /*precision*/);
  }
  /**
   * refreshMmiNtwkPcpCopayAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshMmiNtwkPcpCopayAmt() throws CFException {
    try {
      return (getDecimal(
          beginMmiNtwkPcpCopayAmt, MMI_NTWK_PCP_COPAY_AMT_LEN, MMI_NTWK_PCP_COPAY_AMT_SCALE));
    } catch (Exception ex) {
      throw getSoc7ABend("mmiNtwkPcpCopayAmt", beginMmiNtwkPcpCopayAmt, MMI_NTWK_PCP_COPAY_AMT_LEN);
    }
  }

  int localMmiObgynPcpCopayIndCounter = -1;

  public boolean isMmiObgynPcpCopayIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiObgynPcpCopayIndCounter != sharedCounter;
    localMmiObgynPcpCopayIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_OBGYN_PCP_COPAY_IND_LEN = 1;
  /** serialize this MmiObgynPcpCopayInd */
  protected void serializeMmiObgynPcpCopayInd(char[] mmiObgynPcpCopayInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiObgynPcpCopayInd,
        0,
        getStringValue(),
        beginMmiObgynPcpCopayInd,
        MMI_OBGYN_PCP_COPAY_IND_LEN);
    localMmiObgynPcpCopayIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiObgynPcpCopayIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiObgynPcpCopayInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshMmiObgynPcpCopayInd() {
    return (substring(
        getStringValue(),
        beginMmiObgynPcpCopayInd,
        beginMmiObgynPcpCopayInd + MMI_OBGYN_PCP_COPAY_IND_LEN));
  }

  int localMmiOfcVstMaxRmrkCdCounter = -1;

  public boolean isMmiOfcVstMaxRmrkCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiOfcVstMaxRmrkCdCounter != sharedCounter;
    localMmiOfcVstMaxRmrkCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_OFC_VST_MAX_RMRK_CD_LEN = 3;
  /** serialize this MmiOfcVstMaxRmrkCd */
  protected void serializeMmiOfcVstMaxRmrkCd(char[] mmiOfcVstMaxRmrkCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiOfcVstMaxRmrkCd,
        0,
        getStringValue(),
        beginMmiOfcVstMaxRmrkCd,
        MMI_OFC_VST_MAX_RMRK_CD_LEN);
    localMmiOfcVstMaxRmrkCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiOfcVstMaxRmrkCdConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshMmiOfcVstMaxRmrkCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiOfcVstMaxRmrkCd() {
    return (substring(
        getStringValue(),
        beginMmiOfcVstMaxRmrkCd,
        beginMmiOfcVstMaxRmrkCd + MMI_OFC_VST_MAX_RMRK_CD_LEN));
  }

  int localMmiOopCombEeChrgAmtCounter = -1;

  public boolean isMmiOopCombEeChrgAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiOopCombEeChrgAmtCounter != sharedCounter;
    localMmiOopCombEeChrgAmtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_OOP_COMB_EE_CHRG_AMT_LEN = 4;
  /** serializeMmiOopCombEeChrgAmt */
  protected void serializeMmiOopCombEeChrgAmt(int mmiOopCombEeChrgAmt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiOopCombEeChrgAmt, MMI_OOP_COMB_EE_CHRG_AMT_LEN),
        beginMmiOopCombEeChrgAmt,
        MMI_OOP_COMB_EE_CHRG_AMT_LEN);
    localMmiOopCombEeChrgAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkMmiOopCombEeChrgAmtMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshMmiOopCombEeChrgAmt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshMmiOopCombEeChrgAmt() {
    return (getInt(beginMmiOopCombEeChrgAmt));
  }

  int localMmiOopCombEePls1AmtCounter = -1;

  public boolean isMmiOopCombEePls1AmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiOopCombEePls1AmtCounter != sharedCounter;
    localMmiOopCombEePls1AmtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_OOP_COMB_EE_PLS_1_AMT_LEN = 4;
  /** serializeMmiOopCombEePls1Amt */
  protected void serializeMmiOopCombEePls1Amt(int mmiOopCombEePls1Amt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiOopCombEePls1Amt, MMI_OOP_COMB_EE_PLS_1_AMT_LEN),
        beginMmiOopCombEePls1Amt,
        MMI_OOP_COMB_EE_PLS_1_AMT_LEN);
    localMmiOopCombEePls1AmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkMmiOopCombEePls1AmtMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshMmiOopCombEePls1Amt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshMmiOopCombEePls1Amt() {
    return (getInt(beginMmiOopCombEePls1Amt));
  }

  int localMmiOopCombEeSpoAmtCounter = -1;

  public boolean isMmiOopCombEeSpoAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiOopCombEeSpoAmtCounter != sharedCounter;
    localMmiOopCombEeSpoAmtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_OOP_COMB_EE_SPO_AMT_LEN = 4;
  /** serializeMmiOopCombEeSpoAmt */
  protected void serializeMmiOopCombEeSpoAmt(int mmiOopCombEeSpoAmt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiOopCombEeSpoAmt, MMI_OOP_COMB_EE_SPO_AMT_LEN),
        beginMmiOopCombEeSpoAmt,
        MMI_OOP_COMB_EE_SPO_AMT_LEN);
    localMmiOopCombEeSpoAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkMmiOopCombEeSpoAmtMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshMmiOopCombEeSpoAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshMmiOopCombEeSpoAmt() {
    return (getInt(beginMmiOopCombEeSpoAmt));
  }

  int localMmiOopCombFamAmtCounter = -1;

  public boolean isMmiOopCombFamAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiOopCombFamAmtCounter != sharedCounter;
    localMmiOopCombFamAmtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_OOP_COMB_FAM_AMT_LEN = 4;
  /** serializeMmiOopCombFamAmt */
  protected void serializeMmiOopCombFamAmt(int mmiOopCombFamAmt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiOopCombFamAmt, MMI_OOP_COMB_FAM_AMT_LEN),
        beginMmiOopCombFamAmt,
        MMI_OOP_COMB_FAM_AMT_LEN);
    localMmiOopCombFamAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkMmiOopCombFamAmtMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshMmiOopCombFamAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshMmiOopCombFamAmt() {
    return (getInt(beginMmiOopCombFamAmt));
  }

  int localMmiOopCombIndvAmtCounter = -1;

  public boolean isMmiOopCombIndvAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiOopCombIndvAmtCounter != sharedCounter;
    localMmiOopCombIndvAmtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_OOP_COMB_INDV_AMT_LEN = 4;
  /** serializeMmiOopCombIndvAmt */
  protected void serializeMmiOopCombIndvAmt(int mmiOopCombIndvAmt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiOopCombIndvAmt, MMI_OOP_COMB_INDV_AMT_LEN),
        beginMmiOopCombIndvAmt,
        MMI_OOP_COMB_INDV_AMT_LEN);
    localMmiOopCombIndvAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkMmiOopCombIndvAmtMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshMmiOopCombIndvAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshMmiOopCombIndvAmt() {
    return (getInt(beginMmiOopCombIndvAmt));
  }

  int localMmiOopCombNbrCdCounter = -1;

  public boolean isMmiOopCombNbrCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiOopCombNbrCdCounter != sharedCounter;
    localMmiOopCombNbrCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_OOP_COMB_NBR_CD_LEN = 1;
  /** serialize this MmiOopCombNbrCd */
  protected void serializeMmiOopCombNbrCd(char[] mmiOopCombNbrCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiOopCombNbrCd, 0, getStringValue(), beginMmiOopCombNbrCd, MMI_OOP_COMB_NBR_CD_LEN);
    localMmiOopCombNbrCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiOopCombNbrCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiOopCombNbrCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiOopCombNbrCd() {
    return (substring(
        getStringValue(), beginMmiOopCombNbrCd, beginMmiOopCombNbrCd + MMI_OOP_COMB_NBR_CD_LEN));
  }

  int localMmiOopCombPrscCdCounter = -1;

  public boolean isMmiOopCombPrscCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiOopCombPrscCdCounter != sharedCounter;
    localMmiOopCombPrscCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_OOP_COMB_PRSC_CD_LEN = 1;
  /** serialize this MmiOopCombPrscCd */
  protected void serializeMmiOopCombPrscCd(char[] mmiOopCombPrscCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiOopCombPrscCd, 0, getStringValue(), beginMmiOopCombPrscCd, MMI_OOP_COMB_PRSC_CD_LEN);
    localMmiOopCombPrscCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiOopCombPrscCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiOopCombPrscCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiOopCombPrscCd() {
    return (substring(
        getStringValue(), beginMmiOopCombPrscCd, beginMmiOopCombPrscCd + MMI_OOP_COMB_PRSC_CD_LEN));
  }

  int localMmiOopInNtwkEeChrgAmtCounter = -1;

  public boolean isMmiOopInNtwkEeChrgAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiOopInNtwkEeChrgAmtCounter != sharedCounter;
    localMmiOopInNtwkEeChrgAmtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_OOP_IN_NTWK_EE_CHRG_AMT_LEN = 4;
  /** serializeMmiOopInNtwkEeChrgAmt */
  protected void serializeMmiOopInNtwkEeChrgAmt(int mmiOopInNtwkEeChrgAmt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiOopInNtwkEeChrgAmt, MMI_OOP_IN_NTWK_EE_CHRG_AMT_LEN),
        beginMmiOopInNtwkEeChrgAmt,
        MMI_OOP_IN_NTWK_EE_CHRG_AMT_LEN);
    localMmiOopInNtwkEeChrgAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkMmiOopInNtwkEeChrgAmtMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshMmiOopInNtwkEeChrgAmt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshMmiOopInNtwkEeChrgAmt() {
    return (getInt(beginMmiOopInNtwkEeChrgAmt));
  }

  int localMmiOopInNtwkEePls1AmtCounter = -1;

  public boolean isMmiOopInNtwkEePls1AmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiOopInNtwkEePls1AmtCounter != sharedCounter;
    localMmiOopInNtwkEePls1AmtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_OOP_IN_NTWK_EE_PLS_1_AMT_LEN = 4;
  /** serializeMmiOopInNtwkEePls1Amt */
  protected void serializeMmiOopInNtwkEePls1Amt(int mmiOopInNtwkEePls1Amt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiOopInNtwkEePls1Amt, MMI_OOP_IN_NTWK_EE_PLS_1_AMT_LEN),
        beginMmiOopInNtwkEePls1Amt,
        MMI_OOP_IN_NTWK_EE_PLS_1_AMT_LEN);
    localMmiOopInNtwkEePls1AmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkMmiOopInNtwkEePls1AmtMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshMmiOopInNtwkEePls1Amt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshMmiOopInNtwkEePls1Amt() {
    return (getInt(beginMmiOopInNtwkEePls1Amt));
  }

  int localMmiOopInNtwkEeSpoAmtCounter = -1;

  public boolean isMmiOopInNtwkEeSpoAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiOopInNtwkEeSpoAmtCounter != sharedCounter;
    localMmiOopInNtwkEeSpoAmtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_OOP_IN_NTWK_EE_SPO_AMT_LEN = 4;
  /** serializeMmiOopInNtwkEeSpoAmt */
  protected void serializeMmiOopInNtwkEeSpoAmt(int mmiOopInNtwkEeSpoAmt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiOopInNtwkEeSpoAmt, MMI_OOP_IN_NTWK_EE_SPO_AMT_LEN),
        beginMmiOopInNtwkEeSpoAmt,
        MMI_OOP_IN_NTWK_EE_SPO_AMT_LEN);
    localMmiOopInNtwkEeSpoAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkMmiOopInNtwkEeSpoAmtMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshMmiOopInNtwkEeSpoAmt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshMmiOopInNtwkEeSpoAmt() {
    return (getInt(beginMmiOopInNtwkEeSpoAmt));
  }

  int localMmiOopUrgntCareCdCounter = -1;

  public boolean isMmiOopUrgntCareCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiOopUrgntCareCdCounter != sharedCounter;
    localMmiOopUrgntCareCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_OOP_URGNT_CARE_CD_LEN = 1;
  /** serialize this MmiOopUrgntCareCd */
  protected void serializeMmiOopUrgntCareCd(char[] mmiOopUrgntCareCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiOopUrgntCareCd, 0, getStringValue(), beginMmiOopUrgntCareCd, MMI_OOP_URGNT_CARE_CD_LEN);
    localMmiOopUrgntCareCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiOopUrgntCareCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiOopUrgntCareCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiOopUrgntCareCd() {
    return (substring(
        getStringValue(),
        beginMmiOopUrgntCareCd,
        beginMmiOopUrgntCareCd + MMI_OOP_URGNT_CARE_CD_LEN));
  }

  int localMmiOthrRmrkCdCounter = -1;

  public boolean isMmiOthrRmrkCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiOthrRmrkCdCounter != sharedCounter;
    localMmiOthrRmrkCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_OTHR_RMRK_CD_LEN = 3;
  /** serialize this MmiOthrRmrkCd */
  protected void serializeMmiOthrRmrkCd(char[] mmiOthrRmrkCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiOthrRmrkCd, 0, getStringValue(), beginMmiOthrRmrkCd, MMI_OTHR_RMRK_CD_LEN);
    localMmiOthrRmrkCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiOthrRmrkCdConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshMmiOthrRmrkCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiOthrRmrkCd() {
    return (substring(
        getStringValue(), beginMmiOthrRmrkCd, beginMmiOthrRmrkCd + MMI_OTHR_RMRK_CD_LEN));
  }

  int localMmiParsMnlProcIndCounter = -1;

  public boolean isMmiParsMnlProcIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiParsMnlProcIndCounter != sharedCounter;
    localMmiParsMnlProcIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_PARS_MNL_PROC_IND_LEN = 1;
  /** serialize this MmiParsMnlProcInd */
  protected void serializeMmiParsMnlProcInd(char[] mmiParsMnlProcInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiParsMnlProcInd, 0, getStringValue(), beginMmiParsMnlProcInd, MMI_PARS_MNL_PROC_IND_LEN);
    localMmiParsMnlProcIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiParsMnlProcIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiParsMnlProcInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiParsMnlProcInd() {
    return (substring(
        getStringValue(),
        beginMmiParsMnlProcInd,
        beginMmiParsMnlProcInd + MMI_PARS_MNL_PROC_IND_LEN));
  }

  int localMmiParsOopLmtAmtCounter = -1;

  public boolean isMmiParsOopLmtAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiParsOopLmtAmtCounter != sharedCounter;
    localMmiParsOopLmtAmtCounter = sharedCounter;
    return hasModified;
  }

  public boolean mmiParsOopLmtAmtIsNumeric() {
    return decimalIsNumeric(
        beginMmiParsOopLmtAmt,
        MMI_PARS_OOP_LMT_AMT_LEN); // check Packed Decimal field to see if it contains valid Number
  }
  /**
   * This method returns packed Decimal String in the mainframe format
   *
   * @return char[]
   */
  public char[] mmiParsOopLmtAmtString() {
    return getPackedString(beginMmiParsOopLmtAmt, MMI_PARS_OOP_LMT_AMT_LEN);
  }

  protected static final int MMI_PARS_OOP_LMT_AMT_LEN = 9;
  protected static final int MMI_PARS_OOP_LMT_AMT_SCALE = 2;
  /** serializeMmiParsOopLmtAmt */
  protected void serializeMmiParsOopLmtAmt(BigDecimal mmiParsOopLmtAmt) {
    putDecimal(
        beginMmiParsOopLmtAmt,
        mmiParsOopLmtAmt,
        MMI_PARS_OOP_LMT_AMT_LEN,
        MMI_PARS_OOP_LMT_AMT_SCALE,
        true);
    localMmiParsOopLmtAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected BigDecimal checkMmiParsOopLmtAmtMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 16 /*precision*/);
  }
  /**
   * refreshMmiParsOopLmtAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshMmiParsOopLmtAmt() throws CFException {
    try {
      return (getDecimal(
          beginMmiParsOopLmtAmt, MMI_PARS_OOP_LMT_AMT_LEN, MMI_PARS_OOP_LMT_AMT_SCALE));
    } catch (Exception ex) {
      throw getSoc7ABend("mmiParsOopLmtAmt", beginMmiParsOopLmtAmt, MMI_PARS_OOP_LMT_AMT_LEN);
    }
  }

  int localMmiParsSurgSchedNbrCounter = -1;

  public boolean isMmiParsSurgSchedNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiParsSurgSchedNbrCounter != sharedCounter;
    localMmiParsSurgSchedNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_PARS_SURG_SCHED_NBR_LEN = 2;
  /** serializeMmiParsSurgSchedNbr */
  protected void serializeMmiParsSurgSchedNbr(short mmiParsSurgSchedNbr) {
    replaceValue( //  save the value as string
        getBinaryString(mmiParsSurgSchedNbr, MMI_PARS_SURG_SCHED_NBR_LEN),
        beginMmiParsSurgSchedNbr,
        MMI_PARS_SURG_SCHED_NBR_LEN);
    localMmiParsSurgSchedNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiParsSurgSchedNbrMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiParsSurgSchedNbr is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiParsSurgSchedNbr() {
    return (getShort(beginMmiParsSurgSchedNbr));
  }

  int localMmiPayLocCdCounter = -1;

  public boolean isMmiPayLocCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiPayLocCdCounter != sharedCounter;
    localMmiPayLocCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_PAY_LOC_CD_LEN = 3;
  /** serialize this MmiPayLocCd */
  protected void serializeMmiPayLocCd(char[] mmiPayLocCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiPayLocCd, 0, getStringValue(), beginMmiPayLocCd, MMI_PAY_LOC_CD_LEN);
    localMmiPayLocCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiPayLocCdConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshMmiPayLocCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshMmiPayLocCd() {
    return (substring(getStringValue(), beginMmiPayLocCd, beginMmiPayLocCd + MMI_PAY_LOC_CD_LEN));
  }

  int localMmiPcpCopayCdCounter = -1;

  public boolean isMmiPcpCopayCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiPcpCopayCdCounter != sharedCounter;
    localMmiPcpCopayCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_PCP_COPAY_CD_LEN = 1;
  /** serialize this MmiPcpCopayCd */
  protected void serializeMmiPcpCopayCd(char[] mmiPcpCopayCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiPcpCopayCd, 0, getStringValue(), beginMmiPcpCopayCd, MMI_PCP_COPAY_CD_LEN);
    localMmiPcpCopayCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiPcpCopayCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiPcpCopayCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiPcpCopayCd() {
    return (substring(
        getStringValue(), beginMmiPcpCopayCd, beginMmiPcpCopayCd + MMI_PCP_COPAY_CD_LEN));
  }

  int localMmiPcpSpecCoinsIndCounter = -1;

  public boolean isMmiPcpSpecCoinsIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiPcpSpecCoinsIndCounter != sharedCounter;
    localMmiPcpSpecCoinsIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_PCP_SPEC_COINS_IND_LEN = 1;
  /** serialize this MmiPcpSpecCoinsInd */
  protected void serializeMmiPcpSpecCoinsInd(char[] mmiPcpSpecCoinsInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiPcpSpecCoinsInd,
        0,
        getStringValue(),
        beginMmiPcpSpecCoinsInd,
        MMI_PCP_SPEC_COINS_IND_LEN);
    localMmiPcpSpecCoinsIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiPcpSpecCoinsIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiPcpSpecCoinsInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiPcpSpecCoinsInd() {
    return (substring(
        getStringValue(),
        beginMmiPcpSpecCoinsInd,
        beginMmiPcpSpecCoinsInd + MMI_PCP_SPEC_COINS_IND_LEN));
  }

  int localMmiPhysMedcnPrdCdCounter = -1;

  public boolean isMmiPhysMedcnPrdCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiPhysMedcnPrdCdCounter != sharedCounter;
    localMmiPhysMedcnPrdCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_PHYS_MEDCN_PRD_CD_LEN = 1;
  /** serialize this MmiPhysMedcnPrdCd */
  protected void serializeMmiPhysMedcnPrdCd(char[] mmiPhysMedcnPrdCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiPhysMedcnPrdCd, 0, getStringValue(), beginMmiPhysMedcnPrdCd, MMI_PHYS_MEDCN_PRD_CD_LEN);
    localMmiPhysMedcnPrdCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiPhysMedcnPrdCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiPhysMedcnPrdCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiPhysMedcnPrdCd() {
    return (substring(
        getStringValue(),
        beginMmiPhysMedcnPrdCd,
        beginMmiPhysMedcnPrdCd + MMI_PHYS_MEDCN_PRD_CD_LEN));
  }

  int localMmiPolTypCdCounter = -1;

  public boolean isMmiPolTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiPolTypCdCounter != sharedCounter;
    localMmiPolTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_POL_TYP_CD_LEN = 2;
  /** serialize this MmiPolTypCd */
  protected void serializeMmiPolTypCd(char[] mmiPolTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiPolTypCd, 0, getStringValue(), beginMmiPolTypCd, MMI_POL_TYP_CD_LEN);
    localMmiPolTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiPolTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshMmiPolTypCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshMmiPolTypCd() {
    return (substring(getStringValue(), beginMmiPolTypCd, beginMmiPolTypCd + MMI_POL_TYP_CD_LEN));
  }

  int localMmiPpoIndCounter = -1;

  public boolean isMmiPpoIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiPpoIndCounter != sharedCounter;
    localMmiPpoIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_PPO_IND_LEN = 1;
  /** serialize this MmiPpoInd */
  protected void serializeMmiPpoInd(char[] mmiPpoInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiPpoInd, 0, getStringValue(), beginMmiPpoInd, MMI_PPO_IND_LEN);
    localMmiPpoIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiPpoIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiPpoInd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshMmiPpoInd() {
    return (substring(getStringValue(), beginMmiPpoInd, beginMmiPpoInd + MMI_PPO_IND_LEN));
  }

  int localMmiPpoMinEmrgIndCounter = -1;

  public boolean isMmiPpoMinEmrgIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiPpoMinEmrgIndCounter != sharedCounter;
    localMmiPpoMinEmrgIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_PPO_MIN_EMRG_IND_LEN = 1;
  /** serialize this MmiPpoMinEmrgInd */
  protected void serializeMmiPpoMinEmrgInd(char[] mmiPpoMinEmrgInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiPpoMinEmrgInd, 0, getStringValue(), beginMmiPpoMinEmrgInd, MMI_PPO_MIN_EMRG_IND_LEN);
    localMmiPpoMinEmrgIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiPpoMinEmrgIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiPpoMinEmrgInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiPpoMinEmrgInd() {
    return (substring(
        getStringValue(), beginMmiPpoMinEmrgInd, beginMmiPpoMinEmrgInd + MMI_PPO_MIN_EMRG_IND_LEN));
  }

  int localMmiPpoPmntCdCounter = -1;

  public boolean isMmiPpoPmntCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiPpoPmntCdCounter != sharedCounter;
    localMmiPpoPmntCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_PPO_PMNT_CD_LEN = 2;
  /** serialize this MmiPpoPmntCd */
  protected void serializeMmiPpoPmntCd(char[] mmiPpoPmntCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiPpoPmntCd, 0, getStringValue(), beginMmiPpoPmntCd, MMI_PPO_PMNT_CD_LEN);
    localMmiPpoPmntCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiPpoPmntCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshMmiPpoPmntCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiPpoPmntCd() {
    return (substring(
        getStringValue(), beginMmiPpoPmntCd, beginMmiPpoPmntCd + MMI_PPO_PMNT_CD_LEN));
  }

  int localMmiPrdctKeyCdCounter = -1;

  public boolean isMmiPrdctKeyCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiPrdctKeyCdCounter != sharedCounter;
    localMmiPrdctKeyCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_PRDCT_KEY_CD_LEN = 3;
  /** serialize this MmiPrdctKeyCd */
  protected void serializeMmiPrdctKeyCd(char[] mmiPrdctKeyCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiPrdctKeyCd, 0, getStringValue(), beginMmiPrdctKeyCd, MMI_PRDCT_KEY_CD_LEN);
    localMmiPrdctKeyCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiPrdctKeyCdConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshMmiPrdctKeyCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiPrdctKeyCd() {
    return (substring(
        getStringValue(), beginMmiPrdctKeyCd, beginMmiPrdctKeyCd + MMI_PRDCT_KEY_CD_LEN));
  }

  int localMmiPrortEvntTypCdCounter = -1;

  public boolean isMmiPrortEvntTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiPrortEvntTypCdCounter != sharedCounter;
    localMmiPrortEvntTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_PRORT_EVNT_TYP_CD_LEN = 1;
  /** serialize this MmiPrortEvntTypCd */
  protected void serializeMmiPrortEvntTypCd(char[] mmiPrortEvntTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiPrortEvntTypCd, 0, getStringValue(), beginMmiPrortEvntTypCd, MMI_PRORT_EVNT_TYP_CD_LEN);
    localMmiPrortEvntTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiPrortEvntTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiPrortEvntTypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiPrortEvntTypCd() {
    return (substring(
        getStringValue(),
        beginMmiPrortEvntTypCd,
        beginMmiPrortEvntTypCd + MMI_PRORT_EVNT_TYP_CD_LEN));
  }

  int localMmiPrortIntrvlFreqCdCounter = -1;

  public boolean isMmiPrortIntrvlFreqCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiPrortIntrvlFreqCdCounter != sharedCounter;
    localMmiPrortIntrvlFreqCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_PRORT_INTRVL_FREQ_CD_LEN = 1;
  /** serialize this MmiPrortIntrvlFreqCd */
  protected void serializeMmiPrortIntrvlFreqCd(char[] mmiPrortIntrvlFreqCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiPrortIntrvlFreqCd,
        0,
        getStringValue(),
        beginMmiPrortIntrvlFreqCd,
        MMI_PRORT_INTRVL_FREQ_CD_LEN);
    localMmiPrortIntrvlFreqCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiPrortIntrvlFreqCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiPrortIntrvlFreqCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshMmiPrortIntrvlFreqCd() {
    return (substring(
        getStringValue(),
        beginMmiPrortIntrvlFreqCd,
        beginMmiPrortIntrvlFreqCd + MMI_PRORT_INTRVL_FREQ_CD_LEN));
  }

  int localMmiPsyCyrCnfmMaxAmtCounter = -1;

  public boolean isMmiPsyCyrCnfmMaxAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiPsyCyrCnfmMaxAmtCounter != sharedCounter;
    localMmiPsyCyrCnfmMaxAmtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_PSY_CYR_CNFM_MAX_AMT_LEN = 4;
  /** serializeMmiPsyCyrCnfmMaxAmt */
  protected void serializeMmiPsyCyrCnfmMaxAmt(int mmiPsyCyrCnfmMaxAmt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiPsyCyrCnfmMaxAmt, MMI_PSY_CYR_CNFM_MAX_AMT_LEN),
        beginMmiPsyCyrCnfmMaxAmt,
        MMI_PSY_CYR_CNFM_MAX_AMT_LEN);
    localMmiPsyCyrCnfmMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkMmiPsyCyrCnfmMaxAmtMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshMmiPsyCyrCnfmMaxAmt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshMmiPsyCyrCnfmMaxAmt() {
    return (getInt(beginMmiPsyCyrCnfmMaxAmt));
  }

  int localMmiPsyCyrCombPrscMaxAmtCounter = -1;

  public boolean isMmiPsyCyrCombPrscMaxAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiPsyCyrCombPrscMaxAmtCounter != sharedCounter;
    localMmiPsyCyrCombPrscMaxAmtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_PSY_CYR_COMB_PRSC_MAX_AMT_LEN = 4;
  /** serializeMmiPsyCyrCombPrscMaxAmt */
  protected void serializeMmiPsyCyrCombPrscMaxAmt(int mmiPsyCyrCombPrscMaxAmt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiPsyCyrCombPrscMaxAmt, MMI_PSY_CYR_COMB_PRSC_MAX_AMT_LEN),
        beginMmiPsyCyrCombPrscMaxAmt,
        MMI_PSY_CYR_COMB_PRSC_MAX_AMT_LEN);
    localMmiPsyCyrCombPrscMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkMmiPsyCyrCombPrscMaxAmtMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshMmiPsyCyrCombPrscMaxAmt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshMmiPsyCyrCombPrscMaxAmt() {
    return (getInt(beginMmiPsyCyrCombPrscMaxAmt));
  }

  int localMmiPsyCyrNonCnfmMaxAmtCounter = -1;

  public boolean isMmiPsyCyrNonCnfmMaxAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiPsyCyrNonCnfmMaxAmtCounter != sharedCounter;
    localMmiPsyCyrNonCnfmMaxAmtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_PSY_CYR_NON_CNFM_MAX_AMT_LEN = 4;
  /** serializeMmiPsyCyrNonCnfmMaxAmt */
  protected void serializeMmiPsyCyrNonCnfmMaxAmt(int mmiPsyCyrNonCnfmMaxAmt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiPsyCyrNonCnfmMaxAmt, MMI_PSY_CYR_NON_CNFM_MAX_AMT_LEN),
        beginMmiPsyCyrNonCnfmMaxAmt,
        MMI_PSY_CYR_NON_CNFM_MAX_AMT_LEN);
    localMmiPsyCyrNonCnfmMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkMmiPsyCyrNonCnfmMaxAmtMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshMmiPsyCyrNonCnfmMaxAmt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshMmiPsyCyrNonCnfmMaxAmt() {
    return (getInt(beginMmiPsyCyrNonCnfmMaxAmt));
  }

  int localMmiPsyLftmCnfmMaxAmtCounter = -1;

  public boolean isMmiPsyLftmCnfmMaxAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiPsyLftmCnfmMaxAmtCounter != sharedCounter;
    localMmiPsyLftmCnfmMaxAmtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_PSY_LFTM_CNFM_MAX_AMT_LEN = 4;
  /** serializeMmiPsyLftmCnfmMaxAmt */
  protected void serializeMmiPsyLftmCnfmMaxAmt(int mmiPsyLftmCnfmMaxAmt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiPsyLftmCnfmMaxAmt, MMI_PSY_LFTM_CNFM_MAX_AMT_LEN),
        beginMmiPsyLftmCnfmMaxAmt,
        MMI_PSY_LFTM_CNFM_MAX_AMT_LEN);
    localMmiPsyLftmCnfmMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkMmiPsyLftmCnfmMaxAmtMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshMmiPsyLftmCnfmMaxAmt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshMmiPsyLftmCnfmMaxAmt() {
    return (getInt(beginMmiPsyLftmCnfmMaxAmt));
  }

  int localMmiPsyLftmCombPrscMaxAmtCounter = -1;

  public boolean isMmiPsyLftmCombPrscMaxAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiPsyLftmCombPrscMaxAmtCounter != sharedCounter;
    localMmiPsyLftmCombPrscMaxAmtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_PSY_LFTM_COMB_PRSC_MAX_AMT_LEN = 4;
  /** serializeMmiPsyLftmCombPrscMaxAmt */
  protected void serializeMmiPsyLftmCombPrscMaxAmt(int mmiPsyLftmCombPrscMaxAmt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiPsyLftmCombPrscMaxAmt, MMI_PSY_LFTM_COMB_PRSC_MAX_AMT_LEN),
        beginMmiPsyLftmCombPrscMaxAmt,
        MMI_PSY_LFTM_COMB_PRSC_MAX_AMT_LEN);
    localMmiPsyLftmCombPrscMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkMmiPsyLftmCombPrscMaxAmtMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshMmiPsyLftmCombPrscMaxAmt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshMmiPsyLftmCombPrscMaxAmt() {
    return (getInt(beginMmiPsyLftmCombPrscMaxAmt));
  }

  int localMmiPsyLftmNonCnfmMaxAmtCounter = -1;

  public boolean isMmiPsyLftmNonCnfmMaxAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiPsyLftmNonCnfmMaxAmtCounter != sharedCounter;
    localMmiPsyLftmNonCnfmMaxAmtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_PSY_LFTM_NON_CNFM_MAX_AMT_LEN = 4;
  /** serializeMmiPsyLftmNonCnfmMaxAmt */
  protected void serializeMmiPsyLftmNonCnfmMaxAmt(int mmiPsyLftmNonCnfmMaxAmt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiPsyLftmNonCnfmMaxAmt, MMI_PSY_LFTM_NON_CNFM_MAX_AMT_LEN),
        beginMmiPsyLftmNonCnfmMaxAmt,
        MMI_PSY_LFTM_NON_CNFM_MAX_AMT_LEN);
    localMmiPsyLftmNonCnfmMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkMmiPsyLftmNonCnfmMaxAmtMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshMmiPsyLftmNonCnfmMaxAmt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshMmiPsyLftmNonCnfmMaxAmt() {
    return (getInt(beginMmiPsyLftmNonCnfmMaxAmt));
  }

  int localMmiRapl3TierIndCounter = -1;

  public boolean isMmiRapl3TierIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiRapl3TierIndCounter != sharedCounter;
    localMmiRapl3TierIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_RAPL_3_TIER_IND_LEN = 1;
  /** serialize this MmiRapl3TierInd */
  protected void serializeMmiRapl3TierInd(char[] mmiRapl3TierInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiRapl3TierInd, 0, getStringValue(), beginMmiRapl3TierInd, MMI_RAPL_3_TIER_IND_LEN);
    localMmiRapl3TierIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiRapl3TierIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiRapl3TierInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiRapl3TierInd() {
    return (substring(
        getStringValue(), beginMmiRapl3TierInd, beginMmiRapl3TierInd + MMI_RAPL_3_TIER_IND_LEN));
  }

  int localMmiRhapsodyCopayCdCounter = -1;

  public boolean isMmiRhapsodyCopayCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiRhapsodyCopayCdCounter != sharedCounter;
    localMmiRhapsodyCopayCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_RHAPSODY_COPAY_CD_LEN = 1;
  /** serialize this MmiRhapsodyCopayCd */
  protected void serializeMmiRhapsodyCopayCd(char[] mmiRhapsodyCopayCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiRhapsodyCopayCd,
        0,
        getStringValue(),
        beginMmiRhapsodyCopayCd,
        MMI_RHAPSODY_COPAY_CD_LEN);
    localMmiRhapsodyCopayCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiRhapsodyCopayCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiRhapsodyCopayCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiRhapsodyCopayCd() {
    return (substring(
        getStringValue(),
        beginMmiRhapsodyCopayCd,
        beginMmiRhapsodyCopayCd + MMI_RHAPSODY_COPAY_CD_LEN));
  }

  int localMmiRhapsodyCopayDayCntCounter = -1;

  public boolean isMmiRhapsodyCopayDayCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiRhapsodyCopayDayCntCounter != sharedCounter;
    localMmiRhapsodyCopayDayCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_RHAPSODY_COPAY_DAY_CNT_LEN = 2;
  /** serializeMmiRhapsodyCopayDayCnt */
  protected void serializeMmiRhapsodyCopayDayCnt(short mmiRhapsodyCopayDayCnt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiRhapsodyCopayDayCnt, MMI_RHAPSODY_COPAY_DAY_CNT_LEN),
        beginMmiRhapsodyCopayDayCnt,
        MMI_RHAPSODY_COPAY_DAY_CNT_LEN);
    localMmiRhapsodyCopayDayCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiRhapsodyCopayDayCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiRhapsodyCopayDayCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiRhapsodyCopayDayCnt() {
    return (getShort(beginMmiRhapsodyCopayDayCnt));
  }

  int localMmiRmrkCdCounter = -1;

  public boolean isMmiRmrkCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiRmrkCdCounter != sharedCounter;
    localMmiRmrkCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_RMRK_CD_LEN = 3;
  /** serialize this MmiRmrkCd */
  protected void serializeMmiRmrkCd(char[] mmiRmrkCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiRmrkCd, 0, getStringValue(), beginMmiRmrkCd, MMI_RMRK_CD_LEN);
    localMmiRmrkCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiRmrkCdConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshMmiRmrkCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshMmiRmrkCd() {
    return (substring(getStringValue(), beginMmiRmrkCd, beginMmiRmrkCd + MMI_RMRK_CD_LEN));
  }

  int localMmiRmrkSpineManipCdCounter = -1;

  public boolean isMmiRmrkSpineManipCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiRmrkSpineManipCdCounter != sharedCounter;
    localMmiRmrkSpineManipCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_RMRK_SPINE_MANIP_CD_LEN = 3;
  /** serialize this MmiRmrkSpineManipCd */
  protected void serializeMmiRmrkSpineManipCd(char[] mmiRmrkSpineManipCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiRmrkSpineManipCd,
        0,
        getStringValue(),
        beginMmiRmrkSpineManipCd,
        MMI_RMRK_SPINE_MANIP_CD_LEN);
    localMmiRmrkSpineManipCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiRmrkSpineManipCdConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshMmiRmrkSpineManipCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshMmiRmrkSpineManipCd() {
    return (substring(
        getStringValue(),
        beginMmiRmrkSpineManipCd,
        beginMmiRmrkSpineManipCd + MMI_RMRK_SPINE_MANIP_CD_LEN));
  }

  int localMmiSpclProc1CdCounter = -1;

  public boolean isMmiSpclProc1CdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiSpclProc1CdCounter != sharedCounter;
    localMmiSpclProc1CdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_SPCL_PROC_1_CD_LEN = 1;
  /** serialize this MmiSpclProc1Cd */
  protected void serializeMmiSpclProc1Cd(char[] mmiSpclProc1Cd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiSpclProc1Cd, 0, getStringValue(), beginMmiSpclProc1Cd, MMI_SPCL_PROC_1_CD_LEN);
    localMmiSpclProc1CdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiSpclProc1CdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiSpclProc1Cd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiSpclProc1Cd() {
    return (substring(
        getStringValue(), beginMmiSpclProc1Cd, beginMmiSpclProc1Cd + MMI_SPCL_PROC_1_CD_LEN));
  }

  int localMmiSpclProc2CdCounter = -1;

  public boolean isMmiSpclProc2CdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiSpclProc2CdCounter != sharedCounter;
    localMmiSpclProc2CdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_SPCL_PROC_2_CD_LEN = 1;
  /** serialize this MmiSpclProc2Cd */
  protected void serializeMmiSpclProc2Cd(char[] mmiSpclProc2Cd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiSpclProc2Cd, 0, getStringValue(), beginMmiSpclProc2Cd, MMI_SPCL_PROC_2_CD_LEN);
    localMmiSpclProc2CdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiSpclProc2CdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiSpclProc2Cd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiSpclProc2Cd() {
    return (substring(
        getStringValue(), beginMmiSpclProc2Cd, beginMmiSpclProc2Cd + MMI_SPCL_PROC_2_CD_LEN));
  }

  int localMmiSpclProc3CdCounter = -1;

  public boolean isMmiSpclProc3CdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiSpclProc3CdCounter != sharedCounter;
    localMmiSpclProc3CdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_SPCL_PROC_3_CD_LEN = 1;
  /** serialize this MmiSpclProc3Cd */
  protected void serializeMmiSpclProc3Cd(char[] mmiSpclProc3Cd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiSpclProc3Cd, 0, getStringValue(), beginMmiSpclProc3Cd, MMI_SPCL_PROC_3_CD_LEN);
    localMmiSpclProc3CdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiSpclProc3CdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiSpclProc3Cd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiSpclProc3Cd() {
    return (substring(
        getStringValue(), beginMmiSpclProc3Cd, beginMmiSpclProc3Cd + MMI_SPCL_PROC_3_CD_LEN));
  }

  int localMmiSpclProc4CdCounter = -1;

  public boolean isMmiSpclProc4CdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiSpclProc4CdCounter != sharedCounter;
    localMmiSpclProc4CdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_SPCL_PROC_4_CD_LEN = 1;
  /** serialize this MmiSpclProc4Cd */
  protected void serializeMmiSpclProc4Cd(char[] mmiSpclProc4Cd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiSpclProc4Cd, 0, getStringValue(), beginMmiSpclProc4Cd, MMI_SPCL_PROC_4_CD_LEN);
    localMmiSpclProc4CdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiSpclProc4CdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiSpclProc4Cd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiSpclProc4Cd() {
    return (substring(
        getStringValue(), beginMmiSpclProc4Cd, beginMmiSpclProc4Cd + MMI_SPCL_PROC_4_CD_LEN));
  }

  int localMmiSpclProc5CdCounter = -1;

  public boolean isMmiSpclProc5CdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiSpclProc5CdCounter != sharedCounter;
    localMmiSpclProc5CdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_SPCL_PROC_5_CD_LEN = 1;
  /** serialize this MmiSpclProc5Cd */
  protected void serializeMmiSpclProc5Cd(char[] mmiSpclProc5Cd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiSpclProc5Cd, 0, getStringValue(), beginMmiSpclProc5Cd, MMI_SPCL_PROC_5_CD_LEN);
    localMmiSpclProc5CdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiSpclProc5CdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiSpclProc5Cd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiSpclProc5Cd() {
    return (substring(
        getStringValue(), beginMmiSpclProc5Cd, beginMmiSpclProc5Cd + MMI_SPCL_PROC_5_CD_LEN));
  }

  int localMmiSpclProc6CdCounter = -1;

  public boolean isMmiSpclProc6CdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiSpclProc6CdCounter != sharedCounter;
    localMmiSpclProc6CdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_SPCL_PROC_6_CD_LEN = 1;
  /** serialize this MmiSpclProc6Cd */
  protected void serializeMmiSpclProc6Cd(char[] mmiSpclProc6Cd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiSpclProc6Cd, 0, getStringValue(), beginMmiSpclProc6Cd, MMI_SPCL_PROC_6_CD_LEN);
    localMmiSpclProc6CdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiSpclProc6CdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiSpclProc6Cd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiSpclProc6Cd() {
    return (substring(
        getStringValue(), beginMmiSpclProc6Cd, beginMmiSpclProc6Cd + MMI_SPCL_PROC_6_CD_LEN));
  }

  int localMmiSpclProc7CdCounter = -1;

  public boolean isMmiSpclProc7CdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiSpclProc7CdCounter != sharedCounter;
    localMmiSpclProc7CdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_SPCL_PROC_7_CD_LEN = 1;
  /** serialize this MmiSpclProc7Cd */
  protected void serializeMmiSpclProc7Cd(char[] mmiSpclProc7Cd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiSpclProc7Cd, 0, getStringValue(), beginMmiSpclProc7Cd, MMI_SPCL_PROC_7_CD_LEN);
    localMmiSpclProc7CdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiSpclProc7CdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiSpclProc7Cd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiSpclProc7Cd() {
    return (substring(
        getStringValue(), beginMmiSpclProc7Cd, beginMmiSpclProc7Cd + MMI_SPCL_PROC_7_CD_LEN));
  }

  int localMmiSpclProc8CdCounter = -1;

  public boolean isMmiSpclProc8CdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiSpclProc8CdCounter != sharedCounter;
    localMmiSpclProc8CdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_SPCL_PROC_8_CD_LEN = 1;
  /** serialize this MmiSpclProc8Cd */
  protected void serializeMmiSpclProc8Cd(char[] mmiSpclProc8Cd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiSpclProc8Cd, 0, getStringValue(), beginMmiSpclProc8Cd, MMI_SPCL_PROC_8_CD_LEN);
    localMmiSpclProc8CdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiSpclProc8CdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiSpclProc8Cd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiSpclProc8Cd() {
    return (substring(
        getStringValue(), beginMmiSpclProc8Cd, beginMmiSpclProc8Cd + MMI_SPCL_PROC_8_CD_LEN));
  }

  int localMmiSpclProc9CdCounter = -1;

  public boolean isMmiSpclProc9CdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiSpclProc9CdCounter != sharedCounter;
    localMmiSpclProc9CdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_SPCL_PROC_9_CD_LEN = 1;
  /** serialize this MmiSpclProc9Cd */
  protected void serializeMmiSpclProc9Cd(char[] mmiSpclProc9Cd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiSpclProc9Cd, 0, getStringValue(), beginMmiSpclProc9Cd, MMI_SPCL_PROC_9_CD_LEN);
    localMmiSpclProc9CdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiSpclProc9CdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiSpclProc9Cd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiSpclProc9Cd() {
    return (substring(
        getStringValue(), beginMmiSpclProc9Cd, beginMmiSpclProc9Cd + MMI_SPCL_PROC_9_CD_LEN));
  }

  int localMmiSpclProc10CdCounter = -1;

  public boolean isMmiSpclProc10CdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiSpclProc10CdCounter != sharedCounter;
    localMmiSpclProc10CdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_SPCL_PROC_10_CD_LEN = 1;
  /** serialize this MmiSpclProc10Cd */
  protected void serializeMmiSpclProc10Cd(char[] mmiSpclProc10Cd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiSpclProc10Cd, 0, getStringValue(), beginMmiSpclProc10Cd, MMI_SPCL_PROC_10_CD_LEN);
    localMmiSpclProc10CdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiSpclProc10CdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiSpclProc10Cd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiSpclProc10Cd() {
    return (substring(
        getStringValue(), beginMmiSpclProc10Cd, beginMmiSpclProc10Cd + MMI_SPCL_PROC_10_CD_LEN));
  }

  int localMmiSrvcCatgyTblIdCounter = -1;

  public boolean isMmiSrvcCatgyTblIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiSrvcCatgyTblIdCounter != sharedCounter;
    localMmiSrvcCatgyTblIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_SRVC_CATGY_TBL_ID_LEN = 3;
  /** serialize this MmiSrvcCatgyTblId */
  protected void serializeMmiSrvcCatgyTblId(char[] mmiSrvcCatgyTblId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiSrvcCatgyTblId, 0, getStringValue(), beginMmiSrvcCatgyTblId, MMI_SRVC_CATGY_TBL_ID_LEN);
    localMmiSrvcCatgyTblIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiSrvcCatgyTblIdConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshMmiSrvcCatgyTblId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiSrvcCatgyTblId() {
    return (substring(
        getStringValue(),
        beginMmiSrvcCatgyTblId,
        beginMmiSrvcCatgyTblId + MMI_SRVC_CATGY_TBL_ID_LEN));
  }

  int localMmiSrvcCdNSetIndCounter = -1;

  public boolean isMmiSrvcCdNSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiSrvcCdNSetIndCounter != sharedCounter;
    localMmiSrvcCdNSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_SRVC_CD_NSET_IND_LEN = 1;
  /** serialize this MmiSrvcCdNSetInd */
  protected void serializeMmiSrvcCdNSetInd(char[] mmiSrvcCdNSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiSrvcCdNSetInd, 0, getStringValue(), beginMmiSrvcCdNSetInd, MMI_SRVC_CD_NSET_IND_LEN);
    localMmiSrvcCdNSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiSrvcCdNSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiSrvcCdNSetInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiSrvcCdNSetInd() {
    return (substring(
        getStringValue(), beginMmiSrvcCdNSetInd, beginMmiSrvcCdNSetInd + MMI_SRVC_CD_NSET_IND_LEN));
  }

  int localMmiSrvcCdPSetIndCounter = -1;

  public boolean isMmiSrvcCdPSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiSrvcCdPSetIndCounter != sharedCounter;
    localMmiSrvcCdPSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_SRVC_CD_PSET_IND_LEN = 1;
  /** serialize this MmiSrvcCdPSetInd */
  protected void serializeMmiSrvcCdPSetInd(char[] mmiSrvcCdPSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiSrvcCdPSetInd, 0, getStringValue(), beginMmiSrvcCdPSetInd, MMI_SRVC_CD_PSET_IND_LEN);
    localMmiSrvcCdPSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiSrvcCdPSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiSrvcCdPSetInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiSrvcCdPSetInd() {
    return (substring(
        getStringValue(), beginMmiSrvcCdPSetInd, beginMmiSrvcCdPSetInd + MMI_SRVC_CD_PSET_IND_LEN));
  }

  int localMmiSrvcCdTSetIndCounter = -1;

  public boolean isMmiSrvcCdTSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiSrvcCdTSetIndCounter != sharedCounter;
    localMmiSrvcCdTSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_SRVC_CD_TSET_IND_LEN = 1;
  /** serialize this MmiSrvcCdTSetInd */
  protected void serializeMmiSrvcCdTSetInd(char[] mmiSrvcCdTSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiSrvcCdTSetInd, 0, getStringValue(), beginMmiSrvcCdTSetInd, MMI_SRVC_CD_TSET_IND_LEN);
    localMmiSrvcCdTSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiSrvcCdTSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiSrvcCdTSetInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiSrvcCdTSetInd() {
    return (substring(
        getStringValue(), beginMmiSrvcCdTSetInd, beginMmiSrvcCdTSetInd + MMI_SRVC_CD_TSET_IND_LEN));
  }

  int localMmiSviTblPriNbrCounter = -1;

  public boolean isMmiSviTblPriNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiSviTblPriNbrCounter != sharedCounter;
    localMmiSviTblPriNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_SVI_TBL_PRI_NBR_LEN = 6;
  /** serialize this MmiSviTblPriNbr */
  protected void serializeMmiSviTblPriNbr(char[] mmiSviTblPriNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiSviTblPriNbr, 0, getStringValue(), beginMmiSviTblPriNbr, MMI_SVI_TBL_PRI_NBR_LEN);
    localMmiSviTblPriNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiSviTblPriNbrConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshMmiSviTblPriNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiSviTblPriNbr() {
    return (substring(
        getStringValue(), beginMmiSviTblPriNbr, beginMmiSviTblPriNbr + MMI_SVI_TBL_PRI_NBR_LEN));
  }

  int localMmiTierLblIndCounter = -1;

  public boolean isMmiTierLblIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiTierLblIndCounter != sharedCounter;
    localMmiTierLblIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_TIER_LBL_IND_LEN = 1;
  /** serialize this MmiTierLblInd */
  protected void serializeMmiTierLblInd(char[] mmiTierLblInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiTierLblInd, 0, getStringValue(), beginMmiTierLblInd, MMI_TIER_LBL_IND_LEN);
    localMmiTierLblIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiTierLblIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiTierLblInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiTierLblInd() {
    return (substring(
        getStringValue(), beginMmiTierLblInd, beginMmiTierLblInd + MMI_TIER_LBL_IND_LEN));
  }

  int localMmiTier1CopayAmtCounter = -1;

  public boolean isMmiTier1CopayAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiTier1CopayAmtCounter != sharedCounter;
    localMmiTier1CopayAmtCounter = sharedCounter;
    return hasModified;
  }

  public boolean mmiTier1CopayAmtIsNumeric() {
    return decimalIsNumeric(
        beginMmiTier1CopayAmt,
        MMI_TIER_1_COPAY_AMT_LEN); // check Packed Decimal field to see if it contains valid Number
  }
  /**
   * This method returns packed Decimal String in the mainframe format
   *
   * @return char[]
   */
  public char[] mmiTier1CopayAmtString() {
    return getPackedString(beginMmiTier1CopayAmt, MMI_TIER_1_COPAY_AMT_LEN);
  }

  protected static final int MMI_TIER_1_COPAY_AMT_LEN = 3;
  protected static final int MMI_TIER_1_COPAY_AMT_SCALE = 2;
  /** serializeMmiTier1CopayAmt */
  protected void serializeMmiTier1CopayAmt(BigDecimal mmiTier1CopayAmt) {
    putDecimal(
        beginMmiTier1CopayAmt,
        mmiTier1CopayAmt,
        MMI_TIER_1_COPAY_AMT_LEN,
        MMI_TIER_1_COPAY_AMT_SCALE,
        true);
    localMmiTier1CopayAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected BigDecimal checkMmiTier1CopayAmtMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 5 /*precision*/);
  }
  /**
   * refreshMmiTier1CopayAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshMmiTier1CopayAmt() throws CFException {
    try {
      return (getDecimal(
          beginMmiTier1CopayAmt, MMI_TIER_1_COPAY_AMT_LEN, MMI_TIER_1_COPAY_AMT_SCALE));
    } catch (Exception ex) {
      throw getSoc7ABend("mmiTier1CopayAmt", beginMmiTier1CopayAmt, MMI_TIER_1_COPAY_AMT_LEN);
    }
  }

  int localMmiTier1FamNewCoinsAmtCounter = -1;

  public boolean isMmiTier1FamNewCoinsAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiTier1FamNewCoinsAmtCounter != sharedCounter;
    localMmiTier1FamNewCoinsAmtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_TIER_1_FAM_NEW_COINS_AMT_LEN = 4;
  /** serializeMmiTier1FamNewCoinsAmt */
  protected void serializeMmiTier1FamNewCoinsAmt(int mmiTier1FamNewCoinsAmt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiTier1FamNewCoinsAmt, MMI_TIER_1_FAM_NEW_COINS_AMT_LEN),
        beginMmiTier1FamNewCoinsAmt,
        MMI_TIER_1_FAM_NEW_COINS_AMT_LEN);
    localMmiTier1FamNewCoinsAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkMmiTier1FamNewCoinsAmtMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshMmiTier1FamNewCoinsAmt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshMmiTier1FamNewCoinsAmt() {
    return (getInt(beginMmiTier1FamNewCoinsAmt));
  }

  int localMmiTier1LftmMaxAmtCounter = -1;

  public boolean isMmiTier1LftmMaxAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiTier1LftmMaxAmtCounter != sharedCounter;
    localMmiTier1LftmMaxAmtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_TIER_1_LFTM_MAX_AMT_LEN = 4;
  /** serializeMmiTier1LftmMaxAmt */
  protected void serializeMmiTier1LftmMaxAmt(int mmiTier1LftmMaxAmt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiTier1LftmMaxAmt, MMI_TIER_1_LFTM_MAX_AMT_LEN),
        beginMmiTier1LftmMaxAmt,
        MMI_TIER_1_LFTM_MAX_AMT_LEN);
    localMmiTier1LftmMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkMmiTier1LftmMaxAmtMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshMmiTier1LftmMaxAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshMmiTier1LftmMaxAmt() {
    return (getInt(beginMmiTier1LftmMaxAmt));
  }

  int localMmiTier1NewCoinsAmtCounter = -1;

  public boolean isMmiTier1NewCoinsAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiTier1NewCoinsAmtCounter != sharedCounter;
    localMmiTier1NewCoinsAmtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_TIER_1_NEW_COINS_AMT_LEN = 4;
  /** serializeMmiTier1NewCoinsAmt */
  protected void serializeMmiTier1NewCoinsAmt(int mmiTier1NewCoinsAmt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiTier1NewCoinsAmt, MMI_TIER_1_NEW_COINS_AMT_LEN),
        beginMmiTier1NewCoinsAmt,
        MMI_TIER_1_NEW_COINS_AMT_LEN);
    localMmiTier1NewCoinsAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkMmiTier1NewCoinsAmtMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshMmiTier1NewCoinsAmt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshMmiTier1NewCoinsAmt() {
    return (getInt(beginMmiTier1NewCoinsAmt));
  }

  int localMmiTier1UrgntCareAmtCounter = -1;

  public boolean isMmiTier1UrgntCareAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiTier1UrgntCareAmtCounter != sharedCounter;
    localMmiTier1UrgntCareAmtCounter = sharedCounter;
    return hasModified;
  }

  public boolean mmiTier1UrgntCareAmtIsNumeric() {
    return decimalIsNumeric(
        beginMmiTier1UrgntCareAmt,
        MMI_TIER_1_URGNT_CARE_AMT_LEN); // check Packed Decimal field to see if it contains valid
                                        // Number
  }
  /**
   * This method returns packed Decimal String in the mainframe format
   *
   * @return char[]
   */
  public char[] mmiTier1UrgntCareAmtString() {
    return getPackedString(beginMmiTier1UrgntCareAmt, MMI_TIER_1_URGNT_CARE_AMT_LEN);
  }

  protected static final int MMI_TIER_1_URGNT_CARE_AMT_LEN = 3;
  protected static final int MMI_TIER_1_URGNT_CARE_AMT_SCALE = 2;
  /** serializeMmiTier1UrgntCareAmt */
  protected void serializeMmiTier1UrgntCareAmt(BigDecimal mmiTier1UrgntCareAmt) {
    putDecimal(
        beginMmiTier1UrgntCareAmt,
        mmiTier1UrgntCareAmt,
        MMI_TIER_1_URGNT_CARE_AMT_LEN,
        MMI_TIER_1_URGNT_CARE_AMT_SCALE,
        true);
    localMmiTier1UrgntCareAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected BigDecimal checkMmiTier1UrgntCareAmtMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 5 /*precision*/);
  }
  /**
   * refreshMmiTier1UrgntCareAmt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public BigDecimal refreshMmiTier1UrgntCareAmt() throws CFException {
    try {
      return (getDecimal(
          beginMmiTier1UrgntCareAmt,
          MMI_TIER_1_URGNT_CARE_AMT_LEN,
          MMI_TIER_1_URGNT_CARE_AMT_SCALE));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "mmiTier1UrgntCareAmt", beginMmiTier1UrgntCareAmt, MMI_TIER_1_URGNT_CARE_AMT_LEN);
    }
  }

  int localMmiTier1UrgntCareOopCdCounter = -1;

  public boolean isMmiTier1UrgntCareOopCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiTier1UrgntCareOopCdCounter != sharedCounter;
    localMmiTier1UrgntCareOopCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_TIER_1_URGNT_CARE_OOP_CD_LEN = 1;
  /** serialize this MmiTier1UrgntCareOopCd */
  protected void serializeMmiTier1UrgntCareOopCd(char[] mmiTier1UrgntCareOopCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiTier1UrgntCareOopCd,
        0,
        getStringValue(),
        beginMmiTier1UrgntCareOopCd,
        MMI_TIER_1_URGNT_CARE_OOP_CD_LEN);
    localMmiTier1UrgntCareOopCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiTier1UrgntCareOopCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiTier1UrgntCareOopCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshMmiTier1UrgntCareOopCd() {
    return (substring(
        getStringValue(),
        beginMmiTier1UrgntCareOopCd,
        beginMmiTier1UrgntCareOopCd + MMI_TIER_1_URGNT_CARE_OOP_CD_LEN));
  }

  int localMmiTravBenMktNbrCounter = -1;

  public boolean isMmiTravBenMktNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiTravBenMktNbrCounter != sharedCounter;
    localMmiTravBenMktNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_TRAV_BEN_MKT_NBR_LEN = 4;
  /** serializeMmiTravBenMktNbr */
  protected void serializeMmiTravBenMktNbr(int mmiTravBenMktNbr) {
    replaceValue( //  save the value as string
        getBinaryString(mmiTravBenMktNbr, MMI_TRAV_BEN_MKT_NBR_LEN),
        beginMmiTravBenMktNbr,
        MMI_TRAV_BEN_MKT_NBR_LEN);
    localMmiTravBenMktNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkMmiTravBenMktNbrMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshMmiTravBenMktNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshMmiTravBenMktNbr() {
    return (getInt(beginMmiTravBenMktNbr));
  }

  int localMmiTravBenTblNbrCounter = -1;

  public boolean isMmiTravBenTblNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiTravBenTblNbrCounter != sharedCounter;
    localMmiTravBenTblNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_TRAV_BEN_TBL_NBR_LEN = 4;
  /** serializeMmiTravBenTblNbr */
  protected void serializeMmiTravBenTblNbr(int mmiTravBenTblNbr) {
    replaceValue( //  save the value as string
        getBinaryString(mmiTravBenTblNbr, MMI_TRAV_BEN_TBL_NBR_LEN),
        beginMmiTravBenTblNbr,
        MMI_TRAV_BEN_TBL_NBR_LEN);
    localMmiTravBenTblNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkMmiTravBenTblNbrMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshMmiTravBenTblNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshMmiTravBenTblNbr() {
    return (getInt(beginMmiTravBenTblNbr));
  }

  int localMmiUhpCdCounter = -1;

  public boolean isMmiUhpCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiUhpCdCounter != sharedCounter;
    localMmiUhpCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_UHP_CD_LEN = 1;
  /** serialize this MmiUhpCd */
  protected void serializeMmiUhpCd(char[] mmiUhpCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiUhpCd, 0, getStringValue(), beginMmiUhpCd, MMI_UHP_CD_LEN);
    localMmiUhpCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiUhpCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiUhpCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshMmiUhpCd() {
    return (substring(getStringValue(), beginMmiUhpCd, beginMmiUhpCd + MMI_UHP_CD_LEN));
  }

  int localMmiUrgntCareAmtCounter = -1;

  public boolean isMmiUrgntCareAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiUrgntCareAmtCounter != sharedCounter;
    localMmiUrgntCareAmtCounter = sharedCounter;
    return hasModified;
  }

  public boolean mmiUrgntCareAmtIsNumeric() {
    return decimalIsNumeric(
        beginMmiUrgntCareAmt,
        MMI_URGNT_CARE_AMT_LEN); // check Packed Decimal field to see if it contains valid Number
  }
  /**
   * This method returns packed Decimal String in the mainframe format
   *
   * @return char[]
   */
  public char[] mmiUrgntCareAmtString() {
    return getPackedString(beginMmiUrgntCareAmt, MMI_URGNT_CARE_AMT_LEN);
  }

  protected static final int MMI_URGNT_CARE_AMT_LEN = 3;
  protected static final int MMI_URGNT_CARE_AMT_SCALE = 2;
  /** serializeMmiUrgntCareAmt */
  protected void serializeMmiUrgntCareAmt(BigDecimal mmiUrgntCareAmt) {
    putDecimal(
        beginMmiUrgntCareAmt,
        mmiUrgntCareAmt,
        MMI_URGNT_CARE_AMT_LEN,
        MMI_URGNT_CARE_AMT_SCALE,
        true);
    localMmiUrgntCareAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected BigDecimal checkMmiUrgntCareAmtMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 5 /*precision*/);
  }
  /**
   * refreshMmiUrgntCareAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshMmiUrgntCareAmt() throws CFException {
    try {
      return (getDecimal(beginMmiUrgntCareAmt, MMI_URGNT_CARE_AMT_LEN, MMI_URGNT_CARE_AMT_SCALE));
    } catch (Exception ex) {
      throw getSoc7ABend("mmiUrgntCareAmt", beginMmiUrgntCareAmt, MMI_URGNT_CARE_AMT_LEN);
    }
  }

  int localMmiVarPrdFctCounter = -1;

  public boolean isMmiVarPrdFctModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiVarPrdFctCounter != sharedCounter;
    localMmiVarPrdFctCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_VAR_PRD_FCT_LEN = 2;
  /** serializeMmiVarPrdFct */
  protected void serializeMmiVarPrdFct(short mmiVarPrdFct) {
    replaceValue( //  save the value as string
        getBinaryString(mmiVarPrdFct, MMI_VAR_PRD_FCT_LEN), beginMmiVarPrdFct, MMI_VAR_PRD_FCT_LEN);
    localMmiVarPrdFctCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiVarPrdFctMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiVarPrdFct is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshMmiVarPrdFct() {
    return (getShort(beginMmiVarPrdFct));
  }

  int localMmiXtraTerrStMandIndCounter = -1;

  public boolean isMmiXtraTerrStMandIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiXtraTerrStMandIndCounter != sharedCounter;
    localMmiXtraTerrStMandIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_XTRA_TERR_ST_MAND_IND_LEN = 1;
  /** serialize this MmiXtraTerrStMandInd */
  protected void serializeMmiXtraTerrStMandInd(char[] mmiXtraTerrStMandInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiXtraTerrStMandInd,
        0,
        getStringValue(),
        beginMmiXtraTerrStMandInd,
        MMI_XTRA_TERR_ST_MAND_IND_LEN);
    localMmiXtraTerrStMandIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiXtraTerrStMandIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiXtraTerrStMandInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshMmiXtraTerrStMandInd() {
    return (substring(
        getStringValue(),
        beginMmiXtraTerrStMandInd,
        beginMmiXtraTerrStMandInd + MMI_XTRA_TERR_ST_MAND_IND_LEN));
  }

  int localMmiRsnCustyPrdCdCounter = -1;

  public boolean isMmiRsnCustyPrdCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiRsnCustyPrdCdCounter != sharedCounter;
    localMmiRsnCustyPrdCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_RSN_CUSTY_PRD_CD_LEN = 1;
  /** serialize this MmiRsnCustyPrdCd */
  protected void serializeMmiRsnCustyPrdCd(char[] mmiRsnCustyPrdCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiRsnCustyPrdCd, 0, getStringValue(), beginMmiRsnCustyPrdCd, MMI_RSN_CUSTY_PRD_CD_LEN);
    localMmiRsnCustyPrdCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiRsnCustyPrdCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiRsnCustyPrdCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiRsnCustyPrdCd() {
    return (substring(
        getStringValue(), beginMmiRsnCustyPrdCd, beginMmiRsnCustyPrdCd + MMI_RSN_CUSTY_PRD_CD_LEN));
  }

  int localMmiDfltChrgPctCounter = -1;

  public boolean isMmiDfltChrgPctModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiDfltChrgPctCounter != sharedCounter;
    localMmiDfltChrgPctCounter = sharedCounter;
    return hasModified;
  }

  public boolean mmiDfltChrgPctIsNumeric() {
    return decimalIsNumeric(
        beginMmiDfltChrgPct,
        MMI_DFLT_CHRG_PCT_LEN); // check Packed Decimal field to see if it contains valid Number
  }
  /**
   * This method returns packed Decimal String in the mainframe format
   *
   * @return char[]
   */
  public char[] mmiDfltChrgPctString() {
    return getPackedString(beginMmiDfltChrgPct, MMI_DFLT_CHRG_PCT_LEN);
  }

  protected static final int MMI_DFLT_CHRG_PCT_LEN = 3;
  protected static final int MMI_DFLT_CHRG_PCT_SCALE = 2;
  /** serializeMmiDfltChrgPct */
  protected void serializeMmiDfltChrgPct(BigDecimal mmiDfltChrgPct) {
    putDecimal(
        beginMmiDfltChrgPct, mmiDfltChrgPct, MMI_DFLT_CHRG_PCT_LEN, MMI_DFLT_CHRG_PCT_SCALE, true);
    localMmiDfltChrgPctCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected BigDecimal checkMmiDfltChrgPctMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 5 /*precision*/);
  }
  /**
   * refreshMmiDfltChrgPct is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshMmiDfltChrgPct() throws CFException {
    try {
      return (getDecimal(beginMmiDfltChrgPct, MMI_DFLT_CHRG_PCT_LEN, MMI_DFLT_CHRG_PCT_SCALE));
    } catch (Exception ex) {
      throw getSoc7ABend("mmiDfltChrgPct", beginMmiDfltChrgPct, MMI_DFLT_CHRG_PCT_LEN);
    }
  }

  int localMmiFaclShrSvCdCounter = -1;

  public boolean isMmiFaclShrSvCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiFaclShrSvCdCounter != sharedCounter;
    localMmiFaclShrSvCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_FACL_SHR_SV_CD_LEN = 1;
  /** serialize this MmiFaclShrSvCd */
  protected void serializeMmiFaclShrSvCd(char[] mmiFaclShrSvCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiFaclShrSvCd, 0, getStringValue(), beginMmiFaclShrSvCd, MMI_FACL_SHR_SV_CD_LEN);
    localMmiFaclShrSvCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiFaclShrSvCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiFaclShrSvCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiFaclShrSvCd() {
    return (substring(
        getStringValue(), beginMmiFaclShrSvCd, beginMmiFaclShrSvCd + MMI_FACL_SHR_SV_CD_LEN));
  }

  int localMmiPhysnShrSvCdCounter = -1;

  public boolean isMmiPhysnShrSvCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiPhysnShrSvCdCounter != sharedCounter;
    localMmiPhysnShrSvCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_PHYSN_SHR_SV_CD_LEN = 1;
  /** serialize this MmiPhysnShrSvCd */
  protected void serializeMmiPhysnShrSvCd(char[] mmiPhysnShrSvCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiPhysnShrSvCd, 0, getStringValue(), beginMmiPhysnShrSvCd, MMI_PHYSN_SHR_SV_CD_LEN);
    localMmiPhysnShrSvCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiPhysnShrSvCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiPhysnShrSvCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiPhysnShrSvCd() {
    return (substring(
        getStringValue(), beginMmiPhysnShrSvCd, beginMmiPhysnShrSvCd + MMI_PHYSN_SHR_SV_CD_LEN));
  }

  int localMmiCptnXclsIndCounter = -1;

  public boolean isMmiCptnXclsIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiCptnXclsIndCounter != sharedCounter;
    localMmiCptnXclsIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_CPTN_XCLS_IND_LEN = 1;
  /** serialize this MmiCptnXclsInd */
  protected void serializeMmiCptnXclsInd(char[] mmiCptnXclsInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiCptnXclsInd, 0, getStringValue(), beginMmiCptnXclsInd, MMI_CPTN_XCLS_IND_LEN);
    localMmiCptnXclsIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiCptnXclsIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiCptnXclsInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiCptnXclsInd() {
    return (substring(
        getStringValue(), beginMmiCptnXclsInd, beginMmiCptnXclsInd + MMI_CPTN_XCLS_IND_LEN));
  }

  int localMmiObsolete1Counter = -1;

  public boolean isMmiObsolete1Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiObsolete1Counter != sharedCounter;
    localMmiObsolete1Counter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_OBSOLETE_1_LEN = 4;
  /** serialize this MmiObsolete1 */
  protected void serializeMmiObsolete1(char[] mmiObsolete1) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiObsolete1, 0, getStringValue(), beginMmiObsolete1, MMI_OBSOLETE_1_LEN);
    localMmiObsolete1Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiObsolete1Constraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshMmiObsolete1 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiObsolete1() {
    return (substring(getStringValue(), beginMmiObsolete1, beginMmiObsolete1 + MMI_OBSOLETE_1_LEN));
  }

  int localMmiNewCoinsAccumCdCounter = -1;

  public boolean isMmiNewCoinsAccumCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiNewCoinsAccumCdCounter != sharedCounter;
    localMmiNewCoinsAccumCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_NEW_COINS_ACCUM_CD_LEN = 1;
  /** serialize this MmiNewCoinsAccumCd */
  protected void serializeMmiNewCoinsAccumCd(char[] mmiNewCoinsAccumCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiNewCoinsAccumCd,
        0,
        getStringValue(),
        beginMmiNewCoinsAccumCd,
        MMI_NEW_COINS_ACCUM_CD_LEN);
    localMmiNewCoinsAccumCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiNewCoinsAccumCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiNewCoinsAccumCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiNewCoinsAccumCd() {
    return (substring(
        getStringValue(),
        beginMmiNewCoinsAccumCd,
        beginMmiNewCoinsAccumCd + MMI_NEW_COINS_ACCUM_CD_LEN));
  }

  int localMmiErisaIndCounter = -1;

  public boolean isMmiErisaIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiErisaIndCounter != sharedCounter;
    localMmiErisaIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_ERISA_IND_LEN = 1;
  /** serialize this MmiErisaInd */
  protected void serializeMmiErisaInd(char[] mmiErisaInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiErisaInd, 0, getStringValue(), beginMmiErisaInd, MMI_ERISA_IND_LEN);
    localMmiErisaIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiErisaIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiErisaInd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshMmiErisaInd() {
    return (substring(getStringValue(), beginMmiErisaInd, beginMmiErisaInd + MMI_ERISA_IND_LEN));
  }

  int localMmiBhvHlthVendCdCounter = -1;

  public boolean isMmiBhvHlthVendCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBhvHlthVendCdCounter != sharedCounter;
    localMmiBhvHlthVendCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BHV_HLTH_VEND_CD_LEN = 1;
  /** serialize this MmiBhvHlthVendCd */
  protected void serializeMmiBhvHlthVendCd(char[] mmiBhvHlthVendCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiBhvHlthVendCd, 0, getStringValue(), beginMmiBhvHlthVendCd, MMI_BHV_HLTH_VEND_CD_LEN);
    localMmiBhvHlthVendCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiBhvHlthVendCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiBhvHlthVendCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiBhvHlthVendCd() {
    return (substring(
        getStringValue(), beginMmiBhvHlthVendCd, beginMmiBhvHlthVendCd + MMI_BHV_HLTH_VEND_CD_LEN));
  }

  int localMmiEapVendCdCounter = -1;

  public boolean isMmiEapVendCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiEapVendCdCounter != sharedCounter;
    localMmiEapVendCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_EAP_VEND_CD_LEN = 1;
  /** serialize this MmiEapVendCd */
  protected void serializeMmiEapVendCd(char[] mmiEapVendCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiEapVendCd, 0, getStringValue(), beginMmiEapVendCd, MMI_EAP_VEND_CD_LEN);
    localMmiEapVendCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiEapVendCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiEapVendCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiEapVendCd() {
    return (substring(
        getStringValue(), beginMmiEapVendCd, beginMmiEapVendCd + MMI_EAP_VEND_CD_LEN));
  }

  int localMmiVisnCdCounter = -1;

  public boolean isMmiVisnCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiVisnCdCounter != sharedCounter;
    localMmiVisnCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_VISN_CD_LEN = 1;
  /** serialize this MmiVisnCd */
  protected void serializeMmiVisnCd(char[] mmiVisnCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiVisnCd, 0, getStringValue(), beginMmiVisnCd, MMI_VISN_CD_LEN);
    localMmiVisnCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiVisnCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiVisnCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshMmiVisnCd() {
    return (substring(getStringValue(), beginMmiVisnCd, beginMmiVisnCd + MMI_VISN_CD_LEN));
  }

  int localMmiFaclClmEdtIndCounter = -1;

  public boolean isMmiFaclClmEdtIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiFaclClmEdtIndCounter != sharedCounter;
    localMmiFaclClmEdtIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_FACL_CLM_EDT_IND_LEN = 1;
  /** serialize this MmiFaclClmEdtInd */
  protected void serializeMmiFaclClmEdtInd(char[] mmiFaclClmEdtInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiFaclClmEdtInd, 0, getStringValue(), beginMmiFaclClmEdtInd, MMI_FACL_CLM_EDT_IND_LEN);
    localMmiFaclClmEdtIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiFaclClmEdtIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiFaclClmEdtInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiFaclClmEdtInd() {
    return (substring(
        getStringValue(), beginMmiFaclClmEdtInd, beginMmiFaclClmEdtInd + MMI_FACL_CLM_EDT_IND_LEN));
  }

  int localMmiPlnFturCdCounter = -1;

  public boolean isMmiPlnFturCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiPlnFturCdCounter != sharedCounter;
    localMmiPlnFturCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_PLN_FTUR_CD_LEN = 2;
  /** serialize this MmiPlnFturCd */
  protected void serializeMmiPlnFturCd(char[] mmiPlnFturCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiPlnFturCd, 0, getStringValue(), beginMmiPlnFturCd, MMI_PLN_FTUR_CD_LEN);
    localMmiPlnFturCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiPlnFturCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshMmiPlnFturCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiPlnFturCd() {
    return (substring(
        getStringValue(), beginMmiPlnFturCd, beginMmiPlnFturCd + MMI_PLN_FTUR_CD_LEN));
  }

  int localMmiFundTypCdCounter = -1;

  public boolean isMmiFundTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiFundTypCdCounter != sharedCounter;
    localMmiFundTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_FUND_TYP_CD_LEN = 1;
  /** serialize this MmiFundTypCd */
  protected void serializeMmiFundTypCd(char[] mmiFundTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiFundTypCd, 0, getStringValue(), beginMmiFundTypCd, MMI_FUND_TYP_CD_LEN);
    localMmiFundTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiFundTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiFundTypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiFundTypCd() {
    return (substring(
        getStringValue(), beginMmiFundTypCd, beginMmiFundTypCd + MMI_FUND_TYP_CD_LEN));
  }

  int localMmiRxSbscrIdTypCdCounter = -1;

  public boolean isMmiRxSbscrIdTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiRxSbscrIdTypCdCounter != sharedCounter;
    localMmiRxSbscrIdTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_RX_SBSCR_ID_TYP_CD_LEN = 1;
  /** serialize this MmiRxSbscrIdTypCd */
  protected void serializeMmiRxSbscrIdTypCd(char[] mmiRxSbscrIdTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiRxSbscrIdTypCd, 0, getStringValue(), beginMmiRxSbscrIdTypCd, MMI_RX_SBSCR_ID_TYP_CD_LEN);
    localMmiRxSbscrIdTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiRxSbscrIdTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiRxSbscrIdTypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiRxSbscrIdTypCd() {
    return (substring(
        getStringValue(),
        beginMmiRxSbscrIdTypCd,
        beginMmiRxSbscrIdTypCd + MMI_RX_SBSCR_ID_TYP_CD_LEN));
  }

  int localMmiPrdctCdIdCounter = -1;

  public boolean isMmiPrdctCdIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiPrdctCdIdCounter != sharedCounter;
    localMmiPrdctCdIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_PRDCT_CD_ID_LEN = 4;
  /** serialize this MmiPrdctCdId */
  protected void serializeMmiPrdctCdId(char[] mmiPrdctCdId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiPrdctCdId, 0, getStringValue(), beginMmiPrdctCdId, MMI_PRDCT_CD_ID_LEN);
    localMmiPrdctCdIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiPrdctCdIdConstraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshMmiPrdctCdId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiPrdctCdId() {
    return (substring(
        getStringValue(), beginMmiPrdctCdId, beginMmiPrdctCdId + MMI_PRDCT_CD_ID_LEN));
  }

  int localMmiEnrpEmrgFaclIndCounter = -1;

  public boolean isMmiEnrpEmrgFaclIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiEnrpEmrgFaclIndCounter != sharedCounter;
    localMmiEnrpEmrgFaclIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_ENRP_EMRG_FACL_IND_LEN = 1;
  /** serialize this MmiEnrpEmrgFaclInd */
  protected void serializeMmiEnrpEmrgFaclInd(char[] mmiEnrpEmrgFaclInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiEnrpEmrgFaclInd,
        0,
        getStringValue(),
        beginMmiEnrpEmrgFaclInd,
        MMI_ENRP_EMRG_FACL_IND_LEN);
    localMmiEnrpEmrgFaclIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiEnrpEmrgFaclIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiEnrpEmrgFaclInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiEnrpEmrgFaclInd() {
    return (substring(
        getStringValue(),
        beginMmiEnrpEmrgFaclInd,
        beginMmiEnrpEmrgFaclInd + MMI_ENRP_EMRG_FACL_IND_LEN));
  }

  int localMmiEmergentWrpIndCounter = -1;

  public boolean isMmiEmergentWrpIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiEmergentWrpIndCounter != sharedCounter;
    localMmiEmergentWrpIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_EMERGENT_WRP_IND_LEN = 1;
  /** serialize this MmiEmergentWrpInd */
  protected void serializeMmiEmergentWrpInd(char[] mmiEmergentWrpInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiEmergentWrpInd, 0, getStringValue(), beginMmiEmergentWrpInd, MMI_EMERGENT_WRP_IND_LEN);
    localMmiEmergentWrpIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiEmergentWrpIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiEmergentWrpInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiEmergentWrpInd() {
    return (substring(
        getStringValue(),
        beginMmiEmergentWrpInd,
        beginMmiEmergentWrpInd + MMI_EMERGENT_WRP_IND_LEN));
  }

  int localMmiOopMaxCovCdCounter = -1;

  public boolean isMmiOopMaxCovCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiOopMaxCovCdCounter != sharedCounter;
    localMmiOopMaxCovCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_OOP_MAX_COV_CD_LEN = 1;
  /** serialize this MmiOopMaxCovCd */
  protected void serializeMmiOopMaxCovCd(char[] mmiOopMaxCovCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiOopMaxCovCd, 0, getStringValue(), beginMmiOopMaxCovCd, MMI_OOP_MAX_COV_CD_LEN);
    localMmiOopMaxCovCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiOopMaxCovCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiOopMaxCovCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiOopMaxCovCd() {
    return (substring(
        getStringValue(), beginMmiOopMaxCovCd, beginMmiOopMaxCovCd + MMI_OOP_MAX_COV_CD_LEN));
  }

  int localMmiOncPolPrtcpCdCounter = -1;

  public boolean isMmiOncPolPrtcpCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiOncPolPrtcpCdCounter != sharedCounter;
    localMmiOncPolPrtcpCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_ONC_POL_PRTCP_CD_LEN = 1;
  /** serialize this MmiOncPolPrtcpCd */
  protected void serializeMmiOncPolPrtcpCd(char[] mmiOncPolPrtcpCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiOncPolPrtcpCd, 0, getStringValue(), beginMmiOncPolPrtcpCd, MMI_ONC_POL_PRTCP_CD_LEN);
    localMmiOncPolPrtcpCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiOncPolPrtcpCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiOncPolPrtcpCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiOncPolPrtcpCd() {
    return (substring(
        getStringValue(), beginMmiOncPolPrtcpCd, beginMmiOncPolPrtcpCd + MMI_ONC_POL_PRTCP_CD_LEN));
  }

  int localMmiPlnFturIndCounter = -1;

  public boolean isMmiPlnFturIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiPlnFturIndCounter != sharedCounter;
    localMmiPlnFturIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_PLN_FTUR_IND_LEN = 1;
  /** serialize this MmiPlnFturInd */
  protected void serializeMmiPlnFturInd(char[] mmiPlnFturInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiPlnFturInd, 0, getStringValue(), beginMmiPlnFturInd, MMI_PLN_FTUR_IND_LEN);
    localMmiPlnFturIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiPlnFturIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiPlnFturInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiPlnFturInd() {
    return (substring(
        getStringValue(), beginMmiPlnFturInd, beginMmiPlnFturInd + MMI_PLN_FTUR_IND_LEN));
  }

  int localMmiSrvcCdASetIndCounter = -1;

  public boolean isMmiSrvcCdASetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiSrvcCdASetIndCounter != sharedCounter;
    localMmiSrvcCdASetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_SRVC_CD_ASET_IND_LEN = 1;
  /** serialize this MmiSrvcCdASetInd */
  protected void serializeMmiSrvcCdASetInd(char[] mmiSrvcCdASetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiSrvcCdASetInd, 0, getStringValue(), beginMmiSrvcCdASetInd, MMI_SRVC_CD_ASET_IND_LEN);
    localMmiSrvcCdASetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiSrvcCdASetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiSrvcCdASetInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiSrvcCdASetInd() {
    return (substring(
        getStringValue(), beginMmiSrvcCdASetInd, beginMmiSrvcCdASetInd + MMI_SRVC_CD_ASET_IND_LEN));
  }

  int localMmiSrvcCdBSetIndCounter = -1;

  public boolean isMmiSrvcCdBSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiSrvcCdBSetIndCounter != sharedCounter;
    localMmiSrvcCdBSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_SRVC_CD_BSET_IND_LEN = 1;
  /** serialize this MmiSrvcCdBSetInd */
  protected void serializeMmiSrvcCdBSetInd(char[] mmiSrvcCdBSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiSrvcCdBSetInd, 0, getStringValue(), beginMmiSrvcCdBSetInd, MMI_SRVC_CD_BSET_IND_LEN);
    localMmiSrvcCdBSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiSrvcCdBSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiSrvcCdBSetInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiSrvcCdBSetInd() {
    return (substring(
        getStringValue(), beginMmiSrvcCdBSetInd, beginMmiSrvcCdBSetInd + MMI_SRVC_CD_BSET_IND_LEN));
  }

  int localMmiSrvcCdCSetIndCounter = -1;

  public boolean isMmiSrvcCdCSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiSrvcCdCSetIndCounter != sharedCounter;
    localMmiSrvcCdCSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_SRVC_CD_CSET_IND_LEN = 1;
  /** serialize this MmiSrvcCdCSetInd */
  protected void serializeMmiSrvcCdCSetInd(char[] mmiSrvcCdCSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiSrvcCdCSetInd, 0, getStringValue(), beginMmiSrvcCdCSetInd, MMI_SRVC_CD_CSET_IND_LEN);
    localMmiSrvcCdCSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiSrvcCdCSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiSrvcCdCSetInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiSrvcCdCSetInd() {
    return (substring(
        getStringValue(), beginMmiSrvcCdCSetInd, beginMmiSrvcCdCSetInd + MMI_SRVC_CD_CSET_IND_LEN));
  }

  int localMmiSrvcCdDSetIndCounter = -1;

  public boolean isMmiSrvcCdDSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiSrvcCdDSetIndCounter != sharedCounter;
    localMmiSrvcCdDSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_SRVC_CD_DSET_IND_LEN = 1;
  /** serialize this MmiSrvcCdDSetInd */
  protected void serializeMmiSrvcCdDSetInd(char[] mmiSrvcCdDSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiSrvcCdDSetInd, 0, getStringValue(), beginMmiSrvcCdDSetInd, MMI_SRVC_CD_DSET_IND_LEN);
    localMmiSrvcCdDSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiSrvcCdDSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiSrvcCdDSetInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiSrvcCdDSetInd() {
    return (substring(
        getStringValue(), beginMmiSrvcCdDSetInd, beginMmiSrvcCdDSetInd + MMI_SRVC_CD_DSET_IND_LEN));
  }

  int localMmiSrvcCdESetIndCounter = -1;

  public boolean isMmiSrvcCdESetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiSrvcCdESetIndCounter != sharedCounter;
    localMmiSrvcCdESetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_SRVC_CD_ESET_IND_LEN = 1;
  /** serialize this MmiSrvcCdESetInd */
  protected void serializeMmiSrvcCdESetInd(char[] mmiSrvcCdESetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiSrvcCdESetInd, 0, getStringValue(), beginMmiSrvcCdESetInd, MMI_SRVC_CD_ESET_IND_LEN);
    localMmiSrvcCdESetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiSrvcCdESetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiSrvcCdESetInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiSrvcCdESetInd() {
    return (substring(
        getStringValue(), beginMmiSrvcCdESetInd, beginMmiSrvcCdESetInd + MMI_SRVC_CD_ESET_IND_LEN));
  }

  int localMmiSrvcCdFSetIndCounter = -1;

  public boolean isMmiSrvcCdFSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiSrvcCdFSetIndCounter != sharedCounter;
    localMmiSrvcCdFSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_SRVC_CD_FSET_IND_LEN = 1;
  /** serialize this MmiSrvcCdFSetInd */
  protected void serializeMmiSrvcCdFSetInd(char[] mmiSrvcCdFSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiSrvcCdFSetInd, 0, getStringValue(), beginMmiSrvcCdFSetInd, MMI_SRVC_CD_FSET_IND_LEN);
    localMmiSrvcCdFSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiSrvcCdFSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiSrvcCdFSetInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiSrvcCdFSetInd() {
    return (substring(
        getStringValue(), beginMmiSrvcCdFSetInd, beginMmiSrvcCdFSetInd + MMI_SRVC_CD_FSET_IND_LEN));
  }

  int localMmiSrvcCdGSetIndCounter = -1;

  public boolean isMmiSrvcCdGSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiSrvcCdGSetIndCounter != sharedCounter;
    localMmiSrvcCdGSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_SRVC_CD_GSET_IND_LEN = 1;
  /** serialize this MmiSrvcCdGSetInd */
  protected void serializeMmiSrvcCdGSetInd(char[] mmiSrvcCdGSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiSrvcCdGSetInd, 0, getStringValue(), beginMmiSrvcCdGSetInd, MMI_SRVC_CD_GSET_IND_LEN);
    localMmiSrvcCdGSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiSrvcCdGSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiSrvcCdGSetInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiSrvcCdGSetInd() {
    return (substring(
        getStringValue(), beginMmiSrvcCdGSetInd, beginMmiSrvcCdGSetInd + MMI_SRVC_CD_GSET_IND_LEN));
  }

  int localMmiSrvcCdHSetIndCounter = -1;

  public boolean isMmiSrvcCdHSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiSrvcCdHSetIndCounter != sharedCounter;
    localMmiSrvcCdHSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_SRVC_CD_HSET_IND_LEN = 1;
  /** serialize this MmiSrvcCdHSetInd */
  protected void serializeMmiSrvcCdHSetInd(char[] mmiSrvcCdHSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiSrvcCdHSetInd, 0, getStringValue(), beginMmiSrvcCdHSetInd, MMI_SRVC_CD_HSET_IND_LEN);
    localMmiSrvcCdHSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiSrvcCdHSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiSrvcCdHSetInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiSrvcCdHSetInd() {
    return (substring(
        getStringValue(), beginMmiSrvcCdHSetInd, beginMmiSrvcCdHSetInd + MMI_SRVC_CD_HSET_IND_LEN));
  }

  int localMmiSrvcCdISetIndCounter = -1;

  public boolean isMmiSrvcCdISetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiSrvcCdISetIndCounter != sharedCounter;
    localMmiSrvcCdISetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_SRVC_CD_ISET_IND_LEN = 1;
  /** serialize this MmiSrvcCdISetInd */
  protected void serializeMmiSrvcCdISetInd(char[] mmiSrvcCdISetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiSrvcCdISetInd, 0, getStringValue(), beginMmiSrvcCdISetInd, MMI_SRVC_CD_ISET_IND_LEN);
    localMmiSrvcCdISetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiSrvcCdISetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiSrvcCdISetInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiSrvcCdISetInd() {
    return (substring(
        getStringValue(), beginMmiSrvcCdISetInd, beginMmiSrvcCdISetInd + MMI_SRVC_CD_ISET_IND_LEN));
  }

  int localMmiSrvcCdJSetIndCounter = -1;

  public boolean isMmiSrvcCdJSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiSrvcCdJSetIndCounter != sharedCounter;
    localMmiSrvcCdJSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_SRVC_CD_JSET_IND_LEN = 1;
  /** serialize this MmiSrvcCdJSetInd */
  protected void serializeMmiSrvcCdJSetInd(char[] mmiSrvcCdJSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiSrvcCdJSetInd, 0, getStringValue(), beginMmiSrvcCdJSetInd, MMI_SRVC_CD_JSET_IND_LEN);
    localMmiSrvcCdJSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiSrvcCdJSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiSrvcCdJSetInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiSrvcCdJSetInd() {
    return (substring(
        getStringValue(), beginMmiSrvcCdJSetInd, beginMmiSrvcCdJSetInd + MMI_SRVC_CD_JSET_IND_LEN));
  }

  int localMmiSrvcCdKSetIndCounter = -1;

  public boolean isMmiSrvcCdKSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiSrvcCdKSetIndCounter != sharedCounter;
    localMmiSrvcCdKSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_SRVC_CD_KSET_IND_LEN = 1;
  /** serialize this MmiSrvcCdKSetInd */
  protected void serializeMmiSrvcCdKSetInd(char[] mmiSrvcCdKSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiSrvcCdKSetInd, 0, getStringValue(), beginMmiSrvcCdKSetInd, MMI_SRVC_CD_KSET_IND_LEN);
    localMmiSrvcCdKSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiSrvcCdKSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiSrvcCdKSetInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiSrvcCdKSetInd() {
    return (substring(
        getStringValue(), beginMmiSrvcCdKSetInd, beginMmiSrvcCdKSetInd + MMI_SRVC_CD_KSET_IND_LEN));
  }

  int localMmiSrvcCdLSetIndCounter = -1;

  public boolean isMmiSrvcCdLSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiSrvcCdLSetIndCounter != sharedCounter;
    localMmiSrvcCdLSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_SRVC_CD_LSET_IND_LEN = 1;
  /** serialize this MmiSrvcCdLSetInd */
  protected void serializeMmiSrvcCdLSetInd(char[] mmiSrvcCdLSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiSrvcCdLSetInd, 0, getStringValue(), beginMmiSrvcCdLSetInd, MMI_SRVC_CD_LSET_IND_LEN);
    localMmiSrvcCdLSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiSrvcCdLSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiSrvcCdLSetInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiSrvcCdLSetInd() {
    return (substring(
        getStringValue(), beginMmiSrvcCdLSetInd, beginMmiSrvcCdLSetInd + MMI_SRVC_CD_LSET_IND_LEN));
  }

  int localMmiSrvcCdMSetIndCounter = -1;

  public boolean isMmiSrvcCdMSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiSrvcCdMSetIndCounter != sharedCounter;
    localMmiSrvcCdMSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_SRVC_CD_MSET_IND_LEN = 1;
  /** serialize this MmiSrvcCdMSetInd */
  protected void serializeMmiSrvcCdMSetInd(char[] mmiSrvcCdMSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiSrvcCdMSetInd, 0, getStringValue(), beginMmiSrvcCdMSetInd, MMI_SRVC_CD_MSET_IND_LEN);
    localMmiSrvcCdMSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiSrvcCdMSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiSrvcCdMSetInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiSrvcCdMSetInd() {
    return (substring(
        getStringValue(), beginMmiSrvcCdMSetInd, beginMmiSrvcCdMSetInd + MMI_SRVC_CD_MSET_IND_LEN));
  }

  int localMmiSrvcCdOSetIndCounter = -1;

  public boolean isMmiSrvcCdOSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiSrvcCdOSetIndCounter != sharedCounter;
    localMmiSrvcCdOSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_SRVC_CD_OSET_IND_LEN = 1;
  /** serialize this MmiSrvcCdOSetInd */
  protected void serializeMmiSrvcCdOSetInd(char[] mmiSrvcCdOSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiSrvcCdOSetInd, 0, getStringValue(), beginMmiSrvcCdOSetInd, MMI_SRVC_CD_OSET_IND_LEN);
    localMmiSrvcCdOSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiSrvcCdOSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiSrvcCdOSetInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiSrvcCdOSetInd() {
    return (substring(
        getStringValue(), beginMmiSrvcCdOSetInd, beginMmiSrvcCdOSetInd + MMI_SRVC_CD_OSET_IND_LEN));
  }

  int localMmiSrvcCdQSetIndCounter = -1;

  public boolean isMmiSrvcCdQSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiSrvcCdQSetIndCounter != sharedCounter;
    localMmiSrvcCdQSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_SRVC_CD_QSET_IND_LEN = 1;
  /** serialize this MmiSrvcCdQSetInd */
  protected void serializeMmiSrvcCdQSetInd(char[] mmiSrvcCdQSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiSrvcCdQSetInd, 0, getStringValue(), beginMmiSrvcCdQSetInd, MMI_SRVC_CD_QSET_IND_LEN);
    localMmiSrvcCdQSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiSrvcCdQSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiSrvcCdQSetInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiSrvcCdQSetInd() {
    return (substring(
        getStringValue(), beginMmiSrvcCdQSetInd, beginMmiSrvcCdQSetInd + MMI_SRVC_CD_QSET_IND_LEN));
  }

  int localMmiSrvcCdRSetIndCounter = -1;

  public boolean isMmiSrvcCdRSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiSrvcCdRSetIndCounter != sharedCounter;
    localMmiSrvcCdRSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_SRVC_CD_RSET_IND_LEN = 1;
  /** serialize this MmiSrvcCdRSetInd */
  protected void serializeMmiSrvcCdRSetInd(char[] mmiSrvcCdRSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiSrvcCdRSetInd, 0, getStringValue(), beginMmiSrvcCdRSetInd, MMI_SRVC_CD_RSET_IND_LEN);
    localMmiSrvcCdRSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiSrvcCdRSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiSrvcCdRSetInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiSrvcCdRSetInd() {
    return (substring(
        getStringValue(), beginMmiSrvcCdRSetInd, beginMmiSrvcCdRSetInd + MMI_SRVC_CD_RSET_IND_LEN));
  }

  int localMmiSrvcCdSSetIndCounter = -1;

  public boolean isMmiSrvcCdSSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiSrvcCdSSetIndCounter != sharedCounter;
    localMmiSrvcCdSSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_SRVC_CD_SSET_IND_LEN = 1;
  /** serialize this MmiSrvcCdSSetInd */
  protected void serializeMmiSrvcCdSSetInd(char[] mmiSrvcCdSSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiSrvcCdSSetInd, 0, getStringValue(), beginMmiSrvcCdSSetInd, MMI_SRVC_CD_SSET_IND_LEN);
    localMmiSrvcCdSSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiSrvcCdSSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiSrvcCdSSetInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiSrvcCdSSetInd() {
    return (substring(
        getStringValue(), beginMmiSrvcCdSSetInd, beginMmiSrvcCdSSetInd + MMI_SRVC_CD_SSET_IND_LEN));
  }

  int localMmiSrvcCdUSetIndCounter = -1;

  public boolean isMmiSrvcCdUSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiSrvcCdUSetIndCounter != sharedCounter;
    localMmiSrvcCdUSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_SRVC_CD_USET_IND_LEN = 1;
  /** serialize this MmiSrvcCdUSetInd */
  protected void serializeMmiSrvcCdUSetInd(char[] mmiSrvcCdUSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiSrvcCdUSetInd, 0, getStringValue(), beginMmiSrvcCdUSetInd, MMI_SRVC_CD_USET_IND_LEN);
    localMmiSrvcCdUSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiSrvcCdUSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiSrvcCdUSetInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiSrvcCdUSetInd() {
    return (substring(
        getStringValue(), beginMmiSrvcCdUSetInd, beginMmiSrvcCdUSetInd + MMI_SRVC_CD_USET_IND_LEN));
  }

  int localMmiSrvcCdVSetIndCounter = -1;

  public boolean isMmiSrvcCdVSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiSrvcCdVSetIndCounter != sharedCounter;
    localMmiSrvcCdVSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_SRVC_CD_VSET_IND_LEN = 1;
  /** serialize this MmiSrvcCdVSetInd */
  protected void serializeMmiSrvcCdVSetInd(char[] mmiSrvcCdVSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiSrvcCdVSetInd, 0, getStringValue(), beginMmiSrvcCdVSetInd, MMI_SRVC_CD_VSET_IND_LEN);
    localMmiSrvcCdVSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiSrvcCdVSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiSrvcCdVSetInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiSrvcCdVSetInd() {
    return (substring(
        getStringValue(), beginMmiSrvcCdVSetInd, beginMmiSrvcCdVSetInd + MMI_SRVC_CD_VSET_IND_LEN));
  }

  int localMmiSrvcCdWSetIndCounter = -1;

  public boolean isMmiSrvcCdWSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiSrvcCdWSetIndCounter != sharedCounter;
    localMmiSrvcCdWSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_SRVC_CD_WSET_IND_LEN = 1;
  /** serialize this MmiSrvcCdWSetInd */
  protected void serializeMmiSrvcCdWSetInd(char[] mmiSrvcCdWSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiSrvcCdWSetInd, 0, getStringValue(), beginMmiSrvcCdWSetInd, MMI_SRVC_CD_WSET_IND_LEN);
    localMmiSrvcCdWSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiSrvcCdWSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiSrvcCdWSetInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiSrvcCdWSetInd() {
    return (substring(
        getStringValue(), beginMmiSrvcCdWSetInd, beginMmiSrvcCdWSetInd + MMI_SRVC_CD_WSET_IND_LEN));
  }

  int localMmiSrvcCdXSetIndCounter = -1;

  public boolean isMmiSrvcCdXSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiSrvcCdXSetIndCounter != sharedCounter;
    localMmiSrvcCdXSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_SRVC_CD_XSET_IND_LEN = 1;
  /** serialize this MmiSrvcCdXSetInd */
  protected void serializeMmiSrvcCdXSetInd(char[] mmiSrvcCdXSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiSrvcCdXSetInd, 0, getStringValue(), beginMmiSrvcCdXSetInd, MMI_SRVC_CD_XSET_IND_LEN);
    localMmiSrvcCdXSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiSrvcCdXSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiSrvcCdXSetInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiSrvcCdXSetInd() {
    return (substring(
        getStringValue(), beginMmiSrvcCdXSetInd, beginMmiSrvcCdXSetInd + MMI_SRVC_CD_XSET_IND_LEN));
  }

  int localMmiSrvcCdYSetIndCounter = -1;

  public boolean isMmiSrvcCdYSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiSrvcCdYSetIndCounter != sharedCounter;
    localMmiSrvcCdYSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_SRVC_CD_YSET_IND_LEN = 1;
  /** serialize this MmiSrvcCdYSetInd */
  protected void serializeMmiSrvcCdYSetInd(char[] mmiSrvcCdYSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiSrvcCdYSetInd, 0, getStringValue(), beginMmiSrvcCdYSetInd, MMI_SRVC_CD_YSET_IND_LEN);
    localMmiSrvcCdYSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiSrvcCdYSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiSrvcCdYSetInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiSrvcCdYSetInd() {
    return (substring(
        getStringValue(), beginMmiSrvcCdYSetInd, beginMmiSrvcCdYSetInd + MMI_SRVC_CD_YSET_IND_LEN));
  }

  int localMmiSrvcCdZSetIndCounter = -1;

  public boolean isMmiSrvcCdZSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiSrvcCdZSetIndCounter != sharedCounter;
    localMmiSrvcCdZSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_SRVC_CD_ZSET_IND_LEN = 1;
  /** serialize this MmiSrvcCdZSetInd */
  protected void serializeMmiSrvcCdZSetInd(char[] mmiSrvcCdZSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiSrvcCdZSetInd, 0, getStringValue(), beginMmiSrvcCdZSetInd, MMI_SRVC_CD_ZSET_IND_LEN);
    localMmiSrvcCdZSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiSrvcCdZSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiSrvcCdZSetInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiSrvcCdZSetInd() {
    return (substring(
        getStringValue(), beginMmiSrvcCdZSetInd, beginMmiSrvcCdZSetInd + MMI_SRVC_CD_ZSET_IND_LEN));
  }

  int localMmiNonEmbdCopayCdCounter = -1;

  public boolean isMmiNonEmbdCopayCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiNonEmbdCopayCdCounter != sharedCounter;
    localMmiNonEmbdCopayCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_NON_EMBD_COPAY_CD_LEN = 1;
  /** serialize this MmiNonEmbdCopayCd */
  protected void serializeMmiNonEmbdCopayCd(char[] mmiNonEmbdCopayCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiNonEmbdCopayCd, 0, getStringValue(), beginMmiNonEmbdCopayCd, MMI_NON_EMBD_COPAY_CD_LEN);
    localMmiNonEmbdCopayCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiNonEmbdCopayCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiNonEmbdCopayCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiNonEmbdCopayCd() {
    return (substring(
        getStringValue(),
        beginMmiNonEmbdCopayCd,
        beginMmiNonEmbdCopayCd + MMI_NON_EMBD_COPAY_CD_LEN));
  }

  int localMmiNonEmbdCoreOopCdCounter = -1;

  public boolean isMmiNonEmbdCoreOopCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiNonEmbdCoreOopCdCounter != sharedCounter;
    localMmiNonEmbdCoreOopCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_NON_EMBD_CORE_OOP_CD_LEN = 1;
  /** serialize this MmiNonEmbdCoreOopCd */
  protected void serializeMmiNonEmbdCoreOopCd(char[] mmiNonEmbdCoreOopCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiNonEmbdCoreOopCd,
        0,
        getStringValue(),
        beginMmiNonEmbdCoreOopCd,
        MMI_NON_EMBD_CORE_OOP_CD_LEN);
    localMmiNonEmbdCoreOopCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiNonEmbdCoreOopCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiNonEmbdCoreOopCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshMmiNonEmbdCoreOopCd() {
    return (substring(
        getStringValue(),
        beginMmiNonEmbdCoreOopCd,
        beginMmiNonEmbdCoreOopCd + MMI_NON_EMBD_CORE_OOP_CD_LEN));
  }

  int localMmiNewCoinsDedTypCdCounter = -1;

  public boolean isMmiNewCoinsDedTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiNewCoinsDedTypCdCounter != sharedCounter;
    localMmiNewCoinsDedTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_NEW_COINS_DED_TYP_CD_LEN = 1;
  /** serialize this MmiNewCoinsDedTypCd */
  protected void serializeMmiNewCoinsDedTypCd(char[] mmiNewCoinsDedTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiNewCoinsDedTypCd,
        0,
        getStringValue(),
        beginMmiNewCoinsDedTypCd,
        MMI_NEW_COINS_DED_TYP_CD_LEN);
    localMmiNewCoinsDedTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiNewCoinsDedTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiNewCoinsDedTypCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshMmiNewCoinsDedTypCd() {
    return (substring(
        getStringValue(),
        beginMmiNewCoinsDedTypCd,
        beginMmiNewCoinsDedTypCd + MMI_NEW_COINS_DED_TYP_CD_LEN));
  }

  int localMmiNewCoinsIndvMinPctCounter = -1;

  public boolean isMmiNewCoinsIndvMinPctModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiNewCoinsIndvMinPctCounter != sharedCounter;
    localMmiNewCoinsIndvMinPctCounter = sharedCounter;
    return hasModified;
  }

  public boolean mmiNewCoinsIndvMinPctIsNumeric() {
    return decimalIsNumeric(
        beginMmiNewCoinsIndvMinPct,
        MMI_NEW_COINS_INDV_MIN_PCT_LEN); // check Packed Decimal field to see if it contains valid
                                         // Number
  }
  /**
   * This method returns packed Decimal String in the mainframe format
   *
   * @return char[]
   */
  public char[] mmiNewCoinsIndvMinPctString() {
    return getPackedString(beginMmiNewCoinsIndvMinPct, MMI_NEW_COINS_INDV_MIN_PCT_LEN);
  }

  protected static final int MMI_NEW_COINS_INDV_MIN_PCT_LEN = 3;
  protected static final int MMI_NEW_COINS_INDV_MIN_PCT_SCALE = 2;
  /** serializeMmiNewCoinsIndvMinPct */
  protected void serializeMmiNewCoinsIndvMinPct(BigDecimal mmiNewCoinsIndvMinPct) {
    putDecimal(
        beginMmiNewCoinsIndvMinPct,
        mmiNewCoinsIndvMinPct,
        MMI_NEW_COINS_INDV_MIN_PCT_LEN,
        MMI_NEW_COINS_INDV_MIN_PCT_SCALE,
        true);
    localMmiNewCoinsIndvMinPctCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected BigDecimal checkMmiNewCoinsIndvMinPctMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 5 /*precision*/);
  }
  /**
   * refreshMmiNewCoinsIndvMinPct is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public BigDecimal refreshMmiNewCoinsIndvMinPct() throws CFException {
    try {
      return (getDecimal(
          beginMmiNewCoinsIndvMinPct,
          MMI_NEW_COINS_INDV_MIN_PCT_LEN,
          MMI_NEW_COINS_INDV_MIN_PCT_SCALE));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "mmiNewCoinsIndvMinPct", beginMmiNewCoinsIndvMinPct, MMI_NEW_COINS_INDV_MIN_PCT_LEN);
    }
  }

  int localMmiNewCoinsIndvMaxPctCounter = -1;

  public boolean isMmiNewCoinsIndvMaxPctModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiNewCoinsIndvMaxPctCounter != sharedCounter;
    localMmiNewCoinsIndvMaxPctCounter = sharedCounter;
    return hasModified;
  }

  public boolean mmiNewCoinsIndvMaxPctIsNumeric() {
    return decimalIsNumeric(
        beginMmiNewCoinsIndvMaxPct,
        MMI_NEW_COINS_INDV_MAX_PCT_LEN); // check Packed Decimal field to see if it contains valid
                                         // Number
  }
  /**
   * This method returns packed Decimal String in the mainframe format
   *
   * @return char[]
   */
  public char[] mmiNewCoinsIndvMaxPctString() {
    return getPackedString(beginMmiNewCoinsIndvMaxPct, MMI_NEW_COINS_INDV_MAX_PCT_LEN);
  }

  protected static final int MMI_NEW_COINS_INDV_MAX_PCT_LEN = 3;
  protected static final int MMI_NEW_COINS_INDV_MAX_PCT_SCALE = 2;
  /** serializeMmiNewCoinsIndvMaxPct */
  protected void serializeMmiNewCoinsIndvMaxPct(BigDecimal mmiNewCoinsIndvMaxPct) {
    putDecimal(
        beginMmiNewCoinsIndvMaxPct,
        mmiNewCoinsIndvMaxPct,
        MMI_NEW_COINS_INDV_MAX_PCT_LEN,
        MMI_NEW_COINS_INDV_MAX_PCT_SCALE,
        true);
    localMmiNewCoinsIndvMaxPctCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected BigDecimal checkMmiNewCoinsIndvMaxPctMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 5 /*precision*/);
  }
  /**
   * refreshMmiNewCoinsIndvMaxPct is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public BigDecimal refreshMmiNewCoinsIndvMaxPct() throws CFException {
    try {
      return (getDecimal(
          beginMmiNewCoinsIndvMaxPct,
          MMI_NEW_COINS_INDV_MAX_PCT_LEN,
          MMI_NEW_COINS_INDV_MAX_PCT_SCALE));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "mmiNewCoinsIndvMaxPct", beginMmiNewCoinsIndvMaxPct, MMI_NEW_COINS_INDV_MAX_PCT_LEN);
    }
  }

  int localMmiNonEmbdNewCoinsCdCounter = -1;

  public boolean isMmiNonEmbdNewCoinsCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiNonEmbdNewCoinsCdCounter != sharedCounter;
    localMmiNonEmbdNewCoinsCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_NON_EMBD_NEW_COINS_CD_LEN = 1;
  /** serialize this MmiNonEmbdNewCoinsCd */
  protected void serializeMmiNonEmbdNewCoinsCd(char[] mmiNonEmbdNewCoinsCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiNonEmbdNewCoinsCd,
        0,
        getStringValue(),
        beginMmiNonEmbdNewCoinsCd,
        MMI_NON_EMBD_NEW_COINS_CD_LEN);
    localMmiNonEmbdNewCoinsCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiNonEmbdNewCoinsCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiNonEmbdNewCoinsCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshMmiNonEmbdNewCoinsCd() {
    return (substring(
        getStringValue(),
        beginMmiNonEmbdNewCoinsCd,
        beginMmiNonEmbdNewCoinsCd + MMI_NON_EMBD_NEW_COINS_CD_LEN));
  }

  int localMmiNonEmbdCoreDedCdCounter = -1;

  public boolean isMmiNonEmbdCoreDedCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiNonEmbdCoreDedCdCounter != sharedCounter;
    localMmiNonEmbdCoreDedCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_NON_EMBD_CORE_DED_CD_LEN = 1;
  /** serialize this MmiNonEmbdCoreDedCd */
  protected void serializeMmiNonEmbdCoreDedCd(char[] mmiNonEmbdCoreDedCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiNonEmbdCoreDedCd,
        0,
        getStringValue(),
        beginMmiNonEmbdCoreDedCd,
        MMI_NON_EMBD_CORE_DED_CD_LEN);
    localMmiNonEmbdCoreDedCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiNonEmbdCoreDedCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiNonEmbdCoreDedCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshMmiNonEmbdCoreDedCd() {
    return (substring(
        getStringValue(),
        beginMmiNonEmbdCoreDedCd,
        beginMmiNonEmbdCoreDedCd + MMI_NON_EMBD_CORE_DED_CD_LEN));
  }

  int localMmiIndvOopCdCounter = -1;

  public boolean isMmiIndvOopCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiIndvOopCdCounter != sharedCounter;
    localMmiIndvOopCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_INDV_OOP_CD_LEN = 1;
  /** serialize this MmiIndvOopCd */
  protected void serializeMmiIndvOopCd(char[] mmiIndvOopCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiIndvOopCd, 0, getStringValue(), beginMmiIndvOopCd, MMI_INDV_OOP_CD_LEN);
    localMmiIndvOopCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiIndvOopCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiIndvOopCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiIndvOopCd() {
    return (substring(
        getStringValue(), beginMmiIndvOopCd, beginMmiIndvOopCd + MMI_INDV_OOP_CD_LEN));
  }

  int localMmiIndvPrdCdCounter = -1;

  public boolean isMmiIndvPrdCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiIndvPrdCdCounter != sharedCounter;
    localMmiIndvPrdCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_INDV_PRD_CD_LEN = 1;
  /** serialize this MmiIndvPrdCd */
  protected void serializeMmiIndvPrdCd(char[] mmiIndvPrdCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiIndvPrdCd, 0, getStringValue(), beginMmiIndvPrdCd, MMI_INDV_PRD_CD_LEN);
    localMmiIndvPrdCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiIndvPrdCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiIndvPrdCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiIndvPrdCd() {
    return (substring(
        getStringValue(), beginMmiIndvPrdCd, beginMmiIndvPrdCd + MMI_INDV_PRD_CD_LEN));
  }

  int localMmiIndvSalryTypCdCounter = -1;

  public boolean isMmiIndvSalryTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiIndvSalryTypCdCounter != sharedCounter;
    localMmiIndvSalryTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_INDV_SALRY_TYP_CD_LEN = 1;
  /** serialize this MmiIndvSalryTypCd */
  protected void serializeMmiIndvSalryTypCd(char[] mmiIndvSalryTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiIndvSalryTypCd, 0, getStringValue(), beginMmiIndvSalryTypCd, MMI_INDV_SALRY_TYP_CD_LEN);
    localMmiIndvSalryTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiIndvSalryTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiIndvSalryTypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiIndvSalryTypCd() {
    return (substring(
        getStringValue(),
        beginMmiIndvSalryTypCd,
        beginMmiIndvSalryTypCd + MMI_INDV_SALRY_TYP_CD_LEN));
  }

  int localMmiFamSalryTypCdCounter = -1;

  public boolean isMmiFamSalryTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiFamSalryTypCdCounter != sharedCounter;
    localMmiFamSalryTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_FAM_SALRY_TYP_CD_LEN = 1;
  /** serialize this MmiFamSalryTypCd */
  protected void serializeMmiFamSalryTypCd(char[] mmiFamSalryTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiFamSalryTypCd, 0, getStringValue(), beginMmiFamSalryTypCd, MMI_FAM_SALRY_TYP_CD_LEN);
    localMmiFamSalryTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiFamSalryTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiFamSalryTypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiFamSalryTypCd() {
    return (substring(
        getStringValue(), beginMmiFamSalryTypCd, beginMmiFamSalryTypCd + MMI_FAM_SALRY_TYP_CD_LEN));
  }

  int localMmiFamMultPctCounter = -1;

  public boolean isMmiFamMultPctModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiFamMultPctCounter != sharedCounter;
    localMmiFamMultPctCounter = sharedCounter;
    return hasModified;
  }

  public boolean mmiFamMultPctIsNumeric() {
    return decimalIsNumeric(
        beginMmiFamMultPct,
        MMI_FAM_MULT_PCT_LEN); // check Packed Decimal field to see if it contains valid Number
  }
  /**
   * This method returns packed Decimal String in the mainframe format
   *
   * @return char[]
   */
  public char[] mmiFamMultPctString() {
    return getPackedString(beginMmiFamMultPct, MMI_FAM_MULT_PCT_LEN);
  }

  protected static final int MMI_FAM_MULT_PCT_LEN = 3;
  protected static final int MMI_FAM_MULT_PCT_SCALE = 2;
  /** serializeMmiFamMultPct */
  protected void serializeMmiFamMultPct(BigDecimal mmiFamMultPct) {
    putDecimal(
        beginMmiFamMultPct, mmiFamMultPct, MMI_FAM_MULT_PCT_LEN, MMI_FAM_MULT_PCT_SCALE, true);
    localMmiFamMultPctCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected BigDecimal checkMmiFamMultPctMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 5 /*precision*/);
  }
  /**
   * refreshMmiFamMultPct is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshMmiFamMultPct() throws CFException {
    try {
      return (getDecimal(beginMmiFamMultPct, MMI_FAM_MULT_PCT_LEN, MMI_FAM_MULT_PCT_SCALE));
    } catch (Exception ex) {
      throw getSoc7ABend("mmiFamMultPct", beginMmiFamMultPct, MMI_FAM_MULT_PCT_LEN);
    }
  }

  int localMmiFamValCounter = -1;

  public boolean isMmiFamValModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiFamValCounter != sharedCounter;
    localMmiFamValCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_FAM_VAL_LEN = 1;
  /** serialize this MmiFamVal */
  protected void serializeMmiFamVal(char[] mmiFamVal) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiFamVal, 0, getStringValue(), beginMmiFamVal, MMI_FAM_VAL_LEN);
    localMmiFamValCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiFamValConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiFamVal is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshMmiFamVal() {
    return (substring(getStringValue(), beginMmiFamVal, beginMmiFamVal + MMI_FAM_VAL_LEN));
  }

  int localMmiXapplyOopCdCounter = -1;

  public boolean isMmiXapplyOopCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiXapplyOopCdCounter != sharedCounter;
    localMmiXapplyOopCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_XAPPLY_OOP_CD_LEN = 1;
  /** serialize this MmiXapplyOopCd */
  protected void serializeMmiXapplyOopCd(char[] mmiXapplyOopCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiXapplyOopCd, 0, getStringValue(), beginMmiXapplyOopCd, MMI_XAPPLY_OOP_CD_LEN);
    localMmiXapplyOopCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiXapplyOopCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiXapplyOopCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiXapplyOopCd() {
    return (substring(
        getStringValue(), beginMmiXapplyOopCd, beginMmiXapplyOopCd + MMI_XAPPLY_OOP_CD_LEN));
  }

  int localMmiIndvCopayCaroCdCounter = -1;

  public boolean isMmiIndvCopayCaroCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiIndvCopayCaroCdCounter != sharedCounter;
    localMmiIndvCopayCaroCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_INDV_COPAY_CARO_CD_LEN = 1;
  /** serialize this MmiIndvCopayCaroCd */
  protected void serializeMmiIndvCopayCaroCd(char[] mmiIndvCopayCaroCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiIndvCopayCaroCd,
        0,
        getStringValue(),
        beginMmiIndvCopayCaroCd,
        MMI_INDV_COPAY_CARO_CD_LEN);
    localMmiIndvCopayCaroCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiIndvCopayCaroCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiIndvCopayCaroCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiIndvCopayCaroCd() {
    return (substring(
        getStringValue(),
        beginMmiIndvCopayCaroCd,
        beginMmiIndvCopayCaroCd + MMI_INDV_COPAY_CARO_CD_LEN));
  }

  int localMmiXapplyCopayCdCounter = -1;

  public boolean isMmiXapplyCopayCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiXapplyCopayCdCounter != sharedCounter;
    localMmiXapplyCopayCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_XAPPLY_COPAY_CD_LEN = 1;
  /** serialize this MmiXapplyCopayCd */
  protected void serializeMmiXapplyCopayCd(char[] mmiXapplyCopayCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiXapplyCopayCd, 0, getStringValue(), beginMmiXapplyCopayCd, MMI_XAPPLY_COPAY_CD_LEN);
    localMmiXapplyCopayCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiXapplyCopayCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiXapplyCopayCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiXapplyCopayCd() {
    return (substring(
        getStringValue(), beginMmiXapplyCopayCd, beginMmiXapplyCopayCd + MMI_XAPPLY_COPAY_CD_LEN));
  }

  int localMmiCoreOopNcapIndCounter = -1;

  public boolean isMmiCoreOopNcapIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiCoreOopNcapIndCounter != sharedCounter;
    localMmiCoreOopNcapIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_CORE_OOP_NCAP_IND_LEN = 1;
  /** serialize this MmiCoreOopNcapInd */
  protected void serializeMmiCoreOopNcapInd(char[] mmiCoreOopNcapInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiCoreOopNcapInd, 0, getStringValue(), beginMmiCoreOopNcapInd, MMI_CORE_OOP_NCAP_IND_LEN);
    localMmiCoreOopNcapIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiCoreOopNcapIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiCoreOopNcapInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiCoreOopNcapInd() {
    return (substring(
        getStringValue(),
        beginMmiCoreOopNcapInd,
        beginMmiCoreOopNcapInd + MMI_CORE_OOP_NCAP_IND_LEN));
  }

  int localMmiMnnrpLabPctCounter = -1;

  public boolean isMmiMnnrpLabPctModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiMnnrpLabPctCounter != sharedCounter;
    localMmiMnnrpLabPctCounter = sharedCounter;
    return hasModified;
  }

  public boolean mmiMnnrpLabPctIsNumeric() {
    return decimalIsNumeric(
        beginMmiMnnrpLabPct,
        MMI_MNNRP_LAB_PCT_LEN); // check Packed Decimal field to see if it contains valid Number
  }
  /**
   * This method returns packed Decimal String in the mainframe format
   *
   * @return char[]
   */
  public char[] mmiMnnrpLabPctString() {
    return getPackedString(beginMmiMnnrpLabPct, MMI_MNNRP_LAB_PCT_LEN);
  }

  protected static final int MMI_MNNRP_LAB_PCT_LEN = 3;
  protected static final int MMI_MNNRP_LAB_PCT_SCALE = 2;
  /** serializeMmiMnnrpLabPct */
  protected void serializeMmiMnnrpLabPct(BigDecimal mmiMnnrpLabPct) {
    putDecimal(
        beginMmiMnnrpLabPct, mmiMnnrpLabPct, MMI_MNNRP_LAB_PCT_LEN, MMI_MNNRP_LAB_PCT_SCALE, true);
    localMmiMnnrpLabPctCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected BigDecimal checkMmiMnnrpLabPctMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 5 /*precision*/);
  }
  /**
   * refreshMmiMnnrpLabPct is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshMmiMnnrpLabPct() throws CFException {
    try {
      return (getDecimal(beginMmiMnnrpLabPct, MMI_MNNRP_LAB_PCT_LEN, MMI_MNNRP_LAB_PCT_SCALE));
    } catch (Exception ex) {
      throw getSoc7ABend("mmiMnnrpLabPct", beginMmiMnnrpLabPct, MMI_MNNRP_LAB_PCT_LEN);
    }
  }

  int localMmiMnnrpDmePctCounter = -1;

  public boolean isMmiMnnrpDmePctModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiMnnrpDmePctCounter != sharedCounter;
    localMmiMnnrpDmePctCounter = sharedCounter;
    return hasModified;
  }

  public boolean mmiMnnrpDmePctIsNumeric() {
    return decimalIsNumeric(
        beginMmiMnnrpDmePct,
        MMI_MNNRP_DME_PCT_LEN); // check Packed Decimal field to see if it contains valid Number
  }
  /**
   * This method returns packed Decimal String in the mainframe format
   *
   * @return char[]
   */
  public char[] mmiMnnrpDmePctString() {
    return getPackedString(beginMmiMnnrpDmePct, MMI_MNNRP_DME_PCT_LEN);
  }

  protected static final int MMI_MNNRP_DME_PCT_LEN = 3;
  protected static final int MMI_MNNRP_DME_PCT_SCALE = 2;
  /** serializeMmiMnnrpDmePct */
  protected void serializeMmiMnnrpDmePct(BigDecimal mmiMnnrpDmePct) {
    putDecimal(
        beginMmiMnnrpDmePct, mmiMnnrpDmePct, MMI_MNNRP_DME_PCT_LEN, MMI_MNNRP_DME_PCT_SCALE, true);
    localMmiMnnrpDmePctCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected BigDecimal checkMmiMnnrpDmePctMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 5 /*precision*/);
  }
  /**
   * refreshMmiMnnrpDmePct is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshMmiMnnrpDmePct() throws CFException {
    try {
      return (getDecimal(beginMmiMnnrpDmePct, MMI_MNNRP_DME_PCT_LEN, MMI_MNNRP_DME_PCT_SCALE));
    } catch (Exception ex) {
      throw getSoc7ABend("mmiMnnrpDmePct", beginMmiMnnrpDmePct, MMI_MNNRP_DME_PCT_LEN);
    }
  }

  int localMmiOonLftmMaxAmtCounter = -1;

  public boolean isMmiOonLftmMaxAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiOonLftmMaxAmtCounter != sharedCounter;
    localMmiOonLftmMaxAmtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_OON_LFTM_MAX_AMT_LEN = 4;
  /** serializeMmiOonLftmMaxAmt */
  protected void serializeMmiOonLftmMaxAmt(int mmiOonLftmMaxAmt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiOonLftmMaxAmt, MMI_OON_LFTM_MAX_AMT_LEN),
        beginMmiOonLftmMaxAmt,
        MMI_OON_LFTM_MAX_AMT_LEN);
    localMmiOonLftmMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkMmiOonLftmMaxAmtMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshMmiOonLftmMaxAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshMmiOonLftmMaxAmt() {
    return (getInt(beginMmiOonLftmMaxAmt));
  }

  int localMmiBusSegPltfmCounter = -1;

  public boolean isMmiBusSegPltfmModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBusSegPltfmCounter != sharedCounter;
    localMmiBusSegPltfmCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BUS_SEG_PLTFM_LEN = 3;
  /** serialize this MmiBusSegPltfm */
  protected void serializeMmiBusSegPltfm(char[] mmiBusSegPltfm) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiBusSegPltfm, 0, getStringValue(), beginMmiBusSegPltfm, MMI_BUS_SEG_PLTFM_LEN);
    localMmiBusSegPltfmCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiBusSegPltfmConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshMmiBusSegPltfm is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiBusSegPltfm() {
    return (substring(
        getStringValue(), beginMmiBusSegPltfm, beginMmiBusSegPltfm + MMI_BUS_SEG_PLTFM_LEN));
  }

  int localMmiSviTblTerNbrCounter = -1;

  public boolean isMmiSviTblTerNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiSviTblTerNbrCounter != sharedCounter;
    localMmiSviTblTerNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_SVI_TBL_TER_NBR_LEN = 6;
  /** serialize this MmiSviTblTerNbr */
  protected void serializeMmiSviTblTerNbr(char[] mmiSviTblTerNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiSviTblTerNbr, 0, getStringValue(), beginMmiSviTblTerNbr, MMI_SVI_TBL_TER_NBR_LEN);
    localMmiSviTblTerNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiSviTblTerNbrConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshMmiSviTblTerNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiSviTblTerNbr() {
    return (substring(
        getStringValue(), beginMmiSviTblTerNbr, beginMmiSviTblTerNbr + MMI_SVI_TBL_TER_NBR_LEN));
  }

  int localMmiRelSrvcIndCounter = -1;

  public boolean isMmiRelSrvcIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiRelSrvcIndCounter != sharedCounter;
    localMmiRelSrvcIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_REL_SRVC_IND_LEN = 1;
  /** serialize this MmiRelSrvcInd */
  protected void serializeMmiRelSrvcInd(char[] mmiRelSrvcInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiRelSrvcInd, 0, getStringValue(), beginMmiRelSrvcInd, MMI_REL_SRVC_IND_LEN);
    localMmiRelSrvcIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiRelSrvcIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiRelSrvcInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiRelSrvcInd() {
    return (substring(
        getStringValue(), beginMmiRelSrvcInd, beginMmiRelSrvcInd + MMI_REL_SRVC_IND_LEN));
  }

  int localMmiCoreMedPrrAuthCdCounter = -1;

  public boolean isMmiCoreMedPrrAuthCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiCoreMedPrrAuthCdCounter != sharedCounter;
    localMmiCoreMedPrrAuthCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_CORE_MED_PRR_AUTH_CD_LEN = 1;
  /** serialize this MmiCoreMedPrrAuthCd */
  protected void serializeMmiCoreMedPrrAuthCd(char[] mmiCoreMedPrrAuthCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiCoreMedPrrAuthCd,
        0,
        getStringValue(),
        beginMmiCoreMedPrrAuthCd,
        MMI_CORE_MED_PRR_AUTH_CD_LEN);
    localMmiCoreMedPrrAuthCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiCoreMedPrrAuthCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiCoreMedPrrAuthCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshMmiCoreMedPrrAuthCd() {
    return (substring(
        getStringValue(),
        beginMmiCoreMedPrrAuthCd,
        beginMmiCoreMedPrrAuthCd + MMI_CORE_MED_PRR_AUTH_CD_LEN));
  }

  int localMmiPcpBenLvlRuleCounter = -1;

  public boolean isMmiPcpBenLvlRuleModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiPcpBenLvlRuleCounter != sharedCounter;
    localMmiPcpBenLvlRuleCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_PCP_BEN_LVL_RULE_LEN = 1;
  /** serialize this MmiPcpBenLvlRule */
  protected void serializeMmiPcpBenLvlRule(char[] mmiPcpBenLvlRule) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiPcpBenLvlRule, 0, getStringValue(), beginMmiPcpBenLvlRule, MMI_PCP_BEN_LVL_RULE_LEN);
    localMmiPcpBenLvlRuleCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiPcpBenLvlRuleConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiPcpBenLvlRule is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiPcpBenLvlRule() {
    return (substring(
        getStringValue(), beginMmiPcpBenLvlRule, beginMmiPcpBenLvlRule + MMI_PCP_BEN_LVL_RULE_LEN));
  }

  int localMmiMcrCdCounter = -1;

  public boolean isMmiMcrCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiMcrCdCounter != sharedCounter;
    localMmiMcrCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_MCR_CD_LEN = 1;
  /** serialize this MmiMcrCd */
  protected void serializeMmiMcrCd(char[] mmiMcrCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiMcrCd, 0, getStringValue(), beginMmiMcrCd, MMI_MCR_CD_LEN);
    localMmiMcrCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiMcrCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiMcrCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshMmiMcrCd() {
    return (substring(getStringValue(), beginMmiMcrCd, beginMmiMcrCd + MMI_MCR_CD_LEN));
  }

  int localMmiLmtSrvcCdCounter = -1;

  public boolean isMmiLmtSrvcCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiLmtSrvcCdCounter != sharedCounter;
    localMmiLmtSrvcCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_LMT_SRVC_CD_LEN = 1;
  /** serialize this MmiLmtSrvcCd */
  protected void serializeMmiLmtSrvcCd(char[] mmiLmtSrvcCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiLmtSrvcCd, 0, getStringValue(), beginMmiLmtSrvcCd, MMI_LMT_SRVC_CD_LEN);
    localMmiLmtSrvcCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiLmtSrvcCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiLmtSrvcCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiLmtSrvcCd() {
    return (substring(
        getStringValue(), beginMmiLmtSrvcCd, beginMmiLmtSrvcCd + MMI_LMT_SRVC_CD_LEN));
  }

  int localMmiEligXrefCdCounter = -1;

  public boolean isMmiEligXrefCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiEligXrefCdCounter != sharedCounter;
    localMmiEligXrefCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_ELIG_XREF_CD_LEN = 1;
  /** serialize this MmiEligXrefCd */
  protected void serializeMmiEligXrefCd(char[] mmiEligXrefCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmiEligXrefCd, 0, getStringValue(), beginMmiEligXrefCd, MMI_ELIG_XREF_CD_LEN);
    localMmiEligXrefCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiEligXrefCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiEligXrefCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiEligXrefCd() {
    return (substring(
        getStringValue(), beginMmiEligXrefCd, beginMmiEligXrefCd + MMI_ELIG_XREF_CD_LEN));
  }

  int localMmiBenMaxAuralCiPriCdCounter = -1;

  public boolean isMmiBenMaxAuralCiPriCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxAuralCiPriCdCounter != sharedCounter;
    localMmiBenMaxAuralCiPriCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_AURAL_CI_PRI_CD_LEN = 1;
  /** serialize this MmiBenMaxAuralCiPriCd */
  protected void serializeMmiBenMaxAuralCiPriCd(char[] mmiBenMaxAuralCiPriCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiBenMaxAuralCiPriCd,
        0,
        getStringValue(),
        beginMmiBenMaxAuralCiPriCd,
        MMI_BEN_MAX_AURAL_CI_PRI_CD_LEN);
    localMmiBenMaxAuralCiPriCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiBenMaxAuralCiPriCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiBenMaxAuralCiPriCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshMmiBenMaxAuralCiPriCd() {
    return (substring(
        getStringValue(),
        beginMmiBenMaxAuralCiPriCd,
        beginMmiBenMaxAuralCiPriCd + MMI_BEN_MAX_AURAL_CI_PRI_CD_LEN));
  }

  int localMmiBenMaxAuralCiPriCntCounter = -1;

  public boolean isMmiBenMaxAuralCiPriCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxAuralCiPriCntCounter != sharedCounter;
    localMmiBenMaxAuralCiPriCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_AURAL_CI_PRI_CNT_LEN = 2;
  /** serializeMmiBenMaxAuralCiPriCnt */
  protected void serializeMmiBenMaxAuralCiPriCnt(short mmiBenMaxAuralCiPriCnt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenMaxAuralCiPriCnt, MMI_BEN_MAX_AURAL_CI_PRI_CNT_LEN),
        beginMmiBenMaxAuralCiPriCnt,
        MMI_BEN_MAX_AURAL_CI_PRI_CNT_LEN);
    localMmiBenMaxAuralCiPriCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenMaxAuralCiPriCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenMaxAuralCiPriCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenMaxAuralCiPriCnt() {
    return (getShort(beginMmiBenMaxAuralCiPriCnt));
  }

  int localMmiBenMaxAuralCiSecCdCounter = -1;

  public boolean isMmiBenMaxAuralCiSecCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxAuralCiSecCdCounter != sharedCounter;
    localMmiBenMaxAuralCiSecCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_AURAL_CI_SEC_CD_LEN = 1;
  /** serialize this MmiBenMaxAuralCiSecCd */
  protected void serializeMmiBenMaxAuralCiSecCd(char[] mmiBenMaxAuralCiSecCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiBenMaxAuralCiSecCd,
        0,
        getStringValue(),
        beginMmiBenMaxAuralCiSecCd,
        MMI_BEN_MAX_AURAL_CI_SEC_CD_LEN);
    localMmiBenMaxAuralCiSecCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiBenMaxAuralCiSecCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiBenMaxAuralCiSecCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshMmiBenMaxAuralCiSecCd() {
    return (substring(
        getStringValue(),
        beginMmiBenMaxAuralCiSecCd,
        beginMmiBenMaxAuralCiSecCd + MMI_BEN_MAX_AURAL_CI_SEC_CD_LEN));
  }

  int localMmiBenMaxAuralCiSecCntCounter = -1;

  public boolean isMmiBenMaxAuralCiSecCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxAuralCiSecCntCounter != sharedCounter;
    localMmiBenMaxAuralCiSecCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_AURAL_CI_SEC_CNT_LEN = 2;
  /** serializeMmiBenMaxAuralCiSecCnt */
  protected void serializeMmiBenMaxAuralCiSecCnt(short mmiBenMaxAuralCiSecCnt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenMaxAuralCiSecCnt, MMI_BEN_MAX_AURAL_CI_SEC_CNT_LEN),
        beginMmiBenMaxAuralCiSecCnt,
        MMI_BEN_MAX_AURAL_CI_SEC_CNT_LEN);
    localMmiBenMaxAuralCiSecCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenMaxAuralCiSecCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenMaxAuralCiSecCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenMaxAuralCiSecCnt() {
    return (getShort(beginMmiBenMaxAuralCiSecCnt));
  }

  int localMmiBenMaxCogTrpyPriCdCounter = -1;

  public boolean isMmiBenMaxCogTrpyPriCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxCogTrpyPriCdCounter != sharedCounter;
    localMmiBenMaxCogTrpyPriCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_COG_TRPY_PRI_CD_LEN = 1;
  /** serialize this MmiBenMaxCogTrpyPriCd */
  protected void serializeMmiBenMaxCogTrpyPriCd(char[] mmiBenMaxCogTrpyPriCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiBenMaxCogTrpyPriCd,
        0,
        getStringValue(),
        beginMmiBenMaxCogTrpyPriCd,
        MMI_BEN_MAX_COG_TRPY_PRI_CD_LEN);
    localMmiBenMaxCogTrpyPriCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiBenMaxCogTrpyPriCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiBenMaxCogTrpyPriCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshMmiBenMaxCogTrpyPriCd() {
    return (substring(
        getStringValue(),
        beginMmiBenMaxCogTrpyPriCd,
        beginMmiBenMaxCogTrpyPriCd + MMI_BEN_MAX_COG_TRPY_PRI_CD_LEN));
  }

  int localMmiBenMaxCogTrpyPriCntCounter = -1;

  public boolean isMmiBenMaxCogTrpyPriCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxCogTrpyPriCntCounter != sharedCounter;
    localMmiBenMaxCogTrpyPriCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_COG_TRPY_PRI_CNT_LEN = 2;
  /** serializeMmiBenMaxCogTrpyPriCnt */
  protected void serializeMmiBenMaxCogTrpyPriCnt(short mmiBenMaxCogTrpyPriCnt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenMaxCogTrpyPriCnt, MMI_BEN_MAX_COG_TRPY_PRI_CNT_LEN),
        beginMmiBenMaxCogTrpyPriCnt,
        MMI_BEN_MAX_COG_TRPY_PRI_CNT_LEN);
    localMmiBenMaxCogTrpyPriCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenMaxCogTrpyPriCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenMaxCogTrpyPriCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenMaxCogTrpyPriCnt() {
    return (getShort(beginMmiBenMaxCogTrpyPriCnt));
  }

  int localMmiBenMaxCogTrpySecCdCounter = -1;

  public boolean isMmiBenMaxCogTrpySecCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxCogTrpySecCdCounter != sharedCounter;
    localMmiBenMaxCogTrpySecCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_COG_TRPY_SEC_CD_LEN = 1;
  /** serialize this MmiBenMaxCogTrpySecCd */
  protected void serializeMmiBenMaxCogTrpySecCd(char[] mmiBenMaxCogTrpySecCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiBenMaxCogTrpySecCd,
        0,
        getStringValue(),
        beginMmiBenMaxCogTrpySecCd,
        MMI_BEN_MAX_COG_TRPY_SEC_CD_LEN);
    localMmiBenMaxCogTrpySecCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiBenMaxCogTrpySecCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiBenMaxCogTrpySecCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshMmiBenMaxCogTrpySecCd() {
    return (substring(
        getStringValue(),
        beginMmiBenMaxCogTrpySecCd,
        beginMmiBenMaxCogTrpySecCd + MMI_BEN_MAX_COG_TRPY_SEC_CD_LEN));
  }

  int localMmiBenMaxCogTrpySecCntCounter = -1;

  public boolean isMmiBenMaxCogTrpySecCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxCogTrpySecCntCounter != sharedCounter;
    localMmiBenMaxCogTrpySecCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_COG_TRPY_SEC_CNT_LEN = 2;
  /** serializeMmiBenMaxCogTrpySecCnt */
  protected void serializeMmiBenMaxCogTrpySecCnt(short mmiBenMaxCogTrpySecCnt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenMaxCogTrpySecCnt, MMI_BEN_MAX_COG_TRPY_SEC_CNT_LEN),
        beginMmiBenMaxCogTrpySecCnt,
        MMI_BEN_MAX_COG_TRPY_SEC_CNT_LEN);
    localMmiBenMaxCogTrpySecCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenMaxCogTrpySecCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenMaxCogTrpySecCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenMaxCogTrpySecCnt() {
    return (getShort(beginMmiBenMaxCogTrpySecCnt));
  }

  int localMmiBenMaxCogTrpyExclCdCounter = -1;

  public boolean isMmiBenMaxCogTrpyExclCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxCogTrpyExclCdCounter != sharedCounter;
    localMmiBenMaxCogTrpyExclCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_COG_TRPY_EXCL_CD_LEN = 1;
  /** serialize this MmiBenMaxCogTrpyExclCd */
  protected void serializeMmiBenMaxCogTrpyExclCd(char[] mmiBenMaxCogTrpyExclCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiBenMaxCogTrpyExclCd,
        0,
        getStringValue(),
        beginMmiBenMaxCogTrpyExclCd,
        MMI_BEN_MAX_COG_TRPY_EXCL_CD_LEN);
    localMmiBenMaxCogTrpyExclCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiBenMaxCogTrpyExclCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiBenMaxCogTrpyExclCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshMmiBenMaxCogTrpyExclCd() {
    return (substring(
        getStringValue(),
        beginMmiBenMaxCogTrpyExclCd,
        beginMmiBenMaxCogTrpyExclCd + MMI_BEN_MAX_COG_TRPY_EXCL_CD_LEN));
  }

  int localMmiBenMaxEhbSpneRhabCntCounter = -1;

  public boolean isMmiBenMaxEhbSpneRhabCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxEhbSpneRhabCntCounter != sharedCounter;
    localMmiBenMaxEhbSpneRhabCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_EHB_SPNE_RHAB_CNT_LEN = 2;
  /** serializeMmiBenMaxEhbSpneRhabCnt */
  protected void serializeMmiBenMaxEhbSpneRhabCnt(short mmiBenMaxEhbSpneRhabCnt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenMaxEhbSpneRhabCnt, MMI_BEN_MAX_EHB_SPNE_RHAB_CNT_LEN),
        beginMmiBenMaxEhbSpneRhabCnt,
        MMI_BEN_MAX_EHB_SPNE_RHAB_CNT_LEN);
    localMmiBenMaxEhbSpneRhabCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenMaxEhbSpneRhabCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenMaxEhbSpneRhabCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenMaxEhbSpneRhabCnt() {
    return (getShort(beginMmiBenMaxEhbSpneRhabCnt));
  }

  int localMmiBenMaxEhbSpneHabCntCounter = -1;

  public boolean isMmiBenMaxEhbSpneHabCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxEhbSpneHabCntCounter != sharedCounter;
    localMmiBenMaxEhbSpneHabCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_EHB_SPNE_HAB_CNT_LEN = 2;
  /** serializeMmiBenMaxEhbSpneHabCnt */
  protected void serializeMmiBenMaxEhbSpneHabCnt(short mmiBenMaxEhbSpneHabCnt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenMaxEhbSpneHabCnt, MMI_BEN_MAX_EHB_SPNE_HAB_CNT_LEN),
        beginMmiBenMaxEhbSpneHabCnt,
        MMI_BEN_MAX_EHB_SPNE_HAB_CNT_LEN);
    localMmiBenMaxEhbSpneHabCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenMaxEhbSpneHabCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenMaxEhbSpneHabCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenMaxEhbSpneHabCnt() {
    return (getShort(beginMmiBenMaxEhbSpneHabCnt));
  }

  int localMmiBenMaxEhbPtRhabCntCounter = -1;

  public boolean isMmiBenMaxEhbPtRhabCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxEhbPtRhabCntCounter != sharedCounter;
    localMmiBenMaxEhbPtRhabCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_EHB_PT_RHAB_CNT_LEN = 2;
  /** serializeMmiBenMaxEhbPtRhabCnt */
  protected void serializeMmiBenMaxEhbPtRhabCnt(short mmiBenMaxEhbPtRhabCnt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenMaxEhbPtRhabCnt, MMI_BEN_MAX_EHB_PT_RHAB_CNT_LEN),
        beginMmiBenMaxEhbPtRhabCnt,
        MMI_BEN_MAX_EHB_PT_RHAB_CNT_LEN);
    localMmiBenMaxEhbPtRhabCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenMaxEhbPtRhabCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenMaxEhbPtRhabCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenMaxEhbPtRhabCnt() {
    return (getShort(beginMmiBenMaxEhbPtRhabCnt));
  }

  int localMmiBenMaxEhbPtHabCntCounter = -1;

  public boolean isMmiBenMaxEhbPtHabCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxEhbPtHabCntCounter != sharedCounter;
    localMmiBenMaxEhbPtHabCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_EHB_PT_HAB_CNT_LEN = 2;
  /** serializeMmiBenMaxEhbPtHabCnt */
  protected void serializeMmiBenMaxEhbPtHabCnt(short mmiBenMaxEhbPtHabCnt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenMaxEhbPtHabCnt, MMI_BEN_MAX_EHB_PT_HAB_CNT_LEN),
        beginMmiBenMaxEhbPtHabCnt,
        MMI_BEN_MAX_EHB_PT_HAB_CNT_LEN);
    localMmiBenMaxEhbPtHabCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenMaxEhbPtHabCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenMaxEhbPtHabCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenMaxEhbPtHabCnt() {
    return (getShort(beginMmiBenMaxEhbPtHabCnt));
  }

  int localMmiBenMaxEhbSpchRhabCntCounter = -1;

  public boolean isMmiBenMaxEhbSpchRhabCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxEhbSpchRhabCntCounter != sharedCounter;
    localMmiBenMaxEhbSpchRhabCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_EHB_SPCH_RHAB_CNT_LEN = 2;
  /** serializeMmiBenMaxEhbSpchRhabCnt */
  protected void serializeMmiBenMaxEhbSpchRhabCnt(short mmiBenMaxEhbSpchRhabCnt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenMaxEhbSpchRhabCnt, MMI_BEN_MAX_EHB_SPCH_RHAB_CNT_LEN),
        beginMmiBenMaxEhbSpchRhabCnt,
        MMI_BEN_MAX_EHB_SPCH_RHAB_CNT_LEN);
    localMmiBenMaxEhbSpchRhabCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenMaxEhbSpchRhabCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenMaxEhbSpchRhabCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenMaxEhbSpchRhabCnt() {
    return (getShort(beginMmiBenMaxEhbSpchRhabCnt));
  }

  int localMmiBenMaxEhbSpchHabCntCounter = -1;

  public boolean isMmiBenMaxEhbSpchHabCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxEhbSpchHabCntCounter != sharedCounter;
    localMmiBenMaxEhbSpchHabCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_EHB_SPCH_HAB_CNT_LEN = 2;
  /** serializeMmiBenMaxEhbSpchHabCnt */
  protected void serializeMmiBenMaxEhbSpchHabCnt(short mmiBenMaxEhbSpchHabCnt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenMaxEhbSpchHabCnt, MMI_BEN_MAX_EHB_SPCH_HAB_CNT_LEN),
        beginMmiBenMaxEhbSpchHabCnt,
        MMI_BEN_MAX_EHB_SPCH_HAB_CNT_LEN);
    localMmiBenMaxEhbSpchHabCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenMaxEhbSpchHabCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenMaxEhbSpchHabCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenMaxEhbSpchHabCnt() {
    return (getShort(beginMmiBenMaxEhbSpchHabCnt));
  }

  int localMmiBenMaxEhbCrdcRhabCntCounter = -1;

  public boolean isMmiBenMaxEhbCrdcRhabCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxEhbCrdcRhabCntCounter != sharedCounter;
    localMmiBenMaxEhbCrdcRhabCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_EHB_CRDC_RHAB_CNT_LEN = 2;
  /** serializeMmiBenMaxEhbCrdcRhabCnt */
  protected void serializeMmiBenMaxEhbCrdcRhabCnt(short mmiBenMaxEhbCrdcRhabCnt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenMaxEhbCrdcRhabCnt, MMI_BEN_MAX_EHB_CRDC_RHAB_CNT_LEN),
        beginMmiBenMaxEhbCrdcRhabCnt,
        MMI_BEN_MAX_EHB_CRDC_RHAB_CNT_LEN);
    localMmiBenMaxEhbCrdcRhabCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenMaxEhbCrdcRhabCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenMaxEhbCrdcRhabCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenMaxEhbCrdcRhabCnt() {
    return (getShort(beginMmiBenMaxEhbCrdcRhabCnt));
  }

  int localMmiBenMaxEhbOtRhabCntCounter = -1;

  public boolean isMmiBenMaxEhbOtRhabCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxEhbOtRhabCntCounter != sharedCounter;
    localMmiBenMaxEhbOtRhabCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_EHB_OT_RHAB_CNT_LEN = 2;
  /** serializeMmiBenMaxEhbOtRhabCnt */
  protected void serializeMmiBenMaxEhbOtRhabCnt(short mmiBenMaxEhbOtRhabCnt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenMaxEhbOtRhabCnt, MMI_BEN_MAX_EHB_OT_RHAB_CNT_LEN),
        beginMmiBenMaxEhbOtRhabCnt,
        MMI_BEN_MAX_EHB_OT_RHAB_CNT_LEN);
    localMmiBenMaxEhbOtRhabCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenMaxEhbOtRhabCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenMaxEhbOtRhabCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenMaxEhbOtRhabCnt() {
    return (getShort(beginMmiBenMaxEhbOtRhabCnt));
  }

  int localMmiBenMaxEhbOtHabCntCounter = -1;

  public boolean isMmiBenMaxEhbOtHabCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxEhbOtHabCntCounter != sharedCounter;
    localMmiBenMaxEhbOtHabCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_EHB_OT_HAB_CNT_LEN = 2;
  /** serializeMmiBenMaxEhbOtHabCnt */
  protected void serializeMmiBenMaxEhbOtHabCnt(short mmiBenMaxEhbOtHabCnt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenMaxEhbOtHabCnt, MMI_BEN_MAX_EHB_OT_HAB_CNT_LEN),
        beginMmiBenMaxEhbOtHabCnt,
        MMI_BEN_MAX_EHB_OT_HAB_CNT_LEN);
    localMmiBenMaxEhbOtHabCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenMaxEhbOtHabCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenMaxEhbOtHabCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenMaxEhbOtHabCnt() {
    return (getShort(beginMmiBenMaxEhbOtHabCnt));
  }

  int localMmiBenMaxEhbPlmryRhabCntCounter = -1;

  public boolean isMmiBenMaxEhbPlmryRhabCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxEhbPlmryRhabCntCounter != sharedCounter;
    localMmiBenMaxEhbPlmryRhabCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_EHB_PLMRY_RHAB_CNT_LEN = 2;
  /** serializeMmiBenMaxEhbPlmryRhabCnt */
  protected void serializeMmiBenMaxEhbPlmryRhabCnt(short mmiBenMaxEhbPlmryRhabCnt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenMaxEhbPlmryRhabCnt, MMI_BEN_MAX_EHB_PLMRY_RHAB_CNT_LEN),
        beginMmiBenMaxEhbPlmryRhabCnt,
        MMI_BEN_MAX_EHB_PLMRY_RHAB_CNT_LEN);
    localMmiBenMaxEhbPlmryRhabCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenMaxEhbPlmryRhabCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenMaxEhbPlmryRhabCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenMaxEhbPlmryRhabCnt() {
    return (getShort(beginMmiBenMaxEhbPlmryRhabCnt));
  }

  int localMmiBenMaxEhbAuralRhabCntCounter = -1;

  public boolean isMmiBenMaxEhbAuralRhabCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxEhbAuralRhabCntCounter != sharedCounter;
    localMmiBenMaxEhbAuralRhabCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_EHB_AURAL_RHAB_CNT_LEN = 2;
  /** serializeMmiBenMaxEhbAuralRhabCnt */
  protected void serializeMmiBenMaxEhbAuralRhabCnt(short mmiBenMaxEhbAuralRhabCnt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenMaxEhbAuralRhabCnt, MMI_BEN_MAX_EHB_AURAL_RHAB_CNT_LEN),
        beginMmiBenMaxEhbAuralRhabCnt,
        MMI_BEN_MAX_EHB_AURAL_RHAB_CNT_LEN);
    localMmiBenMaxEhbAuralRhabCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenMaxEhbAuralRhabCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenMaxEhbAuralRhabCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenMaxEhbAuralRhabCnt() {
    return (getShort(beginMmiBenMaxEhbAuralRhabCnt));
  }

  int localMmiBenMaxEhbAuralHabCntCounter = -1;

  public boolean isMmiBenMaxEhbAuralHabCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxEhbAuralHabCntCounter != sharedCounter;
    localMmiBenMaxEhbAuralHabCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_EHB_AURAL_HAB_CNT_LEN = 2;
  /** serializeMmiBenMaxEhbAuralHabCnt */
  protected void serializeMmiBenMaxEhbAuralHabCnt(short mmiBenMaxEhbAuralHabCnt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenMaxEhbAuralHabCnt, MMI_BEN_MAX_EHB_AURAL_HAB_CNT_LEN),
        beginMmiBenMaxEhbAuralHabCnt,
        MMI_BEN_MAX_EHB_AURAL_HAB_CNT_LEN);
    localMmiBenMaxEhbAuralHabCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenMaxEhbAuralHabCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenMaxEhbAuralHabCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenMaxEhbAuralHabCnt() {
    return (getShort(beginMmiBenMaxEhbAuralHabCnt));
  }

  int localMmiBenMaxEhbCogRhabCntCounter = -1;

  public boolean isMmiBenMaxEhbCogRhabCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxEhbCogRhabCntCounter != sharedCounter;
    localMmiBenMaxEhbCogRhabCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_EHB_COG_RHAB_CNT_LEN = 2;
  /** serializeMmiBenMaxEhbCogRhabCnt */
  protected void serializeMmiBenMaxEhbCogRhabCnt(short mmiBenMaxEhbCogRhabCnt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenMaxEhbCogRhabCnt, MMI_BEN_MAX_EHB_COG_RHAB_CNT_LEN),
        beginMmiBenMaxEhbCogRhabCnt,
        MMI_BEN_MAX_EHB_COG_RHAB_CNT_LEN);
    localMmiBenMaxEhbCogRhabCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenMaxEhbCogRhabCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenMaxEhbCogRhabCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenMaxEhbCogRhabCnt() {
    return (getShort(beginMmiBenMaxEhbCogRhabCnt));
  }

  int localMmiBenMaxEhbCogHabCntCounter = -1;

  public boolean isMmiBenMaxEhbCogHabCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxEhbCogHabCntCounter != sharedCounter;
    localMmiBenMaxEhbCogHabCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_EHB_COG_HAB_CNT_LEN = 2;
  /** serializeMmiBenMaxEhbCogHabCnt */
  protected void serializeMmiBenMaxEhbCogHabCnt(short mmiBenMaxEhbCogHabCnt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenMaxEhbCogHabCnt, MMI_BEN_MAX_EHB_COG_HAB_CNT_LEN),
        beginMmiBenMaxEhbCogHabCnt,
        MMI_BEN_MAX_EHB_COG_HAB_CNT_LEN);
    localMmiBenMaxEhbCogHabCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenMaxEhbCogHabCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenMaxEhbCogHabCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenMaxEhbCogHabCnt() {
    return (getShort(beginMmiBenMaxEhbCogHabCnt));
  }

  int localMmiBenMaxEhbPostRhabCntCounter = -1;

  public boolean isMmiBenMaxEhbPostRhabCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxEhbPostRhabCntCounter != sharedCounter;
    localMmiBenMaxEhbPostRhabCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_EHB_POST_RHAB_CNT_LEN = 2;
  /** serializeMmiBenMaxEhbPostRhabCnt */
  protected void serializeMmiBenMaxEhbPostRhabCnt(short mmiBenMaxEhbPostRhabCnt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenMaxEhbPostRhabCnt, MMI_BEN_MAX_EHB_POST_RHAB_CNT_LEN),
        beginMmiBenMaxEhbPostRhabCnt,
        MMI_BEN_MAX_EHB_POST_RHAB_CNT_LEN);
    localMmiBenMaxEhbPostRhabCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenMaxEhbPostRhabCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenMaxEhbPostRhabCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenMaxEhbPostRhabCnt() {
    return (getShort(beginMmiBenMaxEhbPostRhabCnt));
  }

  int localMmiBenMaxEhbPostHabCntCounter = -1;

  public boolean isMmiBenMaxEhbPostHabCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxEhbPostHabCntCounter != sharedCounter;
    localMmiBenMaxEhbPostHabCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_EHB_POST_HAB_CNT_LEN = 2;
  /** serializeMmiBenMaxEhbPostHabCnt */
  protected void serializeMmiBenMaxEhbPostHabCnt(short mmiBenMaxEhbPostHabCnt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenMaxEhbPostHabCnt, MMI_BEN_MAX_EHB_POST_HAB_CNT_LEN),
        beginMmiBenMaxEhbPostHabCnt,
        MMI_BEN_MAX_EHB_POST_HAB_CNT_LEN);
    localMmiBenMaxEhbPostHabCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenMaxEhbPostHabCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenMaxEhbPostHabCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenMaxEhbPostHabCnt() {
    return (getShort(beginMmiBenMaxEhbPostHabCnt));
  }

  int localMmiBenMaxEhbPtotRhabCntCounter = -1;

  public boolean isMmiBenMaxEhbPtotRhabCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxEhbPtotRhabCntCounter != sharedCounter;
    localMmiBenMaxEhbPtotRhabCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_EHB_PTOT_RHAB_CNT_LEN = 2;
  /** serializeMmiBenMaxEhbPtotRhabCnt */
  protected void serializeMmiBenMaxEhbPtotRhabCnt(short mmiBenMaxEhbPtotRhabCnt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenMaxEhbPtotRhabCnt, MMI_BEN_MAX_EHB_PTOT_RHAB_CNT_LEN),
        beginMmiBenMaxEhbPtotRhabCnt,
        MMI_BEN_MAX_EHB_PTOT_RHAB_CNT_LEN);
    localMmiBenMaxEhbPtotRhabCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenMaxEhbPtotRhabCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenMaxEhbPtotRhabCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenMaxEhbPtotRhabCnt() {
    return (getShort(beginMmiBenMaxEhbPtotRhabCnt));
  }

  int localMmiBenMaxEhbPtotHabCntCounter = -1;

  public boolean isMmiBenMaxEhbPtotHabCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxEhbPtotHabCntCounter != sharedCounter;
    localMmiBenMaxEhbPtotHabCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_EHB_PTOT_HAB_CNT_LEN = 2;
  /** serializeMmiBenMaxEhbPtotHabCnt */
  protected void serializeMmiBenMaxEhbPtotHabCnt(short mmiBenMaxEhbPtotHabCnt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenMaxEhbPtotHabCnt, MMI_BEN_MAX_EHB_PTOT_HAB_CNT_LEN),
        beginMmiBenMaxEhbPtotHabCnt,
        MMI_BEN_MAX_EHB_PTOT_HAB_CNT_LEN);
    localMmiBenMaxEhbPtotHabCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenMaxEhbPtotHabCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenMaxEhbPtotHabCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenMaxEhbPtotHabCnt() {
    return (getShort(beginMmiBenMaxEhbPtotHabCnt));
  }

  int localMmiBenMaxEhbRhabRmrkCdCounter = -1;

  public boolean isMmiBenMaxEhbRhabRmrkCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxEhbRhabRmrkCdCounter != sharedCounter;
    localMmiBenMaxEhbRhabRmrkCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_EHB_RHAB_RMRK_CD_LEN = 3;
  /** serialize this MmiBenMaxEhbRhabRmrkCd */
  protected void serializeMmiBenMaxEhbRhabRmrkCd(char[] mmiBenMaxEhbRhabRmrkCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiBenMaxEhbRhabRmrkCd,
        0,
        getStringValue(),
        beginMmiBenMaxEhbRhabRmrkCd,
        MMI_BEN_MAX_EHB_RHAB_RMRK_CD_LEN);
    localMmiBenMaxEhbRhabRmrkCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiBenMaxEhbRhabRmrkCdConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshMmiBenMaxEhbRhabRmrkCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshMmiBenMaxEhbRhabRmrkCd() {
    return (substring(
        getStringValue(),
        beginMmiBenMaxEhbRhabRmrkCd,
        beginMmiBenMaxEhbRhabRmrkCd + MMI_BEN_MAX_EHB_RHAB_RMRK_CD_LEN));
  }

  int localMmiBenMaxEhbPosmRhabCntCounter = -1;

  public boolean isMmiBenMaxEhbPosmRhabCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxEhbPosmRhabCntCounter != sharedCounter;
    localMmiBenMaxEhbPosmRhabCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_EHB_POSM_RHAB_CNT_LEN = 2;
  /** serializeMmiBenMaxEhbPosmRhabCnt */
  protected void serializeMmiBenMaxEhbPosmRhabCnt(short mmiBenMaxEhbPosmRhabCnt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenMaxEhbPosmRhabCnt, MMI_BEN_MAX_EHB_POSM_RHAB_CNT_LEN),
        beginMmiBenMaxEhbPosmRhabCnt,
        MMI_BEN_MAX_EHB_POSM_RHAB_CNT_LEN);
    localMmiBenMaxEhbPosmRhabCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenMaxEhbPosmRhabCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenMaxEhbPosmRhabCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenMaxEhbPosmRhabCnt() {
    return (getShort(beginMmiBenMaxEhbPosmRhabCnt));
  }

  int localMmiBenMaxEhbPosmHabCntCounter = -1;

  public boolean isMmiBenMaxEhbPosmHabCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxEhbPosmHabCntCounter != sharedCounter;
    localMmiBenMaxEhbPosmHabCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_EHB_POSM_HAB_CNT_LEN = 2;
  /** serializeMmiBenMaxEhbPosmHabCnt */
  protected void serializeMmiBenMaxEhbPosmHabCnt(short mmiBenMaxEhbPosmHabCnt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenMaxEhbPosmHabCnt, MMI_BEN_MAX_EHB_POSM_HAB_CNT_LEN),
        beginMmiBenMaxEhbPosmHabCnt,
        MMI_BEN_MAX_EHB_POSM_HAB_CNT_LEN);
    localMmiBenMaxEhbPosmHabCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenMaxEhbPosmHabCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenMaxEhbPosmHabCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenMaxEhbPosmHabCnt() {
    return (getShort(beginMmiBenMaxEhbPosmHabCnt));
  }

  int localMmiBenMaxEhbHabRmrkCdCounter = -1;

  public boolean isMmiBenMaxEhbHabRmrkCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxEhbHabRmrkCdCounter != sharedCounter;
    localMmiBenMaxEhbHabRmrkCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_EHB_HAB_RMRK_CD_LEN = 3;
  /** serialize this MmiBenMaxEhbHabRmrkCd */
  protected void serializeMmiBenMaxEhbHabRmrkCd(char[] mmiBenMaxEhbHabRmrkCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiBenMaxEhbHabRmrkCd,
        0,
        getStringValue(),
        beginMmiBenMaxEhbHabRmrkCd,
        MMI_BEN_MAX_EHB_HAB_RMRK_CD_LEN);
    localMmiBenMaxEhbHabRmrkCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiBenMaxEhbHabRmrkCdConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshMmiBenMaxEhbHabRmrkCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshMmiBenMaxEhbHabRmrkCd() {
    return (substring(
        getStringValue(),
        beginMmiBenMaxEhbHabRmrkCd,
        beginMmiBenMaxEhbHabRmrkCd + MMI_BEN_MAX_EHB_HAB_RMRK_CD_LEN));
  }

  int localMmiBenPhysMedcnPrdCdCounter = -1;

  public boolean isMmiBenPhysMedcnPrdCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenPhysMedcnPrdCdCounter != sharedCounter;
    localMmiBenPhysMedcnPrdCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_PHYS_MEDCN_PRD_CD_LEN = 1;
  /** serialize this MmiBenPhysMedcnPrdCd */
  protected void serializeMmiBenPhysMedcnPrdCd(char[] mmiBenPhysMedcnPrdCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiBenPhysMedcnPrdCd,
        0,
        getStringValue(),
        beginMmiBenPhysMedcnPrdCd,
        MMI_BEN_PHYS_MEDCN_PRD_CD_LEN);
    localMmiBenPhysMedcnPrdCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiBenPhysMedcnPrdCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiBenPhysMedcnPrdCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshMmiBenPhysMedcnPrdCd() {
    return (substring(
        getStringValue(),
        beginMmiBenPhysMedcnPrdCd,
        beginMmiBenPhysMedcnPrdCd + MMI_BEN_PHYS_MEDCN_PRD_CD_LEN));
  }

  int localMmiBenAutsmAgeYrFrValCounter = -1;

  public boolean isMmiBenAutsmAgeYrFrValModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenAutsmAgeYrFrValCounter != sharedCounter;
    localMmiBenAutsmAgeYrFrValCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_AUTSM_AGE_YR_FR_VAL_LEN = 2;
  /** serializeMmiBenAutsmAgeYrFrVal */
  protected void serializeMmiBenAutsmAgeYrFrVal(short mmiBenAutsmAgeYrFrVal) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenAutsmAgeYrFrVal, MMI_BEN_AUTSM_AGE_YR_FR_VAL_LEN),
        beginMmiBenAutsmAgeYrFrVal,
        MMI_BEN_AUTSM_AGE_YR_FR_VAL_LEN);
    localMmiBenAutsmAgeYrFrValCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenAutsmAgeYrFrValMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenAutsmAgeYrFrVal is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenAutsmAgeYrFrVal() {
    return (getShort(beginMmiBenAutsmAgeYrFrVal));
  }

  int localMmiBenAutsmAgeYrToValCounter = -1;

  public boolean isMmiBenAutsmAgeYrToValModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenAutsmAgeYrToValCounter != sharedCounter;
    localMmiBenAutsmAgeYrToValCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_AUTSM_AGE_YR_TO_VAL_LEN = 2;
  /** serializeMmiBenAutsmAgeYrToVal */
  protected void serializeMmiBenAutsmAgeYrToVal(short mmiBenAutsmAgeYrToVal) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenAutsmAgeYrToVal, MMI_BEN_AUTSM_AGE_YR_TO_VAL_LEN),
        beginMmiBenAutsmAgeYrToVal,
        MMI_BEN_AUTSM_AGE_YR_TO_VAL_LEN);
    localMmiBenAutsmAgeYrToValCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenAutsmAgeYrToValMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenAutsmAgeYrToVal is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenAutsmAgeYrToVal() {
    return (getShort(beginMmiBenAutsmAgeYrToVal));
  }

  int localMmiBenAutsmPostCdCounter = -1;

  public boolean isMmiBenAutsmPostCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenAutsmPostCdCounter != sharedCounter;
    localMmiBenAutsmPostCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_AUTSM_POST_CD_LEN = 1;
  /** serialize this MmiBenAutsmPostCd */
  protected void serializeMmiBenAutsmPostCd(char[] mmiBenAutsmPostCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiBenAutsmPostCd, 0, getStringValue(), beginMmiBenAutsmPostCd, MMI_BEN_AUTSM_POST_CD_LEN);
    localMmiBenAutsmPostCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiBenAutsmPostCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiBenAutsmPostCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiBenAutsmPostCd() {
    return (substring(
        getStringValue(),
        beginMmiBenAutsmPostCd,
        beginMmiBenAutsmPostCd + MMI_BEN_AUTSM_POST_CD_LEN));
  }

  int localMmiBenAutsmAllCdCounter = -1;

  public boolean isMmiBenAutsmAllCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenAutsmAllCdCounter != sharedCounter;
    localMmiBenAutsmAllCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_AUTSM_ALL_CD_LEN = 1;
  /** serialize this MmiBenAutsmAllCd */
  protected void serializeMmiBenAutsmAllCd(char[] mmiBenAutsmAllCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiBenAutsmAllCd, 0, getStringValue(), beginMmiBenAutsmAllCd, MMI_BEN_AUTSM_ALL_CD_LEN);
    localMmiBenAutsmAllCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiBenAutsmAllCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiBenAutsmAllCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiBenAutsmAllCd() {
    return (substring(
        getStringValue(), beginMmiBenAutsmAllCd, beginMmiBenAutsmAllCd + MMI_BEN_AUTSM_ALL_CD_LEN));
  }

  int localMmiBenMaxPlmryRehbPriCdCounter = -1;

  public boolean isMmiBenMaxPlmryRehbPriCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxPlmryRehbPriCdCounter != sharedCounter;
    localMmiBenMaxPlmryRehbPriCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_PLMRY_REHB_PRI_CD_LEN = 1;
  /** serialize this MmiBenMaxPlmryRehbPriCd */
  protected void serializeMmiBenMaxPlmryRehbPriCd(char[] mmiBenMaxPlmryRehbPriCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiBenMaxPlmryRehbPriCd,
        0,
        getStringValue(),
        beginMmiBenMaxPlmryRehbPriCd,
        MMI_BEN_MAX_PLMRY_REHB_PRI_CD_LEN);
    localMmiBenMaxPlmryRehbPriCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiBenMaxPlmryRehbPriCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiBenMaxPlmryRehbPriCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshMmiBenMaxPlmryRehbPriCd() {
    return (substring(
        getStringValue(),
        beginMmiBenMaxPlmryRehbPriCd,
        beginMmiBenMaxPlmryRehbPriCd + MMI_BEN_MAX_PLMRY_REHB_PRI_CD_LEN));
  }

  int localMmiBenMaxPlmryRehbSecCdCounter = -1;

  public boolean isMmiBenMaxPlmryRehbSecCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxPlmryRehbSecCdCounter != sharedCounter;
    localMmiBenMaxPlmryRehbSecCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_PLMRY_REHB_SEC_CD_LEN = 1;
  /** serialize this MmiBenMaxPlmryRehbSecCd */
  protected void serializeMmiBenMaxPlmryRehbSecCd(char[] mmiBenMaxPlmryRehbSecCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiBenMaxPlmryRehbSecCd,
        0,
        getStringValue(),
        beginMmiBenMaxPlmryRehbSecCd,
        MMI_BEN_MAX_PLMRY_REHB_SEC_CD_LEN);
    localMmiBenMaxPlmryRehbSecCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiBenMaxPlmryRehbSecCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiBenMaxPlmryRehbSecCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshMmiBenMaxPlmryRehbSecCd() {
    return (substring(
        getStringValue(),
        beginMmiBenMaxPlmryRehbSecCd,
        beginMmiBenMaxPlmryRehbSecCd + MMI_BEN_MAX_PLMRY_REHB_SEC_CD_LEN));
  }

  int localMmiBenMaxPlmryRehbSecCntCounter = -1;

  public boolean isMmiBenMaxPlmryRehbSecCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenMaxPlmryRehbSecCntCounter != sharedCounter;
    localMmiBenMaxPlmryRehbSecCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_MAX_PLMRY_REHB_SEC_CNT_LEN = 2;
  /** serializeMmiBenMaxPlmryRehbSecCnt */
  protected void serializeMmiBenMaxPlmryRehbSecCnt(short mmiBenMaxPlmryRehbSecCnt) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenMaxPlmryRehbSecCnt, MMI_BEN_MAX_PLMRY_REHB_SEC_CNT_LEN),
        beginMmiBenMaxPlmryRehbSecCnt,
        MMI_BEN_MAX_PLMRY_REHB_SEC_CNT_LEN);
    localMmiBenMaxPlmryRehbSecCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenMaxPlmryRehbSecCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenMaxPlmryRehbSecCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenMaxPlmryRehbSecCnt() {
    return (getShort(beginMmiBenMaxPlmryRehbSecCnt));
  }

  int localMmiSiteSrvcPrtcpCdCounter = -1;

  public boolean isMmiSiteSrvcPrtcpCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiSiteSrvcPrtcpCdCounter != sharedCounter;
    localMmiSiteSrvcPrtcpCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_SITE_SRVC_PRTCP_CD_LEN = 1;
  /** serialize this MmiSiteSrvcPrtcpCd */
  protected void serializeMmiSiteSrvcPrtcpCd(char[] mmiSiteSrvcPrtcpCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiSiteSrvcPrtcpCd,
        0,
        getStringValue(),
        beginMmiSiteSrvcPrtcpCd,
        MMI_SITE_SRVC_PRTCP_CD_LEN);
    localMmiSiteSrvcPrtcpCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiSiteSrvcPrtcpCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiSiteSrvcPrtcpCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiSiteSrvcPrtcpCd() {
    return (substring(
        getStringValue(),
        beginMmiSiteSrvcPrtcpCd,
        beginMmiSiteSrvcPrtcpCd + MMI_SITE_SRVC_PRTCP_CD_LEN));
  }

  int localMmiBenAutsm2AgeYrFrValCounter = -1;

  public boolean isMmiBenAutsm2AgeYrFrValModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenAutsm2AgeYrFrValCounter != sharedCounter;
    localMmiBenAutsm2AgeYrFrValCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_AUTSM_2_AGE_YR_FR_VAL_LEN = 2;
  /** serializeMmiBenAutsm2AgeYrFrVal */
  protected void serializeMmiBenAutsm2AgeYrFrVal(short mmiBenAutsm2AgeYrFrVal) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenAutsm2AgeYrFrVal, MMI_BEN_AUTSM_2_AGE_YR_FR_VAL_LEN),
        beginMmiBenAutsm2AgeYrFrVal,
        MMI_BEN_AUTSM_2_AGE_YR_FR_VAL_LEN);
    localMmiBenAutsm2AgeYrFrValCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenAutsm2AgeYrFrValMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenAutsm2AgeYrFrVal is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenAutsm2AgeYrFrVal() {
    return (getShort(beginMmiBenAutsm2AgeYrFrVal));
  }

  int localMmiBenAutsm2AgeYrToValCounter = -1;

  public boolean isMmiBenAutsm2AgeYrToValModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenAutsm2AgeYrToValCounter != sharedCounter;
    localMmiBenAutsm2AgeYrToValCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_AUTSM_2_AGE_YR_TO_VAL_LEN = 2;
  /** serializeMmiBenAutsm2AgeYrToVal */
  protected void serializeMmiBenAutsm2AgeYrToVal(short mmiBenAutsm2AgeYrToVal) {
    replaceValue( //  save the value as string
        getBinaryString(mmiBenAutsm2AgeYrToVal, MMI_BEN_AUTSM_2_AGE_YR_TO_VAL_LEN),
        beginMmiBenAutsm2AgeYrToVal,
        MMI_BEN_AUTSM_2_AGE_YR_TO_VAL_LEN);
    localMmiBenAutsm2AgeYrToValCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkMmiBenAutsm2AgeYrToValMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshMmiBenAutsm2AgeYrToVal is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshMmiBenAutsm2AgeYrToVal() {
    return (getShort(beginMmiBenAutsm2AgeYrToVal));
  }

  int localMmiBenAutsm2PostCdCounter = -1;

  public boolean isMmiBenAutsm2PostCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenAutsm2PostCdCounter != sharedCounter;
    localMmiBenAutsm2PostCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_AUTSM_2_POST_CD_LEN = 1;
  /** serialize this MmiBenAutsm2PostCd */
  protected void serializeMmiBenAutsm2PostCd(char[] mmiBenAutsm2PostCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiBenAutsm2PostCd,
        0,
        getStringValue(),
        beginMmiBenAutsm2PostCd,
        MMI_BEN_AUTSM_2_POST_CD_LEN);
    localMmiBenAutsm2PostCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiBenAutsm2PostCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiBenAutsm2PostCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiBenAutsm2PostCd() {
    return (substring(
        getStringValue(),
        beginMmiBenAutsm2PostCd,
        beginMmiBenAutsm2PostCd + MMI_BEN_AUTSM_2_POST_CD_LEN));
  }

  int localMmiBenAutsm2AllCdCounter = -1;

  public boolean isMmiBenAutsm2AllCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmiBenAutsm2AllCdCounter != sharedCounter;
    localMmiBenAutsm2AllCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMI_BEN_AUTSM_2_ALL_CD_LEN = 1;
  /** serialize this MmiBenAutsm2AllCd */
  protected void serializeMmiBenAutsm2AllCd(char[] mmiBenAutsm2AllCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmiBenAutsm2AllCd, 0, getStringValue(), beginMmiBenAutsm2AllCd, MMI_BEN_AUTSM_2_ALL_CD_LEN);
    localMmiBenAutsm2AllCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmiBenAutsm2AllCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmiBenAutsm2AllCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmiBenAutsm2AllCd() {
    return (substring(
        getStringValue(),
        beginMmiBenAutsm2AllCd,
        beginMmiBenAutsm2AllCd + MMI_BEN_AUTSM_2_ALL_CD_LEN));
  }
}
