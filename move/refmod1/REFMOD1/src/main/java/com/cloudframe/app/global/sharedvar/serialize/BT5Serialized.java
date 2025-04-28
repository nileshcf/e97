package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BT5Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BT5Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BT5Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_T_5_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTFld15;
            protected  int beginBTFld25;
            protected  int beginBTFld35;
	
	/**
	* Constructor for BT5Serialized
	**/
    public BT5Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BT5Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT5Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BT5Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this BT5Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in BT5Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_T_5_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBTFld15 = getStartOffset() + 0;	// set offset for serialization
  
             beginBTFld25 = getStartOffset() + 20;	// set offset for serialization
  
             beginBTFld35 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTFld15Counter = -1;
     public boolean isBTFld15Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld15Counter != sharedCounter;
         localBTFld15Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_15_LEN = 20;
	/**
	 * 	serialize this BTFld15
	 */
   protected void serializeBTFld15(char[] bTFld15) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld15,0,getStringValue(),beginBTFld15,B_TFLD_15_LEN);
       localBTFld15Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld15Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshBTFld15 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld15() {	 
   		return (substring(getStringValue(),beginBTFld15,beginBTFld15 + B_TFLD_15_LEN));
   	}
     int localBTFld25Counter = -1;
     public boolean isBTFld25Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld25Counter != sharedCounter;
         localBTFld25Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_25_LEN = 40;
	/**
	 * 	serialize this BTFld25
	 */
   protected void serializeBTFld25(char[] bTFld25) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld25,0,getStringValue(),beginBTFld25,B_TFLD_25_LEN);
       localBTFld25Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld25Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBTFld25 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld25() {	 
   		return (substring(getStringValue(),beginBTFld25,beginBTFld25 + B_TFLD_25_LEN));
   	}
     int localBTFld35Counter = -1;
     public boolean isBTFld35Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld35Counter != sharedCounter;
         localBTFld35Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_35_LEN = 30;
	/**
	 * 	serialize this BTFld35
	 */
   protected void serializeBTFld35(char[] bTFld35) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld35,0,getStringValue(),beginBTFld35,B_TFLD_35_LEN);
       localBTFld35Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld35Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBTFld35 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld35() {	 
   		return (substring(getStringValue(),beginBTFld35,beginBTFld35 + B_TFLD_35_LEN));
   	}




}
  
