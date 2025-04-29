package com.cloudframe.app.global.sharedvar;

/**
*  The class Si583Filler2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Si583Filler2 extends Si583Filler2Serialized { 
   

						@Getter @Setter private char[] si583DePresentInd2 = Field.fillLowValue(1);

								@Getter @Setter private short si583DeStartingPos2;

								@Getter @Setter private short si583DeLength2;
	
	/**
	* Constructor for Si583Filler2
	**/
    public Si583Filler2() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Si583Filler2. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Si583Filler2(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Si583Filler2
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setSi583DePresentInd2(CONSTANTS.SPACE);
         	setSi583DeStartingPos2((short)0);
         	setSi583DeLength2((short)0);
   }


}
  
