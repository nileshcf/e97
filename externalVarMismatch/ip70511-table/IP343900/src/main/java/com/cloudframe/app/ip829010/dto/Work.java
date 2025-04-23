package com.cloudframe.app.ip829010.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:07. using version 5.0.0.254
**/


import com.cloudframe.app.ip829010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

						private char[] mqRespStatusSw100 = new char[1];

						private char[] isItTheFirstTime100 = new char[1];

								private short queryNoSeven300;

						private char[] jobnameErrorAbendCode300 = new char[4];

						private char[] jobnumErrorAbendCode300 = new char[4];

						private char[] retryErrorAbendCode300 = new char[4];

						private char[] getMqRspCdAbendCode300 = new char[4];

						private char[] getQAbendCode300 = new char[4];

						private char[] insertMrsAbendCode300 = new char[4];

						private char[] putQAbendCode300 = new char[4];

						private char[] invalidRcLrm300 = new char[4];

						private char[] abendCode3003010 = new char[4];

						private char[] abendCode3003011 = new char[4];

						private char[] abendCode3003012 = new char[4];

						private char[] pgmIp081110300 = new char[8];

						private char[] pgmIp282210300 = new char[8];

						private char[] pgmIp521010300 = new char[8];

						private char[] pgmIp586010300 = new char[8];

						private char[] pgmIp599810300 = new char[8];

						private char[] pgmIp595210300 = new char[8];

						private char[] abendPgm300 = new char[8];

						private char[] pgmIp648010300 = new char[8];

						private char[] pgmIp703020300 = new char[8];

						private char[] pgmIp829010300 = new char[8];

						private char[] pgmVersion300 = new char[7];

						private char[] pgmIp708020300 = new char[8];

						private char[] pgmIp890110300 = new char[8];

						private char[] pgmIp996010300 = new char[8];

						private char[] pgmIp996020300 = new char[8];

						private char[] pgmIp708010300 = new char[8];

								private short value1300;

								private int value7300;

								private int value99300;

						private char[] valueFacreq300 = new char[6];

								private int mqFailCode300;

								private int mqFailCodeOne300;

						private char[] valuePipe300 = new char[1];

						private char[] valueClosed300 = new char[1];

						private char[] valueTest300 = new char[1];

						private char[] valueN300 = new char[1];

						private char[] valueC300 = new char[1];

						private char[] sys201300 = new char[6];

						private char[] panInvalidMsg300 = new char[30];

						private char[] expInvalidMsg300 = new char[30];

						private char[] vanInvalidMsg300 = new char[30];

						private char[] gftInvalidMsg300 = new char[30];

						private char[] txnInvalidMsg300 = new char[30];

						private char[] facNotFoundMsg300 = new char[30];

						private char[] tipmrsFailMsg300 = new char[30];

						private char[] tipmrsDuplMsg300 = new char[30];

						private char[] mqputFailMsg300 = new char[30];

						private char[] mqgetFailMsg300 = new char[30];

						private char[] asterisks300 = new char[34];

						private char[] abendTxt300 = new char[31];

						private char[] abendPgmTxt300 = new char[26];

						private char[] paraName1400300 = new char[30];

						private char[] paraName2426300 = new char[30];

						private char[] paraName2410300 = new char[30];

						private char[] paraName2610300 = new char[30];

						private char[] paraName24301300 = new char[30];

						private char[] paraName8500300 = new char[30];

						private char[] paraName1900300 = new char[30];

						private char[] paraName2800300 = new char[30];

						private char[] paraName3100300 = new char[30];

						private char[] fraudMqDebugDispStr600 = new char[400];

						private char[] jobNameError600 = new char[45];

						private char[] jobNumError601 = new char[45];

						private char[] retryCountError602 = new char[45];

						private char[] rowsNotFoundErrMsgTxt604 = new char[35];

						private char[] tipamrsInsertFailure605 = new char[35];

						private char[] lrmIoAbendMsg609 = new char[50];

						private char[] abendPtr800 = new char[8];

						private char[] ptrIp081110800 = new char[8];

						private char[] ptrIp282210800 = new char[8];

						private char[] ptrIp586010800 = new char[8];

						private char[] ptrIp599810800 = new char[8];

						private char[] ptrIp595210800 = new char[8];

						private char[] ptrIp648010800 = new char[8];

						private char[] ptrIp708020800 = new char[8];

						private char[] ptrIp703020800 = new char[8];

						private char[] ptrIp890110800 = new char[8];

						private char[] ptrIp996010800 = new char[8];

						private char[] ptrIp996020800 = new char[8];

						private char[] ptrIp521010800 = new char[8];

						private char[] ptrIp708010800 = new char[8];

								private int start800;

								private int end800;

								private int clrCyclId800;

								private int prevClrCyclId800;

						private char[] mqRespCd800 = new char[1];

						private char[] facreqJobgrpName800 = new char[8];

						private char[] jobname800 = new char[8];

								private int mrsIsrtCount800;

								private int mqputSkipCount800;

								private int tipamrsSkipCount800;

								private int mqgetFailCount800;

								private int mqputFailCount800;

								private int faaFacNotFndCnt800;

						private char[] lnRespDebugInd800 = Field.fillLowValue(1);

						private char[] sys201Status800 = new char[2];

						private char[] skipFlag800 = Field.fillLowValue(1);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setMqRespStatusSw100(("Y").toCharArray());
								setIsItTheFirstTime100(("Y").toCharArray());
								setQueryNoSeven300((short)7);
								setJobnameErrorAbendCode300(("3001").toCharArray());
								setJobnumErrorAbendCode300(("3002").toCharArray());
								setRetryErrorAbendCode300(("3003").toCharArray());
								setGetMqRspCdAbendCode300(("3004").toCharArray());
								setGetQAbendCode300(("3006").toCharArray());
								setInsertMrsAbendCode300(("3007").toCharArray());
								setPutQAbendCode300(("3009").toCharArray());
								setInvalidRcLrm300(("3034").toCharArray());
								setAbendCode3003010(("3010").toCharArray());
								setAbendCode3003011(("3011").toCharArray());
								setAbendCode3003012(("3012").toCharArray());
								setPgmIp081110300(("IP081110").toCharArray());
								setPgmIp282210300(("IP282210").toCharArray());
								setPgmIp521010300(("IP521010").toCharArray());
								setPgmIp586010300(("IP586010").toCharArray());
								setPgmIp599810300(("IP599810").toCharArray());
								setPgmIp595210300(("IP595210").toCharArray());
								setAbendPgm300(("IP610010").toCharArray());
								setPgmIp648010300(("IP648010").toCharArray());
								setPgmIp703020300(("IP703020").toCharArray());
								setPgmIp829010300(("IP829010").toCharArray());
								setPgmVersion300(getString(new byte[] {(byte)0x01,(byte)0xDF,(byte)0x61,(byte)0x01,(byte)0x1A,(byte)0x94,(byte)0x00}).toCharArray());
								setPgmIp708020300(("IP708020").toCharArray());
								setPgmIp890110300(("IP890110").toCharArray());
								setPgmIp996010300(("IP996010").toCharArray());
								setPgmIp996020300(("IP996020").toCharArray());
								setPgmIp708010300(("IP708010").toCharArray());
								setValue1300((short)1);
								setValue7300(7);
								setValue99300(99);
								setValueFacreq300(("FACREQ").toCharArray());
								setMqFailCode300(2);
								setMqFailCodeOne300(1);
								setValuePipe300(("|").toCharArray());
								setValueClosed300(("C").toCharArray());
								setValueTest300(("T").toCharArray());
								setValueN300(("N").toCharArray());
								setValueC300(("C").toCharArray());
								setSys201300(("SYS201").toCharArray());
								setPanInvalidMsg300(("PRIMARY ACCOUNT NUMBER INVALID").toCharArray());
								setExpInvalidMsg300(("EXPIRATION DATE INVALID       ").toCharArray());
								setVanInvalidMsg300(("VIRTUAL ACCOUNT NUMBER INVALID").toCharArray());
								setGftInvalidMsg300(("GFT FILE INVALID              ").toCharArray());
								setTxnInvalidMsg300(("TRANSACTION NUMBER INVALID    ").toCharArray());
								setFacNotFoundMsg300(("TXN NOT FOUND IN FAA/FAC LCMS ").toCharArray());
								setTipmrsFailMsg300(("TIPAMRS INSERT FAILED         ").toCharArray());
								setTipmrsDuplMsg300(("TIPAMRS DUPLICATE TXN SKIPPED ").toCharArray());
								setMqputFailMsg300(("MQ PUT FAILED                 ").toCharArray());
								setMqgetFailMsg300(("MQ GET FAILED                 ").toCharArray());
								setAsterisks300(String.join("", java.util.Collections.nCopies(34, "*")).toCharArray());
								setAbendTxt300(("A B E N D  A B E N D  A B E N D").toCharArray());
								setAbendPgmTxt300(("A B E N D  I P 8 2 9 0 1 0").toCharArray());
								setParaName1400300(("1400-GET-MQ-RESP-JOB-NAME     ").toCharArray());
								setParaName2426300(("2426-GET-MQ-RESP-CD           ").toCharArray());
								setParaName2410300(("2410-CALL-MQGETAPI-FOR-READ   ").toCharArray());
								setParaName2610300(("2610-MQPUT-FRAUD-TRANS        ").toCharArray());
								setParaName24301300(("2430-TIPAMRS-INSERT           ").toCharArray());
								setParaName8500300(("8060-CALL-LRM-IP648010        ").toCharArray());
								setParaName1900300(("1900-OPEN-ERR-FILE-SYS201     ").toCharArray());
								setParaName2800300(("2800-WRITE-ERR-FILE-SYS201    ").toCharArray());
								setParaName3100300(("3100-CLOSE-ERR-FILE-SYS201    ").toCharArray());
								setFraudMqDebugDispStr600(pad(400," ".toCharArray(),' ',RIGHT_PAD));
								setJobNameError600(("MQ RESPONSE LRM JOB NAME NOT PROVIDED IN JCL.").toCharArray());
								setJobNumError601(("MQ RESPONSE LRM JOB NUMBER NOT VALID.        ").toCharArray());
								setRetryCountError602(("MQ RESPONSE DB2 DEAD LOCK COUNTER NOT VALID. ").toCharArray());
								setRowsNotFoundErrMsgTxt604(("ROWS NOT FOUND IN THE DB2 TABLE    ").toCharArray());
								setTipamrsInsertFailure605(("TIPAMRS INSERT FAILED              ").toCharArray());
								setLrmIoAbendMsg609(("AFTER CALLING LRM ABENDED DUE TO INPUT OR OUTPUT  ").toCharArray());
								setAbendPtr800(("IP610010").toCharArray());
								setPtrIp081110800(("IP081110").toCharArray());
								setPtrIp282210800(("IP282210").toCharArray());
								setPtrIp586010800(("IP586010").toCharArray());
								setPtrIp599810800(("IP599810").toCharArray());
								setPtrIp595210800(("IP595210").toCharArray());
								setPtrIp648010800(("IP648010").toCharArray());
								setPtrIp708020800(("IP708020").toCharArray());
								setPtrIp703020800(("IP703020").toCharArray());
								setPtrIp890110800(("IP890110").toCharArray());
								setPtrIp996010800(("IP996010").toCharArray());
								setPtrIp996020800(("IP996020").toCharArray());
								setPtrIp521010800(("IP521010").toCharArray());
								setPtrIp708010800(("IP708010").toCharArray());
								setStart800(1);
								setEnd800(0);
								setClrCyclId800(0);
								setPrevClrCyclId800(0);
								setMqRespCd800(fillSpace(1));
								setFacreqJobgrpName800(fillSpace(8));
								setJobname800(("SIP829*D").toCharArray());
								setMrsIsrtCount800(0);
								setMqputSkipCount800(0);
								setTipamrsSkipCount800(0);
								setMqgetFailCount800(0);
								setMqputFailCount800(0);
								setFaaFacNotFndCnt800(0);
								setSys201Status800(fillSpace(2));
    }


 

	/**
	 *	Returns the value of mqRespStatusSw100
	 *	@return mqRespStatusSw100
	 */
   public char[] getMqRespStatusSw100() throws CFException{
   		return mqRespStatusSw100;
   }

  
	/**
	*  set variable mqRespStatusSw100
	*  Corresponding COBOL Variable is 100-MQ-RESP-STATUS-SW
	*  @param value
	**/
   public void setMqRespStatusSw100(char[] value) {
       value = checkMqRespStatusSw100Constraints(value);
       arraycopy(value,0,mqRespStatusSw100,0,value.length);
   } 
	public void setMqRespStatusSw100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,mqRespStatusSw100,0,beginIndex + endIndex);
   }
	char[] mqRespY8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isMqRespY88100()
	 *	@return  Returns true if isMqRespY88100() is "Y"
	 */
   public boolean isMqRespY88100() throws CFException {
      return (  compareChars( getMqRespStatusSw100() , mqRespY8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setMqRespY88100True() {  			
    	setMqRespStatusSw100( mqRespY8810088Value);
   	}
	char[] mqRespN8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isMqRespN88100()
	 *	@return  Returns true if isMqRespN88100() is "N"
	 */
   public boolean isMqRespN88100() throws CFException {
      return (  compareChars( getMqRespStatusSw100() , mqRespN8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setMqRespN88100True() {  			
    	setMqRespStatusSw100( mqRespN8810088Value);
   	}
	/**
	 *	Returns the value of isItTheFirstTime100
	 *	@return isItTheFirstTime100
	 */
   public char[] getIsItTheFirstTime100() throws CFException{
   		return isItTheFirstTime100;
   }

  
	/**
	*  set variable isItTheFirstTime100
	*  Corresponding COBOL Variable is 100-IS-IT-THE-FIRST-TIME
	*  @param value
	**/
   public void setIsItTheFirstTime100(char[] value) {
       value = checkIsItTheFirstTime100Constraints(value);
       arraycopy(value,0,isItTheFirstTime100,0,value.length);
   } 
	public void setIsItTheFirstTime100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,isItTheFirstTime100,0,beginIndex + endIndex);
   }
	char[] itIsFirstTime8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isItIsFirstTime88100()
	 *	@return  Returns true if isItIsFirstTime88100() is "Y"
	 */
   public boolean isItIsFirstTime88100() throws CFException {
      return (  compareChars( getIsItTheFirstTime100() , itIsFirstTime8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setItIsFirstTime88100True() {  			
    	setIsItTheFirstTime100( itIsFirstTime8810088Value);
   	}
	char[] itIsNotFirstTime8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isItIsNotFirstTime88100()
	 *	@return  Returns true if isItIsNotFirstTime88100() is "N"
	 */
   public boolean isItIsNotFirstTime88100() throws CFException {
      return (  compareChars( getIsItTheFirstTime100() , itIsNotFirstTime8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setItIsNotFirstTime88100True() {  			
    	setIsItTheFirstTime100( itIsNotFirstTime8810088Value);
   	}
	/**
	 *	Returns the value of queryNoSeven300
	 *	@return queryNoSeven300
	 */
	public short getQueryNoSeven300() throws CFException {
   		return queryNoSeven300;
	}
	
	/**
	 * 	Update QueryNoSeven300 with the passed value
	 *  Corresponding COBOL Variable is 300-QUERY-NO-SEVEN
	 *	@param number
	 */
	public void setQueryNoSeven300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    queryNoSeven300 = checkQueryNoSeven300MaxLimit(number); 
	}

	public void setQueryNoSeven300(int number) {
	    number = checkQueryNoSeven300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setQueryNoSeven300((short)number);
	}
	public void setQueryNoSeven300(long number) {
	    number = checkQueryNoSeven300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setQueryNoSeven300((short)number);
	}
	

	/**
	 *	Returns the value of jobnameErrorAbendCode300
	 *	@return jobnameErrorAbendCode300
	 */
   public char[] getJobnameErrorAbendCode300() throws CFException{
   		return jobnameErrorAbendCode300;
   }

  
	/**
	*  set variable jobnameErrorAbendCode300
	*  Corresponding COBOL Variable is 300-JOBNAME-ERROR-ABEND-CODE
	*  @param value
	**/
   public void setJobnameErrorAbendCode300(char[] value) {
       value = checkJobnameErrorAbendCode300Constraints(value);
       arraycopy(value,0,jobnameErrorAbendCode300,0,value.length);
   } 
	public void setJobnameErrorAbendCode300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,jobnameErrorAbendCode300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of jobnumErrorAbendCode300
	 *	@return jobnumErrorAbendCode300
	 */
   public char[] getJobnumErrorAbendCode300() throws CFException{
   		return jobnumErrorAbendCode300;
   }

  
	/**
	*  set variable jobnumErrorAbendCode300
	*  Corresponding COBOL Variable is 300-JOBNUM-ERROR-ABEND-CODE
	*  @param value
	**/
   public void setJobnumErrorAbendCode300(char[] value) {
       value = checkJobnumErrorAbendCode300Constraints(value);
       arraycopy(value,0,jobnumErrorAbendCode300,0,value.length);
   } 
	public void setJobnumErrorAbendCode300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,jobnumErrorAbendCode300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of retryErrorAbendCode300
	 *	@return retryErrorAbendCode300
	 */
   public char[] getRetryErrorAbendCode300() throws CFException{
   		return retryErrorAbendCode300;
   }

  
	/**
	*  set variable retryErrorAbendCode300
	*  Corresponding COBOL Variable is 300-RETRY-ERROR-ABEND-CODE
	*  @param value
	**/
   public void setRetryErrorAbendCode300(char[] value) {
       value = checkRetryErrorAbendCode300Constraints(value);
       arraycopy(value,0,retryErrorAbendCode300,0,value.length);
   } 
	public void setRetryErrorAbendCode300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,retryErrorAbendCode300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of getMqRspCdAbendCode300
	 *	@return getMqRspCdAbendCode300
	 */
   public char[] getGetMqRspCdAbendCode300() throws CFException{
   		return getMqRspCdAbendCode300;
   }

  
	/**
	*  set variable getMqRspCdAbendCode300
	*  Corresponding COBOL Variable is 300-GET-MQ-RSP-CD-ABEND-CODE
	*  @param value
	**/
   public void setGetMqRspCdAbendCode300(char[] value) {
       value = checkGetMqRspCdAbendCode300Constraints(value);
       arraycopy(value,0,getMqRspCdAbendCode300,0,value.length);
   } 
	public void setGetMqRspCdAbendCode300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,getMqRspCdAbendCode300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of getQAbendCode300
	 *	@return getQAbendCode300
	 */
   public char[] getGetQAbendCode300() throws CFException{
   		return getQAbendCode300;
   }

  
	/**
	*  set variable getQAbendCode300
	*  Corresponding COBOL Variable is 300-GET-Q-ABEND-CODE
	*  @param value
	**/
   public void setGetQAbendCode300(char[] value) {
       value = checkGetQAbendCode300Constraints(value);
       arraycopy(value,0,getQAbendCode300,0,value.length);
   } 
	public void setGetQAbendCode300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,getQAbendCode300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of insertMrsAbendCode300
	 *	@return insertMrsAbendCode300
	 */
   public char[] getInsertMrsAbendCode300() throws CFException{
   		return insertMrsAbendCode300;
   }

  
	/**
	*  set variable insertMrsAbendCode300
	*  Corresponding COBOL Variable is 300-INSERT-MRS-ABEND-CODE
	*  @param value
	**/
   public void setInsertMrsAbendCode300(char[] value) {
       value = checkInsertMrsAbendCode300Constraints(value);
       arraycopy(value,0,insertMrsAbendCode300,0,value.length);
   } 
	public void setInsertMrsAbendCode300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,insertMrsAbendCode300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of putQAbendCode300
	 *	@return putQAbendCode300
	 */
   public char[] getPutQAbendCode300() throws CFException{
   		return putQAbendCode300;
   }

  
	/**
	*  set variable putQAbendCode300
	*  Corresponding COBOL Variable is 300-PUT-Q-ABEND-CODE
	*  @param value
	**/
   public void setPutQAbendCode300(char[] value) {
       value = checkPutQAbendCode300Constraints(value);
       arraycopy(value,0,putQAbendCode300,0,value.length);
   } 
	public void setPutQAbendCode300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,putQAbendCode300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of invalidRcLrm300
	 *	@return invalidRcLrm300
	 */
   public char[] getInvalidRcLrm300() throws CFException{
   		return invalidRcLrm300;
   }

  
	/**
	*  set variable invalidRcLrm300
	*  Corresponding COBOL Variable is 300-INVALID-RC-LRM
	*  @param value
	**/
   public void setInvalidRcLrm300(char[] value) {
       value = checkInvalidRcLrm300Constraints(value);
       arraycopy(value,0,invalidRcLrm300,0,value.length);
   } 
	public void setInvalidRcLrm300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,invalidRcLrm300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of abendCode3003010
	 *	@return abendCode3003010
	 */
   public char[] getAbendCode3003010() throws CFException{
   		return abendCode3003010;
   }

  
	/**
	*  set variable abendCode3003010
	*  Corresponding COBOL Variable is 300-3010-ABEND-CODE
	*  @param value
	**/
   public void setAbendCode3003010(char[] value) {
       value = checkAbendCode3003010Constraints(value);
       arraycopy(value,0,abendCode3003010,0,value.length);
   } 
	public void setAbendCode3003010(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,abendCode3003010,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of abendCode3003011
	 *	@return abendCode3003011
	 */
   public char[] getAbendCode3003011() throws CFException{
   		return abendCode3003011;
   }

  
	/**
	*  set variable abendCode3003011
	*  Corresponding COBOL Variable is 300-3011-ABEND-CODE
	*  @param value
	**/
   public void setAbendCode3003011(char[] value) {
       value = checkAbendCode3003011Constraints(value);
       arraycopy(value,0,abendCode3003011,0,value.length);
   } 
	public void setAbendCode3003011(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,abendCode3003011,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of abendCode3003012
	 *	@return abendCode3003012
	 */
   public char[] getAbendCode3003012() throws CFException{
   		return abendCode3003012;
   }

  
	/**
	*  set variable abendCode3003012
	*  Corresponding COBOL Variable is 300-3012-ABEND-CODE
	*  @param value
	**/
   public void setAbendCode3003012(char[] value) {
       value = checkAbendCode3003012Constraints(value);
       arraycopy(value,0,abendCode3003012,0,value.length);
   } 
	public void setAbendCode3003012(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,abendCode3003012,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pgmIp081110300
	 *	@return pgmIp081110300
	 */
   public char[] getPgmIp081110300() throws CFException{
   		return pgmIp081110300;
   }

  
	/**
	*  set variable pgmIp081110300
	*  Corresponding COBOL Variable is 300-PGM-IP081110
	*  @param value
	**/
   public void setPgmIp081110300(char[] value) {
       value = checkPgmIp081110300Constraints(value);
       arraycopy(value,0,pgmIp081110300,0,value.length);
   } 
	public void setPgmIp081110300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp081110300,0,beginIndex + endIndex);
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
	 *	Returns the value of pgmIp521010300
	 *	@return pgmIp521010300
	 */
   public char[] getPgmIp521010300() throws CFException{
   		return pgmIp521010300;
   }

  
	/**
	*  set variable pgmIp521010300
	*  Corresponding COBOL Variable is 300-PGM-IP521010
	*  @param value
	**/
   public void setPgmIp521010300(char[] value) {
       value = checkPgmIp521010300Constraints(value);
       arraycopy(value,0,pgmIp521010300,0,value.length);
   } 
	public void setPgmIp521010300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp521010300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pgmIp586010300
	 *	@return pgmIp586010300
	 */
   public char[] getPgmIp586010300() throws CFException{
   		return pgmIp586010300;
   }

  
	/**
	*  set variable pgmIp586010300
	*  Corresponding COBOL Variable is 300-PGM-IP586010
	*  @param value
	**/
   public void setPgmIp586010300(char[] value) {
       value = checkPgmIp586010300Constraints(value);
       arraycopy(value,0,pgmIp586010300,0,value.length);
   } 
	public void setPgmIp586010300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp586010300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pgmIp599810300
	 *	@return pgmIp599810300
	 */
   public char[] getPgmIp599810300() throws CFException{
   		return pgmIp599810300;
   }

  
	/**
	*  set variable pgmIp599810300
	*  Corresponding COBOL Variable is 300-PGM-IP599810
	*  @param value
	**/
   public void setPgmIp599810300(char[] value) {
       value = checkPgmIp599810300Constraints(value);
       arraycopy(value,0,pgmIp599810300,0,value.length);
   } 
	public void setPgmIp599810300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp599810300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pgmIp595210300
	 *	@return pgmIp595210300
	 */
   public char[] getPgmIp595210300() throws CFException{
   		return pgmIp595210300;
   }

  
	/**
	*  set variable pgmIp595210300
	*  Corresponding COBOL Variable is 300-PGM-IP595210
	*  @param value
	**/
   public void setPgmIp595210300(char[] value) {
       value = checkPgmIp595210300Constraints(value);
       arraycopy(value,0,pgmIp595210300,0,value.length);
   } 
	public void setPgmIp595210300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp595210300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of abendPgm300
	 *	@return abendPgm300
	 */
   public char[] getAbendPgm300() throws CFException{
   		return abendPgm300;
   }

  
	/**
	*  set variable abendPgm300
	*  Corresponding COBOL Variable is 300-ABEND-PGM
	*  @param value
	**/
   public void setAbendPgm300(char[] value) {
       value = checkAbendPgm300Constraints(value);
       arraycopy(value,0,abendPgm300,0,value.length);
   } 
	public void setAbendPgm300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,abendPgm300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pgmIp648010300
	 *	@return pgmIp648010300
	 */
   public char[] getPgmIp648010300() throws CFException{
   		return pgmIp648010300;
   }

  
	/**
	*  set variable pgmIp648010300
	*  Corresponding COBOL Variable is 300-PGM-IP648010
	*  @param value
	**/
   public void setPgmIp648010300(char[] value) {
       value = checkPgmIp648010300Constraints(value);
       arraycopy(value,0,pgmIp648010300,0,value.length);
   } 
	public void setPgmIp648010300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp648010300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pgmIp703020300
	 *	@return pgmIp703020300
	 */
   public char[] getPgmIp703020300() throws CFException{
   		return pgmIp703020300;
   }

  
	/**
	*  set variable pgmIp703020300
	*  Corresponding COBOL Variable is 300-PGM-IP703020
	*  @param value
	**/
   public void setPgmIp703020300(char[] value) {
       value = checkPgmIp703020300Constraints(value);
       arraycopy(value,0,pgmIp703020300,0,value.length);
   } 
	public void setPgmIp703020300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp703020300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pgmIp829010300
	 *	@return pgmIp829010300
	 */
   public char[] getPgmIp829010300() throws CFException{
   		return pgmIp829010300;
   }

  
	/**
	*  set variable pgmIp829010300
	*  Corresponding COBOL Variable is 300-PGM-IP829010
	*  @param value
	**/
   public void setPgmIp829010300(char[] value) {
       value = checkPgmIp829010300Constraints(value);
       arraycopy(value,0,pgmIp829010300,0,value.length);
   } 
	public void setPgmIp829010300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp829010300,0,beginIndex + endIndex);
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
	 *	Returns the value of pgmIp708020300
	 *	@return pgmIp708020300
	 */
   public char[] getPgmIp708020300() throws CFException{
   		return pgmIp708020300;
   }

  
	/**
	*  set variable pgmIp708020300
	*  Corresponding COBOL Variable is 300-PGM-IP708020
	*  @param value
	**/
   public void setPgmIp708020300(char[] value) {
       value = checkPgmIp708020300Constraints(value);
       arraycopy(value,0,pgmIp708020300,0,value.length);
   } 
	public void setPgmIp708020300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp708020300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pgmIp890110300
	 *	@return pgmIp890110300
	 */
   public char[] getPgmIp890110300() throws CFException{
   		return pgmIp890110300;
   }

  
	/**
	*  set variable pgmIp890110300
	*  Corresponding COBOL Variable is 300-PGM-IP890110
	*  @param value
	**/
   public void setPgmIp890110300(char[] value) {
       value = checkPgmIp890110300Constraints(value);
       arraycopy(value,0,pgmIp890110300,0,value.length);
   } 
	public void setPgmIp890110300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp890110300,0,beginIndex + endIndex);
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
	 *	Returns the value of pgmIp996020300
	 *	@return pgmIp996020300
	 */
   public char[] getPgmIp996020300() throws CFException{
   		return pgmIp996020300;
   }

  
	/**
	*  set variable pgmIp996020300
	*  Corresponding COBOL Variable is 300-PGM-IP996020
	*  @param value
	**/
   public void setPgmIp996020300(char[] value) {
       value = checkPgmIp996020300Constraints(value);
       arraycopy(value,0,pgmIp996020300,0,value.length);
   } 
	public void setPgmIp996020300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp996020300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pgmIp708010300
	 *	@return pgmIp708010300
	 */
   public char[] getPgmIp708010300() throws CFException{
   		return pgmIp708010300;
   }

  
	/**
	*  set variable pgmIp708010300
	*  Corresponding COBOL Variable is 300-PGM-IP708010
	*  @param value
	**/
   public void setPgmIp708010300(char[] value) {
       value = checkPgmIp708010300Constraints(value);
       arraycopy(value,0,pgmIp708010300,0,value.length);
   } 
	public void setPgmIp708010300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp708010300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of value1300
	 *	@return value1300
	 */
	public short getValue1300() throws CFException {
   		return value1300;
	}
	
	/**
	 * 	Update Value1300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-1
	 *	@param number
	 */
	public void setValue1300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    value1300 = checkValue1300MaxLimit(number); 
	}

	public void setValue1300(int number) {
	    number = checkValue1300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setValue1300((short)number);
	}
	public void setValue1300(long number) {
	    number = checkValue1300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setValue1300((short)number);
	}
	

	/**
	 *	Returns the value of value7300
	 *	@return value7300
	 */
	public int getValue7300() throws CFException {
       if (isValue7300Modified()) { 
           value7300 = refreshValue7300();
        }
   		return value7300;
	}
	

	
	   
	/**
	 * 	Update Value7300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-7
	 *	@param number
	 */
	public void setValue7300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    value7300 = checkValue7300MaxLimit(number); 
		serializeValue7300(value7300);
	}
	

	public void setValue7300(long number) {
	    number = checkValue7300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setValue7300((int)number);
	}
	
	/**
	 * 	Update Value7300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue7300(char[] value) throws CFException {
		 value7300 = serializeValue7300(value);
	}
	/**
	 * 	Update Value7300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue7300String(char[] value) throws CFException {
		 setValue7300(value);
	}
	/**
	 *	Returns the value of value99300
	 *	@return value99300
	 */
	public int getValue99300() throws CFException {
       if (isValue99300Modified()) { 
           value99300 = refreshValue99300();
        }
   		return value99300;
	}
	

	
	   
	/**
	 * 	Update Value99300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-99
	 *	@param number
	 */
	public void setValue99300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    value99300 = checkValue99300MaxLimit(number); 
		serializeValue99300(value99300);
	}
	

	public void setValue99300(long number) {
	    number = checkValue99300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setValue99300((int)number);
	}
	
	/**
	 * 	Update Value99300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue99300(char[] value) throws CFException {
		 value99300 = serializeValue99300(value);
	}
	/**
	 * 	Update Value99300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue99300String(char[] value) throws CFException {
		 setValue99300(value);
	}
	/**
	 *	Returns the value of valueFacreq300
	 *	@return valueFacreq300
	 */
   public char[] getValueFacreq300() throws CFException{
   		return valueFacreq300;
   }

  
	/**
	*  set variable valueFacreq300
	*  Corresponding COBOL Variable is 300-VALUE-FACREQ
	*  @param value
	**/
   public void setValueFacreq300(char[] value) {
       value = checkValueFacreq300Constraints(value);
       arraycopy(value,0,valueFacreq300,0,value.length);
   } 
	public void setValueFacreq300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,valueFacreq300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of mqFailCode300
	 *	@return mqFailCode300
	 */
	public int getMqFailCode300() throws CFException {
   		return mqFailCode300;
	}
	
	/**
	 * 	Update MqFailCode300 with the passed value
	 *  Corresponding COBOL Variable is 300-MQ-FAIL-CODE
	 *	@param number
	 */
	public void setMqFailCode300(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqFailCode300 = checkMqFailCode300MaxLimit(number); 
	}


	public void setMqFailCode300(long number) {
	    number = checkMqFailCode300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqFailCode300((int)number);
	}
	
	/**
	 *	Returns the value of mqFailCodeOne300
	 *	@return mqFailCodeOne300
	 */
	public int getMqFailCodeOne300() throws CFException {
   		return mqFailCodeOne300;
	}
	
	/**
	 * 	Update MqFailCodeOne300 with the passed value
	 *  Corresponding COBOL Variable is 300-MQ-FAIL-CODE-ONE
	 *	@param number
	 */
	public void setMqFailCodeOne300(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqFailCodeOne300 = checkMqFailCodeOne300MaxLimit(number); 
	}


	public void setMqFailCodeOne300(long number) {
	    number = checkMqFailCodeOne300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqFailCodeOne300((int)number);
	}
	
	/**
	 *	Returns the value of valuePipe300
	 *	@return valuePipe300
	 */
   public char[] getValuePipe300() throws CFException{
   		return valuePipe300;
   }

  
	/**
	*  set variable valuePipe300
	*  Corresponding COBOL Variable is 300-VALUE-PIPE
	*  @param value
	**/
   public void setValuePipe300(char[] value) {
       value = checkValuePipe300Constraints(value);
       arraycopy(value,0,valuePipe300,0,value.length);
   } 
	public void setValuePipe300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,valuePipe300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of valueClosed300
	 *	@return valueClosed300
	 */
   public char[] getValueClosed300() throws CFException{
   		return valueClosed300;
   }

  
	/**
	*  set variable valueClosed300
	*  Corresponding COBOL Variable is 300-VALUE-CLOSED
	*  @param value
	**/
   public void setValueClosed300(char[] value) {
       value = checkValueClosed300Constraints(value);
       arraycopy(value,0,valueClosed300,0,value.length);
   } 
	public void setValueClosed300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,valueClosed300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of valueTest300
	 *	@return valueTest300
	 */
   public char[] getValueTest300() throws CFException{
   		return valueTest300;
   }

  
	/**
	*  set variable valueTest300
	*  Corresponding COBOL Variable is 300-VALUE-TEST
	*  @param value
	**/
   public void setValueTest300(char[] value) {
       value = checkValueTest300Constraints(value);
       arraycopy(value,0,valueTest300,0,value.length);
   } 
	public void setValueTest300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,valueTest300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of valueN300
	 *	@return valueN300
	 */
   public char[] getValueN300() throws CFException{
   		return valueN300;
   }

  
	/**
	*  set variable valueN300
	*  Corresponding COBOL Variable is 300-VALUE-N
	*  @param value
	**/
   public void setValueN300(char[] value) {
       value = checkValueN300Constraints(value);
       arraycopy(value,0,valueN300,0,value.length);
   } 
	public void setValueN300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,valueN300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of valueC300
	 *	@return valueC300
	 */
   public char[] getValueC300() throws CFException{
   		return valueC300;
   }

  
	/**
	*  set variable valueC300
	*  Corresponding COBOL Variable is 300-VALUE-C
	*  @param value
	**/
   public void setValueC300(char[] value) {
       value = checkValueC300Constraints(value);
       arraycopy(value,0,valueC300,0,value.length);
   } 
	public void setValueC300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,valueC300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of sys201300
	 *	@return sys201300
	 */
   public char[] getSys201300() throws CFException{
   		return sys201300;
   }

  
	/**
	*  set variable sys201300
	*  Corresponding COBOL Variable is 300-SYS201
	*  @param value
	**/
   public void setSys201300(char[] value) {
       value = checkSys201300Constraints(value);
       arraycopy(value,0,sys201300,0,value.length);
   } 
	public void setSys201300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sys201300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of panInvalidMsg300
	 *	@return panInvalidMsg300
	 */
   public char[] getPanInvalidMsg300() throws CFException{
   		return panInvalidMsg300;
   }

  
	/**
	*  set variable panInvalidMsg300
	*  Corresponding COBOL Variable is 300-PAN-INVALID-MSG
	*  @param value
	**/
   public void setPanInvalidMsg300(char[] value) {
       value = checkPanInvalidMsg300Constraints(value);
       arraycopy(value,0,panInvalidMsg300,0,value.length);
   } 
	public void setPanInvalidMsg300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,panInvalidMsg300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of expInvalidMsg300
	 *	@return expInvalidMsg300
	 */
   public char[] getExpInvalidMsg300() throws CFException{
   		return expInvalidMsg300;
   }

  
	/**
	*  set variable expInvalidMsg300
	*  Corresponding COBOL Variable is 300-EXP-INVALID-MSG
	*  @param value
	**/
   public void setExpInvalidMsg300(char[] value) {
       value = checkExpInvalidMsg300Constraints(value);
       arraycopy(value,0,expInvalidMsg300,0,value.length);
   } 
	public void setExpInvalidMsg300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,expInvalidMsg300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of vanInvalidMsg300
	 *	@return vanInvalidMsg300
	 */
   public char[] getVanInvalidMsg300() throws CFException{
   		return vanInvalidMsg300;
   }

  
	/**
	*  set variable vanInvalidMsg300
	*  Corresponding COBOL Variable is 300-VAN-INVALID-MSG
	*  @param value
	**/
   public void setVanInvalidMsg300(char[] value) {
       value = checkVanInvalidMsg300Constraints(value);
       arraycopy(value,0,vanInvalidMsg300,0,value.length);
   } 
	public void setVanInvalidMsg300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,vanInvalidMsg300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of gftInvalidMsg300
	 *	@return gftInvalidMsg300
	 */
   public char[] getGftInvalidMsg300() throws CFException{
   		return gftInvalidMsg300;
   }

  
	/**
	*  set variable gftInvalidMsg300
	*  Corresponding COBOL Variable is 300-GFT-INVALID-MSG
	*  @param value
	**/
   public void setGftInvalidMsg300(char[] value) {
       value = checkGftInvalidMsg300Constraints(value);
       arraycopy(value,0,gftInvalidMsg300,0,value.length);
   } 
	public void setGftInvalidMsg300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,gftInvalidMsg300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of txnInvalidMsg300
	 *	@return txnInvalidMsg300
	 */
   public char[] getTxnInvalidMsg300() throws CFException{
   		return txnInvalidMsg300;
   }

  
	/**
	*  set variable txnInvalidMsg300
	*  Corresponding COBOL Variable is 300-TXN-INVALID-MSG
	*  @param value
	**/
   public void setTxnInvalidMsg300(char[] value) {
       value = checkTxnInvalidMsg300Constraints(value);
       arraycopy(value,0,txnInvalidMsg300,0,value.length);
   } 
	public void setTxnInvalidMsg300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,txnInvalidMsg300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of facNotFoundMsg300
	 *	@return facNotFoundMsg300
	 */
   public char[] getFacNotFoundMsg300() throws CFException{
   		return facNotFoundMsg300;
   }

  
	/**
	*  set variable facNotFoundMsg300
	*  Corresponding COBOL Variable is 300-FAC-NOT-FOUND-MSG
	*  @param value
	**/
   public void setFacNotFoundMsg300(char[] value) {
       value = checkFacNotFoundMsg300Constraints(value);
       arraycopy(value,0,facNotFoundMsg300,0,value.length);
   } 
	public void setFacNotFoundMsg300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,facNotFoundMsg300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tipmrsFailMsg300
	 *	@return tipmrsFailMsg300
	 */
   public char[] getTipmrsFailMsg300() throws CFException{
   		return tipmrsFailMsg300;
   }

  
	/**
	*  set variable tipmrsFailMsg300
	*  Corresponding COBOL Variable is 300-TIPMRS-FAIL-MSG
	*  @param value
	**/
   public void setTipmrsFailMsg300(char[] value) {
       value = checkTipmrsFailMsg300Constraints(value);
       arraycopy(value,0,tipmrsFailMsg300,0,value.length);
   } 
	public void setTipmrsFailMsg300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tipmrsFailMsg300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tipmrsDuplMsg300
	 *	@return tipmrsDuplMsg300
	 */
   public char[] getTipmrsDuplMsg300() throws CFException{
   		return tipmrsDuplMsg300;
   }

  
	/**
	*  set variable tipmrsDuplMsg300
	*  Corresponding COBOL Variable is 300-TIPMRS-DUPL-MSG
	*  @param value
	**/
   public void setTipmrsDuplMsg300(char[] value) {
       value = checkTipmrsDuplMsg300Constraints(value);
       arraycopy(value,0,tipmrsDuplMsg300,0,value.length);
   } 
	public void setTipmrsDuplMsg300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tipmrsDuplMsg300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of mqputFailMsg300
	 *	@return mqputFailMsg300
	 */
   public char[] getMqputFailMsg300() throws CFException{
   		return mqputFailMsg300;
   }

  
	/**
	*  set variable mqputFailMsg300
	*  Corresponding COBOL Variable is 300-MQPUT-FAIL-MSG
	*  @param value
	**/
   public void setMqputFailMsg300(char[] value) {
       value = checkMqputFailMsg300Constraints(value);
       arraycopy(value,0,mqputFailMsg300,0,value.length);
   } 
	public void setMqputFailMsg300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,mqputFailMsg300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of mqgetFailMsg300
	 *	@return mqgetFailMsg300
	 */
   public char[] getMqgetFailMsg300() throws CFException{
   		return mqgetFailMsg300;
   }

  
	/**
	*  set variable mqgetFailMsg300
	*  Corresponding COBOL Variable is 300-MQGET-FAIL-MSG
	*  @param value
	**/
   public void setMqgetFailMsg300(char[] value) {
       value = checkMqgetFailMsg300Constraints(value);
       arraycopy(value,0,mqgetFailMsg300,0,value.length);
   } 
	public void setMqgetFailMsg300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,mqgetFailMsg300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of asterisks300
	 *	@return asterisks300
	 */
   public char[] getAsterisks300() throws CFException{
   		return asterisks300;
   }

  
	/**
	*  set variable asterisks300
	*  Corresponding COBOL Variable is 300-ASTERISKS
	*  @param value
	**/
   public void setAsterisks300(char[] value) {
       value = checkAsterisks300Constraints(value);
       arraycopy(value,0,asterisks300,0,value.length);
   } 
	public void setAsterisks300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,asterisks300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of abendTxt300
	 *	@return abendTxt300
	 */
   public char[] getAbendTxt300() throws CFException{
   		return abendTxt300;
   }

  
	/**
	*  set variable abendTxt300
	*  Corresponding COBOL Variable is 300-ABEND-TXT
	*  @param value
	**/
   public void setAbendTxt300(char[] value) {
       value = checkAbendTxt300Constraints(value);
       arraycopy(value,0,abendTxt300,0,value.length);
   } 
	public void setAbendTxt300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,abendTxt300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of abendPgmTxt300
	 *	@return abendPgmTxt300
	 */
   public char[] getAbendPgmTxt300() throws CFException{
   		return abendPgmTxt300;
   }

  
	/**
	*  set variable abendPgmTxt300
	*  Corresponding COBOL Variable is 300-ABEND-PGM-TXT
	*  @param value
	**/
   public void setAbendPgmTxt300(char[] value) {
       value = checkAbendPgmTxt300Constraints(value);
       arraycopy(value,0,abendPgmTxt300,0,value.length);
   } 
	public void setAbendPgmTxt300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,abendPgmTxt300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of paraName1400300
	 *	@return paraName1400300
	 */
   public char[] getParaName1400300() throws CFException{
   		return paraName1400300;
   }

  
	/**
	*  set variable paraName1400300
	*  Corresponding COBOL Variable is 300-PARA-NAME-1400
	*  @param value
	**/
   public void setParaName1400300(char[] value) {
       value = checkParaName1400300Constraints(value);
       arraycopy(value,0,paraName1400300,0,value.length);
   } 
	public void setParaName1400300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,paraName1400300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of paraName2426300
	 *	@return paraName2426300
	 */
   public char[] getParaName2426300() throws CFException{
   		return paraName2426300;
   }

  
	/**
	*  set variable paraName2426300
	*  Corresponding COBOL Variable is 300-PARA-NAME-2426
	*  @param value
	**/
   public void setParaName2426300(char[] value) {
       value = checkParaName2426300Constraints(value);
       arraycopy(value,0,paraName2426300,0,value.length);
   } 
	public void setParaName2426300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,paraName2426300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of paraName2410300
	 *	@return paraName2410300
	 */
   public char[] getParaName2410300() throws CFException{
   		return paraName2410300;
   }

  
	/**
	*  set variable paraName2410300
	*  Corresponding COBOL Variable is 300-PARA-NAME-2410
	*  @param value
	**/
   public void setParaName2410300(char[] value) {
       value = checkParaName2410300Constraints(value);
       arraycopy(value,0,paraName2410300,0,value.length);
   } 
	public void setParaName2410300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,paraName2410300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of paraName2610300
	 *	@return paraName2610300
	 */
   public char[] getParaName2610300() throws CFException{
   		return paraName2610300;
   }

  
	/**
	*  set variable paraName2610300
	*  Corresponding COBOL Variable is 300-PARA-NAME-2610
	*  @param value
	**/
   public void setParaName2610300(char[] value) {
       value = checkParaName2610300Constraints(value);
       arraycopy(value,0,paraName2610300,0,value.length);
   } 
	public void setParaName2610300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,paraName2610300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of paraName24301300
	 *	@return paraName24301300
	 */
   public char[] getParaName24301300() throws CFException{
   		return paraName24301300;
   }

  
	/**
	*  set variable paraName24301300
	*  Corresponding COBOL Variable is 300-PARA-NAME-2430-1
	*  @param value
	**/
   public void setParaName24301300(char[] value) {
       value = checkParaName24301300Constraints(value);
       arraycopy(value,0,paraName24301300,0,value.length);
   } 
	public void setParaName24301300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,paraName24301300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of paraName8500300
	 *	@return paraName8500300
	 */
   public char[] getParaName8500300() throws CFException{
   		return paraName8500300;
   }

  
	/**
	*  set variable paraName8500300
	*  Corresponding COBOL Variable is 300-PARA-NAME-8500
	*  @param value
	**/
   public void setParaName8500300(char[] value) {
       value = checkParaName8500300Constraints(value);
       arraycopy(value,0,paraName8500300,0,value.length);
   } 
	public void setParaName8500300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,paraName8500300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of paraName1900300
	 *	@return paraName1900300
	 */
   public char[] getParaName1900300() throws CFException{
   		return paraName1900300;
   }

  
	/**
	*  set variable paraName1900300
	*  Corresponding COBOL Variable is 300-PARA-NAME-1900
	*  @param value
	**/
   public void setParaName1900300(char[] value) {
       value = checkParaName1900300Constraints(value);
       arraycopy(value,0,paraName1900300,0,value.length);
   } 
	public void setParaName1900300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,paraName1900300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of paraName2800300
	 *	@return paraName2800300
	 */
   public char[] getParaName2800300() throws CFException{
   		return paraName2800300;
   }

  
	/**
	*  set variable paraName2800300
	*  Corresponding COBOL Variable is 300-PARA-NAME-2800
	*  @param value
	**/
   public void setParaName2800300(char[] value) {
       value = checkParaName2800300Constraints(value);
       arraycopy(value,0,paraName2800300,0,value.length);
   } 
	public void setParaName2800300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,paraName2800300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of paraName3100300
	 *	@return paraName3100300
	 */
   public char[] getParaName3100300() throws CFException{
   		return paraName3100300;
   }

  
	/**
	*  set variable paraName3100300
	*  Corresponding COBOL Variable is 300-PARA-NAME-3100
	*  @param value
	**/
   public void setParaName3100300(char[] value) {
       value = checkParaName3100300Constraints(value);
       arraycopy(value,0,paraName3100300,0,value.length);
   } 
	public void setParaName3100300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,paraName3100300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of fraudMqDebugDispStr600
	 *	@return fraudMqDebugDispStr600
	 */
   public char[] getFraudMqDebugDispStr600() throws CFException{
   		return fraudMqDebugDispStr600;
   }

  
	/**
	*  set variable fraudMqDebugDispStr600
	*  Corresponding COBOL Variable is 600-FRAUD-MQ-DEBUG-DISP-STR
	*  @param value
	**/
   public void setFraudMqDebugDispStr600(char[] value) {
       value = checkFraudMqDebugDispStr600Constraints(value);
       arraycopy(value,0,fraudMqDebugDispStr600,0,value.length);
   } 
	public void setFraudMqDebugDispStr600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,fraudMqDebugDispStr600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of jobNameError600
	 *	@return jobNameError600
	 */
   public char[] getJobNameError600() throws CFException{
   		return jobNameError600;
   }

  
	/**
	*  set variable jobNameError600
	*  Corresponding COBOL Variable is 600-JOB-NAME-ERROR
	*  @param value
	**/
   public void setJobNameError600(char[] value) {
       value = checkJobNameError600Constraints(value);
       arraycopy(value,0,jobNameError600,0,value.length);
   } 
	public void setJobNameError600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,jobNameError600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of jobNumError601
	 *	@return jobNumError601
	 */
   public char[] getJobNumError601() throws CFException{
   		return jobNumError601;
   }

  
	/**
	*  set variable jobNumError601
	*  Corresponding COBOL Variable is 601-JOB-NUM-ERROR
	*  @param value
	**/
   public void setJobNumError601(char[] value) {
       value = checkJobNumError601Constraints(value);
       arraycopy(value,0,jobNumError601,0,value.length);
   } 
	public void setJobNumError601(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,jobNumError601,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of retryCountError602
	 *	@return retryCountError602
	 */
   public char[] getRetryCountError602() throws CFException{
   		return retryCountError602;
   }

  
	/**
	*  set variable retryCountError602
	*  Corresponding COBOL Variable is 602-RETRY-COUNT-ERROR
	*  @param value
	**/
   public void setRetryCountError602(char[] value) {
       value = checkRetryCountError602Constraints(value);
       arraycopy(value,0,retryCountError602,0,value.length);
   } 
	public void setRetryCountError602(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,retryCountError602,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rowsNotFoundErrMsgTxt604
	 *	@return rowsNotFoundErrMsgTxt604
	 */
   public char[] getRowsNotFoundErrMsgTxt604() throws CFException{
   		return rowsNotFoundErrMsgTxt604;
   }

  
	/**
	*  set variable rowsNotFoundErrMsgTxt604
	*  Corresponding COBOL Variable is 604-ROWS-NOT-FOUND-ERR-MSG-TXT
	*  @param value
	**/
   public void setRowsNotFoundErrMsgTxt604(char[] value) {
       value = checkRowsNotFoundErrMsgTxt604Constraints(value);
       arraycopy(value,0,rowsNotFoundErrMsgTxt604,0,value.length);
   } 
	public void setRowsNotFoundErrMsgTxt604(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rowsNotFoundErrMsgTxt604,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tipamrsInsertFailure605
	 *	@return tipamrsInsertFailure605
	 */
   public char[] getTipamrsInsertFailure605() throws CFException{
   		return tipamrsInsertFailure605;
   }

  
	/**
	*  set variable tipamrsInsertFailure605
	*  Corresponding COBOL Variable is 605-TIPAMRS-INSERT-FAILURE
	*  @param value
	**/
   public void setTipamrsInsertFailure605(char[] value) {
       value = checkTipamrsInsertFailure605Constraints(value);
       arraycopy(value,0,tipamrsInsertFailure605,0,value.length);
   } 
	public void setTipamrsInsertFailure605(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tipamrsInsertFailure605,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of lrmIoAbendMsg609
	 *	@return lrmIoAbendMsg609
	 */
   public char[] getLrmIoAbendMsg609() throws CFException{
   		return lrmIoAbendMsg609;
   }

  
	/**
	*  set variable lrmIoAbendMsg609
	*  Corresponding COBOL Variable is 609-LRM-IO-ABEND-MSG
	*  @param value
	**/
   public void setLrmIoAbendMsg609(char[] value) {
       value = checkLrmIoAbendMsg609Constraints(value);
       arraycopy(value,0,lrmIoAbendMsg609,0,value.length);
   } 
	public void setLrmIoAbendMsg609(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,lrmIoAbendMsg609,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of abendPtr800
	 *	@return abendPtr800
	 */
   public char[] getAbendPtr800() throws CFException{
   		return abendPtr800;
   }

  
	/**
	*  set variable abendPtr800
	*  Corresponding COBOL Variable is 800-ABEND-PTR
	*  @param value
	**/
   public void setAbendPtr800(char[] value) {
       value = checkAbendPtr800Constraints(value);
       arraycopy(value,0,abendPtr800,0,value.length);
   } 
	public void setAbendPtr800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,abendPtr800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ptrIp081110800
	 *	@return ptrIp081110800
	 */
   public char[] getPtrIp081110800() throws CFException{
   		return ptrIp081110800;
   }

  
	/**
	*  set variable ptrIp081110800
	*  Corresponding COBOL Variable is 800-PTR-IP081110
	*  @param value
	**/
   public void setPtrIp081110800(char[] value) {
       value = checkPtrIp081110800Constraints(value);
       arraycopy(value,0,ptrIp081110800,0,value.length);
   } 
	public void setPtrIp081110800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp081110800,0,beginIndex + endIndex);
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
	 *	Returns the value of ptrIp586010800
	 *	@return ptrIp586010800
	 */
   public char[] getPtrIp586010800() throws CFException{
   		return ptrIp586010800;
   }

  
	/**
	*  set variable ptrIp586010800
	*  Corresponding COBOL Variable is 800-PTR-IP586010
	*  @param value
	**/
   public void setPtrIp586010800(char[] value) {
       value = checkPtrIp586010800Constraints(value);
       arraycopy(value,0,ptrIp586010800,0,value.length);
   } 
	public void setPtrIp586010800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp586010800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ptrIp599810800
	 *	@return ptrIp599810800
	 */
   public char[] getPtrIp599810800() throws CFException{
   		return ptrIp599810800;
   }

  
	/**
	*  set variable ptrIp599810800
	*  Corresponding COBOL Variable is 800-PTR-IP599810
	*  @param value
	**/
   public void setPtrIp599810800(char[] value) {
       value = checkPtrIp599810800Constraints(value);
       arraycopy(value,0,ptrIp599810800,0,value.length);
   } 
	public void setPtrIp599810800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp599810800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ptrIp595210800
	 *	@return ptrIp595210800
	 */
   public char[] getPtrIp595210800() throws CFException{
   		return ptrIp595210800;
   }

  
	/**
	*  set variable ptrIp595210800
	*  Corresponding COBOL Variable is 800-PTR-IP595210
	*  @param value
	**/
   public void setPtrIp595210800(char[] value) {
       value = checkPtrIp595210800Constraints(value);
       arraycopy(value,0,ptrIp595210800,0,value.length);
   } 
	public void setPtrIp595210800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp595210800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ptrIp648010800
	 *	@return ptrIp648010800
	 */
   public char[] getPtrIp648010800() throws CFException{
   		return ptrIp648010800;
   }

  
	/**
	*  set variable ptrIp648010800
	*  Corresponding COBOL Variable is 800-PTR-IP648010
	*  @param value
	**/
   public void setPtrIp648010800(char[] value) {
       value = checkPtrIp648010800Constraints(value);
       arraycopy(value,0,ptrIp648010800,0,value.length);
   } 
	public void setPtrIp648010800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp648010800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ptrIp708020800
	 *	@return ptrIp708020800
	 */
   public char[] getPtrIp708020800() throws CFException{
   		return ptrIp708020800;
   }

  
	/**
	*  set variable ptrIp708020800
	*  Corresponding COBOL Variable is 800-PTR-IP708020
	*  @param value
	**/
   public void setPtrIp708020800(char[] value) {
       value = checkPtrIp708020800Constraints(value);
       arraycopy(value,0,ptrIp708020800,0,value.length);
   } 
	public void setPtrIp708020800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp708020800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ptrIp703020800
	 *	@return ptrIp703020800
	 */
   public char[] getPtrIp703020800() throws CFException{
   		return ptrIp703020800;
   }

  
	/**
	*  set variable ptrIp703020800
	*  Corresponding COBOL Variable is 800-PTR-IP703020
	*  @param value
	**/
   public void setPtrIp703020800(char[] value) {
       value = checkPtrIp703020800Constraints(value);
       arraycopy(value,0,ptrIp703020800,0,value.length);
   } 
	public void setPtrIp703020800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp703020800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ptrIp890110800
	 *	@return ptrIp890110800
	 */
   public char[] getPtrIp890110800() throws CFException{
   		return ptrIp890110800;
   }

  
	/**
	*  set variable ptrIp890110800
	*  Corresponding COBOL Variable is 800-PTR-IP890110
	*  @param value
	**/
   public void setPtrIp890110800(char[] value) {
       value = checkPtrIp890110800Constraints(value);
       arraycopy(value,0,ptrIp890110800,0,value.length);
   } 
	public void setPtrIp890110800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp890110800,0,beginIndex + endIndex);
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
	/**
	 *	Returns the value of ptrIp996020800
	 *	@return ptrIp996020800
	 */
   public char[] getPtrIp996020800() throws CFException{
   		return ptrIp996020800;
   }

  
	/**
	*  set variable ptrIp996020800
	*  Corresponding COBOL Variable is 800-PTR-IP996020
	*  @param value
	**/
   public void setPtrIp996020800(char[] value) {
       value = checkPtrIp996020800Constraints(value);
       arraycopy(value,0,ptrIp996020800,0,value.length);
   } 
	public void setPtrIp996020800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp996020800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ptrIp521010800
	 *	@return ptrIp521010800
	 */
   public char[] getPtrIp521010800() throws CFException{
   		return ptrIp521010800;
   }

  
	/**
	*  set variable ptrIp521010800
	*  Corresponding COBOL Variable is 800-PTR-IP521010
	*  @param value
	**/
   public void setPtrIp521010800(char[] value) {
       value = checkPtrIp521010800Constraints(value);
       arraycopy(value,0,ptrIp521010800,0,value.length);
   } 
	public void setPtrIp521010800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp521010800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ptrIp708010800
	 *	@return ptrIp708010800
	 */
   public char[] getPtrIp708010800() throws CFException{
   		return ptrIp708010800;
   }

  
	/**
	*  set variable ptrIp708010800
	*  Corresponding COBOL Variable is 800-PTR-IP708010
	*  @param value
	**/
   public void setPtrIp708010800(char[] value) {
       value = checkPtrIp708010800Constraints(value);
       arraycopy(value,0,ptrIp708010800,0,value.length);
   } 
	public void setPtrIp708010800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp708010800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of start800
	 *	@return start800
	 */
	public int getStart800() throws CFException {
   		return start800;
	}
	
	/**
	 * 	Update Start800 with the passed value
	 *  Corresponding COBOL Variable is 800-START
	 *	@param number
	 */
	public void setStart800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    start800 = checkStart800MaxLimit(number); 
	}


	public void setStart800(long number) {
	    number = checkStart800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setStart800((int)number);
	}
	
	/**
	 *	Returns the value of end800
	 *	@return end800
	 */
	public int getEnd800() throws CFException {
   		return end800;
	}
	
	/**
	 * 	Update End800 with the passed value
	 *  Corresponding COBOL Variable is 800-END
	 *	@param number
	 */
	public void setEnd800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    end800 = checkEnd800MaxLimit(number); 
	}


	public void setEnd800(long number) {
	    number = checkEnd800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setEnd800((int)number);
	}
	
	/**
	 *	Returns the value of clrCyclId800
	 *	@return clrCyclId800
	 */
	public int getClrCyclId800() throws CFException {
       if (isClrCyclId800Modified()) { 
           clrCyclId800 = refreshClrCyclId800();
        }
   		return clrCyclId800;
	}
	

	
	   
	/**
	 * 	Update ClrCyclId800 with the passed value
	 *  Corresponding COBOL Variable is 800-CLR-CYCL-ID
	 *	@param number
	 */
	public void setClrCyclId800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    clrCyclId800 = checkClrCyclId800MaxLimit(number); 
		serializeClrCyclId800(clrCyclId800);
	}
	

	public void setClrCyclId800(long number) {
	    number = checkClrCyclId800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setClrCyclId800((int)number);
	}
	
	/**
	 * 	Update ClrCyclId800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setClrCyclId800(char[] value) throws CFException {
		 clrCyclId800 = serializeClrCyclId800(value);
	}
	/**
	 * 	Update ClrCyclId800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setClrCyclId800String(char[] value) throws CFException {
		 setClrCyclId800(value);
	}
	/**
	 *	Returns the value of prevClrCyclId800
	 *	@return prevClrCyclId800
	 */
	public int getPrevClrCyclId800() throws CFException {
       if (isPrevClrCyclId800Modified()) { 
           prevClrCyclId800 = refreshPrevClrCyclId800();
        }
   		return prevClrCyclId800;
	}
	

	
	   
	/**
	 * 	Update PrevClrCyclId800 with the passed value
	 *  Corresponding COBOL Variable is 800-PREV-CLR-CYCL-ID
	 *	@param number
	 */
	public void setPrevClrCyclId800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    prevClrCyclId800 = checkPrevClrCyclId800MaxLimit(number); 
		serializePrevClrCyclId800(prevClrCyclId800);
	}
	

	public void setPrevClrCyclId800(long number) {
	    number = checkPrevClrCyclId800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setPrevClrCyclId800((int)number);
	}
	
	/**
	 * 	Update PrevClrCyclId800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPrevClrCyclId800(char[] value) throws CFException {
		 prevClrCyclId800 = serializePrevClrCyclId800(value);
	}
	/**
	 * 	Update PrevClrCyclId800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPrevClrCyclId800String(char[] value) throws CFException {
		 setPrevClrCyclId800(value);
	}
	/**
	 *	Returns the value of mqRespCd800
	 *	@return mqRespCd800
	 */
   public char[] getMqRespCd800() throws CFException{
   		return mqRespCd800;
   }

  
	/**
	*  set variable mqRespCd800
	*  Corresponding COBOL Variable is 800-MQ-RESP-CD
	*  @param value
	**/
   public void setMqRespCd800(char[] value) {
       value = checkMqRespCd800Constraints(value);
       arraycopy(value,0,mqRespCd800,0,value.length);
   } 
	public void setMqRespCd800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,mqRespCd800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of facreqJobgrpName800
	 *	@return facreqJobgrpName800
	 */
   public char[] getFacreqJobgrpName800() throws CFException{
   		return facreqJobgrpName800;
   }

  
	/**
	*  set variable facreqJobgrpName800
	*  Corresponding COBOL Variable is 800-FACREQ-JOBGRP-NAME
	*  @param value
	**/
   public void setFacreqJobgrpName800(char[] value) {
       value = checkFacreqJobgrpName800Constraints(value);
       arraycopy(value,0,facreqJobgrpName800,0,value.length);
   } 
	public void setFacreqJobgrpName800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,facreqJobgrpName800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of jobname800
	 *	@return jobname800
	 */
   public char[] getJobname800() throws CFException{
   		return jobname800;
   }

  
	/**
	*  set variable jobname800
	*  Corresponding COBOL Variable is 800-JOBNAME
	*  @param value
	**/
   public void setJobname800(char[] value) {
       value = checkJobname800Constraints(value);
       arraycopy(value,0,jobname800,0,value.length);
   } 
	public void setJobname800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,jobname800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of mrsIsrtCount800
	 *	@return mrsIsrtCount800
	 */
	public int getMrsIsrtCount800() throws CFException {
   		return mrsIsrtCount800;
	}
	
	/**
	 * 	Update MrsIsrtCount800 with the passed value
	 *  Corresponding COBOL Variable is 800-MRS-ISRT-COUNT
	 *	@param number
	 */
	public void setMrsIsrtCount800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mrsIsrtCount800 = checkMrsIsrtCount800MaxLimit(number); 
	}


	public void setMrsIsrtCount800(long number) {
	    number = checkMrsIsrtCount800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setMrsIsrtCount800((int)number);
	}
	
	/**
	 *	Returns the value of mqputSkipCount800
	 *	@return mqputSkipCount800
	 */
	public int getMqputSkipCount800() throws CFException {
   		return mqputSkipCount800;
	}
	
	/**
	 * 	Update MqputSkipCount800 with the passed value
	 *  Corresponding COBOL Variable is 800-MQPUT-SKIP-COUNT
	 *	@param number
	 */
	public void setMqputSkipCount800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqputSkipCount800 = checkMqputSkipCount800MaxLimit(number); 
	}


	public void setMqputSkipCount800(long number) {
	    number = checkMqputSkipCount800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqputSkipCount800((int)number);
	}
	
	/**
	 *	Returns the value of tipamrsSkipCount800
	 *	@return tipamrsSkipCount800
	 */
	public int getTipamrsSkipCount800() throws CFException {
   		return tipamrsSkipCount800;
	}
	
	/**
	 * 	Update TipamrsSkipCount800 with the passed value
	 *  Corresponding COBOL Variable is 800-TIPAMRS-SKIP-COUNT
	 *	@param number
	 */
	public void setTipamrsSkipCount800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    tipamrsSkipCount800 = checkTipamrsSkipCount800MaxLimit(number); 
	}


	public void setTipamrsSkipCount800(long number) {
	    number = checkTipamrsSkipCount800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTipamrsSkipCount800((int)number);
	}
	
	/**
	 *	Returns the value of mqgetFailCount800
	 *	@return mqgetFailCount800
	 */
	public int getMqgetFailCount800() throws CFException {
   		return mqgetFailCount800;
	}
	
	/**
	 * 	Update MqgetFailCount800 with the passed value
	 *  Corresponding COBOL Variable is 800-MQGET-FAIL-COUNT
	 *	@param number
	 */
	public void setMqgetFailCount800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqgetFailCount800 = checkMqgetFailCount800MaxLimit(number); 
	}


	public void setMqgetFailCount800(long number) {
	    number = checkMqgetFailCount800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqgetFailCount800((int)number);
	}
	
	/**
	 *	Returns the value of mqputFailCount800
	 *	@return mqputFailCount800
	 */
	public int getMqputFailCount800() throws CFException {
   		return mqputFailCount800;
	}
	
	/**
	 * 	Update MqputFailCount800 with the passed value
	 *  Corresponding COBOL Variable is 800-MQPUT-FAIL-COUNT
	 *	@param number
	 */
	public void setMqputFailCount800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqputFailCount800 = checkMqputFailCount800MaxLimit(number); 
	}


	public void setMqputFailCount800(long number) {
	    number = checkMqputFailCount800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqputFailCount800((int)number);
	}
	
	/**
	 *	Returns the value of faaFacNotFndCnt800
	 *	@return faaFacNotFndCnt800
	 */
	public int getFaaFacNotFndCnt800() throws CFException {
   		return faaFacNotFndCnt800;
	}
	
	/**
	 * 	Update FaaFacNotFndCnt800 with the passed value
	 *  Corresponding COBOL Variable is 800-FAA-FAC-NOT-FND-CNT
	 *	@param number
	 */
	public void setFaaFacNotFndCnt800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    faaFacNotFndCnt800 = checkFaaFacNotFndCnt800MaxLimit(number); 
	}


	public void setFaaFacNotFndCnt800(long number) {
	    number = checkFaaFacNotFndCnt800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setFaaFacNotFndCnt800((int)number);
	}
	
	/**
	 *	Returns the value of lnRespDebugInd800
	 *	@return lnRespDebugInd800
	 */
   public char[] getLnRespDebugInd800() throws CFException{
   		return lnRespDebugInd800;
   }

  
	/**
	*  set variable lnRespDebugInd800
	*  Corresponding COBOL Variable is 800-LN-RESP-DEBUG-IND
	*  @param value
	**/
   public void setLnRespDebugInd800(char[] value) {
       value = checkLnRespDebugInd800Constraints(value);
       arraycopy(value,0,lnRespDebugInd800,0,value.length);
   } 
	public void setLnRespDebugInd800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,lnRespDebugInd800,0,beginIndex + endIndex);
   }
	char[] respDebugIndY8880088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isRespDebugIndY88800()
	 *	@return  Returns true if isRespDebugIndY88800() is "Y"
	 */
   public boolean isRespDebugIndY88800() throws CFException {
      return (  compareChars( getLnRespDebugInd800() , respDebugIndY8880088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setRespDebugIndY88800True() {  			
    	setLnRespDebugInd800( respDebugIndY8880088Value);
   	}
	char[] respDebugIndN8880088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isRespDebugIndN88800()
	 *	@return  Returns true if isRespDebugIndN88800() is "N"
	 */
   public boolean isRespDebugIndN88800() throws CFException {
      return (  compareChars( getLnRespDebugInd800() , respDebugIndN8880088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setRespDebugIndN88800True() {  			
    	setLnRespDebugInd800( respDebugIndN8880088Value);
   	}
	/**
	 *	Returns the value of sys201Status800
	 *	@return sys201Status800
	 */
   public char[] getSys201Status800() throws CFException{
   		return sys201Status800;
   }

  
	/**
	*  set variable sys201Status800
	*  Corresponding COBOL Variable is 800-SYS201-STATUS
	*  @param value
	**/
   public void setSys201Status800(char[] value) {
       value = checkSys201Status800Constraints(value);
       arraycopy(value,0,sys201Status800,0,value.length);
   } 
	public void setSys201Status800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sys201Status800,0,beginIndex + endIndex);
   }
	char[] sys201IoGood8008888Value = "00".toCharArray();
	/**
	 *	Test condition "00" for isSys201IoGood80088()
	 *	@return  Returns true if isSys201IoGood80088() is "00"
	 */
   public boolean isSys201IoGood80088() throws CFException {
      return (  compareChars( getSys201Status800() , sys201IoGood8008888Value)  == 0  );
   }


	/**
	*  set values "00"
	*/
   	public void setSys201IoGood80088True() {  			
    	setSys201Status800( sys201IoGood8008888Value);
   	}
	char[] sys201Eof8008888Value = "10".toCharArray();
	/**
	 *	Test condition "10" for isSys201Eof80088()
	 *	@return  Returns true if isSys201Eof80088() is "10"
	 */
   public boolean isSys201Eof80088() throws CFException {
      return (  compareChars( getSys201Status800() , sys201Eof8008888Value)  == 0  );
   }


	/**
	*  set values "10"
	*/
   	public void setSys201Eof80088True() {  			
    	setSys201Status800( sys201Eof8008888Value);
   	}
	/**
	 *	Returns the value of skipFlag800
	 *	@return skipFlag800
	 */
   public char[] getSkipFlag800() throws CFException{
   		return skipFlag800;
   }

  
	/**
	*  set variable skipFlag800
	*  Corresponding COBOL Variable is 800-SKIP-FLAG
	*  @param value
	**/
   public void setSkipFlag800(char[] value) {
       value = checkSkipFlag800Constraints(value);
       arraycopy(value,0,skipFlag800,0,value.length);
   } 
	public void setSkipFlag800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,skipFlag800,0,beginIndex + endIndex);
   }
	char[] skipFlagN8880088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isSkipFlagN88800()
	 *	@return  Returns true if isSkipFlagN88800() is "N"
	 */
   public boolean isSkipFlagN88800() throws CFException {
      return (  compareChars( getSkipFlag800() , skipFlagN8880088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setSkipFlagN88800True() {  			
    	setSkipFlag800( skipFlagN8880088Value);
   	}
	char[] skipFlagY8880088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isSkipFlagY88800()
	 *	@return  Returns true if isSkipFlagY88800() is "Y"
	 */
   public boolean isSkipFlagY88800() throws CFException {
      return (  compareChars( getSkipFlag800() , skipFlagY8880088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setSkipFlagY88800True() {  			
    	setSkipFlag800( skipFlagY8880088Value);
   	}

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
