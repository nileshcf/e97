package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class TotalMessage650Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TotalMessage650Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TotalMessage650Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TOTAL_MESSAGE_650_LENGTH = 64;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTotalDescription650;
            protected  int beginTotal650;
	
	/**
	* Constructor for TotalMessage650Serialized
	**/
    public TotalMessage650Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TotalMessage650Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TOTAL_MESSAGE_650_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginTotalDescription650 = getStartOffset() + 10;	// set offset for serialization
  
             beginTotal650 = getStartOffset() + 50;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localTotalDescription650Counter = -1;
     public boolean isTotalDescription650Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTotalDescription650Counter != sharedCounter;
         localTotalDescription650Counter = sharedCounter; return hasModified;
     }
	protected static final int TOTAL_DESCRIPTION_650_LEN = 40;
	/**
	 * 	serialize this TotalDescription650
	 */
   protected void serializeTotalDescription650(char[] totalDescription650) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(totalDescription650,0,getStringValue(),beginTotalDescription650,TOTAL_DESCRIPTION_650_LEN);
       localTotalDescription650Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTotalDescription650Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshTotalDescription650 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTotalDescription650() {	 
   		return (substring(getStringValue(),beginTotalDescription650,beginTotalDescription650 + TOTAL_DESCRIPTION_650_LEN));
   	}
     int localTotal650Counter = -1;
     public boolean isTotal650Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTotal650Counter != sharedCounter;
         localTotal650Counter = sharedCounter; return hasModified;
     }
	protected static final int TOTAL_650_LEN = 14;
	/**
	 * 	serialize this Total650
	 */
   protected void serializeTotal650(char[] total650) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(total650,0,getStringValue(),beginTotal650,TOTAL_650_LEN);
       localTotal650Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTotal650Constraints(char[] value) {
   			return super.checkConstraints(value , 14 ,false, false);
   }
    /**
	 *	refreshTotal650 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTotal650() {	 
   		return (substring(getStringValue(),beginTotal650,beginTotal650 + TOTAL_650_LEN));
   	}




}
  
