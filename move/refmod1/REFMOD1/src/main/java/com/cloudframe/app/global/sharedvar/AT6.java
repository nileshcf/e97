package com.cloudframe.app.global.sharedvar;

/**
*  The class AT6 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class AT6 extends AT6Serialized { 
   

						@Getter @Setter private char[] aTFld16 = Field.fillLowValue(20);

						@Getter @Setter private char[] aTFld26 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT6
	**/
    public AT6() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for AT6. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT6(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes AT6
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld16(CONSTANTS.SPACE_20);
         setATFld26(CONSTANTS.SPACE_40);
   }


}
  
