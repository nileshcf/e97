package com.cloudframe.app.wm001.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/


import com.cloudframe.app.wm001.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized { 
   

						private char[] callProg = new char[8];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setCallProg(("WM002   ").toCharArray());
    }


 

	/**
	 *	Returns the value of callProg
	 *	@return callProg
	 */
   public char[] getCallProg() throws CFException{
   		return callProg;
   }

  
	/**
	*  set variable callProg
	*  Corresponding COBOL Variable is WS-CALL-PROG
	*  @param value
	**/
   public void setCallProg(char[] value) {
       value = checkCallProgConstraints(value);
       arraycopy(value,0,callProg,0,value.length);
   } 
	public void setCallProg(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,callProg,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
