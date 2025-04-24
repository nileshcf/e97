package com.cloudframe.app.mc071.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/


import com.cloudframe.app.mc071.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized { 
   

						private char[] outputFileStatus = Field.fillLowValue(2);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of outputFileStatus
	 *	@return outputFileStatus
	 */
   public char[] getOutputFileStatus() throws CFException{
   		return outputFileStatus;
   }

  
	/**
	*  set variable outputFileStatus
	*  Corresponding COBOL Variable is WS-OUTPUT-FILE-STATUS
	*  @param value
	**/
   public void setOutputFileStatus(char[] value) {
       value = checkOutputFileStatusConstraints(value);
       arraycopy(value,0,outputFileStatus,0,value.length);
   } 
	public void setOutputFileStatus(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,outputFileStatus,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
