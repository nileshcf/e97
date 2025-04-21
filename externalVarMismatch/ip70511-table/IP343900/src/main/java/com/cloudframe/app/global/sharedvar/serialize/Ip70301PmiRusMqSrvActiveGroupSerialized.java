package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip70301PmiRusMqSrvActiveGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip70301PmiRusMqSrvActiveGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip70301PmiRusMqSrvActiveGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_70301_PMI_RUS_MQ_SRV_ACTIVE_GROUP_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp70301PmiRusMqSrvActive;
	
	/**
	* Constructor for Ip70301PmiRusMqSrvActiveGroupSerialized
	**/
    public Ip70301PmiRusMqSrvActiveGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip70301PmiRusMqSrvActiveGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_70301_PMI_RUS_MQ_SRV_ACTIVE_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp70301PmiRusMqSrvActive = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp70301PmiRusMqSrvActiveCounter = -1;
     public boolean isIp70301PmiRusMqSrvActiveModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70301PmiRusMqSrvActiveCounter != sharedCounter;
         localIp70301PmiRusMqSrvActiveCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70301_PMI_RUS_MQ_SRV_ACTIVE_LEN = 1;
	/**
	 * 	serialize this Ip70301PmiRusMqSrvActive
	 */
   protected void serializeIp70301PmiRusMqSrvActive(char[] ip70301PmiRusMqSrvActive) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70301PmiRusMqSrvActive,0,getStringValue(),beginIp70301PmiRusMqSrvActive,IP_70301_PMI_RUS_MQ_SRV_ACTIVE_LEN);
       localIp70301PmiRusMqSrvActiveCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70301PmiRusMqSrvActiveConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp70301PmiRusMqSrvActive is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70301PmiRusMqSrvActive() {	 
   		return (substring(getStringValue(),beginIp70301PmiRusMqSrvActive,beginIp70301PmiRusMqSrvActive + IP_70301_PMI_RUS_MQ_SRV_ACTIVE_LEN));
   	}




}
  
