package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip70511TableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip70511TableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip70511TableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_70511_TABLE_LENGTH = 225;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp70511MqBypassSw;
	
	/**
	* Constructor for Ip70511TableSerialized
	**/
    public Ip70511TableSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip70511TableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_70511_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIp70511MqBypassSw = getStartOffset() + 32;	// set offset for serialization
  
  
  
	   /*  end of offset */
	}
     int localIp70511MqBypassSwCounter = -1;
     public boolean isIp70511MqBypassSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70511MqBypassSwCounter != sharedCounter;
         localIp70511MqBypassSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70511_MQ_BYPASS_SW_LEN = 1;
	/**
	 * 	serialize this Ip70511MqBypassSw
	 */
   protected void serializeIp70511MqBypassSw(char[] ip70511MqBypassSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70511MqBypassSw,0,getStringValue(),beginIp70511MqBypassSw,IP_70511_MQ_BYPASS_SW_LEN);
       localIp70511MqBypassSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70511MqBypassSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp70511MqBypassSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70511MqBypassSw() {	 
   		return (substring(getStringValue(),beginIp70511MqBypassSw,beginIp70511MqBypassSw + IP_70511_MQ_BYPASS_SW_LEN));
   	}




}
  
