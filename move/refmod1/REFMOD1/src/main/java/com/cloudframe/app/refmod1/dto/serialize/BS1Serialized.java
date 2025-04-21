package com.cloudframe.app.refmod1.dto.serialize;

/**
*  The class BS1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BS1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BS1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_S_1_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBSFld11;
            protected  int beginBSFld21;
	
	/**
	* Constructor for BS1Serialized
	**/
    public BS1Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BS1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_S_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBSFld11 = getStartOffset() + 0;	// set offset for serialization
  
             beginBSFld21 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBSFld11Counter = -1;
     public boolean isBSFld11Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBSFld11Counter != sharedCounter;
         localBSFld11Counter = sharedCounter; return hasModified;
     }
	protected static final int B_SFLD_11_LEN = 30;
	/**
	 * 	serialize this BSFld11
	 */
   protected void serializeBSFld11(char[] bSFld11) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bSFld11,0,getStringValue(),beginBSFld11,B_SFLD_11_LEN);
       localBSFld11Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBSFld11Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBSFld11 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBSFld11() {	 
   		return (substring(getStringValue(),beginBSFld11,beginBSFld11 + B_SFLD_11_LEN));
   	}
     int localBSFld21Counter = -1;
     public boolean isBSFld21Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBSFld21Counter != sharedCounter;
         localBSFld21Counter = sharedCounter; return hasModified;
     }
	protected static final int B_SFLD_21_LEN = 40;
	/**
	 * 	serialize this BSFld21
	 */
   protected void serializeBSFld21(char[] bSFld21) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bSFld21,0,getStringValue(),beginBSFld21,B_SFLD_21_LEN);
       localBSFld21Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBSFld21Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBSFld21 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBSFld21() {	 
   		return (substring(getStringValue(),beginBSFld21,beginBSFld21 + B_SFLD_21_LEN));
   	}




}
  
