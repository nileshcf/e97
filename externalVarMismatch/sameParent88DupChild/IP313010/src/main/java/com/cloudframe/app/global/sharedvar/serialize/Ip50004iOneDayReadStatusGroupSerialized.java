package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip50004iOneDayReadStatusGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:31. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip50004iOneDayReadStatusGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip50004iOneDayReadStatusGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_50004I_ONE_DAY_READ_STATUS_GROUP_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp50004iOneDayReadStatus;
	
	/**
	* Constructor for Ip50004iOneDayReadStatusGroupSerialized
	**/
    public Ip50004iOneDayReadStatusGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip50004iOneDayReadStatusGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_50004I_ONE_DAY_READ_STATUS_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp50004iOneDayReadStatus = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp50004iOneDayReadStatusCounter = -1;
     public boolean isIp50004iOneDayReadStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50004iOneDayReadStatusCounter != sharedCounter;
         localIp50004iOneDayReadStatusCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50004I_ONE_DAY_READ_STATUS_LEN = 2;
	/**
	 * 	serialize this Ip50004iOneDayReadStatus
	 */
   protected void serializeIp50004iOneDayReadStatus(char[] ip50004iOneDayReadStatus) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50004iOneDayReadStatus,0,getStringValue(),beginIp50004iOneDayReadStatus,IP_50004I_ONE_DAY_READ_STATUS_LEN);
       localIp50004iOneDayReadStatusCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50004iOneDayReadStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp50004iOneDayReadStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50004iOneDayReadStatus() {	 
   		return (substring(getStringValue(),beginIp50004iOneDayReadStatus,beginIp50004iOneDayReadStatus + IP_50004I_ONE_DAY_READ_STATUS_LEN));
   	}




}
  
