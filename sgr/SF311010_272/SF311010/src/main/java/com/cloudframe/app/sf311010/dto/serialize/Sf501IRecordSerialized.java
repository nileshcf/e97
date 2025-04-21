package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class Sf501IRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf501IRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf501IRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_501_IRECORD_LENGTH = 8000;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSf501IData;
	
	/**
	* Constructor for Sf501IRecordSerialized
	**/
    public Sf501IRecordSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sf501IRecordSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf501IRecordSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sf501IRecordSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Sf501IRecordSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Sf501IRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_501_IRECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSf501IData = getStartOffset() + 59;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSf501IDataCounter = -1;
     public boolean isSf501IDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf501IDataCounter != sharedCounter;
         localSf501IDataCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_501_IDATA_LEN = 7941;
	/**
	 * 	serialize this Sf501IData
	 */
   protected void serializeSf501IData(char[] sf501IData) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf501IData,0,getStringValue(),beginSf501IData,SF_501_IDATA_LEN);
       localSf501IDataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf501IDataConstraints(char[] value) {
   			return super.checkConstraints(value , 7941 ,false, false);
   }
    /**
	 *	refreshSf501IData is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf501IData() {	 
   		return (substring(getStringValue(),beginSf501IData,beginSf501IData + SF_501_IDATA_LEN));
   	}




}
  
