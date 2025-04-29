package com.cloudframe.app.varlen.dto;

/**
*  The class RevoTrailerRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:33. using version 5.0.0.254
**/


import com.cloudframe.app.varlen.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RevoTrailerRecord extends RevoTrailerRecordSerialized { 
   

	
	/**
	* Constructor for RevoTrailerRecord
	**/
    public RevoTrailerRecord() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for RevoTrailerRecord. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RevoTrailerRecord(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    


	
	
	

		public static int getRevoTrailerRecordFieldLength() {
			return REVO_TRAILER_RECORD_LENGTH;
		}

}
  
