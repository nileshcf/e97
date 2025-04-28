package com.cloudframe.app.cfif01.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:51. using version 5.0.0.256
**/


import com.cloudframe.app.cfif01.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


public class Work extends WorkSerialized {
   

						private char[] wmbcsCsCharacter = Field.fillLowValue(1);

						private char[] wmbcsShiftOutPc = new char[1];

						private char[] wmbcsShiftInPc = new char[1];

						private char[] cisoutWorkRec = Field.fillLowValue(8);

						private char[] cond = Field.fillLowValue(6);

								private char[] wS1 = Field.fillLowValue(12);

								private char[] wS2 = Field.fillLowValue(13);

								private BigDecimal from = BigDecimal.ZERO;

								private int tempMktgCd;

						private char[] revoDnsCd = Field.fillLowValue(5);

								private int currentMonth;

						private char[] monthRange = Field.fillLowValue(2);

								private int delayCustIdNo;

						private char[] delayMtn = Field.fillLowValue(10);

						private char[] delayBillPeriod = Field.fillLowValue(1);

						private char[] delayMeasCd = Field.fillLowValue(2);

						private char[] delaydatEofSw = new char[1];

						private char[] readDelaydatSw = new char[1];

								private int billku00CustIdNo;

						private char[] billku00Mtn = Field.fillLowValue(10);

						private char[] x4 = new char[4];

						private char[] x3 = new char[3];

						private char[] batchId = new char[3];

								private int oinGeoCd;

						private char[] tranCode = new char[4];

						private char[] parmState = Field.fillLowValue(2);

						private char[] parmTyperun = Field.fillLowValue(4);

