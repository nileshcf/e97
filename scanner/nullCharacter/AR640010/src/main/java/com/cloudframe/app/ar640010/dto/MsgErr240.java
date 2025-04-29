package com.cloudframe.app.ar640010.dto;

/**
*  The class MsgErr240 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MsgErr240 extends MsgErr240Serialized { 
   

						@Getter @Setter private char[] msgErrDesc240 = Field.fillLowValue(80);
	
	/**
	* Constructor for MsgErr240
	**/
    public MsgErr240() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MsgErr240. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsgErr240(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
