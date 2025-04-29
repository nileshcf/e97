package com.cloudframe.app.sf320010.dto;

/**
*  The class Sf503OpOperatorTranLog is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf503OpOperatorTranLog extends Sf503OpOperatorTranLogSerialized { 
   

						private char[] sf503OpRecordType = Field.fillLowValue(1);

						private char[] sf503OpMsgHdr = Field.fillLowValue(8);

						private char[] sf503OpOperatorMessage = Field.fillLowValue(85);
	
	/**
	* Constructor for Sf503OpOperatorTranLog
	**/
    public Sf503OpOperatorTranLog() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf503OpOperatorTranLog. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503OpOperatorTranLog(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sf503OpRecordType
	 *	@return sf503OpRecordType
	 */
   public char[] getSf503OpRecordType() throws CFException{
     if (isSf503OpRecordTypeModified()) { 
        sf503OpRecordType = refreshSf503OpRecordType();
     }
   		return sf503OpRecordType;
   }

  
	/**
	*  set variable sf503OpRecordType
	*  Corresponding COBOL Variable is SF503-OP-RECORD-TYPE
	*  @param value
	**/
   public void setSf503OpRecordType(char[] value) {
      sf503OpRecordType = checkSf503OpRecordTypeConstraints(value);
      serializeSf503OpRecordType(sf503OpRecordType);
   } 

     /**
	 * 	Update Sf503OpRecordType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503OpRecordType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503OpRecordType,sf503OpRecordType.length);
   	
   }
   
   public void setSf503OpRecordType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503OpRecordType,sf503OpRecordType.length);
   	
   }
   
     /**
	 * 	Update Sf503OpRecordType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503OpRecordType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503OpRecordType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503OpRecordType with another Field
	 *	@param value
	 */
   public void setSf503OpRecordType(Field source) {
       replace(source,0,source.length(),beginSf503OpRecordType,SF_503_OP_RECORD_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503OpRecordType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503OpRecordType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503OpRecordType,SF_503_OP_RECORD_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Sf503OpRecordType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503OpRecordType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503OpRecordType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf503OpMsgHdr
	 *	@return sf503OpMsgHdr
	 */
   public char[] getSf503OpMsgHdr() throws CFException{
     if (isSf503OpMsgHdrModified()) { 
        sf503OpMsgHdr = refreshSf503OpMsgHdr();
     }
   		return sf503OpMsgHdr;
   }

  
	/**
	*  set variable sf503OpMsgHdr
	*  Corresponding COBOL Variable is SF503-OP-MSG-HDR
	*  @param value
	**/
   public void setSf503OpMsgHdr(char[] value) {
      sf503OpMsgHdr = checkSf503OpMsgHdrConstraints(value);
      serializeSf503OpMsgHdr(sf503OpMsgHdr);
   } 

     /**
	 * 	Update Sf503OpMsgHdr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503OpMsgHdr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503OpMsgHdr,sf503OpMsgHdr.length);
   	
   }
   
   public void setSf503OpMsgHdr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503OpMsgHdr,sf503OpMsgHdr.length);
   	
   }
   
     /**
	 * 	Update Sf503OpMsgHdr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503OpMsgHdr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503OpMsgHdr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503OpMsgHdr with another Field
	 *	@param value
	 */
   public void setSf503OpMsgHdr(Field source) {
       replace(source,0,source.length(),beginSf503OpMsgHdr,SF_503_OP_MSG_HDR_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503OpMsgHdr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503OpMsgHdr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503OpMsgHdr,SF_503_OP_MSG_HDR_LEN);
   	
   }
   
     /**
	 * 	Update Sf503OpMsgHdr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503OpMsgHdr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503OpMsgHdr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf503OpOperatorMessage
	 *	@return sf503OpOperatorMessage
	 */
   public char[] getSf503OpOperatorMessage() throws CFException{
     if (isSf503OpOperatorMessageModified()) { 
        sf503OpOperatorMessage = refreshSf503OpOperatorMessage();
     }
   		return sf503OpOperatorMessage;
   }

  
	/**
	*  set variable sf503OpOperatorMessage
	*  Corresponding COBOL Variable is SF503-OP-OPERATOR-MESSAGE
	*  @param value
	**/
   public void setSf503OpOperatorMessage(char[] value) {
      sf503OpOperatorMessage = checkSf503OpOperatorMessageConstraints(value);
      serializeSf503OpOperatorMessage(sf503OpOperatorMessage);
   } 

     /**
	 * 	Update Sf503OpOperatorMessage 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503OpOperatorMessage(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503OpOperatorMessage,sf503OpOperatorMessage.length);
   	
   }
   
   public void setSf503OpOperatorMessage(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503OpOperatorMessage,sf503OpOperatorMessage.length);
   	
   }
   
     /**
	 * 	Update Sf503OpOperatorMessage 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503OpOperatorMessage(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503OpOperatorMessage+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503OpOperatorMessage with another Field
	 *	@param value
	 */
   public void setSf503OpOperatorMessage(Field source) {
       replace(source,0,source.length(),beginSf503OpOperatorMessage,SF_503_OP_OPERATOR_MESSAGE_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503OpOperatorMessage 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503OpOperatorMessage(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503OpOperatorMessage,SF_503_OP_OPERATOR_MESSAGE_LEN);
   	
   }
   
     /**
	 * 	Update Sf503OpOperatorMessage 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503OpOperatorMessage(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503OpOperatorMessage+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSf503OpOperatorTranLogFieldLength() {
			return SF_503_OP_OPERATOR_TRAN_LOG_LENGTH;
		}

}
  
