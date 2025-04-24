package com.cloudframe.app.init1.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized { 
   

						private char[] cDisplayJobnme = Field.fillLowValue(8);

						private char[] delayedCpduInd = new char[1];

						private char[] rejectCd = new char[3];

						private char[] bypassAcctFlag = new char[1];

						private char[] errRejFlag = new char[1];

						private char[] paygoSplanTableX = Field.fillLowValue(52);

								private short messageMaxCnt;

								private int i1;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDelayedCpduInd(("N").toCharArray());
								setRejectCd(fillSpace(3));
								setBypassAcctFlag(fillSpace(1));
								setErrRejFlag(fillSpace(1));
								setMessageMaxCnt((short)10);
								setI1(0);
    }


 

	/**
	 *	Returns the value of cDisplayJobnme
	 *	@return cDisplayJobnme
	 */
   public char[] getCDisplayJobnme() throws CFException{
   		return cDisplayJobnme;
   }

  
	/**
	*  set variable cDisplayJobnme
	*  Corresponding COBOL Variable is C-DISPLAY-JOBNME
	*  @param value
	**/
   public void setCDisplayJobnme(char[] value) {
       value = checkCDisplayJobnmeConstraints(value);
       arraycopy(value,0,cDisplayJobnme,0,value.length);
   } 
	public void setCDisplayJobnme(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,cDisplayJobnme,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of delayedCpduInd
	 *	@return delayedCpduInd
	 */
   public char[] getDelayedCpduInd() throws CFException{
   		return delayedCpduInd;
   }

  
	/**
	*  set variable delayedCpduInd
	*  Corresponding COBOL Variable is WS-DELAYED-CPDU-IND
	*  @param value
	**/
   public void setDelayedCpduInd(char[] value) {
       value = checkDelayedCpduIndConstraints(value);
       arraycopy(value,0,delayedCpduInd,0,value.length);
   } 
	public void setDelayedCpduInd(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,delayedCpduInd,0,beginIndex + endIndex);
   }
	char[] currentCpdu88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isCurrentCpdu()
	 *	@return  Returns true if isCurrentCpdu() is "N"
	 */
   public boolean isCurrentCpdu() throws CFException {
      return (  compareChars( getDelayedCpduInd() , currentCpdu88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setCurrentCpduTrue() {  			
    	setDelayedCpduInd( currentCpdu88Value);
   	}
	char[] delayedCpdu88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isDelayedCpdu()
	 *	@return  Returns true if isDelayedCpdu() is "Y"
	 */
   public boolean isDelayedCpdu() throws CFException {
      return (  compareChars( getDelayedCpduInd() , delayedCpdu88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setDelayedCpduTrue() {  			
    	setDelayedCpduInd( delayedCpdu88Value);
   	}
	/**
	 *	Returns the value of rejectCd
	 *	@return rejectCd
	 */
   public char[] getRejectCd() throws CFException{
   		return rejectCd;
   }

  
	/**
	*  set variable rejectCd
	*  Corresponding COBOL Variable is WS-REJECT-CD
	*  @param value
	**/
   public void setRejectCd(char[] value) {
       value = checkRejectCdConstraints(value);
       arraycopy(value,0,rejectCd,0,value.length);
   } 
	public void setRejectCd(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rejectCd,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of bypassAcctFlag
	 *	@return bypassAcctFlag
	 */
   public char[] getBypassAcctFlag() throws CFException{
   		return bypassAcctFlag;
   }

  
	/**
	*  set variable bypassAcctFlag
	*  Corresponding COBOL Variable is WS-BYPASS-ACCT-FLAG
	*  @param value
	**/
   public void setBypassAcctFlag(char[] value) {
       value = checkBypassAcctFlagConstraints(value);
       arraycopy(value,0,bypassAcctFlag,0,value.length);
   } 
	public void setBypassAcctFlag(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,bypassAcctFlag,0,beginIndex + endIndex);
   }
	char[] bypassAcctYes88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isBypassAcctYes()
	 *	@return  Returns true if isBypassAcctYes() is "Y"
	 */
   public boolean isBypassAcctYes() throws CFException {
      return (  compareChars( getBypassAcctFlag() , bypassAcctYes88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setBypassAcctYesTrue() {  			
    	setBypassAcctFlag( bypassAcctYes88Value);
   	}
	char[] bypassAcctNo88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isBypassAcctNo()
	 *	@return  Returns true if isBypassAcctNo() is "N"
	 */
   public boolean isBypassAcctNo() throws CFException {
      return (  compareChars( getBypassAcctFlag() , bypassAcctNo88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setBypassAcctNoTrue() {  			
    	setBypassAcctFlag( bypassAcctNo88Value);
   	}
	/**
	 *	Returns the value of errRejFlag
	 *	@return errRejFlag
	 */
   public char[] getErrRejFlag() throws CFException{
   		return errRejFlag;
   }

  
	/**
	*  set variable errRejFlag
	*  Corresponding COBOL Variable is WS-ERR-REJ-FLAG
	*  @param value
	**/
   public void setErrRejFlag(char[] value) {
       value = checkErrRejFlagConstraints(value);
       arraycopy(value,0,errRejFlag,0,value.length);
   } 
	public void setErrRejFlag(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,errRejFlag,0,beginIndex + endIndex);
   }
	char[] errRejYes88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isErrRejYes()
	 *	@return  Returns true if isErrRejYes() is "Y"
	 */
   public boolean isErrRejYes() throws CFException {
      return (  compareChars( getErrRejFlag() , errRejYes88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setErrRejYesTrue() {  			
    	setErrRejFlag( errRejYes88Value);
   	}
	char[] errRejNo88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isErrRejNo()
	 *	@return  Returns true if isErrRejNo() is "N"
	 */
   public boolean isErrRejNo() throws CFException {
      return (  compareChars( getErrRejFlag() , errRejNo88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setErrRejNoTrue() {  			
    	setErrRejFlag( errRejNo88Value);
   	}
	/**
	 *	Returns the value of paygoSplanTableX
	 *	@return paygoSplanTableX
	 */
   public char[] getPaygoSplanTableX() throws CFException{
   		return paygoSplanTableX;
   }

  
	/**
	*  set variable paygoSplanTableX
	*  Corresponding COBOL Variable is WS-PAYGO-SPLAN-TABLE-X
	*  @param value
	**/
   public void setPaygoSplanTableX(char[] value) {
       value = checkPaygoSplanTableXConstraints(value);
       arraycopy(value,0,paygoSplanTableX,0,value.length);
   } 
	public void setPaygoSplanTableX(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,paygoSplanTableX,0,beginIndex + endIndex);
   }
	public short getMessageMaxCnt() throws CFException {
        if (isMessageMaxCntModified()) { 
           messageMaxCnt = refreshMessageMaxCnt();
        }
   		return messageMaxCnt;
	}
	
	/**
	 * 	Update MessageMaxCnt with the passed value
	 *  Corresponding COBOL Variable is MESSAGE-MAX-CNT
	 *	@param number
	 */
	public void setMessageMaxCnt(short number) {
			messageMaxCnt = checkMessageMaxCntMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeMessageMaxCnt(messageMaxCnt);
	}

	public void setMessageMaxCnt(int number) {
	    number = checkMessageMaxCntMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMessageMaxCnt((short)number);
	}
	public void setMessageMaxCnt(long number) {
	    number = checkMessageMaxCntMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMessageMaxCnt((short)number);
	}
	

	/**
	 *	Returns the value of i1
	 *	@return i1
	 */
	public int getI1() throws CFException {
   		return i1;
	}
	
	/**
	 * 	Update I1 with the passed value
	 *  Corresponding COBOL Variable is I1
	 *	@param number
	 */
	public void setI1(int number) {
	     // Truncate if the number is beyond +/- Max range
	    i1 = checkI1MaxLimit(number); 
	}


	public void setI1(long number) {
	    number = checkI1MaxLimit(number); // Truncate if value is beyond +/- Max range
		setI1((int)number);
	}
	

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
