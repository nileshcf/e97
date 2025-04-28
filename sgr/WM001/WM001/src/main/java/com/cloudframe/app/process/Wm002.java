package com.cloudframe.app.process;

import com.cloudframe.app.wm002.Wm002Ctx.HcfaFormatTestInCtx;
import com.cloudframe.app.wm002.Wm002Ctx.ProcessInputFileInCtx;
import com.cloudframe.app.wm002.Wm002Ctx.StartPgmInCtx;
import com.cloudframe.app.wm002.Wm002Ctx.VerifyHeaderInCtx;
import com.cloudframe.app.wm002.Wm002Ctx.EditAccretionTransInCtx;
import com.cloudframe.app.wm002.Wm002Ctx.EditEffdte310InCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.wm002.Wm002Ctx;
import com.cloudframe.app.wm002.Wm002Ctx.ProcessInputFileOutCtx;
import com.cloudframe.app.wm002.Wm002Ctx.BadPlanidCheckInCtx;
import com.cloudframe.app.wm002.Wm002Ctx.BypassPaceDobCheckInCtx;
import com.cloudframe.app.wm002.Wm002Ctx.ReadMbiInCtx;
import com.cloudframe.app.wm002.Wm002Ctx.BeqrEligInCtx;
import com.cloudframe.app.wm002.Wm002Ctx.MbdEligInCtx;
import com.cloudframe.app.wm002.Wm002Ctx.Continue030InCtx;
import com.cloudframe.app.wm002.Wm002Ctx.VerifyWithMbdMasterInCtx;
import com.cloudframe.app.wm002.Wm002Ctx.ReadMbdO200InCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.wm002.Wm002Ctx.StartPgmOutCtx;
import com.cloudframe.app.wm002.Wm002Ctx.CheckKeyConversionInCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Wm002 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 000-START-PGM
     *
     * @return 
     */
    public StartPgmOutCtx startPgm(StartPgmInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 004-CHECK-FOR-EEM-AND-BEQ
     *
     */
    public void checkForEemAndBeq(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 005-GET-CPM
     *
     */
    public void getCpm(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 006-GET-CUTOFF-TIME
     *
     */
    public void getCutoffTime(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 010-OPEN-FILES
     *
     */
    public void openFiles(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 020-VERIFY-HEADER
     *
     */
    public void verifyHeader(VerifyHeaderInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 030-REJECT-INPUT-FILE
     *
     */
    public void rejectInputFile(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 030-OUTPUT-HEADER-RECD
     *
     */
    public void outputHeaderRecd(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 030-PROCESS-INPUT-FILE
     *
     * @return 
     */
    public ProcessInputFileOutCtx processInputFile(ProcessInputFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 030-BAD-PLANID-CHECK
     *
     */
    public void badPlanidCheck(BadPlanidCheckInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 030-DELETE-TRANS-REC
     *
     */
    public void deleteTransRec(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 030-PROCESS-ACCRETION-TRANS
     *
     */
    public void processAccretionTrans(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 030-PROCESS-DELETION-TRANS
     *
     */
    public void processDeletionTrans(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 030-PROCESS-CHANGE-TRANS
     *
     */
    public void processChangeTrans(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 030-PROCESS-CANCEL-TRANS
     *
     */
    public void processCancelTrans(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 030-PROCESS-FA-TRANS
     *
     */
    public void processFaTrans(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 030-PROCESS-POS-DRUG-EDIT
     *
     */
    public void processPosDrugEdit(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 030-PROCESS-ICM-PART-EDIT
     *
     */
    public void processIcmPartEdit(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 030-PROCESS-PERSONAL-INFO
     *
     */
    public void processPersonalInfo(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 030-CONTINUE
     *
     */
    public void continue030(Continue030InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 099-END-OF-JOB
     *
     */
    public void endOfJob(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 200-EDIT-ACCRETION-TRANS
     *
     */
    public void editAccretionTrans(EditAccretionTransInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 210-EDIT-EFFDTE
     *
     */
    public void editEffdte(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 220-VERIFY-WITH-MBD-MASTER
     *
     */
    public void verifyWithMbdMaster(VerifyWithMbdMasterInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - BYPASS-PACE-DOB-CHECK
     *
     */
    public void bypassPaceDobCheck(BypassPaceDobCheckInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PACE-HOSPICE-CHECK-END
     *
     */
    public void paceHospiceCheckEnd(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 250-VERIFY-WITH-MBD-MASTER
     *
     */
    public void verifyWithMbdMaster250(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 300-EDIT-DELETION-TRANS
     *
     */
    public void editDeletionTrans(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 310-EDIT-EFFDTE
     *
     */
    public void editEffdte310(EditEffdte310InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 320-VERIFY-WITH-MBD-MASTER
     *
     */
    public void verifyWithMbdMaster320(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 300-EDIT-CHANGE-TRANS
     *
     */
    public void editChangeTrans(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 320-VERIFY-WITH-MBD-MASTER-1
     *
     */
    public void verifyWithMbdMaster1(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 320-BYPASS-MBD-CHECK-1
     *
     */
    public void bypassMbdCheck1(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 300-EDIT-CANCEL-TRANS
     *
     */
    public void editCancelTrans(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 320-VERIFY-WITH-MBD-MASTER-2
     *
     */
    public void verifyWithMbdMaster2(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 300-EDIT-FA-TRANS
     *
     */
    public void editFaTrans(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 320-VERIFY-WITH-MBD-MASTER-3
     *
     */
    public void verifyWithMbdMaster3(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 300-EDIT-POS-DRUG-EDIT
     *
     */
    public void editPosDrugEdit(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 320-VERIFY-WITH-MBD-MASTER-4
     *
     */
    public void verifyWithMbdMaster4(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 300-EDIT-ICM-PART-EDIT
     *
     */
    public void editIcmPartEdit(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 320-VERIFY-WITH-MBD-MASTER-5
     *
     */
    public void verifyWithMbdMaster5(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 320-END-DATE-EDIT
     *
     */
    public void endDateEdit(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 300-EDIT-PERSONAL-INFORMATION
     *
     */
    public void editPersonalInformation(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 320-VERIFY-WITH-MBD-MASTER-6
     *
     */
    public void verifyWithMbdMaster6(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 400-EDIT-COMMON-FIELDS
     *
     */
    public void editCommonFields(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 430-EDIT-SEX
     *
     */
    public void editSex(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 432-EDIT-BDAY
     *
     */
    public void editBday(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 435-EDIT-PLAN
     *
     */
    public void editPlan(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 440-EDIT-EFFDTE
     *
     */
    public void editEffdte440(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 440-EDIT-EFFDTE-EXIT
     *
     */
    public void editEffdteExit(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 410-VFY-DRUG-DATES
     *
     */
    public void vfyDrugDates(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 415-VFY-TC90-LEGACY
     *
     */
    public void vfyTc90Legacy(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 420-VFY-MMP-PASSVE-APPDTE
     *
     */
    public void vfyMmpPassveAppdte(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 420-VFY-MMP-PASSVE-APPDTE-EXIT
     *
     */
    public void vfyMmpPassveAppdteExit(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 421-VFY-MMP-TRANS-TRK-ID
     *
     */
    public void vfyMmpTransTrkId(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 422-MMP-PLN-SPEIFIC-EDITS
     *
     */
    public void mmpPlnSpeificEdits(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 422-NYFIDA-EDIT
     *
     */
    public void nyfidaEdit(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 422-NYFIDA-CK4FIDA
     *
     */
    public void nyfidaCk4fida(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 422-NYFIDA-TC51
     *
     */
    public void nyfidaTc51(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 422-NYFIDA-TC81
     *
     */
    public void nyfidaTc81(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 423-VFY-MMP-PASSVE-CARA
     *
     */
    public void vfyMmpPassveCara(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 432-VALIDATE-BDAY
     *
     */
    public void validateBday(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 433-VALIDATE-DATE
     *
     */
    public void validateDate(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 435-SUBTRACT-ONE-DAY
     *
     */
    public void subtractOneDay(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 435-ADD-ONE-DAY
     *
     */
    public void addOneDay(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 435-DATE-ADD-60DAYS
     *
     */
    public void dateAdd60days(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 436-VERIFY-DATE
     *
     */
    public void verifyDate(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 437-ADD-ONE-MONTH
     *
     */
    public void addOneMonth(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 438-SUB-3-MONTH
     *
     */
    public void sub3Month(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 438-ADD-3-MONTH
     *
     */
    public void add3Month(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 439-GET-QTR
     *
     */
    public void getQtr(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 440-VFY-TC61-ROLLOVER
     *
     */
    public void vfyTc61Rollover(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 441-VFY-TC61-ROLLOVER
     *
     */
    public void vfyTc61Rollover441(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 442-VFY-PLOE-AF
     *
     */
    public void vfyPloeAf(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 450-MA-ELECTION-LIMITS
     *
     */
    public void maElectionLimits(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 451-CHECK-SECOND-IEP
     *
     */
    public void checkSecondIep(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 452-CHECK-IEP
     *
     */
    public void checkIep(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 452A-IEP-EDIT-PRTD
     *
     */
    public void iepEditPrtd(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 453-MA-OEP-ELECTION
     *
     */
    public void maOepElection(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 455-PD-ELECTION-LIMITS
     *
     */
    public void pdElectionLimits(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 460-EDIT-MA-FIELDS
     *
     */
    public void editMaFields(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 470-EDIT-PD-FIELDS
     *
     */
    public void editPdFields(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 472-RX-EDIT-TYPE-60-61-71
     *
     */
    public void rxEditType606171(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 500-WRITE-TRANSACTION
     *
     */
    public void writeTransaction(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 600-CHECK-76-TRANS
     *
     */
    public void check76Trans(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 610-CHECK-72-4RX
     *
     */
    public void check724rx(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 620-CHECK-73-NUNCMO
     *
     */
    public void check73Nuncmo(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 625-CHECK-74-TRANS
     *
     */
    public void check74Trans(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 630-CHECK-75-TRANS
     *
     */
    public void check75Trans(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 635-CHECK-77-TRANS
     *
     */
    public void check77Trans(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 640-CHECK-78-TRANS
     *
     */
    public void check78Trans(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 645-CHECK-79-TRANS
     *
     */
    public void check79Trans(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 650-CHECK-80-TRANS
     *
     */
    public void check80Trans(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 655-CHECK-81-TRANS
     *
     */
    public void check81Trans(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 656-CHECK-FOR-NEW-HICN
     *
     */
    public void checkForNewHicn(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 660-CHECK-TRANS-82
     *
     */
    public void checkTrans82(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 665-CHECK-TRANS-83
     *
     */
    public void checkTrans83(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 700-VALIDATE-RX-FIELD
     *
     */
    public void validateRxField(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 710-VALIDATE-RX-FIELD
     *
     */
    public void validateRxField710(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 820-COMMIT
     *
     */
    public void commit(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 900-CHECK-CMSTRR
     *
     */
    public void checkCmstrr(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 901-CHECK-CMSTRR
     *
     */
    public void checkCmstrr901(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 902-CHECK-CMSTRR
     *
     */
    public void checkCmstrr902(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 903-DATE-CONVERSION
     *
     */
    public void dateConversion(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 904-CHECK-CMSTRR
     *
     */
    public void checkCmstrr904(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 905-CHECK-FOR-DUP-TRAN
     *
     */
    public void checkForDupTran(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 906-CHECK-TRR-TXNS8051
     *
     */
    public void checkTrrTxns8051(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 907-CHECK-TRR-TXN81
     *
     */
    public void checkTrrTxn81(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 908-T72-CMSTRR-CHK
     *
     */
    public void t72CmstrrChk(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 911-T76-CMSTRR-CHK
     *
     */
    public void t76CmstrrChk(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 908A-T72-TRR-CHECK
     *
     */
    public void t72TrrCheck(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 908B-T72-TRR-CHECK
     *
     */
    public void t72TrrCheck908B(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 908C-T72-TRR-CHECK
     *
     */
    public void t72TrrCheck908C(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 909-CHECK-FOR-PRIORS
     *
     */
    public void checkForPriors(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 910-CHECK-FOR-TRR-REJ
     *
     */
    public void checkForTrrRej(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 912-CHK-FOR-SAME-QTR-L-ELECTN
     *
     */
    public void chkForSameQtrLElectn(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 913-T92-TRR-CHECK
     *
     */
    public void t92TrrCheck(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 900-NOTIFY-ANALYST
     *
     */
    public void notifyAnalyst(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-CALC-ICEP-P-A-DATE
     *
     */
    public void calcIcepPADate(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1001-CALC-ICEP-P-B-DATE
     *
     */
    public void calcIcepPBDate(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1002-CALC-IEP-DOB-DATE
     *
     */
    public void calcIepDobDate(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1003-CALC-IEP-P-D-DATE
     *
     */
    public void calcIepPDDate(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - A100-PLANPBP-ERROR
     *
     */
    public void planpbpError(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - A200-CHECK-STATE-ZIP
     *
     */
    public void checkStateZip(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - A300-VALIDATE-BATCH-FILE-TYPE
     *
     */
    public void validateBatchFileType(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - A301-VALIDATE-BATCH-FILE-TYPE
     *
     */
    public void validateBatchFileTypeA301(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - B100-PROCESS-RESPONSE
     *
     */
    public void processResponse(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - C100-WRITE-LOG
     *
     */
    public void writeLog(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - F100-WRITE-GOOD-RECORDS
     *
     */
    public void writeGoodRecords(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - F120-WRITE-RESPONSE-HOLD
     *
     */
    public void writeResponseHold(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - F200-WRITE-SUMMARY
     *
     */
    public void writeSummary(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - G000-GHI2GHP
     *
     */
    public void ghi2ghp(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - G100-HCFA-FORMAT-TEST
     *
     */
    public void hcfaFormatTest(HcfaFormatTestInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - G110-MOVE-LEAD-NUMS-TO-SSN
     *
     */
    public void moveLeadNumsToSsn(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - G120-RIGHT-JUSTIFY-SSN
     *
     */
    public void rightJustifySsn(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - G121-JUSTIFY
     *
     */
    public void justify(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - G130-MOVE-SUFFIX
     *
     */
    public void moveSuffix(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - G200-RRB-CONVERSION
     *
     */
    public void rrbConversion(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - G210-GET-PREFIX
     *
     */
    public void getPrefix(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - G220-GET-NUMBER
     *
     */
    public void getNumber(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - G230-JUSTIFY-AND-PAD
     *
     */
    public void justifyAndPad(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - G231-JUSTIFY
     *
     */
    public void justifyG231(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - G240-CONVERT-TO-GHP
     *
     */
    public void convertToGhp(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - G250-CONVERT-TO-GHI
     *
     */
    public void convertToGhi(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - G251-SHIFT-RRB-NUMBER-LEFT
     *
     */
    public void shiftRrbNumberLeft(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - G252-COMPRESS-BLANKS-IN-PREFIX
     *
     */
    public void compressBlanksInPrefix(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - H100-WRITE-ALL-INPUT-RECORDS
     *
     */
    public void writeAllInputRecords(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - H300-WRITE-ALL-RESPONSES
     *
     */
    public void writeAllResponses(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - O100-READ-MBD
     *
     */
    public void readMbd(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - O100-CHECK-KEY-CONVERSION
     *
     */
    public void checkKeyConversion(CheckKeyConversionInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - O215-CONVERT-KEY
     *
     */
    public void convertKey(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - O105-MBD-ELIG
     *
     */
    public void mbdElig(MbdEligInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - O105-MBI-ELIG
     *
     */
    public void mbiElig(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - O200-READ-MBD
     *
     */
    public void readMbdO200(ReadMbdO200InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - O200-READ-MBI
     *
     */
    public void readMbi(ReadMbiInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - O300-BEQR-ELIG
     *
     */
    public void beqrElig(BeqrEligInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - O305-READ-BEQR
     *
     */
    public void readBeqr(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - O320-GET-MMP-CUSTNO
     *
     */
    public void getMmpCustno(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - O322-CHECK-IF-MMP
     *
     */
    public void checkIfMmp(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - O323-VERIFY-PLAN-ID
     *
     */
    public void verifyPlanId(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - Z666-CHK-IF-MBI
     *
     */
    public void chkIfMbi(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - Z667-XREF-LOOKUP
     *
     */
    public void xrefLookup(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - Z680-GET-PLAN-DESIGNATION
     *
     */
    public void getPlanDesignation(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - VVV-CHECK-MBD-CARAHIST
     *
     */
    public void vvvCheckMbdCarahist(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - WWW-CHECK-BEQR-CARAHIST
     *
     */
    public void wwwCheckBeqrCarahist(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - XXX-CHECK-MBD-UNLAWFUL
     *
     */
    public void xxxCheckMbdUnlawful(Wm002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - ZZZ-CHECK-BEQR-UNLAWFUL
     *
     */
    public void zzzCheckBeqrUnlawful(Wm002Ctx programCtx) throws Exception;


     /**
	 * This will invoke the program given parameters from the
      * caller program.
	 *
	 * @return return code of the program
	 */
     public int call(ProgramContext programCtx, Object[] parameters) throws Exception;

     /**
	 * This will invoke the program given Field parameters from
      * the caller program.
	 *
	 * @return return code of the program
	 */
     public int call(ProgramContext programCtx, Field... parameters) throws Exception;
}
