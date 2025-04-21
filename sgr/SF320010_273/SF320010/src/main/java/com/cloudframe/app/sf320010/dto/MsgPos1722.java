package com.cloudframe.app.sf320010.dto;

/**
*  The class MsgPos1722 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MsgPos1722 extends MsgPos1722Serialized { 
   

						private char[] msgPos17 = Field.fillLowValue(1);
	
	/**
	* Constructor for MsgPos1722
	**/
    public MsgPos1722() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MsgPos1722. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsgPos1722(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of msgPos17
	 *	@return msgPos17
	 */
   public char[] getMsgPos17() throws CFException{
     if (isMsgPos17Modified()) { 
        msgPos17 = refreshMsgPos17();
     }
   		return msgPos17;
   }

  
	/**
	*  set variable msgPos17
	*  Corresponding COBOL Variable is WS-MSG-POS-17
	*  @param value
	**/
   public void setMsgPos17(char[] value) {
      msgPos17 = checkMsgPos17Constraints(value);
      serializeMsgPos17(msgPos17);
   } 

     /**
	 * 	Update MsgPos17 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsgPos17(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsgPos17,msgPos17.length);
   	
   }
   
   public void setMsgPos17(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsgPos17,msgPos17.length);
   	
   }
   
     /**
	 * 	Update MsgPos17 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsgPos17(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsgPos17+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsgPos17 with another Field
	 *	@param value
	 */
   public void setMsgPos17(Field source) {
       replace(source,0,source.length(),beginMsgPos17,MSG_POS_17_LEN);
   	
   }  
   
     /**
	 * 	Update MsgPos17 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsgPos17(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsgPos17,MSG_POS_17_LEN);
   	
   }
   
     /**
	 * 	Update MsgPos17 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsgPos17(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsgPos17+targetIndex,targetLen);
    
   }

	
	
	

		public static int getMsgPos1722FieldLength() {
			return MSG_POS_1722_LENGTH;
		}

}
  
