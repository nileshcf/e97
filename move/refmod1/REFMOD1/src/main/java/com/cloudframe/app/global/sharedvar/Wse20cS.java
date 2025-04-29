package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse20cS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse20cS extends Wse20cSSerialized { 
   

						@Getter @Setter private char[] wse20cSFld1 = Field.fillLowValue(10);

						@Getter @Setter private char[] wse20cSFld2 = Field.fillLowValue(20);

						@Getter @Setter private char[] wse20cSFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse20cS
	**/
    public Wse20cS() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Wse20cS. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse20cS(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Wse20cS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse20cSFld1(CONSTANTS.SPACE_10);
         setWse20cSFld2(CONSTANTS.SPACE_20);
         setWse20cSFld3(CONSTANTS.SPACE_30);
   }


}
  
