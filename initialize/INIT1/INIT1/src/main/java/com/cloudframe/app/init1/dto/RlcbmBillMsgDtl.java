package com.cloudframe.app.init1.dto;

/**
*  The class RlcbmBillMsgDtl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RlcbmBillMsgDtl extends RlcbmBillMsgDtlSerialized { 
   
				private RlcbmBillMessageRec rlcbmBillMessageRec = new RlcbmBillMessageRec();
	
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
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			rlcbmBillMessageRec.setParent(this,getStartOffset() + 1);
    } 

	/**
	 *	Returns the value of rlcbmBillMessageRec
	 *	@return rlcbmBillMessageRec
	 */   
	 public RlcbmBillMessageRec getRlcbmBillMessageRec() {
   	return rlcbmBillMessageRec;
   }
   /**
	* 	Update RlcbmBillMessageRec with the passed value
	*   Corresponding COBOL Variable is RLCBM-BILL-MESSAGE-REC
	*	@param value
	*/
   public void setRlcbmBillMessageRec(char[] value) {
      rlcbmBillMessageRec.setString(value); 
   }   
    
     /**
	 * 	Update RlcbmBillMessageRec 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRlcbmBillMessageRec(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlcbmBillMessageRec.begin,rlcbmBillMessageRec.length());
   }
   
     /**
	 * 	Update RlcbmBillMessageRec 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlcbmBillMessageRec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlcbmBillMessageRec.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update RlcbmBillMessageRec with another Field
	 *	@param value
	 */
   public void setRlcbmBillMessageRec(Field source) {
   	replace(source,0,source.length(),rlcbmBillMessageRec.begin,rlcbmBillMessageRec.length());
   }  
   
     /**
	 * 	Update RlcbmBillMessageRec 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRlcbmBillMessageRec(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlcbmBillMessageRec.begin,rlcbmBillMessageRec.length());
   }
   
     /**
	 * 	Update RlcbmBillMessageRec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlcbmBillMessageRec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlcbmBillMessageRec.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getRlcbmBillMsgDtlFieldLength() {
			return RLCBM_BILL_MSG_DTL_LENGTH;
		}

}
  
