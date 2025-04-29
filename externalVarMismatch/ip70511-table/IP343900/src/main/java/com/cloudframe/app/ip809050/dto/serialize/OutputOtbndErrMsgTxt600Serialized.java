package com.cloudframe.app.ip809050.dto.serialize;

/**
*  The class OutputOtbndErrMsgTxt600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class OutputOtbndErrMsgTxt600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(OutputOtbndErrMsgTxt600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int OUTPUT_OTBND_ERR_MSG_TXT_600_LENGTH = 62;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginOutputOutboundMsgDtl600;
            protected  int beginOutputOtbndFileStatus600;
	
	/**
	* Constructor for OutputOtbndErrMsgTxt600Serialized
	**/
    public OutputOtbndErrMsgTxt600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in OutputOtbndErrMsgTxt600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(OUTPUT_OTBND_ERR_MSG_TXT_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginOutputOutboundMsgDtl600 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginOutputOtbndFileStatus600 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localOutputOutboundMsgDtl600Counter = -1;
     public boolean isOutputOutboundMsgDtl600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOutputOutboundMsgDtl600Counter != sharedCounter;
         localOutputOutboundMsgDtl600Counter = sharedCounter; return hasModified;
     }
	protected static final int OUTPUT_OUTBOUND_MSG_DTL_600_LEN = 40;
	/**
	 * 	serialize this OutputOutboundMsgDtl600
	 */
   protected void serializeOutputOutboundMsgDtl600(char[] outputOutboundMsgDtl600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(outputOutboundMsgDtl600,0,getStringValue(),beginOutputOutboundMsgDtl600,OUTPUT_OUTBOUND_MSG_DTL_600_LEN);
       localOutputOutboundMsgDtl600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOutputOutboundMsgDtl600Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshOutputOutboundMsgDtl600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOutputOutboundMsgDtl600() {	 
   		return (substring(getStringValue(),beginOutputOutboundMsgDtl600,beginOutputOutboundMsgDtl600 + OUTPUT_OUTBOUND_MSG_DTL_600_LEN));
   	}
     int localOutputOtbndFileStatus600Counter = -1;
     public boolean isOutputOtbndFileStatus600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOutputOtbndFileStatus600Counter != sharedCounter;
         localOutputOtbndFileStatus600Counter = sharedCounter; return hasModified;
     }
	protected static final int OUTPUT_OTBND_FILE_STATUS_600_LEN = 2;
	/**
	 * 	serialize this OutputOtbndFileStatus600
	 */
   protected void serializeOutputOtbndFileStatus600(char[] outputOtbndFileStatus600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(outputOtbndFileStatus600,0,getStringValue(),beginOutputOtbndFileStatus600,OUTPUT_OTBND_FILE_STATUS_600_LEN);
       localOutputOtbndFileStatus600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOutputOtbndFileStatus600Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshOutputOtbndFileStatus600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOutputOtbndFileStatus600() {	 
   		return (substring(getStringValue(),beginOutputOtbndFileStatus600,beginOutputOtbndFileStatus600 + OUTPUT_OTBND_FILE_STATUS_600_LEN));
   	}




}
  
