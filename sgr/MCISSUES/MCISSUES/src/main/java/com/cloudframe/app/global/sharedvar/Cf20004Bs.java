package com.cloudframe.app.global.sharedvar;

/**
*  The class Cf20004Bs is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Cf20004Bs extends Cf20004BsSerialized { 
   

						@Getter @Setter private char[] cf20004BsLevel = Field.fillLowValue(1);

						@Getter @Setter private char[] cf20004BsId = Field.fillLowValue(6);
	
	/**
	* Constructor for Cf20004Bs
	**/
    public Cf20004Bs() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Cf20004Bs. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Cf20004Bs(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Cf20004Bs
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setCf20004BsLevel(CONSTANTS.SPACE);
         setCf20004BsId(CONSTANTS.SPACE_6);
   }


}
  