						private char[] parmRao = Field.fillLowValue(3);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setWmbcsShiftOutPc(getString(new byte[] {(byte)0x0E}).toCharArray());
								setWmbcsShiftInPc(getString(new byte[] {(byte)0x0F}).toCharArray());
								setTempMktgCd(0);
								setCurrentMonth(10);
								setDelaydatEofSw(fillLowValue(1));
								setReadDelaydatSw(fillSpace(1));
								setX4(("ABC ").toCharArray());
								setX3(("ABC").toCharArray());
								setBatchId(fillSpace(3));
								setTranCode(fillSpace(4));
    }


 

	/**
	 *	Returns the value of wmbcsCsCharacter
	 *	@return wmbcsCsCharacter
	 */
   public char[] getWmbcsCsCharacter() throws CFException{
   		return wmbcsCsCharacter;
   }

  
	/**
	*  set variable wmbcsCsCharacter
	*  Corresponding COBOL Variable is WMBCS-CS-CHARACTER
	*  @param value
	**/
   public void setWmbcsCsCharacter(char[] value) {
       value = checkWmbcsCsCharacterConstraints(value);
       arraycopy(value,0,wmbcsCsCharacter,0,value.length);
   } 
	public void setWmbcsCsCharacter(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wmbcsCsCharacter,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wmbcsShiftOutPc
	 *	@return wmbcsShiftOutPc
	 */
   public char[] getWmbcsShiftOutPc() throws CFException{
   		return wmbcsShiftOutPc;
   }

  
	/**
	*  set variable wmbcsShiftOutPc
	*  Corresponding COBOL Variable is WMBCS-SHIFT-OUT-PC
	*  @param value
	**/
   public void setWmbcsShiftOutPc(char[] value) {
       value = checkWmbcsShiftOutPcConstraints(value);
       arraycopy(value,0,wmbcsShiftOutPc,0,value.length);
   } 
	public void setWmbcsShiftOutPc(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wmbcsShiftOutPc,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wmbcsShiftInPc
	 *	@return wmbcsShiftInPc
	 */
   public char[] getWmbcsShiftInPc() throws CFException{
   		return wmbcsShiftInPc;
   }

  
	/**
	*  set variable wmbcsShiftInPc
	*  Corresponding COBOL Variable is WMBCS-SHIFT-IN-PC
	*  @param value
	**/
   public void setWmbcsShiftInPc(char[] value) {
       value = checkWmbcsShiftInPcConstraints(value);
       arraycopy(value,0,wmbcsShiftInPc,0,value.length);
   } 
	public void setWmbcsShiftInPc(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wmbcsShiftInPc,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of cisoutWorkRec
	 *	@return cisoutWorkRec
	 */
   public char[] getCisoutWorkRec() throws CFException{
   		return cisoutWorkRec;
   }

  
	/**
	*  set variable cisoutWorkRec
	*  Corresponding COBOL Variable is CISOUT-WORK-REC
	*  @param value
	**/
   public void setCisoutWorkRec(char[] value) {
       value = checkCisoutWorkRecConstraints(value);
       arraycopy(value,0,cisoutWorkRec,0,value.length);
   } 
	public void setCisoutWorkRec(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,cisoutWorkRec,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of cond
	 *	@return cond
	 */
   public char[] getCond() throws CFException{
   		return cond;
   }

  
	/**
	*  set variable cond
	*  Corresponding COBOL Variable is WS-COND
	*  @param value
	**/
   public void setCond(char[] value) {
       value = checkCondConstraints(value);
       arraycopy(value,0,cond,0,value.length);
   } 
	public void setCond(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,cond,0,beginIndex + endIndex);
   }
	char[] fruit88Value1 = "ORANGE".toCharArray();
char[] fruit88Value2 = "BANANA".toCharArray();
char[] fruit88Value3 = "APPLE ".toCharArray();

	/**
	 *	Test condition "ORANGE" "BANANA" "APPLE " for isFruit()
	 *	@return  Returns true if isFruit() is "ORANGE" "BANANA" "APPLE "
	 */
   public boolean isFruit() throws CFException {
      return (  compareChars( getCond() , fruit88Value1)  == 0  ||  compareChars( getCond() , fruit88Value2)  == 0  ||  compareChars( getCond() , fruit88Value3)  == 0  );
   }


	/**
	*  set values "ORANGE" "BANANA" "APPLE "
	*/
   	public void setFruitTrue() {  			
    	setCond( fruit88Value1);
   	}
	char[] veggi88Value1 = "TOMATO".toCharArray();
char[] veggi88Value2 = "BEANS ".toCharArray();
char[] veggi88Value3 = "CARROT".toCharArray();

	/**
	 *	Test condition "TOMATO" "BEANS " "CARROT" for isVeggi()
	 *	@return  Returns true if isVeggi() is "TOMATO" "BEANS " "CARROT"
	 */
   public boolean isVeggi() throws CFException {
      return (  compareChars( getCond() , veggi88Value1)  == 0  ||  compareChars( getCond() , veggi88Value2)  == 0  ||  compareChars( getCond() , veggi88Value3)  == 0  );
   }


	/**
	*  set values "TOMATO" "BEANS " "CARROT"
	*/
   	public void setVeggiTrue() {  			
    	setCond( veggi88Value1);
   	}
	/**
	 *	Returns the value of wS1
	 *	@return wS1
	 */
   public char[] getWS1() throws CFException{
     if (isWS1Modified()) { 
        wS1 = refreshWS1();
     }
   		return wS1;
   }

  
	/**
	*  set variable wS1
	*  Corresponding COBOL Variable is WS-1
	*  @param value
	**/
   public void setWS1(char[] value) {
      wS1 = checkWS1Constraints(value);
      serializeWS1(wS1);
   } 

     /**
	 * 	Update WS1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWS1,wS1.length);
   	
   }
   
   public void setWS1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWS1,wS1.length);
   	
   }
   
     /**
	 * 	Update WS1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WS1 with another Field
	 *	@param value
	 */
   public void setWS1(Field source) {
       replace(source,0,source.length(),beginWS1,W_S_1_LEN);
   	
   }  
   
     /**
	 * 	Update WS1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWS1,W_S_1_LEN);
   	
   }
   
     /**
	 * 	Update WS1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wS2
	 *	@return wS2
	 */
   public char[] getWS2() throws CFException{
     if (isWS2Modified()) { 
        wS2 = refreshWS2();
     }
   		return wS2;
   }

  
	/**
	*  set variable wS2
	*  Corresponding COBOL Variable is WS-2
	*  @param value
	**/
   public void setWS2(char[] value) {
      wS2 = checkWS2Constraints(value);
      serializeWS2(wS2);
   } 

     /**
	 * 	Update WS2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWS2,wS2.length);
   	
   }
   
   public void setWS2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWS2,wS2.length);
   	
   }
   
     /**
	 * 	Update WS2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WS2 with another Field
	 *	@param value
	 */
   public void setWS2(Field source) {
       replace(source,0,source.length(),beginWS2,W_S_2_LEN);
   	
   }  
   
     /**
	 * 	Update WS2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWS2,W_S_2_LEN);
   	
   }
   
     /**
	 * 	Update WS2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of from
	 *	@return from
	 */
	public BigDecimal getFrom() throws CFException {
       if (isFromModified()) { 
           from = refreshFrom();
        }
   		return from;
	}
	

	
	   
	/**
	 * 	Update From with the passed number
	 *  Corresponding COBOL Variable is WS-FROM
	 *	@param number
	 */
	public void setFrom(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       from = checkFromMaxLimit(number);
	    serializeFrom(from);
   }
	/**
	 * 	Update From with the passed value
	 *	@param value (String or char[])
	 */
	public void setFrom(char[] value) throws CFException {
		 from = serializeFrom(value);
	}   
	/**
	 *	Returns the value of tempMktgCd
	 *	@return tempMktgCd
	 */
	public int getTempMktgCd() throws CFException {
   		return tempMktgCd;
	}
	
	/**
	 * 	Update TempMktgCd with the passed value
	 *  Corresponding COBOL Variable is WS-TEMP-MKTG-CD
	 *	@param number
	 */
	public void setTempMktgCd(int number) {
	     // Truncate if the number is beyond +/- Max range
	    tempMktgCd = checkTempMktgCdMaxLimit(number); 
	}


	public void setTempMktgCd(long number) {
	    number = checkTempMktgCdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTempMktgCd((int)number);
	}
	
	/**
	 *	Returns the value of revoDnsCd
	 *	@return revoDnsCd
	 */
   public char[] getRevoDnsCd() throws CFException{
   		return revoDnsCd;
   }

  
	/**
	*  set variable revoDnsCd
	*  Corresponding COBOL Variable is REVO-DNS-CD
	*  @param value
	**/
   public void setRevoDnsCd(char[] value) {
       value = checkRevoDnsCdConstraints(value);
       arraycopy(value,0,revoDnsCd,0,value.length);
   } 
	public void setRevoDnsCd(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,revoDnsCd,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of currentMonth
	 *	@return currentMonth
	 */
	public int getCurrentMonth() throws CFException {
       if (isCurrentMonthModified()) { 
           currentMonth = refreshCurrentMonth();
        }
   		return currentMonth;
	}
	

	
	   
	/**
	 * 	Update CurrentMonth with the passed value
	 *  Corresponding COBOL Variable is WS-CURRENT-MONTH
	 *	@param number
	 */
	public void setCurrentMonth(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    currentMonth = checkCurrentMonthMaxLimit(number); 
		serializeCurrentMonth(currentMonth);
	}
	

	public void setCurrentMonth(long number) {
	    number = checkCurrentMonthMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCurrentMonth((int)number);
	}
	
	/**
	 * 	Update CurrentMonth with the passed value
	 *	@param value (String or char[])
	 */
	public void setCurrentMonth(char[] value) throws CFException {
		 currentMonth = serializeCurrentMonth(value);
	}
	/**
	 * 	Update CurrentMonth with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCurrentMonthString(char[] value) throws CFException {
		 setCurrentMonth(value);
	}
	/**
	 *	Returns the value of monthRange
	 *	@return monthRange
	 */
   public char[] getMonthRange() throws CFException{
   		return monthRange;
   }

  
	/**
	*  set variable monthRange
	*  Corresponding COBOL Variable is WS-MONTH-RANGE
	*  @param value
	**/
   public void setMonthRange(char[] value) {
       value = checkMonthRangeConstraints(value);
       arraycopy(value,0,monthRange,0,value.length);
   } 
	public void setMonthRange(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,monthRange,0,beginIndex + endIndex);
   }
	
	/**
	 *	Test condition "01" THRU "12" for isWithinRange()
	 *	@return  Returns true if isWithinRange() is "01" THRU "12"
	 */
   public boolean isWithinRange() throws CFException {
      return (  isGreaterOrEqual(getMonthRange(), "01" ) &&  isLessOrEqual(getMonthRange(),"12" )  );
   }


	/**
	*  set values "01" THRU "12"
	*/
   	public void setWithinRangeTrue() {  			
    	setMonthRange( "01".toCharArray());
   	}
	/**
	 *	Returns the value of delayCustIdNo
	 *	@return delayCustIdNo
	 */
	public int getDelayCustIdNo() throws CFException {
   		return delayCustIdNo;
	}
	
	/**
	 * 	Update DelayCustIdNo with the passed value
	 *  Corresponding COBOL Variable is DELAY-CUST-ID-NO
	 *	@param number
	 */
	public void setDelayCustIdNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    delayCustIdNo = checkDelayCustIdNoMaxLimit(number); 
	}


	public void setDelayCustIdNo(long number) {
	    number = checkDelayCustIdNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDelayCustIdNo((int)number);
	}
	
	/**
	 *	Returns the value of delayMtn
	 *	@return delayMtn
	 */
   public char[] getDelayMtn() throws CFException{
   		return delayMtn;
   }

  
	/**
	*  set variable delayMtn
	*  Corresponding COBOL Variable is DELAY-MTN
	*  @param value
	**/
   public void setDelayMtn(char[] value) {
       value = checkDelayMtnConstraints(value);
       arraycopy(value,0,delayMtn,0,value.length);
   } 
	public void setDelayMtn(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,delayMtn,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of delayBillPeriod
	 *	@return delayBillPeriod
	 */
   public char[] getDelayBillPeriod() throws CFException{
   		return delayBillPeriod;
   }

  
	/**
	*  set variable delayBillPeriod
	*  Corresponding COBOL Variable is DELAY-BILL-PERIOD
	*  @param value
	**/
   public void setDelayBillPeriod(char[] value) {
       value = checkDelayBillPeriodConstraints(value);
       arraycopy(value,0,delayBillPeriod,0,value.length);
   } 
	public void setDelayBillPeriod(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,delayBillPeriod,0,beginIndex + endIndex);
   }
	char[] delayBillPeriod288Value = "2".toCharArray();
	/**
	 *	Test condition "2" for isDelayBillPeriod2()
	 *	@return  Returns true if isDelayBillPeriod2() is "2"
	 */
   public boolean isDelayBillPeriod2() throws CFException {
      return (  compareChars( getDelayBillPeriod() , delayBillPeriod288Value)  == 0  );
   }


	/**
	*  set values "2"
	*/
   	public void setDelayBillPeriod2True() {  			
    	setDelayBillPeriod( delayBillPeriod288Value);
   	}
	char[] delayBillPeriod388Value = "3".toCharArray();
	/**
	 *	Test condition "3" for isDelayBillPeriod3()
	 *	@return  Returns true if isDelayBillPeriod3() is "3"
	 */
   public boolean isDelayBillPeriod3() throws CFException {
      return (  compareChars( getDelayBillPeriod() , delayBillPeriod388Value)  == 0  );
   }


	/**
	*  set values "3"
	*/
   	public void setDelayBillPeriod3True() {  			
    	setDelayBillPeriod( delayBillPeriod388Value);
   	}
	/**
	 *	Returns the value of delayMeasCd
	 *	@return delayMeasCd
	 */
   public char[] getDelayMeasCd() throws CFException{
   		return delayMeasCd;
   }

  
	/**
	*  set variable delayMeasCd
	*  Corresponding COBOL Variable is DELAY-MEAS-CD
	*  @param value
	**/
   public void setDelayMeasCd(char[] value) {
       value = checkDelayMeasCdConstraints(value);
       arraycopy(value,0,delayMeasCd,0,value.length);
   } 
	public void setDelayMeasCd(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,delayMeasCd,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of delaydatEofSw
	 *	@return delaydatEofSw
	 */
   public char[] getDelaydatEofSw() throws CFException{
   		return delaydatEofSw;
   }

  
	/**
	*  set variable delaydatEofSw
	*  Corresponding COBOL Variable is DELAYDAT-EOF-SW
	*  @param value
	**/
   public void setDelaydatEofSw(char[] value) {
       value = checkDelaydatEofSwConstraints(value);
       arraycopy(value,0,delaydatEofSw,0,value.length);
   } 
	public void setDelaydatEofSw(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,delaydatEofSw,0,beginIndex + endIndex);
   }
	char[] delaydatEof88Value = fillHighValue(1);
	/**
	 *	Test condition new byte[] {(byte)0xFF} for isDelaydatEof()
	 *	@return  Returns true if isDelaydatEof() is new byte[] {(byte)0xFF}
	 */
   public boolean isDelaydatEof() throws CFException {
      return (  compareChars( getDelaydatEofSw() , delaydatEof88Value)  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xFF}
	*/
   	public void setDelaydatEofTrue() {  			
    	setDelaydatEofSw( delaydatEof88Value);
   	}
	char[] delaydatNof88Value = fillLowValue(1);
	/**
	 *	Test condition new byte[] {(byte)0x00} for isDelaydatNof()
	 *	@return  Returns true if isDelaydatNof() is new byte[] {(byte)0x00}
	 */
   public boolean isDelaydatNof() throws CFException {
      return (  compareChars( getDelaydatEofSw() , delaydatNof88Value)  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00}
	*/
   	public void setDelaydatNofTrue() {  			
    	setDelaydatEofSw( delaydatNof88Value);
   	}
	/**
	 *	Returns the value of readDelaydatSw
	 *	@return readDelaydatSw
	 */
   public char[] getReadDelaydatSw() throws CFException{
   		return readDelaydatSw;
   }

  
	/**
	*  set variable readDelaydatSw
	*  Corresponding COBOL Variable is WS-READ-DELAYDAT-SW
	*  @param value
	**/
   public void setReadDelaydatSw(char[] value) {
       value = checkReadDelaydatSwConstraints(value);
       arraycopy(value,0,readDelaydatSw,0,value.length);
   } 
	public void setReadDelaydatSw(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,readDelaydatSw,0,beginIndex + endIndex);
   }
	char[] stopReadDelaydat88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isStopReadDelaydat()
	 *	@return  Returns true if isStopReadDelaydat() is "Y"
	 */
   public boolean isStopReadDelaydat() throws CFException {
      return (  compareChars( getReadDelaydatSw() , stopReadDelaydat88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setStopReadDelaydatTrue() {  			
    	setReadDelaydatSw( stopReadDelaydat88Value);
   	}
	char[] strtReadDelaydat88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isStrtReadDelaydat()
	 *	@return  Returns true if isStrtReadDelaydat() is "N"
	 */
   public boolean isStrtReadDelaydat() throws CFException {
      return (  compareChars( getReadDelaydatSw() , strtReadDelaydat88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setStrtReadDelaydatTrue() {  			
    	setReadDelaydatSw( strtReadDelaydat88Value);
   	}
	/**
	 *	Returns the value of billku00CustIdNo
	 *	@return billku00CustIdNo
	 */
	public int getBillku00CustIdNo() throws CFException {
   		return billku00CustIdNo;
	}
	
	/**
	 * 	Update Billku00CustIdNo with the passed value
	 *  Corresponding COBOL Variable is BILLKU00-CUST-ID-NO
	 *	@param number
	 */
	public void setBillku00CustIdNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    billku00CustIdNo = checkBillku00CustIdNoMaxLimit(number); 
	}


	public void setBillku00CustIdNo(long number) {
	    number = checkBillku00CustIdNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBillku00CustIdNo((int)number);
	}
	
	/**
	 *	Returns the value of billku00Mtn
	 *	@return billku00Mtn
	 */
   public char[] getBillku00Mtn() throws CFException{
   		return billku00Mtn;
   }

  
	/**
	*  set variable billku00Mtn
	*  Corresponding COBOL Variable is BILLKU00-MTN
	*  @param value
	**/
   public void setBillku00Mtn(char[] value) {
       value = checkBillku00MtnConstraints(value);
       arraycopy(value,0,billku00Mtn,0,value.length);
   } 
	public void setBillku00Mtn(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,billku00Mtn,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of x4
	 *	@return x4
	 */
   public char[] getX4() throws CFException{
   		return x4;
   }

  
	/**
	*  set variable x4
	*  Corresponding COBOL Variable is WS-X-4
	*  @param value
	**/
   public void setX4(char[] value) {
       value = checkX4Constraints(value);
       arraycopy(value,0,x4,0,value.length);
   } 
	public void setX4(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,x4,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of x3
	 *	@return x3
	 */
   public char[] getX3() throws CFException{
   		return x3;
   }

  
	/**
	*  set variable x3
	*  Corresponding COBOL Variable is WS-X-3
	*  @param value
	**/
   public void setX3(char[] value) {
       value = checkX3Constraints(value);
       arraycopy(value,0,x3,0,value.length);
   } 
	public void setX3(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,x3,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of batchId
	 *	@return batchId
	 */
   public char[] getBatchId() throws CFException{
   		return batchId;
   }

  
	/**
	*  set variable batchId
	*  Corresponding COBOL Variable is WS-BATCH-ID
	*  @param value
	**/
   public void setBatchId(char[] value) {
       value = checkBatchIdConstraints(value);
       arraycopy(value,0,batchId,0,value.length);
   } 
	public void setBatchId(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,batchId,0,beginIndex + endIndex);
   }
	public int getOinGeoCd() throws CFException {
        if (isOinGeoCdModified()) { 
           oinGeoCd = refreshOinGeoCd();
        }
   		return oinGeoCd;
	}
	
	/**
	 * 	Update OinGeoCd with the passed value
	 *  Corresponding COBOL Variable is OIN-GEO-CD
	 *	@param number
	 */
	public void setOinGeoCd(int number) {
			oinGeoCd = checkOinGeoCdMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeOinGeoCd(oinGeoCd);
	}


	public void setOinGeoCd(long number) {
	    number = checkOinGeoCdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setOinGeoCd((int)number);
	}
	
	/**
	 *	Returns the value of tranCode
	 *	@return tranCode
	 */
   public char[] getTranCode() throws CFException{
   		return tranCode;
   }

  
	/**
	*  set variable tranCode
	*  Corresponding COBOL Variable is WS-TRAN-CODE
	*  @param value
	**/
   public void setTranCode(char[] value) {
       value = checkTranCodeConstraints(value);
       arraycopy(value,0,tranCode,0,value.length);
   } 
	public void setTranCode(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tranCode,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of parmState
	 *	@return parmState
	 */
   public char[] getParmState() throws CFException{
   		return parmState;
   }

  
	/**
	*  set variable parmState
	*  Corresponding COBOL Variable is PARM-STATE
	*  @param value
	**/
   public void setParmState(char[] value) {
       value = checkParmStateConstraints(value);
       arraycopy(value,0,parmState,0,value.length);
   } 
	public void setParmState(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,parmState,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of parmTyperun
	 *	@return parmTyperun
	 */
   public char[] getParmTyperun() throws CFException{
   		return parmTyperun;
   }

  
	/**
	*  set variable parmTyperun
	*  Corresponding COBOL Variable is PARM-TYPERUN
	*  @param value
	**/
   public void setParmTyperun(char[] value) {
       value = checkParmTyperunConstraints(value);
       arraycopy(value,0,parmTyperun,0,value.length);
   } 
	public void setParmTyperun(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,parmTyperun,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of parmRao
	 *	@return parmRao
	 */
   public char[] getParmRao() throws CFException{
   		return parmRao;
   }

  
	/**
	*  set variable parmRao
	*  Corresponding COBOL Variable is PARM-RAO
	*  @param value
	**/
   public void setParmRao(char[] value) {
       value = checkParmRaoConstraints(value);
       arraycopy(value,0,parmRao,0,value.length);
   } 
	public void setParmRao(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,parmRao,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
