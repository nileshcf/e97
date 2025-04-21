package com.cloudframe.app.sup01780.file.records.serialize;

/**
*  The class TmPanRecord1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TmPanRecord1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TmPanRecord1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TM_PAN_RECORD_1_LENGTH = 267;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPanKey1;
	
	/**
	* Constructor for TmPanRecord1Serialized
	**/
    public TmPanRecord1Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TmPanRecord1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TM_PAN_RECORD_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPanKey1 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localPanKey1Counter = -1;
     public boolean isPanKey1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPanKey1Counter != sharedCounter;
         localPanKey1Counter = sharedCounter; return hasModified;
     }
	protected static final int PAN_KEY_1_LEN = 19;
	/**
	 * 	serialize this PanKey1
	 */
   protected void serializePanKey1(char[] panKey1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(panKey1,0,getStringValue(),beginPanKey1,PAN_KEY_1_LEN);
       localPanKey1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPanKey1Constraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshPanKey1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPanKey1() {	 
   		return (substring(getStringValue(),beginPanKey1,beginPanKey1 + PAN_KEY_1_LEN));
   	}




}
  
