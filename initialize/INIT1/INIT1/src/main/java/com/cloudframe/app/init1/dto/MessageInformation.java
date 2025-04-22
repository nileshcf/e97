package com.cloudframe.app.init1.dto;

/**
*  The class MessageInformation is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:05. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class MessageInformation extends MessageInformationSerialized { 
   

								private short messageInformationLen;

						private char[] messageInformationText = Field.fillLowValue(255);
	
	/**
	* Constructor for MessageInformation
	**/
    public MessageInformation() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MessageInformation. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MessageInformation(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setMessageInformationLen((short)0);
    } 

	/**
	 *	Returns the value of messageInformationLen
	 *	@return messageInformationLen
	 */
	public short getMessageInformationLen() throws CFException {
        if (isMessageInformationLenModified()) { 
           messageInformationLen = refreshMessageInformationLen();
        }
   		return messageInformationLen;
	}
	
	/**
	 * 	Update MessageInformationLen with the passed value
	 *  Corresponding COBOL Variable is MESSAGE-INFORMATION-LEN
	 *	@param number
	 */
	public void setMessageInformationLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    messageInformationLen = checkMessageInformationLenMaxLimit(number); 
		serializeMessageInformationLen(messageInformationLen);
	}

	public void setMessageInformationLen(int number) {
	    number = checkMessageInformationLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMessageInformationLen((short)number);
	}
	public void setMessageInformationLen(long number) {
	    number = checkMessageInformationLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMessageInformationLen((short)number);
	}
	

	/**
	 *	Returns the value of messageInformationText
	 *	@return messageInformationText
	 */
   public char[] getMessageInformationText() throws CFException{
     if (isMessageInformationTextModified()) { 
        messageInformationText = refreshMessageInformationText();
     }
   		return messageInformationText;
   }

  
	/**
	*  set variable messageInformationText
	*  Corresponding COBOL Variable is MESSAGE-INFORMATION-TEXT
	*  @param value
	**/
   public void setMessageInformationText(char[] value) {
      messageInformationText = checkMessageInformationTextConstraints(value);
      serializeMessageInformationText(messageInformationText);
   } 

     /**
	 * 	Update MessageInformationText 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMessageInformationText(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMessageInformationText,messageInformationText.length);
   	
   }
   
   public void setMessageInformationText(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMessageInformationText,messageInformationText.length);
   	
   }
   
     /**
	 * 	Update MessageInformationText 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMessageInformationText(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMessageInformationText+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MessageInformationText with another Field
	 *	@param value
	 */
   public void setMessageInformationText(Field source) {
       replace(source,0,source.length(),beginMessageInformationText,MESSAGE_INFORMATION_TEXT_LEN);
   	
   }  
   
     /**
	 * 	Update MessageInformationText 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMessageInformationText(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMessageInformationText,MESSAGE_INFORMATION_TEXT_LEN);
   	
   }
   
     /**
	 * 	Update MessageInformationText 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMessageInformationText(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMessageInformationText+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes MessageInformation
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setMessageInformationLen((short)0);
         setMessageInformationText(CONSTANTS.SPACE_255);
   }

		public static int getMessageInformationFieldLength() {
			return MESSAGE_INFORMATION_LENGTH;
		}

}
  
