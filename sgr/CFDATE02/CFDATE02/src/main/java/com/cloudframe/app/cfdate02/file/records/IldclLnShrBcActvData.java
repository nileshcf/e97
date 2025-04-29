package com.cloudframe.app.cfdate02.file.records;

/**
*  The class IldclLnShrBcActvData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class IldclLnShrBcActvData extends IldclLnShrBcActvDataSerialized {
   
				private IldclLnShrBcActvDtl ildclLnShrBcActvDtl = new IldclLnShrBcActvDtl();
				private IldclLnShrBcActvHdr ildclLnShrBcActvHdr = new IldclLnShrBcActvHdr();
				private IldclLnShrBcActvTlr ildclLnShrBcActvTlr = new IldclLnShrBcActvTlr();
	
	/**
	* Constructor for IldclLnShrBcActvData
	**/
    public IldclLnShrBcActvData() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			ildclLnShrBcActvDtl.setParent(this,getStartOffset() + 0);
	       			ildclLnShrBcActvHdr.setParent(this,getStartOffset() + 0);
	       			ildclLnShrBcActvTlr.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ildclLnShrBcActvDtl
	 *	@return ildclLnShrBcActvDtl
	 */   
	 public IldclLnShrBcActvDtl getIldclLnShrBcActvDtl() {
   	return ildclLnShrBcActvDtl;
   }
   /**
	* 	Update IldclLnShrBcActvDtl with the passed value
	*   Corresponding COBOL Variable is ILDCL-LN-SHR-BC-ACTV-DTL
	*	@param value
	*/
   public void setIldclLnShrBcActvDtl(char[] value) {
      ildclLnShrBcActvDtl.setString(value); 
   }   
    
     /**
	 * 	Update IldclLnShrBcActvDtl 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIldclLnShrBcActvDtl(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ildclLnShrBcActvDtl.begin,ildclLnShrBcActvDtl.length());
   }
   
     /**
	 * 	Update IldclLnShrBcActvDtl 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIldclLnShrBcActvDtl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ildclLnShrBcActvDtl.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update IldclLnShrBcActvDtl with another Field
	 *	@param value
	 */
   public void setIldclLnShrBcActvDtl(Field source) {
   	replace(source,0,source.length(),ildclLnShrBcActvDtl.begin,ildclLnShrBcActvDtl.length());
   }  
   
     /**
	 * 	Update IldclLnShrBcActvDtl 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIldclLnShrBcActvDtl(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ildclLnShrBcActvDtl.begin,ildclLnShrBcActvDtl.length());
   }
   
     /**
	 * 	Update IldclLnShrBcActvDtl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIldclLnShrBcActvDtl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ildclLnShrBcActvDtl.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ildclLnShrBcActvHdr
	 *	@return ildclLnShrBcActvHdr
	 */   
	 public IldclLnShrBcActvHdr getIldclLnShrBcActvHdr() {
   	return ildclLnShrBcActvHdr;
   }
   /**
	* 	Update IldclLnShrBcActvHdr with the passed value
	*   Corresponding COBOL Variable is ILDCL-LN-SHR-BC-ACTV-HDR
	*	@param value
	*/
   public void setIldclLnShrBcActvHdr(char[] value) {
      ildclLnShrBcActvHdr.setString(value); 
   }   
    
     /**
	 * 	Update IldclLnShrBcActvHdr 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIldclLnShrBcActvHdr(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ildclLnShrBcActvHdr.begin,ildclLnShrBcActvHdr.length());
   }
   
     /**
	 * 	Update IldclLnShrBcActvHdr 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIldclLnShrBcActvHdr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ildclLnShrBcActvHdr.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update IldclLnShrBcActvHdr with another Field
	 *	@param value
	 */
   public void setIldclLnShrBcActvHdr(Field source) {
   	replace(source,0,source.length(),ildclLnShrBcActvHdr.begin,ildclLnShrBcActvHdr.length());
   }  
   
     /**
	 * 	Update IldclLnShrBcActvHdr 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIldclLnShrBcActvHdr(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ildclLnShrBcActvHdr.begin,ildclLnShrBcActvHdr.length());
   }
   
     /**
	 * 	Update IldclLnShrBcActvHdr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIldclLnShrBcActvHdr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ildclLnShrBcActvHdr.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ildclLnShrBcActvTlr
	 *	@return ildclLnShrBcActvTlr
	 */   
	 public IldclLnShrBcActvTlr getIldclLnShrBcActvTlr() {
   	return ildclLnShrBcActvTlr;
   }
   /**
	* 	Update IldclLnShrBcActvTlr with the passed value
	*   Corresponding COBOL Variable is ILDCL-LN-SHR-BC-ACTV-TLR
	*	@param value
	*/
   public void setIldclLnShrBcActvTlr(char[] value) {
      ildclLnShrBcActvTlr.setString(value); 
   }   
    
     /**
	 * 	Update IldclLnShrBcActvTlr 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIldclLnShrBcActvTlr(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ildclLnShrBcActvTlr.begin,ildclLnShrBcActvTlr.length());
   }
   
     /**
	 * 	Update IldclLnShrBcActvTlr 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIldclLnShrBcActvTlr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ildclLnShrBcActvTlr.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update IldclLnShrBcActvTlr with another Field
	 *	@param value
	 */
   public void setIldclLnShrBcActvTlr(Field source) {
   	replace(source,0,source.length(),ildclLnShrBcActvTlr.begin,ildclLnShrBcActvTlr.length());
   }  
   
     /**
	 * 	Update IldclLnShrBcActvTlr 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIldclLnShrBcActvTlr(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ildclLnShrBcActvTlr.begin,ildclLnShrBcActvTlr.length());
   }
   
     /**
	 * 	Update IldclLnShrBcActvTlr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIldclLnShrBcActvTlr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ildclLnShrBcActvTlr.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getIldclLnShrBcActvDataFieldLength() {
			return ILDCL_LN_SHR_BC_ACTV_DATA_LENGTH;
		}

}
  
