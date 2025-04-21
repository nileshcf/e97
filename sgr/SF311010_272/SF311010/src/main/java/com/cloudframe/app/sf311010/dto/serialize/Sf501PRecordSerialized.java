package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class Sf501PRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf501PRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf501PRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_501_PRECORD_LENGTH = 8000;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSf501PData;
	
	/**
	* Constructor for Sf501PRecordSerialized
	**/
    public Sf501PRecordSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sf501PRecordSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf501PRecordSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sf501PRecordSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Sf501PRecordSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Sf501PRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_501_PRECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSf501PData = getStartOffset() + 21;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSf501PDataCounter = -1;
     public boolean isSf501PDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf501PDataCounter != sharedCounter;
         localSf501PDataCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_501_PDATA_LEN = 7979;
	/**
	 * 	serialize this Sf501PData
	 */
   protected void serializeSf501PData(char[] sf501PData) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf501PData,0,getStringValue(),beginSf501PData,SF_501_PDATA_LEN);
       localSf501PDataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf501PDataConstraints(char[] value) {
   			return super.checkConstraints(value , 7979 ,false, false);
   }
    /**
	 *	refreshSf501PData is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf501PData() {	 
   		return (substring(getStringValue(),beginSf501PData,beginSf501PData + SF_501_PDATA_LEN));
   	}




}
  
