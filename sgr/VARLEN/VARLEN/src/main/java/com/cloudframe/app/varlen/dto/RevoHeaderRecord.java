package com.cloudframe.app.varlen.dto;

/**
*  The class RevoHeaderRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:05. using version 5.0.0.256
**/


import com.cloudframe.app.varlen.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


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
    


	
	
	

		public static int getRevoHeaderRecordFieldLength() {
			return REVO_HEADER_RECORD_LENGTH;
		}

}
  
