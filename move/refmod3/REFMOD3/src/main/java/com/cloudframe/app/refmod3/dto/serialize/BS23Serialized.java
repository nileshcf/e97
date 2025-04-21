package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class BS23Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BS23Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BS23Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_S_23_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBSFld123;
            protected  int beginBSFld223;
	
	/**
	* Constructor for BS23Serialized
	**/
    public BS23Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BS23Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_S_23_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBSFld123 = getStartOffset() + 0;	// set offset for serialization
  
             beginBSFld223 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBSFld123Counter = -1;
     public boolean isBSFld123Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBSFld123Counter != sharedCounter;
         localBSFld123Counter = sharedCounter; return hasModified;
     }
	protected static final int B_SFLD_123_LEN = 30;
	/**
	 * 	serialize this BSFld123
	 */
   protected void serializeBSFld123(char[] bSFld123) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bSFld123,0,getStringValue(),beginBSFld123,B_SFLD_123_LEN);
       localBSFld123Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBSFld123Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBSFld123 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBSFld123() {	 
   		return (substring(getStringValue(),beginBSFld123,beginBSFld123 + B_SFLD_123_LEN));
   	}
     int localBSFld223Counter = -1;
     public boolean isBSFld223Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBSFld223Counter != sharedCounter;
         localBSFld223Counter = sharedCounter; return hasModified;
     }
	protected static final int B_SFLD_223_LEN = 40;
	/**
	 * 	serialize this BSFld223
	 */
   protected void serializeBSFld223(char[] bSFld223) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bSFld223,0,getStringValue(),beginBSFld223,B_SFLD_223_LEN);
       localBSFld223Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBSFld223Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBSFld223 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBSFld223() {	 
   		return (substring(getStringValue(),beginBSFld223,beginBSFld223 + B_SFLD_223_LEN));
   	}




}
  
