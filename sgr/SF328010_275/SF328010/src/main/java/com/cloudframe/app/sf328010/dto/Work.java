package com.cloudframe.app.sf328010.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


@Data
public class Work extends WorkSerialized {
   

						@Getter @Setter private char[] zLogEofSw100 = new char[1];

						@Getter @Setter private char[] zLogFirstRead100 = new char[1];

						@Getter @Setter private char[] mnthMmNum100 = new char[2];

								@Getter @Setter private short maxLinesPerPage300;

								@Getter @Setter private int plus1300;

								@Getter @Setter private int plus4300;

								@Getter @Setter private int plus7300;

								@Getter @Setter private int num1300;

								@Getter @Setter private int num2300;

								@Getter @Setter private int num4300;

						@Getter @Setter private char[] litC300 = new char[1];

						@Getter @Setter private char[] litUnknwn300 = new char[20];

								@Getter @Setter private short num100300;

						@Getter @Setter private char[] monthJan300 = new char[3];

						@Getter @Setter private char[] monthFeb300 = new char[3];

						@Getter @Setter private char[] monthMar300 = new char[3];

						@Getter @Setter private char[] monthApr300 = new char[3];

						@Getter @Setter private char[] monthMay300 = new char[3];

						@Getter @Setter private char[] monthJun300 = new char[3];

						@Getter @Setter private char[] monthJul300 = new char[3];

						@Getter @Setter private char[] monthAug300 = new char[3];

						@Getter @Setter private char[] monthSep300 = new char[3];

						@Getter @Setter private char[] monthOct300 = new char[3];

						@Getter @Setter private char[] monthNov300 = new char[3];

						@Getter @Setter private char[] monthDec300 = new char[3];

								@Getter @Setter private long zLogCnt400;

								@Getter @Setter private long rpt1LineCount400;

								@Getter @Setter private long pageCount400;

								@Getter @Setter private long totServiceCnt400;

								@Getter @Setter private long totRecWritten400;

								@Getter @Setter private long successCnt400;

								@Getter @Setter private long errorCnt400;

								@Getter @Setter private int highElapseTime400;

								@Getter @Setter private int lowElapseTime400;

								@Getter @Setter private long sumElapsedTime400;

								@Getter @Setter private BigDecimal successPercent400 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal errPercent400 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal avgElapsed400 = BigDecimal.ZERO;

						@Getter @Setter private char[] execStartMsg600 = new char[64];

						@Getter @Setter private char[] message6008000 = new char[62];

						@Getter @Setter private char[] message6008999 = new char[62];

						@Getter @Setter private char[] noInputData6000001 = new char[55];

						@Getter @Setter private char[] eojMessage6009500 = new char[44];

						@Getter @Setter private char[] headerLine3703 = new char[137];

						@Getter @Setter private char[] headerLine4704 = new char[149];

						@Getter @Setter private char[] emptyReport706 = new char[133];

						@Getter @Setter private char[] holdServiceId800 = new char[4];

						@Getter @Setter private char[] runMonth800 = new char[3];

								@Getter @Setter private char[] successCnt800 = Field.fillLowValue(11);

								@Getter @Setter private char[] successPercent800 = Field.fillLowValue(6);

								@Getter @Setter private char[] errorCnt800 = Field.fillLowValue(11);

								@Getter @Setter private char[] unsuccessPercent800 = Field.fillLowValue(6);

								@Getter @Setter private char[] avgElapsed800 = Field.fillLowValue(14);

								@Getter @Setter private char[] highElapseTime800 = Field.fillLowValue(11);

								@Getter @Setter private char[] lowElapseTime800 = Field.fillLowValue(11);

								@Getter @Setter private char[] totServiceCnt800 = Field.fillLowValue(11);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setZLogEofSw100(("N").toCharArray());
								setZLogFirstRead100(("N").toCharArray());
								setMnthMmNum100(fillSpace(2));
								setMaxLinesPerPage300((short)48);
								setPlus1300(1);
								setPlus4300(4);
								setPlus7300(7);
								setNum1300(1);
								setNum2300(2);
								setNum4300(4);
								setLitC300(("C").toCharArray());
								setLitUnknwn300(("UNKNOWN SERVICE ID  ").toCharArray());
								setNum100300((short)100);
								setMonthJan300(("JAN").toCharArray());
								setMonthFeb300(("FEB").toCharArray());
								setMonthMar300(("MAR").toCharArray());
								setMonthApr300(("APR").toCharArray());
								setMonthMay300(("MAY").toCharArray());
								setMonthJun300(("JUN").toCharArray());
								setMonthJul300(("JUL").toCharArray());
								setMonthAug300(("AUG").toCharArray());
								setMonthSep300(("SEP").toCharArray());
								setMonthOct300(("OCT").toCharArray());
								setMonthNov300(("NOV").toCharArray());
								setMonthDec300(("DEC").toCharArray());
								setZLogCnt400(0L);
								setRpt1LineCount400(0L);
								setPageCount400(0L);
								setTotServiceCnt400(0L);
								setTotRecWritten400(0L);
								setSuccessCnt400(0L);
								setErrorCnt400(0L);
								setHighElapseTime400(0);
								setLowElapseTime400(0);
								setSumElapsedTime400(0L);
								setSuccessPercent400(BigDecimal.ZERO);
								setErrPercent400(BigDecimal.ZERO);
								setAvgElapsed400(BigDecimal.ZERO);
								setExecStartMsg600(pad(64,"SF328010-0001  CREATE ASA SERVICE SUMMARY REPORT  ".toCharArray(),' ',RIGHT_PAD));
								setMessage6008000("SF328010-8000 ***** INPUT AND OUTPUT FILE RECORD COUNTS ******".toCharArray());
								setMessage6008999("SF328010-8999 ************** < END OF COUNTS > ***************".toCharArray());
								setNoInputData6000001(("SF328010-0001 EMPTY INPUT Z-LOG - NO DATA PROCESSED    ").toCharArray());
								setEojMessage6009500(("SF328010-9999 COMPLETED SUCCESSFULLY        ").toCharArray());
								setHeaderLine3703("         SERVICE     TOTAL MESSAGES       SUCCESSFUL                ERROR           AVG ELAPSED      HIGH ELAPSED   LOW ELAPSED          ".toCharArray());
								setHeaderLine4704("      SERVICE NAME                                                                 (ELAPSED TIMES IN MICROSECONDS)                                   ".toCharArray());
								setEmptyReport706("             NO Z LOG RECORD DATA PROCESSED                                                                                          ".toCharArray());
								setHoldServiceId800(fillSpace(4));
								setRunMonth800(fillSpace(3));
    }





}
  
