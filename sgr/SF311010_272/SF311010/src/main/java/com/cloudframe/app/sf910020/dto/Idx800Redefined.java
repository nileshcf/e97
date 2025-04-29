package com.cloudframe.app.sf910020.dto;

/**
*  The class Idx800Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Idx800Redefined extends Idx800RedefinedSerialized { 
   

						@Getter @Setter private char[] idxX800 = Field.fillLowValue(1);
	
	/**
	* Constructor for Idx800Redefined
	**/
    public Idx800Redefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Idx800Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Idx800Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
