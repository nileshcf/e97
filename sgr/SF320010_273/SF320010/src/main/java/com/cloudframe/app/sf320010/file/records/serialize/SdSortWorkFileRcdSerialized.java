package com.cloudframe.app.sf320010.file.records.serialize;

/**
*  The class SdSortWorkFileRcdSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:08. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SdSortWorkFileRcdSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SdSortWorkFileRcdSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SD_SORT_WORK_FILE_RCD_LENGTH = 336;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSdSortClass;
	
	/**
	* Constructor for SdSortWorkFileRcdSerialized
	**/
    public SdSortWorkFileRcdSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SdSortWorkFileRcdSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SD_SORT_WORK_FILE_RCD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginSdSortClass = getStartOffset() + 17;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localSdSortClassCounter = -1;
     public boolean isSdSortClassModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSdSortClassCounter != sharedCounter;
         localSdSortClassCounter = sharedCounter; return hasModified;
     }
	protected static final int SD_SORT_CLASS_LEN = 1;
	/**
	 * 	serialize this SdSortClass
	 */
   protected void serializeSdSortClass(char[] sdSortClass) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sdSortClass,0,getStringValue(),beginSdSortClass,SD_SORT_CLASS_LEN);
       localSdSortClassCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSdSortClassConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSdSortClass is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSdSortClass() {	 
   		return (substring(getStringValue(),beginSdSortClass,beginSdSortClass + SD_SORT_CLASS_LEN));
   	}




}
  
