package com.cloudframe.app.o529351u.dto;

/**
*  The class D51uKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class D51uKey extends D51uKeySerialized { 
   

						@Getter @Setter private char[] d51uKeyFeSpi = Field.fillLowValue(7);

						@Getter @Setter private char[] d51uKeyStatus = Field.fillLowValue(1);

						@Getter @Setter private char[] d51uKeyPolicy = Field.fillLowValue(6);

						@Getter @Setter private char[] d51uKeyPlan = Field.fillLowValue(4);
	
	/**
	* Constructor for D51uKey
	**/
    public D51uKey() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for D51uKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes D51uKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setD51uKeyFeSpi(CONSTANTS.SPACE_7);
         setD51uKeyStatus(CONSTANTS.SPACE);
         setD51uKeyPolicy(CONSTANTS.SPACE_6);
         setD51uKeyPlan(CONSTANTS.SPACE_4);
   }


}
  
