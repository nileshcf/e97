package com.cloudframe.app.ip829010.dto.serialize;

/**
*  The class FraudMqDebugDisp600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FraudMqDebugDisp600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FraudMqDebugDisp600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FRAUD_MQ_DEBUG_DISP_600_LENGTH = 126;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPrimaryAcctNo600;
            protected  int beginExpirDate600;
            protected  int beginVirtualAcctNo600;
            protected  int beginQueryNum600;
            protected  int beginGftDsn600;
            protected  int beginLogicalSeq600;
            protected  int beginTxnNo600;
            protected  int beginFacCount600;
            protected  int beginFaaPanStatCd600;
            protected  int beginFaaClsDt600;
	
	/**
	* Constructor for FraudMqDebugDisp600Serialized
	**/
    public FraudMqDebugDisp600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FraudMqDebugDisp600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FRAUD_MQ_DEBUG_DISP_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPrimaryAcctNo600 = getStartOffset() + 0;	// set offset for serialization
  
             beginExpirDate600 = getStartOffset() + 19;	// set offset for serialization
  
             beginVirtualAcctNo600 = getStartOffset() + 25;	// set offset for serialization
  
             beginQueryNum600 = getStartOffset() + 44;	// set offset for serialization
  
             beginGftDsn600 = getStartOffset() + 48;	// set offset for serialization
  
             beginLogicalSeq600 = getStartOffset() + 92;	// set offset for serialization
  
             beginTxnNo600 = getStartOffset() + 101;	// set offset for serialization
  
             beginFacCount600 = getStartOffset() + 110;	// set offset for serialization
  
             beginFaaPanStatCd600 = getStartOffset() + 115;	// set offset for serialization
  
             beginFaaClsDt600 = getStartOffset() + 116;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localPrimaryAcctNo600Counter = -1;
     public boolean isPrimaryAcctNo600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrimaryAcctNo600Counter != sharedCounter;
         localPrimaryAcctNo600Counter = sharedCounter; return hasModified;
     }
	protected static final int PRIMARY_ACCT_NO_600_LEN = 19;
	/**
	 * 	serialize this PrimaryAcctNo600
	 */
   protected void serializePrimaryAcctNo600(char[] primaryAcctNo600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(primaryAcctNo600,0,getStringValue(),beginPrimaryAcctNo600,PRIMARY_ACCT_NO_600_LEN);
       localPrimaryAcctNo600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPrimaryAcctNo600Constraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshPrimaryAcctNo600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPrimaryAcctNo600() {	 
   		return (substring(getStringValue(),beginPrimaryAcctNo600,beginPrimaryAcctNo600 + PRIMARY_ACCT_NO_600_LEN));
   	}
     int localExpirDate600Counter = -1;
     public boolean isExpirDate600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExpirDate600Counter != sharedCounter;
         localExpirDate600Counter = sharedCounter; return hasModified;
     }
	protected static final int EXPIR_DATE_600_LEN = 6;
	/**
	 * 	serialize this ExpirDate600
	 */
   protected void serializeExpirDate600(char[] expirDate600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(expirDate600,0,getStringValue(),beginExpirDate600,EXPIR_DATE_600_LEN);
       localExpirDate600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExpirDate600Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshExpirDate600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExpirDate600() {	 
   		return (substring(getStringValue(),beginExpirDate600,beginExpirDate600 + EXPIR_DATE_600_LEN));
   	}
     int localVirtualAcctNo600Counter = -1;
     public boolean isVirtualAcctNo600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVirtualAcctNo600Counter != sharedCounter;
         localVirtualAcctNo600Counter = sharedCounter; return hasModified;
     }
	protected static final int VIRTUAL_ACCT_NO_600_LEN = 19;
	/**
	 * 	serialize this VirtualAcctNo600
	 */
   protected void serializeVirtualAcctNo600(char[] virtualAcctNo600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(virtualAcctNo600,0,getStringValue(),beginVirtualAcctNo600,VIRTUAL_ACCT_NO_600_LEN);
       localVirtualAcctNo600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkVirtualAcctNo600Constraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshVirtualAcctNo600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshVirtualAcctNo600() {	 
   		return (substring(getStringValue(),beginVirtualAcctNo600,beginVirtualAcctNo600 + VIRTUAL_ACCT_NO_600_LEN));
   	}
     int localQueryNum600Counter = -1;
     public boolean isQueryNum600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localQueryNum600Counter != sharedCounter;
         localQueryNum600Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of queryNum600
	 *	@return queryNum600
	 */
	public char[]  getQueryNum600String() {
	     return getCharArray(beginQueryNum600,QUERY_NUM_600_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean queryNum600IsNumeric() {
	    return isNumeric(beginQueryNum600
	                    ,beginQueryNum600 + QUERY_NUM_600_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int QUERY_NUM_600_LEN = 4;
  	/**
	 * serializeQueryNum600
	 */
	protected void serializeQueryNum600(int queryNum600) {
		 putNumber(beginQueryNum600,queryNum600,QUERY_NUM_600_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localQueryNum600Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeQueryNum600
	 */
   	protected  int serializeQueryNum600(char[] value) {
	    int  queryNum600;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    queryNum600 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginQueryNum600
		       ,4
		      );
		 localQueryNum600Counter = shareString.getSerializedField().getModifiedCounter();
		return  queryNum600;
    }

   protected int checkQueryNum600MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshQueryNum600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshQueryNum600() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginQueryNum600
			                 ,QUERY_NUM_600_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("queryNum600", beginQueryNum600,QUERY_NUM_600_LEN);
    }
   	}
     int localGftDsn600Counter = -1;
     public boolean isGftDsn600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGftDsn600Counter != sharedCounter;
         localGftDsn600Counter = sharedCounter; return hasModified;
     }
	protected static final int GFT_DSN_600_LEN = 44;
	/**
	 * 	serialize this GftDsn600
	 */
   protected void serializeGftDsn600(char[] gftDsn600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(gftDsn600,0,getStringValue(),beginGftDsn600,GFT_DSN_600_LEN);
       localGftDsn600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGftDsn600Constraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
    /**
	 *	refreshGftDsn600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGftDsn600() {	 
   		return (substring(getStringValue(),beginGftDsn600,beginGftDsn600 + GFT_DSN_600_LEN));
   	}
     int localLogicalSeq600Counter = -1;
     public boolean isLogicalSeq600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLogicalSeq600Counter != sharedCounter;
         localLogicalSeq600Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of logicalSeq600
	 *	@return logicalSeq600
	 */
	public char[]  getLogicalSeq600String() {
	     return getCharArray(beginLogicalSeq600,LOGICAL_SEQ_600_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean logicalSeq600IsNumeric() {
	    return isNumeric(beginLogicalSeq600
	                    ,beginLogicalSeq600 + LOGICAL_SEQ_600_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int LOGICAL_SEQ_600_LEN = 9;
  	/**
	 * serializeLogicalSeq600
	 */
	protected void serializeLogicalSeq600(long logicalSeq600) {
		 putNumber(beginLogicalSeq600,logicalSeq600,LOGICAL_SEQ_600_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localLogicalSeq600Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeLogicalSeq600
	 */
   	protected  long serializeLogicalSeq600(char[] value) {
	    long  logicalSeq600;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    logicalSeq600 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginLogicalSeq600
		       ,9
		      );
		 localLogicalSeq600Counter = shareString.getSerializedField().getModifiedCounter();
		return  logicalSeq600;
    }

   protected long checkLogicalSeq600MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshLogicalSeq600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshLogicalSeq600() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginLogicalSeq600
			                 ,LOGICAL_SEQ_600_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("logicalSeq600", beginLogicalSeq600,LOGICAL_SEQ_600_LEN);
    }
   	}
     int localTxnNo600Counter = -1;
     public boolean isTxnNo600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTxnNo600Counter != sharedCounter;
         localTxnNo600Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of txnNo600
	 *	@return txnNo600
	 */
	public char[]  getTxnNo600String() {
	     return getCharArray(beginTxnNo600,TXN_NO_600_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean txnNo600IsNumeric() {
	    return isNumeric(beginTxnNo600
	                    ,beginTxnNo600 + TXN_NO_600_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TXN_NO_600_LEN = 9;
  	/**
	 * serializeTxnNo600
	 */
	protected void serializeTxnNo600(long txnNo600) {
		 putNumber(beginTxnNo600,txnNo600,TXN_NO_600_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTxnNo600Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTxnNo600
	 */
   	protected  long serializeTxnNo600(char[] value) {
	    long  txnNo600;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    txnNo600 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginTxnNo600
		       ,9
		      );
		 localTxnNo600Counter = shareString.getSerializedField().getModifiedCounter();
		return  txnNo600;
    }

   protected long checkTxnNo600MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTxnNo600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTxnNo600() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTxnNo600
			                 ,TXN_NO_600_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("txnNo600", beginTxnNo600,TXN_NO_600_LEN);
    }
   	}
     int localFacCount600Counter = -1;
     public boolean isFacCount600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFacCount600Counter != sharedCounter;
         localFacCount600Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of facCount600
	 *	@return facCount600
	 */
	public char[]  getFacCount600String() {
	     return getCharArray(beginFacCount600,FAC_COUNT_600_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean facCount600IsNumeric() {
	    return isNumeric(beginFacCount600
	                    ,beginFacCount600 + FAC_COUNT_600_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FAC_COUNT_600_LEN = 5;
  	/**
	 * serializeFacCount600
	 */
	protected void serializeFacCount600(long facCount600) {
		 putNumber(beginFacCount600,facCount600,FAC_COUNT_600_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFacCount600Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFacCount600
	 */
   	protected  long serializeFacCount600(char[] value) {
	    long  facCount600;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    facCount600 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginFacCount600
		       ,5
		      );
		 localFacCount600Counter = shareString.getSerializedField().getModifiedCounter();
		return  facCount600;
    }

   protected long checkFacCount600MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFacCount600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshFacCount600() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginFacCount600
			                 ,FAC_COUNT_600_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("facCount600", beginFacCount600,FAC_COUNT_600_LEN);
    }
   	}
     int localFaaPanStatCd600Counter = -1;
     public boolean isFaaPanStatCd600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFaaPanStatCd600Counter != sharedCounter;
         localFaaPanStatCd600Counter = sharedCounter; return hasModified;
     }
	protected static final int FAA_PAN_STAT_CD_600_LEN = 1;
	/**
	 * 	serialize this FaaPanStatCd600
	 */
   protected void serializeFaaPanStatCd600(char[] faaPanStatCd600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(faaPanStatCd600,0,getStringValue(),beginFaaPanStatCd600,FAA_PAN_STAT_CD_600_LEN);
       localFaaPanStatCd600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFaaPanStatCd600Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFaaPanStatCd600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFaaPanStatCd600() {	 
   		return (substring(getStringValue(),beginFaaPanStatCd600,beginFaaPanStatCd600 + FAA_PAN_STAT_CD_600_LEN));
   	}
     int localFaaClsDt600Counter = -1;
     public boolean isFaaClsDt600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFaaClsDt600Counter != sharedCounter;
         localFaaClsDt600Counter = sharedCounter; return hasModified;
     }
	protected static final int FAA_CLS_DT_600_LEN = 10;
	/**
	 * 	serialize this FaaClsDt600
	 */
   protected void serializeFaaClsDt600(char[] faaClsDt600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(faaClsDt600,0,getStringValue(),beginFaaClsDt600,FAA_CLS_DT_600_LEN);
       localFaaClsDt600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFaaClsDt600Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshFaaClsDt600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFaaClsDt600() {	 
   		return (substring(getStringValue(),beginFaaClsDt600,beginFaaClsDt600 + FAA_CLS_DT_600_LEN));
   	}




}
  
