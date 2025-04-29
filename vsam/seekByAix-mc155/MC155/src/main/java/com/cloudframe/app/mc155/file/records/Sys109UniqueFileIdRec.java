package com.cloudframe.app.mc155.file.records;

/**
*  The class Sys109UniqueFileIdRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sys109UniqueFileIdRec extends Sys109UniqueFileIdRecSerialized { 
   

						@Getter @Setter private char[] sys109FileIdKey = Field.fillLowValue(21);
	
	/**
	* Constructor for Sys109UniqueFileIdRec
	**/
    public Sys109UniqueFileIdRec() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sys109UniqueFileIdRec. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sys109UniqueFileIdRec(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
