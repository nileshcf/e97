package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip70301IsFraudMqSrvActiveGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:25. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip70301IsFraudMqSrvActiveGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip70301IsFraudMqSrvActiveGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_70301_IS_FRAUD_MQ_SRV_ACTIVE_GROUP_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp70301IsFraudMqSrvActive;
	
	/**
	* Constructor for Ip70301IsFraudMqSrvActiveGroupSerialized
	**/
    public Ip70301IsFraudMqSrvActiveGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip70301IsFraudMqSrvActiveGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_70301_IS_FRAUD_MQ_SRV_ACTIVE_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp70301IsFraudMqSrvActive = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp70301IsFraudMqSrvActiveCounter = -1;
     public boolean isIp70301IsFraudMqSrvActiveModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70301IsFraudMqSrvActiveCounter != sharedCounter;
         localIp70301IsFraudMqSrvActiveCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70301_IS_FRAUD_MQ_SRV_ACTIVE_LEN = 1;
	/**
	 * 	serialize this Ip70301IsFraudMqSrvActive
	 */
   protected void serializeIp70301IsFraudMqSrvActive(char[] ip70301IsFraudMqSrvActive) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70301IsFraudMqSrvActive,0,getStringValue(),beginIp70301IsFraudMqSrvActive,IP_70301_IS_FRAUD_MQ_SRV_ACTIVE_LEN);
       localIp70301IsFraudMqSrvActiveCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70301IsFraudMqSrvActiveConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp70301IsFraudMqSrvActive is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70301IsFraudMqSrvActive() {	 
   		return (substring(getStringValue(),beginIp70301IsFraudMqSrvActive,beginIp70301IsFraudMqSrvActive + IP_70301_IS_FRAUD_MQ_SRV_ACTIVE_LEN));
   	}




}
  
