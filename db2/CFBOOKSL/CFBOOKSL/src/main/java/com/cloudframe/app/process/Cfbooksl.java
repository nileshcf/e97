package com.cloudframe.app.process;

import com.cloudframe.app.cfbooksl.CfbookslCtx.WriteHeaderInCtx;
import com.cloudframe.app.cfbooksl.CfbookslCtx.HousekeepingInCtx;
import com.cloudframe.app.cfbooksl.CfbookslCtx.SqlErrChkOutCtx;
import com.cloudframe.app.cfbooksl.CfbookslCtx.SqlErrChkInCtx;
import com.cloudframe.app.cfbooksl.CfbookslCtx.SqlmainOutCtx;
import com.cloudframe.app.cfbooksl.CfbookslCtx.SqlmainInCtx;
import com.cloudframe.app.cfbooksl.CfbookslCtx.WriteHeaderOutCtx;
import com.cloudframe.app.cfbooksl.CfbookslCtx.HousekeepingOutCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.cfbooksl.CfbookslCtx.FetchCursorOutCtx;
import com.cloudframe.app.cfbooksl.CfbookslCtx.InitializeOutCtx;
import com.cloudframe.app.cfbooksl.CfbookslCtx.WriteRecordInCtx;
import com.cloudframe.app.cfbooksl.CfbookslCtx.MainOutCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.cfbooksl.CfbookslCtx.InitializeInCtx;
import com.cloudframe.app.cfbooksl.CfbookslCtx;
import com.cloudframe.app.cfbooksl.CfbookslCtx.WriteRecordOutCtx;
import com.cloudframe.app.cfbooksl.CfbookslCtx.FileErrChkInCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Cfbooksl {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(CfbookslCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAIN
     *
     * @return 
     */
    public MainOutCtx main(CfbookslCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-INITIALIZE
     *
     * @return 
     */
    public InitializeOutCtx initialize(InitializeInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1100-WRITE-HEADER
     *
     * @return 
     */
    public WriteHeaderOutCtx writeHeader(WriteHeaderInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1200-FETCH-CURSOR
     *
     * @return 
     */
    public FetchCursorOutCtx fetchCursor(CfbookslCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-SQLMAIN
     *
     * @return 
     */
    public SqlmainOutCtx sqlmain(SqlmainInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2100-WRITE-RECORD
     *
     * @return 
     */
    public WriteRecordOutCtx writeRecord(WriteRecordInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3000-HOUSEKEEPING
     *
     * @return 
     */
    public HousekeepingOutCtx housekeeping(HousekeepingInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9998-FILE-ERR-CHK
     *
     */
    public void fileErrChk(FileErrChkInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9999-SQL-ERR-CHK
     *
     * @return 
     */
    public SqlErrChkOutCtx sqlErrChk(SqlErrChkInCtx methodIn) throws Exception;


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
