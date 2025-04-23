package com.cloudframe.app.cfdate02.file.records;

/**
*  The class FlgusInEocRefBlData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FlgusInEocRefBlData extends FlgusInEocRefBlDataSerialized {
   
				private FlgusInEocRefBlDtl flgusInEocRefBlDtl = new FlgusInEocRefBlDtl();
				private FlgusInEocRefBlMsg flgusInEocRefBlMsg = new FlgusInEocRefBlMsg();
				private FlgusInEocTgp flgusInEocTgp = new FlgusInEocTgp();
				private FlgusInEocRefBlHdr flgusInEocRefBlHdr = new FlgusInEocRefBlHdr();
				private FlgusInEocRefBlTlr flgusInEocRefBlTlr = new FlgusInEocRefBlTlr();
	
	/**
	* Constructor for FlgusInEocRefBlData
	**/
    public FlgusInEocRefBlData() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			flgusInEocRefBlDtl.setParent(this,getStartOffset() + 0);
	       			flgusInEocRefBlMsg.setParent(this,getStartOffset() + 0);
	       			flgusInEocTgp.setParent(this,getStartOffset() + 0);
	       			flgusInEocRefBlHdr.setParent(this,getStartOffset() + 0);
	       			flgusInEocRefBlTlr.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of flgusInEocRefBlDtl
	 *	@return flgusInEocRefBlDtl
	 */   
	 public FlgusInEocRefBlDtl getFlgusInEocRefBlDtl() {
   	return flgusInEocRefBlDtl;
   }
   /**
	* 	Update FlgusInEocRefBlDtl with the passed value
	*   Corresponding COBOL Variable is FLGUS-IN-EOC-REF-BL-DTL
	*	@param value
	*/
   public void setFlgusInEocRefBlDtl(char[] value) {
      flgusInEocRefBlDtl.setString(value); 
   }   
    
     /**
	 * 	Update FlgusInEocRefBlDtl 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setFlgusInEocRefBlDtl(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,flgusInEocRefBlDtl.begin,flgusInEocRefBlDtl.length());
   }
   
     /**
	 * 	Update FlgusInEocRefBlDtl 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFlgusInEocRefBlDtl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,flgusInEocRefBlDtl.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update FlgusInEocRefBlDtl with another Field
	 *	@param value
	 */
   public void setFlgusInEocRefBlDtl(Field source) {
   	replace(source,0,source.length(),flgusInEocRefBlDtl.begin,flgusInEocRefBlDtl.length());
   }  
   
     /**
	 * 	Update FlgusInEocRefBlDtl 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setFlgusInEocRefBlDtl(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,flgusInEocRefBlDtl.begin,flgusInEocRefBlDtl.length());
   }
   
     /**
	 * 	Update FlgusInEocRefBlDtl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFlgusInEocRefBlDtl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,flgusInEocRefBlDtl.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of flgusInEocRefBlMsg
	 *	@return flgusInEocRefBlMsg
	 */   
	 public FlgusInEocRefBlMsg getFlgusInEocRefBlMsg() {
   	return flgusInEocRefBlMsg;
   }
   /**
	* 	Update FlgusInEocRefBlMsg with the passed value
	*   Corresponding COBOL Variable is FLGUS-IN-EOC-REF-BL-MSG
	*	@param value
	*/
   public void setFlgusInEocRefBlMsg(char[] value) {
      flgusInEocRefBlMsg.setString(value); 
   }   
    
     /**
	 * 	Update FlgusInEocRefBlMsg 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setFlgusInEocRefBlMsg(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,flgusInEocRefBlMsg.begin,flgusInEocRefBlMsg.length());
   }
   
     /**
	 * 	Update FlgusInEocRefBlMsg 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFlgusInEocRefBlMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,flgusInEocRefBlMsg.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update FlgusInEocRefBlMsg with another Field
	 *	@param value
	 */
   public void setFlgusInEocRefBlMsg(Field source) {
   	replace(source,0,source.length(),flgusInEocRefBlMsg.begin,flgusInEocRefBlMsg.length());
   }  
   
     /**
	 * 	Update FlgusInEocRefBlMsg 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setFlgusInEocRefBlMsg(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,flgusInEocRefBlMsg.begin,flgusInEocRefBlMsg.length());
   }
   
     /**
	 * 	Update FlgusInEocRefBlMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFlgusInEocRefBlMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,flgusInEocRefBlMsg.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of flgusInEocTgp
	 *	@return flgusInEocTgp
	 */   
	 public FlgusInEocTgp getFlgusInEocTgp() {
   	return flgusInEocTgp;
   }
   /**
	* 	Update FlgusInEocTgp with the passed value
	*   Corresponding COBOL Variable is FLGUS-IN-EOC-TGP
	*	@param value
	*/
   public void setFlgusInEocTgp(char[] value) {
      flgusInEocTgp.setString(value); 
   }   
    
     /**
	 * 	Update FlgusInEocTgp 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setFlgusInEocTgp(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,flgusInEocTgp.begin,flgusInEocTgp.length());
   }
   
     /**
	 * 	Update FlgusInEocTgp 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFlgusInEocTgp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,flgusInEocTgp.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update FlgusInEocTgp with another Field
	 *	@param value
	 */
   public void setFlgusInEocTgp(Field source) {
   	replace(source,0,source.length(),flgusInEocTgp.begin,flgusInEocTgp.length());
   }  
   
     /**
	 * 	Update FlgusInEocTgp 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setFlgusInEocTgp(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,flgusInEocTgp.begin,flgusInEocTgp.length());
   }
   
     /**
	 * 	Update FlgusInEocTgp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFlgusInEocTgp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,flgusInEocTgp.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of flgusInEocRefBlHdr
	 *	@return flgusInEocRefBlHdr
	 */   
	 public FlgusInEocRefBlHdr getFlgusInEocRefBlHdr() {
   	return flgusInEocRefBlHdr;
   }
   /**
	* 	Update FlgusInEocRefBlHdr with the passed value
	*   Corresponding COBOL Variable is FLGUS-IN-EOC-REF-BL-HDR
	*	@param value
	*/
   public void setFlgusInEocRefBlHdr(char[] value) {
      flgusInEocRefBlHdr.setString(value); 
   }   
    
     /**
	 * 	Update FlgusInEocRefBlHdr 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setFlgusInEocRefBlHdr(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,flgusInEocRefBlHdr.begin,flgusInEocRefBlHdr.length());
   }
   
     /**
	 * 	Update FlgusInEocRefBlHdr 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFlgusInEocRefBlHdr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,flgusInEocRefBlHdr.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update FlgusInEocRefBlHdr with another Field
	 *	@param value
	 */
   public void setFlgusInEocRefBlHdr(Field source) {
   	replace(source,0,source.length(),flgusInEocRefBlHdr.begin,flgusInEocRefBlHdr.length());
   }  
   
     /**
	 * 	Update FlgusInEocRefBlHdr 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setFlgusInEocRefBlHdr(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,flgusInEocRefBlHdr.begin,flgusInEocRefBlHdr.length());
   }
   
     /**
	 * 	Update FlgusInEocRefBlHdr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFlgusInEocRefBlHdr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,flgusInEocRefBlHdr.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of flgusInEocRefBlTlr
	 *	@return flgusInEocRefBlTlr
	 */   
	 public FlgusInEocRefBlTlr getFlgusInEocRefBlTlr() {
   	return flgusInEocRefBlTlr;
   }
   /**
	* 	Update FlgusInEocRefBlTlr with the passed value
	*   Corresponding COBOL Variable is FLGUS-IN-EOC-REF-BL-TLR
	*	@param value
	*/
   public void setFlgusInEocRefBlTlr(char[] value) {
      flgusInEocRefBlTlr.setString(value); 
   }   
    
     /**
	 * 	Update FlgusInEocRefBlTlr 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setFlgusInEocRefBlTlr(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,flgusInEocRefBlTlr.begin,flgusInEocRefBlTlr.length());
   }
   
     /**
	 * 	Update FlgusInEocRefBlTlr 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFlgusInEocRefBlTlr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,flgusInEocRefBlTlr.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update FlgusInEocRefBlTlr with another Field
	 *	@param value
	 */
   public void setFlgusInEocRefBlTlr(Field source) {
   	replace(source,0,source.length(),flgusInEocRefBlTlr.begin,flgusInEocRefBlTlr.length());
   }  
   
     /**
	 * 	Update FlgusInEocRefBlTlr 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setFlgusInEocRefBlTlr(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,flgusInEocRefBlTlr.begin,flgusInEocRefBlTlr.length());
   }
   
     /**
	 * 	Update FlgusInEocRefBlTlr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFlgusInEocRefBlTlr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,flgusInEocRefBlTlr.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getFlgusInEocRefBlDataFieldLength() {
			return FLGUS_IN_EOC_REF_BL_DATA_LENGTH;
		}

}
  
