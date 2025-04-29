package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BS11Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BS11Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BS11Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_S_11_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBSFld111;
            protected  int beginBSFld211;
	
	/**
	* Constructor for BS11Serialized
	**/
    public BS11Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in BS11Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_S_11_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBSFld111 = getStartOffset() + 0;	// set offset for serialization
  
             beginBSFld211 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBSFld111Counter = -1;
     public boolean isBSFld111Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBSFld111Counter != sharedCounter;
         localBSFld111Counter = sharedCounter; return hasModified;
     }
	protected static final int B_SFLD_111_LEN = 30;
	/**
	 * 	serialize this BSFld111
	 */
   protected void serializeBSFld111(char[] bSFld111) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bSFld111,0,getStringValue(),beginBSFld111,B_SFLD_111_LEN);
       localBSFld111Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBSFld111Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBSFld111 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBSFld111() {	 
   		return (substring(getStringValue(),beginBSFld111,beginBSFld111 + B_SFLD_111_LEN));
   	}
     int localBSFld211Counter = -1;
     public boolean isBSFld211Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBSFld211Counter != sharedCounter;
         localBSFld211Counter = sharedCounter; return hasModified;
     }
	protected static final int B_SFLD_211_LEN = 40;
	/**
	 * 	serialize this BSFld211
	 */
   protected void serializeBSFld211(char[] bSFld211) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bSFld211,0,getStringValue(),beginBSFld211,B_SFLD_211_LEN);
       localBSFld211Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBSFld211Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBSFld211 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBSFld211() {	 
   		return (substring(getStringValue(),beginBSFld211,beginBSFld211 + B_SFLD_211_LEN));
   	}




}
  
