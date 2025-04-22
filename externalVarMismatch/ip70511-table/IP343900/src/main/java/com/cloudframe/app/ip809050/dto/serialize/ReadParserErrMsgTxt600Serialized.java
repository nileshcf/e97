package com.cloudframe.app.ip809050.dto.serialize;

/**
*  The class ReadParserErrMsgTxt600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ReadParserErrMsgTxt600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ReadParserErrMsgTxt600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int READ_PARSER_ERR_MSG_TXT_600_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginReadParserMsgDtl600;
            protected  int beginReadParserReturnCode600;
	
	/**
	* Constructor for ReadParserErrMsgTxt600Serialized
	**/
    public ReadParserErrMsgTxt600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ReadParserErrMsgTxt600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(READ_PARSER_ERR_MSG_TXT_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginReadParserMsgDtl600 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginReadParserReturnCode600 = getStartOffset() + 61;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localReadParserMsgDtl600Counter = -1;
     public boolean isReadParserMsgDtl600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localReadParserMsgDtl600Counter != sharedCounter;
         localReadParserMsgDtl600Counter = sharedCounter; return hasModified;
     }
	protected static final int READ_PARSER_MSG_DTL_600_LEN = 47;
	/**
	 * 	serialize this ReadParserMsgDtl600
	 */
   protected void serializeReadParserMsgDtl600(char[] readParserMsgDtl600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(readParserMsgDtl600,0,getStringValue(),beginReadParserMsgDtl600,READ_PARSER_MSG_DTL_600_LEN);
       localReadParserMsgDtl600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkReadParserMsgDtl600Constraints(char[] value) {
   			return super.checkConstraints(value , 47 ,false, false);
   }
    /**
	 *	refreshReadParserMsgDtl600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshReadParserMsgDtl600() {	 
   		return (substring(getStringValue(),beginReadParserMsgDtl600,beginReadParserMsgDtl600 + READ_PARSER_MSG_DTL_600_LEN));
   	}
     int localReadParserReturnCode600Counter = -1;
     public boolean isReadParserReturnCode600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localReadParserReturnCode600Counter != sharedCounter;
         localReadParserReturnCode600Counter = sharedCounter; return hasModified;
     }
	protected static final int READ_PARSER_RETURN_CODE_600_LEN = 4;
	/**
	 * 	serialize this ReadParserReturnCode600
	 */
   protected void serializeReadParserReturnCode600(char[] readParserReturnCode600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(readParserReturnCode600,0,getStringValue(),beginReadParserReturnCode600,READ_PARSER_RETURN_CODE_600_LEN);
       localReadParserReturnCode600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkReadParserReturnCode600Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshReadParserReturnCode600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshReadParserReturnCode600() {	 
   		return (substring(getStringValue(),beginReadParserReturnCode600,beginReadParserReturnCode600 + READ_PARSER_RETURN_CODE_600_LEN));
   	}




}
  
