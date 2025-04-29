package com.cloudframe.app.sf320010.file.records.serialize;

/**
*  The class FdInfoSecFileOutRcdSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FdInfoSecFileOutRcdSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FdInfoSecFileOutRcdSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FD_INFO_SEC_FILE_OUT_RCD_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFdInfoSecFileOutRcdString;
	
	/**
	* Constructor for FdInfoSecFileOutRcdSerialized
	**/
    public FdInfoSecFileOutRcdSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FdInfoSecFileOutRcdSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FD_INFO_SEC_FILE_OUT_RCD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFdInfoSecFileOutRcdString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFdInfoSecFileOutRcdStringCounter = -1;
     public boolean isFdInfoSecFileOutRcdStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFdInfoSecFileOutRcdStringCounter != sharedCounter;
         localFdInfoSecFileOutRcdStringCounter = sharedCounter; return hasModified;
     }
	protected static final int FD_INFO_SEC_FILE_OUT_RCD_STRING_LEN = 80;
	/**
	 * 	serialize this FdInfoSecFileOutRcdString
	 */
   protected void serializeFdInfoSecFileOutRcdString(char[] fdInfoSecFileOutRcdString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fdInfoSecFileOutRcdString,0,getStringValue(),beginFdInfoSecFileOutRcdString,FD_INFO_SEC_FILE_OUT_RCD_STRING_LEN);
       localFdInfoSecFileOutRcdStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFdInfoSecFileOutRcdStringConstraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
    /**
	 *	refreshFdInfoSecFileOutRcdString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFdInfoSecFileOutRcdString() {	 
   		return (substring(getStringValue(),beginFdInfoSecFileOutRcdString,beginFdInfoSecFileOutRcdString + FD_INFO_SEC_FILE_OUT_RCD_STRING_LEN));
   	}




}
  
