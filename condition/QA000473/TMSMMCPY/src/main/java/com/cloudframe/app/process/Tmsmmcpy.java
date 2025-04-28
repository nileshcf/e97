package com.cloudframe.app.process;

import com.cloudframe.app.tmsmmcpy.TmsmmcpyCtx.ReformatFieldInCtx;
import com.cloudframe.app.tmsmmcpy.TmsmmcpyCtx.DisplaySmmRecInCtx;
import com.cloudframe.app.tmsmmcpy.TmsmmcpyCtx.UnstringOutCtx;
import com.cloudframe.app.tmsmmcpy.TmsmmcpyCtx;
import com.cloudframe.app.tmsmmcpy.TmsmmcpyCtx.TerminationOutCtx;
import com.cloudframe.app.tmsmmcpy.TmsmmcpyCtx.InitializationInCtx;
import com.cloudframe.app.tmsmmcpy.TmsmmcpyCtx.TerminationInCtx;
import com.cloudframe.app.tmsmmcpy.TmsmmcpyCtx.ReformatFieldOutCtx;
import com.cloudframe.app.tmsmmcpy.TmsmmcpyCtx.OutputSmmOutCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.tmsmmcpy.TmsmmcpyCtx.MainlineInCtx;
import com.cloudframe.app.tmsmmcpy.TmsmmcpyCtx.OutputSmmInCtx;
import com.cloudframe.app.tmsmmcpy.TmsmmcpyCtx.ReadSmmInCtx;
import com.cloudframe.app.tmsmmcpy.TmsmmcpyCtx.UnstringInCtx;
import com.cloudframe.app.tmsmmcpy.TmsmmcpyCtx.MainlineOutCtx;
import com.cloudframe.app.tmsmmcpy.TmsmmcpyCtx.ReadAndProcessSmmOutCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.tmsmmcpy.TmsmmcpyCtx.ReadAndProcessSmmInCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Tmsmmcpy {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(TmsmmcpyCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     * @return 
     */
    public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-INITIALIZATION
     *
     */
    public void initialization(InitializationInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-READ-SMM
     *
     */
    public void readSmm(ReadSmmInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2100-READ-AND-PROCESS-SMM
     *
     * @return 
     */
    public ReadAndProcessSmmOutCtx readAndProcessSmm(ReadAndProcessSmmInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2200-REFORMAT-FIELD
     *
     * @return 
     */
    public ReformatFieldOutCtx reformatField(ReformatFieldInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3000-OUTPUT-SMM
     *
     * @return 
     */
    public OutputSmmOutCtx outputSmm(OutputSmmInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 7000-UNSTRING
     *
     * @return 
     */
    public UnstringOutCtx unstring(UnstringInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8920-DISPLAY-SMM-REC
     *
     */
    public void displaySmmRec(DisplaySmmRecInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9000-TERMINATION
     *
     * @return 
     */
    public TerminationOutCtx termination(TerminationInCtx methodIn) throws Exception;


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
