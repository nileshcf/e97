package com.cloudframe.app.global.sharedvar;

/**
*  The class AS15 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class AS15 extends AS15Serialized { 
   

						@Getter @Setter private char[] aSFld115 = Field.fillLowValue(30);

						@Getter @Setter private char[] aSFld215 = Field.fillLowValue(40);
	
	/**
	* Constructor for AS15
	**/
    public AS15() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for AS15. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AS15(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes AS15
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setASFld115(CONSTANTS.SPACE_30);
         setASFld215(CONSTANTS.SPACE_40);
   }


}
  
