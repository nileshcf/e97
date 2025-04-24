package com.cloudframe.app.sf320010.dto;

/**
*  The class Sf503EdcLogArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:45. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf503EdcLogArea extends Sf503EdcLogAreaSerialized { 
   

	
	/**
	* Constructor for Sf503EdcLogArea
	**/
    public Sf503EdcLogArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf503EdcLogArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503EdcLogArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    


	
	
	

		public static int getSf503EdcLogAreaFieldLength() {
			return SF_503_EDC_LOG_AREA_LENGTH;
		}

}
  
