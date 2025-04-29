package com.cloudframe.app.sf320010.file.records;

/**
*  The class SdSortKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:37. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SdSortKey extends SdSortKeySerialized { 
   

						private char[] sdSortId = Field.fillLowValue(3);

						private char[] sdSortCc = Field.fillLowValue(2);

						private char[] sdSortDate = Field.fillLowValue(6);

						private char[] sdSortTime = Field.fillLowValue(6);
	
	/**
	* Constructor for SdSortKey
	**/
    public SdSortKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SdSortKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SdSortKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sdSortId
	 *	@return sdSortId
	 */
   public char[] getSdSortId() throws CFException{
     if (isSdSortIdModified()) { 
        sdSortId = refreshSdSortId();
     }
   		return sdSortId;
   }

  
	/**
	*  set variable sdSortId
	*  Corresponding COBOL Variable is SD-SORT-ID
	*  @param value
	**/
   public void setSdSortId(char[] value) {
      sdSortId = checkSdSortIdConstraints(value);
      serializeSdSortId(sdSortId);
   } 

     /**
	 * 	Update SdSortId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSdSortId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSdSortId,sdSortId.length);
   	
   }
   
   public void setSdSortId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSdSortId,sdSortId.length);
   	
   }
   
     /**
	 * 	Update SdSortId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSdSortId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSdSortId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SdSortId with another Field
	 *	@param value
	 */
   public void setSdSortId(Field source) {
       replace(source,0,source.length(),beginSdSortId,SD_SORT_ID_LEN);
   	
   }  
   
     /**
	 * 	Update SdSortId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSdSortId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSdSortId,SD_SORT_ID_LEN);
   	
   }
   
     /**
	 * 	Update SdSortId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSdSortId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSdSortId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sdSortCc
	 *	@return sdSortCc
	 */
   public char[] getSdSortCc() throws CFException{
     if (isSdSortCcModified()) { 
        sdSortCc = refreshSdSortCc();
     }
   		return sdSortCc;
   }

  
	/**
	*  set variable sdSortCc
	*  Corresponding COBOL Variable is SD-SORT-CC
	*  @param value
	**/
   public void setSdSortCc(char[] value) {
      sdSortCc = checkSdSortCcConstraints(value);
      serializeSdSortCc(sdSortCc);
   } 

     /**
	 * 	Update SdSortCc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSdSortCc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSdSortCc,sdSortCc.length);
   	
   }
   
   public void setSdSortCc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSdSortCc,sdSortCc.length);
   	
   }
   
     /**
	 * 	Update SdSortCc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSdSortCc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSdSortCc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SdSortCc with another Field
	 *	@param value
	 */
   public void setSdSortCc(Field source) {
       replace(source,0,source.length(),beginSdSortCc,SD_SORT_CC_LEN);
   	
   }  
   
     /**
	 * 	Update SdSortCc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSdSortCc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSdSortCc,SD_SORT_CC_LEN);
   	
   }
   
     /**
	 * 	Update SdSortCc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSdSortCc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSdSortCc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sdSortDate
	 *	@return sdSortDate
	 */
   public char[] getSdSortDate() throws CFException{
     if (isSdSortDateModified()) { 
        sdSortDate = refreshSdSortDate();
     }
   		return sdSortDate;
   }

  
	/**
	*  set variable sdSortDate
	*  Corresponding COBOL Variable is SD-SORT-DATE
	*  @param value
	**/
   public void setSdSortDate(char[] value) {
      sdSortDate = checkSdSortDateConstraints(value);
      serializeSdSortDate(sdSortDate);
   } 

     /**
	 * 	Update SdSortDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSdSortDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSdSortDate,sdSortDate.length);
   	
   }
   
   public void setSdSortDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSdSortDate,sdSortDate.length);
   	
   }
   
     /**
	 * 	Update SdSortDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSdSortDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSdSortDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SdSortDate with another Field
	 *	@param value
	 */
   public void setSdSortDate(Field source) {
       replace(source,0,source.length(),beginSdSortDate,SD_SORT_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update SdSortDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSdSortDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSdSortDate,SD_SORT_DATE_LEN);
   	
   }
   
     /**
	 * 	Update SdSortDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSdSortDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSdSortDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sdSortTime
	 *	@return sdSortTime
	 */
   public char[] getSdSortTime() throws CFException{
     if (isSdSortTimeModified()) { 
        sdSortTime = refreshSdSortTime();
     }
   		return sdSortTime;
   }

  
	/**
	*  set variable sdSortTime
	*  Corresponding COBOL Variable is SD-SORT-TIME
	*  @param value
	**/
   public void setSdSortTime(char[] value) {
      sdSortTime = checkSdSortTimeConstraints(value);
      serializeSdSortTime(sdSortTime);
   } 

     /**
	 * 	Update SdSortTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSdSortTime(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSdSortTime,sdSortTime.length);
   	
   }
   
   public void setSdSortTime(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSdSortTime,sdSortTime.length);
   	
   }
   
     /**
	 * 	Update SdSortTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSdSortTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSdSortTime+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SdSortTime with another Field
	 *	@param value
	 */
   public void setSdSortTime(Field source) {
       replace(source,0,source.length(),beginSdSortTime,SD_SORT_TIME_LEN);
   	
   }  
   
     /**
	 * 	Update SdSortTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSdSortTime(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSdSortTime,SD_SORT_TIME_LEN);
   	
   }
   
     /**
	 * 	Update SdSortTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSdSortTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSdSortTime+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSdSortKeyFieldLength() {
			return SD_SORT_KEY_LENGTH;
		}

}
  
