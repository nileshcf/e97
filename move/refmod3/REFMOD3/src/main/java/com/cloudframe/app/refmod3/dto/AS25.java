package com.cloudframe.app.refmod3.dto;

/**
*  The class AS25 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class AS25 extends AS25Serialized { 
   

						@Getter @Setter private char[] aSFld125 = Field.fillLowValue(30);

						@Getter @Setter private char[] aSFld225 = Field.fillLowValue(40);
	
	/**
	* Constructor for AS25
	**/
    public AS25() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for AS25. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AS25(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes AS25
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setASFld125(CONSTANTS.SPACE_30);
         setASFld225(CONSTANTS.SPACE_40);
   }


}
  
