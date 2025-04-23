package com.cloudframe.app.sf320010.file.records;

/**
*  The class SdSortKey2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:12. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SdSortKey2 extends SdSortKey2Serialized { 
   

						private char[] sdSk2RemMipId = Field.fillLowValue(3);

						private char[] sdSk2OperatorId = Field.fillLowValue(7);

						private char[] sdSk2TimeStamp = Field.fillLowValue(6);

						private char[] sdSk2DateStamp = Field.fillLowValue(6);
	
	/**
	* Constructor for SdSortKey2
	**/
    public SdSortKey2() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SdSortKey2. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SdSortKey2(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sdSk2RemMipId
	 *	@return sdSk2RemMipId
	 */
   public char[] getSdSk2RemMipId() throws CFException{
     if (isSdSk2RemMipIdModified()) { 
        sdSk2RemMipId = refreshSdSk2RemMipId();
     }
   		return sdSk2RemMipId;
   }

  
	/**
	*  set variable sdSk2RemMipId
	*  Corresponding COBOL Variable is SD-SK2-REM-MIP-ID
	*  @param value
	**/
   public void setSdSk2RemMipId(char[] value) {
      sdSk2RemMipId = checkSdSk2RemMipIdConstraints(value);
      serializeSdSk2RemMipId(sdSk2RemMipId);
   } 

     /**
	 * 	Update SdSk2RemMipId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSdSk2RemMipId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSdSk2RemMipId,sdSk2RemMipId.length);
   	
   }
   
   public void setSdSk2RemMipId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSdSk2RemMipId,sdSk2RemMipId.length);
   	
   }
   
     /**
	 * 	Update SdSk2RemMipId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSdSk2RemMipId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSdSk2RemMipId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SdSk2RemMipId with another Field
	 *	@param value
	 */
   public void setSdSk2RemMipId(Field source) {
       replace(source,0,source.length(),beginSdSk2RemMipId,SD_SK_2_REM_MIP_ID_LEN);
   	
   }  
   
     /**
	 * 	Update SdSk2RemMipId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSdSk2RemMipId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSdSk2RemMipId,SD_SK_2_REM_MIP_ID_LEN);
   	
   }
   
     /**
	 * 	Update SdSk2RemMipId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSdSk2RemMipId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSdSk2RemMipId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sdSk2OperatorId
	 *	@return sdSk2OperatorId
	 */
   public char[] getSdSk2OperatorId() throws CFException{
     if (isSdSk2OperatorIdModified()) { 
        sdSk2OperatorId = refreshSdSk2OperatorId();
     }
   		return sdSk2OperatorId;
   }

  
	/**
	*  set variable sdSk2OperatorId
	*  Corresponding COBOL Variable is SD-SK2-OPERATOR-ID
	*  @param value
	**/
   public void setSdSk2OperatorId(char[] value) {
      sdSk2OperatorId = checkSdSk2OperatorIdConstraints(value);
      serializeSdSk2OperatorId(sdSk2OperatorId);
   } 

     /**
	 * 	Update SdSk2OperatorId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSdSk2OperatorId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSdSk2OperatorId,sdSk2OperatorId.length);
   	
   }
   
   public void setSdSk2OperatorId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSdSk2OperatorId,sdSk2OperatorId.length);
   	
   }
   
     /**
	 * 	Update SdSk2OperatorId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSdSk2OperatorId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSdSk2OperatorId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SdSk2OperatorId with another Field
	 *	@param value
	 */
   public void setSdSk2OperatorId(Field source) {
       replace(source,0,source.length(),beginSdSk2OperatorId,SD_SK_2_OPERATOR_ID_LEN);
   	
   }  
   
     /**
	 * 	Update SdSk2OperatorId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSdSk2OperatorId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSdSk2OperatorId,SD_SK_2_OPERATOR_ID_LEN);
   	
   }
   
     /**
	 * 	Update SdSk2OperatorId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSdSk2OperatorId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSdSk2OperatorId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sdSk2TimeStamp
	 *	@return sdSk2TimeStamp
	 */
   public char[] getSdSk2TimeStamp() throws CFException{
     if (isSdSk2TimeStampModified()) { 
        sdSk2TimeStamp = refreshSdSk2TimeStamp();
     }
   		return sdSk2TimeStamp;
   }

  
	/**
	*  set variable sdSk2TimeStamp
	*  Corresponding COBOL Variable is SD-SK2-TIME-STAMP
	*  @param value
	**/
   public void setSdSk2TimeStamp(char[] value) {
      sdSk2TimeStamp = checkSdSk2TimeStampConstraints(value);
      serializeSdSk2TimeStamp(sdSk2TimeStamp);
   } 

     /**
	 * 	Update SdSk2TimeStamp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSdSk2TimeStamp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSdSk2TimeStamp,sdSk2TimeStamp.length);
   	
   }
   
   public void setSdSk2TimeStamp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSdSk2TimeStamp,sdSk2TimeStamp.length);
   	
   }
   
     /**
	 * 	Update SdSk2TimeStamp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSdSk2TimeStamp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSdSk2TimeStamp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SdSk2TimeStamp with another Field
	 *	@param value
	 */
   public void setSdSk2TimeStamp(Field source) {
       replace(source,0,source.length(),beginSdSk2TimeStamp,SD_SK_2_TIME_STAMP_LEN);
   	
   }  
   
     /**
	 * 	Update SdSk2TimeStamp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSdSk2TimeStamp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSdSk2TimeStamp,SD_SK_2_TIME_STAMP_LEN);
   	
   }
   
     /**
	 * 	Update SdSk2TimeStamp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSdSk2TimeStamp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSdSk2TimeStamp+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sdSk2DateStamp
	 *	@return sdSk2DateStamp
	 */
   public char[] getSdSk2DateStamp() throws CFException{
     if (isSdSk2DateStampModified()) { 
        sdSk2DateStamp = refreshSdSk2DateStamp();
     }
   		return sdSk2DateStamp;
   }

  
	/**
	*  set variable sdSk2DateStamp
	*  Corresponding COBOL Variable is SD-SK2-DATE-STAMP
	*  @param value
	**/
   public void setSdSk2DateStamp(char[] value) {
      sdSk2DateStamp = checkSdSk2DateStampConstraints(value);
      serializeSdSk2DateStamp(sdSk2DateStamp);
   } 

     /**
	 * 	Update SdSk2DateStamp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSdSk2DateStamp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSdSk2DateStamp,sdSk2DateStamp.length);
   	
   }
   
   public void setSdSk2DateStamp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSdSk2DateStamp,sdSk2DateStamp.length);
   	
   }
   
     /**
	 * 	Update SdSk2DateStamp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSdSk2DateStamp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSdSk2DateStamp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SdSk2DateStamp with another Field
	 *	@param value
	 */
   public void setSdSk2DateStamp(Field source) {
       replace(source,0,source.length(),beginSdSk2DateStamp,SD_SK_2_DATE_STAMP_LEN);
   	
   }  
   
     /**
	 * 	Update SdSk2DateStamp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSdSk2DateStamp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSdSk2DateStamp,SD_SK_2_DATE_STAMP_LEN);
   	
   }
   
     /**
	 * 	Update SdSk2DateStamp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSdSk2DateStamp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSdSk2DateStamp+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSdSortKey2FieldLength() {
			return SD_SORT_KEY_2_LENGTH;
		}

}
  
