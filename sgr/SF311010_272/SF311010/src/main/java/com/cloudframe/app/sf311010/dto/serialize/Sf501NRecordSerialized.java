package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class Sf501NRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf501NRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf501NRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_501_NRECORD_LENGTH = 8000;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSf501NData;
	
	/**
	* Constructor for Sf501NRecordSerialized
	**/
    public Sf501NRecordSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sf501NRecordSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf501NRecordSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sf501NRecordSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Sf501NRecordSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Sf501NRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_501_NRECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSf501NData = getStartOffset() + 79;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSf501NDataCounter = -1;
     public boolean isSf501NDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf501NDataCounter != sharedCounter;
         localSf501NDataCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_501_NDATA_LEN = 7921;
	/**
	 * 	serialize this Sf501NData
	 */
   protected void serializeSf501NData(char[] sf501NData) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf501NData,0,getStringValue(),beginSf501NData,SF_501_NDATA_LEN);
       localSf501NDataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf501NDataConstraints(char[] value) {
   			return super.checkConstraints(value , 7921 ,false, false);
   }
    /**
	 *	refreshSf501NData is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf501NData() {	 
   		return (substring(getStringValue(),beginSf501NData,beginSf501NData + SF_501_NDATA_LEN));
   	}




}
  
