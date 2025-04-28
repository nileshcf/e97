package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class IldclLnShrBcActvDtlSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IldclLnShrBcActvDtlSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IldclLnShrBcActvDtlSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ILDCL_LN_SHR_BC_ACTV_DTL_LENGTH = 350;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIldclFieldErrorCode;
	
	/**
	* Constructor for IldclLnShrBcActvDtlSerialized
	**/
    public IldclLnShrBcActvDtlSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for IldclLnShrBcActvDtlSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IldclLnShrBcActvDtlSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this IldclLnShrBcActvDtlSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this IldclLnShrBcActvDtlSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in IldclLnShrBcActvDtlSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ILDCL_LN_SHR_BC_ACTV_DTL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIldclFieldErrorCode = getStartOffset() + 347;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIldclFieldErrorCodeCounter = -1;
     public boolean isIldclFieldErrorCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIldclFieldErrorCodeCounter != sharedCounter;
         localIldclFieldErrorCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int ILDCL_FIELD_ERROR_CODE_LEN = 3;
	/**
	 * 	serialize this IldclFieldErrorCode
	 */
   protected void serializeIldclFieldErrorCode(char[] ildclFieldErrorCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ildclFieldErrorCode,0,getStringValue(),beginIldclFieldErrorCode,ILDCL_FIELD_ERROR_CODE_LEN);
       localIldclFieldErrorCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIldclFieldErrorCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIldclFieldErrorCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIldclFieldErrorCode() {	 
   		return (substring(getStringValue(),beginIldclFieldErrorCode,beginIldclFieldErrorCode + ILDCL_FIELD_ERROR_CODE_LEN));
   	}




}
  
