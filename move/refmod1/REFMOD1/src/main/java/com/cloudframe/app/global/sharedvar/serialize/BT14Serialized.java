package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BT14Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BT14Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BT14Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_T_14_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTFld114;
            protected  int beginBTFld214;
            protected  int beginBTFld314;
	
	/**
	* Constructor for BT14Serialized
	**/
    public BT14Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BT14Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT14Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BT14Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this BT14Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in BT14Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_T_14_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBTFld114 = getStartOffset() + 0;	// set offset for serialization
  
             beginBTFld214 = getStartOffset() + 20;	// set offset for serialization
  
             beginBTFld314 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTFld114Counter = -1;
     public boolean isBTFld114Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld114Counter != sharedCounter;
         localBTFld114Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_114_LEN = 20;
	/**
	 * 	serialize this BTFld114
	 */
   protected void serializeBTFld114(char[] bTFld114) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld114,0,getStringValue(),beginBTFld114,B_TFLD_114_LEN);
       localBTFld114Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld114Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshBTFld114 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld114() {	 
   		return (substring(getStringValue(),beginBTFld114,beginBTFld114 + B_TFLD_114_LEN));
   	}
     int localBTFld214Counter = -1;
     public boolean isBTFld214Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld214Counter != sharedCounter;
         localBTFld214Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_214_LEN = 40;
	/**
	 * 	serialize this BTFld214
	 */
   protected void serializeBTFld214(char[] bTFld214) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld214,0,getStringValue(),beginBTFld214,B_TFLD_214_LEN);
       localBTFld214Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld214Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBTFld214 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld214() {	 
   		return (substring(getStringValue(),beginBTFld214,beginBTFld214 + B_TFLD_214_LEN));
   	}
     int localBTFld314Counter = -1;
     public boolean isBTFld314Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld314Counter != sharedCounter;
         localBTFld314Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_314_LEN = 30;
	/**
	 * 	serialize this BTFld314
	 */
   protected void serializeBTFld314(char[] bTFld314) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld314,0,getStringValue(),beginBTFld314,B_TFLD_314_LEN);
       localBTFld314Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld314Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBTFld314 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld314() {	 
   		return (substring(getStringValue(),beginBTFld314,beginBTFld314 + B_TFLD_314_LEN));
   	}




}
  
