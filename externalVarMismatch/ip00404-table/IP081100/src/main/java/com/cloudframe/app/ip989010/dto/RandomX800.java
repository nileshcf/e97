package com.cloudframe.app.ip989010.dto;

/**
*  The class RandomX800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RandomX800 extends RandomX800Serialized { 
   

						@Getter @Setter private char[] randomP4P8800 = Field.fillLowValue(5);
	
	/**
	* Constructor for RandomX800
	**/
    public RandomX800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for RandomX800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RandomX800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
