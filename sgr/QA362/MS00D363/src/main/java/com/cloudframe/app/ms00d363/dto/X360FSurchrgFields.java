package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360FSurchrgFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class X360FSurchrgFields extends X360FSurchrgFieldsSerialized { 
   

								private int x360FSurchrgFreeCnt;
	
	/**
	* Constructor for X360FSurchrgFields
	**/
    public X360FSurchrgFields() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for X360FSurchrgFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FSurchrgFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	public int getX360FSurchrgFreeCnt() throws CFException {
        if (isX360FSurchrgFreeCntModified()) { 
           x360FSurchrgFreeCnt = refreshX360FSurchrgFreeCnt();
        }
   		return x360FSurchrgFreeCnt;
	}
	
	/**
	 * 	Update X360FSurchrgFreeCnt with the passed value
	 *  Corresponding COBOL Variable is X360-F-SURCHRG-FREE-CNT
	 *	@param number
	 */
	public void setX360FSurchrgFreeCnt(int number) {
			x360FSurchrgFreeCnt = checkX360FSurchrgFreeCntMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FSurchrgFreeCnt(x360FSurchrgFreeCnt);
	}


	public void setX360FSurchrgFreeCnt(long number) {
	    number = checkX360FSurchrgFreeCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FSurchrgFreeCnt((int)number);
	}
	

	
	
	

		public static int getX360FSurchrgFieldsFieldLength() {
			return X_360_FSURCHRG_FIELDS_LENGTH;
		}

}
  
