package com.cloudframe.app.tmsmmcpy.file.records.serialize;

/**
*  The class SortRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:53. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SortRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SortRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SORT_RECORD_LENGTH = 4000;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSortKey01;
	
	/**
	* Constructor for SortRecordSerialized
	**/
    public SortRecordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SortRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SORT_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSortKey01 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSortKey01Counter = -1;
     public boolean isSortKey01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSortKey01Counter != sharedCounter;
         localSortKey01Counter = sharedCounter; return hasModified;
     }
	protected static final int SORT_KEY_01_LEN = 100;
	/**
	 * 	serialize this SortKey01
	 */
   protected void serializeSortKey01(char[] sortKey01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sortKey01,0,getStringValue(),beginSortKey01,SORT_KEY_01_LEN);
       localSortKey01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSortKey01Constraints(char[] value) {
   			return super.checkConstraints(value , 100 ,false, false);
   }
    /**
	 *	refreshSortKey01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSortKey01() {	 
   		return (substring(getStringValue(),beginSortKey01,beginSortKey01 + SORT_KEY_01_LEN));
   	}




}
  
