package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class DataGroup1000Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DataGroup1000Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DataGroup1000Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DATA_GROUP_1000_LENGTH = 16384;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginData1000;
	
	/**
	* Constructor for DataGroup1000Serialized
	**/
    public DataGroup1000Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DataGroup1000Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DATA_GROUP_1000_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginData1000 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localData1000Counter = -1;
     public boolean isData1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localData1000Counter != sharedCounter;
         localData1000Counter = sharedCounter; return hasModified;
     }
	protected static final int DATA_1000_LEN = 16384;
	/**
	 * 	serialize this Data1000
	 */
   protected void serializeData1000(char[] data1000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(data1000,0,getStringValue(),beginData1000,DATA_1000_LEN);
       localData1000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkData1000Constraints(char[] value) {
   			return super.checkConstraints(value , 16384 ,false, false);
   }
    /**
	 *	refreshData1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshData1000() {	 
   		return (substring(getStringValue(),beginData1000,beginData1000 + DATA_1000_LEN));
   	}




}
  
