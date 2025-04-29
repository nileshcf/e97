package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip70301OrigMsgLenGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:25. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip70301OrigMsgLenGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip70301OrigMsgLenGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_70301_ORIG_MSG_LEN_GROUP_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp70301OrigMsgLen;
	
	/**
	* Constructor for Ip70301OrigMsgLenGroupSerialized
	**/
    public Ip70301OrigMsgLenGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip70301OrigMsgLenGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_70301_ORIG_MSG_LEN_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp70301OrigMsgLen = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIp70301OrigMsgLenCounter = -1;
         public boolean isIp70301OrigMsgLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp70301OrigMsgLenCounter != sharedCounter;
            localIp70301OrigMsgLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_70301_ORIG_MSG_LEN_LEN = 4;
  	/**
	 * serializeIp70301OrigMsgLen
	 */
	protected void serializeIp70301OrigMsgLen(long ip70301OrigMsgLen) {
           replaceValue( //  save the value as string
                   getBinaryString( ip70301OrigMsgLen,IP_70301_ORIG_MSG_LEN_LEN)
                  ,beginIp70301OrigMsgLen
                  ,IP_70301_ORIG_MSG_LEN_LEN
                 );
            localIp70301OrigMsgLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkIp70301OrigMsgLenMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp70301OrigMsgLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp70301OrigMsgLen() {	 
			return (getUnsignedInt(beginIp70301OrigMsgLen));
   	}




}
  
