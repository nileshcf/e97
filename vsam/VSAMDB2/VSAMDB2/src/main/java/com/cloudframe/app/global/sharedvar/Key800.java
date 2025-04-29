package com.cloudframe.app.global.sharedvar;

/**
*  The class Key800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Key800 extends Key800Serialized { 
   

						@Getter @Setter private char[] cpi800 = Field.fillLowValue(3);

						@Getter @Setter private char[] bsl800 = Field.fillLowValue(1);

						@Getter @Setter private char[] bsid800 = Field.fillLowValue(6);

						@Getter @Setter private char[] msgType800 = Field.fillLowValue(4);

						@Getter @Setter private char[] funcCd800 = Field.fillLowValue(3);

						@Getter @Setter private char[] prcsCd800 = Field.fillLowValue(6);

								@Getter @Setter private long de26800;

						@Getter @Setter private char[] prodId800 = Field.fillLowValue(3);
	
	/**
	* Constructor for Key800
	**/
    public Key800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Key800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Key800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Key800
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setCpi800(CONSTANTS.SPACE_3);
         setBsl800(CONSTANTS.SPACE);
         setBsid800(CONSTANTS.SPACE_6);
         setMsgType800(CONSTANTS.SPACE_4);
         setFuncCd800(CONSTANTS.SPACE_3);
         setPrcsCd800(CONSTANTS.SPACE_6);
                     setDe26800(0);
         setProdId800(CONSTANTS.SPACE_3);
   }


}
  
