package com.cloudframe.app.evaluat0.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/


import com.cloudframe.app.evaluat0.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized { 
   

								private short num1;

								private short num2;

								private short age;

								private int income;

						private char[] gender = new char[1];

						private char[] crossReferenceCd = Field.fillLowValue(11);

						private char[] rgstrCd = Field.fillLowValue(2);

						private char[] msdExchangeCode = Field.fillLowValue(1);

						private char[] exchangeCd = Field.fillLowValue(10);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setNum1((short)0);
								setNum2((short)0);
								setAge((short)88);
								setIncome(77777);
								setGender(("M").toCharArray());
    }


 

	/**
	 *	Returns the value of num1
	 *	@return num1
	 */
	public short getNum1() throws CFException {
   		return num1;
	}
	
	/**
	 * 	Update Num1 with the passed value
	 *  Corresponding COBOL Variable is NUM1
	 *	@param number
	 */
	public void setNum1(short number) {
	     // Truncate if the number is beyond +/- Max range
	    num1 = checkNum1MaxLimit(number); 
	}

	public void setNum1(int number) {
	    number = checkNum1MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setNum1((short)number);
	}
	public void setNum1(long number) {
	    number = checkNum1MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setNum1((short)number);
	}
	

	/**
	 *	Returns the value of num2
	 *	@return num2
	 */
	public short getNum2() throws CFException {
   		return num2;
	}
	
	/**
	 * 	Update Num2 with the passed value
	 *  Corresponding COBOL Variable is NUM2
	 *	@param number
	 */
	public void setNum2(short number) {
	     // Truncate if the number is beyond +/- Max range
	    num2 = checkNum2MaxLimit(number); 
	}

	public void setNum2(int number) {
	    number = checkNum2MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setNum2((short)number);
	}
	public void setNum2(long number) {
	    number = checkNum2MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setNum2((short)number);
	}
	

	/**
	 *	Returns the value of age
	 *	@return age
	 */
	public short getAge() throws CFException {
   		return age;
	}
	
	/**
	 * 	Update Age with the passed value
	 *  Corresponding COBOL Variable is WS-AGE
	 *	@param number
	 */
	public void setAge(short number) {
	     // Truncate if the number is beyond +/- Max range
	    age = checkAgeMaxLimit(number); 
	}

	public void setAge(int number) {
	    number = checkAgeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setAge((short)number);
	}
	public void setAge(long number) {
	    number = checkAgeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setAge((short)number);
	}
	

	/**
	 *	Returns the value of income
	 *	@return income
	 */
	public int getIncome() throws CFException {
   		return income;
	}
	
	/**
	 * 	Update Income with the passed value
	 *  Corresponding COBOL Variable is WS-INCOME
	 *	@param number
	 */
	public void setIncome(int number) {
	     // Truncate if the number is beyond +/- Max range
	    income = checkIncomeMaxLimit(number); 
	}


	public void setIncome(long number) {
	    number = checkIncomeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIncome((int)number);
	}
	
	/**
	 *	Returns the value of gender
	 *	@return gender
	 */
   public char[] getGender() throws CFException{
   		return gender;
   }

  
	/**
	*  set variable gender
	*  Corresponding COBOL Variable is WS-GENDER
	*  @param value
	**/
   public void setGender(char[] value) {
       value = checkGenderConstraints(value);
       arraycopy(value,0,gender,0,value.length);
   } 
	public void setGender(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,gender,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of crossReferenceCd
	 *	@return crossReferenceCd
	 */
   public char[] getCrossReferenceCd() throws CFException{
   		return crossReferenceCd;
   }

  
	/**
	*  set variable crossReferenceCd
	*  Corresponding COBOL Variable is CROSS-REFERENCE-CD
	*  @param value
	**/
   public void setCrossReferenceCd(char[] value) {
       value = checkCrossReferenceCdConstraints(value);
       arraycopy(value,0,crossReferenceCd,0,value.length);
   } 
	public void setCrossReferenceCd(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,crossReferenceCd,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rgstrCd
	 *	@return rgstrCd
	 */
   public char[] getRgstrCd() throws CFException{
   		return rgstrCd;
   }

  
	/**
	*  set variable rgstrCd
	*  Corresponding COBOL Variable is WS-RGSTR-CD
	*  @param value
	**/
   public void setRgstrCd(char[] value) {
       value = checkRgstrCdConstraints(value);
       arraycopy(value,0,rgstrCd,0,value.length);
   } 
	public void setRgstrCd(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rgstrCd,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of msdExchangeCode
	 *	@return msdExchangeCode
	 */
   public char[] getMsdExchangeCode() throws CFException{
   		return msdExchangeCode;
   }

  
	/**
	*  set variable msdExchangeCode
	*  Corresponding COBOL Variable is MSD-EXCHANGE-CODE
	*  @param value
	**/
   public void setMsdExchangeCode(char[] value) {
       value = checkMsdExchangeCodeConstraints(value);
       arraycopy(value,0,msdExchangeCode,0,value.length);
   } 
	public void setMsdExchangeCode(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,msdExchangeCode,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of exchangeCd
	 *	@return exchangeCd
	 */
   public char[] getExchangeCd() throws CFException{
   		return exchangeCd;
   }

  
	/**
	*  set variable exchangeCd
	*  Corresponding COBOL Variable is EXCHANGE-CD
	*  @param value
	**/
   public void setExchangeCd(char[] value) {
       value = checkExchangeCdConstraints(value);
       arraycopy(value,0,exchangeCd,0,value.length);
   } 
	public void setExchangeCd(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,exchangeCd,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
