package com.cloudframe.app.si994010.dto;

/**
*  The class Idx400Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Idx400Redefined extends Idx400RedefinedSerialized { 
   

						@Getter @Setter private char[] idxX400 = Field.fillLowValue(1);
	
	/**
	* Constructor for Idx400Redefined
	**/
    public Idx400Redefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Idx400Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Idx400Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
