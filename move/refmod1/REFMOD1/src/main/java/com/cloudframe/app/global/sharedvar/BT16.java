package com.cloudframe.app.global.sharedvar;

/**
*  The class BT16 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class BT16 extends BT16Serialized { 
   

						@Getter @Setter private char[] bTFld116 = Field.fillLowValue(20);

						@Getter @Setter private char[] bTFld216 = Field.fillLowValue(40);

						@Getter @Setter private char[] bTFld316 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT16
	**/
    public BT16() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for BT16. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT16(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes BT16
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld116(CONSTANTS.SPACE_20);
         setBTFld216(CONSTANTS.SPACE_40);
         setBTFld316(CONSTANTS.SPACE_30);
   }


}
  
