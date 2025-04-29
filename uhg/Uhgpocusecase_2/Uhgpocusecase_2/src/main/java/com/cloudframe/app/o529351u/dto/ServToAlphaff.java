package com.cloudframe.app.o529351u.dto;

/**
*  The class ServToAlphaff is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ServToAlphaff extends ServToAlphaffSerialized { 
   

						@Getter @Setter private char[] feSvc1afFr = Field.fillLowValue(1);

						@Getter @Setter private char[] feSvc25afFr = Field.fillLowValue(4);
	
	/**
	* Constructor for ServToAlphaff
	**/
    public ServToAlphaff() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ServToAlphaff. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ServToAlphaff(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
