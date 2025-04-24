package com.cloudframe.app.process;

import com.cloudframe.app.db2funci.Db2funciCtx.Date1000InCtx;
import com.cloudframe.app.db2funci.Db2funciCtx.SecurityLookupOutCtx;
import com.cloudframe.app.db2funci.Db2funciCtx.Select1InCtx;
import com.cloudframe.app.db2funci.Db2funciCtx.IsinInCtx;
import com.cloudframe.app.db2funci.Db2funciCtx.MainOutCtx;
import com.cloudframe.app.db2funci.Db2funciCtx.CheckSqlcodeInCtx;
import com.cloudframe.app.db2funci.Db2funciCtx.SpGetdataInCtx;
import com.cloudframe.app.db2funci.Db2funciCtx.CurrencyInCtx;
import com.cloudframe.app.db2funci.Db2funciCtx.XrefCursorInCtx;
import com.cloudframe.app.db2funci.Db2funciCtx.Date1000OutCtx;
import com.cloudframe.app.db2funci.Db2funciCtx.GetIsinDtlsOutCtx;
import com.cloudframe.app.db2funci.Db2funciCtx.SpGetprmlOutCtx;
import com.cloudframe.app.db2funci.Db2funciCtx.SpGetdataOutCtx;
import com.cloudframe.app.db2funci.Db2funciCtx.GetIsinDtlsInCtx;
import com.cloudframe.app.db2funci.Db2funciCtx.Cursor1OutCtx;
import com.cloudframe.app.db2funci.Db2funciCtx.Cursor1InCtx;
import com.cloudframe.app.db2funci.Db2funciCtx;
import com.cloudframe.app.db2funci.Db2funciCtx.IsinOutCtx;
import com.cloudframe.app.db2funci.Db2funciCtx.DecimalToFloatOutCtx;
import com.cloudframe.app.db2funci.Db2funciCtx.DecimalToFloatInCtx;
import com.cloudframe.app.db2funci.Db2funciCtx.Select1OutCtx;
import com.cloudframe.app.db2funci.Db2funciCtx.CurrencyOutCtx;
import com.cloudframe.app.db2funci.Db2funciCtx.MainInCtx;
import com.cloudframe.app.db2funci.Db2funciCtx.SelectCountOutCtx;
import com.cloudframe.app.db2funci.Db2funciCtx.XrefCursorOutCtx;
import com.cloudframe.app.db2funci.Db2funciCtx.ProcessCommandInCtx;
import com.cloudframe.app.db2funci.Db2funciCtx.DateSubstringCharInCtx;
import com.cloudframe.app.db2funci.Db2funciCtx.CheckSqlcodeOutCtx;
import com.cloudframe.app.db2funci.Db2funciCtx.SpGetprmlInCtx;
import com.cloudframe.app.db2funci.Db2funciCtx.SelectCountInCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.db2funci.Db2funciCtx.DateSubstringCharOutCtx;
import com.cloudframe.app.db2funci.Db2funciCtx.SecurityLookupInCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Db2funci {
    /**
     * This method is derived from Cobol Paragraph - 
     *
     * @return return code of program
     */
    public int setParameter(Db2funciCtx programCtx, String parm) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Db2funciCtx programCtx) throws Exception;

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
