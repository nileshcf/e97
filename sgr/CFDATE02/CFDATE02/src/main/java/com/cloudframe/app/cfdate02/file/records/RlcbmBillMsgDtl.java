package com.cloudframe.app.cfdate02.file.records;

/**
*  The class RlcbmBillMsgDtl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:43. using version 5.0.0.254
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RlcbmBillMsgDtl extends RlcbmBillMsgDtlSerialized { 
   

						private char[] rlcbmBillMessageRec = Field.fillLowValue(161);
	
	/**
	* Constructor for RlcbmBillMsgDtl
	**/
    public RlcbmBillMsgDtl() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for RlcbmBillMsgDtl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlcbmBillMsgDtl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of rlcbmBillMessageRec
	 *	@return rlcbmBillMessageRec
	 */
   public char[] getRlcbmBillMessageRec() throws CFException{
     if (isRlcbmBillMessageRecModified()) { 
        rlcbmBillMessageRec = refreshRlcbmBillMessageRec();
     }
   		return rlcbmBillMessageRec;
   }

  
	/**
	*  set variable rlcbmBillMessageRec
	*  Corresponding COBOL Variable is RLCBM-BILL-MESSAGE-REC
	*  @param value
	**/
   public void setRlcbmBillMessageRec(char[] value) {
      rlcbmBillMessageRec = checkRlcbmBillMessageRecConstraints(value);
      serializeRlcbmBillMessageRec(rlcbmBillMessageRec);
   } 

     /**
	 * 	Update RlcbmBillMessageRec 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlcbmBillMessageRec(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlcbmBillMessageRec,rlcbmBillMessageRec.length);
   	
   }
   
   public void setRlcbmBillMessageRec(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlcbmBillMessageRec,rlcbmBillMessageRec.length);
   	
   }
   
     /**
	 * 	Update RlcbmBillMessageRec 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlcbmBillMessageRec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlcbmBillMessageRec+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RlcbmBillMessageRec with another Field
	 *	@param value
	 */
   public void setRlcbmBillMessageRec(Field source) {
       replace(source,0,source.length(),beginRlcbmBillMessageRec,RLCBM_BILL_MESSAGE_REC_LEN);
   	
   }  
   
     /**
	 * 	Update RlcbmBillMessageRec 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlcbmBillMessageRec(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlcbmBillMessageRec,RLCBM_BILL_MESSAGE_REC_LEN);
   	
   }
   
     /**
	 * 	Update RlcbmBillMessageRec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlcbmBillMessageRec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlcbmBillMessageRec+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRlcbmBillMsgDtlFieldLength() {
			return RLCBM_BILL_MSG_DTL_LENGTH;
		}

}
  
