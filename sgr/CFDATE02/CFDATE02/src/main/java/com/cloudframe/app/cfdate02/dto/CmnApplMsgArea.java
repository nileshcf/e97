package com.cloudframe.app.cfdate02.dto;

/**
*  The class CmnApplMsgArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/


import com.cloudframe.app.cfdate02.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnApplMsgArea extends CmnApplMsgAreaSerialized { 
   

	
	/**
	* Constructor for CmnApplMsgArea
	**/
    public CmnApplMsgArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnApplMsgArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnApplMsgArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    


	
	
	

		public static int getCmnApplMsgAreaFieldLength() {
			return CMN_APPL_MSG_AREA_LENGTH;
		}

}
  
