package com.cloudframe.app.init1.dto;

/**
*  The class KeyCpduMtn is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class KeyCpduMtn extends KeyCpduMtnSerialized { 
   

						@Getter @Setter private char[] cpduNpa = Field.fillLowValue(3);

						@Getter @Setter private char[] cpduNxx = Field.fillLowValue(3);

						@Getter @Setter private char[] cpduTln = Field.fillLowValue(4);
	
	/**
	* Constructor for KeyCpduMtn
	**/
    public KeyCpduMtn() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for KeyCpduMtn. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyCpduMtn(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes KeyCpduMtn
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setCpduNpa(CONSTANTS.SPACE_3);
         setCpduNxx(CONSTANTS.SPACE_3);
         setCpduTln(CONSTANTS.SPACE_4);
   }


}
  
