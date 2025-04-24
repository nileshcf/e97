package com.cloudframe.app.process;

import com.cloudframe.app.usbaeext.UsbaeextCtx.ProcessAdjTableOutCtx;
import com.cloudframe.app.usbaeext.UsbaeextCtx.ProcessAdjTableInCtx;
import com.cloudframe.app.usbaeext.UsbaeextCtx.ReadAdjTableOutCtx;
import com.cloudframe.app.usbaeext.UsbaeextCtx.ProcessTmInCtx;
import com.cloudframe.app.usbaeext.UsbaeextCtx.ProcessTmOutCtx;
import com.cloudframe.app.usbaeext.UsbaeextCtx.CreateAeOutputRecordOutCtx;
import com.cloudframe.app.usbaeext.UsbaeextCtx.InitializationOutCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.usbaeext.UsbaeextCtx.InitializationInCtx;
import com.cloudframe.app.usbaeext.UsbaeextCtx.OpenFilesInCtx;
import com.cloudframe.app.usbaeext.UsbaeextCtx.ReadTmFileOutCtx;
import com.cloudframe.app.usbaeext.UsbaeextCtx.CreateAeOutputRecordInCtx;
import com.cloudframe.app.usbaeext.UsbaeextCtx.ProcessFileInCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.usbaeext.UsbaeextCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Usbaeext {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(UsbaeextCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-INITIALIZATION
     *
     * @return 
     */
    public InitializationOutCtx initialization(InitializationInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0010-OPEN-FILES
     *
     */
    public void openFiles(OpenFilesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0100-READ-TM-FILE
     *
     * @return 
     */
    public ReadTmFileOutCtx readTmFile(UsbaeextCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0200-PROCESS-FILE
     *
     */
    public void processFile(ProcessFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0300-CLOSE-FILES
     *
     */
    public void closeFiles(UsbaeextCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1200-PROCESS-TM
     *
     * @return 
     */
    public ProcessTmOutCtx processTm(ProcessTmInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1400-CREATE-AE-OUTPUT-RECORD
     *
     * @return 
     */
    public CreateAeOutputRecordOutCtx createAeOutputRecord(CreateAeOutputRecordInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-READ-ADJ-TABLE
     *
     * @return 
     */
    public ReadAdjTableOutCtx readAdjTable(UsbaeextCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2100-PROCESS-ADJ-TABLE
     *
     * @return 
     */
    public ProcessAdjTableOutCtx processAdjTable(ProcessAdjTableInCtx methodIn) throws Exception;


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
