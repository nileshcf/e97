package com.cloudframe.app.ip299010.dto.serialize;

/**
*  The class Table5Key1800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Table5Key1800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Table5Key1800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TABLE_5_KEY_1800_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTableId800;
	
	/**
	* Constructor for Table5Key1800Serialized
	**/
    public Table5Key1800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Table5Key1800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TABLE_5_KEY_1800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTableId800 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localTableId800Counter = -1;
     public boolean isTableId800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTableId800Counter != sharedCounter;
         localTableId800Counter = sharedCounter; return hasModified;
     }
	protected static final int TABLE_ID_800_LEN = 8;
	/**
	 * 	serialize this TableId800
	 */
   protected void serializeTableId800(char[] tableId800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tableId800,0,getStringValue(),beginTableId800,TABLE_ID_800_LEN);
       localTableId800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTableId800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshTableId800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTableId800() {	 
   		return (substring(getStringValue(),beginTableId800,beginTableId800 + TABLE_ID_800_LEN));
   	}




}
  
