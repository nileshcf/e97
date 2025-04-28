package com.cloudframe.app.asaprnt.dto.serialize;

/**
*  The class Header2a700Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:12. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Header2a700Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Header2a700Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HEADER_2A_700_LENGTH = 128;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginH2aTimeRun700;
	
	/**
	* Constructor for Header2a700Serialized
	**/
    public Header2a700Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Header2a700Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HEADER_2A_700_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
             beginH2aTimeRun700 = getStartOffset() + 120;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localH2aTimeRun700Counter = -1;
     public boolean isH2aTimeRun700Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localH2aTimeRun700Counter != sharedCounter;
         localH2aTimeRun700Counter = sharedCounter; return hasModified;
     }
	protected static final int H_2A_TIME_RUN_700_LEN = 8;
	/**
	 * 	serialize this H2aTimeRun700
	 */
   protected void serializeH2aTimeRun700(char[] h2aTimeRun700) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(h2aTimeRun700,0,getStringValue(),beginH2aTimeRun700,H_2A_TIME_RUN_700_LEN);
       localH2aTimeRun700Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkH2aTimeRun700Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshH2aTimeRun700 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshH2aTimeRun700() {	 
   		return (substring(getStringValue(),beginH2aTimeRun700,beginH2aTimeRun700 + H_2A_TIME_RUN_700_LEN));
   	}




}
  
