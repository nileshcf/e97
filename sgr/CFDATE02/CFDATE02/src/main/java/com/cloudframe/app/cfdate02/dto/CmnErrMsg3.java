package com.cloudframe.app.cfdate02.dto;

/**
*  The class CmnErrMsg3 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:10. using version 5.0.0.254
**/


import com.cloudframe.app.cfdate02.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnErrMsg3 extends CmnErrMsg3Serialized { 
   



	
	/**
	* Constructor for CmnErrMsg3
	**/
    public CmnErrMsg3() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnErrMsg3. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnErrMsg3(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             ("*  ").toCharArray()
             , getStartOffset() + 0
             ,3
             );
       replaceValue( // serialize and save the value
             ("ERROR FIELD ===>  ").toCharArray()
             , getStartOffset() + 3
             ,18
             );
       replaceValue( // serialize and save the value
             ("*").toCharArray()
             , getStartOffset() + 79
             ,1
             );
    } 


	
	
	

		public static int getCmnErrMsg3FieldLength() {
			return CMN_ERR_MSG_3_LENGTH;
		}

}
  
