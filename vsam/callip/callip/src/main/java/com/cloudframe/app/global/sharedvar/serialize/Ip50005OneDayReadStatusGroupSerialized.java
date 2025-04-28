package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip50005OneDayReadStatusGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:55. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip50005OneDayReadStatusGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip50005OneDayReadStatusGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_50005_ONE_DAY_READ_STATUS_GROUP_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp50005OneDayReadStatus;
	
	/**
	* Constructor for Ip50005OneDayReadStatusGroupSerialized
	**/
    public Ip50005OneDayReadStatusGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip50005OneDayReadStatusGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_50005_ONE_DAY_READ_STATUS_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp50005OneDayReadStatus = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp50005OneDayReadStatusCounter = -1;
     public boolean isIp50005OneDayReadStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50005OneDayReadStatusCounter != sharedCounter;
         localIp50005OneDayReadStatusCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50005_ONE_DAY_READ_STATUS_LEN = 2;
	/**
	 * 	serialize this Ip50005OneDayReadStatus
	 */
   protected void serializeIp50005OneDayReadStatus(char[] ip50005OneDayReadStatus) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50005OneDayReadStatus,0,getStringValue(),beginIp50005OneDayReadStatus,IP_50005_ONE_DAY_READ_STATUS_LEN);
       localIp50005OneDayReadStatusCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50005OneDayReadStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp50005OneDayReadStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50005OneDayReadStatus() {	 
   		return (substring(getStringValue(),beginIp50005OneDayReadStatus,beginIp50005OneDayReadStatus + IP_50005_ONE_DAY_READ_STATUS_LEN));
   	}




}
  
