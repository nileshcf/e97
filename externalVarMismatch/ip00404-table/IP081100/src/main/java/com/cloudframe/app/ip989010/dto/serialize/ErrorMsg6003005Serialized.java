package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class ErrorMsg6003005Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ErrorMsg6003005Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ErrorMsg6003005Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ERROR_MSG_6003005_LENGTH = 20;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFileDd6003005;
	
	/**
	* Constructor for ErrorMsg6003005Serialized
	**/
    public ErrorMsg6003005Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ErrorMsg6003005Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ERROR_MSG_6003005_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginFileDd6003005 = getStartOffset() + 5;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localFileDd6003005Counter = -1;
     public boolean isFileDd6003005Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFileDd6003005Counter != sharedCounter;
         localFileDd6003005Counter = sharedCounter; return hasModified;
     }
	protected static final int FILE_DD_6003005_LEN = 6;
	/**
	 * 	serialize this FileDd6003005
	 */
   protected void serializeFileDd6003005(char[] fileDd6003005) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fileDd6003005,0,getStringValue(),beginFileDd6003005,FILE_DD_6003005_LEN);
       localFileDd6003005Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFileDd6003005Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshFileDd6003005 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFileDd6003005() {	 
   		return (substring(getStringValue(),beginFileDd6003005,beginFileDd6003005 + FILE_DD_6003005_LEN));
   	}




}
  
