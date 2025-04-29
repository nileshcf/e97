package com.cloudframe.app.sf320010.dto;

/**
*  The class MsgPos216X is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MsgPos216X extends MsgPos216XSerialized { 
   

						@Getter @Setter private char[] msgPos25 = Field.fillLowValue(4);
	
	/**
	* Constructor for MsgPos216X
	**/
    public MsgPos216X() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MsgPos216X. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsgPos216X(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
