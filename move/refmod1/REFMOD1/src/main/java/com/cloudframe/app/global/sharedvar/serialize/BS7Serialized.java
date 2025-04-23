package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BS7Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BS7Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BS7Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_S_7_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBSFld17;
            protected  int beginBSFld27;
	
	/**
	* Constructor for BS7Serialized
	**/
    public BS7Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in BS7Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_S_7_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBSFld17 = getStartOffset() + 0;	// set offset for serialization
  
             beginBSFld27 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBSFld17Counter = -1;
     public boolean isBSFld17Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBSFld17Counter != sharedCounter;
         localBSFld17Counter = sharedCounter; return hasModified;
     }
	protected static final int B_SFLD_17_LEN = 30;
	/**
	 * 	serialize this BSFld17
	 */
   protected void serializeBSFld17(char[] bSFld17) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bSFld17,0,getStringValue(),beginBSFld17,B_SFLD_17_LEN);
       localBSFld17Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBSFld17Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBSFld17 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBSFld17() {	 
   		return (substring(getStringValue(),beginBSFld17,beginBSFld17 + B_SFLD_17_LEN));
   	}
     int localBSFld27Counter = -1;
     public boolean isBSFld27Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBSFld27Counter != sharedCounter;
         localBSFld27Counter = sharedCounter; return hasModified;
     }
	protected static final int B_SFLD_27_LEN = 40;
	/**
	 * 	serialize this BSFld27
	 */
   protected void serializeBSFld27(char[] bSFld27) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bSFld27,0,getStringValue(),beginBSFld27,B_SFLD_27_LEN);
       localBSFld27Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBSFld27Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBSFld27 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBSFld27() {	 
   		return (substring(getStringValue(),beginBSFld27,beginBSFld27 + B_SFLD_27_LEN));
   	}




}
  
