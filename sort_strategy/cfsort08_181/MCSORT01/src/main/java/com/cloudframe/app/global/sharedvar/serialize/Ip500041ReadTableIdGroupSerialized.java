package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip500041ReadTableIdGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:57. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip500041ReadTableIdGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip500041ReadTableIdGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_500041_READ_TABLE_ID_GROUP_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp500041ReadTableId;
	
	/**
	* Constructor for Ip500041ReadTableIdGroupSerialized
	**/
    public Ip500041ReadTableIdGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip500041ReadTableIdGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_500041_READ_TABLE_ID_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp500041ReadTableId = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localIp500041ReadTableIdCounter = -1;
     public boolean isIp500041ReadTableIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp500041ReadTableIdCounter != sharedCounter;
         localIp500041ReadTableIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_500041_READ_TABLE_ID_LEN = 8;
	/**
	 * 	serialize this Ip500041ReadTableId
	 */
   protected void serializeIp500041ReadTableId(char[] ip500041ReadTableId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip500041ReadTableId,0,getStringValue(),beginIp500041ReadTableId,IP_500041_READ_TABLE_ID_LEN);
       localIp500041ReadTableIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp500041ReadTableIdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIp500041ReadTableId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp500041ReadTableId() {	 
   		return (substring(getStringValue(),beginIp500041ReadTableId,beginIp500041ReadTableId + IP_500041_READ_TABLE_ID_LEN));
   	}




}
  
