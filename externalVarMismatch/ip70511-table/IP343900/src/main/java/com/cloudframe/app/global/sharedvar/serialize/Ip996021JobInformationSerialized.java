package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip996021JobInformationSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:06. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip996021JobInformationSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip996021JobInformationSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_996021_JOB_INFORMATION_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp996021JobId;
            protected  int beginIp996021JobName;
            protected  int beginIp996021UserId;
            protected  int beginIp996021LparName;
	
	/**
	* Constructor for Ip996021JobInformationSerialized
	**/
    public Ip996021JobInformationSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip996021JobInformationSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_996021_JOB_INFORMATION_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp996021JobId = getStartOffset() + 0;	// set offset for serialization
  
             beginIp996021JobName = getStartOffset() + 8;	// set offset for serialization
  
             beginIp996021UserId = getStartOffset() + 16;	// set offset for serialization
  
             beginIp996021LparName = getStartOffset() + 24;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localIp996021JobIdCounter = -1;
     public boolean isIp996021JobIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp996021JobIdCounter != sharedCounter;
         localIp996021JobIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_996021_JOB_ID_LEN = 8;
	/**
	 * 	serialize this Ip996021JobId
	 */
   protected void serializeIp996021JobId(char[] ip996021JobId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip996021JobId,0,getStringValue(),beginIp996021JobId,IP_996021_JOB_ID_LEN);
       localIp996021JobIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp996021JobIdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIp996021JobId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp996021JobId() {	 
   		return (substring(getStringValue(),beginIp996021JobId,beginIp996021JobId + IP_996021_JOB_ID_LEN));
   	}
     int localIp996021JobNameCounter = -1;
     public boolean isIp996021JobNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp996021JobNameCounter != sharedCounter;
         localIp996021JobNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_996021_JOB_NAME_LEN = 8;
	/**
	 * 	serialize this Ip996021JobName
	 */
   protected void serializeIp996021JobName(char[] ip996021JobName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip996021JobName,0,getStringValue(),beginIp996021JobName,IP_996021_JOB_NAME_LEN);
       localIp996021JobNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp996021JobNameConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIp996021JobName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp996021JobName() {	 
   		return (substring(getStringValue(),beginIp996021JobName,beginIp996021JobName + IP_996021_JOB_NAME_LEN));
   	}
     int localIp996021UserIdCounter = -1;
     public boolean isIp996021UserIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp996021UserIdCounter != sharedCounter;
         localIp996021UserIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_996021_USER_ID_LEN = 8;
	/**
	 * 	serialize this Ip996021UserId
	 */
   protected void serializeIp996021UserId(char[] ip996021UserId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip996021UserId,0,getStringValue(),beginIp996021UserId,IP_996021_USER_ID_LEN);
       localIp996021UserIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp996021UserIdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIp996021UserId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp996021UserId() {	 
   		return (substring(getStringValue(),beginIp996021UserId,beginIp996021UserId + IP_996021_USER_ID_LEN));
   	}
     int localIp996021LparNameCounter = -1;
     public boolean isIp996021LparNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp996021LparNameCounter != sharedCounter;
         localIp996021LparNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_996021_LPAR_NAME_LEN = 4;
	/**
	 * 	serialize this Ip996021LparName
	 */
   protected void serializeIp996021LparName(char[] ip996021LparName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip996021LparName,0,getStringValue(),beginIp996021LparName,IP_996021_LPAR_NAME_LEN);
       localIp996021LparNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp996021LparNameConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp996021LparName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp996021LparName() {	 
   		return (substring(getStringValue(),beginIp996021LparName,beginIp996021LparName + IP_996021_LPAR_NAME_LEN));
   	}




}
  
