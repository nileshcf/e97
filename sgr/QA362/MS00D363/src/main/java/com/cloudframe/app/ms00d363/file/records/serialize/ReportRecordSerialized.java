package com.cloudframe.app.ms00d363.file.records.serialize;

/**
*  The class ReportRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ReportRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ReportRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int REPORT_RECORD_LENGTH = 270;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginReportRecordString;
	
	/**
	* Constructor for ReportRecordSerialized
	**/
    public ReportRecordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ReportRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(REPORT_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginReportRecordString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localReportRecordStringCounter = -1;
     public boolean isReportRecordStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localReportRecordStringCounter != sharedCounter;
         localReportRecordStringCounter = sharedCounter; return hasModified;
     }
	protected static final int REPORT_RECORD_STRING_LEN = 270;
	/**
	 * 	serialize this ReportRecordString
	 */
   protected void serializeReportRecordString(char[] reportRecordString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(reportRecordString,0,getStringValue(),beginReportRecordString,REPORT_RECORD_STRING_LEN);
       localReportRecordStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkReportRecordStringConstraints(char[] value) {
   			return super.checkConstraints(value , 270 ,false, false);
   }
    /**
	 *	refreshReportRecordString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshReportRecordString() {	 
   		return (substring(getStringValue(),beginReportRecordString,beginReportRecordString + REPORT_RECORD_STRING_LEN));
   	}




}
  
