package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class Head4356Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Head4356Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Head4356Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HEAD_4356_LENGTH = 130;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHead4ReportId356;
            protected  int beginHead4CarCon356;
	
	/**
	* Constructor for Head4356Serialized
	**/
    public Head4356Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Head4356Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HEAD_4356_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHead4ReportId356 = getStartOffset() + 0;	// set offset for serialization
  
             beginHead4CarCon356 = getStartOffset() + 1;	// set offset for serialization
  
  
  
  
	   /*  end of offset */
	}
     int localHead4ReportId356Counter = -1;
     public boolean isHead4ReportId356Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHead4ReportId356Counter != sharedCounter;
         localHead4ReportId356Counter = sharedCounter; return hasModified;
     }
	protected static final int HEAD_4_REPORT_ID_356_LEN = 1;
	/**
	 * 	serialize this Head4ReportId356
	 */
   protected void serializeHead4ReportId356(char[] head4ReportId356) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(head4ReportId356,0,getStringValue(),beginHead4ReportId356,HEAD_4_REPORT_ID_356_LEN);
       localHead4ReportId356Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHead4ReportId356Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshHead4ReportId356 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHead4ReportId356() {	 
   		return (substring(getStringValue(),beginHead4ReportId356,beginHead4ReportId356 + HEAD_4_REPORT_ID_356_LEN));
   	}
     int localHead4CarCon356Counter = -1;
     public boolean isHead4CarCon356Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHead4CarCon356Counter != sharedCounter;
         localHead4CarCon356Counter = sharedCounter; return hasModified;
     }
	protected static final int HEAD_4_CAR_CON_356_LEN = 1;
	/**
	 * 	serialize this Head4CarCon356
	 */
   protected void serializeHead4CarCon356(char[] head4CarCon356) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(head4CarCon356,0,getStringValue(),beginHead4CarCon356,HEAD_4_CAR_CON_356_LEN);
       localHead4CarCon356Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHead4CarCon356Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshHead4CarCon356 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHead4CarCon356() {	 
   		return (substring(getStringValue(),beginHead4CarCon356,beginHead4CarCon356 + HEAD_4_CAR_CON_356_LEN));
   	}




}
  
