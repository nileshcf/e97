package com.cloudframe.app.init1.dto;

/**
*  The class MessageCode is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class MessageCode extends MessageCodeSerialized { 
   

								private short messageCodeLen;

						private char[] messageCodeText = Field.fillLowValue(10);
	
	/**
	* Constructor for MessageCode
	**/
    public MessageCode() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MessageCode. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MessageCode(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setMessageCodeLen((short)0);
    } 

	/**
	 *	Returns the value of messageCodeLen
	 *	@return messageCodeLen
	 */
	public short getMessageCodeLen() throws CFException {
        if (isMessageCodeLenModified()) { 
           messageCodeLen = refreshMessageCodeLen();
        }
   		return messageCodeLen;
	}
	
	/**
	 * 	Update MessageCodeLen with the passed value
	 *  Corresponding COBOL Variable is MESSAGE-CODE-LEN
	 *	@param number
	 */
	public void setMessageCodeLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    messageCodeLen = checkMessageCodeLenMaxLimit(number); 
		serializeMessageCodeLen(messageCodeLen);
	}

	public void setMessageCodeLen(int number) {
	    number = checkMessageCodeLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMessageCodeLen((short)number);
	}
	public void setMessageCodeLen(long number) {
	    number = checkMessageCodeLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMessageCodeLen((short)number);
	}
	

	/**
	 *	Returns the value of messageCodeText
	 *	@return messageCodeText
	 */
   public char[] getMessageCodeText() throws CFException{
     if (isMessageCodeTextModified()) { 
        messageCodeText = refreshMessageCodeText();
     }
   		return messageCodeText;
   }

  
	/**
	*  set variable messageCodeText
	*  Corresponding COBOL Variable is MESSAGE-CODE-TEXT
	*  @param value
	**/
   public void setMessageCodeText(char[] value) {
      messageCodeText = checkMessageCodeTextConstraints(value);
      serializeMessageCodeText(messageCodeText);
   } 

     /**
	 * 	Update MessageCodeText 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMessageCodeText(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMessageCodeText,messageCodeText.length);
   	
   }
   
   public void setMessageCodeText(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMessageCodeText,messageCodeText.length);
   	
   }
   
     /**
	 * 	Update MessageCodeText 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMessageCodeText(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMessageCodeText+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MessageCodeText with another Field
	 *	@param value
	 */
   public void setMessageCodeText(Field source) {
       replace(source,0,source.length(),beginMessageCodeText,MESSAGE_CODE_TEXT_LEN);
   	
   }  
   
     /**
	 * 	Update MessageCodeText 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMessageCodeText(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMessageCodeText,MESSAGE_CODE_TEXT_LEN);
   	
   }
   
     /**
	 * 	Update MessageCodeText 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMessageCodeText(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMessageCodeText+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes MessageCode
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setMessageCodeLen((short)0);
         setMessageCodeText(CONSTANTS.SPACE_10);
   }

		public static int getMessageCodeFieldLength() {
			return MESSAGE_CODE_LENGTH;
		}

}
  
