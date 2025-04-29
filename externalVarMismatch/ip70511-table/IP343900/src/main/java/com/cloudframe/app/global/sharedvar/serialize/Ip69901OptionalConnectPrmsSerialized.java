package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip69901OptionalConnectPrmsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip69901OptionalConnectPrmsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip69901OptionalConnectPrmsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_69901_OPTIONAL_CONNECT_PRMS_LENGTH = 36;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp69901DatabaseId;
            protected  int beginIp69901CollectionId;
	
	/**
	* Constructor for Ip69901OptionalConnectPrmsSerialized
	**/
    public Ip69901OptionalConnectPrmsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip69901OptionalConnectPrmsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_69901_OPTIONAL_CONNECT_PRMS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp69901DatabaseId = getStartOffset() + 0;	// set offset for serialization
  
             beginIp69901CollectionId = getStartOffset() + 18;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp69901DatabaseIdCounter = -1;
     public boolean isIp69901DatabaseIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp69901DatabaseIdCounter != sharedCounter;
         localIp69901DatabaseIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_69901_DATABASE_ID_LEN = 18;
	/**
	 * 	serialize this Ip69901DatabaseId
	 */
   protected void serializeIp69901DatabaseId(char[] ip69901DatabaseId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip69901DatabaseId,0,getStringValue(),beginIp69901DatabaseId,IP_69901_DATABASE_ID_LEN);
       localIp69901DatabaseIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp69901DatabaseIdConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshIp69901DatabaseId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp69901DatabaseId() {	 
   		return (substring(getStringValue(),beginIp69901DatabaseId,beginIp69901DatabaseId + IP_69901_DATABASE_ID_LEN));
   	}
     int localIp69901CollectionIdCounter = -1;
     public boolean isIp69901CollectionIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp69901CollectionIdCounter != sharedCounter;
         localIp69901CollectionIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_69901_COLLECTION_ID_LEN = 18;
	/**
	 * 	serialize this Ip69901CollectionId
	 */
   protected void serializeIp69901CollectionId(char[] ip69901CollectionId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip69901CollectionId,0,getStringValue(),beginIp69901CollectionId,IP_69901_COLLECTION_ID_LEN);
       localIp69901CollectionIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp69901CollectionIdConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshIp69901CollectionId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp69901CollectionId() {	 
   		return (substring(getStringValue(),beginIp69901CollectionId,beginIp69901CollectionId + IP_69901_COLLECTION_ID_LEN));
   	}




}
  
