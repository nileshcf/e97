package com.cloudframe.app.ip829010.dto.serialize;

/**
*  The class FnsPayloadFacDataKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FnsPayloadFacDataKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FnsPayloadFacDataKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FNS_PAYLOAD_FAC_DATA_KEY_LENGTH = 25;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFnsPayloadPrimaryAcctNbr;
	
	/**
	* Constructor for FnsPayloadFacDataKeySerialized
	**/
    public FnsPayloadFacDataKeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for FnsPayloadFacDataKeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FnsPayloadFacDataKeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this FnsPayloadFacDataKeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,68); // serialize this field at offset 68 by default 
    }
    
	/**
	* sets parent for this FnsPayloadFacDataKeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 68 by default
    }    
	/**
	* initializes the field in FnsPayloadFacDataKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FNS_PAYLOAD_FAC_DATA_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFnsPayloadPrimaryAcctNbr = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localFnsPayloadPrimaryAcctNbrCounter = -1;
     public boolean isFnsPayloadPrimaryAcctNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPayloadPrimaryAcctNbrCounter != sharedCounter;
         localFnsPayloadPrimaryAcctNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int FNS_PAYLOAD_PRIMARY_ACCT_NBR_LEN = 19;
	/**
	 * 	serialize this FnsPayloadPrimaryAcctNbr
	 */
   protected void serializeFnsPayloadPrimaryAcctNbr(char[] fnsPayloadPrimaryAcctNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fnsPayloadPrimaryAcctNbr,0,getStringValue(),beginFnsPayloadPrimaryAcctNbr,FNS_PAYLOAD_PRIMARY_ACCT_NBR_LEN);
       localFnsPayloadPrimaryAcctNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFnsPayloadPrimaryAcctNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshFnsPayloadPrimaryAcctNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFnsPayloadPrimaryAcctNbr() {	 
   		return (substring(getStringValue(),beginFnsPayloadPrimaryAcctNbr,beginFnsPayloadPrimaryAcctNbr + FNS_PAYLOAD_PRIMARY_ACCT_NBR_LEN));
   	}




}
  
