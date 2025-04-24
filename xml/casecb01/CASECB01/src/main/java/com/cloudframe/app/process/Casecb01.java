package com.cloudframe.app.process;

import com.cloudframe.app.casecb01.Casecb01Ctx.DisplayManufacturersOutCtx;
import com.cloudframe.app.casecb01.Casecb01Ctx.DisplayManufacturersInCtx;
import com.cloudframe.app.casecb01.Casecb01Ctx.FillInputDataSplit0OutCtx;
import com.cloudframe.app.casecb01.Casecb01Ctx.DisplayModelsInCtx;
import com.cloudframe.app.casecb01.Casecb01Ctx.MainParagraphInCtx;
import com.cloudframe.app.casecb01.Casecb01Ctx.DisplayDealersInCtx;
import com.cloudframe.app.casecb01.Casecb01Ctx.FillInputDataSplit1OutCtx;
import com.cloudframe.app.casecb01.Casecb01Ctx.InitializeOutCtx;
import com.cloudframe.app.casecb01.Casecb01Ctx.DisplayColorsInCtx;
import com.cloudframe.app.casecb01.Casecb01Ctx;
import com.cloudframe.app.casecb01.Casecb01Ctx.DisplayResultsInCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.casecb01.Casecb01Ctx.MainParagraphOutCtx;
import com.cloudframe.app.casecb01.Casecb01Ctx.FillInputDataSplit2OutCtx;
import com.cloudframe.app.casecb01.Casecb01Ctx.DisplayDealersOutCtx;
import com.cloudframe.app.casecb01.Casecb01Ctx.DisplayResultsOutCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.casecb01.Casecb01Ctx.DisplayModelsOutCtx;
import com.cloudframe.app.casecb01.Casecb01Ctx.DisplayAccessoriesInCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Casecb01 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Casecb01Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAIN-PARAGRAPH
     *
     * @return 
     */
    public MainParagraphOutCtx mainParagraph(MainParagraphInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0010-INITIALIZE
     *
     * @return 
     */
    public InitializeOutCtx initialize(Casecb01Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0100-FILL-INPUT-DATA
     *
     */
    public void fillInputData(Casecb01Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0100-FILL-INPUT-DATA-SPLIT0
     *
     * @return 
     */
    public FillInputDataSplit0OutCtx fillInputDataSplit0(Casecb01Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0100-FILL-INPUT-DATA-SPLIT1
     *
     * @return 
     */
    public FillInputDataSplit1OutCtx fillInputDataSplit1(Casecb01Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0100-FILL-INPUT-DATA-SPLIT2
     *
     * @return 
     */
    public FillInputDataSplit2OutCtx fillInputDataSplit2(Casecb01Ctx programCtx) throws Exception;

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
    public void goback(Casecb01Ctx programCtx) throws Exception;


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
