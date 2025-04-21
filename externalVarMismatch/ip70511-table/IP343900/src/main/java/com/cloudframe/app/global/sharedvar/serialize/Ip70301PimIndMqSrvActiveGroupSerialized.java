package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip70301PimIndMqSrvActiveGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip70301PimIndMqSrvActiveGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip70301PimIndMqSrvActiveGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_70301_PIM_IND_MQ_SRV_ACTIVE_GROUP_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp70301PimIndMqSrvActive;
	
	/**
	* Constructor for Ip70301PimIndMqSrvActiveGroupSerialized
	**/
    public Ip70301PimIndMqSrvActiveGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip70301PimIndMqSrvActiveGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_70301_PIM_IND_MQ_SRV_ACTIVE_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp70301PimIndMqSrvActive = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp70301PimIndMqSrvActiveCounter = -1;
     public boolean isIp70301PimIndMqSrvActiveModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70301PimIndMqSrvActiveCounter != sharedCounter;
         localIp70301PimIndMqSrvActiveCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70301_PIM_IND_MQ_SRV_ACTIVE_LEN = 1;
	/**
	 * 	serialize this Ip70301PimIndMqSrvActive
	 */
   protected void serializeIp70301PimIndMqSrvActive(char[] ip70301PimIndMqSrvActive) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70301PimIndMqSrvActive,0,getStringValue(),beginIp70301PimIndMqSrvActive,IP_70301_PIM_IND_MQ_SRV_ACTIVE_LEN);
       localIp70301PimIndMqSrvActiveCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70301PimIndMqSrvActiveConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp70301PimIndMqSrvActive is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70301PimIndMqSrvActive() {	 
   		return (substring(getStringValue(),beginIp70301PimIndMqSrvActive,beginIp70301PimIndMqSrvActive + IP_70301_PIM_IND_MQ_SRV_ACTIVE_LEN));
   	}




}
  
