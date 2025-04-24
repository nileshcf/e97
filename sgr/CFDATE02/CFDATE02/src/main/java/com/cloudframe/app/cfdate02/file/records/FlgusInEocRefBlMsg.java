package com.cloudframe.app.cfdate02.file.records;

/**
*  The class FlgusInEocRefBlMsg is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:43. using version 5.0.0.254
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FlgusInEocRefBlMsg extends FlgusInEocRefBlMsgSerialized { 
   

						private char[] flgusBillMessageRec = Field.fillLowValue(161);
	
	/**
	* Constructor for FlgusInEocRefBlMsg
	**/
    public FlgusInEocRefBlMsg() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for FlgusInEocRefBlMsg. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FlgusInEocRefBlMsg(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of flgusBillMessageRec
	 *	@return flgusBillMessageRec
	 */
   public char[] getFlgusBillMessageRec() throws CFException{
     if (isFlgusBillMessageRecModified()) { 
        flgusBillMessageRec = refreshFlgusBillMessageRec();
     }
   		return flgusBillMessageRec;
   }

  
	/**
	*  set variable flgusBillMessageRec
	*  Corresponding COBOL Variable is FLGUS-BILL-MESSAGE-REC
	*  @param value
	**/
   public void setFlgusBillMessageRec(char[] value) {
      flgusBillMessageRec = checkFlgusBillMessageRecConstraints(value);
      serializeFlgusBillMessageRec(flgusBillMessageRec);
   } 

     /**
	 * 	Update FlgusBillMessageRec 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFlgusBillMessageRec(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFlgusBillMessageRec,flgusBillMessageRec.length);
   	
   }
   
   public void setFlgusBillMessageRec(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFlgusBillMessageRec,flgusBillMessageRec.length);
   	
   }
   
     /**
	 * 	Update FlgusBillMessageRec 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFlgusBillMessageRec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFlgusBillMessageRec+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FlgusBillMessageRec with another Field
	 *	@param value
	 */
   public void setFlgusBillMessageRec(Field source) {
       replace(source,0,source.length(),beginFlgusBillMessageRec,FLGUS_BILL_MESSAGE_REC_LEN);
   	
   }  
   
     /**
	 * 	Update FlgusBillMessageRec 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFlgusBillMessageRec(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFlgusBillMessageRec,FLGUS_BILL_MESSAGE_REC_LEN);
   	
   }
   
     /**
	 * 	Update FlgusBillMessageRec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFlgusBillMessageRec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFlgusBillMessageRec+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFlgusInEocRefBlMsgFieldLength() {
			return FLGUS_IN_EOC_REF_BL_MSG_LENGTH;
		}

}
  
