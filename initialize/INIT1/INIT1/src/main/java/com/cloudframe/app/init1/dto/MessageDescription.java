package com.cloudframe.app.init1.dto;

/**
*  The class MessageDescription is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:05. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class MessageDescription extends MessageDescriptionSerialized { 
   

								private short messageDescriptionLen;

						private char[] messageDescriptionText = Field.fillLowValue(255);
	
	/**
	* Constructor for MessageDescription
	**/
    public MessageDescription() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MessageDescription. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MessageDescription(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setMessageDescriptionLen((short)0);
    } 

	/**
	 *	Returns the value of messageDescriptionLen
	 *	@return messageDescriptionLen
	 */
	public short getMessageDescriptionLen() throws CFException {
        if (isMessageDescriptionLenModified()) { 
           messageDescriptionLen = refreshMessageDescriptionLen();
        }
   		return messageDescriptionLen;
	}
	
	/**
	 * 	Update MessageDescriptionLen with the passed value
	 *  Corresponding COBOL Variable is MESSAGE-DESCRIPTION-LEN
	 *	@param number
	 */
	public void setMessageDescriptionLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    messageDescriptionLen = checkMessageDescriptionLenMaxLimit(number); 
		serializeMessageDescriptionLen(messageDescriptionLen);
	}

	public void setMessageDescriptionLen(int number) {
	    number = checkMessageDescriptionLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMessageDescriptionLen((short)number);
	}
	public void setMessageDescriptionLen(long number) {
	    number = checkMessageDescriptionLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMessageDescriptionLen((short)number);
	}
	

	/**
	 *	Returns the value of messageDescriptionText
	 *	@return messageDescriptionText
	 */
   public char[] getMessageDescriptionText() throws CFException{
     if (isMessageDescriptionTextModified()) { 
        messageDescriptionText = refreshMessageDescriptionText();
     }
   		return messageDescriptionText;
   }

  
	/**
	*  set variable messageDescriptionText
	*  Corresponding COBOL Variable is MESSAGE-DESCRIPTION-TEXT
	*  @param value
	**/
   public void setMessageDescriptionText(char[] value) {
      messageDescriptionText = checkMessageDescriptionTextConstraints(value);
      serializeMessageDescriptionText(messageDescriptionText);
   } 

     /**
	 * 	Update MessageDescriptionText 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMessageDescriptionText(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMessageDescriptionText,messageDescriptionText.length);
   	
   }
   
   public void setMessageDescriptionText(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMessageDescriptionText,messageDescriptionText.length);
   	
   }
   
     /**
	 * 	Update MessageDescriptionText 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMessageDescriptionText(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMessageDescriptionText+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MessageDescriptionText with another Field
	 *	@param value
	 */
   public void setMessageDescriptionText(Field source) {
       replace(source,0,source.length(),beginMessageDescriptionText,MESSAGE_DESCRIPTION_TEXT_LEN);
   	
   }  
   
     /**
	 * 	Update MessageDescriptionText 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMessageDescriptionText(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMessageDescriptionText,MESSAGE_DESCRIPTION_TEXT_LEN);
   	
   }
   
     /**
	 * 	Update MessageDescriptionText 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMessageDescriptionText(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMessageDescriptionText+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes MessageDescription
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setMessageDescriptionLen((short)0);
         setMessageDescriptionText(CONSTANTS.SPACE_255);
   }

		public static int getMessageDescriptionFieldLength() {
			return MESSAGE_DESCRIPTION_LENGTH;
		}

}
  
