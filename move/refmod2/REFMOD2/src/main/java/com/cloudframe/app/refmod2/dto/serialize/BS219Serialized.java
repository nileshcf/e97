package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class BS219Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BS219Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BS219Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_S_219_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBSFld1219;
            protected  int beginBSFld2219;
	
	/**
	* Constructor for BS219Serialized
	**/
    public BS219Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BS219Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_S_219_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBSFld1219 = getStartOffset() + 0;	// set offset for serialization
  
             beginBSFld2219 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBSFld1219Counter = -1;
     public boolean isBSFld1219Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBSFld1219Counter != sharedCounter;
         localBSFld1219Counter = sharedCounter; return hasModified;
     }
	protected static final int B_SFLD_1219_LEN = 30;
	/**
	 * 	serialize this BSFld1219
	 */
   protected void serializeBSFld1219(char[] bSFld1219) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bSFld1219,0,getStringValue(),beginBSFld1219,B_SFLD_1219_LEN);
       localBSFld1219Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBSFld1219Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBSFld1219 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBSFld1219() {	 
   		return (substring(getStringValue(),beginBSFld1219,beginBSFld1219 + B_SFLD_1219_LEN));
   	}
     int localBSFld2219Counter = -1;
     public boolean isBSFld2219Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBSFld2219Counter != sharedCounter;
         localBSFld2219Counter = sharedCounter; return hasModified;
     }
	protected static final int B_SFLD_2219_LEN = 40;
	/**
	 * 	serialize this BSFld2219
	 */
   protected void serializeBSFld2219(char[] bSFld2219) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bSFld2219,0,getStringValue(),beginBSFld2219,B_SFLD_2219_LEN);
       localBSFld2219Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBSFld2219Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBSFld2219 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBSFld2219() {	 
   		return (substring(getStringValue(),beginBSFld2219,beginBSFld2219 + B_SFLD_2219_LEN));
   	}




}
  
