package com.cloudframe.app.callfd01.file.records.serialize;

/**
*  The class OutputRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:08. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class OutputRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(OutputRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int OUTPUT_REC_LENGTH = 1001;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginOutputData;
	
	/**
	* Constructor for OutputRecSerialized
	**/
    public OutputRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in OutputRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(OUTPUT_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginOutputData = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localOutputDataCounter = -1;
     public boolean isOutputDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOutputDataCounter != sharedCounter;
         localOutputDataCounter = sharedCounter; return hasModified;
     }
	protected static final int OUTPUT_DATA_LEN = 1001;
	/**
	 * 	serialize this OutputData
	 */
   protected void serializeOutputData(char[] outputData) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(outputData,0,getStringValue(),beginOutputData,OUTPUT_DATA_LEN);
       localOutputDataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOutputDataConstraints(char[] value) {
   			return super.checkConstraints(value , 1001 ,false, false);
   }
    /**
	 *	refreshOutputData is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOutputData() {	 
   		return (substring(getStringValue(),beginOutputData,beginOutputData + OUTPUT_DATA_LEN));
   	}




}
  
