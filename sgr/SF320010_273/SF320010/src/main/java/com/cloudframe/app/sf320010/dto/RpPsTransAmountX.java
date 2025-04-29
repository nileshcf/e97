package com.cloudframe.app.sf320010.dto;

/**
*  The class RpPsTransAmountX is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RpPsTransAmountX extends RpPsTransAmountXSerialized { 
   

								@Getter @Setter private char[] rpPsTransAmount = Field.fillLowValue(8);
	
	/**
	* Constructor for RpPsTransAmountX
	**/
    public RpPsTransAmountX() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for RpPsTransAmountX. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RpPsTransAmountX(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
