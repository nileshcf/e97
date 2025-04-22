package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class Tbl90UpdatedTrlrMsg600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:08. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Tbl90UpdatedTrlrMsg600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Tbl90UpdatedTrlrMsg600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TBL_90_UPDATED_TRLR_MSG_600_LENGTH = 54;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTable90UpdateCount600;
	
	/**
	* Constructor for Tbl90UpdatedTrlrMsg600Serialized
	**/
    public Tbl90UpdatedTrlrMsg600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Tbl90UpdatedTrlrMsg600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TBL_90_UPDATED_TRLR_MSG_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginTable90UpdateCount600 = getStartOffset() + 44;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localTable90UpdateCount600Counter = -1;
     public boolean isTable90UpdateCount600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTable90UpdateCount600Counter != sharedCounter;
         localTable90UpdateCount600Counter = sharedCounter; return hasModified;
     }
	protected static final int TABLE_90_UPDATE_COUNT_600_LEN = 10;
	/**
	 * 	serialize this Table90UpdateCount600
	 */
   protected void serializeTable90UpdateCount600(char[] table90UpdateCount600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(table90UpdateCount600,0,getStringValue(),beginTable90UpdateCount600,TABLE_90_UPDATE_COUNT_600_LEN);
       localTable90UpdateCount600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTable90UpdateCount600Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshTable90UpdateCount600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTable90UpdateCount600() {	 
   		return (substring(getStringValue(),beginTable90UpdateCount600,beginTable90UpdateCount600 + TABLE_90_UPDATE_COUNT_600_LEN));
   	}




}
  
