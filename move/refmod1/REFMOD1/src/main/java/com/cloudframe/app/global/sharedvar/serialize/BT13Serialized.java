package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BT13Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BT13Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BT13Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_T_13_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTFld113;
            protected  int beginBTFld213;
            protected  int beginBTFld313;
	
	/**
	* Constructor for BT13Serialized
	**/
    public BT13Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BT13Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT13Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BT13Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this BT13Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in BT13Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_T_13_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBTFld113 = getStartOffset() + 0;	// set offset for serialization
  
             beginBTFld213 = getStartOffset() + 20;	// set offset for serialization
  
             beginBTFld313 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTFld113Counter = -1;
     public boolean isBTFld113Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld113Counter != sharedCounter;
         localBTFld113Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_113_LEN = 20;
	/**
	 * 	serialize this BTFld113
	 */
   protected void serializeBTFld113(char[] bTFld113) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld113,0,getStringValue(),beginBTFld113,B_TFLD_113_LEN);
       localBTFld113Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld113Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshBTFld113 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld113() {	 
   		return (substring(getStringValue(),beginBTFld113,beginBTFld113 + B_TFLD_113_LEN));
   	}
     int localBTFld213Counter = -1;
     public boolean isBTFld213Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld213Counter != sharedCounter;
         localBTFld213Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_213_LEN = 40;
	/**
	 * 	serialize this BTFld213
	 */
   protected void serializeBTFld213(char[] bTFld213) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld213,0,getStringValue(),beginBTFld213,B_TFLD_213_LEN);
       localBTFld213Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld213Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBTFld213 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld213() {	 
   		return (substring(getStringValue(),beginBTFld213,beginBTFld213 + B_TFLD_213_LEN));
   	}
     int localBTFld313Counter = -1;
     public boolean isBTFld313Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld313Counter != sharedCounter;
         localBTFld313Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_313_LEN = 30;
	/**
	 * 	serialize this BTFld313
	 */
   protected void serializeBTFld313(char[] bTFld313) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld313,0,getStringValue(),beginBTFld313,B_TFLD_313_LEN);
       localBTFld313Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld313Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBTFld313 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld313() {	 
   		return (substring(getStringValue(),beginBTFld313,beginBTFld313 + B_TFLD_313_LEN));
   	}




}
  
