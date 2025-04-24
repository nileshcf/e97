package com.cloudframe.app.process;

import com.cloudframe.app.ip305710.Ip305710Ctx.DisplayAbendMessageOutCtx;
import com.cloudframe.app.ip305710.Ip305710Ctx.Process0057EntriesOutCtx;
import com.cloudframe.app.ip305710.Ip305710Ctx;
import com.cloudframe.app.ip305710.Ip305710Ctx.SaveTableEntryInCtx;
import com.cloudframe.app.ip305710.Ip305710Ctx.DisplayAbendMessageInCtx;
import com.cloudframe.app.ip305710.Ip305710Ctx.Process0057EntriesInCtx;
import com.cloudframe.app.ip305710.Ip305710Ctx.SaveTableEntryOutCtx;
import com.cloudframe.app.ip305710.Ip305710Ctx.DisplayExecMsgsOutCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.ip305710.Ip305710Ctx.DisplayExecMsgsInCtx;
import com.cloudframe.app.ip305710.Ip305710Ctx.PopulateOutputDataBlkInCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.ip305710.Ip305710Ctx.PopulateOutputDataBlkOutCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Ip305710 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Ip305710Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     */
    public void mainline(Ip305710Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-DISPLAY-EXEC-MSGS
     *
     * @return 
     */
    public DisplayExecMsgsOutCtx displayExecMsgs(DisplayExecMsgsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-PROCESS-0057-ENTRIES
     *
     * @return 
     */
    public Process0057EntriesOutCtx process0057Entries(Process0057EntriesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2100-SAVE-TABLE-ENTRY
     *
     * @return 
     */
    public SaveTableEntryOutCtx saveTableEntry(SaveTableEntryInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8000-POPULATE-OUTPUT-DATA-BLK
     *
     * @return 
     */
    public PopulateOutputDataBlkOutCtx populateOutputDataBlk(PopulateOutputDataBlkInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9000-DISPLAY-ABEND-MESSAGE
     *
     * @return 
     */
    public DisplayAbendMessageOutCtx displayAbendMessage(DisplayAbendMessageInCtx methodIn) throws Exception;


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
