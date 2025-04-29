package com.cloudframe.app.global.sharedvar;

/**
*  The class BT20 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class BT20 extends BT20Serialized { 
   

						@Getter @Setter private char[] bTFld120 = Field.fillLowValue(20);

						@Getter @Setter private char[] bTFld220 = Field.fillLowValue(40);

						@Getter @Setter private char[] bTFld320 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT20
	**/
    public BT20() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for BT20. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT20(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes BT20
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld120(CONSTANTS.SPACE_20);
         setBTFld220(CONSTANTS.SPACE_40);
         setBTFld320(CONSTANTS.SPACE_30);
   }


}
  
