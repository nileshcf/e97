package com.cloudframe.app.ip088030.file.records;

/**
*  The class Sys201RecordPart2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sys201RecordPart2 extends Sys201RecordPart2Serialized { 
   

						@Getter @Setter private char[] sys201Maid = Field.fillLowValue(6);
	
	/**
	* Constructor for Sys201RecordPart2
	**/
    public Sys201RecordPart2() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sys201RecordPart2. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sys201RecordPart2(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
