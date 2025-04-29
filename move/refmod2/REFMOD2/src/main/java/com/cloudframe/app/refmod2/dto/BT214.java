package com.cloudframe.app.refmod2.dto;

/**
*  The class BT214 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class BT214 extends BT214Serialized { 
   

						@Getter @Setter private char[] bTFld1214 = Field.fillLowValue(20);

						@Getter @Setter private char[] bTFld2214 = Field.fillLowValue(40);

						@Getter @Setter private char[] bTFld3214 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT214
	**/
    public BT214() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for BT214. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT214(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes BT214
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld1214(CONSTANTS.SPACE_20);
         setBTFld2214(CONSTANTS.SPACE_40);
         setBTFld3214(CONSTANTS.SPACE_30);
   }


}
  
