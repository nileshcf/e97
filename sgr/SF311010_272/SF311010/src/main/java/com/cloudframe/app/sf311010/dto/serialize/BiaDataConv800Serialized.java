package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class BiaDataConv800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:30. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BiaDataConv800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BiaDataConv800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BIA_DATA_CONV_800_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBiaByte800;
	
	/**
	* Constructor for BiaDataConv800Serialized
	**/
    public BiaDataConv800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BiaDataConv800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BiaDataConv800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BiaDataConv800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this BiaDataConv800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in BiaDataConv800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BIA_DATA_CONV_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginBiaByte800 = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBiaByte800Counter = -1;
     public boolean isBiaByte800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBiaByte800Counter != sharedCounter;
         localBiaByte800Counter = sharedCounter; return hasModified;
     }
	protected static final int BIA_BYTE_800_LEN = 1;
	/**
	 * 	serialize this BiaByte800
	 */
   protected void serializeBiaByte800(char[] biaByte800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(biaByte800,0,getStringValue(),beginBiaByte800,BIA_BYTE_800_LEN);
       localBiaByte800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBiaByte800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBiaByte800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBiaByte800() {	 
   		return (substring(getStringValue(),beginBiaByte800,beginBiaByte800 + BIA_BYTE_800_LEN));
   	}




}
  
