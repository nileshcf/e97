package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class Tbl91UpdatedTrlrMsg600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Tbl91UpdatedTrlrMsg600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Tbl91UpdatedTrlrMsg600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TBL_91_UPDATED_TRLR_MSG_600_LENGTH = 54;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTable91UpdateCount600;
	
	/**
	* Constructor for Tbl91UpdatedTrlrMsg600Serialized
	**/
    public Tbl91UpdatedTrlrMsg600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Tbl91UpdatedTrlrMsg600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TBL_91_UPDATED_TRLR_MSG_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginTable91UpdateCount600 = getStartOffset() + 44;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localTable91UpdateCount600Counter = -1;
     public boolean isTable91UpdateCount600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTable91UpdateCount600Counter != sharedCounter;
         localTable91UpdateCount600Counter = sharedCounter; return hasModified;
     }
	protected static final int TABLE_91_UPDATE_COUNT_600_LEN = 10;
	/**
	 * 	serialize this Table91UpdateCount600
	 */
   protected void serializeTable91UpdateCount600(char[] table91UpdateCount600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(table91UpdateCount600,0,getStringValue(),beginTable91UpdateCount600,TABLE_91_UPDATE_COUNT_600_LEN);
       localTable91UpdateCount600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTable91UpdateCount600Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshTable91UpdateCount600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTable91UpdateCount600() {	 
   		return (substring(getStringValue(),beginTable91UpdateCount600,beginTable91UpdateCount600 + TABLE_91_UPDATE_COUNT_600_LEN));
   	}




}
  
