package com.cloudframe.app.sf327010.dto;

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
   

						@Getter @Setter private char[] extractZLogEofSw100 = new char[1];

						@Getter @Setter private char[] mnthMmNum100 = new char[2];

						@Getter @Setter private char[] hdrLine3203 = new char[145];

						@Getter @Setter private char[] hdrLine4204 = new char[133];

						@Getter @Setter private char[] dtlLine2206 = new char[127];

								@Getter @Setter private short maxLinesPerPage300;

								@Getter @Setter private int num1300;

								@Getter @Setter private int plus1300;

								@Getter @Setter private int plus4300;

								@Getter @Setter private int plus7300;

								@Getter @Setter private int num2300;

								@Getter @Setter private int num4300;

								@Getter @Setter private int num0300;

						@Getter @Setter private char[] charC300 = new char[1];

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

								@Getter @Setter private long readCount400;

								@Getter @Setter private long writeCount400;

								@Getter @Setter private long pageCount400;

								@Getter @Setter private long lineCount400;

								@Getter @Setter private long successCount400;

								@Getter @Setter private long errorCount400;

								@Getter @Setter private long totMessCount400;

								@Getter @Setter private BigDecimal successPercent400 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal errorPercent400 = BigDecimal.ZERO;

						@Getter @Setter private char[] startExecMsg600 = new char[64];

						@Getter @Setter private char[] noRecordFoundMsg600 = new char[38];

						@Getter @Setter private char[] eojMessage6009500 = new char[44];

								@Getter @Setter private short returnCode800;

						@Getter @Setter private char[] prevServerId800 = new char[3];

						@Getter @Setter private char[] prevLogType800 = new char[1];

						@Getter @Setter private char[] prevServiceId800 = new char[4];

								@Getter @Setter private long sumElapsedTime800;

								@Getter @Setter private int highElapsed800;

								@Getter @Setter private int lowElapsed800;

						@Getter @Setter private char[] runMonth800 = new char[3];

								@Getter @Setter private BigDecimal avgElapsedN800 = BigDecimal.ZERO;

								@Getter @Setter private char[] avgElapsed800 = Field.fillLowValue(14);

								@Getter @Setter private char[] successPercent800 = Field.fillLowValue(6);

								@Getter @Setter private char[] errorPercent800 = Field.fillLowValue(6);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setExtractZLogEofSw100(("N").toCharArray());
								setMnthMmNum100(fillSpace(2));
								setHdrLine3203("LOG TYPE   SERVICE      TOTAL MESSAGES       SUCCESSFUL            ERROR            AVG ELAPSED       HIGH ELAPSED   LOW ELAPSED                 ".toCharArray());
								setHdrLine4204("         SERVICE NAME                                                              (ELAPSED TIME IN MICROSECONDS)                    ".toCharArray());
								setDtlLine2206("                                              NO RECORD PRESENT IN THE INPUT FILE                                              ".toCharArray());
								setMaxLinesPerPage300((short)48);
								setNum1300(1);
								setPlus1300(1);
								setPlus4300(4);
								setPlus7300(7);
								setNum2300(2);
								setNum4300(4);
								setNum0300(0);
								setCharC300(("C").toCharArray());
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
								setReadCount400(0L);
								setWriteCount400(0L);
								setPageCount400(0L);
								setLineCount400(0L);
								setSuccessCount400(0L);
								setErrorCount400(0L);
								setTotMessCount400(0L);
								setSuccessPercent400(BigDecimal.ZERO);
								setErrorPercent400(BigDecimal.ZERO);
								setStartExecMsg600(pad(64,"SF327010-0000 ASA SERVER ACTIVITY SUMMARY REPORT ".toCharArray(),' ',RIGHT_PAD));
								setNoRecordFoundMsg600((" NO RECORD PRESENT IN THE INPUT FILE. ").toCharArray());
								setEojMessage6009500(("SF327010-9999 COMPLETED SUCCESSFULLY        ").toCharArray());
								setReturnCode800((short)0);
								setPrevServerId800(fillSpace(3));
								setPrevLogType800(fillSpace(1));
								setPrevServiceId800(fillSpace(4));
								setSumElapsedTime800(0L);
								setHighElapsed800(0);
								setLowElapsed800(0);
								setRunMonth800(fillSpace(3));
    }





}
  
