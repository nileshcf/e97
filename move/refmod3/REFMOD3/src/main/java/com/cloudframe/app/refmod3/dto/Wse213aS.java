package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse213aS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse213aS extends Wse213aSSerialized { 
   

						@Getter @Setter private char[] wse213aSFld1 = Field.fillLowValue(30);

						@Getter @Setter private char[] wse213aSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse213aS
	**/
    public Wse213aS() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Wse213aS. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse213aS(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Wse213aS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse213aSFld1(CONSTANTS.SPACE_30);
         setWse213aSFld2(CONSTANTS.SPACE_30);
   }


}
  
