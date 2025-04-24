package com.cloudframe.app.process;

import com.cloudframe.app.search2.Search2Ctx.SearchAllInCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.search2.Search2Ctx;
import com.cloudframe.app.search2.Search2Ctx.ToggleInCtx;
import com.cloudframe.app.search2.Search2Ctx.FillDetailInCtx;
import com.cloudframe.app.search2.Search2Ctx.FillDetailOutCtx;
import com.cloudframe.app.search2.Search2Ctx.FillDetail0011InCtx;
import com.cloudframe.app.search2.Search2Ctx.ToggleOutCtx;
import com.cloudframe.app.search2.Search2Ctx.FillDetail0011OutCtx;
import com.cloudframe.app.data.Field;


import com.cloudframe.app.dto.ProgramContext;

public interface Search2 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Search2Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0005-TOGGLE
     *
     * @return 
     */
    public ToggleOutCtx toggle(ToggleInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0010-FILL-DETAIL
     *
     * @return 
     */
    public FillDetailOutCtx fillDetail(FillDetailInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0011-FILL-DETAIL
     *
     * @return 
     */
    public FillDetail0011OutCtx fillDetail0011(FillDetail0011InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0100-SEARCH-ALL
     *
     */
    public void searchAll(SearchAllInCtx methodIn) throws Exception;


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
