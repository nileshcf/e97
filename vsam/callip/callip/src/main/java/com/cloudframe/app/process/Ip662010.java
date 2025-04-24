package com.cloudframe.app.process;

import com.cloudframe.app.ip662010.Ip662010Ctx.InitializeParsingAreasOutCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.EnterDeSubfieldInfoOutCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.DoADeOccurrenceGroupInCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.HandleShortCarrierOutCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.FindElementsOutCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.DoDelimitedPdsSubfldInCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.CheckRecordLengthOutCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx._1CheckForValidPdsNoInCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.MainlineOutCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.DoFirstTimeSetupOutCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.ProcessATagInCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.DisplayTagTableInCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.GetTimestampForTablesOutCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.EnterWholePdsInCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.ProcessATagOutCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.ExpandTheBitMapOutCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.MoveLowValuesInCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.EnterWholeDataElementInCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx;
import com.cloudframe.app.ip662010.Ip662010Ctx.FinishPendingEntryInCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.EnterDeSubfieldInfoInCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.EnterWholeDataElementOutCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.EnterPdsInfoOutCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.ProcessBadMessageInCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.MoveMsgToStdAreaInCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.ProcessBadMessageOutCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.DoDeTagOutCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.DoDelimitedSubfldInCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.DoPdsTagOutCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.DoPdsTagInCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.DoFirstTimeSetupInCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.CheckRecordLengthInCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.AbendInCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.DoDelimitedPdsSubfldOutCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.CheckPdsLimitOutCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.StoreDeLengthOutCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.CheckForDuplicatePdsInCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.StoreDeLengthInCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.ParseTheMessageOutCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.DoDelimitedSubfldOutCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.CheckTagLimitInCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.DoAPdsOccurrenceGrpInCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.EnterWholePdsOutCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.MoveLowValuesOutCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.FindElementsInCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.HandleShortCarrierInCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.EnterPdsInfoInCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.DisplayBadIpmMessageOutCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.DoADeOccurrenceGroupOutCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.CheckTagLimitOutCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.EnterPdsSubfieldsOutCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.HandleBadTagOutCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.HandleBadTagInCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.ParseViaTagTableOutCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.HandleBadLengthFieldInCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.HandleBadLengthFieldOutCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.HandleBadPdsIdOutCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.DisplayTagTableOutCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.CheckPdsLimitInCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.DoAPdsOccurrenceGrpOutCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.ParseTheMessageInCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.MainlineInCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.EnterPdsSubfieldsInCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.ParseViaTagTableInCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.ip662010.Ip662010Ctx.HandleBadRecordLngthOutCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.HandleBadRecordLngthInCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.HandleBadPdsIdInCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.ExpandTheBitMapInCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx._1CheckForValidPdsNoOutCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.MoveMsgToStdAreaOutCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.DisplayBadIpmMessageInCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.ip662010.Ip662010Ctx.FinishPendingEntryOutCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.CheckForDuplicatePdsOutCtx;
import com.cloudframe.app.ip662010.Ip662010Ctx.DoDeTagInCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Ip662010 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Ip662010Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 00000-MAINLINE
     *
     * @return 
     */
    public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 00100-DO-FIRST-TIME-SETUP
     *
     * @return 
     */
    public DoFirstTimeSetupOutCtx doFirstTimeSetup(DoFirstTimeSetupInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 200-GET-TIMESTAMP-FOR-TABLES
     *
     * @return 
     */
    public GetTimestampForTablesOutCtx getTimestampForTables(Ip662010Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 20000-INITIALIZE-PARSING-AREAS
     *
     * @return 
     */
    public InitializeParsingAreasOutCtx initializeParsingAreas(Ip662010Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 20100-MOVE-LOW-VALUES
     *
     * @return 
     */
    public MoveLowValuesOutCtx moveLowValues(MoveLowValuesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 30000-PARSE-THE-MESSAGE
     *
     * @return 
     */
    public ParseTheMessageOutCtx parseTheMessage(ParseTheMessageInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 32000-FIND-ELEMENTS
     *
     * @return 
     */
    public FindElementsOutCtx findElements(FindElementsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 32100-ENTER-WHOLE-DATA-ELEMENT
     *
     * @return 
     */
    public EnterWholeDataElementOutCtx enterWholeDataElement(EnterWholeDataElementInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 32101-STORE-DE-LENGTH
     *
     * @return 
     */
    public StoreDeLengthOutCtx storeDeLength(StoreDeLengthInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 32103-ENTER-DE-SUBFIELD-INFO
     *
     * @return 
     */
    public EnterDeSubfieldInfoOutCtx enterDeSubfieldInfo(EnterDeSubfieldInfoInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 32104-DO-A-DE-OCCURRENCE-GROUP
     *
     * @return 
     */
    public DoADeOccurrenceGroupOutCtx doADeOccurrenceGroup(DoADeOccurrenceGroupInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 32105-DO-DELIMITED-SUBFLD
     *
     * @return 
     */
    public DoDelimitedSubfldOutCtx doDelimitedSubfld(DoDelimitedSubfldInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 32106-CHECK-TAG-LIMIT
     *
     * @return 
     */
    public CheckTagLimitOutCtx checkTagLimit(CheckTagLimitInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 32110-ENTER-PDS-INFO
     *
     * @return 
     */
    public EnterPdsInfoOutCtx enterPdsInfo(EnterPdsInfoInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 32110-1-CHECK-FOR-VALID-PDS-NO
     *
     * @return 
     */
    public _1CheckForValidPdsNoOutCtx _1CheckForValidPdsNo(_1CheckForValidPdsNoInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 32111-CHECK-FOR-DUPLICATE-PDS
     *
     * @return 
     */
    public CheckForDuplicatePdsOutCtx checkForDuplicatePds(CheckForDuplicatePdsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 32112-ENTER-WHOLE-PDS
     *
     * @return 
     */
    public EnterWholePdsOutCtx enterWholePds(EnterWholePdsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 32113-ENTER-PDS-SUBFIELDS
     *
     * @return 
     */
    public EnterPdsSubfieldsOutCtx enterPdsSubfields(EnterPdsSubfieldsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 32114-DO-A-PDS-OCCURRENCE-GRP
     *
     * @return 
     */
    public DoAPdsOccurrenceGrpOutCtx doAPdsOccurrenceGrp(DoAPdsOccurrenceGrpInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 32115-DO-DELIMITED-PDS-SUBFLD
     *
     * @return 
     */
    public DoDelimitedPdsSubfldOutCtx doDelimitedPdsSubfld(DoDelimitedPdsSubfldInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 32116-HANDLE-BAD-PDS-ID
     *
     * @return 
     */
    public HandleBadPdsIdOutCtx handleBadPdsId(HandleBadPdsIdInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 32117-CHECK-PDS-LIMIT
     *
     * @return 
     */
    public CheckPdsLimitOutCtx checkPdsLimit(CheckPdsLimitInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 32119-HANDLE-SHORT-CARRIER
     *
     * @return 
     */
    public HandleShortCarrierOutCtx handleShortCarrier(HandleShortCarrierInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 40000-PARSE-VIA-TAG-TABLE
     *
     * @return 
     */
    public ParseViaTagTableOutCtx parseViaTagTable(ParseViaTagTableInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 40005-MOVE-MSG-TO-STD-AREA
     *
     * @return 
     */
    public MoveMsgToStdAreaOutCtx moveMsgToStdArea(MoveMsgToStdAreaInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 40010-PROCESS-A-TAG
     *
     * @return 
     */
    public ProcessATagOutCtx processATag(ProcessATagInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 40015-FINISH-PENDING-ENTRY
     *
     * @return 
     */
    public FinishPendingEntryOutCtx finishPendingEntry(FinishPendingEntryInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 40020-DO-PDS-TAG
     *
     * @return 
     */
    public DoPdsTagOutCtx doPdsTag(DoPdsTagInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 40030-DO-DE-TAG
     *
     * @return 
     */
    public DoDeTagOutCtx doDeTag(DoDeTagInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 43000-HANDLE-BAD-TAG
     *
     * @return 
     */
    public HandleBadTagOutCtx handleBadTag(HandleBadTagInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 50000-EXPAND-THE-BIT-MAP
     *
     * @return 
     */
    public ExpandTheBitMapOutCtx expandTheBitMap(ExpandTheBitMapInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 60000-CHECK-RECORD-LENGTH
     *
     * @return 
     */
    public CheckRecordLengthOutCtx checkRecordLength(CheckRecordLengthInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 60010-HANDLE-BAD-RECORD-LNGTH
     *
     * @return 
     */
    public HandleBadRecordLngthOutCtx handleBadRecordLngth(HandleBadRecordLngthInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 80000-HANDLE-BAD-LENGTH-FIELD
     *
     * @return 
     */
    public HandleBadLengthFieldOutCtx handleBadLengthField(HandleBadLengthFieldInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 81000-PROCESS-BAD-MESSAGE
     *
     * @return 
     */
    public ProcessBadMessageOutCtx processBadMessage(ProcessBadMessageInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 81100-DISPLAY-BAD-IPM-MESSAGE
     *
     * @return 
     */
    public DisplayBadIpmMessageOutCtx displayBadIpmMessage(DisplayBadIpmMessageInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 81110-DISPLAY-TAG-TABLE
     *
     * @return 
     */
    public DisplayTagTableOutCtx displayTagTable(DisplayTagTableInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 99999-ABEND
     *
     */
    public void abend(AbendInCtx methodIn) throws Exception;


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
