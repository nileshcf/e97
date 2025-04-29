package com.cloudframe.app.blkdblk.dto;

/**
*  The class AsciiBytes is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:44. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class AsciiBytes extends AsciiBytesSerialized { 
   

						@Getter @Setter private char[] nullByte = Field.fillLowValue(1);

						@Getter @Setter private char[] asciiChar = Field.fillLowValue(1);
	
	/**
	* Constructor for AsciiBytes
	**/
    public AsciiBytes() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for AsciiBytes. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AsciiBytes(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
