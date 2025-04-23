package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip50005OneDayRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:06. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip50005OneDayRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip50005OneDayRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_50005_ONE_DAY_REC_LENGTH = 32752;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp50005TableData;
	
	/**
	* Constructor for Ip50005OneDayRecSerialized
	**/
    public Ip50005OneDayRecSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip50005OneDayRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_50005_ONE_DAY_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIp50005TableData = getStartOffset() + 22;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp50005TableDataCounter = -1;
     public boolean isIp50005TableDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50005TableDataCounter != sharedCounter;
         localIp50005TableDataCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50005_TABLE_DATA_LEN = 32730;
	/**
	 * 	serialize this Ip50005TableData
	 */
   protected void serializeIp50005TableData(char[] ip50005TableData) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50005TableData,0,getStringValue(),beginIp50005TableData,IP_50005_TABLE_DATA_LEN);
       localIp50005TableDataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50005TableDataConstraints(char[] value) {
   			return super.checkConstraints(value , 32730 ,false, false);
   }
    /**
	 *	refreshIp50005TableData is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50005TableData() {	 
   		return (substring(getStringValue(),beginIp50005TableData,beginIp50005TableData + IP_50005_TABLE_DATA_LEN));
   	}




}
  
