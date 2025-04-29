package com.cloudframe.app.vsammon7.dto;

/**
*  The class MethodData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MethodData extends MethodDataSerialized { 
   

						@Getter @Setter private char[] iMethod = Field.fillLowValue(35);
	
	/**
	* Constructor for MethodData
	**/
    public MethodData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MethodData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MethodData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
