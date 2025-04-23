package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BT12Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BT12Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BT12Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_T_12_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTFld112;
            protected  int beginBTFld212;
            protected  int beginBTFld312;
	
	/**
	* Constructor for BT12Serialized
	**/
    public BT12Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BT12Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT12Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BT12Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this BT12Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in BT12Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_T_12_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBTFld112 = getStartOffset() + 0;	// set offset for serialization
  
             beginBTFld212 = getStartOffset() + 20;	// set offset for serialization
  
             beginBTFld312 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTFld112Counter = -1;
     public boolean isBTFld112Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld112Counter != sharedCounter;
         localBTFld112Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_112_LEN = 20;
	/**
	 * 	serialize this BTFld112
	 */
   protected void serializeBTFld112(char[] bTFld112) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld112,0,getStringValue(),beginBTFld112,B_TFLD_112_LEN);
       localBTFld112Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld112Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshBTFld112 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld112() {	 
   		return (substring(getStringValue(),beginBTFld112,beginBTFld112 + B_TFLD_112_LEN));
   	}
     int localBTFld212Counter = -1;
     public boolean isBTFld212Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld212Counter != sharedCounter;
         localBTFld212Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_212_LEN = 40;
	/**
	 * 	serialize this BTFld212
	 */
   protected void serializeBTFld212(char[] bTFld212) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld212,0,getStringValue(),beginBTFld212,B_TFLD_212_LEN);
       localBTFld212Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld212Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBTFld212 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld212() {	 
   		return (substring(getStringValue(),beginBTFld212,beginBTFld212 + B_TFLD_212_LEN));
   	}
     int localBTFld312Counter = -1;
     public boolean isBTFld312Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld312Counter != sharedCounter;
         localBTFld312Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_312_LEN = 30;
	/**
	 * 	serialize this BTFld312
	 */
   protected void serializeBTFld312(char[] bTFld312) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld312,0,getStringValue(),beginBTFld312,B_TFLD_312_LEN);
       localBTFld312Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld312Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBTFld312 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld312() {	 
   		return (substring(getStringValue(),beginBTFld312,beginBTFld312 + B_TFLD_312_LEN));
   	}




}
  
