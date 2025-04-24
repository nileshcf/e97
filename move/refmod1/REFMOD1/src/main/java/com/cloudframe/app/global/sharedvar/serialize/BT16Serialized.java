package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BT16Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BT16Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BT16Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_T_16_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTFld116;
            protected  int beginBTFld216;
            protected  int beginBTFld316;
	
	/**
	* Constructor for BT16Serialized
	**/
    public BT16Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BT16Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT16Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BT16Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this BT16Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in BT16Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_T_16_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBTFld116 = getStartOffset() + 0;	// set offset for serialization
  
             beginBTFld216 = getStartOffset() + 20;	// set offset for serialization
  
             beginBTFld316 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTFld116Counter = -1;
     public boolean isBTFld116Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld116Counter != sharedCounter;
         localBTFld116Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_116_LEN = 20;
	/**
	 * 	serialize this BTFld116
	 */
   protected void serializeBTFld116(char[] bTFld116) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld116,0,getStringValue(),beginBTFld116,B_TFLD_116_LEN);
       localBTFld116Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld116Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshBTFld116 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld116() {	 
   		return (substring(getStringValue(),beginBTFld116,beginBTFld116 + B_TFLD_116_LEN));
   	}
     int localBTFld216Counter = -1;
     public boolean isBTFld216Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld216Counter != sharedCounter;
         localBTFld216Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_216_LEN = 40;
	/**
	 * 	serialize this BTFld216
	 */
   protected void serializeBTFld216(char[] bTFld216) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld216,0,getStringValue(),beginBTFld216,B_TFLD_216_LEN);
       localBTFld216Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld216Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBTFld216 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld216() {	 
   		return (substring(getStringValue(),beginBTFld216,beginBTFld216 + B_TFLD_216_LEN));
   	}
     int localBTFld316Counter = -1;
     public boolean isBTFld316Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld316Counter != sharedCounter;
         localBTFld316Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_316_LEN = 30;
	/**
	 * 	serialize this BTFld316
	 */
   protected void serializeBTFld316(char[] bTFld316) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld316,0,getStringValue(),beginBTFld316,B_TFLD_316_LEN);
       localBTFld316Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld316Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBTFld316 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld316() {	 
   		return (substring(getStringValue(),beginBTFld316,beginBTFld316 + B_TFLD_316_LEN));
   	}




}
  
