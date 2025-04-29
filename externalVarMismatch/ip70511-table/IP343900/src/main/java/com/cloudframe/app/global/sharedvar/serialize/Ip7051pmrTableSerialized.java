package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip7051pmrTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip7051pmrTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip7051pmrTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_7051PMR_TABLE_LENGTH = 225;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp7051pmrMqBypassSw;
	
	/**
	* Constructor for Ip7051pmrTableSerialized
	**/
    public Ip7051pmrTableSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip7051pmrTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_7051PMR_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIp7051pmrMqBypassSw = getStartOffset() + 32;	// set offset for serialization
  
  
  
	   /*  end of offset */
	}
     int localIp7051pmrMqBypassSwCounter = -1;
     public boolean isIp7051pmrMqBypassSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7051pmrMqBypassSwCounter != sharedCounter;
         localIp7051pmrMqBypassSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7051PMR_MQ_BYPASS_SW_LEN = 1;
	/**
	 * 	serialize this Ip7051pmrMqBypassSw
	 */
   protected void serializeIp7051pmrMqBypassSw(char[] ip7051pmrMqBypassSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7051pmrMqBypassSw,0,getStringValue(),beginIp7051pmrMqBypassSw,IP_7051PMR_MQ_BYPASS_SW_LEN);
       localIp7051pmrMqBypassSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7051pmrMqBypassSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp7051pmrMqBypassSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7051pmrMqBypassSw() {	 
   		return (substring(getStringValue(),beginIp7051pmrMqBypassSw,beginIp7051pmrMqBypassSw + IP_7051PMR_MQ_BYPASS_SW_LEN));
   	}




}
  
