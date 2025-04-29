package com.cloudframe.app.vsammon1.dto;

/**
*  The class ProgramData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:31. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ProgramData extends ProgramDataSerialized { 
   

						@Getter @Setter private char[] iProgram = Field.fillLowValue(8);
	
	/**
	* Constructor for ProgramData
	**/
    public ProgramData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ProgramData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ProgramData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
