package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class Ip500041RecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip500041RecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip500041RecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_500041_REC_LENGTH = 11;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp500041TableId;
	
	/**
	* Constructor for Ip500041RecSerialized
	**/
    public Ip500041RecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip500041RecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_500041_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp500041TableId = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp500041TableIdCounter = -1;
     public boolean isIp500041TableIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp500041TableIdCounter != sharedCounter;
         localIp500041TableIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_500041_TABLE_ID_LEN = 11;
	/**
	 * 	serialize this Ip500041TableId
	 */
   protected void serializeIp500041TableId(char[] ip500041TableId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip500041TableId,0,getStringValue(),beginIp500041TableId,IP_500041_TABLE_ID_LEN);
       localIp500041TableIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp500041TableIdConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshIp500041TableId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp500041TableId() {	 
   		return (substring(getStringValue(),beginIp500041TableId,beginIp500041TableId + IP_500041_TABLE_ID_LEN));
   	}




}
  
