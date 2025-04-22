package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class Tbl91OriginalTrlrMsg600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:08. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Tbl91OriginalTrlrMsg600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Tbl91OriginalTrlrMsg600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TBL_91_ORIGINAL_TRLR_MSG_600_LENGTH = 54;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTable91OriginalCount600;
	
	/**
	* Constructor for Tbl91OriginalTrlrMsg600Serialized
	**/
    public Tbl91OriginalTrlrMsg600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Tbl91OriginalTrlrMsg600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TBL_91_ORIGINAL_TRLR_MSG_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginTable91OriginalCount600 = getStartOffset() + 44;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localTable91OriginalCount600Counter = -1;
     public boolean isTable91OriginalCount600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTable91OriginalCount600Counter != sharedCounter;
         localTable91OriginalCount600Counter = sharedCounter; return hasModified;
     }
	protected static final int TABLE_91_ORIGINAL_COUNT_600_LEN = 10;
	/**
	 * 	serialize this Table91OriginalCount600
	 */
   protected void serializeTable91OriginalCount600(char[] table91OriginalCount600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(table91OriginalCount600,0,getStringValue(),beginTable91OriginalCount600,TABLE_91_ORIGINAL_COUNT_600_LEN);
       localTable91OriginalCount600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTable91OriginalCount600Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshTable91OriginalCount600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTable91OriginalCount600() {	 
   		return (substring(getStringValue(),beginTable91OriginalCount600,beginTable91OriginalCount600 + TABLE_91_ORIGINAL_COUNT_600_LEN));
   	}




}
  
