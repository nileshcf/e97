package com.cloudframe.app.crntof.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/


import com.cloudframe.app.crntof.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

						private char[] crntofName = Field.fillLowValue(6);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of crntofName
	 *	@return crntofName
	 */
   public char[] getCrntofName() throws CFException{
   		return crntofName;
   }

  
	/**
	*  set variable crntofName
	*  Corresponding COBOL Variable is WS-CRNTOF-NAME
	*  @param value
	**/
   public void setCrntofName(char[] value) {
       value = checkCrntofNameConstraints(value);
       arraycopy(value,0,crntofName,0,value.length);
   } 
	public void setCrntofName(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,crntofName,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
