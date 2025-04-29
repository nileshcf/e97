package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse9bS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse9bS extends Wse9bSSerialized { 
   

						@Getter @Setter private char[] wse9bSFld1 = Field.fillLowValue(30);

						@Getter @Setter private char[] wse9bSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse9bS
	**/
    public Wse9bS() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Wse9bS. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse9bS(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Wse9bS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse9bSFld1(CONSTANTS.SPACE_30);
         setWse9bSFld2(CONSTANTS.SPACE_30);
   }


}
  
