package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse25bS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse25bS extends Wse25bSSerialized { 
   

						@Getter @Setter private char[] wse25bSFld1 = Field.fillLowValue(30);

						@Getter @Setter private char[] wse25bSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse25bS
	**/
    public Wse25bS() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Wse25bS. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse25bS(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Wse25bS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse25bSFld1(CONSTANTS.SPACE_30);
         setWse25bSFld2(CONSTANTS.SPACE_30);
   }


}
  
