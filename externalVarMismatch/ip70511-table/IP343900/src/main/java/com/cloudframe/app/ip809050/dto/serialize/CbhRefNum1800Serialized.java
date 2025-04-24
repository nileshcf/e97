package com.cloudframe.app.ip809050.dto.serialize;

/**
*  The class CbhRefNum1800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CbhRefNum1800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CbhRefNum1800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CBH_REF_NUM_1800_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCbhRefNum800;
	
	/**
	* Constructor for CbhRefNum1800Serialized
	**/
    public CbhRefNum1800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CbhRefNum1800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CbhRefNum1800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CbhRefNum1800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,321); // serialize this field at offset 321 by default 
    }
    
	/**
	* sets parent for this CbhRefNum1800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 321 by default
    }    
	/**
	* initializes the field in CbhRefNum1800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CBH_REF_NUM_1800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginCbhRefNum800 = getStartOffset() + 1;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localCbhRefNum800Counter = -1;
     public boolean isCbhRefNum800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCbhRefNum800Counter != sharedCounter;
         localCbhRefNum800Counter = sharedCounter; return hasModified;
     }
	protected static final int CBH_REF_NUM_800_LEN = 10;
	/**
	 * 	serialize this CbhRefNum800
	 */
   protected void serializeCbhRefNum800(char[] cbhRefNum800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cbhRefNum800,0,getStringValue(),beginCbhRefNum800,CBH_REF_NUM_800_LEN);
       localCbhRefNum800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCbhRefNum800Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshCbhRefNum800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCbhRefNum800() {	 
   		return (substring(getStringValue(),beginCbhRefNum800,beginCbhRefNum800 + CBH_REF_NUM_800_LEN));
   	}




}
  
