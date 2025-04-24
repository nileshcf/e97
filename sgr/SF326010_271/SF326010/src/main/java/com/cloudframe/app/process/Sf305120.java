package com.cloudframe.app.process;

import com.cloudframe.app.sf305120.Sf305120Ctx.ProcessEsVersion3OutCtx;
import com.cloudframe.app.sf305120.Sf305120Ctx.ProcessServiceFieldsOutCtx;
import com.cloudframe.app.sf305120.Sf305120Ctx.ProcessZlogRecordOutCtx;
import com.cloudframe.app.sf305120.Sf305120Ctx.ProcessEsVersion3InCtx;
import com.cloudframe.app.sf305120.Sf305120Ctx.ExtractHeaderFieldsOutCtx;
import com.cloudframe.app.sf305120.Sf305120Ctx.ExtractHeaderFieldsInCtx;
import com.cloudframe.app.sf305120.Sf305120Ctx.Analyze1HeaderInCtx;
import com.cloudframe.app.sf305120.Sf305120Ctx.ProcessOeHeadersOutCtx;
import com.cloudframe.app.sf305120.Sf305120Ctx.ClearClogWorkareasOutCtx;
import com.cloudframe.app.sf305120.Sf305120Ctx.Extract1ServiceOutCtx;
import com.cloudframe.app.sf305120.Sf305120Ctx.ParseServreq2OutCtx;
import com.cloudframe.app.sf305120.Sf305120Ctx.MainlineOutCtx;
import com.cloudframe.app.sf305120.Sf305120Ctx.Extract1ServiceInCtx;
import com.cloudframe.app.sf305120.Sf305120Ctx.ProcessServiceFieldsInCtx;
import com.cloudframe.app.sf305120.Sf305120Ctx.ParseRoutingHeaderInCtx;
import com.cloudframe.app.sf305120.Sf305120Ctx.ParseServiceInfoOutCtx;
import com.cloudframe.app.sf305120.Sf305120Ctx.ParseServreqHeaderOutCtx;
import com.cloudframe.app.sf305120.Sf305120Ctx.ProcessClogRecordInCtx;
import com.cloudframe.app.sf305120.Sf305120Ctx.ProcessOeHeadersInCtx;
import com.cloudframe.app.sf305120.Sf305120Ctx.ProcessEsVersion1OutCtx;
import com.cloudframe.app.sf305120.Sf305120Ctx.InitializeTheProgramInCtx;
import com.cloudframe.app.sf305120.Sf305120Ctx.MainlineInCtx;
import com.cloudframe.app.sf305120.Sf305120Ctx.ProcessZlogRecordInCtx;
import com.cloudframe.app.sf305120.Sf305120Ctx.ProcessClogRecordOutCtx;
import com.cloudframe.app.sf305120.Sf305120Ctx.ParseServreq1InCtx;
import com.cloudframe.app.sf305120.Sf305120Ctx.ParseServreqHeaderInCtx;
import com.cloudframe.app.sf305120.Sf305120Ctx.ExpandRucHeaderInCtx;
import com.cloudframe.app.sf305120.Sf305120Ctx.ParseServiceInfoInCtx;
import com.cloudframe.app.sf305120.Sf305120Ctx.ProcessEsVersion1InCtx;
import com.cloudframe.app.sf305120.Sf305120Ctx.DisplayStartMessagesInCtx;
import com.cloudframe.app.sf305120.Sf305120Ctx.InitializeTheProgramOutCtx;
import com.cloudframe.app.sf305120.Sf305120Ctx.ProcessEsVersion2InCtx;
import com.cloudframe.app.sf305120.Sf305120Ctx.ExpandRucHeaderOutCtx;
import com.cloudframe.app.sf305120.Sf305120Ctx.Analyze1HeaderOutCtx;
import com.cloudframe.app.sf305120.Sf305120Ctx.ClearClogWorkareasInCtx;
import com.cloudframe.app.sf305120.Sf305120Ctx.ParseServreq1OutCtx;
import com.cloudframe.app.sf305120.Sf305120Ctx.ParseRoutingHeaderOutCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.sf305120.Sf305120Ctx.ProcessEsVersion2OutCtx;
import com.cloudframe.app.sf305120.Sf305120Ctx.DisplayStartMessagesOutCtx;
import com.cloudframe.app.sf305120.Sf305120Ctx.ParseServreq2InCtx;
import com.cloudframe.app.sf305120.Sf305120Ctx;


