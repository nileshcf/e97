package com.cloudframe.app.ar640010.dto;

/**
*  The class LogEntry570 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class LogEntry570 extends LogEntry570Serialized { 
   

						@Getter @Setter private char[] logMessage570 = new char[115];
	
	/**
	* Constructor for LogEntry570
	**/
    public LogEntry570() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for LogEntry570. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public LogEntry570(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setLogMessage570(pad(115," ".toCharArray(),' ',RIGHT_PAD));
    } 



}
  
