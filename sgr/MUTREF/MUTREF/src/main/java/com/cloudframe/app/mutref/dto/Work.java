package com.cloudframe.app.mutref.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:13. using version 5.0.0.254
**/


import com.cloudframe.app.mutref.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

						private char[] previousCardAcceptor801 = new char[15];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setPreviousCardAcceptor801(fillSpace(15));
    }


 

	/**
	 *	Returns the value of previousCardAcceptor801
	 *	@return previousCardAcceptor801
	 */
   public char[] getPreviousCardAcceptor801() throws CFException{
   		return previousCardAcceptor801;
   }

  
	/**
	*  set variable previousCardAcceptor801
	*  Corresponding COBOL Variable is 801-PREVIOUS-CARD-ACCEPTOR
	*  @param value
	**/
   public void setPreviousCardAcceptor801(char[] value) {
       value = checkPreviousCardAcceptor801Constraints(value);
       arraycopy(value,0,previousCardAcceptor801,0,value.length);
   } 
	public void setPreviousCardAcceptor801(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,previousCardAcceptor801,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
