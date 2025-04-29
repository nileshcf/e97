package com.cloudframe.app.refmod1.dto.serialize;

/**
*  The class BS3Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BS3Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BS3Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_S_3_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBSFld13;
            protected  int beginBSFld23;
	
	/**
	* Constructor for BS3Serialized
	**/
    public BS3Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BS3Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_S_3_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBSFld13 = getStartOffset() + 0;	// set offset for serialization
  
             beginBSFld23 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBSFld13Counter = -1;
     public boolean isBSFld13Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBSFld13Counter != sharedCounter;
         localBSFld13Counter = sharedCounter; return hasModified;
     }
	protected static final int B_SFLD_13_LEN = 30;
	/**
	 * 	serialize this BSFld13
	 */
   protected void serializeBSFld13(char[] bSFld13) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bSFld13,0,getStringValue(),beginBSFld13,B_SFLD_13_LEN);
       localBSFld13Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBSFld13Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBSFld13 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBSFld13() {	 
   		return (substring(getStringValue(),beginBSFld13,beginBSFld13 + B_SFLD_13_LEN));
   	}
     int localBSFld23Counter = -1;
     public boolean isBSFld23Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBSFld23Counter != sharedCounter;
         localBSFld23Counter = sharedCounter; return hasModified;
     }
	protected static final int B_SFLD_23_LEN = 40;
	/**
	 * 	serialize this BSFld23
	 */
   protected void serializeBSFld23(char[] bSFld23) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bSFld23,0,getStringValue(),beginBSFld23,B_SFLD_23_LEN);
       localBSFld23Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBSFld23Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBSFld23 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBSFld23() {	 
   		return (substring(getStringValue(),beginBSFld23,beginBSFld23 + B_SFLD_23_LEN));
   	}




}
  
