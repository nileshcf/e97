package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BT11Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BT11Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BT11Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_T_11_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTFld111;
            protected  int beginBTFld211;
            protected  int beginBTFld311;
	
	/**
	* Constructor for BT11Serialized
	**/
    public BT11Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BT11Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT11Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BT11Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this BT11Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in BT11Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_T_11_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBTFld111 = getStartOffset() + 0;	// set offset for serialization
  
             beginBTFld211 = getStartOffset() + 20;	// set offset for serialization
  
             beginBTFld311 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTFld111Counter = -1;
     public boolean isBTFld111Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld111Counter != sharedCounter;
         localBTFld111Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_111_LEN = 20;
	/**
	 * 	serialize this BTFld111
	 */
   protected void serializeBTFld111(char[] bTFld111) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld111,0,getStringValue(),beginBTFld111,B_TFLD_111_LEN);
       localBTFld111Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld111Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshBTFld111 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld111() {	 
   		return (substring(getStringValue(),beginBTFld111,beginBTFld111 + B_TFLD_111_LEN));
   	}
     int localBTFld211Counter = -1;
     public boolean isBTFld211Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld211Counter != sharedCounter;
         localBTFld211Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_211_LEN = 40;
	/**
	 * 	serialize this BTFld211
	 */
   protected void serializeBTFld211(char[] bTFld211) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld211,0,getStringValue(),beginBTFld211,B_TFLD_211_LEN);
       localBTFld211Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld211Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBTFld211 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld211() {	 
   		return (substring(getStringValue(),beginBTFld211,beginBTFld211 + B_TFLD_211_LEN));
   	}
     int localBTFld311Counter = -1;
     public boolean isBTFld311Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld311Counter != sharedCounter;
         localBTFld311Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_311_LEN = 30;
	/**
	 * 	serialize this BTFld311
	 */
   protected void serializeBTFld311(char[] bTFld311) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld311,0,getStringValue(),beginBTFld311,B_TFLD_311_LEN);
       localBTFld311Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld311Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBTFld311 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld311() {	 
   		return (substring(getStringValue(),beginBTFld311,beginBTFld311 + B_TFLD_311_LEN));
   	}




}
  
