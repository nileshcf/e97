package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class Date2Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Date2Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Date2Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DATE_2_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDate21;
            protected  int beginDate22;
	
	/**
	* Constructor for Date2Serialized
	**/
    public Date2Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Date2Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DATE_2_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDate21 = getStartOffset() + 0;	// set offset for serialization
  
             beginDate22 = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDate21Counter = -1;
     public boolean isDate21Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDate21Counter != sharedCounter;
         localDate21Counter = sharedCounter; return hasModified;
     }
	protected static final int DATE_21_LEN = 8;
	/**
	 * 	serialize this Date21
	 */
   protected void serializeDate21(char[] date21) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(date21,0,getStringValue(),beginDate21,DATE_21_LEN);
       localDate21Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDate21Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshDate21 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDate21() {	 
   		return (substring(getStringValue(),beginDate21,beginDate21 + DATE_21_LEN));
   	}
     int localDate22Counter = -1;
     public boolean isDate22Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDate22Counter != sharedCounter;
         localDate22Counter = sharedCounter; return hasModified;
     }
	protected static final int DATE_22_LEN = 2;
	/**
	 * 	serialize this Date22
	 */
   protected void serializeDate22(char[] date22) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(date22,0,getStringValue(),beginDate22,DATE_22_LEN);
       localDate22Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDate22Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDate22 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDate22() {	 
   		return (substring(getStringValue(),beginDate22,beginDate22 + DATE_22_LEN));
   	}




}
  
