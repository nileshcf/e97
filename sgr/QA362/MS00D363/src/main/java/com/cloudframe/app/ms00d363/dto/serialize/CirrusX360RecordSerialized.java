package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class CirrusX360RecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CirrusX360RecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CirrusX360RecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CIRRUS_X_360_RECORD_LENGTH = 1400;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginX360RecordType;
	
	/**
	* Constructor for CirrusX360RecordSerialized
	**/
    public CirrusX360RecordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in CirrusX360RecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CIRRUS_X_360_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginX360RecordType = getStartOffset() + 0;	// set offset for serialization
  
  
  
	   /*  end of offset */
	}
     int localX360RecordTypeCounter = -1;
     public boolean isX360RecordTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360RecordTypeCounter != sharedCounter;
         localX360RecordTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int X_360_RECORD_TYPE_LEN = 1;
	/**
	 * 	serialize this X360RecordType
	 */
   protected void serializeX360RecordType(char[] x360RecordType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360RecordType,0,getStringValue(),beginX360RecordType,X_360_RECORD_TYPE_LEN);
       localX360RecordTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360RecordTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshX360RecordType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360RecordType() {	 
   		return (substring(getStringValue(),beginX360RecordType,beginX360RecordType + X_360_RECORD_TYPE_LEN));
   	}




}
  
