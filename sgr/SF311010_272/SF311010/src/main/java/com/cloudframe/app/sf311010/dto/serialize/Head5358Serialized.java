package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class Head5358Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Head5358Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Head5358Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HEAD_5358_LENGTH = 130;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHead5ReportId358;
            protected  int beginHead5CarCon358;
	
	/**
	* Constructor for Head5358Serialized
	**/
    public Head5358Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Head5358Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HEAD_5358_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHead5ReportId358 = getStartOffset() + 0;	// set offset for serialization
  
             beginHead5CarCon358 = getStartOffset() + 1;	// set offset for serialization
  
  
  
  
  
  
  
  
	   /*  end of offset */
	}
     int localHead5ReportId358Counter = -1;
     public boolean isHead5ReportId358Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHead5ReportId358Counter != sharedCounter;
         localHead5ReportId358Counter = sharedCounter; return hasModified;
     }
	protected static final int HEAD_5_REPORT_ID_358_LEN = 1;
	/**
	 * 	serialize this Head5ReportId358
	 */
   protected void serializeHead5ReportId358(char[] head5ReportId358) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(head5ReportId358,0,getStringValue(),beginHead5ReportId358,HEAD_5_REPORT_ID_358_LEN);
       localHead5ReportId358Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHead5ReportId358Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshHead5ReportId358 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHead5ReportId358() {	 
   		return (substring(getStringValue(),beginHead5ReportId358,beginHead5ReportId358 + HEAD_5_REPORT_ID_358_LEN));
   	}
     int localHead5CarCon358Counter = -1;
     public boolean isHead5CarCon358Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHead5CarCon358Counter != sharedCounter;
         localHead5CarCon358Counter = sharedCounter; return hasModified;
     }
	protected static final int HEAD_5_CAR_CON_358_LEN = 1;
	/**
	 * 	serialize this Head5CarCon358
	 */
   protected void serializeHead5CarCon358(char[] head5CarCon358) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(head5CarCon358,0,getStringValue(),beginHead5CarCon358,HEAD_5_CAR_CON_358_LEN);
       localHead5CarCon358Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHead5CarCon358Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshHead5CarCon358 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHead5CarCon358() {	 
   		return (substring(getStringValue(),beginHead5CarCon358,beginHead5CarCon358 + HEAD_5_CAR_CON_358_LEN));
   	}




}
  
