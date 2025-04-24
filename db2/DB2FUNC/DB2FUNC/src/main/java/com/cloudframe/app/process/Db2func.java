package com.cloudframe.app.process;

import com.cloudframe.app.db2func.Db2funcCtx.CurrencyInCtx;
import com.cloudframe.app.db2func.Db2funcCtx.IsinInCtx;
import com.cloudframe.app.db2func.Db2funcCtx.Select1InCtx;
import com.cloudframe.app.db2func.Db2funcCtx.Cursor1OutCtx;
import com.cloudframe.app.db2func.Db2funcCtx.DecimalToFloatInCtx;
import com.cloudframe.app.db2func.Db2funcCtx.SelectCountInCtx;
import com.cloudframe.app.db2func.Db2funcCtx.Date1000OutCtx;
import com.cloudframe.app.db2func.Db2funcCtx.ProcessCommandInCtx;
import com.cloudframe.app.db2func.Db2funcCtx.SecurityLookupInCtx;
import com.cloudframe.app.db2func.Db2funcCtx.XrefCursorOutCtx;
import com.cloudframe.app.db2func.Db2funcCtx;
import com.cloudframe.app.db2func.Db2funcCtx.DateSubstringCharInCtx;
import com.cloudframe.app.db2func.Db2funcCtx.Date1000InCtx;
import com.cloudframe.app.db2func.Db2funcCtx.Select1OutCtx;
import com.cloudframe.app.db2func.Db2funcCtx.MainInCtx;
import com.cloudframe.app.db2func.Db2funcCtx.IsinOutCtx;
import com.cloudframe.app.db2func.Db2funcCtx.SpGetprmlOutCtx;
import com.cloudframe.app.db2func.Db2funcCtx.MainOutCtx;
import com.cloudframe.app.db2func.Db2funcCtx.GetIsinDtlsInCtx;
import com.cloudframe.app.db2func.Db2funcCtx.CurrencyOutCtx;
import com.cloudframe.app.db2func.Db2funcCtx.SpGetprmlInCtx;
import com.cloudframe.app.db2func.Db2funcCtx.XrefCursorInCtx;
import com.cloudframe.app.db2func.Db2funcCtx.SpGetdataOutCtx;
import com.cloudframe.app.db2func.Db2funcCtx.SpGetdataInCtx;
import com.cloudframe.app.db2func.Db2funcCtx.GetIsinDtlsOutCtx;
import com.cloudframe.app.db2func.Db2funcCtx.SelectCountOutCtx;
import com.cloudframe.app.db2func.Db2funcCtx.DecimalToFloatOutCtx;
import com.cloudframe.app.db2func.Db2funcCtx.SecurityLookupOutCtx;
import com.cloudframe.app.db2func.Db2funcCtx.Cursor1InCtx;
import com.cloudframe.app.db2func.Db2funcCtx.CheckSqlcodeOutCtx;
import com.cloudframe.app.db2func.Db2funcCtx.CheckSqlcodeInCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.db2func.Db2funcCtx.DateSubstringCharOutCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Db2func {
    /**
     * This method is derived from Cobol Paragraph - 
     *
     * @return return code of program
     */
    public int setParameter(Db2funcCtx programCtx, String parm) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Db2funcCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAIN
     *
     * @return 
     */
    public MainOutCtx main(MainInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS-COMMAND
     *
     */
    public void processCommand(ProcessCommandInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-DATE
     *
     * @return 
     */
    public Date1000OutCtx date1000(Date1000InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1001-SP-GETPRML
     *
     * @return 
     */
    public SpGetprmlOutCtx spGetprml(SpGetprmlInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8000-GET-ISIN-DTLS
     *
     * @return 
     */
    public GetIsinDtlsOutCtx getIsinDtls(GetIsinDtlsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1002-SP-GETDATA
     *
     * @return 
     */
    public SpGetdataOutCtx spGetdata(SpGetdataInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1003-CURSOR1
     *
     * @return 
     */
    public Cursor1OutCtx cursor1(Cursor1InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1004-DATE-SUBSTRING-CHAR
     *
     * @return 
     */
    public DateSubstringCharOutCtx dateSubstringChar(DateSubstringCharInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1005-SECURITY-LOOKUP
     *
     * @return 
     */
    public SecurityLookupOutCtx securityLookup(SecurityLookupInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1006-CURRENCY
     *
     * @return 
     */
    public CurrencyOutCtx currency(CurrencyInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1007-XREF-CURSOR
     *
     * @return 
     */
    public XrefCursorOutCtx xrefCursor(XrefCursorInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1008-ISIN
     *
     * @return 
     */
    public IsinOutCtx isin(IsinInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1009-DECIMAL-TO-FLOAT
     *
     * @return 
     */
    public DecimalToFloatOutCtx decimalToFloat(DecimalToFloatInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1010-SELECT-1
     *
     * @return 
     */
    public Select1OutCtx select1(Select1InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1011-SELECT-COUNT
     *
     * @return 
     */
    public SelectCountOutCtx selectCount(SelectCountInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9000-CHECK-SQLCODE
     *
     * @return 
     */
    public CheckSqlcodeOutCtx checkSqlcode(CheckSqlcodeInCtx methodIn) throws Exception;


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
