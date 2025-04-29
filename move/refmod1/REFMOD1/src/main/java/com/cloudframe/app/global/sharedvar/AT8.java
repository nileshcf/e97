package com.cloudframe.app.global.sharedvar;

/**
*  The class AT8 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class AT8 extends AT8Serialized { 
   

						@Getter @Setter private char[] aTFld18 = Field.fillLowValue(20);

						@Getter @Setter private char[] aTFld28 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT8
	**/
    public AT8() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for AT8. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT8(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes AT8
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld18(CONSTANTS.SPACE_20);
         setATFld28(CONSTANTS.SPACE_40);
   }


}
  
