package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class X360SrtKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class X360SrtKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(X360SrtKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int X_360_SRT_KEY_LENGTH = 94;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginX360SrtRegion;
            protected  int beginX360SrtSubRegion;
            protected  int beginX360SrtProcessorId;
            protected  int beginX360SrtInstId;
            protected  int beginX360SrtBinId;
            protected  int beginX360SrtCntryN;
            protected  int beginX360SrtCurrencyCode;
            protected  int beginX360SrtSscServId;
            protected  int beginX360SrtIca;
            protected  int beginX360SrtIsisAgreeNum;
            protected  int beginX360SrtAcqIssId;
            protected  int beginX360SrtKeyProduct;
            protected  int beginX360SrtKeySubProduct;
            protected  int beginX360SrtKeyTrans;
            protected  int beginX360SrtInterType;
            protected  int beginX360SrtReconDte;
            protected  int beginX360InhProcFlag;
	
	/**
	* Constructor for X360SrtKeySerialized
	**/
    public X360SrtKeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for X360SrtKeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360SrtKeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this X360SrtKeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1); // serialize this field at offset 1 by default 
    }
    
	/**
	* sets parent for this X360SrtKeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1 by default
    }    
	/**
	* initializes the field in X360SrtKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(X_360_SRT_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginX360SrtRegion = getStartOffset() + 0;	// set offset for serialization
  
             beginX360SrtSubRegion = getStartOffset() + 2;	// set offset for serialization
  
             beginX360SrtProcessorId = getStartOffset() + 3;	// set offset for serialization
  
             beginX360SrtInstId = getStartOffset() + 13;	// set offset for serialization
  
             beginX360SrtBinId = getStartOffset() + 23;	// set offset for serialization
  
             beginX360SrtCntryN = getStartOffset() + 34;	// set offset for serialization
  
             beginX360SrtCurrencyCode = getStartOffset() + 37;	// set offset for serialization
  
             beginX360SrtSscServId = getStartOffset() + 40;	// set offset for serialization
  
             beginX360SrtIca = getStartOffset() + 43;	// set offset for serialization
  
             beginX360SrtIsisAgreeNum = getStartOffset() + 49;	// set offset for serialization
  
             beginX360SrtAcqIssId = getStartOffset() + 53;	// set offset for serialization
  
             beginX360SrtKeyProduct = getStartOffset() + 54;	// set offset for serialization
  
             beginX360SrtKeySubProduct = getStartOffset() + 57;	// set offset for serialization
  
             beginX360SrtKeyTrans = getStartOffset() + 60;	// set offset for serialization
  
             beginX360SrtInterType = getStartOffset() + 63;	// set offset for serialization
  
             beginX360SrtReconDte = getStartOffset() + 64;	// set offset for serialization
  
             beginX360InhProcFlag = getStartOffset() + 70;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localX360SrtRegionCounter = -1;
     public boolean isX360SrtRegionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360SrtRegionCounter != sharedCounter;
         localX360SrtRegionCounter = sharedCounter; return hasModified;
     }
	protected static final int X_360_SRT_REGION_LEN = 2;
	/**
	 * 	serialize this X360SrtRegion
	 */
   protected void serializeX360SrtRegion(char[] x360SrtRegion) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360SrtRegion,0,getStringValue(),beginX360SrtRegion,X_360_SRT_REGION_LEN);
       localX360SrtRegionCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360SrtRegionConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshX360SrtRegion is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360SrtRegion() {	 
   		return (substring(getStringValue(),beginX360SrtRegion,beginX360SrtRegion + X_360_SRT_REGION_LEN));
   	}
     int localX360SrtSubRegionCounter = -1;
     public boolean isX360SrtSubRegionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360SrtSubRegionCounter != sharedCounter;
         localX360SrtSubRegionCounter = sharedCounter; return hasModified;
     }
	protected static final int X_360_SRT_SUB_REGION_LEN = 1;
	/**
	 * 	serialize this X360SrtSubRegion
	 */
   protected void serializeX360SrtSubRegion(char[] x360SrtSubRegion) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360SrtSubRegion,0,getStringValue(),beginX360SrtSubRegion,X_360_SRT_SUB_REGION_LEN);
       localX360SrtSubRegionCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360SrtSubRegionConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshX360SrtSubRegion is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360SrtSubRegion() {	 
   		return (substring(getStringValue(),beginX360SrtSubRegion,beginX360SrtSubRegion + X_360_SRT_SUB_REGION_LEN));
   	}
     int localX360SrtProcessorIdCounter = -1;
     public boolean isX360SrtProcessorIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360SrtProcessorIdCounter != sharedCounter;
         localX360SrtProcessorIdCounter = sharedCounter; return hasModified;
     }
	protected static final int X_360_SRT_PROCESSOR_ID_LEN = 10;
	/**
	 * 	serialize this X360SrtProcessorId
	 */
   protected void serializeX360SrtProcessorId(char[] x360SrtProcessorId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360SrtProcessorId,0,getStringValue(),beginX360SrtProcessorId,X_360_SRT_PROCESSOR_ID_LEN);
       localX360SrtProcessorIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360SrtProcessorIdConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshX360SrtProcessorId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360SrtProcessorId() {	 
   		return (substring(getStringValue(),beginX360SrtProcessorId,beginX360SrtProcessorId + X_360_SRT_PROCESSOR_ID_LEN));
   	}
     int localX360SrtInstIdCounter = -1;
     public boolean isX360SrtInstIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360SrtInstIdCounter != sharedCounter;
         localX360SrtInstIdCounter = sharedCounter; return hasModified;
     }
	protected static final int X_360_SRT_INST_ID_LEN = 10;
	/**
	 * 	serialize this X360SrtInstId
	 */
   protected void serializeX360SrtInstId(char[] x360SrtInstId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360SrtInstId,0,getStringValue(),beginX360SrtInstId,X_360_SRT_INST_ID_LEN);
       localX360SrtInstIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360SrtInstIdConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshX360SrtInstId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360SrtInstId() {	 
   		return (substring(getStringValue(),beginX360SrtInstId,beginX360SrtInstId + X_360_SRT_INST_ID_LEN));
   	}
     int localX360SrtBinIdCounter = -1;
     public boolean isX360SrtBinIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360SrtBinIdCounter != sharedCounter;
         localX360SrtBinIdCounter = sharedCounter; return hasModified;
     }
	protected static final int X_360_SRT_BIN_ID_LEN = 11;
	/**
	 * 	serialize this X360SrtBinId
	 */
   protected void serializeX360SrtBinId(char[] x360SrtBinId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360SrtBinId,0,getStringValue(),beginX360SrtBinId,X_360_SRT_BIN_ID_LEN);
       localX360SrtBinIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360SrtBinIdConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshX360SrtBinId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360SrtBinId() {	 
   		return (substring(getStringValue(),beginX360SrtBinId,beginX360SrtBinId + X_360_SRT_BIN_ID_LEN));
   	}
     int localX360SrtCntryNCounter = -1;
     public boolean isX360SrtCntryNModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360SrtCntryNCounter != sharedCounter;
         localX360SrtCntryNCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360SrtCntryN
	 *	@return x360SrtCntryN
	 */
	public char[]  getX360SrtCntryNString() {
	     return getCharArray(beginX360SrtCntryN,X_360_SRT_CNTRY_N_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360SrtCntryNIsNumeric() {
	    return isNumeric(beginX360SrtCntryN
	                    ,beginX360SrtCntryN + X_360_SRT_CNTRY_N_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_SRT_CNTRY_N_LEN = 3;
  	/**
	 * serializeX360SrtCntryN
	 */
	protected void serializeX360SrtCntryN(int x360SrtCntryN) {
		 putNumber(beginX360SrtCntryN,x360SrtCntryN,X_360_SRT_CNTRY_N_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360SrtCntryNCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360SrtCntryN
	 */
   	protected  int serializeX360SrtCntryN(char[] value) {
	    int  x360SrtCntryN;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360SrtCntryN = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginX360SrtCntryN
		       ,3
		      );
		 localX360SrtCntryNCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360SrtCntryN;
    }

   protected int checkX360SrtCntryNMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360SrtCntryN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360SrtCntryN() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginX360SrtCntryN
			                 ,X_360_SRT_CNTRY_N_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360SrtCntryN", beginX360SrtCntryN,X_360_SRT_CNTRY_N_LEN);
    }
   	}
     int localX360SrtCurrencyCodeCounter = -1;
     public boolean isX360SrtCurrencyCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360SrtCurrencyCodeCounter != sharedCounter;
         localX360SrtCurrencyCodeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360SrtCurrencyCode
	 *	@return x360SrtCurrencyCode
	 */
	public char[]  getX360SrtCurrencyCodeString() {
	     return getCharArray(beginX360SrtCurrencyCode,X_360_SRT_CURRENCY_CODE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360SrtCurrencyCodeIsNumeric() {
	    return isNumeric(beginX360SrtCurrencyCode
	                    ,beginX360SrtCurrencyCode + X_360_SRT_CURRENCY_CODE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_SRT_CURRENCY_CODE_LEN = 3;
  	/**
	 * serializeX360SrtCurrencyCode
	 */
	protected void serializeX360SrtCurrencyCode(int x360SrtCurrencyCode) {
		 putNumber(beginX360SrtCurrencyCode,x360SrtCurrencyCode,X_360_SRT_CURRENCY_CODE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360SrtCurrencyCodeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360SrtCurrencyCode
	 */
   	protected  int serializeX360SrtCurrencyCode(char[] value) {
	    int  x360SrtCurrencyCode;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360SrtCurrencyCode = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginX360SrtCurrencyCode
		       ,3
		      );
		 localX360SrtCurrencyCodeCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360SrtCurrencyCode;
    }

   protected int checkX360SrtCurrencyCodeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360SrtCurrencyCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360SrtCurrencyCode() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginX360SrtCurrencyCode
			                 ,X_360_SRT_CURRENCY_CODE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360SrtCurrencyCode", beginX360SrtCurrencyCode,X_360_SRT_CURRENCY_CODE_LEN);
    }
   	}
     int localX360SrtSscServIdCounter = -1;
     public boolean isX360SrtSscServIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360SrtSscServIdCounter != sharedCounter;
         localX360SrtSscServIdCounter = sharedCounter; return hasModified;
     }
	protected static final int X_360_SRT_SSC_SERV_ID_LEN = 3;
	/**
	 * 	serialize this X360SrtSscServId
	 */
   protected void serializeX360SrtSscServId(char[] x360SrtSscServId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360SrtSscServId,0,getStringValue(),beginX360SrtSscServId,X_360_SRT_SSC_SERV_ID_LEN);
       localX360SrtSscServIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360SrtSscServIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshX360SrtSscServId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360SrtSscServId() {	 
   		return (substring(getStringValue(),beginX360SrtSscServId,beginX360SrtSscServId + X_360_SRT_SSC_SERV_ID_LEN));
   	}
     int localX360SrtIcaCounter = -1;
     public boolean isX360SrtIcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360SrtIcaCounter != sharedCounter;
         localX360SrtIcaCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360SrtIca
	 *	@return x360SrtIca
	 */
	public char[]  getX360SrtIcaString() {
	     return getCharArray(beginX360SrtIca,X_360_SRT_ICA_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360SrtIcaIsNumeric() {
	    return isNumeric(beginX360SrtIca
	                    ,beginX360SrtIca + X_360_SRT_ICA_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_SRT_ICA_LEN = 6;
  	/**
	 * serializeX360SrtIca
	 */
	protected void serializeX360SrtIca(long x360SrtIca) {
		 putNumber(beginX360SrtIca,x360SrtIca,X_360_SRT_ICA_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360SrtIcaCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360SrtIca
	 */
   	protected  long serializeX360SrtIca(char[] value) {
	    long  x360SrtIca;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360SrtIca = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginX360SrtIca
		       ,6
		      );
		 localX360SrtIcaCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360SrtIca;
    }

   protected long checkX360SrtIcaMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360SrtIca is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360SrtIca() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginX360SrtIca
			                 ,X_360_SRT_ICA_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360SrtIca", beginX360SrtIca,X_360_SRT_ICA_LEN);
    }
   	}
     int localX360SrtIsisAgreeNumCounter = -1;
     public boolean isX360SrtIsisAgreeNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360SrtIsisAgreeNumCounter != sharedCounter;
         localX360SrtIsisAgreeNumCounter = sharedCounter; return hasModified;
     }
	protected static final int X_360_SRT_ISIS_AGREE_NUM_LEN = 4;
	/**
	 * 	serialize this X360SrtIsisAgreeNum
	 */
   protected void serializeX360SrtIsisAgreeNum(char[] x360SrtIsisAgreeNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360SrtIsisAgreeNum,0,getStringValue(),beginX360SrtIsisAgreeNum,X_360_SRT_ISIS_AGREE_NUM_LEN);
       localX360SrtIsisAgreeNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360SrtIsisAgreeNumConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshX360SrtIsisAgreeNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360SrtIsisAgreeNum() {	 
   		return (substring(getStringValue(),beginX360SrtIsisAgreeNum,beginX360SrtIsisAgreeNum + X_360_SRT_ISIS_AGREE_NUM_LEN));
   	}
     int localX360SrtAcqIssIdCounter = -1;
     public boolean isX360SrtAcqIssIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360SrtAcqIssIdCounter != sharedCounter;
         localX360SrtAcqIssIdCounter = sharedCounter; return hasModified;
     }
	protected static final int X_360_SRT_ACQ_ISS_ID_LEN = 1;
	/**
	 * 	serialize this X360SrtAcqIssId
	 */
   protected void serializeX360SrtAcqIssId(char[] x360SrtAcqIssId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360SrtAcqIssId,0,getStringValue(),beginX360SrtAcqIssId,X_360_SRT_ACQ_ISS_ID_LEN);
       localX360SrtAcqIssIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360SrtAcqIssIdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshX360SrtAcqIssId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360SrtAcqIssId() {	 
   		return (substring(getStringValue(),beginX360SrtAcqIssId,beginX360SrtAcqIssId + X_360_SRT_ACQ_ISS_ID_LEN));
   	}
     int localX360SrtKeyProductCounter = -1;
     public boolean isX360SrtKeyProductModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360SrtKeyProductCounter != sharedCounter;
         localX360SrtKeyProductCounter = sharedCounter; return hasModified;
     }
	protected static final int X_360_SRT_KEY_PRODUCT_LEN = 3;
	/**
	 * 	serialize this X360SrtKeyProduct
	 */
   protected void serializeX360SrtKeyProduct(char[] x360SrtKeyProduct) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360SrtKeyProduct,0,getStringValue(),beginX360SrtKeyProduct,X_360_SRT_KEY_PRODUCT_LEN);
       localX360SrtKeyProductCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360SrtKeyProductConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshX360SrtKeyProduct is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360SrtKeyProduct() {	 
   		return (substring(getStringValue(),beginX360SrtKeyProduct,beginX360SrtKeyProduct + X_360_SRT_KEY_PRODUCT_LEN));
   	}
     int localX360SrtKeySubProductCounter = -1;
     public boolean isX360SrtKeySubProductModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360SrtKeySubProductCounter != sharedCounter;
         localX360SrtKeySubProductCounter = sharedCounter; return hasModified;
     }
	protected static final int X_360_SRT_KEY_SUB_PRODUCT_LEN = 3;
	/**
	 * 	serialize this X360SrtKeySubProduct
	 */
   protected void serializeX360SrtKeySubProduct(char[] x360SrtKeySubProduct) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360SrtKeySubProduct,0,getStringValue(),beginX360SrtKeySubProduct,X_360_SRT_KEY_SUB_PRODUCT_LEN);
       localX360SrtKeySubProductCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360SrtKeySubProductConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshX360SrtKeySubProduct is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360SrtKeySubProduct() {	 
   		return (substring(getStringValue(),beginX360SrtKeySubProduct,beginX360SrtKeySubProduct + X_360_SRT_KEY_SUB_PRODUCT_LEN));
   	}
     int localX360SrtKeyTransCounter = -1;
     public boolean isX360SrtKeyTransModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360SrtKeyTransCounter != sharedCounter;
         localX360SrtKeyTransCounter = sharedCounter; return hasModified;
     }
	protected static final int X_360_SRT_KEY_TRANS_LEN = 3;
	/**
	 * 	serialize this X360SrtKeyTrans
	 */
   protected void serializeX360SrtKeyTrans(char[] x360SrtKeyTrans) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360SrtKeyTrans,0,getStringValue(),beginX360SrtKeyTrans,X_360_SRT_KEY_TRANS_LEN);
       localX360SrtKeyTransCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360SrtKeyTransConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshX360SrtKeyTrans is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360SrtKeyTrans() {	 
   		return (substring(getStringValue(),beginX360SrtKeyTrans,beginX360SrtKeyTrans + X_360_SRT_KEY_TRANS_LEN));
   	}
     int localX360SrtInterTypeCounter = -1;
     public boolean isX360SrtInterTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360SrtInterTypeCounter != sharedCounter;
         localX360SrtInterTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int X_360_SRT_INTER_TYPE_LEN = 1;
	/**
	 * 	serialize this X360SrtInterType
	 */
   protected void serializeX360SrtInterType(char[] x360SrtInterType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360SrtInterType,0,getStringValue(),beginX360SrtInterType,X_360_SRT_INTER_TYPE_LEN);
       localX360SrtInterTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360SrtInterTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshX360SrtInterType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360SrtInterType() {	 
   		return (substring(getStringValue(),beginX360SrtInterType,beginX360SrtInterType + X_360_SRT_INTER_TYPE_LEN));
   	}
     int localX360SrtReconDteCounter = -1;
     public boolean isX360SrtReconDteModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360SrtReconDteCounter != sharedCounter;
         localX360SrtReconDteCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360SrtReconDte
	 *	@return x360SrtReconDte
	 */
	public char[]  getX360SrtReconDteString() {
	     return getCharArray(beginX360SrtReconDte,X_360_SRT_RECON_DTE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360SrtReconDteIsNumeric() {
	    return isNumeric(beginX360SrtReconDte
	                    ,beginX360SrtReconDte + X_360_SRT_RECON_DTE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_SRT_RECON_DTE_LEN = 6;
  	/**
	 * serializeX360SrtReconDte
	 */
	protected void serializeX360SrtReconDte(long x360SrtReconDte) {
		 putNumber(beginX360SrtReconDte,x360SrtReconDte,X_360_SRT_RECON_DTE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360SrtReconDteCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360SrtReconDte
	 */
   	protected  long serializeX360SrtReconDte(char[] value) {
	    long  x360SrtReconDte;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360SrtReconDte = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginX360SrtReconDte
		       ,6
		      );
		 localX360SrtReconDteCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360SrtReconDte;
    }

   protected long checkX360SrtReconDteMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360SrtReconDte is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360SrtReconDte() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginX360SrtReconDte
			                 ,X_360_SRT_RECON_DTE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360SrtReconDte", beginX360SrtReconDte,X_360_SRT_RECON_DTE_LEN);
    }
   	}
     int localX360InhProcFlagCounter = -1;
     public boolean isX360InhProcFlagModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360InhProcFlagCounter != sharedCounter;
         localX360InhProcFlagCounter = sharedCounter; return hasModified;
     }
	protected static final int X_360_INH_PROC_FLAG_LEN = 1;
	/**
	 * 	serialize this X360InhProcFlag
	 */
   protected void serializeX360InhProcFlag(char[] x360InhProcFlag) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360InhProcFlag,0,getStringValue(),beginX360InhProcFlag,X_360_INH_PROC_FLAG_LEN);
       localX360InhProcFlagCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360InhProcFlagConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshX360InhProcFlag is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360InhProcFlag() {	 
   		return (substring(getStringValue(),beginX360InhProcFlag,beginX360InhProcFlag + X_360_INH_PROC_FLAG_LEN));
   	}




}
  
