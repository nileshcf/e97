package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip70301LnCloneOwnerIdGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip70301LnCloneOwnerIdGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip70301LnCloneOwnerIdGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_70301_LN_CLONE_OWNER_ID_GROUP_LENGTH = 3;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp70301LnCloneOwnerId;
	
	/**
	* Constructor for Ip70301LnCloneOwnerIdGroupSerialized
	**/
    public Ip70301LnCloneOwnerIdGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip70301LnCloneOwnerIdGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_70301_LN_CLONE_OWNER_ID_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp70301LnCloneOwnerId = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp70301LnCloneOwnerIdCounter = -1;
     public boolean isIp70301LnCloneOwnerIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70301LnCloneOwnerIdCounter != sharedCounter;
         localIp70301LnCloneOwnerIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70301_LN_CLONE_OWNER_ID_LEN = 3;
	/**
	 * 	serialize this Ip70301LnCloneOwnerId
	 */
   protected void serializeIp70301LnCloneOwnerId(char[] ip70301LnCloneOwnerId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70301LnCloneOwnerId,0,getStringValue(),beginIp70301LnCloneOwnerId,IP_70301_LN_CLONE_OWNER_ID_LEN);
       localIp70301LnCloneOwnerIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70301LnCloneOwnerIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp70301LnCloneOwnerId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70301LnCloneOwnerId() {	 
   		return (substring(getStringValue(),beginIp70301LnCloneOwnerId,beginIp70301LnCloneOwnerId + IP_70301_LN_CLONE_OWNER_ID_LEN));
   	}




}
  
