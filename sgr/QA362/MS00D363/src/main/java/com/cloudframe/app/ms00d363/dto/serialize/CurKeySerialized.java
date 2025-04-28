package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class CurKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CurKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CurKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CUR_KEY_LENGTH = 52;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCurProcId;
            protected  int beginCurInterType;
            protected  int beginCurInstId;
            protected  int beginCurBinId;
            protected  int beginCurCntry;
            protected  int beginCurCurrency;
            protected  int beginCurExponent;
            protected  int beginCurSettServId;
            protected  int beginCurIca;
            protected  int beginCurIsisAgreeNum;
	
	/**
	* Constructor for CurKeySerialized
	**/
    public CurKeySerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in CurKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CUR_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCurProcId = getStartOffset() + 0;	// set offset for serialization
  
             beginCurInterType = getStartOffset() + 10;	// set offset for serialization
  
             beginCurInstId = getStartOffset() + 11;	// set offset for serialization
  
             beginCurBinId = getStartOffset() + 21;	// set offset for serialization
  
             beginCurCntry = getStartOffset() + 32;	// set offset for serialization
  
             beginCurCurrency = getStartOffset() + 35;	// set offset for serialization
  
             beginCurExponent = getStartOffset() + 38;	// set offset for serialization
  
             beginCurSettServId = getStartOffset() + 39;	// set offset for serialization
  
             beginCurIca = getStartOffset() + 42;	// set offset for serialization
  
             beginCurIsisAgreeNum = getStartOffset() + 48;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCurProcIdCounter = -1;
     public boolean isCurProcIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurProcIdCounter != sharedCounter;
         localCurProcIdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of curProcId
	 *	@return curProcId
	 */
	public char[]  getCurProcIdString() {
	     return getCharArray(beginCurProcId,CUR_PROC_ID_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean curProcIdIsNumeric() {
	    return isNumeric(beginCurProcId
	                    ,beginCurProcId + CUR_PROC_ID_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CUR_PROC_ID_LEN = 10;
  	/**
	 * serializeCurProcId
	 */
	protected void serializeCurProcId(long curProcId) {
		 putNumber(beginCurProcId,curProcId,CUR_PROC_ID_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCurProcIdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCurProcId
	 */
   	protected  long serializeCurProcId(char[] value) {
	    long  curProcId;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    curProcId = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginCurProcId
		       ,10
		      );
		 localCurProcIdCounter = shareString.getSerializedField().getModifiedCounter();
		return  curProcId;
    }

   protected long checkCurProcIdMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCurProcId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshCurProcId() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginCurProcId
			                 ,CUR_PROC_ID_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("curProcId", beginCurProcId,CUR_PROC_ID_LEN);
    }
   	}
     int localCurInterTypeCounter = -1;
     public boolean isCurInterTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurInterTypeCounter != sharedCounter;
         localCurInterTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int CUR_INTER_TYPE_LEN = 1;
	/**
	 * 	serialize this CurInterType
	 */
   protected void serializeCurInterType(char[] curInterType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(curInterType,0,getStringValue(),beginCurInterType,CUR_INTER_TYPE_LEN);
       localCurInterTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurInterTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCurInterType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurInterType() {	 
   		return (substring(getStringValue(),beginCurInterType,beginCurInterType + CUR_INTER_TYPE_LEN));
   	}
     int localCurInstIdCounter = -1;
     public boolean isCurInstIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurInstIdCounter != sharedCounter;
         localCurInstIdCounter = sharedCounter; return hasModified;
     }
	protected static final int CUR_INST_ID_LEN = 10;
	/**
	 * 	serialize this CurInstId
	 */
   protected void serializeCurInstId(char[] curInstId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(curInstId,0,getStringValue(),beginCurInstId,CUR_INST_ID_LEN);
       localCurInstIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurInstIdConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshCurInstId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurInstId() {	 
   		return (substring(getStringValue(),beginCurInstId,beginCurInstId + CUR_INST_ID_LEN));
   	}
     int localCurBinIdCounter = -1;
     public boolean isCurBinIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurBinIdCounter != sharedCounter;
         localCurBinIdCounter = sharedCounter; return hasModified;
     }
	protected static final int CUR_BIN_ID_LEN = 11;
	/**
	 * 	serialize this CurBinId
	 */
   protected void serializeCurBinId(char[] curBinId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(curBinId,0,getStringValue(),beginCurBinId,CUR_BIN_ID_LEN);
       localCurBinIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurBinIdConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshCurBinId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurBinId() {	 
   		return (substring(getStringValue(),beginCurBinId,beginCurBinId + CUR_BIN_ID_LEN));
   	}
     int localCurCntryCounter = -1;
     public boolean isCurCntryModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurCntryCounter != sharedCounter;
         localCurCntryCounter = sharedCounter; return hasModified;
     }
	protected static final int CUR_CNTRY_LEN = 3;
	/**
	 * 	serialize this CurCntry
	 */
   protected void serializeCurCntry(char[] curCntry) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(curCntry,0,getStringValue(),beginCurCntry,CUR_CNTRY_LEN);
       localCurCntryCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurCntryConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshCurCntry is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurCntry() {	 
   		return (substring(getStringValue(),beginCurCntry,beginCurCntry + CUR_CNTRY_LEN));
   	}
     int localCurCurrencyCounter = -1;
     public boolean isCurCurrencyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurCurrencyCounter != sharedCounter;
         localCurCurrencyCounter = sharedCounter; return hasModified;
     }
	protected static final int CUR_CURRENCY_LEN = 3;
	/**
	 * 	serialize this CurCurrency
	 */
   protected void serializeCurCurrency(char[] curCurrency) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(curCurrency,0,getStringValue(),beginCurCurrency,CUR_CURRENCY_LEN);
       localCurCurrencyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurCurrencyConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshCurCurrency is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurCurrency() {	 
   		return (substring(getStringValue(),beginCurCurrency,beginCurCurrency + CUR_CURRENCY_LEN));
   	}
     int localCurExponentCounter = -1;
     public boolean isCurExponentModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurExponentCounter != sharedCounter;
         localCurExponentCounter = sharedCounter; return hasModified;
     }
	protected static final int CUR_EXPONENT_LEN = 1;
	/**
	 * 	serialize this CurExponent
	 */
   protected void serializeCurExponent(char[] curExponent) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(curExponent,0,getStringValue(),beginCurExponent,CUR_EXPONENT_LEN);
       localCurExponentCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurExponentConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCurExponent is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurExponent() {	 
   		return (substring(getStringValue(),beginCurExponent,beginCurExponent + CUR_EXPONENT_LEN));
   	}
     int localCurSettServIdCounter = -1;
     public boolean isCurSettServIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurSettServIdCounter != sharedCounter;
         localCurSettServIdCounter = sharedCounter; return hasModified;
     }
	protected static final int CUR_SETT_SERV_ID_LEN = 3;
	/**
	 * 	serialize this CurSettServId
	 */
   protected void serializeCurSettServId(char[] curSettServId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(curSettServId,0,getStringValue(),beginCurSettServId,CUR_SETT_SERV_ID_LEN);
       localCurSettServIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurSettServIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshCurSettServId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurSettServId() {	 
   		return (substring(getStringValue(),beginCurSettServId,beginCurSettServId + CUR_SETT_SERV_ID_LEN));
   	}
     int localCurIcaCounter = -1;
     public boolean isCurIcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurIcaCounter != sharedCounter;
         localCurIcaCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of curIca
	 *	@return curIca
	 */
	public char[]  getCurIcaString() {
	     return getCharArray(beginCurIca,CUR_ICA_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean curIcaIsNumeric() {
	    return isNumeric(beginCurIca
	                    ,beginCurIca + CUR_ICA_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CUR_ICA_LEN = 6;
  	/**
	 * serializeCurIca
	 */
	protected void serializeCurIca(long curIca) {
		 putNumber(beginCurIca,curIca,CUR_ICA_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCurIcaCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCurIca
	 */
   	protected  long serializeCurIca(char[] value) {
	    long  curIca;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    curIca = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginCurIca
		       ,6
		      );
		 localCurIcaCounter = shareString.getSerializedField().getModifiedCounter();
		return  curIca;
    }

   protected long checkCurIcaMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCurIca is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshCurIca() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginCurIca
			                 ,CUR_ICA_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("curIca", beginCurIca,CUR_ICA_LEN);
    }
   	}
     int localCurIsisAgreeNumCounter = -1;
     public boolean isCurIsisAgreeNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurIsisAgreeNumCounter != sharedCounter;
         localCurIsisAgreeNumCounter = sharedCounter; return hasModified;
     }
	protected static final int CUR_ISIS_AGREE_NUM_LEN = 4;
	/**
	 * 	serialize this CurIsisAgreeNum
	 */
   protected void serializeCurIsisAgreeNum(char[] curIsisAgreeNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(curIsisAgreeNum,0,getStringValue(),beginCurIsisAgreeNum,CUR_ISIS_AGREE_NUM_LEN);
       localCurIsisAgreeNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurIsisAgreeNumConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshCurIsisAgreeNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurIsisAgreeNum() {	 
   		return (substring(getStringValue(),beginCurIsisAgreeNum,beginCurIsisAgreeNum + CUR_ISIS_AGREE_NUM_LEN));
   	}




}
  
