package com.cloudframe.app.init1.dto.serialize;

/**
*  The class MessagesSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:53. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MessagesSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MessagesSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MESSAGES_LENGTH = 527;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMessageSeverity;
	
	/**
	* Constructor for MessagesSerialized
	**/
    public MessagesSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MessagesSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MessagesSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MessagesSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,24); // serialize this field at offset 24 by default 
    }
    
	/**
	* sets parent for this MessagesSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 24 by default
    }    
	/**
	* initializes the field in MessagesSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MESSAGES_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMessageSeverity = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
	   /*  end of offset */
	}
     int localMessageSeverityCounter = -1;
     public boolean isMessageSeverityModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMessageSeverityCounter != sharedCounter;
         localMessageSeverityCounter = sharedCounter; return hasModified;
     }
	protected static final int MESSAGE_SEVERITY_LEN = 1;
	/**
	 * 	serialize this MessageSeverity
	 */
   protected void serializeMessageSeverity(char[] messageSeverity) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(messageSeverity,0,getStringValue(),beginMessageSeverity,MESSAGE_SEVERITY_LEN);
       localMessageSeverityCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMessageSeverityConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMessageSeverity is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMessageSeverity() {	 
   		return (substring(getStringValue(),beginMessageSeverity,beginMessageSeverity + MESSAGE_SEVERITY_LEN));
   	}




}
  
