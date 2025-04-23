package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class GetBrowseCallsGroup100Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:06. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class GetBrowseCallsGroup100Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(GetBrowseCallsGroup100Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int GET_BROWSE_CALLS_GROUP_100_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginGetBrowseCalls100;
	
	/**
	* Constructor for GetBrowseCallsGroup100Serialized
	**/
    public GetBrowseCallsGroup100Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in GetBrowseCallsGroup100Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(GET_BROWSE_CALLS_GROUP_100_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginGetBrowseCalls100 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localGetBrowseCalls100Counter = -1;
     public boolean isGetBrowseCalls100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGetBrowseCalls100Counter != sharedCounter;
         localGetBrowseCalls100Counter = sharedCounter; return hasModified;
     }
	protected static final int GET_BROWSE_CALLS_100_LEN = 1;
	/**
	 * 	serialize this GetBrowseCalls100
	 */
   protected void serializeGetBrowseCalls100(char[] getBrowseCalls100) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(getBrowseCalls100,0,getStringValue(),beginGetBrowseCalls100,GET_BROWSE_CALLS_100_LEN);
       localGetBrowseCalls100Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGetBrowseCalls100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshGetBrowseCalls100 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGetBrowseCalls100() {	 
   		return (substring(getStringValue(),beginGetBrowseCalls100,beginGetBrowseCalls100 + GET_BROWSE_CALLS_100_LEN));
   	}




}
  
