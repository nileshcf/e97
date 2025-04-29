package com.cloudframe.app.move0.dto;

/**
*  The class Parent21 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Parent21 extends Parent21Serialized { 
   

								@Getter @Setter private char[] child11 = Field.fillLowValue(1);
	
	/**
	* Constructor for Parent21
	**/
    public Parent21() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Parent21. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Parent21(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Parent21
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                    setChild11(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_35498,"0".toCharArray()));
   }


}
  
