package com.cloudframe.app.crazy88.dto.serialize;

/**
*  The class WCharGSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:25. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WCharGSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WCharGSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int W_CHAR_G_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWCharTestData;
	
	/**
	* Constructor for WCharGSerialized
	**/
    public WCharGSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WCharGSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(W_CHAR_G_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWCharTestData = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWCharTestDataCounter = -1;
     public boolean isWCharTestDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWCharTestDataCounter != sharedCounter;
         localWCharTestDataCounter = sharedCounter; return hasModified;
     }
	protected static final int W_CHAR_TEST_DATA_LEN = 1;
	/**
	 * 	serialize this WCharTestData
	 */
   protected void serializeWCharTestData(char[] wCharTestData) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wCharTestData,0,getStringValue(),beginWCharTestData,W_CHAR_TEST_DATA_LEN);
       localWCharTestDataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWCharTestDataConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshWCharTestData is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWCharTestData() {	 
   		return (substring(getStringValue(),beginWCharTestData,beginWCharTestData + W_CHAR_TEST_DATA_LEN));
   	}




}
  
