package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BS19Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BS19Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BS19Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_S_19_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBSFld119;
            protected  int beginBSFld219;
	
	/**
	* Constructor for BS19Serialized
	**/
    public BS19Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in BS19Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_S_19_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBSFld119 = getStartOffset() + 0;	// set offset for serialization
  
             beginBSFld219 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBSFld119Counter = -1;
     public boolean isBSFld119Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBSFld119Counter != sharedCounter;
         localBSFld119Counter = sharedCounter; return hasModified;
     }
	protected static final int B_SFLD_119_LEN = 30;
	/**
	 * 	serialize this BSFld119
	 */
   protected void serializeBSFld119(char[] bSFld119) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bSFld119,0,getStringValue(),beginBSFld119,B_SFLD_119_LEN);
       localBSFld119Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBSFld119Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBSFld119 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBSFld119() {	 
   		return (substring(getStringValue(),beginBSFld119,beginBSFld119 + B_SFLD_119_LEN));
   	}
     int localBSFld219Counter = -1;
     public boolean isBSFld219Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBSFld219Counter != sharedCounter;
         localBSFld219Counter = sharedCounter; return hasModified;
     }
	protected static final int B_SFLD_219_LEN = 40;
	/**
	 * 	serialize this BSFld219
	 */
   protected void serializeBSFld219(char[] bSFld219) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bSFld219,0,getStringValue(),beginBSFld219,B_SFLD_219_LEN);
       localBSFld219Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBSFld219Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBSFld219 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBSFld219() {	 
   		return (substring(getStringValue(),beginBSFld219,beginBSFld219 + B_SFLD_219_LEN));
   	}




}
  
