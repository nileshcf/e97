package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BS13Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BS13Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BS13Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_S_13_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBSFld113;
            protected  int beginBSFld213;
	
	/**
	* Constructor for BS13Serialized
	**/
    public BS13Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BS13Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BS13Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BS13Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3); // serialize this field at offset 3 by default 
    }
    
	/**
	* sets parent for this BS13Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3 by default
    }    
	/**
	* initializes the field in BS13Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_S_13_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBSFld113 = getStartOffset() + 0;	// set offset for serialization
  
             beginBSFld213 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBSFld113Counter = -1;
     public boolean isBSFld113Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBSFld113Counter != sharedCounter;
         localBSFld113Counter = sharedCounter; return hasModified;
     }
	protected static final int B_SFLD_113_LEN = 30;
	/**
	 * 	serialize this BSFld113
	 */
   protected void serializeBSFld113(char[] bSFld113) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bSFld113,0,getStringValue(),beginBSFld113,B_SFLD_113_LEN);
       localBSFld113Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBSFld113Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBSFld113 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBSFld113() {	 
   		return (substring(getStringValue(),beginBSFld113,beginBSFld113 + B_SFLD_113_LEN));
   	}
     int localBSFld213Counter = -1;
     public boolean isBSFld213Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBSFld213Counter != sharedCounter;
         localBSFld213Counter = sharedCounter; return hasModified;
     }
	protected static final int B_SFLD_213_LEN = 40;
	/**
	 * 	serialize this BSFld213
	 */
   protected void serializeBSFld213(char[] bSFld213) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bSFld213,0,getStringValue(),beginBSFld213,B_SFLD_213_LEN);
       localBSFld213Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBSFld213Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBSFld213 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBSFld213() {	 
   		return (substring(getStringValue(),beginBSFld213,beginBSFld213 + B_SFLD_213_LEN));
   	}




}
  
