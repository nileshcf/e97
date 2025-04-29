package com.cloudframe.app.global.sharedvar;

/**
*  The class BT12 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class BT12 extends BT12Serialized { 
   

						@Getter @Setter private char[] bTFld112 = Field.fillLowValue(20);

						@Getter @Setter private char[] bTFld212 = Field.fillLowValue(40);

						@Getter @Setter private char[] bTFld312 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT12
	**/
    public BT12() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for BT12. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT12(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes BT12
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld112(CONSTANTS.SPACE_20);
         setBTFld212(CONSTANTS.SPACE_40);
         setBTFld312(CONSTANTS.SPACE_30);
   }


}
  
