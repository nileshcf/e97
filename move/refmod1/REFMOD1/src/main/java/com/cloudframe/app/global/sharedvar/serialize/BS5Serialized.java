package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BS5Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BS5Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BS5Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_S_5_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBSFld15;
            protected  int beginBSFld25;
	
	/**
	* Constructor for BS5Serialized
	**/
    public BS5Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BS5Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BS5Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BS5Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3); // serialize this field at offset 3 by default 
    }
    
	/**
	* sets parent for this BS5Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3 by default
    }    
	/**
	* initializes the field in BS5Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_S_5_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBSFld15 = getStartOffset() + 0;	// set offset for serialization
  
             beginBSFld25 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBSFld15Counter = -1;
     public boolean isBSFld15Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBSFld15Counter != sharedCounter;
         localBSFld15Counter = sharedCounter; return hasModified;
     }
	protected static final int B_SFLD_15_LEN = 30;
	/**
	 * 	serialize this BSFld15
	 */
   protected void serializeBSFld15(char[] bSFld15) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bSFld15,0,getStringValue(),beginBSFld15,B_SFLD_15_LEN);
       localBSFld15Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBSFld15Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBSFld15 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBSFld15() {	 
   		return (substring(getStringValue(),beginBSFld15,beginBSFld15 + B_SFLD_15_LEN));
   	}
     int localBSFld25Counter = -1;
     public boolean isBSFld25Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBSFld25Counter != sharedCounter;
         localBSFld25Counter = sharedCounter; return hasModified;
     }
	protected static final int B_SFLD_25_LEN = 40;
	/**
	 * 	serialize this BSFld25
	 */
   protected void serializeBSFld25(char[] bSFld25) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bSFld25,0,getStringValue(),beginBSFld25,B_SFLD_25_LEN);
       localBSFld25Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBSFld25Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBSFld25 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBSFld25() {	 
   		return (substring(getStringValue(),beginBSFld25,beginBSFld25 + B_SFLD_25_LEN));
   	}




}
  
