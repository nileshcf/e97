package com.cloudframe.app.varlen.dto.serialize;

/**
*  The class RevoDetailRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:26. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RevoDetailRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RevoDetailRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int REVO_DETAIL_RECORD_LENGTH = 674;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRevoEmailAddr;
	
	/**
	* Constructor for RevoDetailRecordSerialized
	**/
    public RevoDetailRecordSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for RevoDetailRecordSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RevoDetailRecordSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this RevoDetailRecordSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2); // serialize this field at offset 2 by default 
    }
    
	/**
	* sets parent for this RevoDetailRecordSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2 by default
    }    
	/**
	* initializes the field in RevoDetailRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(REVO_DETAIL_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRevoEmailAddr = getStartOffset() + 614;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRevoEmailAddrCounter = -1;
     public boolean isRevoEmailAddrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRevoEmailAddrCounter != sharedCounter;
         localRevoEmailAddrCounter = sharedCounter; return hasModified;
     }
	protected static final int REVO_EMAIL_ADDR_LEN = 60;
	/**
	 * 	serialize this RevoEmailAddr
	 */
   protected void serializeRevoEmailAddr(char[] revoEmailAddr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(revoEmailAddr,0,getStringValue(),beginRevoEmailAddr,REVO_EMAIL_ADDR_LEN);
       localRevoEmailAddrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRevoEmailAddrConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshRevoEmailAddr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRevoEmailAddr() {	 
   		return (substring(getStringValue(),beginRevoEmailAddr,beginRevoEmailAddr + REVO_EMAIL_ADDR_LEN));
   	}




}
  
