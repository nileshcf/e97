package com.cloudframe.app.refmod1.dto;

/**
*  The class AT3 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class AT3 extends AT3Serialized { 
   

						@Getter @Setter private char[] aTFld13 = Field.fillLowValue(20);

						@Getter @Setter private char[] aTFld23 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT3
	**/
    public AT3() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for AT3. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT3(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes AT3
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld13(CONSTANTS.SPACE_20);
         setATFld23(CONSTANTS.SPACE_40);
   }


}
  
