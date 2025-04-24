package com.cloudframe.app.process;

import com.cloudframe.app.casecb00.Casecb00Ctx.FillInputDataSplit1OutCtx;
import com.cloudframe.app.casecb00.Casecb00Ctx.FillInputDataSplit2OutCtx;
import com.cloudframe.app.casecb00.Casecb00Ctx.DisplayDealersOutCtx;
import com.cloudframe.app.casecb00.Casecb00Ctx.DisplayResultsOutCtx;
import com.cloudframe.app.casecb00.Casecb00Ctx.DisplayModelsOutCtx;
import com.cloudframe.app.casecb00.Casecb00Ctx.InitializeOutCtx;
import com.cloudframe.app.casecb00.Casecb00Ctx.DisplayResultsInCtx;
import com.cloudframe.app.casecb00.Casecb00Ctx.DisplayDealersInCtx;
import com.cloudframe.app.casecb00.Casecb00Ctx.DisplayManufacturersOutCtx;
import com.cloudframe.app.casecb00.Casecb00Ctx.DisplayModelsInCtx;
import com.cloudframe.app.casecb00.Casecb00Ctx.DisplayColorsInCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.casecb00.Casecb00Ctx;
import com.cloudframe.app.casecb00.Casecb00Ctx.DisplayManufacturersInCtx;
import com.cloudframe.app.casecb00.Casecb00Ctx.DisplayAccessoriesInCtx;
import com.cloudframe.app.casecb00.Casecb00Ctx.FillInputDataSplit0OutCtx;
import com.cloudframe.app.data.Field;


import com.cloudframe.app.dto.ProgramContext;

public interface Casecb00 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Casecb00Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAIN-PARAGRAPH
     *
     */
    public void mainParagraph(Casecb00Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0010-INITIALIZE
     *
     * @return 
     */
    public InitializeOutCtx initialize(Casecb00Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0100-FILL-INPUT-DATA
     *
     */
    public void fillInputData(Casecb00Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0100-FILL-INPUT-DATA-SPLIT0
     *
     * @return 
     */
    public FillInputDataSplit0OutCtx fillInputDataSplit0(Casecb00Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0100-FILL-INPUT-DATA-SPLIT1
     *
     * @return 
     */
    public FillInputDataSplit1OutCtx fillInputDataSplit1(Casecb00Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0100-FILL-INPUT-DATA-SPLIT2
     *
     * @return 
     */
    public FillInputDataSplit2OutCtx fillInputDataSplit2(Casecb00Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0300-DISPLAY-RESULTS
     *
     * @return 
     */
    public DisplayResultsOutCtx displayResults(DisplayResultsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0310-DISPLAY-DEALERS
     *
     * @return 
     */
    public DisplayDealersOutCtx displayDealers(DisplayDealersInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0320-DISPLAY-MANUFACTURERS
     *
     * @return 
     */
    public DisplayManufacturersOutCtx displayManufacturers(DisplayManufacturersInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0330-DISPLAY-MODELS
     *
     * @return 
     */
    public DisplayModelsOutCtx displayModels(DisplayModelsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0340-DISPLAY-COLORS
     *
     */
    public void displayColors(DisplayColorsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0350-DISPLAY-ACCESSORIES
     *
     */
    public void displayAccessories(DisplayAccessoriesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9999-GOBACK
     *
     */
    public void goback(Casecb00Ctx programCtx) throws Exception;


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
