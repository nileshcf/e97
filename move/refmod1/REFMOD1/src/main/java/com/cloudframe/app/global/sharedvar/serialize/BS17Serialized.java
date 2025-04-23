package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BS17Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BS17Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BS17Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_S_17_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBSFld117;
            protected  int beginBSFld217;
	
	/**
	* Constructor for BS17Serialized
	**/
    public BS17Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in BS17Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_S_17_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBSFld117 = getStartOffset() + 0;	// set offset for serialization
  
             beginBSFld217 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBSFld117Counter = -1;
     public boolean isBSFld117Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBSFld117Counter != sharedCounter;
         localBSFld117Counter = sharedCounter; return hasModified;
     }
	protected static final int B_SFLD_117_LEN = 30;
	/**
	 * 	serialize this BSFld117
	 */
   protected void serializeBSFld117(char[] bSFld117) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bSFld117,0,getStringValue(),beginBSFld117,B_SFLD_117_LEN);
       localBSFld117Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBSFld117Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBSFld117 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBSFld117() {	 
   		return (substring(getStringValue(),beginBSFld117,beginBSFld117 + B_SFLD_117_LEN));
   	}
     int localBSFld217Counter = -1;
     public boolean isBSFld217Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBSFld217Counter != sharedCounter;
         localBSFld217Counter = sharedCounter; return hasModified;
     }
	protected static final int B_SFLD_217_LEN = 40;
	/**
	 * 	serialize this BSFld217
	 */
   protected void serializeBSFld217(char[] bSFld217) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bSFld217,0,getStringValue(),beginBSFld217,B_SFLD_217_LEN);
       localBSFld217Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBSFld217Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBSFld217 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBSFld217() {	 
   		return (substring(getStringValue(),beginBSFld217,beginBSFld217 + B_SFLD_217_LEN));
   	}




}
  
