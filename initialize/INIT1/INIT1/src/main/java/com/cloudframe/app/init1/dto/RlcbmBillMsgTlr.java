package com.cloudframe.app.init1.dto;

/**
*  The class RlcbmBillMsgTlr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:52. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RlcbmBillMsgTlr extends RlcbmBillMsgTlrSerialized { 
   

						private char[] rlcbmFiller = Field.fillLowValue(123);
	
	/**
	* Constructor for RlcbmBillMsgTlr
	**/
    public RlcbmBillMsgTlr() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for RlcbmBillMsgTlr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlcbmBillMsgTlr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of rlcbmFiller
	 *	@return rlcbmFiller
	 */
   public char[] getRlcbmFiller() throws CFException{
     if (isRlcbmFillerModified()) { 
        rlcbmFiller = refreshRlcbmFiller();
     }
   		return rlcbmFiller;
   }

  
	/**
	*  set variable rlcbmFiller
	*  Corresponding COBOL Variable is RLCBM-FILLER
	*  @param value
	**/
   public void setRlcbmFiller(char[] value) {
      rlcbmFiller = checkRlcbmFillerConstraints(value);
      serializeRlcbmFiller(rlcbmFiller);
   } 

     /**
	 * 	Update RlcbmFiller 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlcbmFiller(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlcbmFiller,rlcbmFiller.length);
   	
   }
   
   public void setRlcbmFiller(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlcbmFiller,rlcbmFiller.length);
   	
   }
   
     /**
	 * 	Update RlcbmFiller 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlcbmFiller(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlcbmFiller+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RlcbmFiller with another Field
	 *	@param value
	 */
   public void setRlcbmFiller(Field source) {
       replace(source,0,source.length(),beginRlcbmFiller,RLCBM_FILLER_LEN);
   	
   }  
   
     /**
	 * 	Update RlcbmFiller 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlcbmFiller(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlcbmFiller,RLCBM_FILLER_LEN);
   	
   }
   
     /**
	 * 	Update RlcbmFiller 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlcbmFiller(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlcbmFiller+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRlcbmBillMsgTlrFieldLength() {
			return RLCBM_BILL_MSG_TLR_LENGTH;
		}

}
  
