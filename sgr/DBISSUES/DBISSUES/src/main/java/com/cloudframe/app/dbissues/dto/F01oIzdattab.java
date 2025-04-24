package com.cloudframe.app.dbissues.dto;

/**
*  The class F01oIzdattab is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:45. using version 5.0.0.254
**/


import com.cloudframe.app.dbissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class F01oIzdattab extends F01oIzdattabSerialized { 
   

	
	/**
	* Constructor for F01oIzdattab
	**/
    public F01oIzdattab() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for F01oIzdattab. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public F01oIzdattab(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    


	
	
	

		public static int getF01oIzdattabFieldLength() {
			return F_01O_IZDATTAB_LENGTH;
		}

}
  
