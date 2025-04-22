package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class SavProductSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SavProductSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SavProductSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SAV_PRODUCT_LENGTH = 55;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSaveProcId;
            protected  int beginSaveInterType;
            protected  int beginSaveInstId;
            protected  int beginSaveBinId;
            protected  int beginSaveCntry;
            protected  int beginSaveCurrency;
            protected  int beginSaveExponent;
            protected  int beginSaveSettServId;
            protected  int beginSaveIca;
            protected  int beginSaveIsisAgreeNum;
            protected  int beginSaveProd;
	
	/**
	* Constructor for SavProductSerialized
	**/
    public SavProductSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SavProductSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SAV_PRODUCT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSaveProcId = getStartOffset() + 0;	// set offset for serialization
  
             beginSaveInterType = getStartOffset() + 10;	// set offset for serialization
  
             beginSaveInstId = getStartOffset() + 11;	// set offset for serialization
  
             beginSaveBinId = getStartOffset() + 21;	// set offset for serialization
  
             beginSaveCntry = getStartOffset() + 32;	// set offset for serialization
  
             beginSaveCurrency = getStartOffset() + 35;	// set offset for serialization
  
             beginSaveExponent = getStartOffset() + 38;	// set offset for serialization
  
             beginSaveSettServId = getStartOffset() + 39;	// set offset for serialization
  
             beginSaveIca = getStartOffset() + 42;	// set offset for serialization
  
             beginSaveIsisAgreeNum = getStartOffset() + 48;	// set offset for serialization
  
             beginSaveProd = getStartOffset() + 52;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSaveProcIdCounter = -1;
     public boolean isSaveProcIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSaveProcIdCounter != sharedCounter;
         localSaveProcIdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of saveProcId
	 *	@return saveProcId
	 */
	public char[]  getSaveProcIdString() {
	     return getCharArray(beginSaveProcId,SAVE_PROC_ID_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean saveProcIdIsNumeric() {
	    return isNumeric(beginSaveProcId
	                    ,beginSaveProcId + SAVE_PROC_ID_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SAVE_PROC_ID_LEN = 10;
  	/**
	 * serializeSaveProcId
	 */
	protected void serializeSaveProcId(long saveProcId) {
		 putNumber(beginSaveProcId,saveProcId,SAVE_PROC_ID_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSaveProcIdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSaveProcId
	 */
   	protected  long serializeSaveProcId(char[] value) {
	    long  saveProcId;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    saveProcId = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginSaveProcId
		       ,10
		      );
		 localSaveProcIdCounter = shareString.getSerializedField().getModifiedCounter();
		return  saveProcId;
    }

   protected long checkSaveProcIdMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSaveProcId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSaveProcId() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSaveProcId
			                 ,SAVE_PROC_ID_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("saveProcId", beginSaveProcId,SAVE_PROC_ID_LEN);
    }
   	}
     int localSaveInterTypeCounter = -1;
     public boolean isSaveInterTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSaveInterTypeCounter != sharedCounter;
         localSaveInterTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int SAVE_INTER_TYPE_LEN = 1;
	/**
	 * 	serialize this SaveInterType
	 */
   protected void serializeSaveInterType(char[] saveInterType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(saveInterType,0,getStringValue(),beginSaveInterType,SAVE_INTER_TYPE_LEN);
       localSaveInterTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSaveInterTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSaveInterType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSaveInterType() {	 
   		return (substring(getStringValue(),beginSaveInterType,beginSaveInterType + SAVE_INTER_TYPE_LEN));
   	}
     int localSaveInstIdCounter = -1;
     public boolean isSaveInstIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSaveInstIdCounter != sharedCounter;
         localSaveInstIdCounter = sharedCounter; return hasModified;
     }
	protected static final int SAVE_INST_ID_LEN = 10;
	/**
	 * 	serialize this SaveInstId
	 */
   protected void serializeSaveInstId(char[] saveInstId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(saveInstId,0,getStringValue(),beginSaveInstId,SAVE_INST_ID_LEN);
       localSaveInstIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSaveInstIdConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshSaveInstId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSaveInstId() {	 
   		return (substring(getStringValue(),beginSaveInstId,beginSaveInstId + SAVE_INST_ID_LEN));
   	}
     int localSaveBinIdCounter = -1;
     public boolean isSaveBinIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSaveBinIdCounter != sharedCounter;
         localSaveBinIdCounter = sharedCounter; return hasModified;
     }
	protected static final int SAVE_BIN_ID_LEN = 11;
	/**
	 * 	serialize this SaveBinId
	 */
   protected void serializeSaveBinId(char[] saveBinId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(saveBinId,0,getStringValue(),beginSaveBinId,SAVE_BIN_ID_LEN);
       localSaveBinIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSaveBinIdConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshSaveBinId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSaveBinId() {	 
   		return (substring(getStringValue(),beginSaveBinId,beginSaveBinId + SAVE_BIN_ID_LEN));
   	}
     int localSaveCntryCounter = -1;
     public boolean isSaveCntryModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSaveCntryCounter != sharedCounter;
         localSaveCntryCounter = sharedCounter; return hasModified;
     }
	protected static final int SAVE_CNTRY_LEN = 3;
	/**
	 * 	serialize this SaveCntry
	 */
   protected void serializeSaveCntry(char[] saveCntry) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(saveCntry,0,getStringValue(),beginSaveCntry,SAVE_CNTRY_LEN);
       localSaveCntryCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSaveCntryConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSaveCntry is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSaveCntry() {	 
   		return (substring(getStringValue(),beginSaveCntry,beginSaveCntry + SAVE_CNTRY_LEN));
   	}
     int localSaveCurrencyCounter = -1;
     public boolean isSaveCurrencyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSaveCurrencyCounter != sharedCounter;
         localSaveCurrencyCounter = sharedCounter; return hasModified;
     }
	protected static final int SAVE_CURRENCY_LEN = 3;
	/**
	 * 	serialize this SaveCurrency
	 */
   protected void serializeSaveCurrency(char[] saveCurrency) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(saveCurrency,0,getStringValue(),beginSaveCurrency,SAVE_CURRENCY_LEN);
       localSaveCurrencyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSaveCurrencyConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSaveCurrency is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSaveCurrency() {	 
   		return (substring(getStringValue(),beginSaveCurrency,beginSaveCurrency + SAVE_CURRENCY_LEN));
   	}
     int localSaveExponentCounter = -1;
     public boolean isSaveExponentModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSaveExponentCounter != sharedCounter;
         localSaveExponentCounter = sharedCounter; return hasModified;
     }
	protected static final int SAVE_EXPONENT_LEN = 1;
	/**
	 * 	serialize this SaveExponent
	 */
   protected void serializeSaveExponent(char[] saveExponent) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(saveExponent,0,getStringValue(),beginSaveExponent,SAVE_EXPONENT_LEN);
       localSaveExponentCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSaveExponentConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSaveExponent is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSaveExponent() {	 
   		return (substring(getStringValue(),beginSaveExponent,beginSaveExponent + SAVE_EXPONENT_LEN));
   	}
     int localSaveSettServIdCounter = -1;
     public boolean isSaveSettServIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSaveSettServIdCounter != sharedCounter;
         localSaveSettServIdCounter = sharedCounter; return hasModified;
     }
	protected static final int SAVE_SETT_SERV_ID_LEN = 3;
	/**
	 * 	serialize this SaveSettServId
	 */
   protected void serializeSaveSettServId(char[] saveSettServId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(saveSettServId,0,getStringValue(),beginSaveSettServId,SAVE_SETT_SERV_ID_LEN);
       localSaveSettServIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSaveSettServIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSaveSettServId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSaveSettServId() {	 
   		return (substring(getStringValue(),beginSaveSettServId,beginSaveSettServId + SAVE_SETT_SERV_ID_LEN));
   	}
     int localSaveIcaCounter = -1;
     public boolean isSaveIcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSaveIcaCounter != sharedCounter;
         localSaveIcaCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of saveIca
	 *	@return saveIca
	 */
	public char[]  getSaveIcaString() {
	     return getCharArray(beginSaveIca,SAVE_ICA_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean saveIcaIsNumeric() {
	    return isNumeric(beginSaveIca
	                    ,beginSaveIca + SAVE_ICA_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SAVE_ICA_LEN = 6;
  	/**
	 * serializeSaveIca
	 */
	protected void serializeSaveIca(long saveIca) {
		 putNumber(beginSaveIca,saveIca,SAVE_ICA_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSaveIcaCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSaveIca
	 */
   	protected  long serializeSaveIca(char[] value) {
	    long  saveIca;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    saveIca = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginSaveIca
		       ,6
		      );
		 localSaveIcaCounter = shareString.getSerializedField().getModifiedCounter();
		return  saveIca;
    }

   protected long checkSaveIcaMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSaveIca is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSaveIca() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSaveIca
			                 ,SAVE_ICA_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("saveIca", beginSaveIca,SAVE_ICA_LEN);
    }
   	}
     int localSaveIsisAgreeNumCounter = -1;
     public boolean isSaveIsisAgreeNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSaveIsisAgreeNumCounter != sharedCounter;
         localSaveIsisAgreeNumCounter = sharedCounter; return hasModified;
     }
	protected static final int SAVE_ISIS_AGREE_NUM_LEN = 4;
	/**
	 * 	serialize this SaveIsisAgreeNum
	 */
   protected void serializeSaveIsisAgreeNum(char[] saveIsisAgreeNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(saveIsisAgreeNum,0,getStringValue(),beginSaveIsisAgreeNum,SAVE_ISIS_AGREE_NUM_LEN);
       localSaveIsisAgreeNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSaveIsisAgreeNumConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshSaveIsisAgreeNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSaveIsisAgreeNum() {	 
   		return (substring(getStringValue(),beginSaveIsisAgreeNum,beginSaveIsisAgreeNum + SAVE_ISIS_AGREE_NUM_LEN));
   	}
     int localSaveProdCounter = -1;
     public boolean isSaveProdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSaveProdCounter != sharedCounter;
         localSaveProdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of saveProd
	 *	@return saveProd
	 */
	public char[]  getSaveProdString() {
	     return getCharArray(beginSaveProd,SAVE_PROD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean saveProdIsNumeric() {
	    return isNumeric(beginSaveProd
	                    ,beginSaveProd + SAVE_PROD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SAVE_PROD_LEN = 3;
  	/**
	 * serializeSaveProd
	 */
	protected void serializeSaveProd(int saveProd) {
		 putNumber(beginSaveProd,saveProd,SAVE_PROD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSaveProdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSaveProd
	 */
   	protected  int serializeSaveProd(char[] value) {
	    int  saveProd;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    saveProd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginSaveProd
		       ,3
		      );
		 localSaveProdCounter = shareString.getSerializedField().getModifiedCounter();
		return  saveProd;
    }

   protected int checkSaveProdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSaveProd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSaveProd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginSaveProd
			                 ,SAVE_PROD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("saveProd", beginSaveProd,SAVE_PROD_LEN);
    }
   	}




}
  
