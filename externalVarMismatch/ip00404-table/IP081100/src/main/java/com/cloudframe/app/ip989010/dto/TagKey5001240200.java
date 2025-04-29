package com.cloudframe.app.ip989010.dto;

/**
*  The class TagKey5001240200 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class TagKey5001240200 extends TagKey5001240200Serialized { 
   

						@Getter @Setter private char[] tagType5001240200 = Field.fillLowValue(1);

								@Getter @Setter private int tagNum5001240200;

								@Getter @Setter private int tagSubfldNo5001240200;

								@Getter @Setter private int tagOccur5001240200;
	
	/**
	* Constructor for TagKey5001240200
	**/
    public TagKey5001240200() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for TagKey5001240200. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TagKey5001240200(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
