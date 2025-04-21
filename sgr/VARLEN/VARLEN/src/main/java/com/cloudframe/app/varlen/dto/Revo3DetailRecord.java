package com.cloudframe.app.varlen.dto;

/**
*  The class Revo3DetailRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:10. using version 5.0.0.256
**/


import com.cloudframe.app.varlen.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


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
    


	
	
	

		public static int getRevo3DetailRecordFieldLength() {
			return REVO_3_DETAIL_RECORD_LENGTH;
		}

}
  
