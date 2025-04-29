package com.cloudframe.app.refmod2.dto;

/**
*  The class AT213 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class AT213 extends AT213Serialized { 
   

						@Getter @Setter private char[] aTFld1213 = Field.fillLowValue(20);

						@Getter @Setter private char[] aTFld2213 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT213
	**/
    public AT213() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for AT213. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT213(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes AT213
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld1213(CONSTANTS.SPACE_20);
         setATFld2213(CONSTANTS.SPACE_40);
   }


}
  
