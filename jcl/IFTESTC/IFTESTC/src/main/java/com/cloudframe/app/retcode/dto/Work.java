package com.cloudframe.app.retcode.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:19. using version 5.0.0.257
**/


import com.cloudframe.app.retcode.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

						private char[] retcode01 = new char[8];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setRetcode01(("RETCODE1").toCharArray());
    }


 

	/**
	 *	Returns the value of retcode01
	 *	@return retcode01
	 */
   public char[] getRetcode01() throws CFException{
   		return retcode01;
   }

  
	/**
	*  set variable retcode01
	*  Corresponding COBOL Variable is WS-RETCODE
	*  @param value
	**/
   public void setRetcode01(char[] value) {
       value = checkRetcode01Constraints(value);
       arraycopy(value,0,retcode01,0,value.length);
   } 
	public void setRetcode01(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,retcode01,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
