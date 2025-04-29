package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class BT212Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BT212Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BT212Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_T_212_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTFld1212;
            protected  int beginBTFld2212;
            protected  int beginBTFld3212;
	
	/**
	* Constructor for BT212Serialized
	**/
    public BT212Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BT212Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT212Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BT212Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this BT212Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in BT212Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_T_212_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBTFld1212 = getStartOffset() + 0;	// set offset for serialization
  
             beginBTFld2212 = getStartOffset() + 20;	// set offset for serialization
  
             beginBTFld3212 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTFld1212Counter = -1;
     public boolean isBTFld1212Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld1212Counter != sharedCounter;
         localBTFld1212Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_1212_LEN = 20;
	/**
	 * 	serialize this BTFld1212
	 */
   protected void serializeBTFld1212(char[] bTFld1212) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld1212,0,getStringValue(),beginBTFld1212,B_TFLD_1212_LEN);
       localBTFld1212Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld1212Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshBTFld1212 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld1212() {	 
   		return (substring(getStringValue(),beginBTFld1212,beginBTFld1212 + B_TFLD_1212_LEN));
   	}
     int localBTFld2212Counter = -1;
     public boolean isBTFld2212Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld2212Counter != sharedCounter;
         localBTFld2212Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_2212_LEN = 40;
	/**
	 * 	serialize this BTFld2212
	 */
   protected void serializeBTFld2212(char[] bTFld2212) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld2212,0,getStringValue(),beginBTFld2212,B_TFLD_2212_LEN);
       localBTFld2212Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld2212Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBTFld2212 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld2212() {	 
   		return (substring(getStringValue(),beginBTFld2212,beginBTFld2212 + B_TFLD_2212_LEN));
   	}
     int localBTFld3212Counter = -1;
     public boolean isBTFld3212Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld3212Counter != sharedCounter;
         localBTFld3212Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_3212_LEN = 30;
	/**
	 * 	serialize this BTFld3212
	 */
   protected void serializeBTFld3212(char[] bTFld3212) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld3212,0,getStringValue(),beginBTFld3212,B_TFLD_3212_LEN);
       localBTFld3212Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld3212Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBTFld3212 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld3212() {	 
   		return (substring(getStringValue(),beginBTFld3212,beginBTFld3212 + B_TFLD_3212_LEN));
   	}




}
  
