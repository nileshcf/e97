package com.cloudframe.app.process;

import com.cloudframe.app.dlcrntof.DlcrntofCtx.InsertIntoTbdelsecInCtx;
import com.cloudframe.app.dlcrntof.DlcrntofCtx.PrintTbdelsecRowcntOutCtx;
import com.cloudframe.app.dlcrntof.DlcrntofCtx.DeleteTbdelsecRowsInCtx;
import com.cloudframe.app.dlcrntof.DlcrntofCtx.PrintDeletedIsinOutCtx;
import com.cloudframe.app.dlcrntof.DlcrntofCtx.MainlineOutCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dlcrntof.DlcrntofCtx;
import com.cloudframe.app.dlcrntof.DlcrntofCtx.PrintDeletedIsinInCtx;
import com.cloudframe.app.dlcrntof.DlcrntofCtx.PrintTbdelsecRowcntInCtx;
import com.cloudframe.app.dlcrntof.DlcrntofCtx.DeleteTbdelsecRowsOutCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dlcrntof.DlcrntofCtx.RaiseErrorOutCtx;
import com.cloudframe.app.dlcrntof.DlcrntofCtx.InsertIntoTbdelsecOutCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Dlcrntof {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(DlcrntofCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     * @return 
     */
    public MainlineOutCtx mainline(DlcrntofCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-INSERT-INTO-TBDELSEC
     *
     * @return 
     */
    public InsertIntoTbdelsecOutCtx insertIntoTbdelsec(InsertIntoTbdelsecInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-DELETE-TBDELSEC-ROWS
     *
     * @return 
     */
    public DeleteTbdelsecRowsOutCtx deleteTbdelsecRows(DeleteTbdelsecRowsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3000-PRINT-DELETED-ISIN
     *
     * @return 
     */
    public PrintDeletedIsinOutCtx printDeletedIsin(PrintDeletedIsinInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9000-PRINT-TBDELSEC-ROWCNT
     *
     * @return 
     */
    public PrintTbdelsecRowcntOutCtx printTbdelsecRowcnt(PrintTbdelsecRowcntInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9999-RAISE-ERROR
     *
     * @return 
     */
    public RaiseErrorOutCtx raiseError(DlcrntofCtx programCtx) throws Exception;


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
