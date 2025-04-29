package com.cloudframe.app.ip809050.dto.serialize;

/**
*  The class Pds05DataGroup800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:26. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Pds05DataGroup800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Pds05DataGroup800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PDS_05_DATA_GROUP_800_LENGTH = 140;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPds05Data800;
           protected int beginPds05800;
           protected static final int PDS_05800_SIZE = 10;
	
	/**
	* Constructor for Pds05DataGroup800Serialized
	**/
    public Pds05DataGroup800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Pds05DataGroup800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PDS_05_DATA_GROUP_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPds05Data800 = getStartOffset() + 0;	// set offset for serialization
  
	        beginPds05800 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
     int localPds05Data800Counter = -1;
     public boolean isPds05Data800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPds05Data800Counter != sharedCounter;
         localPds05Data800Counter = sharedCounter; return hasModified;
     }
	protected static final int PDS_05_DATA_800_LEN = 140;
	/**
	 * 	serialize this Pds05Data800
	 */
   protected void serializePds05Data800(char[] pds05Data800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(pds05Data800,0,getStringValue(),beginPds05Data800,PDS_05_DATA_800_LEN);
       localPds05Data800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPds05Data800Constraints(char[] value) {
   			return super.checkConstraints(value , 140 ,false, false);
   }
    /**
	 *	refreshPds05Data800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPds05Data800() {	 
   		return (substring(getStringValue(),beginPds05Data800,beginPds05Data800 + PDS_05_DATA_800_LEN));
   	}

		public int pds05800Size() {
			return PDS_05800_SIZE;
		}



}
  
