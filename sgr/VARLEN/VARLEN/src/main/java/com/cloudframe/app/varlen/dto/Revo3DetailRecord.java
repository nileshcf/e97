package com.cloudframe.app.varlen.dto;

/**
*  The class Revo3DetailRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:40. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Revo3DetailRecord extends Revo3DetailRecordSerialized { 
   

	
	/**
	* Constructor for Revo3DetailRecord
	**/
    public Revo3DetailRecord() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Revo3DetailRecord. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Revo3DetailRecord(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
