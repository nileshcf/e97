package com.cloudframe.app.ip809050.dto.serialize;

/**
*  The class InputOutboundErrMsgTxt600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:26. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class InputOutboundErrMsgTxt600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(InputOutboundErrMsgTxt600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int INPUT_OUTBOUND_ERR_MSG_TXT_600_LENGTH = 57;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginInputOutboundMsgDtl600;
            protected  int beginInputOtbndFileStatus600;
	
	/**
	* Constructor for InputOutboundErrMsgTxt600Serialized
	**/
    public InputOutboundErrMsgTxt600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in InputOutboundErrMsgTxt600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(INPUT_OUTBOUND_ERR_MSG_TXT_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginInputOutboundMsgDtl600 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginInputOtbndFileStatus600 = getStartOffset() + 55;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localInputOutboundMsgDtl600Counter = -1;
     public boolean isInputOutboundMsgDtl600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInputOutboundMsgDtl600Counter != sharedCounter;
         localInputOutboundMsgDtl600Counter = sharedCounter; return hasModified;
     }
	protected static final int INPUT_OUTBOUND_MSG_DTL_600_LEN = 40;
	/**
	 * 	serialize this InputOutboundMsgDtl600
	 */
   protected void serializeInputOutboundMsgDtl600(char[] inputOutboundMsgDtl600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(inputOutboundMsgDtl600,0,getStringValue(),beginInputOutboundMsgDtl600,INPUT_OUTBOUND_MSG_DTL_600_LEN);
       localInputOutboundMsgDtl600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkInputOutboundMsgDtl600Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshInputOutboundMsgDtl600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshInputOutboundMsgDtl600() {	 
   		return (substring(getStringValue(),beginInputOutboundMsgDtl600,beginInputOutboundMsgDtl600 + INPUT_OUTBOUND_MSG_DTL_600_LEN));
   	}
     int localInputOtbndFileStatus600Counter = -1;
     public boolean isInputOtbndFileStatus600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInputOtbndFileStatus600Counter != sharedCounter;
         localInputOtbndFileStatus600Counter = sharedCounter; return hasModified;
     }
	protected static final int INPUT_OTBND_FILE_STATUS_600_LEN = 2;
	/**
	 * 	serialize this InputOtbndFileStatus600
	 */
   protected void serializeInputOtbndFileStatus600(char[] inputOtbndFileStatus600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(inputOtbndFileStatus600,0,getStringValue(),beginInputOtbndFileStatus600,INPUT_OTBND_FILE_STATUS_600_LEN);
       localInputOtbndFileStatus600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkInputOtbndFileStatus600Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshInputOtbndFileStatus600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshInputOtbndFileStatus600() {	 
   		return (substring(getStringValue(),beginInputOtbndFileStatus600,beginInputOtbndFileStatus600 + INPUT_OTBND_FILE_STATUS_600_LEN));
   	}




}
  
