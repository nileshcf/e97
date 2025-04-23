package com.cloudframe.app.init1.dto.serialize;

/**
*  The class MessageInformationSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MessageInformationSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MessageInformationSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MESSAGE_INFORMATION_LENGTH = 257;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMessageInformationLen;
            protected  int beginMessageInformationText;
	
	/**
	* Constructor for MessageInformationSerialized
	**/
    public MessageInformationSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MessageInformationSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MessageInformationSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MessageInformationSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,37); // serialize this field at offset 37 by default 
    }
    
	/**
	* sets parent for this MessageInformationSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 37 by default
    }    
	/**
	* initializes the field in MessageInformationSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MESSAGE_INFORMATION_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMessageInformationLen = getStartOffset() + 0;	// set offset for serialization
  
             beginMessageInformationText = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localMessageInformationLenCounter = -1;
         public boolean isMessageInformationLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMessageInformationLenCounter != sharedCounter;
            localMessageInformationLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int MESSAGE_INFORMATION_LEN_LEN = 2;
  	/**
	 * serializeMessageInformationLen
	 */
	protected void serializeMessageInformationLen(short messageInformationLen) {
           replaceValue( //  save the value as string
                   getBinaryString( messageInformationLen,MESSAGE_INFORMATION_LEN_LEN)
                  ,beginMessageInformationLen
                  ,MESSAGE_INFORMATION_LEN_LEN
                 );
            localMessageInformationLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkMessageInformationLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshMessageInformationLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshMessageInformationLen() {	 
			return (getShort(beginMessageInformationLen));
   	}
     int localMessageInformationTextCounter = -1;
     public boolean isMessageInformationTextModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMessageInformationTextCounter != sharedCounter;
         localMessageInformationTextCounter = sharedCounter; return hasModified;
     }
	protected static final int MESSAGE_INFORMATION_TEXT_LEN = 255;
	/**
	 * 	serialize this MessageInformationText
	 */
   protected void serializeMessageInformationText(char[] messageInformationText) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(messageInformationText,0,getStringValue(),beginMessageInformationText,MESSAGE_INFORMATION_TEXT_LEN);
       localMessageInformationTextCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMessageInformationTextConstraints(char[] value) {
   			return super.checkConstraints(value , 255 ,false, false);
   }
    /**
	 *	refreshMessageInformationText is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMessageInformationText() {	 
   		return (substring(getStringValue(),beginMessageInformationText,beginMessageInformationText + MESSAGE_INFORMATION_TEXT_LEN));
   	}




}
  
