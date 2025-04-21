package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BT10Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BT10Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BT10Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_T_10_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTFld110;
            protected  int beginBTFld210;
            protected  int beginBTFld310;
	
	/**
	* Constructor for BT10Serialized
	**/
    public BT10Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BT10Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT10Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BT10Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this BT10Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in BT10Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_T_10_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBTFld110 = getStartOffset() + 0;	// set offset for serialization
  
             beginBTFld210 = getStartOffset() + 20;	// set offset for serialization
  
             beginBTFld310 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTFld110Counter = -1;
     public boolean isBTFld110Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld110Counter != sharedCounter;
         localBTFld110Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_110_LEN = 20;
	/**
	 * 	serialize this BTFld110
	 */
   protected void serializeBTFld110(char[] bTFld110) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld110,0,getStringValue(),beginBTFld110,B_TFLD_110_LEN);
       localBTFld110Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld110Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshBTFld110 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld110() {	 
   		return (substring(getStringValue(),beginBTFld110,beginBTFld110 + B_TFLD_110_LEN));
   	}
     int localBTFld210Counter = -1;
     public boolean isBTFld210Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld210Counter != sharedCounter;
         localBTFld210Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_210_LEN = 40;
	/**
	 * 	serialize this BTFld210
	 */
   protected void serializeBTFld210(char[] bTFld210) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld210,0,getStringValue(),beginBTFld210,B_TFLD_210_LEN);
       localBTFld210Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld210Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBTFld210 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld210() {	 
   		return (substring(getStringValue(),beginBTFld210,beginBTFld210 + B_TFLD_210_LEN));
   	}
     int localBTFld310Counter = -1;
     public boolean isBTFld310Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld310Counter != sharedCounter;
         localBTFld310Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_310_LEN = 30;
	/**
	 * 	serialize this BTFld310
	 */
   protected void serializeBTFld310(char[] bTFld310) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld310,0,getStringValue(),beginBTFld310,B_TFLD_310_LEN);
       localBTFld310Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld310Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBTFld310 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld310() {	 
   		return (substring(getStringValue(),beginBTFld310,beginBTFld310 + B_TFLD_310_LEN));
   	}




}
  
