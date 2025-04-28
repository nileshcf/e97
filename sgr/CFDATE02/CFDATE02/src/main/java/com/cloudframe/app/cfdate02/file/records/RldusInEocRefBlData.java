package com.cloudframe.app.cfdate02.file.records;

/**
*  The class RldusInEocRefBlData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:05. using version 5.0.0.256
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RldusInEocRefBlData extends RldusInEocRefBlDataSerialized {
   
				private RldusInEocRefBlDtl rldusInEocRefBlDtl = new RldusInEocRefBlDtl();
				private RldusInEocRefBlMsg rldusInEocRefBlMsg = new RldusInEocRefBlMsg();
				private RldusInEocTgp rldusInEocTgp = new RldusInEocTgp();
				private RldusInEocRefBlHdr rldusInEocRefBlHdr = new RldusInEocRefBlHdr();
				private RldusInEocRefBlTlr rldusInEocRefBlTlr = new RldusInEocRefBlTlr();
	
	/**
	* Constructor for RldusInEocRefBlData
	**/
    public RldusInEocRefBlData() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			rldusInEocRefBlDtl.setParent(this,getStartOffset() + 0);
	       			rldusInEocRefBlMsg.setParent(this,getStartOffset() + 0);
	       			rldusInEocTgp.setParent(this,getStartOffset() + 0);
	       			rldusInEocRefBlHdr.setParent(this,getStartOffset() + 0);
	       			rldusInEocRefBlTlr.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of rldusInEocRefBlDtl
	 *	@return rldusInEocRefBlDtl
	 */   
	 public RldusInEocRefBlDtl getRldusInEocRefBlDtl() {
   	return rldusInEocRefBlDtl;
   }
   /**
	* 	Update RldusInEocRefBlDtl with the passed value
	*   Corresponding COBOL Variable is RLDUS-IN-EOC-REF-BL-DTL
	*	@param value
	*/
   public void setRldusInEocRefBlDtl(char[] value) {
      rldusInEocRefBlDtl.setString(value); 
   }   
    
     /**
	 * 	Update RldusInEocRefBlDtl 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRldusInEocRefBlDtl(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rldusInEocRefBlDtl.begin,rldusInEocRefBlDtl.length());
   }
   
     /**
	 * 	Update RldusInEocRefBlDtl 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRldusInEocRefBlDtl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rldusInEocRefBlDtl.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update RldusInEocRefBlDtl with another Field
	 *	@param value
	 */
   public void setRldusInEocRefBlDtl(Field source) {
   	replace(source,0,source.length(),rldusInEocRefBlDtl.begin,rldusInEocRefBlDtl.length());
   }  
   
     /**
	 * 	Update RldusInEocRefBlDtl 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRldusInEocRefBlDtl(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rldusInEocRefBlDtl.begin,rldusInEocRefBlDtl.length());
   }
   
     /**
	 * 	Update RldusInEocRefBlDtl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRldusInEocRefBlDtl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rldusInEocRefBlDtl.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of rldusInEocRefBlMsg
	 *	@return rldusInEocRefBlMsg
	 */   
	 public RldusInEocRefBlMsg getRldusInEocRefBlMsg() {
   	return rldusInEocRefBlMsg;
   }
   /**
	* 	Update RldusInEocRefBlMsg with the passed value
	*   Corresponding COBOL Variable is RLDUS-IN-EOC-REF-BL-MSG
	*	@param value
	*/
   public void setRldusInEocRefBlMsg(char[] value) {
      rldusInEocRefBlMsg.setString(value); 
   }   
    
     /**
	 * 	Update RldusInEocRefBlMsg 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRldusInEocRefBlMsg(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rldusInEocRefBlMsg.begin,rldusInEocRefBlMsg.length());
   }
   
     /**
	 * 	Update RldusInEocRefBlMsg 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRldusInEocRefBlMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rldusInEocRefBlMsg.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update RldusInEocRefBlMsg with another Field
	 *	@param value
	 */
   public void setRldusInEocRefBlMsg(Field source) {
   	replace(source,0,source.length(),rldusInEocRefBlMsg.begin,rldusInEocRefBlMsg.length());
   }  
   
     /**
	 * 	Update RldusInEocRefBlMsg 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRldusInEocRefBlMsg(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rldusInEocRefBlMsg.begin,rldusInEocRefBlMsg.length());
   }
   
     /**
	 * 	Update RldusInEocRefBlMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRldusInEocRefBlMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rldusInEocRefBlMsg.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of rldusInEocTgp
	 *	@return rldusInEocTgp
	 */   
	 public RldusInEocTgp getRldusInEocTgp() {
   	return rldusInEocTgp;
   }
   /**
	* 	Update RldusInEocTgp with the passed value
	*   Corresponding COBOL Variable is RLDUS-IN-EOC-TGP
	*	@param value
	*/
   public void setRldusInEocTgp(char[] value) {
      rldusInEocTgp.setString(value); 
   }   
    
     /**
	 * 	Update RldusInEocTgp 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRldusInEocTgp(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rldusInEocTgp.begin,rldusInEocTgp.length());
   }
   
     /**
	 * 	Update RldusInEocTgp 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRldusInEocTgp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rldusInEocTgp.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update RldusInEocTgp with another Field
	 *	@param value
	 */
   public void setRldusInEocTgp(Field source) {
   	replace(source,0,source.length(),rldusInEocTgp.begin,rldusInEocTgp.length());
   }  
   
     /**
	 * 	Update RldusInEocTgp 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRldusInEocTgp(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rldusInEocTgp.begin,rldusInEocTgp.length());
   }
   
     /**
	 * 	Update RldusInEocTgp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRldusInEocTgp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rldusInEocTgp.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of rldusInEocRefBlHdr
	 *	@return rldusInEocRefBlHdr
	 */   
	 public RldusInEocRefBlHdr getRldusInEocRefBlHdr() {
   	return rldusInEocRefBlHdr;
   }
   /**
	* 	Update RldusInEocRefBlHdr with the passed value
	*   Corresponding COBOL Variable is RLDUS-IN-EOC-REF-BL-HDR
	*	@param value
	*/
   public void setRldusInEocRefBlHdr(char[] value) {
      rldusInEocRefBlHdr.setString(value); 
   }   
    
     /**
	 * 	Update RldusInEocRefBlHdr 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRldusInEocRefBlHdr(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rldusInEocRefBlHdr.begin,rldusInEocRefBlHdr.length());
   }
   
     /**
	 * 	Update RldusInEocRefBlHdr 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRldusInEocRefBlHdr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rldusInEocRefBlHdr.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update RldusInEocRefBlHdr with another Field
	 *	@param value
	 */
   public void setRldusInEocRefBlHdr(Field source) {
   	replace(source,0,source.length(),rldusInEocRefBlHdr.begin,rldusInEocRefBlHdr.length());
   }  
   
     /**
	 * 	Update RldusInEocRefBlHdr 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRldusInEocRefBlHdr(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rldusInEocRefBlHdr.begin,rldusInEocRefBlHdr.length());
   }
   
     /**
	 * 	Update RldusInEocRefBlHdr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRldusInEocRefBlHdr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rldusInEocRefBlHdr.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of rldusInEocRefBlTlr
	 *	@return rldusInEocRefBlTlr
	 */   
	 public RldusInEocRefBlTlr getRldusInEocRefBlTlr() {
   	return rldusInEocRefBlTlr;
   }
   /**
	* 	Update RldusInEocRefBlTlr with the passed value
	*   Corresponding COBOL Variable is RLDUS-IN-EOC-REF-BL-TLR
	*	@param value
	*/
   public void setRldusInEocRefBlTlr(char[] value) {
      rldusInEocRefBlTlr.setString(value); 
   }   
    
     /**
	 * 	Update RldusInEocRefBlTlr 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRldusInEocRefBlTlr(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rldusInEocRefBlTlr.begin,rldusInEocRefBlTlr.length());
   }
   
     /**
	 * 	Update RldusInEocRefBlTlr 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRldusInEocRefBlTlr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rldusInEocRefBlTlr.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update RldusInEocRefBlTlr with another Field
	 *	@param value
	 */
   public void setRldusInEocRefBlTlr(Field source) {
   	replace(source,0,source.length(),rldusInEocRefBlTlr.begin,rldusInEocRefBlTlr.length());
   }  
   
     /**
	 * 	Update RldusInEocRefBlTlr 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRldusInEocRefBlTlr(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rldusInEocRefBlTlr.begin,rldusInEocRefBlTlr.length());
   }
   
     /**
	 * 	Update RldusInEocRefBlTlr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRldusInEocRefBlTlr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rldusInEocRefBlTlr.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getRldusInEocRefBlDataFieldLength() {
			return RLDUS_IN_EOC_REF_BL_DATA_LENGTH;
		}

}
  
