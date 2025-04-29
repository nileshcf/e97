package com.cloudframe.app.refmod2.dto;

/**
*  The class AT210 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class AT210 extends AT210Serialized { 
   

						@Getter @Setter private char[] aTFld1210 = Field.fillLowValue(20);

						@Getter @Setter private char[] aTFld2210 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT210
	**/
    public AT210() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for AT210. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT210(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes AT210
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld1210(CONSTANTS.SPACE_20);
         setATFld2210(CONSTANTS.SPACE_40);
   }


}
  
