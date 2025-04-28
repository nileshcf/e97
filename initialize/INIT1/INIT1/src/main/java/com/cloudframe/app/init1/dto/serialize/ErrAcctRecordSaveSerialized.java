package com.cloudframe.app.init1.dto.serialize;

/**
*  The class ErrAcctRecordSaveSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:55. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ErrAcctRecordSaveSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ErrAcctRecordSaveSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ERR_ACCT_RECORD_SAVE_LENGTH = 57;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginErrCustAcctSave;
	
	/**
	* Constructor for ErrAcctRecordSaveSerialized
	**/
    public ErrAcctRecordSaveSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ErrAcctRecordSaveSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ErrAcctRecordSaveSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ErrAcctRecordSaveSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,498); // serialize this field at offset 498 by default 
    }
    
	/**
	* sets parent for this ErrAcctRecordSaveSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 498 by default
    }    
	/**
	* initializes the field in ErrAcctRecordSaveSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ERR_ACCT_RECORD_SAVE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginErrCustAcctSave = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localErrCustAcctSaveCounter = -1;
     public boolean isErrCustAcctSaveModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrCustAcctSaveCounter != sharedCounter;
         localErrCustAcctSaveCounter = sharedCounter; return hasModified;
     }
	protected static final int ERR_CUST_ACCT_SAVE_LEN = 8;
	/**
	 * 	serialize this ErrCustAcctSave
	 */
   protected void serializeErrCustAcctSave(char[] errCustAcctSave) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(errCustAcctSave,0,getStringValue(),beginErrCustAcctSave,ERR_CUST_ACCT_SAVE_LEN);
       localErrCustAcctSaveCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkErrCustAcctSaveConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshErrCustAcctSave is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshErrCustAcctSave() {	 
   		return (substring(getStringValue(),beginErrCustAcctSave,beginErrCustAcctSave + ERR_CUST_ACCT_SAVE_LEN));
   	}




}
  
