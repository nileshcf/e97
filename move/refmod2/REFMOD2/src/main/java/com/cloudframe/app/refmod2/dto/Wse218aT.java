package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse218aT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse218aT extends Wse218aTSerialized { 
   

						@Getter @Setter private char[] wse218aTFld1 = Field.fillLowValue(30);

						@Getter @Setter private char[] wse218aTFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse218aT
	**/
    public Wse218aT() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Wse218aT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse218aT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Wse218aT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse218aTFld1(CONSTANTS.SPACE_30);
         setWse218aTFld2(CONSTANTS.SPACE_30);
   }


}
  
