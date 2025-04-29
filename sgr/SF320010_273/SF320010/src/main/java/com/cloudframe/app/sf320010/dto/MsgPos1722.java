package com.cloudframe.app.sf320010.dto;

/**
*  The class MsgPos1722 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MsgPos1722 extends MsgPos1722Serialized { 
   

						@Getter @Setter private char[] msgPos17 = Field.fillLowValue(1);
	
	/**
	* Constructor for MsgPos1722
	**/
    public MsgPos1722() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MsgPos1722. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsgPos1722(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
