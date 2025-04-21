package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip00724EntryFoundYGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00724EntryFoundYGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00724EntryFoundYGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00724_ENTRY_FOUND_YGROUP_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00724EntryFoundY;
	
	/**
	* Constructor for Ip00724EntryFoundYGroupSerialized
	**/
    public Ip00724EntryFoundYGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip00724EntryFoundYGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00724_ENTRY_FOUND_YGROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp00724EntryFoundY = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp00724EntryFoundYCounter = -1;
     public boolean isIp00724EntryFoundYModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724EntryFoundYCounter != sharedCounter;
         localIp00724EntryFoundYCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_ENTRY_FOUND_Y_LEN = 1;
	/**
	 * 	serialize this Ip00724EntryFoundY
	 */
   protected void serializeIp00724EntryFoundY(char[] ip00724EntryFoundY) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724EntryFoundY,0,getStringValue(),beginIp00724EntryFoundY,IP_00724_ENTRY_FOUND_Y_LEN);
       localIp00724EntryFoundYCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724EntryFoundYConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00724EntryFoundY is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724EntryFoundY() {	 
   		return (substring(getStringValue(),beginIp00724EntryFoundY,beginIp00724EntryFoundY + IP_00724_ENTRY_FOUND_Y_LEN));
   	}




}
  
