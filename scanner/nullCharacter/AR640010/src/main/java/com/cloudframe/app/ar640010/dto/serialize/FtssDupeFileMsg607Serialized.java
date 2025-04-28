package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class FtssDupeFileMsg607Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:11. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FtssDupeFileMsg607Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FtssDupeFileMsg607Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FTSS_DUPE_FILE_MSG_607_LENGTH = 75;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFtssDupeFileId607;
	
	/**
	* Constructor for FtssDupeFileMsg607Serialized
	**/
    public FtssDupeFileMsg607Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FtssDupeFileMsg607Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FTSS_DUPE_FILE_MSG_607_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginFtssDupeFileId607 = getStartOffset() + 42;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localFtssDupeFileId607Counter = -1;
     public boolean isFtssDupeFileId607Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFtssDupeFileId607Counter != sharedCounter;
         localFtssDupeFileId607Counter = sharedCounter; return hasModified;
     }
	protected static final int FTSS_DUPE_FILE_ID_607_LEN = 14;
	/**
	 * 	serialize this FtssDupeFileId607
	 */
   protected void serializeFtssDupeFileId607(char[] ftssDupeFileId607) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ftssDupeFileId607,0,getStringValue(),beginFtssDupeFileId607,FTSS_DUPE_FILE_ID_607_LEN);
       localFtssDupeFileId607Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFtssDupeFileId607Constraints(char[] value) {
   			return super.checkConstraints(value , 14 ,false, false);
   }
    /**
	 *	refreshFtssDupeFileId607 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFtssDupeFileId607() {	 
   		return (substring(getStringValue(),beginFtssDupeFileId607,beginFtssDupeFileId607 + FTSS_DUPE_FILE_ID_607_LEN));
   	}




}
  
