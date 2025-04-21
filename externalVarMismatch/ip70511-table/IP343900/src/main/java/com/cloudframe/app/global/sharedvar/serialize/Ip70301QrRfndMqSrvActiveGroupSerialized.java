package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip70301QrRfndMqSrvActiveGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip70301QrRfndMqSrvActiveGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip70301QrRfndMqSrvActiveGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_70301_QR_RFND_MQ_SRV_ACTIVE_GROUP_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp70301QrRfndMqSrvActive;
	
	/**
	* Constructor for Ip70301QrRfndMqSrvActiveGroupSerialized
	**/
    public Ip70301QrRfndMqSrvActiveGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip70301QrRfndMqSrvActiveGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_70301_QR_RFND_MQ_SRV_ACTIVE_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp70301QrRfndMqSrvActive = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp70301QrRfndMqSrvActiveCounter = -1;
     public boolean isIp70301QrRfndMqSrvActiveModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70301QrRfndMqSrvActiveCounter != sharedCounter;
         localIp70301QrRfndMqSrvActiveCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70301_QR_RFND_MQ_SRV_ACTIVE_LEN = 1;
	/**
	 * 	serialize this Ip70301QrRfndMqSrvActive
	 */
   protected void serializeIp70301QrRfndMqSrvActive(char[] ip70301QrRfndMqSrvActive) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70301QrRfndMqSrvActive,0,getStringValue(),beginIp70301QrRfndMqSrvActive,IP_70301_QR_RFND_MQ_SRV_ACTIVE_LEN);
       localIp70301QrRfndMqSrvActiveCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70301QrRfndMqSrvActiveConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp70301QrRfndMqSrvActive is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70301QrRfndMqSrvActive() {	 
   		return (substring(getStringValue(),beginIp70301QrRfndMqSrvActive,beginIp70301QrRfndMqSrvActive + IP_70301_QR_RFND_MQ_SRV_ACTIVE_LEN));
   	}




}
  
