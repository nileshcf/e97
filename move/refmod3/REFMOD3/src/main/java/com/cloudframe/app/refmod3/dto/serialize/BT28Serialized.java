package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class BT28Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BT28Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BT28Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_T_28_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTFld128;
            protected  int beginBTFld228;
            protected  int beginBTFld328;
	
	/**
	* Constructor for BT28Serialized
	**/
    public BT28Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BT28Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT28Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BT28Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this BT28Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in BT28Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_T_28_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBTFld128 = getStartOffset() + 0;	// set offset for serialization
  
             beginBTFld228 = getStartOffset() + 20;	// set offset for serialization
  
             beginBTFld328 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTFld128Counter = -1;
     public boolean isBTFld128Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld128Counter != sharedCounter;
         localBTFld128Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_128_LEN = 20;
	/**
	 * 	serialize this BTFld128
	 */
   protected void serializeBTFld128(char[] bTFld128) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld128,0,getStringValue(),beginBTFld128,B_TFLD_128_LEN);
       localBTFld128Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld128Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshBTFld128 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld128() {	 
   		return (substring(getStringValue(),beginBTFld128,beginBTFld128 + B_TFLD_128_LEN));
   	}
     int localBTFld228Counter = -1;
     public boolean isBTFld228Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld228Counter != sharedCounter;
         localBTFld228Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_228_LEN = 40;
	/**
	 * 	serialize this BTFld228
	 */
   protected void serializeBTFld228(char[] bTFld228) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld228,0,getStringValue(),beginBTFld228,B_TFLD_228_LEN);
       localBTFld228Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld228Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBTFld228 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld228() {	 
   		return (substring(getStringValue(),beginBTFld228,beginBTFld228 + B_TFLD_228_LEN));
   	}
     int localBTFld328Counter = -1;
     public boolean isBTFld328Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld328Counter != sharedCounter;
         localBTFld328Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_328_LEN = 30;
	/**
	 * 	serialize this BTFld328
	 */
   protected void serializeBTFld328(char[] bTFld328) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld328,0,getStringValue(),beginBTFld328,B_TFLD_328_LEN);
       localBTFld328Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld328Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBTFld328 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld328() {	 
   		return (substring(getStringValue(),beginBTFld328,beginBTFld328 + B_TFLD_328_LEN));
   	}




}
  
