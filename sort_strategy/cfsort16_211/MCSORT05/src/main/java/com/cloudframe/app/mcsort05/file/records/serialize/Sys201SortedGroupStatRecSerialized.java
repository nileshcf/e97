package com.cloudframe.app.mcsort05.file.records.serialize;

/**
*  The class Sys201SortedGroupStatRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:02. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys201SortedGroupStatRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys201SortedGroupStatRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_201_SORTED_GROUP_STAT_REC_LENGTH = 2000;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys201SortedGroupStatRecString;
	
	/**
	* Constructor for Sys201SortedGroupStatRecSerialized
	**/
    public Sys201SortedGroupStatRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys201SortedGroupStatRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_201_SORTED_GROUP_STAT_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys201SortedGroupStatRecString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys201SortedGroupStatRecStringCounter = -1;
     public boolean isSys201SortedGroupStatRecStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys201SortedGroupStatRecStringCounter != sharedCounter;
         localSys201SortedGroupStatRecStringCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_201_SORTED_GROUP_STAT_REC_STRING_LEN = 2000;
	/**
	 * 	serialize this Sys201SortedGroupStatRecString
	 */
   protected void serializeSys201SortedGroupStatRecString(char[] sys201SortedGroupStatRecString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys201SortedGroupStatRecString,0,getStringValue(),beginSys201SortedGroupStatRecString,SYS_201_SORTED_GROUP_STAT_REC_STRING_LEN);
       localSys201SortedGroupStatRecStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys201SortedGroupStatRecStringConstraints(char[] value) {
   			return super.checkConstraints(value , 2000 ,false, false);
   }
    /**
	 *	refreshSys201SortedGroupStatRecString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys201SortedGroupStatRecString() {	 
   		return (substring(getStringValue(),beginSys201SortedGroupStatRecString,beginSys201SortedGroupStatRecString + SYS_201_SORTED_GROUP_STAT_REC_STRING_LEN));
   	}




}
  
