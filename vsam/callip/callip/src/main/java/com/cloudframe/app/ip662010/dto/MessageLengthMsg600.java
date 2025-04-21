package com.cloudframe.app.ip662010.dto;

/**
*  The class MessageLengthMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:01. using version 5.0.0.256
**/


import com.cloudframe.app.ip662010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MessageLengthMsg600 extends MessageLengthMsg600Serialized {
   


						private char[] messageLengthErrCode600 = Field.fillLowValue(5);


								private char[] messageLength600 = Field.fillLowValue(6);
	
	/**
	* Constructor for MessageLengthMsg600
	**/
    public MessageLengthMsg600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("IP662010-").toCharArray()
             , getStartOffset() + 0
             ,9
             );
       replaceValue( // serialize and save the value
             ("-RECORD LENGTH = ").toCharArray()
             , getStartOffset() + 14
             ,17
             );
    }


 

	/**
	 *	Returns the value of messageLengthErrCode600
	 *	@return messageLengthErrCode600
	 */
   public char[] getMessageLengthErrCode600() throws CFException{
     if (isMessageLengthErrCode600Modified()) { 
        messageLengthErrCode600 = refreshMessageLengthErrCode600();
     }
   		return messageLengthErrCode600;
   }

  
	/**
	*  set variable messageLengthErrCode600
	*  Corresponding COBOL Variable is 600-MESSAGE-LENGTH-ERR-CODE
	*  @param value
	**/
   public void setMessageLengthErrCode600(char[] value) {
      messageLengthErrCode600 = checkMessageLengthErrCode600Constraints(value);
      serializeMessageLengthErrCode600(messageLengthErrCode600);
   } 

     /**
	 * 	Update MessageLengthErrCode600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMessageLengthErrCode600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMessageLengthErrCode600,messageLengthErrCode600.length);
   	
   }
   
   public void setMessageLengthErrCode600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMessageLengthErrCode600,messageLengthErrCode600.length);
   	
   }
   
     /**
	 * 	Update MessageLengthErrCode600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMessageLengthErrCode600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMessageLengthErrCode600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MessageLengthErrCode600 with another Field
	 *	@param value
	 */
   public void setMessageLengthErrCode600(Field source) {
       replace(source,0,source.length(),beginMessageLengthErrCode600,MESSAGE_LENGTH_ERR_CODE_600_LEN);
   	
   }  
   
     /**
	 * 	Update MessageLengthErrCode600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMessageLengthErrCode600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMessageLengthErrCode600,MESSAGE_LENGTH_ERR_CODE_600_LEN);
   	
   }
   
     /**
	 * 	Update MessageLengthErrCode600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMessageLengthErrCode600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMessageLengthErrCode600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of messageLength600
	 *	@return messageLength600
	 */
   public char[] getMessageLength600() throws CFException{
     if (isMessageLength600Modified()) { 
        messageLength600 = refreshMessageLength600();
     }
   		return messageLength600;
   }

  
	/**
	*  set variable messageLength600
	*  Corresponding COBOL Variable is 600-MESSAGE-LENGTH
	*  @param value
	**/
   public void setMessageLength600(char[] value) {
      messageLength600 = checkMessageLength600Constraints(value);
      serializeMessageLength600(messageLength600);
   } 

     /**
	 * 	Update MessageLength600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMessageLength600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMessageLength600,messageLength600.length);
   	
   }
   
   public void setMessageLength600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMessageLength600,messageLength600.length);
   	
   }
   
     /**
	 * 	Update MessageLength600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMessageLength600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMessageLength600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MessageLength600 with another Field
	 *	@param value
	 */
   public void setMessageLength600(Field source) {
       replace(source,0,source.length(),beginMessageLength600,MESSAGE_LENGTH_600_LEN);
   	
   }  
   
     /**
	 * 	Update MessageLength600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMessageLength600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMessageLength600,MESSAGE_LENGTH_600_LEN);
   	
   }
   
     /**
	 * 	Update MessageLength600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMessageLength600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMessageLength600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getMessageLengthMsg600FieldLength() {
			return MESSAGE_LENGTH_MSG_600_LENGTH;
		}

}
  
