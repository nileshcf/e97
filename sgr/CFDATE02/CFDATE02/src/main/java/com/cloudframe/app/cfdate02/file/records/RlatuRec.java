package com.cloudframe.app.cfdate02.file.records;

/**
*  The class RlatuRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RlatuRec extends RlatuRecSerialized {
   
				private RlatuDtl rlatuDtl = new RlatuDtl();
				private RlatuHdr rlatuHdr = new RlatuHdr();
				private RlatuTlr rlatuTlr = new RlatuTlr();
	
	/**
	* Constructor for RlatuRec
	**/
    public RlatuRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			rlatuDtl.setParent(this,getStartOffset() + 0);
	       			rlatuHdr.setParent(this,getStartOffset() + 0);
	       			rlatuTlr.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of rlatuDtl
	 *	@return rlatuDtl
	 */   
	 public RlatuDtl getRlatuDtl() {
   	return rlatuDtl;
   }
   /**
	* 	Update RlatuDtl with the passed value
	*   Corresponding COBOL Variable is RLATU-DTL
	*	@param value
	*/
   public void setRlatuDtl(char[] value) {
      rlatuDtl.setString(value); 
   }   
    
     /**
	 * 	Update RlatuDtl 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRlatuDtl(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlatuDtl.begin,rlatuDtl.length());
   }
   
     /**
	 * 	Update RlatuDtl 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlatuDtl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlatuDtl.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update RlatuDtl with another Field
	 *	@param value
	 */
   public void setRlatuDtl(Field source) {
   	replace(source,0,source.length(),rlatuDtl.begin,rlatuDtl.length());
   }  
   
     /**
	 * 	Update RlatuDtl 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRlatuDtl(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlatuDtl.begin,rlatuDtl.length());
   }
   
     /**
	 * 	Update RlatuDtl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlatuDtl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlatuDtl.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of rlatuHdr
	 *	@return rlatuHdr
	 */   
	 public RlatuHdr getRlatuHdr() {
   	return rlatuHdr;
   }
   /**
	* 	Update RlatuHdr with the passed value
	*   Corresponding COBOL Variable is RLATU-HDR
	*	@param value
	*/
   public void setRlatuHdr(char[] value) {
      rlatuHdr.setString(value); 
   }   
    
     /**
	 * 	Update RlatuHdr 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRlatuHdr(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlatuHdr.begin,rlatuHdr.length());
   }
   
     /**
	 * 	Update RlatuHdr 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlatuHdr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlatuHdr.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update RlatuHdr with another Field
	 *	@param value
	 */
   public void setRlatuHdr(Field source) {
   	replace(source,0,source.length(),rlatuHdr.begin,rlatuHdr.length());
   }  
   
     /**
	 * 	Update RlatuHdr 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRlatuHdr(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlatuHdr.begin,rlatuHdr.length());
   }
   
     /**
	 * 	Update RlatuHdr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlatuHdr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlatuHdr.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of rlatuTlr
	 *	@return rlatuTlr
	 */   
	 public RlatuTlr getRlatuTlr() {
   	return rlatuTlr;
   }
   /**
	* 	Update RlatuTlr with the passed value
	*   Corresponding COBOL Variable is RLATU-TLR
	*	@param value
	*/
   public void setRlatuTlr(char[] value) {
      rlatuTlr.setString(value); 
   }   
    
     /**
	 * 	Update RlatuTlr 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRlatuTlr(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlatuTlr.begin,rlatuTlr.length());
   }
   
     /**
	 * 	Update RlatuTlr 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlatuTlr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlatuTlr.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update RlatuTlr with another Field
	 *	@param value
	 */
   public void setRlatuTlr(Field source) {
   	replace(source,0,source.length(),rlatuTlr.begin,rlatuTlr.length());
   }  
   
     /**
	 * 	Update RlatuTlr 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRlatuTlr(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlatuTlr.begin,rlatuTlr.length());
   }
   
     /**
	 * 	Update RlatuTlr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlatuTlr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlatuTlr.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getRlatuRecFieldLength() {
			return RLATU_REC_LENGTH;
		}

}
  
