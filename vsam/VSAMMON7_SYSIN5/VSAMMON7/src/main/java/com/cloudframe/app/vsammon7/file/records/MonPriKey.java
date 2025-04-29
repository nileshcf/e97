package com.cloudframe.app.vsammon7.file.records;

/**
*  The class MonPriKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MonPriKey extends MonPriKeySerialized { 
   

						@Getter @Setter private char[] monXcdtProgNm = Field.fillLowValue(8);
	
	/**
	* Constructor for MonPriKey
	**/
    public MonPriKey() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MonPriKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MonPriKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
