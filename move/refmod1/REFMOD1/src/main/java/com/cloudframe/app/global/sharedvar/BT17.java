package com.cloudframe.app.global.sharedvar;

/**
*  The class BT17 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class BT17 extends BT17Serialized { 
   

						@Getter @Setter private char[] bTFld117 = Field.fillLowValue(20);

						@Getter @Setter private char[] bTFld217 = Field.fillLowValue(40);

						@Getter @Setter private char[] bTFld317 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT17
	**/
    public BT17() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for BT17. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT17(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes BT17
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld117(CONSTANTS.SPACE_20);
         setBTFld217(CONSTANTS.SPACE_40);
         setBTFld317(CONSTANTS.SPACE_30);
   }


}
  
