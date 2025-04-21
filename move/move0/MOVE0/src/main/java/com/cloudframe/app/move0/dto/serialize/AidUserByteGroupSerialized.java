package com.cloudframe.app.move0.dto.serialize;

/**
*  The class AidUserByteGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:02. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AidUserByteGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AidUserByteGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int AID_USER_BYTE_GROUP_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAidUserByte;
	
	/**
	* Constructor for AidUserByteGroupSerialized
	**/
    public AidUserByteGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in AidUserByteGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(AID_USER_BYTE_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAidUserByte = getStartOffset() + 0;	// set offset for serialization
  
  
  
	   /*  end of offset */
	}
     int localAidUserByteCounter = -1;
     public boolean isAidUserByteModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAidUserByteCounter != sharedCounter;
         localAidUserByteCounter = sharedCounter; return hasModified;
     }
	protected static final int AID_USER_BYTE_LEN = 2;
	/**
	 * 	serialize this AidUserByte
	 */
   protected void serializeAidUserByte(char[] aidUserByte) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aidUserByte,0,getStringValue(),beginAidUserByte,AID_USER_BYTE_LEN);
       localAidUserByteCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAidUserByteConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshAidUserByte is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAidUserByte() {	 
   		return (substring(getStringValue(),beginAidUserByte,beginAidUserByte + AID_USER_BYTE_LEN));
   	}




}
  
