package com.cloudframe.app.cfdate02.file.records;

/**
*  The class RlatuTlr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:10. using version 5.0.0.254
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RlatuTlr extends RlatuTlrSerialized { 
   

	
	/**
	* Constructor for RlatuTlr
	**/
    public RlatuTlr() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for RlatuTlr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlatuTlr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    


	
	
	

		public static int getRlatuTlrFieldLength() {
			return RLATU_TLR_LENGTH;
		}

}
  
