package com.cloudframe.app.sf320010.dto;

/**
*  The class Sf503X92ActivityLog is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sf503X92ActivityLog extends Sf503X92ActivityLogSerialized { 
   

						@Getter @Setter private char[] sf503X92RecordType = Field.fillLowValue(2);
	
	/**
	* Constructor for Sf503X92ActivityLog
	**/
    public Sf503X92ActivityLog() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sf503X92ActivityLog. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503X92ActivityLog(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
