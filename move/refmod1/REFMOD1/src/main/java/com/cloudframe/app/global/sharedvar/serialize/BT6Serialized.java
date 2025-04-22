package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BT6Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BT6Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BT6Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_T_6_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTFld16;
            protected  int beginBTFld26;
            protected  int beginBTFld36;
	
	/**
	* Constructor for BT6Serialized
	**/
    public BT6Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BT6Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT6Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BT6Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this BT6Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in BT6Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_T_6_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBTFld16 = getStartOffset() + 0;	// set offset for serialization
  
             beginBTFld26 = getStartOffset() + 20;	// set offset for serialization
  
             beginBTFld36 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTFld16Counter = -1;
     public boolean isBTFld16Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld16Counter != sharedCounter;
         localBTFld16Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_16_LEN = 20;
	/**
	 * 	serialize this BTFld16
	 */
   protected void serializeBTFld16(char[] bTFld16) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld16,0,getStringValue(),beginBTFld16,B_TFLD_16_LEN);
       localBTFld16Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld16Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshBTFld16 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld16() {	 
   		return (substring(getStringValue(),beginBTFld16,beginBTFld16 + B_TFLD_16_LEN));
   	}
     int localBTFld26Counter = -1;
     public boolean isBTFld26Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld26Counter != sharedCounter;
         localBTFld26Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_26_LEN = 40;
	/**
	 * 	serialize this BTFld26
	 */
   protected void serializeBTFld26(char[] bTFld26) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld26,0,getStringValue(),beginBTFld26,B_TFLD_26_LEN);
       localBTFld26Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld26Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBTFld26 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld26() {	 
   		return (substring(getStringValue(),beginBTFld26,beginBTFld26 + B_TFLD_26_LEN));
   	}
     int localBTFld36Counter = -1;
     public boolean isBTFld36Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld36Counter != sharedCounter;
         localBTFld36Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_36_LEN = 30;
	/**
	 * 	serialize this BTFld36
	 */
   protected void serializeBTFld36(char[] bTFld36) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld36,0,getStringValue(),beginBTFld36,B_TFLD_36_LEN);
       localBTFld36Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld36Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBTFld36 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld36() {	 
   		return (substring(getStringValue(),beginBTFld36,beginBTFld36 + B_TFLD_36_LEN));
   	}




}
  
