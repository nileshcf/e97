package com.cloudframe.app.refmod1.dto.serialize;

/**
*  The class BT4Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BT4Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BT4Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_T_4_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTFld14;
            protected  int beginBTFld24;
            protected  int beginBTFld34;
	
	/**
	* Constructor for BT4Serialized
	**/
    public BT4Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BT4Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT4Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BT4Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this BT4Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in BT4Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_T_4_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBTFld14 = getStartOffset() + 0;	// set offset for serialization
  
             beginBTFld24 = getStartOffset() + 20;	// set offset for serialization
  
             beginBTFld34 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTFld14Counter = -1;
     public boolean isBTFld14Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld14Counter != sharedCounter;
         localBTFld14Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_14_LEN = 20;
	/**
	 * 	serialize this BTFld14
	 */
   protected void serializeBTFld14(char[] bTFld14) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld14,0,getStringValue(),beginBTFld14,B_TFLD_14_LEN);
       localBTFld14Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld14Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshBTFld14 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld14() {	 
   		return (substring(getStringValue(),beginBTFld14,beginBTFld14 + B_TFLD_14_LEN));
   	}
     int localBTFld24Counter = -1;
     public boolean isBTFld24Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld24Counter != sharedCounter;
         localBTFld24Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_24_LEN = 40;
	/**
	 * 	serialize this BTFld24
	 */
   protected void serializeBTFld24(char[] bTFld24) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld24,0,getStringValue(),beginBTFld24,B_TFLD_24_LEN);
       localBTFld24Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld24Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBTFld24 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld24() {	 
   		return (substring(getStringValue(),beginBTFld24,beginBTFld24 + B_TFLD_24_LEN));
   	}
     int localBTFld34Counter = -1;
     public boolean isBTFld34Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld34Counter != sharedCounter;
         localBTFld34Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_34_LEN = 30;
	/**
	 * 	serialize this BTFld34
	 */
   protected void serializeBTFld34(char[] bTFld34) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld34,0,getStringValue(),beginBTFld34,B_TFLD_34_LEN);
       localBTFld34Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld34Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBTFld34 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld34() {	 
   		return (substring(getStringValue(),beginBTFld34,beginBTFld34 + B_TFLD_34_LEN));
   	}




}
  
