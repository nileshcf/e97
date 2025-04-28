package com.cloudframe.app.init1.dto.serialize;

/**
*  The class MessageDescriptionSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:55. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MessageDescriptionSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MessageDescriptionSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MESSAGE_DESCRIPTION_LENGTH = 257;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMessageDescriptionLen;
            protected  int beginMessageDescriptionText;
	
	/**
	* Constructor for MessageDescriptionSerialized
	**/
    public MessageDescriptionSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MessageDescriptionSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MessageDescriptionSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MessageDescriptionSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,294); // serialize this field at offset 294 by default 
    }
    
	/**
	* sets parent for this MessageDescriptionSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 294 by default
    }    
	/**
	* initializes the field in MessageDescriptionSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MESSAGE_DESCRIPTION_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMessageDescriptionLen = getStartOffset() + 0;	// set offset for serialization
  
             beginMessageDescriptionText = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localMessageDescriptionLenCounter = -1;
         public boolean isMessageDescriptionLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMessageDescriptionLenCounter != sharedCounter;
            localMessageDescriptionLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int MESSAGE_DESCRIPTION_LEN_LEN = 2;
  	/**
	 * serializeMessageDescriptionLen
	 */
	protected void serializeMessageDescriptionLen(short messageDescriptionLen) {
           replaceValue( //  save the value as string
                   getBinaryString( messageDescriptionLen,MESSAGE_DESCRIPTION_LEN_LEN)
                  ,beginMessageDescriptionLen
                  ,MESSAGE_DESCRIPTION_LEN_LEN
                 );
            localMessageDescriptionLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkMessageDescriptionLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshMessageDescriptionLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshMessageDescriptionLen() {	 
			return (getShort(beginMessageDescriptionLen));
   	}
     int localMessageDescriptionTextCounter = -1;
     public boolean isMessageDescriptionTextModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMessageDescriptionTextCounter != sharedCounter;
         localMessageDescriptionTextCounter = sharedCounter; return hasModified;
     }
	protected static final int MESSAGE_DESCRIPTION_TEXT_LEN = 255;
	/**
	 * 	serialize this MessageDescriptionText
	 */
   protected void serializeMessageDescriptionText(char[] messageDescriptionText) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(messageDescriptionText,0,getStringValue(),beginMessageDescriptionText,MESSAGE_DESCRIPTION_TEXT_LEN);
       localMessageDescriptionTextCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMessageDescriptionTextConstraints(char[] value) {
   			return super.checkConstraints(value , 255 ,false, false);
   }
    /**
	 *	refreshMessageDescriptionText is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMessageDescriptionText() {	 
   		return (substring(getStringValue(),beginMessageDescriptionText,beginMessageDescriptionText + MESSAGE_DESCRIPTION_TEXT_LEN));
   	}




}
  
