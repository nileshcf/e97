package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip70301PmtIdnMqSrvActiveGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:39. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip70301PmtIdnMqSrvActiveGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip70301PmtIdnMqSrvActiveGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_70301_PMT_IDN_MQ_SRV_ACTIVE_GROUP_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp70301PmtIdnMqSrvActive;
	
	/**
	* Constructor for Ip70301PmtIdnMqSrvActiveGroupSerialized
	**/
    public Ip70301PmtIdnMqSrvActiveGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip70301PmtIdnMqSrvActiveGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_70301_PMT_IDN_MQ_SRV_ACTIVE_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp70301PmtIdnMqSrvActive = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp70301PmtIdnMqSrvActiveCounter = -1;
     public boolean isIp70301PmtIdnMqSrvActiveModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70301PmtIdnMqSrvActiveCounter != sharedCounter;
         localIp70301PmtIdnMqSrvActiveCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70301_PMT_IDN_MQ_SRV_ACTIVE_LEN = 1;
	/**
	 * 	serialize this Ip70301PmtIdnMqSrvActive
	 */
   protected void serializeIp70301PmtIdnMqSrvActive(char[] ip70301PmtIdnMqSrvActive) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70301PmtIdnMqSrvActive,0,getStringValue(),beginIp70301PmtIdnMqSrvActive,IP_70301_PMT_IDN_MQ_SRV_ACTIVE_LEN);
       localIp70301PmtIdnMqSrvActiveCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70301PmtIdnMqSrvActiveConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp70301PmtIdnMqSrvActive is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70301PmtIdnMqSrvActive() {	 
   		return (substring(getStringValue(),beginIp70301PmtIdnMqSrvActive,beginIp70301PmtIdnMqSrvActive + IP_70301_PMT_IDN_MQ_SRV_ACTIVE_LEN));
   	}




}
  
