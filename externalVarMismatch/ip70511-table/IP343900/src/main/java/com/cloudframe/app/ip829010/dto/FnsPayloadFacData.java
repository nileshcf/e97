package com.cloudframe.app.ip829010.dto;

/**
*  The class FnsPayloadFacData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/


import com.cloudframe.app.ip829010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class FnsPayloadFacData extends FnsPayloadFacDataSerialized { 
   

						private char[] fnsPayloadInsertTimestamp = Field.fillLowValue(26);

								private int fnsPayloadCycleIndicator;

								private long fnsPayloadMsgRsnCd;

								private long fnsPayloadChargebackAmt;

								private int fnsPayloadChargebackCurrCd;

						private char[] fnsPayloadChargebackExpCd = Field.fillLowValue(1);

						private char[] fnsPayloadReversalIndicator = Field.fillLowValue(1);

						private char[] fnsPayloadChargebackRefNo = Field.fillLowValue(10);

								private int fnsPayloadFuncCd;

						private char[] fnsPayloadSwitchSerialNum = Field.fillLowValue(9);

						private char[] fnsPayloadSourceCd = Field.fillLowValue(4);

								private short fnsPayloadCntCd;

						private char[] fnsPayloadOrigSwSerNum = Field.fillLowValue(9);
				private FnsPayloadCloseDt fnsPayloadCloseDt = new FnsPayloadCloseDt();

								private int fnsPayloadChgbkCnt;

						private char[] fnsPayloadRejRsn1Cd = Field.fillLowValue(4);

						private char[] fnsPayloadRejRsn2Cd = Field.fillLowValue(4);

						private char[] fnsPayloadVrtlAcctNum = Field.fillLowValue(19);
	
	/**
	* Constructor for FnsPayloadFacData
	**/
    public FnsPayloadFacData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for FnsPayloadFacData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FnsPayloadFacData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			fnsPayloadCloseDt.setParent(this,getStartOffset() + 89);
    } 

	/**
	 *	Returns the value of fnsPayloadInsertTimestamp
	 *	@return fnsPayloadInsertTimestamp
	 */
   public char[] getFnsPayloadInsertTimestamp() throws CFException{
     if (isFnsPayloadInsertTimestampModified()) { 
        fnsPayloadInsertTimestamp = refreshFnsPayloadInsertTimestamp();
     }
   		return fnsPayloadInsertTimestamp;
   }

  
	/**
	*  set variable fnsPayloadInsertTimestamp
	*  Corresponding COBOL Variable is FNS-PAYLOAD-INSERT-TIMESTAMP
	*  @param value
	**/
   public void setFnsPayloadInsertTimestamp(char[] value) {
      fnsPayloadInsertTimestamp = checkFnsPayloadInsertTimestampConstraints(value);
      serializeFnsPayloadInsertTimestamp(fnsPayloadInsertTimestamp);
   } 

     /**
	 * 	Update FnsPayloadInsertTimestamp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadInsertTimestamp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFnsPayloadInsertTimestamp,fnsPayloadInsertTimestamp.length);
   	
   }
   
   public void setFnsPayloadInsertTimestamp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadInsertTimestamp,fnsPayloadInsertTimestamp.length);
   	
   }
   
     /**
	 * 	Update FnsPayloadInsertTimestamp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadInsertTimestamp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadInsertTimestamp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FnsPayloadInsertTimestamp with another Field
	 *	@param value
	 */
   public void setFnsPayloadInsertTimestamp(Field source) {
       replace(source,0,source.length(),beginFnsPayloadInsertTimestamp,FNS_PAYLOAD_INSERT_TIMESTAMP_LEN);
   	
   }  
   
     /**
	 * 	Update FnsPayloadInsertTimestamp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPayloadInsertTimestamp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFnsPayloadInsertTimestamp,FNS_PAYLOAD_INSERT_TIMESTAMP_LEN);
   	
   }
   
     /**
	 * 	Update FnsPayloadInsertTimestamp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadInsertTimestamp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadInsertTimestamp+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fnsPayloadCycleIndicator
	 *	@return fnsPayloadCycleIndicator
	 */
	public int getFnsPayloadCycleIndicator() throws CFException {
       if (isFnsPayloadCycleIndicatorModified()) { 
           fnsPayloadCycleIndicator = refreshFnsPayloadCycleIndicator();
        }
   		return fnsPayloadCycleIndicator;
	}
	

	
	   
	/**
	 * 	Update FnsPayloadCycleIndicator with the passed value
	 *  Corresponding COBOL Variable is FNS-PAYLOAD-CYCLE-INDICATOR
	 *	@param number
	 */
	public void setFnsPayloadCycleIndicator(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    fnsPayloadCycleIndicator = checkFnsPayloadCycleIndicatorMaxLimit(number); 
		serializeFnsPayloadCycleIndicator(fnsPayloadCycleIndicator);
	}
	

	public void setFnsPayloadCycleIndicator(long number) {
	    number = checkFnsPayloadCycleIndicatorMaxLimit(number); // Truncate if value is beyond +/- Max range
		setFnsPayloadCycleIndicator((int)number);
	}
	
	/**
	 * 	Update FnsPayloadCycleIndicator with the passed value
	 *	@param value (String or char[])
	 */
	public void setFnsPayloadCycleIndicator(char[] value) throws CFException {
		 fnsPayloadCycleIndicator = serializeFnsPayloadCycleIndicator(value);
	}
	/**
	 * 	Update FnsPayloadCycleIndicator with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFnsPayloadCycleIndicatorString(char[] value) throws CFException {
		 setFnsPayloadCycleIndicator(value);
	}
	/**
	 *	Returns the value of fnsPayloadMsgRsnCd
	 *	@return fnsPayloadMsgRsnCd
	 */
	public long getFnsPayloadMsgRsnCd() throws CFException {
       if (isFnsPayloadMsgRsnCdModified()) { 
           fnsPayloadMsgRsnCd = refreshFnsPayloadMsgRsnCd();
        }
   		return fnsPayloadMsgRsnCd;
	}
	

	
	   
	/**
	 * 	Update FnsPayloadMsgRsnCd with the passed value
	 *  Corresponding COBOL Variable is FNS-PAYLOAD-MSG-RSN-CD
	 *	@param number
	 */
	public void setFnsPayloadMsgRsnCd(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    fnsPayloadMsgRsnCd = checkFnsPayloadMsgRsnCdMaxLimit(number); 
		serializeFnsPayloadMsgRsnCd(fnsPayloadMsgRsnCd);
	}
	

	/**
	 * 	Update FnsPayloadMsgRsnCd with the passed value
	 *	@param value (String or char[])
	 */
	public void setFnsPayloadMsgRsnCd(char[] value) throws CFException {
		 fnsPayloadMsgRsnCd = serializeFnsPayloadMsgRsnCd(value);
	}
	/**
	 * 	Update FnsPayloadMsgRsnCd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFnsPayloadMsgRsnCdString(char[] value) throws CFException {
		 setFnsPayloadMsgRsnCd(value);
	}
	/**
	 *	Returns the value of fnsPayloadChargebackAmt
	 *	@return fnsPayloadChargebackAmt
	 */
	public long getFnsPayloadChargebackAmt() throws CFException {
       if (isFnsPayloadChargebackAmtModified()) { 
           fnsPayloadChargebackAmt = refreshFnsPayloadChargebackAmt();
        }
   		return fnsPayloadChargebackAmt;
	}
	

	
	   
	/**
	 * 	Update FnsPayloadChargebackAmt with the passed value
	 *  Corresponding COBOL Variable is FNS-PAYLOAD-CHARGEBACK-AMT
	 *	@param number
	 */
	public void setFnsPayloadChargebackAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    fnsPayloadChargebackAmt = checkFnsPayloadChargebackAmtMaxLimit(number); 
		serializeFnsPayloadChargebackAmt(fnsPayloadChargebackAmt);
	}
	

	/**
	 * 	Update FnsPayloadChargebackAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setFnsPayloadChargebackAmt(char[] value) throws CFException {
		 fnsPayloadChargebackAmt = serializeFnsPayloadChargebackAmt(value);
	}
	/**
	 * 	Update FnsPayloadChargebackAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFnsPayloadChargebackAmtString(char[] value) throws CFException {
		 setFnsPayloadChargebackAmt(value);
	}
	/**
	 *	Returns the value of fnsPayloadChargebackCurrCd
	 *	@return fnsPayloadChargebackCurrCd
	 */
	public int getFnsPayloadChargebackCurrCd() throws CFException {
       if (isFnsPayloadChargebackCurrCdModified()) { 
           fnsPayloadChargebackCurrCd = refreshFnsPayloadChargebackCurrCd();
        }
   		return fnsPayloadChargebackCurrCd;
	}
	

	
	   
	/**
	 * 	Update FnsPayloadChargebackCurrCd with the passed value
	 *  Corresponding COBOL Variable is FNS-PAYLOAD-CHARGEBACK-CURR-CD
	 *	@param number
	 */
	public void setFnsPayloadChargebackCurrCd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    fnsPayloadChargebackCurrCd = checkFnsPayloadChargebackCurrCdMaxLimit(number); 
		serializeFnsPayloadChargebackCurrCd(fnsPayloadChargebackCurrCd);
	}
	

	public void setFnsPayloadChargebackCurrCd(long number) {
	    number = checkFnsPayloadChargebackCurrCdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setFnsPayloadChargebackCurrCd((int)number);
	}
	
	/**
	 * 	Update FnsPayloadChargebackCurrCd with the passed value
	 *	@param value (String or char[])
	 */
	public void setFnsPayloadChargebackCurrCd(char[] value) throws CFException {
		 fnsPayloadChargebackCurrCd = serializeFnsPayloadChargebackCurrCd(value);
	}
	/**
	 * 	Update FnsPayloadChargebackCurrCd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFnsPayloadChargebackCurrCdString(char[] value) throws CFException {
		 setFnsPayloadChargebackCurrCd(value);
	}
	/**
	 *	Returns the value of fnsPayloadChargebackExpCd
	 *	@return fnsPayloadChargebackExpCd
	 */
   public char[] getFnsPayloadChargebackExpCd() throws CFException{
     if (isFnsPayloadChargebackExpCdModified()) { 
        fnsPayloadChargebackExpCd = refreshFnsPayloadChargebackExpCd();
     }
   		return fnsPayloadChargebackExpCd;
   }

  
	/**
	*  set variable fnsPayloadChargebackExpCd
	*  Corresponding COBOL Variable is FNS-PAYLOAD-CHARGEBACK-EXP-CD
	*  @param value
	**/
   public void setFnsPayloadChargebackExpCd(char[] value) {
      fnsPayloadChargebackExpCd = checkFnsPayloadChargebackExpCdConstraints(value);
      serializeFnsPayloadChargebackExpCd(fnsPayloadChargebackExpCd);
   } 

     /**
	 * 	Update FnsPayloadChargebackExpCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadChargebackExpCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFnsPayloadChargebackExpCd,fnsPayloadChargebackExpCd.length);
   	
   }
   
   public void setFnsPayloadChargebackExpCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadChargebackExpCd,fnsPayloadChargebackExpCd.length);
   	
   }
   
     /**
	 * 	Update FnsPayloadChargebackExpCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadChargebackExpCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadChargebackExpCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FnsPayloadChargebackExpCd with another Field
	 *	@param value
	 */
   public void setFnsPayloadChargebackExpCd(Field source) {
       replace(source,0,source.length(),beginFnsPayloadChargebackExpCd,FNS_PAYLOAD_CHARGEBACK_EXP_CD_LEN);
   	
   }  
   
     /**
	 * 	Update FnsPayloadChargebackExpCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPayloadChargebackExpCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFnsPayloadChargebackExpCd,FNS_PAYLOAD_CHARGEBACK_EXP_CD_LEN);
   	
   }
   
     /**
	 * 	Update FnsPayloadChargebackExpCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadChargebackExpCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadChargebackExpCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fnsPayloadReversalIndicator
	 *	@return fnsPayloadReversalIndicator
	 */
   public char[] getFnsPayloadReversalIndicator() throws CFException{
     if (isFnsPayloadReversalIndicatorModified()) { 
        fnsPayloadReversalIndicator = refreshFnsPayloadReversalIndicator();
     }
   		return fnsPayloadReversalIndicator;
   }

  
	/**
	*  set variable fnsPayloadReversalIndicator
	*  Corresponding COBOL Variable is FNS-PAYLOAD-REVERSAL-INDICATOR
	*  @param value
	**/
   public void setFnsPayloadReversalIndicator(char[] value) {
      fnsPayloadReversalIndicator = checkFnsPayloadReversalIndicatorConstraints(value);
      serializeFnsPayloadReversalIndicator(fnsPayloadReversalIndicator);
   } 

     /**
	 * 	Update FnsPayloadReversalIndicator 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadReversalIndicator(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFnsPayloadReversalIndicator,fnsPayloadReversalIndicator.length);
   	
   }
   
   public void setFnsPayloadReversalIndicator(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadReversalIndicator,fnsPayloadReversalIndicator.length);
   	
   }
   
     /**
	 * 	Update FnsPayloadReversalIndicator 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadReversalIndicator(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadReversalIndicator+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FnsPayloadReversalIndicator with another Field
	 *	@param value
	 */
   public void setFnsPayloadReversalIndicator(Field source) {
       replace(source,0,source.length(),beginFnsPayloadReversalIndicator,FNS_PAYLOAD_REVERSAL_INDICATOR_LEN);
   	
   }  
   
     /**
	 * 	Update FnsPayloadReversalIndicator 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPayloadReversalIndicator(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFnsPayloadReversalIndicator,FNS_PAYLOAD_REVERSAL_INDICATOR_LEN);
   	
   }
   
     /**
	 * 	Update FnsPayloadReversalIndicator 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadReversalIndicator(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadReversalIndicator+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fnsPayloadChargebackRefNo
	 *	@return fnsPayloadChargebackRefNo
	 */
   public char[] getFnsPayloadChargebackRefNo() throws CFException{
     if (isFnsPayloadChargebackRefNoModified()) { 
        fnsPayloadChargebackRefNo = refreshFnsPayloadChargebackRefNo();
     }
   		return fnsPayloadChargebackRefNo;
   }

  
	/**
	*  set variable fnsPayloadChargebackRefNo
	*  Corresponding COBOL Variable is FNS-PAYLOAD-CHARGEBACK-REF-NO
	*  @param value
	**/
   public void setFnsPayloadChargebackRefNo(char[] value) {
      fnsPayloadChargebackRefNo = checkFnsPayloadChargebackRefNoConstraints(value);
      serializeFnsPayloadChargebackRefNo(fnsPayloadChargebackRefNo);
   } 

     /**
	 * 	Update FnsPayloadChargebackRefNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadChargebackRefNo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFnsPayloadChargebackRefNo,fnsPayloadChargebackRefNo.length);
   	
   }
   
   public void setFnsPayloadChargebackRefNo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadChargebackRefNo,fnsPayloadChargebackRefNo.length);
   	
   }
   
     /**
	 * 	Update FnsPayloadChargebackRefNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadChargebackRefNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadChargebackRefNo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FnsPayloadChargebackRefNo with another Field
	 *	@param value
	 */
   public void setFnsPayloadChargebackRefNo(Field source) {
       replace(source,0,source.length(),beginFnsPayloadChargebackRefNo,FNS_PAYLOAD_CHARGEBACK_REF_NO_LEN);
   	
   }  
   
     /**
	 * 	Update FnsPayloadChargebackRefNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPayloadChargebackRefNo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFnsPayloadChargebackRefNo,FNS_PAYLOAD_CHARGEBACK_REF_NO_LEN);
   	
   }
   
     /**
	 * 	Update FnsPayloadChargebackRefNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadChargebackRefNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadChargebackRefNo+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fnsPayloadFuncCd
	 *	@return fnsPayloadFuncCd
	 */
	public int getFnsPayloadFuncCd() throws CFException {
       if (isFnsPayloadFuncCdModified()) { 
           fnsPayloadFuncCd = refreshFnsPayloadFuncCd();
        }
   		return fnsPayloadFuncCd;
	}
	

	
	   
	/**
	 * 	Update FnsPayloadFuncCd with the passed value
	 *  Corresponding COBOL Variable is FNS-PAYLOAD-FUNC-CD
	 *	@param number
	 */
	public void setFnsPayloadFuncCd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    fnsPayloadFuncCd = checkFnsPayloadFuncCdMaxLimit(number); 
		serializeFnsPayloadFuncCd(fnsPayloadFuncCd);
	}
	

	public void setFnsPayloadFuncCd(long number) {
	    number = checkFnsPayloadFuncCdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setFnsPayloadFuncCd((int)number);
	}
	
	/**
	 * 	Update FnsPayloadFuncCd with the passed value
	 *	@param value (String or char[])
	 */
	public void setFnsPayloadFuncCd(char[] value) throws CFException {
		 fnsPayloadFuncCd = serializeFnsPayloadFuncCd(value);
	}
	/**
	 * 	Update FnsPayloadFuncCd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFnsPayloadFuncCdString(char[] value) throws CFException {
		 setFnsPayloadFuncCd(value);
	}
	/**
	 *	Returns the value of fnsPayloadSwitchSerialNum
	 *	@return fnsPayloadSwitchSerialNum
	 */
   public char[] getFnsPayloadSwitchSerialNum() throws CFException{
     if (isFnsPayloadSwitchSerialNumModified()) { 
        fnsPayloadSwitchSerialNum = refreshFnsPayloadSwitchSerialNum();
     }
   		return fnsPayloadSwitchSerialNum;
   }

  
	/**
	*  set variable fnsPayloadSwitchSerialNum
	*  Corresponding COBOL Variable is FNS-PAYLOAD-SWITCH-SERIAL-NUM
	*  @param value
	**/
   public void setFnsPayloadSwitchSerialNum(char[] value) {
      fnsPayloadSwitchSerialNum = checkFnsPayloadSwitchSerialNumConstraints(value);
      serializeFnsPayloadSwitchSerialNum(fnsPayloadSwitchSerialNum);
   } 

     /**
	 * 	Update FnsPayloadSwitchSerialNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadSwitchSerialNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFnsPayloadSwitchSerialNum,fnsPayloadSwitchSerialNum.length);
   	
   }
   
   public void setFnsPayloadSwitchSerialNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadSwitchSerialNum,fnsPayloadSwitchSerialNum.length);
   	
   }
   
     /**
	 * 	Update FnsPayloadSwitchSerialNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadSwitchSerialNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadSwitchSerialNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FnsPayloadSwitchSerialNum with another Field
	 *	@param value
	 */
   public void setFnsPayloadSwitchSerialNum(Field source) {
       replace(source,0,source.length(),beginFnsPayloadSwitchSerialNum,FNS_PAYLOAD_SWITCH_SERIAL_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update FnsPayloadSwitchSerialNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPayloadSwitchSerialNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFnsPayloadSwitchSerialNum,FNS_PAYLOAD_SWITCH_SERIAL_NUM_LEN);
   	
   }
   
     /**
	 * 	Update FnsPayloadSwitchSerialNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadSwitchSerialNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadSwitchSerialNum+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fnsPayloadSourceCd
	 *	@return fnsPayloadSourceCd
	 */
   public char[] getFnsPayloadSourceCd() throws CFException{
     if (isFnsPayloadSourceCdModified()) { 
        fnsPayloadSourceCd = refreshFnsPayloadSourceCd();
     }
   		return fnsPayloadSourceCd;
   }

  
	/**
	*  set variable fnsPayloadSourceCd
	*  Corresponding COBOL Variable is FNS-PAYLOAD-SOURCE-CD
	*  @param value
	**/
   public void setFnsPayloadSourceCd(char[] value) {
      fnsPayloadSourceCd = checkFnsPayloadSourceCdConstraints(value);
      serializeFnsPayloadSourceCd(fnsPayloadSourceCd);
   } 

     /**
	 * 	Update FnsPayloadSourceCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadSourceCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFnsPayloadSourceCd,fnsPayloadSourceCd.length);
   	
   }
   
   public void setFnsPayloadSourceCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadSourceCd,fnsPayloadSourceCd.length);
   	
   }
   
     /**
	 * 	Update FnsPayloadSourceCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadSourceCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadSourceCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FnsPayloadSourceCd with another Field
	 *	@param value
	 */
   public void setFnsPayloadSourceCd(Field source) {
       replace(source,0,source.length(),beginFnsPayloadSourceCd,FNS_PAYLOAD_SOURCE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update FnsPayloadSourceCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPayloadSourceCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFnsPayloadSourceCd,FNS_PAYLOAD_SOURCE_CD_LEN);
   	
   }
   
     /**
	 * 	Update FnsPayloadSourceCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadSourceCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadSourceCd+targetIndex,targetLen);
    
   }
	public short getFnsPayloadCntCd() throws CFException {
        if (isFnsPayloadCntCdModified()) { 
           fnsPayloadCntCd = refreshFnsPayloadCntCd();
        }
   		return fnsPayloadCntCd;
	}
	
	/**
	 * 	Update FnsPayloadCntCd with the passed value
	 *  Corresponding COBOL Variable is FNS-PAYLOAD-CNT-CD
	 *	@param number
	 */
	public void setFnsPayloadCntCd(short number) {
			fnsPayloadCntCd = checkFnsPayloadCntCdMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeFnsPayloadCntCd(fnsPayloadCntCd);
	}

	public void setFnsPayloadCntCd(int number) {
	    number = checkFnsPayloadCntCdMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setFnsPayloadCntCd((short)number);
	}
	public void setFnsPayloadCntCd(long number) {
	    number = checkFnsPayloadCntCdMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setFnsPayloadCntCd((short)number);
	}
	

	/**
	 *	Returns the value of fnsPayloadOrigSwSerNum
	 *	@return fnsPayloadOrigSwSerNum
	 */
   public char[] getFnsPayloadOrigSwSerNum() throws CFException{
     if (isFnsPayloadOrigSwSerNumModified()) { 
        fnsPayloadOrigSwSerNum = refreshFnsPayloadOrigSwSerNum();
     }
   		return fnsPayloadOrigSwSerNum;
   }

  
	/**
	*  set variable fnsPayloadOrigSwSerNum
	*  Corresponding COBOL Variable is FNS-PAYLOAD-ORIG-SW-SER-NUM
	*  @param value
	**/
   public void setFnsPayloadOrigSwSerNum(char[] value) {
      fnsPayloadOrigSwSerNum = checkFnsPayloadOrigSwSerNumConstraints(value);
      serializeFnsPayloadOrigSwSerNum(fnsPayloadOrigSwSerNum);
   } 

     /**
	 * 	Update FnsPayloadOrigSwSerNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadOrigSwSerNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFnsPayloadOrigSwSerNum,fnsPayloadOrigSwSerNum.length);
   	
   }
   
   public void setFnsPayloadOrigSwSerNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadOrigSwSerNum,fnsPayloadOrigSwSerNum.length);
   	
   }
   
     /**
	 * 	Update FnsPayloadOrigSwSerNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadOrigSwSerNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadOrigSwSerNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FnsPayloadOrigSwSerNum with another Field
	 *	@param value
	 */
   public void setFnsPayloadOrigSwSerNum(Field source) {
       replace(source,0,source.length(),beginFnsPayloadOrigSwSerNum,FNS_PAYLOAD_ORIG_SW_SER_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update FnsPayloadOrigSwSerNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPayloadOrigSwSerNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFnsPayloadOrigSwSerNum,FNS_PAYLOAD_ORIG_SW_SER_NUM_LEN);
   	
   }
   
     /**
	 * 	Update FnsPayloadOrigSwSerNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadOrigSwSerNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadOrigSwSerNum+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fnsPayloadCloseDt
	 *	@return fnsPayloadCloseDt
	 */   
	 public FnsPayloadCloseDt getFnsPayloadCloseDt() {
   	return fnsPayloadCloseDt;
   }
   /**
	* 	Update FnsPayloadCloseDt with the passed value
	*   Corresponding COBOL Variable is FNS-PAYLOAD-CLOSE-DT
	*	@param value
	*/
   public void setFnsPayloadCloseDt(char[] value) {
      fnsPayloadCloseDt.setString(value); 
   }   
    
     /**
	 * 	Update FnsPayloadCloseDt 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadCloseDt(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,fnsPayloadCloseDt.begin,fnsPayloadCloseDt.length());
   }
   
     /**
	 * 	Update FnsPayloadCloseDt 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadCloseDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,fnsPayloadCloseDt.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update FnsPayloadCloseDt with another Field
	 *	@param value
	 */
   public void setFnsPayloadCloseDt(Field source) {
   	replace(source,0,source.length(),fnsPayloadCloseDt.begin,fnsPayloadCloseDt.length());
   }  
   
     /**
	 * 	Update FnsPayloadCloseDt 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadCloseDt(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,fnsPayloadCloseDt.begin,fnsPayloadCloseDt.length());
   }
   
     /**
	 * 	Update FnsPayloadCloseDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadCloseDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,fnsPayloadCloseDt.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of fnsPayloadChgbkCnt
	 *	@return fnsPayloadChgbkCnt
	 */
	public int getFnsPayloadChgbkCnt() throws CFException {
       if (isFnsPayloadChgbkCntModified()) { 
           fnsPayloadChgbkCnt = refreshFnsPayloadChgbkCnt();
        }
   		return fnsPayloadChgbkCnt;
	}
	

	
	   
	/**
	 * 	Update FnsPayloadChgbkCnt with the passed value
	 *  Corresponding COBOL Variable is FNS-PAYLOAD-CHGBK-CNT
	 *	@param number
	 */
	public void setFnsPayloadChgbkCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    fnsPayloadChgbkCnt = checkFnsPayloadChgbkCntMaxLimit(number); 
		serializeFnsPayloadChgbkCnt(fnsPayloadChgbkCnt);
	}
	

	public void setFnsPayloadChgbkCnt(long number) {
	    number = checkFnsPayloadChgbkCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setFnsPayloadChgbkCnt((int)number);
	}
	
	/**
	 * 	Update FnsPayloadChgbkCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setFnsPayloadChgbkCnt(char[] value) throws CFException {
		 fnsPayloadChgbkCnt = serializeFnsPayloadChgbkCnt(value);
	}
	/**
	 * 	Update FnsPayloadChgbkCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFnsPayloadChgbkCntString(char[] value) throws CFException {
		 setFnsPayloadChgbkCnt(value);
	}
	/**
	 *	Returns the value of fnsPayloadRejRsn1Cd
	 *	@return fnsPayloadRejRsn1Cd
	 */
   public char[] getFnsPayloadRejRsn1Cd() throws CFException{
     if (isFnsPayloadRejRsn1CdModified()) { 
        fnsPayloadRejRsn1Cd = refreshFnsPayloadRejRsn1Cd();
     }
   		return fnsPayloadRejRsn1Cd;
   }

  
	/**
	*  set variable fnsPayloadRejRsn1Cd
	*  Corresponding COBOL Variable is FNS-PAYLOAD-REJ-RSN-1-CD
	*  @param value
	**/
   public void setFnsPayloadRejRsn1Cd(char[] value) {
      fnsPayloadRejRsn1Cd = checkFnsPayloadRejRsn1CdConstraints(value);
      serializeFnsPayloadRejRsn1Cd(fnsPayloadRejRsn1Cd);
   } 

     /**
	 * 	Update FnsPayloadRejRsn1Cd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadRejRsn1Cd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFnsPayloadRejRsn1Cd,fnsPayloadRejRsn1Cd.length);
   	
   }
   
   public void setFnsPayloadRejRsn1Cd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadRejRsn1Cd,fnsPayloadRejRsn1Cd.length);
   	
   }
   
     /**
	 * 	Update FnsPayloadRejRsn1Cd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadRejRsn1Cd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadRejRsn1Cd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FnsPayloadRejRsn1Cd with another Field
	 *	@param value
	 */
   public void setFnsPayloadRejRsn1Cd(Field source) {
       replace(source,0,source.length(),beginFnsPayloadRejRsn1Cd,FNS_PAYLOAD_REJ_RSN_1_CD_LEN);
   	
   }  
   
     /**
	 * 	Update FnsPayloadRejRsn1Cd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPayloadRejRsn1Cd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFnsPayloadRejRsn1Cd,FNS_PAYLOAD_REJ_RSN_1_CD_LEN);
   	
   }
   
     /**
	 * 	Update FnsPayloadRejRsn1Cd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadRejRsn1Cd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadRejRsn1Cd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fnsPayloadRejRsn2Cd
	 *	@return fnsPayloadRejRsn2Cd
	 */
   public char[] getFnsPayloadRejRsn2Cd() throws CFException{
     if (isFnsPayloadRejRsn2CdModified()) { 
        fnsPayloadRejRsn2Cd = refreshFnsPayloadRejRsn2Cd();
     }
   		return fnsPayloadRejRsn2Cd;
   }

  
	/**
	*  set variable fnsPayloadRejRsn2Cd
	*  Corresponding COBOL Variable is FNS-PAYLOAD-REJ-RSN-2-CD
	*  @param value
	**/
   public void setFnsPayloadRejRsn2Cd(char[] value) {
      fnsPayloadRejRsn2Cd = checkFnsPayloadRejRsn2CdConstraints(value);
      serializeFnsPayloadRejRsn2Cd(fnsPayloadRejRsn2Cd);
   } 

     /**
	 * 	Update FnsPayloadRejRsn2Cd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadRejRsn2Cd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFnsPayloadRejRsn2Cd,fnsPayloadRejRsn2Cd.length);
   	
   }
   
   public void setFnsPayloadRejRsn2Cd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadRejRsn2Cd,fnsPayloadRejRsn2Cd.length);
   	
   }
   
     /**
	 * 	Update FnsPayloadRejRsn2Cd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadRejRsn2Cd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadRejRsn2Cd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FnsPayloadRejRsn2Cd with another Field
	 *	@param value
	 */
   public void setFnsPayloadRejRsn2Cd(Field source) {
       replace(source,0,source.length(),beginFnsPayloadRejRsn2Cd,FNS_PAYLOAD_REJ_RSN_2_CD_LEN);
   	
   }  
   
     /**
	 * 	Update FnsPayloadRejRsn2Cd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPayloadRejRsn2Cd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFnsPayloadRejRsn2Cd,FNS_PAYLOAD_REJ_RSN_2_CD_LEN);
   	
   }
   
     /**
	 * 	Update FnsPayloadRejRsn2Cd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadRejRsn2Cd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadRejRsn2Cd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fnsPayloadVrtlAcctNum
	 *	@return fnsPayloadVrtlAcctNum
	 */
   public char[] getFnsPayloadVrtlAcctNum() throws CFException{
     if (isFnsPayloadVrtlAcctNumModified()) { 
        fnsPayloadVrtlAcctNum = refreshFnsPayloadVrtlAcctNum();
     }
   		return fnsPayloadVrtlAcctNum;
   }

  
	/**
	*  set variable fnsPayloadVrtlAcctNum
	*  Corresponding COBOL Variable is FNS-PAYLOAD-VRTL-ACCT-NUM
	*  @param value
	**/
   public void setFnsPayloadVrtlAcctNum(char[] value) {
      fnsPayloadVrtlAcctNum = checkFnsPayloadVrtlAcctNumConstraints(value);
      serializeFnsPayloadVrtlAcctNum(fnsPayloadVrtlAcctNum);
   } 

     /**
	 * 	Update FnsPayloadVrtlAcctNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadVrtlAcctNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFnsPayloadVrtlAcctNum,fnsPayloadVrtlAcctNum.length);
   	
   }
   
   public void setFnsPayloadVrtlAcctNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadVrtlAcctNum,fnsPayloadVrtlAcctNum.length);
   	
   }
   
     /**
	 * 	Update FnsPayloadVrtlAcctNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadVrtlAcctNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadVrtlAcctNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FnsPayloadVrtlAcctNum with another Field
	 *	@param value
	 */
   public void setFnsPayloadVrtlAcctNum(Field source) {
       replace(source,0,source.length(),beginFnsPayloadVrtlAcctNum,FNS_PAYLOAD_VRTL_ACCT_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update FnsPayloadVrtlAcctNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPayloadVrtlAcctNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFnsPayloadVrtlAcctNum,FNS_PAYLOAD_VRTL_ACCT_NUM_LEN);
   	
   }
   
     /**
	 * 	Update FnsPayloadVrtlAcctNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadVrtlAcctNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadVrtlAcctNum+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes FnsPayloadFacData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFnsPayloadInsertTimestamp(CONSTANTS.SPACE_26);
                     setFnsPayloadCycleIndicator(0);
                     setFnsPayloadMsgRsnCd(0);
                     setFnsPayloadChargebackAmt(0);
                     setFnsPayloadChargebackCurrCd(0);
         setFnsPayloadChargebackExpCd(CONSTANTS.SPACE);
         setFnsPayloadReversalIndicator(CONSTANTS.SPACE);
         setFnsPayloadChargebackRefNo(CONSTANTS.SPACE_10);
                     setFnsPayloadFuncCd(0);
         setFnsPayloadSwitchSerialNum(CONSTANTS.SPACE_9);
         setFnsPayloadSourceCd(CONSTANTS.SPACE_4);
         	setFnsPayloadCntCd((short)0);
         setFnsPayloadOrigSwSerNum(CONSTANTS.SPACE_9);
          fnsPayloadCloseDt.initialize();
     
                     setFnsPayloadChgbkCnt(0);
         setFnsPayloadRejRsn1Cd(CONSTANTS.SPACE_4);
         setFnsPayloadRejRsn2Cd(CONSTANTS.SPACE_4);
         setFnsPayloadVrtlAcctNum(CONSTANTS.SPACE_19);
   }

		public static int getFnsPayloadFacDataFieldLength() {
			return FNS_PAYLOAD_FAC_DATA_LENGTH;
		}

}
  
