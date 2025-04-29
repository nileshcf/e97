package com.cloudframe.app.global.sharedvar;

/**
*  The class AS5 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class AS5 extends AS5Serialized { 
   

						@Getter @Setter private char[] aSFld15 = Field.fillLowValue(30);

						@Getter @Setter private char[] aSFld25 = Field.fillLowValue(40);
	
	/**
	* Constructor for AS5
	**/
    public AS5() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for AS5. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AS5(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes AS5
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setASFld15(CONSTANTS.SPACE_30);
         setASFld25(CONSTANTS.SPACE_40);
   }


}
  
