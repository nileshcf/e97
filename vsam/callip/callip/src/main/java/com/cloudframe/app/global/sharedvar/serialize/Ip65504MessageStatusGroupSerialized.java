package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504MessageStatusGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:55. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504MessageStatusGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504MessageStatusGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_MESSAGE_STATUS_GROUP_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504MessageStatus;
	
	/**
	* Constructor for Ip65504MessageStatusGroupSerialized
	**/
    public Ip65504MessageStatusGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip65504MessageStatusGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_MESSAGE_STATUS_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504MessageStatus = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIp65504MessageStatusCounter = -1;
         public boolean isIp65504MessageStatusModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504MessageStatusCounter != sharedCounter;
            localIp65504MessageStatusCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_MESSAGE_STATUS_LEN = 2;
  	/**
	 * serializeIp65504MessageStatus
	 */
	protected void serializeIp65504MessageStatus(short ip65504MessageStatus) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504MessageStatus,IP_65504_MESSAGE_STATUS_LEN)
                  ,beginIp65504MessageStatus
                  ,IP_65504_MESSAGE_STATUS_LEN
                 );
            localIp65504MessageStatusCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504MessageStatusMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504MessageStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504MessageStatus() {	 
			return (getShort(beginIp65504MessageStatus));
   	}




}
  
