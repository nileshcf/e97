package com.cloudframe.app.sf327010.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:59. using version 5.0.0.256
**/


import com.cloudframe.app.sf327010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

						private char[] extractZLogEofSw100 = new char[1];

						private char[] mnthMmNum100 = new char[2];

						private char[] hdrLine3203 = new char[145];

						private char[] hdrLine4204 = new char[133];

						private char[] dtlLine2206 = new char[127];

								private short maxLinesPerPage300;

								private int num1300;

								private int plus1300;

								private int plus4300;

								private int plus7300;

								private int num2300;

								private int num4300;

								private int num0300;

						private char[] charC300 = new char[1];

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

								private long readCount400;

								private long writeCount400;

								private long pageCount400;

								private long lineCount400;

								private long successCount400;

								private long errorCount400;

								private long totMessCount400;

								private BigDecimal successPercent400 = BigDecimal.ZERO;

								private BigDecimal errorPercent400 = BigDecimal.ZERO;

						private char[] startExecMsg600 = new char[64];

						private char[] noRecordFoundMsg600 = new char[38];

						private char[] eojMessage6009500 = new char[44];

								private short returnCode800;

						private char[] prevServerId800 = new char[3];

						private char[] prevLogType800 = new char[1];

						private char[] prevServiceId800 = new char[4];

								private long sumElapsedTime800;

								private int highElapsed800;

								private int lowElapsed800;

						private char[] runMonth800 = new char[3];

								private BigDecimal avgElapsedN800 = BigDecimal.ZERO;

								private char[] avgElapsed800 = Field.fillLowValue(14);

								private char[] successPercent800 = Field.fillLowValue(6);

								private char[] errorPercent800 = Field.fillLowValue(6);
	
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


 

	/**
	 *	Returns the value of extractZLogEofSw100
	 *	@return extractZLogEofSw100
	 */
   public char[] getExtractZLogEofSw100() throws CFException{
   		return extractZLogEofSw100;
   }

  
	/**
	*  set variable extractZLogEofSw100
	*  Corresponding COBOL Variable is 100-EXTRACT-Z-LOG-EOF-SW
	*  @param value
	**/
   public void setExtractZLogEofSw100(char[] value) {
       value = checkExtractZLogEofSw100Constraints(value);
       arraycopy(value,0,extractZLogEofSw100,0,value.length);
   } 
	public void setExtractZLogEofSw100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,extractZLogEofSw100,0,beginIndex + endIndex);
   }
	char[] zLogEof8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isZLogEof88100()
	 *	@return  Returns true if isZLogEof88100() is "Y"
	 */
   public boolean isZLogEof88100() throws CFException {
      return (  compareChars( getExtractZLogEofSw100() , zLogEof8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setZLogEof88100True() {  			
    	setExtractZLogEofSw100( zLogEof8810088Value);
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
	/**
	 *	Returns the value of hdrLine3203
	 *	@return hdrLine3203
	 */
   public char[] getHdrLine3203() throws CFException{
   		return hdrLine3203;
   }

  
	/**
	*  set variable hdrLine3203
	*  Corresponding COBOL Variable is 203-HDR-LINE-3
	*  @param value
	**/
   public void setHdrLine3203(char[] value) {
       value = checkHdrLine3203Constraints(value);
       arraycopy(value,0,hdrLine3203,0,value.length);
   } 
	public void setHdrLine3203(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,hdrLine3203,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of hdrLine4204
	 *	@return hdrLine4204
	 */
   public char[] getHdrLine4204() throws CFException{
   		return hdrLine4204;
   }

  
	/**
	*  set variable hdrLine4204
	*  Corresponding COBOL Variable is 204-HDR-LINE-4
	*  @param value
	**/
   public void setHdrLine4204(char[] value) {
       value = checkHdrLine4204Constraints(value);
       arraycopy(value,0,hdrLine4204,0,value.length);
   } 
	public void setHdrLine4204(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,hdrLine4204,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of dtlLine2206
	 *	@return dtlLine2206
	 */
   public char[] getDtlLine2206() throws CFException{
   		return dtlLine2206;
   }

  
	/**
	*  set variable dtlLine2206
	*  Corresponding COBOL Variable is 206-DTL-LINE-2
	*  @param value
	**/
   public void setDtlLine2206(char[] value) {
       value = checkDtlLine2206Constraints(value);
       arraycopy(value,0,dtlLine2206,0,value.length);
   } 
	public void setDtlLine2206(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,dtlLine2206,0,beginIndex + endIndex);
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
	 *	Returns the value of num0300
	 *	@return num0300
	 */
	public int getNum0300() throws CFException {
       if (isNum0300Modified()) { 
           num0300 = refreshNum0300();
        }
   		return num0300;
	}
	

	
	   
	/**
	 * 	Update Num0300 with the passed value
	 *  Corresponding COBOL Variable is 300-NUM-0
	 *	@param number
	 */
	public void setNum0300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    num0300 = checkNum0300MaxLimit(number); 
		serializeNum0300(num0300);
	}
	

	public void setNum0300(long number) {
	    number = checkNum0300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setNum0300((int)number);
	}
	
	/**
	 * 	Update Num0300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum0300(char[] value) throws CFException {
		 num0300 = serializeNum0300(value);
	}
	/**
	 * 	Update Num0300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum0300String(char[] value) throws CFException {
		 setNum0300(value);
	}
	/**
	 *	Returns the value of charC300
	 *	@return charC300
	 */
   public char[] getCharC300() throws CFException{
   		return charC300;
   }

  
	/**
	*  set variable charC300
	*  Corresponding COBOL Variable is 300-CHAR-C
	*  @param value
	**/
   public void setCharC300(char[] value) {
       value = checkCharC300Constraints(value);
       arraycopy(value,0,charC300,0,value.length);
   } 
	public void setCharC300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,charC300,0,beginIndex + endIndex);
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
	public long getReadCount400() throws CFException {
        if (isReadCount400Modified()) { 
           readCount400 = refreshReadCount400();
        }
   		return readCount400;
	}
	
	/**
	 * 	Update ReadCount400 with the passed value
	 *  Corresponding COBOL Variable is 400-READ-COUNT
	 *	@param number
	 */
	public void setReadCount400(long number) {
			readCount400 = checkReadCount400MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeReadCount400(readCount400);
	}


	public long getWriteCount400() throws CFException {
        if (isWriteCount400Modified()) { 
           writeCount400 = refreshWriteCount400();
        }
   		return writeCount400;
	}
	
	/**
	 * 	Update WriteCount400 with the passed value
	 *  Corresponding COBOL Variable is 400-WRITE-COUNT
	 *	@param number
	 */
	public void setWriteCount400(long number) {
			writeCount400 = checkWriteCount400MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeWriteCount400(writeCount400);
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


	public long getLineCount400() throws CFException {
        if (isLineCount400Modified()) { 
           lineCount400 = refreshLineCount400();
        }
   		return lineCount400;
	}
	
	/**
	 * 	Update LineCount400 with the passed value
	 *  Corresponding COBOL Variable is 400-LINE-COUNT
	 *	@param number
	 */
	public void setLineCount400(long number) {
			lineCount400 = checkLineCount400MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeLineCount400(lineCount400);
	}


	public long getSuccessCount400() throws CFException {
        if (isSuccessCount400Modified()) { 
           successCount400 = refreshSuccessCount400();
        }
   		return successCount400;
	}
	
	/**
	 * 	Update SuccessCount400 with the passed value
	 *  Corresponding COBOL Variable is 400-SUCCESS-COUNT
	 *	@param number
	 */
	public void setSuccessCount400(long number) {
			successCount400 = checkSuccessCount400MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeSuccessCount400(successCount400);
	}


	public long getErrorCount400() throws CFException {
        if (isErrorCount400Modified()) { 
           errorCount400 = refreshErrorCount400();
        }
   		return errorCount400;
	}
	
	/**
	 * 	Update ErrorCount400 with the passed value
	 *  Corresponding COBOL Variable is 400-ERROR-COUNT
	 *	@param number
	 */
	public void setErrorCount400(long number) {
			errorCount400 = checkErrorCount400MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeErrorCount400(errorCount400);
	}


	public long getTotMessCount400() throws CFException {
        if (isTotMessCount400Modified()) { 
           totMessCount400 = refreshTotMessCount400();
        }
   		return totMessCount400;
	}
	
	/**
	 * 	Update TotMessCount400 with the passed value
	 *  Corresponding COBOL Variable is 400-TOT-MESS-COUNT
	 *	@param number
	 */
	public void setTotMessCount400(long number) {
			totMessCount400 = checkTotMessCount400MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTotMessCount400(totMessCount400);
	}


	/**
	 *	Returns the value of successPercent400
	 *	@return successPercent400
	 */
	public BigDecimal getSuccessPercent400() throws CFException {
       if (isSuccessPercent400Modified()) { 
           successPercent400 = refreshSuccessPercent400();
        }
   		return successPercent400;
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
	/**
	 * 	Update SuccessPercent400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSuccessPercent400(char[] value) throws CFException {
		 successPercent400 = serializeSuccessPercent400(value);
	}   
	/**
	 *	Returns the value of errorPercent400
	 *	@return errorPercent400
	 */
	public BigDecimal getErrorPercent400() throws CFException {
       if (isErrorPercent400Modified()) { 
           errorPercent400 = refreshErrorPercent400();
        }
   		return errorPercent400;
	}
	

	
	   
	/**
	 * 	Update ErrorPercent400 with the passed number
	 *  Corresponding COBOL Variable is 400-ERROR-PERCENT
	 *	@param number
	 */
	public void setErrorPercent400(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       errorPercent400 = checkErrorPercent400MaxLimit(number);
	    serializeErrorPercent400(errorPercent400);
   }
	/**
	 * 	Update ErrorPercent400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setErrorPercent400(char[] value) throws CFException {
		 errorPercent400 = serializeErrorPercent400(value);
	}   
	/**
	 *	Returns the value of startExecMsg600
	 *	@return startExecMsg600
	 */
   public char[] getStartExecMsg600() throws CFException{
   		return startExecMsg600;
   }

  
	/**
	*  set variable startExecMsg600
	*  Corresponding COBOL Variable is 600-START-EXEC-MSG
	*  @param value
	**/
   public void setStartExecMsg600(char[] value) {
       value = checkStartExecMsg600Constraints(value);
       arraycopy(value,0,startExecMsg600,0,value.length);
   } 
	public void setStartExecMsg600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,startExecMsg600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of noRecordFoundMsg600
	 *	@return noRecordFoundMsg600
	 */
   public char[] getNoRecordFoundMsg600() throws CFException{
   		return noRecordFoundMsg600;
   }

  
	/**
	*  set variable noRecordFoundMsg600
	*  Corresponding COBOL Variable is 600-NO-RECORD-FOUND-MSG
	*  @param value
	**/
   public void setNoRecordFoundMsg600(char[] value) {
       value = checkNoRecordFoundMsg600Constraints(value);
       arraycopy(value,0,noRecordFoundMsg600,0,value.length);
   } 
	public void setNoRecordFoundMsg600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,noRecordFoundMsg600,0,beginIndex + endIndex);
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
	 *	Returns the value of returnCode800
	 *	@return returnCode800
	 */
	public short getReturnCode800() throws CFException {
   		return returnCode800;
	}
	
	/**
	 * 	Update ReturnCode800 with the passed value
	 *  Corresponding COBOL Variable is 800-RETURN-CODE
	 *	@param number
	 */
	public void setReturnCode800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    returnCode800 = checkReturnCode800MaxLimit(number); 
	}

	public void setReturnCode800(int number) {
	    number = checkReturnCode800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setReturnCode800((short)number);
	}
	public void setReturnCode800(long number) {
	    number = checkReturnCode800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setReturnCode800((short)number);
	}
	

	/**
	 *	Returns the value of prevServerId800
	 *	@return prevServerId800
	 */
   public char[] getPrevServerId800() throws CFException{
   		return prevServerId800;
   }

  
	/**
	*  set variable prevServerId800
	*  Corresponding COBOL Variable is 800-PREV-SERVER-ID
	*  @param value
	**/
   public void setPrevServerId800(char[] value) {
       value = checkPrevServerId800Constraints(value);
       arraycopy(value,0,prevServerId800,0,value.length);
   } 
	public void setPrevServerId800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,prevServerId800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of prevLogType800
	 *	@return prevLogType800
	 */
   public char[] getPrevLogType800() throws CFException{
   		return prevLogType800;
   }

  
	/**
	*  set variable prevLogType800
	*  Corresponding COBOL Variable is 800-PREV-LOG-TYPE
	*  @param value
	**/
   public void setPrevLogType800(char[] value) {
       value = checkPrevLogType800Constraints(value);
       arraycopy(value,0,prevLogType800,0,value.length);
   } 
	public void setPrevLogType800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,prevLogType800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of prevServiceId800
	 *	@return prevServiceId800
	 */
   public char[] getPrevServiceId800() throws CFException{
   		return prevServiceId800;
   }

  
	/**
	*  set variable prevServiceId800
	*  Corresponding COBOL Variable is 800-PREV-SERVICE-ID
	*  @param value
	**/
   public void setPrevServiceId800(char[] value) {
       value = checkPrevServiceId800Constraints(value);
       arraycopy(value,0,prevServiceId800,0,value.length);
   } 
	public void setPrevServiceId800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,prevServiceId800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of sumElapsedTime800
	 *	@return sumElapsedTime800
	 */
	public long getSumElapsedTime800() throws CFException {
   		return sumElapsedTime800;
	}
	
	/**
	 * 	Update SumElapsedTime800 with the passed value
	 *  Corresponding COBOL Variable is 800-SUM-ELAPSED-TIME
	 *	@param number
	 */
	public void setSumElapsedTime800(long number) {
	     // Truncate if the number is beyond +/- Max range
	    sumElapsedTime800 = checkSumElapsedTime800MaxLimit(number); 
	}


	/**
	 *	Returns the value of highElapsed800
	 *	@return highElapsed800
	 */
	public int getHighElapsed800() throws CFException {
   		return highElapsed800;
	}
	
	/**
	 * 	Update HighElapsed800 with the passed value
	 *  Corresponding COBOL Variable is 800-HIGH-ELAPSED
	 *	@param number
	 */
	public void setHighElapsed800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    highElapsed800 = checkHighElapsed800MaxLimit(number); 
	}


	public void setHighElapsed800(long number) {
	    number = checkHighElapsed800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setHighElapsed800((int)number);
	}
	
	/**
	 *	Returns the value of lowElapsed800
	 *	@return lowElapsed800
	 */
	public int getLowElapsed800() throws CFException {
   		return lowElapsed800;
	}
	
	/**
	 * 	Update LowElapsed800 with the passed value
	 *  Corresponding COBOL Variable is 800-LOW-ELAPSED
	 *	@param number
	 */
	public void setLowElapsed800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    lowElapsed800 = checkLowElapsed800MaxLimit(number); 
	}


	public void setLowElapsed800(long number) {
	    number = checkLowElapsed800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setLowElapsed800((int)number);
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
	 *	Returns the value of avgElapsedN800
	 *	@return avgElapsedN800
	 */
	public BigDecimal getAvgElapsedN800() throws CFException {
       if (isAvgElapsedN800Modified()) { 
           avgElapsedN800 = refreshAvgElapsedN800();
        }
   		return avgElapsedN800;
	}
	

	
	   
	/**
	 * 	Update AvgElapsedN800 with the passed number
	 *  Corresponding COBOL Variable is 800-AVG-ELAPSED-N
	 *	@param number
	 */
	public void setAvgElapsedN800(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       avgElapsedN800 = checkAvgElapsedN800MaxLimit(number);
	    serializeAvgElapsedN800(avgElapsedN800);
   }
	/**
	 * 	Update AvgElapsedN800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAvgElapsedN800(char[] value) throws CFException {
		 avgElapsedN800 = serializeAvgElapsedN800(value);
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
	 *	Returns the value of errorPercent800
	 *	@return errorPercent800
	 */
   public char[] getErrorPercent800() throws CFException{
     if (isErrorPercent800Modified()) { 
        errorPercent800 = refreshErrorPercent800();
     }
   		return errorPercent800;
   }

  
	/**
	*  set variable errorPercent800
	*  Corresponding COBOL Variable is 800-ERROR-PERCENT
	*  @param value
	**/
   public void setErrorPercent800(char[] value) {
      errorPercent800 = checkErrorPercent800Constraints(value);
      serializeErrorPercent800(errorPercent800);
   } 

     /**
	 * 	Update ErrorPercent800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrorPercent800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginErrorPercent800,errorPercent800.length);
   	
   }
   
   public void setErrorPercent800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginErrorPercent800,errorPercent800.length);
   	
   }
   
     /**
	 * 	Update ErrorPercent800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrorPercent800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrorPercent800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ErrorPercent800 with another Field
	 *	@param value
	 */
   public void setErrorPercent800(Field source) {
       replace(source,0,source.length(),beginErrorPercent800,ERROR_PERCENT_800_LEN);
   	
   }  
   
     /**
	 * 	Update ErrorPercent800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrorPercent800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginErrorPercent800,ERROR_PERCENT_800_LEN);
   	
   }
   
     /**
	 * 	Update ErrorPercent800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrorPercent800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrorPercent800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
