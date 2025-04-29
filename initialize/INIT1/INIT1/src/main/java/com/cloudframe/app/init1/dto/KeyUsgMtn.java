package com.cloudframe.app.init1.dto;

/**
*  The class KeyUsgMtn is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class KeyUsgMtn extends KeyUsgMtnSerialized { 
   

						@Getter @Setter private char[] usgNpa = Field.fillLowValue(3);

						@Getter @Setter private char[] usgNxx = Field.fillLowValue(3);

						@Getter @Setter private char[] usgTln = Field.fillLowValue(4);
	
	/**
	* Constructor for KeyUsgMtn
	**/
    public KeyUsgMtn() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for KeyUsgMtn. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyUsgMtn(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes KeyUsgMtn
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setUsgNpa(CONSTANTS.SPACE_3);
         setUsgNxx(CONSTANTS.SPACE_3);
         setUsgTln(CONSTANTS.SPACE_4);
   }


}
  
