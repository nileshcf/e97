package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip70301InstallMqSrvActiveGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip70301InstallMqSrvActiveGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip70301InstallMqSrvActiveGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_70301_INSTALL_MQ_SRV_ACTIVE_GROUP_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp70301InstallMqSrvActive;
	
	/**
	* Constructor for Ip70301InstallMqSrvActiveGroupSerialized
	**/
    public Ip70301InstallMqSrvActiveGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip70301InstallMqSrvActiveGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_70301_INSTALL_MQ_SRV_ACTIVE_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp70301InstallMqSrvActive = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp70301InstallMqSrvActiveCounter = -1;
     public boolean isIp70301InstallMqSrvActiveModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70301InstallMqSrvActiveCounter != sharedCounter;
         localIp70301InstallMqSrvActiveCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70301_INSTALL_MQ_SRV_ACTIVE_LEN = 1;
	/**
	 * 	serialize this Ip70301InstallMqSrvActive
	 */
   protected void serializeIp70301InstallMqSrvActive(char[] ip70301InstallMqSrvActive) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70301InstallMqSrvActive,0,getStringValue(),beginIp70301InstallMqSrvActive,IP_70301_INSTALL_MQ_SRV_ACTIVE_LEN);
       localIp70301InstallMqSrvActiveCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70301InstallMqSrvActiveConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp70301InstallMqSrvActive is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70301InstallMqSrvActive() {	 
   		return (substring(getStringValue(),beginIp70301InstallMqSrvActive,beginIp70301InstallMqSrvActive + IP_70301_INSTALL_MQ_SRV_ACTIVE_LEN));
   	}




}
  