import com.cloudframe.app.dto.ProgramContext;

public interface Sf305120 {
    /**
     * This method is derived from Cobol Paragraph - 
     *
     * @return return code of program
     */
    public int setParameter(Sf305120Ctx programCtx, String parm) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Sf305120Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     * @return 
     */
    public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-INITIALIZE-THE-PROGRAM
     *
     * @return 
     */
    public InitializeTheProgramOutCtx initializeTheProgram(InitializeTheProgramInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1100-DISPLAY-START-MESSAGES
     *
     * @return 
     */
    public DisplayStartMessagesOutCtx displayStartMessages(DisplayStartMessagesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-PROCESS-ZLOG-RECORD
     *
     * @return 
     */
    public ProcessZlogRecordOutCtx processZlogRecord(ProcessZlogRecordInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2100-EXTRACT-HEADER-FIELDS
     *
     * @return 
     */
    public ExtractHeaderFieldsOutCtx extractHeaderFields(ExtractHeaderFieldsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2200-PARSE-SERVREQ-1
     *
     * @return 
     */
    public ParseServreq1OutCtx parseServreq1(ParseServreq1InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2300-PARSE-SERVREQ-2
     *
     * @return 
     */
    public ParseServreq2OutCtx parseServreq2(ParseServreq2InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3000-PROCESS-CLOG-RECORD
     *
     * @return 
     */
    public ProcessClogRecordOutCtx processClogRecord(ProcessClogRecordInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3100-PROCESS-SERVICE-FIELDS
     *
     * @return 
     */
    public ProcessServiceFieldsOutCtx processServiceFields(ProcessServiceFieldsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3111-PROCESS-ES-VERSION-1
     *
     * @return 
     */
    public ProcessEsVersion1OutCtx processEsVersion1(ProcessEsVersion1InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3112-PROCESS-ES-VERSION-2
     *
     * @return 
     */
    public ProcessEsVersion2OutCtx processEsVersion2(ProcessEsVersion2InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3113-PROCESS-ES-VERSION-3
     *
     * @return 
     */
    public ProcessEsVersion3OutCtx processEsVersion3(ProcessEsVersion3InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3200-PROCESS-OE-HEADERS
     *
     * @return 
     */
    public ProcessOeHeadersOutCtx processOeHeaders(ProcessOeHeadersInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3210-ANALYZE-1-HEADER
     *
     * @return 
     */
    public Analyze1HeaderOutCtx analyze1Header(Analyze1HeaderInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3500-CLEAR-CLOG-WORKAREAS
     *
     * @return 
     */
    public ClearClogWorkareasOutCtx clearClogWorkareas(ClearClogWorkareasInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3600-EXPAND-RUC-HEADER
     *
     * @return 
     */
    public ExpandRucHeaderOutCtx expandRucHeader(ExpandRucHeaderInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8000-PARSE-SERVREQ-HEADER
     *
     * @return 
     */
    public ParseServreqHeaderOutCtx parseServreqHeader(ParseServreqHeaderInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8100-PARSE-ROUTING-HEADER
     *
     * @return 
     */
    public ParseRoutingHeaderOutCtx parseRoutingHeader(ParseRoutingHeaderInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8200-PARSE-SERVICE-INFO
     *
     * @return 
     */
    public ParseServiceInfoOutCtx parseServiceInfo(ParseServiceInfoInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8210-EXTRACT-1-SERVICE
     *
     * @return 
     */
    public Extract1ServiceOutCtx extract1Service(Extract1ServiceInCtx methodIn) throws Exception;


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
