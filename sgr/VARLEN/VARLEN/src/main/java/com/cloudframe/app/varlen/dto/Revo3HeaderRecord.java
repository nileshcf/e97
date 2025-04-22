package com.cloudframe.app.varlen.dto;

/**
*  The class Revo3HeaderRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/


import com.cloudframe.app.varlen.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


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
    


	
	
	

		public static int getRevo3HeaderRecordFieldLength() {
			return REVO_3_HEADER_RECORD_LENGTH;
		}

}
  
