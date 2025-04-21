package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class Head1350Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Head1350Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Head1350Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HEAD_1350_LENGTH = 130;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHead1ReportId350;
            protected  int beginHead1CarCon350;
            protected  int beginHead1Date350;
	
	/**
	* Constructor for Head1350Serialized
	**/
    public Head1350Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Head1350Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HEAD_1350_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHead1ReportId350 = getStartOffset() + 0;	// set offset for serialization
  
             beginHead1CarCon350 = getStartOffset() + 1;	// set offset for serialization
  
  
  
  
             beginHead1Date350 = getStartOffset() + 122;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localHead1ReportId350Counter = -1;
     public boolean isHead1ReportId350Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHead1ReportId350Counter != sharedCounter;
         localHead1ReportId350Counter = sharedCounter; return hasModified;
     }
	protected static final int HEAD_1_REPORT_ID_350_LEN = 1;
	/**
	 * 	serialize this Head1ReportId350
	 */
   protected void serializeHead1ReportId350(char[] head1ReportId350) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(head1ReportId350,0,getStringValue(),beginHead1ReportId350,HEAD_1_REPORT_ID_350_LEN);
       localHead1ReportId350Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHead1ReportId350Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshHead1ReportId350 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHead1ReportId350() {	 
   		return (substring(getStringValue(),beginHead1ReportId350,beginHead1ReportId350 + HEAD_1_REPORT_ID_350_LEN));
   	}
     int localHead1CarCon350Counter = -1;
     public boolean isHead1CarCon350Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHead1CarCon350Counter != sharedCounter;
         localHead1CarCon350Counter = sharedCounter; return hasModified;
     }
	protected static final int HEAD_1_CAR_CON_350_LEN = 1;
	/**
	 * 	serialize this Head1CarCon350
	 */
   protected void serializeHead1CarCon350(char[] head1CarCon350) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(head1CarCon350,0,getStringValue(),beginHead1CarCon350,HEAD_1_CAR_CON_350_LEN);
       localHead1CarCon350Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHead1CarCon350Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshHead1CarCon350 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHead1CarCon350() {	 
   		return (substring(getStringValue(),beginHead1CarCon350,beginHead1CarCon350 + HEAD_1_CAR_CON_350_LEN));
   	}
     int localHead1Date350Counter = -1;
     public boolean isHead1Date350Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHead1Date350Counter != sharedCounter;
         localHead1Date350Counter = sharedCounter; return hasModified;
     }
	protected static final int HEAD_1_DATE_350_LEN = 8;
	/**
	 * 	serialize this Head1Date350
	 */
   protected void serializeHead1Date350(char[] head1Date350) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(head1Date350,0,getStringValue(),beginHead1Date350,HEAD_1_DATE_350_LEN);
       localHead1Date350Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHead1Date350Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshHead1Date350 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHead1Date350() {	 
   		return (substring(getStringValue(),beginHead1Date350,beginHead1Date350 + HEAD_1_DATE_350_LEN));
   	}




}
  
