package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class OldcrLnShrGrpRemDtlSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class OldcrLnShrGrpRemDtlSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(OldcrLnShrGrpRemDtlSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int OLDCR_LN_SHR_GRP_REM_DTL_LENGTH = 173;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginOldcrFieldErrorCode;
	
	/**
	* Constructor for OldcrLnShrGrpRemDtlSerialized
	**/
    public OldcrLnShrGrpRemDtlSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for OldcrLnShrGrpRemDtlSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public OldcrLnShrGrpRemDtlSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this OldcrLnShrGrpRemDtlSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this OldcrLnShrGrpRemDtlSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in OldcrLnShrGrpRemDtlSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(OLDCR_LN_SHR_GRP_REM_DTL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginOldcrFieldErrorCode = getStartOffset() + 170;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localOldcrFieldErrorCodeCounter = -1;
     public boolean isOldcrFieldErrorCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOldcrFieldErrorCodeCounter != sharedCounter;
         localOldcrFieldErrorCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int OLDCR_FIELD_ERROR_CODE_LEN = 3;
	/**
	 * 	serialize this OldcrFieldErrorCode
	 */
   protected void serializeOldcrFieldErrorCode(char[] oldcrFieldErrorCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(oldcrFieldErrorCode,0,getStringValue(),beginOldcrFieldErrorCode,OLDCR_FIELD_ERROR_CODE_LEN);
       localOldcrFieldErrorCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOldcrFieldErrorCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshOldcrFieldErrorCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOldcrFieldErrorCode() {	 
   		return (substring(getStringValue(),beginOldcrFieldErrorCode,beginOldcrFieldErrorCode + OLDCR_FIELD_ERROR_CODE_LEN));
   	}




}
  
