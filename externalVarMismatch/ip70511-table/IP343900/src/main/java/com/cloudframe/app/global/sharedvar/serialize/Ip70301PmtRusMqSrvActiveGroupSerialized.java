package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip70301PmtRusMqSrvActiveGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip70301PmtRusMqSrvActiveGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip70301PmtRusMqSrvActiveGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_70301_PMT_RUS_MQ_SRV_ACTIVE_GROUP_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp70301PmtRusMqSrvActive;
	
	/**
	* Constructor for Ip70301PmtRusMqSrvActiveGroupSerialized
	**/
    public Ip70301PmtRusMqSrvActiveGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip70301PmtRusMqSrvActiveGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_70301_PMT_RUS_MQ_SRV_ACTIVE_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp70301PmtRusMqSrvActive = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp70301PmtRusMqSrvActiveCounter = -1;
     public boolean isIp70301PmtRusMqSrvActiveModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70301PmtRusMqSrvActiveCounter != sharedCounter;
         localIp70301PmtRusMqSrvActiveCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70301_PMT_RUS_MQ_SRV_ACTIVE_LEN = 1;
	/**
	 * 	serialize this Ip70301PmtRusMqSrvActive
	 */
   protected void serializeIp70301PmtRusMqSrvActive(char[] ip70301PmtRusMqSrvActive) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70301PmtRusMqSrvActive,0,getStringValue(),beginIp70301PmtRusMqSrvActive,IP_70301_PMT_RUS_MQ_SRV_ACTIVE_LEN);
       localIp70301PmtRusMqSrvActiveCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70301PmtRusMqSrvActiveConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp70301PmtRusMqSrvActive is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70301PmtRusMqSrvActive() {	 
   		return (substring(getStringValue(),beginIp70301PmtRusMqSrvActive,beginIp70301PmtRusMqSrvActive + IP_70301_PMT_RUS_MQ_SRV_ACTIVE_LEN));
   	}




}
  
