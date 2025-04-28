package com.cloudframe.app.ip662010.dto.serialize;

/**
*  The class Ip662011ReadParserErrMsgsGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:58. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip662011ReadParserErrMsgsGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip662011ReadParserErrMsgsGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_662011_READ_PARSER_ERR_MSGS_GROUP_LENGTH = 600;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp662011ReadParserErrMsgs;
	
	/**
	* Constructor for Ip662011ReadParserErrMsgsGroupSerialized
	**/
    public Ip662011ReadParserErrMsgsGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip662011ReadParserErrMsgsGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_662011_READ_PARSER_ERR_MSGS_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp662011ReadParserErrMsgs = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localIp662011ReadParserErrMsgsCounter = -1;
     public boolean isIp662011ReadParserErrMsgsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp662011ReadParserErrMsgsCounter != sharedCounter;
         localIp662011ReadParserErrMsgsCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_662011_READ_PARSER_ERR_MSGS_LEN = 600;
	/**
	 * 	serialize this Ip662011ReadParserErrMsgs
	 */
   protected void serializeIp662011ReadParserErrMsgs(char[] ip662011ReadParserErrMsgs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip662011ReadParserErrMsgs,0,getStringValue(),beginIp662011ReadParserErrMsgs,IP_662011_READ_PARSER_ERR_MSGS_LEN);
       localIp662011ReadParserErrMsgsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp662011ReadParserErrMsgsConstraints(char[] value) {
   			return super.checkConstraints(value , 600 ,false, false);
   }
    /**
	 *	refreshIp662011ReadParserErrMsgs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp662011ReadParserErrMsgs() {	 
   		return (substring(getStringValue(),beginIp662011ReadParserErrMsgs,beginIp662011ReadParserErrMsgs + IP_662011_READ_PARSER_ERR_MSGS_LEN));
   	}




}
  
