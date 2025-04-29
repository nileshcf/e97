package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class MsdRecordKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MsdRecordKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MsdRecordKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSD_RECORD_KEY_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMsdSecurityNo;
            protected  int beginMsdWhenIssuedCode;
	
	/**
	* Constructor for MsdRecordKeySerialized
	**/
    public MsdRecordKeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MsdRecordKeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdRecordKeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MsdRecordKeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,106); // serialize this field at offset 106 by default 
    }
    
	/**
	* sets parent for this MsdRecordKeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 106 by default
    }    
	/**
	* initializes the field in MsdRecordKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSD_RECORD_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMsdSecurityNo = getStartOffset() + 0;	// set offset for serialization
  
  
             beginMsdWhenIssuedCode = getStartOffset() + 7;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMsdSecurityNoCounter = -1;
     public boolean isMsdSecurityNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdSecurityNoCounter != sharedCounter;
         localMsdSecurityNoCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_SECURITY_NO_LEN = 7;
	/**
	 * 	serialize this MsdSecurityNo
	 */
   protected void serializeMsdSecurityNo(char[] msdSecurityNo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdSecurityNo,0,getStringValue(),beginMsdSecurityNo,MSD_SECURITY_NO_LEN);
       localMsdSecurityNoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdSecurityNoConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshMsdSecurityNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdSecurityNo() {	 
   		return (substring(getStringValue(),beginMsdSecurityNo,beginMsdSecurityNo + MSD_SECURITY_NO_LEN));
   	}
     int localMsdWhenIssuedCodeCounter = -1;
     public boolean isMsdWhenIssuedCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdWhenIssuedCodeCounter != sharedCounter;
         localMsdWhenIssuedCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_WHEN_ISSUED_CODE_LEN = 1;
	/**
	 * 	serialize this MsdWhenIssuedCode
	 */
   protected void serializeMsdWhenIssuedCode(char[] msdWhenIssuedCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdWhenIssuedCode,0,getStringValue(),beginMsdWhenIssuedCode,MSD_WHEN_ISSUED_CODE_LEN);
       localMsdWhenIssuedCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdWhenIssuedCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdWhenIssuedCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdWhenIssuedCode() {	 
   		return (substring(getStringValue(),beginMsdWhenIssuedCode,beginMsdWhenIssuedCode + MSD_WHEN_ISSUED_CODE_LEN));
   	}




}
  
