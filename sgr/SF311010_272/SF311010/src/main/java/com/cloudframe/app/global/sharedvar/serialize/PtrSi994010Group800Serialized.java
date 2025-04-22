package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class PtrSi994010Group800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:14. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class PtrSi994010Group800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(PtrSi994010Group800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PTR_SI_994010_GROUP_800_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPtrSi994010800;
	
	/**
	* Constructor for PtrSi994010Group800Serialized
	**/
    public PtrSi994010Group800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in PtrSi994010Group800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PTR_SI_994010_GROUP_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPtrSi994010800 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localPtrSi994010800Counter = -1;
     public boolean isPtrSi994010800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrSi994010800Counter != sharedCounter;
         localPtrSi994010800Counter = sharedCounter; return hasModified;
     }
	protected static final int PTR_SI_994010800_LEN = 8;
	/**
	 * 	serialize this PtrSi994010800
	 */
   protected void serializePtrSi994010800(char[] ptrSi994010800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ptrSi994010800,0,getStringValue(),beginPtrSi994010800,PTR_SI_994010800_LEN);
       localPtrSi994010800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPtrSi994010800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshPtrSi994010800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPtrSi994010800() {	 
   		return (substring(getStringValue(),beginPtrSi994010800,beginPtrSi994010800 + PTR_SI_994010800_LEN));
   	}




}
  
