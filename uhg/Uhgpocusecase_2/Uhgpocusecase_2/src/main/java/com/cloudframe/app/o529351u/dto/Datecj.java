package com.cloudframe.app.o529351u.dto;

/**
*  The class Datecj is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:58. using version 5.0.0.256
**/


import com.cloudframe.app.o529351u.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Datecj extends DatecjSerialized { 
   


	
	/**
	* Constructor for Datecj
	**/
    public Datecj() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Datecj. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Datecj(Field parent,int begin) {
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


	
	
	

		public static int getDatecjFieldLength() {
			return DATECJ_LENGTH;
		}

}
  
