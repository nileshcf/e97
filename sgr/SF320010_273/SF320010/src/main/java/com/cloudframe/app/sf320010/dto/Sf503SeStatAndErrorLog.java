package com.cloudframe.app.sf320010.dto;

/**
*  The class Sf503SeStatAndErrorLog is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf503SeStatAndErrorLog extends Sf503SeStatAndErrorLogSerialized { 
   

	
	/**
	* Constructor for Sf503SeStatAndErrorLog
	**/
    public Sf503SeStatAndErrorLog() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf503SeStatAndErrorLog. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503SeStatAndErrorLog(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    


	
	
	

		public static int getSf503SeStatAndErrorLogFieldLength() {
			return SF_503_SE_STAT_AND_ERROR_LOG_LENGTH;
		}

}
  
