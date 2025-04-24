package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class ErrorMsg6003003Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ErrorMsg6003003Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ErrorMsg6003003Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ERROR_MSG_6003003_LENGTH = 50;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFileDd6003003;
            protected  int beginFileStat6003003;
	
	/**
	* Constructor for ErrorMsg6003003Serialized
	**/
    public ErrorMsg6003003Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ErrorMsg6003003Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ERROR_MSG_6003003_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginFileDd6003003 = getStartOffset() + 26;	// set offset for serialization
  
  
             beginFileStat6003003 = getStartOffset() + 48;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFileDd6003003Counter = -1;
     public boolean isFileDd6003003Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFileDd6003003Counter != sharedCounter;
         localFileDd6003003Counter = sharedCounter; return hasModified;
     }
	protected static final int FILE_DD_6003003_LEN = 6;
	/**
	 * 	serialize this FileDd6003003
	 */
   protected void serializeFileDd6003003(char[] fileDd6003003) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fileDd6003003,0,getStringValue(),beginFileDd6003003,FILE_DD_6003003_LEN);
       localFileDd6003003Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFileDd6003003Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshFileDd6003003 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFileDd6003003() {	 
   		return (substring(getStringValue(),beginFileDd6003003,beginFileDd6003003 + FILE_DD_6003003_LEN));
   	}
     int localFileStat6003003Counter = -1;
     public boolean isFileStat6003003Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFileStat6003003Counter != sharedCounter;
         localFileStat6003003Counter = sharedCounter; return hasModified;
     }
	protected static final int FILE_STAT_6003003_LEN = 2;
	/**
	 * 	serialize this FileStat6003003
	 */
   protected void serializeFileStat6003003(char[] fileStat6003003) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fileStat6003003,0,getStringValue(),beginFileStat6003003,FILE_STAT_6003003_LEN);
       localFileStat6003003Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFileStat6003003Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshFileStat6003003 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFileStat6003003() {	 
   		return (substring(getStringValue(),beginFileStat6003003,beginFileStat6003003 + FILE_STAT_6003003_LEN));
   	}




}
  
