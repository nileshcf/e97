package com.cloudframe.app.o529351u.dto;

/**
*  The class SavInputProcId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:54. using version 5.0.0.256
**/


import com.cloudframe.app.o529351u.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SavInputProcId extends SavInputProcIdSerialized { 
   

	
	/**
	* Constructor for SavInputProcId
	**/
    public SavInputProcId() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SavInputProcId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SavInputProcId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    


	
	
	

		public static int getSavInputProcIdFieldLength() {
			return SAV_INPUT_PROC_ID_LENGTH;
		}

}
  
