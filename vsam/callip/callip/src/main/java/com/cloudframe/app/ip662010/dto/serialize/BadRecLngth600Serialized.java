package com.cloudframe.app.ip662010.dto.serialize;

/**
*  The class BadRecLngth600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:21. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BadRecLngth600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BadRecLngth600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BAD_REC_LNGTH_600_LENGTH = 64;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginParsedLngth600;
            protected  int beginRdwLngth600;
	
	/**
	* Constructor for BadRecLngth600Serialized
	**/
    public BadRecLngth600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BadRecLngth600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BAD_REC_LNGTH_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginParsedLngth600 = getStartOffset() + 20;	// set offset for serialization
  
  
             beginRdwLngth600 = getStartOffset() + 56;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localParsedLngth600Counter = -1;
     public boolean isParsedLngth600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParsedLngth600Counter != sharedCounter;
         localParsedLngth600Counter = sharedCounter; return hasModified;
     }
	protected static final int PARSED_LNGTH_600_LEN = 6;
	/**
	 * 	serialize this ParsedLngth600
	 */
   protected void serializeParsedLngth600(char[] parsedLngth600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(parsedLngth600,0,getStringValue(),beginParsedLngth600,PARSED_LNGTH_600_LEN);
       localParsedLngth600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkParsedLngth600Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshParsedLngth600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshParsedLngth600() {	 
   		return (substring(getStringValue(),beginParsedLngth600,beginParsedLngth600 + PARSED_LNGTH_600_LEN));
   	}
     int localRdwLngth600Counter = -1;
     public boolean isRdwLngth600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRdwLngth600Counter != sharedCounter;
         localRdwLngth600Counter = sharedCounter; return hasModified;
     }
	protected static final int RDW_LNGTH_600_LEN = 6;
	/**
	 * 	serialize this RdwLngth600
	 */
   protected void serializeRdwLngth600(char[] rdwLngth600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rdwLngth600,0,getStringValue(),beginRdwLngth600,RDW_LNGTH_600_LEN);
       localRdwLngth600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRdwLngth600Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshRdwLngth600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRdwLngth600() {	 
   		return (substring(getStringValue(),beginRdwLngth600,beginRdwLngth600 + RDW_LNGTH_600_LEN));
   	}




}
  
