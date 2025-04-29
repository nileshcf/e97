package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip40004FileIdFinanSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip40004FileIdFinanSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip40004FileIdFinanSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_40004_FILE_ID_FINAN_LENGTH = 25;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp40004FinFileType;
            protected  int beginIp40004FinFileRefDate;
            protected  int beginIp40004FinProcessorId;
            protected  int beginIp40004FinFileSeqNum;
	
	/**
	* Constructor for Ip40004FileIdFinanSerialized
	**/
    public Ip40004FileIdFinanSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip40004FileIdFinanSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip40004FileIdFinanSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip40004FileIdFinanSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,60); // serialize this field at offset 60 by default 
    }
    
	/**
	* sets parent for this Ip40004FileIdFinanSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 60 by default
    }    
	/**
	* initializes the field in Ip40004FileIdFinanSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_40004_FILE_ID_FINAN_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp40004FinFileType = getStartOffset() + 0;	// set offset for serialization
  
             beginIp40004FinFileRefDate = getStartOffset() + 3;	// set offset for serialization
  
             beginIp40004FinProcessorId = getStartOffset() + 9;	// set offset for serialization
  
             beginIp40004FinFileSeqNum = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp40004FinFileTypeCounter = -1;
     public boolean isIp40004FinFileTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004FinFileTypeCounter != sharedCounter;
         localIp40004FinFileTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_40004_FIN_FILE_TYPE_LEN = 3;
	/**
	 * 	serialize this Ip40004FinFileType
	 */
   protected void serializeIp40004FinFileType(char[] ip40004FinFileType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip40004FinFileType,0,getStringValue(),beginIp40004FinFileType,IP_40004_FIN_FILE_TYPE_LEN);
       localIp40004FinFileTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp40004FinFileTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp40004FinFileType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp40004FinFileType() {	 
   		return (substring(getStringValue(),beginIp40004FinFileType,beginIp40004FinFileType + IP_40004_FIN_FILE_TYPE_LEN));
   	}
     int localIp40004FinFileRefDateCounter = -1;
     public boolean isIp40004FinFileRefDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004FinFileRefDateCounter != sharedCounter;
         localIp40004FinFileRefDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip40004FinFileRefDate
	 *	@return ip40004FinFileRefDate
	 */
	public char[]  getIp40004FinFileRefDateString() {
	     return getCharArray(beginIp40004FinFileRefDate,IP_40004_FIN_FILE_REF_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip40004FinFileRefDateIsNumeric() {
	    return isNumeric(beginIp40004FinFileRefDate
	                    ,beginIp40004FinFileRefDate + IP_40004_FIN_FILE_REF_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_40004_FIN_FILE_REF_DATE_LEN = 6;
  	/**
	 * serializeIp40004FinFileRefDate
	 */
	protected void serializeIp40004FinFileRefDate(long ip40004FinFileRefDate) {
		 putNumber(beginIp40004FinFileRefDate,ip40004FinFileRefDate,IP_40004_FIN_FILE_REF_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp40004FinFileRefDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp40004FinFileRefDate
	 */
   	protected  long serializeIp40004FinFileRefDate(char[] value) {
	    long  ip40004FinFileRefDate;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip40004FinFileRefDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginIp40004FinFileRefDate
		       ,6
		      );
		 localIp40004FinFileRefDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip40004FinFileRefDate;
    }

   protected long checkIp40004FinFileRefDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp40004FinFileRefDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp40004FinFileRefDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp40004FinFileRefDate
			                 ,IP_40004_FIN_FILE_REF_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip40004FinFileRefDate", beginIp40004FinFileRefDate,IP_40004_FIN_FILE_REF_DATE_LEN);
    }
   	}
     int localIp40004FinProcessorIdCounter = -1;
     public boolean isIp40004FinProcessorIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004FinProcessorIdCounter != sharedCounter;
         localIp40004FinProcessorIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_40004_FIN_PROCESSOR_ID_LEN = 11;
	/**
	 * 	serialize this Ip40004FinProcessorId
	 */
   protected void serializeIp40004FinProcessorId(char[] ip40004FinProcessorId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip40004FinProcessorId,0,getStringValue(),beginIp40004FinProcessorId,IP_40004_FIN_PROCESSOR_ID_LEN);
       localIp40004FinProcessorIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp40004FinProcessorIdConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshIp40004FinProcessorId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp40004FinProcessorId() {	 
   		return (substring(getStringValue(),beginIp40004FinProcessorId,beginIp40004FinProcessorId + IP_40004_FIN_PROCESSOR_ID_LEN));
   	}
     int localIp40004FinFileSeqNumCounter = -1;
     public boolean isIp40004FinFileSeqNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004FinFileSeqNumCounter != sharedCounter;
         localIp40004FinFileSeqNumCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip40004FinFileSeqNum
	 *	@return ip40004FinFileSeqNum
	 */
	public char[]  getIp40004FinFileSeqNumString() {
	     return getCharArray(beginIp40004FinFileSeqNum,IP_40004_FIN_FILE_SEQ_NUM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip40004FinFileSeqNumIsNumeric() {
	    return isNumeric(beginIp40004FinFileSeqNum
	                    ,beginIp40004FinFileSeqNum + IP_40004_FIN_FILE_SEQ_NUM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_40004_FIN_FILE_SEQ_NUM_LEN = 5;
  	/**
	 * serializeIp40004FinFileSeqNum
	 */
	protected void serializeIp40004FinFileSeqNum(long ip40004FinFileSeqNum) {
		 putNumber(beginIp40004FinFileSeqNum,ip40004FinFileSeqNum,IP_40004_FIN_FILE_SEQ_NUM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp40004FinFileSeqNumCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp40004FinFileSeqNum
	 */
   	protected  long serializeIp40004FinFileSeqNum(char[] value) {
	    long  ip40004FinFileSeqNum;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip40004FinFileSeqNum = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginIp40004FinFileSeqNum
		       ,5
		      );
		 localIp40004FinFileSeqNumCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip40004FinFileSeqNum;
    }

   protected long checkIp40004FinFileSeqNumMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp40004FinFileSeqNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp40004FinFileSeqNum() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp40004FinFileSeqNum
			                 ,IP_40004_FIN_FILE_SEQ_NUM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip40004FinFileSeqNum", beginIp40004FinFileSeqNum,IP_40004_FIN_FILE_SEQ_NUM_LEN);
    }
   	}




}
  
