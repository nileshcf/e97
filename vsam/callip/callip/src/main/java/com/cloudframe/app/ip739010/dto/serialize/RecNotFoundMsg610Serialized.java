package com.cloudframe.app.ip739010.dto.serialize;

/**
*  The class RecNotFoundMsg610Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:56. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RecNotFoundMsg610Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RecNotFoundMsg610Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int REC_NOT_FOUND_MSG_610_LENGTH = 59;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTableId610;
	
	/**
	* Constructor for RecNotFoundMsg610Serialized
	**/
    public RecNotFoundMsg610Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RecNotFoundMsg610Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(REC_NOT_FOUND_MSG_610_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginTableId610 = getStartOffset() + 9;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localTableId610Counter = -1;
     public boolean isTableId610Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTableId610Counter != sharedCounter;
         localTableId610Counter = sharedCounter; return hasModified;
     }
	protected static final int TABLE_ID_610_LEN = 8;
	/**
	 * 	serialize this TableId610
	 */
   protected void serializeTableId610(char[] tableId610) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tableId610,0,getStringValue(),beginTableId610,TABLE_ID_610_LEN);
       localTableId610Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTableId610Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshTableId610 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTableId610() {	 
   		return (substring(getStringValue(),beginTableId610,beginTableId610 + TABLE_ID_610_LEN));
   	}




}
  
