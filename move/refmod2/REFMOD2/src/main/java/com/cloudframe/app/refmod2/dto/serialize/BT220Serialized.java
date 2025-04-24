package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class BT220Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BT220Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BT220Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_T_220_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTFld1220;
            protected  int beginBTFld2220;
            protected  int beginBTFld3220;
	
	/**
	* Constructor for BT220Serialized
	**/
    public BT220Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BT220Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT220Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BT220Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this BT220Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in BT220Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_T_220_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBTFld1220 = getStartOffset() + 0;	// set offset for serialization
  
             beginBTFld2220 = getStartOffset() + 20;	// set offset for serialization
  
             beginBTFld3220 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTFld1220Counter = -1;
     public boolean isBTFld1220Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld1220Counter != sharedCounter;
         localBTFld1220Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_1220_LEN = 20;
	/**
	 * 	serialize this BTFld1220
	 */
   protected void serializeBTFld1220(char[] bTFld1220) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld1220,0,getStringValue(),beginBTFld1220,B_TFLD_1220_LEN);
       localBTFld1220Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld1220Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshBTFld1220 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld1220() {	 
   		return (substring(getStringValue(),beginBTFld1220,beginBTFld1220 + B_TFLD_1220_LEN));
   	}
     int localBTFld2220Counter = -1;
     public boolean isBTFld2220Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld2220Counter != sharedCounter;
         localBTFld2220Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_2220_LEN = 40;
	/**
	 * 	serialize this BTFld2220
	 */
   protected void serializeBTFld2220(char[] bTFld2220) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld2220,0,getStringValue(),beginBTFld2220,B_TFLD_2220_LEN);
       localBTFld2220Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld2220Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBTFld2220 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld2220() {	 
   		return (substring(getStringValue(),beginBTFld2220,beginBTFld2220 + B_TFLD_2220_LEN));
   	}
     int localBTFld3220Counter = -1;
     public boolean isBTFld3220Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld3220Counter != sharedCounter;
         localBTFld3220Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_3220_LEN = 30;
	/**
	 * 	serialize this BTFld3220
	 */
   protected void serializeBTFld3220(char[] bTFld3220) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld3220,0,getStringValue(),beginBTFld3220,B_TFLD_3220_LEN);
       localBTFld3220Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld3220Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBTFld3220 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld3220() {	 
   		return (substring(getStringValue(),beginBTFld3220,beginBTFld3220 + B_TFLD_3220_LEN));
   	}




}
  
