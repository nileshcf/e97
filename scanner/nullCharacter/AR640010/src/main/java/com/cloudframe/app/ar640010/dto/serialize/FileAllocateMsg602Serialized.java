package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class FileAllocateMsg602Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:11. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FileAllocateMsg602Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FileAllocateMsg602Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FILE_ALLOCATE_MSG_602_LENGTH = 47;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFileAtype602;
            protected  int beginFileUnits602;
	
	/**
	* Constructor for FileAllocateMsg602Serialized
	**/
    public FileAllocateMsg602Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FileAllocateMsg602Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FILE_ALLOCATE_MSG_602_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginFileAtype602 = getStartOffset() + 25;	// set offset for serialization
  
  
             beginFileUnits602 = getStartOffset() + 38;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFileAtype602Counter = -1;
     public boolean isFileAtype602Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFileAtype602Counter != sharedCounter;
         localFileAtype602Counter = sharedCounter; return hasModified;
     }
	protected static final int FILE_ATYPE_602_LEN = 3;
	/**
	 * 	serialize this FileAtype602
	 */
   protected void serializeFileAtype602(char[] fileAtype602) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fileAtype602,0,getStringValue(),beginFileAtype602,FILE_ATYPE_602_LEN);
       localFileAtype602Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFileAtype602Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshFileAtype602 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFileAtype602() {	 
   		return (substring(getStringValue(),beginFileAtype602,beginFileAtype602 + FILE_ATYPE_602_LEN));
   	}
     int localFileUnits602Counter = -1;
     public boolean isFileUnits602Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFileUnits602Counter != sharedCounter;
         localFileUnits602Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of fileUnits602
	 *	@return fileUnits602
	 */
	public char[]  getFileUnits602String() {
	     return getCharArray(beginFileUnits602,FILE_UNITS_602_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean fileUnits602IsNumeric() {
	    return isNumeric(beginFileUnits602
	                    ,beginFileUnits602 + FILE_UNITS_602_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FILE_UNITS_602_LEN = 9;
  	/**
	 * serializeFileUnits602
	 */
	protected void serializeFileUnits602(long fileUnits602) {
		 putNumber(beginFileUnits602,fileUnits602,FILE_UNITS_602_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFileUnits602Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFileUnits602
	 */
   	protected  long serializeFileUnits602(char[] value) {
	    long  fileUnits602;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    fileUnits602 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginFileUnits602
		       ,9
		      );
		 localFileUnits602Counter = shareString.getSerializedField().getModifiedCounter();
		return  fileUnits602;
    }

   protected long checkFileUnits602MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFileUnits602 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshFileUnits602() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginFileUnits602
			                 ,FILE_UNITS_602_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("fileUnits602", beginFileUnits602,FILE_UNITS_602_LEN);
    }
   	}




}
  
