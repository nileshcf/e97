package com.cloudframe.app.mc155.file.records;

/**
*  The class Sys109UniqueFileIdRec1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sys109UniqueFileIdRec1 extends Sys109UniqueFileIdRec1Serialized { 
   

						@Getter @Setter private char[] sys109ProcessSeqnoKey = Field.fillLowValue(13);
	
	/**
	* Constructor for Sys109UniqueFileIdRec1
	**/
    public Sys109UniqueFileIdRec1() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sys109UniqueFileIdRec1. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sys109UniqueFileIdRec1(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
