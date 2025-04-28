package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class RlatdDtlSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RlatdDtlSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RlatdDtlSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RLATD_DTL_LENGTH = 150;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRlatdFieldErrorCode;
	
	/**
	* Constructor for RlatdDtlSerialized
	**/
    public RlatdDtlSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for RlatdDtlSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlatdDtlSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this RlatdDtlSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this RlatdDtlSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in RlatdDtlSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RLATD_DTL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRlatdFieldErrorCode = getStartOffset() + 147;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRlatdFieldErrorCodeCounter = -1;
     public boolean isRlatdFieldErrorCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlatdFieldErrorCodeCounter != sharedCounter;
         localRlatdFieldErrorCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int RLATD_FIELD_ERROR_CODE_LEN = 3;
	/**
	 * 	serialize this RlatdFieldErrorCode
	 */
   protected void serializeRlatdFieldErrorCode(char[] rlatdFieldErrorCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlatdFieldErrorCode,0,getStringValue(),beginRlatdFieldErrorCode,RLATD_FIELD_ERROR_CODE_LEN);
       localRlatdFieldErrorCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlatdFieldErrorCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshRlatdFieldErrorCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlatdFieldErrorCode() {	 
   		return (substring(getStringValue(),beginRlatdFieldErrorCode,beginRlatdFieldErrorCode + RLATD_FIELD_ERROR_CODE_LEN));
   	}




}
  
