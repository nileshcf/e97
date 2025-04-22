package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class Head2352Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:14. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Head2352Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Head2352Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HEAD_2352_LENGTH = 130;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHead2ReportId352;
            protected  int beginHead2CarCon352;
            protected  int beginHead2Time352;
	
	/**
	* Constructor for Head2352Serialized
	**/
    public Head2352Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Head2352Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HEAD_2352_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHead2ReportId352 = getStartOffset() + 0;	// set offset for serialization
  
             beginHead2CarCon352 = getStartOffset() + 1;	// set offset for serialization
  
  
  
  
             beginHead2Time352 = getStartOffset() + 122;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localHead2ReportId352Counter = -1;
     public boolean isHead2ReportId352Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHead2ReportId352Counter != sharedCounter;
         localHead2ReportId352Counter = sharedCounter; return hasModified;
     }
	protected static final int HEAD_2_REPORT_ID_352_LEN = 1;
	/**
	 * 	serialize this Head2ReportId352
	 */
   protected void serializeHead2ReportId352(char[] head2ReportId352) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(head2ReportId352,0,getStringValue(),beginHead2ReportId352,HEAD_2_REPORT_ID_352_LEN);
       localHead2ReportId352Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHead2ReportId352Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshHead2ReportId352 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHead2ReportId352() {	 
   		return (substring(getStringValue(),beginHead2ReportId352,beginHead2ReportId352 + HEAD_2_REPORT_ID_352_LEN));
   	}
     int localHead2CarCon352Counter = -1;
     public boolean isHead2CarCon352Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHead2CarCon352Counter != sharedCounter;
         localHead2CarCon352Counter = sharedCounter; return hasModified;
     }
	protected static final int HEAD_2_CAR_CON_352_LEN = 1;
	/**
	 * 	serialize this Head2CarCon352
	 */
   protected void serializeHead2CarCon352(char[] head2CarCon352) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(head2CarCon352,0,getStringValue(),beginHead2CarCon352,HEAD_2_CAR_CON_352_LEN);
       localHead2CarCon352Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHead2CarCon352Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshHead2CarCon352 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHead2CarCon352() {	 
   		return (substring(getStringValue(),beginHead2CarCon352,beginHead2CarCon352 + HEAD_2_CAR_CON_352_LEN));
   	}
     int localHead2Time352Counter = -1;
     public boolean isHead2Time352Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHead2Time352Counter != sharedCounter;
         localHead2Time352Counter = sharedCounter; return hasModified;
     }
	protected static final int HEAD_2_TIME_352_LEN = 8;
	/**
	 * 	serialize this Head2Time352
	 */
   protected void serializeHead2Time352(char[] head2Time352) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(head2Time352,0,getStringValue(),beginHead2Time352,HEAD_2_TIME_352_LEN);
       localHead2Time352Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHead2Time352Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshHead2Time352 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHead2Time352() {	 
   		return (substring(getStringValue(),beginHead2Time352,beginHead2Time352 + HEAD_2_TIME_352_LEN));
   	}




}
  
