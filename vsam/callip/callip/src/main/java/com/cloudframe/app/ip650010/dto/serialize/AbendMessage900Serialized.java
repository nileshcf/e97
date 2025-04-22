package com.cloudframe.app.ip650010.dto.serialize;

/**
*  The class AbendMessage900Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:07. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AbendMessage900Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AbendMessage900Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ABEND_MESSAGE_900_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAbendCode900;
            protected  int beginAbendText900;
	
	/**
	* Constructor for AbendMessage900Serialized
	**/
    public AbendMessage900Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in AbendMessage900Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ABEND_MESSAGE_900_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginAbendCode900 = getStartOffset() + 9;	// set offset for serialization
  
  
             beginAbendText900 = getStartOffset() + 14;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localAbendCode900Counter = -1;
     public boolean isAbendCode900Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendCode900Counter != sharedCounter;
         localAbendCode900Counter = sharedCounter; return hasModified;
     }
	protected static final int ABEND_CODE_900_LEN = 4;
	/**
	 * 	serialize this AbendCode900
	 */
   protected void serializeAbendCode900(char[] abendCode900) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(abendCode900,0,getStringValue(),beginAbendCode900,ABEND_CODE_900_LEN);
       localAbendCode900Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAbendCode900Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshAbendCode900 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAbendCode900() {	 
   		return (substring(getStringValue(),beginAbendCode900,beginAbendCode900 + ABEND_CODE_900_LEN));
   	}
     int localAbendText900Counter = -1;
     public boolean isAbendText900Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendText900Counter != sharedCounter;
         localAbendText900Counter = sharedCounter; return hasModified;
     }
	protected static final int ABEND_TEXT_900_LEN = 66;
	/**
	 * 	serialize this AbendText900
	 */
   protected void serializeAbendText900(char[] abendText900) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(abendText900,0,getStringValue(),beginAbendText900,ABEND_TEXT_900_LEN);
       localAbendText900Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAbendText900Constraints(char[] value) {
   			return super.checkConstraints(value , 66 ,false, false);
   }
    /**
	 *	refreshAbendText900 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAbendText900() {	 
   		return (substring(getStringValue(),beginAbendText900,beginAbendText900 + ABEND_TEXT_900_LEN));
   	}




}
  
