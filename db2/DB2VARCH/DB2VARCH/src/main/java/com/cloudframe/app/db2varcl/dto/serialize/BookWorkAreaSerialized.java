package com.cloudframe.app.db2varcl.dto.serialize;

/**
*  The class BookWorkAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:10. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BookWorkAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BookWorkAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BOOK_WORK_AREA_LENGTH = 5;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBookTableName;
            protected  int beginBookIoStatus;
	
	/**
	* Constructor for BookWorkAreaSerialized
	**/
    public BookWorkAreaSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BookWorkAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BOOK_WORK_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBookTableName = getStartOffset() + 0;	// set offset for serialization
  
             beginBookIoStatus = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBookTableNameCounter = -1;
     public boolean isBookTableNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBookTableNameCounter != sharedCounter;
         localBookTableNameCounter = sharedCounter; return hasModified;
     }
	protected static final int BOOK_TABLE_NAME_LEN = 4;
	/**
	 * 	serialize this BookTableName
	 */
   protected void serializeBookTableName(char[] bookTableName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bookTableName,0,getStringValue(),beginBookTableName,BOOK_TABLE_NAME_LEN);
       localBookTableNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBookTableNameConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshBookTableName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBookTableName() {	 
   		return (substring(getStringValue(),beginBookTableName,beginBookTableName + BOOK_TABLE_NAME_LEN));
   	}
     int localBookIoStatusCounter = -1;
     public boolean isBookIoStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBookIoStatusCounter != sharedCounter;
         localBookIoStatusCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bookIoStatus
	 *	@return bookIoStatus
	 */
	public char[]  getBookIoStatusString() {
	     return getCharArray(beginBookIoStatus,BOOK_IO_STATUS_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bookIoStatusIsNumeric() {
	    return isNumeric(beginBookIoStatus
	                    ,beginBookIoStatus + BOOK_IO_STATUS_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BOOK_IO_STATUS_LEN = 1;
  	/**
	 * serializeBookIoStatus
	 */
	protected void serializeBookIoStatus(int bookIoStatus) {
		 putNumber(beginBookIoStatus,bookIoStatus,BOOK_IO_STATUS_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBookIoStatusCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBookIoStatus
	 */
   	protected  int serializeBookIoStatus(char[] value) {
	    int  bookIoStatus;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bookIoStatus = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginBookIoStatus
		       ,1
		      );
		 localBookIoStatusCounter = shareString.getSerializedField().getModifiedCounter();
		return  bookIoStatus;
    }

   protected int checkBookIoStatusMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBookIoStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBookIoStatus() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBookIoStatus
			                 ,BOOK_IO_STATUS_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bookIoStatus", beginBookIoStatus,BOOK_IO_STATUS_LEN);
    }
   	}




}
  
