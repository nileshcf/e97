package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip70301PmiIndMqSrvActiveGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip70301PmiIndMqSrvActiveGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip70301PmiIndMqSrvActiveGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_70301_PMI_IND_MQ_SRV_ACTIVE_GROUP_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp70301PmiIndMqSrvActive;
	
	/**
	* Constructor for Ip70301PmiIndMqSrvActiveGroupSerialized
	**/
    public Ip70301PmiIndMqSrvActiveGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip70301PmiIndMqSrvActiveGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_70301_PMI_IND_MQ_SRV_ACTIVE_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp70301PmiIndMqSrvActive = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp70301PmiIndMqSrvActiveCounter = -1;
     public boolean isIp70301PmiIndMqSrvActiveModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70301PmiIndMqSrvActiveCounter != sharedCounter;
         localIp70301PmiIndMqSrvActiveCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70301_PMI_IND_MQ_SRV_ACTIVE_LEN = 1;
	/**
	 * 	serialize this Ip70301PmiIndMqSrvActive
	 */
   protected void serializeIp70301PmiIndMqSrvActive(char[] ip70301PmiIndMqSrvActive) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70301PmiIndMqSrvActive,0,getStringValue(),beginIp70301PmiIndMqSrvActive,IP_70301_PMI_IND_MQ_SRV_ACTIVE_LEN);
       localIp70301PmiIndMqSrvActiveCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70301PmiIndMqSrvActiveConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp70301PmiIndMqSrvActive is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70301PmiIndMqSrvActive() {	 
   		return (substring(getStringValue(),beginIp70301PmiIndMqSrvActive,beginIp70301PmiIndMqSrvActive + IP_70301_PMI_IND_MQ_SRV_ACTIVE_LEN));
   	}




}
  
