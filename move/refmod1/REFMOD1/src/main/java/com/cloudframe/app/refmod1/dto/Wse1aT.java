package com.cloudframe.app.refmod1.dto;

/**
*  The class Wse1aT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse1aT extends Wse1aTSerialized { 
   

						@Getter @Setter private char[] wse1aTFld1 = Field.fillLowValue(20);

						@Getter @Setter private char[] wse1aTFld2 = Field.fillLowValue(40);
	
	/**
	* Constructor for Wse1aT
	**/
    public Wse1aT() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Wse1aT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse1aT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Wse1aT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse1aTFld1(CONSTANTS.SPACE_20);
         setWse1aTFld2(CONSTANTS.SPACE_40);
   }


}
  
