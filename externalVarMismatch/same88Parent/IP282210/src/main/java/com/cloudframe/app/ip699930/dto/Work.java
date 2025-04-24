package com.cloudframe.app.ip699930.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
**/


import com.cloudframe.app.ip699930.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized { 
   

						private char[] startOfLoopSw100 = new char[1];

						private char[] processAgreementFoundSw100 = new char[1];

						private char[] systemApplFoundSw100 = new char[1];

						private char[] pgmVersion300 = new char[7];

								private int value1300;

						private char[] pgmIp282210300 = new char[8];

						private char[] pgmIp699930300 = new char[8];

						private char[] pgmIp996010300 = new char[8];

						private char[] missingProcessAgrmtMsg600 = new char[28];

						private char[] missingApplSystemIdMsg600 = new char[29];

						private char[] noProcessingAgrmntsMsg600 = new char[44];

						private char[] ptrIp282210800 = new char[8];

						private char[] ptrIp996010800 = new char[8];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setStartOfLoopSw100(("N").toCharArray());
								setProcessAgreementFoundSw100(("N").toCharArray());
								setSystemApplFoundSw100(("N").toCharArray());
								setPgmVersion300(getString(new byte[] {(byte)0x00,(byte)0xEB,(byte)0xA1,(byte)0x01,(byte)0x91,(byte)0x47,(byte)0x00}).toCharArray());
								setValue1300(1);
								setPgmIp282210300(("IP282210").toCharArray());
								setPgmIp699930300(("IP699930").toCharArray());
								setPgmIp996010300(("IP996010").toCharArray());
								setMissingProcessAgrmtMsg600(("MISSING PROCESSING AGREEMENT").toCharArray());
								setMissingApplSystemIdMsg600(("MISSING SYSTEM APPLICATION ID").toCharArray());
								setNoProcessingAgrmntsMsg600(("NO PROCESSING AGREEMENTS IN THE ONE DAY FILE").toCharArray());
								setPtrIp282210800(("IP282210").toCharArray());
								setPtrIp996010800(("IP996010").toCharArray());
    }


 

	/**
	 *	Returns the value of startOfLoopSw100
	 *	@return startOfLoopSw100
	 */
   public char[] getStartOfLoopSw100() throws CFException{
   		return startOfLoopSw100;
   }

  
	/**
	*  set variable startOfLoopSw100
	*  Corresponding COBOL Variable is 100-START-OF-LOOP-SW
	*  @param value
	**/
   public void setStartOfLoopSw100(char[] value) {
       value = checkStartOfLoopSw100Constraints(value);
       arraycopy(value,0,startOfLoopSw100,0,value.length);
   } 
	public void setStartOfLoopSw100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,startOfLoopSw100,0,beginIndex + endIndex);
   }
	char[] startLoop8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isStartLoop88100()
	 *	@return  Returns true if isStartLoop88100() is "Y"
	 */
   public boolean isStartLoop88100() throws CFException {
      return (  compareChars( getStartOfLoopSw100() , startLoop8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setStartLoop88100True() {  			
    	setStartOfLoopSw100( startLoop8810088Value);
   	}
	char[] stopLoop8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isStopLoop88100()
	 *	@return  Returns true if isStopLoop88100() is "N"
	 */
   public boolean isStopLoop88100() throws CFException {
      return (  compareChars( getStartOfLoopSw100() , stopLoop8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setStopLoop88100True() {  			
    	setStartOfLoopSw100( stopLoop8810088Value);
   	}
	/**
	 *	Returns the value of processAgreementFoundSw100
	 *	@return processAgreementFoundSw100
	 */
   public char[] getProcessAgreementFoundSw100() throws CFException{
   		return processAgreementFoundSw100;
   }

  
	/**
	*  set variable processAgreementFoundSw100
	*  Corresponding COBOL Variable is 100-PROCESS-AGREEMENT-FOUND-SW
	*  @param value
	**/
   public void setProcessAgreementFoundSw100(char[] value) {
       value = checkProcessAgreementFoundSw100Constraints(value);
       arraycopy(value,0,processAgreementFoundSw100,0,value.length);
   } 
	public void setProcessAgreementFoundSw100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,processAgreementFoundSw100,0,beginIndex + endIndex);
   }
	char[] processAgrmtNotFound8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isProcessAgrmtNotFound88100()
	 *	@return  Returns true if isProcessAgrmtNotFound88100() is "N"
	 */
   public boolean isProcessAgrmtNotFound88100() throws CFException {
      return (  compareChars( getProcessAgreementFoundSw100() , processAgrmtNotFound8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setProcessAgrmtNotFound88100True() {  			
    	setProcessAgreementFoundSw100( processAgrmtNotFound8810088Value);
   	}
	char[] processAgrmntFound8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isProcessAgrmntFound88100()
	 *	@return  Returns true if isProcessAgrmntFound88100() is "Y"
	 */
   public boolean isProcessAgrmntFound88100() throws CFException {
      return (  compareChars( getProcessAgreementFoundSw100() , processAgrmntFound8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setProcessAgrmntFound88100True() {  			
    	setProcessAgreementFoundSw100( processAgrmntFound8810088Value);
   	}
	/**
	 *	Returns the value of systemApplFoundSw100
	 *	@return systemApplFoundSw100
	 */
   public char[] getSystemApplFoundSw100() throws CFException{
   		return systemApplFoundSw100;
   }

  
	/**
	*  set variable systemApplFoundSw100
	*  Corresponding COBOL Variable is 100-SYSTEM-APPL-FOUND-SW
	*  @param value
	**/
   public void setSystemApplFoundSw100(char[] value) {
       value = checkSystemApplFoundSw100Constraints(value);
       arraycopy(value,0,systemApplFoundSw100,0,value.length);
   } 
	public void setSystemApplFoundSw100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,systemApplFoundSw100,0,beginIndex + endIndex);
   }
	char[] systemApplNotFound8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isSystemApplNotFound88100()
	 *	@return  Returns true if isSystemApplNotFound88100() is "N"
	 */
   public boolean isSystemApplNotFound88100() throws CFException {
      return (  compareChars( getSystemApplFoundSw100() , systemApplNotFound8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setSystemApplNotFound88100True() {  			
    	setSystemApplFoundSw100( systemApplNotFound8810088Value);
   	}
	char[] systemApplFound8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isSystemApplFound88100()
	 *	@return  Returns true if isSystemApplFound88100() is "Y"
	 */
   public boolean isSystemApplFound88100() throws CFException {
      return (  compareChars( getSystemApplFoundSw100() , systemApplFound8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setSystemApplFound88100True() {  			
    	setSystemApplFoundSw100( systemApplFound8810088Value);
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
	 *	Returns the value of value1300
	 *	@return value1300
	 */
	public int getValue1300() throws CFException {
   		return value1300;
	}
	
	/**
	 * 	Update Value1300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-1
	 *	@param number
	 */
	public void setValue1300(int number) {
	     // Truncate if the number is beyond +/- Max range
	    value1300 = checkValue1300MaxLimit(number); 
	}


	public void setValue1300(long number) {
	    number = checkValue1300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setValue1300((int)number);
	}
	
	/**
	 *	Returns the value of pgmIp282210300
	 *	@return pgmIp282210300
	 */
   public char[] getPgmIp282210300() throws CFException{
   		return pgmIp282210300;
   }

  
	/**
	*  set variable pgmIp282210300
	*  Corresponding COBOL Variable is 300-PGM-IP282210
	*  @param value
	**/
   public void setPgmIp282210300(char[] value) {
       value = checkPgmIp282210300Constraints(value);
       arraycopy(value,0,pgmIp282210300,0,value.length);
   } 
	public void setPgmIp282210300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp282210300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pgmIp699930300
	 *	@return pgmIp699930300
	 */
   public char[] getPgmIp699930300() throws CFException{
   		return pgmIp699930300;
   }

  
	/**
	*  set variable pgmIp699930300
	*  Corresponding COBOL Variable is 300-PGM-IP699930
	*  @param value
	**/
   public void setPgmIp699930300(char[] value) {
       value = checkPgmIp699930300Constraints(value);
       arraycopy(value,0,pgmIp699930300,0,value.length);
   } 
	public void setPgmIp699930300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp699930300,0,beginIndex + endIndex);
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
	 *	Returns the value of missingProcessAgrmtMsg600
	 *	@return missingProcessAgrmtMsg600
	 */
   public char[] getMissingProcessAgrmtMsg600() throws CFException{
   		return missingProcessAgrmtMsg600;
   }

  
	/**
	*  set variable missingProcessAgrmtMsg600
	*  Corresponding COBOL Variable is 600-MISSING-PROCESS-AGRMT-MSG
	*  @param value
	**/
   public void setMissingProcessAgrmtMsg600(char[] value) {
       value = checkMissingProcessAgrmtMsg600Constraints(value);
       arraycopy(value,0,missingProcessAgrmtMsg600,0,value.length);
   } 
	public void setMissingProcessAgrmtMsg600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,missingProcessAgrmtMsg600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of missingApplSystemIdMsg600
	 *	@return missingApplSystemIdMsg600
	 */
   public char[] getMissingApplSystemIdMsg600() throws CFException{
   		return missingApplSystemIdMsg600;
   }

  
	/**
	*  set variable missingApplSystemIdMsg600
	*  Corresponding COBOL Variable is 600-MISSING-APPL-SYSTEM-ID-MSG
	*  @param value
	**/
   public void setMissingApplSystemIdMsg600(char[] value) {
       value = checkMissingApplSystemIdMsg600Constraints(value);
       arraycopy(value,0,missingApplSystemIdMsg600,0,value.length);
   } 
	public void setMissingApplSystemIdMsg600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,missingApplSystemIdMsg600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of noProcessingAgrmntsMsg600
	 *	@return noProcessingAgrmntsMsg600
	 */
   public char[] getNoProcessingAgrmntsMsg600() throws CFException{
   		return noProcessingAgrmntsMsg600;
   }

  
	/**
	*  set variable noProcessingAgrmntsMsg600
	*  Corresponding COBOL Variable is 600-NO-PROCESSING-AGRMNTS-MSG
	*  @param value
	**/
   public void setNoProcessingAgrmntsMsg600(char[] value) {
       value = checkNoProcessingAgrmntsMsg600Constraints(value);
       arraycopy(value,0,noProcessingAgrmntsMsg600,0,value.length);
   } 
	public void setNoProcessingAgrmntsMsg600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,noProcessingAgrmntsMsg600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ptrIp282210800
	 *	@return ptrIp282210800
	 */
   public char[] getPtrIp282210800() throws CFException{
   		return ptrIp282210800;
   }

  
	/**
	*  set variable ptrIp282210800
	*  Corresponding COBOL Variable is 800-PTR-IP282210
	*  @param value
	**/
   public void setPtrIp282210800(char[] value) {
       value = checkPtrIp282210800Constraints(value);
       arraycopy(value,0,ptrIp282210800,0,value.length);
   } 
	public void setPtrIp282210800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp282210800,0,beginIndex + endIndex);
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
  
