package com.cloudframe.app.ip088030.dto.serialize;

/**
*  The class IchgEntry500Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:30. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class IchgEntry500Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IchgEntry500Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ICHG_ENTRY_500_LENGTH = 85;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRecType500;
            protected  int beginTxnLowAmt500;
            protected  int beginTxnLowAmtU500;
            protected  int beginTxnHighAmt500;
            protected  int beginTxnHighAmtU500;
            protected  int beginMcc500;
            protected  int beginMaid500;
            protected  int beginProdId500;
            protected  int beginViaRate500;
            protected  int beginFiaAmt500;
            protected  int beginMinAmt500;
            protected  int beginMaxAmt500;
	
	/**
	* Constructor for IchgEntry500Serialized
	**/
    public IchgEntry500Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for IchgEntry500Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IchgEntry500Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this IchgEntry500Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4); // serialize this field at offset 4 by default 
    }
    
	/**
	* sets parent for this IchgEntry500Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4 by default
    }    
	/**
	* initializes the field in IchgEntry500Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ICHG_ENTRY_500_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRecType500 = getStartOffset() + 0;	// set offset for serialization
  
             beginTxnLowAmt500 = getStartOffset() + 1;	// set offset for serialization
  
             beginTxnLowAmtU500 = getStartOffset() + 1;	// set offset for serialization
  
             beginTxnHighAmt500 = getStartOffset() + 13;	// set offset for serialization
  
             beginTxnHighAmtU500 = getStartOffset() + 13;	// set offset for serialization
  
             beginMcc500 = getStartOffset() + 25;	// set offset for serialization
  
             beginMaid500 = getStartOffset() + 29;	// set offset for serialization
  
             beginProdId500 = getStartOffset() + 35;	// set offset for serialization
  
             beginViaRate500 = getStartOffset() + 38;	// set offset for serialization
  
             beginFiaAmt500 = getStartOffset() + 49;	// set offset for serialization
  
             beginMinAmt500 = getStartOffset() + 61;	// set offset for serialization
  
             beginMaxAmt500 = getStartOffset() + 73;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRecType500Counter = -1;
     public boolean isRecType500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRecType500Counter != sharedCounter;
         localRecType500Counter = sharedCounter; return hasModified;
     }
	protected static final int REC_TYPE_500_LEN = 1;
	/**
	 * 	serialize this RecType500
	 */
   protected void serializeRecType500(char[] recType500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(recType500,0,getStringValue(),beginRecType500,REC_TYPE_500_LEN);
       localRecType500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRecType500Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRecType500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRecType500() {	 
   		return (substring(getStringValue(),beginRecType500,beginRecType500 + REC_TYPE_500_LEN));
   	}
     int localTxnLowAmt500Counter = -1;
     
     public boolean isTxnLowAmt500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTxnLowAmt500Counter != sharedCounter;
         localTxnLowAmt500Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of txnLowAmt500
	 *	@return txnLowAmt500
	 */
	public char[]  getTxnLowAmt500String() {
	    return getCharArray(beginTxnLowAmt500,TXN_LOW_AMT_500_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean txnLowAmt500IsNumeric() {
		    return isNumeric(beginTxnLowAmt500
	                    ,beginTxnLowAmt500 + TXN_LOW_AMT_500_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TXN_LOW_AMT_500_LEN = 12;
  protected  static final int TXN_LOW_AMT_500_SCALE = 2;

   protected BigDecimal checkTxnLowAmt500MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,12/*precision*/);
   }

  	/**
	 * serializeTxnLowAmt500
	 */
	protected void serializeTxnLowAmt500(BigDecimal txnLowAmt500) {
	       putNumber(beginTxnLowAmt500,txnLowAmt500,TXN_LOW_AMT_500_LEN,TXN_LOW_AMT_500_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTxnLowAmt500Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTxnLowAmt500
	 */
   	protected  BigDecimal serializeTxnLowAmt500(char[] value) throws CFException {
        if (value.length < 12) value = pad(12, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginTxnLowAmt500
		       ,12
		      );		 localTxnLowAmt500Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TXN_LOW_AMT_500_LEN,TXN_LOW_AMT_500_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("txnLowAmt500", beginTxnLowAmt500,TXN_LOW_AMT_500_LEN);
    	}
    }
    /**
	 *	refreshTxnLowAmt500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTxnLowAmt500() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTxnLowAmt500
			            ,TXN_LOW_AMT_500_LEN
			            ,TXN_LOW_AMT_500_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("txnLowAmt500", beginTxnLowAmt500,TXN_LOW_AMT_500_LEN);
    }
   	}
     int localTxnLowAmtU500Counter = -1;
     public boolean isTxnLowAmtU500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTxnLowAmtU500Counter != sharedCounter;
         localTxnLowAmtU500Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of txnLowAmtU500
	 *	@return txnLowAmtU500
	 */
	public char[]  getTxnLowAmtU500String() {
	     return getCharArray(beginTxnLowAmtU500,TXN_LOW_AMT_U_500_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean txnLowAmtU500IsNumeric() {
	    return isNumeric(beginTxnLowAmtU500
	                    ,beginTxnLowAmtU500 + TXN_LOW_AMT_U_500_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TXN_LOW_AMT_U_500_LEN = 12;
  	/**
	 * serializeTxnLowAmtU500
	 */
	protected void serializeTxnLowAmtU500(long txnLowAmtU500) {
		 putNumber(beginTxnLowAmtU500,txnLowAmtU500,TXN_LOW_AMT_U_500_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTxnLowAmtU500Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTxnLowAmtU500
	 */
   	protected  long serializeTxnLowAmtU500(char[] value) {
	    long  txnLowAmtU500;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    txnLowAmtU500 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginTxnLowAmtU500
		       ,12
		      );
		 localTxnLowAmtU500Counter = shareString.getSerializedField().getModifiedCounter();
		return  txnLowAmtU500;
    }

   protected long checkTxnLowAmtU500MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTxnLowAmtU500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTxnLowAmtU500() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTxnLowAmtU500
			                 ,TXN_LOW_AMT_U_500_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("txnLowAmtU500", beginTxnLowAmtU500,TXN_LOW_AMT_U_500_LEN);
    }
   	}
     int localTxnHighAmt500Counter = -1;
     
     public boolean isTxnHighAmt500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTxnHighAmt500Counter != sharedCounter;
         localTxnHighAmt500Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of txnHighAmt500
	 *	@return txnHighAmt500
	 */
	public char[]  getTxnHighAmt500String() {
	    return getCharArray(beginTxnHighAmt500,TXN_HIGH_AMT_500_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean txnHighAmt500IsNumeric() {
		    return isNumeric(beginTxnHighAmt500
	                    ,beginTxnHighAmt500 + TXN_HIGH_AMT_500_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TXN_HIGH_AMT_500_LEN = 12;
  protected  static final int TXN_HIGH_AMT_500_SCALE = 2;

   protected BigDecimal checkTxnHighAmt500MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,12/*precision*/);
   }

  	/**
	 * serializeTxnHighAmt500
	 */
	protected void serializeTxnHighAmt500(BigDecimal txnHighAmt500) {
	       putNumber(beginTxnHighAmt500,txnHighAmt500,TXN_HIGH_AMT_500_LEN,TXN_HIGH_AMT_500_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTxnHighAmt500Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTxnHighAmt500
	 */
   	protected  BigDecimal serializeTxnHighAmt500(char[] value) throws CFException {
        if (value.length < 12) value = pad(12, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginTxnHighAmt500
		       ,12
		      );		 localTxnHighAmt500Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TXN_HIGH_AMT_500_LEN,TXN_HIGH_AMT_500_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("txnHighAmt500", beginTxnHighAmt500,TXN_HIGH_AMT_500_LEN);
    	}
    }
    /**
	 *	refreshTxnHighAmt500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTxnHighAmt500() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTxnHighAmt500
			            ,TXN_HIGH_AMT_500_LEN
			            ,TXN_HIGH_AMT_500_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("txnHighAmt500", beginTxnHighAmt500,TXN_HIGH_AMT_500_LEN);
    }
   	}
     int localTxnHighAmtU500Counter = -1;
     public boolean isTxnHighAmtU500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTxnHighAmtU500Counter != sharedCounter;
         localTxnHighAmtU500Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of txnHighAmtU500
	 *	@return txnHighAmtU500
	 */
	public char[]  getTxnHighAmtU500String() {
	     return getCharArray(beginTxnHighAmtU500,TXN_HIGH_AMT_U_500_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean txnHighAmtU500IsNumeric() {
	    return isNumeric(beginTxnHighAmtU500
	                    ,beginTxnHighAmtU500 + TXN_HIGH_AMT_U_500_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TXN_HIGH_AMT_U_500_LEN = 12;
  	/**
	 * serializeTxnHighAmtU500
	 */
	protected void serializeTxnHighAmtU500(long txnHighAmtU500) {
		 putNumber(beginTxnHighAmtU500,txnHighAmtU500,TXN_HIGH_AMT_U_500_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTxnHighAmtU500Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTxnHighAmtU500
	 */
   	protected  long serializeTxnHighAmtU500(char[] value) {
	    long  txnHighAmtU500;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    txnHighAmtU500 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginTxnHighAmtU500
		       ,12
		      );
		 localTxnHighAmtU500Counter = shareString.getSerializedField().getModifiedCounter();
		return  txnHighAmtU500;
    }

   protected long checkTxnHighAmtU500MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTxnHighAmtU500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTxnHighAmtU500() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTxnHighAmtU500
			                 ,TXN_HIGH_AMT_U_500_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("txnHighAmtU500", beginTxnHighAmtU500,TXN_HIGH_AMT_U_500_LEN);
    }
   	}
     int localMcc500Counter = -1;
     public boolean isMcc500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMcc500Counter != sharedCounter;
         localMcc500Counter = sharedCounter; return hasModified;
     }
	protected static final int MCC_500_LEN = 4;
	/**
	 * 	serialize this Mcc500
	 */
   protected void serializeMcc500(char[] mcc500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mcc500,0,getStringValue(),beginMcc500,MCC_500_LEN);
       localMcc500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMcc500Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshMcc500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMcc500() {	 
   		return (substring(getStringValue(),beginMcc500,beginMcc500 + MCC_500_LEN));
   	}
     int localMaid500Counter = -1;
     public boolean isMaid500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMaid500Counter != sharedCounter;
         localMaid500Counter = sharedCounter; return hasModified;
     }
	protected static final int MAID_500_LEN = 6;
	/**
	 * 	serialize this Maid500
	 */
   protected void serializeMaid500(char[] maid500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(maid500,0,getStringValue(),beginMaid500,MAID_500_LEN);
       localMaid500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMaid500Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshMaid500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMaid500() {	 
   		return (substring(getStringValue(),beginMaid500,beginMaid500 + MAID_500_LEN));
   	}
     int localProdId500Counter = -1;
     public boolean isProdId500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localProdId500Counter != sharedCounter;
         localProdId500Counter = sharedCounter; return hasModified;
     }
	protected static final int PROD_ID_500_LEN = 3;
	/**
	 * 	serialize this ProdId500
	 */
   protected void serializeProdId500(char[] prodId500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(prodId500,0,getStringValue(),beginProdId500,PROD_ID_500_LEN);
       localProdId500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkProdId500Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshProdId500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshProdId500() {	 
   		return (substring(getStringValue(),beginProdId500,beginProdId500 + PROD_ID_500_LEN));
   	}
     int localViaRate500Counter = -1;
     
     public boolean isViaRate500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localViaRate500Counter != sharedCounter;
         localViaRate500Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of viaRate500
	 *	@return viaRate500
	 */
	public char[]  getViaRate500String() {
	    return getCharArray(beginViaRate500,VIA_RATE_500_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean viaRate500IsNumeric() {
		    return isNumeric(beginViaRate500
	                    ,beginViaRate500 + VIA_RATE_500_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int VIA_RATE_500_LEN = 11;
  protected  static final int VIA_RATE_500_SCALE = 6;

   protected BigDecimal checkViaRate500MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,6/*scale*/,11/*precision*/);
   }

  	/**
	 * serializeViaRate500
	 */
	protected void serializeViaRate500(BigDecimal viaRate500) {
	       putNumber(beginViaRate500,viaRate500,VIA_RATE_500_LEN,VIA_RATE_500_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localViaRate500Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeViaRate500
	 */
   	protected  BigDecimal serializeViaRate500(char[] value) throws CFException {
        if (value.length < 11) value = pad(11, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginViaRate500
		       ,11
		      );		 localViaRate500Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,VIA_RATE_500_LEN,VIA_RATE_500_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("viaRate500", beginViaRate500,VIA_RATE_500_LEN);
    	}
    }
    /**
	 *	refreshViaRate500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshViaRate500() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginViaRate500
			            ,VIA_RATE_500_LEN
			            ,VIA_RATE_500_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("viaRate500", beginViaRate500,VIA_RATE_500_LEN);
    }
   	}
     int localFiaAmt500Counter = -1;
     
     public boolean isFiaAmt500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiaAmt500Counter != sharedCounter;
         localFiaAmt500Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of fiaAmt500
	 *	@return fiaAmt500
	 */
	public char[]  getFiaAmt500String() {
	    return getCharArray(beginFiaAmt500,FIA_AMT_500_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean fiaAmt500IsNumeric() {
		    return isNumeric(beginFiaAmt500
	                    ,beginFiaAmt500 + FIA_AMT_500_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int FIA_AMT_500_LEN = 12;
  protected  static final int FIA_AMT_500_SCALE = 6;

   protected BigDecimal checkFiaAmt500MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,6/*scale*/,12/*precision*/);
   }

  	/**
	 * serializeFiaAmt500
	 */
	protected void serializeFiaAmt500(BigDecimal fiaAmt500) {
	       putNumber(beginFiaAmt500,fiaAmt500,FIA_AMT_500_LEN,FIA_AMT_500_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFiaAmt500Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeFiaAmt500
	 */
   	protected  BigDecimal serializeFiaAmt500(char[] value) throws CFException {
        if (value.length < 12) value = pad(12, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginFiaAmt500
		       ,12
		      );		 localFiaAmt500Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,FIA_AMT_500_LEN,FIA_AMT_500_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("fiaAmt500", beginFiaAmt500,FIA_AMT_500_LEN);
    	}
    }
    /**
	 *	refreshFiaAmt500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshFiaAmt500() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginFiaAmt500
			            ,FIA_AMT_500_LEN
			            ,FIA_AMT_500_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("fiaAmt500", beginFiaAmt500,FIA_AMT_500_LEN);
    }
   	}
     int localMinAmt500Counter = -1;
     
     public boolean isMinAmt500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMinAmt500Counter != sharedCounter;
         localMinAmt500Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of minAmt500
	 *	@return minAmt500
	 */
	public char[]  getMinAmt500String() {
	    return getCharArray(beginMinAmt500,MIN_AMT_500_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean minAmt500IsNumeric() {
		    return isNumeric(beginMinAmt500
	                    ,beginMinAmt500 + MIN_AMT_500_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int MIN_AMT_500_LEN = 12;
  protected  static final int MIN_AMT_500_SCALE = 2;

   protected BigDecimal checkMinAmt500MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,12/*precision*/);
   }

  	/**
	 * serializeMinAmt500
	 */
	protected void serializeMinAmt500(BigDecimal minAmt500) {
	       putNumber(beginMinAmt500,minAmt500,MIN_AMT_500_LEN,MIN_AMT_500_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMinAmt500Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeMinAmt500
	 */
   	protected  BigDecimal serializeMinAmt500(char[] value) throws CFException {
        if (value.length < 12) value = pad(12, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginMinAmt500
		       ,12
		      );		 localMinAmt500Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,MIN_AMT_500_LEN,MIN_AMT_500_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("minAmt500", beginMinAmt500,MIN_AMT_500_LEN);
    	}
    }
    /**
	 *	refreshMinAmt500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshMinAmt500() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginMinAmt500
			            ,MIN_AMT_500_LEN
			            ,MIN_AMT_500_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("minAmt500", beginMinAmt500,MIN_AMT_500_LEN);
    }
   	}
     int localMaxAmt500Counter = -1;
     
     public boolean isMaxAmt500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMaxAmt500Counter != sharedCounter;
         localMaxAmt500Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of maxAmt500
	 *	@return maxAmt500
	 */
	public char[]  getMaxAmt500String() {
	    return getCharArray(beginMaxAmt500,MAX_AMT_500_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean maxAmt500IsNumeric() {
		    return isNumeric(beginMaxAmt500
	                    ,beginMaxAmt500 + MAX_AMT_500_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int MAX_AMT_500_LEN = 12;
  protected  static final int MAX_AMT_500_SCALE = 2;

   protected BigDecimal checkMaxAmt500MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,12/*precision*/);
   }

  	/**
	 * serializeMaxAmt500
	 */
	protected void serializeMaxAmt500(BigDecimal maxAmt500) {
	       putNumber(beginMaxAmt500,maxAmt500,MAX_AMT_500_LEN,MAX_AMT_500_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMaxAmt500Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeMaxAmt500
	 */
   	protected  BigDecimal serializeMaxAmt500(char[] value) throws CFException {
        if (value.length < 12) value = pad(12, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginMaxAmt500
		       ,12
		      );		 localMaxAmt500Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,MAX_AMT_500_LEN,MAX_AMT_500_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("maxAmt500", beginMaxAmt500,MAX_AMT_500_LEN);
    	}
    }
    /**
	 *	refreshMaxAmt500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshMaxAmt500() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginMaxAmt500
			            ,MAX_AMT_500_LEN
			            ,MAX_AMT_500_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("maxAmt500", beginMaxAmt500,MAX_AMT_500_LEN);
    }
   	}




}
  
