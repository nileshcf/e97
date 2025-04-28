package com.cloudframe.app.ar640010.dto;

/**
*  The class XtkDefaultMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:11. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class XtkDefaultMsg600 extends XtkDefaultMsg600Serialized { 
   


	
	/**
	* Constructor for XtkDefaultMsg600
	**/
    public XtkDefaultMsg600() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for XtkDefaultMsg600. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public XtkDefaultMsg600(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             ("1700-XTK PROCESS:").toCharArray()
             , getStartOffset() + 0
             ,17
             );
       replaceValue( // serialize and save the value
             ("DEFAULT CONFIG VALUES BEING ASSIGNED    ").toCharArray()
             , getStartOffset() + 17
             ,40
             );
    } 


	
	
	

		public static int getXtkDefaultMsg600FieldLength() {
			return XTK_DEFAULT_MSG_600_LENGTH;
		}

}
  
