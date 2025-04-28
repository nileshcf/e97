package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip70301PmaAmsMqSrvActiveGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip70301PmaAmsMqSrvActiveGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip70301PmaAmsMqSrvActiveGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_70301_PMA_AMS_MQ_SRV_ACTIVE_GROUP_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp70301PmaAmsMqSrvActive;
	
	/**
	* Constructor for Ip70301PmaAmsMqSrvActiveGroupSerialized
	**/
    public Ip70301PmaAmsMqSrvActiveGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip70301PmaAmsMqSrvActiveGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_70301_PMA_AMS_MQ_SRV_ACTIVE_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp70301PmaAmsMqSrvActive = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp70301PmaAmsMqSrvActiveCounter = -1;
     public boolean isIp70301PmaAmsMqSrvActiveModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70301PmaAmsMqSrvActiveCounter != sharedCounter;
         localIp70301PmaAmsMqSrvActiveCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70301_PMA_AMS_MQ_SRV_ACTIVE_LEN = 1;
	/**
	 * 	serialize this Ip70301PmaAmsMqSrvActive
	 */
   protected void serializeIp70301PmaAmsMqSrvActive(char[] ip70301PmaAmsMqSrvActive) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70301PmaAmsMqSrvActive,0,getStringValue(),beginIp70301PmaAmsMqSrvActive,IP_70301_PMA_AMS_MQ_SRV_ACTIVE_LEN);
       localIp70301PmaAmsMqSrvActiveCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70301PmaAmsMqSrvActiveConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp70301PmaAmsMqSrvActive is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70301PmaAmsMqSrvActive() {	 
   		return (substring(getStringValue(),beginIp70301PmaAmsMqSrvActive,beginIp70301PmaAmsMqSrvActive + IP_70301_PMA_AMS_MQ_SRV_ACTIVE_LEN));
   	}




}
  
