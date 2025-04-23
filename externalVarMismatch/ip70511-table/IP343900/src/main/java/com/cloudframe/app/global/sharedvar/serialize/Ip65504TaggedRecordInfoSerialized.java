package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504TaggedRecordInfoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504TaggedRecordInfoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504TaggedRecordInfoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_TAGGED_RECORD_INFO_LENGTH = 5;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504IsFileTagged;
            protected  int beginIp65504TagTableOffset;
	
	/**
	* Constructor for Ip65504TaggedRecordInfoSerialized
	**/
    public Ip65504TaggedRecordInfoSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip65504TaggedRecordInfoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_TAGGED_RECORD_INFO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504IsFileTagged = getStartOffset() + 0;	// set offset for serialization
  
             beginIp65504TagTableOffset = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp65504IsFileTaggedCounter = -1;
     public boolean isIp65504IsFileTaggedModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp65504IsFileTaggedCounter != sharedCounter;
         localIp65504IsFileTaggedCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_65504_IS_FILE_TAGGED_LEN = 1;
	/**
	 * 	serialize this Ip65504IsFileTagged
	 */
   protected void serializeIp65504IsFileTagged(char[] ip65504IsFileTagged) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip65504IsFileTagged,0,getStringValue(),beginIp65504IsFileTagged,IP_65504_IS_FILE_TAGGED_LEN);
       localIp65504IsFileTaggedCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp65504IsFileTaggedConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp65504IsFileTagged is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp65504IsFileTagged() {	 
   		return (substring(getStringValue(),beginIp65504IsFileTagged,beginIp65504IsFileTagged + IP_65504_IS_FILE_TAGGED_LEN));
   	}
         int localIp65504TagTableOffsetCounter = -1;
         public boolean isIp65504TagTableOffsetModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504TagTableOffsetCounter != sharedCounter;
            localIp65504TagTableOffsetCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_TAG_TABLE_OFFSET_LEN = 4;
  	/**
	 * serializeIp65504TagTableOffset
	 */
	protected void serializeIp65504TagTableOffset(int ip65504TagTableOffset) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504TagTableOffset,IP_65504_TAG_TABLE_OFFSET_LEN)
                  ,beginIp65504TagTableOffset
                  ,IP_65504_TAG_TABLE_OFFSET_LEN
                 );
            localIp65504TagTableOffsetCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp65504TagTableOffsetMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp65504TagTableOffset is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp65504TagTableOffset() {	 
			return (getInt(beginIp65504TagTableOffset));
   	}




}
  
