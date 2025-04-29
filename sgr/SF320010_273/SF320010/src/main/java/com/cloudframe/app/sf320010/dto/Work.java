package com.cloudframe.app.sf320010.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Work extends WorkSerialized {
   

						@Getter @Setter private char[] generalLogEofSw = new char[1];

						@Getter @Setter private char[] tempFileEofSw = new char[1];

								@Getter @Setter private int mciwinReturnCode;

								@Getter @Setter private long tempRecsWrittenCnt;

						@Getter @Setter private char[] mcwinProgram = new char[8];

						@Getter @Setter private char[] rpC7LogDesc1 = new char[45];

						@Getter @Setter private char[] rpC7LogDesc2 = new char[45];

						@Getter @Setter private char[] rpC7LogDesc3 = new char[45];

						@Getter @Setter private char[] rpC7LogDesc4 = new char[45];

						@Getter @Setter private char[] rpC7LogDesc5 = new char[45];

						@Getter @Setter private char[] rpC7LogDesc6 = new char[45];

						@Getter @Setter private char[] rpC7LogDesc7 = new char[45];

						@Getter @Setter private char[] rpC7LogDesc8 = new char[45];

						@Getter @Setter private char[] rpC7LogDesc9 = new char[45];

						@Getter @Setter private char[] rpC7LogDescA = new char[45];

						@Getter @Setter private char[] rpC8LogDesc1 = new char[45];

						@Getter @Setter private char[] rpC8LogDesc2 = new char[45];

						@Getter @Setter private char[] rpC8LogDesc3 = new char[45];

						@Getter @Setter private char[] rpC8LogDesc4 = new char[45];

						@Getter @Setter private char[] rpC8LogDesc5 = new char[45];

						@Getter @Setter private char[] rpC8LogDesc6 = new char[45];

						@Getter @Setter private char[] rpC8LogDesc7 = new char[45];

						@Getter @Setter private char[] rpC8LogDesc8 = new char[45];

						@Getter @Setter private char[] rpC8LogDescAlert = new char[45];

						@Getter @Setter private char[] rpC9LogDesc1 = new char[45];

						@Getter @Setter private char[] rpC9LogDesc2 = new char[45];

						@Getter @Setter private char[] rpC9LogDesc3 = new char[45];

						@Getter @Setter private char[] rpC9LogDesc4 = new char[45];

						@Getter @Setter private char[] rpC9LogDesc5 = new char[45];

						@Getter @Setter private char[] rpC9LogDesc6 = new char[45];

						@Getter @Setter private char[] rpC9LogDesc7 = new char[45];

						@Getter @Setter private char[] rpC9LogDesc8 = new char[45];

						@Getter @Setter private char[] rpC9LogDesc9 = new char[45];

						@Getter @Setter private char[] rpC9LogDesc10 = new char[45];

						@Getter @Setter private char[] rpC9LogDesc11 = new char[45];

						@Getter @Setter private char[] rpC9LogDesc12 = new char[45];

						@Getter @Setter private char[] rpC9LogDesc13 = new char[45];

						@Getter @Setter private char[] rpC9LogDesc14 = new char[45];

						@Getter @Setter private char[] rpC9LogDesc15 = new char[45];

						@Getter @Setter private char[] rpC9LogDesc16 = new char[45];

						@Getter @Setter private char[] rpC9LogDesc17 = new char[45];

						@Getter @Setter private char[] rpC9LogDesc18 = new char[45];

						@Getter @Setter private char[] rpC9LogDesc19 = new char[45];

						@Getter @Setter private char[] rpC9LogDesc20 = new char[45];

						@Getter @Setter private char[] rpC9LogDesc21 = new char[45];

						@Getter @Setter private char[] rpC9LogDesc22 = new char[45];

						@Getter @Setter private char[] rpC9LogDesc23 = new char[45];

						@Getter @Setter private char[] rpC9LogDesc24 = new char[45];

						@Getter @Setter private char[] rpC9LogDesc25 = new char[45];

						@Getter @Setter private char[] rpC9LogDesc26 = new char[45];

						@Getter @Setter private char[] rpUndefLogDesc = new char[45];

						@Getter @Setter private char[] rpEmailOpHeading3200 = new char[132];

						@Getter @Setter private char[] rpBdHeading3 = new char[133];

						@Getter @Setter private char[] rpOpHeading3 = new char[133];

						@Getter @Setter private char[] rpMpDetail3 = new char[133];

						@Getter @Setter private char[] rpPsHeading3 = new char[133];

						@Getter @Setter private char[] rpPsHeading4 = new char[133];

						@Getter @Setter private char[] rpC7Heading2 = new char[132];

						@Getter @Setter private char[] rpC7Heading5 = new char[133];

						@Getter @Setter private char[] rpC8Heading2 = new char[132];

						@Getter @Setter private char[] rpC8Heading4 = new char[97];

						@Getter @Setter private char[] rpC8Heading5 = new char[93];

						@Getter @Setter private char[] rpC9Heading2 = new char[132];

						@Getter @Setter private char[] rpC9Heading5 = new char[133];

								@Getter @Setter private int ctRptBdLineNo;

								@Getter @Setter private int ctRptBdPageNo;

								@Getter @Setter private int ctRptOpLineNo;

								@Getter @Setter private int ctRptOpPageNo;

								@Getter @Setter private int ctRptMpLineNo;

								@Getter @Setter private int ctRptMpPageNo;

								@Getter @Setter private int ctRptPsLineNo;

								@Getter @Setter private int ctRptPsPageNo;

								@Getter @Setter private int ctRptT2PageNo;

								@Getter @Setter private int ctRptRcLineNo;

								@Getter @Setter private int ctRptRcPageNo;

								@Getter @Setter private int ctRptC9PageNo;

								@Getter @Setter private long ctLogStats;

								@Getter @Setter private long ctLogBulkData;

								@Getter @Setter private long ctLogBulkData32;

								@Getter @Setter private long ctLogOperator;

								@Getter @Setter private long ctLogMipProfile;

								@Getter @Setter private long ctLogPos;

								@Getter @Setter private long ctLogTypeii;

								@Getter @Setter private long ctLogRemCons;

								@Getter @Setter private long ctLogX92;

								@Getter @Setter private long ctLogEdc;

								@Getter @Setter private long ctLogChk;

								@Getter @Setter private long ctLogOther;

								@Getter @Setter private long ctC7LogType1;

								@Getter @Setter private long ctC7LogType2;

								@Getter @Setter private long ctC7LogType3;

								@Getter @Setter private long ctC7LogType4;

								@Getter @Setter private long ctC7LogType5;

								@Getter @Setter private long ctC7LogType6;

								@Getter @Setter private long ctC7LogType7;

								@Getter @Setter private long ctC7LogType8;

								@Getter @Setter private long ctC7LogType9;

								@Getter @Setter private long ctC7LogTypeA;

								@Getter @Setter private long ctC7UndefLogType;

								@Getter @Setter private long ctC8LogType1;

								@Getter @Setter private long ctC8LogType2;

								@Getter @Setter private long ctC8LogType3;

								@Getter @Setter private long ctC8LogType4;

								@Getter @Setter private long ctC8LogType5;

								@Getter @Setter private long ctC8LogType6;

								@Getter @Setter private long ctC8LogType7;

								@Getter @Setter private long ctC8LogType8;

								@Getter @Setter private long ctC8LogTypeAlert;

								@Getter @Setter private long ctC8UndefLogType;

								@Getter @Setter private long ctC9LogType1;

								@Getter @Setter private long ctC9LogType2;

								@Getter @Setter private long ctC9LogType3;

								@Getter @Setter private long ctC9LogType4;

								@Getter @Setter private long ctC9LogType5;

								@Getter @Setter private long ctC9LogType6;

								@Getter @Setter private long ctC9LogType7;

								@Getter @Setter private long ctC9LogType8;

								@Getter @Setter private long ctC9LogType9;

								@Getter @Setter private long ctC9LogType10;

								@Getter @Setter private long ctC9LogType11;

								@Getter @Setter private long ctC9LogType12;

								@Getter @Setter private long ctC9LogType13;

								@Getter @Setter private long ctC9LogType14;

								@Getter @Setter private long ctC9LogType15;

								@Getter @Setter private long ctC9LogType16;

								@Getter @Setter private long ctC9LogType17;

								@Getter @Setter private long ctC9LogType18;

								@Getter @Setter private long ctC9LogType19;

								@Getter @Setter private long ctC9LogType20;

								@Getter @Setter private long ctC9LogType21;

								@Getter @Setter private long ctC9LogType22;

								@Getter @Setter private long ctC9LogType23;

								@Getter @Setter private long ctC9LogType24;

								@Getter @Setter private long ctC9LogType25;

								@Getter @Setter private long ctC9LogType26;

								@Getter @Setter private long ctC9UndefLogType;

								@Getter @Setter private int waDateMn9;

								@Getter @Setter private int waDateDy9;

								@Getter @Setter private int waDateYr9;

								@Getter @Setter private int waTimeHh9;

								@Getter @Setter private int waTimeMm9;

								@Getter @Setter private int waTimeSs9;

						@Getter @Setter private char[] firstT2RcdInd = Field.fillLowValue(1);

						@Getter @Setter private char[] firstX92RcdInd = Field.fillLowValue(1);

						@Getter @Setter private char[] securityAlertFlag = new char[1];

						@Getter @Setter private char[] prevT2SortMipId = new char[3];

						@Getter @Setter private char[] prevRcRemoteMipId = new char[3];

						@Getter @Setter private char[] prevX92SortMipId = new char[3];

						@Getter @Setter private char[] prevT2SortDate = new char[6];

						@Getter @Setter private char[] prevX92SortDate = new char[6];

						@Getter @Setter private char[] compileDate = Field.fillLowValue(24);

						@Getter @Setter private char[] otherGlogClass100 = new char[1];

						@Getter @Setter private char[] lit8300 = new char[1];

						@Getter @Setter private char[] lit04300 = new char[2];

						@Getter @Setter private char[] lit20300 = new char[2];

						@Getter @Setter private char[] charBb300 = new char[2];

						@Getter @Setter private char[] char9134a300 = new char[5];

								@Getter @Setter private int numOne300;

								@Getter @Setter private int numTwo300;

								@Getter @Setter private int num6300;

								@Getter @Setter private int num56300;

								@Getter @Setter private long sys001Lrecl400;

								@Getter @Setter private int emailRecsWriteCnt400;

								@Getter @Setter private short emailRptOpPageNo400;

								@Getter @Setter private short emailRptOpLineNo400;
	
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





}
  
