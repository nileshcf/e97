package com.cloudframe.app.global.sharedvar;

/**
*  The class Si583Filler1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Si583Filler1 extends Si583Filler1Serialized { 
   

						@Getter @Setter private char[] si583DePresentInd1 = Field.fillLowValue(1);

								@Getter @Setter private short si583DeStartingPos1;

								@Getter @Setter private short si583DeLength1;
	
	/**
	* Constructor for Si583Filler1
	**/
    public Si583Filler1() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Si583Filler1. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Si583Filler1(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Si583Filler1
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setSi583DePresentInd1(CONSTANTS.SPACE);
         	setSi583DeStartingPos1((short)0);
         	setSi583DeLength1((short)0);
   }


}
  
