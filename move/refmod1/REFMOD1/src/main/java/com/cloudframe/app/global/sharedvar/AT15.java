package com.cloudframe.app.global.sharedvar;

/**
*  The class AT15 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class AT15 extends AT15Serialized { 
   

						@Getter @Setter private char[] aTFld115 = Field.fillLowValue(20);

						@Getter @Setter private char[] aTFld215 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT15
	**/
    public AT15() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for AT15. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT15(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes AT15
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld115(CONSTANTS.SPACE_20);
         setATFld215(CONSTANTS.SPACE_40);
   }


}
  
