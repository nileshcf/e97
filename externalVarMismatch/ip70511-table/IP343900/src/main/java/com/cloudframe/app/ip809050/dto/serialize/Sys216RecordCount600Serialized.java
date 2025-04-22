package com.cloudframe.app.ip809050.dto.serialize;

/**
*  The class Sys216RecordCount600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys216RecordCount600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys216RecordCount600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_216_RECORD_COUNT_600_LENGTH = 73;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys216Count1600;
	
	/**
	* Constructor for Sys216RecordCount600Serialized
	**/
    public Sys216RecordCount600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys216RecordCount600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_216_RECORD_COUNT_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginSys216Count1600 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys216Count1600Counter = -1;
     public boolean isSys216Count1600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys216Count1600Counter != sharedCounter;
         localSys216Count1600Counter = sharedCounter; return hasModified;
     }
	protected static final int SYS_216_COUNT_1600_LEN = 13;
	/**
	 * 	serialize this Sys216Count1600
	 */
   protected void serializeSys216Count1600(char[] sys216Count1600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys216Count1600,0,getStringValue(),beginSys216Count1600,SYS_216_COUNT_1600_LEN);
       localSys216Count1600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys216Count1600Constraints(char[] value) {
   			return super.checkConstraints(value , 13 ,false, false);
   }
    /**
	 *	refreshSys216Count1600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys216Count1600() {	 
   		return (substring(getStringValue(),beginSys216Count1600,beginSys216Count1600 + SYS_216_COUNT_1600_LEN));
   	}




}
  
