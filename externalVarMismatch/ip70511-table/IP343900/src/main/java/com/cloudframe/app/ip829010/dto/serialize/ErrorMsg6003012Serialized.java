package com.cloudframe.app.ip829010.dto.serialize;

/**
*  The class ErrorMsg6003012Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ErrorMsg6003012Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ErrorMsg6003012Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ERROR_MSG_6003012_LENGTH = 45;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFileDd6003012;
            protected  int beginFileStat6003012;
	
	/**
	* Constructor for ErrorMsg6003012Serialized
	**/
    public ErrorMsg6003012Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ErrorMsg6003012Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ERROR_MSG_6003012_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginFileDd6003012 = getStartOffset() + 19;	// set offset for serialization
  
  
             beginFileStat6003012 = getStartOffset() + 43;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFileDd6003012Counter = -1;
     public boolean isFileDd6003012Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFileDd6003012Counter != sharedCounter;
         localFileDd6003012Counter = sharedCounter; return hasModified;
     }
	protected static final int FILE_DD_6003012_LEN = 8;
	/**
	 * 	serialize this FileDd6003012
	 */
   protected void serializeFileDd6003012(char[] fileDd6003012) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fileDd6003012,0,getStringValue(),beginFileDd6003012,FILE_DD_6003012_LEN);
       localFileDd6003012Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFileDd6003012Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshFileDd6003012 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFileDd6003012() {	 
   		return (substring(getStringValue(),beginFileDd6003012,beginFileDd6003012 + FILE_DD_6003012_LEN));
   	}
     int localFileStat6003012Counter = -1;
     public boolean isFileStat6003012Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFileStat6003012Counter != sharedCounter;
         localFileStat6003012Counter = sharedCounter; return hasModified;
     }
	protected static final int FILE_STAT_6003012_LEN = 2;
	/**
	 * 	serialize this FileStat6003012
	 */
   protected void serializeFileStat6003012(char[] fileStat6003012) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fileStat6003012,0,getStringValue(),beginFileStat6003012,FILE_STAT_6003012_LEN);
       localFileStat6003012Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFileStat6003012Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshFileStat6003012 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFileStat6003012() {	 
   		return (substring(getStringValue(),beginFileStat6003012,beginFileStat6003012 + FILE_STAT_6003012_LEN));
   	}




}
  
