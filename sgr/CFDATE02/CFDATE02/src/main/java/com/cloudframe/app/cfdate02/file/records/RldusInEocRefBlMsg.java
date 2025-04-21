package com.cloudframe.app.cfdate02.file.records;

/**
*  The class RldusInEocRefBlMsg is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RldusInEocRefBlMsg extends RldusInEocRefBlMsgSerialized { 
   

						private char[] rldusBillMessageRec = Field.fillLowValue(161);
	
	/**
	* Constructor for RldusInEocRefBlMsg
	**/
    public RldusInEocRefBlMsg() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for RldusInEocRefBlMsg. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RldusInEocRefBlMsg(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of rldusBillMessageRec
	 *	@return rldusBillMessageRec
	 */
   public char[] getRldusBillMessageRec() throws CFException{
     if (isRldusBillMessageRecModified()) { 
        rldusBillMessageRec = refreshRldusBillMessageRec();
     }
   		return rldusBillMessageRec;
   }

  
	/**
	*  set variable rldusBillMessageRec
	*  Corresponding COBOL Variable is RLDUS-BILL-MESSAGE-REC
	*  @param value
	**/
   public void setRldusBillMessageRec(char[] value) {
      rldusBillMessageRec = checkRldusBillMessageRecConstraints(value);
      serializeRldusBillMessageRec(rldusBillMessageRec);
   } 

     /**
	 * 	Update RldusBillMessageRec 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRldusBillMessageRec(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRldusBillMessageRec,rldusBillMessageRec.length);
   	
   }
   
   public void setRldusBillMessageRec(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRldusBillMessageRec,rldusBillMessageRec.length);
   	
   }
   
     /**
	 * 	Update RldusBillMessageRec 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRldusBillMessageRec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRldusBillMessageRec+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RldusBillMessageRec with another Field
	 *	@param value
	 */
   public void setRldusBillMessageRec(Field source) {
       replace(source,0,source.length(),beginRldusBillMessageRec,RLDUS_BILL_MESSAGE_REC_LEN);
   	
   }  
   
     /**
	 * 	Update RldusBillMessageRec 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRldusBillMessageRec(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRldusBillMessageRec,RLDUS_BILL_MESSAGE_REC_LEN);
   	
   }
   
     /**
	 * 	Update RldusBillMessageRec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRldusBillMessageRec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRldusBillMessageRec+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRldusInEocRefBlMsgFieldLength() {
			return RLDUS_IN_EOC_REF_BL_MSG_LENGTH;
		}

}
  
