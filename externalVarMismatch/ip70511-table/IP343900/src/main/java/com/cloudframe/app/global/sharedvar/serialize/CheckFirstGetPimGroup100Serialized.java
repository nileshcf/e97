package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class CheckFirstGetPimGroup100Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CheckFirstGetPimGroup100Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CheckFirstGetPimGroup100Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CHECK_FIRST_GET_PIM_GROUP_100_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCheckFirstGetPim100;
	
	/**
	* Constructor for CheckFirstGetPimGroup100Serialized
	**/
    public CheckFirstGetPimGroup100Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in CheckFirstGetPimGroup100Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CHECK_FIRST_GET_PIM_GROUP_100_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCheckFirstGetPim100 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCheckFirstGetPim100Counter = -1;
     public boolean isCheckFirstGetPim100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCheckFirstGetPim100Counter != sharedCounter;
         localCheckFirstGetPim100Counter = sharedCounter; return hasModified;
     }
	protected static final int CHECK_FIRST_GET_PIM_100_LEN = 1;
	/**
	 * 	serialize this CheckFirstGetPim100
	 */
   protected void serializeCheckFirstGetPim100(char[] checkFirstGetPim100) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(checkFirstGetPim100,0,getStringValue(),beginCheckFirstGetPim100,CHECK_FIRST_GET_PIM_100_LEN);
       localCheckFirstGetPim100Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCheckFirstGetPim100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCheckFirstGetPim100 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCheckFirstGetPim100() {	 
   		return (substring(getStringValue(),beginCheckFirstGetPim100,beginCheckFirstGetPim100 + CHECK_FIRST_GET_PIM_100_LEN));
   	}




}
  
