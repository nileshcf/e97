package com.cloudframe.app.refmod3.dto;

/**
*  The class AT218 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class AT218 extends AT218Serialized { 
   

						@Getter @Setter private char[] aTFld1218 = Field.fillLowValue(20);

						@Getter @Setter private char[] aTFld2218 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT218
	**/
    public AT218() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for AT218. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT218(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes AT218
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld1218(CONSTANTS.SPACE_20);
         setATFld2218(CONSTANTS.SPACE_40);
   }


}
  
