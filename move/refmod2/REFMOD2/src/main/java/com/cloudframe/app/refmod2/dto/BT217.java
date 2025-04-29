package com.cloudframe.app.refmod2.dto;

/**
*  The class BT217 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class BT217 extends BT217Serialized { 
   

						@Getter @Setter private char[] bTFld1217 = Field.fillLowValue(20);

						@Getter @Setter private char[] bTFld2217 = Field.fillLowValue(40);

						@Getter @Setter private char[] bTFld3217 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT217
	**/
    public BT217() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for BT217. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT217(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes BT217
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld1217(CONSTANTS.SPACE_20);
         setBTFld2217(CONSTANTS.SPACE_40);
         setBTFld3217(CONSTANTS.SPACE_30);
   }


}
  
