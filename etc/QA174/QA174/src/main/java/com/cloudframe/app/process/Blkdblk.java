package com.cloudframe.app.process;

import com.cloudframe.app.blkdblk.BlkdblkCtx.ConvertVbs2UInCtx;
import com.cloudframe.app.blkdblk.BlkdblkCtx.LoadE2ATableSplit3OutCtx;
import com.cloudframe.app.blkdblk.BlkdblkCtx;
import com.cloudframe.app.blkdblk.BlkdblkCtx.ConvertU2VbsOutCtx;
import com.cloudframe.app.blkdblk.BlkdblkCtx.ConvertU2VbsInCtx;
import com.cloudframe.app.blkdblk.BlkdblkCtx.LoadE2ATableSplit1OutCtx;
import com.cloudframe.app.blkdblk.BlkdblkCtx.LoadA2ETableSplit4OutCtx;
import com.cloudframe.app.blkdblk.BlkdblkCtx.LoadA2ETableSplit5OutCtx;
import com.cloudframe.app.blkdblk.BlkdblkCtx.ConvertVbs2UOutCtx;
import com.cloudframe.app.blkdblk.BlkdblkCtx.AbendOutCtx;
import com.cloudframe.app.blkdblk.BlkdblkCtx.LoadE2ATableSplit0OutCtx;
import com.cloudframe.app.blkdblk.BlkdblkCtx.LoadA2ETableSplit6OutCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.blkdblk.BlkdblkCtx.LoadE2ATableSplit2OutCtx;
import com.cloudframe.app.blkdblk.BlkdblkCtx.LoadA2ETableSplit7OutCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Blkdblk {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(BlkdblkCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9100-ABEND
     *
     * @return 
     */
    public AbendOutCtx abend(BlkdblkCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - LOAD-E-2-A-TABLE
     *
     */
    public void loadE2ATable(BlkdblkCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - LOAD-E-2-A-TABLE-SPLIT0
     *
     * @return 
     */
    public LoadE2ATableSplit0OutCtx loadE2ATableSplit0(BlkdblkCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - LOAD-E-2-A-TABLE-SPLIT1
     *
     * @return 
     */
    public LoadE2ATableSplit1OutCtx loadE2ATableSplit1(BlkdblkCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - LOAD-E-2-A-TABLE-SPLIT2
     *
     * @return 
     */
    public LoadE2ATableSplit2OutCtx loadE2ATableSplit2(BlkdblkCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - LOAD-E-2-A-TABLE-SPLIT3
     *
     * @return 
     */
    public LoadE2ATableSplit3OutCtx loadE2ATableSplit3(BlkdblkCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - LOAD-A-2-E-TABLE
     *
     */
    public void loadA2ETable(BlkdblkCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - LOAD-A-2-E-TABLE-SPLIT4
     *
     * @return 
     */
    public LoadA2ETableSplit4OutCtx loadA2ETableSplit4(BlkdblkCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - LOAD-A-2-E-TABLE-SPLIT5
     *
     * @return 
     */
    public LoadA2ETableSplit5OutCtx loadA2ETableSplit5(BlkdblkCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - LOAD-A-2-E-TABLE-SPLIT6
     *
     * @return 
     */
    public LoadA2ETableSplit6OutCtx loadA2ETableSplit6(BlkdblkCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - LOAD-A-2-E-TABLE-SPLIT7
     *
     * @return 
     */
    public LoadA2ETableSplit7OutCtx loadA2ETableSplit7(BlkdblkCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - CONVERT-U-2-VBS
     *
     * @return 
     */
    public ConvertU2VbsOutCtx convertU2Vbs(ConvertU2VbsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - CONVERT-VBS-2-U
     *
     * @return 
     */
    public ConvertVbs2UOutCtx convertVbs2U(ConvertVbs2UInCtx methodIn) throws Exception;


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
