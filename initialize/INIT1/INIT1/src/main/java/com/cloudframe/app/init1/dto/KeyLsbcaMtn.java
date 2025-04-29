package com.cloudframe.app.init1.dto;

/**
*  The class KeyLsbcaMtn is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class KeyLsbcaMtn extends KeyLsbcaMtnSerialized { 
   

						@Getter @Setter private char[] lsbcaNpa = Field.fillLowValue(3);

						@Getter @Setter private char[] lsbcaNxx = Field.fillLowValue(3);

						@Getter @Setter private char[] lsbcaTln = Field.fillLowValue(4);
	
	/**
	* Constructor for KeyLsbcaMtn
	**/
    public KeyLsbcaMtn() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for KeyLsbcaMtn. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyLsbcaMtn(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes KeyLsbcaMtn
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setLsbcaNpa(CONSTANTS.SPACE_3);
         setLsbcaNxx(CONSTANTS.SPACE_3);
         setLsbcaTln(CONSTANTS.SPACE_4);
   }


}
  
