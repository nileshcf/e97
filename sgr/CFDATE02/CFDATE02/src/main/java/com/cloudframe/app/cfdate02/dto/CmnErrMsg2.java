package com.cloudframe.app.cfdate02.dto;

/**
*  The class CmnErrMsg2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/


import com.cloudframe.app.cfdate02.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnErrMsg2 extends CmnErrMsg2Serialized { 
   





	
	/**
	* Constructor for CmnErrMsg2
	**/
    public CmnErrMsg2() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnErrMsg2. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnErrMsg2(Field parent,int begin) {
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
             ("ERROR HAPPENED IN ").toCharArray()
             , getStartOffset() + 3
             ,18
             );
       replaceValue( // serialize and save the value
             ("(PARAGRAPH: ").toCharArray()
             , getStartOffset() + 30
             ,12
             );
       replaceValue( // serialize and save the value
             (") WHILE ATTEMPTING ").toCharArray()
             , getStartOffset() + 46
             ,19
             );
       replaceValue( // serialize and save the value
             ("*").toCharArray()
             , getStartOffset() + 79
             ,1
             );
    } 


	
	
	

		public static int getCmnErrMsg2FieldLength() {
			return CMN_ERR_MSG_2_LENGTH;
		}

}
  
