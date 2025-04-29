package com.cloudframe.app.db2func.dto;

/**
*  The class Bdms01AdpMasterExpData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Bdms01AdpMasterExpData extends Bdms01AdpMasterExpDataSerialized { 
   

								@Getter @Setter private long bdms01EisNumber;

						@Getter @Setter private char[] bdms01EisCntry = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01SecLckdInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01FatcaCd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01MtrlMdfdDt = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01FatcaOvrrdCd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01FatcaCdCalcInd = Field.fillLowValue(1);

	
	/**
	* Constructor for Bdms01AdpMasterExpData
	**/
    public Bdms01AdpMasterExpData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Bdms01AdpMasterExpData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01AdpMasterExpData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Bdms01AdpMasterExpData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01EisNumber(0);
         setBdms01EisCntry(CONSTANTS.SPACE_2);
         setBdms01SecLckdInd(CONSTANTS.SPACE);
         setBdms01FatcaCd(CONSTANTS.SPACE);
         setBdms01MtrlMdfdDt(CONSTANTS.SPACE_10);
         setBdms01FatcaOvrrdCd(CONSTANTS.SPACE);
         setBdms01FatcaCdCalcInd(CONSTANTS.SPACE);
   }


}
  
