package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class InterimDateXGroup800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class InterimDateXGroup800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(InterimDateXGroup800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int INTERIM_DATE_XGROUP_800_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginInterimDateX800;
	
	/**
	* Constructor for InterimDateXGroup800Serialized
	**/
    public InterimDateXGroup800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in InterimDateXGroup800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(INTERIM_DATE_XGROUP_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginInterimDateX800 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localInterimDateX800Counter = -1;
     public boolean isInterimDateX800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInterimDateX800Counter != sharedCounter;
         localInterimDateX800Counter = sharedCounter; return hasModified;
     }
	protected static final int INTERIM_DATE_X_800_LEN = 8;
	/**
	 * 	serialize this InterimDateX800
	 */
   protected void serializeInterimDateX800(char[] interimDateX800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(interimDateX800,0,getStringValue(),beginInterimDateX800,INTERIM_DATE_X_800_LEN);
       localInterimDateX800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkInterimDateX800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshInterimDateX800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshInterimDateX800() {	 
   		return (substring(getStringValue(),beginInterimDateX800,beginInterimDateX800 + INTERIM_DATE_X_800_LEN));
   	}




}
  
