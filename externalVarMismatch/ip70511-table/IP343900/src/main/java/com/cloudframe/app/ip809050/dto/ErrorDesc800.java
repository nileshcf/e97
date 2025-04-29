package com.cloudframe.app.ip809050.dto;

/**
*  The class ErrorDesc800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ErrorDesc800 extends ErrorDesc800Serialized { 
   

						@Getter @Setter private char[] errDesc1800 = new char[106];

						@Getter @Setter private char[] errDesc2800 = new char[100];
	
	/**
	* Constructor for ErrorDesc800
	**/
    public ErrorDesc800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ErrorDesc800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ErrorDesc800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setErrDesc1800(pad(106," ".toCharArray(),' ',RIGHT_PAD));
								setErrDesc2800(pad(100," ".toCharArray(),' ',RIGHT_PAD));
    } 



}
  
