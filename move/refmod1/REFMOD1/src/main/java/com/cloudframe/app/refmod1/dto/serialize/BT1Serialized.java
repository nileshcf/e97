package com.cloudframe.app.refmod1.dto.serialize;

/**
*  The class BT1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BT1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BT1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_T_1_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTFld11;
            protected  int beginBTFld21;
            protected  int beginBTFld31;
	
	/**
	* Constructor for BT1Serialized
	**/
    public BT1Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BT1Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT1Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BT1Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this BT1Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in BT1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_T_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBTFld11 = getStartOffset() + 0;	// set offset for serialization
  
             beginBTFld21 = getStartOffset() + 20;	// set offset for serialization
  
             beginBTFld31 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTFld11Counter = -1;
     public boolean isBTFld11Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld11Counter != sharedCounter;
         localBTFld11Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_11_LEN = 20;
	/**
	 * 	serialize this BTFld11
	 */
   protected void serializeBTFld11(char[] bTFld11) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld11,0,getStringValue(),beginBTFld11,B_TFLD_11_LEN);
       localBTFld11Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld11Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshBTFld11 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld11() {	 
   		return (substring(getStringValue(),beginBTFld11,beginBTFld11 + B_TFLD_11_LEN));
   	}
     int localBTFld21Counter = -1;
     public boolean isBTFld21Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld21Counter != sharedCounter;
         localBTFld21Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_21_LEN = 40;
	/**
	 * 	serialize this BTFld21
	 */
   protected void serializeBTFld21(char[] bTFld21) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld21,0,getStringValue(),beginBTFld21,B_TFLD_21_LEN);
       localBTFld21Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld21Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBTFld21 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld21() {	 
   		return (substring(getStringValue(),beginBTFld21,beginBTFld21 + B_TFLD_21_LEN));
   	}
     int localBTFld31Counter = -1;
     public boolean isBTFld31Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld31Counter != sharedCounter;
         localBTFld31Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_31_LEN = 30;
	/**
	 * 	serialize this BTFld31
	 */
   protected void serializeBTFld31(char[] bTFld31) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld31,0,getStringValue(),beginBTFld31,B_TFLD_31_LEN);
       localBTFld31Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld31Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBTFld31 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld31() {	 
   		return (substring(getStringValue(),beginBTFld31,beginBTFld31 + B_TFLD_31_LEN));
   	}




}
  
