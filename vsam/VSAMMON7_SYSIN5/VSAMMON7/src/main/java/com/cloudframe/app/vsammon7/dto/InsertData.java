package com.cloudframe.app.vsammon7.dto;

/**
*  The class InsertData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class InsertData extends InsertDataSerialized { 
   

						@Getter @Setter private char[] iInsertKey = Field.fillLowValue(65);
	
	/**
	* Constructor for InsertData
	**/
    public InsertData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for InsertData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public InsertData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
