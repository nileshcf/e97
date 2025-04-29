package com.cloudframe.app.ip650010.file.records;

/**
*  The class Sys007TableKeyAll is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sys007TableKeyAll extends Sys007TableKeyAllSerialized { 
   

						@Getter @Setter private char[] sys007TableKey = Field.fillLowValue(18);
	
	/**
	* Constructor for Sys007TableKeyAll
	**/
    public Sys007TableKeyAll() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sys007TableKeyAll. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sys007TableKeyAll(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
