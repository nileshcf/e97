package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class Head6360Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:30. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Head6360Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Head6360Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HEAD_6360_LENGTH = 130;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHead6ReportId360;
            protected  int beginHead6CarCon360;
	
	/**
	* Constructor for Head6360Serialized
	**/
    public Head6360Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Head6360Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HEAD_6360_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHead6ReportId360 = getStartOffset() + 0;	// set offset for serialization
  
             beginHead6CarCon360 = getStartOffset() + 1;	// set offset for serialization
  
  
  
  
  
  
  
  
	   /*  end of offset */
	}
     int localHead6ReportId360Counter = -1;
     public boolean isHead6ReportId360Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHead6ReportId360Counter != sharedCounter;
         localHead6ReportId360Counter = sharedCounter; return hasModified;
     }
	protected static final int HEAD_6_REPORT_ID_360_LEN = 1;
	/**
	 * 	serialize this Head6ReportId360
	 */
   protected void serializeHead6ReportId360(char[] head6ReportId360) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(head6ReportId360,0,getStringValue(),beginHead6ReportId360,HEAD_6_REPORT_ID_360_LEN);
       localHead6ReportId360Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHead6ReportId360Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshHead6ReportId360 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHead6ReportId360() {	 
   		return (substring(getStringValue(),beginHead6ReportId360,beginHead6ReportId360 + HEAD_6_REPORT_ID_360_LEN));
   	}
     int localHead6CarCon360Counter = -1;
     public boolean isHead6CarCon360Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHead6CarCon360Counter != sharedCounter;
         localHead6CarCon360Counter = sharedCounter; return hasModified;
     }
	protected static final int HEAD_6_CAR_CON_360_LEN = 1;
	/**
	 * 	serialize this Head6CarCon360
	 */
   protected void serializeHead6CarCon360(char[] head6CarCon360) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(head6CarCon360,0,getStringValue(),beginHead6CarCon360,HEAD_6_CAR_CON_360_LEN);
       localHead6CarCon360Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHead6CarCon360Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshHead6CarCon360 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHead6CarCon360() {	 
   		return (substring(getStringValue(),beginHead6CarCon360,beginHead6CarCon360 + HEAD_6_CAR_CON_360_LEN));
   	}




}
  
