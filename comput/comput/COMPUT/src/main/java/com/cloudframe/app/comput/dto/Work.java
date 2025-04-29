package com.cloudframe.app.comput.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:34. using version 5.0.0.254
**/


import com.cloudframe.app.comput.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;
import java.math.RoundingMode;


public class Work extends WorkSerialized {
   

								private long w03a1DiComp3;

								private int w03a1DiComp;

								private BigDecimal w03a1DiDecimal = BigDecimal.ZERO;

								private short w03a1DiSmallint;

								private int w03a1DiInt;

								private long w03a1DiBigint;

								private BigDecimal w03a1DiReal;

								private BigDecimal w03a1DiDouble;

								private long w03a1DoComp3;

								private int w03a1DoComp;

								private BigDecimal w03a1DoDecimal = BigDecimal.ZERO;

								private short w03a1DoSmallint;

								private int w03a1DoInt;

								private long w03a1DoBigint;

								private BigDecimal w03a1DoReal;

								private BigDecimal w03a1DoDouble;

								private long hvStartDt81d;

								private int intOfDt1;

								private BigDecimal tb11148AdminAmt = BigDecimal.ZERO;

								private BigDecimal totAmt = BigDecimal.ZERO;

								private BigDecimal rlu3aMtnAcAcctChgsCredits = BigDecimal.ZERO;

								private BigDecimal chrgCreditTotNotax = BigDecimal.ZERO;

								private BigDecimal w5v5A = BigDecimal.ZERO;

								private BigDecimal w5v5 = BigDecimal.ZERO;

								private BigDecimal w3v2A = BigDecimal.ZERO;

								private BigDecimal w3v2 = BigDecimal.ZERO;

								private BigDecimal w3v2Result = BigDecimal.ZERO;

								private BigDecimal pmslk402ListPrice = BigDecimal.ZERO;

								private BigDecimal wFeePromoxAmt = BigDecimal.ZERO;

								private BigDecimal wChgAmtDec5 = BigDecimal.ZERO;

								private BigDecimal wcdloLeapYear = BigDecimal.ZERO;

								private int wcdliCurYyyy;

								private BigDecimal w1 = BigDecimal.ZERO;

								private BigDecimal w2 = BigDecimal.ZERO;

								private BigDecimal w3 = BigDecimal.ZERO;

								private BigDecimal w4 = BigDecimal.ZERO;

								private int w5;

								private int ccatTitleSize;

								private int ccatCombinedSize;

								private char[] pctWoPrice = Field.fillLowValue(11);

								private BigDecimal pctWithNoPrice = BigDecimal.ZERO;

								private long recsWithoutPrice;

								private long detailRecs;

								private BigDecimal f = BigDecimal.ZERO;

								private BigDecimal a = BigDecimal.ZERO;

								private BigDecimal b = BigDecimal.ZERO;

								private BigDecimal c = BigDecimal.ZERO;

								private BigDecimal d = BigDecimal.ZERO;

								private BigDecimal e = BigDecimal.ZERO;

								private int coordinatedGeneration;

								private int reportGen;

								private int cbsumGen;

								private int omsumpvGen;

								private int omauditGen;

								private int omencfGen;

