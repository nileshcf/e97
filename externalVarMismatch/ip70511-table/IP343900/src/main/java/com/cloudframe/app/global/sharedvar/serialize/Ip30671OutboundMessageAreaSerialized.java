package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip30671OutboundMessageAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip30671OutboundMessageAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip30671OutboundMessageAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_30671_OUTBOUND_MESSAGE_AREA_LENGTH = 32756;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp30671SortKey;
            protected  int beginIp30671MessageArea;
	
	/**
	* Constructor for Ip30671OutboundMessageAreaSerialized
	**/
    public Ip30671OutboundMessageAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip30671OutboundMessageAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_30671_OUTBOUND_MESSAGE_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp30671SortKey = getStartOffset() + 0;	// set offset for serialization
  
             beginIp30671MessageArea = getStartOffset() + 212;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp30671SortKeyCounter = -1;
     public boolean isIp30671SortKeyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp30671SortKeyCounter != sharedCounter;
         localIp30671SortKeyCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_30671_SORT_KEY_LEN = 212;
	/**
	 * 	serialize this Ip30671SortKey
	 */
   protected void serializeIp30671SortKey(char[] ip30671SortKey) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip30671SortKey,0,getStringValue(),beginIp30671SortKey,IP_30671_SORT_KEY_LEN);
       localIp30671SortKeyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp30671SortKeyConstraints(char[] value) {
   			return super.checkConstraints(value , 212 ,false, false);
   }
    /**
	 *	refreshIp30671SortKey is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp30671SortKey() {	 
   		return (substring(getStringValue(),beginIp30671SortKey,beginIp30671SortKey + IP_30671_SORT_KEY_LEN));
   	}
     int localIp30671MessageAreaCounter = -1;
     public boolean isIp30671MessageAreaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp30671MessageAreaCounter != sharedCounter;
         localIp30671MessageAreaCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_30671_MESSAGE_AREA_LEN = 32544;
	/**
	 * 	serialize this Ip30671MessageArea
	 */
   protected void serializeIp30671MessageArea(char[] ip30671MessageArea) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip30671MessageArea,0,getStringValue(),beginIp30671MessageArea,IP_30671_MESSAGE_AREA_LEN);
       localIp30671MessageAreaCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp30671MessageAreaConstraints(char[] value) {
   			return super.checkConstraints(value , 32544 ,false, false);
   }
    /**
	 *	refreshIp30671MessageArea is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp30671MessageArea() {	 
   		return (substring(getStringValue(),beginIp30671MessageArea,beginIp30671MessageArea + IP_30671_MESSAGE_AREA_LEN));
   	}




}
  
