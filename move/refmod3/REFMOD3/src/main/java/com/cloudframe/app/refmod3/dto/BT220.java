package com.cloudframe.app.refmod3.dto;

/**
*  The class BT220 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class BT220 extends BT220Serialized { 
   

						@Getter @Setter private char[] bTFld1220 = Field.fillLowValue(20);

						@Getter @Setter private char[] bTFld2220 = Field.fillLowValue(40);

						@Getter @Setter private char[] bTFld3220 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT220
	**/
    public BT220() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for BT220. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT220(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes BT220
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld1220(CONSTANTS.SPACE_20);
         setBTFld2220(CONSTANTS.SPACE_40);
         setBTFld3220(CONSTANTS.SPACE_30);
   }


}
  
