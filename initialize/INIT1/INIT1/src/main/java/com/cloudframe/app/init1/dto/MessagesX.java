package com.cloudframe.app.init1.dto;

/**
*  The class MessagesX is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class MessagesX extends MessagesXSerialized { 
   
			private List<Messages> messages = new ArrayList<>();
    	
	
	/**
	* Constructor for MessagesX
	**/
    public MessagesX() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MessagesX. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MessagesX(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of messages
	 *  Corresponding COBOL Variable is MESSAGES
	 *	@return messages
	 */
   public List<Messages> getMessages() {
       return messages;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return messages
	 */
	public Messages getMessages(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getMessages(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= MESSAGES_SIZE) {
             	index = MESSAGES_SIZE -1; // can't exceed max array size
             	logger.trace("messages - Array index exceeded max Size {}, resetting it to max allowed",MESSAGES_SIZE); 
	    }
		if (index >= messages.size()) {
       		for (int fillIndex =  messages.size() -1; fillIndex < index;fillIndex++) {
		       messages.add(null);
		    }
			messages.set(index,
			   	   	new Messages(this,beginMessages + index * Messages.getMessagesFieldLength()) 
				                        ); 	
		} 
   	   Messages value = messages.get(index);
   	   if (value == null) {
   	      messages.set(index,
			   	   	new Messages(this,beginMessages + index * Messages.getMessagesFieldLength()) 
				                        ); 
		  value = messages.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Messages at index with the passed value
	 *  Corresponding COBOL Variable is MESSAGES
	 *  @param index
	 *	@param value
	 */
  public void setMessages(int index,char[] value) {
   	getMessages(index).setString(value);
   }
   
	

	
	
	

		public static int getMessagesXFieldLength() {
			return MESSAGES_X_LENGTH;
		}

}
  
