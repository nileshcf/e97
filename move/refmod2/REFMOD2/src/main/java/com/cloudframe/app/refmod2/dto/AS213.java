package com.cloudframe.app.refmod2.dto;

/**
*  The class AS213 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class AS213 extends AS213Serialized { 
   

						@Getter @Setter private char[] aSFld1213 = Field.fillLowValue(30);

						@Getter @Setter private char[] aSFld2213 = Field.fillLowValue(40);
	
	/**
	* Constructor for AS213
	**/
    public AS213() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for AS213. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AS213(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes AS213
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setASFld1213(CONSTANTS.SPACE_30);
         setASFld2213(CONSTANTS.SPACE_40);
   }


}
  
