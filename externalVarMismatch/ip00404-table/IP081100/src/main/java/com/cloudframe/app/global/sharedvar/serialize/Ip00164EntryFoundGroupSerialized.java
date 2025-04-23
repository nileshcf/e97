package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip00164EntryFoundGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:30. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00164EntryFoundGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00164EntryFoundGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00164_ENTRY_FOUND_GROUP_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00164EntryFound;
	
	/**
	* Constructor for Ip00164EntryFoundGroupSerialized
	**/
    public Ip00164EntryFoundGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip00164EntryFoundGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00164_ENTRY_FOUND_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp00164EntryFound = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp00164EntryFoundCounter = -1;
     public boolean isIp00164EntryFoundModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00164EntryFoundCounter != sharedCounter;
         localIp00164EntryFoundCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00164_ENTRY_FOUND_LEN = 1;
	/**
	 * 	serialize this Ip00164EntryFound
	 */
   protected void serializeIp00164EntryFound(char[] ip00164EntryFound) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00164EntryFound,0,getStringValue(),beginIp00164EntryFound,IP_00164_ENTRY_FOUND_LEN);
       localIp00164EntryFoundCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00164EntryFoundConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00164EntryFound is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00164EntryFound() {	 
   		return (substring(getStringValue(),beginIp00164EntryFound,beginIp00164EntryFound + IP_00164_ENTRY_FOUND_LEN));
   	}




}
  
