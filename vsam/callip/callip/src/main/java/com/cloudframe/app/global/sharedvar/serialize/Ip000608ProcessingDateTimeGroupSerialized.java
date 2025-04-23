package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip000608ProcessingDateTimeGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:21. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip000608ProcessingDateTimeGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip000608ProcessingDateTimeGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_000608_PROCESSING_DATE_TIME_GROUP_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp000608ProcessingDateTime;
	
	/**
	* Constructor for Ip000608ProcessingDateTimeGroupSerialized
	**/
    public Ip000608ProcessingDateTimeGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip000608ProcessingDateTimeGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_000608_PROCESSING_DATE_TIME_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp000608ProcessingDateTime = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp000608ProcessingDateTimeCounter = -1;
     public boolean isIp000608ProcessingDateTimeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp000608ProcessingDateTimeCounter != sharedCounter;
         localIp000608ProcessingDateTimeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_000608_PROCESSING_DATE_TIME_LEN = 10;
	/**
	 * 	serialize this Ip000608ProcessingDateTime
	 */
   protected void serializeIp000608ProcessingDateTime(char[] ip000608ProcessingDateTime) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip000608ProcessingDateTime,0,getStringValue(),beginIp000608ProcessingDateTime,IP_000608_PROCESSING_DATE_TIME_LEN);
       localIp000608ProcessingDateTimeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp000608ProcessingDateTimeConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshIp000608ProcessingDateTime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp000608ProcessingDateTime() {	 
   		return (substring(getStringValue(),beginIp000608ProcessingDateTime,beginIp000608ProcessingDateTime + IP_000608_PROCESSING_DATE_TIME_LEN));
   	}




}
  
