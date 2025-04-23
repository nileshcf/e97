package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BT20Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BT20Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BT20Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_T_20_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTFld120;
            protected  int beginBTFld220;
            protected  int beginBTFld320;
	
	/**
	* Constructor for BT20Serialized
	**/
    public BT20Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BT20Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT20Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BT20Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this BT20Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in BT20Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_T_20_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBTFld120 = getStartOffset() + 0;	// set offset for serialization
  
             beginBTFld220 = getStartOffset() + 20;	// set offset for serialization
  
             beginBTFld320 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTFld120Counter = -1;
     public boolean isBTFld120Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld120Counter != sharedCounter;
         localBTFld120Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_120_LEN = 20;
	/**
	 * 	serialize this BTFld120
	 */
   protected void serializeBTFld120(char[] bTFld120) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld120,0,getStringValue(),beginBTFld120,B_TFLD_120_LEN);
       localBTFld120Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld120Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshBTFld120 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld120() {	 
   		return (substring(getStringValue(),beginBTFld120,beginBTFld120 + B_TFLD_120_LEN));
   	}
     int localBTFld220Counter = -1;
     public boolean isBTFld220Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld220Counter != sharedCounter;
         localBTFld220Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_220_LEN = 40;
	/**
	 * 	serialize this BTFld220
	 */
   protected void serializeBTFld220(char[] bTFld220) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld220,0,getStringValue(),beginBTFld220,B_TFLD_220_LEN);
       localBTFld220Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld220Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBTFld220 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld220() {	 
   		return (substring(getStringValue(),beginBTFld220,beginBTFld220 + B_TFLD_220_LEN));
   	}
     int localBTFld320Counter = -1;
     public boolean isBTFld320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld320Counter != sharedCounter;
         localBTFld320Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_320_LEN = 30;
	/**
	 * 	serialize this BTFld320
	 */
   protected void serializeBTFld320(char[] bTFld320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld320,0,getStringValue(),beginBTFld320,B_TFLD_320_LEN);
       localBTFld320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld320Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBTFld320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld320() {	 
   		return (substring(getStringValue(),beginBTFld320,beginBTFld320 + B_TFLD_320_LEN));
   	}




}
  
