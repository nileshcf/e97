package com.cloudframe.app.ip809050.dto.serialize;

/**
*  The class Sys202RecordCount600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys202RecordCount600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys202RecordCount600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_202_RECORD_COUNT_600_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys202Count600;
	
	/**
	* Constructor for Sys202RecordCount600Serialized
	**/
    public Sys202RecordCount600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys202RecordCount600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_202_RECORD_COUNT_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginSys202Count600 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys202Count600Counter = -1;
     public boolean isSys202Count600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys202Count600Counter != sharedCounter;
         localSys202Count600Counter = sharedCounter; return hasModified;
     }
	protected static final int SYS_202_COUNT_600_LEN = 10;
	/**
	 * 	serialize this Sys202Count600
	 */
   protected void serializeSys202Count600(char[] sys202Count600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys202Count600,0,getStringValue(),beginSys202Count600,SYS_202_COUNT_600_LEN);
       localSys202Count600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys202Count600Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshSys202Count600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys202Count600() {	 
   		return (substring(getStringValue(),beginSys202Count600,beginSys202Count600 + SYS_202_COUNT_600_LEN));
   	}




}
  
