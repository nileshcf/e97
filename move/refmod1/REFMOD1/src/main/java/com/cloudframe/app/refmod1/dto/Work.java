package com.cloudframe.app.refmod1.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.refmod1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized { 
   

								private short sLen;

								private short tLen;

						private char[] aS2 = Field.fillLowValue(70);

						private char[] bS2 = Field.fillLowValue(70);

						private char[] aS4 = Field.fillLowValue(70);

						private char[] bS4 = Field.fillLowValue(70);

						private char[] aS8 = Field.fillLowValue(70);

						private char[] bS8 = Field.fillLowValue(70);

						private char[] aS12 = Field.fillLowValue(70);

						private char[] bS12 = Field.fillLowValue(70);

						private char[] aS18 = Field.fillLowValue(70);

						private char[] bS18 = Field.fillLowValue(70);

						private char[] aS20 = Field.fillLowValue(70);

						private char[] bS20 = Field.fillLowValue(70);

						private char[] wse2aS = Field.fillLowValue(60);

						private char[] wse2bS = Field.fillLowValue(60);

						private char[] wse4aS = Field.fillLowValue(60);

						private char[] wse4bS = Field.fillLowValue(60);

						private char[] wse8aS = Field.fillLowValue(60);

						private char[] wse8bS = Field.fillLowValue(60);

						private char[] wse12aS = Field.fillLowValue(60);

						private char[] wse12bS = Field.fillLowValue(60);

						private char[] wse18aS = Field.fillLowValue(60);

						private char[] wse18bS = Field.fillLowValue(60);

						private char[] wse20aS = Field.fillLowValue(60);

						private char[] wse20bS = Field.fillLowValue(60);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sLen
	 *	@return sLen
	 */
	public short getSLen() throws CFException {
   		return sLen;
	}
	
	/**
	 * 	Update SLen with the passed value
	 *  Corresponding COBOL Variable is WS-S-LEN
	 *	@param number
	 */
	public void setSLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sLen = checkSLenMaxLimit(number); 
	}

	public void setSLen(int number) {
	    number = checkSLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSLen((short)number);
	}
	public void setSLen(long number) {
	    number = checkSLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSLen((short)number);
	}
	

	/**
	 *	Returns the value of tLen
	 *	@return tLen
	 */
	public short getTLen() throws CFException {
   		return tLen;
	}
	
	/**
	 * 	Update TLen with the passed value
	 *  Corresponding COBOL Variable is WS-T-LEN
	 *	@param number
	 */
	public void setTLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tLen = checkTLenMaxLimit(number); 
	}

	public void setTLen(int number) {
	    number = checkTLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTLen((short)number);
	}
	public void setTLen(long number) {
	    number = checkTLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTLen((short)number);
	}
	

	/**
	 *	Returns the value of aS2
	 *	@return aS2
	 */
   public char[] getAS2() throws CFException{
   		return aS2;
   }

  
	/**
	*  set variable aS2
	*  Corresponding COBOL Variable is WS-2A-S
	*  @param value
	**/
   public void setAS2(char[] value) {
       value = checkAS2Constraints(value);
       arraycopy(value,0,aS2,0,value.length);
   } 
	public void setAS2(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,aS2,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of bS2
	 *	@return bS2
	 */
   public char[] getBS2() throws CFException{
   		return bS2;
   }

  
	/**
	*  set variable bS2
	*  Corresponding COBOL Variable is WS-2B-S
	*  @param value
	**/
   public void setBS2(char[] value) {
       value = checkBS2Constraints(value);
       arraycopy(value,0,bS2,0,value.length);
   } 
	public void setBS2(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,bS2,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of aS4
	 *	@return aS4
	 */
   public char[] getAS4() throws CFException{
   		return aS4;
   }

  
	/**
	*  set variable aS4
	*  Corresponding COBOL Variable is WS-4A-S
	*  @param value
	**/
   public void setAS4(char[] value) {
       value = checkAS4Constraints(value);
       arraycopy(value,0,aS4,0,value.length);
   } 
	public void setAS4(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,aS4,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of bS4
	 *	@return bS4
	 */
   public char[] getBS4() throws CFException{
   		return bS4;
   }

  
	/**
	*  set variable bS4
	*  Corresponding COBOL Variable is WS-4B-S
	*  @param value
	**/
   public void setBS4(char[] value) {
       value = checkBS4Constraints(value);
       arraycopy(value,0,bS4,0,value.length);
   } 
	public void setBS4(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,bS4,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of aS8
	 *	@return aS8
	 */
   public char[] getAS8() throws CFException{
   		return aS8;
   }

  
	/**
	*  set variable aS8
	*  Corresponding COBOL Variable is WS-8A-S
	*  @param value
	**/
   public void setAS8(char[] value) {
       value = checkAS8Constraints(value);
       arraycopy(value,0,aS8,0,value.length);
   } 
	public void setAS8(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,aS8,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of bS8
	 *	@return bS8
	 */
   public char[] getBS8() throws CFException{
   		return bS8;
   }

  
	/**
	*  set variable bS8
	*  Corresponding COBOL Variable is WS-8B-S
	*  @param value
	**/
   public void setBS8(char[] value) {
       value = checkBS8Constraints(value);
       arraycopy(value,0,bS8,0,value.length);
   } 
	public void setBS8(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,bS8,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of aS12
	 *	@return aS12
	 */
   public char[] getAS12() throws CFException{
   		return aS12;
   }

  
	/**
	*  set variable aS12
	*  Corresponding COBOL Variable is WS-12A-S
	*  @param value
	**/
   public void setAS12(char[] value) {
       value = checkAS12Constraints(value);
       arraycopy(value,0,aS12,0,value.length);
   } 
	public void setAS12(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,aS12,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of bS12
	 *	@return bS12
	 */
   public char[] getBS12() throws CFException{
   		return bS12;
   }

  
	/**
	*  set variable bS12
	*  Corresponding COBOL Variable is WS-12B-S
	*  @param value
	**/
   public void setBS12(char[] value) {
       value = checkBS12Constraints(value);
       arraycopy(value,0,bS12,0,value.length);
   } 
	public void setBS12(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,bS12,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of aS18
	 *	@return aS18
	 */
   public char[] getAS18() throws CFException{
   		return aS18;
   }

  
	/**
	*  set variable aS18
	*  Corresponding COBOL Variable is WS-18A-S
	*  @param value
	**/
   public void setAS18(char[] value) {
       value = checkAS18Constraints(value);
       arraycopy(value,0,aS18,0,value.length);
   } 
	public void setAS18(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,aS18,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of bS18
	 *	@return bS18
	 */
   public char[] getBS18() throws CFException{
   		return bS18;
   }

  
	/**
	*  set variable bS18
	*  Corresponding COBOL Variable is WS-18B-S
	*  @param value
	**/
   public void setBS18(char[] value) {
       value = checkBS18Constraints(value);
       arraycopy(value,0,bS18,0,value.length);
   } 
	public void setBS18(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,bS18,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of aS20
	 *	@return aS20
	 */
   public char[] getAS20() throws CFException{
   		return aS20;
   }

  
	/**
	*  set variable aS20
	*  Corresponding COBOL Variable is WS-20A-S
	*  @param value
	**/
   public void setAS20(char[] value) {
       value = checkAS20Constraints(value);
       arraycopy(value,0,aS20,0,value.length);
   } 
	public void setAS20(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,aS20,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of bS20
	 *	@return bS20
	 */
   public char[] getBS20() throws CFException{
   		return bS20;
   }

  
	/**
	*  set variable bS20
	*  Corresponding COBOL Variable is WS-20B-S
	*  @param value
	**/
   public void setBS20(char[] value) {
       value = checkBS20Constraints(value);
       arraycopy(value,0,bS20,0,value.length);
   } 
	public void setBS20(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,bS20,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wse2aS
	 *	@return wse2aS
	 */
   public char[] getWse2aS() throws CFException{
   		return wse2aS;
   }

  
	/**
	*  set variable wse2aS
	*  Corresponding COBOL Variable is WSE-2A-S
	*  @param value
	**/
   public void setWse2aS(char[] value) {
       value = checkWse2aSConstraints(value);
       arraycopy(value,0,wse2aS,0,value.length);
   } 
	public void setWse2aS(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wse2aS,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wse2bS
	 *	@return wse2bS
	 */
   public char[] getWse2bS() throws CFException{
   		return wse2bS;
   }

  
	/**
	*  set variable wse2bS
	*  Corresponding COBOL Variable is WSE-2B-S
	*  @param value
	**/
   public void setWse2bS(char[] value) {
       value = checkWse2bSConstraints(value);
       arraycopy(value,0,wse2bS,0,value.length);
   } 
	public void setWse2bS(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wse2bS,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wse4aS
	 *	@return wse4aS
	 */
   public char[] getWse4aS() throws CFException{
   		return wse4aS;
   }

  
	/**
	*  set variable wse4aS
	*  Corresponding COBOL Variable is WSE-4A-S
	*  @param value
	**/
   public void setWse4aS(char[] value) {
       value = checkWse4aSConstraints(value);
       arraycopy(value,0,wse4aS,0,value.length);
   } 
	public void setWse4aS(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wse4aS,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wse4bS
	 *	@return wse4bS
	 */
   public char[] getWse4bS() throws CFException{
   		return wse4bS;
   }

  
	/**
	*  set variable wse4bS
	*  Corresponding COBOL Variable is WSE-4B-S
	*  @param value
	**/
   public void setWse4bS(char[] value) {
       value = checkWse4bSConstraints(value);
       arraycopy(value,0,wse4bS,0,value.length);
   } 
	public void setWse4bS(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wse4bS,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wse8aS
	 *	@return wse8aS
	 */
   public char[] getWse8aS() throws CFException{
   		return wse8aS;
   }

  
	/**
	*  set variable wse8aS
	*  Corresponding COBOL Variable is WSE-8A-S
	*  @param value
	**/
   public void setWse8aS(char[] value) {
       value = checkWse8aSConstraints(value);
       arraycopy(value,0,wse8aS,0,value.length);
   } 
	public void setWse8aS(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wse8aS,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wse8bS
	 *	@return wse8bS
	 */
   public char[] getWse8bS() throws CFException{
   		return wse8bS;
   }

  
	/**
	*  set variable wse8bS
	*  Corresponding COBOL Variable is WSE-8B-S
	*  @param value
	**/
   public void setWse8bS(char[] value) {
       value = checkWse8bSConstraints(value);
       arraycopy(value,0,wse8bS,0,value.length);
   } 
	public void setWse8bS(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wse8bS,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wse12aS
	 *	@return wse12aS
	 */
   public char[] getWse12aS() throws CFException{
   		return wse12aS;
   }

  
	/**
	*  set variable wse12aS
	*  Corresponding COBOL Variable is WSE-12A-S
	*  @param value
	**/
   public void setWse12aS(char[] value) {
       value = checkWse12aSConstraints(value);
       arraycopy(value,0,wse12aS,0,value.length);
   } 
	public void setWse12aS(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wse12aS,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wse12bS
	 *	@return wse12bS
	 */
   public char[] getWse12bS() throws CFException{
   		return wse12bS;
   }

  
	/**
	*  set variable wse12bS
	*  Corresponding COBOL Variable is WSE-12B-S
	*  @param value
	**/
   public void setWse12bS(char[] value) {
       value = checkWse12bSConstraints(value);
       arraycopy(value,0,wse12bS,0,value.length);
   } 
	public void setWse12bS(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wse12bS,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wse18aS
	 *	@return wse18aS
	 */
   public char[] getWse18aS() throws CFException{
   		return wse18aS;
   }

  
	/**
	*  set variable wse18aS
	*  Corresponding COBOL Variable is WSE-18A-S
	*  @param value
	**/
   public void setWse18aS(char[] value) {
       value = checkWse18aSConstraints(value);
       arraycopy(value,0,wse18aS,0,value.length);
   } 
	public void setWse18aS(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wse18aS,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wse18bS
	 *	@return wse18bS
	 */
   public char[] getWse18bS() throws CFException{
   		return wse18bS;
   }

  
	/**
	*  set variable wse18bS
	*  Corresponding COBOL Variable is WSE-18B-S
	*  @param value
	**/
   public void setWse18bS(char[] value) {
       value = checkWse18bSConstraints(value);
       arraycopy(value,0,wse18bS,0,value.length);
   } 
	public void setWse18bS(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wse18bS,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wse20aS
	 *	@return wse20aS
	 */
   public char[] getWse20aS() throws CFException{
   		return wse20aS;
   }

  
	/**
	*  set variable wse20aS
	*  Corresponding COBOL Variable is WSE-20A-S
	*  @param value
	**/
   public void setWse20aS(char[] value) {
       value = checkWse20aSConstraints(value);
       arraycopy(value,0,wse20aS,0,value.length);
   } 
	public void setWse20aS(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wse20aS,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wse20bS
	 *	@return wse20bS
	 */
   public char[] getWse20bS() throws CFException{
   		return wse20bS;
   }

  
	/**
	*  set variable wse20bS
	*  Corresponding COBOL Variable is WSE-20B-S
	*  @param value
	**/
   public void setWse20bS(char[] value) {
       value = checkWse20bSConstraints(value);
       arraycopy(value,0,wse20bS,0,value.length);
   } 
	public void setWse20bS(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wse20bS,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
