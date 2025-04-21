package com.cloudframe.app.sf311010.dto;

/**
*  The class LogDecompressedData860 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class LogDecompressedData860 extends LogDecompressedData860Serialized {
   

						private char[] cardholderNbr860 = Field.fillLowValue(19);

								private long processingCode110860;

								private long transactionAmount860;
				private TransactionAmt1860 transactionAmt1860 = new TransactionAmt1860();

								private long setlAmount110860;
				private SetlAmt110860 setlAmt110860 = new SetlAmt110860();

								private long crdhldrBillAmt110860;

								private long dateTimeXmit110860;

								private long setlConvRte110860;

								private long crdhldrConvRte110860;

						private char[] sysTraceAudit860 = Field.fillLowValue(6);

								private int transMmdd110860;

								private int conv110Mmdd860;

								private int merchantType110860;

						private char[] countryCode110860 = Field.fillLowValue(3);

								private int posEntry110860;

								private int posPinCapture110860;

						private char[] acquirerIca860 = Field.fillLowValue(6);
				private AcquirerIca860Redefined acquirerIca860Redefined = new AcquirerIca860Redefined();

						private char[] forwardInstId860 = Field.fillLowValue(6);
				private ForwardInstId860Redefined forwardInstId860Redefined = new ForwardInstId860Redefined();

						private char[] retrievalRefno110860 = Field.fillLowValue(12);

						private char[] authNumber860 = Field.fillLowValue(6);

						private char[] authResponse860 = Field.fillLowValue(2);

						private char[] idTerminal110860 = Field.fillLowValue(8);

						private char[] cardAcceptor110860 = Field.fillLowValue(15);

						private char[] authMrchNmctst110860 = Field.fillLowValue(40);

						private char[] authAddlData860 = Field.fillLowValue(25);

						private char[] avsCurrCode110860 = Field.fillLowValue(3);

								private int crncyCdeSetl110860;

								private int crncyCrdhldr110860;
				private BkntData110860 bkntData110860 = new BkntData110860();

						private char[] de112110860 = Field.fillLowValue(103);

								private long processingCode100860;

								private long tranAmt100860;
				private TransactionAmt100860 transactionAmt100860 = new TransactionAmt100860();

								private long setlAmt100860;
				private SetlAmnt100860 setlAmnt100860 = new SetlAmnt100860();

								private long crdhldrBillAmt100860;

								private long dateTimeXmit100860;

								private long setlConvRte100860;

								private long crdhldrConvRte100860;

								private long timeLocalTrans100860;

								private int dateLocalTrans100860;

						private char[] cardholderExpdt860 = Field.fillLowValue(4);

								private int transMmdd860;

								private int conv100Mmdd860;

								private int merchantType860;

						private char[] countryCode860 = Field.fillLowValue(3);

						private char[] posDeviceType860 = Field.fillLowValue(3);

								private int posPinCapture860;

						private char[] trackTwoData860 = Field.fillLowValue(37);

						private char[] retrievalRefno860 = Field.fillLowValue(12);

						private char[] idTerminal860 = Field.fillLowValue(8);

						private char[] cardAcceptor860 = Field.fillLowValue(15);

						private char[] authMrchNmctst860 = Field.fillLowValue(40);

						private char[] trackOneData860 = Field.fillLowValue(76);

						private char[] currencyCode860 = Field.fillLowValue(3);

								private int crncyCdeSetl100860;

								private int crncyCrdhldr100860;

						private char[] posData860 = Field.fillLowValue(26);
				private BkntData860 bkntData860 = new BkntData860();

						private char[] de112100860 = Field.fillLowValue(103);

						private char[] crncyConv100860 = Field.fillLowValue(78);
	
	/**
	* Constructor for LogDecompressedData860
	**/
    public LogDecompressedData860() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			transactionAmt1860.setParent(this,getStartOffset() + 25);
	       			setlAmt110860.setParent(this,getStartOffset() + 37);
	       			acquirerIca860Redefined.setParent(this,getStartOffset() + 113);
	       			forwardInstId860Redefined.setParent(this,getStartOffset() + 119);
	       			bkntData110860.setParent(this,getStartOffset() + 242);
	       			transactionAmt100860.setParent(this,getStartOffset() + 363);
	       			setlAmnt100860.setParent(this,getStartOffset() + 375);
	       			bkntData860.setParent(this,getStartOffset() + 682);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of cardholderNbr860
	 *	@return cardholderNbr860
	 */
   public char[] getCardholderNbr860() throws CFException{
     if (isCardholderNbr860Modified()) { 
        cardholderNbr860 = refreshCardholderNbr860();
     }
   		return cardholderNbr860;
   }

  
	/**
	*  set variable cardholderNbr860
	*  Corresponding COBOL Variable is 860-CARDHOLDER-NBR
	*  @param value
	**/
   public void setCardholderNbr860(char[] value) {
      cardholderNbr860 = checkCardholderNbr860Constraints(value);
      serializeCardholderNbr860(cardholderNbr860);
   } 

     /**
	 * 	Update CardholderNbr860 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCardholderNbr860(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCardholderNbr860,cardholderNbr860.length);
   	
   }
   
   public void setCardholderNbr860(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCardholderNbr860,cardholderNbr860.length);
   	
   }
   
     /**
	 * 	Update CardholderNbr860 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCardholderNbr860(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCardholderNbr860+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CardholderNbr860 with another Field
	 *	@param value
	 */
   public void setCardholderNbr860(Field source) {
       replace(source,0,source.length(),beginCardholderNbr860,CARDHOLDER_NBR_860_LEN);
   	
   }  
   
     /**
	 * 	Update CardholderNbr860 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCardholderNbr860(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCardholderNbr860,CARDHOLDER_NBR_860_LEN);
   	
   }
   
     /**
	 * 	Update CardholderNbr860 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCardholderNbr860(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCardholderNbr860+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of processingCode110860
	 *	@return processingCode110860
	 */
	public long getProcessingCode110860() throws CFException {
       if (isProcessingCode110860Modified()) { 
           processingCode110860 = refreshProcessingCode110860();
        }
   		return processingCode110860;
	}
	

	
	   
	/**
	 * 	Update ProcessingCode110860 with the passed value
	 *  Corresponding COBOL Variable is 860-PROCESSING-CODE-110
	 *	@param number
	 */
	public void setProcessingCode110860(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    processingCode110860 = checkProcessingCode110860MaxLimit(number); 
		serializeProcessingCode110860(processingCode110860);
	}
	

	/**
	 * 	Update ProcessingCode110860 with the passed value
	 *	@param value (String or char[])
	 */
	public void setProcessingCode110860(char[] value) throws CFException {
		 processingCode110860 = serializeProcessingCode110860(value);
	}
	/**
	 * 	Update ProcessingCode110860 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setProcessingCode110860String(char[] value) throws CFException {
		 setProcessingCode110860(value);
	}
	/**
	 *	Returns the value of transactionAmount860
	 *	@return transactionAmount860
	 */
	public long getTransactionAmount860() throws CFException {
       if (isTransactionAmount860Modified()) { 
           transactionAmount860 = refreshTransactionAmount860();
        }
   		return transactionAmount860;
	}
	

	
	   
	/**
	 * 	Update TransactionAmount860 with the passed value
	 *  Corresponding COBOL Variable is 860-TRANSACTION-AMOUNT
	 *	@param number
	 */
	public void setTransactionAmount860(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    transactionAmount860 = checkTransactionAmount860MaxLimit(number); 
		serializeTransactionAmount860(transactionAmount860);
	}
	

	/**
	 * 	Update TransactionAmount860 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTransactionAmount860(char[] value) throws CFException {
		 transactionAmount860 = serializeTransactionAmount860(value);
	}
	/**
	 * 	Update TransactionAmount860 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTransactionAmount860String(char[] value) throws CFException {
		 setTransactionAmount860(value);
	}
	/**
	 *	Returns the value of transactionAmt1860
	 *	@return transactionAmt1860
	 */   
	 public TransactionAmt1860 getTransactionAmt1860() {
   	return transactionAmt1860;
   }
   /**
	* 	Update TransactionAmt1860 with the passed value
	*   Corresponding COBOL Variable is 860-TRANSACTION-AMT1
	*	@param value
	*/
   public void setTransactionAmt1860(char[] value) {
      transactionAmt1860.setString(value); 
   }   
    
     /**
	 * 	Update TransactionAmt1860 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setTransactionAmt1860(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,transactionAmt1860.begin,transactionAmt1860.length());
   }
   
     /**
	 * 	Update TransactionAmt1860 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTransactionAmt1860(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,transactionAmt1860.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update TransactionAmt1860 with another Field
	 *	@param value
	 */
   public void setTransactionAmt1860(Field source) {
   	replace(source,0,source.length(),transactionAmt1860.begin,transactionAmt1860.length());
   }  
   
     /**
	 * 	Update TransactionAmt1860 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setTransactionAmt1860(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,transactionAmt1860.begin,transactionAmt1860.length());
   }
   
     /**
	 * 	Update TransactionAmt1860 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTransactionAmt1860(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,transactionAmt1860.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of setlAmount110860
	 *	@return setlAmount110860
	 */
	public long getSetlAmount110860() throws CFException {
       if (isSetlAmount110860Modified()) { 
           setlAmount110860 = refreshSetlAmount110860();
        }
   		return setlAmount110860;
	}
	

	
	   
	/**
	 * 	Update SetlAmount110860 with the passed value
	 *  Corresponding COBOL Variable is 860-SETL-AMOUNT-110
	 *	@param number
	 */
	public void setSetlAmount110860(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    setlAmount110860 = checkSetlAmount110860MaxLimit(number); 
		serializeSetlAmount110860(setlAmount110860);
	}
	

	/**
	 * 	Update SetlAmount110860 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSetlAmount110860(char[] value) throws CFException {
		 setlAmount110860 = serializeSetlAmount110860(value);
	}
	/**
	 * 	Update SetlAmount110860 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSetlAmount110860String(char[] value) throws CFException {
		 setSetlAmount110860(value);
	}
	/**
	 *	Returns the value of setlAmt110860
	 *	@return setlAmt110860
	 */   
	 public SetlAmt110860 getSetlAmt110860() {
   	return setlAmt110860;
   }
   /**
	* 	Update SetlAmt110860 with the passed value
	*   Corresponding COBOL Variable is 860-SETL-AMT-110
	*	@param value
	*/
   public void setSetlAmt110860(char[] value) {
      setlAmt110860.setString(value); 
   }   
    
     /**
	 * 	Update SetlAmt110860 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSetlAmt110860(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,setlAmt110860.begin,setlAmt110860.length());
   }
   
     /**
	 * 	Update SetlAmt110860 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSetlAmt110860(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,setlAmt110860.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SetlAmt110860 with another Field
	 *	@param value
	 */
   public void setSetlAmt110860(Field source) {
   	replace(source,0,source.length(),setlAmt110860.begin,setlAmt110860.length());
   }  
   
     /**
	 * 	Update SetlAmt110860 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSetlAmt110860(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,setlAmt110860.begin,setlAmt110860.length());
   }
   
     /**
	 * 	Update SetlAmt110860 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSetlAmt110860(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,setlAmt110860.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of crdhldrBillAmt110860
	 *	@return crdhldrBillAmt110860
	 */
	public long getCrdhldrBillAmt110860() throws CFException {
       if (isCrdhldrBillAmt110860Modified()) { 
           crdhldrBillAmt110860 = refreshCrdhldrBillAmt110860();
        }
   		return crdhldrBillAmt110860;
	}
	

	
	   
	/**
	 * 	Update CrdhldrBillAmt110860 with the passed value
	 *  Corresponding COBOL Variable is 860-CRDHLDR-BILL-AMT-110
	 *	@param number
	 */
	public void setCrdhldrBillAmt110860(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    crdhldrBillAmt110860 = checkCrdhldrBillAmt110860MaxLimit(number); 
		serializeCrdhldrBillAmt110860(crdhldrBillAmt110860);
	}
	

	/**
	 * 	Update CrdhldrBillAmt110860 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCrdhldrBillAmt110860(char[] value) throws CFException {
		 crdhldrBillAmt110860 = serializeCrdhldrBillAmt110860(value);
	}
	/**
	 * 	Update CrdhldrBillAmt110860 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCrdhldrBillAmt110860String(char[] value) throws CFException {
		 setCrdhldrBillAmt110860(value);
	}
	/**
	 *	Returns the value of dateTimeXmit110860
	 *	@return dateTimeXmit110860
	 */
	public long getDateTimeXmit110860() throws CFException {
       if (isDateTimeXmit110860Modified()) { 
           dateTimeXmit110860 = refreshDateTimeXmit110860();
        }
   		return dateTimeXmit110860;
	}
	

	
	   
	/**
	 * 	Update DateTimeXmit110860 with the passed value
	 *  Corresponding COBOL Variable is 860-DATE-TIME-XMIT-110
	 *	@param number
	 */
	public void setDateTimeXmit110860(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    dateTimeXmit110860 = checkDateTimeXmit110860MaxLimit(number); 
		serializeDateTimeXmit110860(dateTimeXmit110860);
	}
	

	/**
	 * 	Update DateTimeXmit110860 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDateTimeXmit110860(char[] value) throws CFException {
		 dateTimeXmit110860 = serializeDateTimeXmit110860(value);
	}
	/**
	 * 	Update DateTimeXmit110860 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDateTimeXmit110860String(char[] value) throws CFException {
		 setDateTimeXmit110860(value);
	}
	/**
	 *	Returns the value of setlConvRte110860
	 *	@return setlConvRte110860
	 */
	public long getSetlConvRte110860() throws CFException {
       if (isSetlConvRte110860Modified()) { 
           setlConvRte110860 = refreshSetlConvRte110860();
        }
   		return setlConvRte110860;
	}
	

	
	   
	/**
	 * 	Update SetlConvRte110860 with the passed value
	 *  Corresponding COBOL Variable is 860-SETL-CONV-RTE-110
	 *	@param number
	 */
	public void setSetlConvRte110860(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    setlConvRte110860 = checkSetlConvRte110860MaxLimit(number); 
		serializeSetlConvRte110860(setlConvRte110860);
	}
	

	/**
	 * 	Update SetlConvRte110860 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSetlConvRte110860(char[] value) throws CFException {
		 setlConvRte110860 = serializeSetlConvRte110860(value);
	}
	/**
	 * 	Update SetlConvRte110860 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSetlConvRte110860String(char[] value) throws CFException {
		 setSetlConvRte110860(value);
	}
	/**
	 *	Returns the value of crdhldrConvRte110860
	 *	@return crdhldrConvRte110860
	 */
	public long getCrdhldrConvRte110860() throws CFException {
       if (isCrdhldrConvRte110860Modified()) { 
           crdhldrConvRte110860 = refreshCrdhldrConvRte110860();
        }
   		return crdhldrConvRte110860;
	}
	

	
	   
	/**
	 * 	Update CrdhldrConvRte110860 with the passed value
	 *  Corresponding COBOL Variable is 860-CRDHLDR-CONV-RTE-110
	 *	@param number
	 */
	public void setCrdhldrConvRte110860(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    crdhldrConvRte110860 = checkCrdhldrConvRte110860MaxLimit(number); 
		serializeCrdhldrConvRte110860(crdhldrConvRte110860);
	}
	

	/**
	 * 	Update CrdhldrConvRte110860 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCrdhldrConvRte110860(char[] value) throws CFException {
		 crdhldrConvRte110860 = serializeCrdhldrConvRte110860(value);
	}
	/**
	 * 	Update CrdhldrConvRte110860 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCrdhldrConvRte110860String(char[] value) throws CFException {
		 setCrdhldrConvRte110860(value);
	}
	/**
	 *	Returns the value of sysTraceAudit860
	 *	@return sysTraceAudit860
	 */
   public char[] getSysTraceAudit860() throws CFException{
     if (isSysTraceAudit860Modified()) { 
        sysTraceAudit860 = refreshSysTraceAudit860();
     }
   		return sysTraceAudit860;
   }

  
	/**
	*  set variable sysTraceAudit860
	*  Corresponding COBOL Variable is 860-SYS-TRACE-AUDIT
	*  @param value
	**/
   public void setSysTraceAudit860(char[] value) {
      sysTraceAudit860 = checkSysTraceAudit860Constraints(value);
      serializeSysTraceAudit860(sysTraceAudit860);
   } 

     /**
	 * 	Update SysTraceAudit860 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSysTraceAudit860(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSysTraceAudit860,sysTraceAudit860.length);
   	
   }
   
   public void setSysTraceAudit860(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSysTraceAudit860,sysTraceAudit860.length);
   	
   }
   
     /**
	 * 	Update SysTraceAudit860 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSysTraceAudit860(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSysTraceAudit860+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SysTraceAudit860 with another Field
	 *	@param value
	 */
   public void setSysTraceAudit860(Field source) {
       replace(source,0,source.length(),beginSysTraceAudit860,SYS_TRACE_AUDIT_860_LEN);
   	
   }  
   
     /**
	 * 	Update SysTraceAudit860 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSysTraceAudit860(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSysTraceAudit860,SYS_TRACE_AUDIT_860_LEN);
   	
   }
   
     /**
	 * 	Update SysTraceAudit860 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSysTraceAudit860(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSysTraceAudit860+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of transMmdd110860
	 *	@return transMmdd110860
	 */
	public int getTransMmdd110860() throws CFException {
       if (isTransMmdd110860Modified()) { 
           transMmdd110860 = refreshTransMmdd110860();
        }
   		return transMmdd110860;
	}
	

	
	   
	/**
	 * 	Update TransMmdd110860 with the passed value
	 *  Corresponding COBOL Variable is 860-TRANS-MMDD-110
	 *	@param number
	 */
	public void setTransMmdd110860(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    transMmdd110860 = checkTransMmdd110860MaxLimit(number); 
		serializeTransMmdd110860(transMmdd110860);
	}
	

	public void setTransMmdd110860(long number) {
	    number = checkTransMmdd110860MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTransMmdd110860((int)number);
	}
	
	/**
	 * 	Update TransMmdd110860 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTransMmdd110860(char[] value) throws CFException {
		 transMmdd110860 = serializeTransMmdd110860(value);
	}
	/**
	 * 	Update TransMmdd110860 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTransMmdd110860String(char[] value) throws CFException {
		 setTransMmdd110860(value);
	}
	/**
	 *	Returns the value of conv110Mmdd860
	 *	@return conv110Mmdd860
	 */
	public int getConv110Mmdd860() throws CFException {
       if (isConv110Mmdd860Modified()) { 
           conv110Mmdd860 = refreshConv110Mmdd860();
        }
   		return conv110Mmdd860;
	}
	

	
	   
	/**
	 * 	Update Conv110Mmdd860 with the passed value
	 *  Corresponding COBOL Variable is 860-CONV-110-MMDD
	 *	@param number
	 */
	public void setConv110Mmdd860(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    conv110Mmdd860 = checkConv110Mmdd860MaxLimit(number); 
		serializeConv110Mmdd860(conv110Mmdd860);
	}
	

	public void setConv110Mmdd860(long number) {
	    number = checkConv110Mmdd860MaxLimit(number); // Truncate if value is beyond +/- Max range
		setConv110Mmdd860((int)number);
	}
	
	/**
	 * 	Update Conv110Mmdd860 with the passed value
	 *	@param value (String or char[])
	 */
	public void setConv110Mmdd860(char[] value) throws CFException {
		 conv110Mmdd860 = serializeConv110Mmdd860(value);
	}
	/**
	 * 	Update Conv110Mmdd860 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setConv110Mmdd860String(char[] value) throws CFException {
		 setConv110Mmdd860(value);
	}
	/**
	 *	Returns the value of merchantType110860
	 *	@return merchantType110860
	 */
	public int getMerchantType110860() throws CFException {
       if (isMerchantType110860Modified()) { 
           merchantType110860 = refreshMerchantType110860();
        }
   		return merchantType110860;
	}
	

	
	   
	/**
	 * 	Update MerchantType110860 with the passed value
	 *  Corresponding COBOL Variable is 860-MERCHANT-TYPE-110
	 *	@param number
	 */
	public void setMerchantType110860(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    merchantType110860 = checkMerchantType110860MaxLimit(number); 
		serializeMerchantType110860(merchantType110860);
	}
	

	public void setMerchantType110860(long number) {
	    number = checkMerchantType110860MaxLimit(number); // Truncate if value is beyond +/- Max range
		setMerchantType110860((int)number);
	}
	
	/**
	 * 	Update MerchantType110860 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMerchantType110860(char[] value) throws CFException {
		 merchantType110860 = serializeMerchantType110860(value);
	}
	/**
	 * 	Update MerchantType110860 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMerchantType110860String(char[] value) throws CFException {
		 setMerchantType110860(value);
	}
	/**
	 *	Returns the value of countryCode110860
	 *	@return countryCode110860
	 */
   public char[] getCountryCode110860() throws CFException{
     if (isCountryCode110860Modified()) { 
        countryCode110860 = refreshCountryCode110860();
     }
   		return countryCode110860;
   }

  
	/**
	*  set variable countryCode110860
	*  Corresponding COBOL Variable is 860-COUNTRY-CODE-110
	*  @param value
	**/
   public void setCountryCode110860(char[] value) {
      countryCode110860 = checkCountryCode110860Constraints(value);
      serializeCountryCode110860(countryCode110860);
   } 

     /**
	 * 	Update CountryCode110860 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCountryCode110860(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCountryCode110860,countryCode110860.length);
   	
   }
   
   public void setCountryCode110860(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCountryCode110860,countryCode110860.length);
   	
   }
   
     /**
	 * 	Update CountryCode110860 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCountryCode110860(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCountryCode110860+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CountryCode110860 with another Field
	 *	@param value
	 */
   public void setCountryCode110860(Field source) {
       replace(source,0,source.length(),beginCountryCode110860,COUNTRY_CODE_110860_LEN);
   	
   }  
   
     /**
	 * 	Update CountryCode110860 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCountryCode110860(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCountryCode110860,COUNTRY_CODE_110860_LEN);
   	
   }
   
     /**
	 * 	Update CountryCode110860 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCountryCode110860(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCountryCode110860+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of posEntry110860
	 *	@return posEntry110860
	 */
	public int getPosEntry110860() throws CFException {
       if (isPosEntry110860Modified()) { 
           posEntry110860 = refreshPosEntry110860();
        }
   		return posEntry110860;
	}
	

	
	   
	/**
	 * 	Update PosEntry110860 with the passed value
	 *  Corresponding COBOL Variable is 860-POS-ENTRY-110
	 *	@param number
	 */
	public void setPosEntry110860(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    posEntry110860 = checkPosEntry110860MaxLimit(number); 
		serializePosEntry110860(posEntry110860);
	}
	

	public void setPosEntry110860(long number) {
	    number = checkPosEntry110860MaxLimit(number); // Truncate if value is beyond +/- Max range
		setPosEntry110860((int)number);
	}
	
	/**
	 * 	Update PosEntry110860 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPosEntry110860(char[] value) throws CFException {
		 posEntry110860 = serializePosEntry110860(value);
	}
	/**
	 * 	Update PosEntry110860 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPosEntry110860String(char[] value) throws CFException {
		 setPosEntry110860(value);
	}
	/**
	 *	Returns the value of posPinCapture110860
	 *	@return posPinCapture110860
	 */
	public int getPosPinCapture110860() throws CFException {
       if (isPosPinCapture110860Modified()) { 
           posPinCapture110860 = refreshPosPinCapture110860();
        }
   		return posPinCapture110860;
	}
	

	
	   
	/**
	 * 	Update PosPinCapture110860 with the passed value
	 *  Corresponding COBOL Variable is 860-POS-PIN-CAPTURE-110
	 *	@param number
	 */
	public void setPosPinCapture110860(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    posPinCapture110860 = checkPosPinCapture110860MaxLimit(number); 
		serializePosPinCapture110860(posPinCapture110860);
	}
	

	public void setPosPinCapture110860(long number) {
	    number = checkPosPinCapture110860MaxLimit(number); // Truncate if value is beyond +/- Max range
		setPosPinCapture110860((int)number);
	}
	
	/**
	 * 	Update PosPinCapture110860 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPosPinCapture110860(char[] value) throws CFException {
		 posPinCapture110860 = serializePosPinCapture110860(value);
	}
	/**
	 * 	Update PosPinCapture110860 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPosPinCapture110860String(char[] value) throws CFException {
		 setPosPinCapture110860(value);
	}
	/**
	 *	Returns the value of acquirerIca860
	 *	@return acquirerIca860
	 */
   public char[] getAcquirerIca860() throws CFException{
     if (isAcquirerIca860Modified()) { 
        acquirerIca860 = refreshAcquirerIca860();
     }
   		return acquirerIca860;
   }

  
	/**
	*  set variable acquirerIca860
	*  Corresponding COBOL Variable is 860-ACQUIRER-ICA
	*  @param value
	**/
   public void setAcquirerIca860(char[] value) {
      acquirerIca860 = checkAcquirerIca860Constraints(value);
      serializeAcquirerIca860(acquirerIca860);
   } 

     /**
	 * 	Update AcquirerIca860 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAcquirerIca860(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAcquirerIca860,acquirerIca860.length);
   	
   }
   
   public void setAcquirerIca860(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAcquirerIca860,acquirerIca860.length);
   	
   }
   
     /**
	 * 	Update AcquirerIca860 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAcquirerIca860(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAcquirerIca860+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AcquirerIca860 with another Field
	 *	@param value
	 */
   public void setAcquirerIca860(Field source) {
       replace(source,0,source.length(),beginAcquirerIca860,ACQUIRER_ICA_860_LEN);
   	
   }  
   
     /**
	 * 	Update AcquirerIca860 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAcquirerIca860(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAcquirerIca860,ACQUIRER_ICA_860_LEN);
   	
   }
   
     /**
	 * 	Update AcquirerIca860 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAcquirerIca860(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAcquirerIca860+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of acquirerIca860Redefined
	 *	@return acquirerIca860Redefined
	 */   
	 public AcquirerIca860Redefined getAcquirerIca860Redefined() {
   	return acquirerIca860Redefined;
   }
   /**
	* 	Update AcquirerIca860Redefined with the passed value
	*   Corresponding COBOL Variable is 860-ACQUIRER-ICA-REDEFINED
	*	@param value
	*/
   public void setAcquirerIca860Redefined(char[] value) {
      acquirerIca860Redefined.setString(value); 
   }   
    
     /**
	 * 	Update AcquirerIca860Redefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAcquirerIca860Redefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,acquirerIca860Redefined.begin,acquirerIca860Redefined.length());
   }
   
     /**
	 * 	Update AcquirerIca860Redefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAcquirerIca860Redefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,acquirerIca860Redefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AcquirerIca860Redefined with another Field
	 *	@param value
	 */
   public void setAcquirerIca860Redefined(Field source) {
   	replace(source,0,source.length(),acquirerIca860Redefined.begin,acquirerIca860Redefined.length());
   }  
   
     /**
	 * 	Update AcquirerIca860Redefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAcquirerIca860Redefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,acquirerIca860Redefined.begin,acquirerIca860Redefined.length());
   }
   
     /**
	 * 	Update AcquirerIca860Redefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAcquirerIca860Redefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,acquirerIca860Redefined.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of forwardInstId860
	 *	@return forwardInstId860
	 */
   public char[] getForwardInstId860() throws CFException{
     if (isForwardInstId860Modified()) { 
        forwardInstId860 = refreshForwardInstId860();
     }
   		return forwardInstId860;
   }

  
	/**
	*  set variable forwardInstId860
	*  Corresponding COBOL Variable is 860-FORWARD-INST-ID
	*  @param value
	**/
   public void setForwardInstId860(char[] value) {
      forwardInstId860 = checkForwardInstId860Constraints(value);
      serializeForwardInstId860(forwardInstId860);
   } 

     /**
	 * 	Update ForwardInstId860 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setForwardInstId860(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginForwardInstId860,forwardInstId860.length);
   	
   }
   
   public void setForwardInstId860(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginForwardInstId860,forwardInstId860.length);
   	
   }
   
     /**
	 * 	Update ForwardInstId860 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setForwardInstId860(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginForwardInstId860+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ForwardInstId860 with another Field
	 *	@param value
	 */
   public void setForwardInstId860(Field source) {
       replace(source,0,source.length(),beginForwardInstId860,FORWARD_INST_ID_860_LEN);
   	
   }  
   
     /**
	 * 	Update ForwardInstId860 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setForwardInstId860(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginForwardInstId860,FORWARD_INST_ID_860_LEN);
   	
   }
   
     /**
	 * 	Update ForwardInstId860 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setForwardInstId860(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginForwardInstId860+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of forwardInstId860Redefined
	 *	@return forwardInstId860Redefined
	 */   
	 public ForwardInstId860Redefined getForwardInstId860Redefined() {
   	return forwardInstId860Redefined;
   }
   /**
	* 	Update ForwardInstId860Redefined with the passed value
	*   Corresponding COBOL Variable is 860-FORWARD-INST-ID-REDEFINED
	*	@param value
	*/
   public void setForwardInstId860Redefined(char[] value) {
      forwardInstId860Redefined.setString(value); 
   }   
    
     /**
	 * 	Update ForwardInstId860Redefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setForwardInstId860Redefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,forwardInstId860Redefined.begin,forwardInstId860Redefined.length());
   }
   
     /**
	 * 	Update ForwardInstId860Redefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setForwardInstId860Redefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,forwardInstId860Redefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ForwardInstId860Redefined with another Field
	 *	@param value
	 */
   public void setForwardInstId860Redefined(Field source) {
   	replace(source,0,source.length(),forwardInstId860Redefined.begin,forwardInstId860Redefined.length());
   }  
   
     /**
	 * 	Update ForwardInstId860Redefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setForwardInstId860Redefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,forwardInstId860Redefined.begin,forwardInstId860Redefined.length());
   }
   
     /**
	 * 	Update ForwardInstId860Redefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setForwardInstId860Redefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,forwardInstId860Redefined.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of retrievalRefno110860
	 *	@return retrievalRefno110860
	 */
   public char[] getRetrievalRefno110860() throws CFException{
     if (isRetrievalRefno110860Modified()) { 
        retrievalRefno110860 = refreshRetrievalRefno110860();
     }
   		return retrievalRefno110860;
   }

  
	/**
	*  set variable retrievalRefno110860
	*  Corresponding COBOL Variable is 860-RETRIEVAL-REFNO-110
	*  @param value
	**/
   public void setRetrievalRefno110860(char[] value) {
      retrievalRefno110860 = checkRetrievalRefno110860Constraints(value);
      serializeRetrievalRefno110860(retrievalRefno110860);
   } 

     /**
	 * 	Update RetrievalRefno110860 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRetrievalRefno110860(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRetrievalRefno110860,retrievalRefno110860.length);
   	
   }
   
   public void setRetrievalRefno110860(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRetrievalRefno110860,retrievalRefno110860.length);
   	
   }
   
     /**
	 * 	Update RetrievalRefno110860 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRetrievalRefno110860(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRetrievalRefno110860+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RetrievalRefno110860 with another Field
	 *	@param value
	 */
   public void setRetrievalRefno110860(Field source) {
       replace(source,0,source.length(),beginRetrievalRefno110860,RETRIEVAL_REFNO_110860_LEN);
   	
   }  
   
     /**
	 * 	Update RetrievalRefno110860 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRetrievalRefno110860(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRetrievalRefno110860,RETRIEVAL_REFNO_110860_LEN);
   	
   }
   
     /**
	 * 	Update RetrievalRefno110860 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRetrievalRefno110860(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRetrievalRefno110860+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of authNumber860
	 *	@return authNumber860
	 */
   public char[] getAuthNumber860() throws CFException{
     if (isAuthNumber860Modified()) { 
        authNumber860 = refreshAuthNumber860();
     }
   		return authNumber860;
   }

  
	/**
	*  set variable authNumber860
	*  Corresponding COBOL Variable is 860-AUTH-NUMBER
	*  @param value
	**/
   public void setAuthNumber860(char[] value) {
      authNumber860 = checkAuthNumber860Constraints(value);
      serializeAuthNumber860(authNumber860);
   } 

     /**
	 * 	Update AuthNumber860 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAuthNumber860(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAuthNumber860,authNumber860.length);
   	
   }
   
   public void setAuthNumber860(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAuthNumber860,authNumber860.length);
   	
   }
   
     /**
	 * 	Update AuthNumber860 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAuthNumber860(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAuthNumber860+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AuthNumber860 with another Field
	 *	@param value
	 */
   public void setAuthNumber860(Field source) {
       replace(source,0,source.length(),beginAuthNumber860,AUTH_NUMBER_860_LEN);
   	
   }  
   
     /**
	 * 	Update AuthNumber860 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAuthNumber860(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAuthNumber860,AUTH_NUMBER_860_LEN);
   	
   }
   
     /**
	 * 	Update AuthNumber860 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAuthNumber860(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAuthNumber860+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of authResponse860
	 *	@return authResponse860
	 */
   public char[] getAuthResponse860() throws CFException{
     if (isAuthResponse860Modified()) { 
        authResponse860 = refreshAuthResponse860();
     }
   		return authResponse860;
   }

  
	/**
	*  set variable authResponse860
	*  Corresponding COBOL Variable is 860-AUTH-RESPONSE
	*  @param value
	**/
   public void setAuthResponse860(char[] value) {
      authResponse860 = checkAuthResponse860Constraints(value);
      serializeAuthResponse860(authResponse860);
   } 

     /**
	 * 	Update AuthResponse860 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAuthResponse860(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAuthResponse860,authResponse860.length);
   	
   }
   
   public void setAuthResponse860(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAuthResponse860,authResponse860.length);
   	
   }
   
     /**
	 * 	Update AuthResponse860 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAuthResponse860(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAuthResponse860+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AuthResponse860 with another Field
	 *	@param value
	 */
   public void setAuthResponse860(Field source) {
       replace(source,0,source.length(),beginAuthResponse860,AUTH_RESPONSE_860_LEN);
   	
   }  
   
     /**
	 * 	Update AuthResponse860 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAuthResponse860(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAuthResponse860,AUTH_RESPONSE_860_LEN);
   	
   }
   
     /**
	 * 	Update AuthResponse860 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAuthResponse860(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAuthResponse860+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of idTerminal110860
	 *	@return idTerminal110860
	 */
   public char[] getIdTerminal110860() throws CFException{
     if (isIdTerminal110860Modified()) { 
        idTerminal110860 = refreshIdTerminal110860();
     }
   		return idTerminal110860;
   }

  
	/**
	*  set variable idTerminal110860
	*  Corresponding COBOL Variable is 860-ID-TERMINAL-110
	*  @param value
	**/
   public void setIdTerminal110860(char[] value) {
      idTerminal110860 = checkIdTerminal110860Constraints(value);
      serializeIdTerminal110860(idTerminal110860);
   } 

     /**
	 * 	Update IdTerminal110860 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIdTerminal110860(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIdTerminal110860,idTerminal110860.length);
   	
   }
   
   public void setIdTerminal110860(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIdTerminal110860,idTerminal110860.length);
   	
   }
   
     /**
	 * 	Update IdTerminal110860 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIdTerminal110860(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIdTerminal110860+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update IdTerminal110860 with another Field
	 *	@param value
	 */
   public void setIdTerminal110860(Field source) {
       replace(source,0,source.length(),beginIdTerminal110860,ID_TERMINAL_110860_LEN);
   	
   }  
   
     /**
	 * 	Update IdTerminal110860 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIdTerminal110860(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIdTerminal110860,ID_TERMINAL_110860_LEN);
   	
   }
   
     /**
	 * 	Update IdTerminal110860 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIdTerminal110860(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIdTerminal110860+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cardAcceptor110860
	 *	@return cardAcceptor110860
	 */
   public char[] getCardAcceptor110860() throws CFException{
     if (isCardAcceptor110860Modified()) { 
        cardAcceptor110860 = refreshCardAcceptor110860();
     }
   		return cardAcceptor110860;
   }

  
	/**
	*  set variable cardAcceptor110860
	*  Corresponding COBOL Variable is 860-CARD-ACCEPTOR-110
	*  @param value
	**/
   public void setCardAcceptor110860(char[] value) {
      cardAcceptor110860 = checkCardAcceptor110860Constraints(value);
      serializeCardAcceptor110860(cardAcceptor110860);
   } 

     /**
	 * 	Update CardAcceptor110860 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCardAcceptor110860(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCardAcceptor110860,cardAcceptor110860.length);
   	
   }
   
   public void setCardAcceptor110860(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCardAcceptor110860,cardAcceptor110860.length);
   	
   }
   
     /**
	 * 	Update CardAcceptor110860 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCardAcceptor110860(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCardAcceptor110860+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CardAcceptor110860 with another Field
	 *	@param value
	 */
   public void setCardAcceptor110860(Field source) {
       replace(source,0,source.length(),beginCardAcceptor110860,CARD_ACCEPTOR_110860_LEN);
   	
   }  
   
     /**
	 * 	Update CardAcceptor110860 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCardAcceptor110860(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCardAcceptor110860,CARD_ACCEPTOR_110860_LEN);
   	
   }
   
     /**
	 * 	Update CardAcceptor110860 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCardAcceptor110860(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCardAcceptor110860+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of authMrchNmctst110860
	 *	@return authMrchNmctst110860
	 */
   public char[] getAuthMrchNmctst110860() throws CFException{
     if (isAuthMrchNmctst110860Modified()) { 
        authMrchNmctst110860 = refreshAuthMrchNmctst110860();
     }
   		return authMrchNmctst110860;
   }

  
	/**
	*  set variable authMrchNmctst110860
	*  Corresponding COBOL Variable is 860-AUTH-MRCH-NMCTST-110
	*  @param value
	**/
   public void setAuthMrchNmctst110860(char[] value) {
      authMrchNmctst110860 = checkAuthMrchNmctst110860Constraints(value);
      serializeAuthMrchNmctst110860(authMrchNmctst110860);
   } 

     /**
	 * 	Update AuthMrchNmctst110860 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAuthMrchNmctst110860(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAuthMrchNmctst110860,authMrchNmctst110860.length);
   	
   }
   
   public void setAuthMrchNmctst110860(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAuthMrchNmctst110860,authMrchNmctst110860.length);
   	
   }
   
     /**
	 * 	Update AuthMrchNmctst110860 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAuthMrchNmctst110860(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAuthMrchNmctst110860+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AuthMrchNmctst110860 with another Field
	 *	@param value
	 */
   public void setAuthMrchNmctst110860(Field source) {
       replace(source,0,source.length(),beginAuthMrchNmctst110860,AUTH_MRCH_NMCTST_110860_LEN);
   	
   }  
   
     /**
	 * 	Update AuthMrchNmctst110860 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAuthMrchNmctst110860(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAuthMrchNmctst110860,AUTH_MRCH_NMCTST_110860_LEN);
   	
   }
   
     /**
	 * 	Update AuthMrchNmctst110860 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAuthMrchNmctst110860(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAuthMrchNmctst110860+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of authAddlData860
	 *	@return authAddlData860
	 */
   public char[] getAuthAddlData860() throws CFException{
     if (isAuthAddlData860Modified()) { 
        authAddlData860 = refreshAuthAddlData860();
     }
   		return authAddlData860;
   }

  
	/**
	*  set variable authAddlData860
	*  Corresponding COBOL Variable is 860-AUTH-ADDL-DATA
	*  @param value
	**/
   public void setAuthAddlData860(char[] value) {
      authAddlData860 = checkAuthAddlData860Constraints(value);
      serializeAuthAddlData860(authAddlData860);
   } 

     /**
	 * 	Update AuthAddlData860 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAuthAddlData860(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAuthAddlData860,authAddlData860.length);
   	
   }
   
   public void setAuthAddlData860(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAuthAddlData860,authAddlData860.length);
   	
   }
   
     /**
	 * 	Update AuthAddlData860 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAuthAddlData860(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAuthAddlData860+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AuthAddlData860 with another Field
	 *	@param value
	 */
   public void setAuthAddlData860(Field source) {
       replace(source,0,source.length(),beginAuthAddlData860,AUTH_ADDL_DATA_860_LEN);
   	
   }  
   
     /**
	 * 	Update AuthAddlData860 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAuthAddlData860(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAuthAddlData860,AUTH_ADDL_DATA_860_LEN);
   	
   }
   
     /**
	 * 	Update AuthAddlData860 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAuthAddlData860(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAuthAddlData860+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of avsCurrCode110860
	 *	@return avsCurrCode110860
	 */
   public char[] getAvsCurrCode110860() throws CFException{
     if (isAvsCurrCode110860Modified()) { 
        avsCurrCode110860 = refreshAvsCurrCode110860();
     }
   		return avsCurrCode110860;
   }

  
	/**
	*  set variable avsCurrCode110860
	*  Corresponding COBOL Variable is 860-AVS-CURR-CODE-110
	*  @param value
	**/
   public void setAvsCurrCode110860(char[] value) {
      avsCurrCode110860 = checkAvsCurrCode110860Constraints(value);
      serializeAvsCurrCode110860(avsCurrCode110860);
   } 

     /**
	 * 	Update AvsCurrCode110860 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAvsCurrCode110860(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAvsCurrCode110860,avsCurrCode110860.length);
   	
   }
   
   public void setAvsCurrCode110860(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAvsCurrCode110860,avsCurrCode110860.length);
   	
   }
   
     /**
	 * 	Update AvsCurrCode110860 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAvsCurrCode110860(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAvsCurrCode110860+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AvsCurrCode110860 with another Field
	 *	@param value
	 */
   public void setAvsCurrCode110860(Field source) {
       replace(source,0,source.length(),beginAvsCurrCode110860,AVS_CURR_CODE_110860_LEN);
   	
   }  
   
     /**
	 * 	Update AvsCurrCode110860 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAvsCurrCode110860(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAvsCurrCode110860,AVS_CURR_CODE_110860_LEN);
   	
   }
   
     /**
	 * 	Update AvsCurrCode110860 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAvsCurrCode110860(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAvsCurrCode110860+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of crncyCdeSetl110860
	 *	@return crncyCdeSetl110860
	 */
	public int getCrncyCdeSetl110860() throws CFException {
       if (isCrncyCdeSetl110860Modified()) { 
           crncyCdeSetl110860 = refreshCrncyCdeSetl110860();
        }
   		return crncyCdeSetl110860;
	}
	

	
	   
	/**
	 * 	Update CrncyCdeSetl110860 with the passed value
	 *  Corresponding COBOL Variable is 860-CRNCY-CDE-SETL-110
	 *	@param number
	 */
	public void setCrncyCdeSetl110860(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    crncyCdeSetl110860 = checkCrncyCdeSetl110860MaxLimit(number); 
		serializeCrncyCdeSetl110860(crncyCdeSetl110860);
	}
	

	public void setCrncyCdeSetl110860(long number) {
	    number = checkCrncyCdeSetl110860MaxLimit(number); // Truncate if value is beyond +/- Max range
		setCrncyCdeSetl110860((int)number);
	}
	
	/**
	 * 	Update CrncyCdeSetl110860 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCrncyCdeSetl110860(char[] value) throws CFException {
		 crncyCdeSetl110860 = serializeCrncyCdeSetl110860(value);
	}
	/**
	 * 	Update CrncyCdeSetl110860 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCrncyCdeSetl110860String(char[] value) throws CFException {
		 setCrncyCdeSetl110860(value);
	}
	/**
	 *	Returns the value of crncyCrdhldr110860
	 *	@return crncyCrdhldr110860
	 */
	public int getCrncyCrdhldr110860() throws CFException {
       if (isCrncyCrdhldr110860Modified()) { 
           crncyCrdhldr110860 = refreshCrncyCrdhldr110860();
        }
   		return crncyCrdhldr110860;
	}
	

	
	   
	/**
	 * 	Update CrncyCrdhldr110860 with the passed value
	 *  Corresponding COBOL Variable is 860-CRNCY-CRDHLDR-110
	 *	@param number
	 */
	public void setCrncyCrdhldr110860(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    crncyCrdhldr110860 = checkCrncyCrdhldr110860MaxLimit(number); 
		serializeCrncyCrdhldr110860(crncyCrdhldr110860);
	}
	

	public void setCrncyCrdhldr110860(long number) {
	    number = checkCrncyCrdhldr110860MaxLimit(number); // Truncate if value is beyond +/- Max range
		setCrncyCrdhldr110860((int)number);
	}
	
	/**
	 * 	Update CrncyCrdhldr110860 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCrncyCrdhldr110860(char[] value) throws CFException {
		 crncyCrdhldr110860 = serializeCrncyCrdhldr110860(value);
	}
	/**
	 * 	Update CrncyCrdhldr110860 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCrncyCrdhldr110860String(char[] value) throws CFException {
		 setCrncyCrdhldr110860(value);
	}
	/**
	 *	Returns the value of bkntData110860
	 *	@return bkntData110860
	 */   
	 public BkntData110860 getBkntData110860() {
   	return bkntData110860;
   }
   /**
	* 	Update BkntData110860 with the passed value
	*   Corresponding COBOL Variable is 860-BKNT-DATA-110
	*	@param value
	*/
   public void setBkntData110860(char[] value) {
      bkntData110860.setString(value); 
   }   
    
     /**
	 * 	Update BkntData110860 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBkntData110860(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bkntData110860.begin,bkntData110860.length());
   }
   
     /**
	 * 	Update BkntData110860 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBkntData110860(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bkntData110860.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BkntData110860 with another Field
	 *	@param value
	 */
   public void setBkntData110860(Field source) {
   	replace(source,0,source.length(),bkntData110860.begin,bkntData110860.length());
   }  
   
     /**
	 * 	Update BkntData110860 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBkntData110860(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bkntData110860.begin,bkntData110860.length());
   }
   
     /**
	 * 	Update BkntData110860 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBkntData110860(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bkntData110860.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of de112110860
	 *	@return de112110860
	 */
   public char[] getDe112110860() throws CFException{
     if (isDe112110860Modified()) { 
        de112110860 = refreshDe112110860();
     }
   		return de112110860;
   }

  
	/**
	*  set variable de112110860
	*  Corresponding COBOL Variable is 860-DE112-110
	*  @param value
	**/
   public void setDe112110860(char[] value) {
      de112110860 = checkDe112110860Constraints(value);
      serializeDe112110860(de112110860);
   } 

     /**
	 * 	Update De112110860 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDe112110860(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDe112110860,de112110860.length);
   	
   }
   
   public void setDe112110860(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDe112110860,de112110860.length);
   	
   }
   
     /**
	 * 	Update De112110860 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDe112110860(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDe112110860+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update De112110860 with another Field
	 *	@param value
	 */
   public void setDe112110860(Field source) {
       replace(source,0,source.length(),beginDe112110860,DE_112110860_LEN);
   	
   }  
   
     /**
	 * 	Update De112110860 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDe112110860(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDe112110860,DE_112110860_LEN);
   	
   }
   
     /**
	 * 	Update De112110860 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDe112110860(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDe112110860+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of processingCode100860
	 *	@return processingCode100860
	 */
	public long getProcessingCode100860() throws CFException {
       if (isProcessingCode100860Modified()) { 
           processingCode100860 = refreshProcessingCode100860();
        }
   		return processingCode100860;
	}
	

	
	   
	/**
	 * 	Update ProcessingCode100860 with the passed value
	 *  Corresponding COBOL Variable is 860-PROCESSING-CODE-100
	 *	@param number
	 */
	public void setProcessingCode100860(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    processingCode100860 = checkProcessingCode100860MaxLimit(number); 
		serializeProcessingCode100860(processingCode100860);
	}
	

	/**
	 * 	Update ProcessingCode100860 with the passed value
	 *	@param value (String or char[])
	 */
	public void setProcessingCode100860(char[] value) throws CFException {
		 processingCode100860 = serializeProcessingCode100860(value);
	}
	/**
	 * 	Update ProcessingCode100860 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setProcessingCode100860String(char[] value) throws CFException {
		 setProcessingCode100860(value);
	}
	/**
	 *	Returns the value of tranAmt100860
	 *	@return tranAmt100860
	 */
	public long getTranAmt100860() throws CFException {
       if (isTranAmt100860Modified()) { 
           tranAmt100860 = refreshTranAmt100860();
        }
   		return tranAmt100860;
	}
	

	
	   
	/**
	 * 	Update TranAmt100860 with the passed value
	 *  Corresponding COBOL Variable is 860-TRAN-AMT-100
	 *	@param number
	 */
	public void setTranAmt100860(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    tranAmt100860 = checkTranAmt100860MaxLimit(number); 
		serializeTranAmt100860(tranAmt100860);
	}
	

	/**
	 * 	Update TranAmt100860 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranAmt100860(char[] value) throws CFException {
		 tranAmt100860 = serializeTranAmt100860(value);
	}
	/**
	 * 	Update TranAmt100860 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranAmt100860String(char[] value) throws CFException {
		 setTranAmt100860(value);
	}
	/**
	 *	Returns the value of transactionAmt100860
	 *	@return transactionAmt100860
	 */   
	 public TransactionAmt100860 getTransactionAmt100860() {
   	return transactionAmt100860;
   }
   /**
	* 	Update TransactionAmt100860 with the passed value
	*   Corresponding COBOL Variable is 860-TRANSACTION-AMT-100
	*	@param value
	*/
   public void setTransactionAmt100860(char[] value) {
      transactionAmt100860.setString(value); 
   }   
    
     /**
	 * 	Update TransactionAmt100860 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setTransactionAmt100860(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,transactionAmt100860.begin,transactionAmt100860.length());
   }
   
     /**
	 * 	Update TransactionAmt100860 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTransactionAmt100860(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,transactionAmt100860.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update TransactionAmt100860 with another Field
	 *	@param value
	 */
   public void setTransactionAmt100860(Field source) {
   	replace(source,0,source.length(),transactionAmt100860.begin,transactionAmt100860.length());
   }  
   
     /**
	 * 	Update TransactionAmt100860 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setTransactionAmt100860(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,transactionAmt100860.begin,transactionAmt100860.length());
   }
   
     /**
	 * 	Update TransactionAmt100860 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTransactionAmt100860(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,transactionAmt100860.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of setlAmt100860
	 *	@return setlAmt100860
	 */
	public long getSetlAmt100860() throws CFException {
       if (isSetlAmt100860Modified()) { 
           setlAmt100860 = refreshSetlAmt100860();
        }
   		return setlAmt100860;
	}
	

	
	   
	/**
	 * 	Update SetlAmt100860 with the passed value
	 *  Corresponding COBOL Variable is 860-SETL-AMT-100
	 *	@param number
	 */
	public void setSetlAmt100860(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    setlAmt100860 = checkSetlAmt100860MaxLimit(number); 
		serializeSetlAmt100860(setlAmt100860);
	}
	

	/**
	 * 	Update SetlAmt100860 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSetlAmt100860(char[] value) throws CFException {
		 setlAmt100860 = serializeSetlAmt100860(value);
	}
	/**
	 * 	Update SetlAmt100860 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSetlAmt100860String(char[] value) throws CFException {
		 setSetlAmt100860(value);
	}
	/**
	 *	Returns the value of setlAmnt100860
	 *	@return setlAmnt100860
	 */   
	 public SetlAmnt100860 getSetlAmnt100860() {
   	return setlAmnt100860;
   }
   /**
	* 	Update SetlAmnt100860 with the passed value
	*   Corresponding COBOL Variable is 860-SETL-AMNT-100
	*	@param value
	*/
   public void setSetlAmnt100860(char[] value) {
      setlAmnt100860.setString(value); 
   }   
    
     /**
	 * 	Update SetlAmnt100860 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSetlAmnt100860(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,setlAmnt100860.begin,setlAmnt100860.length());
   }
   
     /**
	 * 	Update SetlAmnt100860 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSetlAmnt100860(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,setlAmnt100860.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SetlAmnt100860 with another Field
	 *	@param value
	 */
   public void setSetlAmnt100860(Field source) {
   	replace(source,0,source.length(),setlAmnt100860.begin,setlAmnt100860.length());
   }  
   
     /**
	 * 	Update SetlAmnt100860 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSetlAmnt100860(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,setlAmnt100860.begin,setlAmnt100860.length());
   }
   
     /**
	 * 	Update SetlAmnt100860 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSetlAmnt100860(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,setlAmnt100860.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of crdhldrBillAmt100860
	 *	@return crdhldrBillAmt100860
	 */
	public long getCrdhldrBillAmt100860() throws CFException {
       if (isCrdhldrBillAmt100860Modified()) { 
           crdhldrBillAmt100860 = refreshCrdhldrBillAmt100860();
        }
   		return crdhldrBillAmt100860;
	}
	

	
	   
	/**
	 * 	Update CrdhldrBillAmt100860 with the passed value
	 *  Corresponding COBOL Variable is 860-CRDHLDR-BILL-AMT-100
	 *	@param number
	 */
	public void setCrdhldrBillAmt100860(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    crdhldrBillAmt100860 = checkCrdhldrBillAmt100860MaxLimit(number); 
		serializeCrdhldrBillAmt100860(crdhldrBillAmt100860);
	}
	

	/**
	 * 	Update CrdhldrBillAmt100860 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCrdhldrBillAmt100860(char[] value) throws CFException {
		 crdhldrBillAmt100860 = serializeCrdhldrBillAmt100860(value);
	}
	/**
	 * 	Update CrdhldrBillAmt100860 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCrdhldrBillAmt100860String(char[] value) throws CFException {
		 setCrdhldrBillAmt100860(value);
	}
	/**
	 *	Returns the value of dateTimeXmit100860
	 *	@return dateTimeXmit100860
	 */
	public long getDateTimeXmit100860() throws CFException {
       if (isDateTimeXmit100860Modified()) { 
           dateTimeXmit100860 = refreshDateTimeXmit100860();
        }
   		return dateTimeXmit100860;
	}
	

	
	   
	/**
	 * 	Update DateTimeXmit100860 with the passed value
	 *  Corresponding COBOL Variable is 860-DATE-TIME-XMIT-100
	 *	@param number
	 */
	public void setDateTimeXmit100860(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    dateTimeXmit100860 = checkDateTimeXmit100860MaxLimit(number); 
		serializeDateTimeXmit100860(dateTimeXmit100860);
	}
	

	/**
	 * 	Update DateTimeXmit100860 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDateTimeXmit100860(char[] value) throws CFException {
		 dateTimeXmit100860 = serializeDateTimeXmit100860(value);
	}
	/**
	 * 	Update DateTimeXmit100860 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDateTimeXmit100860String(char[] value) throws CFException {
		 setDateTimeXmit100860(value);
	}
	/**
	 *	Returns the value of setlConvRte100860
	 *	@return setlConvRte100860
	 */
	public long getSetlConvRte100860() throws CFException {
       if (isSetlConvRte100860Modified()) { 
           setlConvRte100860 = refreshSetlConvRte100860();
        }
   		return setlConvRte100860;
	}
	

	
	   
	/**
	 * 	Update SetlConvRte100860 with the passed value
	 *  Corresponding COBOL Variable is 860-SETL-CONV-RTE-100
	 *	@param number
	 */
	public void setSetlConvRte100860(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    setlConvRte100860 = checkSetlConvRte100860MaxLimit(number); 
		serializeSetlConvRte100860(setlConvRte100860);
	}
	

	/**
	 * 	Update SetlConvRte100860 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSetlConvRte100860(char[] value) throws CFException {
		 setlConvRte100860 = serializeSetlConvRte100860(value);
	}
	/**
	 * 	Update SetlConvRte100860 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSetlConvRte100860String(char[] value) throws CFException {
		 setSetlConvRte100860(value);
	}
	/**
	 *	Returns the value of crdhldrConvRte100860
	 *	@return crdhldrConvRte100860
	 */
	public long getCrdhldrConvRte100860() throws CFException {
       if (isCrdhldrConvRte100860Modified()) { 
           crdhldrConvRte100860 = refreshCrdhldrConvRte100860();
        }
   		return crdhldrConvRte100860;
	}
	

	
	   
	/**
	 * 	Update CrdhldrConvRte100860 with the passed value
	 *  Corresponding COBOL Variable is 860-CRDHLDR-CONV-RTE-100
	 *	@param number
	 */
	public void setCrdhldrConvRte100860(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    crdhldrConvRte100860 = checkCrdhldrConvRte100860MaxLimit(number); 
		serializeCrdhldrConvRte100860(crdhldrConvRte100860);
	}
	

	/**
	 * 	Update CrdhldrConvRte100860 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCrdhldrConvRte100860(char[] value) throws CFException {
		 crdhldrConvRte100860 = serializeCrdhldrConvRte100860(value);
	}
	/**
	 * 	Update CrdhldrConvRte100860 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCrdhldrConvRte100860String(char[] value) throws CFException {
		 setCrdhldrConvRte100860(value);
	}
	/**
	 *	Returns the value of timeLocalTrans100860
	 *	@return timeLocalTrans100860
	 */
	public long getTimeLocalTrans100860() throws CFException {
       if (isTimeLocalTrans100860Modified()) { 
           timeLocalTrans100860 = refreshTimeLocalTrans100860();
        }
   		return timeLocalTrans100860;
	}
	

	
	   
	/**
	 * 	Update TimeLocalTrans100860 with the passed value
	 *  Corresponding COBOL Variable is 860-TIME-LOCAL-TRANS-100
	 *	@param number
	 */
	public void setTimeLocalTrans100860(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    timeLocalTrans100860 = checkTimeLocalTrans100860MaxLimit(number); 
		serializeTimeLocalTrans100860(timeLocalTrans100860);
	}
	

	/**
	 * 	Update TimeLocalTrans100860 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTimeLocalTrans100860(char[] value) throws CFException {
		 timeLocalTrans100860 = serializeTimeLocalTrans100860(value);
	}
	/**
	 * 	Update TimeLocalTrans100860 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTimeLocalTrans100860String(char[] value) throws CFException {
		 setTimeLocalTrans100860(value);
	}
	/**
	 *	Returns the value of dateLocalTrans100860
	 *	@return dateLocalTrans100860
	 */
	public int getDateLocalTrans100860() throws CFException {
       if (isDateLocalTrans100860Modified()) { 
           dateLocalTrans100860 = refreshDateLocalTrans100860();
        }
   		return dateLocalTrans100860;
	}
	

	
	   
	/**
	 * 	Update DateLocalTrans100860 with the passed value
	 *  Corresponding COBOL Variable is 860-DATE-LOCAL-TRANS-100
	 *	@param number
	 */
	public void setDateLocalTrans100860(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    dateLocalTrans100860 = checkDateLocalTrans100860MaxLimit(number); 
		serializeDateLocalTrans100860(dateLocalTrans100860);
	}
	

	public void setDateLocalTrans100860(long number) {
	    number = checkDateLocalTrans100860MaxLimit(number); // Truncate if value is beyond +/- Max range
		setDateLocalTrans100860((int)number);
	}
	
	/**
	 * 	Update DateLocalTrans100860 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDateLocalTrans100860(char[] value) throws CFException {
		 dateLocalTrans100860 = serializeDateLocalTrans100860(value);
	}
	/**
	 * 	Update DateLocalTrans100860 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDateLocalTrans100860String(char[] value) throws CFException {
		 setDateLocalTrans100860(value);
	}
	/**
	 *	Returns the value of cardholderExpdt860
	 *	@return cardholderExpdt860
	 */
   public char[] getCardholderExpdt860() throws CFException{
     if (isCardholderExpdt860Modified()) { 
        cardholderExpdt860 = refreshCardholderExpdt860();
     }
   		return cardholderExpdt860;
   }

  
	/**
	*  set variable cardholderExpdt860
	*  Corresponding COBOL Variable is 860-CARDHOLDER-EXPDT
	*  @param value
	**/
   public void setCardholderExpdt860(char[] value) {
      cardholderExpdt860 = checkCardholderExpdt860Constraints(value);
      serializeCardholderExpdt860(cardholderExpdt860);
   } 

     /**
	 * 	Update CardholderExpdt860 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCardholderExpdt860(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCardholderExpdt860,cardholderExpdt860.length);
   	
   }
   
   public void setCardholderExpdt860(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCardholderExpdt860,cardholderExpdt860.length);
   	
   }
   
     /**
	 * 	Update CardholderExpdt860 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCardholderExpdt860(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCardholderExpdt860+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CardholderExpdt860 with another Field
	 *	@param value
	 */
   public void setCardholderExpdt860(Field source) {
       replace(source,0,source.length(),beginCardholderExpdt860,CARDHOLDER_EXPDT_860_LEN);
   	
   }  
   
     /**
	 * 	Update CardholderExpdt860 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCardholderExpdt860(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCardholderExpdt860,CARDHOLDER_EXPDT_860_LEN);
   	
   }
   
     /**
	 * 	Update CardholderExpdt860 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCardholderExpdt860(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCardholderExpdt860+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of transMmdd860
	 *	@return transMmdd860
	 */
	public int getTransMmdd860() throws CFException {
       if (isTransMmdd860Modified()) { 
           transMmdd860 = refreshTransMmdd860();
        }
   		return transMmdd860;
	}
	

	
	   
	/**
	 * 	Update TransMmdd860 with the passed value
	 *  Corresponding COBOL Variable is 860-TRANS-MMDD
	 *	@param number
	 */
	public void setTransMmdd860(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    transMmdd860 = checkTransMmdd860MaxLimit(number); 
		serializeTransMmdd860(transMmdd860);
	}
	

	public void setTransMmdd860(long number) {
	    number = checkTransMmdd860MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTransMmdd860((int)number);
	}
	
	/**
	 * 	Update TransMmdd860 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTransMmdd860(char[] value) throws CFException {
		 transMmdd860 = serializeTransMmdd860(value);
	}
	/**
	 * 	Update TransMmdd860 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTransMmdd860String(char[] value) throws CFException {
		 setTransMmdd860(value);
	}
	/**
	 *	Returns the value of conv100Mmdd860
	 *	@return conv100Mmdd860
	 */
	public int getConv100Mmdd860() throws CFException {
       if (isConv100Mmdd860Modified()) { 
           conv100Mmdd860 = refreshConv100Mmdd860();
        }
   		return conv100Mmdd860;
	}
	

	
	   
	/**
	 * 	Update Conv100Mmdd860 with the passed value
	 *  Corresponding COBOL Variable is 860-CONV-100-MMDD
	 *	@param number
	 */
	public void setConv100Mmdd860(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    conv100Mmdd860 = checkConv100Mmdd860MaxLimit(number); 
		serializeConv100Mmdd860(conv100Mmdd860);
	}
	

	public void setConv100Mmdd860(long number) {
	    number = checkConv100Mmdd860MaxLimit(number); // Truncate if value is beyond +/- Max range
		setConv100Mmdd860((int)number);
	}
	
	/**
	 * 	Update Conv100Mmdd860 with the passed value
	 *	@param value (String or char[])
	 */
	public void setConv100Mmdd860(char[] value) throws CFException {
		 conv100Mmdd860 = serializeConv100Mmdd860(value);
	}
	/**
	 * 	Update Conv100Mmdd860 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setConv100Mmdd860String(char[] value) throws CFException {
		 setConv100Mmdd860(value);
	}
	/**
	 *	Returns the value of merchantType860
	 *	@return merchantType860
	 */
	public int getMerchantType860() throws CFException {
       if (isMerchantType860Modified()) { 
           merchantType860 = refreshMerchantType860();
        }
   		return merchantType860;
	}
	

	
	   
	/**
	 * 	Update MerchantType860 with the passed value
	 *  Corresponding COBOL Variable is 860-MERCHANT-TYPE
	 *	@param number
	 */
	public void setMerchantType860(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    merchantType860 = checkMerchantType860MaxLimit(number); 
		serializeMerchantType860(merchantType860);
	}
	

	public void setMerchantType860(long number) {
	    number = checkMerchantType860MaxLimit(number); // Truncate if value is beyond +/- Max range
		setMerchantType860((int)number);
	}
	
	/**
	 * 	Update MerchantType860 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMerchantType860(char[] value) throws CFException {
		 merchantType860 = serializeMerchantType860(value);
	}
	/**
	 * 	Update MerchantType860 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMerchantType860String(char[] value) throws CFException {
		 setMerchantType860(value);
	}
	/**
	 *	Returns the value of countryCode860
	 *	@return countryCode860
	 */
   public char[] getCountryCode860() throws CFException{
     if (isCountryCode860Modified()) { 
        countryCode860 = refreshCountryCode860();
     }
   		return countryCode860;
   }

  
	/**
	*  set variable countryCode860
	*  Corresponding COBOL Variable is 860-COUNTRY-CODE
	*  @param value
	**/
   public void setCountryCode860(char[] value) {
      countryCode860 = checkCountryCode860Constraints(value);
      serializeCountryCode860(countryCode860);
   } 

     /**
	 * 	Update CountryCode860 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCountryCode860(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCountryCode860,countryCode860.length);
   	
   }
   
   public void setCountryCode860(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCountryCode860,countryCode860.length);
   	
   }
   
     /**
	 * 	Update CountryCode860 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCountryCode860(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCountryCode860+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CountryCode860 with another Field
	 *	@param value
	 */
   public void setCountryCode860(Field source) {
       replace(source,0,source.length(),beginCountryCode860,COUNTRY_CODE_860_LEN);
   	
   }  
   
     /**
	 * 	Update CountryCode860 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCountryCode860(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCountryCode860,COUNTRY_CODE_860_LEN);
   	
   }
   
     /**
	 * 	Update CountryCode860 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCountryCode860(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCountryCode860+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of posDeviceType860
	 *	@return posDeviceType860
	 */
   public char[] getPosDeviceType860() throws CFException{
     if (isPosDeviceType860Modified()) { 
        posDeviceType860 = refreshPosDeviceType860();
     }
   		return posDeviceType860;
   }

  
	/**
	*  set variable posDeviceType860
	*  Corresponding COBOL Variable is 860-POS-DEVICE-TYPE
	*  @param value
	**/
   public void setPosDeviceType860(char[] value) {
      posDeviceType860 = checkPosDeviceType860Constraints(value);
      serializePosDeviceType860(posDeviceType860);
   } 

     /**
	 * 	Update PosDeviceType860 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPosDeviceType860(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPosDeviceType860,posDeviceType860.length);
   	
   }
   
   public void setPosDeviceType860(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPosDeviceType860,posDeviceType860.length);
   	
   }
   
     /**
	 * 	Update PosDeviceType860 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPosDeviceType860(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPosDeviceType860+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PosDeviceType860 with another Field
	 *	@param value
	 */
   public void setPosDeviceType860(Field source) {
       replace(source,0,source.length(),beginPosDeviceType860,POS_DEVICE_TYPE_860_LEN);
   	
   }  
   
     /**
	 * 	Update PosDeviceType860 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPosDeviceType860(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPosDeviceType860,POS_DEVICE_TYPE_860_LEN);
   	
   }
   
     /**
	 * 	Update PosDeviceType860 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPosDeviceType860(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPosDeviceType860+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of posPinCapture860
	 *	@return posPinCapture860
	 */
	public int getPosPinCapture860() throws CFException {
       if (isPosPinCapture860Modified()) { 
           posPinCapture860 = refreshPosPinCapture860();
        }
   		return posPinCapture860;
	}
	

	
	   
	/**
	 * 	Update PosPinCapture860 with the passed value
	 *  Corresponding COBOL Variable is 860-POS-PIN-CAPTURE
	 *	@param number
	 */
	public void setPosPinCapture860(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    posPinCapture860 = checkPosPinCapture860MaxLimit(number); 
		serializePosPinCapture860(posPinCapture860);
	}
	

	public void setPosPinCapture860(long number) {
	    number = checkPosPinCapture860MaxLimit(number); // Truncate if value is beyond +/- Max range
		setPosPinCapture860((int)number);
	}
	
	/**
	 * 	Update PosPinCapture860 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPosPinCapture860(char[] value) throws CFException {
		 posPinCapture860 = serializePosPinCapture860(value);
	}
	/**
	 * 	Update PosPinCapture860 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPosPinCapture860String(char[] value) throws CFException {
		 setPosPinCapture860(value);
	}
	/**
	 *	Returns the value of trackTwoData860
	 *	@return trackTwoData860
	 */
   public char[] getTrackTwoData860() throws CFException{
     if (isTrackTwoData860Modified()) { 
        trackTwoData860 = refreshTrackTwoData860();
     }
   		return trackTwoData860;
   }

  
	/**
	*  set variable trackTwoData860
	*  Corresponding COBOL Variable is 860-TRACK-TWO-DATA
	*  @param value
	**/
   public void setTrackTwoData860(char[] value) {
      trackTwoData860 = checkTrackTwoData860Constraints(value);
      serializeTrackTwoData860(trackTwoData860);
   } 

     /**
	 * 	Update TrackTwoData860 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTrackTwoData860(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTrackTwoData860,trackTwoData860.length);
   	
   }
   
   public void setTrackTwoData860(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTrackTwoData860,trackTwoData860.length);
   	
   }
   
     /**
	 * 	Update TrackTwoData860 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTrackTwoData860(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTrackTwoData860+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TrackTwoData860 with another Field
	 *	@param value
	 */
   public void setTrackTwoData860(Field source) {
       replace(source,0,source.length(),beginTrackTwoData860,TRACK_TWO_DATA_860_LEN);
   	
   }  
   
     /**
	 * 	Update TrackTwoData860 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTrackTwoData860(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTrackTwoData860,TRACK_TWO_DATA_860_LEN);
   	
   }
   
     /**
	 * 	Update TrackTwoData860 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTrackTwoData860(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTrackTwoData860+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of retrievalRefno860
	 *	@return retrievalRefno860
	 */
   public char[] getRetrievalRefno860() throws CFException{
     if (isRetrievalRefno860Modified()) { 
        retrievalRefno860 = refreshRetrievalRefno860();
     }
   		return retrievalRefno860;
   }

  
	/**
	*  set variable retrievalRefno860
	*  Corresponding COBOL Variable is 860-RETRIEVAL-REFNO
	*  @param value
	**/
   public void setRetrievalRefno860(char[] value) {
      retrievalRefno860 = checkRetrievalRefno860Constraints(value);
      serializeRetrievalRefno860(retrievalRefno860);
   } 

     /**
	 * 	Update RetrievalRefno860 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRetrievalRefno860(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRetrievalRefno860,retrievalRefno860.length);
   	
   }
   
   public void setRetrievalRefno860(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRetrievalRefno860,retrievalRefno860.length);
   	
   }
   
     /**
	 * 	Update RetrievalRefno860 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRetrievalRefno860(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRetrievalRefno860+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RetrievalRefno860 with another Field
	 *	@param value
	 */
   public void setRetrievalRefno860(Field source) {
       replace(source,0,source.length(),beginRetrievalRefno860,RETRIEVAL_REFNO_860_LEN);
   	
   }  
   
     /**
	 * 	Update RetrievalRefno860 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRetrievalRefno860(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRetrievalRefno860,RETRIEVAL_REFNO_860_LEN);
   	
   }
   
     /**
	 * 	Update RetrievalRefno860 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRetrievalRefno860(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRetrievalRefno860+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of idTerminal860
	 *	@return idTerminal860
	 */
   public char[] getIdTerminal860() throws CFException{
     if (isIdTerminal860Modified()) { 
        idTerminal860 = refreshIdTerminal860();
     }
   		return idTerminal860;
   }

  
	/**
	*  set variable idTerminal860
	*  Corresponding COBOL Variable is 860-ID-TERMINAL
	*  @param value
	**/
   public void setIdTerminal860(char[] value) {
      idTerminal860 = checkIdTerminal860Constraints(value);
      serializeIdTerminal860(idTerminal860);
   } 

     /**
	 * 	Update IdTerminal860 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIdTerminal860(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIdTerminal860,idTerminal860.length);
   	
   }
   
   public void setIdTerminal860(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIdTerminal860,idTerminal860.length);
   	
   }
   
     /**
	 * 	Update IdTerminal860 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIdTerminal860(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIdTerminal860+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update IdTerminal860 with another Field
	 *	@param value
	 */
   public void setIdTerminal860(Field source) {
       replace(source,0,source.length(),beginIdTerminal860,ID_TERMINAL_860_LEN);
   	
   }  
   
     /**
	 * 	Update IdTerminal860 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIdTerminal860(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIdTerminal860,ID_TERMINAL_860_LEN);
   	
   }
   
     /**
	 * 	Update IdTerminal860 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIdTerminal860(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIdTerminal860+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cardAcceptor860
	 *	@return cardAcceptor860
	 */
   public char[] getCardAcceptor860() throws CFException{
     if (isCardAcceptor860Modified()) { 
        cardAcceptor860 = refreshCardAcceptor860();
     }
   		return cardAcceptor860;
   }

  
	/**
	*  set variable cardAcceptor860
	*  Corresponding COBOL Variable is 860-CARD-ACCEPTOR
	*  @param value
	**/
   public void setCardAcceptor860(char[] value) {
      cardAcceptor860 = checkCardAcceptor860Constraints(value);
      serializeCardAcceptor860(cardAcceptor860);
   } 

     /**
	 * 	Update CardAcceptor860 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCardAcceptor860(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCardAcceptor860,cardAcceptor860.length);
   	
   }
   
   public void setCardAcceptor860(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCardAcceptor860,cardAcceptor860.length);
   	
   }
   
     /**
	 * 	Update CardAcceptor860 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCardAcceptor860(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCardAcceptor860+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CardAcceptor860 with another Field
	 *	@param value
	 */
   public void setCardAcceptor860(Field source) {
       replace(source,0,source.length(),beginCardAcceptor860,CARD_ACCEPTOR_860_LEN);
   	
   }  
   
     /**
	 * 	Update CardAcceptor860 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCardAcceptor860(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCardAcceptor860,CARD_ACCEPTOR_860_LEN);
   	
   }
   
     /**
	 * 	Update CardAcceptor860 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCardAcceptor860(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCardAcceptor860+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of authMrchNmctst860
	 *	@return authMrchNmctst860
	 */
   public char[] getAuthMrchNmctst860() throws CFException{
     if (isAuthMrchNmctst860Modified()) { 
        authMrchNmctst860 = refreshAuthMrchNmctst860();
     }
   		return authMrchNmctst860;
   }

  
	/**
	*  set variable authMrchNmctst860
	*  Corresponding COBOL Variable is 860-AUTH-MRCH-NMCTST
	*  @param value
	**/
   public void setAuthMrchNmctst860(char[] value) {
      authMrchNmctst860 = checkAuthMrchNmctst860Constraints(value);
      serializeAuthMrchNmctst860(authMrchNmctst860);
   } 

     /**
	 * 	Update AuthMrchNmctst860 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAuthMrchNmctst860(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAuthMrchNmctst860,authMrchNmctst860.length);
   	
   }
   
   public void setAuthMrchNmctst860(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAuthMrchNmctst860,authMrchNmctst860.length);
   	
   }
   
     /**
	 * 	Update AuthMrchNmctst860 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAuthMrchNmctst860(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAuthMrchNmctst860+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AuthMrchNmctst860 with another Field
	 *	@param value
	 */
   public void setAuthMrchNmctst860(Field source) {
       replace(source,0,source.length(),beginAuthMrchNmctst860,AUTH_MRCH_NMCTST_860_LEN);
   	
   }  
   
     /**
	 * 	Update AuthMrchNmctst860 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAuthMrchNmctst860(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAuthMrchNmctst860,AUTH_MRCH_NMCTST_860_LEN);
   	
   }
   
     /**
	 * 	Update AuthMrchNmctst860 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAuthMrchNmctst860(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAuthMrchNmctst860+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of trackOneData860
	 *	@return trackOneData860
	 */
   public char[] getTrackOneData860() throws CFException{
     if (isTrackOneData860Modified()) { 
        trackOneData860 = refreshTrackOneData860();
     }
   		return trackOneData860;
   }

  
	/**
	*  set variable trackOneData860
	*  Corresponding COBOL Variable is 860-TRACK-ONE-DATA
	*  @param value
	**/
   public void setTrackOneData860(char[] value) {
      trackOneData860 = checkTrackOneData860Constraints(value);
      serializeTrackOneData860(trackOneData860);
   } 

     /**
	 * 	Update TrackOneData860 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTrackOneData860(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTrackOneData860,trackOneData860.length);
   	
   }
   
   public void setTrackOneData860(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTrackOneData860,trackOneData860.length);
   	
   }
   
     /**
	 * 	Update TrackOneData860 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTrackOneData860(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTrackOneData860+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TrackOneData860 with another Field
	 *	@param value
	 */
   public void setTrackOneData860(Field source) {
       replace(source,0,source.length(),beginTrackOneData860,TRACK_ONE_DATA_860_LEN);
   	
   }  
   
     /**
	 * 	Update TrackOneData860 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTrackOneData860(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTrackOneData860,TRACK_ONE_DATA_860_LEN);
   	
   }
   
     /**
	 * 	Update TrackOneData860 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTrackOneData860(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTrackOneData860+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of currencyCode860
	 *	@return currencyCode860
	 */
   public char[] getCurrencyCode860() throws CFException{
     if (isCurrencyCode860Modified()) { 
        currencyCode860 = refreshCurrencyCode860();
     }
   		return currencyCode860;
   }

  
	/**
	*  set variable currencyCode860
	*  Corresponding COBOL Variable is 860-CURRENCY-CODE
	*  @param value
	**/
   public void setCurrencyCode860(char[] value) {
      currencyCode860 = checkCurrencyCode860Constraints(value);
      serializeCurrencyCode860(currencyCode860);
   } 

     /**
	 * 	Update CurrencyCode860 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrencyCode860(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurrencyCode860,currencyCode860.length);
   	
   }
   
   public void setCurrencyCode860(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurrencyCode860,currencyCode860.length);
   	
   }
   
     /**
	 * 	Update CurrencyCode860 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrencyCode860(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrencyCode860+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurrencyCode860 with another Field
	 *	@param value
	 */
   public void setCurrencyCode860(Field source) {
       replace(source,0,source.length(),beginCurrencyCode860,CURRENCY_CODE_860_LEN);
   	
   }  
   
     /**
	 * 	Update CurrencyCode860 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrencyCode860(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurrencyCode860,CURRENCY_CODE_860_LEN);
   	
   }
   
     /**
	 * 	Update CurrencyCode860 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrencyCode860(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrencyCode860+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of crncyCdeSetl100860
	 *	@return crncyCdeSetl100860
	 */
	public int getCrncyCdeSetl100860() throws CFException {
       if (isCrncyCdeSetl100860Modified()) { 
           crncyCdeSetl100860 = refreshCrncyCdeSetl100860();
        }
   		return crncyCdeSetl100860;
	}
	

	
	   
	/**
	 * 	Update CrncyCdeSetl100860 with the passed value
	 *  Corresponding COBOL Variable is 860-CRNCY-CDE-SETL-100
	 *	@param number
	 */
	public void setCrncyCdeSetl100860(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    crncyCdeSetl100860 = checkCrncyCdeSetl100860MaxLimit(number); 
		serializeCrncyCdeSetl100860(crncyCdeSetl100860);
	}
	

	public void setCrncyCdeSetl100860(long number) {
	    number = checkCrncyCdeSetl100860MaxLimit(number); // Truncate if value is beyond +/- Max range
		setCrncyCdeSetl100860((int)number);
	}
	
	/**
	 * 	Update CrncyCdeSetl100860 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCrncyCdeSetl100860(char[] value) throws CFException {
		 crncyCdeSetl100860 = serializeCrncyCdeSetl100860(value);
	}
	/**
	 * 	Update CrncyCdeSetl100860 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCrncyCdeSetl100860String(char[] value) throws CFException {
		 setCrncyCdeSetl100860(value);
	}
	/**
	 *	Returns the value of crncyCrdhldr100860
	 *	@return crncyCrdhldr100860
	 */
	public int getCrncyCrdhldr100860() throws CFException {
       if (isCrncyCrdhldr100860Modified()) { 
           crncyCrdhldr100860 = refreshCrncyCrdhldr100860();
        }
   		return crncyCrdhldr100860;
	}
	

	
	   
	/**
	 * 	Update CrncyCrdhldr100860 with the passed value
	 *  Corresponding COBOL Variable is 860-CRNCY-CRDHLDR-100
	 *	@param number
	 */
	public void setCrncyCrdhldr100860(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    crncyCrdhldr100860 = checkCrncyCrdhldr100860MaxLimit(number); 
		serializeCrncyCrdhldr100860(crncyCrdhldr100860);
	}
	

	public void setCrncyCrdhldr100860(long number) {
	    number = checkCrncyCrdhldr100860MaxLimit(number); // Truncate if value is beyond +/- Max range
		setCrncyCrdhldr100860((int)number);
	}
	
	/**
	 * 	Update CrncyCrdhldr100860 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCrncyCrdhldr100860(char[] value) throws CFException {
		 crncyCrdhldr100860 = serializeCrncyCrdhldr100860(value);
	}
	/**
	 * 	Update CrncyCrdhldr100860 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCrncyCrdhldr100860String(char[] value) throws CFException {
		 setCrncyCrdhldr100860(value);
	}
	/**
	 *	Returns the value of posData860
	 *	@return posData860
	 */
   public char[] getPosData860() throws CFException{
     if (isPosData860Modified()) { 
        posData860 = refreshPosData860();
     }
   		return posData860;
   }

  
	/**
	*  set variable posData860
	*  Corresponding COBOL Variable is 860-POS-DATA
	*  @param value
	**/
   public void setPosData860(char[] value) {
      posData860 = checkPosData860Constraints(value);
      serializePosData860(posData860);
   } 

     /**
	 * 	Update PosData860 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPosData860(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPosData860,posData860.length);
   	
   }
   
   public void setPosData860(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPosData860,posData860.length);
   	
   }
   
     /**
	 * 	Update PosData860 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPosData860(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPosData860+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PosData860 with another Field
	 *	@param value
	 */
   public void setPosData860(Field source) {
       replace(source,0,source.length(),beginPosData860,POS_DATA_860_LEN);
   	
   }  
   
     /**
	 * 	Update PosData860 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPosData860(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPosData860,POS_DATA_860_LEN);
   	
   }
   
     /**
	 * 	Update PosData860 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPosData860(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPosData860+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bkntData860
	 *	@return bkntData860
	 */   
	 public BkntData860 getBkntData860() {
   	return bkntData860;
   }
   /**
	* 	Update BkntData860 with the passed value
	*   Corresponding COBOL Variable is 860-BKNT-DATA
	*	@param value
	*/
   public void setBkntData860(char[] value) {
      bkntData860.setString(value); 
   }   
    
     /**
	 * 	Update BkntData860 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBkntData860(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bkntData860.begin,bkntData860.length());
   }
   
     /**
	 * 	Update BkntData860 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBkntData860(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bkntData860.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BkntData860 with another Field
	 *	@param value
	 */
   public void setBkntData860(Field source) {
   	replace(source,0,source.length(),bkntData860.begin,bkntData860.length());
   }  
   
     /**
	 * 	Update BkntData860 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBkntData860(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bkntData860.begin,bkntData860.length());
   }
   
     /**
	 * 	Update BkntData860 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBkntData860(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bkntData860.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of de112100860
	 *	@return de112100860
	 */
   public char[] getDe112100860() throws CFException{
     if (isDe112100860Modified()) { 
        de112100860 = refreshDe112100860();
     }
   		return de112100860;
   }

  
	/**
	*  set variable de112100860
	*  Corresponding COBOL Variable is 860-DE112-100
	*  @param value
	**/
   public void setDe112100860(char[] value) {
      de112100860 = checkDe112100860Constraints(value);
      serializeDe112100860(de112100860);
   } 

     /**
	 * 	Update De112100860 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDe112100860(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDe112100860,de112100860.length);
   	
   }
   
   public void setDe112100860(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDe112100860,de112100860.length);
   	
   }
   
     /**
	 * 	Update De112100860 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDe112100860(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDe112100860+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update De112100860 with another Field
	 *	@param value
	 */
   public void setDe112100860(Field source) {
       replace(source,0,source.length(),beginDe112100860,DE_112100860_LEN);
   	
   }  
   
     /**
	 * 	Update De112100860 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDe112100860(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDe112100860,DE_112100860_LEN);
   	
   }
   
     /**
	 * 	Update De112100860 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDe112100860(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDe112100860+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of crncyConv100860
	 *	@return crncyConv100860
	 */
   public char[] getCrncyConv100860() throws CFException{
     if (isCrncyConv100860Modified()) { 
        crncyConv100860 = refreshCrncyConv100860();
     }
   		return crncyConv100860;
   }

  
	/**
	*  set variable crncyConv100860
	*  Corresponding COBOL Variable is 860-CRNCY-CONV-100
	*  @param value
	**/
   public void setCrncyConv100860(char[] value) {
      crncyConv100860 = checkCrncyConv100860Constraints(value);
      serializeCrncyConv100860(crncyConv100860);
   } 

     /**
	 * 	Update CrncyConv100860 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCrncyConv100860(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCrncyConv100860,crncyConv100860.length);
   	
   }
   
   public void setCrncyConv100860(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCrncyConv100860,crncyConv100860.length);
   	
   }
   
     /**
	 * 	Update CrncyConv100860 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCrncyConv100860(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCrncyConv100860+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CrncyConv100860 with another Field
	 *	@param value
	 */
   public void setCrncyConv100860(Field source) {
       replace(source,0,source.length(),beginCrncyConv100860,CRNCY_CONV_100860_LEN);
   	
   }  
   
     /**
	 * 	Update CrncyConv100860 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCrncyConv100860(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCrncyConv100860,CRNCY_CONV_100860_LEN);
   	
   }
   
     /**
	 * 	Update CrncyConv100860 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCrncyConv100860(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCrncyConv100860+targetIndex,targetLen);
    
   }

	
	
	

		public static int getLogDecompressedData860FieldLength() {
			return LOG_DECOMPRESSED_DATA_860_LENGTH;
		}

}
  
