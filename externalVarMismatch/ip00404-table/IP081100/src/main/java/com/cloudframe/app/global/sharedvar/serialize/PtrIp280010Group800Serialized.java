package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class PtrIp280010Group800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class PtrIp280010Group800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(PtrIp280010Group800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PTR_IP_280010_GROUP_800_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPtrIp280010800;
	
	/**
	* Constructor for PtrIp280010Group800Serialized
	**/
    public PtrIp280010Group800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in PtrIp280010Group800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PTR_IP_280010_GROUP_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPtrIp280010800 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localPtrIp280010800Counter = -1;
     public boolean isPtrIp280010800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp280010800Counter != sharedCounter;
         localPtrIp280010800Counter = sharedCounter; return hasModified;
     }
	protected static final int PTR_IP_280010800_LEN = 8;
	/**
	 * 	serialize this PtrIp280010800
	 */
   protected void serializePtrIp280010800(char[] ptrIp280010800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ptrIp280010800,0,getStringValue(),beginPtrIp280010800,PTR_IP_280010800_LEN);
       localPtrIp280010800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPtrIp280010800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshPtrIp280010800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPtrIp280010800() {	 
   		return (substring(getStringValue(),beginPtrIp280010800,beginPtrIp280010800 + PTR_IP_280010800_LEN));
   	}




}
  
