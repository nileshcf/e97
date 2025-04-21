package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class BT217Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BT217Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BT217Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_T_217_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTFld1217;
            protected  int beginBTFld2217;
            protected  int beginBTFld3217;
	
	/**
	* Constructor for BT217Serialized
	**/
    public BT217Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BT217Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT217Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BT217Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this BT217Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in BT217Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_T_217_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBTFld1217 = getStartOffset() + 0;	// set offset for serialization
  
             beginBTFld2217 = getStartOffset() + 20;	// set offset for serialization
  
             beginBTFld3217 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTFld1217Counter = -1;
     public boolean isBTFld1217Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld1217Counter != sharedCounter;
         localBTFld1217Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_1217_LEN = 20;
	/**
	 * 	serialize this BTFld1217
	 */
   protected void serializeBTFld1217(char[] bTFld1217) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld1217,0,getStringValue(),beginBTFld1217,B_TFLD_1217_LEN);
       localBTFld1217Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld1217Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshBTFld1217 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld1217() {	 
   		return (substring(getStringValue(),beginBTFld1217,beginBTFld1217 + B_TFLD_1217_LEN));
   	}
     int localBTFld2217Counter = -1;
     public boolean isBTFld2217Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld2217Counter != sharedCounter;
         localBTFld2217Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_2217_LEN = 40;
	/**
	 * 	serialize this BTFld2217
	 */
   protected void serializeBTFld2217(char[] bTFld2217) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld2217,0,getStringValue(),beginBTFld2217,B_TFLD_2217_LEN);
       localBTFld2217Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld2217Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBTFld2217 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld2217() {	 
   		return (substring(getStringValue(),beginBTFld2217,beginBTFld2217 + B_TFLD_2217_LEN));
   	}
     int localBTFld3217Counter = -1;
     public boolean isBTFld3217Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld3217Counter != sharedCounter;
         localBTFld3217Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_3217_LEN = 30;
	/**
	 * 	serialize this BTFld3217
	 */
   protected void serializeBTFld3217(char[] bTFld3217) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld3217,0,getStringValue(),beginBTFld3217,B_TFLD_3217_LEN);
       localBTFld3217Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld3217Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBTFld3217 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld3217() {	 
   		return (substring(getStringValue(),beginBTFld3217,beginBTFld3217 + B_TFLD_3217_LEN));
   	}




}
  
