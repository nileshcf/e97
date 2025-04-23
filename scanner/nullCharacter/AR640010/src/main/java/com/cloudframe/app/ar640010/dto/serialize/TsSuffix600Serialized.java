package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class TsSuffix600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TsSuffix600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TsSuffix600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TS_SUFFIX_600_LENGTH = 38;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTsHundredth600;
	
	/**
	* Constructor for TsSuffix600Serialized
	**/
    public TsSuffix600Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for TsSuffix600Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TsSuffix600Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this TsSuffix600Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,367); // serialize this field at offset 367 by default 
    }
    
	/**
	* sets parent for this TsSuffix600Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 367 by default
    }    
	/**
	* initializes the field in TsSuffix600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TS_SUFFIX_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
  
             beginTsHundredth600 = getStartOffset() + 36;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localTsHundredth600Counter = -1;
     public boolean isTsHundredth600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTsHundredth600Counter != sharedCounter;
         localTsHundredth600Counter = sharedCounter; return hasModified;
     }
	protected static final int TS_HUNDREDTH_600_LEN = 2;
	/**
	 * 	serialize this TsHundredth600
	 */
   protected void serializeTsHundredth600(char[] tsHundredth600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tsHundredth600,0,getStringValue(),beginTsHundredth600,TS_HUNDREDTH_600_LEN);
       localTsHundredth600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTsHundredth600Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshTsHundredth600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTsHundredth600() {	 
   		return (substring(getStringValue(),beginTsHundredth600,beginTsHundredth600 + TS_HUNDREDTH_600_LEN));
   	}




}
  
