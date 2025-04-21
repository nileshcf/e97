package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class OldclLnShrBcActvDtlSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class OldclLnShrBcActvDtlSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(OldclLnShrBcActvDtlSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int OLDCL_LN_SHR_BC_ACTV_DTL_LENGTH = 350;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginOldclFieldErrorCode;
	
	/**
	* Constructor for OldclLnShrBcActvDtlSerialized
	**/
    public OldclLnShrBcActvDtlSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for OldclLnShrBcActvDtlSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public OldclLnShrBcActvDtlSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this OldclLnShrBcActvDtlSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this OldclLnShrBcActvDtlSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in OldclLnShrBcActvDtlSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(OLDCL_LN_SHR_BC_ACTV_DTL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginOldclFieldErrorCode = getStartOffset() + 347;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localOldclFieldErrorCodeCounter = -1;
     public boolean isOldclFieldErrorCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOldclFieldErrorCodeCounter != sharedCounter;
         localOldclFieldErrorCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int OLDCL_FIELD_ERROR_CODE_LEN = 3;
	/**
	 * 	serialize this OldclFieldErrorCode
	 */
   protected void serializeOldclFieldErrorCode(char[] oldclFieldErrorCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(oldclFieldErrorCode,0,getStringValue(),beginOldclFieldErrorCode,OLDCL_FIELD_ERROR_CODE_LEN);
       localOldclFieldErrorCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOldclFieldErrorCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshOldclFieldErrorCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOldclFieldErrorCode() {	 
   		return (substring(getStringValue(),beginOldclFieldErrorCode,beginOldclFieldErrorCode + OLDCL_FIELD_ERROR_CODE_LEN));
   	}




}
  
