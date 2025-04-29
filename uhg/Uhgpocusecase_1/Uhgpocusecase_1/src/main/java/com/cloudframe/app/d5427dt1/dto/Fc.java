package com.cloudframe.app.d5427dt1.dto;

/**
*  The class Fc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Fc extends FcSerialized { 
   

						@Getter @Setter private char[] conditionTokenValue = Field.fillLowValue(8);
	
	/**
	* Constructor for Fc
	**/
    public Fc() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Fc. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Fc(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
