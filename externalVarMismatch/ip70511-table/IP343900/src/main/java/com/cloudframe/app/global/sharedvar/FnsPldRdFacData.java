package com.cloudframe.app.global.sharedvar;

/**
*  The class FnsPldRdFacData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class FnsPldRdFacData extends FnsPldRdFacDataSerialized { 
   

						private char[] fnsPldRdInsertTimestamp = Field.fillLowValue(26);

								private int fnsPldRdCycleIndicator;

								private long fnsPldRdMsgRsnCd;

								private long fnsPldRdChargebackAmt;

								private int fnsPldRdChargebackCurrCd;

						private char[] fnsPldRdChargebackExpCd = Field.fillLowValue(1);

						private char[] fnsPldRdReversalIndicator = Field.fillLowValue(1);

						private char[] fnsPldRdChargebackRefNo = Field.fillLowValue(10);

								private int fnsPldRdFuncCd;

						private char[] fnsPldRdSwitchSerialNum = Field.fillLowValue(9);

						private char[] fnsPldRdSourceCd = Field.fillLowValue(4);

								private short fnsPldRdCntCd;

						private char[] fnsPldRdOrigSwSerNum = Field.fillLowValue(9);
				private FnsPldRdCloseDt fnsPldRdCloseDt = new FnsPldRdCloseDt();

								private int fnsPldRdChgbkCnt;

						private char[] fnsPldRdRejRsn1Cd = Field.fillLowValue(4);

						private char[] fnsPldRdRejRsn2Cd = Field.fillLowValue(4);

						private char[] fnsPldRdVrtlAcctNum = Field.fillLowValue(19);
	
	/**
	* Constructor for FnsPldRdFacData
	**/
    public FnsPldRdFacData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for FnsPldRdFacData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FnsPldRdFacData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			fnsPldRdCloseDt.setParent(this,getStartOffset() + 89);
    } 

	/**
	 *	Returns the value of fnsPldRdInsertTimestamp
	 *	@return fnsPldRdInsertTimestamp
	 */
   public char[] getFnsPldRdInsertTimestamp() throws CFException{
     if (isFnsPldRdInsertTimestampModified()) { 
        fnsPldRdInsertTimestamp = refreshFnsPldRdInsertTimestamp();
     }
   		return fnsPldRdInsertTimestamp;
   }

  
	/**
	*  set variable fnsPldRdInsertTimestamp
	*  Corresponding COBOL Variable is FNS-PLD-RD-INSERT-TIMESTAMP
	*  @param value
	**/
   public void setFnsPldRdInsertTimestamp(char[] value) {
      fnsPldRdInsertTimestamp = checkFnsPldRdInsertTimestampConstraints(value);
      serializeFnsPldRdInsertTimestamp(fnsPldRdInsertTimestamp);
   } 

     /**
	 * 	Update FnsPldRdInsertTimestamp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdInsertTimestamp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFnsPldRdInsertTimestamp,fnsPldRdInsertTimestamp.length);
   	
   }
   
   public void setFnsPldRdInsertTimestamp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdInsertTimestamp,fnsPldRdInsertTimestamp.length);
   	
   }
   
     /**
	 * 	Update FnsPldRdInsertTimestamp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdInsertTimestamp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdInsertTimestamp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FnsPldRdInsertTimestamp with another Field
	 *	@param value
	 */
   public void setFnsPldRdInsertTimestamp(Field source) {
       replace(source,0,source.length(),beginFnsPldRdInsertTimestamp,FNS_PLD_RD_INSERT_TIMESTAMP_LEN);
   	
   }  
   
     /**
	 * 	Update FnsPldRdInsertTimestamp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPldRdInsertTimestamp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFnsPldRdInsertTimestamp,FNS_PLD_RD_INSERT_TIMESTAMP_LEN);
   	
   }
   
     /**
	 * 	Update FnsPldRdInsertTimestamp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdInsertTimestamp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdInsertTimestamp+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fnsPldRdCycleIndicator
	 *	@return fnsPldRdCycleIndicator
	 */
	public int getFnsPldRdCycleIndicator() throws CFException {
       if (isFnsPldRdCycleIndicatorModified()) { 
           fnsPldRdCycleIndicator = refreshFnsPldRdCycleIndicator();
        }
   		return fnsPldRdCycleIndicator;
	}
	

	
	   
	/**
	 * 	Update FnsPldRdCycleIndicator with the passed value
	 *  Corresponding COBOL Variable is FNS-PLD-RD-CYCLE-INDICATOR
	 *	@param number
	 */
	public void setFnsPldRdCycleIndicator(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    fnsPldRdCycleIndicator = checkFnsPldRdCycleIndicatorMaxLimit(number); 
		serializeFnsPldRdCycleIndicator(fnsPldRdCycleIndicator);
	}
	

	public void setFnsPldRdCycleIndicator(long number) {
	    number = checkFnsPldRdCycleIndicatorMaxLimit(number); // Truncate if value is beyond +/- Max range
		setFnsPldRdCycleIndicator((int)number);
	}
	
	/**
	 * 	Update FnsPldRdCycleIndicator with the passed value
	 *	@param value (String or char[])
	 */
	public void setFnsPldRdCycleIndicator(char[] value) throws CFException {
		 fnsPldRdCycleIndicator = serializeFnsPldRdCycleIndicator(value);
	}
	/**
	 * 	Update FnsPldRdCycleIndicator with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFnsPldRdCycleIndicatorString(char[] value) throws CFException {
		 setFnsPldRdCycleIndicator(value);
	}
	/**
	 *	Returns the value of fnsPldRdMsgRsnCd
	 *	@return fnsPldRdMsgRsnCd
	 */
	public long getFnsPldRdMsgRsnCd() throws CFException {
       if (isFnsPldRdMsgRsnCdModified()) { 
           fnsPldRdMsgRsnCd = refreshFnsPldRdMsgRsnCd();
        }
   		return fnsPldRdMsgRsnCd;
	}
	

	
	   
	/**
	 * 	Update FnsPldRdMsgRsnCd with the passed value
	 *  Corresponding COBOL Variable is FNS-PLD-RD-MSG-RSN-CD
	 *	@param number
	 */
	public void setFnsPldRdMsgRsnCd(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    fnsPldRdMsgRsnCd = checkFnsPldRdMsgRsnCdMaxLimit(number); 
		serializeFnsPldRdMsgRsnCd(fnsPldRdMsgRsnCd);
	}
	

	/**
	 * 	Update FnsPldRdMsgRsnCd with the passed value
	 *	@param value (String or char[])
	 */
	public void setFnsPldRdMsgRsnCd(char[] value) throws CFException {
		 fnsPldRdMsgRsnCd = serializeFnsPldRdMsgRsnCd(value);
	}
	/**
	 * 	Update FnsPldRdMsgRsnCd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFnsPldRdMsgRsnCdString(char[] value) throws CFException {
		 setFnsPldRdMsgRsnCd(value);
	}
	/**
	 *	Returns the value of fnsPldRdChargebackAmt
	 *	@return fnsPldRdChargebackAmt
	 */
	public long getFnsPldRdChargebackAmt() throws CFException {
       if (isFnsPldRdChargebackAmtModified()) { 
           fnsPldRdChargebackAmt = refreshFnsPldRdChargebackAmt();
        }
   		return fnsPldRdChargebackAmt;
	}
	

	
	   
	/**
	 * 	Update FnsPldRdChargebackAmt with the passed value
	 *  Corresponding COBOL Variable is FNS-PLD-RD-CHARGEBACK-AMT
	 *	@param number
	 */
	public void setFnsPldRdChargebackAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    fnsPldRdChargebackAmt = checkFnsPldRdChargebackAmtMaxLimit(number); 
		serializeFnsPldRdChargebackAmt(fnsPldRdChargebackAmt);
	}
	

	/**
	 * 	Update FnsPldRdChargebackAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setFnsPldRdChargebackAmt(char[] value) throws CFException {
		 fnsPldRdChargebackAmt = serializeFnsPldRdChargebackAmt(value);
	}
	/**
	 * 	Update FnsPldRdChargebackAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFnsPldRdChargebackAmtString(char[] value) throws CFException {
		 setFnsPldRdChargebackAmt(value);
	}
	/**
	 *	Returns the value of fnsPldRdChargebackCurrCd
	 *	@return fnsPldRdChargebackCurrCd
	 */
	public int getFnsPldRdChargebackCurrCd() throws CFException {
       if (isFnsPldRdChargebackCurrCdModified()) { 
           fnsPldRdChargebackCurrCd = refreshFnsPldRdChargebackCurrCd();
        }
   		return fnsPldRdChargebackCurrCd;
	}
	

	
	   
	/**
	 * 	Update FnsPldRdChargebackCurrCd with the passed value
	 *  Corresponding COBOL Variable is FNS-PLD-RD-CHARGEBACK-CURR-CD
	 *	@param number
	 */
	public void setFnsPldRdChargebackCurrCd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    fnsPldRdChargebackCurrCd = checkFnsPldRdChargebackCurrCdMaxLimit(number); 
		serializeFnsPldRdChargebackCurrCd(fnsPldRdChargebackCurrCd);
	}
	

	public void setFnsPldRdChargebackCurrCd(long number) {
	    number = checkFnsPldRdChargebackCurrCdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setFnsPldRdChargebackCurrCd((int)number);
	}
	
	/**
	 * 	Update FnsPldRdChargebackCurrCd with the passed value
	 *	@param value (String or char[])
	 */
	public void setFnsPldRdChargebackCurrCd(char[] value) throws CFException {
		 fnsPldRdChargebackCurrCd = serializeFnsPldRdChargebackCurrCd(value);
	}
	/**
	 * 	Update FnsPldRdChargebackCurrCd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFnsPldRdChargebackCurrCdString(char[] value) throws CFException {
		 setFnsPldRdChargebackCurrCd(value);
	}
	/**
	 *	Returns the value of fnsPldRdChargebackExpCd
	 *	@return fnsPldRdChargebackExpCd
	 */
   public char[] getFnsPldRdChargebackExpCd() throws CFException{
     if (isFnsPldRdChargebackExpCdModified()) { 
        fnsPldRdChargebackExpCd = refreshFnsPldRdChargebackExpCd();
     }
   		return fnsPldRdChargebackExpCd;
   }

  
	/**
	*  set variable fnsPldRdChargebackExpCd
	*  Corresponding COBOL Variable is FNS-PLD-RD-CHARGEBACK-EXP-CD
	*  @param value
	**/
   public void setFnsPldRdChargebackExpCd(char[] value) {
      fnsPldRdChargebackExpCd = checkFnsPldRdChargebackExpCdConstraints(value);
      serializeFnsPldRdChargebackExpCd(fnsPldRdChargebackExpCd);
   } 

     /**
	 * 	Update FnsPldRdChargebackExpCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdChargebackExpCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFnsPldRdChargebackExpCd,fnsPldRdChargebackExpCd.length);
   	
   }
   
   public void setFnsPldRdChargebackExpCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdChargebackExpCd,fnsPldRdChargebackExpCd.length);
   	
   }
   
     /**
	 * 	Update FnsPldRdChargebackExpCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdChargebackExpCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdChargebackExpCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FnsPldRdChargebackExpCd with another Field
	 *	@param value
	 */
   public void setFnsPldRdChargebackExpCd(Field source) {
       replace(source,0,source.length(),beginFnsPldRdChargebackExpCd,FNS_PLD_RD_CHARGEBACK_EXP_CD_LEN);
   	
   }  
   
     /**
	 * 	Update FnsPldRdChargebackExpCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPldRdChargebackExpCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFnsPldRdChargebackExpCd,FNS_PLD_RD_CHARGEBACK_EXP_CD_LEN);
   	
   }
   
     /**
	 * 	Update FnsPldRdChargebackExpCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdChargebackExpCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdChargebackExpCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fnsPldRdReversalIndicator
	 *	@return fnsPldRdReversalIndicator
	 */
   public char[] getFnsPldRdReversalIndicator() throws CFException{
     if (isFnsPldRdReversalIndicatorModified()) { 
        fnsPldRdReversalIndicator = refreshFnsPldRdReversalIndicator();
     }
   		return fnsPldRdReversalIndicator;
   }

  
	/**
	*  set variable fnsPldRdReversalIndicator
	*  Corresponding COBOL Variable is FNS-PLD-RD-REVERSAL-INDICATOR
	*  @param value
	**/
   public void setFnsPldRdReversalIndicator(char[] value) {
      fnsPldRdReversalIndicator = checkFnsPldRdReversalIndicatorConstraints(value);
      serializeFnsPldRdReversalIndicator(fnsPldRdReversalIndicator);
   } 

     /**
	 * 	Update FnsPldRdReversalIndicator 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdReversalIndicator(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFnsPldRdReversalIndicator,fnsPldRdReversalIndicator.length);
   	
   }
   
   public void setFnsPldRdReversalIndicator(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdReversalIndicator,fnsPldRdReversalIndicator.length);
   	
   }
   
     /**
	 * 	Update FnsPldRdReversalIndicator 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdReversalIndicator(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdReversalIndicator+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FnsPldRdReversalIndicator with another Field
	 *	@param value
	 */
   public void setFnsPldRdReversalIndicator(Field source) {
       replace(source,0,source.length(),beginFnsPldRdReversalIndicator,FNS_PLD_RD_REVERSAL_INDICATOR_LEN);
   	
   }  
   
     /**
	 * 	Update FnsPldRdReversalIndicator 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPldRdReversalIndicator(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFnsPldRdReversalIndicator,FNS_PLD_RD_REVERSAL_INDICATOR_LEN);
   	
   }
   
     /**
	 * 	Update FnsPldRdReversalIndicator 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdReversalIndicator(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdReversalIndicator+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fnsPldRdChargebackRefNo
	 *	@return fnsPldRdChargebackRefNo
	 */
   public char[] getFnsPldRdChargebackRefNo() throws CFException{
     if (isFnsPldRdChargebackRefNoModified()) { 
        fnsPldRdChargebackRefNo = refreshFnsPldRdChargebackRefNo();
     }
   		return fnsPldRdChargebackRefNo;
   }

  
	/**
	*  set variable fnsPldRdChargebackRefNo
	*  Corresponding COBOL Variable is FNS-PLD-RD-CHARGEBACK-REF-NO
	*  @param value
	**/
   public void setFnsPldRdChargebackRefNo(char[] value) {
      fnsPldRdChargebackRefNo = checkFnsPldRdChargebackRefNoConstraints(value);
      serializeFnsPldRdChargebackRefNo(fnsPldRdChargebackRefNo);
   } 

     /**
	 * 	Update FnsPldRdChargebackRefNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdChargebackRefNo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFnsPldRdChargebackRefNo,fnsPldRdChargebackRefNo.length);
   	
   }
   
   public void setFnsPldRdChargebackRefNo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdChargebackRefNo,fnsPldRdChargebackRefNo.length);
   	
   }
   
     /**
	 * 	Update FnsPldRdChargebackRefNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdChargebackRefNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdChargebackRefNo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FnsPldRdChargebackRefNo with another Field
	 *	@param value
	 */
   public void setFnsPldRdChargebackRefNo(Field source) {
       replace(source,0,source.length(),beginFnsPldRdChargebackRefNo,FNS_PLD_RD_CHARGEBACK_REF_NO_LEN);
   	
   }  
   
     /**
	 * 	Update FnsPldRdChargebackRefNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPldRdChargebackRefNo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFnsPldRdChargebackRefNo,FNS_PLD_RD_CHARGEBACK_REF_NO_LEN);
   	
   }
   
     /**
	 * 	Update FnsPldRdChargebackRefNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdChargebackRefNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdChargebackRefNo+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fnsPldRdFuncCd
	 *	@return fnsPldRdFuncCd
	 */
	public int getFnsPldRdFuncCd() throws CFException {
       if (isFnsPldRdFuncCdModified()) { 
           fnsPldRdFuncCd = refreshFnsPldRdFuncCd();
        }
   		return fnsPldRdFuncCd;
	}
	

	
	   
	/**
	 * 	Update FnsPldRdFuncCd with the passed value
	 *  Corresponding COBOL Variable is FNS-PLD-RD-FUNC-CD
	 *	@param number
	 */
	public void setFnsPldRdFuncCd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    fnsPldRdFuncCd = checkFnsPldRdFuncCdMaxLimit(number); 
		serializeFnsPldRdFuncCd(fnsPldRdFuncCd);
	}
	

	public void setFnsPldRdFuncCd(long number) {
	    number = checkFnsPldRdFuncCdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setFnsPldRdFuncCd((int)number);
	}
	
	/**
	 * 	Update FnsPldRdFuncCd with the passed value
	 *	@param value (String or char[])
	 */
	public void setFnsPldRdFuncCd(char[] value) throws CFException {
		 fnsPldRdFuncCd = serializeFnsPldRdFuncCd(value);
	}
	/**
	 * 	Update FnsPldRdFuncCd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFnsPldRdFuncCdString(char[] value) throws CFException {
		 setFnsPldRdFuncCd(value);
	}
	/**
	 *	Returns the value of fnsPldRdSwitchSerialNum
	 *	@return fnsPldRdSwitchSerialNum
	 */
   public char[] getFnsPldRdSwitchSerialNum() throws CFException{
     if (isFnsPldRdSwitchSerialNumModified()) { 
        fnsPldRdSwitchSerialNum = refreshFnsPldRdSwitchSerialNum();
     }
   		return fnsPldRdSwitchSerialNum;
   }

  
	/**
	*  set variable fnsPldRdSwitchSerialNum
	*  Corresponding COBOL Variable is FNS-PLD-RD-SWITCH-SERIAL-NUM
	*  @param value
	**/
   public void setFnsPldRdSwitchSerialNum(char[] value) {
      fnsPldRdSwitchSerialNum = checkFnsPldRdSwitchSerialNumConstraints(value);
      serializeFnsPldRdSwitchSerialNum(fnsPldRdSwitchSerialNum);
   } 

     /**
	 * 	Update FnsPldRdSwitchSerialNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdSwitchSerialNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFnsPldRdSwitchSerialNum,fnsPldRdSwitchSerialNum.length);
   	
   }
   
   public void setFnsPldRdSwitchSerialNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdSwitchSerialNum,fnsPldRdSwitchSerialNum.length);
   	
   }
   
     /**
	 * 	Update FnsPldRdSwitchSerialNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdSwitchSerialNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdSwitchSerialNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FnsPldRdSwitchSerialNum with another Field
	 *	@param value
	 */
   public void setFnsPldRdSwitchSerialNum(Field source) {
       replace(source,0,source.length(),beginFnsPldRdSwitchSerialNum,FNS_PLD_RD_SWITCH_SERIAL_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update FnsPldRdSwitchSerialNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPldRdSwitchSerialNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFnsPldRdSwitchSerialNum,FNS_PLD_RD_SWITCH_SERIAL_NUM_LEN);
   	
   }
   
     /**
	 * 	Update FnsPldRdSwitchSerialNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdSwitchSerialNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdSwitchSerialNum+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fnsPldRdSourceCd
	 *	@return fnsPldRdSourceCd
	 */
   public char[] getFnsPldRdSourceCd() throws CFException{
     if (isFnsPldRdSourceCdModified()) { 
        fnsPldRdSourceCd = refreshFnsPldRdSourceCd();
     }
   		return fnsPldRdSourceCd;
   }

  
	/**
	*  set variable fnsPldRdSourceCd
	*  Corresponding COBOL Variable is FNS-PLD-RD-SOURCE-CD
	*  @param value
	**/
   public void setFnsPldRdSourceCd(char[] value) {
      fnsPldRdSourceCd = checkFnsPldRdSourceCdConstraints(value);
      serializeFnsPldRdSourceCd(fnsPldRdSourceCd);
   } 

     /**
	 * 	Update FnsPldRdSourceCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdSourceCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFnsPldRdSourceCd,fnsPldRdSourceCd.length);
   	
   }
   
   public void setFnsPldRdSourceCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdSourceCd,fnsPldRdSourceCd.length);
   	
   }
   
     /**
	 * 	Update FnsPldRdSourceCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdSourceCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdSourceCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FnsPldRdSourceCd with another Field
	 *	@param value
	 */
   public void setFnsPldRdSourceCd(Field source) {
       replace(source,0,source.length(),beginFnsPldRdSourceCd,FNS_PLD_RD_SOURCE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update FnsPldRdSourceCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPldRdSourceCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFnsPldRdSourceCd,FNS_PLD_RD_SOURCE_CD_LEN);
   	
   }
   
     /**
	 * 	Update FnsPldRdSourceCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdSourceCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdSourceCd+targetIndex,targetLen);
    
   }
	public short getFnsPldRdCntCd() throws CFException {
        if (isFnsPldRdCntCdModified()) { 
           fnsPldRdCntCd = refreshFnsPldRdCntCd();
        }
   		return fnsPldRdCntCd;
	}
	
	/**
	 * 	Update FnsPldRdCntCd with the passed value
	 *  Corresponding COBOL Variable is FNS-PLD-RD-CNT-CD
	 *	@param number
	 */
	public void setFnsPldRdCntCd(short number) {
			fnsPldRdCntCd = checkFnsPldRdCntCdMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeFnsPldRdCntCd(fnsPldRdCntCd);
	}

	public void setFnsPldRdCntCd(int number) {
	    number = checkFnsPldRdCntCdMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setFnsPldRdCntCd((short)number);
	}
	public void setFnsPldRdCntCd(long number) {
	    number = checkFnsPldRdCntCdMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setFnsPldRdCntCd((short)number);
	}
	

	/**
	 *	Returns the value of fnsPldRdOrigSwSerNum
	 *	@return fnsPldRdOrigSwSerNum
	 */
   public char[] getFnsPldRdOrigSwSerNum() throws CFException{
     if (isFnsPldRdOrigSwSerNumModified()) { 
        fnsPldRdOrigSwSerNum = refreshFnsPldRdOrigSwSerNum();
     }
   		return fnsPldRdOrigSwSerNum;
   }

  
	/**
	*  set variable fnsPldRdOrigSwSerNum
	*  Corresponding COBOL Variable is FNS-PLD-RD-ORIG-SW-SER-NUM
	*  @param value
	**/
   public void setFnsPldRdOrigSwSerNum(char[] value) {
      fnsPldRdOrigSwSerNum = checkFnsPldRdOrigSwSerNumConstraints(value);
      serializeFnsPldRdOrigSwSerNum(fnsPldRdOrigSwSerNum);
   } 

     /**
	 * 	Update FnsPldRdOrigSwSerNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdOrigSwSerNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFnsPldRdOrigSwSerNum,fnsPldRdOrigSwSerNum.length);
   	
   }
   
   public void setFnsPldRdOrigSwSerNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdOrigSwSerNum,fnsPldRdOrigSwSerNum.length);
   	
   }
   
     /**
	 * 	Update FnsPldRdOrigSwSerNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdOrigSwSerNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdOrigSwSerNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FnsPldRdOrigSwSerNum with another Field
	 *	@param value
	 */
   public void setFnsPldRdOrigSwSerNum(Field source) {
       replace(source,0,source.length(),beginFnsPldRdOrigSwSerNum,FNS_PLD_RD_ORIG_SW_SER_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update FnsPldRdOrigSwSerNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPldRdOrigSwSerNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFnsPldRdOrigSwSerNum,FNS_PLD_RD_ORIG_SW_SER_NUM_LEN);
   	
   }
   
     /**
	 * 	Update FnsPldRdOrigSwSerNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdOrigSwSerNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdOrigSwSerNum+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fnsPldRdCloseDt
	 *	@return fnsPldRdCloseDt
	 */   
	 public FnsPldRdCloseDt getFnsPldRdCloseDt() {
   	return fnsPldRdCloseDt;
   }
   /**
	* 	Update FnsPldRdCloseDt with the passed value
	*   Corresponding COBOL Variable is FNS-PLD-RD-CLOSE-DT
	*	@param value
	*/
   public void setFnsPldRdCloseDt(char[] value) {
      fnsPldRdCloseDt.setString(value); 
   }   
    
     /**
	 * 	Update FnsPldRdCloseDt 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdCloseDt(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,fnsPldRdCloseDt.begin,fnsPldRdCloseDt.length());
   }
   
     /**
	 * 	Update FnsPldRdCloseDt 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdCloseDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,fnsPldRdCloseDt.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update FnsPldRdCloseDt with another Field
	 *	@param value
	 */
   public void setFnsPldRdCloseDt(Field source) {
   	replace(source,0,source.length(),fnsPldRdCloseDt.begin,fnsPldRdCloseDt.length());
   }  
   
     /**
	 * 	Update FnsPldRdCloseDt 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdCloseDt(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,fnsPldRdCloseDt.begin,fnsPldRdCloseDt.length());
   }
   
     /**
	 * 	Update FnsPldRdCloseDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdCloseDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,fnsPldRdCloseDt.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of fnsPldRdChgbkCnt
	 *	@return fnsPldRdChgbkCnt
	 */
	public int getFnsPldRdChgbkCnt() throws CFException {
       if (isFnsPldRdChgbkCntModified()) { 
           fnsPldRdChgbkCnt = refreshFnsPldRdChgbkCnt();
        }
   		return fnsPldRdChgbkCnt;
	}
	

	
	   
	/**
	 * 	Update FnsPldRdChgbkCnt with the passed value
	 *  Corresponding COBOL Variable is FNS-PLD-RD-CHGBK-CNT
	 *	@param number
	 */
	public void setFnsPldRdChgbkCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    fnsPldRdChgbkCnt = checkFnsPldRdChgbkCntMaxLimit(number); 
		serializeFnsPldRdChgbkCnt(fnsPldRdChgbkCnt);
	}
	

	public void setFnsPldRdChgbkCnt(long number) {
	    number = checkFnsPldRdChgbkCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setFnsPldRdChgbkCnt((int)number);
	}
	
	/**
	 * 	Update FnsPldRdChgbkCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setFnsPldRdChgbkCnt(char[] value) throws CFException {
		 fnsPldRdChgbkCnt = serializeFnsPldRdChgbkCnt(value);
	}
	/**
	 * 	Update FnsPldRdChgbkCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFnsPldRdChgbkCntString(char[] value) throws CFException {
		 setFnsPldRdChgbkCnt(value);
	}
	/**
	 *	Returns the value of fnsPldRdRejRsn1Cd
	 *	@return fnsPldRdRejRsn1Cd
	 */
   public char[] getFnsPldRdRejRsn1Cd() throws CFException{
     if (isFnsPldRdRejRsn1CdModified()) { 
        fnsPldRdRejRsn1Cd = refreshFnsPldRdRejRsn1Cd();
     }
   		return fnsPldRdRejRsn1Cd;
   }

  
	/**
	*  set variable fnsPldRdRejRsn1Cd
	*  Corresponding COBOL Variable is FNS-PLD-RD-REJ-RSN-1-CD
	*  @param value
	**/
   public void setFnsPldRdRejRsn1Cd(char[] value) {
      fnsPldRdRejRsn1Cd = checkFnsPldRdRejRsn1CdConstraints(value);
      serializeFnsPldRdRejRsn1Cd(fnsPldRdRejRsn1Cd);
   } 

     /**
	 * 	Update FnsPldRdRejRsn1Cd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdRejRsn1Cd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFnsPldRdRejRsn1Cd,fnsPldRdRejRsn1Cd.length);
   	
   }
   
   public void setFnsPldRdRejRsn1Cd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdRejRsn1Cd,fnsPldRdRejRsn1Cd.length);
   	
   }
   
     /**
	 * 	Update FnsPldRdRejRsn1Cd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdRejRsn1Cd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdRejRsn1Cd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FnsPldRdRejRsn1Cd with another Field
	 *	@param value
	 */
   public void setFnsPldRdRejRsn1Cd(Field source) {
       replace(source,0,source.length(),beginFnsPldRdRejRsn1Cd,FNS_PLD_RD_REJ_RSN_1_CD_LEN);
   	
   }  
   
     /**
	 * 	Update FnsPldRdRejRsn1Cd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPldRdRejRsn1Cd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFnsPldRdRejRsn1Cd,FNS_PLD_RD_REJ_RSN_1_CD_LEN);
   	
   }
   
     /**
	 * 	Update FnsPldRdRejRsn1Cd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdRejRsn1Cd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdRejRsn1Cd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fnsPldRdRejRsn2Cd
	 *	@return fnsPldRdRejRsn2Cd
	 */
   public char[] getFnsPldRdRejRsn2Cd() throws CFException{
     if (isFnsPldRdRejRsn2CdModified()) { 
        fnsPldRdRejRsn2Cd = refreshFnsPldRdRejRsn2Cd();
     }
   		return fnsPldRdRejRsn2Cd;
   }

  
	/**
	*  set variable fnsPldRdRejRsn2Cd
	*  Corresponding COBOL Variable is FNS-PLD-RD-REJ-RSN-2-CD
	*  @param value
	**/
   public void setFnsPldRdRejRsn2Cd(char[] value) {
      fnsPldRdRejRsn2Cd = checkFnsPldRdRejRsn2CdConstraints(value);
      serializeFnsPldRdRejRsn2Cd(fnsPldRdRejRsn2Cd);
   } 

     /**
	 * 	Update FnsPldRdRejRsn2Cd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdRejRsn2Cd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFnsPldRdRejRsn2Cd,fnsPldRdRejRsn2Cd.length);
   	
   }
   
   public void setFnsPldRdRejRsn2Cd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdRejRsn2Cd,fnsPldRdRejRsn2Cd.length);
   	
   }
   
     /**
	 * 	Update FnsPldRdRejRsn2Cd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdRejRsn2Cd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdRejRsn2Cd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FnsPldRdRejRsn2Cd with another Field
	 *	@param value
	 */
   public void setFnsPldRdRejRsn2Cd(Field source) {
       replace(source,0,source.length(),beginFnsPldRdRejRsn2Cd,FNS_PLD_RD_REJ_RSN_2_CD_LEN);
   	
   }  
   
     /**
	 * 	Update FnsPldRdRejRsn2Cd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPldRdRejRsn2Cd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFnsPldRdRejRsn2Cd,FNS_PLD_RD_REJ_RSN_2_CD_LEN);
   	
   }
   
     /**
	 * 	Update FnsPldRdRejRsn2Cd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdRejRsn2Cd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdRejRsn2Cd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fnsPldRdVrtlAcctNum
	 *	@return fnsPldRdVrtlAcctNum
	 */
   public char[] getFnsPldRdVrtlAcctNum() throws CFException{
     if (isFnsPldRdVrtlAcctNumModified()) { 
        fnsPldRdVrtlAcctNum = refreshFnsPldRdVrtlAcctNum();
     }
   		return fnsPldRdVrtlAcctNum;
   }

  
	/**
	*  set variable fnsPldRdVrtlAcctNum
	*  Corresponding COBOL Variable is FNS-PLD-RD-VRTL-ACCT-NUM
	*  @param value
	**/
   public void setFnsPldRdVrtlAcctNum(char[] value) {
      fnsPldRdVrtlAcctNum = checkFnsPldRdVrtlAcctNumConstraints(value);
      serializeFnsPldRdVrtlAcctNum(fnsPldRdVrtlAcctNum);
   } 

     /**
	 * 	Update FnsPldRdVrtlAcctNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdVrtlAcctNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFnsPldRdVrtlAcctNum,fnsPldRdVrtlAcctNum.length);
   	
   }
   
   public void setFnsPldRdVrtlAcctNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdVrtlAcctNum,fnsPldRdVrtlAcctNum.length);
   	
   }
   
     /**
	 * 	Update FnsPldRdVrtlAcctNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdVrtlAcctNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdVrtlAcctNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FnsPldRdVrtlAcctNum with another Field
	 *	@param value
	 */
   public void setFnsPldRdVrtlAcctNum(Field source) {
       replace(source,0,source.length(),beginFnsPldRdVrtlAcctNum,FNS_PLD_RD_VRTL_ACCT_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update FnsPldRdVrtlAcctNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPldRdVrtlAcctNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFnsPldRdVrtlAcctNum,FNS_PLD_RD_VRTL_ACCT_NUM_LEN);
   	
   }
   
     /**
	 * 	Update FnsPldRdVrtlAcctNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdVrtlAcctNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdVrtlAcctNum+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes FnsPldRdFacData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFnsPldRdInsertTimestamp(CONSTANTS.SPACE_26);
                     setFnsPldRdCycleIndicator(0);
                     setFnsPldRdMsgRsnCd(0);
                     setFnsPldRdChargebackAmt(0);
                     setFnsPldRdChargebackCurrCd(0);
         setFnsPldRdChargebackExpCd(CONSTANTS.SPACE);
         setFnsPldRdReversalIndicator(CONSTANTS.SPACE);
         setFnsPldRdChargebackRefNo(CONSTANTS.SPACE_10);
                     setFnsPldRdFuncCd(0);
         setFnsPldRdSwitchSerialNum(CONSTANTS.SPACE_9);
         setFnsPldRdSourceCd(CONSTANTS.SPACE_4);
         	setFnsPldRdCntCd((short)0);
         setFnsPldRdOrigSwSerNum(CONSTANTS.SPACE_9);
          fnsPldRdCloseDt.initialize();
     
                     setFnsPldRdChgbkCnt(0);
         setFnsPldRdRejRsn1Cd(CONSTANTS.SPACE_4);
         setFnsPldRdRejRsn2Cd(CONSTANTS.SPACE_4);
         setFnsPldRdVrtlAcctNum(CONSTANTS.SPACE_19);
   }

		public static int getFnsPldRdFacDataFieldLength() {
			return FNS_PLD_RD_FAC_DATA_LENGTH;
		}

}
  
