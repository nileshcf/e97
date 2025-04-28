package com.cloudframe.app.cfdate02.file.records;

/**
*  The class RlatdRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:05. using version 5.0.0.256
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RlatdRec extends RlatdRecSerialized {
   
				private RlatdDtl rlatdDtl = new RlatdDtl();
				private RlatdHdr rlatdHdr = new RlatdHdr();
				private RlatdTlr rlatdTlr = new RlatdTlr();
	
	/**
	* Constructor for RlatdRec
	**/
    public RlatdRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			rlatdDtl.setParent(this,getStartOffset() + 0);
	       			rlatdHdr.setParent(this,getStartOffset() + 0);
	       			rlatdTlr.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of rlatdDtl
	 *	@return rlatdDtl
	 */   
	 public RlatdDtl getRlatdDtl() {
   	return rlatdDtl;
   }
   /**
	* 	Update RlatdDtl with the passed value
	*   Corresponding COBOL Variable is RLATD-DTL
	*	@param value
	*/
   public void setRlatdDtl(char[] value) {
      rlatdDtl.setString(value); 
   }   
    
     /**
	 * 	Update RlatdDtl 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRlatdDtl(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlatdDtl.begin,rlatdDtl.length());
   }
   
     /**
	 * 	Update RlatdDtl 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlatdDtl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlatdDtl.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update RlatdDtl with another Field
	 *	@param value
	 */
   public void setRlatdDtl(Field source) {
   	replace(source,0,source.length(),rlatdDtl.begin,rlatdDtl.length());
   }  
   
     /**
	 * 	Update RlatdDtl 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRlatdDtl(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlatdDtl.begin,rlatdDtl.length());
   }
   
     /**
	 * 	Update RlatdDtl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlatdDtl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlatdDtl.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of rlatdHdr
	 *	@return rlatdHdr
	 */   
	 public RlatdHdr getRlatdHdr() {
   	return rlatdHdr;
   }
   /**
	* 	Update RlatdHdr with the passed value
	*   Corresponding COBOL Variable is RLATD-HDR
	*	@param value
	*/
   public void setRlatdHdr(char[] value) {
      rlatdHdr.setString(value); 
   }   
    
     /**
	 * 	Update RlatdHdr 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRlatdHdr(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlatdHdr.begin,rlatdHdr.length());
   }
   
     /**
	 * 	Update RlatdHdr 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlatdHdr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlatdHdr.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update RlatdHdr with another Field
	 *	@param value
	 */
   public void setRlatdHdr(Field source) {
   	replace(source,0,source.length(),rlatdHdr.begin,rlatdHdr.length());
   }  
   
     /**
	 * 	Update RlatdHdr 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRlatdHdr(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlatdHdr.begin,rlatdHdr.length());
   }
   
     /**
	 * 	Update RlatdHdr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlatdHdr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlatdHdr.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of rlatdTlr
	 *	@return rlatdTlr
	 */   
	 public RlatdTlr getRlatdTlr() {
   	return rlatdTlr;
   }
   /**
	* 	Update RlatdTlr with the passed value
	*   Corresponding COBOL Variable is RLATD-TLR
	*	@param value
	*/
   public void setRlatdTlr(char[] value) {
      rlatdTlr.setString(value); 
   }   
    
     /**
	 * 	Update RlatdTlr 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRlatdTlr(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlatdTlr.begin,rlatdTlr.length());
   }
   
     /**
	 * 	Update RlatdTlr 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlatdTlr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlatdTlr.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update RlatdTlr with another Field
	 *	@param value
	 */
   public void setRlatdTlr(Field source) {
   	replace(source,0,source.length(),rlatdTlr.begin,rlatdTlr.length());
   }  
   
     /**
	 * 	Update RlatdTlr 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRlatdTlr(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlatdTlr.begin,rlatdTlr.length());
   }
   
     /**
	 * 	Update RlatdTlr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlatdTlr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlatdTlr.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getRlatdRecFieldLength() {
			return RLATD_REC_LENGTH;
		}

}
  
