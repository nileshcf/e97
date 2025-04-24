package com.cloudframe.app.cfdate02.file.records;

/**
*  The class FlguuInEocUsgBlData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:43. using version 5.0.0.254
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FlguuInEocUsgBlData extends FlguuInEocUsgBlDataSerialized { 
   
				private FlguuInEocUsgBlDtl flguuInEocUsgBlDtl = new FlguuInEocUsgBlDtl();
				private FlguuInEocUsgBlHdr flguuInEocUsgBlHdr = new FlguuInEocUsgBlHdr();
				private FlguuInEocUsgBlTlr flguuInEocUsgBlTlr = new FlguuInEocUsgBlTlr();
	
	/**
	* Constructor for FlguuInEocUsgBlData
	**/
    public FlguuInEocUsgBlData() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			flguuInEocUsgBlDtl.setParent(this,getStartOffset() + 0);
	       			flguuInEocUsgBlHdr.setParent(this,getStartOffset() + 0);
	       			flguuInEocUsgBlTlr.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of flguuInEocUsgBlDtl
	 *	@return flguuInEocUsgBlDtl
	 */   
	 public FlguuInEocUsgBlDtl getFlguuInEocUsgBlDtl() {
   	return flguuInEocUsgBlDtl;
   }
   /**
	* 	Update FlguuInEocUsgBlDtl with the passed value
	*   Corresponding COBOL Variable is FLGUU-IN-EOC-USG-BL-DTL
	*	@param value
	*/
   public void setFlguuInEocUsgBlDtl(char[] value) {
      flguuInEocUsgBlDtl.setString(value); 
   }   
    
     /**
	 * 	Update FlguuInEocUsgBlDtl 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setFlguuInEocUsgBlDtl(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,flguuInEocUsgBlDtl.begin,flguuInEocUsgBlDtl.length());
   }
   
     /**
	 * 	Update FlguuInEocUsgBlDtl 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFlguuInEocUsgBlDtl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,flguuInEocUsgBlDtl.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update FlguuInEocUsgBlDtl with another Field
	 *	@param value
	 */
   public void setFlguuInEocUsgBlDtl(Field source) {
   	replace(source,0,source.length(),flguuInEocUsgBlDtl.begin,flguuInEocUsgBlDtl.length());
   }  
   
     /**
	 * 	Update FlguuInEocUsgBlDtl 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setFlguuInEocUsgBlDtl(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,flguuInEocUsgBlDtl.begin,flguuInEocUsgBlDtl.length());
   }
   
     /**
	 * 	Update FlguuInEocUsgBlDtl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFlguuInEocUsgBlDtl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,flguuInEocUsgBlDtl.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of flguuInEocUsgBlHdr
	 *	@return flguuInEocUsgBlHdr
	 */   
	 public FlguuInEocUsgBlHdr getFlguuInEocUsgBlHdr() {
   	return flguuInEocUsgBlHdr;
   }
   /**
	* 	Update FlguuInEocUsgBlHdr with the passed value
	*   Corresponding COBOL Variable is FLGUU-IN-EOC-USG-BL-HDR
	*	@param value
	*/
   public void setFlguuInEocUsgBlHdr(char[] value) {
      flguuInEocUsgBlHdr.setString(value); 
   }   
    
     /**
	 * 	Update FlguuInEocUsgBlHdr 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setFlguuInEocUsgBlHdr(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,flguuInEocUsgBlHdr.begin,flguuInEocUsgBlHdr.length());
   }
   
     /**
	 * 	Update FlguuInEocUsgBlHdr 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFlguuInEocUsgBlHdr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,flguuInEocUsgBlHdr.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update FlguuInEocUsgBlHdr with another Field
	 *	@param value
	 */
   public void setFlguuInEocUsgBlHdr(Field source) {
   	replace(source,0,source.length(),flguuInEocUsgBlHdr.begin,flguuInEocUsgBlHdr.length());
   }  
   
     /**
	 * 	Update FlguuInEocUsgBlHdr 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setFlguuInEocUsgBlHdr(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,flguuInEocUsgBlHdr.begin,flguuInEocUsgBlHdr.length());
   }
   
     /**
	 * 	Update FlguuInEocUsgBlHdr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFlguuInEocUsgBlHdr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,flguuInEocUsgBlHdr.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of flguuInEocUsgBlTlr
	 *	@return flguuInEocUsgBlTlr
	 */   
	 public FlguuInEocUsgBlTlr getFlguuInEocUsgBlTlr() {
   	return flguuInEocUsgBlTlr;
   }
   /**
	* 	Update FlguuInEocUsgBlTlr with the passed value
	*   Corresponding COBOL Variable is FLGUU-IN-EOC-USG-BL-TLR
	*	@param value
	*/
   public void setFlguuInEocUsgBlTlr(char[] value) {
      flguuInEocUsgBlTlr.setString(value); 
   }   
    
     /**
	 * 	Update FlguuInEocUsgBlTlr 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setFlguuInEocUsgBlTlr(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,flguuInEocUsgBlTlr.begin,flguuInEocUsgBlTlr.length());
   }
   
     /**
	 * 	Update FlguuInEocUsgBlTlr 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFlguuInEocUsgBlTlr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,flguuInEocUsgBlTlr.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update FlguuInEocUsgBlTlr with another Field
	 *	@param value
	 */
   public void setFlguuInEocUsgBlTlr(Field source) {
   	replace(source,0,source.length(),flguuInEocUsgBlTlr.begin,flguuInEocUsgBlTlr.length());
   }  
   
     /**
	 * 	Update FlguuInEocUsgBlTlr 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setFlguuInEocUsgBlTlr(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,flguuInEocUsgBlTlr.begin,flguuInEocUsgBlTlr.length());
   }
   
     /**
	 * 	Update FlguuInEocUsgBlTlr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFlguuInEocUsgBlTlr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,flguuInEocUsgBlTlr.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getFlguuInEocUsgBlDataFieldLength() {
			return FLGUU_IN_EOC_USG_BL_DATA_LENGTH;
		}

}
  
