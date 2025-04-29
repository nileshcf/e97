package com.cloudframe.app.dispif.dto;

/**
*  The class LongX is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:27. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class LongX extends LongXSerialized { 
   

						@Getter @Setter private char[] longX2 = Field.fillLowValue(4);
	
	/**
	* Constructor for LongX
	**/
    public LongX() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for LongX. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public LongX(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
