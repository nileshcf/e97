package com.cloudframe.app.cfdate02.file.records;

/**
*  The class OldcrLnShrGrpRemData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class OldcrLnShrGrpRemData extends OldcrLnShrGrpRemDataSerialized {
   
				private OldcrLnShrGrpRemDtl oldcrLnShrGrpRemDtl = new OldcrLnShrGrpRemDtl();
				private OldcrLnShrGrpRemHdr oldcrLnShrGrpRemHdr = new OldcrLnShrGrpRemHdr();
				private OldcrLnShrGrpRemTlr oldcrLnShrGrpRemTlr = new OldcrLnShrGrpRemTlr();
	
	/**
	* Constructor for OldcrLnShrGrpRemData
	**/
    public OldcrLnShrGrpRemData() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			oldcrLnShrGrpRemDtl.setParent(this,getStartOffset() + 0);
	       			oldcrLnShrGrpRemHdr.setParent(this,getStartOffset() + 0);
	       			oldcrLnShrGrpRemTlr.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of oldcrLnShrGrpRemDtl
	 *	@return oldcrLnShrGrpRemDtl
	 */   
	 public OldcrLnShrGrpRemDtl getOldcrLnShrGrpRemDtl() {
   	return oldcrLnShrGrpRemDtl;
   }
   /**
	* 	Update OldcrLnShrGrpRemDtl with the passed value
	*   Corresponding COBOL Variable is OLDCR-LN-SHR-GRP-REM-DTL
	*	@param value
	*/
   public void setOldcrLnShrGrpRemDtl(char[] value) {
      oldcrLnShrGrpRemDtl.setString(value); 
   }   
    
     /**
	 * 	Update OldcrLnShrGrpRemDtl 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setOldcrLnShrGrpRemDtl(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,oldcrLnShrGrpRemDtl.begin,oldcrLnShrGrpRemDtl.length());
   }
   
     /**
	 * 	Update OldcrLnShrGrpRemDtl 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOldcrLnShrGrpRemDtl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,oldcrLnShrGrpRemDtl.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update OldcrLnShrGrpRemDtl with another Field
	 *	@param value
	 */
   public void setOldcrLnShrGrpRemDtl(Field source) {
   	replace(source,0,source.length(),oldcrLnShrGrpRemDtl.begin,oldcrLnShrGrpRemDtl.length());
   }  
   
     /**
	 * 	Update OldcrLnShrGrpRemDtl 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setOldcrLnShrGrpRemDtl(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,oldcrLnShrGrpRemDtl.begin,oldcrLnShrGrpRemDtl.length());
   }
   
     /**
	 * 	Update OldcrLnShrGrpRemDtl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOldcrLnShrGrpRemDtl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,oldcrLnShrGrpRemDtl.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of oldcrLnShrGrpRemHdr
	 *	@return oldcrLnShrGrpRemHdr
	 */   
	 public OldcrLnShrGrpRemHdr getOldcrLnShrGrpRemHdr() {
   	return oldcrLnShrGrpRemHdr;
   }
   /**
	* 	Update OldcrLnShrGrpRemHdr with the passed value
	*   Corresponding COBOL Variable is OLDCR-LN-SHR-GRP-REM-HDR
	*	@param value
	*/
   public void setOldcrLnShrGrpRemHdr(char[] value) {
      oldcrLnShrGrpRemHdr.setString(value); 
   }   
    
     /**
	 * 	Update OldcrLnShrGrpRemHdr 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setOldcrLnShrGrpRemHdr(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,oldcrLnShrGrpRemHdr.begin,oldcrLnShrGrpRemHdr.length());
   }
   
     /**
	 * 	Update OldcrLnShrGrpRemHdr 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOldcrLnShrGrpRemHdr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,oldcrLnShrGrpRemHdr.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update OldcrLnShrGrpRemHdr with another Field
	 *	@param value
	 */
   public void setOldcrLnShrGrpRemHdr(Field source) {
   	replace(source,0,source.length(),oldcrLnShrGrpRemHdr.begin,oldcrLnShrGrpRemHdr.length());
   }  
   
     /**
	 * 	Update OldcrLnShrGrpRemHdr 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setOldcrLnShrGrpRemHdr(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,oldcrLnShrGrpRemHdr.begin,oldcrLnShrGrpRemHdr.length());
   }
   
     /**
	 * 	Update OldcrLnShrGrpRemHdr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOldcrLnShrGrpRemHdr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,oldcrLnShrGrpRemHdr.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of oldcrLnShrGrpRemTlr
	 *	@return oldcrLnShrGrpRemTlr
	 */   
	 public OldcrLnShrGrpRemTlr getOldcrLnShrGrpRemTlr() {
   	return oldcrLnShrGrpRemTlr;
   }
   /**
	* 	Update OldcrLnShrGrpRemTlr with the passed value
	*   Corresponding COBOL Variable is OLDCR-LN-SHR-GRP-REM-TLR
	*	@param value
	*/
   public void setOldcrLnShrGrpRemTlr(char[] value) {
      oldcrLnShrGrpRemTlr.setString(value); 
   }   
    
     /**
	 * 	Update OldcrLnShrGrpRemTlr 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setOldcrLnShrGrpRemTlr(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,oldcrLnShrGrpRemTlr.begin,oldcrLnShrGrpRemTlr.length());
   }
   
     /**
	 * 	Update OldcrLnShrGrpRemTlr 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOldcrLnShrGrpRemTlr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,oldcrLnShrGrpRemTlr.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update OldcrLnShrGrpRemTlr with another Field
	 *	@param value
	 */
   public void setOldcrLnShrGrpRemTlr(Field source) {
   	replace(source,0,source.length(),oldcrLnShrGrpRemTlr.begin,oldcrLnShrGrpRemTlr.length());
   }  
   
     /**
	 * 	Update OldcrLnShrGrpRemTlr 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setOldcrLnShrGrpRemTlr(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,oldcrLnShrGrpRemTlr.begin,oldcrLnShrGrpRemTlr.length());
   }
   
     /**
	 * 	Update OldcrLnShrGrpRemTlr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOldcrLnShrGrpRemTlr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,oldcrLnShrGrpRemTlr.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getOldcrLnShrGrpRemDataFieldLength() {
			return OLDCR_LN_SHR_GRP_REM_DATA_LENGTH;
		}

}
  
