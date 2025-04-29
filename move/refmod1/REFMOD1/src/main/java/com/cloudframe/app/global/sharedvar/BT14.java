package com.cloudframe.app.global.sharedvar;

/**
*  The class BT14 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class BT14 extends BT14Serialized { 
   

						@Getter @Setter private char[] bTFld114 = Field.fillLowValue(20);

						@Getter @Setter private char[] bTFld214 = Field.fillLowValue(40);

						@Getter @Setter private char[] bTFld314 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT14
	**/
    public BT14() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for BT14. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT14(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes BT14
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld114(CONSTANTS.SPACE_20);
         setBTFld214(CONSTANTS.SPACE_40);
         setBTFld314(CONSTANTS.SPACE_30);
   }


}
  
