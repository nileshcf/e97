package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip00694EntryFoundGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00694EntryFoundGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00694EntryFoundGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00694_ENTRY_FOUND_GROUP_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00694EntryFound;
	
	/**
	* Constructor for Ip00694EntryFoundGroupSerialized
	**/
    public Ip00694EntryFoundGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip00694EntryFoundGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00694_ENTRY_FOUND_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp00694EntryFound = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp00694EntryFoundCounter = -1;
     public boolean isIp00694EntryFoundModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00694EntryFoundCounter != sharedCounter;
         localIp00694EntryFoundCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00694_ENTRY_FOUND_LEN = 1;
	/**
	 * 	serialize this Ip00694EntryFound
	 */
   protected void serializeIp00694EntryFound(char[] ip00694EntryFound) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00694EntryFound,0,getStringValue(),beginIp00694EntryFound,IP_00694_ENTRY_FOUND_LEN);
       localIp00694EntryFoundCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00694EntryFoundConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00694EntryFound is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00694EntryFound() {	 
   		return (substring(getStringValue(),beginIp00694EntryFound,beginIp00694EntryFound + IP_00694_ENTRY_FOUND_LEN));
   	}




}
  
