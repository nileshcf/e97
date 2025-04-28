package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class BT213Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:58. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BT213Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BT213Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_T_213_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTFld1213;
            protected  int beginBTFld2213;
            protected  int beginBTFld3213;
	
	/**
	* Constructor for BT213Serialized
	**/
    public BT213Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BT213Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT213Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BT213Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this BT213Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in BT213Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_T_213_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBTFld1213 = getStartOffset() + 0;	// set offset for serialization
  
             beginBTFld2213 = getStartOffset() + 20;	// set offset for serialization
  
             beginBTFld3213 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTFld1213Counter = -1;
     public boolean isBTFld1213Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld1213Counter != sharedCounter;
         localBTFld1213Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_1213_LEN = 20;
	/**
	 * 	serialize this BTFld1213
	 */
   protected void serializeBTFld1213(char[] bTFld1213) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld1213,0,getStringValue(),beginBTFld1213,B_TFLD_1213_LEN);
       localBTFld1213Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld1213Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshBTFld1213 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld1213() {	 
   		return (substring(getStringValue(),beginBTFld1213,beginBTFld1213 + B_TFLD_1213_LEN));
   	}
     int localBTFld2213Counter = -1;
     public boolean isBTFld2213Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld2213Counter != sharedCounter;
         localBTFld2213Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_2213_LEN = 40;
	/**
	 * 	serialize this BTFld2213
	 */
   protected void serializeBTFld2213(char[] bTFld2213) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld2213,0,getStringValue(),beginBTFld2213,B_TFLD_2213_LEN);
       localBTFld2213Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld2213Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBTFld2213 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld2213() {	 
   		return (substring(getStringValue(),beginBTFld2213,beginBTFld2213 + B_TFLD_2213_LEN));
   	}
     int localBTFld3213Counter = -1;
     public boolean isBTFld3213Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld3213Counter != sharedCounter;
         localBTFld3213Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_3213_LEN = 30;
	/**
	 * 	serialize this BTFld3213
	 */
   protected void serializeBTFld3213(char[] bTFld3213) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld3213,0,getStringValue(),beginBTFld3213,B_TFLD_3213_LEN);
       localBTFld3213Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld3213Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBTFld3213 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld3213() {	 
   		return (substring(getStringValue(),beginBTFld3213,beginBTFld3213 + B_TFLD_3213_LEN));
   	}




}
  
