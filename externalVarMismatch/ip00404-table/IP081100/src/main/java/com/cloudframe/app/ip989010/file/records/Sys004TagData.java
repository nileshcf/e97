package com.cloudframe.app.ip989010.file.records;

/**
*  The class Sys004TagData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sys004TagData extends Sys004TagDataSerialized { 
   

								@Getter @Setter private int sys004TagLen;

						@Getter @Setter private char[] sys004TagValue = Field.fillLowValue(57);
	
	/**
	* Constructor for Sys004TagData
	**/
    public Sys004TagData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sys004TagData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sys004TagData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
