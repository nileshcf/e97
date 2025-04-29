package com.cloudframe.app.refmod3.dto;

/**
*  The class AT27 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class AT27 extends AT27Serialized { 
   

						@Getter @Setter private char[] aTFld127 = Field.fillLowValue(20);

						@Getter @Setter private char[] aTFld227 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT27
	**/
    public AT27() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for AT27. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT27(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes AT27
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld127(CONSTANTS.SPACE_20);
         setATFld227(CONSTANTS.SPACE_40);
   }


}
  
