package com.cloudframe.app.ip202330.dto;

/**
*  The class ErrorText600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ErrorText600 extends ErrorText600Serialized { 
   


								@Getter @Setter private short errorFieldNumber600;
	
	/**
	* Constructor for ErrorText600
	**/
    public ErrorText600() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ErrorText600. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ErrorText600(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             ("NO VALID ATTRIBUTE FOR ").toCharArray()
             , getStartOffset() + 0
             ,23
             );
								setErrorFieldNumber600((short)0);
    } 



}
  
