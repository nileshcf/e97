package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class SavKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SavKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SavKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SAV_KEY_LENGTH = 52;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSavProcId;
            protected  int beginSavInterType;
            protected  int beginSavInstId;
            protected  int beginSavBinId;
            protected  int beginSavCntry;
            protected  int beginSavCurrency;
            protected  int beginSavExponent;
            protected  int beginSavSettServId;
            protected  int beginSavIca;
            protected  int beginSavIsisAgreeNum;
	
	/**
	* Constructor for SavKeySerialized
	**/
    public SavKeySerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SavKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SAV_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSavProcId = getStartOffset() + 0;	// set offset for serialization
  
             beginSavInterType = getStartOffset() + 10;	// set offset for serialization
  
             beginSavInstId = getStartOffset() + 11;	// set offset for serialization
  
             beginSavBinId = getStartOffset() + 21;	// set offset for serialization
  
             beginSavCntry = getStartOffset() + 32;	// set offset for serialization
  
             beginSavCurrency = getStartOffset() + 35;	// set offset for serialization
  
             beginSavExponent = getStartOffset() + 38;	// set offset for serialization
  
             beginSavSettServId = getStartOffset() + 39;	// set offset for serialization
  
             beginSavIca = getStartOffset() + 42;	// set offset for serialization
  
             beginSavIsisAgreeNum = getStartOffset() + 48;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSavProcIdCounter = -1;
     public boolean isSavProcIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSavProcIdCounter != sharedCounter;
         localSavProcIdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of savProcId
	 *	@return savProcId
	 */
	public char[]  getSavProcIdString() {
	     return getCharArray(beginSavProcId,SAV_PROC_ID_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean savProcIdIsNumeric() {
	    return isNumeric(beginSavProcId
	                    ,beginSavProcId + SAV_PROC_ID_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SAV_PROC_ID_LEN = 10;
  	/**
	 * serializeSavProcId
	 */
	protected void serializeSavProcId(long savProcId) {
		 putNumber(beginSavProcId,savProcId,SAV_PROC_ID_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSavProcIdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSavProcId
	 */
   	protected  long serializeSavProcId(char[] value) {
	    long  savProcId;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    savProcId = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginSavProcId
		       ,10
		      );
		 localSavProcIdCounter = shareString.getSerializedField().getModifiedCounter();
		return  savProcId;
    }

   protected long checkSavProcIdMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSavProcId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSavProcId() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSavProcId
			                 ,SAV_PROC_ID_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("savProcId", beginSavProcId,SAV_PROC_ID_LEN);
    }
   	}
     int localSavInterTypeCounter = -1;
     public boolean isSavInterTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSavInterTypeCounter != sharedCounter;
         localSavInterTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int SAV_INTER_TYPE_LEN = 1;
	/**
	 * 	serialize this SavInterType
	 */
   protected void serializeSavInterType(char[] savInterType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(savInterType,0,getStringValue(),beginSavInterType,SAV_INTER_TYPE_LEN);
       localSavInterTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSavInterTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSavInterType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSavInterType() {	 
   		return (substring(getStringValue(),beginSavInterType,beginSavInterType + SAV_INTER_TYPE_LEN));
   	}
     int localSavInstIdCounter = -1;
     public boolean isSavInstIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSavInstIdCounter != sharedCounter;
         localSavInstIdCounter = sharedCounter; return hasModified;
     }
	protected static final int SAV_INST_ID_LEN = 10;
	/**
	 * 	serialize this SavInstId
	 */
   protected void serializeSavInstId(char[] savInstId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(savInstId,0,getStringValue(),beginSavInstId,SAV_INST_ID_LEN);
       localSavInstIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSavInstIdConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshSavInstId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSavInstId() {	 
   		return (substring(getStringValue(),beginSavInstId,beginSavInstId + SAV_INST_ID_LEN));
   	}
     int localSavBinIdCounter = -1;
     public boolean isSavBinIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSavBinIdCounter != sharedCounter;
         localSavBinIdCounter = sharedCounter; return hasModified;
     }
	protected static final int SAV_BIN_ID_LEN = 11;
	/**
	 * 	serialize this SavBinId
	 */
   protected void serializeSavBinId(char[] savBinId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(savBinId,0,getStringValue(),beginSavBinId,SAV_BIN_ID_LEN);
       localSavBinIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSavBinIdConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshSavBinId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSavBinId() {	 
   		return (substring(getStringValue(),beginSavBinId,beginSavBinId + SAV_BIN_ID_LEN));
   	}
     int localSavCntryCounter = -1;
     public boolean isSavCntryModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSavCntryCounter != sharedCounter;
         localSavCntryCounter = sharedCounter; return hasModified;
     }
	protected static final int SAV_CNTRY_LEN = 3;
	/**
	 * 	serialize this SavCntry
	 */
   protected void serializeSavCntry(char[] savCntry) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(savCntry,0,getStringValue(),beginSavCntry,SAV_CNTRY_LEN);
       localSavCntryCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSavCntryConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSavCntry is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSavCntry() {	 
   		return (substring(getStringValue(),beginSavCntry,beginSavCntry + SAV_CNTRY_LEN));
   	}
     int localSavCurrencyCounter = -1;
     public boolean isSavCurrencyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSavCurrencyCounter != sharedCounter;
         localSavCurrencyCounter = sharedCounter; return hasModified;
     }
	protected static final int SAV_CURRENCY_LEN = 3;
	/**
	 * 	serialize this SavCurrency
	 */
   protected void serializeSavCurrency(char[] savCurrency) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(savCurrency,0,getStringValue(),beginSavCurrency,SAV_CURRENCY_LEN);
       localSavCurrencyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSavCurrencyConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSavCurrency is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSavCurrency() {	 
   		return (substring(getStringValue(),beginSavCurrency,beginSavCurrency + SAV_CURRENCY_LEN));
   	}
     int localSavExponentCounter = -1;
     public boolean isSavExponentModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSavExponentCounter != sharedCounter;
         localSavExponentCounter = sharedCounter; return hasModified;
     }
	protected static final int SAV_EXPONENT_LEN = 1;
	/**
	 * 	serialize this SavExponent
	 */
   protected void serializeSavExponent(char[] savExponent) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(savExponent,0,getStringValue(),beginSavExponent,SAV_EXPONENT_LEN);
       localSavExponentCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSavExponentConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSavExponent is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSavExponent() {	 
   		return (substring(getStringValue(),beginSavExponent,beginSavExponent + SAV_EXPONENT_LEN));
   	}
     int localSavSettServIdCounter = -1;
     public boolean isSavSettServIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSavSettServIdCounter != sharedCounter;
         localSavSettServIdCounter = sharedCounter; return hasModified;
     }
	protected static final int SAV_SETT_SERV_ID_LEN = 3;
	/**
	 * 	serialize this SavSettServId
	 */
   protected void serializeSavSettServId(char[] savSettServId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(savSettServId,0,getStringValue(),beginSavSettServId,SAV_SETT_SERV_ID_LEN);
       localSavSettServIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSavSettServIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSavSettServId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSavSettServId() {	 
   		return (substring(getStringValue(),beginSavSettServId,beginSavSettServId + SAV_SETT_SERV_ID_LEN));
   	}
     int localSavIcaCounter = -1;
     public boolean isSavIcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSavIcaCounter != sharedCounter;
         localSavIcaCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of savIca
	 *	@return savIca
	 */
	public char[]  getSavIcaString() {
	     return getCharArray(beginSavIca,SAV_ICA_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean savIcaIsNumeric() {
	    return isNumeric(beginSavIca
	                    ,beginSavIca + SAV_ICA_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SAV_ICA_LEN = 6;
  	/**
	 * serializeSavIca
	 */
	protected void serializeSavIca(long savIca) {
		 putNumber(beginSavIca,savIca,SAV_ICA_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSavIcaCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSavIca
	 */
   	protected  long serializeSavIca(char[] value) {
	    long  savIca;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    savIca = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginSavIca
		       ,6
		      );
		 localSavIcaCounter = shareString.getSerializedField().getModifiedCounter();
		return  savIca;
    }

   protected long checkSavIcaMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSavIca is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSavIca() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSavIca
			                 ,SAV_ICA_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("savIca", beginSavIca,SAV_ICA_LEN);
    }
   	}
     int localSavIsisAgreeNumCounter = -1;
     public boolean isSavIsisAgreeNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSavIsisAgreeNumCounter != sharedCounter;
         localSavIsisAgreeNumCounter = sharedCounter; return hasModified;
     }
	protected static final int SAV_ISIS_AGREE_NUM_LEN = 4;
	/**
	 * 	serialize this SavIsisAgreeNum
	 */
   protected void serializeSavIsisAgreeNum(char[] savIsisAgreeNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(savIsisAgreeNum,0,getStringValue(),beginSavIsisAgreeNum,SAV_ISIS_AGREE_NUM_LEN);
       localSavIsisAgreeNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSavIsisAgreeNumConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshSavIsisAgreeNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSavIsisAgreeNum() {	 
   		return (substring(getStringValue(),beginSavIsisAgreeNum,beginSavIsisAgreeNum + SAV_ISIS_AGREE_NUM_LEN));
   	}




}
  
