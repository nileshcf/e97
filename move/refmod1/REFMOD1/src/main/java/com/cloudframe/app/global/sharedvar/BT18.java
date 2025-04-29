package com.cloudframe.app.global.sharedvar;

/**
*  The class BT18 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class BT18 extends BT18Serialized { 
   

						@Getter @Setter private char[] bTFld118 = Field.fillLowValue(20);

						@Getter @Setter private char[] bTFld218 = Field.fillLowValue(40);

						@Getter @Setter private char[] bTFld318 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT18
	**/
    public BT18() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for BT18. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT18(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes BT18
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld118(CONSTANTS.SPACE_20);
         setBTFld218(CONSTANTS.SPACE_40);
         setBTFld318(CONSTANTS.SPACE_30);
   }


}
  
