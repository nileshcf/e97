package com.cloudframe.app.process;

import com.cloudframe.app.mcindex.McindexCtx.MainSplit0OutCtx;
import com.cloudframe.app.mcindex.McindexCtx.MainSplit1OutCtx;
import com.cloudframe.app.mcindex.McindexCtx.MainSplit3InCtx;
import com.cloudframe.app.mcindex.McindexCtx.MainSplit2OutCtx;
import com.cloudframe.app.mcindex.McindexCtx.MainSplit5OutCtx;
import com.cloudframe.app.mcindex.McindexCtx.MainSplit5InCtx;
import com.cloudframe.app.mcindex.McindexCtx;
import com.cloudframe.app.mcindex.McindexCtx.MainSplit0InCtx;
import com.cloudframe.app.mcindex.McindexCtx.MainSplit2InCtx;
import com.cloudframe.app.mcindex.McindexCtx.MainSplit1InCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.mcindex.McindexCtx.MainSplit4InCtx;
import com.cloudframe.app.mcindex.McindexCtx.MainSplit3OutCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.mcindex.McindexCtx.MainSplit4OutCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Mcindex {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(McindexCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAIN
     *
     */
    public void main(McindexCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAIN-SPLIT0
     *
     * @return 
     */
    public MainSplit0OutCtx mainSplit0(MainSplit0InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAIN-SPLIT1
     *
     * @return 
     */
    public MainSplit1OutCtx mainSplit1(MainSplit1InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAIN-SPLIT2
     *
     * @return 
     */
    public MainSplit2OutCtx mainSplit2(MainSplit2InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAIN-SPLIT3
     *
     * @return 
     */
    public MainSplit3OutCtx mainSplit3(MainSplit3InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAIN-SPLIT4
     *
     * @return 
     */
    public MainSplit4OutCtx mainSplit4(MainSplit4InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAIN-SPLIT5
     *
     * @return 
     */
    public MainSplit5OutCtx mainSplit5(MainSplit5InCtx methodIn) throws Exception;


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
