package com.cloudframe.app.refmod1.dto;

/**
*  The class AT2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class AT2 extends AT2Serialized { 
   

						@Getter @Setter private char[] aTFld12 = Field.fillLowValue(20);

						@Getter @Setter private char[] aTFld22 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT2
	**/
    public AT2() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for AT2. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT2(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes AT2
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld12(CONSTANTS.SPACE_20);
         setATFld22(CONSTANTS.SPACE_40);
   }


}
  
