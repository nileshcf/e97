package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse5aS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse5aS extends Wse5aSSerialized { 
   

						@Getter @Setter private char[] wse5aSFld1 = Field.fillLowValue(30);

						@Getter @Setter private char[] wse5aSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse5aS
	**/
    public Wse5aS() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Wse5aS. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse5aS(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Wse5aS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse5aSFld1(CONSTANTS.SPACE_30);
         setWse5aSFld2(CONSTANTS.SPACE_30);
   }


}
  
