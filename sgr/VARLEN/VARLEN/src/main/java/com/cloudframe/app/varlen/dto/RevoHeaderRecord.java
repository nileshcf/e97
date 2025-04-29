package com.cloudframe.app.varlen.dto;

/**
*  The class RevoHeaderRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:40. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RevoHeaderRecord extends RevoHeaderRecordSerialized { 
   

	
	/**
	* Constructor for RevoHeaderRecord
	**/
    public RevoHeaderRecord() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for RevoHeaderRecord. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RevoHeaderRecord(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
