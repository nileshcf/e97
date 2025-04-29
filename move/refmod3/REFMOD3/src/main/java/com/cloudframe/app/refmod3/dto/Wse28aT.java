package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse28aT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse28aT extends Wse28aTSerialized { 
   

						@Getter @Setter private char[] wse28aTFld1 = Field.fillLowValue(30);

						@Getter @Setter private char[] wse28aTFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse28aT
	**/
    public Wse28aT() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Wse28aT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse28aT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Wse28aT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse28aTFld1(CONSTANTS.SPACE_30);
         setWse28aTFld2(CONSTANTS.SPACE_30);
   }


}
  
