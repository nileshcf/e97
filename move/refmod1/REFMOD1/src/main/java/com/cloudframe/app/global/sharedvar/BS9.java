package com.cloudframe.app.global.sharedvar;

/**
*  The class BS9 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class BS9 extends BS9Serialized { 
   

						@Getter @Setter private char[] bSFld19 = Field.fillLowValue(30);

						@Getter @Setter private char[] bSFld29 = Field.fillLowValue(40);
	
	/**
	* Constructor for BS9
	**/
    public BS9() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for BS9. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BS9(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes BS9
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBSFld19(CONSTANTS.SPACE_30);
         setBSFld29(CONSTANTS.SPACE_40);
   }


}
  
