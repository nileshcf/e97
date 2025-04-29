package com.cloudframe.app.oldnew.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/


import com.cloudframe.app.oldnew.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

						private char[] recordWs = Field.fillLowValue(80);

						private char[] eof = Field.fillLowValue(1);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of recordWs
	 *	@return recordWs
	 */
   public char[] getRecordWs() throws CFException{
   		return recordWs;
   }

  
	/**
	*  set variable recordWs
	*  Corresponding COBOL Variable is WS-RECORD
	*  @param value
	**/
   public void setRecordWs(char[] value) {
       value = checkRecordWsConstraints(value);
       arraycopy(value,0,recordWs,0,value.length);
   } 
	public void setRecordWs(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,recordWs,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of eof
	 *	@return eof
	 */
   public char[] getEof() throws CFException{
   		return eof;
   }

  
	/**
	*  set variable eof
	*  Corresponding COBOL Variable is WS-EOF
	*  @param value
	**/
   public void setEof(char[] value) {
       value = checkEofConstraints(value);
       arraycopy(value,0,eof,0,value.length);
   } 
	public void setEof(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,eof,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
