package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip69931OutputFieldsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip69931OutputFieldsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip69931OutputFieldsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_69931_OUTPUT_FIELDS_LENGTH = 124;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp69931DatabaseId;
            protected  int beginIp69931CollectionId;
            protected  int beginIp69931WherePaProcessedSw;
            protected  int beginIp69931ResponseStatus;
            protected  int beginIp69931ErrorMsg;
	
	/**
	* Constructor for Ip69931OutputFieldsSerialized
	**/
    public Ip69931OutputFieldsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip69931OutputFieldsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip69931OutputFieldsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip69931OutputFieldsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,14); // serialize this field at offset 14 by default 
    }
    
	/**
	* sets parent for this Ip69931OutputFieldsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 14 by default
    }    
	/**
	* initializes the field in Ip69931OutputFieldsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_69931_OUTPUT_FIELDS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp69931DatabaseId = getStartOffset() + 0;	// set offset for serialization
  
             beginIp69931CollectionId = getStartOffset() + 18;	// set offset for serialization
  
             beginIp69931WherePaProcessedSw = getStartOffset() + 36;	// set offset for serialization
  
             beginIp69931ResponseStatus = getStartOffset() + 40;	// set offset for serialization
  
             beginIp69931ErrorMsg = getStartOffset() + 44;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp69931DatabaseIdCounter = -1;
     public boolean isIp69931DatabaseIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp69931DatabaseIdCounter != sharedCounter;
         localIp69931DatabaseIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_69931_DATABASE_ID_LEN = 18;
	/**
	 * 	serialize this Ip69931DatabaseId
	 */
   protected void serializeIp69931DatabaseId(char[] ip69931DatabaseId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip69931DatabaseId,0,getStringValue(),beginIp69931DatabaseId,IP_69931_DATABASE_ID_LEN);
       localIp69931DatabaseIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp69931DatabaseIdConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshIp69931DatabaseId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp69931DatabaseId() {	 
   		return (substring(getStringValue(),beginIp69931DatabaseId,beginIp69931DatabaseId + IP_69931_DATABASE_ID_LEN));
   	}
     int localIp69931CollectionIdCounter = -1;
     public boolean isIp69931CollectionIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp69931CollectionIdCounter != sharedCounter;
         localIp69931CollectionIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_69931_COLLECTION_ID_LEN = 18;
	/**
	 * 	serialize this Ip69931CollectionId
	 */
   protected void serializeIp69931CollectionId(char[] ip69931CollectionId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip69931CollectionId,0,getStringValue(),beginIp69931CollectionId,IP_69931_COLLECTION_ID_LEN);
       localIp69931CollectionIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp69931CollectionIdConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshIp69931CollectionId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp69931CollectionId() {	 
   		return (substring(getStringValue(),beginIp69931CollectionId,beginIp69931CollectionId + IP_69931_COLLECTION_ID_LEN));
   	}
     int localIp69931WherePaProcessedSwCounter = -1;
     public boolean isIp69931WherePaProcessedSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp69931WherePaProcessedSwCounter != sharedCounter;
         localIp69931WherePaProcessedSwCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip69931WherePaProcessedSw
	 *	@return ip69931WherePaProcessedSw
	 */
	public char[]  getIp69931WherePaProcessedSwString() {
	     return getCharArray(beginIp69931WherePaProcessedSw,IP_69931_WHERE_PA_PROCESSED_SW_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip69931WherePaProcessedSwIsNumeric() {
	    return isNumeric(beginIp69931WherePaProcessedSw
	                    ,beginIp69931WherePaProcessedSw + IP_69931_WHERE_PA_PROCESSED_SW_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_69931_WHERE_PA_PROCESSED_SW_LEN = 4;
  	/**
	 * serializeIp69931WherePaProcessedSw
	 */
	protected void serializeIp69931WherePaProcessedSw(short ip69931WherePaProcessedSw) {
		 putNumber(beginIp69931WherePaProcessedSw,ip69931WherePaProcessedSw,IP_69931_WHERE_PA_PROCESSED_SW_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp69931WherePaProcessedSwCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp69931WherePaProcessedSw
	 */
   	protected  short serializeIp69931WherePaProcessedSw(char[] value) {
	    short  ip69931WherePaProcessedSw;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip69931WherePaProcessedSw = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,true/*isSigned?*/)
		       ,beginIp69931WherePaProcessedSw
		       ,4
		      );
		 localIp69931WherePaProcessedSwCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip69931WherePaProcessedSw;
    }

   protected short checkIp69931WherePaProcessedSwMaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_10K/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshIp69931WherePaProcessedSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp69931WherePaProcessedSw() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginIp69931WherePaProcessedSw
			                 ,IP_69931_WHERE_PA_PROCESSED_SW_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip69931WherePaProcessedSw", beginIp69931WherePaProcessedSw,IP_69931_WHERE_PA_PROCESSED_SW_LEN);
    }
   	}
     int localIp69931ResponseStatusCounter = -1;
     public boolean isIp69931ResponseStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp69931ResponseStatusCounter != sharedCounter;
         localIp69931ResponseStatusCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip69931ResponseStatus
	 *	@return ip69931ResponseStatus
	 */
	public char[]  getIp69931ResponseStatusString() {
	     return getCharArray(beginIp69931ResponseStatus,IP_69931_RESPONSE_STATUS_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip69931ResponseStatusIsNumeric() {
	    return isNumeric(beginIp69931ResponseStatus
	                    ,beginIp69931ResponseStatus + IP_69931_RESPONSE_STATUS_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_69931_RESPONSE_STATUS_LEN = 4;
  	/**
	 * serializeIp69931ResponseStatus
	 */
	protected void serializeIp69931ResponseStatus(short ip69931ResponseStatus) {
		 putNumber(beginIp69931ResponseStatus,ip69931ResponseStatus,IP_69931_RESPONSE_STATUS_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp69931ResponseStatusCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp69931ResponseStatus
	 */
   	protected  short serializeIp69931ResponseStatus(char[] value) {
	    short  ip69931ResponseStatus;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip69931ResponseStatus = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,true/*isSigned?*/)
		       ,beginIp69931ResponseStatus
		       ,4
		      );
		 localIp69931ResponseStatusCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip69931ResponseStatus;
    }

   protected short checkIp69931ResponseStatusMaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_10K/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshIp69931ResponseStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp69931ResponseStatus() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginIp69931ResponseStatus
			                 ,IP_69931_RESPONSE_STATUS_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip69931ResponseStatus", beginIp69931ResponseStatus,IP_69931_RESPONSE_STATUS_LEN);
    }
   	}
     int localIp69931ErrorMsgCounter = -1;
     public boolean isIp69931ErrorMsgModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp69931ErrorMsgCounter != sharedCounter;
         localIp69931ErrorMsgCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_69931_ERROR_MSG_LEN = 80;
	/**
	 * 	serialize this Ip69931ErrorMsg
	 */
   protected void serializeIp69931ErrorMsg(char[] ip69931ErrorMsg) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip69931ErrorMsg,0,getStringValue(),beginIp69931ErrorMsg,IP_69931_ERROR_MSG_LEN);
       localIp69931ErrorMsgCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp69931ErrorMsgConstraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
    /**
	 *	refreshIp69931ErrorMsg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp69931ErrorMsg() {	 
   		return (substring(getStringValue(),beginIp69931ErrorMsg,beginIp69931ErrorMsg + IP_69931_ERROR_MSG_LEN));
   	}




}
  
