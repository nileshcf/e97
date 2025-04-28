package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class WsaWhenCompiledSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WsaWhenCompiledSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WsaWhenCompiledSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSA_WHEN_COMPILED_LENGTH = 20;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWsaCompiledDate;
            protected  int beginWsaCompiledTime;
	
	/**
	* Constructor for WsaWhenCompiledSerialized
	**/
    public WsaWhenCompiledSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WsaWhenCompiledSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSA_WHEN_COMPILED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWsaCompiledDate = getStartOffset() + 0;	// set offset for serialization
  
             beginWsaCompiledTime = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWsaCompiledDateCounter = -1;
     public boolean isWsaCompiledDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsaCompiledDateCounter != sharedCounter;
         localWsaCompiledDateCounter = sharedCounter; return hasModified;
     }
	protected static final int WSA_COMPILED_DATE_LEN = 8;
	/**
	 * 	serialize this WsaCompiledDate
	 */
   protected void serializeWsaCompiledDate(char[] wsaCompiledDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wsaCompiledDate,0,getStringValue(),beginWsaCompiledDate,WSA_COMPILED_DATE_LEN);
       localWsaCompiledDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWsaCompiledDateConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshWsaCompiledDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWsaCompiledDate() {	 
   		return (substring(getStringValue(),beginWsaCompiledDate,beginWsaCompiledDate + WSA_COMPILED_DATE_LEN));
   	}
     int localWsaCompiledTimeCounter = -1;
     public boolean isWsaCompiledTimeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsaCompiledTimeCounter != sharedCounter;
         localWsaCompiledTimeCounter = sharedCounter; return hasModified;
     }
	protected static final int WSA_COMPILED_TIME_LEN = 12;
	/**
	 * 	serialize this WsaCompiledTime
	 */
   protected void serializeWsaCompiledTime(char[] wsaCompiledTime) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wsaCompiledTime,0,getStringValue(),beginWsaCompiledTime,WSA_COMPILED_TIME_LEN);
       localWsaCompiledTimeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWsaCompiledTimeConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshWsaCompiledTime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWsaCompiledTime() {	 
   		return (substring(getStringValue(),beginWsaCompiledTime,beginWsaCompiledTime + WSA_COMPILED_TIME_LEN));
   	}




}
  
