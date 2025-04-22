package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip40004TransIdSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:20. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip40004TransIdSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip40004TransIdSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_40004_TRANS_ID_LENGTH = 25;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp40004TransType;
            protected  int beginIp40004TransRefDate;
            protected  int beginIp40004TransProcessorId;
            protected  int beginIp40004TransSeqNum;
	
	/**
	* Constructor for Ip40004TransIdSerialized
	**/
    public Ip40004TransIdSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip40004TransIdSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip40004TransIdSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip40004TransIdSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,29); // serialize this field at offset 29 by default 
    }
    
	/**
	* sets parent for this Ip40004TransIdSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 29 by default
    }    
	/**
	* initializes the field in Ip40004TransIdSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_40004_TRANS_ID_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp40004TransType = getStartOffset() + 0;	// set offset for serialization
  
             beginIp40004TransRefDate = getStartOffset() + 3;	// set offset for serialization
  
             beginIp40004TransProcessorId = getStartOffset() + 9;	// set offset for serialization
  
             beginIp40004TransSeqNum = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp40004TransTypeCounter = -1;
     public boolean isIp40004TransTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004TransTypeCounter != sharedCounter;
         localIp40004TransTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_40004_TRANS_TYPE_LEN = 3;
	/**
	 * 	serialize this Ip40004TransType
	 */
   protected void serializeIp40004TransType(char[] ip40004TransType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip40004TransType,0,getStringValue(),beginIp40004TransType,IP_40004_TRANS_TYPE_LEN);
       localIp40004TransTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp40004TransTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp40004TransType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp40004TransType() {	 
   		return (substring(getStringValue(),beginIp40004TransType,beginIp40004TransType + IP_40004_TRANS_TYPE_LEN));
   	}
     int localIp40004TransRefDateCounter = -1;
     public boolean isIp40004TransRefDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004TransRefDateCounter != sharedCounter;
         localIp40004TransRefDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip40004TransRefDate
	 *	@return ip40004TransRefDate
	 */
	public char[]  getIp40004TransRefDateString() {
	     return getCharArray(beginIp40004TransRefDate,IP_40004_TRANS_REF_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip40004TransRefDateIsNumeric() {
	    return isNumeric(beginIp40004TransRefDate
	                    ,beginIp40004TransRefDate + IP_40004_TRANS_REF_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_40004_TRANS_REF_DATE_LEN = 6;
  	/**
	 * serializeIp40004TransRefDate
	 */
	protected void serializeIp40004TransRefDate(long ip40004TransRefDate) {
		 putNumber(beginIp40004TransRefDate,ip40004TransRefDate,IP_40004_TRANS_REF_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp40004TransRefDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp40004TransRefDate
	 */
   	protected  long serializeIp40004TransRefDate(char[] value) {
	    long  ip40004TransRefDate;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip40004TransRefDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginIp40004TransRefDate
		       ,6
		      );
		 localIp40004TransRefDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip40004TransRefDate;
    }

   protected long checkIp40004TransRefDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp40004TransRefDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp40004TransRefDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp40004TransRefDate
			                 ,IP_40004_TRANS_REF_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip40004TransRefDate", beginIp40004TransRefDate,IP_40004_TRANS_REF_DATE_LEN);
    }
   	}
     int localIp40004TransProcessorIdCounter = -1;
     public boolean isIp40004TransProcessorIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004TransProcessorIdCounter != sharedCounter;
         localIp40004TransProcessorIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_40004_TRANS_PROCESSOR_ID_LEN = 11;
	/**
	 * 	serialize this Ip40004TransProcessorId
	 */
   protected void serializeIp40004TransProcessorId(char[] ip40004TransProcessorId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip40004TransProcessorId,0,getStringValue(),beginIp40004TransProcessorId,IP_40004_TRANS_PROCESSOR_ID_LEN);
       localIp40004TransProcessorIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp40004TransProcessorIdConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshIp40004TransProcessorId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp40004TransProcessorId() {	 
   		return (substring(getStringValue(),beginIp40004TransProcessorId,beginIp40004TransProcessorId + IP_40004_TRANS_PROCESSOR_ID_LEN));
   	}
     int localIp40004TransSeqNumCounter = -1;
     public boolean isIp40004TransSeqNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004TransSeqNumCounter != sharedCounter;
         localIp40004TransSeqNumCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip40004TransSeqNum
	 *	@return ip40004TransSeqNum
	 */
	public char[]  getIp40004TransSeqNumString() {
	     return getCharArray(beginIp40004TransSeqNum,IP_40004_TRANS_SEQ_NUM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip40004TransSeqNumIsNumeric() {
	    return isNumeric(beginIp40004TransSeqNum
	                    ,beginIp40004TransSeqNum + IP_40004_TRANS_SEQ_NUM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_40004_TRANS_SEQ_NUM_LEN = 5;
  	/**
	 * serializeIp40004TransSeqNum
	 */
	protected void serializeIp40004TransSeqNum(long ip40004TransSeqNum) {
		 putNumber(beginIp40004TransSeqNum,ip40004TransSeqNum,IP_40004_TRANS_SEQ_NUM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp40004TransSeqNumCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp40004TransSeqNum
	 */
   	protected  long serializeIp40004TransSeqNum(char[] value) {
	    long  ip40004TransSeqNum;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip40004TransSeqNum = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginIp40004TransSeqNum
		       ,5
		      );
		 localIp40004TransSeqNumCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip40004TransSeqNum;
    }

   protected long checkIp40004TransSeqNumMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp40004TransSeqNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp40004TransSeqNum() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp40004TransSeqNum
			                 ,IP_40004_TRANS_SEQ_NUM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip40004TransSeqNum", beginIp40004TransSeqNum,IP_40004_TRANS_SEQ_NUM_LEN);
    }
   	}




}
  
