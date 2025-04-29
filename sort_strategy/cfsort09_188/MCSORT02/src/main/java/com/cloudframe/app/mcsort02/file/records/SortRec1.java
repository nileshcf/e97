package com.cloudframe.app.mcsort02.file.records;

/**
*  The class SortRec1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SortRec1 extends SortRec1Serialized { 
   

						@Getter @Setter private char[] sortTableId = Field.fillLowValue(8);

						@Getter @Setter private char[] sortTableEffDate = Field.fillLowValue(10);

						@Getter @Setter private char[] sortTableKeyData = Field.fillLowValue(99);
	
	/**
	* Constructor for SortRec1
	**/
    public SortRec1() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SortRec1. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SortRec1(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
