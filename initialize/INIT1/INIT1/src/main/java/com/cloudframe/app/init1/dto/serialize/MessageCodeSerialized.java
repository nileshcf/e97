package com.cloudframe.app.init1.dto.serialize;

/**
*  The class MessageCodeSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MessageCodeSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MessageCodeSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MESSAGE_CODE_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMessageCodeLen;
            protected  int beginMessageCodeText;
	
	/**
	* Constructor for MessageCodeSerialized
	**/
    public MessageCodeSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MessageCodeSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MessageCodeSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MessageCodeSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,25); // serialize this field at offset 25 by default 
    }
    
	/**
	* sets parent for this MessageCodeSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 25 by default
    }    
	/**
	* initializes the field in MessageCodeSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MESSAGE_CODE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMessageCodeLen = getStartOffset() + 0;	// set offset for serialization
  
             beginMessageCodeText = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localMessageCodeLenCounter = -1;
         public boolean isMessageCodeLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMessageCodeLenCounter != sharedCounter;
            localMessageCodeLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int MESSAGE_CODE_LEN_LEN = 2;
  	/**
	 * serializeMessageCodeLen
	 */
	protected void serializeMessageCodeLen(short messageCodeLen) {
           replaceValue( //  save the value as string
                   getBinaryString( messageCodeLen,MESSAGE_CODE_LEN_LEN)
                  ,beginMessageCodeLen
                  ,MESSAGE_CODE_LEN_LEN
                 );
            localMessageCodeLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkMessageCodeLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshMessageCodeLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshMessageCodeLen() {	 
			return (getShort(beginMessageCodeLen));
   	}
     int localMessageCodeTextCounter = -1;
     public boolean isMessageCodeTextModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMessageCodeTextCounter != sharedCounter;
         localMessageCodeTextCounter = sharedCounter; return hasModified;
     }
	protected static final int MESSAGE_CODE_TEXT_LEN = 10;
	/**
	 * 	serialize this MessageCodeText
	 */
   protected void serializeMessageCodeText(char[] messageCodeText) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(messageCodeText,0,getStringValue(),beginMessageCodeText,MESSAGE_CODE_TEXT_LEN);
       localMessageCodeTextCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMessageCodeTextConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshMessageCodeText is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMessageCodeText() {	 
   		return (substring(getStringValue(),beginMessageCodeText,beginMessageCodeText + MESSAGE_CODE_TEXT_LEN));
   	}




}
  
