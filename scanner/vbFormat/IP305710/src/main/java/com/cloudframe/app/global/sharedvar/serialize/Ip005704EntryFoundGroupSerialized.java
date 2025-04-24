package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip005704EntryFoundGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:47. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip005704EntryFoundGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip005704EntryFoundGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_005704_ENTRY_FOUND_GROUP_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp005704EntryFound;
	
	/**
	* Constructor for Ip005704EntryFoundGroupSerialized
	**/
    public Ip005704EntryFoundGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip005704EntryFoundGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_005704_ENTRY_FOUND_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp005704EntryFound = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp005704EntryFoundCounter = -1;
     public boolean isIp005704EntryFoundModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp005704EntryFoundCounter != sharedCounter;
         localIp005704EntryFoundCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_005704_ENTRY_FOUND_LEN = 1;
	/**
	 * 	serialize this Ip005704EntryFound
	 */
   protected void serializeIp005704EntryFound(char[] ip005704EntryFound) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip005704EntryFound,0,getStringValue(),beginIp005704EntryFound,IP_005704_ENTRY_FOUND_LEN);
       localIp005704EntryFoundCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp005704EntryFoundConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp005704EntryFound is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp005704EntryFound() {	 
   		return (substring(getStringValue(),beginIp005704EntryFound,beginIp005704EntryFound + IP_005704_ENTRY_FOUND_LEN));
   	}




}
  
