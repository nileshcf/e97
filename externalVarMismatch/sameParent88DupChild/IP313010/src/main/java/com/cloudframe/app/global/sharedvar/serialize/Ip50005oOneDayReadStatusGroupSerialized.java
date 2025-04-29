package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip50005oOneDayReadStatusGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip50005oOneDayReadStatusGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip50005oOneDayReadStatusGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_50005O_ONE_DAY_READ_STATUS_GROUP_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp50005oOneDayReadStatus;
	
	/**
	* Constructor for Ip50005oOneDayReadStatusGroupSerialized
	**/
    public Ip50005oOneDayReadStatusGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip50005oOneDayReadStatusGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_50005O_ONE_DAY_READ_STATUS_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp50005oOneDayReadStatus = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp50005oOneDayReadStatusCounter = -1;
     public boolean isIp50005oOneDayReadStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50005oOneDayReadStatusCounter != sharedCounter;
         localIp50005oOneDayReadStatusCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50005O_ONE_DAY_READ_STATUS_LEN = 2;
	/**
	 * 	serialize this Ip50005oOneDayReadStatus
	 */
   protected void serializeIp50005oOneDayReadStatus(char[] ip50005oOneDayReadStatus) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50005oOneDayReadStatus,0,getStringValue(),beginIp50005oOneDayReadStatus,IP_50005O_ONE_DAY_READ_STATUS_LEN);
       localIp50005oOneDayReadStatusCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50005oOneDayReadStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp50005oOneDayReadStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50005oOneDayReadStatus() {	 
   		return (substring(getStringValue(),beginIp50005oOneDayReadStatus,beginIp50005oOneDayReadStatus + IP_50005O_ONE_DAY_READ_STATUS_LEN));
   	}




}
  
