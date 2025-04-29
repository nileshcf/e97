package com.cloudframe.app.global.sharedvar;

/**
*  The class AT19 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class AT19 extends AT19Serialized { 
   

						@Getter @Setter private char[] aTFld119 = Field.fillLowValue(20);

						@Getter @Setter private char[] aTFld219 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT19
	**/
    public AT19() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for AT19. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT19(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes AT19
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld119(CONSTANTS.SPACE_20);
         setATFld219(CONSTANTS.SPACE_40);
   }


}
  
