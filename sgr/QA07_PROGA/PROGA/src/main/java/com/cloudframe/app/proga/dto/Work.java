package com.cloudframe.app.proga.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:24. using version 5.0.0.257
**/


import com.cloudframe.app.proga.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

						private char[] pgmName = new char[8];

						private char[] callType = Field.fillLowValue(8);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setPgmName(("PROGD   ").toCharArray());
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
	/**
	 *	Returns the value of callType
	 *	@return callType
	 */
   public char[] getCallType() throws CFException{
   		return callType;
   }

  
	/**
	*  set variable callType
	*  Corresponding COBOL Variable is WS-CALL-TYPE
	*  @param value
	**/
   public void setCallType(char[] value) {
       value = checkCallTypeConstraints(value);
       arraycopy(value,0,callType,0,value.length);
   } 
	public void setCallType(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,callType,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
