package com.cloudframe.app.db2funci.dto;

/**
*  The class Loc1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:17. using version 5.0.0.257
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Loc1 extends Loc1Serialized { 
   
	
	/**
	* Constructor for Loc1
	**/
    public Loc1() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Loc1. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Loc1(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    


	
	
	

		public static int getLoc1FieldLength() {
			return LOC_1_LENGTH;
		}

}
  
