package com.cloudframe.app.callfd01.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:34. using version 5.0.0.254
**/


import com.cloudframe.app.callfd01.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

						private char[] callfd0201 = new char[8];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setCallfd0201(("CALLFD02").toCharArray());
    }


 

	/**
	 *	Returns the value of callfd0201
	 *	@return callfd0201
	 */
   public char[] getCallfd0201() throws CFException{
   		return callfd0201;
   }

  
	/**
	*  set variable callfd0201
	*  Corresponding COBOL Variable is WS-CALLFD02
	*  @param value
	**/
   public void setCallfd0201(char[] value) {
       value = checkCallfd0201Constraints(value);
       arraycopy(value,0,callfd0201,0,value.length);
   } 
	public void setCallfd0201(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,callfd0201,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
