package com.cloudframe.app.sf320010.file.records.serialize;

/**
*  The class FdReportFileOutRcdSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:08. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FdReportFileOutRcdSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FdReportFileOutRcdSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FD_REPORT_FILE_OUT_RCD_LENGTH = 145;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFdReportFileOutRcdString;
	
	/**
	* Constructor for FdReportFileOutRcdSerialized
	**/
    public FdReportFileOutRcdSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FdReportFileOutRcdSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FD_REPORT_FILE_OUT_RCD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFdReportFileOutRcdString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFdReportFileOutRcdStringCounter = -1;
     public boolean isFdReportFileOutRcdStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFdReportFileOutRcdStringCounter != sharedCounter;
         localFdReportFileOutRcdStringCounter = sharedCounter; return hasModified;
     }
	protected static final int FD_REPORT_FILE_OUT_RCD_STRING_LEN = 145;
	/**
	 * 	serialize this FdReportFileOutRcdString
	 */
   protected void serializeFdReportFileOutRcdString(char[] fdReportFileOutRcdString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fdReportFileOutRcdString,0,getStringValue(),beginFdReportFileOutRcdString,FD_REPORT_FILE_OUT_RCD_STRING_LEN);
       localFdReportFileOutRcdStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFdReportFileOutRcdStringConstraints(char[] value) {
   			return super.checkConstraints(value , 145 ,false, false);
   }
    /**
	 *	refreshFdReportFileOutRcdString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFdReportFileOutRcdString() {	 
   		return (substring(getStringValue(),beginFdReportFileOutRcdString,beginFdReportFileOutRcdString + FD_REPORT_FILE_OUT_RCD_STRING_LEN));
   	}




}
  
