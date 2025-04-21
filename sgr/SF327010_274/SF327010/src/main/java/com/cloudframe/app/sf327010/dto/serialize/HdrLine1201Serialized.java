package com.cloudframe.app.sf327010.dto.serialize;

/**
*  The class HdrLine1201Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HdrLine1201Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HdrLine1201Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HDR_LINE_1201_LENGTH = 134;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRunDate201;
            protected  int beginRunMonth201;
            protected  int beginRunYear201;
	
	/**
	* Constructor for HdrLine1201Serialized
	**/
    public HdrLine1201Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in HdrLine1201Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HDR_LINE_1201_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
  
  
             beginRunDate201 = getStartOffset() + 113;	// set offset for serialization
  
  
             beginRunMonth201 = getStartOffset() + 116;	// set offset for serialization
  
  
             beginRunYear201 = getStartOffset() + 120;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localRunDate201Counter = -1;
     public boolean isRunDate201Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRunDate201Counter != sharedCounter;
         localRunDate201Counter = sharedCounter; return hasModified;
     }
	protected static final int RUN_DATE_201_LEN = 2;
	/**
	 * 	serialize this RunDate201
	 */
   protected void serializeRunDate201(char[] runDate201) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(runDate201,0,getStringValue(),beginRunDate201,RUN_DATE_201_LEN);
       localRunDate201Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRunDate201Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshRunDate201 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRunDate201() {	 
   		return (substring(getStringValue(),beginRunDate201,beginRunDate201 + RUN_DATE_201_LEN));
   	}
     int localRunMonth201Counter = -1;
     public boolean isRunMonth201Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRunMonth201Counter != sharedCounter;
         localRunMonth201Counter = sharedCounter; return hasModified;
     }
	protected static final int RUN_MONTH_201_LEN = 3;
	/**
	 * 	serialize this RunMonth201
	 */
   protected void serializeRunMonth201(char[] runMonth201) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(runMonth201,0,getStringValue(),beginRunMonth201,RUN_MONTH_201_LEN);
       localRunMonth201Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRunMonth201Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshRunMonth201 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRunMonth201() {	 
   		return (substring(getStringValue(),beginRunMonth201,beginRunMonth201 + RUN_MONTH_201_LEN));
   	}
     int localRunYear201Counter = -1;
     public boolean isRunYear201Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRunYear201Counter != sharedCounter;
         localRunYear201Counter = sharedCounter; return hasModified;
     }
	protected static final int RUN_YEAR_201_LEN = 4;
	/**
	 * 	serialize this RunYear201
	 */
   protected void serializeRunYear201(char[] runYear201) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(runYear201,0,getStringValue(),beginRunYear201,RUN_YEAR_201_LEN);
       localRunYear201Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRunYear201Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRunYear201 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRunYear201() {	 
   		return (substring(getStringValue(),beginRunYear201,beginRunYear201 + RUN_YEAR_201_LEN));
   	}




}
  
