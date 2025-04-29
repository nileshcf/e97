package com.cloudframe.app.refmod2.dto;

/**
*  The class BT213 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class BT213 extends BT213Serialized { 
   

						@Getter @Setter private char[] bTFld1213 = Field.fillLowValue(20);

						@Getter @Setter private char[] bTFld2213 = Field.fillLowValue(40);

						@Getter @Setter private char[] bTFld3213 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT213
	**/
    public BT213() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for BT213. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT213(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes BT213
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld1213(CONSTANTS.SPACE_20);
         setBTFld2213(CONSTANTS.SPACE_40);
         setBTFld3213(CONSTANTS.SPACE_30);
   }


}
  
