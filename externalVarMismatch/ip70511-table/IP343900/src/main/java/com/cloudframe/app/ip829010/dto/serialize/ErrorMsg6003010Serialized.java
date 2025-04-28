package com.cloudframe.app.ip829010.dto.serialize;

/**
*  The class ErrorMsg6003010Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ErrorMsg6003010Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ErrorMsg6003010Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ERROR_MSG_6003010_LENGTH = 45;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFileDd6003010;
            protected  int beginFileStat6003010;
	
	/**
	* Constructor for ErrorMsg6003010Serialized
	**/
    public ErrorMsg6003010Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ErrorMsg6003010Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ERROR_MSG_6003010_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginFileDd6003010 = getStartOffset() + 19;	// set offset for serialization
  
  
             beginFileStat6003010 = getStartOffset() + 43;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFileDd6003010Counter = -1;
     public boolean isFileDd6003010Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFileDd6003010Counter != sharedCounter;
         localFileDd6003010Counter = sharedCounter; return hasModified;
     }
	protected static final int FILE_DD_6003010_LEN = 8;
	/**
	 * 	serialize this FileDd6003010
	 */
   protected void serializeFileDd6003010(char[] fileDd6003010) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fileDd6003010,0,getStringValue(),beginFileDd6003010,FILE_DD_6003010_LEN);
       localFileDd6003010Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFileDd6003010Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshFileDd6003010 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFileDd6003010() {	 
   		return (substring(getStringValue(),beginFileDd6003010,beginFileDd6003010 + FILE_DD_6003010_LEN));
   	}
     int localFileStat6003010Counter = -1;
     public boolean isFileStat6003010Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFileStat6003010Counter != sharedCounter;
         localFileStat6003010Counter = sharedCounter; return hasModified;
     }
	protected static final int FILE_STAT_6003010_LEN = 2;
	/**
	 * 	serialize this FileStat6003010
	 */
   protected void serializeFileStat6003010(char[] fileStat6003010) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fileStat6003010,0,getStringValue(),beginFileStat6003010,FILE_STAT_6003010_LEN);
       localFileStat6003010Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFileStat6003010Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshFileStat6003010 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFileStat6003010() {	 
   		return (substring(getStringValue(),beginFileStat6003010,beginFileStat6003010 + FILE_STAT_6003010_LEN));
   	}




}
  
