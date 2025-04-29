package com.cloudframe.app.db2func.dto;

/**
*  The class Bdms01CallParametersArray1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Bdms01CallParametersArray1 extends Bdms01CallParametersArray1Serialized { 
   

						@Getter @Setter private char[] bdms01SecurityDesc = Field.fillLowValue(30);

						@Getter @Setter private char[] bdms01SecurityDescLang = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01TypeDescCd = Field.fillLowValue(1);
	
	/**
	* Constructor for Bdms01CallParametersArray1
	**/
    public Bdms01CallParametersArray1() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Bdms01CallParametersArray1. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01CallParametersArray1(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Bdms01CallParametersArray1
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBdms01SecurityDesc(CONSTANTS.SPACE_30);
         setBdms01SecurityDescLang(CONSTANTS.SPACE_2);
         setBdms01TypeDescCd(CONSTANTS.SPACE);
   }


}
  
