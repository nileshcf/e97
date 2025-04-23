package com.cloudframe.app.mcfile2.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:57. using version 5.0.0.254
**/


import com.cloudframe.app.mcfile2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

						private char[] outpStatus = Field.fillLowValue(2);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of outpStatus
	 *	@return outpStatus
	 */
   public char[] getOutpStatus() throws CFException{
   		return outpStatus;
   }

  
	/**
	*  set variable outpStatus
	*  Corresponding COBOL Variable is WS-OUTP-STATUS
	*  @param value
	**/
   public void setOutpStatus(char[] value) {
       value = checkOutpStatusConstraints(value);
       arraycopy(value,0,outpStatus,0,value.length);
   } 
	public void setOutpStatus(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,outpStatus,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
