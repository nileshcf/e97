package com.cloudframe.app.init1.dto;

/**
*  The class RlcbmBillMsgDtlGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RlcbmBillMsgDtlGroup extends RlcbmBillMsgDtlGroupSerialized {
   
					private RlcbmBillMsgDtl rlcbmBillMsgDtl = new RlcbmBillMsgDtl();

						private char[] rlcbmBillMsgHdr = Field.fillLowValue(162);
					private RlcbmBillMsgTlr rlcbmBillMsgTlr = new RlcbmBillMsgTlr();
	
	/**
	* Constructor for RlcbmBillMsgDtlGroup
	**/
    public RlcbmBillMsgDtlGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			rlcbmBillMsgDtl.setParent(this,getStartOffset() + 0);
	       			rlcbmBillMsgTlr.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of rlcbmBillMsgDtl
	 *	@return rlcbmBillMsgDtl
	 */   
	 public RlcbmBillMsgDtl getRlcbmBillMsgDtl() {
   	return rlcbmBillMsgDtl;
   }
   /**
	* 	Update RlcbmBillMsgDtl with the passed value
	*   Corresponding COBOL Variable is RLCBM-BILL-MSG-DTL
	*	@param value
	*/
   public void setRlcbmBillMsgDtl(char[] value) {
      rlcbmBillMsgDtl.setString(value); 
   }   
    
     /**
	 * 	Update RlcbmBillMsgDtl 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRlcbmBillMsgDtl(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlcbmBillMsgDtl.begin,rlcbmBillMsgDtl.length());
   }
   
     /**
	 * 	Update RlcbmBillMsgDtl 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlcbmBillMsgDtl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlcbmBillMsgDtl.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update RlcbmBillMsgDtl with another Field
	 *	@param value
	 */
   public void setRlcbmBillMsgDtl(Field source) {
   	replace(source,0,source.length(),rlcbmBillMsgDtl.begin,rlcbmBillMsgDtl.length());
   }  
   
     /**
	 * 	Update RlcbmBillMsgDtl 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRlcbmBillMsgDtl(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlcbmBillMsgDtl.begin,rlcbmBillMsgDtl.length());
   }
   
     /**
	 * 	Update RlcbmBillMsgDtl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlcbmBillMsgDtl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlcbmBillMsgDtl.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of rlcbmBillMsgHdr
	 *	@return rlcbmBillMsgHdr
	 */
   public char[] getRlcbmBillMsgHdr() throws CFException{
     if (isRlcbmBillMsgHdrModified()) { 
        rlcbmBillMsgHdr = refreshRlcbmBillMsgHdr();
     }
   		return rlcbmBillMsgHdr;
   }

  
	/**
	*  set variable rlcbmBillMsgHdr
	*  Corresponding COBOL Variable is RLCBM-BILL-MSG-HDR
	*  @param value
	**/
   public void setRlcbmBillMsgHdr(char[] value) {
      rlcbmBillMsgHdr = checkRlcbmBillMsgHdrConstraints(value);
      serializeRlcbmBillMsgHdr(rlcbmBillMsgHdr);
   } 

     /**
	 * 	Update RlcbmBillMsgHdr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlcbmBillMsgHdr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlcbmBillMsgHdr,rlcbmBillMsgHdr.length);
   	
   }
   
   public void setRlcbmBillMsgHdr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlcbmBillMsgHdr,rlcbmBillMsgHdr.length);
   	
   }
   
     /**
	 * 	Update RlcbmBillMsgHdr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlcbmBillMsgHdr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlcbmBillMsgHdr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RlcbmBillMsgHdr with another Field
	 *	@param value
	 */
   public void setRlcbmBillMsgHdr(Field source) {
       replace(source,0,source.length(),beginRlcbmBillMsgHdr,RLCBM_BILL_MSG_HDR_LEN);
   	
   }  
   
     /**
	 * 	Update RlcbmBillMsgHdr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlcbmBillMsgHdr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlcbmBillMsgHdr,RLCBM_BILL_MSG_HDR_LEN);
   	
   }
   
     /**
	 * 	Update RlcbmBillMsgHdr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlcbmBillMsgHdr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlcbmBillMsgHdr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rlcbmBillMsgTlr
	 *	@return rlcbmBillMsgTlr
	 */   
	 public RlcbmBillMsgTlr getRlcbmBillMsgTlr() {
   	return rlcbmBillMsgTlr;
   }
   /**
	* 	Update RlcbmBillMsgTlr with the passed value
	*   Corresponding COBOL Variable is RLCBM-BILL-MSG-TLR
	*	@param value
	*/
   public void setRlcbmBillMsgTlr(char[] value) {
      rlcbmBillMsgTlr.setString(value); 
   }   
    
     /**
	 * 	Update RlcbmBillMsgTlr 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRlcbmBillMsgTlr(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlcbmBillMsgTlr.begin,rlcbmBillMsgTlr.length());
   }
   
     /**
	 * 	Update RlcbmBillMsgTlr 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlcbmBillMsgTlr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlcbmBillMsgTlr.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update RlcbmBillMsgTlr with another Field
	 *	@param value
	 */
   public void setRlcbmBillMsgTlr(Field source) {
   	replace(source,0,source.length(),rlcbmBillMsgTlr.begin,rlcbmBillMsgTlr.length());
   }  
   
     /**
	 * 	Update RlcbmBillMsgTlr 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRlcbmBillMsgTlr(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlcbmBillMsgTlr.begin,rlcbmBillMsgTlr.length());
   }
   
     /**
	 * 	Update RlcbmBillMsgTlr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlcbmBillMsgTlr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlcbmBillMsgTlr.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getRlcbmBillMsgDtlGroupFieldLength() {
			return RLCBM_BILL_MSG_DTL_GROUP_LENGTH;
		}

}
  
