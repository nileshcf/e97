package com.cloudframe.app.process;

import com.cloudframe.app.ip299010.Ip299010Ctx.LoadTableIp0005t1OutCtx;
import com.cloudframe.app.ip299010.Ip299010Ctx.TerminateOnErrorOutCtx;
import com.cloudframe.app.ip299010.Ip299010Ctx.LoadTableIp0005t1InCtx;
import com.cloudframe.app.ip299010.Ip299010Ctx._11CheckTableLimitInCtx;
import com.cloudframe.app.ip299010.Ip299010Ctx._10CheckOnedayRecLenInCtx;
import com.cloudframe.app.ip299010.Ip299010Ctx.LoadTbl5TableInCtx;
import com.cloudframe.app.ip299010.Ip299010Ctx.LocateTableIdOnTbl5InCtx;
import com.cloudframe.app.ip299010.Ip299010Ctx.AbendForTblAbsentInCtx;
import com.cloudframe.app.ip299010.Ip299010Ctx.GetFromOneDayFileInCtx;
import com.cloudframe.app.ip299010.Ip299010Ctx.SearchForValueInCtx;
import com.cloudframe.app.ip299010.Ip299010Ctx.SearchTableIp0005t1OutCtx;
import com.cloudframe.app.ip299010.Ip299010Ctx.TerminateOnErrorInCtx;
import com.cloudframe.app.ip299010.Ip299010Ctx.DisplayCountOutCtx;
import com.cloudframe.app.ip299010.Ip299010Ctx;
import com.cloudframe.app.ip299010.Ip299010Ctx._11CheckTableLimitOutCtx;
import com.cloudframe.app.ip299010.Ip299010Ctx.InitializeLoadOutCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.ip299010.Ip299010Ctx.SearchTableIp0005t1InCtx;
import com.cloudframe.app.ip299010.Ip299010Ctx.AbendForTblAbsentOutCtx;
import com.cloudframe.app.ip299010.Ip299010Ctx.InitializeLoadInCtx;
import com.cloudframe.app.ip299010.Ip299010Ctx.LoadToIp0005t1TableInCtx;
import com.cloudframe.app.ip299010.Ip299010Ctx.LoadToIp0005t1TableOutCtx;
import com.cloudframe.app.ip299010.Ip299010Ctx.GetFromOneDayFileOutCtx;
import com.cloudframe.app.ip299010.Ip299010Ctx.LocateTableIdOnTbl5OutCtx;
import com.cloudframe.app.ip299010.Ip299010Ctx.DisplayCountInCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.ip299010.Ip299010Ctx._10CheckOnedayRecLenOutCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Ip299010 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Ip299010Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     */
    public void mainline(Ip299010Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-LOAD-TABLE-IP0005T1
     *
     * @return 
     */
    public LoadTableIp0005t1OutCtx loadTableIp0005t1(LoadTableIp0005t1InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1200-LOAD-TBL5-TABLE
     *
     */
    public void loadTbl5Table(LoadTbl5TableInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1210-INITIALIZE-LOAD
     *
     * @return 
     */
    public InitializeLoadOutCtx initializeLoad(InitializeLoadInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1220-GET-FROM-ONE-DAY-FILE
     *
     * @return 
     */
    public GetFromOneDayFileOutCtx getFromOneDayFile(GetFromOneDayFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1221-LOAD-TO-IP0005T1-TABLE
     *
     * @return 
     */
    public LoadToIp0005t1TableOutCtx loadToIp0005t1Table(LoadToIp0005t1TableInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1221-10-CHECK-ONEDAY-REC-LEN
     *
     * @return 
     */
    public _10CheckOnedayRecLenOutCtx _10CheckOnedayRecLen(_10CheckOnedayRecLenInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1221-11-CHECK-TABLE-LIMIT
     *
     * @return 
     */
    public _11CheckTableLimitOutCtx _11CheckTableLimit(_11CheckTableLimitInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1230-DISPLAY-COUNT
     *
     * @return 
     */
    public DisplayCountOutCtx displayCount(DisplayCountInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-SEARCH-FOR-VALUE
     *
     */
    public void searchForValue(SearchForValueInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2100-LOCATE-TABLE-ID-ON-TBL5
     *
     * @return 
     */
    public LocateTableIdOnTbl5OutCtx locateTableIdOnTbl5(LocateTableIdOnTbl5InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2200-SEARCH-TABLE-IP0005T1
     *
     * @return 
     */
    public SearchTableIp0005t1OutCtx searchTableIp0005t1(SearchTableIp0005t1InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2210-ABEND-FOR-TBL-ABSENT
     *
     * @return 
     */
    public AbendForTblAbsentOutCtx abendForTblAbsent(AbendForTblAbsentInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9000-TERMINATE-ON-ERROR
     *
     * @return 
     */
    public TerminateOnErrorOutCtx terminateOnError(TerminateOnErrorInCtx methodIn) throws Exception;


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
