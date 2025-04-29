package com.cloudframe.app.sf320010.dto;

/**
*  The class OperMsgArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class OperMsgArea extends OperMsgAreaSerialized {
   

						private char[] msgPos216 = Field.fillLowValue(15);
				private MsgPos216X msgPos216X = new MsgPos216X();
				private MsgPos1722 msgPos1722 = new MsgPos1722();
	
	/**
	* Constructor for OperMsgArea
	**/
    public OperMsgArea() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			msgPos216X.setParent(this,getStartOffset() + 1);
	       			msgPos1722.setParent(this,getStartOffset() + 16);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of msgPos216
	 *	@return msgPos216
	 */
   public char[] getMsgPos216() throws CFException{
     if (isMsgPos216Modified()) { 
        msgPos216 = refreshMsgPos216();
     }
   		return msgPos216;
   }

  
	/**
	*  set variable msgPos216
	*  Corresponding COBOL Variable is WS-MSG-POS-2-16
	*  @param value
	**/
   public void setMsgPos216(char[] value) {
      msgPos216 = checkMsgPos216Constraints(value);
      serializeMsgPos216(msgPos216);
   } 

     /**
	 * 	Update MsgPos216 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsgPos216(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsgPos216,msgPos216.length);
   	
   }
   
   public void setMsgPos216(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsgPos216,msgPos216.length);
   	
   }
   
     /**
	 * 	Update MsgPos216 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsgPos216(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsgPos216+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsgPos216 with another Field
	 *	@param value
	 */
   public void setMsgPos216(Field source) {
       replace(source,0,source.length(),beginMsgPos216,MSG_POS_216_LEN);
   	
   }  
   
     /**
	 * 	Update MsgPos216 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsgPos216(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsgPos216,MSG_POS_216_LEN);
   	
   }
   
     /**
	 * 	Update MsgPos216 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsgPos216(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsgPos216+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msgPos216X
	 *	@return msgPos216X
	 */   
	 public MsgPos216X getMsgPos216X() {
   	return msgPos216X;
   }
   /**
	* 	Update MsgPos216X with the passed value
	*   Corresponding COBOL Variable is WS-MSG-POS-2-16-X
	*	@param value
	*/
   public void setMsgPos216X(char[] value) {
      msgPos216X.setString(value); 
   }   
    
     /**
	 * 	Update MsgPos216X 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMsgPos216X(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msgPos216X.begin,msgPos216X.length());
   }
   
     /**
	 * 	Update MsgPos216X 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsgPos216X(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msgPos216X.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MsgPos216X with another Field
	 *	@param value
	 */
   public void setMsgPos216X(Field source) {
   	replace(source,0,source.length(),msgPos216X.begin,msgPos216X.length());
   }  
   
     /**
	 * 	Update MsgPos216X 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMsgPos216X(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msgPos216X.begin,msgPos216X.length());
   }
   
     /**
	 * 	Update MsgPos216X 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsgPos216X(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msgPos216X.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of msgPos1722
	 *	@return msgPos1722
	 */   
	 public MsgPos1722 getMsgPos1722() {
   	return msgPos1722;
   }
   /**
	* 	Update MsgPos1722 with the passed value
	*   Corresponding COBOL Variable is WS-MSG-POS-17-22
	*	@param value
	*/
   public void setMsgPos1722(char[] value) {
      msgPos1722.setString(value); 
   }   
    
     /**
	 * 	Update MsgPos1722 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMsgPos1722(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msgPos1722.begin,msgPos1722.length());
   }
   
     /**
	 * 	Update MsgPos1722 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsgPos1722(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msgPos1722.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MsgPos1722 with another Field
	 *	@param value
	 */
   public void setMsgPos1722(Field source) {
   	replace(source,0,source.length(),msgPos1722.begin,msgPos1722.length());
   }  
   
     /**
	 * 	Update MsgPos1722 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMsgPos1722(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msgPos1722.begin,msgPos1722.length());
   }
   
     /**
	 * 	Update MsgPos1722 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsgPos1722(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msgPos1722.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getOperMsgAreaFieldLength() {
			return OPER_MSG_AREA_LENGTH;
		}

}
  
