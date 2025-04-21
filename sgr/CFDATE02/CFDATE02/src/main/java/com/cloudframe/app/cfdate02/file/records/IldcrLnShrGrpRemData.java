package com.cloudframe.app.cfdate02.file.records;

/**
*  The class IldcrLnShrGrpRemData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class IldcrLnShrGrpRemData extends IldcrLnShrGrpRemDataSerialized {
   
				private IldcrLnShrGrpRemDtl ildcrLnShrGrpRemDtl = new IldcrLnShrGrpRemDtl();
				private IldcrLnShrGrpRemHdr ildcrLnShrGrpRemHdr = new IldcrLnShrGrpRemHdr();
				private IldcrLnShrGrpRemTlr ildcrLnShrGrpRemTlr = new IldcrLnShrGrpRemTlr();
	
	/**
	* Constructor for IldcrLnShrGrpRemData
	**/
    public IldcrLnShrGrpRemData() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			ildcrLnShrGrpRemDtl.setParent(this,getStartOffset() + 0);
	       			ildcrLnShrGrpRemHdr.setParent(this,getStartOffset() + 0);
	       			ildcrLnShrGrpRemTlr.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ildcrLnShrGrpRemDtl
	 *	@return ildcrLnShrGrpRemDtl
	 */   
	 public IldcrLnShrGrpRemDtl getIldcrLnShrGrpRemDtl() {
   	return ildcrLnShrGrpRemDtl;
   }
   /**
	* 	Update IldcrLnShrGrpRemDtl with the passed value
	*   Corresponding COBOL Variable is ILDCR-LN-SHR-GRP-REM-DTL
	*	@param value
	*/
   public void setIldcrLnShrGrpRemDtl(char[] value) {
      ildcrLnShrGrpRemDtl.setString(value); 
   }   
    
     /**
	 * 	Update IldcrLnShrGrpRemDtl 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIldcrLnShrGrpRemDtl(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ildcrLnShrGrpRemDtl.begin,ildcrLnShrGrpRemDtl.length());
   }
   
     /**
	 * 	Update IldcrLnShrGrpRemDtl 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIldcrLnShrGrpRemDtl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ildcrLnShrGrpRemDtl.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update IldcrLnShrGrpRemDtl with another Field
	 *	@param value
	 */
   public void setIldcrLnShrGrpRemDtl(Field source) {
   	replace(source,0,source.length(),ildcrLnShrGrpRemDtl.begin,ildcrLnShrGrpRemDtl.length());
   }  
   
     /**
	 * 	Update IldcrLnShrGrpRemDtl 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIldcrLnShrGrpRemDtl(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ildcrLnShrGrpRemDtl.begin,ildcrLnShrGrpRemDtl.length());
   }
   
     /**
	 * 	Update IldcrLnShrGrpRemDtl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIldcrLnShrGrpRemDtl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ildcrLnShrGrpRemDtl.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ildcrLnShrGrpRemHdr
	 *	@return ildcrLnShrGrpRemHdr
	 */   
	 public IldcrLnShrGrpRemHdr getIldcrLnShrGrpRemHdr() {
   	return ildcrLnShrGrpRemHdr;
   }
   /**
	* 	Update IldcrLnShrGrpRemHdr with the passed value
	*   Corresponding COBOL Variable is ILDCR-LN-SHR-GRP-REM-HDR
	*	@param value
	*/
   public void setIldcrLnShrGrpRemHdr(char[] value) {
      ildcrLnShrGrpRemHdr.setString(value); 
   }   
    
     /**
	 * 	Update IldcrLnShrGrpRemHdr 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIldcrLnShrGrpRemHdr(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ildcrLnShrGrpRemHdr.begin,ildcrLnShrGrpRemHdr.length());
   }
   
     /**
	 * 	Update IldcrLnShrGrpRemHdr 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIldcrLnShrGrpRemHdr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ildcrLnShrGrpRemHdr.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update IldcrLnShrGrpRemHdr with another Field
	 *	@param value
	 */
   public void setIldcrLnShrGrpRemHdr(Field source) {
   	replace(source,0,source.length(),ildcrLnShrGrpRemHdr.begin,ildcrLnShrGrpRemHdr.length());
   }  
   
     /**
	 * 	Update IldcrLnShrGrpRemHdr 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIldcrLnShrGrpRemHdr(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ildcrLnShrGrpRemHdr.begin,ildcrLnShrGrpRemHdr.length());
   }
   
     /**
	 * 	Update IldcrLnShrGrpRemHdr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIldcrLnShrGrpRemHdr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ildcrLnShrGrpRemHdr.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ildcrLnShrGrpRemTlr
	 *	@return ildcrLnShrGrpRemTlr
	 */   
	 public IldcrLnShrGrpRemTlr getIldcrLnShrGrpRemTlr() {
   	return ildcrLnShrGrpRemTlr;
   }
   /**
	* 	Update IldcrLnShrGrpRemTlr with the passed value
	*   Corresponding COBOL Variable is ILDCR-LN-SHR-GRP-REM-TLR
	*	@param value
	*/
   public void setIldcrLnShrGrpRemTlr(char[] value) {
      ildcrLnShrGrpRemTlr.setString(value); 
   }   
    
     /**
	 * 	Update IldcrLnShrGrpRemTlr 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIldcrLnShrGrpRemTlr(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ildcrLnShrGrpRemTlr.begin,ildcrLnShrGrpRemTlr.length());
   }
   
     /**
	 * 	Update IldcrLnShrGrpRemTlr 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIldcrLnShrGrpRemTlr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ildcrLnShrGrpRemTlr.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update IldcrLnShrGrpRemTlr with another Field
	 *	@param value
	 */
   public void setIldcrLnShrGrpRemTlr(Field source) {
   	replace(source,0,source.length(),ildcrLnShrGrpRemTlr.begin,ildcrLnShrGrpRemTlr.length());
   }  
   
     /**
	 * 	Update IldcrLnShrGrpRemTlr 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIldcrLnShrGrpRemTlr(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ildcrLnShrGrpRemTlr.begin,ildcrLnShrGrpRemTlr.length());
   }
   
     /**
	 * 	Update IldcrLnShrGrpRemTlr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIldcrLnShrGrpRemTlr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ildcrLnShrGrpRemTlr.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getIldcrLnShrGrpRemDataFieldLength() {
			return ILDCR_LN_SHR_GRP_REM_DATA_LENGTH;
		}

}
  
