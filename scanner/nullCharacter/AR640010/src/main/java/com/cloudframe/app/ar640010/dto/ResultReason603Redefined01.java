package com.cloudframe.app.ar640010.dto;

/**
*  The class ResultReason603Redefined01 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ResultReason603Redefined01 extends ResultReason603Redefined01Serialized { 
   

						@Getter @Setter private char[] resultApplExit603 = Field.fillLowValue(8);
	
	/**
	* Constructor for ResultReason603Redefined01
	**/
    public ResultReason603Redefined01() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ResultReason603Redefined01. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ResultReason603Redefined01(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
