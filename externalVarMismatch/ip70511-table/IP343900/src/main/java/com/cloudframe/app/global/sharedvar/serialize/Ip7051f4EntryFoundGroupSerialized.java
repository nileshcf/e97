package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip7051f4EntryFoundGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:02. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip7051f4EntryFoundGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip7051f4EntryFoundGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_7051F_4_ENTRY_FOUND_GROUP_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp7051f4EntryFound;
	
	/**
	* Constructor for Ip7051f4EntryFoundGroupSerialized
	**/
    public Ip7051f4EntryFoundGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip7051f4EntryFoundGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_7051F_4_ENTRY_FOUND_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp7051f4EntryFound = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp7051f4EntryFoundCounter = -1;
     public boolean isIp7051f4EntryFoundModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7051f4EntryFoundCounter != sharedCounter;
         localIp7051f4EntryFoundCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7051F_4_ENTRY_FOUND_LEN = 1;
	/**
	 * 	serialize this Ip7051f4EntryFound
	 */
   protected void serializeIp7051f4EntryFound(char[] ip7051f4EntryFound) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7051f4EntryFound,0,getStringValue(),beginIp7051f4EntryFound,IP_7051F_4_ENTRY_FOUND_LEN);
       localIp7051f4EntryFoundCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7051f4EntryFoundConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp7051f4EntryFound is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7051f4EntryFound() {	 
   		return (substring(getStringValue(),beginIp7051f4EntryFound,beginIp7051f4EntryFound + IP_7051F_4_ENTRY_FOUND_LEN));
   	}




}
  
