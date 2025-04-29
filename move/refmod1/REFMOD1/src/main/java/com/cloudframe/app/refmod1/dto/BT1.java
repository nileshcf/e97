package com.cloudframe.app.refmod1.dto;

/**
*  The class BT1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class BT1 extends BT1Serialized { 
   

						@Getter @Setter private char[] bTFld11 = Field.fillLowValue(20);

						@Getter @Setter private char[] bTFld21 = Field.fillLowValue(40);

						@Getter @Setter private char[] bTFld31 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT1
	**/
    public BT1() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for BT1. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT1(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes BT1
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld11(CONSTANTS.SPACE_20);
         setBTFld21(CONSTANTS.SPACE_40);
         setBTFld31(CONSTANTS.SPACE_30);
   }


}
  
