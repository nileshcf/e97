package com.cloudframe.app.ip343690.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Work extends WorkSerialized {
   

						@Getter @Setter private char[] isItTheFirstTime100 = new char[1];

						@Getter @Setter private char[] isEndOfProcess100 = new char[1];

						@Getter @Setter private char[] eofPmaCursor100 = new char[1];

						@Getter @Setter private char[] isItDeadLock100 = new char[1];

						@Getter @Setter private char[] seqNumberOpt100 = new char[1];

						@Getter @Setter private char[] isItSqlError100 = new char[1];

						@Getter @Setter private char[] sys001FileStatus200 = new char[2];

						@Getter @Setter private char[] abendCode300 = new char[4];

						@Getter @Setter private char[] abendPara300 = new char[30];

						@Getter @Setter private char[] para1400300 = new char[30];

						@Getter @Setter private char[] para3210300 = new char[30];

						@Getter @Setter private char[] para3220300 = new char[30];

						@Getter @Setter private char[] para3230300 = new char[30];

						@Getter @Setter private char[] para8100300 = new char[30];

						@Getter @Setter private char[] para8200300 = new char[30];

						@Getter @Setter private char[] para8210300 = new char[30];

								@Getter @Setter private long recsRead400;

						@Getter @Setter private char[] abendMessage600 = new char[42];

						@Getter @Setter private char[] msg3005b600 = new char[50];

						@Getter @Setter private char[] msg3005c600 = new char[50];

						@Getter @Setter private char[] msg3005d600 = new char[50];

						@Getter @Setter private char[] msg3005e600 = new char[50];

						@Getter @Setter private char[] msg3010600 = new char[18];

						@Getter @Setter private char[] blankSpace600 = new char[1];

						@Getter @Setter private char[] asteriskLine600 = new char[45];

						@Getter @Setter private char[] db2ErrModuleMsg600 = new char[45];

						@Getter @Setter private char[] db2Deadlock600 = new char[63];

						@Getter @Setter private char[] db2DeadlockRel600 = new char[57];

						@Getter @Setter private char[] recsReadMsg600 = new char[40];

						@Getter @Setter private char[] recsUpdatedMsg600 = new char[40];

						@Getter @Setter private char[] ptrIp081110800 = new char[8];

						@Getter @Setter private char[] ptrIp599810800 = new char[8];

						@Getter @Setter private char[] ptrIp280010800 = new char[8];

						@Getter @Setter private char[] ptrIp610010800 = new char[8];

						@Getter @Setter private char[] ptrIp996010800 = new char[8];

						@Getter @Setter private char[] ptrMcwait800 = new char[8];

								@Getter @Setter private long noOfRows800;

								@Getter @Setter private long commitRows800;

								@Getter @Setter private short actualLen800;

						@Getter @Setter private char[] justifyIn800 = new char[19];

						@Getter @Setter private char[] justifyOut800 = new char[19];

						@Getter @Setter private char[] nonSpaceFound800 = new char[1];

						@Getter @Setter private char[] astriskLine900 = new char[35];

						@Getter @Setter private char[] abendAbend900 = new char[35];

						@Getter @Setter private char[] abendAbendPgm900 = new char[35];

						@Getter @Setter private char[] db85102cDb2BatchErrorRtn = new char[8];

						@Getter @Setter private char[] sqlTemp = Field.fillLowValue(128);
	
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





}
  
