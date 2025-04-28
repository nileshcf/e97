package com.cloudframe.app.addrchk.dto.serialize;

/**
*  The class Var3Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Var3Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Var3Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int VAR_3_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginData3;
	
	/**
	* Constructor for Var3Serialized
	**/
    public Var3Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Var3Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(VAR_3_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginData3 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localData3Counter = -1;
     public boolean isData3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localData3Counter != sharedCounter;
         localData3Counter = sharedCounter; return hasModified;
     }
	protected static final int DATA_3_LEN = 10;
	/**
	 * 	serialize this Data3
	 */
   protected void serializeData3(char[] data3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(data3,0,getStringValue(),beginData3,DATA_3_LEN);
       localData3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkData3Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshData3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshData3() {	 
   		return (substring(getStringValue(),beginData3,beginData3 + DATA_3_LEN));
   	}




}
  
