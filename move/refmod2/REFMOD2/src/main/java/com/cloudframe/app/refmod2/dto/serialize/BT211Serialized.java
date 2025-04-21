package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class BT211Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BT211Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BT211Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_T_211_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTFld1211;
            protected  int beginBTFld2211;
            protected  int beginBTFld3211;
	
	/**
	* Constructor for BT211Serialized
	**/
    public BT211Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BT211Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT211Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BT211Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this BT211Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in BT211Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_T_211_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBTFld1211 = getStartOffset() + 0;	// set offset for serialization
  
             beginBTFld2211 = getStartOffset() + 20;	// set offset for serialization
  
             beginBTFld3211 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTFld1211Counter = -1;
     public boolean isBTFld1211Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld1211Counter != sharedCounter;
         localBTFld1211Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_1211_LEN = 20;
	/**
	 * 	serialize this BTFld1211
	 */
   protected void serializeBTFld1211(char[] bTFld1211) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld1211,0,getStringValue(),beginBTFld1211,B_TFLD_1211_LEN);
       localBTFld1211Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld1211Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshBTFld1211 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld1211() {	 
   		return (substring(getStringValue(),beginBTFld1211,beginBTFld1211 + B_TFLD_1211_LEN));
   	}
     int localBTFld2211Counter = -1;
     public boolean isBTFld2211Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld2211Counter != sharedCounter;
         localBTFld2211Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_2211_LEN = 40;
	/**
	 * 	serialize this BTFld2211
	 */
   protected void serializeBTFld2211(char[] bTFld2211) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld2211,0,getStringValue(),beginBTFld2211,B_TFLD_2211_LEN);
       localBTFld2211Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld2211Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBTFld2211 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld2211() {	 
   		return (substring(getStringValue(),beginBTFld2211,beginBTFld2211 + B_TFLD_2211_LEN));
   	}
     int localBTFld3211Counter = -1;
     public boolean isBTFld3211Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld3211Counter != sharedCounter;
         localBTFld3211Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_3211_LEN = 30;
	/**
	 * 	serialize this BTFld3211
	 */
   protected void serializeBTFld3211(char[] bTFld3211) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld3211,0,getStringValue(),beginBTFld3211,B_TFLD_3211_LEN);
       localBTFld3211Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld3211Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBTFld3211 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld3211() {	 
   		return (substring(getStringValue(),beginBTFld3211,beginBTFld3211 + B_TFLD_3211_LEN));
   	}




}
  
