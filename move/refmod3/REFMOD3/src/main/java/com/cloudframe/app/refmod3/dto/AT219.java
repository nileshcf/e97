package com.cloudframe.app.refmod3.dto;

/**
*  The class AT219 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class AT219 extends AT219Serialized { 
   

						@Getter @Setter private char[] aTFld1219 = Field.fillLowValue(20);

						@Getter @Setter private char[] aTFld2219 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT219
	**/
    public AT219() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for AT219. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT219(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes AT219
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld1219(CONSTANTS.SPACE_20);
         setATFld2219(CONSTANTS.SPACE_40);
   }


}
  
