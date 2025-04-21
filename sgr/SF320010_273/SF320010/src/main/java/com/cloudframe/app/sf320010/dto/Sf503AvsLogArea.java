package com.cloudframe.app.sf320010.dto;

/**
*  The class Sf503AvsLogArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf503AvsLogArea extends Sf503AvsLogAreaSerialized { 
   

	
	/**
	* Constructor for Sf503AvsLogArea
	**/
    public Sf503AvsLogArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf503AvsLogArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503AvsLogArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    


	
	
	

		public static int getSf503AvsLogAreaFieldLength() {
			return SF_503_AVS_LOG_AREA_LENGTH;
		}

}
  
