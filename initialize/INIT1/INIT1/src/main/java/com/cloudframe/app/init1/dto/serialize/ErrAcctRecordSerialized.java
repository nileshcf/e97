package com.cloudframe.app.init1.dto.serialize;

/**
*  The class ErrAcctRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:55. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ErrAcctRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ErrAcctRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ERR_ACCT_RECORD_LENGTH = 66;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginErrRejectCd;
            protected  int beginErrRejectReason;
	
	/**
	* Constructor for ErrAcctRecordSerialized
	**/
    public ErrAcctRecordSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ErrAcctRecordSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ErrAcctRecordSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ErrAcctRecordSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,432); // serialize this field at offset 432 by default 
    }
    
	/**
	* sets parent for this ErrAcctRecordSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 432 by default
    }    
	/**
	* initializes the field in ErrAcctRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ERR_ACCT_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginErrRejectCd = getStartOffset() + 23;	// set offset for serialization
  
             beginErrRejectReason = getStartOffset() + 26;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localErrRejectCdCounter = -1;
     public boolean isErrRejectCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrRejectCdCounter != sharedCounter;
         localErrRejectCdCounter = sharedCounter; return hasModified;
     }
	protected static final int ERR_REJECT_CD_LEN = 3;
	/**
	 * 	serialize this ErrRejectCd
	 */
   protected void serializeErrRejectCd(char[] errRejectCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(errRejectCd,0,getStringValue(),beginErrRejectCd,ERR_REJECT_CD_LEN);
       localErrRejectCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkErrRejectCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshErrRejectCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshErrRejectCd() {	 
   		return (substring(getStringValue(),beginErrRejectCd,beginErrRejectCd + ERR_REJECT_CD_LEN));
   	}
     int localErrRejectReasonCounter = -1;
     public boolean isErrRejectReasonModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrRejectReasonCounter != sharedCounter;
         localErrRejectReasonCounter = sharedCounter; return hasModified;
     }
	protected static final int ERR_REJECT_REASON_LEN = 40;
	/**
	 * 	serialize this ErrRejectReason
	 */
   protected void serializeErrRejectReason(char[] errRejectReason) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(errRejectReason,0,getStringValue(),beginErrRejectReason,ERR_REJECT_REASON_LEN);
       localErrRejectReasonCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkErrRejectReasonConstraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshErrRejectReason is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshErrRejectReason() {	 
   		return (substring(getStringValue(),beginErrRejectReason,beginErrRejectReason + ERR_REJECT_REASON_LEN));
   	}




}
  
