package com.cloudframe.app.addrchk.dto.serialize;

/**
*  The class Groupvar1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Groupvar1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Groupvar1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int GROUPVAR_1_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginData1;
	
	/**
	* Constructor for Groupvar1Serialized
	**/
    public Groupvar1Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Groupvar1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(GROUPVAR_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginData1 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localData1Counter = -1;
     public boolean isData1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localData1Counter != sharedCounter;
         localData1Counter = sharedCounter; return hasModified;
     }
	protected static final int DATA_1_LEN = 10;
	/**
	 * 	serialize this Data1
	 */
   protected void serializeData1(char[] data1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(data1,0,getStringValue(),beginData1,DATA_1_LEN);
       localData1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkData1Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshData1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshData1() {	 
   		return (substring(getStringValue(),beginData1,beginData1 + DATA_1_LEN));
   	}




}
  
