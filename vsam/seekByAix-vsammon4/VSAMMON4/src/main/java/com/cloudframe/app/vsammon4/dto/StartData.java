package com.cloudframe.app.vsammon4.dto;

/**
*  The class StartData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class StartData extends StartDataSerialized { 
   

						@Getter @Setter private char[] sOperation = Field.fillLowValue(2);

								@Getter @Setter private long sKey;
	
	/**
	* Constructor for StartData
	**/
    public StartData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for StartData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public StartData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
