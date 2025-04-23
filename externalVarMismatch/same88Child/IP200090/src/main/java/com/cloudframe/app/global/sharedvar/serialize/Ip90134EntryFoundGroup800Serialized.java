package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip90134EntryFoundGroup800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip90134EntryFoundGroup800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip90134EntryFoundGroup800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_90134_ENTRY_FOUND_GROUP_800_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp90134EntryFound800;
	
	/**
	* Constructor for Ip90134EntryFoundGroup800Serialized
	**/
    public Ip90134EntryFoundGroup800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip90134EntryFoundGroup800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_90134_ENTRY_FOUND_GROUP_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp90134EntryFound800 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp90134EntryFound800Counter = -1;
     public boolean isIp90134EntryFound800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp90134EntryFound800Counter != sharedCounter;
         localIp90134EntryFound800Counter = sharedCounter; return hasModified;
     }
	protected static final int IP_90134_ENTRY_FOUND_800_LEN = 1;
	/**
	 * 	serialize this Ip90134EntryFound800
	 */
   protected void serializeIp90134EntryFound800(char[] ip90134EntryFound800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip90134EntryFound800,0,getStringValue(),beginIp90134EntryFound800,IP_90134_ENTRY_FOUND_800_LEN);
       localIp90134EntryFound800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp90134EntryFound800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp90134EntryFound800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp90134EntryFound800() {	 
   		return (substring(getStringValue(),beginIp90134EntryFound800,beginIp90134EntryFound800 + IP_90134_ENTRY_FOUND_800_LEN));
   	}




}
  
