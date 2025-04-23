package com.cloudframe.app.ms00d363.file.records.serialize;

/**
*  The class ExcelRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ExcelRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ExcelRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int EXCEL_RECORD_LENGTH = 500;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginExcelRecordString;
	
	/**
	* Constructor for ExcelRecordSerialized
	**/
    public ExcelRecordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ExcelRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(EXCEL_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginExcelRecordString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localExcelRecordStringCounter = -1;
     public boolean isExcelRecordStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExcelRecordStringCounter != sharedCounter;
         localExcelRecordStringCounter = sharedCounter; return hasModified;
     }
	protected static final int EXCEL_RECORD_STRING_LEN = 500;
	/**
	 * 	serialize this ExcelRecordString
	 */
   protected void serializeExcelRecordString(char[] excelRecordString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(excelRecordString,0,getStringValue(),beginExcelRecordString,EXCEL_RECORD_STRING_LEN);
       localExcelRecordStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExcelRecordStringConstraints(char[] value) {
   			return super.checkConstraints(value , 500 ,false, false);
   }
    /**
	 *	refreshExcelRecordString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExcelRecordString() {	 
   		return (substring(getStringValue(),beginExcelRecordString,beginExcelRecordString + EXCEL_RECORD_STRING_LEN));
   	}




}
  
