package com.cloudframe.app.global.sharedvar;

/**
*  The class BT15 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class BT15 extends BT15Serialized { 
   

						@Getter @Setter private char[] bTFld115 = Field.fillLowValue(20);

						@Getter @Setter private char[] bTFld215 = Field.fillLowValue(40);

						@Getter @Setter private char[] bTFld315 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT15
	**/
    public BT15() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for BT15. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT15(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes BT15
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld115(CONSTANTS.SPACE_20);
         setBTFld215(CONSTANTS.SPACE_40);
         setBTFld315(CONSTANTS.SPACE_30);
   }


}
  
