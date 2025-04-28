package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class HalfWordX2800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HalfWordX2800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HalfWordX2800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HALF_WORD_X_2800_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLoByte800;
	
	/**
	* Constructor for HalfWordX2800Serialized
	**/
    public HalfWordX2800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for HalfWordX2800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HalfWordX2800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this HalfWordX2800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this HalfWordX2800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in HalfWordX2800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HALF_WORD_X_2800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginLoByte800 = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localLoByte800Counter = -1;
     public boolean isLoByte800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLoByte800Counter != sharedCounter;
         localLoByte800Counter = sharedCounter; return hasModified;
     }
	protected static final int LO_BYTE_800_LEN = 1;
	/**
	 * 	serialize this LoByte800
	 */
   protected void serializeLoByte800(char[] loByte800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(loByte800,0,getStringValue(),beginLoByte800,LO_BYTE_800_LEN);
       localLoByte800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLoByte800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshLoByte800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLoByte800() {	 
   		return (substring(getStringValue(),beginLoByte800,beginLoByte800 + LO_BYTE_800_LEN));
   	}




}
  
