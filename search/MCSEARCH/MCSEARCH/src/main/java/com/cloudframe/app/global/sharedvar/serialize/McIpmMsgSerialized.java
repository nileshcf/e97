package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class McIpmMsgSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:57. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class McIpmMsgSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(McIpmMsgSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MC_IPM_MSG_LENGTH = 16;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMcIpmMsgTxt;
	
	/**
	* Constructor for McIpmMsgSerialized
	**/
    public McIpmMsgSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in McIpmMsgSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MC_IPM_MSG_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMcIpmMsgTxt = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMcIpmMsgTxtCounter = -1;
     public boolean isMcIpmMsgTxtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMcIpmMsgTxtCounter != sharedCounter;
         localMcIpmMsgTxtCounter = sharedCounter; return hasModified;
     }
	protected static final int MC_IPM_MSG_TXT_LEN = 16;
	/**
	 * 	serialize this McIpmMsgTxt
	 */
   protected void serializeMcIpmMsgTxt(char[] mcIpmMsgTxt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mcIpmMsgTxt,0,getStringValue(),beginMcIpmMsgTxt,MC_IPM_MSG_TXT_LEN);
       localMcIpmMsgTxtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMcIpmMsgTxtConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshMcIpmMsgTxt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMcIpmMsgTxt() {	 
   		return (substring(getStringValue(),beginMcIpmMsgTxt,beginMcIpmMsgTxt + MC_IPM_MSG_TXT_LEN));
   	}




}
  
