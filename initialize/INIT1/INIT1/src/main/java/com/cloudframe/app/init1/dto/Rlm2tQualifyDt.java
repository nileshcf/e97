package com.cloudframe.app.init1.dto;

/**
*  The class Rlm2tQualifyDt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Rlm2tQualifyDt extends Rlm2tQualifyDtSerialized { 
   

						@Getter @Setter private char[] rlm2tQualifyMm = Field.fillLowValue(2);


						@Getter @Setter private char[] rlm2tQualifyDd = Field.fillLowValue(2);


						@Getter @Setter private char[] rlm2tQualifyYyyy = Field.fillLowValue(4);
	
	/**
	* Constructor for Rlm2tQualifyDt
	**/
    public Rlm2tQualifyDt() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Rlm2tQualifyDt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rlm2tQualifyDt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Rlm2tQualifyDt
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setRlm2tQualifyMm(CONSTANTS.SPACE_2);
         setRlm2tQualifyDd(CONSTANTS.SPACE_2);
         setRlm2tQualifyYyyy(CONSTANTS.SPACE_4);
   }


}
  
