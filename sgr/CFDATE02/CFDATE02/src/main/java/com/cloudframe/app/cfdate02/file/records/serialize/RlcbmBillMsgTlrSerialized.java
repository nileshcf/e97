package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class RlcbmBillMsgTlrSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RlcbmBillMsgTlrSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RlcbmBillMsgTlrSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RLCBM_BILL_MSG_TLR_LENGTH = 162;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRlcbmFiller;
	
	/**
	* Constructor for RlcbmBillMsgTlrSerialized
	**/
    public RlcbmBillMsgTlrSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for RlcbmBillMsgTlrSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlcbmBillMsgTlrSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this RlcbmBillMsgTlrSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this RlcbmBillMsgTlrSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in RlcbmBillMsgTlrSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RLCBM_BILL_MSG_TLR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRlcbmFiller = getStartOffset() + 39;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRlcbmFillerCounter = -1;
     public boolean isRlcbmFillerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlcbmFillerCounter != sharedCounter;
         localRlcbmFillerCounter = sharedCounter; return hasModified;
     }
	protected static final int RLCBM_FILLER_LEN = 123;
	/**
	 * 	serialize this RlcbmFiller
	 */
   protected void serializeRlcbmFiller(char[] rlcbmFiller) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlcbmFiller,0,getStringValue(),beginRlcbmFiller,RLCBM_FILLER_LEN);
       localRlcbmFillerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlcbmFillerConstraints(char[] value) {
   			return super.checkConstraints(value , 123 ,false, false);
   }
    /**
	 *	refreshRlcbmFiller is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlcbmFiller() {	 
   		return (substring(getStringValue(),beginRlcbmFiller,beginRlcbmFiller + RLCBM_FILLER_LEN));
   	}




}
  
