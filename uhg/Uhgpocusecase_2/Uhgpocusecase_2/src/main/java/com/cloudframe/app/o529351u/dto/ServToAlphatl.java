package com.cloudframe.app.o529351u.dto;

/**
*  The class ServToAlphatl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ServToAlphatl extends ServToAlphatlSerialized { 
   

						@Getter @Setter private char[] feSvc14alTo = Field.fillLowValue(4);

						@Getter @Setter private char[] feSvc5alTo = Field.fillLowValue(1);
	
	/**
	* Constructor for ServToAlphatl
	**/
    public ServToAlphatl() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ServToAlphatl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ServToAlphatl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
