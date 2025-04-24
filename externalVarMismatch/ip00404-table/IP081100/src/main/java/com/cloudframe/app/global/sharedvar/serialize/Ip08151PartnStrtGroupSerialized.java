package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip08151PartnStrtGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip08151PartnStrtGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip08151PartnStrtGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_08151_PARTN_STRT_GROUP_LENGTH = 3;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp08151PartnStrt;
	
	/**
	* Constructor for Ip08151PartnStrtGroupSerialized
	**/
    public Ip08151PartnStrtGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip08151PartnStrtGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_08151_PARTN_STRT_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp08151PartnStrt = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp08151PartnStrtCounter = -1;
     public boolean isIp08151PartnStrtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp08151PartnStrtCounter != sharedCounter;
         localIp08151PartnStrtCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_08151_PARTN_STRT_LEN = 3;
	/**
	 * 	serialize this Ip08151PartnStrt
	 */
   protected void serializeIp08151PartnStrt(char[] ip08151PartnStrt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip08151PartnStrt,0,getStringValue(),beginIp08151PartnStrt,IP_08151_PARTN_STRT_LEN);
       localIp08151PartnStrtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp08151PartnStrtConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp08151PartnStrt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp08151PartnStrt() {	 
   		return (substring(getStringValue(),beginIp08151PartnStrt,beginIp08151PartnStrt + IP_08151_PARTN_STRT_LEN));
   	}




}
  
