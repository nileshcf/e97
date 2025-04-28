package com.cloudframe.app.process;

import com.cloudframe.app.sf326010.Sf326010Ctx.ReadSys001FileInCtx;
import com.cloudframe.app.sf326010.Sf326010Ctx.WriteSys201ZlogRecOutCtx;
import com.cloudframe.app.sf326010.Sf326010Ctx.BuildPDateTimeOutCtx;
import com.cloudframe.app.sf326010.Sf326010Ctx.BuildBegJobMsgsInCtx;
import com.cloudframe.app.sf326010.Sf326010Ctx;
import com.cloudframe.app.sf326010.Sf326010Ctx.ProcessMiplogOutCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.sf326010.Sf326010Ctx.ParseZlogHeadersInCtx;
import com.cloudframe.app.sf326010.Sf326010Ctx.ProcessMiplogInCtx;
import com.cloudframe.app.sf326010.Sf326010Ctx.ReadSys001FileOutCtx;
import com.cloudframe.app.sf326010.Sf326010Ctx.BuildPDateTimeInCtx;
import com.cloudframe.app.sf326010.Sf326010Ctx.MainlineInCtx;
import com.cloudframe.app.sf326010.Sf326010Ctx.ParseZlogHeadersOutCtx;
import com.cloudframe.app.sf326010.Sf326010Ctx.WriteSys201ZlogRecInCtx;
import com.cloudframe.app.sf326010.Sf326010Ctx.BuildBegJobMsgsOutCtx;
import com.cloudframe.app.sf326010.Sf326010Ctx.TerminateProgramInCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.sf326010.Sf326010Ctx.OpenFilesInCtx;
import com.cloudframe.app.sf326010.Sf326010Ctx.TerminateProgramOutCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Sf326010 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Sf326010Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     */
    public void mainline(MainlineInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-INITIALIZE-PROGRAM
     *
     */
    public void initializeProgram(Sf326010Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1100-BUILD-BEG-JOB-MSGS
     *
     * @return 
     */
    public BuildBegJobMsgsOutCtx buildBegJobMsgs(BuildBegJobMsgsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1200-OPEN-FILES
     *
     */
    public void openFiles(OpenFilesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-PROCESS-MIPLOG
     *
     * @return 
     */
    public ProcessMiplogOutCtx processMiplog(ProcessMiplogInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2100-PARSE-ZLOG-HEADERS
     *
     * @return 
     */
    public ParseZlogHeadersOutCtx parseZlogHeaders(ParseZlogHeadersInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2200-WRITE-SYS201-ZLOG-REC
     *
     * @return 
     */
    public WriteSys201ZlogRecOutCtx writeSys201ZlogRec(WriteSys201ZlogRecInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2300-BUILD-P-DATE-TIME
     *
     * @return 
     */
    public BuildPDateTimeOutCtx buildPDateTime(BuildPDateTimeInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8000-READ-SYS001-FILE
     *
     * @return 
     */
    public ReadSys001FileOutCtx readSys001File(ReadSys001FileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9000-TERMINATE-PROGRAM
     *
     * @return 
     */
    public TerminateProgramOutCtx terminateProgram(TerminateProgramInCtx methodIn) throws Exception;


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
