package com.cloudframe.app.ar640010.dto;

/**
*  The class MsgErr240 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MsgErr240 extends MsgErr240Serialized { 
   

						private char[] msgErrDesc240 = Field.fillLowValue(80);
	
	/**
	* Constructor for MsgErr240
	**/
    public MsgErr240() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MsgErr240. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsgErr240(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of msgErrDesc240
	 *	@return msgErrDesc240
	 */
   public char[] getMsgErrDesc240() throws CFException{
     if (isMsgErrDesc240Modified()) { 
        msgErrDesc240 = refreshMsgErrDesc240();
     }
   		return msgErrDesc240;
   }

  
	/**
	*  set variable msgErrDesc240
	*  Corresponding COBOL Variable is 240-MSG-ERR-DESC
	*  @param value
	**/
   public void setMsgErrDesc240(char[] value) {
      msgErrDesc240 = checkMsgErrDesc240Constraints(value);
      serializeMsgErrDesc240(msgErrDesc240);
   } 

     /**
	 * 	Update MsgErrDesc240 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsgErrDesc240(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsgErrDesc240,msgErrDesc240.length);
   	
   }
   
   public void setMsgErrDesc240(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsgErrDesc240,msgErrDesc240.length);
   	
   }
   
     /**
	 * 	Update MsgErrDesc240 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsgErrDesc240(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsgErrDesc240+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsgErrDesc240 with another Field
	 *	@param value
	 */
   public void setMsgErrDesc240(Field source) {
       replace(source,0,source.length(),beginMsgErrDesc240,MSG_ERR_DESC_240_LEN);
   	
   }  
   
     /**
	 * 	Update MsgErrDesc240 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsgErrDesc240(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsgErrDesc240,MSG_ERR_DESC_240_LEN);
   	
   }
   
     /**
	 * 	Update MsgErrDesc240 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsgErrDesc240(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsgErrDesc240+targetIndex,targetLen);
    
   }

	
	
	

		public static int getMsgErr240FieldLength() {
			return MSG_ERR_240_LENGTH;
		}

}
  
