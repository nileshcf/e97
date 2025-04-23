package com.cloudframe.app.refmod1.dto.serialize;

/**
*  The class BT2Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BT2Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BT2Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_T_2_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTFld12;
            protected  int beginBTFld22;
            protected  int beginBTFld32;
	
	/**
	* Constructor for BT2Serialized
	**/
    public BT2Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BT2Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT2Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BT2Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this BT2Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in BT2Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_T_2_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBTFld12 = getStartOffset() + 0;	// set offset for serialization
  
             beginBTFld22 = getStartOffset() + 20;	// set offset for serialization
  
             beginBTFld32 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTFld12Counter = -1;
     public boolean isBTFld12Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld12Counter != sharedCounter;
         localBTFld12Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_12_LEN = 20;
	/**
	 * 	serialize this BTFld12
	 */
   protected void serializeBTFld12(char[] bTFld12) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld12,0,getStringValue(),beginBTFld12,B_TFLD_12_LEN);
       localBTFld12Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld12Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshBTFld12 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld12() {	 
   		return (substring(getStringValue(),beginBTFld12,beginBTFld12 + B_TFLD_12_LEN));
   	}
     int localBTFld22Counter = -1;
     public boolean isBTFld22Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld22Counter != sharedCounter;
         localBTFld22Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_22_LEN = 40;
	/**
	 * 	serialize this BTFld22
	 */
   protected void serializeBTFld22(char[] bTFld22) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld22,0,getStringValue(),beginBTFld22,B_TFLD_22_LEN);
       localBTFld22Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld22Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBTFld22 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld22() {	 
   		return (substring(getStringValue(),beginBTFld22,beginBTFld22 + B_TFLD_22_LEN));
   	}
     int localBTFld32Counter = -1;
     public boolean isBTFld32Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld32Counter != sharedCounter;
         localBTFld32Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_32_LEN = 30;
	/**
	 * 	serialize this BTFld32
	 */
   protected void serializeBTFld32(char[] bTFld32) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld32,0,getStringValue(),beginBTFld32,B_TFLD_32_LEN);
       localBTFld32Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld32Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBTFld32 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld32() {	 
   		return (substring(getStringValue(),beginBTFld32,beginBTFld32 + B_TFLD_32_LEN));
   	}




}
  
