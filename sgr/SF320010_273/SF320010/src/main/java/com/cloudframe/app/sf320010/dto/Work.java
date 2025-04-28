package com.cloudframe.app.sf320010.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:07. using version 5.0.0.256
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

						private char[] generalLogEofSw = new char[1];

						private char[] tempFileEofSw = new char[1];

								private int mciwinReturnCode;

								private long tempRecsWrittenCnt;

						private char[] mcwinProgram = new char[8];

						private char[] rpC7LogDesc1 = new char[45];

						private char[] rpC7LogDesc2 = new char[45];

						private char[] rpC7LogDesc3 = new char[45];

						private char[] rpC7LogDesc4 = new char[45];

						private char[] rpC7LogDesc5 = new char[45];

						private char[] rpC7LogDesc6 = new char[45];

						private char[] rpC7LogDesc7 = new char[45];

						private char[] rpC7LogDesc8 = new char[45];

						private char[] rpC7LogDesc9 = new char[45];

						private char[] rpC7LogDescA = new char[45];

						private char[] rpC8LogDesc1 = new char[45];

						private char[] rpC8LogDesc2 = new char[45];

						private char[] rpC8LogDesc3 = new char[45];

						private char[] rpC8LogDesc4 = new char[45];

						private char[] rpC8LogDesc5 = new char[45];

						private char[] rpC8LogDesc6 = new char[45];

						private char[] rpC8LogDesc7 = new char[45];

						private char[] rpC8LogDesc8 = new char[45];

						private char[] rpC8LogDescAlert = new char[45];

						private char[] rpC9LogDesc1 = new char[45];

						private char[] rpC9LogDesc2 = new char[45];

						private char[] rpC9LogDesc3 = new char[45];

						private char[] rpC9LogDesc4 = new char[45];

						private char[] rpC9LogDesc5 = new char[45];

						private char[] rpC9LogDesc6 = new char[45];

						private char[] rpC9LogDesc7 = new char[45];

						private char[] rpC9LogDesc8 = new char[45];

						private char[] rpC9LogDesc9 = new char[45];

						private char[] rpC9LogDesc10 = new char[45];

						private char[] rpC9LogDesc11 = new char[45];

						private char[] rpC9LogDesc12 = new char[45];

						private char[] rpC9LogDesc13 = new char[45];

						private char[] rpC9LogDesc14 = new char[45];

						private char[] rpC9LogDesc15 = new char[45];

						private char[] rpC9LogDesc16 = new char[45];

						private char[] rpC9LogDesc17 = new char[45];

						private char[] rpC9LogDesc18 = new char[45];

						private char[] rpC9LogDesc19 = new char[45];

						private char[] rpC9LogDesc20 = new char[45];

						private char[] rpC9LogDesc21 = new char[45];

						private char[] rpC9LogDesc22 = new char[45];

						private char[] rpC9LogDesc23 = new char[45];

						private char[] rpC9LogDesc24 = new char[45];

						private char[] rpC9LogDesc25 = new char[45];

						private char[] rpC9LogDesc26 = new char[45];

						private char[] rpUndefLogDesc = new char[45];

						private char[] rpEmailOpHeading3200 = new char[132];

						private char[] rpBdHeading3 = new char[133];

						private char[] rpOpHeading3 = new char[133];

						private char[] rpMpDetail3 = new char[133];

						private char[] rpPsHeading3 = new char[133];

						private char[] rpPsHeading4 = new char[133];

						private char[] rpC7Heading2 = new char[132];

						private char[] rpC7Heading5 = new char[133];

						private char[] rpC8Heading2 = new char[132];

						private char[] rpC8Heading4 = new char[97];

						private char[] rpC8Heading5 = new char[93];

						private char[] rpC9Heading2 = new char[132];

						private char[] rpC9Heading5 = new char[133];

								private int ctRptBdLineNo;

								private int ctRptBdPageNo;

								private int ctRptOpLineNo;

								private int ctRptOpPageNo;

								private int ctRptMpLineNo;

								private int ctRptMpPageNo;

								private int ctRptPsLineNo;

								private int ctRptPsPageNo;

								private int ctRptT2PageNo;

								private int ctRptRcLineNo;

								private int ctRptRcPageNo;

								private int ctRptC9PageNo;

								private long ctLogStats;

								private long ctLogBulkData;

								private long ctLogBulkData32;

								private long ctLogOperator;

								private long ctLogMipProfile;

								private long ctLogPos;

								private long ctLogTypeii;

								private long ctLogRemCons;

								private long ctLogX92;

								private long ctLogEdc;

								private long ctLogChk;

								private long ctLogOther;

								private long ctC7LogType1;

								private long ctC7LogType2;

								private long ctC7LogType3;

								private long ctC7LogType4;

								private long ctC7LogType5;

								private long ctC7LogType6;

								private long ctC7LogType7;

								private long ctC7LogType8;

								private long ctC7LogType9;

								private long ctC7LogTypeA;

								private long ctC7UndefLogType;

								private long ctC8LogType1;

								private long ctC8LogType2;

								private long ctC8LogType3;

								private long ctC8LogType4;

								private long ctC8LogType5;

								private long ctC8LogType6;

								private long ctC8LogType7;

								private long ctC8LogType8;

								private long ctC8LogTypeAlert;

								private long ctC8UndefLogType;

								private long ctC9LogType1;

								private long ctC9LogType2;

								private long ctC9LogType3;

								private long ctC9LogType4;

								private long ctC9LogType5;

								private long ctC9LogType6;

								private long ctC9LogType7;

								private long ctC9LogType8;

								private long ctC9LogType9;

								private long ctC9LogType10;

								private long ctC9LogType11;

								private long ctC9LogType12;

								private long ctC9LogType13;

								private long ctC9LogType14;

								private long ctC9LogType15;

								private long ctC9LogType16;

								private long ctC9LogType17;

								private long ctC9LogType18;

								private long ctC9LogType19;

								private long ctC9LogType20;

								private long ctC9LogType21;

								private long ctC9LogType22;

								private long ctC9LogType23;

								private long ctC9LogType24;

								private long ctC9LogType25;

								private long ctC9LogType26;

								private long ctC9UndefLogType;

								private int waDateMn9;

								private int waDateDy9;

								private int waDateYr9;

								private int waTimeHh9;

								private int waTimeMm9;

								private int waTimeSs9;

						private char[] firstT2RcdInd = Field.fillLowValue(1);

						private char[] firstX92RcdInd = Field.fillLowValue(1);

						private char[] securityAlertFlag = new char[1];

						private char[] prevT2SortMipId = new char[3];

						private char[] prevRcRemoteMipId = new char[3];

						private char[] prevX92SortMipId = new char[3];

						private char[] prevT2SortDate = new char[6];

						private char[] prevX92SortDate = new char[6];

						private char[] compileDate = Field.fillLowValue(24);

						private char[] otherGlogClass100 = new char[1];

						private char[] lit8300 = new char[1];

						private char[] lit04300 = new char[2];

						private char[] lit20300 = new char[2];

						private char[] charBb300 = new char[2];

						private char[] char9134a300 = new char[5];

								private int numOne300;

								private int numTwo300;

								private int num6300;

								private int num56300;

								private long sys001Lrecl400;

								private int emailRecsWriteCnt400;

								private short emailRptOpPageNo400;

								private short emailRptOpLineNo400;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setGeneralLogEofSw(("N").toCharArray());
								setTempFileEofSw(("N").toCharArray());
								setMciwinReturnCode(0);
								setTempRecsWrittenCnt(0L);
								setMcwinProgram(("MCWIN   ").toCharArray());
								setRpC7LogDesc1(("UNDELIVERED TO NETWORK INTERFACE (REMOTE)    ").toCharArray());
								setRpC7LogDesc2(("NON-DISPATCHED BY NETWORK INTERFACE (REMOTE) ").toCharArray());
								setRpC7LogDesc3(("UNDELIVERED TO CENTRAL SITE HOST INTERFACE   ").toCharArray());
								setRpC7LogDesc4(("UNDELIVERED TO CENTRAL SITE HOST             ").toCharArray());
								setRpC7LogDesc5(("UNDELIVERED TO NETWORK INTERFACE (C-S MIP)   ").toCharArray());
								setRpC7LogDesc6(("NON-DISPATCHED BY NETWORK INTERFACE (C-S MIP)").toCharArray());
								setRpC7LogDesc7(("UNDELIVERED TO MEMBER INTERFACE              ").toCharArray());
								setRpC7LogDesc8(("UNDELIVERED TO TYPE II TERMINAL              ").toCharArray());
								setRpC7LogDesc9(("MISROUTE - RETURN TO SENDER                  ").toCharArray());
								setRpC7LogDescA(("UNDELIVERED TO BROADCAST TABLE               ").toCharArray());
								setRpC8LogDesc1(("SYSTEM ATTENTION FUNCTION - (PF1)            ").toCharArray());
								setRpC8LogDesc2(("REMOTE START READER (STRDR) FUNCTION - (PF2) ").toCharArray());
								setRpC8LogDesc3(("CALL ESTABLISHED                             ").toCharArray());
								setRpC8LogDesc4(("CALL TERMINATED                              ").toCharArray());
								setRpC8LogDesc5(("PROMPT RECEIVED - RESPONSE SENT              ").toCharArray());
								setRpC8LogDesc6(("OUTPUT RECEIVED                              ").toCharArray());
								setRpC8LogDesc7(("TIMEOUT ON RESPONSE                          ").toCharArray());
								setRpC8LogDesc8(("LOGGED ON/LOGGED OFF                         ").toCharArray());
								setRpC8LogDescAlert(("**********   SECURITY  ALERT   **************").toCharArray());
								setRpC9LogDesc1(("ICSS QUEUE ERROR (ANY LOCATION)              ").toCharArray());
								setRpC9LogDesc2(("RECEIVED FROM REMOTE HOST                    ").toCharArray());
								setRpC9LogDesc3(("RECEIVED AT REMOTE MIP (FROM NETWORK)        ").toCharArray());
								setRpC9LogDesc4(("RECEIVED FROM C-S HOST                       ").toCharArray());
								setRpC9LogDesc5(("RECIEVED AT C-S MIP (FROM NETWORK)           ").toCharArray());
								setRpC9LogDesc6(("REMOTE NETWORK - NOT DISPATCHED              ").toCharArray());
								setRpC9LogDesc7(("REMOTE HOST - UNDELIVERED                    ").toCharArray());
								setRpC9LogDesc8(("C-S NETWORK - NOT DISPATCED                  ").toCharArray());
								setRpC9LogDesc9(("C-S HOST UNDELIVERED                         ").toCharArray());
								setRpC9LogDesc10(("MULTI-SEGMENT MESSAGE TIMEOUT (REMOTE)       ").toCharArray());
								setRpC9LogDesc11(("MULTI-SEGMENT MESSAGE TIMEOUT (CS-MIP)       ").toCharArray());
								setRpC9LogDesc12(("MESSAGE DELIVERED TO MEMBER HOST             ").toCharArray());
								setRpC9LogDesc13(("MESSAGE DELIVERED TO CS-HOST                 ").toCharArray());
								setRpC9LogDesc14(("REMOTE MIP INPROCESS QUEUE INSERT ERROR      ").toCharArray());
								setRpC9LogDesc15(("REMOTE MIP INPROCESS QUEUE EXTRACT ERROR     ").toCharArray());
								setRpC9LogDesc16(("CS-MIP INPROCESS QUEUE INSERT ERROR          ").toCharArray());
								setRpC9LogDesc17(("CS-MIP INPROCESS QUEUE EXTRACT ERROR         ").toCharArray());
								setRpC9LogDesc18(("MEMBER ID NOT FOUND IN TABLE                 ").toCharArray());
								setRpC9LogDesc19(("MSG-TO-NETWORK RETRY COUNT EXHAUSTED         ").toCharArray());
								setRpC9LogDesc20(("REMOTE MIP MEMBER ID NOT FOUND IN TABLE      ").toCharArray());
								setRpC9LogDesc21(("BAD X90/X9R HEADER RECEIVED FROM C-S HOST    ").toCharArray());
								setRpC9LogDesc22(("RE-READ ERROR MEMBER ID/NTW ADDRESS TABLE    ").toCharArray());
								setRpC9LogDesc23(("MEMBER ID/NETWORK ADDRESS FILE CORRUPT       ").toCharArray());
								setRpC9LogDesc24(("C-S IPQ SIGNALLING INSERT ERROR              ").toCharArray());
								setRpC9LogDesc25(("SIGNAL PACKET NOT DELIVERED/UNDISPATCHED     ").toCharArray());
								setRpC9LogDesc26(("SIGNAL PACKET LATE/IPQ EXTRACT NOT FOUND     ").toCharArray());
								setRpUndefLogDesc(("UNDEFINED LOG TYPE DESCRIPTION               ").toCharArray());
								setRpEmailOpHeading3200("REC TYPE  MIP ID  LOG DATE  LOG TIME  OPERATOR HEADER-MESSAGE                                                                       ".toCharArray());
								setRpBdHeading3("0        BULK ID NBR     MIP ID   PATH ID   STATUS   ERR CODE   JULIAN DAY    TIME    1K SPOOL RCDS   NBR BYTES   NBR BLOCKS         ".toCharArray());
								setRpOpHeading3("0REC TYPE  MIP ID  LOG DATE  LOG TIME  OPERATOR HEADER-MESSAGE                                                                       ".toCharArray());
								setRpMpDetail3(" IN-PROCESS QUEUE TIMES IN MILLISECONDS                                                                                              ".toCharArray());
								setRpPsHeading3("0R                      F FLOOR P R TRN I  AUTH  ICA                                      EXP    TRAN   M M N INPT TIMEIN   T AUTH   ".toCharArray());
								setRpPsHeading4(" T REF NO  TIME   DATE  I  AMT  R R CDE R  CODE  NO     TERMINAL ID         CARD NUMBER   DATE  AMOUNT  I S T PORT SYSTEM    CODE    ".toCharArray());
								setRpC7Heading2("                                                     BANKNET - GENERAL LOG CLASSES                                                  ".toCharArray());
								setRpC7Heading5("0     LOG TYPE          LOG TYPE DESCRIPTION                               TOTAL                                                     ".toCharArray());
								setRpC8Heading2("                                                     BANKNET - GENERAL LOG CLASSES                                                  ".toCharArray());
								setRpC8Heading4("0      SECURITY     REMOTE  OPERATOR  LOG DATE  LOG TIME  LOCAL   LOG TYPE        LOG DESCRIPTION".toCharArray());
								setRpC8Heading5("        ALERT       MIP ID     ID                        MIP ID                              ".toCharArray());
								setRpC9Heading2("                                                     BANKNET - GENERAL LOG CLASSES                                                  ".toCharArray());
								setRpC9Heading5("0     LOG TYPE          LOG TYPE DESCRIPTION                               TOTAL                                                     ".toCharArray());
								setCtRptBdLineNo(60);
								setCtRptBdPageNo(0);
								setCtRptOpLineNo(60);
								setCtRptOpPageNo(0);
								setCtRptMpLineNo(60);
								setCtRptMpPageNo(0);
								setCtRptPsLineNo(60);
								setCtRptPsPageNo(0);
								setCtRptT2PageNo(0);
								setCtRptRcLineNo(60);
								setCtRptRcPageNo(0);
								setCtRptC9PageNo(0);
								setCtLogStats(0L);
								setCtLogBulkData(0L);
								setCtLogBulkData32(0L);
								setCtLogOperator(0L);
								setCtLogMipProfile(0L);
								setCtLogPos(0L);
								setCtLogTypeii(0L);
								setCtLogRemCons(0L);
								setCtLogX92(0L);
								setCtLogEdc(0L);
								setCtLogChk(0L);
								setCtLogOther(0L);
								setCtC7LogType1(0L);
								setCtC7LogType2(0L);
								setCtC7LogType3(0L);
								setCtC7LogType4(0L);
								setCtC7LogType5(0L);
								setCtC7LogType6(0L);
								setCtC7LogType7(0L);
								setCtC7LogType8(0L);
								setCtC7LogType9(0L);
								setCtC7LogTypeA(0L);
								setCtC7UndefLogType(0L);
								setCtC8LogType1(0L);
								setCtC8LogType2(0L);
								setCtC8LogType3(0L);
								setCtC8LogType4(0L);
								setCtC8LogType5(0L);
								setCtC8LogType6(0L);
								setCtC8LogType7(0L);
								setCtC8LogType8(0L);
								setCtC8LogTypeAlert(0L);
								setCtC8UndefLogType(0L);
								setCtC9LogType1(0L);
								setCtC9LogType2(0L);
								setCtC9LogType3(0L);
								setCtC9LogType4(0L);
								setCtC9LogType5(0L);
								setCtC9LogType6(0L);
								setCtC9LogType7(0L);
								setCtC9LogType8(0L);
								setCtC9LogType9(0L);
								setCtC9LogType10(0L);
								setCtC9LogType11(0L);
								setCtC9LogType12(0L);
								setCtC9LogType13(0L);
								setCtC9LogType14(0L);
								setCtC9LogType15(0L);
								setCtC9LogType16(0L);
								setCtC9LogType17(0L);
								setCtC9LogType18(0L);
								setCtC9LogType19(0L);
								setCtC9LogType20(0L);
								setCtC9LogType21(0L);
								setCtC9LogType22(0L);
								setCtC9LogType23(0L);
								setCtC9LogType24(0L);
								setCtC9LogType25(0L);
								setCtC9LogType26(0L);
								setCtC9UndefLogType(0L);
								setSecurityAlertFlag(fillSpace(1));
								setPrevT2SortMipId(fillSpace(3));
								setPrevRcRemoteMipId(fillSpace(3));
								setPrevX92SortMipId(fillSpace(3));
								setPrevT2SortDate(fillSpace(6));
								setPrevX92SortDate(fillSpace(6));
								setOtherGlogClass100(fillSpace(1));
								setLit8300(("8").toCharArray());
								setLit04300(("04").toCharArray());
								setLit20300(("20").toCharArray());
								setCharBb300(("BB").toCharArray());
								setChar9134a300(("9134A").toCharArray());
								setNumOne300(1);
								setNumTwo300(2);
								setNum6300(6);
								setNum56300(56);
								setSys001Lrecl400(0L);
								setEmailRecsWriteCnt400(0);
								setEmailRptOpPageNo400((short)0);
								setEmailRptOpLineNo400((short)60);
    }


 

	/**
	 *	Returns the value of generalLogEofSw
	 *	@return generalLogEofSw
	 */
   public char[] getGeneralLogEofSw() throws CFException{
   		return generalLogEofSw;
   }

  
	/**
	*  set variable generalLogEofSw
	*  Corresponding COBOL Variable is GENERAL-LOG-EOF-SW
	*  @param value
	**/
   public void setGeneralLogEofSw(char[] value) {
       value = checkGeneralLogEofSwConstraints(value);
       arraycopy(value,0,generalLogEofSw,0,value.length);
   } 
	public void setGeneralLogEofSw(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,generalLogEofSw,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tempFileEofSw
	 *	@return tempFileEofSw
	 */
   public char[] getTempFileEofSw() throws CFException{
   		return tempFileEofSw;
   }

  
	/**
	*  set variable tempFileEofSw
	*  Corresponding COBOL Variable is TEMP-FILE-EOF-SW
	*  @param value
	**/
   public void setTempFileEofSw(char[] value) {
       value = checkTempFileEofSwConstraints(value);
       arraycopy(value,0,tempFileEofSw,0,value.length);
   } 
	public void setTempFileEofSw(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tempFileEofSw,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of mciwinReturnCode
	 *	@return mciwinReturnCode
	 */
	public int getMciwinReturnCode() throws CFException {
       if (isMciwinReturnCodeModified()) { 
           mciwinReturnCode = refreshMciwinReturnCode();
        }
   		return mciwinReturnCode;
	}
	

	
	   
	/**
	 * 	Update MciwinReturnCode with the passed value
	 *  Corresponding COBOL Variable is MCIWIN-RETURN-CODE
	 *	@param number
	 */
	public void setMciwinReturnCode(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    mciwinReturnCode = checkMciwinReturnCodeMaxLimit(number); 
		serializeMciwinReturnCode(mciwinReturnCode);
	}
	

	public void setMciwinReturnCode(long number) {
	    number = checkMciwinReturnCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMciwinReturnCode((int)number);
	}
	
	/**
	 * 	Update MciwinReturnCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setMciwinReturnCode(char[] value) throws CFException {
		 mciwinReturnCode = serializeMciwinReturnCode(value);
	}
	/**
	 * 	Update MciwinReturnCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMciwinReturnCodeString(char[] value) throws CFException {
		 setMciwinReturnCode(value);
	}
	/**
	 *	Returns the value of tempRecsWrittenCnt
	 *	@return tempRecsWrittenCnt
	 */
	public long getTempRecsWrittenCnt() throws CFException {
       if (isTempRecsWrittenCntModified()) { 
           tempRecsWrittenCnt = refreshTempRecsWrittenCnt();
        }
   		return tempRecsWrittenCnt;
	}
	

	
	   
	/**
	 * 	Update TempRecsWrittenCnt with the passed value
	 *  Corresponding COBOL Variable is TEMP-RECS-WRITTEN-CNT
	 *	@param number
	 */
	public void setTempRecsWrittenCnt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    tempRecsWrittenCnt = checkTempRecsWrittenCntMaxLimit(number); 
		serializeTempRecsWrittenCnt(tempRecsWrittenCnt);
	}
	

	/**
	 * 	Update TempRecsWrittenCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setTempRecsWrittenCnt(char[] value) throws CFException {
		 tempRecsWrittenCnt = serializeTempRecsWrittenCnt(value);
	}
	/**
	 * 	Update TempRecsWrittenCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTempRecsWrittenCntString(char[] value) throws CFException {
		 setTempRecsWrittenCnt(value);
	}
	/**
	 *	Returns the value of mcwinProgram
	 *	@return mcwinProgram
	 */
   public char[] getMcwinProgram() throws CFException{
   		return mcwinProgram;
   }

  
	/**
	*  set variable mcwinProgram
	*  Corresponding COBOL Variable is MCWIN-PROGRAM
	*  @param value
	**/
   public void setMcwinProgram(char[] value) {
       value = checkMcwinProgramConstraints(value);
       arraycopy(value,0,mcwinProgram,0,value.length);
   } 
	public void setMcwinProgram(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,mcwinProgram,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC7LogDesc1
	 *	@return rpC7LogDesc1
	 */
   public char[] getRpC7LogDesc1() throws CFException{
   		return rpC7LogDesc1;
   }

  
	/**
	*  set variable rpC7LogDesc1
	*  Corresponding COBOL Variable is RP-C7-LOG-DESC-1
	*  @param value
	**/
   public void setRpC7LogDesc1(char[] value) {
       value = checkRpC7LogDesc1Constraints(value);
       arraycopy(value,0,rpC7LogDesc1,0,value.length);
   } 
	public void setRpC7LogDesc1(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC7LogDesc1,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC7LogDesc2
	 *	@return rpC7LogDesc2
	 */
   public char[] getRpC7LogDesc2() throws CFException{
   		return rpC7LogDesc2;
   }

  
	/**
	*  set variable rpC7LogDesc2
	*  Corresponding COBOL Variable is RP-C7-LOG-DESC-2
	*  @param value
	**/
   public void setRpC7LogDesc2(char[] value) {
       value = checkRpC7LogDesc2Constraints(value);
       arraycopy(value,0,rpC7LogDesc2,0,value.length);
   } 
	public void setRpC7LogDesc2(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC7LogDesc2,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC7LogDesc3
	 *	@return rpC7LogDesc3
	 */
   public char[] getRpC7LogDesc3() throws CFException{
   		return rpC7LogDesc3;
   }

  
	/**
	*  set variable rpC7LogDesc3
	*  Corresponding COBOL Variable is RP-C7-LOG-DESC-3
	*  @param value
	**/
   public void setRpC7LogDesc3(char[] value) {
       value = checkRpC7LogDesc3Constraints(value);
       arraycopy(value,0,rpC7LogDesc3,0,value.length);
   } 
	public void setRpC7LogDesc3(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC7LogDesc3,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC7LogDesc4
	 *	@return rpC7LogDesc4
	 */
   public char[] getRpC7LogDesc4() throws CFException{
   		return rpC7LogDesc4;
   }

  
	/**
	*  set variable rpC7LogDesc4
	*  Corresponding COBOL Variable is RP-C7-LOG-DESC-4
	*  @param value
	**/
   public void setRpC7LogDesc4(char[] value) {
       value = checkRpC7LogDesc4Constraints(value);
       arraycopy(value,0,rpC7LogDesc4,0,value.length);
   } 
	public void setRpC7LogDesc4(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC7LogDesc4,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC7LogDesc5
	 *	@return rpC7LogDesc5
	 */
   public char[] getRpC7LogDesc5() throws CFException{
   		return rpC7LogDesc5;
   }

  
	/**
	*  set variable rpC7LogDesc5
	*  Corresponding COBOL Variable is RP-C7-LOG-DESC-5
	*  @param value
	**/
   public void setRpC7LogDesc5(char[] value) {
       value = checkRpC7LogDesc5Constraints(value);
       arraycopy(value,0,rpC7LogDesc5,0,value.length);
   } 
	public void setRpC7LogDesc5(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC7LogDesc5,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC7LogDesc6
	 *	@return rpC7LogDesc6
	 */
   public char[] getRpC7LogDesc6() throws CFException{
   		return rpC7LogDesc6;
   }

  
	/**
	*  set variable rpC7LogDesc6
	*  Corresponding COBOL Variable is RP-C7-LOG-DESC-6
	*  @param value
	**/
   public void setRpC7LogDesc6(char[] value) {
       value = checkRpC7LogDesc6Constraints(value);
       arraycopy(value,0,rpC7LogDesc6,0,value.length);
   } 
	public void setRpC7LogDesc6(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC7LogDesc6,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC7LogDesc7
	 *	@return rpC7LogDesc7
	 */
   public char[] getRpC7LogDesc7() throws CFException{
   		return rpC7LogDesc7;
   }

  
	/**
	*  set variable rpC7LogDesc7
	*  Corresponding COBOL Variable is RP-C7-LOG-DESC-7
	*  @param value
	**/
   public void setRpC7LogDesc7(char[] value) {
       value = checkRpC7LogDesc7Constraints(value);
       arraycopy(value,0,rpC7LogDesc7,0,value.length);
   } 
	public void setRpC7LogDesc7(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC7LogDesc7,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC7LogDesc8
	 *	@return rpC7LogDesc8
	 */
   public char[] getRpC7LogDesc8() throws CFException{
   		return rpC7LogDesc8;
   }

  
	/**
	*  set variable rpC7LogDesc8
	*  Corresponding COBOL Variable is RP-C7-LOG-DESC-8
	*  @param value
	**/
   public void setRpC7LogDesc8(char[] value) {
       value = checkRpC7LogDesc8Constraints(value);
       arraycopy(value,0,rpC7LogDesc8,0,value.length);
   } 
	public void setRpC7LogDesc8(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC7LogDesc8,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC7LogDesc9
	 *	@return rpC7LogDesc9
	 */
   public char[] getRpC7LogDesc9() throws CFException{
   		return rpC7LogDesc9;
   }

  
	/**
	*  set variable rpC7LogDesc9
	*  Corresponding COBOL Variable is RP-C7-LOG-DESC-9
	*  @param value
	**/
   public void setRpC7LogDesc9(char[] value) {
       value = checkRpC7LogDesc9Constraints(value);
       arraycopy(value,0,rpC7LogDesc9,0,value.length);
   } 
	public void setRpC7LogDesc9(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC7LogDesc9,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC7LogDescA
	 *	@return rpC7LogDescA
	 */
   public char[] getRpC7LogDescA() throws CFException{
   		return rpC7LogDescA;
   }

  
	/**
	*  set variable rpC7LogDescA
	*  Corresponding COBOL Variable is RP-C7-LOG-DESC-A
	*  @param value
	**/
   public void setRpC7LogDescA(char[] value) {
       value = checkRpC7LogDescAConstraints(value);
       arraycopy(value,0,rpC7LogDescA,0,value.length);
   } 
	public void setRpC7LogDescA(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC7LogDescA,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC8LogDesc1
	 *	@return rpC8LogDesc1
	 */
   public char[] getRpC8LogDesc1() throws CFException{
   		return rpC8LogDesc1;
   }

  
	/**
	*  set variable rpC8LogDesc1
	*  Corresponding COBOL Variable is RP-C8-LOG-DESC-1
	*  @param value
	**/
   public void setRpC8LogDesc1(char[] value) {
       value = checkRpC8LogDesc1Constraints(value);
       arraycopy(value,0,rpC8LogDesc1,0,value.length);
   } 
	public void setRpC8LogDesc1(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC8LogDesc1,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC8LogDesc2
	 *	@return rpC8LogDesc2
	 */
   public char[] getRpC8LogDesc2() throws CFException{
   		return rpC8LogDesc2;
   }

  
	/**
	*  set variable rpC8LogDesc2
	*  Corresponding COBOL Variable is RP-C8-LOG-DESC-2
	*  @param value
	**/
   public void setRpC8LogDesc2(char[] value) {
       value = checkRpC8LogDesc2Constraints(value);
       arraycopy(value,0,rpC8LogDesc2,0,value.length);
   } 
	public void setRpC8LogDesc2(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC8LogDesc2,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC8LogDesc3
	 *	@return rpC8LogDesc3
	 */
   public char[] getRpC8LogDesc3() throws CFException{
   		return rpC8LogDesc3;
   }

  
	/**
	*  set variable rpC8LogDesc3
	*  Corresponding COBOL Variable is RP-C8-LOG-DESC-3
	*  @param value
	**/
   public void setRpC8LogDesc3(char[] value) {
       value = checkRpC8LogDesc3Constraints(value);
       arraycopy(value,0,rpC8LogDesc3,0,value.length);
   } 
	public void setRpC8LogDesc3(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC8LogDesc3,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC8LogDesc4
	 *	@return rpC8LogDesc4
	 */
   public char[] getRpC8LogDesc4() throws CFException{
   		return rpC8LogDesc4;
   }

  
	/**
	*  set variable rpC8LogDesc4
	*  Corresponding COBOL Variable is RP-C8-LOG-DESC-4
	*  @param value
	**/
   public void setRpC8LogDesc4(char[] value) {
       value = checkRpC8LogDesc4Constraints(value);
       arraycopy(value,0,rpC8LogDesc4,0,value.length);
   } 
	public void setRpC8LogDesc4(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC8LogDesc4,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC8LogDesc5
	 *	@return rpC8LogDesc5
	 */
   public char[] getRpC8LogDesc5() throws CFException{
   		return rpC8LogDesc5;
   }

  
	/**
	*  set variable rpC8LogDesc5
	*  Corresponding COBOL Variable is RP-C8-LOG-DESC-5
	*  @param value
	**/
   public void setRpC8LogDesc5(char[] value) {
       value = checkRpC8LogDesc5Constraints(value);
       arraycopy(value,0,rpC8LogDesc5,0,value.length);
   } 
	public void setRpC8LogDesc5(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC8LogDesc5,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC8LogDesc6
	 *	@return rpC8LogDesc6
	 */
   public char[] getRpC8LogDesc6() throws CFException{
   		return rpC8LogDesc6;
   }

  
	/**
	*  set variable rpC8LogDesc6
	*  Corresponding COBOL Variable is RP-C8-LOG-DESC-6
	*  @param value
	**/
   public void setRpC8LogDesc6(char[] value) {
       value = checkRpC8LogDesc6Constraints(value);
       arraycopy(value,0,rpC8LogDesc6,0,value.length);
   } 
	public void setRpC8LogDesc6(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC8LogDesc6,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC8LogDesc7
	 *	@return rpC8LogDesc7
	 */
   public char[] getRpC8LogDesc7() throws CFException{
   		return rpC8LogDesc7;
   }

  
	/**
	*  set variable rpC8LogDesc7
	*  Corresponding COBOL Variable is RP-C8-LOG-DESC-7
	*  @param value
	**/
   public void setRpC8LogDesc7(char[] value) {
       value = checkRpC8LogDesc7Constraints(value);
       arraycopy(value,0,rpC8LogDesc7,0,value.length);
   } 
	public void setRpC8LogDesc7(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC8LogDesc7,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC8LogDesc8
	 *	@return rpC8LogDesc8
	 */
   public char[] getRpC8LogDesc8() throws CFException{
   		return rpC8LogDesc8;
   }

  
	/**
	*  set variable rpC8LogDesc8
	*  Corresponding COBOL Variable is RP-C8-LOG-DESC-8
	*  @param value
	**/
   public void setRpC8LogDesc8(char[] value) {
       value = checkRpC8LogDesc8Constraints(value);
       arraycopy(value,0,rpC8LogDesc8,0,value.length);
   } 
	public void setRpC8LogDesc8(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC8LogDesc8,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC8LogDescAlert
	 *	@return rpC8LogDescAlert
	 */
   public char[] getRpC8LogDescAlert() throws CFException{
   		return rpC8LogDescAlert;
   }

  
	/**
	*  set variable rpC8LogDescAlert
	*  Corresponding COBOL Variable is RP-C8-LOG-DESC-ALERT
	*  @param value
	**/
   public void setRpC8LogDescAlert(char[] value) {
       value = checkRpC8LogDescAlertConstraints(value);
       arraycopy(value,0,rpC8LogDescAlert,0,value.length);
   } 
	public void setRpC8LogDescAlert(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC8LogDescAlert,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC9LogDesc1
	 *	@return rpC9LogDesc1
	 */
   public char[] getRpC9LogDesc1() throws CFException{
   		return rpC9LogDesc1;
   }

  
	/**
	*  set variable rpC9LogDesc1
	*  Corresponding COBOL Variable is RP-C9-LOG-DESC-1
	*  @param value
	**/
   public void setRpC9LogDesc1(char[] value) {
       value = checkRpC9LogDesc1Constraints(value);
       arraycopy(value,0,rpC9LogDesc1,0,value.length);
   } 
	public void setRpC9LogDesc1(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC9LogDesc1,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC9LogDesc2
	 *	@return rpC9LogDesc2
	 */
   public char[] getRpC9LogDesc2() throws CFException{
   		return rpC9LogDesc2;
   }

  
	/**
	*  set variable rpC9LogDesc2
	*  Corresponding COBOL Variable is RP-C9-LOG-DESC-2
	*  @param value
	**/
   public void setRpC9LogDesc2(char[] value) {
       value = checkRpC9LogDesc2Constraints(value);
       arraycopy(value,0,rpC9LogDesc2,0,value.length);
   } 
	public void setRpC9LogDesc2(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC9LogDesc2,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC9LogDesc3
	 *	@return rpC9LogDesc3
	 */
   public char[] getRpC9LogDesc3() throws CFException{
   		return rpC9LogDesc3;
   }

  
	/**
	*  set variable rpC9LogDesc3
	*  Corresponding COBOL Variable is RP-C9-LOG-DESC-3
	*  @param value
	**/
   public void setRpC9LogDesc3(char[] value) {
       value = checkRpC9LogDesc3Constraints(value);
       arraycopy(value,0,rpC9LogDesc3,0,value.length);
   } 
	public void setRpC9LogDesc3(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC9LogDesc3,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC9LogDesc4
	 *	@return rpC9LogDesc4
	 */
   public char[] getRpC9LogDesc4() throws CFException{
   		return rpC9LogDesc4;
   }

  
	/**
	*  set variable rpC9LogDesc4
	*  Corresponding COBOL Variable is RP-C9-LOG-DESC-4
	*  @param value
	**/
   public void setRpC9LogDesc4(char[] value) {
       value = checkRpC9LogDesc4Constraints(value);
       arraycopy(value,0,rpC9LogDesc4,0,value.length);
   } 
	public void setRpC9LogDesc4(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC9LogDesc4,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC9LogDesc5
	 *	@return rpC9LogDesc5
	 */
   public char[] getRpC9LogDesc5() throws CFException{
   		return rpC9LogDesc5;
   }

  
	/**
	*  set variable rpC9LogDesc5
	*  Corresponding COBOL Variable is RP-C9-LOG-DESC-5
	*  @param value
	**/
   public void setRpC9LogDesc5(char[] value) {
       value = checkRpC9LogDesc5Constraints(value);
       arraycopy(value,0,rpC9LogDesc5,0,value.length);
   } 
	public void setRpC9LogDesc5(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC9LogDesc5,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC9LogDesc6
	 *	@return rpC9LogDesc6
	 */
   public char[] getRpC9LogDesc6() throws CFException{
   		return rpC9LogDesc6;
   }

  
	/**
	*  set variable rpC9LogDesc6
	*  Corresponding COBOL Variable is RP-C9-LOG-DESC-6
	*  @param value
	**/
   public void setRpC9LogDesc6(char[] value) {
       value = checkRpC9LogDesc6Constraints(value);
       arraycopy(value,0,rpC9LogDesc6,0,value.length);
   } 
	public void setRpC9LogDesc6(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC9LogDesc6,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC9LogDesc7
	 *	@return rpC9LogDesc7
	 */
   public char[] getRpC9LogDesc7() throws CFException{
   		return rpC9LogDesc7;
   }

  
	/**
	*  set variable rpC9LogDesc7
	*  Corresponding COBOL Variable is RP-C9-LOG-DESC-7
	*  @param value
	**/
   public void setRpC9LogDesc7(char[] value) {
       value = checkRpC9LogDesc7Constraints(value);
       arraycopy(value,0,rpC9LogDesc7,0,value.length);
   } 
	public void setRpC9LogDesc7(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC9LogDesc7,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC9LogDesc8
	 *	@return rpC9LogDesc8
	 */
   public char[] getRpC9LogDesc8() throws CFException{
   		return rpC9LogDesc8;
   }

  
	/**
	*  set variable rpC9LogDesc8
	*  Corresponding COBOL Variable is RP-C9-LOG-DESC-8
	*  @param value
	**/
   public void setRpC9LogDesc8(char[] value) {
       value = checkRpC9LogDesc8Constraints(value);
       arraycopy(value,0,rpC9LogDesc8,0,value.length);
   } 
	public void setRpC9LogDesc8(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC9LogDesc8,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC9LogDesc9
	 *	@return rpC9LogDesc9
	 */
   public char[] getRpC9LogDesc9() throws CFException{
   		return rpC9LogDesc9;
   }

  
	/**
	*  set variable rpC9LogDesc9
	*  Corresponding COBOL Variable is RP-C9-LOG-DESC-9
	*  @param value
	**/
   public void setRpC9LogDesc9(char[] value) {
       value = checkRpC9LogDesc9Constraints(value);
       arraycopy(value,0,rpC9LogDesc9,0,value.length);
   } 
	public void setRpC9LogDesc9(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC9LogDesc9,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC9LogDesc10
	 *	@return rpC9LogDesc10
	 */
   public char[] getRpC9LogDesc10() throws CFException{
   		return rpC9LogDesc10;
   }

  
	/**
	*  set variable rpC9LogDesc10
	*  Corresponding COBOL Variable is RP-C9-LOG-DESC-10
	*  @param value
	**/
   public void setRpC9LogDesc10(char[] value) {
       value = checkRpC9LogDesc10Constraints(value);
       arraycopy(value,0,rpC9LogDesc10,0,value.length);
   } 
	public void setRpC9LogDesc10(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC9LogDesc10,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC9LogDesc11
	 *	@return rpC9LogDesc11
	 */
   public char[] getRpC9LogDesc11() throws CFException{
   		return rpC9LogDesc11;
   }

  
	/**
	*  set variable rpC9LogDesc11
	*  Corresponding COBOL Variable is RP-C9-LOG-DESC-11
	*  @param value
	**/
   public void setRpC9LogDesc11(char[] value) {
       value = checkRpC9LogDesc11Constraints(value);
       arraycopy(value,0,rpC9LogDesc11,0,value.length);
   } 
	public void setRpC9LogDesc11(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC9LogDesc11,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC9LogDesc12
	 *	@return rpC9LogDesc12
	 */
   public char[] getRpC9LogDesc12() throws CFException{
   		return rpC9LogDesc12;
   }

  
	/**
	*  set variable rpC9LogDesc12
	*  Corresponding COBOL Variable is RP-C9-LOG-DESC-12
	*  @param value
	**/
   public void setRpC9LogDesc12(char[] value) {
       value = checkRpC9LogDesc12Constraints(value);
       arraycopy(value,0,rpC9LogDesc12,0,value.length);
   } 
	public void setRpC9LogDesc12(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC9LogDesc12,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC9LogDesc13
	 *	@return rpC9LogDesc13
	 */
   public char[] getRpC9LogDesc13() throws CFException{
   		return rpC9LogDesc13;
   }

  
	/**
	*  set variable rpC9LogDesc13
	*  Corresponding COBOL Variable is RP-C9-LOG-DESC-13
	*  @param value
	**/
   public void setRpC9LogDesc13(char[] value) {
       value = checkRpC9LogDesc13Constraints(value);
       arraycopy(value,0,rpC9LogDesc13,0,value.length);
   } 
	public void setRpC9LogDesc13(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC9LogDesc13,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC9LogDesc14
	 *	@return rpC9LogDesc14
	 */
   public char[] getRpC9LogDesc14() throws CFException{
   		return rpC9LogDesc14;
   }

  
	/**
	*  set variable rpC9LogDesc14
	*  Corresponding COBOL Variable is RP-C9-LOG-DESC-14
	*  @param value
	**/
   public void setRpC9LogDesc14(char[] value) {
       value = checkRpC9LogDesc14Constraints(value);
       arraycopy(value,0,rpC9LogDesc14,0,value.length);
   } 
	public void setRpC9LogDesc14(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC9LogDesc14,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC9LogDesc15
	 *	@return rpC9LogDesc15
	 */
   public char[] getRpC9LogDesc15() throws CFException{
   		return rpC9LogDesc15;
   }

  
	/**
	*  set variable rpC9LogDesc15
	*  Corresponding COBOL Variable is RP-C9-LOG-DESC-15
	*  @param value
	**/
   public void setRpC9LogDesc15(char[] value) {
       value = checkRpC9LogDesc15Constraints(value);
       arraycopy(value,0,rpC9LogDesc15,0,value.length);
   } 
	public void setRpC9LogDesc15(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC9LogDesc15,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC9LogDesc16
	 *	@return rpC9LogDesc16
	 */
   public char[] getRpC9LogDesc16() throws CFException{
   		return rpC9LogDesc16;
   }

  
	/**
	*  set variable rpC9LogDesc16
	*  Corresponding COBOL Variable is RP-C9-LOG-DESC-16
	*  @param value
	**/
   public void setRpC9LogDesc16(char[] value) {
       value = checkRpC9LogDesc16Constraints(value);
       arraycopy(value,0,rpC9LogDesc16,0,value.length);
   } 
	public void setRpC9LogDesc16(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC9LogDesc16,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC9LogDesc17
	 *	@return rpC9LogDesc17
	 */
   public char[] getRpC9LogDesc17() throws CFException{
   		return rpC9LogDesc17;
   }

  
	/**
	*  set variable rpC9LogDesc17
	*  Corresponding COBOL Variable is RP-C9-LOG-DESC-17
	*  @param value
	**/
   public void setRpC9LogDesc17(char[] value) {
       value = checkRpC9LogDesc17Constraints(value);
       arraycopy(value,0,rpC9LogDesc17,0,value.length);
   } 
	public void setRpC9LogDesc17(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC9LogDesc17,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC9LogDesc18
	 *	@return rpC9LogDesc18
	 */
   public char[] getRpC9LogDesc18() throws CFException{
   		return rpC9LogDesc18;
   }

  
	/**
	*  set variable rpC9LogDesc18
	*  Corresponding COBOL Variable is RP-C9-LOG-DESC-18
	*  @param value
	**/
   public void setRpC9LogDesc18(char[] value) {
       value = checkRpC9LogDesc18Constraints(value);
       arraycopy(value,0,rpC9LogDesc18,0,value.length);
   } 
	public void setRpC9LogDesc18(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC9LogDesc18,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC9LogDesc19
	 *	@return rpC9LogDesc19
	 */
   public char[] getRpC9LogDesc19() throws CFException{
   		return rpC9LogDesc19;
   }

  
	/**
	*  set variable rpC9LogDesc19
	*  Corresponding COBOL Variable is RP-C9-LOG-DESC-19
	*  @param value
	**/
   public void setRpC9LogDesc19(char[] value) {
       value = checkRpC9LogDesc19Constraints(value);
       arraycopy(value,0,rpC9LogDesc19,0,value.length);
   } 
	public void setRpC9LogDesc19(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC9LogDesc19,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC9LogDesc20
	 *	@return rpC9LogDesc20
	 */
   public char[] getRpC9LogDesc20() throws CFException{
   		return rpC9LogDesc20;
   }

  
	/**
	*  set variable rpC9LogDesc20
	*  Corresponding COBOL Variable is RP-C9-LOG-DESC-20
	*  @param value
	**/
   public void setRpC9LogDesc20(char[] value) {
       value = checkRpC9LogDesc20Constraints(value);
       arraycopy(value,0,rpC9LogDesc20,0,value.length);
   } 
	public void setRpC9LogDesc20(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC9LogDesc20,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC9LogDesc21
	 *	@return rpC9LogDesc21
	 */
   public char[] getRpC9LogDesc21() throws CFException{
   		return rpC9LogDesc21;
   }

  
	/**
	*  set variable rpC9LogDesc21
	*  Corresponding COBOL Variable is RP-C9-LOG-DESC-21
	*  @param value
	**/
   public void setRpC9LogDesc21(char[] value) {
       value = checkRpC9LogDesc21Constraints(value);
       arraycopy(value,0,rpC9LogDesc21,0,value.length);
   } 
	public void setRpC9LogDesc21(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC9LogDesc21,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC9LogDesc22
	 *	@return rpC9LogDesc22
	 */
   public char[] getRpC9LogDesc22() throws CFException{
   		return rpC9LogDesc22;
   }

  
	/**
	*  set variable rpC9LogDesc22
	*  Corresponding COBOL Variable is RP-C9-LOG-DESC-22
	*  @param value
	**/
   public void setRpC9LogDesc22(char[] value) {
       value = checkRpC9LogDesc22Constraints(value);
       arraycopy(value,0,rpC9LogDesc22,0,value.length);
   } 
	public void setRpC9LogDesc22(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC9LogDesc22,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC9LogDesc23
	 *	@return rpC9LogDesc23
	 */
   public char[] getRpC9LogDesc23() throws CFException{
   		return rpC9LogDesc23;
   }

  
	/**
	*  set variable rpC9LogDesc23
	*  Corresponding COBOL Variable is RP-C9-LOG-DESC-23
	*  @param value
	**/
   public void setRpC9LogDesc23(char[] value) {
       value = checkRpC9LogDesc23Constraints(value);
       arraycopy(value,0,rpC9LogDesc23,0,value.length);
   } 
	public void setRpC9LogDesc23(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC9LogDesc23,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC9LogDesc24
	 *	@return rpC9LogDesc24
	 */
   public char[] getRpC9LogDesc24() throws CFException{
   		return rpC9LogDesc24;
   }

  
	/**
	*  set variable rpC9LogDesc24
	*  Corresponding COBOL Variable is RP-C9-LOG-DESC-24
	*  @param value
	**/
   public void setRpC9LogDesc24(char[] value) {
       value = checkRpC9LogDesc24Constraints(value);
       arraycopy(value,0,rpC9LogDesc24,0,value.length);
   } 
	public void setRpC9LogDesc24(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC9LogDesc24,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC9LogDesc25
	 *	@return rpC9LogDesc25
	 */
   public char[] getRpC9LogDesc25() throws CFException{
   		return rpC9LogDesc25;
   }

  
	/**
	*  set variable rpC9LogDesc25
	*  Corresponding COBOL Variable is RP-C9-LOG-DESC-25
	*  @param value
	**/
   public void setRpC9LogDesc25(char[] value) {
       value = checkRpC9LogDesc25Constraints(value);
       arraycopy(value,0,rpC9LogDesc25,0,value.length);
   } 
	public void setRpC9LogDesc25(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC9LogDesc25,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC9LogDesc26
	 *	@return rpC9LogDesc26
	 */
   public char[] getRpC9LogDesc26() throws CFException{
   		return rpC9LogDesc26;
   }

  
	/**
	*  set variable rpC9LogDesc26
	*  Corresponding COBOL Variable is RP-C9-LOG-DESC-26
	*  @param value
	**/
   public void setRpC9LogDesc26(char[] value) {
       value = checkRpC9LogDesc26Constraints(value);
       arraycopy(value,0,rpC9LogDesc26,0,value.length);
   } 
	public void setRpC9LogDesc26(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC9LogDesc26,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpUndefLogDesc
	 *	@return rpUndefLogDesc
	 */
   public char[] getRpUndefLogDesc() throws CFException{
   		return rpUndefLogDesc;
   }

  
	/**
	*  set variable rpUndefLogDesc
	*  Corresponding COBOL Variable is RP-UNDEF-LOG-DESC
	*  @param value
	**/
   public void setRpUndefLogDesc(char[] value) {
       value = checkRpUndefLogDescConstraints(value);
       arraycopy(value,0,rpUndefLogDesc,0,value.length);
   } 
	public void setRpUndefLogDesc(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpUndefLogDesc,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpEmailOpHeading3200
	 *	@return rpEmailOpHeading3200
	 */
   public char[] getRpEmailOpHeading3200() throws CFException{
   		return rpEmailOpHeading3200;
   }

  
	/**
	*  set variable rpEmailOpHeading3200
	*  Corresponding COBOL Variable is 200-RP-EMAIL-OP-HEADING-3
	*  @param value
	**/
   public void setRpEmailOpHeading3200(char[] value) {
       value = checkRpEmailOpHeading3200Constraints(value);
       arraycopy(value,0,rpEmailOpHeading3200,0,value.length);
   } 
	public void setRpEmailOpHeading3200(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpEmailOpHeading3200,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpBdHeading3
	 *	@return rpBdHeading3
	 */
   public char[] getRpBdHeading3() throws CFException{
   		return rpBdHeading3;
   }

  
	/**
	*  set variable rpBdHeading3
	*  Corresponding COBOL Variable is RP-BD-HEADING-3
	*  @param value
	**/
   public void setRpBdHeading3(char[] value) {
       value = checkRpBdHeading3Constraints(value);
       arraycopy(value,0,rpBdHeading3,0,value.length);
   } 
	public void setRpBdHeading3(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpBdHeading3,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpOpHeading3
	 *	@return rpOpHeading3
	 */
   public char[] getRpOpHeading3() throws CFException{
   		return rpOpHeading3;
   }

  
	/**
	*  set variable rpOpHeading3
	*  Corresponding COBOL Variable is RP-OP-HEADING-3
	*  @param value
	**/
   public void setRpOpHeading3(char[] value) {
       value = checkRpOpHeading3Constraints(value);
       arraycopy(value,0,rpOpHeading3,0,value.length);
   } 
	public void setRpOpHeading3(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpOpHeading3,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpMpDetail3
	 *	@return rpMpDetail3
	 */
   public char[] getRpMpDetail3() throws CFException{
   		return rpMpDetail3;
   }

  
	/**
	*  set variable rpMpDetail3
	*  Corresponding COBOL Variable is RP-MP-DETAIL-3
	*  @param value
	**/
   public void setRpMpDetail3(char[] value) {
       value = checkRpMpDetail3Constraints(value);
       arraycopy(value,0,rpMpDetail3,0,value.length);
   } 
	public void setRpMpDetail3(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpMpDetail3,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpPsHeading3
	 *	@return rpPsHeading3
	 */
   public char[] getRpPsHeading3() throws CFException{
   		return rpPsHeading3;
   }

  
	/**
	*  set variable rpPsHeading3
	*  Corresponding COBOL Variable is RP-PS-HEADING-3
	*  @param value
	**/
   public void setRpPsHeading3(char[] value) {
       value = checkRpPsHeading3Constraints(value);
       arraycopy(value,0,rpPsHeading3,0,value.length);
   } 
	public void setRpPsHeading3(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpPsHeading3,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpPsHeading4
	 *	@return rpPsHeading4
	 */
   public char[] getRpPsHeading4() throws CFException{
   		return rpPsHeading4;
   }

  
	/**
	*  set variable rpPsHeading4
	*  Corresponding COBOL Variable is RP-PS-HEADING-4
	*  @param value
	**/
   public void setRpPsHeading4(char[] value) {
       value = checkRpPsHeading4Constraints(value);
       arraycopy(value,0,rpPsHeading4,0,value.length);
   } 
	public void setRpPsHeading4(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpPsHeading4,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC7Heading2
	 *	@return rpC7Heading2
	 */
   public char[] getRpC7Heading2() throws CFException{
   		return rpC7Heading2;
   }

  
	/**
	*  set variable rpC7Heading2
	*  Corresponding COBOL Variable is RP-C7-HEADING-2
	*  @param value
	**/
   public void setRpC7Heading2(char[] value) {
       value = checkRpC7Heading2Constraints(value);
       arraycopy(value,0,rpC7Heading2,0,value.length);
   } 
	public void setRpC7Heading2(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC7Heading2,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC7Heading5
	 *	@return rpC7Heading5
	 */
   public char[] getRpC7Heading5() throws CFException{
   		return rpC7Heading5;
   }

  
	/**
	*  set variable rpC7Heading5
	*  Corresponding COBOL Variable is RP-C7-HEADING-5
	*  @param value
	**/
   public void setRpC7Heading5(char[] value) {
       value = checkRpC7Heading5Constraints(value);
       arraycopy(value,0,rpC7Heading5,0,value.length);
   } 
	public void setRpC7Heading5(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC7Heading5,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC8Heading2
	 *	@return rpC8Heading2
	 */
   public char[] getRpC8Heading2() throws CFException{
   		return rpC8Heading2;
   }

  
	/**
	*  set variable rpC8Heading2
	*  Corresponding COBOL Variable is RP-C8-HEADING-2
	*  @param value
	**/
   public void setRpC8Heading2(char[] value) {
       value = checkRpC8Heading2Constraints(value);
       arraycopy(value,0,rpC8Heading2,0,value.length);
   } 
	public void setRpC8Heading2(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC8Heading2,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC8Heading4
	 *	@return rpC8Heading4
	 */
   public char[] getRpC8Heading4() throws CFException{
   		return rpC8Heading4;
   }

  
	/**
	*  set variable rpC8Heading4
	*  Corresponding COBOL Variable is RP-C8-HEADING-4
	*  @param value
	**/
   public void setRpC8Heading4(char[] value) {
       value = checkRpC8Heading4Constraints(value);
       arraycopy(value,0,rpC8Heading4,0,value.length);
   } 
	public void setRpC8Heading4(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC8Heading4,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC8Heading5
	 *	@return rpC8Heading5
	 */
   public char[] getRpC8Heading5() throws CFException{
   		return rpC8Heading5;
   }

  
	/**
	*  set variable rpC8Heading5
	*  Corresponding COBOL Variable is RP-C8-HEADING-5
	*  @param value
	**/
   public void setRpC8Heading5(char[] value) {
       value = checkRpC8Heading5Constraints(value);
       arraycopy(value,0,rpC8Heading5,0,value.length);
   } 
	public void setRpC8Heading5(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC8Heading5,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC9Heading2
	 *	@return rpC9Heading2
	 */
   public char[] getRpC9Heading2() throws CFException{
   		return rpC9Heading2;
   }

  
	/**
	*  set variable rpC9Heading2
	*  Corresponding COBOL Variable is RP-C9-HEADING-2
	*  @param value
	**/
   public void setRpC9Heading2(char[] value) {
       value = checkRpC9Heading2Constraints(value);
       arraycopy(value,0,rpC9Heading2,0,value.length);
   } 
	public void setRpC9Heading2(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC9Heading2,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rpC9Heading5
	 *	@return rpC9Heading5
	 */
   public char[] getRpC9Heading5() throws CFException{
   		return rpC9Heading5;
   }

  
	/**
	*  set variable rpC9Heading5
	*  Corresponding COBOL Variable is RP-C9-HEADING-5
	*  @param value
	**/
   public void setRpC9Heading5(char[] value) {
       value = checkRpC9Heading5Constraints(value);
       arraycopy(value,0,rpC9Heading5,0,value.length);
   } 
	public void setRpC9Heading5(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rpC9Heading5,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ctRptBdLineNo
	 *	@return ctRptBdLineNo
	 */
	public int getCtRptBdLineNo() throws CFException {
   		return ctRptBdLineNo;
	}
	
	/**
	 * 	Update CtRptBdLineNo with the passed value
	 *  Corresponding COBOL Variable is CT-RPT-BD-LINE-NO
	 *	@param number
	 */
	public void setCtRptBdLineNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ctRptBdLineNo = checkCtRptBdLineNoMaxLimit(number); 
	}


	public void setCtRptBdLineNo(long number) {
	    number = checkCtRptBdLineNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCtRptBdLineNo((int)number);
	}
	
	/**
	 *	Returns the value of ctRptBdPageNo
	 *	@return ctRptBdPageNo
	 */
	public int getCtRptBdPageNo() throws CFException {
   		return ctRptBdPageNo;
	}
	
	/**
	 * 	Update CtRptBdPageNo with the passed value
	 *  Corresponding COBOL Variable is CT-RPT-BD-PAGE-NO
	 *	@param number
	 */
	public void setCtRptBdPageNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ctRptBdPageNo = checkCtRptBdPageNoMaxLimit(number); 
	}


	public void setCtRptBdPageNo(long number) {
	    number = checkCtRptBdPageNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCtRptBdPageNo((int)number);
	}
	
	/**
	 *	Returns the value of ctRptOpLineNo
	 *	@return ctRptOpLineNo
	 */
	public int getCtRptOpLineNo() throws CFException {
   		return ctRptOpLineNo;
	}
	
	/**
	 * 	Update CtRptOpLineNo with the passed value
	 *  Corresponding COBOL Variable is CT-RPT-OP-LINE-NO
	 *	@param number
	 */
	public void setCtRptOpLineNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ctRptOpLineNo = checkCtRptOpLineNoMaxLimit(number); 
	}


	public void setCtRptOpLineNo(long number) {
	    number = checkCtRptOpLineNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCtRptOpLineNo((int)number);
	}
	
	/**
	 *	Returns the value of ctRptOpPageNo
	 *	@return ctRptOpPageNo
	 */
	public int getCtRptOpPageNo() throws CFException {
   		return ctRptOpPageNo;
	}
	
	/**
	 * 	Update CtRptOpPageNo with the passed value
	 *  Corresponding COBOL Variable is CT-RPT-OP-PAGE-NO
	 *	@param number
	 */
	public void setCtRptOpPageNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ctRptOpPageNo = checkCtRptOpPageNoMaxLimit(number); 
	}


	public void setCtRptOpPageNo(long number) {
	    number = checkCtRptOpPageNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCtRptOpPageNo((int)number);
	}
	
	/**
	 *	Returns the value of ctRptMpLineNo
	 *	@return ctRptMpLineNo
	 */
	public int getCtRptMpLineNo() throws CFException {
   		return ctRptMpLineNo;
	}
	
	/**
	 * 	Update CtRptMpLineNo with the passed value
	 *  Corresponding COBOL Variable is CT-RPT-MP-LINE-NO
	 *	@param number
	 */
	public void setCtRptMpLineNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ctRptMpLineNo = checkCtRptMpLineNoMaxLimit(number); 
	}


	public void setCtRptMpLineNo(long number) {
	    number = checkCtRptMpLineNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCtRptMpLineNo((int)number);
	}
	
	/**
	 *	Returns the value of ctRptMpPageNo
	 *	@return ctRptMpPageNo
	 */
	public int getCtRptMpPageNo() throws CFException {
   		return ctRptMpPageNo;
	}
	
	/**
	 * 	Update CtRptMpPageNo with the passed value
	 *  Corresponding COBOL Variable is CT-RPT-MP-PAGE-NO
	 *	@param number
	 */
	public void setCtRptMpPageNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ctRptMpPageNo = checkCtRptMpPageNoMaxLimit(number); 
	}


	public void setCtRptMpPageNo(long number) {
	    number = checkCtRptMpPageNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCtRptMpPageNo((int)number);
	}
	
	/**
	 *	Returns the value of ctRptPsLineNo
	 *	@return ctRptPsLineNo
	 */
	public int getCtRptPsLineNo() throws CFException {
   		return ctRptPsLineNo;
	}
	
	/**
	 * 	Update CtRptPsLineNo with the passed value
	 *  Corresponding COBOL Variable is CT-RPT-PS-LINE-NO
	 *	@param number
	 */
	public void setCtRptPsLineNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ctRptPsLineNo = checkCtRptPsLineNoMaxLimit(number); 
	}


	public void setCtRptPsLineNo(long number) {
	    number = checkCtRptPsLineNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCtRptPsLineNo((int)number);
	}
	
	/**
	 *	Returns the value of ctRptPsPageNo
	 *	@return ctRptPsPageNo
	 */
	public int getCtRptPsPageNo() throws CFException {
   		return ctRptPsPageNo;
	}
	
	/**
	 * 	Update CtRptPsPageNo with the passed value
	 *  Corresponding COBOL Variable is CT-RPT-PS-PAGE-NO
	 *	@param number
	 */
	public void setCtRptPsPageNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ctRptPsPageNo = checkCtRptPsPageNoMaxLimit(number); 
	}


	public void setCtRptPsPageNo(long number) {
	    number = checkCtRptPsPageNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCtRptPsPageNo((int)number);
	}
	
	/**
	 *	Returns the value of ctRptT2PageNo
	 *	@return ctRptT2PageNo
	 */
	public int getCtRptT2PageNo() throws CFException {
   		return ctRptT2PageNo;
	}
	
	/**
	 * 	Update CtRptT2PageNo with the passed value
	 *  Corresponding COBOL Variable is CT-RPT-T2-PAGE-NO
	 *	@param number
	 */
	public void setCtRptT2PageNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ctRptT2PageNo = checkCtRptT2PageNoMaxLimit(number); 
	}


	public void setCtRptT2PageNo(long number) {
	    number = checkCtRptT2PageNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCtRptT2PageNo((int)number);
	}
	
	/**
	 *	Returns the value of ctRptRcLineNo
	 *	@return ctRptRcLineNo
	 */
	public int getCtRptRcLineNo() throws CFException {
   		return ctRptRcLineNo;
	}
	
	/**
	 * 	Update CtRptRcLineNo with the passed value
	 *  Corresponding COBOL Variable is CT-RPT-RC-LINE-NO
	 *	@param number
	 */
	public void setCtRptRcLineNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ctRptRcLineNo = checkCtRptRcLineNoMaxLimit(number); 
	}


	public void setCtRptRcLineNo(long number) {
	    number = checkCtRptRcLineNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCtRptRcLineNo((int)number);
	}
	
	/**
	 *	Returns the value of ctRptRcPageNo
	 *	@return ctRptRcPageNo
	 */
	public int getCtRptRcPageNo() throws CFException {
   		return ctRptRcPageNo;
	}
	
	/**
	 * 	Update CtRptRcPageNo with the passed value
	 *  Corresponding COBOL Variable is CT-RPT-RC-PAGE-NO
	 *	@param number
	 */
	public void setCtRptRcPageNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ctRptRcPageNo = checkCtRptRcPageNoMaxLimit(number); 
	}


	public void setCtRptRcPageNo(long number) {
	    number = checkCtRptRcPageNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCtRptRcPageNo((int)number);
	}
	
	/**
	 *	Returns the value of ctRptC9PageNo
	 *	@return ctRptC9PageNo
	 */
	public int getCtRptC9PageNo() throws CFException {
   		return ctRptC9PageNo;
	}
	
	/**
	 * 	Update CtRptC9PageNo with the passed value
	 *  Corresponding COBOL Variable is CT-RPT-C9-PAGE-NO
	 *	@param number
	 */
	public void setCtRptC9PageNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ctRptC9PageNo = checkCtRptC9PageNoMaxLimit(number); 
	}


	public void setCtRptC9PageNo(long number) {
	    number = checkCtRptC9PageNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCtRptC9PageNo((int)number);
	}
	
	/**
	 *	Returns the value of ctLogStats
	 *	@return ctLogStats
	 */
	public long getCtLogStats() throws CFException {
   		return ctLogStats;
	}
	
	/**
	 * 	Update CtLogStats with the passed value
	 *  Corresponding COBOL Variable is CT-LOG-STATS
	 *	@param number
	 */
	public void setCtLogStats(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctLogStats = checkCtLogStatsMaxLimit(number); 
	}


	/**
	 *	Returns the value of ctLogBulkData
	 *	@return ctLogBulkData
	 */
	public long getCtLogBulkData() throws CFException {
   		return ctLogBulkData;
	}
	
	/**
	 * 	Update CtLogBulkData with the passed value
	 *  Corresponding COBOL Variable is CT-LOG-BULK-DATA
	 *	@param number
	 */
	public void setCtLogBulkData(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctLogBulkData = checkCtLogBulkDataMaxLimit(number); 
	}


	/**
	 *	Returns the value of ctLogBulkData32
	 *	@return ctLogBulkData32
	 */
	public long getCtLogBulkData32() throws CFException {
   		return ctLogBulkData32;
	}
	
	/**
	 * 	Update CtLogBulkData32 with the passed value
	 *  Corresponding COBOL Variable is CT-LOG-BULK-DATA32
	 *	@param number
	 */
	public void setCtLogBulkData32(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctLogBulkData32 = checkCtLogBulkData32MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctLogOperator
	 *	@return ctLogOperator
	 */
	public long getCtLogOperator() throws CFException {
   		return ctLogOperator;
	}
	
	/**
	 * 	Update CtLogOperator with the passed value
	 *  Corresponding COBOL Variable is CT-LOG-OPERATOR
	 *	@param number
	 */
	public void setCtLogOperator(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctLogOperator = checkCtLogOperatorMaxLimit(number); 
	}


	/**
	 *	Returns the value of ctLogMipProfile
	 *	@return ctLogMipProfile
	 */
	public long getCtLogMipProfile() throws CFException {
   		return ctLogMipProfile;
	}
	
	/**
	 * 	Update CtLogMipProfile with the passed value
	 *  Corresponding COBOL Variable is CT-LOG-MIP-PROFILE
	 *	@param number
	 */
	public void setCtLogMipProfile(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctLogMipProfile = checkCtLogMipProfileMaxLimit(number); 
	}


	/**
	 *	Returns the value of ctLogPos
	 *	@return ctLogPos
	 */
	public long getCtLogPos() throws CFException {
   		return ctLogPos;
	}
	
	/**
	 * 	Update CtLogPos with the passed value
	 *  Corresponding COBOL Variable is CT-LOG-POS
	 *	@param number
	 */
	public void setCtLogPos(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctLogPos = checkCtLogPosMaxLimit(number); 
	}


	/**
	 *	Returns the value of ctLogTypeii
	 *	@return ctLogTypeii
	 */
	public long getCtLogTypeii() throws CFException {
   		return ctLogTypeii;
	}
	
	/**
	 * 	Update CtLogTypeii with the passed value
	 *  Corresponding COBOL Variable is CT-LOG-TYPEII
	 *	@param number
	 */
	public void setCtLogTypeii(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctLogTypeii = checkCtLogTypeiiMaxLimit(number); 
	}


	/**
	 *	Returns the value of ctLogRemCons
	 *	@return ctLogRemCons
	 */
	public long getCtLogRemCons() throws CFException {
   		return ctLogRemCons;
	}
	
	/**
	 * 	Update CtLogRemCons with the passed value
	 *  Corresponding COBOL Variable is CT-LOG-REM-CONS
	 *	@param number
	 */
	public void setCtLogRemCons(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctLogRemCons = checkCtLogRemConsMaxLimit(number); 
	}


	/**
	 *	Returns the value of ctLogX92
	 *	@return ctLogX92
	 */
	public long getCtLogX92() throws CFException {
   		return ctLogX92;
	}
	
	/**
	 * 	Update CtLogX92 with the passed value
	 *  Corresponding COBOL Variable is CT-LOG-X92
	 *	@param number
	 */
	public void setCtLogX92(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctLogX92 = checkCtLogX92MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctLogEdc
	 *	@return ctLogEdc
	 */
	public long getCtLogEdc() throws CFException {
   		return ctLogEdc;
	}
	
	/**
	 * 	Update CtLogEdc with the passed value
	 *  Corresponding COBOL Variable is CT-LOG-EDC
	 *	@param number
	 */
	public void setCtLogEdc(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctLogEdc = checkCtLogEdcMaxLimit(number); 
	}


	/**
	 *	Returns the value of ctLogChk
	 *	@return ctLogChk
	 */
	public long getCtLogChk() throws CFException {
   		return ctLogChk;
	}
	
	/**
	 * 	Update CtLogChk with the passed value
	 *  Corresponding COBOL Variable is CT-LOG-CHK
	 *	@param number
	 */
	public void setCtLogChk(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctLogChk = checkCtLogChkMaxLimit(number); 
	}


	/**
	 *	Returns the value of ctLogOther
	 *	@return ctLogOther
	 */
	public long getCtLogOther() throws CFException {
   		return ctLogOther;
	}
	
	/**
	 * 	Update CtLogOther with the passed value
	 *  Corresponding COBOL Variable is CT-LOG-OTHER
	 *	@param number
	 */
	public void setCtLogOther(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctLogOther = checkCtLogOtherMaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC7LogType1
	 *	@return ctC7LogType1
	 */
	public long getCtC7LogType1() throws CFException {
   		return ctC7LogType1;
	}
	
	/**
	 * 	Update CtC7LogType1 with the passed value
	 *  Corresponding COBOL Variable is CT-C7-LOG-TYPE-1
	 *	@param number
	 */
	public void setCtC7LogType1(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC7LogType1 = checkCtC7LogType1MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC7LogType2
	 *	@return ctC7LogType2
	 */
	public long getCtC7LogType2() throws CFException {
   		return ctC7LogType2;
	}
	
	/**
	 * 	Update CtC7LogType2 with the passed value
	 *  Corresponding COBOL Variable is CT-C7-LOG-TYPE-2
	 *	@param number
	 */
	public void setCtC7LogType2(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC7LogType2 = checkCtC7LogType2MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC7LogType3
	 *	@return ctC7LogType3
	 */
	public long getCtC7LogType3() throws CFException {
   		return ctC7LogType3;
	}
	
	/**
	 * 	Update CtC7LogType3 with the passed value
	 *  Corresponding COBOL Variable is CT-C7-LOG-TYPE-3
	 *	@param number
	 */
	public void setCtC7LogType3(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC7LogType3 = checkCtC7LogType3MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC7LogType4
	 *	@return ctC7LogType4
	 */
	public long getCtC7LogType4() throws CFException {
   		return ctC7LogType4;
	}
	
	/**
	 * 	Update CtC7LogType4 with the passed value
	 *  Corresponding COBOL Variable is CT-C7-LOG-TYPE-4
	 *	@param number
	 */
	public void setCtC7LogType4(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC7LogType4 = checkCtC7LogType4MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC7LogType5
	 *	@return ctC7LogType5
	 */
	public long getCtC7LogType5() throws CFException {
   		return ctC7LogType5;
	}
	
	/**
	 * 	Update CtC7LogType5 with the passed value
	 *  Corresponding COBOL Variable is CT-C7-LOG-TYPE-5
	 *	@param number
	 */
	public void setCtC7LogType5(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC7LogType5 = checkCtC7LogType5MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC7LogType6
	 *	@return ctC7LogType6
	 */
	public long getCtC7LogType6() throws CFException {
   		return ctC7LogType6;
	}
	
	/**
	 * 	Update CtC7LogType6 with the passed value
	 *  Corresponding COBOL Variable is CT-C7-LOG-TYPE-6
	 *	@param number
	 */
	public void setCtC7LogType6(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC7LogType6 = checkCtC7LogType6MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC7LogType7
	 *	@return ctC7LogType7
	 */
	public long getCtC7LogType7() throws CFException {
   		return ctC7LogType7;
	}
	
	/**
	 * 	Update CtC7LogType7 with the passed value
	 *  Corresponding COBOL Variable is CT-C7-LOG-TYPE-7
	 *	@param number
	 */
	public void setCtC7LogType7(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC7LogType7 = checkCtC7LogType7MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC7LogType8
	 *	@return ctC7LogType8
	 */
	public long getCtC7LogType8() throws CFException {
   		return ctC7LogType8;
	}
	
	/**
	 * 	Update CtC7LogType8 with the passed value
	 *  Corresponding COBOL Variable is CT-C7-LOG-TYPE-8
	 *	@param number
	 */
	public void setCtC7LogType8(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC7LogType8 = checkCtC7LogType8MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC7LogType9
	 *	@return ctC7LogType9
	 */
	public long getCtC7LogType9() throws CFException {
   		return ctC7LogType9;
	}
	
	/**
	 * 	Update CtC7LogType9 with the passed value
	 *  Corresponding COBOL Variable is CT-C7-LOG-TYPE-9
	 *	@param number
	 */
	public void setCtC7LogType9(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC7LogType9 = checkCtC7LogType9MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC7LogTypeA
	 *	@return ctC7LogTypeA
	 */
	public long getCtC7LogTypeA() throws CFException {
   		return ctC7LogTypeA;
	}
	
	/**
	 * 	Update CtC7LogTypeA with the passed value
	 *  Corresponding COBOL Variable is CT-C7-LOG-TYPE-A
	 *	@param number
	 */
	public void setCtC7LogTypeA(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC7LogTypeA = checkCtC7LogTypeAMaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC7UndefLogType
	 *	@return ctC7UndefLogType
	 */
	public long getCtC7UndefLogType() throws CFException {
   		return ctC7UndefLogType;
	}
	
	/**
	 * 	Update CtC7UndefLogType with the passed value
	 *  Corresponding COBOL Variable is CT-C7-UNDEF-LOG-TYPE
	 *	@param number
	 */
	public void setCtC7UndefLogType(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC7UndefLogType = checkCtC7UndefLogTypeMaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC8LogType1
	 *	@return ctC8LogType1
	 */
	public long getCtC8LogType1() throws CFException {
   		return ctC8LogType1;
	}
	
	/**
	 * 	Update CtC8LogType1 with the passed value
	 *  Corresponding COBOL Variable is CT-C8-LOG-TYPE-1
	 *	@param number
	 */
	public void setCtC8LogType1(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC8LogType1 = checkCtC8LogType1MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC8LogType2
	 *	@return ctC8LogType2
	 */
	public long getCtC8LogType2() throws CFException {
   		return ctC8LogType2;
	}
	
	/**
	 * 	Update CtC8LogType2 with the passed value
	 *  Corresponding COBOL Variable is CT-C8-LOG-TYPE-2
	 *	@param number
	 */
	public void setCtC8LogType2(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC8LogType2 = checkCtC8LogType2MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC8LogType3
	 *	@return ctC8LogType3
	 */
	public long getCtC8LogType3() throws CFException {
   		return ctC8LogType3;
	}
	
	/**
	 * 	Update CtC8LogType3 with the passed value
	 *  Corresponding COBOL Variable is CT-C8-LOG-TYPE-3
	 *	@param number
	 */
	public void setCtC8LogType3(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC8LogType3 = checkCtC8LogType3MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC8LogType4
	 *	@return ctC8LogType4
	 */
	public long getCtC8LogType4() throws CFException {
   		return ctC8LogType4;
	}
	
	/**
	 * 	Update CtC8LogType4 with the passed value
	 *  Corresponding COBOL Variable is CT-C8-LOG-TYPE-4
	 *	@param number
	 */
	public void setCtC8LogType4(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC8LogType4 = checkCtC8LogType4MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC8LogType5
	 *	@return ctC8LogType5
	 */
	public long getCtC8LogType5() throws CFException {
   		return ctC8LogType5;
	}
	
	/**
	 * 	Update CtC8LogType5 with the passed value
	 *  Corresponding COBOL Variable is CT-C8-LOG-TYPE-5
	 *	@param number
	 */
	public void setCtC8LogType5(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC8LogType5 = checkCtC8LogType5MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC8LogType6
	 *	@return ctC8LogType6
	 */
	public long getCtC8LogType6() throws CFException {
   		return ctC8LogType6;
	}
	
	/**
	 * 	Update CtC8LogType6 with the passed value
	 *  Corresponding COBOL Variable is CT-C8-LOG-TYPE-6
	 *	@param number
	 */
	public void setCtC8LogType6(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC8LogType6 = checkCtC8LogType6MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC8LogType7
	 *	@return ctC8LogType7
	 */
	public long getCtC8LogType7() throws CFException {
   		return ctC8LogType7;
	}
	
	/**
	 * 	Update CtC8LogType7 with the passed value
	 *  Corresponding COBOL Variable is CT-C8-LOG-TYPE-7
	 *	@param number
	 */
	public void setCtC8LogType7(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC8LogType7 = checkCtC8LogType7MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC8LogType8
	 *	@return ctC8LogType8
	 */
	public long getCtC8LogType8() throws CFException {
   		return ctC8LogType8;
	}
	
	/**
	 * 	Update CtC8LogType8 with the passed value
	 *  Corresponding COBOL Variable is CT-C8-LOG-TYPE-8
	 *	@param number
	 */
	public void setCtC8LogType8(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC8LogType8 = checkCtC8LogType8MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC8LogTypeAlert
	 *	@return ctC8LogTypeAlert
	 */
	public long getCtC8LogTypeAlert() throws CFException {
   		return ctC8LogTypeAlert;
	}
	
	/**
	 * 	Update CtC8LogTypeAlert with the passed value
	 *  Corresponding COBOL Variable is CT-C8-LOG-TYPE-ALERT
	 *	@param number
	 */
	public void setCtC8LogTypeAlert(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC8LogTypeAlert = checkCtC8LogTypeAlertMaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC8UndefLogType
	 *	@return ctC8UndefLogType
	 */
	public long getCtC8UndefLogType() throws CFException {
   		return ctC8UndefLogType;
	}
	
	/**
	 * 	Update CtC8UndefLogType with the passed value
	 *  Corresponding COBOL Variable is CT-C8-UNDEF-LOG-TYPE
	 *	@param number
	 */
	public void setCtC8UndefLogType(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC8UndefLogType = checkCtC8UndefLogTypeMaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC9LogType1
	 *	@return ctC9LogType1
	 */
	public long getCtC9LogType1() throws CFException {
   		return ctC9LogType1;
	}
	
	/**
	 * 	Update CtC9LogType1 with the passed value
	 *  Corresponding COBOL Variable is CT-C9-LOG-TYPE-1
	 *	@param number
	 */
	public void setCtC9LogType1(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC9LogType1 = checkCtC9LogType1MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC9LogType2
	 *	@return ctC9LogType2
	 */
	public long getCtC9LogType2() throws CFException {
   		return ctC9LogType2;
	}
	
	/**
	 * 	Update CtC9LogType2 with the passed value
	 *  Corresponding COBOL Variable is CT-C9-LOG-TYPE-2
	 *	@param number
	 */
	public void setCtC9LogType2(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC9LogType2 = checkCtC9LogType2MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC9LogType3
	 *	@return ctC9LogType3
	 */
	public long getCtC9LogType3() throws CFException {
   		return ctC9LogType3;
	}
	
	/**
	 * 	Update CtC9LogType3 with the passed value
	 *  Corresponding COBOL Variable is CT-C9-LOG-TYPE-3
	 *	@param number
	 */
	public void setCtC9LogType3(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC9LogType3 = checkCtC9LogType3MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC9LogType4
	 *	@return ctC9LogType4
	 */
	public long getCtC9LogType4() throws CFException {
   		return ctC9LogType4;
	}
	
	/**
	 * 	Update CtC9LogType4 with the passed value
	 *  Corresponding COBOL Variable is CT-C9-LOG-TYPE-4
	 *	@param number
	 */
	public void setCtC9LogType4(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC9LogType4 = checkCtC9LogType4MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC9LogType5
	 *	@return ctC9LogType5
	 */
	public long getCtC9LogType5() throws CFException {
   		return ctC9LogType5;
	}
	
	/**
	 * 	Update CtC9LogType5 with the passed value
	 *  Corresponding COBOL Variable is CT-C9-LOG-TYPE-5
	 *	@param number
	 */
	public void setCtC9LogType5(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC9LogType5 = checkCtC9LogType5MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC9LogType6
	 *	@return ctC9LogType6
	 */
	public long getCtC9LogType6() throws CFException {
   		return ctC9LogType6;
	}
	
	/**
	 * 	Update CtC9LogType6 with the passed value
	 *  Corresponding COBOL Variable is CT-C9-LOG-TYPE-6
	 *	@param number
	 */
	public void setCtC9LogType6(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC9LogType6 = checkCtC9LogType6MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC9LogType7
	 *	@return ctC9LogType7
	 */
	public long getCtC9LogType7() throws CFException {
   		return ctC9LogType7;
	}
	
	/**
	 * 	Update CtC9LogType7 with the passed value
	 *  Corresponding COBOL Variable is CT-C9-LOG-TYPE-7
	 *	@param number
	 */
	public void setCtC9LogType7(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC9LogType7 = checkCtC9LogType7MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC9LogType8
	 *	@return ctC9LogType8
	 */
	public long getCtC9LogType8() throws CFException {
   		return ctC9LogType8;
	}
	
	/**
	 * 	Update CtC9LogType8 with the passed value
	 *  Corresponding COBOL Variable is CT-C9-LOG-TYPE-8
	 *	@param number
	 */
	public void setCtC9LogType8(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC9LogType8 = checkCtC9LogType8MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC9LogType9
	 *	@return ctC9LogType9
	 */
	public long getCtC9LogType9() throws CFException {
   		return ctC9LogType9;
	}
	
	/**
	 * 	Update CtC9LogType9 with the passed value
	 *  Corresponding COBOL Variable is CT-C9-LOG-TYPE-9
	 *	@param number
	 */
	public void setCtC9LogType9(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC9LogType9 = checkCtC9LogType9MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC9LogType10
	 *	@return ctC9LogType10
	 */
	public long getCtC9LogType10() throws CFException {
   		return ctC9LogType10;
	}
	
	/**
	 * 	Update CtC9LogType10 with the passed value
	 *  Corresponding COBOL Variable is CT-C9-LOG-TYPE-10
	 *	@param number
	 */
	public void setCtC9LogType10(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC9LogType10 = checkCtC9LogType10MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC9LogType11
	 *	@return ctC9LogType11
	 */
	public long getCtC9LogType11() throws CFException {
   		return ctC9LogType11;
	}
	
	/**
	 * 	Update CtC9LogType11 with the passed value
	 *  Corresponding COBOL Variable is CT-C9-LOG-TYPE-11
	 *	@param number
	 */
	public void setCtC9LogType11(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC9LogType11 = checkCtC9LogType11MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC9LogType12
	 *	@return ctC9LogType12
	 */
	public long getCtC9LogType12() throws CFException {
   		return ctC9LogType12;
	}
	
	/**
	 * 	Update CtC9LogType12 with the passed value
	 *  Corresponding COBOL Variable is CT-C9-LOG-TYPE-12
	 *	@param number
	 */
	public void setCtC9LogType12(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC9LogType12 = checkCtC9LogType12MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC9LogType13
	 *	@return ctC9LogType13
	 */
	public long getCtC9LogType13() throws CFException {
   		return ctC9LogType13;
	}
	
	/**
	 * 	Update CtC9LogType13 with the passed value
	 *  Corresponding COBOL Variable is CT-C9-LOG-TYPE-13
	 *	@param number
	 */
	public void setCtC9LogType13(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC9LogType13 = checkCtC9LogType13MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC9LogType14
	 *	@return ctC9LogType14
	 */
	public long getCtC9LogType14() throws CFException {
   		return ctC9LogType14;
	}
	
	/**
	 * 	Update CtC9LogType14 with the passed value
	 *  Corresponding COBOL Variable is CT-C9-LOG-TYPE-14
	 *	@param number
	 */
	public void setCtC9LogType14(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC9LogType14 = checkCtC9LogType14MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC9LogType15
	 *	@return ctC9LogType15
	 */
	public long getCtC9LogType15() throws CFException {
   		return ctC9LogType15;
	}
	
	/**
	 * 	Update CtC9LogType15 with the passed value
	 *  Corresponding COBOL Variable is CT-C9-LOG-TYPE-15
	 *	@param number
	 */
	public void setCtC9LogType15(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC9LogType15 = checkCtC9LogType15MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC9LogType16
	 *	@return ctC9LogType16
	 */
	public long getCtC9LogType16() throws CFException {
   		return ctC9LogType16;
	}
	
	/**
	 * 	Update CtC9LogType16 with the passed value
	 *  Corresponding COBOL Variable is CT-C9-LOG-TYPE-16
	 *	@param number
	 */
	public void setCtC9LogType16(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC9LogType16 = checkCtC9LogType16MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC9LogType17
	 *	@return ctC9LogType17
	 */
	public long getCtC9LogType17() throws CFException {
   		return ctC9LogType17;
	}
	
	/**
	 * 	Update CtC9LogType17 with the passed value
	 *  Corresponding COBOL Variable is CT-C9-LOG-TYPE-17
	 *	@param number
	 */
	public void setCtC9LogType17(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC9LogType17 = checkCtC9LogType17MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC9LogType18
	 *	@return ctC9LogType18
	 */
	public long getCtC9LogType18() throws CFException {
   		return ctC9LogType18;
	}
	
	/**
	 * 	Update CtC9LogType18 with the passed value
	 *  Corresponding COBOL Variable is CT-C9-LOG-TYPE-18
	 *	@param number
	 */
	public void setCtC9LogType18(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC9LogType18 = checkCtC9LogType18MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC9LogType19
	 *	@return ctC9LogType19
	 */
	public long getCtC9LogType19() throws CFException {
   		return ctC9LogType19;
	}
	
	/**
	 * 	Update CtC9LogType19 with the passed value
	 *  Corresponding COBOL Variable is CT-C9-LOG-TYPE-19
	 *	@param number
	 */
	public void setCtC9LogType19(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC9LogType19 = checkCtC9LogType19MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC9LogType20
	 *	@return ctC9LogType20
	 */
	public long getCtC9LogType20() throws CFException {
   		return ctC9LogType20;
	}
	
	/**
	 * 	Update CtC9LogType20 with the passed value
	 *  Corresponding COBOL Variable is CT-C9-LOG-TYPE-20
	 *	@param number
	 */
	public void setCtC9LogType20(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC9LogType20 = checkCtC9LogType20MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC9LogType21
	 *	@return ctC9LogType21
	 */
	public long getCtC9LogType21() throws CFException {
   		return ctC9LogType21;
	}
	
	/**
	 * 	Update CtC9LogType21 with the passed value
	 *  Corresponding COBOL Variable is CT-C9-LOG-TYPE-21
	 *	@param number
	 */
	public void setCtC9LogType21(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC9LogType21 = checkCtC9LogType21MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC9LogType22
	 *	@return ctC9LogType22
	 */
	public long getCtC9LogType22() throws CFException {
   		return ctC9LogType22;
	}
	
	/**
	 * 	Update CtC9LogType22 with the passed value
	 *  Corresponding COBOL Variable is CT-C9-LOG-TYPE-22
	 *	@param number
	 */
	public void setCtC9LogType22(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC9LogType22 = checkCtC9LogType22MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC9LogType23
	 *	@return ctC9LogType23
	 */
	public long getCtC9LogType23() throws CFException {
   		return ctC9LogType23;
	}
	
	/**
	 * 	Update CtC9LogType23 with the passed value
	 *  Corresponding COBOL Variable is CT-C9-LOG-TYPE-23
	 *	@param number
	 */
	public void setCtC9LogType23(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC9LogType23 = checkCtC9LogType23MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC9LogType24
	 *	@return ctC9LogType24
	 */
	public long getCtC9LogType24() throws CFException {
   		return ctC9LogType24;
	}
	
	/**
	 * 	Update CtC9LogType24 with the passed value
	 *  Corresponding COBOL Variable is CT-C9-LOG-TYPE-24
	 *	@param number
	 */
	public void setCtC9LogType24(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC9LogType24 = checkCtC9LogType24MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC9LogType25
	 *	@return ctC9LogType25
	 */
	public long getCtC9LogType25() throws CFException {
   		return ctC9LogType25;
	}
	
	/**
	 * 	Update CtC9LogType25 with the passed value
	 *  Corresponding COBOL Variable is CT-C9-LOG-TYPE-25
	 *	@param number
	 */
	public void setCtC9LogType25(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC9LogType25 = checkCtC9LogType25MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC9LogType26
	 *	@return ctC9LogType26
	 */
	public long getCtC9LogType26() throws CFException {
   		return ctC9LogType26;
	}
	
	/**
	 * 	Update CtC9LogType26 with the passed value
	 *  Corresponding COBOL Variable is CT-C9-LOG-TYPE-26
	 *	@param number
	 */
	public void setCtC9LogType26(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC9LogType26 = checkCtC9LogType26MaxLimit(number); 
	}


	/**
	 *	Returns the value of ctC9UndefLogType
	 *	@return ctC9UndefLogType
	 */
	public long getCtC9UndefLogType() throws CFException {
   		return ctC9UndefLogType;
	}
	
	/**
	 * 	Update CtC9UndefLogType with the passed value
	 *  Corresponding COBOL Variable is CT-C9-UNDEF-LOG-TYPE
	 *	@param number
	 */
	public void setCtC9UndefLogType(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ctC9UndefLogType = checkCtC9UndefLogTypeMaxLimit(number); 
	}


	/**
	 *	Returns the value of waDateMn9
	 *	@return waDateMn9
	 */
	public int getWaDateMn9() throws CFException {
       if (isWaDateMn9Modified()) { 
           waDateMn9 = refreshWaDateMn9();
        }
   		return waDateMn9;
	}
	

	
	   
	/**
	 * 	Update WaDateMn9 with the passed value
	 *  Corresponding COBOL Variable is WA-DATE-MN-9
	 *	@param number
	 */
	public void setWaDateMn9(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    waDateMn9 = checkWaDateMn9MaxLimit(number); 
		serializeWaDateMn9(waDateMn9);
	}
	

	public void setWaDateMn9(long number) {
	    number = checkWaDateMn9MaxLimit(number); // Truncate if value is beyond +/- Max range
		setWaDateMn9((int)number);
	}
	
	/**
	 * 	Update WaDateMn9 with the passed value
	 *	@param value (String or char[])
	 */
	public void setWaDateMn9(char[] value) throws CFException {
		 waDateMn9 = serializeWaDateMn9(value);
	}
	/**
	 * 	Update WaDateMn9 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWaDateMn9String(char[] value) throws CFException {
		 setWaDateMn9(value);
	}
	/**
	 *	Returns the value of waDateDy9
	 *	@return waDateDy9
	 */
	public int getWaDateDy9() throws CFException {
       if (isWaDateDy9Modified()) { 
           waDateDy9 = refreshWaDateDy9();
        }
   		return waDateDy9;
	}
	

	
	   
	/**
	 * 	Update WaDateDy9 with the passed value
	 *  Corresponding COBOL Variable is WA-DATE-DY-9
	 *	@param number
	 */
	public void setWaDateDy9(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    waDateDy9 = checkWaDateDy9MaxLimit(number); 
		serializeWaDateDy9(waDateDy9);
	}
	

	public void setWaDateDy9(long number) {
	    number = checkWaDateDy9MaxLimit(number); // Truncate if value is beyond +/- Max range
		setWaDateDy9((int)number);
	}
	
	/**
	 * 	Update WaDateDy9 with the passed value
	 *	@param value (String or char[])
	 */
	public void setWaDateDy9(char[] value) throws CFException {
		 waDateDy9 = serializeWaDateDy9(value);
	}
	/**
	 * 	Update WaDateDy9 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWaDateDy9String(char[] value) throws CFException {
		 setWaDateDy9(value);
	}
	/**
	 *	Returns the value of waDateYr9
	 *	@return waDateYr9
	 */
	public int getWaDateYr9() throws CFException {
       if (isWaDateYr9Modified()) { 
           waDateYr9 = refreshWaDateYr9();
        }
   		return waDateYr9;
	}
	

	
	   
	/**
	 * 	Update WaDateYr9 with the passed value
	 *  Corresponding COBOL Variable is WA-DATE-YR-9
	 *	@param number
	 */
	public void setWaDateYr9(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    waDateYr9 = checkWaDateYr9MaxLimit(number); 
		serializeWaDateYr9(waDateYr9);
	}
	

	public void setWaDateYr9(long number) {
	    number = checkWaDateYr9MaxLimit(number); // Truncate if value is beyond +/- Max range
		setWaDateYr9((int)number);
	}
	
	/**
	 * 	Update WaDateYr9 with the passed value
	 *	@param value (String or char[])
	 */
	public void setWaDateYr9(char[] value) throws CFException {
		 waDateYr9 = serializeWaDateYr9(value);
	}
	/**
	 * 	Update WaDateYr9 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWaDateYr9String(char[] value) throws CFException {
		 setWaDateYr9(value);
	}
	/**
	 *	Returns the value of waTimeHh9
	 *	@return waTimeHh9
	 */
	public int getWaTimeHh9() throws CFException {
       if (isWaTimeHh9Modified()) { 
           waTimeHh9 = refreshWaTimeHh9();
        }
   		return waTimeHh9;
	}
	

	
	   
	/**
	 * 	Update WaTimeHh9 with the passed value
	 *  Corresponding COBOL Variable is WA-TIME-HH-9
	 *	@param number
	 */
	public void setWaTimeHh9(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    waTimeHh9 = checkWaTimeHh9MaxLimit(number); 
		serializeWaTimeHh9(waTimeHh9);
	}
	

	public void setWaTimeHh9(long number) {
	    number = checkWaTimeHh9MaxLimit(number); // Truncate if value is beyond +/- Max range
		setWaTimeHh9((int)number);
	}
	
	/**
	 * 	Update WaTimeHh9 with the passed value
	 *	@param value (String or char[])
	 */
	public void setWaTimeHh9(char[] value) throws CFException {
		 waTimeHh9 = serializeWaTimeHh9(value);
	}
	/**
	 * 	Update WaTimeHh9 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWaTimeHh9String(char[] value) throws CFException {
		 setWaTimeHh9(value);
	}
	/**
	 *	Returns the value of waTimeMm9
	 *	@return waTimeMm9
	 */
	public int getWaTimeMm9() throws CFException {
       if (isWaTimeMm9Modified()) { 
           waTimeMm9 = refreshWaTimeMm9();
        }
   		return waTimeMm9;
	}
	

	
	   
	/**
	 * 	Update WaTimeMm9 with the passed value
	 *  Corresponding COBOL Variable is WA-TIME-MM-9
	 *	@param number
	 */
	public void setWaTimeMm9(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    waTimeMm9 = checkWaTimeMm9MaxLimit(number); 
		serializeWaTimeMm9(waTimeMm9);
	}
	

	public void setWaTimeMm9(long number) {
	    number = checkWaTimeMm9MaxLimit(number); // Truncate if value is beyond +/- Max range
		setWaTimeMm9((int)number);
	}
	
	/**
	 * 	Update WaTimeMm9 with the passed value
	 *	@param value (String or char[])
	 */
	public void setWaTimeMm9(char[] value) throws CFException {
		 waTimeMm9 = serializeWaTimeMm9(value);
	}
	/**
	 * 	Update WaTimeMm9 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWaTimeMm9String(char[] value) throws CFException {
		 setWaTimeMm9(value);
	}
	/**
	 *	Returns the value of waTimeSs9
	 *	@return waTimeSs9
	 */
	public int getWaTimeSs9() throws CFException {
       if (isWaTimeSs9Modified()) { 
           waTimeSs9 = refreshWaTimeSs9();
        }
   		return waTimeSs9;
	}
	

	
	   
	/**
	 * 	Update WaTimeSs9 with the passed value
	 *  Corresponding COBOL Variable is WA-TIME-SS-9
	 *	@param number
	 */
	public void setWaTimeSs9(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    waTimeSs9 = checkWaTimeSs9MaxLimit(number); 
		serializeWaTimeSs9(waTimeSs9);
	}
	

	public void setWaTimeSs9(long number) {
	    number = checkWaTimeSs9MaxLimit(number); // Truncate if value is beyond +/- Max range
		setWaTimeSs9((int)number);
	}
	
	/**
	 * 	Update WaTimeSs9 with the passed value
	 *	@param value (String or char[])
	 */
	public void setWaTimeSs9(char[] value) throws CFException {
		 waTimeSs9 = serializeWaTimeSs9(value);
	}
	/**
	 * 	Update WaTimeSs9 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWaTimeSs9String(char[] value) throws CFException {
		 setWaTimeSs9(value);
	}
	/**
	 *	Returns the value of firstT2RcdInd
	 *	@return firstT2RcdInd
	 */
   public char[] getFirstT2RcdInd() throws CFException{
   		return firstT2RcdInd;
   }

  
	/**
	*  set variable firstT2RcdInd
	*  Corresponding COBOL Variable is FIRST-T2-RCD-IND
	*  @param value
	**/
   public void setFirstT2RcdInd(char[] value) {
       value = checkFirstT2RcdIndConstraints(value);
       arraycopy(value,0,firstT2RcdInd,0,value.length);
   } 
	public void setFirstT2RcdInd(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,firstT2RcdInd,0,beginIndex + endIndex);
   }
	char[] firstT2Record88Value = fillZeroes(1);
	/**
	 *	Test condition "0" for isFirstT2Record()
	 *	@return  Returns true if isFirstT2Record() is "0"
	 */
   public boolean isFirstT2Record() throws CFException {
      return (  compareChars( getFirstT2RcdInd() , firstT2Record88Value)  == 0  );
   }


	/**
	*  set values "0"
	*/
   	public void setFirstT2RecordTrue() {  			
    	setFirstT2RcdInd( firstT2Record88Value);
   	}
	/**
	 *	Returns the value of firstX92RcdInd
	 *	@return firstX92RcdInd
	 */
   public char[] getFirstX92RcdInd() throws CFException{
   		return firstX92RcdInd;
   }

  
	/**
	*  set variable firstX92RcdInd
	*  Corresponding COBOL Variable is FIRST-X92-RCD-IND
	*  @param value
	**/
   public void setFirstX92RcdInd(char[] value) {
       value = checkFirstX92RcdIndConstraints(value);
       arraycopy(value,0,firstX92RcdInd,0,value.length);
   } 
	public void setFirstX92RcdInd(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,firstX92RcdInd,0,beginIndex + endIndex);
   }
	char[] firstX92Record88Value = fillZeroes(1);
	/**
	 *	Test condition "0" for isFirstX92Record()
	 *	@return  Returns true if isFirstX92Record() is "0"
	 */
   public boolean isFirstX92Record() throws CFException {
      return (  compareChars( getFirstX92RcdInd() , firstX92Record88Value)  == 0  );
   }


	/**
	*  set values "0"
	*/
   	public void setFirstX92RecordTrue() {  			
    	setFirstX92RcdInd( firstX92Record88Value);
   	}
	/**
	 *	Returns the value of securityAlertFlag
	 *	@return securityAlertFlag
	 */
   public char[] getSecurityAlertFlag() throws CFException{
   		return securityAlertFlag;
   }

  
	/**
	*  set variable securityAlertFlag
	*  Corresponding COBOL Variable is WS-SECURITY-ALERT-FLAG
	*  @param value
	**/
   public void setSecurityAlertFlag(char[] value) {
       value = checkSecurityAlertFlagConstraints(value);
       arraycopy(value,0,securityAlertFlag,0,value.length);
   } 
	public void setSecurityAlertFlag(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,securityAlertFlag,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of prevT2SortMipId
	 *	@return prevT2SortMipId
	 */
   public char[] getPrevT2SortMipId() throws CFException{
   		return prevT2SortMipId;
   }

  
	/**
	*  set variable prevT2SortMipId
	*  Corresponding COBOL Variable is PREV-T2-SORT-MIP-ID
	*  @param value
	**/
   public void setPrevT2SortMipId(char[] value) {
       value = checkPrevT2SortMipIdConstraints(value);
       arraycopy(value,0,prevT2SortMipId,0,value.length);
   } 
	public void setPrevT2SortMipId(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,prevT2SortMipId,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of prevRcRemoteMipId
	 *	@return prevRcRemoteMipId
	 */
   public char[] getPrevRcRemoteMipId() throws CFException{
   		return prevRcRemoteMipId;
   }

  
	/**
	*  set variable prevRcRemoteMipId
	*  Corresponding COBOL Variable is PREV-RC-REMOTE-MIP-ID
	*  @param value
	**/
   public void setPrevRcRemoteMipId(char[] value) {
       value = checkPrevRcRemoteMipIdConstraints(value);
       arraycopy(value,0,prevRcRemoteMipId,0,value.length);
   } 
	public void setPrevRcRemoteMipId(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,prevRcRemoteMipId,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of prevX92SortMipId
	 *	@return prevX92SortMipId
	 */
   public char[] getPrevX92SortMipId() throws CFException{
   		return prevX92SortMipId;
   }

  
	/**
	*  set variable prevX92SortMipId
	*  Corresponding COBOL Variable is PREV-X92-SORT-MIP-ID
	*  @param value
	**/
   public void setPrevX92SortMipId(char[] value) {
       value = checkPrevX92SortMipIdConstraints(value);
       arraycopy(value,0,prevX92SortMipId,0,value.length);
   } 
	public void setPrevX92SortMipId(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,prevX92SortMipId,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of prevT2SortDate
	 *	@return prevT2SortDate
	 */
   public char[] getPrevT2SortDate() throws CFException{
   		return prevT2SortDate;
   }

  
	/**
	*  set variable prevT2SortDate
	*  Corresponding COBOL Variable is PREV-T2-SORT-DATE
	*  @param value
	**/
   public void setPrevT2SortDate(char[] value) {
       value = checkPrevT2SortDateConstraints(value);
       arraycopy(value,0,prevT2SortDate,0,value.length);
   } 
	public void setPrevT2SortDate(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,prevT2SortDate,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of prevX92SortDate
	 *	@return prevX92SortDate
	 */
   public char[] getPrevX92SortDate() throws CFException{
   		return prevX92SortDate;
   }

  
	/**
	*  set variable prevX92SortDate
	*  Corresponding COBOL Variable is PREV-X92-SORT-DATE
	*  @param value
	**/
   public void setPrevX92SortDate(char[] value) {
       value = checkPrevX92SortDateConstraints(value);
       arraycopy(value,0,prevX92SortDate,0,value.length);
   } 
	public void setPrevX92SortDate(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,prevX92SortDate,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of compileDate
	 *	@return compileDate
	 */
   public char[] getCompileDate() throws CFException{
   		return compileDate;
   }

  
	/**
	*  set variable compileDate
	*  Corresponding COBOL Variable is COMPILE-DATE
	*  @param value
	**/
   public void setCompileDate(char[] value) {
       value = checkCompileDateConstraints(value);
       arraycopy(value,0,compileDate,0,value.length);
   } 
	public void setCompileDate(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,compileDate,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of otherGlogClass100
	 *	@return otherGlogClass100
	 */
   public char[] getOtherGlogClass100() throws CFException{
   		return otherGlogClass100;
   }

  
	/**
	*  set variable otherGlogClass100
	*  Corresponding COBOL Variable is 100-OTHER-GLOG-CLASS
	*  @param value
	**/
   public void setOtherGlogClass100(char[] value) {
       value = checkOtherGlogClass100Constraints(value);
       arraycopy(value,0,otherGlogClass100,0,value.length);
   } 
	public void setOtherGlogClass100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,otherGlogClass100,0,beginIndex + endIndex);
   }
	static java.util.Set<String> otherLogType88Value = new java.util.HashSet<>();
static { 
	otherLogType88Value.add( "A");
	otherLogType88Value.add( "D");
	otherLogType88Value.add( "F");
	otherLogType88Value.add( "G");
	otherLogType88Value.add( "H");
	otherLogType88Value.add( "I");
	otherLogType88Value.add( "J");
	otherLogType88Value.add( "K");
	otherLogType88Value.add( "L");
	otherLogType88Value.add( "M");
	otherLogType88Value.add( "N");
	otherLogType88Value.add( "O");
	otherLogType88Value.add( "P");
	otherLogType88Value.add( "Q");
	otherLogType88Value.add( "R");
	otherLogType88Value.add( "S");
	otherLogType88Value.add( "T");
	otherLogType88Value.add( "U");
	otherLogType88Value.add( "V");
	otherLogType88Value.add( "W");
	otherLogType88Value.add( "X");
	otherLogType88Value.add( "Y");
	otherLogType88Value.add( "Z");
	otherLogType88Value.add( "0");
} 

	/**
	 *	Test condition "A" "D" "F" "G" "H" "I" "J" "K" "L" "M" "N" "O" "P" "Q" "R" "S" "T" "U" "V" "W" "X" "Y" "Z" "0" for isOtherLogType()
	 *	@return  Returns true if isOtherLogType() is "A" "D" "F" "G" "H" "I" "J" "K" "L" "M" "N" "O" "P" "Q" "R" "S" "T" "U" "V" "W" "X" "Y" "Z" "0"
	 */
   public boolean isOtherLogType() throws CFException {
      return   otherLogType88Value.contains(String.valueOf(getOtherGlogClass100()));
   }


	/**
	*  set values "A" "D" "F" "G" "H" "I" "J" "K" "L" "M" "N" "O" "P" "Q" "R" "S" "T" "U" "V" "W" "X" "Y" "Z" "0"
	*/
   	public void setOtherLogTypeTrue() {  			
    	  setOtherGlogClass100(otherLogType88Value.iterator().next().toCharArray());
   	}
	/**
	 *	Returns the value of lit8300
	 *	@return lit8300
	 */
   public char[] getLit8300() throws CFException{
   		return lit8300;
   }

  
	/**
	*  set variable lit8300
	*  Corresponding COBOL Variable is 300-LIT-8
	*  @param value
	**/
   public void setLit8300(char[] value) {
       value = checkLit8300Constraints(value);
       arraycopy(value,0,lit8300,0,value.length);
   } 
	public void setLit8300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,lit8300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of lit04300
	 *	@return lit04300
	 */
   public char[] getLit04300() throws CFException{
   		return lit04300;
   }

  
	/**
	*  set variable lit04300
	*  Corresponding COBOL Variable is 300-LIT-04
	*  @param value
	**/
   public void setLit04300(char[] value) {
       value = checkLit04300Constraints(value);
       arraycopy(value,0,lit04300,0,value.length);
   } 
	public void setLit04300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,lit04300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of lit20300
	 *	@return lit20300
	 */
   public char[] getLit20300() throws CFException{
   		return lit20300;
   }

  
	/**
	*  set variable lit20300
	*  Corresponding COBOL Variable is 300-LIT-20
	*  @param value
	**/
   public void setLit20300(char[] value) {
       value = checkLit20300Constraints(value);
       arraycopy(value,0,lit20300,0,value.length);
   } 
	public void setLit20300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,lit20300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of charBb300
	 *	@return charBb300
	 */
   public char[] getCharBb300() throws CFException{
   		return charBb300;
   }

  
	/**
	*  set variable charBb300
	*  Corresponding COBOL Variable is 300-CHAR-BB
	*  @param value
	**/
   public void setCharBb300(char[] value) {
       value = checkCharBb300Constraints(value);
       arraycopy(value,0,charBb300,0,value.length);
   } 
	public void setCharBb300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,charBb300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of char9134a300
	 *	@return char9134a300
	 */
   public char[] getChar9134a300() throws CFException{
   		return char9134a300;
   }

  
	/**
	*  set variable char9134a300
	*  Corresponding COBOL Variable is 300-CHAR-9134A
	*  @param value
	**/
   public void setChar9134a300(char[] value) {
       value = checkChar9134a300Constraints(value);
       arraycopy(value,0,char9134a300,0,value.length);
   } 
	public void setChar9134a300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,char9134a300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of numOne300
	 *	@return numOne300
	 */
	public int getNumOne300() throws CFException {
       if (isNumOne300Modified()) { 
           numOne300 = refreshNumOne300();
        }
   		return numOne300;
	}
	

	
	   
	/**
	 * 	Update NumOne300 with the passed value
	 *  Corresponding COBOL Variable is 300-NUM-ONE
	 *	@param number
	 */
	public void setNumOne300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    numOne300 = checkNumOne300MaxLimit(number); 
		serializeNumOne300(numOne300);
	}
	

	public void setNumOne300(long number) {
	    number = checkNumOne300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setNumOne300((int)number);
	}
	
	/**
	 * 	Update NumOne300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNumOne300(char[] value) throws CFException {
		 numOne300 = serializeNumOne300(value);
	}
	/**
	 * 	Update NumOne300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNumOne300String(char[] value) throws CFException {
		 setNumOne300(value);
	}
	/**
	 *	Returns the value of numTwo300
	 *	@return numTwo300
	 */
	public int getNumTwo300() throws CFException {
       if (isNumTwo300Modified()) { 
           numTwo300 = refreshNumTwo300();
        }
   		return numTwo300;
	}
	

	
	   
	/**
	 * 	Update NumTwo300 with the passed value
	 *  Corresponding COBOL Variable is 300-NUM-TWO
	 *	@param number
	 */
	public void setNumTwo300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    numTwo300 = checkNumTwo300MaxLimit(number); 
		serializeNumTwo300(numTwo300);
	}
	

	public void setNumTwo300(long number) {
	    number = checkNumTwo300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setNumTwo300((int)number);
	}
	
	/**
	 * 	Update NumTwo300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNumTwo300(char[] value) throws CFException {
		 numTwo300 = serializeNumTwo300(value);
	}
	/**
	 * 	Update NumTwo300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNumTwo300String(char[] value) throws CFException {
		 setNumTwo300(value);
	}
	/**
	 *	Returns the value of num6300
	 *	@return num6300
	 */
	public int getNum6300() throws CFException {
       if (isNum6300Modified()) { 
           num6300 = refreshNum6300();
        }
   		return num6300;
	}
	

	
	   
	/**
	 * 	Update Num6300 with the passed value
	 *  Corresponding COBOL Variable is 300-NUM-6
	 *	@param number
	 */
	public void setNum6300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    num6300 = checkNum6300MaxLimit(number); 
		serializeNum6300(num6300);
	}
	

	public void setNum6300(long number) {
	    number = checkNum6300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setNum6300((int)number);
	}
	
	/**
	 * 	Update Num6300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum6300(char[] value) throws CFException {
		 num6300 = serializeNum6300(value);
	}
	/**
	 * 	Update Num6300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum6300String(char[] value) throws CFException {
		 setNum6300(value);
	}
	/**
	 *	Returns the value of num56300
	 *	@return num56300
	 */
	public int getNum56300() throws CFException {
       if (isNum56300Modified()) { 
           num56300 = refreshNum56300();
        }
   		return num56300;
	}
	

	
	   
	/**
	 * 	Update Num56300 with the passed value
	 *  Corresponding COBOL Variable is 300-NUM-56
	 *	@param number
	 */
	public void setNum56300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    num56300 = checkNum56300MaxLimit(number); 
		serializeNum56300(num56300);
	}
	

	public void setNum56300(long number) {
	    number = checkNum56300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setNum56300((int)number);
	}
	
	/**
	 * 	Update Num56300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum56300(char[] value) throws CFException {
		 num56300 = serializeNum56300(value);
	}
	/**
	 * 	Update Num56300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum56300String(char[] value) throws CFException {
		 setNum56300(value);
	}
	/**
	 *	Returns the value of sys001Lrecl400
	 *	@return sys001Lrecl400
	 */
	public long getSys001Lrecl400() throws CFException {
   		return sys001Lrecl400;
	}
	
	/**
	 * 	Update Sys001Lrecl400 with the passed value
	 *  Corresponding COBOL Variable is 400-SYS001-LRECL
	 *	@param number
	 */
	public void setSys001Lrecl400(long number) {
	     // Truncate if the number is beyond +/- Max range
	    sys001Lrecl400 = checkSys001Lrecl400MaxLimit(number); 
	}


	/**
	 *	Returns the value of emailRecsWriteCnt400
	 *	@return emailRecsWriteCnt400
	 */
	public int getEmailRecsWriteCnt400() throws CFException {
       if (isEmailRecsWriteCnt400Modified()) { 
           emailRecsWriteCnt400 = refreshEmailRecsWriteCnt400();
        }
   		return emailRecsWriteCnt400;
	}
	

    /**
	 *	Returns the String value of emailRecsWriteCnt400
	 *	@return emailRecsWriteCnt400
	 */
	public char[]  getEmailRecsWriteCnt400ActualString() {
	    String value = String.valueOf(emailRecsWriteCnt400).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update EmailRecsWriteCnt400 with the passed value
	 *  Corresponding COBOL Variable is 400-EMAIL-RECS-WRITE-CNT
	 *	@param number
	 */
	public void setEmailRecsWriteCnt400(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    emailRecsWriteCnt400 = checkEmailRecsWriteCnt400MaxLimit(number); 
		serializeEmailRecsWriteCnt400(emailRecsWriteCnt400);
	}
	

	public void setEmailRecsWriteCnt400(long number) {
	    number = checkEmailRecsWriteCnt400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setEmailRecsWriteCnt400((int)number);
	}
	
	/**
	 * 	Update EmailRecsWriteCnt400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setEmailRecsWriteCnt400(char[] value) throws CFException {
		 emailRecsWriteCnt400 = serializeEmailRecsWriteCnt400(value);
	}
	/**
	 * 	Update EmailRecsWriteCnt400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setEmailRecsWriteCnt400String(char[] value) throws CFException {
		 setEmailRecsWriteCnt400(value);
	}
	/**
	 *	Returns the value of emailRptOpPageNo400
	 *	@return emailRptOpPageNo400
	 */
	public short getEmailRptOpPageNo400() throws CFException {
       if (isEmailRptOpPageNo400Modified()) { 
           emailRptOpPageNo400 = refreshEmailRptOpPageNo400();
        }
   		return emailRptOpPageNo400;
	}
	

    /**
	 *	Returns the String value of emailRptOpPageNo400
	 *	@return emailRptOpPageNo400
	 */
	public char[]  getEmailRptOpPageNo400ActualString() {
	    String value = String.valueOf(emailRptOpPageNo400).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update EmailRptOpPageNo400 with the passed value
	 *  Corresponding COBOL Variable is 400-EMAIL-RPT-OP-PAGE-NO
	 *	@param number
	 */
	public void setEmailRptOpPageNo400(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    emailRptOpPageNo400 = checkEmailRptOpPageNo400MaxLimit(number); 
		serializeEmailRptOpPageNo400(emailRptOpPageNo400);
	}
	
	public void setEmailRptOpPageNo400(int number) {
	    number = checkEmailRptOpPageNo400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setEmailRptOpPageNo400((short)number);
	}
	public void setEmailRptOpPageNo400(long number) {
	    number = checkEmailRptOpPageNo400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setEmailRptOpPageNo400((short)number);
	}
	

	/**
	 * 	Update EmailRptOpPageNo400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setEmailRptOpPageNo400(char[] value) throws CFException {
		 emailRptOpPageNo400 = serializeEmailRptOpPageNo400(value);
	}
	/**
	 * 	Update EmailRptOpPageNo400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setEmailRptOpPageNo400String(char[] value) throws CFException {
		 setEmailRptOpPageNo400(value);
	}
	/**
	 *	Returns the value of emailRptOpLineNo400
	 *	@return emailRptOpLineNo400
	 */
	public short getEmailRptOpLineNo400() throws CFException {
       if (isEmailRptOpLineNo400Modified()) { 
           emailRptOpLineNo400 = refreshEmailRptOpLineNo400();
        }
   		return emailRptOpLineNo400;
	}
	

    /**
	 *	Returns the String value of emailRptOpLineNo400
	 *	@return emailRptOpLineNo400
	 */
	public char[]  getEmailRptOpLineNo400ActualString() {
	    String value = String.valueOf(emailRptOpLineNo400).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update EmailRptOpLineNo400 with the passed value
	 *  Corresponding COBOL Variable is 400-EMAIL-RPT-OP-LINE-NO
	 *	@param number
	 */
	public void setEmailRptOpLineNo400(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    emailRptOpLineNo400 = checkEmailRptOpLineNo400MaxLimit(number); 
		serializeEmailRptOpLineNo400(emailRptOpLineNo400);
	}
	
	public void setEmailRptOpLineNo400(int number) {
	    number = checkEmailRptOpLineNo400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setEmailRptOpLineNo400((short)number);
	}
	public void setEmailRptOpLineNo400(long number) {
	    number = checkEmailRptOpLineNo400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setEmailRptOpLineNo400((short)number);
	}
	

	/**
	 * 	Update EmailRptOpLineNo400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setEmailRptOpLineNo400(char[] value) throws CFException {
		 emailRptOpLineNo400 = serializeEmailRptOpLineNo400(value);
	}
	/**
	 * 	Update EmailRptOpLineNo400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setEmailRptOpLineNo400String(char[] value) throws CFException {
		 setEmailRptOpLineNo400(value);
	}

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
