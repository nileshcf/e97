package com.cloudframe.app.global.sharedvar;

/**
*  The class AT13 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class AT13 extends AT13Serialized { 
   

						@Getter @Setter private char[] aTFld113 = Field.fillLowValue(20);

						@Getter @Setter private char[] aTFld213 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT13
	**/
    public AT13() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for AT13. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT13(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes AT13
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld113(CONSTANTS.SPACE_20);
         setATFld213(CONSTANTS.SPACE_40);
   }


}
  
