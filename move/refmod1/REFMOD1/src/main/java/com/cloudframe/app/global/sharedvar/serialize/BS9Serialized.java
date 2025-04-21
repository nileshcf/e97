package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BS9Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BS9Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BS9Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_S_9_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBSFld19;
            protected  int beginBSFld29;
	
	/**
	* Constructor for BS9Serialized
	**/
    public BS9Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BS9Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BS9Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BS9Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3); // serialize this field at offset 3 by default 
    }
    
	/**
	* sets parent for this BS9Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3 by default
    }    
	/**
	* initializes the field in BS9Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_S_9_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBSFld19 = getStartOffset() + 0;	// set offset for serialization
  
             beginBSFld29 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBSFld19Counter = -1;
     public boolean isBSFld19Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBSFld19Counter != sharedCounter;
         localBSFld19Counter = sharedCounter; return hasModified;
     }
	protected static final int B_SFLD_19_LEN = 30;
	/**
	 * 	serialize this BSFld19
	 */
   protected void serializeBSFld19(char[] bSFld19) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bSFld19,0,getStringValue(),beginBSFld19,B_SFLD_19_LEN);
       localBSFld19Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBSFld19Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBSFld19 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBSFld19() {	 
   		return (substring(getStringValue(),beginBSFld19,beginBSFld19 + B_SFLD_19_LEN));
   	}
     int localBSFld29Counter = -1;
     public boolean isBSFld29Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBSFld29Counter != sharedCounter;
         localBSFld29Counter = sharedCounter; return hasModified;
     }
	protected static final int B_SFLD_29_LEN = 40;
	/**
	 * 	serialize this BSFld29
	 */
   protected void serializeBSFld29(char[] bSFld29) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bSFld29,0,getStringValue(),beginBSFld29,B_SFLD_29_LEN);
       localBSFld29Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBSFld29Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBSFld29 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBSFld29() {	 
   		return (substring(getStringValue(),beginBSFld29,beginBSFld29 + B_SFLD_29_LEN));
   	}




}
  
