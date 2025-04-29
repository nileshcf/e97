package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class BT210Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:27. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BT210Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BT210Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_T_210_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTFld1210;
            protected  int beginBTFld2210;
            protected  int beginBTFld3210;
	
	/**
	* Constructor for BT210Serialized
	**/
    public BT210Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BT210Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT210Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BT210Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this BT210Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in BT210Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_T_210_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBTFld1210 = getStartOffset() + 0;	// set offset for serialization
  
             beginBTFld2210 = getStartOffset() + 20;	// set offset for serialization
  
             beginBTFld3210 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTFld1210Counter = -1;
     public boolean isBTFld1210Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld1210Counter != sharedCounter;
         localBTFld1210Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_1210_LEN = 20;
	/**
	 * 	serialize this BTFld1210
	 */
   protected void serializeBTFld1210(char[] bTFld1210) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld1210,0,getStringValue(),beginBTFld1210,B_TFLD_1210_LEN);
       localBTFld1210Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld1210Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshBTFld1210 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld1210() {	 
   		return (substring(getStringValue(),beginBTFld1210,beginBTFld1210 + B_TFLD_1210_LEN));
   	}
     int localBTFld2210Counter = -1;
     public boolean isBTFld2210Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld2210Counter != sharedCounter;
         localBTFld2210Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_2210_LEN = 40;
	/**
	 * 	serialize this BTFld2210
	 */
   protected void serializeBTFld2210(char[] bTFld2210) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld2210,0,getStringValue(),beginBTFld2210,B_TFLD_2210_LEN);
       localBTFld2210Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld2210Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBTFld2210 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld2210() {	 
   		return (substring(getStringValue(),beginBTFld2210,beginBTFld2210 + B_TFLD_2210_LEN));
   	}
     int localBTFld3210Counter = -1;
     public boolean isBTFld3210Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld3210Counter != sharedCounter;
         localBTFld3210Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_3210_LEN = 30;
	/**
	 * 	serialize this BTFld3210
	 */
   protected void serializeBTFld3210(char[] bTFld3210) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld3210,0,getStringValue(),beginBTFld3210,B_TFLD_3210_LEN);
       localBTFld3210Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld3210Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBTFld3210 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld3210() {	 
   		return (substring(getStringValue(),beginBTFld3210,beginBTFld3210 + B_TFLD_3210_LEN));
   	}




}
  
