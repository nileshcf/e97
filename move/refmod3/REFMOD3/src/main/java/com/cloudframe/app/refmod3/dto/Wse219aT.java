package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse219aT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse219aT extends Wse219aTSerialized { 
   

						@Getter @Setter private char[] wse219aTFld1 = Field.fillLowValue(30);

						@Getter @Setter private char[] wse219aTFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse219aT
	**/
    public Wse219aT() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Wse219aT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse219aT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Wse219aT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse219aTFld1(CONSTANTS.SPACE_30);
         setWse219aTFld2(CONSTANTS.SPACE_30);
   }


}
  
