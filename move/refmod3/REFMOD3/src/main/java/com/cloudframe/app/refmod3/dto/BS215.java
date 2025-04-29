package com.cloudframe.app.refmod3.dto;

/**
*  The class BS215 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class BS215 extends BS215Serialized { 
   

						@Getter @Setter private char[] bSFld1215 = Field.fillLowValue(30);

						@Getter @Setter private char[] bSFld2215 = Field.fillLowValue(40);
	
	/**
	* Constructor for BS215
	**/
    public BS215() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for BS215. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BS215(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes BS215
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBSFld1215(CONSTANTS.SPACE_30);
         setBSFld2215(CONSTANTS.SPACE_40);
   }


}
  
