package com.cloudframe.app.move0.dto;

/**
*  The class Parent51 is used to handle fields declared in it
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
public class Parent51 extends Parent51Serialized { 
   


								@Getter @Setter private char[] child3 = Field.fillLowValue(2);

								@Getter @Setter private char[] child4 = Field.fillLowValue(4);
	
	/**
	* Constructor for Parent51
	**/
    public Parent51() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Parent51. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Parent51(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Parent51
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                    setChild3(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1057940,"0".toCharArray()));
                    setChild4(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1007746112,"0".toCharArray()));
   }


}
  
