package com.cloudframe.app.init1.dto.serialize;

/**
*  The class RlcbmBillMsgDtlSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RlcbmBillMsgDtlSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RlcbmBillMsgDtlSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RLCBM_BILL_MSG_DTL_LENGTH = 162;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for RlcbmBillMsgDtlSerialized
	**/
    public RlcbmBillMsgDtlSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for RlcbmBillMsgDtlSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlcbmBillMsgDtlSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this RlcbmBillMsgDtlSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this RlcbmBillMsgDtlSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in RlcbmBillMsgDtlSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RLCBM_BILL_MSG_DTL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
