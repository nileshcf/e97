package com.cloudframe.app.sf328010.dto.serialize;

/**
*  The class HeaderLine1701Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HeaderLine1701Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HeaderLine1701Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HEADER_LINE_1701_LENGTH = 142;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRunDate701;
            protected  int beginRunMonth701;
            protected  int beginRunYear701;
	
	/**
	* Constructor for HeaderLine1701Serialized
	**/
    public HeaderLine1701Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in HeaderLine1701Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HEADER_LINE_1701_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
             beginRunDate701 = getStartOffset() + 117;	// set offset for serialization
  
  
             beginRunMonth701 = getStartOffset() + 120;	// set offset for serialization
  
  
             beginRunYear701 = getStartOffset() + 124;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localRunDate701Counter = -1;
     public boolean isRunDate701Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRunDate701Counter != sharedCounter;
         localRunDate701Counter = sharedCounter; return hasModified;
     }
	protected static final int RUN_DATE_701_LEN = 2;
	/**
	 * 	serialize this RunDate701
	 */
   protected void serializeRunDate701(char[] runDate701) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(runDate701,0,getStringValue(),beginRunDate701,RUN_DATE_701_LEN);
       localRunDate701Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRunDate701Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshRunDate701 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRunDate701() {	 
   		return (substring(getStringValue(),beginRunDate701,beginRunDate701 + RUN_DATE_701_LEN));
   	}
     int localRunMonth701Counter = -1;
     public boolean isRunMonth701Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRunMonth701Counter != sharedCounter;
         localRunMonth701Counter = sharedCounter; return hasModified;
     }
	protected static final int RUN_MONTH_701_LEN = 3;
	/**
	 * 	serialize this RunMonth701
	 */
   protected void serializeRunMonth701(char[] runMonth701) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(runMonth701,0,getStringValue(),beginRunMonth701,RUN_MONTH_701_LEN);
       localRunMonth701Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRunMonth701Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshRunMonth701 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRunMonth701() {	 
   		return (substring(getStringValue(),beginRunMonth701,beginRunMonth701 + RUN_MONTH_701_LEN));
   	}
     int localRunYear701Counter = -1;
     public boolean isRunYear701Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRunYear701Counter != sharedCounter;
         localRunYear701Counter = sharedCounter; return hasModified;
     }
	protected static final int RUN_YEAR_701_LEN = 4;
	/**
	 * 	serialize this RunYear701
	 */
   protected void serializeRunYear701(char[] runYear701) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(runYear701,0,getStringValue(),beginRunYear701,RUN_YEAR_701_LEN);
       localRunYear701Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRunYear701Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRunYear701 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRunYear701() {	 
   		return (substring(getStringValue(),beginRunYear701,beginRunYear701 + RUN_YEAR_701_LEN));
   	}




}
  
