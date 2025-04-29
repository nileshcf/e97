package com.cloudframe.app.callfd02.dto;

/**
*  The class InputKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class InputKey extends InputKeySerialized { 
   

						@Getter @Setter private char[] ioType = Field.fillLowValue(2);


								@Getter @Setter private long inputSeq;
	
	/**
	* Constructor for InputKey
	**/
    public InputKey() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for InputKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public InputKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
