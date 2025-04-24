package com.cloudframe.app.dbissues.dto;

/**
*  The class F01iIzdattab is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:45. using version 5.0.0.254
**/


import com.cloudframe.app.dbissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class F01iIzdattab extends F01iIzdattabSerialized { 
   

	
	/**
	* Constructor for F01iIzdattab
	**/
    public F01iIzdattab() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for F01iIzdattab. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public F01iIzdattab(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    


	
	
	

		public static int getF01iIzdattabFieldLength() {
			return F_01I_IZDATTAB_LENGTH;
		}

}
  
