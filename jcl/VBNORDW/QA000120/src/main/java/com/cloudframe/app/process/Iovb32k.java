package com.cloudframe.app.process;

import com.cloudframe.app.iovb32k.Iovb32kCtx;
import com.cloudframe.app.iovb32k.Iovb32kCtx.InitializeOutRecOutCtx;
import com.cloudframe.app.iovb32k.Iovb32kCtx.MainlineOutCtx;
import com.cloudframe.app.iovb32k.Iovb32kCtx.OpenOutFileInCtx;
import com.cloudframe.app.iovb32k.Iovb32kCtx.OpenOutFileOutCtx;
import com.cloudframe.app.iovb32k.Iovb32kCtx.OpenInFileOutCtx;
import com.cloudframe.app.iovb32k.Iovb32kCtx.ReadInFileOutCtx;
import com.cloudframe.app.iovb32k.Iovb32kCtx.InitializeOutRecInCtx;
import com.cloudframe.app.iovb32k.Iovb32kCtx.WriteOutFileOutCtx;
import com.cloudframe.app.iovb32k.Iovb32kCtx.ReadInFileInCtx;
import com.cloudframe.app.iovb32k.Iovb32kCtx.CloseInFileOutCtx;
import com.cloudframe.app.iovb32k.Iovb32kCtx.MainlineInCtx;
import com.cloudframe.app.iovb32k.Iovb32kCtx.OpenInFileInCtx;
import com.cloudframe.app.iovb32k.Iovb32kCtx.CloseOutFileOutCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.iovb32k.Iovb32kCtx.ValidateInputParmInCtx;
import com.cloudframe.app.iovb32k.Iovb32kCtx.ValidateInRecDataOutCtx;
import com.cloudframe.app.iovb32k.Iovb32kCtx.WriteOutFileInCtx;
import com.cloudframe.app.iovb32k.Iovb32kCtx.ValidateInputParmOutCtx;
import com.cloudframe.app.iovb32k.Iovb32kCtx.ValidateInRecDataInCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Iovb32k {
    /**
     * This method is derived from Cobol Paragraph - 
     *
     * @return return code of program
     */
    public int setParameter(Iovb32kCtx programCtx, String parm) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Iovb32kCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     * @return 
     */
    public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0010-VALIDATE-INPUT-PARM
     *
     * @return 
     */
    public ValidateInputParmOutCtx validateInputParm(ValidateInputParmInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0100-OPEN-IN-FILE
     *
     * @return 
     */
    public OpenInFileOutCtx openInFile(OpenInFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0100-OPEN-OUT-FILE
     *
     * @return 
     */
    public OpenOutFileOutCtx openOutFile(OpenOutFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0200-READ-IN-FILE
     *
     * @return 
     */
    public ReadInFileOutCtx readInFile(ReadInFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0210-VALIDATE-IN-REC-DATA
     *
     * @return 
     */
    public ValidateInRecDataOutCtx validateInRecData(ValidateInRecDataInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0200-WRITE-OUT-FILE
     *
     * @return 
     */
    public WriteOutFileOutCtx writeOutFile(WriteOutFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0210-INITIALIZE-OUT-REC
     *
     * @return 
     */
    public InitializeOutRecOutCtx initializeOutRec(InitializeOutRecInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0300-CLOSE-IN-FILE
     *
     * @return 
     */
    public CloseInFileOutCtx closeInFile(Iovb32kCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0300-CLOSE-OUT-FILE
     *
     * @return 
     */
    public CloseOutFileOutCtx closeOutFile(Iovb32kCtx programCtx) throws Exception;


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
