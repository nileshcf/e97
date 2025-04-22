package com.cloudframe.app.init1.dto.serialize;

/**
*  The class RlcbmBillMsgDtlGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:05. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RlcbmBillMsgDtlGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RlcbmBillMsgDtlGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RLCBM_BILL_MSG_DTL_GROUP_LENGTH = 162;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRlcbmBillMsgHdr;
	
	/**
	* Constructor for RlcbmBillMsgDtlGroupSerialized
	**/
    public RlcbmBillMsgDtlGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RlcbmBillMsgDtlGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RLCBM_BILL_MSG_DTL_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginRlcbmBillMsgHdr = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localRlcbmBillMsgHdrCounter = -1;
     public boolean isRlcbmBillMsgHdrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlcbmBillMsgHdrCounter != sharedCounter;
         localRlcbmBillMsgHdrCounter = sharedCounter; return hasModified;
     }
	protected static final int RLCBM_BILL_MSG_HDR_LEN = 162;
	/**
	 * 	serialize this RlcbmBillMsgHdr
	 */
   protected void serializeRlcbmBillMsgHdr(char[] rlcbmBillMsgHdr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlcbmBillMsgHdr,0,getStringValue(),beginRlcbmBillMsgHdr,RLCBM_BILL_MSG_HDR_LEN);
       localRlcbmBillMsgHdrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlcbmBillMsgHdrConstraints(char[] value) {
   			return super.checkConstraints(value , 162 ,false, false);
   }
    /**
	 *	refreshRlcbmBillMsgHdr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlcbmBillMsgHdr() {	 
   		return (substring(getStringValue(),beginRlcbmBillMsgHdr,beginRlcbmBillMsgHdr + RLCBM_BILL_MSG_HDR_LEN));
   	}




}
  
