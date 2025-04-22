package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BT17Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BT17Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BT17Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_T_17_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTFld117;
            protected  int beginBTFld217;
            protected  int beginBTFld317;
	
	/**
	* Constructor for BT17Serialized
	**/
    public BT17Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BT17Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT17Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BT17Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this BT17Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in BT17Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_T_17_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBTFld117 = getStartOffset() + 0;	// set offset for serialization
  
             beginBTFld217 = getStartOffset() + 20;	// set offset for serialization
  
             beginBTFld317 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTFld117Counter = -1;
     public boolean isBTFld117Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld117Counter != sharedCounter;
         localBTFld117Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_117_LEN = 20;
	/**
	 * 	serialize this BTFld117
	 */
   protected void serializeBTFld117(char[] bTFld117) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld117,0,getStringValue(),beginBTFld117,B_TFLD_117_LEN);
       localBTFld117Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld117Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshBTFld117 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld117() {	 
   		return (substring(getStringValue(),beginBTFld117,beginBTFld117 + B_TFLD_117_LEN));
   	}
     int localBTFld217Counter = -1;
     public boolean isBTFld217Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld217Counter != sharedCounter;
         localBTFld217Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_217_LEN = 40;
	/**
	 * 	serialize this BTFld217
	 */
   protected void serializeBTFld217(char[] bTFld217) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld217,0,getStringValue(),beginBTFld217,B_TFLD_217_LEN);
       localBTFld217Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld217Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBTFld217 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld217() {	 
   		return (substring(getStringValue(),beginBTFld217,beginBTFld217 + B_TFLD_217_LEN));
   	}
     int localBTFld317Counter = -1;
     public boolean isBTFld317Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld317Counter != sharedCounter;
         localBTFld317Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_317_LEN = 30;
	/**
	 * 	serialize this BTFld317
	 */
   protected void serializeBTFld317(char[] bTFld317) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld317,0,getStringValue(),beginBTFld317,B_TFLD_317_LEN);
       localBTFld317Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld317Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBTFld317 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld317() {	 
   		return (substring(getStringValue(),beginBTFld317,beginBTFld317 + B_TFLD_317_LEN));
   	}




}
  
