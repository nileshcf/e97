package com.cloudframe.app.ip809050.dto.serialize;

/**
*  The class Sys201RecordCount600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys201RecordCount600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys201RecordCount600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_201_RECORD_COUNT_600_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys201Count600;
	
	/**
	* Constructor for Sys201RecordCount600Serialized
	**/
    public Sys201RecordCount600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys201RecordCount600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_201_RECORD_COUNT_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginSys201Count600 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys201Count600Counter = -1;
     public boolean isSys201Count600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys201Count600Counter != sharedCounter;
         localSys201Count600Counter = sharedCounter; return hasModified;
     }
	protected static final int SYS_201_COUNT_600_LEN = 10;
	/**
	 * 	serialize this Sys201Count600
	 */
   protected void serializeSys201Count600(char[] sys201Count600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys201Count600,0,getStringValue(),beginSys201Count600,SYS_201_COUNT_600_LEN);
       localSys201Count600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys201Count600Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshSys201Count600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys201Count600() {	 
   		return (substring(getStringValue(),beginSys201Count600,beginSys201Count600 + SYS_201_COUNT_600_LEN));
   	}




}
  
