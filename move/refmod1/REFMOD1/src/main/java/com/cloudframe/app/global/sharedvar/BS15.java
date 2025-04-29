package com.cloudframe.app.global.sharedvar;

/**
*  The class BS15 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class BS15 extends BS15Serialized { 
   

						@Getter @Setter private char[] bSFld115 = Field.fillLowValue(30);

						@Getter @Setter private char[] bSFld215 = Field.fillLowValue(40);
	
	/**
	* Constructor for BS15
	**/
    public BS15() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for BS15. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BS15(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes BS15
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBSFld115(CONSTANTS.SPACE_30);
         setBSFld215(CONSTANTS.SPACE_40);
   }


}
  
