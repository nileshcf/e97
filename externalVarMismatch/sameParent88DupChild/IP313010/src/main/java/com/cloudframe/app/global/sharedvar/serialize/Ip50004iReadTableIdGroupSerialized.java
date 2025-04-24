package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip50004iReadTableIdGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:41. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip50004iReadTableIdGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip50004iReadTableIdGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_50004I_READ_TABLE_ID_GROUP_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp50004iReadTableId;
	
	/**
	* Constructor for Ip50004iReadTableIdGroupSerialized
	**/
    public Ip50004iReadTableIdGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip50004iReadTableIdGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_50004I_READ_TABLE_ID_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp50004iReadTableId = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localIp50004iReadTableIdCounter = -1;
     public boolean isIp50004iReadTableIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50004iReadTableIdCounter != sharedCounter;
         localIp50004iReadTableIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50004I_READ_TABLE_ID_LEN = 8;
	/**
	 * 	serialize this Ip50004iReadTableId
	 */
   protected void serializeIp50004iReadTableId(char[] ip50004iReadTableId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50004iReadTableId,0,getStringValue(),beginIp50004iReadTableId,IP_50004I_READ_TABLE_ID_LEN);
       localIp50004iReadTableIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50004iReadTableIdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIp50004iReadTableId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50004iReadTableId() {	 
   		return (substring(getStringValue(),beginIp50004iReadTableId,beginIp50004iReadTableId + IP_50004I_READ_TABLE_ID_LEN));
   	}




}
  
