package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BT8Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BT8Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BT8Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_T_8_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTFld18;
            protected  int beginBTFld28;
            protected  int beginBTFld38;
	
	/**
	* Constructor for BT8Serialized
	**/
    public BT8Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BT8Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT8Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BT8Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this BT8Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in BT8Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_T_8_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBTFld18 = getStartOffset() + 0;	// set offset for serialization
  
             beginBTFld28 = getStartOffset() + 20;	// set offset for serialization
  
             beginBTFld38 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTFld18Counter = -1;
     public boolean isBTFld18Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld18Counter != sharedCounter;
         localBTFld18Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_18_LEN = 20;
	/**
	 * 	serialize this BTFld18
	 */
   protected void serializeBTFld18(char[] bTFld18) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld18,0,getStringValue(),beginBTFld18,B_TFLD_18_LEN);
       localBTFld18Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld18Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshBTFld18 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld18() {	 
   		return (substring(getStringValue(),beginBTFld18,beginBTFld18 + B_TFLD_18_LEN));
   	}
     int localBTFld28Counter = -1;
     public boolean isBTFld28Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld28Counter != sharedCounter;
         localBTFld28Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_28_LEN = 40;
	/**
	 * 	serialize this BTFld28
	 */
   protected void serializeBTFld28(char[] bTFld28) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld28,0,getStringValue(),beginBTFld28,B_TFLD_28_LEN);
       localBTFld28Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld28Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBTFld28 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld28() {	 
   		return (substring(getStringValue(),beginBTFld28,beginBTFld28 + B_TFLD_28_LEN));
   	}
     int localBTFld38Counter = -1;
     public boolean isBTFld38Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld38Counter != sharedCounter;
         localBTFld38Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_38_LEN = 30;
	/**
	 * 	serialize this BTFld38
	 */
   protected void serializeBTFld38(char[] bTFld38) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld38,0,getStringValue(),beginBTFld38,B_TFLD_38_LEN);
       localBTFld38Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld38Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBTFld38 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld38() {	 
   		return (substring(getStringValue(),beginBTFld38,beginBTFld38 + B_TFLD_38_LEN));
   	}




}
  
