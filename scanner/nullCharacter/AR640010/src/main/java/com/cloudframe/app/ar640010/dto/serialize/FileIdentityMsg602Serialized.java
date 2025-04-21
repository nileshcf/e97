package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class FileIdentityMsg602Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FileIdentityMsg602Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FileIdentityMsg602Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FILE_IDENTITY_MSG_602_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFileDd602;
            protected  int beginFileDsn602;
	
	/**
	* Constructor for FileIdentityMsg602Serialized
	**/
    public FileIdentityMsg602Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FileIdentityMsg602Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FILE_IDENTITY_MSG_602_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginFileDd602 = getStartOffset() + 23;	// set offset for serialization
  
  
             beginFileDsn602 = getStartOffset() + 36;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFileDd602Counter = -1;
     public boolean isFileDd602Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFileDd602Counter != sharedCounter;
         localFileDd602Counter = sharedCounter; return hasModified;
     }
	protected static final int FILE_DD_602_LEN = 8;
	/**
	 * 	serialize this FileDd602
	 */
   protected void serializeFileDd602(char[] fileDd602) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fileDd602,0,getStringValue(),beginFileDd602,FILE_DD_602_LEN);
       localFileDd602Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFileDd602Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshFileDd602 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFileDd602() {	 
   		return (substring(getStringValue(),beginFileDd602,beginFileDd602 + FILE_DD_602_LEN));
   	}
     int localFileDsn602Counter = -1;
     public boolean isFileDsn602Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFileDsn602Counter != sharedCounter;
         localFileDsn602Counter = sharedCounter; return hasModified;
     }
	protected static final int FILE_DSN_602_LEN = 54;
	/**
	 * 	serialize this FileDsn602
	 */
   protected void serializeFileDsn602(char[] fileDsn602) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fileDsn602,0,getStringValue(),beginFileDsn602,FILE_DSN_602_LEN);
       localFileDsn602Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFileDsn602Constraints(char[] value) {
   			return super.checkConstraints(value , 54 ,false, false);
   }
    /**
	 *	refreshFileDsn602 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFileDsn602() {	 
   		return (substring(getStringValue(),beginFileDsn602,beginFileDsn602 + FILE_DSN_602_LEN));
   	}




}
  
