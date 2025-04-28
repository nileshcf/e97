package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class Ip00361DefaultBsAgrmtsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:54. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00361DefaultBsAgrmtsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00361DefaultBsAgrmtsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00361_DEFAULT_BS_AGRMTS_LENGTH = 36;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00361TableData;
	
	/**
	* Constructor for Ip00361DefaultBsAgrmtsSerialized
	**/
    public Ip00361DefaultBsAgrmtsSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip00361DefaultBsAgrmtsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00361_DEFAULT_BS_AGRMTS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp00361TableData = getStartOffset() + 19;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp00361TableDataCounter = -1;
     public boolean isIp00361TableDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00361TableDataCounter != sharedCounter;
         localIp00361TableDataCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00361_TABLE_DATA_LEN = 17;
	/**
	 * 	serialize this Ip00361TableData
	 */
   protected void serializeIp00361TableData(char[] ip00361TableData) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00361TableData,0,getStringValue(),beginIp00361TableData,IP_00361_TABLE_DATA_LEN);
       localIp00361TableDataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00361TableDataConstraints(char[] value) {
   			return super.checkConstraints(value , 17 ,false, false);
   }
    /**
	 *	refreshIp00361TableData is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00361TableData() {	 
   		return (substring(getStringValue(),beginIp00361TableData,beginIp00361TableData + IP_00361_TABLE_DATA_LEN));
   	}




}
  
