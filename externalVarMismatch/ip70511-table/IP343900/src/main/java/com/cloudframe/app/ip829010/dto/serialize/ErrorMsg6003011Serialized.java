package com.cloudframe.app.ip829010.dto.serialize;

/**
*  The class ErrorMsg6003011Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ErrorMsg6003011Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ErrorMsg6003011Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ERROR_MSG_6003011_LENGTH = 45;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFileDd6003011;
            protected  int beginFileStat6003011;
	
	/**
	* Constructor for ErrorMsg6003011Serialized
	**/
    public ErrorMsg6003011Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ErrorMsg6003011Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ERROR_MSG_6003011_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginFileDd6003011 = getStartOffset() + 19;	// set offset for serialization
  
  
             beginFileStat6003011 = getStartOffset() + 43;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFileDd6003011Counter = -1;
     public boolean isFileDd6003011Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFileDd6003011Counter != sharedCounter;
         localFileDd6003011Counter = sharedCounter; return hasModified;
     }
	protected static final int FILE_DD_6003011_LEN = 8;
	/**
	 * 	serialize this FileDd6003011
	 */
   protected void serializeFileDd6003011(char[] fileDd6003011) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fileDd6003011,0,getStringValue(),beginFileDd6003011,FILE_DD_6003011_LEN);
       localFileDd6003011Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFileDd6003011Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshFileDd6003011 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFileDd6003011() {	 
   		return (substring(getStringValue(),beginFileDd6003011,beginFileDd6003011 + FILE_DD_6003011_LEN));
   	}
     int localFileStat6003011Counter = -1;
     public boolean isFileStat6003011Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFileStat6003011Counter != sharedCounter;
         localFileStat6003011Counter = sharedCounter; return hasModified;
     }
	protected static final int FILE_STAT_6003011_LEN = 2;
	/**
	 * 	serialize this FileStat6003011
	 */
   protected void serializeFileStat6003011(char[] fileStat6003011) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fileStat6003011,0,getStringValue(),beginFileStat6003011,FILE_STAT_6003011_LEN);
       localFileStat6003011Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFileStat6003011Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshFileStat6003011 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFileStat6003011() {	 
   		return (substring(getStringValue(),beginFileStat6003011,beginFileStat6003011 + FILE_STAT_6003011_LEN));
   	}




}
  
