package com.cloudframe.app.refmod3.dto;

/**
*  The class BS29 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class BS29 extends BS29Serialized { 
   

						@Getter @Setter private char[] bSFld129 = Field.fillLowValue(30);

						@Getter @Setter private char[] bSFld229 = Field.fillLowValue(40);
	
	/**
	* Constructor for BS29
	**/
    public BS29() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for BS29. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BS29(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes BS29
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBSFld129(CONSTANTS.SPACE_30);
         setBSFld229(CONSTANTS.SPACE_40);
   }


}
  
