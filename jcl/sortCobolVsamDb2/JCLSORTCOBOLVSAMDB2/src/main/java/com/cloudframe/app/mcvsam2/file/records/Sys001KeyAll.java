package com.cloudframe.app.mcvsam2.file.records;

/**
*  The class Sys001KeyAll is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sys001KeyAll extends Sys001KeyAllSerialized { 
   

						@Getter @Setter private char[] sys001Key = Field.fillLowValue(31);
	
	/**
	* Constructor for Sys001KeyAll
	**/
    public Sys001KeyAll() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sys001KeyAll. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sys001KeyAll(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
