package com.cloudframe.app.cfdate02.file.records;

/**
*  The class OldclLnShrBcActvData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class OldclLnShrBcActvData extends OldclLnShrBcActvDataSerialized {
   
				private OldclLnShrBcActvDtl oldclLnShrBcActvDtl = new OldclLnShrBcActvDtl();
				private OldclLnShrBcActvHdr oldclLnShrBcActvHdr = new OldclLnShrBcActvHdr();
				private OldclLnShrBcActvTlr oldclLnShrBcActvTlr = new OldclLnShrBcActvTlr();
	
	/**
	* Constructor for OldclLnShrBcActvData
	**/
    public OldclLnShrBcActvData() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			oldclLnShrBcActvDtl.setParent(this,getStartOffset() + 0);
	       			oldclLnShrBcActvHdr.setParent(this,getStartOffset() + 0);
	       			oldclLnShrBcActvTlr.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of oldclLnShrBcActvDtl
	 *	@return oldclLnShrBcActvDtl
	 */   
	 public OldclLnShrBcActvDtl getOldclLnShrBcActvDtl() {
   	return oldclLnShrBcActvDtl;
   }
   /**
	* 	Update OldclLnShrBcActvDtl with the passed value
	*   Corresponding COBOL Variable is OLDCL-LN-SHR-BC-ACTV-DTL
	*	@param value
	*/
   public void setOldclLnShrBcActvDtl(char[] value) {
      oldclLnShrBcActvDtl.setString(value); 
   }   
    
     /**
	 * 	Update OldclLnShrBcActvDtl 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setOldclLnShrBcActvDtl(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,oldclLnShrBcActvDtl.begin,oldclLnShrBcActvDtl.length());
   }
   
     /**
	 * 	Update OldclLnShrBcActvDtl 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOldclLnShrBcActvDtl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,oldclLnShrBcActvDtl.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update OldclLnShrBcActvDtl with another Field
	 *	@param value
	 */
   public void setOldclLnShrBcActvDtl(Field source) {
   	replace(source,0,source.length(),oldclLnShrBcActvDtl.begin,oldclLnShrBcActvDtl.length());
   }  
   
     /**
	 * 	Update OldclLnShrBcActvDtl 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setOldclLnShrBcActvDtl(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,oldclLnShrBcActvDtl.begin,oldclLnShrBcActvDtl.length());
   }
   
     /**
	 * 	Update OldclLnShrBcActvDtl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOldclLnShrBcActvDtl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,oldclLnShrBcActvDtl.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of oldclLnShrBcActvHdr
	 *	@return oldclLnShrBcActvHdr
	 */   
	 public OldclLnShrBcActvHdr getOldclLnShrBcActvHdr() {
   	return oldclLnShrBcActvHdr;
   }
   /**
	* 	Update OldclLnShrBcActvHdr with the passed value
	*   Corresponding COBOL Variable is OLDCL-LN-SHR-BC-ACTV-HDR
	*	@param value
	*/
   public void setOldclLnShrBcActvHdr(char[] value) {
      oldclLnShrBcActvHdr.setString(value); 
   }   
    
     /**
	 * 	Update OldclLnShrBcActvHdr 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setOldclLnShrBcActvHdr(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,oldclLnShrBcActvHdr.begin,oldclLnShrBcActvHdr.length());
   }
   
     /**
	 * 	Update OldclLnShrBcActvHdr 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOldclLnShrBcActvHdr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,oldclLnShrBcActvHdr.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update OldclLnShrBcActvHdr with another Field
	 *	@param value
	 */
   public void setOldclLnShrBcActvHdr(Field source) {
   	replace(source,0,source.length(),oldclLnShrBcActvHdr.begin,oldclLnShrBcActvHdr.length());
   }  
   
     /**
	 * 	Update OldclLnShrBcActvHdr 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setOldclLnShrBcActvHdr(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,oldclLnShrBcActvHdr.begin,oldclLnShrBcActvHdr.length());
   }
   
     /**
	 * 	Update OldclLnShrBcActvHdr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOldclLnShrBcActvHdr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,oldclLnShrBcActvHdr.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of oldclLnShrBcActvTlr
	 *	@return oldclLnShrBcActvTlr
	 */   
	 public OldclLnShrBcActvTlr getOldclLnShrBcActvTlr() {
   	return oldclLnShrBcActvTlr;
   }
   /**
	* 	Update OldclLnShrBcActvTlr with the passed value
	*   Corresponding COBOL Variable is OLDCL-LN-SHR-BC-ACTV-TLR
	*	@param value
	*/
   public void setOldclLnShrBcActvTlr(char[] value) {
      oldclLnShrBcActvTlr.setString(value); 
   }   
    
     /**
	 * 	Update OldclLnShrBcActvTlr 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setOldclLnShrBcActvTlr(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,oldclLnShrBcActvTlr.begin,oldclLnShrBcActvTlr.length());
   }
   
     /**
	 * 	Update OldclLnShrBcActvTlr 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOldclLnShrBcActvTlr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,oldclLnShrBcActvTlr.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update OldclLnShrBcActvTlr with another Field
	 *	@param value
	 */
   public void setOldclLnShrBcActvTlr(Field source) {
   	replace(source,0,source.length(),oldclLnShrBcActvTlr.begin,oldclLnShrBcActvTlr.length());
   }  
   
     /**
	 * 	Update OldclLnShrBcActvTlr 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setOldclLnShrBcActvTlr(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,oldclLnShrBcActvTlr.begin,oldclLnShrBcActvTlr.length());
   }
   
     /**
	 * 	Update OldclLnShrBcActvTlr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOldclLnShrBcActvTlr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,oldclLnShrBcActvTlr.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getOldclLnShrBcActvDataFieldLength() {
			return OLDCL_LN_SHR_BC_ACTV_DATA_LENGTH;
		}

}
  
