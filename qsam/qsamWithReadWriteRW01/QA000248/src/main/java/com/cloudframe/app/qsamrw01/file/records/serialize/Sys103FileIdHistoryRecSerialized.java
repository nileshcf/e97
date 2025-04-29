package com.cloudframe.app.qsamrw01.file.records.serialize;

/**
*  The class Sys103FileIdHistoryRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:43. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys103FileIdHistoryRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys103FileIdHistoryRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_103_FILE_ID_HISTORY_REC_LENGTH = 1020;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys103FileIdHistoryRecString;
	
	/**
	* Constructor for Sys103FileIdHistoryRecSerialized
	**/
    public Sys103FileIdHistoryRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys103FileIdHistoryRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_103_FILE_ID_HISTORY_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys103FileIdHistoryRecString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys103FileIdHistoryRecStringCounter = -1;
     public boolean isSys103FileIdHistoryRecStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys103FileIdHistoryRecStringCounter != sharedCounter;
         localSys103FileIdHistoryRecStringCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_103_FILE_ID_HISTORY_REC_STRING_LEN = 1020;
	/**
	 * 	serialize this Sys103FileIdHistoryRecString
	 */
   protected void serializeSys103FileIdHistoryRecString(char[] sys103FileIdHistoryRecString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys103FileIdHistoryRecString,0,getStringValue(),beginSys103FileIdHistoryRecString,SYS_103_FILE_ID_HISTORY_REC_STRING_LEN);
       localSys103FileIdHistoryRecStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys103FileIdHistoryRecStringConstraints(char[] value) {
   			return super.checkConstraints(value , 1020 ,false, false);
   }
    /**
	 *	refreshSys103FileIdHistoryRecString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys103FileIdHistoryRecString() {	 
   		return (substring(getStringValue(),beginSys103FileIdHistoryRecString,beginSys103FileIdHistoryRecString + SYS_103_FILE_ID_HISTORY_REC_STRING_LEN));
   	}




}
  
