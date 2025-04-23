package com.cloudframe.app.abprog7.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:57. using version 5.0.0.254
**/


import com.cloudframe.app.abprog7.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

						private char[] pgmName = new char[8];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setPgmName(("ABPROG8 ").toCharArray());
    }


 

	/**
	 *	Returns the value of pgmName
	 *	@return pgmName
	 */
   public char[] getPgmName() throws CFException{
   		return pgmName;
   }

  
	/**
	*  set variable pgmName
	*  Corresponding COBOL Variable is PGM-NAME
	*  @param value
	**/
   public void setPgmName(char[] value) {
       value = checkPgmNameConstraints(value);
       arraycopy(value,0,pgmName,0,value.length);
   } 
	public void setPgmName(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmName,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
