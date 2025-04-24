package com.cloudframe.app.cfdate02.dto;

/**
*  The class CmnPrtErrHdr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:43. using version 5.0.0.254
**/


import com.cloudframe.app.cfdate02.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnPrtErrHdr extends CmnPrtErrHdrSerialized { 
   


	
	/**
	* Constructor for CmnPrtErrHdr
	**/
    public CmnPrtErrHdr() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnPrtErrHdr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnPrtErrHdr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             ("   ** ").toCharArray()
             , getStartOffset() + 0
             ,6
             );
       replaceValue( // serialize and save the value
             ("**  ").toCharArray()
             , getStartOffset() + 12
             ,4
             );
    } 


	
	
	

		public static int getCmnPrtErrHdrFieldLength() {
			return CMN_PRT_ERR_HDR_LENGTH;
		}

}
  
