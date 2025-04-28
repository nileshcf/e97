package com.cloudframe.app.callfd01.file.records.serialize;

/**
*  The class InputRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class InputRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(InputRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int INPUT_REC_LENGTH = 1001;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginInputMarker;
            protected  int beginInputData;
	
	/**
	* Constructor for InputRecSerialized
	**/
    public InputRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in InputRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(INPUT_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginInputMarker = getStartOffset() + 10;	// set offset for serialization
  
             beginInputData = getStartOffset() + 18;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localInputMarkerCounter = -1;
     public boolean isInputMarkerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInputMarkerCounter != sharedCounter;
         localInputMarkerCounter = sharedCounter; return hasModified;
     }
	protected static final int INPUT_MARKER_LEN = 8;
	/**
	 * 	serialize this InputMarker
	 */
   protected void serializeInputMarker(char[] inputMarker) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(inputMarker,0,getStringValue(),beginInputMarker,INPUT_MARKER_LEN);
       localInputMarkerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkInputMarkerConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshInputMarker is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshInputMarker() {	 
   		return (substring(getStringValue(),beginInputMarker,beginInputMarker + INPUT_MARKER_LEN));
   	}
     int localInputDataCounter = -1;
     public boolean isInputDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInputDataCounter != sharedCounter;
         localInputDataCounter = sharedCounter; return hasModified;
     }
	protected static final int INPUT_DATA_LEN = 983;
	/**
	 * 	serialize this InputData
	 */
   protected void serializeInputData(char[] inputData) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(inputData,0,getStringValue(),beginInputData,INPUT_DATA_LEN);
       localInputDataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkInputDataConstraints(char[] value) {
   			return super.checkConstraints(value , 983 ,false, false);
   }
    /**
	 *	refreshInputData is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshInputData() {	 
   		return (substring(getStringValue(),beginInputData,beginInputData + INPUT_DATA_LEN));
   	}




}
  
