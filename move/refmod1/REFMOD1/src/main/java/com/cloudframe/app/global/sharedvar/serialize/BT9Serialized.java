package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BT9Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BT9Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BT9Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_T_9_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTFld19;
            protected  int beginBTFld29;
            protected  int beginBTFld39;
	
	/**
	* Constructor for BT9Serialized
	**/
    public BT9Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BT9Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT9Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BT9Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this BT9Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in BT9Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_T_9_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBTFld19 = getStartOffset() + 0;	// set offset for serialization
  
             beginBTFld29 = getStartOffset() + 20;	// set offset for serialization
  
             beginBTFld39 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTFld19Counter = -1;
     public boolean isBTFld19Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld19Counter != sharedCounter;
         localBTFld19Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_19_LEN = 20;
	/**
	 * 	serialize this BTFld19
	 */
   protected void serializeBTFld19(char[] bTFld19) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld19,0,getStringValue(),beginBTFld19,B_TFLD_19_LEN);
       localBTFld19Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld19Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshBTFld19 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld19() {	 
   		return (substring(getStringValue(),beginBTFld19,beginBTFld19 + B_TFLD_19_LEN));
   	}
     int localBTFld29Counter = -1;
     public boolean isBTFld29Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld29Counter != sharedCounter;
         localBTFld29Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_29_LEN = 40;
	/**
	 * 	serialize this BTFld29
	 */
   protected void serializeBTFld29(char[] bTFld29) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld29,0,getStringValue(),beginBTFld29,B_TFLD_29_LEN);
       localBTFld29Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld29Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBTFld29 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld29() {	 
   		return (substring(getStringValue(),beginBTFld29,beginBTFld29 + B_TFLD_29_LEN));
   	}
     int localBTFld39Counter = -1;
     public boolean isBTFld39Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld39Counter != sharedCounter;
         localBTFld39Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_39_LEN = 30;
	/**
	 * 	serialize this BTFld39
	 */
   protected void serializeBTFld39(char[] bTFld39) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld39,0,getStringValue(),beginBTFld39,B_TFLD_39_LEN);
       localBTFld39Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld39Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBTFld39 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld39() {	 
   		return (substring(getStringValue(),beginBTFld39,beginBTFld39 + B_TFLD_39_LEN));
   	}




}
  
