package com.cloudframe.app.sf320010.file.records;

/**
*  The class SdSortWorkFileRcd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:20. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SdSortWorkFileRcd extends SdSortWorkFileRcdSerialized {
   
				private SdSortKey sdSortKey = new SdSortKey();

						private char[] sdSortClass = Field.fillLowValue(1);
				private SdSortKey2 sdSortKey2 = new SdSortKey2();
	
	/**
	* Constructor for SdSortWorkFileRcd
	**/
    public SdSortWorkFileRcd() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			sdSortKey.setParent(this,getStartOffset() + 0);
	       			sdSortKey2.setParent(this,getStartOffset() + 18);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sdSortKey
	 *	@return sdSortKey
	 */   
	 public SdSortKey getSdSortKey() {
   	return sdSortKey;
   }
   /**
	* 	Update SdSortKey with the passed value
	*   Corresponding COBOL Variable is SD-SORT-KEY
	*	@param value
	*/
   public void setSdSortKey(char[] value) {
      sdSortKey.setString(value); 
   }   
    
     /**
	 * 	Update SdSortKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSdSortKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sdSortKey.begin,sdSortKey.length());
   }
   
     /**
	 * 	Update SdSortKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSdSortKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sdSortKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SdSortKey with another Field
	 *	@param value
	 */
   public void setSdSortKey(Field source) {
   	replace(source,0,source.length(),sdSortKey.begin,sdSortKey.length());
   }  
   
     /**
	 * 	Update SdSortKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSdSortKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sdSortKey.begin,sdSortKey.length());
   }
   
     /**
	 * 	Update SdSortKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSdSortKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sdSortKey.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sdSortClass
	 *	@return sdSortClass
	 */
   public char[] getSdSortClass() throws CFException{
     if (isSdSortClassModified()) { 
        sdSortClass = refreshSdSortClass();
     }
   		return sdSortClass;
   }

  
	/**
	*  set variable sdSortClass
	*  Corresponding COBOL Variable is SD-SORT-CLASS
	*  @param value
	**/
   public void setSdSortClass(char[] value) {
      sdSortClass = checkSdSortClassConstraints(value);
      serializeSdSortClass(sdSortClass);
   } 

     /**
	 * 	Update SdSortClass 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSdSortClass(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSdSortClass,sdSortClass.length);
   	
   }
   
   public void setSdSortClass(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSdSortClass,sdSortClass.length);
   	
   }
   
     /**
	 * 	Update SdSortClass 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSdSortClass(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSdSortClass+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SdSortClass with another Field
	 *	@param value
	 */
   public void setSdSortClass(Field source) {
       replace(source,0,source.length(),beginSdSortClass,SD_SORT_CLASS_LEN);
   	
   }  
   
     /**
	 * 	Update SdSortClass 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSdSortClass(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSdSortClass,SD_SORT_CLASS_LEN);
   	
   }
   
     /**
	 * 	Update SdSortClass 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSdSortClass(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSdSortClass+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sdSortKey2
	 *	@return sdSortKey2
	 */   
	 public SdSortKey2 getSdSortKey2() {
   	return sdSortKey2;
   }
   /**
	* 	Update SdSortKey2 with the passed value
	*   Corresponding COBOL Variable is SD-SORT-KEY-2
	*	@param value
	*/
   public void setSdSortKey2(char[] value) {
      sdSortKey2.setString(value); 
   }   
    
     /**
	 * 	Update SdSortKey2 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSdSortKey2(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sdSortKey2.begin,sdSortKey2.length());
   }
   
     /**
	 * 	Update SdSortKey2 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSdSortKey2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sdSortKey2.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SdSortKey2 with another Field
	 *	@param value
	 */
   public void setSdSortKey2(Field source) {
   	replace(source,0,source.length(),sdSortKey2.begin,sdSortKey2.length());
   }  
   
     /**
	 * 	Update SdSortKey2 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSdSortKey2(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sdSortKey2.begin,sdSortKey2.length());
   }
   
     /**
	 * 	Update SdSortKey2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSdSortKey2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sdSortKey2.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getSdSortWorkFileRcdFieldLength() {
			return SD_SORT_WORK_FILE_RCD_LENGTH;
		}

}
  
