package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class CurProductSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CurProductSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CurProductSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CUR_PRODUCT_LENGTH = 55;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCurrProcId;
            protected  int beginCurrInterType;
            protected  int beginCurrInstId;
            protected  int beginCurrBinId;
            protected  int beginCurrCntry;
            protected  int beginCurrCurrency;
            protected  int beginCurrExponent;
            protected  int beginCurrSettServId;
            protected  int beginCurrIca;
            protected  int beginCurrIsisAgreeNum;
            protected  int beginCurrProd;
	
	/**
	* Constructor for CurProductSerialized
	**/
    public CurProductSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in CurProductSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CUR_PRODUCT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCurrProcId = getStartOffset() + 0;	// set offset for serialization
  
             beginCurrInterType = getStartOffset() + 10;	// set offset for serialization
  
             beginCurrInstId = getStartOffset() + 11;	// set offset for serialization
  
             beginCurrBinId = getStartOffset() + 21;	// set offset for serialization
  
             beginCurrCntry = getStartOffset() + 32;	// set offset for serialization
  
             beginCurrCurrency = getStartOffset() + 35;	// set offset for serialization
  
             beginCurrExponent = getStartOffset() + 38;	// set offset for serialization
  
             beginCurrSettServId = getStartOffset() + 39;	// set offset for serialization
  
             beginCurrIca = getStartOffset() + 42;	// set offset for serialization
  
             beginCurrIsisAgreeNum = getStartOffset() + 48;	// set offset for serialization
  
             beginCurrProd = getStartOffset() + 52;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCurrProcIdCounter = -1;
     public boolean isCurrProcIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrProcIdCounter != sharedCounter;
         localCurrProcIdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of currProcId
	 *	@return currProcId
	 */
	public char[]  getCurrProcIdString() {
	     return getCharArray(beginCurrProcId,CURR_PROC_ID_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean currProcIdIsNumeric() {
	    return isNumeric(beginCurrProcId
	                    ,beginCurrProcId + CURR_PROC_ID_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CURR_PROC_ID_LEN = 10;
  	/**
	 * serializeCurrProcId
	 */
	protected void serializeCurrProcId(long currProcId) {
		 putNumber(beginCurrProcId,currProcId,CURR_PROC_ID_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCurrProcIdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCurrProcId
	 */
   	protected  long serializeCurrProcId(char[] value) {
	    long  currProcId;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    currProcId = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginCurrProcId
		       ,10
		      );
		 localCurrProcIdCounter = shareString.getSerializedField().getModifiedCounter();
		return  currProcId;
    }

   protected long checkCurrProcIdMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCurrProcId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshCurrProcId() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginCurrProcId
			                 ,CURR_PROC_ID_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("currProcId", beginCurrProcId,CURR_PROC_ID_LEN);
    }
   	}
     int localCurrInterTypeCounter = -1;
     public boolean isCurrInterTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrInterTypeCounter != sharedCounter;
         localCurrInterTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int CURR_INTER_TYPE_LEN = 1;
	/**
	 * 	serialize this CurrInterType
	 */
   protected void serializeCurrInterType(char[] currInterType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currInterType,0,getStringValue(),beginCurrInterType,CURR_INTER_TYPE_LEN);
       localCurrInterTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrInterTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCurrInterType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrInterType() {	 
   		return (substring(getStringValue(),beginCurrInterType,beginCurrInterType + CURR_INTER_TYPE_LEN));
   	}
     int localCurrInstIdCounter = -1;
     public boolean isCurrInstIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrInstIdCounter != sharedCounter;
         localCurrInstIdCounter = sharedCounter; return hasModified;
     }
	protected static final int CURR_INST_ID_LEN = 10;
	/**
	 * 	serialize this CurrInstId
	 */
   protected void serializeCurrInstId(char[] currInstId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currInstId,0,getStringValue(),beginCurrInstId,CURR_INST_ID_LEN);
       localCurrInstIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrInstIdConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshCurrInstId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrInstId() {	 
   		return (substring(getStringValue(),beginCurrInstId,beginCurrInstId + CURR_INST_ID_LEN));
   	}
     int localCurrBinIdCounter = -1;
     public boolean isCurrBinIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrBinIdCounter != sharedCounter;
         localCurrBinIdCounter = sharedCounter; return hasModified;
     }
	protected static final int CURR_BIN_ID_LEN = 11;
	/**
	 * 	serialize this CurrBinId
	 */
   protected void serializeCurrBinId(char[] currBinId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currBinId,0,getStringValue(),beginCurrBinId,CURR_BIN_ID_LEN);
       localCurrBinIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrBinIdConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshCurrBinId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrBinId() {	 
   		return (substring(getStringValue(),beginCurrBinId,beginCurrBinId + CURR_BIN_ID_LEN));
   	}
     int localCurrCntryCounter = -1;
     public boolean isCurrCntryModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrCntryCounter != sharedCounter;
         localCurrCntryCounter = sharedCounter; return hasModified;
     }
	protected static final int CURR_CNTRY_LEN = 3;
	/**
	 * 	serialize this CurrCntry
	 */
   protected void serializeCurrCntry(char[] currCntry) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currCntry,0,getStringValue(),beginCurrCntry,CURR_CNTRY_LEN);
       localCurrCntryCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrCntryConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshCurrCntry is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrCntry() {	 
   		return (substring(getStringValue(),beginCurrCntry,beginCurrCntry + CURR_CNTRY_LEN));
   	}
     int localCurrCurrencyCounter = -1;
     public boolean isCurrCurrencyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrCurrencyCounter != sharedCounter;
         localCurrCurrencyCounter = sharedCounter; return hasModified;
     }
	protected static final int CURR_CURRENCY_LEN = 3;
	/**
	 * 	serialize this CurrCurrency
	 */
   protected void serializeCurrCurrency(char[] currCurrency) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currCurrency,0,getStringValue(),beginCurrCurrency,CURR_CURRENCY_LEN);
       localCurrCurrencyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrCurrencyConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshCurrCurrency is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrCurrency() {	 
   		return (substring(getStringValue(),beginCurrCurrency,beginCurrCurrency + CURR_CURRENCY_LEN));
   	}
     int localCurrExponentCounter = -1;
     public boolean isCurrExponentModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrExponentCounter != sharedCounter;
         localCurrExponentCounter = sharedCounter; return hasModified;
     }
	protected static final int CURR_EXPONENT_LEN = 1;
	/**
	 * 	serialize this CurrExponent
	 */
   protected void serializeCurrExponent(char[] currExponent) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currExponent,0,getStringValue(),beginCurrExponent,CURR_EXPONENT_LEN);
       localCurrExponentCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrExponentConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCurrExponent is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrExponent() {	 
   		return (substring(getStringValue(),beginCurrExponent,beginCurrExponent + CURR_EXPONENT_LEN));
   	}
     int localCurrSettServIdCounter = -1;
     public boolean isCurrSettServIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrSettServIdCounter != sharedCounter;
         localCurrSettServIdCounter = sharedCounter; return hasModified;
     }
	protected static final int CURR_SETT_SERV_ID_LEN = 3;
	/**
	 * 	serialize this CurrSettServId
	 */
   protected void serializeCurrSettServId(char[] currSettServId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currSettServId,0,getStringValue(),beginCurrSettServId,CURR_SETT_SERV_ID_LEN);
       localCurrSettServIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrSettServIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshCurrSettServId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrSettServId() {	 
   		return (substring(getStringValue(),beginCurrSettServId,beginCurrSettServId + CURR_SETT_SERV_ID_LEN));
   	}
     int localCurrIcaCounter = -1;
     public boolean isCurrIcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrIcaCounter != sharedCounter;
         localCurrIcaCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of currIca
	 *	@return currIca
	 */
	public char[]  getCurrIcaString() {
	     return getCharArray(beginCurrIca,CURR_ICA_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean currIcaIsNumeric() {
	    return isNumeric(beginCurrIca
	                    ,beginCurrIca + CURR_ICA_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CURR_ICA_LEN = 6;
  	/**
	 * serializeCurrIca
	 */
	protected void serializeCurrIca(long currIca) {
		 putNumber(beginCurrIca,currIca,CURR_ICA_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCurrIcaCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCurrIca
	 */
   	protected  long serializeCurrIca(char[] value) {
	    long  currIca;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    currIca = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginCurrIca
		       ,6
		      );
		 localCurrIcaCounter = shareString.getSerializedField().getModifiedCounter();
		return  currIca;
    }

   protected long checkCurrIcaMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCurrIca is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshCurrIca() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginCurrIca
			                 ,CURR_ICA_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("currIca", beginCurrIca,CURR_ICA_LEN);
    }
   	}
     int localCurrIsisAgreeNumCounter = -1;
     public boolean isCurrIsisAgreeNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrIsisAgreeNumCounter != sharedCounter;
         localCurrIsisAgreeNumCounter = sharedCounter; return hasModified;
     }
	protected static final int CURR_ISIS_AGREE_NUM_LEN = 4;
	/**
	 * 	serialize this CurrIsisAgreeNum
	 */
   protected void serializeCurrIsisAgreeNum(char[] currIsisAgreeNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currIsisAgreeNum,0,getStringValue(),beginCurrIsisAgreeNum,CURR_ISIS_AGREE_NUM_LEN);
       localCurrIsisAgreeNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrIsisAgreeNumConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshCurrIsisAgreeNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrIsisAgreeNum() {	 
   		return (substring(getStringValue(),beginCurrIsisAgreeNum,beginCurrIsisAgreeNum + CURR_ISIS_AGREE_NUM_LEN));
   	}
     int localCurrProdCounter = -1;
     public boolean isCurrProdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrProdCounter != sharedCounter;
         localCurrProdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of currProd
	 *	@return currProd
	 */
	public char[]  getCurrProdString() {
	     return getCharArray(beginCurrProd,CURR_PROD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean currProdIsNumeric() {
	    return isNumeric(beginCurrProd
	                    ,beginCurrProd + CURR_PROD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CURR_PROD_LEN = 3;
  	/**
	 * serializeCurrProd
	 */
	protected void serializeCurrProd(int currProd) {
		 putNumber(beginCurrProd,currProd,CURR_PROD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCurrProdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCurrProd
	 */
   	protected  int serializeCurrProd(char[] value) {
	    int  currProd;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    currProd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginCurrProd
		       ,3
		      );
		 localCurrProdCounter = shareString.getSerializedField().getModifiedCounter();
		return  currProd;
    }

   protected int checkCurrProdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCurrProd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCurrProd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCurrProd
			                 ,CURR_PROD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("currProd", beginCurrProd,CURR_PROD_LEN);
    }
   	}




}
  
