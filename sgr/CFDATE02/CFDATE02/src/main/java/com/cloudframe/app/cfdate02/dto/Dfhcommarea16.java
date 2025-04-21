package com.cloudframe.app.cfdate02.dto;

/**
*  The class Dfhcommarea16 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/


import com.cloudframe.app.cfdate02.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Dfhcommarea16 extends Dfhcommarea16Serialized { 
   

	
	/**
	* Constructor for Dfhcommarea16
	**/
    public Dfhcommarea16() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Dfhcommarea16. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dfhcommarea16(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    


	
	
	

		public static int getDfhcommarea16FieldLength() {
			return DFHCOMMAREA_16_LENGTH;
		}

}
  
