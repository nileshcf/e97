package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class IsOpenSwGroup100Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:25. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IsOpenSwGroup100Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IsOpenSwGroup100Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IS_OPEN_SW_GROUP_100_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIsOpenSw100;
	
	/**
	* Constructor for IsOpenSwGroup100Serialized
	**/
    public IsOpenSwGroup100Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in IsOpenSwGroup100Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IS_OPEN_SW_GROUP_100_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIsOpenSw100 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIsOpenSw100Counter = -1;
     public boolean isIsOpenSw100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsOpenSw100Counter != sharedCounter;
         localIsOpenSw100Counter = sharedCounter; return hasModified;
     }
	protected static final int IS_OPEN_SW_100_LEN = 1;
	/**
	 * 	serialize this IsOpenSw100
	 */
   protected void serializeIsOpenSw100(char[] isOpenSw100) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(isOpenSw100,0,getStringValue(),beginIsOpenSw100,IS_OPEN_SW_100_LEN);
       localIsOpenSw100Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIsOpenSw100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIsOpenSw100 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIsOpenSw100() {	 
   		return (substring(getStringValue(),beginIsOpenSw100,beginIsOpenSw100 + IS_OPEN_SW_100_LEN));
   	}




}
  
