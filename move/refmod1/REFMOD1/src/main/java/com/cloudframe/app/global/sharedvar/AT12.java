package com.cloudframe.app.global.sharedvar;

/**
*  The class AT12 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class AT12 extends AT12Serialized { 
   

						@Getter @Setter private char[] aTFld112 = Field.fillLowValue(20);

						@Getter @Setter private char[] aTFld212 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT12
	**/
    public AT12() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for AT12. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT12(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes AT12
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld112(CONSTANTS.SPACE_20);
         setATFld212(CONSTANTS.SPACE_40);
   }


}
  
