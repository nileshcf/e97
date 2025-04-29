package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class RlatuDtlSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RlatuDtlSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RlatuDtlSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RLATU_DTL_LENGTH = 150;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRlatuFieldErrorCode;
	
	/**
	* Constructor for RlatuDtlSerialized
	**/
    public RlatuDtlSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for RlatuDtlSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlatuDtlSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this RlatuDtlSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this RlatuDtlSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in RlatuDtlSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RLATU_DTL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRlatuFieldErrorCode = getStartOffset() + 147;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRlatuFieldErrorCodeCounter = -1;
     public boolean isRlatuFieldErrorCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlatuFieldErrorCodeCounter != sharedCounter;
         localRlatuFieldErrorCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int RLATU_FIELD_ERROR_CODE_LEN = 3;
	/**
	 * 	serialize this RlatuFieldErrorCode
	 */
   protected void serializeRlatuFieldErrorCode(char[] rlatuFieldErrorCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlatuFieldErrorCode,0,getStringValue(),beginRlatuFieldErrorCode,RLATU_FIELD_ERROR_CODE_LEN);
       localRlatuFieldErrorCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlatuFieldErrorCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshRlatuFieldErrorCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlatuFieldErrorCode() {	 
   		return (substring(getStringValue(),beginRlatuFieldErrorCode,beginRlatuFieldErrorCode + RLATU_FIELD_ERROR_CODE_LEN));
   	}




}
  
