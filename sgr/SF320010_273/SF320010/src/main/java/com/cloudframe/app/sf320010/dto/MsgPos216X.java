package com.cloudframe.app.sf320010.dto;

/**
*  The class MsgPos216X is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:08. using version 5.0.0.256
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MsgPos216X extends MsgPos216XSerialized { 
   

						private char[] msgPos25 = Field.fillLowValue(4);
	
	/**
	* Constructor for MsgPos216X
	**/
    public MsgPos216X() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MsgPos216X. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsgPos216X(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of msgPos25
	 *	@return msgPos25
	 */
   public char[] getMsgPos25() throws CFException{
     if (isMsgPos25Modified()) { 
        msgPos25 = refreshMsgPos25();
     }
   		return msgPos25;
   }

  
	/**
	*  set variable msgPos25
	*  Corresponding COBOL Variable is WS-MSG-POS-2-5
	*  @param value
	**/
   public void setMsgPos25(char[] value) {
      msgPos25 = checkMsgPos25Constraints(value);
      serializeMsgPos25(msgPos25);
   } 

     /**
	 * 	Update MsgPos25 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsgPos25(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsgPos25,msgPos25.length);
   	
   }
   
   public void setMsgPos25(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsgPos25,msgPos25.length);
   	
   }
   
     /**
	 * 	Update MsgPos25 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsgPos25(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsgPos25+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsgPos25 with another Field
	 *	@param value
	 */
   public void setMsgPos25(Field source) {
       replace(source,0,source.length(),beginMsgPos25,MSG_POS_25_LEN);
   	
   }  
   
     /**
	 * 	Update MsgPos25 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsgPos25(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsgPos25,MSG_POS_25_LEN);
   	
   }
   
     /**
	 * 	Update MsgPos25 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsgPos25(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsgPos25+targetIndex,targetLen);
    
   }

	
	
	

		public static int getMsgPos216XFieldLength() {
			return MSG_POS_216_X_LENGTH;
		}

}
  
