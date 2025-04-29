package com.cloudframe.app.global.sharedvar;

/**
*  The class BS5 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class BS5 extends BS5Serialized { 
   

						@Getter @Setter private char[] bSFld15 = Field.fillLowValue(30);

						@Getter @Setter private char[] bSFld25 = Field.fillLowValue(40);
	
	/**
	* Constructor for BS5
	**/
    public BS5() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for BS5. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BS5(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes BS5
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBSFld15(CONSTANTS.SPACE_30);
         setBSFld25(CONSTANTS.SPACE_40);
   }


}
  
