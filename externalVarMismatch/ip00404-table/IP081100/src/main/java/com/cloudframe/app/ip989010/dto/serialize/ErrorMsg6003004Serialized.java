package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class ErrorMsg6003004Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ErrorMsg6003004Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ErrorMsg6003004Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ERROR_MSG_6003004_LENGTH = 54;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFileDd6003004;
            protected  int beginFileStat6003004;
	
	/**
	* Constructor for ErrorMsg6003004Serialized
	**/
    public ErrorMsg6003004Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ErrorMsg6003004Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ERROR_MSG_6003004_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginFileDd6003004 = getStartOffset() + 30;	// set offset for serialization
  
  
             beginFileStat6003004 = getStartOffset() + 52;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFileDd6003004Counter = -1;
     public boolean isFileDd6003004Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFileDd6003004Counter != sharedCounter;
         localFileDd6003004Counter = sharedCounter; return hasModified;
     }
	protected static final int FILE_DD_6003004_LEN = 6;
	/**
	 * 	serialize this FileDd6003004
	 */
   protected void serializeFileDd6003004(char[] fileDd6003004) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fileDd6003004,0,getStringValue(),beginFileDd6003004,FILE_DD_6003004_LEN);
       localFileDd6003004Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFileDd6003004Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshFileDd6003004 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFileDd6003004() {	 
   		return (substring(getStringValue(),beginFileDd6003004,beginFileDd6003004 + FILE_DD_6003004_LEN));
   	}
     int localFileStat6003004Counter = -1;
     public boolean isFileStat6003004Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFileStat6003004Counter != sharedCounter;
         localFileStat6003004Counter = sharedCounter; return hasModified;
     }
	protected static final int FILE_STAT_6003004_LEN = 2;
	/**
	 * 	serialize this FileStat6003004
	 */
   protected void serializeFileStat6003004(char[] fileStat6003004) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fileStat6003004,0,getStringValue(),beginFileStat6003004,FILE_STAT_6003004_LEN);
       localFileStat6003004Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFileStat6003004Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshFileStat6003004 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFileStat6003004() {	 
   		return (substring(getStringValue(),beginFileStat6003004,beginFileStat6003004 + FILE_STAT_6003004_LEN));
   	}




}
  
