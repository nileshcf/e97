package com.cloudframe.app.ms00d363.dto;

/**
*  The class CurrDescBat is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CurrDescBat extends CurrDescBatSerialized { 
   

						@Getter @Setter private char[] swchCerDescription = Field.fillLowValue(30);
	
	/**
	* Constructor for CurrDescBat
	**/
    public CurrDescBat() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CurrDescBat. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CurrDescBat(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
