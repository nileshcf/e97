package com.cloudframe.app.refmod1.dto.serialize;

/**
*  The class BT3Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BT3Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BT3Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_T_3_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTFld13;
            protected  int beginBTFld23;
            protected  int beginBTFld33;
	
	/**
	* Constructor for BT3Serialized
	**/
    public BT3Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BT3Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT3Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BT3Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this BT3Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in BT3Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_T_3_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBTFld13 = getStartOffset() + 0;	// set offset for serialization
  
             beginBTFld23 = getStartOffset() + 20;	// set offset for serialization
  
             beginBTFld33 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTFld13Counter = -1;
     public boolean isBTFld13Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld13Counter != sharedCounter;
         localBTFld13Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_13_LEN = 20;
	/**
	 * 	serialize this BTFld13
	 */
   protected void serializeBTFld13(char[] bTFld13) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld13,0,getStringValue(),beginBTFld13,B_TFLD_13_LEN);
       localBTFld13Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld13Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshBTFld13 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld13() {	 
   		return (substring(getStringValue(),beginBTFld13,beginBTFld13 + B_TFLD_13_LEN));
   	}
     int localBTFld23Counter = -1;
     public boolean isBTFld23Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld23Counter != sharedCounter;
         localBTFld23Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_23_LEN = 40;
	/**
	 * 	serialize this BTFld23
	 */
   protected void serializeBTFld23(char[] bTFld23) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld23,0,getStringValue(),beginBTFld23,B_TFLD_23_LEN);
       localBTFld23Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld23Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBTFld23 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld23() {	 
   		return (substring(getStringValue(),beginBTFld23,beginBTFld23 + B_TFLD_23_LEN));
   	}
     int localBTFld33Counter = -1;
     public boolean isBTFld33Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld33Counter != sharedCounter;
         localBTFld33Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_33_LEN = 30;
	/**
	 * 	serialize this BTFld33
	 */
   protected void serializeBTFld33(char[] bTFld33) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld33,0,getStringValue(),beginBTFld33,B_TFLD_33_LEN);
       localBTFld33Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld33Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBTFld33 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld33() {	 
   		return (substring(getStringValue(),beginBTFld33,beginBTFld33 + B_TFLD_33_LEN));
   	}




}
  
