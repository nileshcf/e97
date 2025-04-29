package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip7051pm2TableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip7051pm2TableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip7051pm2TableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_7051PM_2_TABLE_LENGTH = 225;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp7051pm2MqBypassSw;
	
	/**
	* Constructor for Ip7051pm2TableSerialized
	**/
    public Ip7051pm2TableSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip7051pm2TableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_7051PM_2_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIp7051pm2MqBypassSw = getStartOffset() + 32;	// set offset for serialization
  
  
  
	   /*  end of offset */
	}
     int localIp7051pm2MqBypassSwCounter = -1;
     public boolean isIp7051pm2MqBypassSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7051pm2MqBypassSwCounter != sharedCounter;
         localIp7051pm2MqBypassSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7051PM_2_MQ_BYPASS_SW_LEN = 1;
	/**
	 * 	serialize this Ip7051pm2MqBypassSw
	 */
   protected void serializeIp7051pm2MqBypassSw(char[] ip7051pm2MqBypassSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7051pm2MqBypassSw,0,getStringValue(),beginIp7051pm2MqBypassSw,IP_7051PM_2_MQ_BYPASS_SW_LEN);
       localIp7051pm2MqBypassSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7051pm2MqBypassSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp7051pm2MqBypassSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7051pm2MqBypassSw() {	 
   		return (substring(getStringValue(),beginIp7051pm2MqBypassSw,beginIp7051pm2MqBypassSw + IP_7051PM_2_MQ_BYPASS_SW_LEN));
   	}




}
  
