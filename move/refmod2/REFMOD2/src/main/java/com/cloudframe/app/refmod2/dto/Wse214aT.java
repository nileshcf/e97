package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse214aT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse214aT extends Wse214aTSerialized { 
   

						@Getter @Setter private char[] wse214aTFld1 = Field.fillLowValue(30);

						@Getter @Setter private char[] wse214aTFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse214aT
	**/
    public Wse214aT() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Wse214aT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse214aT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Wse214aT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse214aTFld1(CONSTANTS.SPACE_30);
         setWse214aTFld2(CONSTANTS.SPACE_30);
   }


}
  
