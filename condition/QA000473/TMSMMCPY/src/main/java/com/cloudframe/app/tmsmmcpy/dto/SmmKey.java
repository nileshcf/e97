package com.cloudframe.app.tmsmmcpy.dto;

/**
*  The class SmmKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SmmKey extends SmmKeySerialized { 
   

						@Getter @Setter private char[] smmDdrKey = Field.fillLowValue(10);

						@Getter @Setter private char[] smmBatchKey = Field.fillLowValue(10);

						@Getter @Setter private char[] smmExtCapXptId = Field.fillLowValue(16);

						@Getter @Setter private char[] smmDataserverId = Field.fillLowValue(4);

						@Getter @Setter private char[] smmField3 = Field.fillLowValue(30);

						@Getter @Setter private char[] smmField1 = Field.fillLowValue(30);
	
	/**
	* Constructor for SmmKey
	**/
    public SmmKey() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SmmKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SmmKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
