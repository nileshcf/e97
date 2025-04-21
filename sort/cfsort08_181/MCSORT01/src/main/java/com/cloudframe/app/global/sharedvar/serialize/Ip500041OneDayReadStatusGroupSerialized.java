package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip500041OneDayReadStatusGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip500041OneDayReadStatusGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip500041OneDayReadStatusGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_500041_ONE_DAY_READ_STATUS_GROUP_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp500041OneDayReadStatus;
	
	/**
	* Constructor for Ip500041OneDayReadStatusGroupSerialized
	**/
    public Ip500041OneDayReadStatusGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip500041OneDayReadStatusGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_500041_ONE_DAY_READ_STATUS_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp500041OneDayReadStatus = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp500041OneDayReadStatusCounter = -1;
     public boolean isIp500041OneDayReadStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp500041OneDayReadStatusCounter != sharedCounter;
         localIp500041OneDayReadStatusCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_500041_ONE_DAY_READ_STATUS_LEN = 2;
	/**
	 * 	serialize this Ip500041OneDayReadStatus
	 */
   protected void serializeIp500041OneDayReadStatus(char[] ip500041OneDayReadStatus) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip500041OneDayReadStatus,0,getStringValue(),beginIp500041OneDayReadStatus,IP_500041_ONE_DAY_READ_STATUS_LEN);
       localIp500041OneDayReadStatusCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp500041OneDayReadStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp500041OneDayReadStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp500041OneDayReadStatus() {	 
   		return (substring(getStringValue(),beginIp500041OneDayReadStatus,beginIp500041OneDayReadStatus + IP_500041_ONE_DAY_READ_STATUS_LEN));
   	}




}
  
