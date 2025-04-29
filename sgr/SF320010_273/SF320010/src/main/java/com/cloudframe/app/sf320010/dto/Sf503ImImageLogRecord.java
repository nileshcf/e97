package com.cloudframe.app.sf320010.dto;

/**
*  The class Sf503ImImageLogRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:37. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf503ImImageLogRecord extends Sf503ImImageLogRecordSerialized { 
   

	
	/**
	* Constructor for Sf503ImImageLogRecord
	**/
    public Sf503ImImageLogRecord() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf503ImImageLogRecord. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503ImImageLogRecord(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    


	
	
	

		public static int getSf503ImImageLogRecordFieldLength() {
			return SF_503_IM_IMAGE_LOG_RECORD_LENGTH;
		}

}
  
