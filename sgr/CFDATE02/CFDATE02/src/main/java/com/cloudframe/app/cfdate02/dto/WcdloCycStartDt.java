package com.cloudframe.app.cfdate02.dto;

/**
*  The class WcdloCycStartDt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.cfdate02.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WcdloCycStartDt extends WcdloCycStartDtSerialized { 
   


	
	/**
	* Constructor for WcdloCycStartDt
	**/
    public WcdloCycStartDt() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WcdloCycStartDt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcdloCycStartDt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             ("/").toCharArray()
             , getStartOffset() + 2
             ,1
             );
       replaceValue( // serialize and save the value
             ("/").toCharArray()
             , getStartOffset() + 5
             ,1
             );
    } 


	
	
	

		public static int getWcdloCycStartDtFieldLength() {
			return WCDLO_CYC_START_DT_LENGTH;
		}

}
  
