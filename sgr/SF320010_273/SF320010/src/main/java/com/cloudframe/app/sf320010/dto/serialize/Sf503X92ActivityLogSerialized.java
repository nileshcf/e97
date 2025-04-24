package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class Sf503X92ActivityLogSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:45. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf503X92ActivityLogSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf503X92ActivityLogSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_503_X_92_ACTIVITY_LOG_LENGTH = 32737;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSf503X92RecordType;
	
	/**
	* Constructor for Sf503X92ActivityLogSerialized
	**/
    public Sf503X92ActivityLogSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sf503X92ActivityLogSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503X92ActivityLogSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sf503X92ActivityLogSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,15); // serialize this field at offset 15 by default 
    }
    
	/**
	* sets parent for this Sf503X92ActivityLogSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 15 by default
    }    
	/**
	* initializes the field in Sf503X92ActivityLogSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_503_X_92_ACTIVITY_LOG_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSf503X92RecordType = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSf503X92RecordTypeCounter = -1;
     public boolean isSf503X92RecordTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503X92RecordTypeCounter != sharedCounter;
         localSf503X92RecordTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_X_92_RECORD_TYPE_LEN = 2;
	/**
	 * 	serialize this Sf503X92RecordType
	 */
   protected void serializeSf503X92RecordType(char[] sf503X92RecordType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503X92RecordType,0,getStringValue(),beginSf503X92RecordType,SF_503_X_92_RECORD_TYPE_LEN);
       localSf503X92RecordTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503X92RecordTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSf503X92RecordType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503X92RecordType() {	 
   		return (substring(getStringValue(),beginSf503X92RecordType,beginSf503X92RecordType + SF_503_X_92_RECORD_TYPE_LEN));
   	}




}
  
