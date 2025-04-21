package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class RpReportPrintLineSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:08. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RpReportPrintLineSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RpReportPrintLineSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RP_REPORT_PRINT_LINE_LENGTH = 145;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRpReportCode;
            protected  int beginRpPrintLine;
	
	/**
	* Constructor for RpReportPrintLineSerialized
	**/
    public RpReportPrintLineSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RpReportPrintLineSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RP_REPORT_PRINT_LINE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRpReportCode = getStartOffset() + 0;	// set offset for serialization
  
             beginRpPrintLine = getStartOffset() + 1;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localRpReportCodeCounter = -1;
     public boolean isRpReportCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpReportCodeCounter != sharedCounter;
         localRpReportCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_REPORT_CODE_LEN = 1;
	/**
	 * 	serialize this RpReportCode
	 */
   protected void serializeRpReportCode(char[] rpReportCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpReportCode,0,getStringValue(),beginRpReportCode,RP_REPORT_CODE_LEN);
       localRpReportCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpReportCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRpReportCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpReportCode() {	 
   		return (substring(getStringValue(),beginRpReportCode,beginRpReportCode + RP_REPORT_CODE_LEN));
   	}
     int localRpPrintLineCounter = -1;
     public boolean isRpPrintLineModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpPrintLineCounter != sharedCounter;
         localRpPrintLineCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_PRINT_LINE_LEN = 133;
	/**
	 * 	serialize this RpPrintLine
	 */
   protected void serializeRpPrintLine(char[] rpPrintLine) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpPrintLine,0,getStringValue(),beginRpPrintLine,RP_PRINT_LINE_LEN);
       localRpPrintLineCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpPrintLineConstraints(char[] value) {
   			return super.checkConstraints(value , 133 ,false, false);
   }
    /**
	 *	refreshRpPrintLine is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpPrintLine() {	 
   		return (substring(getStringValue(),beginRpPrintLine,beginRpPrintLine + RP_PRINT_LINE_LEN));
   	}




}
  
