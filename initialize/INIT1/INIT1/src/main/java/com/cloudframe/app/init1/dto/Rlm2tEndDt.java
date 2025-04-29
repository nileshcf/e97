package com.cloudframe.app.init1.dto;

/**
*  The class Rlm2tEndDt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Rlm2tEndDt extends Rlm2tEndDtSerialized { 
   

						@Getter @Setter private char[] rlm2tEndMm = Field.fillLowValue(2);


						@Getter @Setter private char[] rlm2tEndDd = Field.fillLowValue(2);


						@Getter @Setter private char[] rlm2tEndYyyy = Field.fillLowValue(4);
	
	/**
	* Constructor for Rlm2tEndDt
	**/
    public Rlm2tEndDt() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Rlm2tEndDt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rlm2tEndDt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Rlm2tEndDt
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setRlm2tEndMm(CONSTANTS.SPACE_2);
         setRlm2tEndDd(CONSTANTS.SPACE_2);
         setRlm2tEndYyyy(CONSTANTS.SPACE_4);
   }


}
  
