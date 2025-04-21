package com.cloudframe.app.usbaeext.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/


import com.cloudframe.app.usbaeext.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


public class Work extends WorkSerialized {
   

						private char[] waEndSw = new char[1];

								private int waReturnCode;

								private long tmAdjNo;

								private long tmAdjTime;

						private char[] tmAdjAcct = Field.fillLowValue(18);

						private char[] tmAdjDepDdrKey = Field.fillLowValue(8);

						private char[] tmAdjPset = Field.fillLowValue(1);

						private char[] tmAdjDdrKey = Field.fillLowValue(8);

						private char[] tmAdjDepAcct = Field.fillLowValue(18);

								private BigDecimal tmAdjDepAmt = BigDecimal.ZERO;

								private BigDecimal tmAdjCorrAmt = BigDecimal.ZERO;

						private char[] tmAdjClass = Field.fillLowValue(2);

						private char[] tmAdjCode = Field.fillLowValue(3);

						private char[] tmAdjName = Field.fillLowValue(15);

						private char[] tmAdjOperNo = Field.fillLowValue(3);

						private char[] tmAdjEntryKey = Field.fillLowValue(5);

						private char[] tmAdjState = Field.fillLowValue(3);

						private char[] tmAdjComment = Field.fillLowValue(50);

						private char[] tmAdjRt = Field.fillLowValue(9);

								private BigDecimal tmAdjAmt = BigDecimal.ZERO;

						private char[] tmAdjItemClass = Field.fillLowValue(2);

						private char[] tmAdjFirstDrn = Field.fillLowValue(20);

						private char[] tmAdjDrn = Field.fillLowValue(20);

						private char[] tmAdjLookupText = Field.fillLowValue(30);

						private char[] tmAdjAdviceKey = Field.fillLowValue(8);

						private char[] tmAdjCorrF5 = Field.fillLowValue(10);

						private char[] tmAdjDepF5 = Field.fillLowValue(10);

						private char[] tmAdjAppInstance = Field.fillLowValue(2);

						private char[] tmAdjEntry = Field.fillLowValue(4);

						private char[] tmAdjCycle = Field.fillLowValue(1);

