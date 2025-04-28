package com.cloudframe.app.numeric0.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:53. using version 5.0.0.256
**/


import com.cloudframe.app.numeric0.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class Work extends WorkSerialized { 
   

						private char[] acctHbEqupSurchageOcc06 = Field.fillLowValue(28);

								private BigDecimal numDisp1 = BigDecimal.ZERO;

								private BigDecimal numDec1 = BigDecimal.ZERO;

								private long int1;

								private int short1;

								private long long1;

								private BigDecimal numDisp2 = BigDecimal.ZERO;

								private BigDecimal numDec2 = BigDecimal.ZERO;

								private long int2;

								private int short2;

								private long long2;

								private BigDecimal totAmt = BigDecimal.ZERO;

								private BigDecimal v9297 = BigDecimal.ZERO;

								private BigDecimal v9299 = BigDecimal.ZERO;

								private long comp918;

								private long comp3918;

								private BigDecimal v93Comp399 = BigDecimal.ZERO;

								private char[] dispPerUnitRate = Field.fillLowValue(15);

						private char[] rlu7jPerUnitRate = Field.fillLowValue(15);

								private BigDecimal v9399 = BigDecimal.ZERO;

								private BigDecimal v93915 = BigDecimal.ZERO;

								private short count;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setTotAmt(BigDecimal.ZERO);
								setV93915(BigDecimal.ZERO);
    }


 

	/**
	 *	Returns the value of acctHbEqupSurchageOcc06
	 *	@return acctHbEqupSurchageOcc06
	 */
   public char[] getAcctHbEqupSurchageOcc06() throws CFException{
   		return acctHbEqupSurchageOcc06;
   }

  
	/**
	*  set variable acctHbEqupSurchageOcc06
	*  Corresponding COBOL Variable is ACCT-HB-EQUP-SURCHAGE-OCC-06
	*  @param value
	**/
   public void setAcctHbEqupSurchageOcc06(char[] value) {
       value = checkAcctHbEqupSurchageOcc06Constraints(value);
       arraycopy(value,0,acctHbEqupSurchageOcc06,0,value.length);
   } 
	public void setAcctHbEqupSurchageOcc06(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,acctHbEqupSurchageOcc06,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of numDisp1
	 *	@return numDisp1
	 */
	public BigDecimal getNumDisp1() throws CFException {
       if (isNumDisp1Modified()) { 
           numDisp1 = refreshNumDisp1();
        }
   		return numDisp1;
	}
	

	
	   
	/**
	 * 	Update NumDisp1 with the passed number
	 *  Corresponding COBOL Variable is NUM-DISP-1
	 *	@param number
	 */
	public void setNumDisp1(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       numDisp1 = checkNumDisp1MaxLimit(number);
	    serializeNumDisp1(numDisp1);
   }
	/**
	 * 	Update NumDisp1 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNumDisp1(char[] value) throws CFException {
		 numDisp1 = serializeNumDisp1(value);
	}   
	public BigDecimal getNumDec1() throws CFException {
        if (isNumDec1Modified()) { 
           numDec1 = refreshNumDec1();
        }
   		return numDec1;
	}

    public char[] getNumDec1String() {
          return  numDec1String();
    }
	
	/**
	 * 	Update NumDec1 with the passed number
	 *  Corresponding COBOL Variable is NUM-DEC-1
	 *	@param number
	 */
	public void setNumDec1(BigDecimal number) {	
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
     numDec1 = checkNumDec1MaxLimit(number);
	    serializeNumDec1(numDec1);
   }
	/**
	 *	Returns the value of int1
	 *	@return int1
	 */
	public long getInt1() throws CFException {
   		return int1;
	}
	
	/**
	 * 	Update Int1 with the passed value
	 *  Corresponding COBOL Variable is WS-INT-1
	 *	@param number
	 */
	public void setInt1(long number) {
	     // Truncate if the number is beyond +/- Max range
	    int1 = checkInt1MaxLimit(number); 
	}


	/**
	 *	Returns the value of short1
	 *	@return short1
	 */
	public int getShort1() throws CFException {
   		return short1;
	}
	
	/**
	 * 	Update Short1 with the passed value
	 *  Corresponding COBOL Variable is WS-SHORT-1
	 *	@param number
	 */
	public void setShort1(int number) {
	     // Truncate if the number is beyond +/- Max range
	    short1 = checkShort1MaxLimit(number); 
	}


	public void setShort1(long number) {
	    number = checkShort1MaxLimit(number); // Truncate if value is beyond +/- Max range
		setShort1((int)number);
	}
	
	/**
	 *	Returns the value of long1
	 *	@return long1
	 */
	public long getLong1() throws CFException {
   		return long1;
	}
	
	/**
	 * 	Update Long1 with the passed value
	 *  Corresponding COBOL Variable is WS-LONG-1
	 *	@param number
	 */
	public void setLong1(long number) {
	     // Truncate if the number is beyond +/- Max range
	    long1 = checkLong1MaxLimit(number); 
	}


	/**
	 *	Returns the value of numDisp2
	 *	@return numDisp2
	 */
	public BigDecimal getNumDisp2() throws CFException {
       if (isNumDisp2Modified()) { 
           numDisp2 = refreshNumDisp2();
        }
   		return numDisp2;
	}
	

	
	   
	/**
	 * 	Update NumDisp2 with the passed number
	 *  Corresponding COBOL Variable is NUM-DISP-2
	 *	@param number
	 */
	public void setNumDisp2(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       numDisp2 = checkNumDisp2MaxLimit(number);
	    serializeNumDisp2(numDisp2);
   }
	/**
	 * 	Update NumDisp2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNumDisp2(char[] value) throws CFException {
		 numDisp2 = serializeNumDisp2(value);
	}   
	public BigDecimal getNumDec2() throws CFException {
        if (isNumDec2Modified()) { 
           numDec2 = refreshNumDec2();
        }
   		return numDec2;
	}

    public char[] getNumDec2String() {
          return  numDec2String();
    }
	
	/**
	 * 	Update NumDec2 with the passed number
	 *  Corresponding COBOL Variable is NUM-DEC-2
	 *	@param number
	 */
	public void setNumDec2(BigDecimal number) {	
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
     numDec2 = checkNumDec2MaxLimit(number);
	    serializeNumDec2(numDec2);
   }
	/**
	 *	Returns the value of int2
	 *	@return int2
	 */
	public long getInt2() throws CFException {
   		return int2;
	}
	
	/**
	 * 	Update Int2 with the passed value
	 *  Corresponding COBOL Variable is WS-INT-2
	 *	@param number
	 */
	public void setInt2(long number) {
	     // Truncate if the number is beyond +/- Max range
	    int2 = checkInt2MaxLimit(number); 
	}


	/**
	 *	Returns the value of short2
	 *	@return short2
	 */
	public int getShort2() throws CFException {
   		return short2;
	}
	
	/**
	 * 	Update Short2 with the passed value
	 *  Corresponding COBOL Variable is WS-SHORT-2
	 *	@param number
	 */
	public void setShort2(int number) {
	     // Truncate if the number is beyond +/- Max range
	    short2 = checkShort2MaxLimit(number); 
	}


	public void setShort2(long number) {
	    number = checkShort2MaxLimit(number); // Truncate if value is beyond +/- Max range
		setShort2((int)number);
	}
	
	/**
	 *	Returns the value of long2
	 *	@return long2
	 */
	public long getLong2() throws CFException {
   		return long2;
	}
	
	/**
	 * 	Update Long2 with the passed value
	 *  Corresponding COBOL Variable is WS-LONG-2
	 *	@param number
	 */
	public void setLong2(long number) {
	     // Truncate if the number is beyond +/- Max range
	    long2 = checkLong2MaxLimit(number); 
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
              
	public BigDecimal getV9297() throws CFException {
        if (isV9297Modified()) { 
           v9297 = refreshV9297();
        }
   		return v9297;
	}

    public char[] getV9297String() {
          return  v9297String();
    }
	
	/**
	 * 	Update V9297 with the passed number
	 *  Corresponding COBOL Variable is WS-97V92
	 *	@param number
	 */
	public void setV9297(BigDecimal number) {	
     v9297 = checkV9297MaxLimit(number);
	    serializeV9297(v9297);
   }
	public BigDecimal getV9299() throws CFException {
        if (isV9299Modified()) { 
           v9299 = refreshV9299();
        }
   		return v9299;
	}

    public char[] getV9299String() {
          return  v9299String();
    }
	
	/**
	 * 	Update V9299 with the passed number
	 *  Corresponding COBOL Variable is WS-99V92
	 *	@param number
	 */
	public void setV9299(BigDecimal number) {	
     v9299 = checkV9299MaxLimit(number);
	    serializeV9299(v9299);
   }
	/**
	 *	Returns the value of comp918
	 *	@return comp918
	 */
	public long getComp918() throws CFException {
   		return comp918;
	}
	
	/**
	 * 	Update Comp918 with the passed value
	 *  Corresponding COBOL Variable is WS-918-COMP
	 *	@param number
	 */
	public void setComp918(long number) {
	     // Truncate if the number is beyond +/- Max range
	    comp918 = checkComp918MaxLimit(number); 
	}


	public long getComp3918() throws CFException {
        if (isComp3918Modified()) { 
           comp3918 = refreshComp3918();
        }
   		return comp3918;
	}
	
	/**
	 * 	Update Comp3918 with the passed value
	 *  Corresponding COBOL Variable is WS-918-COMP3
	 *	@param number
	 */
	public void setComp3918(long number) {
			comp3918 = checkComp3918MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeComp3918(comp3918);
	}


	public BigDecimal getV93Comp399() throws CFException {
        if (isV93Comp399Modified()) { 
           v93Comp399 = refreshV93Comp399();
        }
   		return v93Comp399;
	}

    public char[] getV93Comp399String() {
          return  v93Comp399String();
    }
	
	/**
	 * 	Update V93Comp399 with the passed number
	 *  Corresponding COBOL Variable is WS-99V93-COMP3
	 *	@param number
	 */
	public void setV93Comp399(BigDecimal number) {	
     v93Comp399 = checkV93Comp399MaxLimit(number);
	    serializeV93Comp399(v93Comp399);
   }
	/**
	 *	Returns the value of dispPerUnitRate
	 *	@return dispPerUnitRate
	 */
   public char[] getDispPerUnitRate() throws CFException{
     if (isDispPerUnitRateModified()) { 
        dispPerUnitRate = refreshDispPerUnitRate();
     }
   		return dispPerUnitRate;
   }

  
	/**
	*  set variable dispPerUnitRate
	*  Corresponding COBOL Variable is DISP-PER-UNIT-RATE
	*  @param value
	**/
   public void setDispPerUnitRate(char[] value) {
      dispPerUnitRate = checkDispPerUnitRateConstraints(value);
      serializeDispPerUnitRate(dispPerUnitRate);
   } 

     /**
	 * 	Update DispPerUnitRate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDispPerUnitRate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDispPerUnitRate,dispPerUnitRate.length);
   	
   }
   
   public void setDispPerUnitRate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDispPerUnitRate,dispPerUnitRate.length);
   	
   }
   
     /**
	 * 	Update DispPerUnitRate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDispPerUnitRate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDispPerUnitRate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DispPerUnitRate with another Field
	 *	@param value
	 */
   public void setDispPerUnitRate(Field source) {
       replace(source,0,source.length(),beginDispPerUnitRate,DISP_PER_UNIT_RATE_LEN);
   	
   }  
   
     /**
	 * 	Update DispPerUnitRate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDispPerUnitRate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDispPerUnitRate,DISP_PER_UNIT_RATE_LEN);
   	
   }
   
     /**
	 * 	Update DispPerUnitRate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDispPerUnitRate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDispPerUnitRate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rlu7jPerUnitRate
	 *	@return rlu7jPerUnitRate
	 */
   public char[] getRlu7jPerUnitRate() throws CFException{
   		return rlu7jPerUnitRate;
   }

  
	/**
	*  set variable rlu7jPerUnitRate
	*  Corresponding COBOL Variable is RLU7J-PER-UNIT-RATE
	*  @param value
	**/
   public void setRlu7jPerUnitRate(char[] value) {
       value = checkRlu7jPerUnitRateConstraints(value);
       arraycopy(value,0,rlu7jPerUnitRate,0,value.length);
   } 
	public void setRlu7jPerUnitRate(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rlu7jPerUnitRate,0,beginIndex + endIndex);
   }
	public BigDecimal getV9399() throws CFException {
        if (isV9399Modified()) { 
           v9399 = refreshV9399();
        }
   		return v9399;
	}

    public char[] getV9399String() {
          return  v9399String();
    }
	
	/**
	 * 	Update V9399 with the passed number
	 *  Corresponding COBOL Variable is WS-99V93
	 *	@param number
	 */
	public void setV9399(BigDecimal number) {	
     v9399 = checkV9399MaxLimit(number);
	    serializeV9399(v9399);
   }
	public BigDecimal getV93915() throws CFException {
        if (isV93915Modified()) { 
           v93915 = refreshV93915();
        }
   		return v93915;
	}

    public char[] getV93915String() {
          return  v93915String();
    }
	
	/**
	 * 	Update V93915 with the passed number
	 *  Corresponding COBOL Variable is WS-915V93
	 *	@param number
	 */
	public void setV93915(BigDecimal number) {	
     v93915 = checkV93915MaxLimit(number);
	    serializeV93915(v93915);
   }
	/**
	 *	Returns the value of count
	 *	@return count
	 */
	public short getCount() throws CFException {
   		return count;
	}
	
	/**
	 * 	Update Count with the passed value
	 *  Corresponding COBOL Variable is WS-COUNT
	 *	@param number
	 */
	public void setCount(short number) {
	     // Truncate if the number is beyond +/- Max range
	    count = checkCountMaxLimit(number); 
	}

	public void setCount(int number) {
	    number = checkCountMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCount((short)number);
	}
	public void setCount(long number) {
	    number = checkCountMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCount((short)number);
	}
	


	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
