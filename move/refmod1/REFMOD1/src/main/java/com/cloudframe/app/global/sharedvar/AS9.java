package com.cloudframe.app.global.sharedvar;

/**
*  The class AS9 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class AS9 extends AS9Serialized { 
   

						@Getter @Setter private char[] aSFld19 = Field.fillLowValue(30);

						@Getter @Setter private char[] aSFld29 = Field.fillLowValue(40);
	
	/**
	* Constructor for AS9
	**/
    public AS9() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for AS9. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AS9(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes AS9
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setASFld19(CONSTANTS.SPACE_30);
         setASFld29(CONSTANTS.SPACE_40);
   }


}
  
