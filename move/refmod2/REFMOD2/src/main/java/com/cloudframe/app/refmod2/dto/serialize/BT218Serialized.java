package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class BT218Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:02. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BT218Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BT218Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_T_218_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTFld1218;
            protected  int beginBTFld2218;
            protected  int beginBTFld3218;
	
	/**
	* Constructor for BT218Serialized
	**/
    public BT218Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BT218Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT218Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BT218Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this BT218Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in BT218Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_T_218_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBTFld1218 = getStartOffset() + 0;	// set offset for serialization
  
             beginBTFld2218 = getStartOffset() + 20;	// set offset for serialization
  
             beginBTFld3218 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTFld1218Counter = -1;
     public boolean isBTFld1218Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld1218Counter != sharedCounter;
         localBTFld1218Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_1218_LEN = 20;
	/**
	 * 	serialize this BTFld1218
	 */
   protected void serializeBTFld1218(char[] bTFld1218) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld1218,0,getStringValue(),beginBTFld1218,B_TFLD_1218_LEN);
       localBTFld1218Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld1218Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshBTFld1218 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld1218() {	 
   		return (substring(getStringValue(),beginBTFld1218,beginBTFld1218 + B_TFLD_1218_LEN));
   	}
     int localBTFld2218Counter = -1;
     public boolean isBTFld2218Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld2218Counter != sharedCounter;
         localBTFld2218Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_2218_LEN = 40;
	/**
	 * 	serialize this BTFld2218
	 */
   protected void serializeBTFld2218(char[] bTFld2218) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld2218,0,getStringValue(),beginBTFld2218,B_TFLD_2218_LEN);
       localBTFld2218Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld2218Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBTFld2218 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld2218() {	 
   		return (substring(getStringValue(),beginBTFld2218,beginBTFld2218 + B_TFLD_2218_LEN));
   	}
     int localBTFld3218Counter = -1;
     public boolean isBTFld3218Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld3218Counter != sharedCounter;
         localBTFld3218Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_3218_LEN = 30;
	/**
	 * 	serialize this BTFld3218
	 */
   protected void serializeBTFld3218(char[] bTFld3218) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld3218,0,getStringValue(),beginBTFld3218,B_TFLD_3218_LEN);
       localBTFld3218Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld3218Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBTFld3218 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld3218() {	 
   		return (substring(getStringValue(),beginBTFld3218,beginBTFld3218 + B_TFLD_3218_LEN));
   	}




}
  
