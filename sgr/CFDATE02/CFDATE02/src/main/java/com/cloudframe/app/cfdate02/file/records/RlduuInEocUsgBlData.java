package com.cloudframe.app.cfdate02.file.records;

/**
*  The class RlduuInEocUsgBlData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RlduuInEocUsgBlData extends RlduuInEocUsgBlDataSerialized {
   
				private RlduuInEocUsgBlDtl rlduuInEocUsgBlDtl = new RlduuInEocUsgBlDtl();
				private RlduuInEocUsgBlHdr rlduuInEocUsgBlHdr = new RlduuInEocUsgBlHdr();
				private RlduuInEocUsgBlTlr rlduuInEocUsgBlTlr = new RlduuInEocUsgBlTlr();
	
	/**
	* Constructor for RlduuInEocUsgBlData
	**/
    public RlduuInEocUsgBlData() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			rlduuInEocUsgBlDtl.setParent(this,getStartOffset() + 0);
	       			rlduuInEocUsgBlHdr.setParent(this,getStartOffset() + 0);
	       			rlduuInEocUsgBlTlr.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of rlduuInEocUsgBlDtl
	 *	@return rlduuInEocUsgBlDtl
	 */   
	 public RlduuInEocUsgBlDtl getRlduuInEocUsgBlDtl() {
   	return rlduuInEocUsgBlDtl;
   }
   /**
	* 	Update RlduuInEocUsgBlDtl with the passed value
	*   Corresponding COBOL Variable is RLDUU-IN-EOC-USG-BL-DTL
	*	@param value
	*/
   public void setRlduuInEocUsgBlDtl(char[] value) {
      rlduuInEocUsgBlDtl.setString(value); 
   }   
    
     /**
	 * 	Update RlduuInEocUsgBlDtl 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRlduuInEocUsgBlDtl(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlduuInEocUsgBlDtl.begin,rlduuInEocUsgBlDtl.length());
   }
   
     /**
	 * 	Update RlduuInEocUsgBlDtl 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlduuInEocUsgBlDtl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlduuInEocUsgBlDtl.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update RlduuInEocUsgBlDtl with another Field
	 *	@param value
	 */
   public void setRlduuInEocUsgBlDtl(Field source) {
   	replace(source,0,source.length(),rlduuInEocUsgBlDtl.begin,rlduuInEocUsgBlDtl.length());
   }  
   
     /**
	 * 	Update RlduuInEocUsgBlDtl 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRlduuInEocUsgBlDtl(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlduuInEocUsgBlDtl.begin,rlduuInEocUsgBlDtl.length());
   }
   
     /**
	 * 	Update RlduuInEocUsgBlDtl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlduuInEocUsgBlDtl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlduuInEocUsgBlDtl.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of rlduuInEocUsgBlHdr
	 *	@return rlduuInEocUsgBlHdr
	 */   
	 public RlduuInEocUsgBlHdr getRlduuInEocUsgBlHdr() {
   	return rlduuInEocUsgBlHdr;
   }
   /**
	* 	Update RlduuInEocUsgBlHdr with the passed value
	*   Corresponding COBOL Variable is RLDUU-IN-EOC-USG-BL-HDR
	*	@param value
	*/
   public void setRlduuInEocUsgBlHdr(char[] value) {
      rlduuInEocUsgBlHdr.setString(value); 
   }   
    
     /**
	 * 	Update RlduuInEocUsgBlHdr 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRlduuInEocUsgBlHdr(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlduuInEocUsgBlHdr.begin,rlduuInEocUsgBlHdr.length());
   }
   
     /**
	 * 	Update RlduuInEocUsgBlHdr 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlduuInEocUsgBlHdr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlduuInEocUsgBlHdr.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update RlduuInEocUsgBlHdr with another Field
	 *	@param value
	 */
   public void setRlduuInEocUsgBlHdr(Field source) {
   	replace(source,0,source.length(),rlduuInEocUsgBlHdr.begin,rlduuInEocUsgBlHdr.length());
   }  
   
     /**
	 * 	Update RlduuInEocUsgBlHdr 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRlduuInEocUsgBlHdr(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlduuInEocUsgBlHdr.begin,rlduuInEocUsgBlHdr.length());
   }
   
     /**
	 * 	Update RlduuInEocUsgBlHdr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlduuInEocUsgBlHdr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlduuInEocUsgBlHdr.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of rlduuInEocUsgBlTlr
	 *	@return rlduuInEocUsgBlTlr
	 */   
	 public RlduuInEocUsgBlTlr getRlduuInEocUsgBlTlr() {
   	return rlduuInEocUsgBlTlr;
   }
   /**
	* 	Update RlduuInEocUsgBlTlr with the passed value
	*   Corresponding COBOL Variable is RLDUU-IN-EOC-USG-BL-TLR
	*	@param value
	*/
   public void setRlduuInEocUsgBlTlr(char[] value) {
      rlduuInEocUsgBlTlr.setString(value); 
   }   
    
     /**
	 * 	Update RlduuInEocUsgBlTlr 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRlduuInEocUsgBlTlr(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlduuInEocUsgBlTlr.begin,rlduuInEocUsgBlTlr.length());
   }
   
     /**
	 * 	Update RlduuInEocUsgBlTlr 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlduuInEocUsgBlTlr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlduuInEocUsgBlTlr.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update RlduuInEocUsgBlTlr with another Field
	 *	@param value
	 */
   public void setRlduuInEocUsgBlTlr(Field source) {
   	replace(source,0,source.length(),rlduuInEocUsgBlTlr.begin,rlduuInEocUsgBlTlr.length());
   }  
   
     /**
	 * 	Update RlduuInEocUsgBlTlr 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRlduuInEocUsgBlTlr(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlduuInEocUsgBlTlr.begin,rlduuInEocUsgBlTlr.length());
   }
   
     /**
	 * 	Update RlduuInEocUsgBlTlr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlduuInEocUsgBlTlr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlduuInEocUsgBlTlr.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getRlduuInEocUsgBlDataFieldLength() {
			return RLDUU_IN_EOC_USG_BL_DATA_LENGTH;
		}

}
  
