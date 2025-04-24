package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class CheckFirstPutPimGroup100Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CheckFirstPutPimGroup100Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CheckFirstPutPimGroup100Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CHECK_FIRST_PUT_PIM_GROUP_100_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCheckFirstPutPim100;
	
	/**
	* Constructor for CheckFirstPutPimGroup100Serialized
	**/
    public CheckFirstPutPimGroup100Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in CheckFirstPutPimGroup100Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CHECK_FIRST_PUT_PIM_GROUP_100_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCheckFirstPutPim100 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCheckFirstPutPim100Counter = -1;
     public boolean isCheckFirstPutPim100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCheckFirstPutPim100Counter != sharedCounter;
         localCheckFirstPutPim100Counter = sharedCounter; return hasModified;
     }
	protected static final int CHECK_FIRST_PUT_PIM_100_LEN = 1;
	/**
	 * 	serialize this CheckFirstPutPim100
	 */
   protected void serializeCheckFirstPutPim100(char[] checkFirstPutPim100) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(checkFirstPutPim100,0,getStringValue(),beginCheckFirstPutPim100,CHECK_FIRST_PUT_PIM_100_LEN);
       localCheckFirstPutPim100Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCheckFirstPutPim100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCheckFirstPutPim100 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCheckFirstPutPim100() {	 
   		return (substring(getStringValue(),beginCheckFirstPutPim100,beginCheckFirstPutPim100 + CHECK_FIRST_PUT_PIM_100_LEN));
   	}




}
  
