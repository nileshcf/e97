package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse29aS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse29aS extends Wse29aSSerialized { 
   

						@Getter @Setter private char[] wse29aSFld1 = Field.fillLowValue(30);

						@Getter @Setter private char[] wse29aSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse29aS
	**/
    public Wse29aS() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Wse29aS. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse29aS(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Wse29aS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse29aSFld1(CONSTANTS.SPACE_30);
         setWse29aSFld2(CONSTANTS.SPACE_30);
   }


}
  
