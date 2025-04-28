package com.cloudframe.app.mcsort05.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/


import com.cloudframe.app.mcsort05.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

						private char[] pgmVersion300 = new char[7];

						private char[] pgmMcsort05300 = new char[8];

						private char[] pgmIp996010300 = new char[8];

						private char[] endOfStepMsg301 = new char[45];

						private char[] ptrIp996010800 = new char[8];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setPgmVersion300(getString(new byte[] {(byte)0x01,(byte)0xB0,(byte)0x7F,(byte)0x01,(byte)0x13,(byte)0x28,(byte)0x00}).toCharArray());
								setPgmMcsort05300(("MCSORT05").toCharArray());
								setPgmIp996010300(("IP996010").toCharArray());
								setEndOfStepMsg301(("MCSORT05-9999-END OF STEP, CONDITION CODE =  ").toCharArray());
								setPtrIp996010800(("IP996010").toCharArray());
    }


 

	/**
	 *	Returns the value of pgmVersion300
	 *	@return pgmVersion300
	 */
   public char[] getPgmVersion300() throws CFException{
   		return pgmVersion300;
   }

  
	/**
	*  set variable pgmVersion300
	*  Corresponding COBOL Variable is 300-PGM-VERSION
	*  @param value
	**/
   public void setPgmVersion300(char[] value) {
       value = checkPgmVersion300Constraints(value);
       arraycopy(value,0,pgmVersion300,0,value.length);
   } 
	public void setPgmVersion300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmVersion300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pgmMcsort05300
	 *	@return pgmMcsort05300
	 */
   public char[] getPgmMcsort05300() throws CFException{
   		return pgmMcsort05300;
   }

  
	/**
	*  set variable pgmMcsort05300
	*  Corresponding COBOL Variable is 300-PGM-MCSORT05
	*  @param value
	**/
   public void setPgmMcsort05300(char[] value) {
       value = checkPgmMcsort05300Constraints(value);
       arraycopy(value,0,pgmMcsort05300,0,value.length);
   } 
	public void setPgmMcsort05300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmMcsort05300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pgmIp996010300
	 *	@return pgmIp996010300
	 */
   public char[] getPgmIp996010300() throws CFException{
   		return pgmIp996010300;
   }

  
	/**
	*  set variable pgmIp996010300
	*  Corresponding COBOL Variable is 300-PGM-IP996010
	*  @param value
	**/
   public void setPgmIp996010300(char[] value) {
       value = checkPgmIp996010300Constraints(value);
       arraycopy(value,0,pgmIp996010300,0,value.length);
   } 
	public void setPgmIp996010300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp996010300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of endOfStepMsg301
	 *	@return endOfStepMsg301
	 */
   public char[] getEndOfStepMsg301() throws CFException{
   		return endOfStepMsg301;
   }

  
	/**
	*  set variable endOfStepMsg301
	*  Corresponding COBOL Variable is 301-END-OF-STEP-MSG
	*  @param value
	**/
   public void setEndOfStepMsg301(char[] value) {
       value = checkEndOfStepMsg301Constraints(value);
       arraycopy(value,0,endOfStepMsg301,0,value.length);
   } 
	public void setEndOfStepMsg301(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,endOfStepMsg301,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ptrIp996010800
	 *	@return ptrIp996010800
	 */
   public char[] getPtrIp996010800() throws CFException{
   		return ptrIp996010800;
   }

  
	/**
	*  set variable ptrIp996010800
	*  Corresponding COBOL Variable is 800-PTR-IP996010
	*  @param value
	**/
   public void setPtrIp996010800(char[] value) {
       value = checkPtrIp996010800Constraints(value);
       arraycopy(value,0,ptrIp996010800,0,value.length);
   } 
	public void setPtrIp996010800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp996010800,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
