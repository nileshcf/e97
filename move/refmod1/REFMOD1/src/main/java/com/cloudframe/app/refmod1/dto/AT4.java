package com.cloudframe.app.refmod1.dto;

/**
*  The class AT4 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class AT4 extends AT4Serialized { 
   

						@Getter @Setter private char[] aTFld14 = Field.fillLowValue(20);

						@Getter @Setter private char[] aTFld24 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT4
	**/
    public AT4() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for AT4. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT4(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes AT4
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld14(CONSTANTS.SPACE_20);
         setATFld24(CONSTANTS.SPACE_40);
   }


}
  
