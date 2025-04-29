package com.cloudframe.app.ip989010.dto;

/**
*  The class TagData5001644695 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class TagData5001644695 extends TagData5001644695Serialized { 
   

								@Getter @Setter private int tagLen5001644695;

						@Getter @Setter private char[] tagValue5001644695 = Field.fillLowValue(999);
	
	/**
	* Constructor for TagData5001644695
	**/
    public TagData5001644695() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for TagData5001644695. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TagData5001644695(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