								private long decimalNo300;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIntOfDt1(0);
								setTotAmt(BigDecimal.ZERO);
								setChrgCreditTotNotax(BigDecimal.ZERO);
								setWcdloLeapYear(BigDecimal.ZERO);
								setWcdliCurYyyy(0);
								setPctWithNoPrice(BigDecimal.ZERO);
								setRecsWithoutPrice(0L);
								setDetailRecs(0L);
								setDecimalNo300(0L);
    }


 

	public long getW03a1DiComp3() throws CFException {
        if (isW03a1DiComp3Modified()) { 
           w03a1DiComp3 = refreshW03a1DiComp3();
        }
   		return w03a1DiComp3;
	}
	
	/**
	 * 	Update W03a1DiComp3 with the passed value
	 *  Corresponding COBOL Variable is W03A-1-DI-COMP3
	 *	@param number
	 */
	public void setW03a1DiComp3(long number) {
			w03a1DiComp3 = checkW03a1DiComp3MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeW03a1DiComp3(w03a1DiComp3);
	}


	/**
	 *	Returns the value of w03a1DiComp
	 *	@return w03a1DiComp
	 */
	public int getW03a1DiComp() throws CFException {
   		return w03a1DiComp;
	}
	
	/**
	 * 	Update W03a1DiComp with the passed value
	 *  Corresponding COBOL Variable is W03A-1-DI-COMP
	 *	@param number
	 */
	public void setW03a1DiComp(int number) {
	     // Truncate if the number is beyond +/- Max range
	    w03a1DiComp = checkW03a1DiCompMaxLimit(number); 
	}


	public void setW03a1DiComp(long number) {
	    number = checkW03a1DiCompMaxLimit(number); // Truncate if value is beyond +/- Max range
		setW03a1DiComp((int)number);
	}
	
	public BigDecimal getW03a1DiDecimal() throws CFException {
        if (isW03a1DiDecimalModified()) { 
           w03a1DiDecimal = refreshW03a1DiDecimal();
        }
   		return w03a1DiDecimal;
	}

    public char[] getW03a1DiDecimalString() {
          return  w03a1DiDecimalString();
    }
	
	/**
	 * 	Update W03a1DiDecimal with the passed number
	 *  Corresponding COBOL Variable is W03A-1-DI-DECIMAL
	 *	@param number
	 */
	public void setW03a1DiDecimal(BigDecimal number) {	
     w03a1DiDecimal = checkW03a1DiDecimalMaxLimit(number);
	    serializeW03a1DiDecimal(w03a1DiDecimal);
   }
	/**
	 *	Returns the value of w03a1DiSmallint
	 *	@return w03a1DiSmallint
	 */
	public short getW03a1DiSmallint() throws CFException {
   		return w03a1DiSmallint;
	}
	
	/**
	 * 	Update W03a1DiSmallint with the passed value
	 *  Corresponding COBOL Variable is W03A-1-DI-SMALLINT
	 *	@param number
	 */
	public void setW03a1DiSmallint(short number) {
	     // Truncate if the number is beyond +/- Max range
	    w03a1DiSmallint = checkW03a1DiSmallintMaxLimit(number); 
	}

	public void setW03a1DiSmallint(int number) {
	    number = checkW03a1DiSmallintMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setW03a1DiSmallint((short)number);
	}
	public void setW03a1DiSmallint(long number) {
	    number = checkW03a1DiSmallintMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setW03a1DiSmallint((short)number);
	}
	

	/**
	 *	Returns the value of w03a1DiInt
	 *	@return w03a1DiInt
	 */
	public int getW03a1DiInt() throws CFException {
   		return w03a1DiInt;
	}
	
	/**
	 * 	Update W03a1DiInt with the passed value
	 *  Corresponding COBOL Variable is W03A-1-DI-INT
	 *	@param number
	 */
	public void setW03a1DiInt(int number) {
	     // Truncate if the number is beyond +/- Max range
	    w03a1DiInt = checkW03a1DiIntMaxLimit(number); 
	}


	public void setW03a1DiInt(long number) {
	    number = checkW03a1DiIntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setW03a1DiInt((int)number);
	}
	
	/**
	 *	Returns the value of w03a1DiBigint
	 *	@return w03a1DiBigint
	 */
	public long getW03a1DiBigint() throws CFException {
   		return w03a1DiBigint;
	}
	
	/**
	 * 	Update W03a1DiBigint with the passed value
	 *  Corresponding COBOL Variable is W03A-1-DI-BIGINT
	 *	@param number
	 */
	public void setW03a1DiBigint(long number) {
	     // Truncate if the number is beyond +/- Max range
	    w03a1DiBigint = checkW03a1DiBigintMaxLimit(number); 
	}


	/**
	 *	Returns the value of w03a1DiReal
	 *	@return w03a1DiReal
	 */
   public BigDecimal getW03a1DiReal() {
	if (isW03a1DiRealModified()) {
		w03a1DiReal = refreshW03a1DiReal();
	}
   	return w03a1DiReal;
   }

  
	/**
	*  set variable w03a1DiReal
	*  @param value
	**/
   public void setW03a1DiReal(BigDecimal value) {
	setW03a1DiReal(value, true);
   } 


	/**
	 *	Update W03a1DiReal with the passed value and serialize the object if setModified is true
	 *	@param value
	 *	@param setModified
	 */
   private void setW03a1DiReal(BigDecimal value,boolean setModified) {
      w03a1DiReal = value;
      if (setModified) {
          serializeW03a1DiReal(value);
      }
   }  
	
	
	/**
	 *	Returns the value of w03a1DiDouble
	 *	@return w03a1DiDouble
	 */
   public BigDecimal getW03a1DiDouble() {
	if (isW03a1DiDoubleModified()) {
		w03a1DiDouble = refreshW03a1DiDouble();
	}
   	return w03a1DiDouble;
   }

  
	/**
	*  set variable w03a1DiDouble
	*  @param value
	**/
   public void setW03a1DiDouble(BigDecimal value) {
	setW03a1DiDouble(value, true);
   } 


	/**
	 *	Update W03a1DiDouble with the passed value and serialize the object if setModified is true
	 *	@param value
	 *	@param setModified
	 */
   private void setW03a1DiDouble(BigDecimal value,boolean setModified) {
      w03a1DiDouble = value;
      if (setModified) {
          serializeW03a1DiDouble(value);
      }
   }  
	
	
	public long getW03a1DoComp3() throws CFException {
        if (isW03a1DoComp3Modified()) { 
           w03a1DoComp3 = refreshW03a1DoComp3();
        }
   		return w03a1DoComp3;
	}
	
	/**
	 * 	Update W03a1DoComp3 with the passed value
	 *  Corresponding COBOL Variable is W03A-1-DO-COMP3
	 *	@param number
	 */
	public void setW03a1DoComp3(long number) {
			w03a1DoComp3 = checkW03a1DoComp3MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeW03a1DoComp3(w03a1DoComp3);
	}


	/**
	 *	Returns the value of w03a1DoComp
	 *	@return w03a1DoComp
	 */
	public int getW03a1DoComp() throws CFException {
   		return w03a1DoComp;
	}
	
	/**
	 * 	Update W03a1DoComp with the passed value
	 *  Corresponding COBOL Variable is W03A-1-DO-COMP
	 *	@param number
	 */
	public void setW03a1DoComp(int number) {
	     // Truncate if the number is beyond +/- Max range
	    w03a1DoComp = checkW03a1DoCompMaxLimit(number); 
	}


	public void setW03a1DoComp(long number) {
	    number = checkW03a1DoCompMaxLimit(number); // Truncate if value is beyond +/- Max range
		setW03a1DoComp((int)number);
	}
	
	public BigDecimal getW03a1DoDecimal() throws CFException {
        if (isW03a1DoDecimalModified()) { 
           w03a1DoDecimal = refreshW03a1DoDecimal();
        }
   		return w03a1DoDecimal;
	}

    public char[] getW03a1DoDecimalString() {
          return  w03a1DoDecimalString();
    }
	
	/**
	 * 	Update W03a1DoDecimal with the passed number
	 *  Corresponding COBOL Variable is W03A-1-DO-DECIMAL
	 *	@param number
	 */
	public void setW03a1DoDecimal(BigDecimal number) {	
     w03a1DoDecimal = checkW03a1DoDecimalMaxLimit(number);
	    serializeW03a1DoDecimal(w03a1DoDecimal);
   }
	/**
	 *	Returns the value of w03a1DoSmallint
	 *	@return w03a1DoSmallint
	 */
	public short getW03a1DoSmallint() throws CFException {
   		return w03a1DoSmallint;
	}
	
	/**
	 * 	Update W03a1DoSmallint with the passed value
	 *  Corresponding COBOL Variable is W03A-1-DO-SMALLINT
	 *	@param number
	 */
	public void setW03a1DoSmallint(short number) {
	     // Truncate if the number is beyond +/- Max range
	    w03a1DoSmallint = checkW03a1DoSmallintMaxLimit(number); 
	}

	public void setW03a1DoSmallint(int number) {
	    number = checkW03a1DoSmallintMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setW03a1DoSmallint((short)number);
	}
	public void setW03a1DoSmallint(long number) {
	    number = checkW03a1DoSmallintMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setW03a1DoSmallint((short)number);
	}
	

	/**
	 *	Returns the value of w03a1DoInt
	 *	@return w03a1DoInt
	 */
	public int getW03a1DoInt() throws CFException {
   		return w03a1DoInt;
	}
	
	/**
	 * 	Update W03a1DoInt with the passed value
	 *  Corresponding COBOL Variable is W03A-1-DO-INT
	 *	@param number
	 */
	public void setW03a1DoInt(int number) {
	     // Truncate if the number is beyond +/- Max range
	    w03a1DoInt = checkW03a1DoIntMaxLimit(number); 
	}


	public void setW03a1DoInt(long number) {
	    number = checkW03a1DoIntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setW03a1DoInt((int)number);
	}
	
	/**
	 *	Returns the value of w03a1DoBigint
	 *	@return w03a1DoBigint
	 */
	public long getW03a1DoBigint() throws CFException {
   		return w03a1DoBigint;
	}
	
	/**
	 * 	Update W03a1DoBigint with the passed value
	 *  Corresponding COBOL Variable is W03A-1-DO-BIGINT
	 *	@param number
	 */
	public void setW03a1DoBigint(long number) {
	     // Truncate if the number is beyond +/- Max range
	    w03a1DoBigint = checkW03a1DoBigintMaxLimit(number); 
	}


	/**
	 *	Returns the value of w03a1DoReal
	 *	@return w03a1DoReal
	 */
   public BigDecimal getW03a1DoReal() {
	if (isW03a1DoRealModified()) {
		w03a1DoReal = refreshW03a1DoReal();
	}
   	return w03a1DoReal;
   }

  
	/**
	*  set variable w03a1DoReal
	*  @param value
	**/
   public void setW03a1DoReal(BigDecimal value) {
	setW03a1DoReal(value, true);
   } 


	/**
	 *	Update W03a1DoReal with the passed value and serialize the object if setModified is true
	 *	@param value
	 *	@param setModified
	 */
   private void setW03a1DoReal(BigDecimal value,boolean setModified) {
      w03a1DoReal = value;
      if (setModified) {
          serializeW03a1DoReal(value);
      }
   }  
	
	
	/**
	 *	Returns the value of w03a1DoDouble
	 *	@return w03a1DoDouble
	 */
   public BigDecimal getW03a1DoDouble() {
	if (isW03a1DoDoubleModified()) {
		w03a1DoDouble = refreshW03a1DoDouble();
	}
   	return w03a1DoDouble;
   }

  
	/**
	*  set variable w03a1DoDouble
	*  @param value
	**/
   public void setW03a1DoDouble(BigDecimal value) {
	setW03a1DoDouble(value, true);
   } 


	/**
	 *	Update W03a1DoDouble with the passed value and serialize the object if setModified is true
	 *	@param value
	 *	@param setModified
	 */
   private void setW03a1DoDouble(BigDecimal value,boolean setModified) {
      w03a1DoDouble = value;
      if (setModified) {
          serializeW03a1DoDouble(value);
      }
   }  
	
	
	/**
	 *	Returns the value of hvStartDt81d
	 *	@return hvStartDt81d
	 */
	public long getHvStartDt81d() throws CFException {
       if (isHvStartDt81dModified()) { 
           hvStartDt81d = refreshHvStartDt81d();
        }
   		return hvStartDt81d;
	}
	

	
	   
	/**
	 * 	Update HvStartDt81d with the passed value
	 *  Corresponding COBOL Variable is HV-START-DT8-1D
	 *	@param number
	 */
	public void setHvStartDt81d(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    hvStartDt81d = checkHvStartDt81dMaxLimit(number); 
		serializeHvStartDt81d(hvStartDt81d);
	}
	

	/**
	 * 	Update HvStartDt81d with the passed value
	 *	@param value (String or char[])
	 */
	public void setHvStartDt81d(char[] value) throws CFException {
		 hvStartDt81d = serializeHvStartDt81d(value);
	}
	/**
	 * 	Update HvStartDt81d with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setHvStartDt81dString(char[] value) throws CFException {
		 setHvStartDt81d(value);
	}
	public int getIntOfDt1() throws CFException {
        if (isIntOfDt1Modified()) { 
           intOfDt1 = refreshIntOfDt1();
        }
   		return intOfDt1;
	}
	
	/**
	 * 	Update IntOfDt1 with the passed value
	 *  Corresponding COBOL Variable is WS-INT-OF-DT-1
	 *	@param number
	 */
	public void setIntOfDt1(int number) {
			intOfDt1 = checkIntOfDt1MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeIntOfDt1(intOfDt1);
	}


	public void setIntOfDt1(long number) {
	    number = checkIntOfDt1MaxLimit(number); // Truncate if value is beyond +/- Max range
		setIntOfDt1((int)number);
	}
	
	public BigDecimal getTb11148AdminAmt() throws CFException {
        if (isTb11148AdminAmtModified()) { 
           tb11148AdminAmt = refreshTb11148AdminAmt();
        }
   		return tb11148AdminAmt;
	}

    public char[] getTb11148AdminAmtString() {
          return  tb11148AdminAmtString();
    }
	
	/**
	 * 	Update Tb11148AdminAmt with the passed number
	 *  Corresponding COBOL Variable is TB11148-ADMIN-AMT
	 *	@param number
	 */
	public void setTb11148AdminAmt(BigDecimal number) {	
     tb11148AdminAmt = checkTb11148AdminAmtMaxLimit(number);
	    serializeTb11148AdminAmt(tb11148AdminAmt);
   }
	/**
	 *	Returns the value of totAmt
	 *	@return totAmt
	 */
	public BigDecimal getTotAmt() throws CFException {
   		return totAmt;
	}
	
	
	/**
	 * 	Update TotAmt with the passed value
	 *  Corresponding COBOL Variable is WS-TOT-AMT
	 *	@param number
	 */
	public void setTotAmt(BigDecimal number) {
		totAmt = number.setScale(2,RoundingMode.DOWN);
   }
              
	public BigDecimal getRlu3aMtnAcAcctChgsCredits() throws CFException {
        if (isRlu3aMtnAcAcctChgsCreditsModified()) { 
           rlu3aMtnAcAcctChgsCredits = refreshRlu3aMtnAcAcctChgsCredits();
        }
   		return rlu3aMtnAcAcctChgsCredits;
	}

    public char[] getRlu3aMtnAcAcctChgsCreditsString() {
          return  rlu3aMtnAcAcctChgsCreditsString();
    }
	
	/**
	 * 	Update Rlu3aMtnAcAcctChgsCredits with the passed number
	 *  Corresponding COBOL Variable is RLU3A-MTN-AC-ACCT-CHGS-CREDITS
	 *	@param number
	 */
	public void setRlu3aMtnAcAcctChgsCredits(BigDecimal number) {	
     rlu3aMtnAcAcctChgsCredits = checkRlu3aMtnAcAcctChgsCreditsMaxLimit(number);
	    serializeRlu3aMtnAcAcctChgsCredits(rlu3aMtnAcAcctChgsCredits);
   }
	public BigDecimal getChrgCreditTotNotax() throws CFException {
        if (isChrgCreditTotNotaxModified()) { 
           chrgCreditTotNotax = refreshChrgCreditTotNotax();
        }
   		return chrgCreditTotNotax;
	}

    public char[] getChrgCreditTotNotaxString() {
          return  chrgCreditTotNotaxString();
    }
	
	/**
	 * 	Update ChrgCreditTotNotax with the passed number
	 *  Corresponding COBOL Variable is WS-CHRG-CREDIT-TOT-NOTAX
	 *	@param number
	 */
	public void setChrgCreditTotNotax(BigDecimal number) {	
     chrgCreditTotNotax = checkChrgCreditTotNotaxMaxLimit(number);
	    serializeChrgCreditTotNotax(chrgCreditTotNotax);
   }
	/**
	 *	Returns the value of w5v5A
	 *	@return w5v5A
	 */
	public BigDecimal getW5v5A() throws CFException {
       if (isW5v5AModified()) { 
           w5v5A = refreshW5v5A();
        }
   		return w5v5A;
	}
	

	
	   
	/**
	 * 	Update W5v5A with the passed number
	 *  Corresponding COBOL Variable is W-5V5-A
	 *	@param number
	 */
	public void setW5v5A(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       w5v5A = checkW5v5AMaxLimit(number);
	    serializeW5v5A(w5v5A);
   }
	/**
	 * 	Update W5v5A with the passed value
	 *	@param value (String or char[])
	 */
	public void setW5v5A(char[] value) throws CFException {
		 w5v5A = serializeW5v5A(value);
	}   
	/**
	 *	Returns the value of w5v5
	 *	@return w5v5
	 */
	public BigDecimal getW5v5() throws CFException {
       if (isW5v5Modified()) { 
           w5v5 = refreshW5v5();
        }
   		return w5v5;
	}
	

	
	   
	/**
	 * 	Update W5v5 with the passed number
	 *  Corresponding COBOL Variable is W-5V5
	 *	@param number
	 */
	public void setW5v5(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       w5v5 = checkW5v5MaxLimit(number);
	    serializeW5v5(w5v5);
   }
	/**
	 * 	Update W5v5 with the passed value
	 *	@param value (String or char[])
	 */
	public void setW5v5(char[] value) throws CFException {
		 w5v5 = serializeW5v5(value);
	}   
	/**
	 *	Returns the value of w3v2A
	 *	@return w3v2A
	 */
	public BigDecimal getW3v2A() throws CFException {
       if (isW3v2AModified()) { 
           w3v2A = refreshW3v2A();
        }
   		return w3v2A;
	}
	

	
	   
	/**
	 * 	Update W3v2A with the passed number
	 *  Corresponding COBOL Variable is W-3V2-A
	 *	@param number
	 */
	public void setW3v2A(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       w3v2A = checkW3v2AMaxLimit(number);
	    serializeW3v2A(w3v2A);
   }
	/**
	 * 	Update W3v2A with the passed value
	 *	@param value (String or char[])
	 */
	public void setW3v2A(char[] value) throws CFException {
		 w3v2A = serializeW3v2A(value);
	}   
	/**
	 *	Returns the value of w3v2
	 *	@return w3v2
	 */
	public BigDecimal getW3v2() throws CFException {
       if (isW3v2Modified()) { 
           w3v2 = refreshW3v2();
        }
   		return w3v2;
	}
	

	
	   
	/**
	 * 	Update W3v2 with the passed number
	 *  Corresponding COBOL Variable is W-3V2
	 *	@param number
	 */
	public void setW3v2(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       w3v2 = checkW3v2MaxLimit(number);
	    serializeW3v2(w3v2);
   }
	/**
	 * 	Update W3v2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setW3v2(char[] value) throws CFException {
		 w3v2 = serializeW3v2(value);
	}   
	/**
	 *	Returns the value of w3v2Result
	 *	@return w3v2Result
	 */
	public BigDecimal getW3v2Result() throws CFException {
       if (isW3v2ResultModified()) { 
           w3v2Result = refreshW3v2Result();
        }
   		return w3v2Result;
	}
	

	
	   
	/**
	 * 	Update W3v2Result with the passed number
	 *  Corresponding COBOL Variable is W-3V2-RESULT
	 *	@param number
	 */
	public void setW3v2Result(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       w3v2Result = checkW3v2ResultMaxLimit(number);
	    serializeW3v2Result(w3v2Result);
   }
	/**
	 * 	Update W3v2Result with the passed value
	 *	@param value (String or char[])
	 */
	public void setW3v2Result(char[] value) throws CFException {
		 w3v2Result = serializeW3v2Result(value);
	}   
	public BigDecimal getPmslk402ListPrice() throws CFException {
        if (isPmslk402ListPriceModified()) { 
           pmslk402ListPrice = refreshPmslk402ListPrice();
        }
   		return pmslk402ListPrice;
	}

    public char[] getPmslk402ListPriceString() {
          return  pmslk402ListPriceString();
    }
	
	/**
	 * 	Update Pmslk402ListPrice with the passed number
	 *  Corresponding COBOL Variable is PMSLK402-LIST-PRICE
	 *	@param number
	 */
	public void setPmslk402ListPrice(BigDecimal number) {	
     pmslk402ListPrice = checkPmslk402ListPriceMaxLimit(number);
	    serializePmslk402ListPrice(pmslk402ListPrice);
   }
	public BigDecimal getWFeePromoxAmt() throws CFException {
        if (isWFeePromoxAmtModified()) { 
           wFeePromoxAmt = refreshWFeePromoxAmt();
        }
   		return wFeePromoxAmt;
	}

    public char[] getWFeePromoxAmtString() {
          return  wFeePromoxAmtString();
    }
	
	/**
	 * 	Update WFeePromoxAmt with the passed number
	 *  Corresponding COBOL Variable is W-FEE-PROMOX-AMT
	 *	@param number
	 */
	public void setWFeePromoxAmt(BigDecimal number) {	
     wFeePromoxAmt = checkWFeePromoxAmtMaxLimit(number);
	    serializeWFeePromoxAmt(wFeePromoxAmt);
   }
	public BigDecimal getWChgAmtDec5() throws CFException {
        if (isWChgAmtDec5Modified()) { 
           wChgAmtDec5 = refreshWChgAmtDec5();
        }
   		return wChgAmtDec5;
	}

    public char[] getWChgAmtDec5String() {
          return  wChgAmtDec5String();
    }
	
	/**
	 * 	Update WChgAmtDec5 with the passed number
	 *  Corresponding COBOL Variable is W-CHG-AMT-DEC5
	 *	@param number
	 */
	public void setWChgAmtDec5(BigDecimal number) {	
     wChgAmtDec5 = checkWChgAmtDec5MaxLimit(number);
	    serializeWChgAmtDec5(wChgAmtDec5);
   }
	/**
	 *	Returns the value of wcdloLeapYear
	 *	@return wcdloLeapYear
	 */
	public BigDecimal getWcdloLeapYear() throws CFException {
       if (isWcdloLeapYearModified()) { 
           wcdloLeapYear = refreshWcdloLeapYear();
        }
   		return wcdloLeapYear;
	}
	

	
	   
	/**
	 * 	Update WcdloLeapYear with the passed number
	 *  Corresponding COBOL Variable is WCDLO-LEAP-YEAR
	 *	@param number
	 */
	public void setWcdloLeapYear(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       wcdloLeapYear = checkWcdloLeapYearMaxLimit(number);
	    serializeWcdloLeapYear(wcdloLeapYear);
   }
	/**
	 * 	Update WcdloLeapYear with the passed value
	 *	@param value (String or char[])
	 */
	public void setWcdloLeapYear(char[] value) throws CFException {
		 wcdloLeapYear = serializeWcdloLeapYear(value);
	}   
	/**
	 *	Returns the value of wcdliCurYyyy
	 *	@return wcdliCurYyyy
	 */
	public int getWcdliCurYyyy() throws CFException {
       if (isWcdliCurYyyyModified()) { 
           wcdliCurYyyy = refreshWcdliCurYyyy();
        }
   		return wcdliCurYyyy;
	}
	

	
	   
	/**
	 * 	Update WcdliCurYyyy with the passed value
	 *  Corresponding COBOL Variable is WCDLI-CUR-YYYY
	 *	@param number
	 */
	public void setWcdliCurYyyy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wcdliCurYyyy = checkWcdliCurYyyyMaxLimit(number); 
		serializeWcdliCurYyyy(wcdliCurYyyy);
	}
	

	public void setWcdliCurYyyy(long number) {
	    number = checkWcdliCurYyyyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWcdliCurYyyy((int)number);
	}
	
	/**
	 * 	Update WcdliCurYyyy with the passed value
	 *	@param value (String or char[])
	 */
	public void setWcdliCurYyyy(char[] value) throws CFException {
		 wcdliCurYyyy = serializeWcdliCurYyyy(value);
	}
	/**
	 * 	Update WcdliCurYyyy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWcdliCurYyyyString(char[] value) throws CFException {
		 setWcdliCurYyyy(value);
	}
	/**
	 *	Returns the value of w1
	 *	@return w1
	 */
	public BigDecimal getW1() throws CFException {
   		return w1;
	}
	
	
	/**
	 * 	Update W1 with the passed value
	 *  Corresponding COBOL Variable is W1
	 *	@param number
	 */
	public void setW1(BigDecimal number) {
		w1 = number.setScale(4,RoundingMode.DOWN);
   }
              
	/**
	 *	Returns the value of w2
	 *	@return w2
	 */
	public BigDecimal getW2() throws CFException {
   		return w2;
	}
	
	
	/**
	 * 	Update W2 with the passed value
	 *  Corresponding COBOL Variable is W2
	 *	@param number
	 */
	public void setW2(BigDecimal number) {
		w2 = number.setScale(2,RoundingMode.DOWN);
   }
              
	/**
	 *	Returns the value of w3
	 *	@return w3
	 */
	public BigDecimal getW3() throws CFException {
   		return w3;
	}
	
	
	/**
	 * 	Update W3 with the passed value
	 *  Corresponding COBOL Variable is W3
	 *	@param number
	 */
	public void setW3(BigDecimal number) {
		w3 = number.setScale(5,RoundingMode.DOWN);
   }
              
	/**
	 *	Returns the value of w4
	 *	@return w4
	 */
	public BigDecimal getW4() throws CFException {
   		return w4;
	}
	
	
	/**
	 * 	Update W4 with the passed value
	 *  Corresponding COBOL Variable is W4
	 *	@param number
	 */
	public void setW4(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
		w4 = number.setScale(2,RoundingMode.DOWN);
   }
              
	/**
	 *	Returns the value of w5
	 *	@return w5
	 */
	public int getW5() throws CFException {
   		return w5;
	}
	
	/**
	 * 	Update W5 with the passed value
	 *  Corresponding COBOL Variable is W5
	 *	@param number
	 */
	public void setW5(int number) {
	     // Truncate if the number is beyond +/- Max range
	    w5 = checkW5MaxLimit(number); 
	}


	public void setW5(long number) {
	    number = checkW5MaxLimit(number); // Truncate if value is beyond +/- Max range
		setW5((int)number);
	}
	
	/**
	 *	Returns the value of ccatTitleSize
	 *	@return ccatTitleSize
	 */
	public int getCcatTitleSize() throws CFException {
   		return ccatTitleSize;
	}
	
	/**
	 * 	Update CcatTitleSize with the passed value
	 *  Corresponding COBOL Variable is CCAT-TITLE-SIZE
	 *	@param number
	 */
	public void setCcatTitleSize(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ccatTitleSize = checkCcatTitleSizeMaxLimit(number); 
	}


	public void setCcatTitleSize(long number) {
	    number = checkCcatTitleSizeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCcatTitleSize((int)number);
	}
	
	/**
	 *	Returns the value of ccatCombinedSize
	 *	@return ccatCombinedSize
	 */
	public int getCcatCombinedSize() throws CFException {
   		return ccatCombinedSize;
	}
	
	/**
	 * 	Update CcatCombinedSize with the passed value
	 *  Corresponding COBOL Variable is CCAT-COMBINED-SIZE
	 *	@param number
	 */
	public void setCcatCombinedSize(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ccatCombinedSize = checkCcatCombinedSizeMaxLimit(number); 
	}


	public void setCcatCombinedSize(long number) {
	    number = checkCcatCombinedSizeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCcatCombinedSize((int)number);
	}
	
	/**
	 *	Returns the value of pctWoPrice
	 *	@return pctWoPrice
	 */
   public char[] getPctWoPrice() throws CFException{
     if (isPctWoPriceModified()) { 
        pctWoPrice = refreshPctWoPrice();
     }
   		return pctWoPrice;
   }

  
	/**
	*  set variable pctWoPrice
	*  Corresponding COBOL Variable is WS-PCT-WO-PRICE
	*  @param value
	**/
   public void setPctWoPrice(char[] value) {
      pctWoPrice = checkPctWoPriceConstraints(value);
      serializePctWoPrice(pctWoPrice);
   } 

     /**
	 * 	Update PctWoPrice 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPctWoPrice(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPctWoPrice,pctWoPrice.length);
   	
   }
   
   public void setPctWoPrice(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPctWoPrice,pctWoPrice.length);
   	
   }
   
     /**
	 * 	Update PctWoPrice 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPctWoPrice(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPctWoPrice+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PctWoPrice with another Field
	 *	@param value
	 */
   public void setPctWoPrice(Field source) {
       replace(source,0,source.length(),beginPctWoPrice,PCT_WO_PRICE_LEN);
   	
   }  
   
     /**
	 * 	Update PctWoPrice 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPctWoPrice(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPctWoPrice,PCT_WO_PRICE_LEN);
   	
   }
   
     /**
	 * 	Update PctWoPrice 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPctWoPrice(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPctWoPrice+targetIndex,targetLen);
    
   }
	public BigDecimal getPctWithNoPrice() throws CFException {
        if (isPctWithNoPriceModified()) { 
           pctWithNoPrice = refreshPctWithNoPrice();
        }
   		return pctWithNoPrice;
	}

    public char[] getPctWithNoPriceString() {
          return  pctWithNoPriceString();
    }
	
	/**
	 * 	Update PctWithNoPrice with the passed number
	 *  Corresponding COBOL Variable is WS-PCT-WITH-NO-PRICE
	 *	@param number
	 */
	public void setPctWithNoPrice(BigDecimal number) {	
     pctWithNoPrice = checkPctWithNoPriceMaxLimit(number);
	    serializePctWithNoPrice(pctWithNoPrice);
   }
	public long getRecsWithoutPrice() throws CFException {
        if (isRecsWithoutPriceModified()) { 
           recsWithoutPrice = refreshRecsWithoutPrice();
        }
   		return recsWithoutPrice;
	}
	
	/**
	 * 	Update RecsWithoutPrice with the passed value
	 *  Corresponding COBOL Variable is WS-RECS-WITHOUT-PRICE
	 *	@param number
	 */
	public void setRecsWithoutPrice(long number) {
			recsWithoutPrice = checkRecsWithoutPriceMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeRecsWithoutPrice(recsWithoutPrice);
	}


	public long getDetailRecs() throws CFException {
        if (isDetailRecsModified()) { 
           detailRecs = refreshDetailRecs();
        }
   		return detailRecs;
	}
	
	/**
	 * 	Update DetailRecs with the passed value
	 *  Corresponding COBOL Variable is WS-DETAIL-RECS
	 *	@param number
	 */
	public void setDetailRecs(long number) {
			detailRecs = checkDetailRecsMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeDetailRecs(detailRecs);
	}


	/**
	 *	Returns the value of f
	 *	@return f
	 */
	public BigDecimal getF() throws CFException {
       if (isFModified()) { 
           f = refreshF();
        }
   		return f;
	}
	

    /**
	 *	Returns the String value of f
	 *	@return f
	 */
	public char[]  getFActualString() {
	    String value = String.valueOf(f).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update F with the passed number
	 *  Corresponding COBOL Variable is F
	 *	@param number
	 */
	public void setF(BigDecimal number) {
       f = checkFMaxLimit(number);
	    serializeF(f);
   }
	/**
	 * 	Update F with the passed value
	 *	@param value (String or char[])
	 */
	public void setF(char[] value) throws CFException {
		 f = serializeF(value);
	}   
	/**
	 *	Returns the value of a
	 *	@return a
	 */
	public BigDecimal getA() throws CFException {
       if (isAModified()) { 
           a = refreshA();
        }
   		return a;
	}
	

    /**
	 *	Returns the String value of a
	 *	@return a
	 */
	public char[]  getAActualString() {
	    String value = String.valueOf(a).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update A with the passed number
	 *  Corresponding COBOL Variable is A
	 *	@param number
	 */
	public void setA(BigDecimal number) {
       a = checkAMaxLimit(number);
	    serializeA(a);
   }
	/**
	 * 	Update A with the passed value
	 *	@param value (String or char[])
	 */
	public void setA(char[] value) throws CFException {
		 a = serializeA(value);
	}   
	public BigDecimal getB() throws CFException {
        if (isBModified()) { 
           b = refreshB();
        }
   		return b;
	}

    public char[] getBString() {
          return  bString();
    }
	
	/**
	 * 	Update B with the passed number
	 *  Corresponding COBOL Variable is B
	 *	@param number
	 */
	public void setB(BigDecimal number) {	
     b = checkBMaxLimit(number);
	    serializeB(b);
   }
	public BigDecimal getC() throws CFException {
        if (isCModified()) { 
           c = refreshC();
        }
   		return c;
	}

    public char[] getCString() {
          return  cString();
    }
	
	/**
	 * 	Update C with the passed number
	 *  Corresponding COBOL Variable is C
	 *	@param number
	 */
	public void setC(BigDecimal number) {	
     c = checkCMaxLimit(number);
	    serializeC(c);
   }
	/**
	 *	Returns the value of d
	 *	@return d
	 */
	public BigDecimal getD() throws CFException {
       if (isDModified()) { 
           d = refreshD();
        }
   		return d;
	}
	

    /**
	 *	Returns the String value of d
	 *	@return d
	 */
	public char[]  getDActualString() {
	    String value = String.valueOf(d).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update D with the passed number
	 *  Corresponding COBOL Variable is D
	 *	@param number
	 */
	public void setD(BigDecimal number) {
       d = checkDMaxLimit(number);
	    serializeD(d);
   }
	/**
	 * 	Update D with the passed value
	 *	@param value (String or char[])
	 */
	public void setD(char[] value) throws CFException {
		 d = serializeD(value);
	}   
	/**
	 *	Returns the value of e
	 *	@return e
	 */
	public BigDecimal getE() throws CFException {
       if (isEModified()) { 
           e = refreshE();
        }
   		return e;
	}
	

    /**
	 *	Returns the String value of e
	 *	@return e
	 */
	public char[]  getEActualString() {
	    String value = String.valueOf(e).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update E with the passed number
	 *  Corresponding COBOL Variable is E
	 *	@param number
	 */
	public void setE(BigDecimal number) {
       e = checkEMaxLimit(number);
	    serializeE(e);
   }
	/**
	 * 	Update E with the passed value
	 *	@param value (String or char[])
	 */
	public void setE(char[] value) throws CFException {
		 e = serializeE(value);
	}   
	/**
	 *	Returns the value of coordinatedGeneration
	 *	@return coordinatedGeneration
	 */
	public int getCoordinatedGeneration() throws CFException {
       if (isCoordinatedGenerationModified()) { 
           coordinatedGeneration = refreshCoordinatedGeneration();
        }
   		return coordinatedGeneration;
	}
	

	
	   
	/**
	 * 	Update CoordinatedGeneration with the passed value
	 *  Corresponding COBOL Variable is WS-COORDINATED-GENERATION
	 *	@param number
	 */
	public void setCoordinatedGeneration(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    coordinatedGeneration = checkCoordinatedGenerationMaxLimit(number); 
		serializeCoordinatedGeneration(coordinatedGeneration);
	}
	

	public void setCoordinatedGeneration(long number) {
	    number = checkCoordinatedGenerationMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCoordinatedGeneration((int)number);
	}
	
	/**
	 * 	Update CoordinatedGeneration with the passed value
	 *	@param value (String or char[])
	 */
	public void setCoordinatedGeneration(char[] value) throws CFException {
		 coordinatedGeneration = serializeCoordinatedGeneration(value);
	}
	/**
	 * 	Update CoordinatedGeneration with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCoordinatedGenerationString(char[] value) throws CFException {
		 setCoordinatedGeneration(value);
	}
	/**
	 *	Returns the value of reportGen
	 *	@return reportGen
	 */
	public int getReportGen() throws CFException {
       if (isReportGenModified()) { 
           reportGen = refreshReportGen();
        }
   		return reportGen;
	}
	

	
	   
	/**
	 * 	Update ReportGen with the passed value
	 *  Corresponding COBOL Variable is WS-REPORT-GEN
	 *	@param number
	 */
	public void setReportGen(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    reportGen = checkReportGenMaxLimit(number); 
		serializeReportGen(reportGen);
	}
	

	public void setReportGen(long number) {
	    number = checkReportGenMaxLimit(number); // Truncate if value is beyond +/- Max range
		setReportGen((int)number);
	}
	
	/**
	 * 	Update ReportGen with the passed value
	 *	@param value (String or char[])
	 */
	public void setReportGen(char[] value) throws CFException {
		 reportGen = serializeReportGen(value);
	}
	/**
	 * 	Update ReportGen with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setReportGenString(char[] value) throws CFException {
		 setReportGen(value);
	}
	/**
	 *	Returns the value of cbsumGen
	 *	@return cbsumGen
	 */
	public int getCbsumGen() throws CFException {
       if (isCbsumGenModified()) { 
           cbsumGen = refreshCbsumGen();
        }
   		return cbsumGen;
	}
	

	
	   
	/**
	 * 	Update CbsumGen with the passed value
	 *  Corresponding COBOL Variable is WS-CBSUM-GEN
	 *	@param number
	 */
	public void setCbsumGen(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cbsumGen = checkCbsumGenMaxLimit(number); 
		serializeCbsumGen(cbsumGen);
	}
	

	public void setCbsumGen(long number) {
	    number = checkCbsumGenMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCbsumGen((int)number);
	}
	
	/**
	 * 	Update CbsumGen with the passed value
	 *	@param value (String or char[])
	 */
	public void setCbsumGen(char[] value) throws CFException {
		 cbsumGen = serializeCbsumGen(value);
	}
	/**
	 * 	Update CbsumGen with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCbsumGenString(char[] value) throws CFException {
		 setCbsumGen(value);
	}
	/**
	 *	Returns the value of omsumpvGen
	 *	@return omsumpvGen
	 */
	public int getOmsumpvGen() throws CFException {
       if (isOmsumpvGenModified()) { 
           omsumpvGen = refreshOmsumpvGen();
        }
   		return omsumpvGen;
	}
	

	
	   
	/**
	 * 	Update OmsumpvGen with the passed value
	 *  Corresponding COBOL Variable is WS-OMSUMPV-GEN
	 *	@param number
	 */
	public void setOmsumpvGen(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    omsumpvGen = checkOmsumpvGenMaxLimit(number); 
		serializeOmsumpvGen(omsumpvGen);
	}
	

	public void setOmsumpvGen(long number) {
	    number = checkOmsumpvGenMaxLimit(number); // Truncate if value is beyond +/- Max range
		setOmsumpvGen((int)number);
	}
	
	/**
	 * 	Update OmsumpvGen with the passed value
	 *	@param value (String or char[])
	 */
	public void setOmsumpvGen(char[] value) throws CFException {
		 omsumpvGen = serializeOmsumpvGen(value);
	}
	/**
	 * 	Update OmsumpvGen with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOmsumpvGenString(char[] value) throws CFException {
		 setOmsumpvGen(value);
	}
	/**
	 *	Returns the value of omauditGen
	 *	@return omauditGen
	 */
	public int getOmauditGen() throws CFException {
       if (isOmauditGenModified()) { 
           omauditGen = refreshOmauditGen();
        }
   		return omauditGen;
	}
	

	
	   
	/**
	 * 	Update OmauditGen with the passed value
	 *  Corresponding COBOL Variable is WS-OMAUDIT-GEN
	 *	@param number
	 */
	public void setOmauditGen(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    omauditGen = checkOmauditGenMaxLimit(number); 
		serializeOmauditGen(omauditGen);
	}
	

	public void setOmauditGen(long number) {
	    number = checkOmauditGenMaxLimit(number); // Truncate if value is beyond +/- Max range
		setOmauditGen((int)number);
	}
	
	/**
	 * 	Update OmauditGen with the passed value
	 *	@param value (String or char[])
	 */
	public void setOmauditGen(char[] value) throws CFException {
		 omauditGen = serializeOmauditGen(value);
	}
	/**
	 * 	Update OmauditGen with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOmauditGenString(char[] value) throws CFException {
		 setOmauditGen(value);
	}
	/**
	 *	Returns the value of omencfGen
	 *	@return omencfGen
	 */
	public int getOmencfGen() throws CFException {
       if (isOmencfGenModified()) { 
           omencfGen = refreshOmencfGen();
        }
   		return omencfGen;
	}
	

	
	   
	/**
	 * 	Update OmencfGen with the passed value
	 *  Corresponding COBOL Variable is WS-OMENCF-GEN
	 *	@param number
	 */
	public void setOmencfGen(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    omencfGen = checkOmencfGenMaxLimit(number); 
		serializeOmencfGen(omencfGen);
	}
	

	public void setOmencfGen(long number) {
	    number = checkOmencfGenMaxLimit(number); // Truncate if value is beyond +/- Max range
		setOmencfGen((int)number);
	}
	
	/**
	 * 	Update OmencfGen with the passed value
	 *	@param value (String or char[])
	 */
	public void setOmencfGen(char[] value) throws CFException {
		 omencfGen = serializeOmencfGen(value);
	}
	/**
	 * 	Update OmencfGen with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOmencfGenString(char[] value) throws CFException {
		 setOmencfGen(value);
	}
	/**
	 *	Returns the value of decimalNo300
	 *	@return decimalNo300
	 */
	public long getDecimalNo300() throws CFException {
       if (isDecimalNo300Modified()) { 
           decimalNo300 = refreshDecimalNo300();
        }
   		return decimalNo300;
	}
	

	
	   
	/**
	 * 	Update DecimalNo300 with the passed value
	 *  Corresponding COBOL Variable is 300-DECIMAL-NO
	 *	@param number
	 */
	public void setDecimalNo300(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    decimalNo300 = checkDecimalNo300MaxLimit(number); 
		serializeDecimalNo300(decimalNo300);
	}
	

	/**
	 * 	Update DecimalNo300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDecimalNo300(char[] value) throws CFException {
		 decimalNo300 = serializeDecimalNo300(value);
	}
	/**
	 * 	Update DecimalNo300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDecimalNo300String(char[] value) throws CFException {
		 setDecimalNo300(value);
	}

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
