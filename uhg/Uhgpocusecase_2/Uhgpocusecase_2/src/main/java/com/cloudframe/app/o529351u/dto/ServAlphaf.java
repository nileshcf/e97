package com.cloudframe.app.o529351u.dto;

/**
*  The class ServAlphaf is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ServAlphaf extends ServAlphafSerialized { 
   

						@Getter @Setter private char[] svc1af = Field.fillLowValue(1);

						@Getter @Setter private char[] svc25af = Field.fillLowValue(4);
	
	/**
	* Constructor for ServAlphaf
	**/
    public ServAlphaf() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ServAlphaf. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ServAlphaf(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
