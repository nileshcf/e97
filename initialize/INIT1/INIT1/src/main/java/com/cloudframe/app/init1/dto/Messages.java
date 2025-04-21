package com.cloudframe.app.init1.dto;

/**
*  The class Messages is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:59. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Messages extends MessagesSerialized { 
   

						private char[] messageSeverity = Field.fillLowValue(1);
				private MessageCode messageCode = new MessageCode();
				private MessageInformation messageInformation = new MessageInformation();
				private MessageDescription messageDescription = new MessageDescription();
	
	/**
	* Constructor for Messages
	**/
    public Messages() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Messages. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Messages(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			messageCode.setParent(this,getStartOffset() + 1);
	       			messageInformation.setParent(this,getStartOffset() + 13);
	       			messageDescription.setParent(this,getStartOffset() + 270);
    } 

	/**
	 *	Returns the value of messageSeverity
	 *	@return messageSeverity
	 */
   public char[] getMessageSeverity() throws CFException{
     if (isMessageSeverityModified()) { 
        messageSeverity = refreshMessageSeverity();
     }
   		return messageSeverity;
   }

  
	/**
	*  set variable messageSeverity
	*  Corresponding COBOL Variable is MESSAGE-SEVERITY
	*  @param value
	**/
   public void setMessageSeverity(char[] value) {
      messageSeverity = checkMessageSeverityConstraints(value);
      serializeMessageSeverity(messageSeverity);
   } 

     /**
	 * 	Update MessageSeverity 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMessageSeverity(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMessageSeverity,messageSeverity.length);
   	
   }
   
   public void setMessageSeverity(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMessageSeverity,messageSeverity.length);
   	
   }
   
     /**
	 * 	Update MessageSeverity 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMessageSeverity(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMessageSeverity+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MessageSeverity with another Field
	 *	@param value
	 */
   public void setMessageSeverity(Field source) {
       replace(source,0,source.length(),beginMessageSeverity,MESSAGE_SEVERITY_LEN);
   	
   }  
   
     /**
	 * 	Update MessageSeverity 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMessageSeverity(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMessageSeverity,MESSAGE_SEVERITY_LEN);
   	
   }
   
     /**
	 * 	Update MessageSeverity 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMessageSeverity(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMessageSeverity+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of messageCode
	 *	@return messageCode
	 */   
	 public MessageCode getMessageCode() {
   	return messageCode;
   }
   /**
	* 	Update MessageCode with the passed value
	*   Corresponding COBOL Variable is MESSAGE-CODE
	*	@param value
	*/
   public void setMessageCode(char[] value) {
      messageCode.setString(value); 
   }   
    
     /**
	 * 	Update MessageCode 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMessageCode(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,messageCode.begin,messageCode.length());
   }
   
     /**
	 * 	Update MessageCode 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMessageCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,messageCode.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MessageCode with another Field
	 *	@param value
	 */
   public void setMessageCode(Field source) {
   	replace(source,0,source.length(),messageCode.begin,messageCode.length());
   }  
   
     /**
	 * 	Update MessageCode 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMessageCode(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,messageCode.begin,messageCode.length());
   }
   
     /**
	 * 	Update MessageCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMessageCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,messageCode.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of messageInformation
	 *	@return messageInformation
	 */   
	 public MessageInformation getMessageInformation() {
   	return messageInformation;
   }
   /**
	* 	Update MessageInformation with the passed value
	*   Corresponding COBOL Variable is MESSAGE-INFORMATION
	*	@param value
	*/
   public void setMessageInformation(char[] value) {
      messageInformation.setString(value); 
   }   
    
     /**
	 * 	Update MessageInformation 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMessageInformation(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,messageInformation.begin,messageInformation.length());
   }
   
     /**
	 * 	Update MessageInformation 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMessageInformation(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,messageInformation.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MessageInformation with another Field
	 *	@param value
	 */
   public void setMessageInformation(Field source) {
   	replace(source,0,source.length(),messageInformation.begin,messageInformation.length());
   }  
   
     /**
	 * 	Update MessageInformation 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMessageInformation(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,messageInformation.begin,messageInformation.length());
   }
   
     /**
	 * 	Update MessageInformation 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMessageInformation(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,messageInformation.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of messageDescription
	 *	@return messageDescription
	 */   
	 public MessageDescription getMessageDescription() {
   	return messageDescription;
   }
   /**
	* 	Update MessageDescription with the passed value
	*   Corresponding COBOL Variable is MESSAGE-DESCRIPTION
	*	@param value
	*/
   public void setMessageDescription(char[] value) {
      messageDescription.setString(value); 
   }   
    
     /**
	 * 	Update MessageDescription 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMessageDescription(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,messageDescription.begin,messageDescription.length());
   }
   
     /**
	 * 	Update MessageDescription 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMessageDescription(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,messageDescription.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MessageDescription with another Field
	 *	@param value
	 */
   public void setMessageDescription(Field source) {
   	replace(source,0,source.length(),messageDescription.begin,messageDescription.length());
   }  
   
     /**
	 * 	Update MessageDescription 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMessageDescription(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,messageDescription.begin,messageDescription.length());
   }
   
     /**
	 * 	Update MessageDescription 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMessageDescription(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,messageDescription.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Messages
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setMessageSeverity(CONSTANTS.SPACE);
          messageCode.initialize();
     
          messageInformation.initialize();
     
          messageDescription.initialize();
     
   }

		public static int getMessagesFieldLength() {
			return MESSAGES_LENGTH;
		}

}
  
