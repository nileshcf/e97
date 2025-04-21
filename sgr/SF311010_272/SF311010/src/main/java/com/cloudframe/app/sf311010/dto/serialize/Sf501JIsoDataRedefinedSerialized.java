package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class Sf501JIsoDataRedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf501JIsoDataRedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf501JIsoDataRedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_501_JISO_DATA_REDEFINED_LENGTH = 7939;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSf501J3Data;
	
	/**
	* Constructor for Sf501JIsoDataRedefinedSerialized
	**/
    public Sf501JIsoDataRedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sf501JIsoDataRedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf501JIsoDataRedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sf501JIsoDataRedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,61); // serialize this field at offset 61 by default 
    }
    
	/**
	* sets parent for this Sf501JIsoDataRedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 61 by default
    }    
	/**
	* initializes the field in Sf501JIsoDataRedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_501_JISO_DATA_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSf501J3Data = getStartOffset() + 27;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSf501J3DataCounter = -1;
     public boolean isSf501J3DataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf501J3DataCounter != sharedCounter;
         localSf501J3DataCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_501_J_3_DATA_LEN = 7912;
	/**
	 * 	serialize this Sf501J3Data
	 */
   protected void serializeSf501J3Data(char[] sf501J3Data) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf501J3Data,0,getStringValue(),beginSf501J3Data,SF_501_J_3_DATA_LEN);
       localSf501J3DataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf501J3DataConstraints(char[] value) {
   			return super.checkConstraints(value , 7912 ,false, false);
   }
    /**
	 *	refreshSf501J3Data is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf501J3Data() {	 
   		return (substring(getStringValue(),beginSf501J3Data,beginSf501J3Data + SF_501_J_3_DATA_LEN));
   	}




}
  
