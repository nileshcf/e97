package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class LogDecompressedData860Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:30. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class LogDecompressedData860Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(LogDecompressedData860Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int LOG_DECOMPRESSED_DATA_860_LENGTH = 875;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCardholderNbr860;
            protected  int beginProcessingCode110860;
            protected  int beginTransactionAmount860;
            protected  int beginSetlAmount110860;
            protected  int beginCrdhldrBillAmt110860;
            protected  int beginDateTimeXmit110860;
            protected  int beginSetlConvRte110860;
            protected  int beginCrdhldrConvRte110860;
            protected  int beginSysTraceAudit860;
            protected  int beginTransMmdd110860;
            protected  int beginConv110Mmdd860;
            protected  int beginMerchantType110860;
            protected  int beginCountryCode110860;
            protected  int beginPosEntry110860;
            protected  int beginPosPinCapture110860;
            protected  int beginAcquirerIca860;
            protected  int beginForwardInstId860;
            protected  int beginRetrievalRefno110860;
            protected  int beginAuthNumber860;
            protected  int beginAuthResponse860;
            protected  int beginIdTerminal110860;
            protected  int beginCardAcceptor110860;
            protected  int beginAuthMrchNmctst110860;
            protected  int beginAuthAddlData860;
            protected  int beginAvsCurrCode110860;
            protected  int beginCrncyCdeSetl110860;
            protected  int beginCrncyCrdhldr110860;
            protected  int beginDe112110860;
            protected  int beginProcessingCode100860;
            protected  int beginTranAmt100860;
            protected  int beginSetlAmt100860;
            protected  int beginCrdhldrBillAmt100860;
            protected  int beginDateTimeXmit100860;
            protected  int beginSetlConvRte100860;
            protected  int beginCrdhldrConvRte100860;
            protected  int beginTimeLocalTrans100860;
            protected  int beginDateLocalTrans100860;
            protected  int beginCardholderExpdt860;
            protected  int beginTransMmdd860;
            protected  int beginConv100Mmdd860;
            protected  int beginMerchantType860;
            protected  int beginCountryCode860;
            protected  int beginPosDeviceType860;
            protected  int beginPosPinCapture860;
            protected  int beginTrackTwoData860;
            protected  int beginRetrievalRefno860;
            protected  int beginIdTerminal860;
            protected  int beginCardAcceptor860;
            protected  int beginAuthMrchNmctst860;
            protected  int beginTrackOneData860;
            protected  int beginCurrencyCode860;
            protected  int beginCrncyCdeSetl100860;
            protected  int beginCrncyCrdhldr100860;
            protected  int beginPosData860;
            protected  int beginDe112100860;
            protected  int beginCrncyConv100860;
	
	/**
	* Constructor for LogDecompressedData860Serialized
	**/
    public LogDecompressedData860Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in LogDecompressedData860Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(LOG_DECOMPRESSED_DATA_860_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCardholderNbr860 = getStartOffset() + 0;	// set offset for serialization
  
             beginProcessingCode110860 = getStartOffset() + 19;	// set offset for serialization
  
             beginTransactionAmount860 = getStartOffset() + 25;	// set offset for serialization
  
  
             beginSetlAmount110860 = getStartOffset() + 37;	// set offset for serialization
  
  
             beginCrdhldrBillAmt110860 = getStartOffset() + 49;	// set offset for serialization
  
             beginDateTimeXmit110860 = getStartOffset() + 61;	// set offset for serialization
  
             beginSetlConvRte110860 = getStartOffset() + 71;	// set offset for serialization
  
             beginCrdhldrConvRte110860 = getStartOffset() + 79;	// set offset for serialization
  
             beginSysTraceAudit860 = getStartOffset() + 87;	// set offset for serialization
  
             beginTransMmdd110860 = getStartOffset() + 93;	// set offset for serialization
  
             beginConv110Mmdd860 = getStartOffset() + 97;	// set offset for serialization
  
             beginMerchantType110860 = getStartOffset() + 101;	// set offset for serialization
  
             beginCountryCode110860 = getStartOffset() + 105;	// set offset for serialization
  
             beginPosEntry110860 = getStartOffset() + 108;	// set offset for serialization
  
             beginPosPinCapture110860 = getStartOffset() + 111;	// set offset for serialization
  
             beginAcquirerIca860 = getStartOffset() + 113;	// set offset for serialization
  
  
             beginForwardInstId860 = getStartOffset() + 119;	// set offset for serialization
  
  
             beginRetrievalRefno110860 = getStartOffset() + 125;	// set offset for serialization
  
             beginAuthNumber860 = getStartOffset() + 137;	// set offset for serialization
  
             beginAuthResponse860 = getStartOffset() + 143;	// set offset for serialization
  
             beginIdTerminal110860 = getStartOffset() + 145;	// set offset for serialization
  
             beginCardAcceptor110860 = getStartOffset() + 153;	// set offset for serialization
  
             beginAuthMrchNmctst110860 = getStartOffset() + 168;	// set offset for serialization
  
             beginAuthAddlData860 = getStartOffset() + 208;	// set offset for serialization
  
             beginAvsCurrCode110860 = getStartOffset() + 233;	// set offset for serialization
  
             beginCrncyCdeSetl110860 = getStartOffset() + 236;	// set offset for serialization
  
             beginCrncyCrdhldr110860 = getStartOffset() + 239;	// set offset for serialization
  
  
             beginDe112110860 = getStartOffset() + 254;	// set offset for serialization
  
             beginProcessingCode100860 = getStartOffset() + 357;	// set offset for serialization
  
             beginTranAmt100860 = getStartOffset() + 363;	// set offset for serialization
  
  
             beginSetlAmt100860 = getStartOffset() + 375;	// set offset for serialization
  
  
             beginCrdhldrBillAmt100860 = getStartOffset() + 387;	// set offset for serialization
  
             beginDateTimeXmit100860 = getStartOffset() + 399;	// set offset for serialization
  
             beginSetlConvRte100860 = getStartOffset() + 409;	// set offset for serialization
  
             beginCrdhldrConvRte100860 = getStartOffset() + 417;	// set offset for serialization
  
             beginTimeLocalTrans100860 = getStartOffset() + 425;	// set offset for serialization
  
             beginDateLocalTrans100860 = getStartOffset() + 431;	// set offset for serialization
  
             beginCardholderExpdt860 = getStartOffset() + 435;	// set offset for serialization
  
             beginTransMmdd860 = getStartOffset() + 439;	// set offset for serialization
  
             beginConv100Mmdd860 = getStartOffset() + 443;	// set offset for serialization
  
             beginMerchantType860 = getStartOffset() + 447;	// set offset for serialization
  
             beginCountryCode860 = getStartOffset() + 451;	// set offset for serialization
  
             beginPosDeviceType860 = getStartOffset() + 454;	// set offset for serialization
  
             beginPosPinCapture860 = getStartOffset() + 457;	// set offset for serialization
  
             beginTrackTwoData860 = getStartOffset() + 459;	// set offset for serialization
  
             beginRetrievalRefno860 = getStartOffset() + 496;	// set offset for serialization
  
             beginIdTerminal860 = getStartOffset() + 508;	// set offset for serialization
  
             beginCardAcceptor860 = getStartOffset() + 516;	// set offset for serialization
  
             beginAuthMrchNmctst860 = getStartOffset() + 531;	// set offset for serialization
  
             beginTrackOneData860 = getStartOffset() + 571;	// set offset for serialization
  
             beginCurrencyCode860 = getStartOffset() + 647;	// set offset for serialization
  
             beginCrncyCdeSetl100860 = getStartOffset() + 650;	// set offset for serialization
  
             beginCrncyCrdhldr100860 = getStartOffset() + 653;	// set offset for serialization
  
             beginPosData860 = getStartOffset() + 656;	// set offset for serialization
  
  
             beginDe112100860 = getStartOffset() + 694;	// set offset for serialization
  
             beginCrncyConv100860 = getStartOffset() + 797;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCardholderNbr860Counter = -1;
     public boolean isCardholderNbr860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCardholderNbr860Counter != sharedCounter;
         localCardholderNbr860Counter = sharedCounter; return hasModified;
     }
	protected static final int CARDHOLDER_NBR_860_LEN = 19;
	/**
	 * 	serialize this CardholderNbr860
	 */
   protected void serializeCardholderNbr860(char[] cardholderNbr860) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cardholderNbr860,0,getStringValue(),beginCardholderNbr860,CARDHOLDER_NBR_860_LEN);
       localCardholderNbr860Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCardholderNbr860Constraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshCardholderNbr860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCardholderNbr860() {	 
   		return (substring(getStringValue(),beginCardholderNbr860,beginCardholderNbr860 + CARDHOLDER_NBR_860_LEN));
   	}
     int localProcessingCode110860Counter = -1;
     public boolean isProcessingCode110860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localProcessingCode110860Counter != sharedCounter;
         localProcessingCode110860Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of processingCode110860
	 *	@return processingCode110860
	 */
	public char[]  getProcessingCode110860String() {
	     return getCharArray(beginProcessingCode110860,PROCESSING_CODE_110860_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean processingCode110860IsNumeric() {
	    return isNumeric(beginProcessingCode110860
	                    ,beginProcessingCode110860 + PROCESSING_CODE_110860_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PROCESSING_CODE_110860_LEN = 6;
  	/**
	 * serializeProcessingCode110860
	 */
	protected void serializeProcessingCode110860(long processingCode110860) {
		 putNumber(beginProcessingCode110860,processingCode110860,PROCESSING_CODE_110860_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localProcessingCode110860Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeProcessingCode110860
	 */
   	protected  long serializeProcessingCode110860(char[] value) {
	    long  processingCode110860;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    processingCode110860 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginProcessingCode110860
		       ,6
		      );
		 localProcessingCode110860Counter = shareString.getSerializedField().getModifiedCounter();
		return  processingCode110860;
    }

   protected long checkProcessingCode110860MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshProcessingCode110860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshProcessingCode110860() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginProcessingCode110860
			                 ,PROCESSING_CODE_110860_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("processingCode110860", beginProcessingCode110860,PROCESSING_CODE_110860_LEN);
    }
   	}
     int localTransactionAmount860Counter = -1;
     public boolean isTransactionAmount860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTransactionAmount860Counter != sharedCounter;
         localTransactionAmount860Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of transactionAmount860
	 *	@return transactionAmount860
	 */
	public char[]  getTransactionAmount860String() {
	     return getCharArray(beginTransactionAmount860,TRANSACTION_AMOUNT_860_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean transactionAmount860IsNumeric() {
	    return isNumeric(beginTransactionAmount860
	                    ,beginTransactionAmount860 + TRANSACTION_AMOUNT_860_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TRANSACTION_AMOUNT_860_LEN = 12;
  	/**
	 * serializeTransactionAmount860
	 */
	protected void serializeTransactionAmount860(long transactionAmount860) {
		 putNumber(beginTransactionAmount860,transactionAmount860,TRANSACTION_AMOUNT_860_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTransactionAmount860Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTransactionAmount860
	 */
   	protected  long serializeTransactionAmount860(char[] value) {
	    long  transactionAmount860;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    transactionAmount860 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginTransactionAmount860
		       ,12
		      );
		 localTransactionAmount860Counter = shareString.getSerializedField().getModifiedCounter();
		return  transactionAmount860;
    }

   protected long checkTransactionAmount860MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTransactionAmount860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTransactionAmount860() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTransactionAmount860
			                 ,TRANSACTION_AMOUNT_860_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("transactionAmount860", beginTransactionAmount860,TRANSACTION_AMOUNT_860_LEN);
    }
   	}
     int localSetlAmount110860Counter = -1;
     public boolean isSetlAmount110860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSetlAmount110860Counter != sharedCounter;
         localSetlAmount110860Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of setlAmount110860
	 *	@return setlAmount110860
	 */
	public char[]  getSetlAmount110860String() {
	     return getCharArray(beginSetlAmount110860,SETL_AMOUNT_110860_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean setlAmount110860IsNumeric() {
	    return isNumeric(beginSetlAmount110860
	                    ,beginSetlAmount110860 + SETL_AMOUNT_110860_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SETL_AMOUNT_110860_LEN = 12;
  	/**
	 * serializeSetlAmount110860
	 */
	protected void serializeSetlAmount110860(long setlAmount110860) {
		 putNumber(beginSetlAmount110860,setlAmount110860,SETL_AMOUNT_110860_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSetlAmount110860Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSetlAmount110860
	 */
   	protected  long serializeSetlAmount110860(char[] value) {
	    long  setlAmount110860;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    setlAmount110860 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginSetlAmount110860
		       ,12
		      );
		 localSetlAmount110860Counter = shareString.getSerializedField().getModifiedCounter();
		return  setlAmount110860;
    }

   protected long checkSetlAmount110860MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSetlAmount110860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSetlAmount110860() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSetlAmount110860
			                 ,SETL_AMOUNT_110860_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("setlAmount110860", beginSetlAmount110860,SETL_AMOUNT_110860_LEN);
    }
   	}
     int localCrdhldrBillAmt110860Counter = -1;
     public boolean isCrdhldrBillAmt110860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCrdhldrBillAmt110860Counter != sharedCounter;
         localCrdhldrBillAmt110860Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of crdhldrBillAmt110860
	 *	@return crdhldrBillAmt110860
	 */
	public char[]  getCrdhldrBillAmt110860String() {
	     return getCharArray(beginCrdhldrBillAmt110860,CRDHLDR_BILL_AMT_110860_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean crdhldrBillAmt110860IsNumeric() {
	    return isNumeric(beginCrdhldrBillAmt110860
	                    ,beginCrdhldrBillAmt110860 + CRDHLDR_BILL_AMT_110860_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CRDHLDR_BILL_AMT_110860_LEN = 12;
  	/**
	 * serializeCrdhldrBillAmt110860
	 */
	protected void serializeCrdhldrBillAmt110860(long crdhldrBillAmt110860) {
		 putNumber(beginCrdhldrBillAmt110860,crdhldrBillAmt110860,CRDHLDR_BILL_AMT_110860_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCrdhldrBillAmt110860Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCrdhldrBillAmt110860
	 */
   	protected  long serializeCrdhldrBillAmt110860(char[] value) {
	    long  crdhldrBillAmt110860;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    crdhldrBillAmt110860 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginCrdhldrBillAmt110860
		       ,12
		      );
		 localCrdhldrBillAmt110860Counter = shareString.getSerializedField().getModifiedCounter();
		return  crdhldrBillAmt110860;
    }

   protected long checkCrdhldrBillAmt110860MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCrdhldrBillAmt110860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshCrdhldrBillAmt110860() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginCrdhldrBillAmt110860
			                 ,CRDHLDR_BILL_AMT_110860_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("crdhldrBillAmt110860", beginCrdhldrBillAmt110860,CRDHLDR_BILL_AMT_110860_LEN);
    }
   	}
     int localDateTimeXmit110860Counter = -1;
     public boolean isDateTimeXmit110860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDateTimeXmit110860Counter != sharedCounter;
         localDateTimeXmit110860Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dateTimeXmit110860
	 *	@return dateTimeXmit110860
	 */
	public char[]  getDateTimeXmit110860String() {
	     return getCharArray(beginDateTimeXmit110860,DATE_TIME_XMIT_110860_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dateTimeXmit110860IsNumeric() {
	    return isNumeric(beginDateTimeXmit110860
	                    ,beginDateTimeXmit110860 + DATE_TIME_XMIT_110860_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DATE_TIME_XMIT_110860_LEN = 10;
  	/**
	 * serializeDateTimeXmit110860
	 */
	protected void serializeDateTimeXmit110860(long dateTimeXmit110860) {
		 putNumber(beginDateTimeXmit110860,dateTimeXmit110860,DATE_TIME_XMIT_110860_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDateTimeXmit110860Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDateTimeXmit110860
	 */
   	protected  long serializeDateTimeXmit110860(char[] value) {
	    long  dateTimeXmit110860;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dateTimeXmit110860 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginDateTimeXmit110860
		       ,10
		      );
		 localDateTimeXmit110860Counter = shareString.getSerializedField().getModifiedCounter();
		return  dateTimeXmit110860;
    }

   protected long checkDateTimeXmit110860MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDateTimeXmit110860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDateTimeXmit110860() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginDateTimeXmit110860
			                 ,DATE_TIME_XMIT_110860_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dateTimeXmit110860", beginDateTimeXmit110860,DATE_TIME_XMIT_110860_LEN);
    }
   	}
     int localSetlConvRte110860Counter = -1;
     public boolean isSetlConvRte110860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSetlConvRte110860Counter != sharedCounter;
         localSetlConvRte110860Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of setlConvRte110860
	 *	@return setlConvRte110860
	 */
	public char[]  getSetlConvRte110860String() {
	     return getCharArray(beginSetlConvRte110860,SETL_CONV_RTE_110860_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean setlConvRte110860IsNumeric() {
	    return isNumeric(beginSetlConvRte110860
	                    ,beginSetlConvRte110860 + SETL_CONV_RTE_110860_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SETL_CONV_RTE_110860_LEN = 8;
  	/**
	 * serializeSetlConvRte110860
	 */
	protected void serializeSetlConvRte110860(long setlConvRte110860) {
		 putNumber(beginSetlConvRte110860,setlConvRte110860,SETL_CONV_RTE_110860_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSetlConvRte110860Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSetlConvRte110860
	 */
   	protected  long serializeSetlConvRte110860(char[] value) {
	    long  setlConvRte110860;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    setlConvRte110860 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginSetlConvRte110860
		       ,8
		      );
		 localSetlConvRte110860Counter = shareString.getSerializedField().getModifiedCounter();
		return  setlConvRte110860;
    }

   protected long checkSetlConvRte110860MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSetlConvRte110860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSetlConvRte110860() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSetlConvRte110860
			                 ,SETL_CONV_RTE_110860_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("setlConvRte110860", beginSetlConvRte110860,SETL_CONV_RTE_110860_LEN);
    }
   	}
     int localCrdhldrConvRte110860Counter = -1;
     public boolean isCrdhldrConvRte110860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCrdhldrConvRte110860Counter != sharedCounter;
         localCrdhldrConvRte110860Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of crdhldrConvRte110860
	 *	@return crdhldrConvRte110860
	 */
	public char[]  getCrdhldrConvRte110860String() {
	     return getCharArray(beginCrdhldrConvRte110860,CRDHLDR_CONV_RTE_110860_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean crdhldrConvRte110860IsNumeric() {
	    return isNumeric(beginCrdhldrConvRte110860
	                    ,beginCrdhldrConvRte110860 + CRDHLDR_CONV_RTE_110860_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CRDHLDR_CONV_RTE_110860_LEN = 8;
  	/**
	 * serializeCrdhldrConvRte110860
	 */
	protected void serializeCrdhldrConvRte110860(long crdhldrConvRte110860) {
		 putNumber(beginCrdhldrConvRte110860,crdhldrConvRte110860,CRDHLDR_CONV_RTE_110860_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCrdhldrConvRte110860Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCrdhldrConvRte110860
	 */
   	protected  long serializeCrdhldrConvRte110860(char[] value) {
	    long  crdhldrConvRte110860;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    crdhldrConvRte110860 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginCrdhldrConvRte110860
		       ,8
		      );
		 localCrdhldrConvRte110860Counter = shareString.getSerializedField().getModifiedCounter();
		return  crdhldrConvRte110860;
    }

   protected long checkCrdhldrConvRte110860MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCrdhldrConvRte110860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshCrdhldrConvRte110860() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginCrdhldrConvRte110860
			                 ,CRDHLDR_CONV_RTE_110860_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("crdhldrConvRte110860", beginCrdhldrConvRte110860,CRDHLDR_CONV_RTE_110860_LEN);
    }
   	}
     int localSysTraceAudit860Counter = -1;
     public boolean isSysTraceAudit860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSysTraceAudit860Counter != sharedCounter;
         localSysTraceAudit860Counter = sharedCounter; return hasModified;
     }
	protected static final int SYS_TRACE_AUDIT_860_LEN = 6;
	/**
	 * 	serialize this SysTraceAudit860
	 */
   protected void serializeSysTraceAudit860(char[] sysTraceAudit860) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sysTraceAudit860,0,getStringValue(),beginSysTraceAudit860,SYS_TRACE_AUDIT_860_LEN);
       localSysTraceAudit860Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSysTraceAudit860Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshSysTraceAudit860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSysTraceAudit860() {	 
   		return (substring(getStringValue(),beginSysTraceAudit860,beginSysTraceAudit860 + SYS_TRACE_AUDIT_860_LEN));
   	}
     int localTransMmdd110860Counter = -1;
     public boolean isTransMmdd110860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTransMmdd110860Counter != sharedCounter;
         localTransMmdd110860Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of transMmdd110860
	 *	@return transMmdd110860
	 */
	public char[]  getTransMmdd110860String() {
	     return getCharArray(beginTransMmdd110860,TRANS_MMDD_110860_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean transMmdd110860IsNumeric() {
	    return isNumeric(beginTransMmdd110860
	                    ,beginTransMmdd110860 + TRANS_MMDD_110860_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TRANS_MMDD_110860_LEN = 4;
  	/**
	 * serializeTransMmdd110860
	 */
	protected void serializeTransMmdd110860(int transMmdd110860) {
		 putNumber(beginTransMmdd110860,transMmdd110860,TRANS_MMDD_110860_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTransMmdd110860Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTransMmdd110860
	 */
   	protected  int serializeTransMmdd110860(char[] value) {
	    int  transMmdd110860;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    transMmdd110860 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginTransMmdd110860
		       ,4
		      );
		 localTransMmdd110860Counter = shareString.getSerializedField().getModifiedCounter();
		return  transMmdd110860;
    }

   protected int checkTransMmdd110860MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTransMmdd110860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTransMmdd110860() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTransMmdd110860
			                 ,TRANS_MMDD_110860_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("transMmdd110860", beginTransMmdd110860,TRANS_MMDD_110860_LEN);
    }
   	}
     int localConv110Mmdd860Counter = -1;
     public boolean isConv110Mmdd860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localConv110Mmdd860Counter != sharedCounter;
         localConv110Mmdd860Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of conv110Mmdd860
	 *	@return conv110Mmdd860
	 */
	public char[]  getConv110Mmdd860String() {
	     return getCharArray(beginConv110Mmdd860,CONV_110_MMDD_860_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean conv110Mmdd860IsNumeric() {
	    return isNumeric(beginConv110Mmdd860
	                    ,beginConv110Mmdd860 + CONV_110_MMDD_860_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CONV_110_MMDD_860_LEN = 4;
  	/**
	 * serializeConv110Mmdd860
	 */
	protected void serializeConv110Mmdd860(int conv110Mmdd860) {
		 putNumber(beginConv110Mmdd860,conv110Mmdd860,CONV_110_MMDD_860_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localConv110Mmdd860Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeConv110Mmdd860
	 */
   	protected  int serializeConv110Mmdd860(char[] value) {
	    int  conv110Mmdd860;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    conv110Mmdd860 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginConv110Mmdd860
		       ,4
		      );
		 localConv110Mmdd860Counter = shareString.getSerializedField().getModifiedCounter();
		return  conv110Mmdd860;
    }

   protected int checkConv110Mmdd860MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshConv110Mmdd860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshConv110Mmdd860() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginConv110Mmdd860
			                 ,CONV_110_MMDD_860_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("conv110Mmdd860", beginConv110Mmdd860,CONV_110_MMDD_860_LEN);
    }
   	}
     int localMerchantType110860Counter = -1;
     public boolean isMerchantType110860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMerchantType110860Counter != sharedCounter;
         localMerchantType110860Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of merchantType110860
	 *	@return merchantType110860
	 */
	public char[]  getMerchantType110860String() {
	     return getCharArray(beginMerchantType110860,MERCHANT_TYPE_110860_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean merchantType110860IsNumeric() {
	    return isNumeric(beginMerchantType110860
	                    ,beginMerchantType110860 + MERCHANT_TYPE_110860_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MERCHANT_TYPE_110860_LEN = 4;
  	/**
	 * serializeMerchantType110860
	 */
	protected void serializeMerchantType110860(int merchantType110860) {
		 putNumber(beginMerchantType110860,merchantType110860,MERCHANT_TYPE_110860_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMerchantType110860Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMerchantType110860
	 */
   	protected  int serializeMerchantType110860(char[] value) {
	    int  merchantType110860;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    merchantType110860 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginMerchantType110860
		       ,4
		      );
		 localMerchantType110860Counter = shareString.getSerializedField().getModifiedCounter();
		return  merchantType110860;
    }

   protected int checkMerchantType110860MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMerchantType110860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMerchantType110860() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMerchantType110860
			                 ,MERCHANT_TYPE_110860_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("merchantType110860", beginMerchantType110860,MERCHANT_TYPE_110860_LEN);
    }
   	}
     int localCountryCode110860Counter = -1;
     public boolean isCountryCode110860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCountryCode110860Counter != sharedCounter;
         localCountryCode110860Counter = sharedCounter; return hasModified;
     }
	protected static final int COUNTRY_CODE_110860_LEN = 3;
	/**
	 * 	serialize this CountryCode110860
	 */
   protected void serializeCountryCode110860(char[] countryCode110860) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(countryCode110860,0,getStringValue(),beginCountryCode110860,COUNTRY_CODE_110860_LEN);
       localCountryCode110860Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCountryCode110860Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshCountryCode110860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCountryCode110860() {	 
   		return (substring(getStringValue(),beginCountryCode110860,beginCountryCode110860 + COUNTRY_CODE_110860_LEN));
   	}
     int localPosEntry110860Counter = -1;
     public boolean isPosEntry110860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPosEntry110860Counter != sharedCounter;
         localPosEntry110860Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of posEntry110860
	 *	@return posEntry110860
	 */
	public char[]  getPosEntry110860String() {
	     return getCharArray(beginPosEntry110860,POS_ENTRY_110860_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean posEntry110860IsNumeric() {
	    return isNumeric(beginPosEntry110860
	                    ,beginPosEntry110860 + POS_ENTRY_110860_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int POS_ENTRY_110860_LEN = 3;
  	/**
	 * serializePosEntry110860
	 */
	protected void serializePosEntry110860(int posEntry110860) {
		 putNumber(beginPosEntry110860,posEntry110860,POS_ENTRY_110860_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPosEntry110860Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePosEntry110860
	 */
   	protected  int serializePosEntry110860(char[] value) {
	    int  posEntry110860;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    posEntry110860 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginPosEntry110860
		       ,3
		      );
		 localPosEntry110860Counter = shareString.getSerializedField().getModifiedCounter();
		return  posEntry110860;
    }

   protected int checkPosEntry110860MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPosEntry110860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPosEntry110860() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPosEntry110860
			                 ,POS_ENTRY_110860_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("posEntry110860", beginPosEntry110860,POS_ENTRY_110860_LEN);
    }
   	}
     int localPosPinCapture110860Counter = -1;
     public boolean isPosPinCapture110860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPosPinCapture110860Counter != sharedCounter;
         localPosPinCapture110860Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of posPinCapture110860
	 *	@return posPinCapture110860
	 */
	public char[]  getPosPinCapture110860String() {
	     return getCharArray(beginPosPinCapture110860,POS_PIN_CAPTURE_110860_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean posPinCapture110860IsNumeric() {
	    return isNumeric(beginPosPinCapture110860
	                    ,beginPosPinCapture110860 + POS_PIN_CAPTURE_110860_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int POS_PIN_CAPTURE_110860_LEN = 2;
  	/**
	 * serializePosPinCapture110860
	 */
	protected void serializePosPinCapture110860(int posPinCapture110860) {
		 putNumber(beginPosPinCapture110860,posPinCapture110860,POS_PIN_CAPTURE_110860_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPosPinCapture110860Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePosPinCapture110860
	 */
   	protected  int serializePosPinCapture110860(char[] value) {
	    int  posPinCapture110860;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    posPinCapture110860 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginPosPinCapture110860
		       ,2
		      );
		 localPosPinCapture110860Counter = shareString.getSerializedField().getModifiedCounter();
		return  posPinCapture110860;
    }

   protected int checkPosPinCapture110860MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPosPinCapture110860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPosPinCapture110860() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPosPinCapture110860
			                 ,POS_PIN_CAPTURE_110860_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("posPinCapture110860", beginPosPinCapture110860,POS_PIN_CAPTURE_110860_LEN);
    }
   	}
     int localAcquirerIca860Counter = -1;
     public boolean isAcquirerIca860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAcquirerIca860Counter != sharedCounter;
         localAcquirerIca860Counter = sharedCounter; return hasModified;
     }
	protected static final int ACQUIRER_ICA_860_LEN = 6;
	/**
	 * 	serialize this AcquirerIca860
	 */
   protected void serializeAcquirerIca860(char[] acquirerIca860) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(acquirerIca860,0,getStringValue(),beginAcquirerIca860,ACQUIRER_ICA_860_LEN);
       localAcquirerIca860Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAcquirerIca860Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshAcquirerIca860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAcquirerIca860() {	 
   		return (substring(getStringValue(),beginAcquirerIca860,beginAcquirerIca860 + ACQUIRER_ICA_860_LEN));
   	}
     int localForwardInstId860Counter = -1;
     public boolean isForwardInstId860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localForwardInstId860Counter != sharedCounter;
         localForwardInstId860Counter = sharedCounter; return hasModified;
     }
	protected static final int FORWARD_INST_ID_860_LEN = 6;
	/**
	 * 	serialize this ForwardInstId860
	 */
   protected void serializeForwardInstId860(char[] forwardInstId860) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(forwardInstId860,0,getStringValue(),beginForwardInstId860,FORWARD_INST_ID_860_LEN);
       localForwardInstId860Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkForwardInstId860Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshForwardInstId860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshForwardInstId860() {	 
   		return (substring(getStringValue(),beginForwardInstId860,beginForwardInstId860 + FORWARD_INST_ID_860_LEN));
   	}
     int localRetrievalRefno110860Counter = -1;
     public boolean isRetrievalRefno110860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRetrievalRefno110860Counter != sharedCounter;
         localRetrievalRefno110860Counter = sharedCounter; return hasModified;
     }
	protected static final int RETRIEVAL_REFNO_110860_LEN = 12;
	/**
	 * 	serialize this RetrievalRefno110860
	 */
   protected void serializeRetrievalRefno110860(char[] retrievalRefno110860) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(retrievalRefno110860,0,getStringValue(),beginRetrievalRefno110860,RETRIEVAL_REFNO_110860_LEN);
       localRetrievalRefno110860Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRetrievalRefno110860Constraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshRetrievalRefno110860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRetrievalRefno110860() {	 
   		return (substring(getStringValue(),beginRetrievalRefno110860,beginRetrievalRefno110860 + RETRIEVAL_REFNO_110860_LEN));
   	}
     int localAuthNumber860Counter = -1;
     public boolean isAuthNumber860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAuthNumber860Counter != sharedCounter;
         localAuthNumber860Counter = sharedCounter; return hasModified;
     }
	protected static final int AUTH_NUMBER_860_LEN = 6;
	/**
	 * 	serialize this AuthNumber860
	 */
   protected void serializeAuthNumber860(char[] authNumber860) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(authNumber860,0,getStringValue(),beginAuthNumber860,AUTH_NUMBER_860_LEN);
       localAuthNumber860Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAuthNumber860Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshAuthNumber860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAuthNumber860() {	 
   		return (substring(getStringValue(),beginAuthNumber860,beginAuthNumber860 + AUTH_NUMBER_860_LEN));
   	}
     int localAuthResponse860Counter = -1;
     public boolean isAuthResponse860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAuthResponse860Counter != sharedCounter;
         localAuthResponse860Counter = sharedCounter; return hasModified;
     }
	protected static final int AUTH_RESPONSE_860_LEN = 2;
	/**
	 * 	serialize this AuthResponse860
	 */
   protected void serializeAuthResponse860(char[] authResponse860) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(authResponse860,0,getStringValue(),beginAuthResponse860,AUTH_RESPONSE_860_LEN);
       localAuthResponse860Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAuthResponse860Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshAuthResponse860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAuthResponse860() {	 
   		return (substring(getStringValue(),beginAuthResponse860,beginAuthResponse860 + AUTH_RESPONSE_860_LEN));
   	}
     int localIdTerminal110860Counter = -1;
     public boolean isIdTerminal110860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIdTerminal110860Counter != sharedCounter;
         localIdTerminal110860Counter = sharedCounter; return hasModified;
     }
	protected static final int ID_TERMINAL_110860_LEN = 8;
	/**
	 * 	serialize this IdTerminal110860
	 */
   protected void serializeIdTerminal110860(char[] idTerminal110860) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(idTerminal110860,0,getStringValue(),beginIdTerminal110860,ID_TERMINAL_110860_LEN);
       localIdTerminal110860Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIdTerminal110860Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIdTerminal110860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIdTerminal110860() {	 
   		return (substring(getStringValue(),beginIdTerminal110860,beginIdTerminal110860 + ID_TERMINAL_110860_LEN));
   	}
     int localCardAcceptor110860Counter = -1;
     public boolean isCardAcceptor110860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCardAcceptor110860Counter != sharedCounter;
         localCardAcceptor110860Counter = sharedCounter; return hasModified;
     }
	protected static final int CARD_ACCEPTOR_110860_LEN = 15;
	/**
	 * 	serialize this CardAcceptor110860
	 */
   protected void serializeCardAcceptor110860(char[] cardAcceptor110860) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cardAcceptor110860,0,getStringValue(),beginCardAcceptor110860,CARD_ACCEPTOR_110860_LEN);
       localCardAcceptor110860Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCardAcceptor110860Constraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshCardAcceptor110860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCardAcceptor110860() {	 
   		return (substring(getStringValue(),beginCardAcceptor110860,beginCardAcceptor110860 + CARD_ACCEPTOR_110860_LEN));
   	}
     int localAuthMrchNmctst110860Counter = -1;
     public boolean isAuthMrchNmctst110860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAuthMrchNmctst110860Counter != sharedCounter;
         localAuthMrchNmctst110860Counter = sharedCounter; return hasModified;
     }
	protected static final int AUTH_MRCH_NMCTST_110860_LEN = 40;
	/**
	 * 	serialize this AuthMrchNmctst110860
	 */
   protected void serializeAuthMrchNmctst110860(char[] authMrchNmctst110860) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(authMrchNmctst110860,0,getStringValue(),beginAuthMrchNmctst110860,AUTH_MRCH_NMCTST_110860_LEN);
       localAuthMrchNmctst110860Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAuthMrchNmctst110860Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshAuthMrchNmctst110860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAuthMrchNmctst110860() {	 
   		return (substring(getStringValue(),beginAuthMrchNmctst110860,beginAuthMrchNmctst110860 + AUTH_MRCH_NMCTST_110860_LEN));
   	}
     int localAuthAddlData860Counter = -1;
     public boolean isAuthAddlData860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAuthAddlData860Counter != sharedCounter;
         localAuthAddlData860Counter = sharedCounter; return hasModified;
     }
	protected static final int AUTH_ADDL_DATA_860_LEN = 25;
	/**
	 * 	serialize this AuthAddlData860
	 */
   protected void serializeAuthAddlData860(char[] authAddlData860) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(authAddlData860,0,getStringValue(),beginAuthAddlData860,AUTH_ADDL_DATA_860_LEN);
       localAuthAddlData860Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAuthAddlData860Constraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
    /**
	 *	refreshAuthAddlData860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAuthAddlData860() {	 
   		return (substring(getStringValue(),beginAuthAddlData860,beginAuthAddlData860 + AUTH_ADDL_DATA_860_LEN));
   	}
     int localAvsCurrCode110860Counter = -1;
     public boolean isAvsCurrCode110860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAvsCurrCode110860Counter != sharedCounter;
         localAvsCurrCode110860Counter = sharedCounter; return hasModified;
     }
	protected static final int AVS_CURR_CODE_110860_LEN = 3;
	/**
	 * 	serialize this AvsCurrCode110860
	 */
   protected void serializeAvsCurrCode110860(char[] avsCurrCode110860) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(avsCurrCode110860,0,getStringValue(),beginAvsCurrCode110860,AVS_CURR_CODE_110860_LEN);
       localAvsCurrCode110860Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAvsCurrCode110860Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshAvsCurrCode110860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAvsCurrCode110860() {	 
   		return (substring(getStringValue(),beginAvsCurrCode110860,beginAvsCurrCode110860 + AVS_CURR_CODE_110860_LEN));
   	}
     int localCrncyCdeSetl110860Counter = -1;
     public boolean isCrncyCdeSetl110860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCrncyCdeSetl110860Counter != sharedCounter;
         localCrncyCdeSetl110860Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of crncyCdeSetl110860
	 *	@return crncyCdeSetl110860
	 */
	public char[]  getCrncyCdeSetl110860String() {
	     return getCharArray(beginCrncyCdeSetl110860,CRNCY_CDE_SETL_110860_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean crncyCdeSetl110860IsNumeric() {
	    return isNumeric(beginCrncyCdeSetl110860
	                    ,beginCrncyCdeSetl110860 + CRNCY_CDE_SETL_110860_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CRNCY_CDE_SETL_110860_LEN = 3;
  	/**
	 * serializeCrncyCdeSetl110860
	 */
	protected void serializeCrncyCdeSetl110860(int crncyCdeSetl110860) {
		 putNumber(beginCrncyCdeSetl110860,crncyCdeSetl110860,CRNCY_CDE_SETL_110860_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCrncyCdeSetl110860Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCrncyCdeSetl110860
	 */
   	protected  int serializeCrncyCdeSetl110860(char[] value) {
	    int  crncyCdeSetl110860;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    crncyCdeSetl110860 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginCrncyCdeSetl110860
		       ,3
		      );
		 localCrncyCdeSetl110860Counter = shareString.getSerializedField().getModifiedCounter();
		return  crncyCdeSetl110860;
    }

   protected int checkCrncyCdeSetl110860MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCrncyCdeSetl110860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCrncyCdeSetl110860() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCrncyCdeSetl110860
			                 ,CRNCY_CDE_SETL_110860_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("crncyCdeSetl110860", beginCrncyCdeSetl110860,CRNCY_CDE_SETL_110860_LEN);
    }
   	}
     int localCrncyCrdhldr110860Counter = -1;
     public boolean isCrncyCrdhldr110860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCrncyCrdhldr110860Counter != sharedCounter;
         localCrncyCrdhldr110860Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of crncyCrdhldr110860
	 *	@return crncyCrdhldr110860
	 */
	public char[]  getCrncyCrdhldr110860String() {
	     return getCharArray(beginCrncyCrdhldr110860,CRNCY_CRDHLDR_110860_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean crncyCrdhldr110860IsNumeric() {
	    return isNumeric(beginCrncyCrdhldr110860
	                    ,beginCrncyCrdhldr110860 + CRNCY_CRDHLDR_110860_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CRNCY_CRDHLDR_110860_LEN = 3;
  	/**
	 * serializeCrncyCrdhldr110860
	 */
	protected void serializeCrncyCrdhldr110860(int crncyCrdhldr110860) {
		 putNumber(beginCrncyCrdhldr110860,crncyCrdhldr110860,CRNCY_CRDHLDR_110860_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCrncyCrdhldr110860Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCrncyCrdhldr110860
	 */
   	protected  int serializeCrncyCrdhldr110860(char[] value) {
	    int  crncyCrdhldr110860;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    crncyCrdhldr110860 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginCrncyCrdhldr110860
		       ,3
		      );
		 localCrncyCrdhldr110860Counter = shareString.getSerializedField().getModifiedCounter();
		return  crncyCrdhldr110860;
    }

   protected int checkCrncyCrdhldr110860MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCrncyCrdhldr110860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCrncyCrdhldr110860() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCrncyCrdhldr110860
			                 ,CRNCY_CRDHLDR_110860_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("crncyCrdhldr110860", beginCrncyCrdhldr110860,CRNCY_CRDHLDR_110860_LEN);
    }
   	}
     int localDe112110860Counter = -1;
     public boolean isDe112110860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDe112110860Counter != sharedCounter;
         localDe112110860Counter = sharedCounter; return hasModified;
     }
	protected static final int DE_112110860_LEN = 103;
	/**
	 * 	serialize this De112110860
	 */
   protected void serializeDe112110860(char[] de112110860) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(de112110860,0,getStringValue(),beginDe112110860,DE_112110860_LEN);
       localDe112110860Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDe112110860Constraints(char[] value) {
   			return super.checkConstraints(value , 103 ,false, false);
   }
    /**
	 *	refreshDe112110860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDe112110860() {	 
   		return (substring(getStringValue(),beginDe112110860,beginDe112110860 + DE_112110860_LEN));
   	}
     int localProcessingCode100860Counter = -1;
     public boolean isProcessingCode100860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localProcessingCode100860Counter != sharedCounter;
         localProcessingCode100860Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of processingCode100860
	 *	@return processingCode100860
	 */
	public char[]  getProcessingCode100860String() {
	     return getCharArray(beginProcessingCode100860,PROCESSING_CODE_100860_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean processingCode100860IsNumeric() {
	    return isNumeric(beginProcessingCode100860
	                    ,beginProcessingCode100860 + PROCESSING_CODE_100860_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PROCESSING_CODE_100860_LEN = 6;
  	/**
	 * serializeProcessingCode100860
	 */
	protected void serializeProcessingCode100860(long processingCode100860) {
		 putNumber(beginProcessingCode100860,processingCode100860,PROCESSING_CODE_100860_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localProcessingCode100860Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeProcessingCode100860
	 */
   	protected  long serializeProcessingCode100860(char[] value) {
	    long  processingCode100860;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    processingCode100860 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginProcessingCode100860
		       ,6
		      );
		 localProcessingCode100860Counter = shareString.getSerializedField().getModifiedCounter();
		return  processingCode100860;
    }

   protected long checkProcessingCode100860MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshProcessingCode100860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshProcessingCode100860() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginProcessingCode100860
			                 ,PROCESSING_CODE_100860_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("processingCode100860", beginProcessingCode100860,PROCESSING_CODE_100860_LEN);
    }
   	}
     int localTranAmt100860Counter = -1;
     public boolean isTranAmt100860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTranAmt100860Counter != sharedCounter;
         localTranAmt100860Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tranAmt100860
	 *	@return tranAmt100860
	 */
	public char[]  getTranAmt100860String() {
	     return getCharArray(beginTranAmt100860,TRAN_AMT_100860_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranAmt100860IsNumeric() {
	    return isNumeric(beginTranAmt100860
	                    ,beginTranAmt100860 + TRAN_AMT_100860_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TRAN_AMT_100860_LEN = 12;
  	/**
	 * serializeTranAmt100860
	 */
	protected void serializeTranAmt100860(long tranAmt100860) {
		 putNumber(beginTranAmt100860,tranAmt100860,TRAN_AMT_100860_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTranAmt100860Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTranAmt100860
	 */
   	protected  long serializeTranAmt100860(char[] value) {
	    long  tranAmt100860;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tranAmt100860 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginTranAmt100860
		       ,12
		      );
		 localTranAmt100860Counter = shareString.getSerializedField().getModifiedCounter();
		return  tranAmt100860;
    }

   protected long checkTranAmt100860MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTranAmt100860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTranAmt100860() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTranAmt100860
			                 ,TRAN_AMT_100860_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tranAmt100860", beginTranAmt100860,TRAN_AMT_100860_LEN);
    }
   	}
     int localSetlAmt100860Counter = -1;
     public boolean isSetlAmt100860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSetlAmt100860Counter != sharedCounter;
         localSetlAmt100860Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of setlAmt100860
	 *	@return setlAmt100860
	 */
	public char[]  getSetlAmt100860String() {
	     return getCharArray(beginSetlAmt100860,SETL_AMT_100860_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean setlAmt100860IsNumeric() {
	    return isNumeric(beginSetlAmt100860
	                    ,beginSetlAmt100860 + SETL_AMT_100860_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SETL_AMT_100860_LEN = 12;
  	/**
	 * serializeSetlAmt100860
	 */
	protected void serializeSetlAmt100860(long setlAmt100860) {
		 putNumber(beginSetlAmt100860,setlAmt100860,SETL_AMT_100860_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSetlAmt100860Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSetlAmt100860
	 */
   	protected  long serializeSetlAmt100860(char[] value) {
	    long  setlAmt100860;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    setlAmt100860 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginSetlAmt100860
		       ,12
		      );
		 localSetlAmt100860Counter = shareString.getSerializedField().getModifiedCounter();
		return  setlAmt100860;
    }

   protected long checkSetlAmt100860MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSetlAmt100860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSetlAmt100860() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSetlAmt100860
			                 ,SETL_AMT_100860_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("setlAmt100860", beginSetlAmt100860,SETL_AMT_100860_LEN);
    }
   	}
     int localCrdhldrBillAmt100860Counter = -1;
     public boolean isCrdhldrBillAmt100860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCrdhldrBillAmt100860Counter != sharedCounter;
         localCrdhldrBillAmt100860Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of crdhldrBillAmt100860
	 *	@return crdhldrBillAmt100860
	 */
	public char[]  getCrdhldrBillAmt100860String() {
	     return getCharArray(beginCrdhldrBillAmt100860,CRDHLDR_BILL_AMT_100860_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean crdhldrBillAmt100860IsNumeric() {
	    return isNumeric(beginCrdhldrBillAmt100860
	                    ,beginCrdhldrBillAmt100860 + CRDHLDR_BILL_AMT_100860_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CRDHLDR_BILL_AMT_100860_LEN = 12;
  	/**
	 * serializeCrdhldrBillAmt100860
	 */
	protected void serializeCrdhldrBillAmt100860(long crdhldrBillAmt100860) {
		 putNumber(beginCrdhldrBillAmt100860,crdhldrBillAmt100860,CRDHLDR_BILL_AMT_100860_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCrdhldrBillAmt100860Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCrdhldrBillAmt100860
	 */
   	protected  long serializeCrdhldrBillAmt100860(char[] value) {
	    long  crdhldrBillAmt100860;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    crdhldrBillAmt100860 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginCrdhldrBillAmt100860
		       ,12
		      );
		 localCrdhldrBillAmt100860Counter = shareString.getSerializedField().getModifiedCounter();
		return  crdhldrBillAmt100860;
    }

   protected long checkCrdhldrBillAmt100860MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCrdhldrBillAmt100860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshCrdhldrBillAmt100860() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginCrdhldrBillAmt100860
			                 ,CRDHLDR_BILL_AMT_100860_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("crdhldrBillAmt100860", beginCrdhldrBillAmt100860,CRDHLDR_BILL_AMT_100860_LEN);
    }
   	}
     int localDateTimeXmit100860Counter = -1;
     public boolean isDateTimeXmit100860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDateTimeXmit100860Counter != sharedCounter;
         localDateTimeXmit100860Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dateTimeXmit100860
	 *	@return dateTimeXmit100860
	 */
	public char[]  getDateTimeXmit100860String() {
	     return getCharArray(beginDateTimeXmit100860,DATE_TIME_XMIT_100860_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dateTimeXmit100860IsNumeric() {
	    return isNumeric(beginDateTimeXmit100860
	                    ,beginDateTimeXmit100860 + DATE_TIME_XMIT_100860_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DATE_TIME_XMIT_100860_LEN = 10;
  	/**
	 * serializeDateTimeXmit100860
	 */
	protected void serializeDateTimeXmit100860(long dateTimeXmit100860) {
		 putNumber(beginDateTimeXmit100860,dateTimeXmit100860,DATE_TIME_XMIT_100860_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDateTimeXmit100860Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDateTimeXmit100860
	 */
   	protected  long serializeDateTimeXmit100860(char[] value) {
	    long  dateTimeXmit100860;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dateTimeXmit100860 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginDateTimeXmit100860
		       ,10
		      );
		 localDateTimeXmit100860Counter = shareString.getSerializedField().getModifiedCounter();
		return  dateTimeXmit100860;
    }

   protected long checkDateTimeXmit100860MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDateTimeXmit100860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDateTimeXmit100860() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginDateTimeXmit100860
			                 ,DATE_TIME_XMIT_100860_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dateTimeXmit100860", beginDateTimeXmit100860,DATE_TIME_XMIT_100860_LEN);
    }
   	}
     int localSetlConvRte100860Counter = -1;
     public boolean isSetlConvRte100860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSetlConvRte100860Counter != sharedCounter;
         localSetlConvRte100860Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of setlConvRte100860
	 *	@return setlConvRte100860
	 */
	public char[]  getSetlConvRte100860String() {
	     return getCharArray(beginSetlConvRte100860,SETL_CONV_RTE_100860_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean setlConvRte100860IsNumeric() {
	    return isNumeric(beginSetlConvRte100860
	                    ,beginSetlConvRte100860 + SETL_CONV_RTE_100860_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SETL_CONV_RTE_100860_LEN = 8;
  	/**
	 * serializeSetlConvRte100860
	 */
	protected void serializeSetlConvRte100860(long setlConvRte100860) {
		 putNumber(beginSetlConvRte100860,setlConvRte100860,SETL_CONV_RTE_100860_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSetlConvRte100860Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSetlConvRte100860
	 */
   	protected  long serializeSetlConvRte100860(char[] value) {
	    long  setlConvRte100860;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    setlConvRte100860 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginSetlConvRte100860
		       ,8
		      );
		 localSetlConvRte100860Counter = shareString.getSerializedField().getModifiedCounter();
		return  setlConvRte100860;
    }

   protected long checkSetlConvRte100860MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSetlConvRte100860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSetlConvRte100860() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSetlConvRte100860
			                 ,SETL_CONV_RTE_100860_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("setlConvRte100860", beginSetlConvRte100860,SETL_CONV_RTE_100860_LEN);
    }
   	}
     int localCrdhldrConvRte100860Counter = -1;
     public boolean isCrdhldrConvRte100860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCrdhldrConvRte100860Counter != sharedCounter;
         localCrdhldrConvRte100860Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of crdhldrConvRte100860
	 *	@return crdhldrConvRte100860
	 */
	public char[]  getCrdhldrConvRte100860String() {
	     return getCharArray(beginCrdhldrConvRte100860,CRDHLDR_CONV_RTE_100860_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean crdhldrConvRte100860IsNumeric() {
	    return isNumeric(beginCrdhldrConvRte100860
	                    ,beginCrdhldrConvRte100860 + CRDHLDR_CONV_RTE_100860_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CRDHLDR_CONV_RTE_100860_LEN = 8;
  	/**
	 * serializeCrdhldrConvRte100860
	 */
	protected void serializeCrdhldrConvRte100860(long crdhldrConvRte100860) {
		 putNumber(beginCrdhldrConvRte100860,crdhldrConvRte100860,CRDHLDR_CONV_RTE_100860_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCrdhldrConvRte100860Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCrdhldrConvRte100860
	 */
   	protected  long serializeCrdhldrConvRte100860(char[] value) {
	    long  crdhldrConvRte100860;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    crdhldrConvRte100860 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginCrdhldrConvRte100860
		       ,8
		      );
		 localCrdhldrConvRte100860Counter = shareString.getSerializedField().getModifiedCounter();
		return  crdhldrConvRte100860;
    }

   protected long checkCrdhldrConvRte100860MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCrdhldrConvRte100860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshCrdhldrConvRte100860() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginCrdhldrConvRte100860
			                 ,CRDHLDR_CONV_RTE_100860_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("crdhldrConvRte100860", beginCrdhldrConvRte100860,CRDHLDR_CONV_RTE_100860_LEN);
    }
   	}
     int localTimeLocalTrans100860Counter = -1;
     public boolean isTimeLocalTrans100860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTimeLocalTrans100860Counter != sharedCounter;
         localTimeLocalTrans100860Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of timeLocalTrans100860
	 *	@return timeLocalTrans100860
	 */
	public char[]  getTimeLocalTrans100860String() {
	     return getCharArray(beginTimeLocalTrans100860,TIME_LOCAL_TRANS_100860_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean timeLocalTrans100860IsNumeric() {
	    return isNumeric(beginTimeLocalTrans100860
	                    ,beginTimeLocalTrans100860 + TIME_LOCAL_TRANS_100860_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TIME_LOCAL_TRANS_100860_LEN = 6;
  	/**
	 * serializeTimeLocalTrans100860
	 */
	protected void serializeTimeLocalTrans100860(long timeLocalTrans100860) {
		 putNumber(beginTimeLocalTrans100860,timeLocalTrans100860,TIME_LOCAL_TRANS_100860_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTimeLocalTrans100860Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTimeLocalTrans100860
	 */
   	protected  long serializeTimeLocalTrans100860(char[] value) {
	    long  timeLocalTrans100860;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    timeLocalTrans100860 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginTimeLocalTrans100860
		       ,6
		      );
		 localTimeLocalTrans100860Counter = shareString.getSerializedField().getModifiedCounter();
		return  timeLocalTrans100860;
    }

   protected long checkTimeLocalTrans100860MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTimeLocalTrans100860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTimeLocalTrans100860() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTimeLocalTrans100860
			                 ,TIME_LOCAL_TRANS_100860_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("timeLocalTrans100860", beginTimeLocalTrans100860,TIME_LOCAL_TRANS_100860_LEN);
    }
   	}
     int localDateLocalTrans100860Counter = -1;
     public boolean isDateLocalTrans100860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDateLocalTrans100860Counter != sharedCounter;
         localDateLocalTrans100860Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dateLocalTrans100860
	 *	@return dateLocalTrans100860
	 */
	public char[]  getDateLocalTrans100860String() {
	     return getCharArray(beginDateLocalTrans100860,DATE_LOCAL_TRANS_100860_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dateLocalTrans100860IsNumeric() {
	    return isNumeric(beginDateLocalTrans100860
	                    ,beginDateLocalTrans100860 + DATE_LOCAL_TRANS_100860_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DATE_LOCAL_TRANS_100860_LEN = 4;
  	/**
	 * serializeDateLocalTrans100860
	 */
	protected void serializeDateLocalTrans100860(int dateLocalTrans100860) {
		 putNumber(beginDateLocalTrans100860,dateLocalTrans100860,DATE_LOCAL_TRANS_100860_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDateLocalTrans100860Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDateLocalTrans100860
	 */
   	protected  int serializeDateLocalTrans100860(char[] value) {
	    int  dateLocalTrans100860;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dateLocalTrans100860 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginDateLocalTrans100860
		       ,4
		      );
		 localDateLocalTrans100860Counter = shareString.getSerializedField().getModifiedCounter();
		return  dateLocalTrans100860;
    }

   protected int checkDateLocalTrans100860MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDateLocalTrans100860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDateLocalTrans100860() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDateLocalTrans100860
			                 ,DATE_LOCAL_TRANS_100860_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dateLocalTrans100860", beginDateLocalTrans100860,DATE_LOCAL_TRANS_100860_LEN);
    }
   	}
     int localCardholderExpdt860Counter = -1;
     public boolean isCardholderExpdt860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCardholderExpdt860Counter != sharedCounter;
         localCardholderExpdt860Counter = sharedCounter; return hasModified;
     }
	protected static final int CARDHOLDER_EXPDT_860_LEN = 4;
	/**
	 * 	serialize this CardholderExpdt860
	 */
   protected void serializeCardholderExpdt860(char[] cardholderExpdt860) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cardholderExpdt860,0,getStringValue(),beginCardholderExpdt860,CARDHOLDER_EXPDT_860_LEN);
       localCardholderExpdt860Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCardholderExpdt860Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshCardholderExpdt860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCardholderExpdt860() {	 
   		return (substring(getStringValue(),beginCardholderExpdt860,beginCardholderExpdt860 + CARDHOLDER_EXPDT_860_LEN));
   	}
     int localTransMmdd860Counter = -1;
     public boolean isTransMmdd860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTransMmdd860Counter != sharedCounter;
         localTransMmdd860Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of transMmdd860
	 *	@return transMmdd860
	 */
	public char[]  getTransMmdd860String() {
	     return getCharArray(beginTransMmdd860,TRANS_MMDD_860_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean transMmdd860IsNumeric() {
	    return isNumeric(beginTransMmdd860
	                    ,beginTransMmdd860 + TRANS_MMDD_860_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TRANS_MMDD_860_LEN = 4;
  	/**
	 * serializeTransMmdd860
	 */
	protected void serializeTransMmdd860(int transMmdd860) {
		 putNumber(beginTransMmdd860,transMmdd860,TRANS_MMDD_860_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTransMmdd860Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTransMmdd860
	 */
   	protected  int serializeTransMmdd860(char[] value) {
	    int  transMmdd860;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    transMmdd860 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginTransMmdd860
		       ,4
		      );
		 localTransMmdd860Counter = shareString.getSerializedField().getModifiedCounter();
		return  transMmdd860;
    }

   protected int checkTransMmdd860MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTransMmdd860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTransMmdd860() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTransMmdd860
			                 ,TRANS_MMDD_860_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("transMmdd860", beginTransMmdd860,TRANS_MMDD_860_LEN);
    }
   	}
     int localConv100Mmdd860Counter = -1;
     public boolean isConv100Mmdd860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localConv100Mmdd860Counter != sharedCounter;
         localConv100Mmdd860Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of conv100Mmdd860
	 *	@return conv100Mmdd860
	 */
	public char[]  getConv100Mmdd860String() {
	     return getCharArray(beginConv100Mmdd860,CONV_100_MMDD_860_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean conv100Mmdd860IsNumeric() {
	    return isNumeric(beginConv100Mmdd860
	                    ,beginConv100Mmdd860 + CONV_100_MMDD_860_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CONV_100_MMDD_860_LEN = 4;
  	/**
	 * serializeConv100Mmdd860
	 */
	protected void serializeConv100Mmdd860(int conv100Mmdd860) {
		 putNumber(beginConv100Mmdd860,conv100Mmdd860,CONV_100_MMDD_860_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localConv100Mmdd860Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeConv100Mmdd860
	 */
   	protected  int serializeConv100Mmdd860(char[] value) {
	    int  conv100Mmdd860;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    conv100Mmdd860 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginConv100Mmdd860
		       ,4
		      );
		 localConv100Mmdd860Counter = shareString.getSerializedField().getModifiedCounter();
		return  conv100Mmdd860;
    }

   protected int checkConv100Mmdd860MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshConv100Mmdd860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshConv100Mmdd860() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginConv100Mmdd860
			                 ,CONV_100_MMDD_860_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("conv100Mmdd860", beginConv100Mmdd860,CONV_100_MMDD_860_LEN);
    }
   	}
     int localMerchantType860Counter = -1;
     public boolean isMerchantType860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMerchantType860Counter != sharedCounter;
         localMerchantType860Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of merchantType860
	 *	@return merchantType860
	 */
	public char[]  getMerchantType860String() {
	     return getCharArray(beginMerchantType860,MERCHANT_TYPE_860_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean merchantType860IsNumeric() {
	    return isNumeric(beginMerchantType860
	                    ,beginMerchantType860 + MERCHANT_TYPE_860_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MERCHANT_TYPE_860_LEN = 4;
  	/**
	 * serializeMerchantType860
	 */
	protected void serializeMerchantType860(int merchantType860) {
		 putNumber(beginMerchantType860,merchantType860,MERCHANT_TYPE_860_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMerchantType860Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMerchantType860
	 */
   	protected  int serializeMerchantType860(char[] value) {
	    int  merchantType860;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    merchantType860 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginMerchantType860
		       ,4
		      );
		 localMerchantType860Counter = shareString.getSerializedField().getModifiedCounter();
		return  merchantType860;
    }

   protected int checkMerchantType860MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMerchantType860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMerchantType860() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMerchantType860
			                 ,MERCHANT_TYPE_860_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("merchantType860", beginMerchantType860,MERCHANT_TYPE_860_LEN);
    }
   	}
     int localCountryCode860Counter = -1;
     public boolean isCountryCode860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCountryCode860Counter != sharedCounter;
         localCountryCode860Counter = sharedCounter; return hasModified;
     }
	protected static final int COUNTRY_CODE_860_LEN = 3;
	/**
	 * 	serialize this CountryCode860
	 */
   protected void serializeCountryCode860(char[] countryCode860) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(countryCode860,0,getStringValue(),beginCountryCode860,COUNTRY_CODE_860_LEN);
       localCountryCode860Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCountryCode860Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshCountryCode860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCountryCode860() {	 
   		return (substring(getStringValue(),beginCountryCode860,beginCountryCode860 + COUNTRY_CODE_860_LEN));
   	}
     int localPosDeviceType860Counter = -1;
     public boolean isPosDeviceType860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPosDeviceType860Counter != sharedCounter;
         localPosDeviceType860Counter = sharedCounter; return hasModified;
     }
	protected static final int POS_DEVICE_TYPE_860_LEN = 3;
	/**
	 * 	serialize this PosDeviceType860
	 */
   protected void serializePosDeviceType860(char[] posDeviceType860) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(posDeviceType860,0,getStringValue(),beginPosDeviceType860,POS_DEVICE_TYPE_860_LEN);
       localPosDeviceType860Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPosDeviceType860Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshPosDeviceType860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPosDeviceType860() {	 
   		return (substring(getStringValue(),beginPosDeviceType860,beginPosDeviceType860 + POS_DEVICE_TYPE_860_LEN));
   	}
     int localPosPinCapture860Counter = -1;
     public boolean isPosPinCapture860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPosPinCapture860Counter != sharedCounter;
         localPosPinCapture860Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of posPinCapture860
	 *	@return posPinCapture860
	 */
	public char[]  getPosPinCapture860String() {
	     return getCharArray(beginPosPinCapture860,POS_PIN_CAPTURE_860_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean posPinCapture860IsNumeric() {
	    return isNumeric(beginPosPinCapture860
	                    ,beginPosPinCapture860 + POS_PIN_CAPTURE_860_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int POS_PIN_CAPTURE_860_LEN = 2;
  	/**
	 * serializePosPinCapture860
	 */
	protected void serializePosPinCapture860(int posPinCapture860) {
		 putNumber(beginPosPinCapture860,posPinCapture860,POS_PIN_CAPTURE_860_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPosPinCapture860Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePosPinCapture860
	 */
   	protected  int serializePosPinCapture860(char[] value) {
	    int  posPinCapture860;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    posPinCapture860 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginPosPinCapture860
		       ,2
		      );
		 localPosPinCapture860Counter = shareString.getSerializedField().getModifiedCounter();
		return  posPinCapture860;
    }

   protected int checkPosPinCapture860MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPosPinCapture860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPosPinCapture860() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPosPinCapture860
			                 ,POS_PIN_CAPTURE_860_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("posPinCapture860", beginPosPinCapture860,POS_PIN_CAPTURE_860_LEN);
    }
   	}
     int localTrackTwoData860Counter = -1;
     public boolean isTrackTwoData860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTrackTwoData860Counter != sharedCounter;
         localTrackTwoData860Counter = sharedCounter; return hasModified;
     }
	protected static final int TRACK_TWO_DATA_860_LEN = 37;
	/**
	 * 	serialize this TrackTwoData860
	 */
   protected void serializeTrackTwoData860(char[] trackTwoData860) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(trackTwoData860,0,getStringValue(),beginTrackTwoData860,TRACK_TWO_DATA_860_LEN);
       localTrackTwoData860Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTrackTwoData860Constraints(char[] value) {
   			return super.checkConstraints(value , 37 ,false, false);
   }
    /**
	 *	refreshTrackTwoData860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTrackTwoData860() {	 
   		return (substring(getStringValue(),beginTrackTwoData860,beginTrackTwoData860 + TRACK_TWO_DATA_860_LEN));
   	}
     int localRetrievalRefno860Counter = -1;
     public boolean isRetrievalRefno860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRetrievalRefno860Counter != sharedCounter;
         localRetrievalRefno860Counter = sharedCounter; return hasModified;
     }
	protected static final int RETRIEVAL_REFNO_860_LEN = 12;
	/**
	 * 	serialize this RetrievalRefno860
	 */
   protected void serializeRetrievalRefno860(char[] retrievalRefno860) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(retrievalRefno860,0,getStringValue(),beginRetrievalRefno860,RETRIEVAL_REFNO_860_LEN);
       localRetrievalRefno860Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRetrievalRefno860Constraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshRetrievalRefno860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRetrievalRefno860() {	 
   		return (substring(getStringValue(),beginRetrievalRefno860,beginRetrievalRefno860 + RETRIEVAL_REFNO_860_LEN));
   	}
     int localIdTerminal860Counter = -1;
     public boolean isIdTerminal860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIdTerminal860Counter != sharedCounter;
         localIdTerminal860Counter = sharedCounter; return hasModified;
     }
	protected static final int ID_TERMINAL_860_LEN = 8;
	/**
	 * 	serialize this IdTerminal860
	 */
   protected void serializeIdTerminal860(char[] idTerminal860) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(idTerminal860,0,getStringValue(),beginIdTerminal860,ID_TERMINAL_860_LEN);
       localIdTerminal860Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIdTerminal860Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIdTerminal860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIdTerminal860() {	 
   		return (substring(getStringValue(),beginIdTerminal860,beginIdTerminal860 + ID_TERMINAL_860_LEN));
   	}
     int localCardAcceptor860Counter = -1;
     public boolean isCardAcceptor860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCardAcceptor860Counter != sharedCounter;
         localCardAcceptor860Counter = sharedCounter; return hasModified;
     }
	protected static final int CARD_ACCEPTOR_860_LEN = 15;
	/**
	 * 	serialize this CardAcceptor860
	 */
   protected void serializeCardAcceptor860(char[] cardAcceptor860) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cardAcceptor860,0,getStringValue(),beginCardAcceptor860,CARD_ACCEPTOR_860_LEN);
       localCardAcceptor860Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCardAcceptor860Constraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshCardAcceptor860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCardAcceptor860() {	 
   		return (substring(getStringValue(),beginCardAcceptor860,beginCardAcceptor860 + CARD_ACCEPTOR_860_LEN));
   	}
     int localAuthMrchNmctst860Counter = -1;
     public boolean isAuthMrchNmctst860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAuthMrchNmctst860Counter != sharedCounter;
         localAuthMrchNmctst860Counter = sharedCounter; return hasModified;
     }
	protected static final int AUTH_MRCH_NMCTST_860_LEN = 40;
	/**
	 * 	serialize this AuthMrchNmctst860
	 */
   protected void serializeAuthMrchNmctst860(char[] authMrchNmctst860) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(authMrchNmctst860,0,getStringValue(),beginAuthMrchNmctst860,AUTH_MRCH_NMCTST_860_LEN);
       localAuthMrchNmctst860Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAuthMrchNmctst860Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshAuthMrchNmctst860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAuthMrchNmctst860() {	 
   		return (substring(getStringValue(),beginAuthMrchNmctst860,beginAuthMrchNmctst860 + AUTH_MRCH_NMCTST_860_LEN));
   	}
     int localTrackOneData860Counter = -1;
     public boolean isTrackOneData860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTrackOneData860Counter != sharedCounter;
         localTrackOneData860Counter = sharedCounter; return hasModified;
     }
	protected static final int TRACK_ONE_DATA_860_LEN = 76;
	/**
	 * 	serialize this TrackOneData860
	 */
   protected void serializeTrackOneData860(char[] trackOneData860) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(trackOneData860,0,getStringValue(),beginTrackOneData860,TRACK_ONE_DATA_860_LEN);
       localTrackOneData860Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTrackOneData860Constraints(char[] value) {
   			return super.checkConstraints(value , 76 ,false, false);
   }
    /**
	 *	refreshTrackOneData860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTrackOneData860() {	 
   		return (substring(getStringValue(),beginTrackOneData860,beginTrackOneData860 + TRACK_ONE_DATA_860_LEN));
   	}
     int localCurrencyCode860Counter = -1;
     public boolean isCurrencyCode860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrencyCode860Counter != sharedCounter;
         localCurrencyCode860Counter = sharedCounter; return hasModified;
     }
	protected static final int CURRENCY_CODE_860_LEN = 3;
	/**
	 * 	serialize this CurrencyCode860
	 */
   protected void serializeCurrencyCode860(char[] currencyCode860) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currencyCode860,0,getStringValue(),beginCurrencyCode860,CURRENCY_CODE_860_LEN);
       localCurrencyCode860Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrencyCode860Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshCurrencyCode860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrencyCode860() {	 
   		return (substring(getStringValue(),beginCurrencyCode860,beginCurrencyCode860 + CURRENCY_CODE_860_LEN));
   	}
     int localCrncyCdeSetl100860Counter = -1;
     public boolean isCrncyCdeSetl100860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCrncyCdeSetl100860Counter != sharedCounter;
         localCrncyCdeSetl100860Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of crncyCdeSetl100860
	 *	@return crncyCdeSetl100860
	 */
	public char[]  getCrncyCdeSetl100860String() {
	     return getCharArray(beginCrncyCdeSetl100860,CRNCY_CDE_SETL_100860_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean crncyCdeSetl100860IsNumeric() {
	    return isNumeric(beginCrncyCdeSetl100860
	                    ,beginCrncyCdeSetl100860 + CRNCY_CDE_SETL_100860_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CRNCY_CDE_SETL_100860_LEN = 3;
  	/**
	 * serializeCrncyCdeSetl100860
	 */
	protected void serializeCrncyCdeSetl100860(int crncyCdeSetl100860) {
		 putNumber(beginCrncyCdeSetl100860,crncyCdeSetl100860,CRNCY_CDE_SETL_100860_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCrncyCdeSetl100860Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCrncyCdeSetl100860
	 */
   	protected  int serializeCrncyCdeSetl100860(char[] value) {
	    int  crncyCdeSetl100860;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    crncyCdeSetl100860 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginCrncyCdeSetl100860
		       ,3
		      );
		 localCrncyCdeSetl100860Counter = shareString.getSerializedField().getModifiedCounter();
		return  crncyCdeSetl100860;
    }

   protected int checkCrncyCdeSetl100860MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCrncyCdeSetl100860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCrncyCdeSetl100860() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCrncyCdeSetl100860
			                 ,CRNCY_CDE_SETL_100860_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("crncyCdeSetl100860", beginCrncyCdeSetl100860,CRNCY_CDE_SETL_100860_LEN);
    }
   	}
     int localCrncyCrdhldr100860Counter = -1;
     public boolean isCrncyCrdhldr100860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCrncyCrdhldr100860Counter != sharedCounter;
         localCrncyCrdhldr100860Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of crncyCrdhldr100860
	 *	@return crncyCrdhldr100860
	 */
	public char[]  getCrncyCrdhldr100860String() {
	     return getCharArray(beginCrncyCrdhldr100860,CRNCY_CRDHLDR_100860_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean crncyCrdhldr100860IsNumeric() {
	    return isNumeric(beginCrncyCrdhldr100860
	                    ,beginCrncyCrdhldr100860 + CRNCY_CRDHLDR_100860_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CRNCY_CRDHLDR_100860_LEN = 3;
  	/**
	 * serializeCrncyCrdhldr100860
	 */
	protected void serializeCrncyCrdhldr100860(int crncyCrdhldr100860) {
		 putNumber(beginCrncyCrdhldr100860,crncyCrdhldr100860,CRNCY_CRDHLDR_100860_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCrncyCrdhldr100860Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCrncyCrdhldr100860
	 */
   	protected  int serializeCrncyCrdhldr100860(char[] value) {
	    int  crncyCrdhldr100860;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    crncyCrdhldr100860 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginCrncyCrdhldr100860
		       ,3
		      );
		 localCrncyCrdhldr100860Counter = shareString.getSerializedField().getModifiedCounter();
		return  crncyCrdhldr100860;
    }

   protected int checkCrncyCrdhldr100860MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCrncyCrdhldr100860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCrncyCrdhldr100860() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCrncyCrdhldr100860
			                 ,CRNCY_CRDHLDR_100860_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("crncyCrdhldr100860", beginCrncyCrdhldr100860,CRNCY_CRDHLDR_100860_LEN);
    }
   	}
     int localPosData860Counter = -1;
     public boolean isPosData860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPosData860Counter != sharedCounter;
         localPosData860Counter = sharedCounter; return hasModified;
     }
	protected static final int POS_DATA_860_LEN = 26;
	/**
	 * 	serialize this PosData860
	 */
   protected void serializePosData860(char[] posData860) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(posData860,0,getStringValue(),beginPosData860,POS_DATA_860_LEN);
       localPosData860Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPosData860Constraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshPosData860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPosData860() {	 
   		return (substring(getStringValue(),beginPosData860,beginPosData860 + POS_DATA_860_LEN));
   	}
     int localDe112100860Counter = -1;
     public boolean isDe112100860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDe112100860Counter != sharedCounter;
         localDe112100860Counter = sharedCounter; return hasModified;
     }
	protected static final int DE_112100860_LEN = 103;
	/**
	 * 	serialize this De112100860
	 */
   protected void serializeDe112100860(char[] de112100860) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(de112100860,0,getStringValue(),beginDe112100860,DE_112100860_LEN);
       localDe112100860Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDe112100860Constraints(char[] value) {
   			return super.checkConstraints(value , 103 ,false, false);
   }
    /**
	 *	refreshDe112100860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDe112100860() {	 
   		return (substring(getStringValue(),beginDe112100860,beginDe112100860 + DE_112100860_LEN));
   	}
     int localCrncyConv100860Counter = -1;
     public boolean isCrncyConv100860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCrncyConv100860Counter != sharedCounter;
         localCrncyConv100860Counter = sharedCounter; return hasModified;
     }
	protected static final int CRNCY_CONV_100860_LEN = 78;
	/**
	 * 	serialize this CrncyConv100860
	 */
   protected void serializeCrncyConv100860(char[] crncyConv100860) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(crncyConv100860,0,getStringValue(),beginCrncyConv100860,CRNCY_CONV_100860_LEN);
       localCrncyConv100860Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCrncyConv100860Constraints(char[] value) {
   			return super.checkConstraints(value , 78 ,false, false);
   }
    /**
	 *	refreshCrncyConv100860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCrncyConv100860() {	 
   		return (substring(getStringValue(),beginCrncyConv100860,beginCrncyConv100860 + CRNCY_CONV_100860_LEN));
   	}




}
  
