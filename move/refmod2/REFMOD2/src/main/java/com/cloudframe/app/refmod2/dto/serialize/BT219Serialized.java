package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class BT219Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BT219Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BT219Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_T_219_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTFld1219;
            protected  int beginBTFld2219;
            protected  int beginBTFld3219;
	
	/**
	* Constructor for BT219Serialized
	**/
    public BT219Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BT219Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT219Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BT219Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this BT219Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in BT219Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_T_219_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBTFld1219 = getStartOffset() + 0;	// set offset for serialization
  
             beginBTFld2219 = getStartOffset() + 20;	// set offset for serialization
  
             beginBTFld3219 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTFld1219Counter = -1;
     public boolean isBTFld1219Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld1219Counter != sharedCounter;
         localBTFld1219Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_1219_LEN = 20;
	/**
	 * 	serialize this BTFld1219
	 */
   protected void serializeBTFld1219(char[] bTFld1219) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld1219,0,getStringValue(),beginBTFld1219,B_TFLD_1219_LEN);
       localBTFld1219Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld1219Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshBTFld1219 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld1219() {	 
   		return (substring(getStringValue(),beginBTFld1219,beginBTFld1219 + B_TFLD_1219_LEN));
   	}
     int localBTFld2219Counter = -1;
     public boolean isBTFld2219Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld2219Counter != sharedCounter;
         localBTFld2219Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_2219_LEN = 40;
	/**
	 * 	serialize this BTFld2219
	 */
   protected void serializeBTFld2219(char[] bTFld2219) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld2219,0,getStringValue(),beginBTFld2219,B_TFLD_2219_LEN);
       localBTFld2219Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld2219Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBTFld2219 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld2219() {	 
   		return (substring(getStringValue(),beginBTFld2219,beginBTFld2219 + B_TFLD_2219_LEN));
   	}
     int localBTFld3219Counter = -1;
     public boolean isBTFld3219Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld3219Counter != sharedCounter;
         localBTFld3219Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_3219_LEN = 30;
	/**
	 * 	serialize this BTFld3219
	 */
   protected void serializeBTFld3219(char[] bTFld3219) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld3219,0,getStringValue(),beginBTFld3219,B_TFLD_3219_LEN);
       localBTFld3219Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld3219Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBTFld3219 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld3219() {	 
   		return (substring(getStringValue(),beginBTFld3219,beginBTFld3219 + B_TFLD_3219_LEN));
   	}




}
  
