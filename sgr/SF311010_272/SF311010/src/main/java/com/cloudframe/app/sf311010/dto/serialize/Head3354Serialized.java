package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class Head3354Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Head3354Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Head3354Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HEAD_3354_LENGTH = 130;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHead3ReportId354;
            protected  int beginHead3CarCon354;
            protected  int beginHead3Page354;
	
	/**
	* Constructor for Head3354Serialized
	**/
    public Head3354Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Head3354Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HEAD_3354_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHead3ReportId354 = getStartOffset() + 0;	// set offset for serialization
  
             beginHead3CarCon354 = getStartOffset() + 1;	// set offset for serialization
  
  
  
  
             beginHead3Page354 = getStartOffset() + 118;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localHead3ReportId354Counter = -1;
     public boolean isHead3ReportId354Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHead3ReportId354Counter != sharedCounter;
         localHead3ReportId354Counter = sharedCounter; return hasModified;
     }
	protected static final int HEAD_3_REPORT_ID_354_LEN = 1;
	/**
	 * 	serialize this Head3ReportId354
	 */
   protected void serializeHead3ReportId354(char[] head3ReportId354) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(head3ReportId354,0,getStringValue(),beginHead3ReportId354,HEAD_3_REPORT_ID_354_LEN);
       localHead3ReportId354Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHead3ReportId354Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshHead3ReportId354 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHead3ReportId354() {	 
   		return (substring(getStringValue(),beginHead3ReportId354,beginHead3ReportId354 + HEAD_3_REPORT_ID_354_LEN));
   	}
     int localHead3CarCon354Counter = -1;
     public boolean isHead3CarCon354Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHead3CarCon354Counter != sharedCounter;
         localHead3CarCon354Counter = sharedCounter; return hasModified;
     }
	protected static final int HEAD_3_CAR_CON_354_LEN = 1;
	/**
	 * 	serialize this Head3CarCon354
	 */
   protected void serializeHead3CarCon354(char[] head3CarCon354) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(head3CarCon354,0,getStringValue(),beginHead3CarCon354,HEAD_3_CAR_CON_354_LEN);
       localHead3CarCon354Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHead3CarCon354Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshHead3CarCon354 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHead3CarCon354() {	 
   		return (substring(getStringValue(),beginHead3CarCon354,beginHead3CarCon354 + HEAD_3_CAR_CON_354_LEN));
   	}
     int localHead3Page354Counter = -1;
     public boolean isHead3Page354Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHead3Page354Counter != sharedCounter;
         localHead3Page354Counter = sharedCounter; return hasModified;
     }
	protected static final int HEAD_3_PAGE_354_LEN = 3;
	/**
	 * 	serialize this Head3Page354
	 */
   protected void serializeHead3Page354(char[] head3Page354) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(head3Page354,0,getStringValue(),beginHead3Page354,HEAD_3_PAGE_354_LEN);
       localHead3Page354Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHead3Page354Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshHead3Page354 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHead3Page354() {	 
   		return (substring(getStringValue(),beginHead3Page354,beginHead3Page354 + HEAD_3_PAGE_354_LEN));
   	}




}
  
