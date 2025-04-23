package com.cloudframe.app.mc083.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:57. using version 5.0.0.254
**/


import com.cloudframe.app.mc083.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

						private char[] fbFileStatus = Field.fillLowValue(2);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of fbFileStatus
	 *	@return fbFileStatus
	 */
   public char[] getFbFileStatus() throws CFException{
   		return fbFileStatus;
   }

  
	/**
	*  set variable fbFileStatus
	*  Corresponding COBOL Variable is WS-FB-FILE-STATUS
	*  @param value
	**/
   public void setFbFileStatus(char[] value) {
       value = checkFbFileStatusConstraints(value);
       arraycopy(value,0,fbFileStatus,0,value.length);
   } 
	public void setFbFileStatus(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,fbFileStatus,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
