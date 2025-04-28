package com.cloudframe.app.sup01780.file.records.serialize;

/**
*  The class TmPanRecord10Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TmPanRecord10Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TmPanRecord10Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TM_PAN_RECORD_10_LENGTH = 267;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPanKey10;
	
	/**
	* Constructor for TmPanRecord10Serialized
	**/
    public TmPanRecord10Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TmPanRecord10Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TM_PAN_RECORD_10_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPanKey10 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localPanKey10Counter = -1;
     public boolean isPanKey10Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPanKey10Counter != sharedCounter;
         localPanKey10Counter = sharedCounter; return hasModified;
     }
	protected static final int PAN_KEY_10_LEN = 19;
	/**
	 * 	serialize this PanKey10
	 */
   protected void serializePanKey10(char[] panKey10) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(panKey10,0,getStringValue(),beginPanKey10,PAN_KEY_10_LEN);
       localPanKey10Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPanKey10Constraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshPanKey10 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPanKey10() {	 
   		return (substring(getStringValue(),beginPanKey10,beginPanKey10 + PAN_KEY_10_LEN));
   	}




}
  
