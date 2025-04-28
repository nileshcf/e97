package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360ASurchrgFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class X360ASurchrgFields extends X360ASurchrgFieldsSerialized { 
   

								private int x360ASurchrgFreeCnt;
	
	/**
	* Constructor for X360ASurchrgFields
	**/
    public X360ASurchrgFields() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for X360ASurchrgFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360ASurchrgFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	public int getX360ASurchrgFreeCnt() throws CFException {
        if (isX360ASurchrgFreeCntModified()) { 
           x360ASurchrgFreeCnt = refreshX360ASurchrgFreeCnt();
        }
   		return x360ASurchrgFreeCnt;
	}
	
	/**
	 * 	Update X360ASurchrgFreeCnt with the passed value
	 *  Corresponding COBOL Variable is X360-A-SURCHRG-FREE-CNT
	 *	@param number
	 */
	public void setX360ASurchrgFreeCnt(int number) {
			x360ASurchrgFreeCnt = checkX360ASurchrgFreeCntMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360ASurchrgFreeCnt(x360ASurchrgFreeCnt);
	}


	public void setX360ASurchrgFreeCnt(long number) {
	    number = checkX360ASurchrgFreeCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360ASurchrgFreeCnt((int)number);
	}
	

	
	
	

		public static int getX360ASurchrgFieldsFieldLength() {
			return X_360_ASURCHRG_FIELDS_LENGTH;
		}

}
  
