package com.cloudframe.app.refmod3.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:34. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized { 
   

								private int one;

								private int three;

								private int five;

								private short sLen2;

								private short tLen2;

						private char[] aS22 = Field.fillLowValue(70);

						private char[] bS22 = Field.fillLowValue(70);

						private char[] aS24 = Field.fillLowValue(70);

						private char[] bS24 = Field.fillLowValue(70);

						private char[] aS28 = Field.fillLowValue(70);

						private char[] bS28 = Field.fillLowValue(70);

						private char[] aS212 = Field.fillLowValue(70);

						private char[] bS212 = Field.fillLowValue(70);

						private char[] aS218 = Field.fillLowValue(70);

						private char[] bS218 = Field.fillLowValue(70);

						private char[] aS220 = Field.fillLowValue(70);

						private char[] bS220 = Field.fillLowValue(70);

						private char[] wse22aS = Field.fillLowValue(60);

						private char[] wse22bS = Field.fillLowValue(60);

						private char[] wse24aS = Field.fillLowValue(60);

						private char[] wse24bS = Field.fillLowValue(60);

						private char[] wse28aS = Field.fillLowValue(60);

						private char[] wse28bS = Field.fillLowValue(60);

						private char[] wse212aS = Field.fillLowValue(60);

						private char[] wse212bS = Field.fillLowValue(60);

						private char[] wse218aS = Field.fillLowValue(60);

						private char[] wse218bS = Field.fillLowValue(60);

						private char[] wse220aS = Field.fillLowValue(60);

						private char[] wse220bS = Field.fillLowValue(60);

						private char[] wse220cT = Field.fillLowValue(60);

								private long dplJulianDate;

						private char[] var1 = new char[50];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDplJulianDate(22152L);
								setVar1(fillSpace(50));
    }


 

	/**
	 *	Returns the value of one
	 *	@return one
	 */
	public int getOne() throws CFException {
       if (isOneModified()) { 
           one = refreshOne();
        }
   		return one;
	}
	

	
	   
	/**
	 * 	Update One with the passed value
	 *  Corresponding COBOL Variable is WS-ONE
	 *	@param number
	 */
	public void setOne(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    one = checkOneMaxLimit(number); 
		serializeOne(one);
	}
	

	public void setOne(long number) {
	    number = checkOneMaxLimit(number); // Truncate if value is beyond +/- Max range
		setOne((int)number);
	}
	
	/**
	 * 	Update One with the passed value
	 *	@param value (String or char[])
	 */
	public void setOne(char[] value) throws CFException {
		 one = serializeOne(value);
	}
	/**
	 * 	Update One with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOneString(char[] value) throws CFException {
		 setOne(value);
	}
	/**
	 *	Returns the value of three
	 *	@return three
	 */
	public int getThree() throws CFException {
       if (isThreeModified()) { 
           three = refreshThree();
        }
   		return three;
	}
	

	
	   
	/**
	 * 	Update Three with the passed value
	 *  Corresponding COBOL Variable is WS-THREE
	 *	@param number
	 */
	public void setThree(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    three = checkThreeMaxLimit(number); 
		serializeThree(three);
	}
	

	public void setThree(long number) {
	    number = checkThreeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setThree((int)number);
	}
	
	/**
	 * 	Update Three with the passed value
	 *	@param value (String or char[])
	 */
	public void setThree(char[] value) throws CFException {
		 three = serializeThree(value);
	}
	/**
	 * 	Update Three with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setThreeString(char[] value) throws CFException {
		 setThree(value);
	}
	/**
	 *	Returns the value of five
	 *	@return five
	 */
	public int getFive() throws CFException {
       if (isFiveModified()) { 
           five = refreshFive();
        }
   		return five;
	}
	

	
	   
	/**
	 * 	Update Five with the passed value
	 *  Corresponding COBOL Variable is WS-FIVE
	 *	@param number
	 */
	public void setFive(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    five = checkFiveMaxLimit(number); 
		serializeFive(five);
	}
	

	public void setFive(long number) {
	    number = checkFiveMaxLimit(number); // Truncate if value is beyond +/- Max range
		setFive((int)number);
	}
	
	/**
	 * 	Update Five with the passed value
	 *	@param value (String or char[])
	 */
	public void setFive(char[] value) throws CFException {
		 five = serializeFive(value);
	}
	/**
	 * 	Update Five with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFiveString(char[] value) throws CFException {
		 setFive(value);
	}
	/**
	 *	Returns the value of sLen2
	 *	@return sLen2
	 */
	public short getSLen2() throws CFException {
   		return sLen2;
	}
	
	/**
	 * 	Update SLen2 with the passed value
	 *  Corresponding COBOL Variable is WS-2-S-LEN
	 *	@param number
	 */
	public void setSLen2(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sLen2 = checkSLen2MaxLimit(number); 
	}

	public void setSLen2(int number) {
	    number = checkSLen2MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSLen2((short)number);
	}
	public void setSLen2(long number) {
	    number = checkSLen2MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSLen2((short)number);
	}
	

	/**
	 *	Returns the value of tLen2
	 *	@return tLen2
	 */
	public short getTLen2() throws CFException {
   		return tLen2;
	}
	
	/**
	 * 	Update TLen2 with the passed value
	 *  Corresponding COBOL Variable is WS-2-T-LEN
	 *	@param number
	 */
	public void setTLen2(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tLen2 = checkTLen2MaxLimit(number); 
	}

	public void setTLen2(int number) {
	    number = checkTLen2MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTLen2((short)number);
	}
	public void setTLen2(long number) {
	    number = checkTLen2MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTLen2((short)number);
	}
	

	/**
	 *	Returns the value of aS22
	 *	@return aS22
	 */
   public char[] getAS22() throws CFException{
   		return aS22;
   }

  
	/**
	*  set variable aS22
	*  Corresponding COBOL Variable is WS-2-2A-S
	*  @param value
	**/
   public void setAS22(char[] value) {
       value = checkAS22Constraints(value);
       arraycopy(value,0,aS22,0,value.length);
   } 
	public void setAS22(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,aS22,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of bS22
	 *	@return bS22
	 */
   public char[] getBS22() throws CFException{
   		return bS22;
   }

  
	/**
	*  set variable bS22
	*  Corresponding COBOL Variable is WS-2-2B-S
	*  @param value
	**/
   public void setBS22(char[] value) {
       value = checkBS22Constraints(value);
       arraycopy(value,0,bS22,0,value.length);
   } 
	public void setBS22(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,bS22,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of aS24
	 *	@return aS24
	 */
   public char[] getAS24() throws CFException{
   		return aS24;
   }

  
	/**
	*  set variable aS24
	*  Corresponding COBOL Variable is WS-2-4A-S
	*  @param value
	**/
   public void setAS24(char[] value) {
       value = checkAS24Constraints(value);
       arraycopy(value,0,aS24,0,value.length);
   } 
	public void setAS24(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,aS24,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of bS24
	 *	@return bS24
	 */
   public char[] getBS24() throws CFException{
   		return bS24;
   }

  
	/**
	*  set variable bS24
	*  Corresponding COBOL Variable is WS-2-4B-S
	*  @param value
	**/
   public void setBS24(char[] value) {
       value = checkBS24Constraints(value);
       arraycopy(value,0,bS24,0,value.length);
   } 
	public void setBS24(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,bS24,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of aS28
	 *	@return aS28
	 */
   public char[] getAS28() throws CFException{
   		return aS28;
   }

  
	/**
	*  set variable aS28
	*  Corresponding COBOL Variable is WS-2-8A-S
	*  @param value
	**/
   public void setAS28(char[] value) {
       value = checkAS28Constraints(value);
       arraycopy(value,0,aS28,0,value.length);
   } 
	public void setAS28(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,aS28,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of bS28
	 *	@return bS28
	 */
   public char[] getBS28() throws CFException{
   		return bS28;
   }

  
	/**
	*  set variable bS28
	*  Corresponding COBOL Variable is WS-2-8B-S
	*  @param value
	**/
   public void setBS28(char[] value) {
       value = checkBS28Constraints(value);
       arraycopy(value,0,bS28,0,value.length);
   } 
	public void setBS28(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,bS28,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of aS212
	 *	@return aS212
	 */
   public char[] getAS212() throws CFException{
   		return aS212;
   }

  
	/**
	*  set variable aS212
	*  Corresponding COBOL Variable is WS-2-12A-S
	*  @param value
	**/
   public void setAS212(char[] value) {
       value = checkAS212Constraints(value);
       arraycopy(value,0,aS212,0,value.length);
   } 
	public void setAS212(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,aS212,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of bS212
	 *	@return bS212
	 */
   public char[] getBS212() throws CFException{
   		return bS212;
   }

  
	/**
	*  set variable bS212
	*  Corresponding COBOL Variable is WS-2-12B-S
	*  @param value
	**/
   public void setBS212(char[] value) {
       value = checkBS212Constraints(value);
       arraycopy(value,0,bS212,0,value.length);
   } 
	public void setBS212(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,bS212,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of aS218
	 *	@return aS218
	 */
   public char[] getAS218() throws CFException{
   		return aS218;
   }

  
	/**
	*  set variable aS218
	*  Corresponding COBOL Variable is WS-2-18A-S
	*  @param value
	**/
   public void setAS218(char[] value) {
       value = checkAS218Constraints(value);
       arraycopy(value,0,aS218,0,value.length);
   } 
	public void setAS218(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,aS218,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of bS218
	 *	@return bS218
	 */
   public char[] getBS218() throws CFException{
   		return bS218;
   }

  
	/**
	*  set variable bS218
	*  Corresponding COBOL Variable is WS-2-18B-S
	*  @param value
	**/
   public void setBS218(char[] value) {
       value = checkBS218Constraints(value);
       arraycopy(value,0,bS218,0,value.length);
   } 
	public void setBS218(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,bS218,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of aS220
	 *	@return aS220
	 */
   public char[] getAS220() throws CFException{
   		return aS220;
   }

  
	/**
	*  set variable aS220
	*  Corresponding COBOL Variable is WS-2-20A-S
	*  @param value
	**/
   public void setAS220(char[] value) {
       value = checkAS220Constraints(value);
       arraycopy(value,0,aS220,0,value.length);
   } 
	public void setAS220(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,aS220,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of bS220
	 *	@return bS220
	 */
   public char[] getBS220() throws CFException{
   		return bS220;
   }

  
	/**
	*  set variable bS220
	*  Corresponding COBOL Variable is WS-2-20B-S
	*  @param value
	**/
   public void setBS220(char[] value) {
       value = checkBS220Constraints(value);
       arraycopy(value,0,bS220,0,value.length);
   } 
	public void setBS220(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,bS220,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wse22aS
	 *	@return wse22aS
	 */
   public char[] getWse22aS() throws CFException{
   		return wse22aS;
   }

  
	/**
	*  set variable wse22aS
	*  Corresponding COBOL Variable is WSE-2-2A-S
	*  @param value
	**/
   public void setWse22aS(char[] value) {
       value = checkWse22aSConstraints(value);
       arraycopy(value,0,wse22aS,0,value.length);
   } 
	public void setWse22aS(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wse22aS,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wse22bS
	 *	@return wse22bS
	 */
   public char[] getWse22bS() throws CFException{
   		return wse22bS;
   }

  
	/**
	*  set variable wse22bS
	*  Corresponding COBOL Variable is WSE-2-2B-S
	*  @param value
	**/
   public void setWse22bS(char[] value) {
       value = checkWse22bSConstraints(value);
       arraycopy(value,0,wse22bS,0,value.length);
   } 
	public void setWse22bS(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wse22bS,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wse24aS
	 *	@return wse24aS
	 */
   public char[] getWse24aS() throws CFException{
   		return wse24aS;
   }

  
	/**
	*  set variable wse24aS
	*  Corresponding COBOL Variable is WSE-2-4A-S
	*  @param value
	**/
   public void setWse24aS(char[] value) {
       value = checkWse24aSConstraints(value);
       arraycopy(value,0,wse24aS,0,value.length);
   } 
	public void setWse24aS(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wse24aS,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wse24bS
	 *	@return wse24bS
	 */
   public char[] getWse24bS() throws CFException{
   		return wse24bS;
   }

  
	/**
	*  set variable wse24bS
	*  Corresponding COBOL Variable is WSE-2-4B-S
	*  @param value
	**/
   public void setWse24bS(char[] value) {
       value = checkWse24bSConstraints(value);
       arraycopy(value,0,wse24bS,0,value.length);
   } 
	public void setWse24bS(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wse24bS,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wse28aS
	 *	@return wse28aS
	 */
   public char[] getWse28aS() throws CFException{
   		return wse28aS;
   }

  
	/**
	*  set variable wse28aS
	*  Corresponding COBOL Variable is WSE-2-8A-S
	*  @param value
	**/
   public void setWse28aS(char[] value) {
       value = checkWse28aSConstraints(value);
       arraycopy(value,0,wse28aS,0,value.length);
   } 
	public void setWse28aS(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wse28aS,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wse28bS
	 *	@return wse28bS
	 */
   public char[] getWse28bS() throws CFException{
   		return wse28bS;
   }

  
	/**
	*  set variable wse28bS
	*  Corresponding COBOL Variable is WSE-2-8B-S
	*  @param value
	**/
   public void setWse28bS(char[] value) {
       value = checkWse28bSConstraints(value);
       arraycopy(value,0,wse28bS,0,value.length);
   } 
	public void setWse28bS(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wse28bS,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wse212aS
	 *	@return wse212aS
	 */
   public char[] getWse212aS() throws CFException{
   		return wse212aS;
   }

  
	/**
	*  set variable wse212aS
	*  Corresponding COBOL Variable is WSE-2-12A-S
	*  @param value
	**/
   public void setWse212aS(char[] value) {
       value = checkWse212aSConstraints(value);
       arraycopy(value,0,wse212aS,0,value.length);
   } 
	public void setWse212aS(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wse212aS,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wse212bS
	 *	@return wse212bS
	 */
   public char[] getWse212bS() throws CFException{
   		return wse212bS;
   }

  
	/**
	*  set variable wse212bS
	*  Corresponding COBOL Variable is WSE-2-12B-S
	*  @param value
	**/
   public void setWse212bS(char[] value) {
       value = checkWse212bSConstraints(value);
       arraycopy(value,0,wse212bS,0,value.length);
   } 
	public void setWse212bS(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wse212bS,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wse218aS
	 *	@return wse218aS
	 */
   public char[] getWse218aS() throws CFException{
   		return wse218aS;
   }

  
	/**
	*  set variable wse218aS
	*  Corresponding COBOL Variable is WSE-2-18A-S
	*  @param value
	**/
   public void setWse218aS(char[] value) {
       value = checkWse218aSConstraints(value);
       arraycopy(value,0,wse218aS,0,value.length);
   } 
	public void setWse218aS(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wse218aS,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wse218bS
	 *	@return wse218bS
	 */
   public char[] getWse218bS() throws CFException{
   		return wse218bS;
   }

  
	/**
	*  set variable wse218bS
	*  Corresponding COBOL Variable is WSE-2-18B-S
	*  @param value
	**/
   public void setWse218bS(char[] value) {
       value = checkWse218bSConstraints(value);
       arraycopy(value,0,wse218bS,0,value.length);
   } 
	public void setWse218bS(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wse218bS,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wse220aS
	 *	@return wse220aS
	 */
   public char[] getWse220aS() throws CFException{
   		return wse220aS;
   }

  
	/**
	*  set variable wse220aS
	*  Corresponding COBOL Variable is WSE-2-20A-S
	*  @param value
	**/
   public void setWse220aS(char[] value) {
       value = checkWse220aSConstraints(value);
       arraycopy(value,0,wse220aS,0,value.length);
   } 
	public void setWse220aS(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wse220aS,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wse220bS
	 *	@return wse220bS
	 */
   public char[] getWse220bS() throws CFException{
   		return wse220bS;
   }

  
	/**
	*  set variable wse220bS
	*  Corresponding COBOL Variable is WSE-2-20B-S
	*  @param value
	**/
   public void setWse220bS(char[] value) {
       value = checkWse220bSConstraints(value);
       arraycopy(value,0,wse220bS,0,value.length);
   } 
	public void setWse220bS(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wse220bS,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wse220cT
	 *	@return wse220cT
	 */
   public char[] getWse220cT() throws CFException{
   		return wse220cT;
   }

  
	/**
	*  set variable wse220cT
	*  Corresponding COBOL Variable is WSE-2-20C-T
	*  @param value
	**/
   public void setWse220cT(char[] value) {
       value = checkWse220cTConstraints(value);
       arraycopy(value,0,wse220cT,0,value.length);
   } 
	public void setWse220cT(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wse220cT,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of dplJulianDate
	 *	@return dplJulianDate
	 */
	public long getDplJulianDate() throws CFException {
       if (isDplJulianDateModified()) { 
           dplJulianDate = refreshDplJulianDate();
        }
   		return dplJulianDate;
	}
	

	
	   
	/**
	 * 	Update DplJulianDate with the passed value
	 *  Corresponding COBOL Variable is DPL-JULIAN-DATE
	 *	@param number
	 */
	public void setDplJulianDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    dplJulianDate = checkDplJulianDateMaxLimit(number); 
		serializeDplJulianDate(dplJulianDate);
	}
	

	/**
	 * 	Update DplJulianDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setDplJulianDate(char[] value) throws CFException {
		 dplJulianDate = serializeDplJulianDate(value);
	}
	/**
	 * 	Update DplJulianDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDplJulianDateString(char[] value) throws CFException {
		 setDplJulianDate(value);
	}
	/**
	 *	Returns the value of var1
	 *	@return var1
	 */
   public char[] getVar1() throws CFException{
   		return var1;
   }

  
	/**
	*  set variable var1
	*  Corresponding COBOL Variable is WS-VAR1
	*  @param value
	**/
   public void setVar1(char[] value) {
       value = checkVar1Constraints(value);
       arraycopy(value,0,var1,0,value.length);
   } 
	public void setVar1(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,var1,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
