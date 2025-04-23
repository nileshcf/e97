package com.cloudframe.app.cfdate02.file.records;

/**
*  The class RlatdTlr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RlatdTlr extends RlatdTlrSerialized { 
   

	
	/**
	* Constructor for RlatdTlr
	**/
    public RlatdTlr() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for RlatdTlr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlatdTlr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    


	
	
	

		public static int getRlatdTlrFieldLength() {
			return RLATD_TLR_LENGTH;
		}

}
  
