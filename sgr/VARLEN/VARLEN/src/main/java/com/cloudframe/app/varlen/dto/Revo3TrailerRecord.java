package com.cloudframe.app.varlen.dto;

/**
*  The class Revo3TrailerRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:40. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Revo3TrailerRecord extends Revo3TrailerRecordSerialized { 
   

								@Getter @Setter private long revo3TrlrRecordCount;
	
	/**
	* Constructor for Revo3TrailerRecord
	**/
    public Revo3TrailerRecord() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Revo3TrailerRecord. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Revo3TrailerRecord(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
