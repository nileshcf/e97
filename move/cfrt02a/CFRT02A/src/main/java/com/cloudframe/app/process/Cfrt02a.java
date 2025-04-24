package com.cloudframe.app.process;

import com.cloudframe.app.cfrt02a.Cfrt02aCtx;
import com.cloudframe.app.cfrt02a.Cfrt02aCtx.ProgramBeginInCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.cfrt02a.Cfrt02aCtx.DisplayTheMessageOutCtx;
import com.cloudframe.app.cfrt02a.Cfrt02aCtx.ProgramBeginOutCtx;
import com.cloudframe.app.cfrt02a.Cfrt02aCtx.DisplayTheMessageInCtx;
import com.cloudframe.app.cfrt02a.Cfrt02aCtx.AddTheNumberInCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.cfrt02a.Cfrt02aCtx.AddTheNumberOutCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Cfrt02a {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Cfrt02aCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROGRAM-BEGIN
     *
     * @return 
     */
    public ProgramBeginOutCtx programBegin(ProgramBeginInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROGRAM-DONE
     *
     */
    public void programDone(Cfrt02aCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - ADD-NUMBER-AND-DISPLAY
     *
     */
    public void addNumberAndDisplay(Cfrt02aCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - ADD-THE-NUMBER
     *
     * @return 
     */
    public AddTheNumberOutCtx addTheNumber(AddTheNumberInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - DISPLAY-THE-MESSAGE
     *
     * @return 
     */
    public DisplayTheMessageOutCtx displayTheMessage(DisplayTheMessageInCtx methodIn) throws Exception;


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
