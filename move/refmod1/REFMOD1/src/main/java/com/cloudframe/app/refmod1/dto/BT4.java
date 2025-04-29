package com.cloudframe.app.refmod1.dto;

/**
*  The class BT4 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class BT4 extends BT4Serialized { 
   

						@Getter @Setter private char[] bTFld14 = Field.fillLowValue(20);

						@Getter @Setter private char[] bTFld24 = Field.fillLowValue(40);

						@Getter @Setter private char[] bTFld34 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT4
	**/
    public BT4() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for BT4. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT4(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes BT4
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld14(CONSTANTS.SPACE_20);
         setBTFld24(CONSTANTS.SPACE_40);
         setBTFld34(CONSTANTS.SPACE_30);
   }


}
  
