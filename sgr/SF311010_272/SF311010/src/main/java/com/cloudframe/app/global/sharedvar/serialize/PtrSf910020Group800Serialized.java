package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class PtrSf910020Group800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class PtrSf910020Group800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(PtrSf910020Group800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PTR_SF_910020_GROUP_800_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPtrSf910020800;
	
	/**
	* Constructor for PtrSf910020Group800Serialized
	**/
    public PtrSf910020Group800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in PtrSf910020Group800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PTR_SF_910020_GROUP_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPtrSf910020800 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localPtrSf910020800Counter = -1;
     public boolean isPtrSf910020800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrSf910020800Counter != sharedCounter;
         localPtrSf910020800Counter = sharedCounter; return hasModified;
     }
	protected static final int PTR_SF_910020800_LEN = 8;
	/**
	 * 	serialize this PtrSf910020800
	 */
   protected void serializePtrSf910020800(char[] ptrSf910020800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ptrSf910020800,0,getStringValue(),beginPtrSf910020800,PTR_SF_910020800_LEN);
       localPtrSf910020800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPtrSf910020800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshPtrSf910020800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPtrSf910020800() {	 
   		return (substring(getStringValue(),beginPtrSf910020800,beginPtrSf910020800 + PTR_SF_910020800_LEN));
   	}




}
  
