package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip00754EntryFoundGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00754EntryFoundGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00754EntryFoundGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00754_ENTRY_FOUND_GROUP_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00754EntryFound;
	
	/**
	* Constructor for Ip00754EntryFoundGroupSerialized
	**/
    public Ip00754EntryFoundGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip00754EntryFoundGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00754_ENTRY_FOUND_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp00754EntryFound = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp00754EntryFoundCounter = -1;
     public boolean isIp00754EntryFoundModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00754EntryFoundCounter != sharedCounter;
         localIp00754EntryFoundCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00754_ENTRY_FOUND_LEN = 1;
	/**
	 * 	serialize this Ip00754EntryFound
	 */
   protected void serializeIp00754EntryFound(char[] ip00754EntryFound) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00754EntryFound,0,getStringValue(),beginIp00754EntryFound,IP_00754_ENTRY_FOUND_LEN);
       localIp00754EntryFoundCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00754EntryFoundConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00754EntryFound is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00754EntryFound() {	 
   		return (substring(getStringValue(),beginIp00754EntryFound,beginIp00754EntryFound + IP_00754_ENTRY_FOUND_LEN));
   	}




}
  
