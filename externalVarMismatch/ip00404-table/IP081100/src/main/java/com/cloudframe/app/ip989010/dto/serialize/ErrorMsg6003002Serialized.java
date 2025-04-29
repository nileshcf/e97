package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class ErrorMsg6003002Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ErrorMsg6003002Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ErrorMsg6003002Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ERROR_MSG_6003002_LENGTH = 49;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFileDd6003002;
            protected  int beginFileStat6003002;
	
	/**
	* Constructor for ErrorMsg6003002Serialized
	**/
    public ErrorMsg6003002Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ErrorMsg6003002Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ERROR_MSG_6003002_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginFileDd6003002 = getStartOffset() + 25;	// set offset for serialization
  
  
             beginFileStat6003002 = getStartOffset() + 47;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFileDd6003002Counter = -1;
     public boolean isFileDd6003002Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFileDd6003002Counter != sharedCounter;
         localFileDd6003002Counter = sharedCounter; return hasModified;
     }
	protected static final int FILE_DD_6003002_LEN = 6;
	/**
	 * 	serialize this FileDd6003002
	 */
   protected void serializeFileDd6003002(char[] fileDd6003002) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fileDd6003002,0,getStringValue(),beginFileDd6003002,FILE_DD_6003002_LEN);
       localFileDd6003002Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFileDd6003002Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshFileDd6003002 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFileDd6003002() {	 
   		return (substring(getStringValue(),beginFileDd6003002,beginFileDd6003002 + FILE_DD_6003002_LEN));
   	}
     int localFileStat6003002Counter = -1;
     public boolean isFileStat6003002Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFileStat6003002Counter != sharedCounter;
         localFileStat6003002Counter = sharedCounter; return hasModified;
     }
	protected static final int FILE_STAT_6003002_LEN = 2;
	/**
	 * 	serialize this FileStat6003002
	 */
   protected void serializeFileStat6003002(char[] fileStat6003002) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fileStat6003002,0,getStringValue(),beginFileStat6003002,FILE_STAT_6003002_LEN);
       localFileStat6003002Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFileStat6003002Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshFileStat6003002 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFileStat6003002() {	 
   		return (substring(getStringValue(),beginFileStat6003002,beginFileStat6003002 + FILE_STAT_6003002_LEN));
   	}




}
  
