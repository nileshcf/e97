package com.cloudframe.app.global.sharedvar;

/**
*  The class BT11 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class BT11 extends BT11Serialized { 
   

						@Getter @Setter private char[] bTFld111 = Field.fillLowValue(20);

						@Getter @Setter private char[] bTFld211 = Field.fillLowValue(40);

						@Getter @Setter private char[] bTFld311 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT11
	**/
    public BT11() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for BT11. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT11(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes BT11
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld111(CONSTANTS.SPACE_20);
         setBTFld211(CONSTANTS.SPACE_40);
         setBTFld311(CONSTANTS.SPACE_30);
   }


}
  
