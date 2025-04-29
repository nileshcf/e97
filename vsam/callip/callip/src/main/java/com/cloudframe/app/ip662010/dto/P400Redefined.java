package com.cloudframe.app.ip662010.dto;

/**
*  The class P400Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class P400Redefined extends P400RedefinedSerialized { 
   

						@Getter @Setter private char[] pX400 = Field.fillLowValue(1);
	
	/**
	* Constructor for P400Redefined
	**/
    public P400Redefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for P400Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public P400Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