						private char[] tmAdjEnd = Field.fillLowValue(3);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setWaEndSw(fillLowValue(1));
								setWaReturnCode(0);
    }


 

	/**
	 *	Returns the value of waEndSw
	 *	@return waEndSw
	 */
   public char[] getWaEndSw() throws CFException{
   		return waEndSw;
   }

  
	/**
	*  set variable waEndSw
	*  Corresponding COBOL Variable is WA-END-SW
	*  @param value
	**/
   public void setWaEndSw(char[] value) {
       value = checkWaEndSwConstraints(value);
       arraycopy(value,0,waEndSw,0,value.length);
   } 
	public void setWaEndSw(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,waEndSw,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of waReturnCode
	 *	@return waReturnCode
	 */
	public int getWaReturnCode() throws CFException {
   		return waReturnCode;
	}
	
	/**
	 * 	Update WaReturnCode with the passed value
	 *  Corresponding COBOL Variable is WA-RETURN-CODE
	 *	@param number
	 */
	public void setWaReturnCode(int number) {
	     // Truncate if the number is beyond +/- Max range
	    waReturnCode = checkWaReturnCodeMaxLimit(number); 
	}


	public void setWaReturnCode(long number) {
	    number = checkWaReturnCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWaReturnCode((int)number);
	}
	
	/**
	 *	Returns the value of tmAdjNo
	 *	@return tmAdjNo
	 */
	public long getTmAdjNo() throws CFException {
       if (isTmAdjNoModified()) { 
           tmAdjNo = refreshTmAdjNo();
        }
   		return tmAdjNo;
	}
	

	
	   
	/**
	 * 	Update TmAdjNo with the passed value
	 *  Corresponding COBOL Variable is TM-ADJ-NO
	 *	@param number
	 */
	public void setTmAdjNo(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    tmAdjNo = checkTmAdjNoMaxLimit(number); 
		serializeTmAdjNo(tmAdjNo);
	}
	

	/**
	 * 	Update TmAdjNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setTmAdjNo(char[] value) throws CFException {
		 tmAdjNo = serializeTmAdjNo(value);
	}
	/**
	 * 	Update TmAdjNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTmAdjNoString(char[] value) throws CFException {
		 setTmAdjNo(value);
	}
	/**
	 *	Returns the value of tmAdjTime
	 *	@return tmAdjTime
	 */
	public long getTmAdjTime() throws CFException {
       if (isTmAdjTimeModified()) { 
           tmAdjTime = refreshTmAdjTime();
        }
   		return tmAdjTime;
	}
	

	
	   
	/**
	 * 	Update TmAdjTime with the passed value
	 *  Corresponding COBOL Variable is TM-ADJ-TIME
	 *	@param number
	 */
	public void setTmAdjTime(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    tmAdjTime = checkTmAdjTimeMaxLimit(number); 
		serializeTmAdjTime(tmAdjTime);
	}
	

	/**
	 * 	Update TmAdjTime with the passed value
	 *	@param value (String or char[])
	 */
	public void setTmAdjTime(char[] value) throws CFException {
		 tmAdjTime = serializeTmAdjTime(value);
	}
	/**
	 * 	Update TmAdjTime with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTmAdjTimeString(char[] value) throws CFException {
		 setTmAdjTime(value);
	}
	/**
	 *	Returns the value of tmAdjAcct
	 *	@return tmAdjAcct
	 */
   public char[] getTmAdjAcct() throws CFException{
   		return tmAdjAcct;
   }

  
	/**
	*  set variable tmAdjAcct
	*  Corresponding COBOL Variable is TM-ADJ-ACCT
	*  @param value
	**/
   public void setTmAdjAcct(char[] value) {
       value = checkTmAdjAcctConstraints(value);
       arraycopy(value,0,tmAdjAcct,0,value.length);
   } 
	public void setTmAdjAcct(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tmAdjAcct,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tmAdjDepDdrKey
	 *	@return tmAdjDepDdrKey
	 */
   public char[] getTmAdjDepDdrKey() throws CFException{
   		return tmAdjDepDdrKey;
   }

  
	/**
	*  set variable tmAdjDepDdrKey
	*  Corresponding COBOL Variable is TM-ADJ-DEP-DDR-KEY
	*  @param value
	**/
   public void setTmAdjDepDdrKey(char[] value) {
       value = checkTmAdjDepDdrKeyConstraints(value);
       arraycopy(value,0,tmAdjDepDdrKey,0,value.length);
   } 
	public void setTmAdjDepDdrKey(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tmAdjDepDdrKey,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tmAdjPset
	 *	@return tmAdjPset
	 */
   public char[] getTmAdjPset() throws CFException{
   		return tmAdjPset;
   }

  
	/**
	*  set variable tmAdjPset
	*  Corresponding COBOL Variable is TM-ADJ-PSET
	*  @param value
	**/
   public void setTmAdjPset(char[] value) {
       value = checkTmAdjPsetConstraints(value);
       arraycopy(value,0,tmAdjPset,0,value.length);
   } 
	public void setTmAdjPset(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tmAdjPset,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tmAdjDdrKey
	 *	@return tmAdjDdrKey
	 */
   public char[] getTmAdjDdrKey() throws CFException{
   		return tmAdjDdrKey;
   }

  
	/**
	*  set variable tmAdjDdrKey
	*  Corresponding COBOL Variable is TM-ADJ-DDR-KEY
	*  @param value
	**/
   public void setTmAdjDdrKey(char[] value) {
       value = checkTmAdjDdrKeyConstraints(value);
       arraycopy(value,0,tmAdjDdrKey,0,value.length);
   } 
	public void setTmAdjDdrKey(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tmAdjDdrKey,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tmAdjDepAcct
	 *	@return tmAdjDepAcct
	 */
   public char[] getTmAdjDepAcct() throws CFException{
   		return tmAdjDepAcct;
   }

  
	/**
	*  set variable tmAdjDepAcct
	*  Corresponding COBOL Variable is TM-ADJ-DEP-ACCT
	*  @param value
	**/
   public void setTmAdjDepAcct(char[] value) {
       value = checkTmAdjDepAcctConstraints(value);
       arraycopy(value,0,tmAdjDepAcct,0,value.length);
   } 
	public void setTmAdjDepAcct(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tmAdjDepAcct,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tmAdjDepAmt
	 *	@return tmAdjDepAmt
	 */
	public BigDecimal getTmAdjDepAmt() throws CFException {
       if (isTmAdjDepAmtModified()) { 
           tmAdjDepAmt = refreshTmAdjDepAmt();
        }
   		return tmAdjDepAmt;
	}
	

	
	   
	/**
	 * 	Update TmAdjDepAmt with the passed number
	 *  Corresponding COBOL Variable is TM-ADJ-DEP-AMT
	 *	@param number
	 */
	public void setTmAdjDepAmt(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       tmAdjDepAmt = checkTmAdjDepAmtMaxLimit(number);
	    serializeTmAdjDepAmt(tmAdjDepAmt);
   }
	/**
	 * 	Update TmAdjDepAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setTmAdjDepAmt(char[] value) throws CFException {
		 tmAdjDepAmt = serializeTmAdjDepAmt(value);
	}   
	/**
	 *	Returns the value of tmAdjCorrAmt
	 *	@return tmAdjCorrAmt
	 */
	public BigDecimal getTmAdjCorrAmt() throws CFException {
       if (isTmAdjCorrAmtModified()) { 
           tmAdjCorrAmt = refreshTmAdjCorrAmt();
        }
   		return tmAdjCorrAmt;
	}
	

	
	   
	/**
	 * 	Update TmAdjCorrAmt with the passed number
	 *  Corresponding COBOL Variable is TM-ADJ-CORR-AMT
	 *	@param number
	 */
	public void setTmAdjCorrAmt(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       tmAdjCorrAmt = checkTmAdjCorrAmtMaxLimit(number);
	    serializeTmAdjCorrAmt(tmAdjCorrAmt);
   }
	/**
	 * 	Update TmAdjCorrAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setTmAdjCorrAmt(char[] value) throws CFException {
		 tmAdjCorrAmt = serializeTmAdjCorrAmt(value);
	}   
	/**
	 *	Returns the value of tmAdjClass
	 *	@return tmAdjClass
	 */
   public char[] getTmAdjClass() throws CFException{
   		return tmAdjClass;
   }

  
	/**
	*  set variable tmAdjClass
	*  Corresponding COBOL Variable is TM-ADJ-CLASS
	*  @param value
	**/
   public void setTmAdjClass(char[] value) {
       value = checkTmAdjClassConstraints(value);
       arraycopy(value,0,tmAdjClass,0,value.length);
   } 
	public void setTmAdjClass(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tmAdjClass,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tmAdjCode
	 *	@return tmAdjCode
	 */
   public char[] getTmAdjCode() throws CFException{
   		return tmAdjCode;
   }

  
	/**
	*  set variable tmAdjCode
	*  Corresponding COBOL Variable is TM-ADJ-CODE
	*  @param value
	**/
   public void setTmAdjCode(char[] value) {
       value = checkTmAdjCodeConstraints(value);
       arraycopy(value,0,tmAdjCode,0,value.length);
   } 
	public void setTmAdjCode(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tmAdjCode,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tmAdjName
	 *	@return tmAdjName
	 */
   public char[] getTmAdjName() throws CFException{
   		return tmAdjName;
   }

  
	/**
	*  set variable tmAdjName
	*  Corresponding COBOL Variable is TM-ADJ-NAME
	*  @param value
	**/
   public void setTmAdjName(char[] value) {
       value = checkTmAdjNameConstraints(value);
       arraycopy(value,0,tmAdjName,0,value.length);
   } 
	public void setTmAdjName(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tmAdjName,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tmAdjOperNo
	 *	@return tmAdjOperNo
	 */
   public char[] getTmAdjOperNo() throws CFException{
   		return tmAdjOperNo;
   }

  
	/**
	*  set variable tmAdjOperNo
	*  Corresponding COBOL Variable is TM-ADJ-OPER-NO
	*  @param value
	**/
   public void setTmAdjOperNo(char[] value) {
       value = checkTmAdjOperNoConstraints(value);
       arraycopy(value,0,tmAdjOperNo,0,value.length);
   } 
	public void setTmAdjOperNo(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tmAdjOperNo,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tmAdjEntryKey
	 *	@return tmAdjEntryKey
	 */
   public char[] getTmAdjEntryKey() throws CFException{
   		return tmAdjEntryKey;
   }

  
	/**
	*  set variable tmAdjEntryKey
	*  Corresponding COBOL Variable is TM-ADJ-ENTRY-KEY
	*  @param value
	**/
   public void setTmAdjEntryKey(char[] value) {
       value = checkTmAdjEntryKeyConstraints(value);
       arraycopy(value,0,tmAdjEntryKey,0,value.length);
   } 
	public void setTmAdjEntryKey(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tmAdjEntryKey,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tmAdjState
	 *	@return tmAdjState
	 */
   public char[] getTmAdjState() throws CFException{
   		return tmAdjState;
   }

  
	/**
	*  set variable tmAdjState
	*  Corresponding COBOL Variable is TM-ADJ-STATE
	*  @param value
	**/
   public void setTmAdjState(char[] value) {
       value = checkTmAdjStateConstraints(value);
       arraycopy(value,0,tmAdjState,0,value.length);
   } 
	public void setTmAdjState(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tmAdjState,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tmAdjComment
	 *	@return tmAdjComment
	 */
   public char[] getTmAdjComment() throws CFException{
   		return tmAdjComment;
   }

  
	/**
	*  set variable tmAdjComment
	*  Corresponding COBOL Variable is TM-ADJ-COMMENT
	*  @param value
	**/
   public void setTmAdjComment(char[] value) {
       value = checkTmAdjCommentConstraints(value);
       arraycopy(value,0,tmAdjComment,0,value.length);
   } 
	public void setTmAdjComment(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tmAdjComment,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tmAdjRt
	 *	@return tmAdjRt
	 */
   public char[] getTmAdjRt() throws CFException{
   		return tmAdjRt;
   }

  
	/**
	*  set variable tmAdjRt
	*  Corresponding COBOL Variable is TM-ADJ-RT
	*  @param value
	**/
   public void setTmAdjRt(char[] value) {
       value = checkTmAdjRtConstraints(value);
       arraycopy(value,0,tmAdjRt,0,value.length);
   } 
	public void setTmAdjRt(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tmAdjRt,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tmAdjAmt
	 *	@return tmAdjAmt
	 */
	public BigDecimal getTmAdjAmt() throws CFException {
       if (isTmAdjAmtModified()) { 
           tmAdjAmt = refreshTmAdjAmt();
        }
   		return tmAdjAmt;
	}
	

	
	   
	/**
	 * 	Update TmAdjAmt with the passed number
	 *  Corresponding COBOL Variable is TM-ADJ-AMT
	 *	@param number
	 */
	public void setTmAdjAmt(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       tmAdjAmt = checkTmAdjAmtMaxLimit(number);
	    serializeTmAdjAmt(tmAdjAmt);
   }
	/**
	 * 	Update TmAdjAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setTmAdjAmt(char[] value) throws CFException {
		 tmAdjAmt = serializeTmAdjAmt(value);
	}   
	/**
	 *	Returns the value of tmAdjItemClass
	 *	@return tmAdjItemClass
	 */
   public char[] getTmAdjItemClass() throws CFException{
   		return tmAdjItemClass;
   }

  
	/**
	*  set variable tmAdjItemClass
	*  Corresponding COBOL Variable is TM-ADJ-ITEM-CLASS
	*  @param value
	**/
   public void setTmAdjItemClass(char[] value) {
       value = checkTmAdjItemClassConstraints(value);
       arraycopy(value,0,tmAdjItemClass,0,value.length);
   } 
	public void setTmAdjItemClass(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tmAdjItemClass,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tmAdjFirstDrn
	 *	@return tmAdjFirstDrn
	 */
   public char[] getTmAdjFirstDrn() throws CFException{
   		return tmAdjFirstDrn;
   }

  
	/**
	*  set variable tmAdjFirstDrn
	*  Corresponding COBOL Variable is TM-ADJ-FIRST-DRN
	*  @param value
	**/
   public void setTmAdjFirstDrn(char[] value) {
       value = checkTmAdjFirstDrnConstraints(value);
       arraycopy(value,0,tmAdjFirstDrn,0,value.length);
   } 
	public void setTmAdjFirstDrn(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tmAdjFirstDrn,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tmAdjDrn
	 *	@return tmAdjDrn
	 */
   public char[] getTmAdjDrn() throws CFException{
   		return tmAdjDrn;
   }

  
	/**
	*  set variable tmAdjDrn
	*  Corresponding COBOL Variable is TM-ADJ-DRN
	*  @param value
	**/
   public void setTmAdjDrn(char[] value) {
       value = checkTmAdjDrnConstraints(value);
       arraycopy(value,0,tmAdjDrn,0,value.length);
   } 
	public void setTmAdjDrn(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tmAdjDrn,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tmAdjLookupText
	 *	@return tmAdjLookupText
	 */
   public char[] getTmAdjLookupText() throws CFException{
   		return tmAdjLookupText;
   }

  
	/**
	*  set variable tmAdjLookupText
	*  Corresponding COBOL Variable is TM-ADJ-LOOKUP-TEXT
	*  @param value
	**/
   public void setTmAdjLookupText(char[] value) {
       value = checkTmAdjLookupTextConstraints(value);
       arraycopy(value,0,tmAdjLookupText,0,value.length);
   } 
	public void setTmAdjLookupText(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tmAdjLookupText,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tmAdjAdviceKey
	 *	@return tmAdjAdviceKey
	 */
   public char[] getTmAdjAdviceKey() throws CFException{
   		return tmAdjAdviceKey;
   }

  
	/**
	*  set variable tmAdjAdviceKey
	*  Corresponding COBOL Variable is TM-ADJ-ADVICE-KEY
	*  @param value
	**/
   public void setTmAdjAdviceKey(char[] value) {
       value = checkTmAdjAdviceKeyConstraints(value);
       arraycopy(value,0,tmAdjAdviceKey,0,value.length);
   } 
	public void setTmAdjAdviceKey(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tmAdjAdviceKey,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tmAdjCorrF5
	 *	@return tmAdjCorrF5
	 */
   public char[] getTmAdjCorrF5() throws CFException{
   		return tmAdjCorrF5;
   }

  
	/**
	*  set variable tmAdjCorrF5
	*  Corresponding COBOL Variable is TM-ADJ-CORR-F5
	*  @param value
	**/
   public void setTmAdjCorrF5(char[] value) {
       value = checkTmAdjCorrF5Constraints(value);
       arraycopy(value,0,tmAdjCorrF5,0,value.length);
   } 
	public void setTmAdjCorrF5(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tmAdjCorrF5,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tmAdjDepF5
	 *	@return tmAdjDepF5
	 */
   public char[] getTmAdjDepF5() throws CFException{
   		return tmAdjDepF5;
   }

  
	/**
	*  set variable tmAdjDepF5
	*  Corresponding COBOL Variable is TM-ADJ-DEP-F5
	*  @param value
	**/
   public void setTmAdjDepF5(char[] value) {
       value = checkTmAdjDepF5Constraints(value);
       arraycopy(value,0,tmAdjDepF5,0,value.length);
   } 
	public void setTmAdjDepF5(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tmAdjDepF5,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tmAdjAppInstance
	 *	@return tmAdjAppInstance
	 */
   public char[] getTmAdjAppInstance() throws CFException{
   		return tmAdjAppInstance;
   }

  
	/**
	*  set variable tmAdjAppInstance
	*  Corresponding COBOL Variable is TM-ADJ-APP-INSTANCE
	*  @param value
	**/
   public void setTmAdjAppInstance(char[] value) {
       value = checkTmAdjAppInstanceConstraints(value);
       arraycopy(value,0,tmAdjAppInstance,0,value.length);
   } 
	public void setTmAdjAppInstance(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tmAdjAppInstance,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tmAdjEntry
	 *	@return tmAdjEntry
	 */
   public char[] getTmAdjEntry() throws CFException{
   		return tmAdjEntry;
   }

  
	/**
	*  set variable tmAdjEntry
	*  Corresponding COBOL Variable is TM-ADJ-ENTRY
	*  @param value
	**/
   public void setTmAdjEntry(char[] value) {
       value = checkTmAdjEntryConstraints(value);
       arraycopy(value,0,tmAdjEntry,0,value.length);
   } 
	public void setTmAdjEntry(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tmAdjEntry,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tmAdjCycle
	 *	@return tmAdjCycle
	 */
   public char[] getTmAdjCycle() throws CFException{
   		return tmAdjCycle;
   }

  
	/**
	*  set variable tmAdjCycle
	*  Corresponding COBOL Variable is TM-ADJ-CYCLE
	*  @param value
	**/
   public void setTmAdjCycle(char[] value) {
       value = checkTmAdjCycleConstraints(value);
       arraycopy(value,0,tmAdjCycle,0,value.length);
   } 
	public void setTmAdjCycle(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tmAdjCycle,0,beginIndex + endIndex);
   }
	
	/**
	 *	Test condition "1" THRU "5" for isTmValidCycle()
	 *	@return  Returns true if isTmValidCycle() is "1" THRU "5"
	 */
   public boolean isTmValidCycle() throws CFException {
      return (  isGreaterOrEqual(getTmAdjCycle(), "1" ) &&  isLessOrEqual(getTmAdjCycle(),"5" )  );
   }


	/**
	*  set values "1" THRU "5"
	*/
   	public void setTmValidCycleTrue() {  			
    	setTmAdjCycle( "1".toCharArray());
   	}
	/**
	 *	Returns the value of tmAdjEnd
	 *	@return tmAdjEnd
	 */
   public char[] getTmAdjEnd() throws CFException{
   		return tmAdjEnd;
   }

  
	/**
	*  set variable tmAdjEnd
	*  Corresponding COBOL Variable is TM-ADJ-END
	*  @param value
	**/
   public void setTmAdjEnd(char[] value) {
       value = checkTmAdjEndConstraints(value);
       arraycopy(value,0,tmAdjEnd,0,value.length);
   } 
	public void setTmAdjEnd(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tmAdjEnd,0,beginIndex + endIndex);
   }
	char[] tmValidEnd88Value = "END".toCharArray();
	/**
	 *	Test condition "END" for isTmValidEnd()
	 *	@return  Returns true if isTmValidEnd() is "END"
	 */
   public boolean isTmValidEnd() throws CFException {
      return (  compareChars( getTmAdjEnd() , tmValidEnd88Value)  == 0  );
   }


	/**
	*  set values "END"
	*/
   	public void setTmValidEndTrue() {  			
    	setTmAdjEnd( tmValidEnd88Value);
   	}

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
