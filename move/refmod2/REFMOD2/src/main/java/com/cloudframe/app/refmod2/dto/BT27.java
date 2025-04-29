package com.cloudframe.app.refmod2.dto;

/**
*  The class BT27 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class BT27 extends BT27Serialized { 
   

						@Getter @Setter private char[] bTFld127 = Field.fillLowValue(20);

						@Getter @Setter private char[] bTFld227 = Field.fillLowValue(40);

						@Getter @Setter private char[] bTFld327 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT27
	**/
    public BT27() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for BT27. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT27(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes BT27
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld127(CONSTANTS.SPACE_20);
         setBTFld227(CONSTANTS.SPACE_40);
         setBTFld327(CONSTANTS.SPACE_30);
   }


}
  
