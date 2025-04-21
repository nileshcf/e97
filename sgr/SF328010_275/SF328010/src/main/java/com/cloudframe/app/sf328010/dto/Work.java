package com.cloudframe.app.sf328010.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:04. using version 5.0.0.256
**/


import com.cloudframe.app.sf328010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

						private char[] zLogEofSw100 = new char[1];

						private char[] zLogFirstRead100 = new char[1];

						private char[] mnthMmNum100 = new char[2];

								private short maxLinesPerPage300;

								private int plus1300;

								private int plus4300;

								private int plus7300;

								private int num1300;

								private int num2300;

								private int num4300;

						private char[] litC300 = new char[1];

						private char[] litUnknwn300 = new char[20];

								private short num100300;

						private char[] monthJan300 = new char[3];

						private char[] monthFeb300 = new char[3];

						private char[] monthMar300 = new char[3];

						private char[] monthApr300 = new char[3];

						private char[] monthMay300 = new char[3];

						private char[] monthJun300 = new char[3];

						private char[] monthJul300 = new char[3];

						private char[] monthAug300 = new char[3];

						private char[] monthSep300 = new char[3];

						private char[] monthOct300 = new char[3];

						private char[] monthNov300 = new char[3];

						private char[] monthDec300 = new char[3];

								private long zLogCnt400;

								private long rpt1LineCount400;

								private long pageCount400;

								private long totServiceCnt400;

								private long totRecWritten400;

								private long successCnt400;

								private long errorCnt400;

								private int highElapseTime400;

								private int lowElapseTime400;

								private long sumElapsedTime400;

								private BigDecimal successPercent400 = BigDecimal.ZERO;

								private BigDecimal errPercent400 = BigDecimal.ZERO;

								private BigDecimal avgElapsed400 = BigDecimal.ZERO;

						private char[] execStartMsg600 = new char[64];

						private char[] message6008000 = new char[62];

						private char[] message6008999 = new char[62];

						private char[] noInputData6000001 = new char[55];

						private char[] eojMessage6009500 = new char[44];

						private char[] headerLine3703 = new char[137];

						private char[] headerLine4704 = new char[149];

						private char[] emptyReport706 = new char[133];

						private char[] holdServiceId800 = new char[4];

						private char[] runMonth800 = new char[3];

								private char[] successCnt800 = Field.fillLowValue(11);

								private char[] successPercent800 = Field.fillLowValue(6);

								private char[] errorCnt800 = Field.fillLowValue(11);

								private char[] unsuccessPercent800 = Field.fillLowValue(6);

								private char[] avgElapsed800 = Field.fillLowValue(14);

								private char[] highElapseTime800 = Field.fillLowValue(11);

								private char[] lowElapseTime800 = Field.fillLowValue(11);

								private char[] totServiceCnt800 = Field.fillLowValue(11);
	
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


 

	/**
	 *	Returns the value of zLogEofSw100
	 *	@return zLogEofSw100
	 */
   public char[] getZLogEofSw100() throws CFException{
   		return zLogEofSw100;
   }

  
	/**
	*  set variable zLogEofSw100
	*  Corresponding COBOL Variable is 100-Z-LOG-EOF-SW
	*  @param value
	**/
   public void setZLogEofSw100(char[] value) {
       value = checkZLogEofSw100Constraints(value);
       arraycopy(value,0,zLogEofSw100,0,value.length);
   } 
	public void setZLogEofSw100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,zLogEofSw100,0,beginIndex + endIndex);
   }
	char[] zLogEof8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isZLogEof88100()
	 *	@return  Returns true if isZLogEof88100() is "Y"
	 */
   public boolean isZLogEof88100() throws CFException {
      return (  compareChars( getZLogEofSw100() , zLogEof8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setZLogEof88100True() {  			
    	setZLogEofSw100( zLogEof8810088Value);
   	}
	/**
	 *	Returns the value of zLogFirstRead100
	 *	@return zLogFirstRead100
	 */
   public char[] getZLogFirstRead100() throws CFException{
   		return zLogFirstRead100;
   }

  
	/**
	*  set variable zLogFirstRead100
	*  Corresponding COBOL Variable is 100-Z-LOG-FIRST-READ
	*  @param value
	**/
   public void setZLogFirstRead100(char[] value) {
       value = checkZLogFirstRead100Constraints(value);
       arraycopy(value,0,zLogFirstRead100,0,value.length);
   } 
	public void setZLogFirstRead100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,zLogFirstRead100,0,beginIndex + endIndex);
   }
	char[] notFirstRead8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isNotFirstRead88100()
	 *	@return  Returns true if isNotFirstRead88100() is "N"
	 */
   public boolean isNotFirstRead88100() throws CFException {
      return (  compareChars( getZLogFirstRead100() , notFirstRead8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setNotFirstRead88100True() {  			
    	setZLogFirstRead100( notFirstRead8810088Value);
   	}
	char[] firstRead8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isFirstRead88100()
	 *	@return  Returns true if isFirstRead88100() is "Y"
	 */
   public boolean isFirstRead88100() throws CFException {
      return (  compareChars( getZLogFirstRead100() , firstRead8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setFirstRead88100True() {  			
    	setZLogFirstRead100( firstRead8810088Value);
   	}
	/**
	 *	Returns the value of mnthMmNum100
	 *	@return mnthMmNum100
	 */
   public char[] getMnthMmNum100() throws CFException{
   		return mnthMmNum100;
   }

  
	/**
	*  set variable mnthMmNum100
	*  Corresponding COBOL Variable is 100-MNTH-MM-NUM
	*  @param value
	**/
   public void setMnthMmNum100(char[] value) {
       value = checkMnthMmNum100Constraints(value);
       arraycopy(value,0,mnthMmNum100,0,value.length);
   } 
	public void setMnthMmNum100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,mnthMmNum100,0,beginIndex + endIndex);
   }
	char[] mnthMmNumJan8810088Value = "01".toCharArray();
	/**
	 *	Test condition "01" for isMnthMmNumJan88100()
	 *	@return  Returns true if isMnthMmNumJan88100() is "01"
	 */
   public boolean isMnthMmNumJan88100() throws CFException {
      return (  compareChars( getMnthMmNum100() , mnthMmNumJan8810088Value)  == 0  );
   }


	/**
	*  set values "01"
	*/
   	public void setMnthMmNumJan88100True() {  			
    	setMnthMmNum100( mnthMmNumJan8810088Value);
   	}
	char[] mnthMmNumFeb8810088Value = "02".toCharArray();
	/**
	 *	Test condition "02" for isMnthMmNumFeb88100()
	 *	@return  Returns true if isMnthMmNumFeb88100() is "02"
	 */
   public boolean isMnthMmNumFeb88100() throws CFException {
      return (  compareChars( getMnthMmNum100() , mnthMmNumFeb8810088Value)  == 0  );
   }


	/**
	*  set values "02"
	*/
   	public void setMnthMmNumFeb88100True() {  			
    	setMnthMmNum100( mnthMmNumFeb8810088Value);
   	}
	char[] mnthMmNumMar8810088Value = "03".toCharArray();
	/**
	 *	Test condition "03" for isMnthMmNumMar88100()
	 *	@return  Returns true if isMnthMmNumMar88100() is "03"
	 */
   public boolean isMnthMmNumMar88100() throws CFException {
      return (  compareChars( getMnthMmNum100() , mnthMmNumMar8810088Value)  == 0  );
   }


	/**
	*  set values "03"
	*/
   	public void setMnthMmNumMar88100True() {  			
    	setMnthMmNum100( mnthMmNumMar8810088Value);
   	}
	char[] mnthMmNumApr8810088Value = "04".toCharArray();
	/**
	 *	Test condition "04" for isMnthMmNumApr88100()
	 *	@return  Returns true if isMnthMmNumApr88100() is "04"
	 */
   public boolean isMnthMmNumApr88100() throws CFException {
      return (  compareChars( getMnthMmNum100() , mnthMmNumApr8810088Value)  == 0  );
   }


	/**
	*  set values "04"
	*/
   	public void setMnthMmNumApr88100True() {  			
    	setMnthMmNum100( mnthMmNumApr8810088Value);
   	}
	char[] mnthMmNumMay8810088Value = "05".toCharArray();
	/**
	 *	Test condition "05" for isMnthMmNumMay88100()
	 *	@return  Returns true if isMnthMmNumMay88100() is "05"
	 */
   public boolean isMnthMmNumMay88100() throws CFException {
      return (  compareChars( getMnthMmNum100() , mnthMmNumMay8810088Value)  == 0  );
   }


	/**
	*  set values "05"
	*/
   	public void setMnthMmNumMay88100True() {  			
    	setMnthMmNum100( mnthMmNumMay8810088Value);
   	}
	char[] mnthMmNumJun8810088Value = "06".toCharArray();
	/**
	 *	Test condition "06" for isMnthMmNumJun88100()
	 *	@return  Returns true if isMnthMmNumJun88100() is "06"
	 */
   public boolean isMnthMmNumJun88100() throws CFException {
      return (  compareChars( getMnthMmNum100() , mnthMmNumJun8810088Value)  == 0  );
   }


	/**
	*  set values "06"
	*/
   	public void setMnthMmNumJun88100True() {  			
    	setMnthMmNum100( mnthMmNumJun8810088Value);
   	}
	char[] mnthMmNumJul8810088Value = "07".toCharArray();
	/**
	 *	Test condition "07" for isMnthMmNumJul88100()
	 *	@return  Returns true if isMnthMmNumJul88100() is "07"
	 */
   public boolean isMnthMmNumJul88100() throws CFException {
      return (  compareChars( getMnthMmNum100() , mnthMmNumJul8810088Value)  == 0  );
   }


	/**
	*  set values "07"
	*/
   	public void setMnthMmNumJul88100True() {  			
    	setMnthMmNum100( mnthMmNumJul8810088Value);
   	}
	char[] mnthMmNumAug8810088Value = "08".toCharArray();
	/**
	 *	Test condition "08" for isMnthMmNumAug88100()
	 *	@return  Returns true if isMnthMmNumAug88100() is "08"
	 */
   public boolean isMnthMmNumAug88100() throws CFException {
      return (  compareChars( getMnthMmNum100() , mnthMmNumAug8810088Value)  == 0  );
   }


	/**
	*  set values "08"
	*/
   	public void setMnthMmNumAug88100True() {  			
    	setMnthMmNum100( mnthMmNumAug8810088Value);
   	}
	char[] mnthMmNumSep8810088Value = "09".toCharArray();
	/**
	 *	Test condition "09" for isMnthMmNumSep88100()
	 *	@return  Returns true if isMnthMmNumSep88100() is "09"
	 */
   public boolean isMnthMmNumSep88100() throws CFException {
      return (  compareChars( getMnthMmNum100() , mnthMmNumSep8810088Value)  == 0  );
   }


	/**
	*  set values "09"
	*/
   	public void setMnthMmNumSep88100True() {  			
    	setMnthMmNum100( mnthMmNumSep8810088Value);
   	}
	char[] mnthMmNumOct8810088Value = "10".toCharArray();
	/**
	 *	Test condition "10" for isMnthMmNumOct88100()
	 *	@return  Returns true if isMnthMmNumOct88100() is "10"
	 */
   public boolean isMnthMmNumOct88100() throws CFException {
      return (  compareChars( getMnthMmNum100() , mnthMmNumOct8810088Value)  == 0  );
   }


	/**
	*  set values "10"
	*/
   	public void setMnthMmNumOct88100True() {  			
    	setMnthMmNum100( mnthMmNumOct8810088Value);
   	}
	char[] mnthMmNumNov8810088Value = "11".toCharArray();
	/**
	 *	Test condition "11" for isMnthMmNumNov88100()
	 *	@return  Returns true if isMnthMmNumNov88100() is "11"
	 */
   public boolean isMnthMmNumNov88100() throws CFException {
      return (  compareChars( getMnthMmNum100() , mnthMmNumNov8810088Value)  == 0  );
   }


	/**
	*  set values "11"
	*/
   	public void setMnthMmNumNov88100True() {  			
    	setMnthMmNum100( mnthMmNumNov8810088Value);
   	}
	char[] mnthMmNumDec8810088Value = "12".toCharArray();
	/**
	 *	Test condition "12" for isMnthMmNumDec88100()
	 *	@return  Returns true if isMnthMmNumDec88100() is "12"
	 */
   public boolean isMnthMmNumDec88100() throws CFException {
      return (  compareChars( getMnthMmNum100() , mnthMmNumDec8810088Value)  == 0  );
   }


	/**
	*  set values "12"
	*/
   	public void setMnthMmNumDec88100True() {  			
    	setMnthMmNum100( mnthMmNumDec8810088Value);
   	}
	public short getMaxLinesPerPage300() throws CFException {
        if (isMaxLinesPerPage300Modified()) { 
           maxLinesPerPage300 = refreshMaxLinesPerPage300();
        }
   		return maxLinesPerPage300;
	}
	
	/**
	 * 	Update MaxLinesPerPage300 with the passed value
	 *  Corresponding COBOL Variable is 300-MAX-LINES-PER-PAGE
	 *	@param number
	 */
	public void setMaxLinesPerPage300(short number) {
			maxLinesPerPage300 = checkMaxLinesPerPage300MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeMaxLinesPerPage300(maxLinesPerPage300);
	}

	public void setMaxLinesPerPage300(int number) {
	    number = checkMaxLinesPerPage300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMaxLinesPerPage300((short)number);
	}
	public void setMaxLinesPerPage300(long number) {
	    number = checkMaxLinesPerPage300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMaxLinesPerPage300((short)number);
	}
	

	/**
	 *	Returns the value of plus1300
	 *	@return plus1300
	 */
	public int getPlus1300() throws CFException {
       if (isPlus1300Modified()) { 
           plus1300 = refreshPlus1300();
        }
   		return plus1300;
	}
	

	
	   
	/**
	 * 	Update Plus1300 with the passed value
	 *  Corresponding COBOL Variable is 300-PLUS-1
	 *	@param number
	 */
	public void setPlus1300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    plus1300 = checkPlus1300MaxLimit(number); 
		serializePlus1300(plus1300);
	}
	

	public void setPlus1300(long number) {
	    number = checkPlus1300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setPlus1300((int)number);
	}
	
	/**
	 * 	Update Plus1300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlus1300(char[] value) throws CFException {
		 plus1300 = serializePlus1300(value);
	}
	/**
	 * 	Update Plus1300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlus1300String(char[] value) throws CFException {
		 setPlus1300(value);
	}
	/**
	 *	Returns the value of plus4300
	 *	@return plus4300
	 */
	public int getPlus4300() throws CFException {
       if (isPlus4300Modified()) { 
           plus4300 = refreshPlus4300();
        }
   		return plus4300;
	}
	

	
	   
	/**
	 * 	Update Plus4300 with the passed value
	 *  Corresponding COBOL Variable is 300-PLUS-4
	 *	@param number
	 */
	public void setPlus4300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    plus4300 = checkPlus4300MaxLimit(number); 
		serializePlus4300(plus4300);
	}
	

	public void setPlus4300(long number) {
	    number = checkPlus4300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setPlus4300((int)number);
	}
	
	/**
	 * 	Update Plus4300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlus4300(char[] value) throws CFException {
		 plus4300 = serializePlus4300(value);
	}
	/**
	 * 	Update Plus4300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlus4300String(char[] value) throws CFException {
		 setPlus4300(value);
	}
	/**
	 *	Returns the value of plus7300
	 *	@return plus7300
	 */
	public int getPlus7300() throws CFException {
       if (isPlus7300Modified()) { 
           plus7300 = refreshPlus7300();
        }
   		return plus7300;
	}
	

	
	   
	/**
	 * 	Update Plus7300 with the passed value
	 *  Corresponding COBOL Variable is 300-PLUS-7
	 *	@param number
	 */
	public void setPlus7300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    plus7300 = checkPlus7300MaxLimit(number); 
		serializePlus7300(plus7300);
	}
	

	public void setPlus7300(long number) {
	    number = checkPlus7300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setPlus7300((int)number);
	}
	
	/**
	 * 	Update Plus7300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlus7300(char[] value) throws CFException {
		 plus7300 = serializePlus7300(value);
	}
	/**
	 * 	Update Plus7300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlus7300String(char[] value) throws CFException {
		 setPlus7300(value);
	}
	/**
	 *	Returns the value of num1300
	 *	@return num1300
	 */
	public int getNum1300() throws CFException {
       if (isNum1300Modified()) { 
           num1300 = refreshNum1300();
        }
   		return num1300;
	}
	

	
	   
	/**
	 * 	Update Num1300 with the passed value
	 *  Corresponding COBOL Variable is 300-NUM-1
	 *	@param number
	 */
	public void setNum1300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    num1300 = checkNum1300MaxLimit(number); 
		serializeNum1300(num1300);
	}
	

	public void setNum1300(long number) {
	    number = checkNum1300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setNum1300((int)number);
	}
	
	/**
	 * 	Update Num1300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum1300(char[] value) throws CFException {
		 num1300 = serializeNum1300(value);
	}
	/**
	 * 	Update Num1300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum1300String(char[] value) throws CFException {
		 setNum1300(value);
	}
	/**
	 *	Returns the value of num2300
	 *	@return num2300
	 */
	public int getNum2300() throws CFException {
       if (isNum2300Modified()) { 
           num2300 = refreshNum2300();
        }
   		return num2300;
	}
	

	
	   
	/**
	 * 	Update Num2300 with the passed value
	 *  Corresponding COBOL Variable is 300-NUM-2
	 *	@param number
	 */
	public void setNum2300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    num2300 = checkNum2300MaxLimit(number); 
		serializeNum2300(num2300);
	}
	

	public void setNum2300(long number) {
	    number = checkNum2300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setNum2300((int)number);
	}
	
	/**
	 * 	Update Num2300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum2300(char[] value) throws CFException {
		 num2300 = serializeNum2300(value);
	}
	/**
	 * 	Update Num2300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum2300String(char[] value) throws CFException {
		 setNum2300(value);
	}
	/**
	 *	Returns the value of num4300
	 *	@return num4300
	 */
	public int getNum4300() throws CFException {
       if (isNum4300Modified()) { 
           num4300 = refreshNum4300();
        }
   		return num4300;
	}
	

	
	   
	/**
	 * 	Update Num4300 with the passed value
	 *  Corresponding COBOL Variable is 300-NUM-4
	 *	@param number
	 */
	public void setNum4300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    num4300 = checkNum4300MaxLimit(number); 
		serializeNum4300(num4300);
	}
	

	public void setNum4300(long number) {
	    number = checkNum4300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setNum4300((int)number);
	}
	
	/**
	 * 	Update Num4300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum4300(char[] value) throws CFException {
		 num4300 = serializeNum4300(value);
	}
	/**
	 * 	Update Num4300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum4300String(char[] value) throws CFException {
		 setNum4300(value);
	}
	/**
	 *	Returns the value of litC300
	 *	@return litC300
	 */
   public char[] getLitC300() throws CFException{
   		return litC300;
   }

  
	/**
	*  set variable litC300
	*  Corresponding COBOL Variable is 300-LIT-C
	*  @param value
	**/
   public void setLitC300(char[] value) {
       value = checkLitC300Constraints(value);
       arraycopy(value,0,litC300,0,value.length);
   } 
	public void setLitC300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,litC300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of litUnknwn300
	 *	@return litUnknwn300
	 */
   public char[] getLitUnknwn300() throws CFException{
   		return litUnknwn300;
   }

  
	/**
	*  set variable litUnknwn300
	*  Corresponding COBOL Variable is 300-LIT-UNKNWN
	*  @param value
	**/
   public void setLitUnknwn300(char[] value) {
       value = checkLitUnknwn300Constraints(value);
       arraycopy(value,0,litUnknwn300,0,value.length);
   } 
	public void setLitUnknwn300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,litUnknwn300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of num100300
	 *	@return num100300
	 */
	public short getNum100300() throws CFException {
   		return num100300;
	}
	
	/**
	 * 	Update Num100300 with the passed value
	 *  Corresponding COBOL Variable is 300-NUM-100
	 *	@param number
	 */
	public void setNum100300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    num100300 = checkNum100300MaxLimit(number); 
	}

	public void setNum100300(int number) {
	    number = checkNum100300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setNum100300((short)number);
	}
	public void setNum100300(long number) {
	    number = checkNum100300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setNum100300((short)number);
	}
	

	/**
	 *	Returns the value of monthJan300
	 *	@return monthJan300
	 */
   public char[] getMonthJan300() throws CFException{
   		return monthJan300;
   }

  
	/**
	*  set variable monthJan300
	*  Corresponding COBOL Variable is 300-MONTH-JAN
	*  @param value
	**/
   public void setMonthJan300(char[] value) {
       value = checkMonthJan300Constraints(value);
       arraycopy(value,0,monthJan300,0,value.length);
   } 
	public void setMonthJan300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,monthJan300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of monthFeb300
	 *	@return monthFeb300
	 */
   public char[] getMonthFeb300() throws CFException{
   		return monthFeb300;
   }

  
	/**
	*  set variable monthFeb300
	*  Corresponding COBOL Variable is 300-MONTH-FEB
	*  @param value
	**/
   public void setMonthFeb300(char[] value) {
       value = checkMonthFeb300Constraints(value);
       arraycopy(value,0,monthFeb300,0,value.length);
   } 
	public void setMonthFeb300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,monthFeb300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of monthMar300
	 *	@return monthMar300
	 */
   public char[] getMonthMar300() throws CFException{
   		return monthMar300;
   }

  
	/**
	*  set variable monthMar300
	*  Corresponding COBOL Variable is 300-MONTH-MAR
	*  @param value
	**/
   public void setMonthMar300(char[] value) {
       value = checkMonthMar300Constraints(value);
       arraycopy(value,0,monthMar300,0,value.length);
   } 
	public void setMonthMar300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,monthMar300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of monthApr300
	 *	@return monthApr300
	 */
   public char[] getMonthApr300() throws CFException{
   		return monthApr300;
   }

  
	/**
	*  set variable monthApr300
	*  Corresponding COBOL Variable is 300-MONTH-APR
	*  @param value
	**/
   public void setMonthApr300(char[] value) {
       value = checkMonthApr300Constraints(value);
       arraycopy(value,0,monthApr300,0,value.length);
   } 
	public void setMonthApr300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,monthApr300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of monthMay300
	 *	@return monthMay300
	 */
   public char[] getMonthMay300() throws CFException{
   		return monthMay300;
   }

  
	/**
	*  set variable monthMay300
	*  Corresponding COBOL Variable is 300-MONTH-MAY
	*  @param value
	**/
   public void setMonthMay300(char[] value) {
       value = checkMonthMay300Constraints(value);
       arraycopy(value,0,monthMay300,0,value.length);
   } 
	public void setMonthMay300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,monthMay300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of monthJun300
	 *	@return monthJun300
	 */
   public char[] getMonthJun300() throws CFException{
   		return monthJun300;
   }

  
	/**
	*  set variable monthJun300
	*  Corresponding COBOL Variable is 300-MONTH-JUN
	*  @param value
	**/
   public void setMonthJun300(char[] value) {
       value = checkMonthJun300Constraints(value);
       arraycopy(value,0,monthJun300,0,value.length);
   } 
	public void setMonthJun300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,monthJun300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of monthJul300
	 *	@return monthJul300
	 */
   public char[] getMonthJul300() throws CFException{
   		return monthJul300;
   }

  
	/**
	*  set variable monthJul300
	*  Corresponding COBOL Variable is 300-MONTH-JUL
	*  @param value
	**/
   public void setMonthJul300(char[] value) {
       value = checkMonthJul300Constraints(value);
       arraycopy(value,0,monthJul300,0,value.length);
   } 
	public void setMonthJul300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,monthJul300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of monthAug300
	 *	@return monthAug300
	 */
   public char[] getMonthAug300() throws CFException{
   		return monthAug300;
   }

  
	/**
	*  set variable monthAug300
	*  Corresponding COBOL Variable is 300-MONTH-AUG
	*  @param value
	**/
   public void setMonthAug300(char[] value) {
       value = checkMonthAug300Constraints(value);
       arraycopy(value,0,monthAug300,0,value.length);
   } 
	public void setMonthAug300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,monthAug300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of monthSep300
	 *	@return monthSep300
	 */
   public char[] getMonthSep300() throws CFException{
   		return monthSep300;
   }

  
	/**
	*  set variable monthSep300
	*  Corresponding COBOL Variable is 300-MONTH-SEP
	*  @param value
	**/
   public void setMonthSep300(char[] value) {
       value = checkMonthSep300Constraints(value);
       arraycopy(value,0,monthSep300,0,value.length);
   } 
	public void setMonthSep300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,monthSep300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of monthOct300
	 *	@return monthOct300
	 */
   public char[] getMonthOct300() throws CFException{
   		return monthOct300;
   }

  
	/**
	*  set variable monthOct300
	*  Corresponding COBOL Variable is 300-MONTH-OCT
	*  @param value
	**/
   public void setMonthOct300(char[] value) {
       value = checkMonthOct300Constraints(value);
       arraycopy(value,0,monthOct300,0,value.length);
   } 
	public void setMonthOct300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,monthOct300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of monthNov300
	 *	@return monthNov300
	 */
   public char[] getMonthNov300() throws CFException{
   		return monthNov300;
   }

  
	/**
	*  set variable monthNov300
	*  Corresponding COBOL Variable is 300-MONTH-NOV
	*  @param value
	**/
   public void setMonthNov300(char[] value) {
       value = checkMonthNov300Constraints(value);
       arraycopy(value,0,monthNov300,0,value.length);
   } 
	public void setMonthNov300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,monthNov300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of monthDec300
	 *	@return monthDec300
	 */
   public char[] getMonthDec300() throws CFException{
   		return monthDec300;
   }

  
	/**
	*  set variable monthDec300
	*  Corresponding COBOL Variable is 300-MONTH-DEC
	*  @param value
	**/
   public void setMonthDec300(char[] value) {
       value = checkMonthDec300Constraints(value);
       arraycopy(value,0,monthDec300,0,value.length);
   } 
	public void setMonthDec300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,monthDec300,0,beginIndex + endIndex);
   }
	public long getZLogCnt400() throws CFException {
        if (isZLogCnt400Modified()) { 
           zLogCnt400 = refreshZLogCnt400();
        }
   		return zLogCnt400;
	}
	
	/**
	 * 	Update ZLogCnt400 with the passed value
	 *  Corresponding COBOL Variable is 400-Z-LOG-CNT
	 *	@param number
	 */
	public void setZLogCnt400(long number) {
			zLogCnt400 = checkZLogCnt400MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeZLogCnt400(zLogCnt400);
	}


	public long getRpt1LineCount400() throws CFException {
        if (isRpt1LineCount400Modified()) { 
           rpt1LineCount400 = refreshRpt1LineCount400();
        }
   		return rpt1LineCount400;
	}
	
	/**
	 * 	Update Rpt1LineCount400 with the passed value
	 *  Corresponding COBOL Variable is 400-RPT1-LINE-COUNT
	 *	@param number
	 */
	public void setRpt1LineCount400(long number) {
			rpt1LineCount400 = checkRpt1LineCount400MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeRpt1LineCount400(rpt1LineCount400);
	}


	public long getPageCount400() throws CFException {
        if (isPageCount400Modified()) { 
           pageCount400 = refreshPageCount400();
        }
   		return pageCount400;
	}
	
	/**
	 * 	Update PageCount400 with the passed value
	 *  Corresponding COBOL Variable is 400-PAGE-COUNT
	 *	@param number
	 */
	public void setPageCount400(long number) {
			pageCount400 = checkPageCount400MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializePageCount400(pageCount400);
	}


	public long getTotServiceCnt400() throws CFException {
        if (isTotServiceCnt400Modified()) { 
           totServiceCnt400 = refreshTotServiceCnt400();
        }
   		return totServiceCnt400;
	}
	
	/**
	 * 	Update TotServiceCnt400 with the passed value
	 *  Corresponding COBOL Variable is 400-TOT-SERVICE-CNT
	 *	@param number
	 */
	public void setTotServiceCnt400(long number) {
			totServiceCnt400 = checkTotServiceCnt400MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTotServiceCnt400(totServiceCnt400);
	}


	public long getTotRecWritten400() throws CFException {
        if (isTotRecWritten400Modified()) { 
           totRecWritten400 = refreshTotRecWritten400();
        }
   		return totRecWritten400;
	}
	
	/**
	 * 	Update TotRecWritten400 with the passed value
	 *  Corresponding COBOL Variable is 400-TOT-REC-WRITTEN
	 *	@param number
	 */
	public void setTotRecWritten400(long number) {
			totRecWritten400 = checkTotRecWritten400MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTotRecWritten400(totRecWritten400);
	}


	public long getSuccessCnt400() throws CFException {
        if (isSuccessCnt400Modified()) { 
           successCnt400 = refreshSuccessCnt400();
        }
   		return successCnt400;
	}
	
	/**
	 * 	Update SuccessCnt400 with the passed value
	 *  Corresponding COBOL Variable is 400-SUCCESS-CNT
	 *	@param number
	 */
	public void setSuccessCnt400(long number) {
			successCnt400 = checkSuccessCnt400MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeSuccessCnt400(successCnt400);
	}


	public long getErrorCnt400() throws CFException {
        if (isErrorCnt400Modified()) { 
           errorCnt400 = refreshErrorCnt400();
        }
   		return errorCnt400;
	}
	
	/**
	 * 	Update ErrorCnt400 with the passed value
	 *  Corresponding COBOL Variable is 400-ERROR-CNT
	 *	@param number
	 */
	public void setErrorCnt400(long number) {
			errorCnt400 = checkErrorCnt400MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeErrorCnt400(errorCnt400);
	}


	public int getHighElapseTime400() throws CFException {
        if (isHighElapseTime400Modified()) { 
           highElapseTime400 = refreshHighElapseTime400();
        }
   		return highElapseTime400;
	}
	
	/**
	 * 	Update HighElapseTime400 with the passed value
	 *  Corresponding COBOL Variable is 400-HIGH-ELAPSE-TIME
	 *	@param number
	 */
	public void setHighElapseTime400(int number) {
			highElapseTime400 = checkHighElapseTime400MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeHighElapseTime400(highElapseTime400);
	}


	public void setHighElapseTime400(long number) {
	    number = checkHighElapseTime400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setHighElapseTime400((int)number);
	}
	
	public int getLowElapseTime400() throws CFException {
        if (isLowElapseTime400Modified()) { 
           lowElapseTime400 = refreshLowElapseTime400();
        }
   		return lowElapseTime400;
	}
	
	/**
	 * 	Update LowElapseTime400 with the passed value
	 *  Corresponding COBOL Variable is 400-LOW-ELAPSE-TIME
	 *	@param number
	 */
	public void setLowElapseTime400(int number) {
			lowElapseTime400 = checkLowElapseTime400MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeLowElapseTime400(lowElapseTime400);
	}


	public void setLowElapseTime400(long number) {
	    number = checkLowElapseTime400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setLowElapseTime400((int)number);
	}
	
	public long getSumElapsedTime400() throws CFException {
        if (isSumElapsedTime400Modified()) { 
           sumElapsedTime400 = refreshSumElapsedTime400();
        }
   		return sumElapsedTime400;
	}
	
	/**
	 * 	Update SumElapsedTime400 with the passed value
	 *  Corresponding COBOL Variable is 400-SUM-ELAPSED-TIME
	 *	@param number
	 */
	public void setSumElapsedTime400(long number) {
			sumElapsedTime400 = checkSumElapsedTime400MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeSumElapsedTime400(sumElapsedTime400);
	}


	public BigDecimal getSuccessPercent400() throws CFException {
        if (isSuccessPercent400Modified()) { 
           successPercent400 = refreshSuccessPercent400();
        }
   		return successPercent400;
	}

    public char[] getSuccessPercent400String() {
          return  successPercent400String();
    }
	
	/**
	 * 	Update SuccessPercent400 with the passed number
	 *  Corresponding COBOL Variable is 400-SUCCESS-PERCENT
	 *	@param number
	 */
	public void setSuccessPercent400(BigDecimal number) {	
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
     successPercent400 = checkSuccessPercent400MaxLimit(number);
	    serializeSuccessPercent400(successPercent400);
   }
	public BigDecimal getErrPercent400() throws CFException {
        if (isErrPercent400Modified()) { 
           errPercent400 = refreshErrPercent400();
        }
   		return errPercent400;
	}

    public char[] getErrPercent400String() {
          return  errPercent400String();
    }
	
	/**
	 * 	Update ErrPercent400 with the passed number
	 *  Corresponding COBOL Variable is 400-ERR-PERCENT
	 *	@param number
	 */
	public void setErrPercent400(BigDecimal number) {	
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
     errPercent400 = checkErrPercent400MaxLimit(number);
	    serializeErrPercent400(errPercent400);
   }
	public BigDecimal getAvgElapsed400() throws CFException {
        if (isAvgElapsed400Modified()) { 
           avgElapsed400 = refreshAvgElapsed400();
        }
   		return avgElapsed400;
	}

    public char[] getAvgElapsed400String() {
          return  avgElapsed400String();
    }
	
	/**
	 * 	Update AvgElapsed400 with the passed number
	 *  Corresponding COBOL Variable is 400-AVG-ELAPSED
	 *	@param number
	 */
	public void setAvgElapsed400(BigDecimal number) {	
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
     avgElapsed400 = checkAvgElapsed400MaxLimit(number);
	    serializeAvgElapsed400(avgElapsed400);
   }
	/**
	 *	Returns the value of execStartMsg600
	 *	@return execStartMsg600
	 */
   public char[] getExecStartMsg600() throws CFException{
   		return execStartMsg600;
   }

  
	/**
	*  set variable execStartMsg600
	*  Corresponding COBOL Variable is 600-EXEC-START-MSG
	*  @param value
	**/
   public void setExecStartMsg600(char[] value) {
       value = checkExecStartMsg600Constraints(value);
       arraycopy(value,0,execStartMsg600,0,value.length);
   } 
	public void setExecStartMsg600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,execStartMsg600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of message6008000
	 *	@return message6008000
	 */
   public char[] getMessage6008000() throws CFException{
   		return message6008000;
   }

  
	/**
	*  set variable message6008000
	*  Corresponding COBOL Variable is 600-8000-MESSAGE
	*  @param value
	**/
   public void setMessage6008000(char[] value) {
       value = checkMessage6008000Constraints(value);
       arraycopy(value,0,message6008000,0,value.length);
   } 
	public void setMessage6008000(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,message6008000,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of message6008999
	 *	@return message6008999
	 */
   public char[] getMessage6008999() throws CFException{
   		return message6008999;
   }

  
	/**
	*  set variable message6008999
	*  Corresponding COBOL Variable is 600-8999-MESSAGE
	*  @param value
	**/
   public void setMessage6008999(char[] value) {
       value = checkMessage6008999Constraints(value);
       arraycopy(value,0,message6008999,0,value.length);
   } 
	public void setMessage6008999(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,message6008999,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of noInputData6000001
	 *	@return noInputData6000001
	 */
   public char[] getNoInputData6000001() throws CFException{
   		return noInputData6000001;
   }

  
	/**
	*  set variable noInputData6000001
	*  Corresponding COBOL Variable is 600-0001-NO-INPUT-DATA
	*  @param value
	**/
   public void setNoInputData6000001(char[] value) {
       value = checkNoInputData6000001Constraints(value);
       arraycopy(value,0,noInputData6000001,0,value.length);
   } 
	public void setNoInputData6000001(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,noInputData6000001,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of eojMessage6009500
	 *	@return eojMessage6009500
	 */
   public char[] getEojMessage6009500() throws CFException{
   		return eojMessage6009500;
   }

  
	/**
	*  set variable eojMessage6009500
	*  Corresponding COBOL Variable is 600-9500-EOJ-MESSAGE
	*  @param value
	**/
   public void setEojMessage6009500(char[] value) {
       value = checkEojMessage6009500Constraints(value);
       arraycopy(value,0,eojMessage6009500,0,value.length);
   } 
	public void setEojMessage6009500(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,eojMessage6009500,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of headerLine3703
	 *	@return headerLine3703
	 */
   public char[] getHeaderLine3703() throws CFException{
   		return headerLine3703;
   }

  
	/**
	*  set variable headerLine3703
	*  Corresponding COBOL Variable is 703-HEADER-LINE-3
	*  @param value
	**/
   public void setHeaderLine3703(char[] value) {
       value = checkHeaderLine3703Constraints(value);
       arraycopy(value,0,headerLine3703,0,value.length);
   } 
	public void setHeaderLine3703(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,headerLine3703,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of headerLine4704
	 *	@return headerLine4704
	 */
   public char[] getHeaderLine4704() throws CFException{
   		return headerLine4704;
   }

  
	/**
	*  set variable headerLine4704
	*  Corresponding COBOL Variable is 704-HEADER-LINE-4
	*  @param value
	**/
   public void setHeaderLine4704(char[] value) {
       value = checkHeaderLine4704Constraints(value);
       arraycopy(value,0,headerLine4704,0,value.length);
   } 
	public void setHeaderLine4704(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,headerLine4704,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of emptyReport706
	 *	@return emptyReport706
	 */
   public char[] getEmptyReport706() throws CFException{
   		return emptyReport706;
   }

  
	/**
	*  set variable emptyReport706
	*  Corresponding COBOL Variable is 706-EMPTY-REPORT
	*  @param value
	**/
   public void setEmptyReport706(char[] value) {
       value = checkEmptyReport706Constraints(value);
       arraycopy(value,0,emptyReport706,0,value.length);
   } 
	public void setEmptyReport706(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,emptyReport706,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of holdServiceId800
	 *	@return holdServiceId800
	 */
   public char[] getHoldServiceId800() throws CFException{
   		return holdServiceId800;
   }

  
	/**
	*  set variable holdServiceId800
	*  Corresponding COBOL Variable is 800-HOLD-SERVICE-ID
	*  @param value
	**/
   public void setHoldServiceId800(char[] value) {
       value = checkHoldServiceId800Constraints(value);
       arraycopy(value,0,holdServiceId800,0,value.length);
   } 
	public void setHoldServiceId800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,holdServiceId800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of runMonth800
	 *	@return runMonth800
	 */
   public char[] getRunMonth800() throws CFException{
   		return runMonth800;
   }

  
	/**
	*  set variable runMonth800
	*  Corresponding COBOL Variable is 800-RUN-MONTH
	*  @param value
	**/
   public void setRunMonth800(char[] value) {
       value = checkRunMonth800Constraints(value);
       arraycopy(value,0,runMonth800,0,value.length);
   } 
	public void setRunMonth800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,runMonth800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of successCnt800
	 *	@return successCnt800
	 */
   public char[] getSuccessCnt800() throws CFException{
     if (isSuccessCnt800Modified()) { 
        successCnt800 = refreshSuccessCnt800();
     }
   		return successCnt800;
   }

  
	/**
	*  set variable successCnt800
	*  Corresponding COBOL Variable is 800-SUCCESS-CNT
	*  @param value
	**/
   public void setSuccessCnt800(char[] value) {
      successCnt800 = checkSuccessCnt800Constraints(value);
      serializeSuccessCnt800(successCnt800);
   } 

     /**
	 * 	Update SuccessCnt800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSuccessCnt800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSuccessCnt800,successCnt800.length);
   	
   }
   
   public void setSuccessCnt800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSuccessCnt800,successCnt800.length);
   	
   }
   
     /**
	 * 	Update SuccessCnt800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSuccessCnt800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSuccessCnt800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SuccessCnt800 with another Field
	 *	@param value
	 */
   public void setSuccessCnt800(Field source) {
       replace(source,0,source.length(),beginSuccessCnt800,SUCCESS_CNT_800_LEN);
   	
   }  
   
     /**
	 * 	Update SuccessCnt800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSuccessCnt800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSuccessCnt800,SUCCESS_CNT_800_LEN);
   	
   }
   
     /**
	 * 	Update SuccessCnt800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSuccessCnt800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSuccessCnt800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of successPercent800
	 *	@return successPercent800
	 */
   public char[] getSuccessPercent800() throws CFException{
     if (isSuccessPercent800Modified()) { 
        successPercent800 = refreshSuccessPercent800();
     }
   		return successPercent800;
   }

  
	/**
	*  set variable successPercent800
	*  Corresponding COBOL Variable is 800-SUCCESS-PERCENT
	*  @param value
	**/
   public void setSuccessPercent800(char[] value) {
      successPercent800 = checkSuccessPercent800Constraints(value);
      serializeSuccessPercent800(successPercent800);
   } 

     /**
	 * 	Update SuccessPercent800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSuccessPercent800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSuccessPercent800,successPercent800.length);
   	
   }
   
   public void setSuccessPercent800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSuccessPercent800,successPercent800.length);
   	
   }
   
     /**
	 * 	Update SuccessPercent800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSuccessPercent800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSuccessPercent800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SuccessPercent800 with another Field
	 *	@param value
	 */
   public void setSuccessPercent800(Field source) {
       replace(source,0,source.length(),beginSuccessPercent800,SUCCESS_PERCENT_800_LEN);
   	
   }  
   
     /**
	 * 	Update SuccessPercent800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSuccessPercent800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSuccessPercent800,SUCCESS_PERCENT_800_LEN);
   	
   }
   
     /**
	 * 	Update SuccessPercent800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSuccessPercent800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSuccessPercent800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of errorCnt800
	 *	@return errorCnt800
	 */
   public char[] getErrorCnt800() throws CFException{
     if (isErrorCnt800Modified()) { 
        errorCnt800 = refreshErrorCnt800();
     }
   		return errorCnt800;
   }

  
	/**
	*  set variable errorCnt800
	*  Corresponding COBOL Variable is 800-ERROR-CNT
	*  @param value
	**/
   public void setErrorCnt800(char[] value) {
      errorCnt800 = checkErrorCnt800Constraints(value);
      serializeErrorCnt800(errorCnt800);
   } 

     /**
	 * 	Update ErrorCnt800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrorCnt800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginErrorCnt800,errorCnt800.length);
   	
   }
   
   public void setErrorCnt800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginErrorCnt800,errorCnt800.length);
   	
   }
   
     /**
	 * 	Update ErrorCnt800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrorCnt800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrorCnt800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ErrorCnt800 with another Field
	 *	@param value
	 */
   public void setErrorCnt800(Field source) {
       replace(source,0,source.length(),beginErrorCnt800,ERROR_CNT_800_LEN);
   	
   }  
   
     /**
	 * 	Update ErrorCnt800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrorCnt800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginErrorCnt800,ERROR_CNT_800_LEN);
   	
   }
   
     /**
	 * 	Update ErrorCnt800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrorCnt800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrorCnt800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of unsuccessPercent800
	 *	@return unsuccessPercent800
	 */
   public char[] getUnsuccessPercent800() throws CFException{
     if (isUnsuccessPercent800Modified()) { 
        unsuccessPercent800 = refreshUnsuccessPercent800();
     }
   		return unsuccessPercent800;
   }

  
	/**
	*  set variable unsuccessPercent800
	*  Corresponding COBOL Variable is 800-UNSUCCESS-PERCENT
	*  @param value
	**/
   public void setUnsuccessPercent800(char[] value) {
      unsuccessPercent800 = checkUnsuccessPercent800Constraints(value);
      serializeUnsuccessPercent800(unsuccessPercent800);
   } 

     /**
	 * 	Update UnsuccessPercent800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUnsuccessPercent800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUnsuccessPercent800,unsuccessPercent800.length);
   	
   }
   
   public void setUnsuccessPercent800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUnsuccessPercent800,unsuccessPercent800.length);
   	
   }
   
     /**
	 * 	Update UnsuccessPercent800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUnsuccessPercent800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUnsuccessPercent800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update UnsuccessPercent800 with another Field
	 *	@param value
	 */
   public void setUnsuccessPercent800(Field source) {
       replace(source,0,source.length(),beginUnsuccessPercent800,UNSUCCESS_PERCENT_800_LEN);
   	
   }  
   
     /**
	 * 	Update UnsuccessPercent800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUnsuccessPercent800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUnsuccessPercent800,UNSUCCESS_PERCENT_800_LEN);
   	
   }
   
     /**
	 * 	Update UnsuccessPercent800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUnsuccessPercent800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUnsuccessPercent800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of avgElapsed800
	 *	@return avgElapsed800
	 */
   public char[] getAvgElapsed800() throws CFException{
     if (isAvgElapsed800Modified()) { 
        avgElapsed800 = refreshAvgElapsed800();
     }
   		return avgElapsed800;
   }

  
	/**
	*  set variable avgElapsed800
	*  Corresponding COBOL Variable is 800-AVG-ELAPSED
	*  @param value
	**/
   public void setAvgElapsed800(char[] value) {
      avgElapsed800 = checkAvgElapsed800Constraints(value);
      serializeAvgElapsed800(avgElapsed800);
   } 

     /**
	 * 	Update AvgElapsed800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAvgElapsed800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAvgElapsed800,avgElapsed800.length);
   	
   }
   
   public void setAvgElapsed800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAvgElapsed800,avgElapsed800.length);
   	
   }
   
     /**
	 * 	Update AvgElapsed800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAvgElapsed800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAvgElapsed800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AvgElapsed800 with another Field
	 *	@param value
	 */
   public void setAvgElapsed800(Field source) {
       replace(source,0,source.length(),beginAvgElapsed800,AVG_ELAPSED_800_LEN);
   	
   }  
   
     /**
	 * 	Update AvgElapsed800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAvgElapsed800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAvgElapsed800,AVG_ELAPSED_800_LEN);
   	
   }
   
     /**
	 * 	Update AvgElapsed800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAvgElapsed800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAvgElapsed800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of highElapseTime800
	 *	@return highElapseTime800
	 */
   public char[] getHighElapseTime800() throws CFException{
     if (isHighElapseTime800Modified()) { 
        highElapseTime800 = refreshHighElapseTime800();
     }
   		return highElapseTime800;
   }

  
	/**
	*  set variable highElapseTime800
	*  Corresponding COBOL Variable is 800-HIGH-ELAPSE-TIME
	*  @param value
	**/
   public void setHighElapseTime800(char[] value) {
      highElapseTime800 = checkHighElapseTime800Constraints(value);
      serializeHighElapseTime800(highElapseTime800);
   } 

     /**
	 * 	Update HighElapseTime800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHighElapseTime800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHighElapseTime800,highElapseTime800.length);
   	
   }
   
   public void setHighElapseTime800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHighElapseTime800,highElapseTime800.length);
   	
   }
   
     /**
	 * 	Update HighElapseTime800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHighElapseTime800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHighElapseTime800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HighElapseTime800 with another Field
	 *	@param value
	 */
   public void setHighElapseTime800(Field source) {
       replace(source,0,source.length(),beginHighElapseTime800,HIGH_ELAPSE_TIME_800_LEN);
   	
   }  
   
     /**
	 * 	Update HighElapseTime800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHighElapseTime800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHighElapseTime800,HIGH_ELAPSE_TIME_800_LEN);
   	
   }
   
     /**
	 * 	Update HighElapseTime800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHighElapseTime800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHighElapseTime800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lowElapseTime800
	 *	@return lowElapseTime800
	 */
   public char[] getLowElapseTime800() throws CFException{
     if (isLowElapseTime800Modified()) { 
        lowElapseTime800 = refreshLowElapseTime800();
     }
   		return lowElapseTime800;
   }

  
	/**
	*  set variable lowElapseTime800
	*  Corresponding COBOL Variable is 800-LOW-ELAPSE-TIME
	*  @param value
	**/
   public void setLowElapseTime800(char[] value) {
      lowElapseTime800 = checkLowElapseTime800Constraints(value);
      serializeLowElapseTime800(lowElapseTime800);
   } 

     /**
	 * 	Update LowElapseTime800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLowElapseTime800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLowElapseTime800,lowElapseTime800.length);
   	
   }
   
   public void setLowElapseTime800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLowElapseTime800,lowElapseTime800.length);
   	
   }
   
     /**
	 * 	Update LowElapseTime800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLowElapseTime800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLowElapseTime800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LowElapseTime800 with another Field
	 *	@param value
	 */
   public void setLowElapseTime800(Field source) {
       replace(source,0,source.length(),beginLowElapseTime800,LOW_ELAPSE_TIME_800_LEN);
   	
   }  
   
     /**
	 * 	Update LowElapseTime800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLowElapseTime800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLowElapseTime800,LOW_ELAPSE_TIME_800_LEN);
   	
   }
   
     /**
	 * 	Update LowElapseTime800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLowElapseTime800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLowElapseTime800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of totServiceCnt800
	 *	@return totServiceCnt800
	 */
   public char[] getTotServiceCnt800() throws CFException{
     if (isTotServiceCnt800Modified()) { 
        totServiceCnt800 = refreshTotServiceCnt800();
     }
   		return totServiceCnt800;
   }

  
	/**
	*  set variable totServiceCnt800
	*  Corresponding COBOL Variable is 800-TOT-SERVICE-CNT
	*  @param value
	**/
   public void setTotServiceCnt800(char[] value) {
      totServiceCnt800 = checkTotServiceCnt800Constraints(value);
      serializeTotServiceCnt800(totServiceCnt800);
   } 

     /**
	 * 	Update TotServiceCnt800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTotServiceCnt800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTotServiceCnt800,totServiceCnt800.length);
   	
   }
   
   public void setTotServiceCnt800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTotServiceCnt800,totServiceCnt800.length);
   	
   }
   
     /**
	 * 	Update TotServiceCnt800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTotServiceCnt800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTotServiceCnt800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TotServiceCnt800 with another Field
	 *	@param value
	 */
   public void setTotServiceCnt800(Field source) {
       replace(source,0,source.length(),beginTotServiceCnt800,TOT_SERVICE_CNT_800_LEN);
   	
   }  
   
     /**
	 * 	Update TotServiceCnt800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTotServiceCnt800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTotServiceCnt800,TOT_SERVICE_CNT_800_LEN);
   	
   }
   
     /**
	 * 	Update TotServiceCnt800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTotServiceCnt800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTotServiceCnt800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
