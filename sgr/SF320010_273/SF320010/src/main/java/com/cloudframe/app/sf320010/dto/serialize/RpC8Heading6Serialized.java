package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class RpC8Heading6Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RpC8Heading6Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RpC8Heading6Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RP_C_8_HEADING_6_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRpC8H6Alert;
            protected  int beginRpC8H6MsgArea;
	
	/**
	* Constructor for RpC8Heading6Serialized
	**/
    public RpC8Heading6Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RpC8Heading6Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RP_C_8_HEADING_6_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginRpC8H6Alert = getStartOffset() + 7;	// set offset for serialization
  
  
  
             beginRpC8H6MsgArea = getStartOffset() + 53;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRpC8H6AlertCounter = -1;
     public boolean isRpC8H6AlertModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC8H6AlertCounter != sharedCounter;
         localRpC8H6AlertCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_C_8_H_6_ALERT_LEN = 8;
	/**
	 * 	serialize this RpC8H6Alert
	 */
   protected void serializeRpC8H6Alert(char[] rpC8H6Alert) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpC8H6Alert,0,getStringValue(),beginRpC8H6Alert,RP_C_8_H_6_ALERT_LEN);
       localRpC8H6AlertCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpC8H6AlertConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshRpC8H6Alert is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpC8H6Alert() {	 
   		return (substring(getStringValue(),beginRpC8H6Alert,beginRpC8H6Alert + RP_C_8_H_6_ALERT_LEN));
   	}
     int localRpC8H6MsgAreaCounter = -1;
     public boolean isRpC8H6MsgAreaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC8H6MsgAreaCounter != sharedCounter;
         localRpC8H6MsgAreaCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_C_8_H_6_MSG_AREA_LEN = 80;
	/**
	 * 	serialize this RpC8H6MsgArea
	 */
   protected void serializeRpC8H6MsgArea(char[] rpC8H6MsgArea) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpC8H6MsgArea,0,getStringValue(),beginRpC8H6MsgArea,RP_C_8_H_6_MSG_AREA_LEN);
       localRpC8H6MsgAreaCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpC8H6MsgAreaConstraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
    /**
	 *	refreshRpC8H6MsgArea is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpC8H6MsgArea() {	 
   		return (substring(getStringValue(),beginRpC8H6MsgArea,beginRpC8H6MsgArea + RP_C_8_H_6_MSG_AREA_LEN));
   	}




}
  
