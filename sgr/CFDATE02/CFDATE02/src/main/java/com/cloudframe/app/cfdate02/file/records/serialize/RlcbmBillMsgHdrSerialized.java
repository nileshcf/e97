package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class RlcbmBillMsgHdrSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RlcbmBillMsgHdrSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RlcbmBillMsgHdrSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RLCBM_BILL_MSG_HDR_LENGTH = 162;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRlcbmCustomerHeaderRec;
	
	/**
	* Constructor for RlcbmBillMsgHdrSerialized
	**/
    public RlcbmBillMsgHdrSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for RlcbmBillMsgHdrSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlcbmBillMsgHdrSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this RlcbmBillMsgHdrSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this RlcbmBillMsgHdrSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in RlcbmBillMsgHdrSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RLCBM_BILL_MSG_HDR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRlcbmCustomerHeaderRec = getStartOffset() + 21;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRlcbmCustomerHeaderRecCounter = -1;
     public boolean isRlcbmCustomerHeaderRecModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlcbmCustomerHeaderRecCounter != sharedCounter;
         localRlcbmCustomerHeaderRecCounter = sharedCounter; return hasModified;
     }
	protected static final int RLCBM_CUSTOMER_HEADER_REC_LEN = 141;
	/**
	 * 	serialize this RlcbmCustomerHeaderRec
	 */
   protected void serializeRlcbmCustomerHeaderRec(char[] rlcbmCustomerHeaderRec) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlcbmCustomerHeaderRec,0,getStringValue(),beginRlcbmCustomerHeaderRec,RLCBM_CUSTOMER_HEADER_REC_LEN);
       localRlcbmCustomerHeaderRecCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlcbmCustomerHeaderRecConstraints(char[] value) {
   			return super.checkConstraints(value , 141 ,false, false);
   }
    /**
	 *	refreshRlcbmCustomerHeaderRec is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlcbmCustomerHeaderRec() {	 
   		return (substring(getStringValue(),beginRlcbmCustomerHeaderRec,beginRlcbmCustomerHeaderRec + RLCBM_CUSTOMER_HEADER_REC_LEN));
   	}




}
  
