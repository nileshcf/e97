package com.cloudframe.app.global.sharedvar;

/**
*  The class AT14 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class AT14 extends AT14Serialized { 
   

						@Getter @Setter private char[] aTFld114 = Field.fillLowValue(20);

						@Getter @Setter private char[] aTFld214 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT14
	**/
    public AT14() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for AT14. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT14(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes AT14
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld114(CONSTANTS.SPACE_20);
         setATFld214(CONSTANTS.SPACE_40);
   }


}
  
