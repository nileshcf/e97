package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip70301PmtIndMqSrvActiveGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip70301PmtIndMqSrvActiveGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip70301PmtIndMqSrvActiveGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_70301_PMT_IND_MQ_SRV_ACTIVE_GROUP_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp70301PmtIndMqSrvActive;
	
	/**
	* Constructor for Ip70301PmtIndMqSrvActiveGroupSerialized
	**/
    public Ip70301PmtIndMqSrvActiveGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip70301PmtIndMqSrvActiveGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_70301_PMT_IND_MQ_SRV_ACTIVE_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp70301PmtIndMqSrvActive = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp70301PmtIndMqSrvActiveCounter = -1;
     public boolean isIp70301PmtIndMqSrvActiveModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70301PmtIndMqSrvActiveCounter != sharedCounter;
         localIp70301PmtIndMqSrvActiveCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70301_PMT_IND_MQ_SRV_ACTIVE_LEN = 1;
	/**
	 * 	serialize this Ip70301PmtIndMqSrvActive
	 */
   protected void serializeIp70301PmtIndMqSrvActive(char[] ip70301PmtIndMqSrvActive) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70301PmtIndMqSrvActive,0,getStringValue(),beginIp70301PmtIndMqSrvActive,IP_70301_PMT_IND_MQ_SRV_ACTIVE_LEN);
       localIp70301PmtIndMqSrvActiveCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70301PmtIndMqSrvActiveConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp70301PmtIndMqSrvActive is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70301PmtIndMqSrvActive() {	 
   		return (substring(getStringValue(),beginIp70301PmtIndMqSrvActive,beginIp70301PmtIndMqSrvActive + IP_70301_PMT_IND_MQ_SRV_ACTIVE_LEN));
   	}




}
  
