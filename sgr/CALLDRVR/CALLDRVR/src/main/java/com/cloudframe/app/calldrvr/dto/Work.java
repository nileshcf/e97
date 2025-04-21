package com.cloudframe.app.calldrvr.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:15. using version 5.0.0.256
**/


import com.cloudframe.app.calldrvr.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

						private char[] callprm101 = new char[8];

						private char[] callprm201 = new char[8];

						private char[] callprm401 = new char[8];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setCallprm101(("CALLPRM1").toCharArray());
								setCallprm201(("CALLPRM2").toCharArray());
								setCallprm401(("CALLPRM4").toCharArray());
    }


 

	/**
	 *	Returns the value of callprm101
	 *	@return callprm101
	 */
   public char[] getCallprm101() throws CFException{
   		return callprm101;
   }

  
	/**
	*  set variable callprm101
	*  Corresponding COBOL Variable is WS-CALLPRM1
	*  @param value
	**/
   public void setCallprm101(char[] value) {
       value = checkCallprm101Constraints(value);
       arraycopy(value,0,callprm101,0,value.length);
   } 
	public void setCallprm101(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,callprm101,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of callprm201
	 *	@return callprm201
	 */
   public char[] getCallprm201() throws CFException{
   		return callprm201;
   }

  
	/**
	*  set variable callprm201
	*  Corresponding COBOL Variable is WS-CALLPRM2
	*  @param value
	**/
   public void setCallprm201(char[] value) {
       value = checkCallprm201Constraints(value);
       arraycopy(value,0,callprm201,0,value.length);
   } 
	public void setCallprm201(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,callprm201,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of callprm401
	 *	@return callprm401
	 */
   public char[] getCallprm401() throws CFException{
   		return callprm401;
   }

  
	/**
	*  set variable callprm401
	*  Corresponding COBOL Variable is WS-CALLPRM4
	*  @param value
	**/
   public void setCallprm401(char[] value) {
       value = checkCallprm401Constraints(value);
       arraycopy(value,0,callprm401,0,value.length);
   } 
	public void setCallprm401(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,callprm401,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
