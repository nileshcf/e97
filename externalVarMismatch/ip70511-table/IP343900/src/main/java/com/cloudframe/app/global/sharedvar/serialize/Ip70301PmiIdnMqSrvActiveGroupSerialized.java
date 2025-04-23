package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip70301PmiIdnMqSrvActiveGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip70301PmiIdnMqSrvActiveGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip70301PmiIdnMqSrvActiveGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_70301_PMI_IDN_MQ_SRV_ACTIVE_GROUP_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp70301PmiIdnMqSrvActive;
	
	/**
	* Constructor for Ip70301PmiIdnMqSrvActiveGroupSerialized
	**/
    public Ip70301PmiIdnMqSrvActiveGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip70301PmiIdnMqSrvActiveGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_70301_PMI_IDN_MQ_SRV_ACTIVE_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp70301PmiIdnMqSrvActive = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp70301PmiIdnMqSrvActiveCounter = -1;
     public boolean isIp70301PmiIdnMqSrvActiveModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70301PmiIdnMqSrvActiveCounter != sharedCounter;
         localIp70301PmiIdnMqSrvActiveCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70301_PMI_IDN_MQ_SRV_ACTIVE_LEN = 1;
	/**
	 * 	serialize this Ip70301PmiIdnMqSrvActive
	 */
   protected void serializeIp70301PmiIdnMqSrvActive(char[] ip70301PmiIdnMqSrvActive) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70301PmiIdnMqSrvActive,0,getStringValue(),beginIp70301PmiIdnMqSrvActive,IP_70301_PMI_IDN_MQ_SRV_ACTIVE_LEN);
       localIp70301PmiIdnMqSrvActiveCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70301PmiIdnMqSrvActiveConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp70301PmiIdnMqSrvActive is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70301PmiIdnMqSrvActive() {	 
   		return (substring(getStringValue(),beginIp70301PmiIdnMqSrvActive,beginIp70301PmiIdnMqSrvActive + IP_70301_PMI_IDN_MQ_SRV_ACTIVE_LEN));
   	}




}
  
