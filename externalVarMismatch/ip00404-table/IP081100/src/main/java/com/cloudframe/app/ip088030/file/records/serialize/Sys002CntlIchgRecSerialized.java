package com.cloudframe.app.ip088030.file.records.serialize;

/**
*  The class Sys002CntlIchgRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Sys002CntlIchgRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys002CntlIchgRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_002_CNTL_ICHG_REC_LENGTH = 85;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp98153RecType;
            protected  int beginIp98153TxnLowAmt;
            protected  int beginIp98153TxnLowAmtU;
            protected  int beginIp98153TxnHighAmt;
            protected  int beginIp98153TxnHighAmtU;
	
	/**
	* Constructor for Sys002CntlIchgRecSerialized
	**/
    public Sys002CntlIchgRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys002CntlIchgRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_002_CNTL_ICHG_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp98153RecType = getStartOffset() + 0;	// set offset for serialization
  
             beginIp98153TxnLowAmt = getStartOffset() + 1;	// set offset for serialization
  
             beginIp98153TxnLowAmtU = getStartOffset() + 1;	// set offset for serialization
  
             beginIp98153TxnHighAmt = getStartOffset() + 13;	// set offset for serialization
  
             beginIp98153TxnHighAmtU = getStartOffset() + 13;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp98153RecTypeCounter = -1;
     public boolean isIp98153RecTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp98153RecTypeCounter != sharedCounter;
         localIp98153RecTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_98153_REC_TYPE_LEN = 1;
	/**
	 * 	serialize this Ip98153RecType
	 */
   protected void serializeIp98153RecType(char[] ip98153RecType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip98153RecType,0,getStringValue(),beginIp98153RecType,IP_98153_REC_TYPE_LEN);
       localIp98153RecTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp98153RecTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp98153RecType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp98153RecType() {	 
   		return (substring(getStringValue(),beginIp98153RecType,beginIp98153RecType + IP_98153_REC_TYPE_LEN));
   	}
     int localIp98153TxnLowAmtCounter = -1;
     
     public boolean isIp98153TxnLowAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp98153TxnLowAmtCounter != sharedCounter;
         localIp98153TxnLowAmtCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of ip98153TxnLowAmt
	 *	@return ip98153TxnLowAmt
	 */
	public char[]  getIp98153TxnLowAmtString() {
	    return getCharArray(beginIp98153TxnLowAmt,IP_98153_TXN_LOW_AMT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip98153TxnLowAmtIsNumeric() {
		    return isNumeric(beginIp98153TxnLowAmt
	                    ,beginIp98153TxnLowAmt + IP_98153_TXN_LOW_AMT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int IP_98153_TXN_LOW_AMT_LEN = 12;
  protected  static final int IP_98153_TXN_LOW_AMT_SCALE = 2;

   protected BigDecimal checkIp98153TxnLowAmtMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,12/*precision*/);
   }

  	/**
	 * serializeIp98153TxnLowAmt
	 */
	protected void serializeIp98153TxnLowAmt(BigDecimal ip98153TxnLowAmt) {
	       putNumber(beginIp98153TxnLowAmt,ip98153TxnLowAmt,IP_98153_TXN_LOW_AMT_LEN,IP_98153_TXN_LOW_AMT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp98153TxnLowAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeIp98153TxnLowAmt
	 */
   	protected  BigDecimal serializeIp98153TxnLowAmt(char[] value) throws CFException {
        if (value.length < 12) value = pad(12, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginIp98153TxnLowAmt
		       ,12
		      );		 localIp98153TxnLowAmtCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,IP_98153_TXN_LOW_AMT_LEN,IP_98153_TXN_LOW_AMT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("ip98153TxnLowAmt", beginIp98153TxnLowAmt,IP_98153_TXN_LOW_AMT_LEN);
    	}
    }
    /**
	 *	refreshIp98153TxnLowAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshIp98153TxnLowAmt() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginIp98153TxnLowAmt
			            ,IP_98153_TXN_LOW_AMT_LEN
			            ,IP_98153_TXN_LOW_AMT_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("ip98153TxnLowAmt", beginIp98153TxnLowAmt,IP_98153_TXN_LOW_AMT_LEN);
    }
   	}
     int localIp98153TxnLowAmtUCounter = -1;
     public boolean isIp98153TxnLowAmtUModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp98153TxnLowAmtUCounter != sharedCounter;
         localIp98153TxnLowAmtUCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip98153TxnLowAmtU
	 *	@return ip98153TxnLowAmtU
	 */
	public char[]  getIp98153TxnLowAmtUString() {
	     return getCharArray(beginIp98153TxnLowAmtU,IP_98153_TXN_LOW_AMT_U_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip98153TxnLowAmtUIsNumeric() {
	    return isNumeric(beginIp98153TxnLowAmtU
	                    ,beginIp98153TxnLowAmtU + IP_98153_TXN_LOW_AMT_U_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_98153_TXN_LOW_AMT_U_LEN = 12;
  	/**
	 * serializeIp98153TxnLowAmtU
	 */
	protected void serializeIp98153TxnLowAmtU(long ip98153TxnLowAmtU) {
		 putNumber(beginIp98153TxnLowAmtU,ip98153TxnLowAmtU,IP_98153_TXN_LOW_AMT_U_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp98153TxnLowAmtUCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp98153TxnLowAmtU
	 */
   	protected  long serializeIp98153TxnLowAmtU(char[] value) {
	    long  ip98153TxnLowAmtU;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip98153TxnLowAmtU = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginIp98153TxnLowAmtU
		       ,12
		      );
		 localIp98153TxnLowAmtUCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip98153TxnLowAmtU;
    }

   protected long checkIp98153TxnLowAmtUMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp98153TxnLowAmtU is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp98153TxnLowAmtU() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp98153TxnLowAmtU
			                 ,IP_98153_TXN_LOW_AMT_U_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip98153TxnLowAmtU", beginIp98153TxnLowAmtU,IP_98153_TXN_LOW_AMT_U_LEN);
    }
   	}
     int localIp98153TxnHighAmtCounter = -1;
     
     public boolean isIp98153TxnHighAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp98153TxnHighAmtCounter != sharedCounter;
         localIp98153TxnHighAmtCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of ip98153TxnHighAmt
	 *	@return ip98153TxnHighAmt
	 */
	public char[]  getIp98153TxnHighAmtString() {
	    return getCharArray(beginIp98153TxnHighAmt,IP_98153_TXN_HIGH_AMT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip98153TxnHighAmtIsNumeric() {
		    return isNumeric(beginIp98153TxnHighAmt
	                    ,beginIp98153TxnHighAmt + IP_98153_TXN_HIGH_AMT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int IP_98153_TXN_HIGH_AMT_LEN = 12;
  protected  static final int IP_98153_TXN_HIGH_AMT_SCALE = 2;

   protected BigDecimal checkIp98153TxnHighAmtMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,12/*precision*/);
   }

  	/**
	 * serializeIp98153TxnHighAmt
	 */
	protected void serializeIp98153TxnHighAmt(BigDecimal ip98153TxnHighAmt) {
	       putNumber(beginIp98153TxnHighAmt,ip98153TxnHighAmt,IP_98153_TXN_HIGH_AMT_LEN,IP_98153_TXN_HIGH_AMT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp98153TxnHighAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeIp98153TxnHighAmt
	 */
   	protected  BigDecimal serializeIp98153TxnHighAmt(char[] value) throws CFException {
        if (value.length < 12) value = pad(12, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginIp98153TxnHighAmt
		       ,12
		      );		 localIp98153TxnHighAmtCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,IP_98153_TXN_HIGH_AMT_LEN,IP_98153_TXN_HIGH_AMT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("ip98153TxnHighAmt", beginIp98153TxnHighAmt,IP_98153_TXN_HIGH_AMT_LEN);
    	}
    }
    /**
	 *	refreshIp98153TxnHighAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshIp98153TxnHighAmt() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginIp98153TxnHighAmt
			            ,IP_98153_TXN_HIGH_AMT_LEN
			            ,IP_98153_TXN_HIGH_AMT_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("ip98153TxnHighAmt", beginIp98153TxnHighAmt,IP_98153_TXN_HIGH_AMT_LEN);
    }
   	}
     int localIp98153TxnHighAmtUCounter = -1;
     public boolean isIp98153TxnHighAmtUModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp98153TxnHighAmtUCounter != sharedCounter;
         localIp98153TxnHighAmtUCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip98153TxnHighAmtU
	 *	@return ip98153TxnHighAmtU
	 */
	public char[]  getIp98153TxnHighAmtUString() {
	     return getCharArray(beginIp98153TxnHighAmtU,IP_98153_TXN_HIGH_AMT_U_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip98153TxnHighAmtUIsNumeric() {
	    return isNumeric(beginIp98153TxnHighAmtU
	                    ,beginIp98153TxnHighAmtU + IP_98153_TXN_HIGH_AMT_U_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_98153_TXN_HIGH_AMT_U_LEN = 12;
  	/**
	 * serializeIp98153TxnHighAmtU
	 */
	protected void serializeIp98153TxnHighAmtU(long ip98153TxnHighAmtU) {
		 putNumber(beginIp98153TxnHighAmtU,ip98153TxnHighAmtU,IP_98153_TXN_HIGH_AMT_U_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp98153TxnHighAmtUCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp98153TxnHighAmtU
	 */
   	protected  long serializeIp98153TxnHighAmtU(char[] value) {
	    long  ip98153TxnHighAmtU;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip98153TxnHighAmtU = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginIp98153TxnHighAmtU
		       ,12
		      );
		 localIp98153TxnHighAmtUCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip98153TxnHighAmtU;
    }

   protected long checkIp98153TxnHighAmtUMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp98153TxnHighAmtU is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp98153TxnHighAmtU() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp98153TxnHighAmtU
			                 ,IP_98153_TXN_HIGH_AMT_U_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip98153TxnHighAmtU", beginIp98153TxnHighAmtU,IP_98153_TXN_HIGH_AMT_U_LEN);
    }
   	}




}
  
