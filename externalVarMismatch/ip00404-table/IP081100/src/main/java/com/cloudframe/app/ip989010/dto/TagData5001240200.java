package com.cloudframe.app.ip989010.dto;

/**
*  The class TagData5001240200 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class TagData5001240200 extends TagData5001240200Serialized { 
   

								@Getter @Setter private int tagLen5001240200;

						@Getter @Setter private char[] tagValue5001240200 = Field.fillLowValue(999);
	
	/**
	* Constructor for TagData5001240200
	**/
    public TagData5001240200() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for TagData5001240200. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TagData5001240200(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
