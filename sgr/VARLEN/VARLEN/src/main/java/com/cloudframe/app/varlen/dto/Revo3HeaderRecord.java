package com.cloudframe.app.varlen.dto;

/**
*  The class Revo3HeaderRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:40. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Revo3HeaderRecord extends Revo3HeaderRecordSerialized { 
   

	
	/**
	* Constructor for Revo3HeaderRecord
	**/
    public Revo3HeaderRecord() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Revo3HeaderRecord. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Revo3HeaderRecord(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
