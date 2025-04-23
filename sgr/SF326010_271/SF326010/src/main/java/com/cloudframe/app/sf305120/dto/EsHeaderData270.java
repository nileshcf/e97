package com.cloudframe.app.sf305120.dto;

/**
*  The class EsHeaderData270 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class EsHeaderData270 extends EsHeaderData270Serialized {
   
				private EsVersion1270 esVersion1270 = new EsVersion1270();
				private EsVersion2270 esVersion2270 = new EsVersion2270();
				private EsVersion3270 esVersion3270 = new EsVersion3270();
	
	/**
	* Constructor for EsHeaderData270
	**/
    public EsHeaderData270() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			esVersion1270.setParent(this,getStartOffset() + 0);
	       			esVersion2270.setParent(this,getStartOffset() + 0);
	       			esVersion3270.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of esVersion1270
	 *	@return esVersion1270
	 */   
	 public EsVersion1270 getEsVersion1270() {
   	return esVersion1270;
   }
   /**
	* 	Update EsVersion1270 with the passed value
	*   Corresponding COBOL Variable is 270-ES-VERSION-1
	*	@param value
	*/
   public void setEsVersion1270(char[] value) {
      esVersion1270.setString(value); 
   }   
    
     /**
	 * 	Update EsVersion1270 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setEsVersion1270(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,esVersion1270.begin,esVersion1270.length());
   }
   
     /**
	 * 	Update EsVersion1270 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsVersion1270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,esVersion1270.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update EsVersion1270 with another Field
	 *	@param value
	 */
   public void setEsVersion1270(Field source) {
   	replace(source,0,source.length(),esVersion1270.begin,esVersion1270.length());
   }  
   
     /**
	 * 	Update EsVersion1270 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setEsVersion1270(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,esVersion1270.begin,esVersion1270.length());
   }
   
     /**
	 * 	Update EsVersion1270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsVersion1270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,esVersion1270.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of esVersion2270
	 *	@return esVersion2270
	 */   
	 public EsVersion2270 getEsVersion2270() {
   	return esVersion2270;
   }
   /**
	* 	Update EsVersion2270 with the passed value
	*   Corresponding COBOL Variable is 270-ES-VERSION-2
	*	@param value
	*/
   public void setEsVersion2270(char[] value) {
      esVersion2270.setString(value); 
   }   
    
     /**
	 * 	Update EsVersion2270 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setEsVersion2270(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,esVersion2270.begin,esVersion2270.length());
   }
   
     /**
	 * 	Update EsVersion2270 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsVersion2270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,esVersion2270.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update EsVersion2270 with another Field
	 *	@param value
	 */
   public void setEsVersion2270(Field source) {
   	replace(source,0,source.length(),esVersion2270.begin,esVersion2270.length());
   }  
   
     /**
	 * 	Update EsVersion2270 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setEsVersion2270(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,esVersion2270.begin,esVersion2270.length());
   }
   
     /**
	 * 	Update EsVersion2270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsVersion2270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,esVersion2270.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of esVersion3270
	 *	@return esVersion3270
	 */   
	 public EsVersion3270 getEsVersion3270() {
   	return esVersion3270;
   }
   /**
	* 	Update EsVersion3270 with the passed value
	*   Corresponding COBOL Variable is 270-ES-VERSION-3
	*	@param value
	*/
   public void setEsVersion3270(char[] value) {
      esVersion3270.setString(value); 
   }   
    
     /**
	 * 	Update EsVersion3270 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setEsVersion3270(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,esVersion3270.begin,esVersion3270.length());
   }
   
     /**
	 * 	Update EsVersion3270 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsVersion3270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,esVersion3270.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update EsVersion3270 with another Field
	 *	@param value
	 */
   public void setEsVersion3270(Field source) {
   	replace(source,0,source.length(),esVersion3270.begin,esVersion3270.length());
   }  
   
     /**
	 * 	Update EsVersion3270 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setEsVersion3270(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,esVersion3270.begin,esVersion3270.length());
   }
   
     /**
	 * 	Update EsVersion3270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsVersion3270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,esVersion3270.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getEsHeaderData270FieldLength() {
			return ES_HEADER_DATA_270_LENGTH;
		}

}
  
