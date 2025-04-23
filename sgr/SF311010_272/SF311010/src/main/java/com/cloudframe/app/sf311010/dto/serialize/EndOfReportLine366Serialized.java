package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class EndOfReportLine366Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:27. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class EndOfReportLine366Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(EndOfReportLine366Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int END_OF_REPORT_LINE_366_LENGTH = 130;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginEndofrptReportId366;
            protected  int beginEndofrptCarCon366;
	
	/**
	* Constructor for EndOfReportLine366Serialized
	**/
    public EndOfReportLine366Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in EndOfReportLine366Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(END_OF_REPORT_LINE_366_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginEndofrptReportId366 = getStartOffset() + 0;	// set offset for serialization
  
             beginEndofrptCarCon366 = getStartOffset() + 1;	// set offset for serialization
  
  
  
  
  
	   /*  end of offset */
	}
     int localEndofrptReportId366Counter = -1;
     public boolean isEndofrptReportId366Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEndofrptReportId366Counter != sharedCounter;
         localEndofrptReportId366Counter = sharedCounter; return hasModified;
     }
	protected static final int ENDOFRPT_REPORT_ID_366_LEN = 1;
	/**
	 * 	serialize this EndofrptReportId366
	 */
   protected void serializeEndofrptReportId366(char[] endofrptReportId366) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(endofrptReportId366,0,getStringValue(),beginEndofrptReportId366,ENDOFRPT_REPORT_ID_366_LEN);
       localEndofrptReportId366Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEndofrptReportId366Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshEndofrptReportId366 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEndofrptReportId366() {	 
   		return (substring(getStringValue(),beginEndofrptReportId366,beginEndofrptReportId366 + ENDOFRPT_REPORT_ID_366_LEN));
   	}
     int localEndofrptCarCon366Counter = -1;
     public boolean isEndofrptCarCon366Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEndofrptCarCon366Counter != sharedCounter;
         localEndofrptCarCon366Counter = sharedCounter; return hasModified;
     }
	protected static final int ENDOFRPT_CAR_CON_366_LEN = 1;
	/**
	 * 	serialize this EndofrptCarCon366
	 */
   protected void serializeEndofrptCarCon366(char[] endofrptCarCon366) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(endofrptCarCon366,0,getStringValue(),beginEndofrptCarCon366,ENDOFRPT_CAR_CON_366_LEN);
       localEndofrptCarCon366Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEndofrptCarCon366Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshEndofrptCarCon366 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEndofrptCarCon366() {	 
   		return (substring(getStringValue(),beginEndofrptCarCon366,beginEndofrptCarCon366 + ENDOFRPT_CAR_CON_366_LEN));
   	}




}
  
