package com.cloudframe.app.process;

import com.cloudframe.app.ip282210.Ip282210Ctx.UpdateEventLogInCtx;
import com.cloudframe.app.ip282210.Ip282210Ctx.TerminateOnErrorOutCtx;
import com.cloudframe.app.ip282210.Ip282210Ctx.LoadLpaEntriesOutCtx;
import com.cloudframe.app.ip282210.Ip282210Ctx._11CheckOnedayRecLenInCtx;
import com.cloudframe.app.ip282210.Ip282210Ctx.LoadLpaEntriesInCtx;
import com.cloudframe.app.ip282210.Ip282210Ctx.DisplayExecMsgsOutCtx;
import com.cloudframe.app.ip282210.Ip282210Ctx._10LoadToIp0201t1TableOutCtx;
import com.cloudframe.app.ip282210.Ip282210Ctx.PopulateLpaEntryInCtx;
import com.cloudframe.app.ip282210.Ip282210Ctx.LoadSizeInfoTableOutCtx;
import com.cloudframe.app.ip282210.Ip282210Ctx._11CheckOnedayRecLenOutCtx;
import com.cloudframe.app.ip282210.Ip282210Ctx.TerminateOnErrorInCtx;
import com.cloudframe.app.ip282210.Ip282210Ctx.SearchLpaEntriesOutCtx;
import com.cloudframe.app.ip282210.Ip282210Ctx.UpdateEventLogOutCtx;
import com.cloudframe.app.ip282210.Ip282210Ctx.GetFromOneDayFileInCtx;
import com.cloudframe.app.ip282210.Ip282210Ctx.GetFromOneDayFileOutCtx;
import com.cloudframe.app.ip282210.Ip282210Ctx._10LoadToIp0201t1TableInCtx;
import com.cloudframe.app.ip282210.Ip282210Ctx.LoadToIp02015t1TableInCtx;
import com.cloudframe.app.ip282210.Ip282210Ctx.SearchLpaEntriesInCtx;
import com.cloudframe.app.ip282210.Ip282210Ctx.DisplayExecMsgsInCtx;
import com.cloudframe.app.ip282210.Ip282210Ctx._12CheckTableLimitOutCtx;
import com.cloudframe.app.ip282210.Ip282210Ctx.LoadTableIp0201t1OutCtx;
import com.cloudframe.app.ip282210.Ip282210Ctx.LoadToIp02015t1TableOutCtx;
import com.cloudframe.app.ip282210.Ip282210Ctx.GetTableKeyDtTmInCtx;
import com.cloudframe.app.ip282210.Ip282210Ctx.LoadTableIp0201t1InCtx;
import com.cloudframe.app.ip282210.Ip282210Ctx._12CheckTableLimitInCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.ip282210.Ip282210Ctx;
import com.cloudframe.app.ip282210.Ip282210Ctx.GetTableKeyDtTmOutCtx;
import com.cloudframe.app.ip282210.Ip282210Ctx.LoadSizeInfoTableInCtx;
import com.cloudframe.app.ip282210.Ip282210Ctx.LoadLpaTblOutCtx;
import com.cloudframe.app.ip282210.Ip282210Ctx.LoadLpaTblInCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Ip282210 {
    /**
     * This method is derived from Cobol Paragraph - 
     *
     * @return return code of program
     */
    public int setParameter(Ip282210Ctx programCtx, String parm) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Ip282210Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     */
    public void mainline(Ip282210Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-LOAD-TABLE-IP0201T1
     *
     * @return 
     */
    public LoadTableIp0201t1OutCtx loadTableIp0201t1(LoadTableIp0201t1InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1100-DISPLAY-EXEC-MSGS
     *
     * @return 
     */
    public DisplayExecMsgsOutCtx displayExecMsgs(DisplayExecMsgsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1200-GET-TABLE-KEY-DT-TM
     *
     * @return 
     */
    public GetTableKeyDtTmOutCtx getTableKeyDtTm(GetTableKeyDtTmInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1300-LOAD-LPA-TBL
     *
     * @return 
     */
    public LoadLpaTblOutCtx loadLpaTbl(LoadLpaTblInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1310-LOAD-LPA-ENTRIES
     *
     * @return 
     */
    public LoadLpaEntriesOutCtx loadLpaEntries(LoadLpaEntriesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1311-GET-FROM-ONE-DAY-FILE
     *
     * @return 
     */
    public GetFromOneDayFileOutCtx getFromOneDayFile(GetFromOneDayFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1311-10-LOAD-TO-IP0201T1-TABLE
     *
     * @return 
     */
    public _10LoadToIp0201t1TableOutCtx _10LoadToIp0201t1Table(_10LoadToIp0201t1TableInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1311-11-CHECK-ONEDAY-REC-LEN
     *
     * @return 
     */
    public _11CheckOnedayRecLenOutCtx _11CheckOnedayRecLen(_11CheckOnedayRecLenInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1311-12-CHECK-TABLE-LIMIT
     *
     * @return 
     */
    public _12CheckTableLimitOutCtx _12CheckTableLimit(_12CheckTableLimitInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1312-LOAD-TO-IP02015T1-TABLE
     *
     * @return 
     */
    public LoadToIp02015t1TableOutCtx loadToIp02015t1Table(LoadToIp02015t1TableInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1320-LOAD-SIZE-INFO-TABLE
     *
     * @return 
     */
    public LoadSizeInfoTableOutCtx loadSizeInfoTable(LoadSizeInfoTableInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-POPULATE-LPA-ENTRY
     *
     */
    public void populateLpaEntry(PopulateLpaEntryInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2100-SEARCH-LPA-ENTRIES
     *
     * @return 
     */
    public SearchLpaEntriesOutCtx searchLpaEntries(SearchLpaEntriesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9000-TERMINATE-ON-ERROR
     *
     * @return 
     */
    public TerminateOnErrorOutCtx terminateOnError(TerminateOnErrorInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9950-UPDATE-EVENT-LOG
     *
     * @return 
     */
    public UpdateEventLogOutCtx updateEventLog(UpdateEventLogInCtx methodIn) throws Exception;


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
