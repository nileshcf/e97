package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class BT214Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:34. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BT214Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BT214Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_T_214_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTFld1214;
            protected  int beginBTFld2214;
            protected  int beginBTFld3214;
	
	/**
	* Constructor for BT214Serialized
	**/
    public BT214Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BT214Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT214Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BT214Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this BT214Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in BT214Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_T_214_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBTFld1214 = getStartOffset() + 0;	// set offset for serialization
  
             beginBTFld2214 = getStartOffset() + 20;	// set offset for serialization
  
             beginBTFld3214 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTFld1214Counter = -1;
     public boolean isBTFld1214Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld1214Counter != sharedCounter;
         localBTFld1214Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_1214_LEN = 20;
	/**
	 * 	serialize this BTFld1214
	 */
   protected void serializeBTFld1214(char[] bTFld1214) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld1214,0,getStringValue(),beginBTFld1214,B_TFLD_1214_LEN);
       localBTFld1214Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld1214Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshBTFld1214 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld1214() {	 
   		return (substring(getStringValue(),beginBTFld1214,beginBTFld1214 + B_TFLD_1214_LEN));
   	}
     int localBTFld2214Counter = -1;
     public boolean isBTFld2214Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld2214Counter != sharedCounter;
         localBTFld2214Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_2214_LEN = 40;
	/**
	 * 	serialize this BTFld2214
	 */
   protected void serializeBTFld2214(char[] bTFld2214) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld2214,0,getStringValue(),beginBTFld2214,B_TFLD_2214_LEN);
       localBTFld2214Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld2214Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBTFld2214 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld2214() {	 
   		return (substring(getStringValue(),beginBTFld2214,beginBTFld2214 + B_TFLD_2214_LEN));
   	}
     int localBTFld3214Counter = -1;
     public boolean isBTFld3214Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld3214Counter != sharedCounter;
         localBTFld3214Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_3214_LEN = 30;
	/**
	 * 	serialize this BTFld3214
	 */
   protected void serializeBTFld3214(char[] bTFld3214) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld3214,0,getStringValue(),beginBTFld3214,B_TFLD_3214_LEN);
       localBTFld3214Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld3214Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBTFld3214 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld3214() {	 
   		return (substring(getStringValue(),beginBTFld3214,beginBTFld3214 + B_TFLD_3214_LEN));
   	}




}
  
