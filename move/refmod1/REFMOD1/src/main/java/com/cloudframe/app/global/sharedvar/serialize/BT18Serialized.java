package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BT18Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BT18Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BT18Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_T_18_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTFld118;
            protected  int beginBTFld218;
            protected  int beginBTFld318;
	
	/**
	* Constructor for BT18Serialized
	**/
    public BT18Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BT18Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT18Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BT18Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this BT18Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in BT18Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_T_18_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBTFld118 = getStartOffset() + 0;	// set offset for serialization
  
             beginBTFld218 = getStartOffset() + 20;	// set offset for serialization
  
             beginBTFld318 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTFld118Counter = -1;
     public boolean isBTFld118Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld118Counter != sharedCounter;
         localBTFld118Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_118_LEN = 20;
	/**
	 * 	serialize this BTFld118
	 */
   protected void serializeBTFld118(char[] bTFld118) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld118,0,getStringValue(),beginBTFld118,B_TFLD_118_LEN);
       localBTFld118Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld118Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshBTFld118 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld118() {	 
   		return (substring(getStringValue(),beginBTFld118,beginBTFld118 + B_TFLD_118_LEN));
   	}
     int localBTFld218Counter = -1;
     public boolean isBTFld218Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld218Counter != sharedCounter;
         localBTFld218Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_218_LEN = 40;
	/**
	 * 	serialize this BTFld218
	 */
   protected void serializeBTFld218(char[] bTFld218) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld218,0,getStringValue(),beginBTFld218,B_TFLD_218_LEN);
       localBTFld218Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld218Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBTFld218 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld218() {	 
   		return (substring(getStringValue(),beginBTFld218,beginBTFld218 + B_TFLD_218_LEN));
   	}
     int localBTFld318Counter = -1;
     public boolean isBTFld318Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld318Counter != sharedCounter;
         localBTFld318Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_318_LEN = 30;
	/**
	 * 	serialize this BTFld318
	 */
   protected void serializeBTFld318(char[] bTFld318) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld318,0,getStringValue(),beginBTFld318,B_TFLD_318_LEN);
       localBTFld318Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld318Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBTFld318 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld318() {	 
   		return (substring(getStringValue(),beginBTFld318,beginBTFld318 + B_TFLD_318_LEN));
   	}




}
  
