package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class BS213Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:10. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BS213Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BS213Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_S_213_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBSFld1213;
            protected  int beginBSFld2213;
	
	/**
	* Constructor for BS213Serialized
	**/
    public BS213Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BS213Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BS213Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BS213Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3); // serialize this field at offset 3 by default 
    }
    
	/**
	* sets parent for this BS213Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3 by default
    }    
	/**
	* initializes the field in BS213Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_S_213_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBSFld1213 = getStartOffset() + 0;	// set offset for serialization
  
             beginBSFld2213 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBSFld1213Counter = -1;
     public boolean isBSFld1213Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBSFld1213Counter != sharedCounter;
         localBSFld1213Counter = sharedCounter; return hasModified;
     }
	protected static final int B_SFLD_1213_LEN = 30;
	/**
	 * 	serialize this BSFld1213
	 */
   protected void serializeBSFld1213(char[] bSFld1213) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bSFld1213,0,getStringValue(),beginBSFld1213,B_SFLD_1213_LEN);
       localBSFld1213Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBSFld1213Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBSFld1213 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBSFld1213() {	 
   		return (substring(getStringValue(),beginBSFld1213,beginBSFld1213 + B_SFLD_1213_LEN));
   	}
     int localBSFld2213Counter = -1;
     public boolean isBSFld2213Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBSFld2213Counter != sharedCounter;
         localBSFld2213Counter = sharedCounter; return hasModified;
     }
	protected static final int B_SFLD_2213_LEN = 40;
	/**
	 * 	serialize this BSFld2213
	 */
   protected void serializeBSFld2213(char[] bSFld2213) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bSFld2213,0,getStringValue(),beginBSFld2213,B_SFLD_2213_LEN);
       localBSFld2213Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBSFld2213Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBSFld2213 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBSFld2213() {	 
   		return (substring(getStringValue(),beginBSFld2213,beginBSFld2213 + B_SFLD_2213_LEN));
   	}




}
  
