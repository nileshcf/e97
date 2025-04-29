package com.cloudframe.app.dispif.dto;

/**
*  The class IntX is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:27. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class IntX extends IntXSerialized { 
   

						@Getter @Setter private char[] intX2 = Field.fillLowValue(2);
	
	/**
	* Constructor for IntX
	**/
    public IntX() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for IntX. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IntX(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
