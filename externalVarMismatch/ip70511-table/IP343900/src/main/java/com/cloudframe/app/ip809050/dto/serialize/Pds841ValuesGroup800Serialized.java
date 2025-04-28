package com.cloudframe.app.ip809050.dto.serialize;

/**
*  The class Pds841ValuesGroup800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Pds841ValuesGroup800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Pds841ValuesGroup800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PDS_841_VALUES_GROUP_800_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPds841Values800;
	
	/**
	* Constructor for Pds841ValuesGroup800Serialized
	**/
    public Pds841ValuesGroup800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Pds841ValuesGroup800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PDS_841_VALUES_GROUP_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPds841Values800 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localPds841Values800Counter = -1;
     public boolean isPds841Values800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPds841Values800Counter != sharedCounter;
         localPds841Values800Counter = sharedCounter; return hasModified;
     }
	protected static final int PDS_841_VALUES_800_LEN = 8;
	/**
	 * 	serialize this Pds841Values800
	 */
   protected void serializePds841Values800(char[] pds841Values800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(pds841Values800,0,getStringValue(),beginPds841Values800,PDS_841_VALUES_800_LEN);
       localPds841Values800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPds841Values800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshPds841Values800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPds841Values800() {	 
   		return (substring(getStringValue(),beginPds841Values800,beginPds841Values800 + PDS_841_VALUES_800_LEN));
   	}




}
  
