package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class IldcrLnShrGrpRemDtlSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IldcrLnShrGrpRemDtlSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IldcrLnShrGrpRemDtlSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ILDCR_LN_SHR_GRP_REM_DTL_LENGTH = 173;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIldcrFieldErrorCode;
	
	/**
	* Constructor for IldcrLnShrGrpRemDtlSerialized
	**/
    public IldcrLnShrGrpRemDtlSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for IldcrLnShrGrpRemDtlSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IldcrLnShrGrpRemDtlSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this IldcrLnShrGrpRemDtlSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this IldcrLnShrGrpRemDtlSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in IldcrLnShrGrpRemDtlSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ILDCR_LN_SHR_GRP_REM_DTL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIldcrFieldErrorCode = getStartOffset() + 170;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIldcrFieldErrorCodeCounter = -1;
     public boolean isIldcrFieldErrorCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIldcrFieldErrorCodeCounter != sharedCounter;
         localIldcrFieldErrorCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int ILDCR_FIELD_ERROR_CODE_LEN = 3;
	/**
	 * 	serialize this IldcrFieldErrorCode
	 */
   protected void serializeIldcrFieldErrorCode(char[] ildcrFieldErrorCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ildcrFieldErrorCode,0,getStringValue(),beginIldcrFieldErrorCode,ILDCR_FIELD_ERROR_CODE_LEN);
       localIldcrFieldErrorCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIldcrFieldErrorCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIldcrFieldErrorCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIldcrFieldErrorCode() {	 
   		return (substring(getStringValue(),beginIldcrFieldErrorCode,beginIldcrFieldErrorCode + ILDCR_FIELD_ERROR_CODE_LEN));
   	}




}
  
