package com.cloudframe.app.sf326010.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:25. using version 5.0.0.254
**/


import com.cloudframe.app.sf326010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

						private char[] mipLogEofSw100 = new char[1];

								private short halfword8300;

								private short halfword13300;

								private short one300;

								private short twenty300;

						private char[] sf305120300 = new char[8];

						private char[] zLog300 = new char[1];

						private char[] charC300 = new char[1];

						private char[] charE300 = new char[1];

						private char[] charA300 = new char[1];

						private char[] charB300 = new char[1];

						private char[] charN300 = new char[1];

								private long sys001Lrecl400;

								private short sub400;

								private int assert1400;

								private int mipLogCnt400;

								private int zLogCnt400;

								private int zLogBypass400;

						private char[] execStartMsg600 = new char[64];

						private char[] currDateYyyy600 = new char[4];

						private char[] currDateMm600 = new char[2];

						private char[] currDateDd600 = new char[2];

						private char[] currTimeHh600 = new char[2];

						private char[] currTimeMm600 = new char[2];

						private char[] currTimeSs600 = new char[2];

						private char[] message6008000 = new char[62];

						private char[] message6008999 = new char[62];

						private char[] eojMessage6009400 = new char[44];

								private int tranlogTimeHh800;

								private int tranlogTimeMm800;

								private int tranlogTimeSs800;

								private int tranlogDateMm800;

								private int tranlogDateDd800;

								private int tranlogDateYy800;

								private int tranlogDateCc800;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setMipLogEofSw100(("N").toCharArray());
								setHalfword8300((short)8);
								setHalfword13300((short)13);
								setOne300((short)1);
								setTwenty300((short)20);
								setSf305120300(("SF305120").toCharArray());
								setZLog300(("Z").toCharArray());
								setCharC300(("C").toCharArray());
								setCharE300(("E").toCharArray());
								setCharA300(("A").toCharArray());
								setCharB300(("B").toCharArray());
								setCharN300(("N").toCharArray());
								setSys001Lrecl400(0L);
								setSub400((short)0);
								setAssert1400(0);
								setMipLogCnt400(0);
								setZLogCnt400(0);
								setZLogBypass400(0);
								setExecStartMsg600(pad(64,"SF326010-0001  EXTRACT Z-LOG RECORDS FROM MIP-LOG FILE".toCharArray(),' ',RIGHT_PAD));
								setCurrDateYyyy600(fillSpace(4));
								setCurrDateMm600(fillSpace(2));
								setCurrDateDd600(fillSpace(2));
								setCurrTimeHh600(fillSpace(2));
								setCurrTimeMm600(fillSpace(2));
								setCurrTimeSs600(fillSpace(2));
								setMessage6008000("SF326010-8000 ***** INPUT AND OUTPUT FILE RECORD COUNTS ******".toCharArray());
								setMessage6008999("SF326010-8999 ************** < END OF COUNTS > ***************".toCharArray());
								setEojMessage6009400(("SF326010-9999 COMPLETED SUCCESSFULLY        ").toCharArray());
								setTranlogTimeHh800(0);
								setTranlogTimeMm800(0);
								setTranlogTimeSs800(0);
								setTranlogDateMm800(0);
								setTranlogDateDd800(0);
								setTranlogDateYy800(0);
								setTranlogDateCc800(0);
    }


 

	/**
	 *	Returns the value of mipLogEofSw100
	 *	@return mipLogEofSw100
	 */
   public char[] getMipLogEofSw100() throws CFException{
   		return mipLogEofSw100;
   }

  
	/**
	*  set variable mipLogEofSw100
	*  Corresponding COBOL Variable is 100-MIP-LOG-EOF-SW
	*  @param value
	**/
   public void setMipLogEofSw100(char[] value) {
       value = checkMipLogEofSw100Constraints(value);
       arraycopy(value,0,mipLogEofSw100,0,value.length);
   } 
	public void setMipLogEofSw100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,mipLogEofSw100,0,beginIndex + endIndex);
   }
	char[] mipLogEof8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isMipLogEof88100()
	 *	@return  Returns true if isMipLogEof88100() is "Y"
	 */
   public boolean isMipLogEof88100() throws CFException {
      return (  compareChars( getMipLogEofSw100() , mipLogEof8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setMipLogEof88100True() {  			
    	setMipLogEofSw100( mipLogEof8810088Value);
   	}
	/**
	 *	Returns the value of halfword8300
	 *	@return halfword8300
	 */
	public short getHalfword8300() throws CFException {
   		return halfword8300;
	}
	
	/**
	 * 	Update Halfword8300 with the passed value
	 *  Corresponding COBOL Variable is 300-HALFWORD-8
	 *	@param number
	 */
	public void setHalfword8300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    halfword8300 = checkHalfword8300MaxLimit(number); 
	}

	public void setHalfword8300(int number) {
	    number = checkHalfword8300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setHalfword8300((short)number);
	}
	public void setHalfword8300(long number) {
	    number = checkHalfword8300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setHalfword8300((short)number);
	}
	

	/**
	 *	Returns the value of halfword13300
	 *	@return halfword13300
	 */
	public short getHalfword13300() throws CFException {
   		return halfword13300;
	}
	
	/**
	 * 	Update Halfword13300 with the passed value
	 *  Corresponding COBOL Variable is 300-HALFWORD-13
	 *	@param number
	 */
	public void setHalfword13300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    halfword13300 = checkHalfword13300MaxLimit(number); 
	}

	public void setHalfword13300(int number) {
	    number = checkHalfword13300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setHalfword13300((short)number);
	}
	public void setHalfword13300(long number) {
	    number = checkHalfword13300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setHalfword13300((short)number);
	}
	

	/**
	 *	Returns the value of one300
	 *	@return one300
	 */
	public short getOne300() throws CFException {
       if (isOne300Modified()) { 
           one300 = refreshOne300();
        }
   		return one300;
	}
	

    /**
	 *	Returns the String value of one300
	 *	@return one300
	 */
	public char[]  getOne300ActualString() {
	    String value = String.valueOf(one300).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update One300 with the passed value
	 *  Corresponding COBOL Variable is 300-ONE
	 *	@param number
	 */
	public void setOne300(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    one300 = checkOne300MaxLimit(number); 
		serializeOne300(one300);
	}
	
	public void setOne300(int number) {
	    number = checkOne300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setOne300((short)number);
	}
	public void setOne300(long number) {
	    number = checkOne300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setOne300((short)number);
	}
	

	/**
	 * 	Update One300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setOne300(char[] value) throws CFException {
		 one300 = serializeOne300(value);
	}
	/**
	 * 	Update One300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOne300String(char[] value) throws CFException {
		 setOne300(value);
	}
	/**
	 *	Returns the value of twenty300
	 *	@return twenty300
	 */
	public short getTwenty300() throws CFException {
       if (isTwenty300Modified()) { 
           twenty300 = refreshTwenty300();
        }
   		return twenty300;
	}
	

    /**
	 *	Returns the String value of twenty300
	 *	@return twenty300
	 */
	public char[]  getTwenty300ActualString() {
	    String value = String.valueOf(twenty300).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Twenty300 with the passed value
	 *  Corresponding COBOL Variable is 300-TWENTY
	 *	@param number
	 */
	public void setTwenty300(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    twenty300 = checkTwenty300MaxLimit(number); 
		serializeTwenty300(twenty300);
	}
	
	public void setTwenty300(int number) {
	    number = checkTwenty300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTwenty300((short)number);
	}
	public void setTwenty300(long number) {
	    number = checkTwenty300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTwenty300((short)number);
	}
	

	/**
	 * 	Update Twenty300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTwenty300(char[] value) throws CFException {
		 twenty300 = serializeTwenty300(value);
	}
	/**
	 * 	Update Twenty300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTwenty300String(char[] value) throws CFException {
		 setTwenty300(value);
	}
	/**
	 *	Returns the value of sf305120300
	 *	@return sf305120300
	 */
   public char[] getSf305120300() throws CFException{
   		return sf305120300;
   }

  
	/**
	*  set variable sf305120300
	*  Corresponding COBOL Variable is 300-SF305120
	*  @param value
	**/
   public void setSf305120300(char[] value) {
       value = checkSf305120300Constraints(value);
       arraycopy(value,0,sf305120300,0,value.length);
   } 
	public void setSf305120300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sf305120300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of zLog300
	 *	@return zLog300
	 */
   public char[] getZLog300() throws CFException{
   		return zLog300;
   }

  
	/**
	*  set variable zLog300
	*  Corresponding COBOL Variable is 300-Z-LOG
	*  @param value
	**/
   public void setZLog300(char[] value) {
       value = checkZLog300Constraints(value);
       arraycopy(value,0,zLog300,0,value.length);
   } 
	public void setZLog300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,zLog300,0,beginIndex + endIndex);
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
	 *	Returns the value of charE300
	 *	@return charE300
	 */
   public char[] getCharE300() throws CFException{
   		return charE300;
   }

  
	/**
	*  set variable charE300
	*  Corresponding COBOL Variable is 300-CHAR-E
	*  @param value
	**/
   public void setCharE300(char[] value) {
       value = checkCharE300Constraints(value);
       arraycopy(value,0,charE300,0,value.length);
   } 
	public void setCharE300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,charE300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of charA300
	 *	@return charA300
	 */
   public char[] getCharA300() throws CFException{
   		return charA300;
   }

  
	/**
	*  set variable charA300
	*  Corresponding COBOL Variable is 300-CHAR-A
	*  @param value
	**/
   public void setCharA300(char[] value) {
       value = checkCharA300Constraints(value);
       arraycopy(value,0,charA300,0,value.length);
   } 
	public void setCharA300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,charA300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of charB300
	 *	@return charB300
	 */
   public char[] getCharB300() throws CFException{
   		return charB300;
   }

  
	/**
	*  set variable charB300
	*  Corresponding COBOL Variable is 300-CHAR-B
	*  @param value
	**/
   public void setCharB300(char[] value) {
       value = checkCharB300Constraints(value);
       arraycopy(value,0,charB300,0,value.length);
   } 
	public void setCharB300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,charB300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of charN300
	 *	@return charN300
	 */
   public char[] getCharN300() throws CFException{
   		return charN300;
   }

  
	/**
	*  set variable charN300
	*  Corresponding COBOL Variable is 300-CHAR-N
	*  @param value
	**/
   public void setCharN300(char[] value) {
       value = checkCharN300Constraints(value);
       arraycopy(value,0,charN300,0,value.length);
   } 
	public void setCharN300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,charN300,0,beginIndex + endIndex);
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
	 *	Returns the value of sub400
	 *	@return sub400
	 */
	public short getSub400() throws CFException {
   		return sub400;
	}
	
	/**
	 * 	Update Sub400 with the passed value
	 *  Corresponding COBOL Variable is 400-SUB
	 *	@param number
	 */
	public void setSub400(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sub400 = checkSub400MaxLimit(number); 
	}

	public void setSub400(int number) {
	    number = checkSub400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSub400((short)number);
	}
	public void setSub400(long number) {
	    number = checkSub400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSub400((short)number);
	}
	

	/**
	 *	Returns the value of assert1400
	 *	@return assert1400
	 */
	public int getAssert1400() throws CFException {
       if (isAssert1400Modified()) { 
           assert1400 = refreshAssert1400();
        }
   		return assert1400;
	}
	

    /**
	 *	Returns the String value of assert1400
	 *	@return assert1400
	 */
	public char[]  getAssert1400ActualString() {
	    String value = String.valueOf(assert1400).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Assert1400 with the passed value
	 *  Corresponding COBOL Variable is 400-ASSERT-1
	 *	@param number
	 */
	public void setAssert1400(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    assert1400 = checkAssert1400MaxLimit(number); 
		serializeAssert1400(assert1400);
	}
	

	public void setAssert1400(long number) {
	    number = checkAssert1400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setAssert1400((int)number);
	}
	
	/**
	 * 	Update Assert1400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAssert1400(char[] value) throws CFException {
		 assert1400 = serializeAssert1400(value);
	}
	/**
	 * 	Update Assert1400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAssert1400String(char[] value) throws CFException {
		 setAssert1400(value);
	}
	/**
	 *	Returns the value of mipLogCnt400
	 *	@return mipLogCnt400
	 */
	public int getMipLogCnt400() throws CFException {
       if (isMipLogCnt400Modified()) { 
           mipLogCnt400 = refreshMipLogCnt400();
        }
   		return mipLogCnt400;
	}
	

    /**
	 *	Returns the String value of mipLogCnt400
	 *	@return mipLogCnt400
	 */
	public char[]  getMipLogCnt400ActualString() {
	    String value = String.valueOf(mipLogCnt400).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update MipLogCnt400 with the passed value
	 *  Corresponding COBOL Variable is 400-MIP-LOG-CNT
	 *	@param number
	 */
	public void setMipLogCnt400(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    mipLogCnt400 = checkMipLogCnt400MaxLimit(number); 
		serializeMipLogCnt400(mipLogCnt400);
	}
	

	public void setMipLogCnt400(long number) {
	    number = checkMipLogCnt400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setMipLogCnt400((int)number);
	}
	
	/**
	 * 	Update MipLogCnt400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMipLogCnt400(char[] value) throws CFException {
		 mipLogCnt400 = serializeMipLogCnt400(value);
	}
	/**
	 * 	Update MipLogCnt400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMipLogCnt400String(char[] value) throws CFException {
		 setMipLogCnt400(value);
	}
	/**
	 *	Returns the value of zLogCnt400
	 *	@return zLogCnt400
	 */
	public int getZLogCnt400() throws CFException {
       if (isZLogCnt400Modified()) { 
           zLogCnt400 = refreshZLogCnt400();
        }
   		return zLogCnt400;
	}
	

    /**
	 *	Returns the String value of zLogCnt400
	 *	@return zLogCnt400
	 */
	public char[]  getZLogCnt400ActualString() {
	    String value = String.valueOf(zLogCnt400).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update ZLogCnt400 with the passed value
	 *  Corresponding COBOL Variable is 400-Z-LOG-CNT
	 *	@param number
	 */
	public void setZLogCnt400(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    zLogCnt400 = checkZLogCnt400MaxLimit(number); 
		serializeZLogCnt400(zLogCnt400);
	}
	

	public void setZLogCnt400(long number) {
	    number = checkZLogCnt400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setZLogCnt400((int)number);
	}
	
	/**
	 * 	Update ZLogCnt400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setZLogCnt400(char[] value) throws CFException {
		 zLogCnt400 = serializeZLogCnt400(value);
	}
	/**
	 * 	Update ZLogCnt400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setZLogCnt400String(char[] value) throws CFException {
		 setZLogCnt400(value);
	}
	/**
	 *	Returns the value of zLogBypass400
	 *	@return zLogBypass400
	 */
	public int getZLogBypass400() throws CFException {
       if (isZLogBypass400Modified()) { 
           zLogBypass400 = refreshZLogBypass400();
        }
   		return zLogBypass400;
	}
	

    /**
	 *	Returns the String value of zLogBypass400
	 *	@return zLogBypass400
	 */
	public char[]  getZLogBypass400ActualString() {
	    String value = String.valueOf(zLogBypass400).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update ZLogBypass400 with the passed value
	 *  Corresponding COBOL Variable is 400-Z-LOG-BYPASS
	 *	@param number
	 */
	public void setZLogBypass400(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    zLogBypass400 = checkZLogBypass400MaxLimit(number); 
		serializeZLogBypass400(zLogBypass400);
	}
	

	public void setZLogBypass400(long number) {
	    number = checkZLogBypass400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setZLogBypass400((int)number);
	}
	
	/**
	 * 	Update ZLogBypass400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setZLogBypass400(char[] value) throws CFException {
		 zLogBypass400 = serializeZLogBypass400(value);
	}
	/**
	 * 	Update ZLogBypass400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setZLogBypass400String(char[] value) throws CFException {
		 setZLogBypass400(value);
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
	 *	Returns the value of currDateYyyy600
	 *	@return currDateYyyy600
	 */
   public char[] getCurrDateYyyy600() throws CFException{
   		return currDateYyyy600;
   }

  
	/**
	*  set variable currDateYyyy600
	*  Corresponding COBOL Variable is 600-CURR-DATE-YYYY
	*  @param value
	**/
   public void setCurrDateYyyy600(char[] value) {
       value = checkCurrDateYyyy600Constraints(value);
       arraycopy(value,0,currDateYyyy600,0,value.length);
   } 
	public void setCurrDateYyyy600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,currDateYyyy600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of currDateMm600
	 *	@return currDateMm600
	 */
   public char[] getCurrDateMm600() throws CFException{
   		return currDateMm600;
   }

  
	/**
	*  set variable currDateMm600
	*  Corresponding COBOL Variable is 600-CURR-DATE-MM
	*  @param value
	**/
   public void setCurrDateMm600(char[] value) {
       value = checkCurrDateMm600Constraints(value);
       arraycopy(value,0,currDateMm600,0,value.length);
   } 
	public void setCurrDateMm600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,currDateMm600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of currDateDd600
	 *	@return currDateDd600
	 */
   public char[] getCurrDateDd600() throws CFException{
   		return currDateDd600;
   }

  
	/**
	*  set variable currDateDd600
	*  Corresponding COBOL Variable is 600-CURR-DATE-DD
	*  @param value
	**/
   public void setCurrDateDd600(char[] value) {
       value = checkCurrDateDd600Constraints(value);
       arraycopy(value,0,currDateDd600,0,value.length);
   } 
	public void setCurrDateDd600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,currDateDd600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of currTimeHh600
	 *	@return currTimeHh600
	 */
   public char[] getCurrTimeHh600() throws CFException{
   		return currTimeHh600;
   }

  
	/**
	*  set variable currTimeHh600
	*  Corresponding COBOL Variable is 600-CURR-TIME-HH
	*  @param value
	**/
   public void setCurrTimeHh600(char[] value) {
       value = checkCurrTimeHh600Constraints(value);
       arraycopy(value,0,currTimeHh600,0,value.length);
   } 
	public void setCurrTimeHh600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,currTimeHh600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of currTimeMm600
	 *	@return currTimeMm600
	 */
   public char[] getCurrTimeMm600() throws CFException{
   		return currTimeMm600;
   }

  
	/**
	*  set variable currTimeMm600
	*  Corresponding COBOL Variable is 600-CURR-TIME-MM
	*  @param value
	**/
   public void setCurrTimeMm600(char[] value) {
       value = checkCurrTimeMm600Constraints(value);
       arraycopy(value,0,currTimeMm600,0,value.length);
   } 
	public void setCurrTimeMm600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,currTimeMm600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of currTimeSs600
	 *	@return currTimeSs600
	 */
   public char[] getCurrTimeSs600() throws CFException{
   		return currTimeSs600;
   }

  
	/**
	*  set variable currTimeSs600
	*  Corresponding COBOL Variable is 600-CURR-TIME-SS
	*  @param value
	**/
   public void setCurrTimeSs600(char[] value) {
       value = checkCurrTimeSs600Constraints(value);
       arraycopy(value,0,currTimeSs600,0,value.length);
   } 
	public void setCurrTimeSs600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,currTimeSs600,0,beginIndex + endIndex);
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
	 *	Returns the value of eojMessage6009400
	 *	@return eojMessage6009400
	 */
   public char[] getEojMessage6009400() throws CFException{
   		return eojMessage6009400;
   }

  
	/**
	*  set variable eojMessage6009400
	*  Corresponding COBOL Variable is 600-9400-EOJ-MESSAGE
	*  @param value
	**/
   public void setEojMessage6009400(char[] value) {
       value = checkEojMessage6009400Constraints(value);
       arraycopy(value,0,eojMessage6009400,0,value.length);
   } 
	public void setEojMessage6009400(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,eojMessage6009400,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tranlogTimeHh800
	 *	@return tranlogTimeHh800
	 */
	public int getTranlogTimeHh800() throws CFException {
       if (isTranlogTimeHh800Modified()) { 
           tranlogTimeHh800 = refreshTranlogTimeHh800();
        }
   		return tranlogTimeHh800;
	}
	

	
	   
	/**
	 * 	Update TranlogTimeHh800 with the passed value
	 *  Corresponding COBOL Variable is 800-TRANLOG-TIME-HH
	 *	@param number
	 */
	public void setTranlogTimeHh800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    tranlogTimeHh800 = checkTranlogTimeHh800MaxLimit(number); 
		serializeTranlogTimeHh800(tranlogTimeHh800);
	}
	

	public void setTranlogTimeHh800(long number) {
	    number = checkTranlogTimeHh800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTranlogTimeHh800((int)number);
	}
	
	/**
	 * 	Update TranlogTimeHh800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranlogTimeHh800(char[] value) throws CFException {
		 tranlogTimeHh800 = serializeTranlogTimeHh800(value);
	}
	/**
	 * 	Update TranlogTimeHh800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranlogTimeHh800String(char[] value) throws CFException {
		 setTranlogTimeHh800(value);
	}
	/**
	 *	Returns the value of tranlogTimeMm800
	 *	@return tranlogTimeMm800
	 */
	public int getTranlogTimeMm800() throws CFException {
       if (isTranlogTimeMm800Modified()) { 
           tranlogTimeMm800 = refreshTranlogTimeMm800();
        }
   		return tranlogTimeMm800;
	}
	

	
	   
	/**
	 * 	Update TranlogTimeMm800 with the passed value
	 *  Corresponding COBOL Variable is 800-TRANLOG-TIME-MM
	 *	@param number
	 */
	public void setTranlogTimeMm800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    tranlogTimeMm800 = checkTranlogTimeMm800MaxLimit(number); 
		serializeTranlogTimeMm800(tranlogTimeMm800);
	}
	

	public void setTranlogTimeMm800(long number) {
	    number = checkTranlogTimeMm800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTranlogTimeMm800((int)number);
	}
	
	/**
	 * 	Update TranlogTimeMm800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranlogTimeMm800(char[] value) throws CFException {
		 tranlogTimeMm800 = serializeTranlogTimeMm800(value);
	}
	/**
	 * 	Update TranlogTimeMm800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranlogTimeMm800String(char[] value) throws CFException {
		 setTranlogTimeMm800(value);
	}
	/**
	 *	Returns the value of tranlogTimeSs800
	 *	@return tranlogTimeSs800
	 */
	public int getTranlogTimeSs800() throws CFException {
       if (isTranlogTimeSs800Modified()) { 
           tranlogTimeSs800 = refreshTranlogTimeSs800();
        }
   		return tranlogTimeSs800;
	}
	

	
	   
	/**
	 * 	Update TranlogTimeSs800 with the passed value
	 *  Corresponding COBOL Variable is 800-TRANLOG-TIME-SS
	 *	@param number
	 */
	public void setTranlogTimeSs800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    tranlogTimeSs800 = checkTranlogTimeSs800MaxLimit(number); 
		serializeTranlogTimeSs800(tranlogTimeSs800);
	}
	

	public void setTranlogTimeSs800(long number) {
	    number = checkTranlogTimeSs800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTranlogTimeSs800((int)number);
	}
	
	/**
	 * 	Update TranlogTimeSs800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranlogTimeSs800(char[] value) throws CFException {
		 tranlogTimeSs800 = serializeTranlogTimeSs800(value);
	}
	/**
	 * 	Update TranlogTimeSs800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranlogTimeSs800String(char[] value) throws CFException {
		 setTranlogTimeSs800(value);
	}
	/**
	 *	Returns the value of tranlogDateMm800
	 *	@return tranlogDateMm800
	 */
	public int getTranlogDateMm800() throws CFException {
       if (isTranlogDateMm800Modified()) { 
           tranlogDateMm800 = refreshTranlogDateMm800();
        }
   		return tranlogDateMm800;
	}
	

	
	   
	/**
	 * 	Update TranlogDateMm800 with the passed value
	 *  Corresponding COBOL Variable is 800-TRANLOG-DATE-MM
	 *	@param number
	 */
	public void setTranlogDateMm800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    tranlogDateMm800 = checkTranlogDateMm800MaxLimit(number); 
		serializeTranlogDateMm800(tranlogDateMm800);
	}
	

	public void setTranlogDateMm800(long number) {
	    number = checkTranlogDateMm800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTranlogDateMm800((int)number);
	}
	
	/**
	 * 	Update TranlogDateMm800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranlogDateMm800(char[] value) throws CFException {
		 tranlogDateMm800 = serializeTranlogDateMm800(value);
	}
	/**
	 * 	Update TranlogDateMm800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranlogDateMm800String(char[] value) throws CFException {
		 setTranlogDateMm800(value);
	}
	/**
	 *	Returns the value of tranlogDateDd800
	 *	@return tranlogDateDd800
	 */
	public int getTranlogDateDd800() throws CFException {
       if (isTranlogDateDd800Modified()) { 
           tranlogDateDd800 = refreshTranlogDateDd800();
        }
   		return tranlogDateDd800;
	}
	

	
	   
	/**
	 * 	Update TranlogDateDd800 with the passed value
	 *  Corresponding COBOL Variable is 800-TRANLOG-DATE-DD
	 *	@param number
	 */
	public void setTranlogDateDd800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    tranlogDateDd800 = checkTranlogDateDd800MaxLimit(number); 
		serializeTranlogDateDd800(tranlogDateDd800);
	}
	

	public void setTranlogDateDd800(long number) {
	    number = checkTranlogDateDd800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTranlogDateDd800((int)number);
	}
	
	/**
	 * 	Update TranlogDateDd800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranlogDateDd800(char[] value) throws CFException {
		 tranlogDateDd800 = serializeTranlogDateDd800(value);
	}
	/**
	 * 	Update TranlogDateDd800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranlogDateDd800String(char[] value) throws CFException {
		 setTranlogDateDd800(value);
	}
	/**
	 *	Returns the value of tranlogDateYy800
	 *	@return tranlogDateYy800
	 */
	public int getTranlogDateYy800() throws CFException {
       if (isTranlogDateYy800Modified()) { 
           tranlogDateYy800 = refreshTranlogDateYy800();
        }
   		return tranlogDateYy800;
	}
	

	
	   
	/**
	 * 	Update TranlogDateYy800 with the passed value
	 *  Corresponding COBOL Variable is 800-TRANLOG-DATE-YY
	 *	@param number
	 */
	public void setTranlogDateYy800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    tranlogDateYy800 = checkTranlogDateYy800MaxLimit(number); 
		serializeTranlogDateYy800(tranlogDateYy800);
	}
	

	public void setTranlogDateYy800(long number) {
	    number = checkTranlogDateYy800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTranlogDateYy800((int)number);
	}
	
	/**
	 * 	Update TranlogDateYy800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranlogDateYy800(char[] value) throws CFException {
		 tranlogDateYy800 = serializeTranlogDateYy800(value);
	}
	/**
	 * 	Update TranlogDateYy800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranlogDateYy800String(char[] value) throws CFException {
		 setTranlogDateYy800(value);
	}
	/**
	 *	Returns the value of tranlogDateCc800
	 *	@return tranlogDateCc800
	 */
	public int getTranlogDateCc800() throws CFException {
       if (isTranlogDateCc800Modified()) { 
           tranlogDateCc800 = refreshTranlogDateCc800();
        }
   		return tranlogDateCc800;
	}
	

	
	   
	/**
	 * 	Update TranlogDateCc800 with the passed value
	 *  Corresponding COBOL Variable is 800-TRANLOG-DATE-CC
	 *	@param number
	 */
	public void setTranlogDateCc800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    tranlogDateCc800 = checkTranlogDateCc800MaxLimit(number); 
		serializeTranlogDateCc800(tranlogDateCc800);
	}
	

	public void setTranlogDateCc800(long number) {
	    number = checkTranlogDateCc800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTranlogDateCc800((int)number);
	}
	
	/**
	 * 	Update TranlogDateCc800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranlogDateCc800(char[] value) throws CFException {
		 tranlogDateCc800 = serializeTranlogDateCc800(value);
	}
	/**
	 * 	Update TranlogDateCc800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranlogDateCc800String(char[] value) throws CFException {
		 setTranlogDateCc800(value);
	}

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
