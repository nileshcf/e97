package com.cloudframe.app.addrchk.dto.serialize;

/**
*  The class Var1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Var1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Var1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int VAR_1_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginData101;
	
	/**
	* Constructor for Var1Serialized
	**/
    public Var1Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Var1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(VAR_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginData101 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localData101Counter = -1;
     public boolean isData101Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localData101Counter != sharedCounter;
         localData101Counter = sharedCounter; return hasModified;
     }
	protected static final int DATA_101_LEN = 10;
	/**
	 * 	serialize this Data101
	 */
   protected void serializeData101(char[] data101) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(data101,0,getStringValue(),beginData101,DATA_101_LEN);
       localData101Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkData101Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshData101 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshData101() {	 
   		return (substring(getStringValue(),beginData101,beginData101 + DATA_101_LEN));
   	}




}
  
