package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip70301PmiAmsMqSrvActiveGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:39. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip70301PmiAmsMqSrvActiveGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip70301PmiAmsMqSrvActiveGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_70301_PMI_AMS_MQ_SRV_ACTIVE_GROUP_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp70301PmiAmsMqSrvActive;
	
	/**
	* Constructor for Ip70301PmiAmsMqSrvActiveGroupSerialized
	**/
    public Ip70301PmiAmsMqSrvActiveGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip70301PmiAmsMqSrvActiveGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_70301_PMI_AMS_MQ_SRV_ACTIVE_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp70301PmiAmsMqSrvActive = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp70301PmiAmsMqSrvActiveCounter = -1;
     public boolean isIp70301PmiAmsMqSrvActiveModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70301PmiAmsMqSrvActiveCounter != sharedCounter;
         localIp70301PmiAmsMqSrvActiveCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70301_PMI_AMS_MQ_SRV_ACTIVE_LEN = 1;
	/**
	 * 	serialize this Ip70301PmiAmsMqSrvActive
	 */
   protected void serializeIp70301PmiAmsMqSrvActive(char[] ip70301PmiAmsMqSrvActive) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70301PmiAmsMqSrvActive,0,getStringValue(),beginIp70301PmiAmsMqSrvActive,IP_70301_PMI_AMS_MQ_SRV_ACTIVE_LEN);
       localIp70301PmiAmsMqSrvActiveCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70301PmiAmsMqSrvActiveConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp70301PmiAmsMqSrvActive is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70301PmiAmsMqSrvActive() {	 
   		return (substring(getStringValue(),beginIp70301PmiAmsMqSrvActive,beginIp70301PmiAmsMqSrvActive + IP_70301_PMI_AMS_MQ_SRV_ACTIVE_LEN));
   	}




}
  
