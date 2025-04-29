package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BT19Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BT19Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BT19Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_T_19_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTFld119;
            protected  int beginBTFld219;
            protected  int beginBTFld319;
	
	/**
	* Constructor for BT19Serialized
	**/
    public BT19Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BT19Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT19Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BT19Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this BT19Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in BT19Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_T_19_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBTFld119 = getStartOffset() + 0;	// set offset for serialization
  
             beginBTFld219 = getStartOffset() + 20;	// set offset for serialization
  
             beginBTFld319 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTFld119Counter = -1;
     public boolean isBTFld119Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld119Counter != sharedCounter;
         localBTFld119Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_119_LEN = 20;
	/**
	 * 	serialize this BTFld119
	 */
   protected void serializeBTFld119(char[] bTFld119) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld119,0,getStringValue(),beginBTFld119,B_TFLD_119_LEN);
       localBTFld119Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld119Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshBTFld119 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld119() {	 
   		return (substring(getStringValue(),beginBTFld119,beginBTFld119 + B_TFLD_119_LEN));
   	}
     int localBTFld219Counter = -1;
     public boolean isBTFld219Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld219Counter != sharedCounter;
         localBTFld219Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_219_LEN = 40;
	/**
	 * 	serialize this BTFld219
	 */
   protected void serializeBTFld219(char[] bTFld219) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld219,0,getStringValue(),beginBTFld219,B_TFLD_219_LEN);
       localBTFld219Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld219Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBTFld219 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld219() {	 
   		return (substring(getStringValue(),beginBTFld219,beginBTFld219 + B_TFLD_219_LEN));
   	}
     int localBTFld319Counter = -1;
     public boolean isBTFld319Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld319Counter != sharedCounter;
         localBTFld319Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_319_LEN = 30;
	/**
	 * 	serialize this BTFld319
	 */
   protected void serializeBTFld319(char[] bTFld319) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld319,0,getStringValue(),beginBTFld319,B_TFLD_319_LEN);
       localBTFld319Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld319Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBTFld319 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld319() {	 
   		return (substring(getStringValue(),beginBTFld319,beginBTFld319 + B_TFLD_319_LEN));
   	}




}
  
