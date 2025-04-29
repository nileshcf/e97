package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse215bS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse215bS extends Wse215bSSerialized { 
   

						@Getter @Setter private char[] wse215bSFld1 = Field.fillLowValue(30);

						@Getter @Setter private char[] wse215bSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse215bS
	**/
    public Wse215bS() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Wse215bS. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse215bS(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Wse215bS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse215bSFld1(CONSTANTS.SPACE_30);
         setWse215bSFld2(CONSTANTS.SPACE_30);
   }


}
  
