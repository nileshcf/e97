package com.cloudframe.app.ip343690.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:31. using version 5.0.0.254
**/


import com.cloudframe.app.ip343690.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

						private char[] isItTheFirstTime100 = new char[1];

						private char[] isEndOfProcess100 = new char[1];

						private char[] eofPmaCursor100 = new char[1];

						private char[] isItDeadLock100 = new char[1];

						private char[] seqNumberOpt100 = new char[1];

						private char[] isItSqlError100 = new char[1];

						private char[] sys001FileStatus200 = new char[2];

						private char[] abendCode300 = new char[4];

						private char[] abendPara300 = new char[30];

						private char[] para1400300 = new char[30];

						private char[] para3210300 = new char[30];

						private char[] para3220300 = new char[30];

						private char[] para3230300 = new char[30];

						private char[] para8100300 = new char[30];

						private char[] para8200300 = new char[30];

						private char[] para8210300 = new char[30];

								private long recsRead400;

						private char[] abendMessage600 = new char[42];

						private char[] msg3005b600 = new char[50];

						private char[] msg3005c600 = new char[50];

						private char[] msg3005d600 = new char[50];

						private char[] msg3005e600 = new char[50];

						private char[] msg3010600 = new char[18];

						private char[] blankSpace600 = new char[1];

						private char[] asteriskLine600 = new char[45];

						private char[] db2ErrModuleMsg600 = new char[45];

						private char[] db2Deadlock600 = new char[63];

						private char[] db2DeadlockRel600 = new char[57];

						private char[] recsReadMsg600 = new char[40];

						private char[] recsUpdatedMsg600 = new char[40];

						private char[] ptrIp081110800 = new char[8];

						private char[] ptrIp599810800 = new char[8];

						private char[] ptrIp280010800 = new char[8];

						private char[] ptrIp610010800 = new char[8];

						private char[] ptrIp996010800 = new char[8];

						private char[] ptrMcwait800 = new char[8];

								private long noOfRows800;

								private long commitRows800;

								private short actualLen800;

						private char[] justifyIn800 = new char[19];

						private char[] justifyOut800 = new char[19];

						private char[] nonSpaceFound800 = new char[1];

						private char[] astriskLine900 = new char[35];

						private char[] abendAbend900 = new char[35];

						private char[] abendAbendPgm900 = new char[35];

						private char[] db85102cDb2BatchErrorRtn = new char[8];

						private char[] sqlTemp = Field.fillLowValue(128);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIsItTheFirstTime100(("Y").toCharArray());
								setIsEndOfProcess100(("N").toCharArray());
								setEofPmaCursor100(fillSpace(1));
								setIsItDeadLock100(("Y").toCharArray());
								setSeqNumberOpt100(("N").toCharArray());
								setIsItSqlError100(fillSpace(1));
								setSys001FileStatus200(fillSpace(2));
								setAbendCode300(fillSpace(4));
								setAbendPara300(fillSpace(30));
								setPara1400300(("1400-OPEN-INPUT-SYS001        ").toCharArray());
								setPara3210300(("3210-OPEN-PMA-CURSOR          ").toCharArray());
								setPara3220300(("3220-FETCH-UPDATE-PMA-CURSOR  ").toCharArray());
								setPara3230300(("3230-CLOSE-PMA-CURSOR         ").toCharArray());
								setPara8100300(("8100-CHECK-STATUS-MAP         ").toCharArray());
								setPara8200300(("8200-READ-INPUT-SYS001        ").toCharArray());
								setPara8210300(("8210-CLOSE-INPUT-SYS001       ").toCharArray());
								setRecsRead400(0L);
								setAbendMessage600(fillSpace(42));
								setMsg3005b600(("DB2 - RETRIEVE SERVER ERROR.                      ").toCharArray());
								setMsg3005c600(("DB2 - DATABASE MISMATCH.                          ").toCharArray());
								setMsg3005d600(("DB2 - USER INVALID.                               ").toCharArray());
								setMsg3005e600(("DB2 - CURRENT SQLID.                              ").toCharArray());
								setMsg3010600((" DB2 UPDATE ERROR ").toCharArray());
								setBlankSpace600(fillSpace(1));
								setAsteriskLine600(String.join("", java.util.Collections.nCopies(45, "*")).toCharArray());
								setDb2ErrModuleMsg600(("**RTN CODE FROM DB200020:                    ").toCharArray());
								setDb2Deadlock600("**INITIATING DEADLOCK PREVENTION PROCEDURES**                  ".toCharArray());
								setDb2DeadlockRel600(("**DEADLOCK DUE TO CONTENTION RELIEVED**                  ").toCharArray());
								setRecsReadMsg600(("NUMBER OF RECORDS READ FROM SYS001 =>   ").toCharArray());
								setRecsUpdatedMsg600(("NO. OF ROWS UPDATED IN TIPAPMA     =>   ").toCharArray());
								setPtrIp081110800(("IP081110").toCharArray());
								setPtrIp599810800(("IP599810").toCharArray());
								setPtrIp280010800(("IP280010").toCharArray());
								setPtrIp610010800(("IP610010").toCharArray());
								setPtrIp996010800(("IP996010").toCharArray());
								setPtrMcwait800(("MCWAIT  ").toCharArray());
								setNoOfRows800(0L);
								setCommitRows800(0L);
								setActualLen800((short)0);
								setJustifyIn800(fillSpace(19));
								setJustifyOut800(fillSpace(19));
								setNonSpaceFound800(("N").toCharArray());
								setAstriskLine900(("***********************************").toCharArray());
								setAbendAbend900(("A B E N D   A B E N D   A B E N D  ").toCharArray());
								setAbendAbendPgm900(("A B E N D   I P 3 4 3 6 9 0        ").toCharArray());
								setDb85102cDb2BatchErrorRtn(("DB200020").toCharArray());
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
	 *	Returns the value of isEndOfProcess100
	 *	@return isEndOfProcess100
	 */
   public char[] getIsEndOfProcess100() throws CFException{
   		return isEndOfProcess100;
   }

  
	/**
	*  set variable isEndOfProcess100
	*  Corresponding COBOL Variable is 100-IS-END-OF-PROCESS
	*  @param value
	**/
   public void setIsEndOfProcess100(char[] value) {
       value = checkIsEndOfProcess100Constraints(value);
       arraycopy(value,0,isEndOfProcess100,0,value.length);
   } 
	public void setIsEndOfProcess100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,isEndOfProcess100,0,beginIndex + endIndex);
   }
	char[] endOfProcess8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isEndOfProcess88100()
	 *	@return  Returns true if isEndOfProcess88100() is "Y"
	 */
   public boolean isEndOfProcess88100() throws CFException {
      return (  compareChars( getIsEndOfProcess100() , endOfProcess8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setEndOfProcess88100True() {  			
    	setIsEndOfProcess100( endOfProcess8810088Value);
   	}
	/**
	 *	Returns the value of eofPmaCursor100
	 *	@return eofPmaCursor100
	 */
   public char[] getEofPmaCursor100() throws CFException{
   		return eofPmaCursor100;
   }

  
	/**
	*  set variable eofPmaCursor100
	*  Corresponding COBOL Variable is 100-EOF-PMA-CURSOR
	*  @param value
	**/
   public void setEofPmaCursor100(char[] value) {
       value = checkEofPmaCursor100Constraints(value);
       arraycopy(value,0,eofPmaCursor100,0,value.length);
   } 
	public void setEofPmaCursor100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,eofPmaCursor100,0,beginIndex + endIndex);
   }
	char[] eofPmaCursor8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isEofPmaCursor88100()
	 *	@return  Returns true if isEofPmaCursor88100() is "Y"
	 */
   public boolean isEofPmaCursor88100() throws CFException {
      return (  compareChars( getEofPmaCursor100() , eofPmaCursor8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setEofPmaCursor88100True() {  			
    	setEofPmaCursor100( eofPmaCursor8810088Value);
   	}
	/**
	 *	Returns the value of isItDeadLock100
	 *	@return isItDeadLock100
	 */
   public char[] getIsItDeadLock100() throws CFException{
   		return isItDeadLock100;
   }

  
	/**
	*  set variable isItDeadLock100
	*  Corresponding COBOL Variable is 100-IS-IT-DEAD-LOCK
	*  @param value
	**/
   public void setIsItDeadLock100(char[] value) {
       value = checkIsItDeadLock100Constraints(value);
       arraycopy(value,0,isItDeadLock100,0,value.length);
   } 
	public void setIsItDeadLock100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,isItDeadLock100,0,beginIndex + endIndex);
   }
	char[] itIsDeadLockY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isItIsDeadLockY88()
	 *	@return  Returns true if isItIsDeadLockY88() is "Y"
	 */
   public boolean isItIsDeadLockY88() throws CFException {
      return (  compareChars( getIsItDeadLock100() , itIsDeadLockY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setItIsDeadLockY88True() {  			
    	setIsItDeadLock100( itIsDeadLockY8888Value);
   	}
	char[] itIsDeadLockN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isItIsDeadLockN88()
	 *	@return  Returns true if isItIsDeadLockN88() is "N"
	 */
   public boolean isItIsDeadLockN88() throws CFException {
      return (  compareChars( getIsItDeadLock100() , itIsDeadLockN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setItIsDeadLockN88True() {  			
    	setIsItDeadLock100( itIsDeadLockN8888Value);
   	}
	/**
	 *	Returns the value of seqNumberOpt100
	 *	@return seqNumberOpt100
	 */
   public char[] getSeqNumberOpt100() throws CFException{
   		return seqNumberOpt100;
   }

  
	/**
	*  set variable seqNumberOpt100
	*  Corresponding COBOL Variable is 100-SEQ-NUMBER-OPT
	*  @param value
	**/
   public void setSeqNumberOpt100(char[] value) {
       value = checkSeqNumberOpt100Constraints(value);
       arraycopy(value,0,seqNumberOpt100,0,value.length);
   } 
	public void setSeqNumberOpt100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,seqNumberOpt100,0,beginIndex + endIndex);
   }
	char[] seqOptIn8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isSeqOptIn88100()
	 *	@return  Returns true if isSeqOptIn88100() is "Y"
	 */
   public boolean isSeqOptIn88100() throws CFException {
      return (  compareChars( getSeqNumberOpt100() , seqOptIn8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setSeqOptIn88100True() {  			
    	setSeqNumberOpt100( seqOptIn8810088Value);
   	}
	char[] seqOptOut8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isSeqOptOut88100()
	 *	@return  Returns true if isSeqOptOut88100() is "N"
	 */
   public boolean isSeqOptOut88100() throws CFException {
      return (  compareChars( getSeqNumberOpt100() , seqOptOut8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setSeqOptOut88100True() {  			
    	setSeqNumberOpt100( seqOptOut8810088Value);
   	}
	/**
	 *	Returns the value of isItSqlError100
	 *	@return isItSqlError100
	 */
   public char[] getIsItSqlError100() throws CFException{
   		return isItSqlError100;
   }

  
	/**
	*  set variable isItSqlError100
	*  Corresponding COBOL Variable is 100-IS-IT-SQL-ERROR
	*  @param value
	**/
   public void setIsItSqlError100(char[] value) {
       value = checkIsItSqlError100Constraints(value);
       arraycopy(value,0,isItSqlError100,0,value.length);
   } 
	public void setIsItSqlError100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,isItSqlError100,0,beginIndex + endIndex);
   }
	char[] itIsSqlError8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isItIsSqlError88100()
	 *	@return  Returns true if isItIsSqlError88100() is "Y"
	 */
   public boolean isItIsSqlError88100() throws CFException {
      return (  compareChars( getIsItSqlError100() , itIsSqlError8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setItIsSqlError88100True() {  			
    	setIsItSqlError100( itIsSqlError8810088Value);
   	}
	/**
	 *	Returns the value of sys001FileStatus200
	 *	@return sys001FileStatus200
	 */
   public char[] getSys001FileStatus200() throws CFException{
   		return sys001FileStatus200;
   }

  
	/**
	*  set variable sys001FileStatus200
	*  Corresponding COBOL Variable is 200-SYS001-FILE-STATUS
	*  @param value
	**/
   public void setSys001FileStatus200(char[] value) {
       value = checkSys001FileStatus200Constraints(value);
       arraycopy(value,0,sys001FileStatus200,0,value.length);
   } 
	public void setSys001FileStatus200(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sys001FileStatus200,0,beginIndex + endIndex);
   }
	char[] sys001StatusGood8820088Value = "00".toCharArray();
	/**
	 *	Test condition "00" for isSys001StatusGood88200()
	 *	@return  Returns true if isSys001StatusGood88200() is "00"
	 */
   public boolean isSys001StatusGood88200() throws CFException {
      return (  compareChars( getSys001FileStatus200() , sys001StatusGood8820088Value)  == 0  );
   }


	/**
	*  set values "00"
	*/
   	public void setSys001StatusGood88200True() {  			
    	setSys001FileStatus200( sys001StatusGood8820088Value);
   	}
	char[] sys001StatusEof8820088Value = "10".toCharArray();
	/**
	 *	Test condition "10" for isSys001StatusEof88200()
	 *	@return  Returns true if isSys001StatusEof88200() is "10"
	 */
   public boolean isSys001StatusEof88200() throws CFException {
      return (  compareChars( getSys001FileStatus200() , sys001StatusEof8820088Value)  == 0  );
   }


	/**
	*  set values "10"
	*/
   	public void setSys001StatusEof88200True() {  			
    	setSys001FileStatus200( sys001StatusEof8820088Value);
   	}
	/**
	 *	Returns the value of abendCode300
	 *	@return abendCode300
	 */
   public char[] getAbendCode300() throws CFException{
   		return abendCode300;
   }

  
	/**
	*  set variable abendCode300
	*  Corresponding COBOL Variable is 300-ABEND-CODE
	*  @param value
	**/
   public void setAbendCode300(char[] value) {
       value = checkAbendCode300Constraints(value);
       arraycopy(value,0,abendCode300,0,value.length);
   } 
	public void setAbendCode300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,abendCode300,0,beginIndex + endIndex);
   }
	char[] db2UnsucessRollback8830088Value = "3013".toCharArray();
	/**
	 *	Test condition "3013" for isDb2UnsucessRollback88300()
	 *	@return  Returns true if isDb2UnsucessRollback88300() is "3013"
	 */
   public boolean isDb2UnsucessRollback88300() throws CFException {
      return (  compareChars( getAbendCode300() , db2UnsucessRollback8830088Value)  == 0  );
   }


	/**
	*  set values "3013"
	*/
   	public void setDb2UnsucessRollback88300True() {  			
    	setAbendCode300( db2UnsucessRollback8830088Value);
   	}
	char[] db2UnsucessConnect8830088Value = "3014".toCharArray();
	/**
	 *	Test condition "3014" for isDb2UnsucessConnect88300()
	 *	@return  Returns true if isDb2UnsucessConnect88300() is "3014"
	 */
   public boolean isDb2UnsucessConnect88300() throws CFException {
      return (  compareChars( getAbendCode300() , db2UnsucessConnect8830088Value)  == 0  );
   }


	/**
	*  set values "3014"
	*/
   	public void setDb2UnsucessConnect88300True() {  			
    	setAbendCode300( db2UnsucessConnect8830088Value);
   	}
	/**
	 *	Returns the value of abendPara300
	 *	@return abendPara300
	 */
   public char[] getAbendPara300() throws CFException{
   		return abendPara300;
   }

  
	/**
	*  set variable abendPara300
	*  Corresponding COBOL Variable is 300-ABEND-PARA
	*  @param value
	**/
   public void setAbendPara300(char[] value) {
       value = checkAbendPara300Constraints(value);
       arraycopy(value,0,abendPara300,0,value.length);
   } 
	public void setAbendPara300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,abendPara300,0,beginIndex + endIndex);
   }
	char[] db2Abend2000Para8830088Value = "2000-CONNECT-TO-DB2           ".toCharArray();
	/**
	 *	Test condition "2000-CONNECT-TO-DB2       " for isDb2Abend2000Para88300()
	 *	@return  Returns true if isDb2Abend2000Para88300() is "2000-CONNECT-TO-DB2       "
	 */
   public boolean isDb2Abend2000Para88300() throws CFException {
      return (  compareChars( getAbendPara300() , db2Abend2000Para8830088Value)  == 0  );
   }


	/**
	*  set values "2000-CONNECT-TO-DB2       "
	*/
   	public void setDb2Abend2000Para88300True() {  			
    	setAbendPara300( db2Abend2000Para8830088Value);
   	}
	char[] db2DeadLockPara8830088Value = "9100-DEAD-LOCK                ".toCharArray();
	/**
	 *	Test condition "9100-DEAD-LOCK            " for isDb2DeadLockPara88300()
	 *	@return  Returns true if isDb2DeadLockPara88300() is "9100-DEAD-LOCK            "
	 */
   public boolean isDb2DeadLockPara88300() throws CFException {
      return (  compareChars( getAbendPara300() , db2DeadLockPara8830088Value)  == 0  );
   }


	/**
	*  set values "9100-DEAD-LOCK            "
	*/
   	public void setDb2DeadLockPara88300True() {  			
    	setAbendPara300( db2DeadLockPara8830088Value);
   	}
	char[] db2UpdatePara8830088Value = "8300-UPDATE-PMA-CURSOR        ".toCharArray();
	/**
	 *	Test condition "8300-UPDATE-PMA-CURSOR    " for isDb2UpdatePara88300()
	 *	@return  Returns true if isDb2UpdatePara88300() is "8300-UPDATE-PMA-CURSOR    "
	 */
   public boolean isDb2UpdatePara88300() throws CFException {
      return (  compareChars( getAbendPara300() , db2UpdatePara8830088Value)  == 0  );
   }


	/**
	*  set values "8300-UPDATE-PMA-CURSOR    "
	*/
   	public void setDb2UpdatePara88300True() {  			
    	setAbendPara300( db2UpdatePara8830088Value);
   	}
	/**
	 *	Returns the value of para1400300
	 *	@return para1400300
	 */
   public char[] getPara1400300() throws CFException{
   		return para1400300;
   }

  
	/**
	*  set variable para1400300
	*  Corresponding COBOL Variable is 300-PARA-1400
	*  @param value
	**/
   public void setPara1400300(char[] value) {
       value = checkPara1400300Constraints(value);
       arraycopy(value,0,para1400300,0,value.length);
   } 
	public void setPara1400300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para1400300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of para3210300
	 *	@return para3210300
	 */
   public char[] getPara3210300() throws CFException{
   		return para3210300;
   }

  
	/**
	*  set variable para3210300
	*  Corresponding COBOL Variable is 300-PARA-3210
	*  @param value
	**/
   public void setPara3210300(char[] value) {
       value = checkPara3210300Constraints(value);
       arraycopy(value,0,para3210300,0,value.length);
   } 
	public void setPara3210300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para3210300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of para3220300
	 *	@return para3220300
	 */
   public char[] getPara3220300() throws CFException{
   		return para3220300;
   }

  
	/**
	*  set variable para3220300
	*  Corresponding COBOL Variable is 300-PARA-3220
	*  @param value
	**/
   public void setPara3220300(char[] value) {
       value = checkPara3220300Constraints(value);
       arraycopy(value,0,para3220300,0,value.length);
   } 
	public void setPara3220300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para3220300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of para3230300
	 *	@return para3230300
	 */
   public char[] getPara3230300() throws CFException{
   		return para3230300;
   }

  
	/**
	*  set variable para3230300
	*  Corresponding COBOL Variable is 300-PARA-3230
	*  @param value
	**/
   public void setPara3230300(char[] value) {
       value = checkPara3230300Constraints(value);
       arraycopy(value,0,para3230300,0,value.length);
   } 
	public void setPara3230300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para3230300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of para8100300
	 *	@return para8100300
	 */
   public char[] getPara8100300() throws CFException{
   		return para8100300;
   }

  
	/**
	*  set variable para8100300
	*  Corresponding COBOL Variable is 300-PARA-8100
	*  @param value
	**/
   public void setPara8100300(char[] value) {
       value = checkPara8100300Constraints(value);
       arraycopy(value,0,para8100300,0,value.length);
   } 
	public void setPara8100300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para8100300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of para8200300
	 *	@return para8200300
	 */
   public char[] getPara8200300() throws CFException{
   		return para8200300;
   }

  
	/**
	*  set variable para8200300
	*  Corresponding COBOL Variable is 300-PARA-8200
	*  @param value
	**/
   public void setPara8200300(char[] value) {
       value = checkPara8200300Constraints(value);
       arraycopy(value,0,para8200300,0,value.length);
   } 
	public void setPara8200300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para8200300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of para8210300
	 *	@return para8210300
	 */
   public char[] getPara8210300() throws CFException{
   		return para8210300;
   }

  
	/**
	*  set variable para8210300
	*  Corresponding COBOL Variable is 300-PARA-8210
	*  @param value
	**/
   public void setPara8210300(char[] value) {
       value = checkPara8210300Constraints(value);
       arraycopy(value,0,para8210300,0,value.length);
   } 
	public void setPara8210300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para8210300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of recsRead400
	 *	@return recsRead400
	 */
	public long getRecsRead400() throws CFException {
   		return recsRead400;
	}
	
	/**
	 * 	Update RecsRead400 with the passed value
	 *  Corresponding COBOL Variable is 400-RECS-READ
	 *	@param number
	 */
	public void setRecsRead400(long number) {
	     // Truncate if the number is beyond +/- Max range
	    recsRead400 = checkRecsRead400MaxLimit(number); 
	}


	/**
	 *	Returns the value of abendMessage600
	 *	@return abendMessage600
	 */
   public char[] getAbendMessage600() throws CFException{
   		return abendMessage600;
   }

  
	/**
	*  set variable abendMessage600
	*  Corresponding COBOL Variable is 600-ABEND-MESSAGE
	*  @param value
	**/
   public void setAbendMessage600(char[] value) {
       value = checkAbendMessage600Constraints(value);
       arraycopy(value,0,abendMessage600,0,value.length);
   } 
	public void setAbendMessage600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,abendMessage600,0,beginIndex + endIndex);
   }
	char[] abendDb2Invalid8860088Value = "INVALID QUERY NUMBER                      ".toCharArray();
	/**
	 *	Test condition "INVALID QUERY NUMBER" for isAbendDb2Invalid88600()
	 *	@return  Returns true if isAbendDb2Invalid88600() is "INVALID QUERY NUMBER"
	 */
   public boolean isAbendDb2Invalid88600() throws CFException {
      return (  compareChars( getAbendMessage600() , abendDb2Invalid8860088Value)  == 0  );
   }


	/**
	*  set values "INVALID QUERY NUMBER"
	*/
   	public void setAbendDb2Invalid88600True() {  			
    	setAbendMessage600( abendDb2Invalid8860088Value);
   	}
	char[] abendDb2ConnError8860088Value = "ERROR IN CONNECTING TO DB2                ".toCharArray();
	/**
	 *	Test condition "ERROR IN CONNECTING TO DB2" for isAbendDb2ConnError88600()
	 *	@return  Returns true if isAbendDb2ConnError88600() is "ERROR IN CONNECTING TO DB2"
	 */
   public boolean isAbendDb2ConnError88600() throws CFException {
      return (  compareChars( getAbendMessage600() , abendDb2ConnError8860088Value)  == 0  );
   }


	/**
	*  set values "ERROR IN CONNECTING TO DB2"
	*/
   	public void setAbendDb2ConnError88600True() {  			
    	setAbendMessage600( abendDb2ConnError8860088Value);
   	}
	char[] abendDb2SelectError8860088Value = "ERROR IN SELECTING THE ROW IN DB2         ".toCharArray();
	/**
	 *	Test condition "ERROR IN SELECTING THE ROW IN DB2" for isAbendDb2SelectError88600()
	 *	@return  Returns true if isAbendDb2SelectError88600() is "ERROR IN SELECTING THE ROW IN DB2"
	 */
   public boolean isAbendDb2SelectError88600() throws CFException {
      return (  compareChars( getAbendMessage600() , abendDb2SelectError8860088Value)  == 0  );
   }


	/**
	*  set values "ERROR IN SELECTING THE ROW IN DB2"
	*/
   	public void setAbendDb2SelectError88600True() {  			
    	setAbendMessage600( abendDb2SelectError8860088Value);
   	}
	char[] abendDb2RbackError8860088Value = "DB2-DATABASE ERROR-UNSUCCESSFUL ROLLBACK  ".toCharArray();
	/**
	 *	Test condition "DB2-DATABASE ERROR-UNSUCCESSFUL ROLLBACK" for isAbendDb2RbackError88600()
	 *	@return  Returns true if isAbendDb2RbackError88600() is "DB2-DATABASE ERROR-UNSUCCESSFUL ROLLBACK"
	 */
   public boolean isAbendDb2RbackError88600() throws CFException {
      return (  compareChars( getAbendMessage600() , abendDb2RbackError8860088Value)  == 0  );
   }


	/**
	*  set values "DB2-DATABASE ERROR-UNSUCCESSFUL ROLLBACK"
	*/
   	public void setAbendDb2RbackError88600True() {  			
    	setAbendMessage600( abendDb2RbackError8860088Value);
   	}
	char[] abendDb2911Error8860088Value = "-904 OR -911 CONDN EXCEEDED PARM COUNT    ".toCharArray();
	/**
	 *	Test condition "-904 OR -911 CONDN EXCEEDED PARM COUNT" for isAbendDb2911Error88600()
	 *	@return  Returns true if isAbendDb2911Error88600() is "-904 OR -911 CONDN EXCEEDED PARM COUNT"
	 */
   public boolean isAbendDb2911Error88600() throws CFException {
      return (  compareChars( getAbendMessage600() , abendDb2911Error8860088Value)  == 0  );
   }


	/**
	*  set values "-904 OR -911 CONDN EXCEEDED PARM COUNT"
	*/
   	public void setAbendDb2911Error88600True() {  			
    	setAbendMessage600( abendDb2911Error8860088Value);
   	}
	/**
	 *	Returns the value of msg3005b600
	 *	@return msg3005b600
	 */
   public char[] getMsg3005b600() throws CFException{
   		return msg3005b600;
   }

  
	/**
	*  set variable msg3005b600
	*  Corresponding COBOL Variable is 600-MSG-3005B
	*  @param value
	**/
   public void setMsg3005b600(char[] value) {
       value = checkMsg3005b600Constraints(value);
       arraycopy(value,0,msg3005b600,0,value.length);
   } 
	public void setMsg3005b600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,msg3005b600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of msg3005c600
	 *	@return msg3005c600
	 */
   public char[] getMsg3005c600() throws CFException{
   		return msg3005c600;
   }

  
	/**
	*  set variable msg3005c600
	*  Corresponding COBOL Variable is 600-MSG-3005C
	*  @param value
	**/
   public void setMsg3005c600(char[] value) {
       value = checkMsg3005c600Constraints(value);
       arraycopy(value,0,msg3005c600,0,value.length);
   } 
	public void setMsg3005c600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,msg3005c600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of msg3005d600
	 *	@return msg3005d600
	 */
   public char[] getMsg3005d600() throws CFException{
   		return msg3005d600;
   }

  
	/**
	*  set variable msg3005d600
	*  Corresponding COBOL Variable is 600-MSG-3005D
	*  @param value
	**/
   public void setMsg3005d600(char[] value) {
       value = checkMsg3005d600Constraints(value);
       arraycopy(value,0,msg3005d600,0,value.length);
   } 
	public void setMsg3005d600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,msg3005d600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of msg3005e600
	 *	@return msg3005e600
	 */
   public char[] getMsg3005e600() throws CFException{
   		return msg3005e600;
   }

  
	/**
	*  set variable msg3005e600
	*  Corresponding COBOL Variable is 600-MSG-3005E
	*  @param value
	**/
   public void setMsg3005e600(char[] value) {
       value = checkMsg3005e600Constraints(value);
       arraycopy(value,0,msg3005e600,0,value.length);
   } 
	public void setMsg3005e600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,msg3005e600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of msg3010600
	 *	@return msg3010600
	 */
   public char[] getMsg3010600() throws CFException{
   		return msg3010600;
   }

  
	/**
	*  set variable msg3010600
	*  Corresponding COBOL Variable is 600-MSG-3010
	*  @param value
	**/
   public void setMsg3010600(char[] value) {
       value = checkMsg3010600Constraints(value);
       arraycopy(value,0,msg3010600,0,value.length);
   } 
	public void setMsg3010600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,msg3010600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of blankSpace600
	 *	@return blankSpace600
	 */
   public char[] getBlankSpace600() throws CFException{
   		return blankSpace600;
   }

  
	/**
	*  set variable blankSpace600
	*  Corresponding COBOL Variable is 600-BLANK-SPACE
	*  @param value
	**/
   public void setBlankSpace600(char[] value) {
       value = checkBlankSpace600Constraints(value);
       arraycopy(value,0,blankSpace600,0,value.length);
   } 
	public void setBlankSpace600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,blankSpace600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of asteriskLine600
	 *	@return asteriskLine600
	 */
   public char[] getAsteriskLine600() throws CFException{
   		return asteriskLine600;
   }

  
	/**
	*  set variable asteriskLine600
	*  Corresponding COBOL Variable is 600-ASTERISK-LINE
	*  @param value
	**/
   public void setAsteriskLine600(char[] value) {
       value = checkAsteriskLine600Constraints(value);
       arraycopy(value,0,asteriskLine600,0,value.length);
   } 
	public void setAsteriskLine600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,asteriskLine600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of db2ErrModuleMsg600
	 *	@return db2ErrModuleMsg600
	 */
   public char[] getDb2ErrModuleMsg600() throws CFException{
   		return db2ErrModuleMsg600;
   }

  
	/**
	*  set variable db2ErrModuleMsg600
	*  Corresponding COBOL Variable is 600-DB2-ERR-MODULE-MSG
	*  @param value
	**/
   public void setDb2ErrModuleMsg600(char[] value) {
       value = checkDb2ErrModuleMsg600Constraints(value);
       arraycopy(value,0,db2ErrModuleMsg600,0,value.length);
   } 
	public void setDb2ErrModuleMsg600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,db2ErrModuleMsg600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of db2Deadlock600
	 *	@return db2Deadlock600
	 */
   public char[] getDb2Deadlock600() throws CFException{
   		return db2Deadlock600;
   }

  
	/**
	*  set variable db2Deadlock600
	*  Corresponding COBOL Variable is 600-DB2-DEADLOCK
	*  @param value
	**/
   public void setDb2Deadlock600(char[] value) {
       value = checkDb2Deadlock600Constraints(value);
       arraycopy(value,0,db2Deadlock600,0,value.length);
   } 
	public void setDb2Deadlock600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,db2Deadlock600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of db2DeadlockRel600
	 *	@return db2DeadlockRel600
	 */
   public char[] getDb2DeadlockRel600() throws CFException{
   		return db2DeadlockRel600;
   }

  
	/**
	*  set variable db2DeadlockRel600
	*  Corresponding COBOL Variable is 600-DB2-DEADLOCK-REL
	*  @param value
	**/
   public void setDb2DeadlockRel600(char[] value) {
       value = checkDb2DeadlockRel600Constraints(value);
       arraycopy(value,0,db2DeadlockRel600,0,value.length);
   } 
	public void setDb2DeadlockRel600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,db2DeadlockRel600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of recsReadMsg600
	 *	@return recsReadMsg600
	 */
   public char[] getRecsReadMsg600() throws CFException{
   		return recsReadMsg600;
   }

  
	/**
	*  set variable recsReadMsg600
	*  Corresponding COBOL Variable is 600-RECS-READ-MSG
	*  @param value
	**/
   public void setRecsReadMsg600(char[] value) {
       value = checkRecsReadMsg600Constraints(value);
       arraycopy(value,0,recsReadMsg600,0,value.length);
   } 
	public void setRecsReadMsg600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,recsReadMsg600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of recsUpdatedMsg600
	 *	@return recsUpdatedMsg600
	 */
   public char[] getRecsUpdatedMsg600() throws CFException{
   		return recsUpdatedMsg600;
   }

  
	/**
	*  set variable recsUpdatedMsg600
	*  Corresponding COBOL Variable is 600-RECS-UPDATED-MSG
	*  @param value
	**/
   public void setRecsUpdatedMsg600(char[] value) {
       value = checkRecsUpdatedMsg600Constraints(value);
       arraycopy(value,0,recsUpdatedMsg600,0,value.length);
   } 
	public void setRecsUpdatedMsg600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,recsUpdatedMsg600,0,beginIndex + endIndex);
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
	 *	Returns the value of ptrIp280010800
	 *	@return ptrIp280010800
	 */
   public char[] getPtrIp280010800() throws CFException{
   		return ptrIp280010800;
   }

  
	/**
	*  set variable ptrIp280010800
	*  Corresponding COBOL Variable is 800-PTR-IP280010
	*  @param value
	**/
   public void setPtrIp280010800(char[] value) {
       value = checkPtrIp280010800Constraints(value);
       arraycopy(value,0,ptrIp280010800,0,value.length);
   } 
	public void setPtrIp280010800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp280010800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ptrIp610010800
	 *	@return ptrIp610010800
	 */
   public char[] getPtrIp610010800() throws CFException{
   		return ptrIp610010800;
   }

  
	/**
	*  set variable ptrIp610010800
	*  Corresponding COBOL Variable is 800-PTR-IP610010
	*  @param value
	**/
   public void setPtrIp610010800(char[] value) {
       value = checkPtrIp610010800Constraints(value);
       arraycopy(value,0,ptrIp610010800,0,value.length);
   } 
	public void setPtrIp610010800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp610010800,0,beginIndex + endIndex);
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
	 *	Returns the value of ptrMcwait800
	 *	@return ptrMcwait800
	 */
   public char[] getPtrMcwait800() throws CFException{
   		return ptrMcwait800;
   }

  
	/**
	*  set variable ptrMcwait800
	*  Corresponding COBOL Variable is 800-PTR-MCWAIT
	*  @param value
	**/
   public void setPtrMcwait800(char[] value) {
       value = checkPtrMcwait800Constraints(value);
       arraycopy(value,0,ptrMcwait800,0,value.length);
   } 
	public void setPtrMcwait800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrMcwait800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of noOfRows800
	 *	@return noOfRows800
	 */
	public long getNoOfRows800() throws CFException {
   		return noOfRows800;
	}
	
	/**
	 * 	Update NoOfRows800 with the passed value
	 *  Corresponding COBOL Variable is 800-NO-OF-ROWS
	 *	@param number
	 */
	public void setNoOfRows800(long number) {
	     // Truncate if the number is beyond +/- Max range
	    noOfRows800 = checkNoOfRows800MaxLimit(number); 
	}


	/**
	 *	Returns the value of commitRows800
	 *	@return commitRows800
	 */
	public long getCommitRows800() throws CFException {
   		return commitRows800;
	}
	
	/**
	 * 	Update CommitRows800 with the passed value
	 *  Corresponding COBOL Variable is 800-COMMIT-ROWS
	 *	@param number
	 */
	public void setCommitRows800(long number) {
	     // Truncate if the number is beyond +/- Max range
	    commitRows800 = checkCommitRows800MaxLimit(number); 
	}


	/**
	 *	Returns the value of actualLen800
	 *	@return actualLen800
	 */
	public short getActualLen800() throws CFException {
   		return actualLen800;
	}
	
	/**
	 * 	Update ActualLen800 with the passed value
	 *  Corresponding COBOL Variable is 800-ACTUAL-LEN
	 *	@param number
	 */
	public void setActualLen800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    actualLen800 = checkActualLen800MaxLimit(number); 
	}

	public void setActualLen800(int number) {
	    number = checkActualLen800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setActualLen800((short)number);
	}
	public void setActualLen800(long number) {
	    number = checkActualLen800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setActualLen800((short)number);
	}
	

	/**
	 *	Returns the value of justifyIn800
	 *	@return justifyIn800
	 */
   public char[] getJustifyIn800() throws CFException{
   		return justifyIn800;
   }

  
	/**
	*  set variable justifyIn800
	*  Corresponding COBOL Variable is 800-JUSTIFY-IN
	*  @param value
	**/
   public void setJustifyIn800(char[] value) {
       value = checkJustifyIn800Constraints(value);
       arraycopy(value,0,justifyIn800,0,value.length);
   } 
	public void setJustifyIn800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,justifyIn800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of justifyOut800
	 *	@return justifyOut800
	 */
   public char[] getJustifyOut800() throws CFException{
   		return justifyOut800;
   }

  
	/**
	*  set variable justifyOut800
	*  Corresponding COBOL Variable is 800-JUSTIFY-OUT
	*  @param value
	**/
   public void setJustifyOut800(char[] value) {
       value = checkJustifyOut800Constraints(value);
       arraycopy(value,0,justifyOut800,0,value.length);
   } 
	public void setJustifyOut800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,justifyOut800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of nonSpaceFound800
	 *	@return nonSpaceFound800
	 */
   public char[] getNonSpaceFound800() throws CFException{
   		return nonSpaceFound800;
   }

  
	/**
	*  set variable nonSpaceFound800
	*  Corresponding COBOL Variable is 800-NON-SPACE-FOUND
	*  @param value
	**/
   public void setNonSpaceFound800(char[] value) {
       value = checkNonSpaceFound800Constraints(value);
       arraycopy(value,0,nonSpaceFound800,0,value.length);
   } 
	public void setNonSpaceFound800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,nonSpaceFound800,0,beginIndex + endIndex);
   }
	char[] nonSpaceFoundY8880088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isNonSpaceFoundY88800()
	 *	@return  Returns true if isNonSpaceFoundY88800() is "Y"
	 */
   public boolean isNonSpaceFoundY88800() throws CFException {
      return (  compareChars( getNonSpaceFound800() , nonSpaceFoundY8880088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setNonSpaceFoundY88800True() {  			
    	setNonSpaceFound800( nonSpaceFoundY8880088Value);
   	}
	char[] nonSpaceFoundN8880088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isNonSpaceFoundN88800()
	 *	@return  Returns true if isNonSpaceFoundN88800() is "N"
	 */
   public boolean isNonSpaceFoundN88800() throws CFException {
      return (  compareChars( getNonSpaceFound800() , nonSpaceFoundN8880088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setNonSpaceFoundN88800True() {  			
    	setNonSpaceFound800( nonSpaceFoundN8880088Value);
   	}
	/**
	 *	Returns the value of astriskLine900
	 *	@return astriskLine900
	 */
   public char[] getAstriskLine900() throws CFException{
   		return astriskLine900;
   }

  
	/**
	*  set variable astriskLine900
	*  Corresponding COBOL Variable is 900-ASTRISK-LINE
	*  @param value
	**/
   public void setAstriskLine900(char[] value) {
       value = checkAstriskLine900Constraints(value);
       arraycopy(value,0,astriskLine900,0,value.length);
   } 
	public void setAstriskLine900(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,astriskLine900,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of abendAbend900
	 *	@return abendAbend900
	 */
   public char[] getAbendAbend900() throws CFException{
   		return abendAbend900;
   }

  
	/**
	*  set variable abendAbend900
	*  Corresponding COBOL Variable is 900-ABEND-ABEND
	*  @param value
	**/
   public void setAbendAbend900(char[] value) {
       value = checkAbendAbend900Constraints(value);
       arraycopy(value,0,abendAbend900,0,value.length);
   } 
	public void setAbendAbend900(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,abendAbend900,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of abendAbendPgm900
	 *	@return abendAbendPgm900
	 */
   public char[] getAbendAbendPgm900() throws CFException{
   		return abendAbendPgm900;
   }

  
	/**
	*  set variable abendAbendPgm900
	*  Corresponding COBOL Variable is 900-ABEND-ABEND-PGM
	*  @param value
	**/
   public void setAbendAbendPgm900(char[] value) {
       value = checkAbendAbendPgm900Constraints(value);
       arraycopy(value,0,abendAbendPgm900,0,value.length);
   } 
	public void setAbendAbendPgm900(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,abendAbendPgm900,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of db85102cDb2BatchErrorRtn
	 *	@return db85102cDb2BatchErrorRtn
	 */
   public char[] getDb85102cDb2BatchErrorRtn() throws CFException{
   		return db85102cDb2BatchErrorRtn;
   }

  
	/**
	*  set variable db85102cDb2BatchErrorRtn
	*  Corresponding COBOL Variable is DB85102C-DB2-BATCH-ERROR-RTN
	*  @param value
	**/
   public void setDb85102cDb2BatchErrorRtn(char[] value) {
       value = checkDb85102cDb2BatchErrorRtnConstraints(value);
       arraycopy(value,0,db85102cDb2BatchErrorRtn,0,value.length);
   } 
	public void setDb85102cDb2BatchErrorRtn(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,db85102cDb2BatchErrorRtn,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of sqlTemp
	 *	@return sqlTemp
	 */
   public char[] getSqlTemp() throws CFException{
   		return sqlTemp;
   }

  
	/**
	*  set variable sqlTemp
	*  Corresponding COBOL Variable is SQL-TEMP
	*  @param value
	**/
   public void setSqlTemp(char[] value) {
       value = checkSqlTempConstraints(value);
       arraycopy(value,0,sqlTemp,0,value.length);
   } 
	public void setSqlTemp(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sqlTemp,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
