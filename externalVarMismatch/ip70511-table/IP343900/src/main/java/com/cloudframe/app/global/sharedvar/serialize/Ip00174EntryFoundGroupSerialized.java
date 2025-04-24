package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip00174EntryFoundGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00174EntryFoundGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00174EntryFoundGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00174_ENTRY_FOUND_GROUP_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00174EntryFound;
	
	/**
	* Constructor for Ip00174EntryFoundGroupSerialized
	**/
    public Ip00174EntryFoundGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip00174EntryFoundGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00174_ENTRY_FOUND_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp00174EntryFound = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp00174EntryFoundCounter = -1;
     public boolean isIp00174EntryFoundModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00174EntryFoundCounter != sharedCounter;
         localIp00174EntryFoundCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00174_ENTRY_FOUND_LEN = 1;
	/**
	 * 	serialize this Ip00174EntryFound
	 */
   protected void serializeIp00174EntryFound(char[] ip00174EntryFound) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00174EntryFound,0,getStringValue(),beginIp00174EntryFound,IP_00174_ENTRY_FOUND_LEN);
       localIp00174EntryFoundCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00174EntryFoundConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00174EntryFound is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00174EntryFound() {	 
   		return (substring(getStringValue(),beginIp00174EntryFound,beginIp00174EntryFound + IP_00174_ENTRY_FOUND_LEN));
   	}




}
  
