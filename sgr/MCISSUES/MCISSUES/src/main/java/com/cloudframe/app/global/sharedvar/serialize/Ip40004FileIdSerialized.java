package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip40004FileIdSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip40004FileIdSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip40004FileIdSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_40004_FILE_ID_LENGTH = 25;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp40004FileType;
            protected  int beginIp40004FileRefDate;
            protected  int beginIp40004ProcessorId;
            protected  int beginIp40004FileSeqNum;
	
	/**
	* Constructor for Ip40004FileIdSerialized
	**/
    public Ip40004FileIdSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip40004FileIdSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip40004FileIdSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip40004FileIdSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4); // serialize this field at offset 4 by default 
    }
    
	/**
	* sets parent for this Ip40004FileIdSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4 by default
    }    
	/**
	* initializes the field in Ip40004FileIdSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_40004_FILE_ID_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp40004FileType = getStartOffset() + 0;	// set offset for serialization
  
             beginIp40004FileRefDate = getStartOffset() + 3;	// set offset for serialization
  
             beginIp40004ProcessorId = getStartOffset() + 9;	// set offset for serialization
  
             beginIp40004FileSeqNum = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp40004FileTypeCounter = -1;
     public boolean isIp40004FileTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004FileTypeCounter != sharedCounter;
         localIp40004FileTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_40004_FILE_TYPE_LEN = 3;
	/**
	 * 	serialize this Ip40004FileType
	 */
   protected void serializeIp40004FileType(char[] ip40004FileType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip40004FileType,0,getStringValue(),beginIp40004FileType,IP_40004_FILE_TYPE_LEN);
       localIp40004FileTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp40004FileTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp40004FileType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp40004FileType() {	 
   		return (substring(getStringValue(),beginIp40004FileType,beginIp40004FileType + IP_40004_FILE_TYPE_LEN));
   	}
     int localIp40004FileRefDateCounter = -1;
     public boolean isIp40004FileRefDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004FileRefDateCounter != sharedCounter;
         localIp40004FileRefDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip40004FileRefDate
	 *	@return ip40004FileRefDate
	 */
	public char[]  getIp40004FileRefDateString() {
	     return getCharArray(beginIp40004FileRefDate,IP_40004_FILE_REF_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip40004FileRefDateIsNumeric() {
	    return isNumeric(beginIp40004FileRefDate
	                    ,beginIp40004FileRefDate + IP_40004_FILE_REF_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_40004_FILE_REF_DATE_LEN = 6;
  	/**
	 * serializeIp40004FileRefDate
	 */
	protected void serializeIp40004FileRefDate(long ip40004FileRefDate) {
		 putNumber(beginIp40004FileRefDate,ip40004FileRefDate,IP_40004_FILE_REF_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp40004FileRefDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp40004FileRefDate
	 */
   	protected  long serializeIp40004FileRefDate(char[] value) {
	    long  ip40004FileRefDate;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip40004FileRefDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginIp40004FileRefDate
		       ,6
		      );
		 localIp40004FileRefDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip40004FileRefDate;
    }

   protected long checkIp40004FileRefDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp40004FileRefDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp40004FileRefDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp40004FileRefDate
			                 ,IP_40004_FILE_REF_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip40004FileRefDate", beginIp40004FileRefDate,IP_40004_FILE_REF_DATE_LEN);
    }
   	}
     int localIp40004ProcessorIdCounter = -1;
     public boolean isIp40004ProcessorIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004ProcessorIdCounter != sharedCounter;
         localIp40004ProcessorIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_40004_PROCESSOR_ID_LEN = 11;
	/**
	 * 	serialize this Ip40004ProcessorId
	 */
   protected void serializeIp40004ProcessorId(char[] ip40004ProcessorId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip40004ProcessorId,0,getStringValue(),beginIp40004ProcessorId,IP_40004_PROCESSOR_ID_LEN);
       localIp40004ProcessorIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp40004ProcessorIdConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshIp40004ProcessorId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp40004ProcessorId() {	 
   		return (substring(getStringValue(),beginIp40004ProcessorId,beginIp40004ProcessorId + IP_40004_PROCESSOR_ID_LEN));
   	}
     int localIp40004FileSeqNumCounter = -1;
     public boolean isIp40004FileSeqNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004FileSeqNumCounter != sharedCounter;
         localIp40004FileSeqNumCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip40004FileSeqNum
	 *	@return ip40004FileSeqNum
	 */
	public char[]  getIp40004FileSeqNumString() {
	     return getCharArray(beginIp40004FileSeqNum,IP_40004_FILE_SEQ_NUM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip40004FileSeqNumIsNumeric() {
	    return isNumeric(beginIp40004FileSeqNum
	                    ,beginIp40004FileSeqNum + IP_40004_FILE_SEQ_NUM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_40004_FILE_SEQ_NUM_LEN = 5;
  	/**
	 * serializeIp40004FileSeqNum
	 */
	protected void serializeIp40004FileSeqNum(long ip40004FileSeqNum) {
		 putNumber(beginIp40004FileSeqNum,ip40004FileSeqNum,IP_40004_FILE_SEQ_NUM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp40004FileSeqNumCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp40004FileSeqNum
	 */
   	protected  long serializeIp40004FileSeqNum(char[] value) {
	    long  ip40004FileSeqNum;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip40004FileSeqNum = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginIp40004FileSeqNum
		       ,5
		      );
		 localIp40004FileSeqNumCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip40004FileSeqNum;
    }

   protected long checkIp40004FileSeqNumMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp40004FileSeqNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp40004FileSeqNum() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp40004FileSeqNum
			                 ,IP_40004_FILE_SEQ_NUM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip40004FileSeqNum", beginIp40004FileSeqNum,IP_40004_FILE_SEQ_NUM_LEN);
    }
   	}




}
  
