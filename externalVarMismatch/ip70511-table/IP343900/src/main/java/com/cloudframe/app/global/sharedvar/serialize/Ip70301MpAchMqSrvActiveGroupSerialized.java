package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip70301MpAchMqSrvActiveGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip70301MpAchMqSrvActiveGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip70301MpAchMqSrvActiveGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_70301_MP_ACH_MQ_SRV_ACTIVE_GROUP_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp70301MpAchMqSrvActive;
	
	/**
	* Constructor for Ip70301MpAchMqSrvActiveGroupSerialized
	**/
    public Ip70301MpAchMqSrvActiveGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip70301MpAchMqSrvActiveGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_70301_MP_ACH_MQ_SRV_ACTIVE_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp70301MpAchMqSrvActive = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp70301MpAchMqSrvActiveCounter = -1;
     public boolean isIp70301MpAchMqSrvActiveModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70301MpAchMqSrvActiveCounter != sharedCounter;
         localIp70301MpAchMqSrvActiveCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70301_MP_ACH_MQ_SRV_ACTIVE_LEN = 1;
	/**
	 * 	serialize this Ip70301MpAchMqSrvActive
	 */
   protected void serializeIp70301MpAchMqSrvActive(char[] ip70301MpAchMqSrvActive) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70301MpAchMqSrvActive,0,getStringValue(),beginIp70301MpAchMqSrvActive,IP_70301_MP_ACH_MQ_SRV_ACTIVE_LEN);
       localIp70301MpAchMqSrvActiveCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70301MpAchMqSrvActiveConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp70301MpAchMqSrvActive is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70301MpAchMqSrvActive() {	 
   		return (substring(getStringValue(),beginIp70301MpAchMqSrvActive,beginIp70301MpAchMqSrvActive + IP_70301_MP_ACH_MQ_SRV_ACTIVE_LEN));
   	}




}
  
