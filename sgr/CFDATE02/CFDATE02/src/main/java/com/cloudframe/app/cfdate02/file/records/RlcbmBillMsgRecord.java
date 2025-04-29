package com.cloudframe.app.cfdate02.file.records;

/**
*  The class RlcbmBillMsgRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RlcbmBillMsgRecord extends RlcbmBillMsgRecordSerialized {
   
				private RlcbmBillMsgDtl rlcbmBillMsgDtl = new RlcbmBillMsgDtl();
				private RlcbmBillMsgHdr rlcbmBillMsgHdr = new RlcbmBillMsgHdr();
				private RlcbmBillMsgTlr rlcbmBillMsgTlr = new RlcbmBillMsgTlr();
	
	/**
	* Constructor for RlcbmBillMsgRecord
	**/
    public RlcbmBillMsgRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			rlcbmBillMsgDtl.setParent(this,getStartOffset() + 0);
	       			rlcbmBillMsgHdr.setParent(this,getStartOffset() + 0);
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
	 public RlcbmBillMsgHdr getRlcbmBillMsgHdr() {
   	return rlcbmBillMsgHdr;
   }
   /**
	* 	Update RlcbmBillMsgHdr with the passed value
	*   Corresponding COBOL Variable is RLCBM-BILL-MSG-HDR
	*	@param value
	*/
   public void setRlcbmBillMsgHdr(char[] value) {
      rlcbmBillMsgHdr.setString(value); 
   }   
    
     /**
	 * 	Update RlcbmBillMsgHdr 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRlcbmBillMsgHdr(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlcbmBillMsgHdr.begin,rlcbmBillMsgHdr.length());
   }
   
     /**
	 * 	Update RlcbmBillMsgHdr 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlcbmBillMsgHdr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlcbmBillMsgHdr.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update RlcbmBillMsgHdr with another Field
	 *	@param value
	 */
   public void setRlcbmBillMsgHdr(Field source) {
   	replace(source,0,source.length(),rlcbmBillMsgHdr.begin,rlcbmBillMsgHdr.length());
   }  
   
     /**
	 * 	Update RlcbmBillMsgHdr 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRlcbmBillMsgHdr(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlcbmBillMsgHdr.begin,rlcbmBillMsgHdr.length());
   }
   
     /**
	 * 	Update RlcbmBillMsgHdr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlcbmBillMsgHdr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlcbmBillMsgHdr.begin+targetIndex,targetLen);
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

	
	
	

		public static int getRlcbmBillMsgRecordFieldLength() {
			return RLCBM_BILL_MSG_RECORD_LENGTH;
		}

}
  
