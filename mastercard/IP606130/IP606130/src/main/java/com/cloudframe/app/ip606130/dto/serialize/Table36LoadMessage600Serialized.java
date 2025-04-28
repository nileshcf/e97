package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class Table36LoadMessage600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:54. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Table36LoadMessage600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Table36LoadMessage600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TABLE_36_LOAD_MESSAGE_600_LENGTH = 54;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTable36BslSub600;
	
	/**
	* Constructor for Table36LoadMessage600Serialized
	**/
    public Table36LoadMessage600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Table36LoadMessage600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TABLE_36_LOAD_MESSAGE_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginTable36BslSub600 = getStartOffset() + 44;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localTable36BslSub600Counter = -1;
     public boolean isTable36BslSub600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTable36BslSub600Counter != sharedCounter;
         localTable36BslSub600Counter = sharedCounter; return hasModified;
     }
	protected static final int TABLE_36_BSL_SUB_600_LEN = 10;
	/**
	 * 	serialize this Table36BslSub600
	 */
   protected void serializeTable36BslSub600(char[] table36BslSub600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(table36BslSub600,0,getStringValue(),beginTable36BslSub600,TABLE_36_BSL_SUB_600_LEN);
       localTable36BslSub600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTable36BslSub600Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshTable36BslSub600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTable36BslSub600() {	 
   		return (substring(getStringValue(),beginTable36BslSub600,beginTable36BslSub600 + TABLE_36_BSL_SUB_600_LEN));
   	}




}
  
