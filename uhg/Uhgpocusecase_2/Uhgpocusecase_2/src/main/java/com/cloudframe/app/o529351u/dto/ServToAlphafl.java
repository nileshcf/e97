package com.cloudframe.app.o529351u.dto;

/**
*  The class ServToAlphafl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ServToAlphafl extends ServToAlphaflSerialized { 
   

						@Getter @Setter private char[] feSvc14alFr = Field.fillLowValue(4);

						@Getter @Setter private char[] feSvc5alFr = Field.fillLowValue(1);
	
	/**
	* Constructor for ServToAlphafl
	**/
    public ServToAlphafl() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ServToAlphafl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ServToAlphafl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
