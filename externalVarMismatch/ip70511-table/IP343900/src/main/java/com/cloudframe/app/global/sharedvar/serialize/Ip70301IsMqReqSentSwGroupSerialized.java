package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip70301IsMqReqSentSwGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip70301IsMqReqSentSwGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip70301IsMqReqSentSwGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_70301_IS_MQ_REQ_SENT_SW_GROUP_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp70301IsMqReqSentSw;
	
	/**
	* Constructor for Ip70301IsMqReqSentSwGroupSerialized
	**/
    public Ip70301IsMqReqSentSwGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip70301IsMqReqSentSwGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_70301_IS_MQ_REQ_SENT_SW_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp70301IsMqReqSentSw = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp70301IsMqReqSentSwCounter = -1;
     public boolean isIp70301IsMqReqSentSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70301IsMqReqSentSwCounter != sharedCounter;
         localIp70301IsMqReqSentSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70301_IS_MQ_REQ_SENT_SW_LEN = 1;
	/**
	 * 	serialize this Ip70301IsMqReqSentSw
	 */
   protected void serializeIp70301IsMqReqSentSw(char[] ip70301IsMqReqSentSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70301IsMqReqSentSw,0,getStringValue(),beginIp70301IsMqReqSentSw,IP_70301_IS_MQ_REQ_SENT_SW_LEN);
       localIp70301IsMqReqSentSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70301IsMqReqSentSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp70301IsMqReqSentSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70301IsMqReqSentSw() {	 
   		return (substring(getStringValue(),beginIp70301IsMqReqSentSw,beginIp70301IsMqReqSentSw + IP_70301_IS_MQ_REQ_SENT_SW_LEN));
   	}




}
  
