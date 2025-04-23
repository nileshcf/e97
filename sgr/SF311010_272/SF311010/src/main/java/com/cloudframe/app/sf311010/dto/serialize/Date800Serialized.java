package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class Date800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Date800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Date800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DATE_800_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDateMonth800;
            protected  int beginDateDay800;
            protected  int beginDateYear800;
	
	/**
	* Constructor for Date800Serialized
	**/
    public Date800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Date800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DATE_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDateMonth800 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginDateDay800 = getStartOffset() + 3;	// set offset for serialization
  
  
             beginDateYear800 = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDateMonth800Counter = -1;
     public boolean isDateMonth800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDateMonth800Counter != sharedCounter;
         localDateMonth800Counter = sharedCounter; return hasModified;
     }
	protected static final int DATE_MONTH_800_LEN = 2;
	/**
	 * 	serialize this DateMonth800
	 */
   protected void serializeDateMonth800(char[] dateMonth800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dateMonth800,0,getStringValue(),beginDateMonth800,DATE_MONTH_800_LEN);
       localDateMonth800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDateMonth800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDateMonth800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDateMonth800() {	 
   		return (substring(getStringValue(),beginDateMonth800,beginDateMonth800 + DATE_MONTH_800_LEN));
   	}
     int localDateDay800Counter = -1;
     public boolean isDateDay800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDateDay800Counter != sharedCounter;
         localDateDay800Counter = sharedCounter; return hasModified;
     }
	protected static final int DATE_DAY_800_LEN = 2;
	/**
	 * 	serialize this DateDay800
	 */
   protected void serializeDateDay800(char[] dateDay800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dateDay800,0,getStringValue(),beginDateDay800,DATE_DAY_800_LEN);
       localDateDay800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDateDay800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDateDay800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDateDay800() {	 
   		return (substring(getStringValue(),beginDateDay800,beginDateDay800 + DATE_DAY_800_LEN));
   	}
     int localDateYear800Counter = -1;
     public boolean isDateYear800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDateYear800Counter != sharedCounter;
         localDateYear800Counter = sharedCounter; return hasModified;
     }
	protected static final int DATE_YEAR_800_LEN = 2;
	/**
	 * 	serialize this DateYear800
	 */
   protected void serializeDateYear800(char[] dateYear800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dateYear800,0,getStringValue(),beginDateYear800,DATE_YEAR_800_LEN);
       localDateYear800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDateYear800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDateYear800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDateYear800() {	 
   		return (substring(getStringValue(),beginDateYear800,beginDateYear800 + DATE_YEAR_800_LEN));
   	}




}
  
