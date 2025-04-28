package com.cloudframe.app.addrchk.dto.serialize;

/**
*  The class Groupvar2Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Groupvar2Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Groupvar2Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int GROUPVAR_2_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginData2;
	
	/**
	* Constructor for Groupvar2Serialized
	**/
    public Groupvar2Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Groupvar2Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(GROUPVAR_2_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginData2 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localData2Counter = -1;
     public boolean isData2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localData2Counter != sharedCounter;
         localData2Counter = sharedCounter; return hasModified;
     }
	protected static final int DATA_2_LEN = 10;
	/**
	 * 	serialize this Data2
	 */
   protected void serializeData2(char[] data2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(data2,0,getStringValue(),beginData2,DATA_2_LEN);
       localData2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkData2Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshData2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshData2() {	 
   		return (substring(getStringValue(),beginData2,beginData2 + DATA_2_LEN));
   	}




}
  
