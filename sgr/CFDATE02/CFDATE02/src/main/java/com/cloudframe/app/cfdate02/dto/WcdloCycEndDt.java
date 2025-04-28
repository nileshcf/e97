package com.cloudframe.app.cfdate02.dto;

/**
*  The class WcdloCycEndDt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:05. using version 5.0.0.256
**/


import com.cloudframe.app.cfdate02.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WcdloCycEndDt extends WcdloCycEndDtSerialized { 
   


	
	/**
	* Constructor for WcdloCycEndDt
	**/
    public WcdloCycEndDt() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WcdloCycEndDt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcdloCycEndDt(Field parent,int begin) {
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


	
	
	

		public static int getWcdloCycEndDtFieldLength() {
			return WCDLO_CYC_END_DT_LENGTH;
		}

}
  
