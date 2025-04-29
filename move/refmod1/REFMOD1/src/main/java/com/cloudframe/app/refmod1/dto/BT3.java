package com.cloudframe.app.refmod1.dto;

/**
*  The class BT3 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class BT3 extends BT3Serialized { 
   

						@Getter @Setter private char[] bTFld13 = Field.fillLowValue(20);

						@Getter @Setter private char[] bTFld23 = Field.fillLowValue(40);

						@Getter @Setter private char[] bTFld33 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT3
	**/
    public BT3() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for BT3. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT3(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes BT3
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld13(CONSTANTS.SPACE_20);
         setBTFld23(CONSTANTS.SPACE_40);
         setBTFld33(CONSTANTS.SPACE_30);
   }


}
  
