package com.cloudframe.app.o529351u.dto;

/**
*  The class SceKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SceKey extends SceKeySerialized { 
   

						@Getter @Setter private char[] sceServiceCode = Field.fillLowValue(6);
	
	/**
	* Constructor for SceKey
	**/
    public SceKey() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SceKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SceKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
