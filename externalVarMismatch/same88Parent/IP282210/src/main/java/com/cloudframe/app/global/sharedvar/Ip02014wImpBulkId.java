package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02014wImpBulkId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:30. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip02014wImpBulkId extends Ip02014wImpBulkIdSerialized { 
   

						private char[] ip02014wBulkFileProcCd = Field.fillLowValue(1);

						private char[] ip02014wBulkFileTypeCd = Field.fillLowValue(3);
	
	/**
	* Constructor for Ip02014wImpBulkId
	**/
    public Ip02014wImpBulkId() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip02014wImpBulkId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02014wImpBulkId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip02014wBulkFileProcCd
	 *	@return ip02014wBulkFileProcCd
	 */
   public char[] getIp02014wBulkFileProcCd() throws CFException{
     if (isIp02014wBulkFileProcCdModified()) { 
        ip02014wBulkFileProcCd = refreshIp02014wBulkFileProcCd();
     }
   		return ip02014wBulkFileProcCd;
   }

  
	/**
	*  set variable ip02014wBulkFileProcCd
	*  Corresponding COBOL Variable is IP02014W-BULK-FILE-PROC-CD
	*  @param value
	**/
   public void setIp02014wBulkFileProcCd(char[] value) {
      ip02014wBulkFileProcCd = checkIp02014wBulkFileProcCdConstraints(value);
      serializeIp02014wBulkFileProcCd(ip02014wBulkFileProcCd);
   } 

     /**
	 * 	Update Ip02014wBulkFileProcCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wBulkFileProcCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014wBulkFileProcCd,ip02014wBulkFileProcCd.length);
   	
   }
   
   public void setIp02014wBulkFileProcCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wBulkFileProcCd,ip02014wBulkFileProcCd.length);
   	
   }
   
     /**
	 * 	Update Ip02014wBulkFileProcCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wBulkFileProcCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wBulkFileProcCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014wBulkFileProcCd with another Field
	 *	@param value
	 */
   public void setIp02014wBulkFileProcCd(Field source) {
       replace(source,0,source.length(),beginIp02014wBulkFileProcCd,IP_02014W_BULK_FILE_PROC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014wBulkFileProcCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wBulkFileProcCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014wBulkFileProcCd,IP_02014W_BULK_FILE_PROC_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014wBulkFileProcCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wBulkFileProcCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wBulkFileProcCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014wBulkFileTypeCd
	 *	@return ip02014wBulkFileTypeCd
	 */
   public char[] getIp02014wBulkFileTypeCd() throws CFException{
     if (isIp02014wBulkFileTypeCdModified()) { 
        ip02014wBulkFileTypeCd = refreshIp02014wBulkFileTypeCd();
     }
   		return ip02014wBulkFileTypeCd;
   }

  
	/**
	*  set variable ip02014wBulkFileTypeCd
	*  Corresponding COBOL Variable is IP02014W-BULK-FILE-TYPE-CD
	*  @param value
	**/
   public void setIp02014wBulkFileTypeCd(char[] value) {
      ip02014wBulkFileTypeCd = checkIp02014wBulkFileTypeCdConstraints(value);
      serializeIp02014wBulkFileTypeCd(ip02014wBulkFileTypeCd);
   } 

     /**
	 * 	Update Ip02014wBulkFileTypeCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wBulkFileTypeCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014wBulkFileTypeCd,ip02014wBulkFileTypeCd.length);
   	
   }
   
   public void setIp02014wBulkFileTypeCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wBulkFileTypeCd,ip02014wBulkFileTypeCd.length);
   	
   }
   
     /**
	 * 	Update Ip02014wBulkFileTypeCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wBulkFileTypeCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wBulkFileTypeCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014wBulkFileTypeCd with another Field
	 *	@param value
	 */
   public void setIp02014wBulkFileTypeCd(Field source) {
       replace(source,0,source.length(),beginIp02014wBulkFileTypeCd,IP_02014W_BULK_FILE_TYPE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014wBulkFileTypeCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wBulkFileTypeCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014wBulkFileTypeCd,IP_02014W_BULK_FILE_TYPE_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014wBulkFileTypeCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wBulkFileTypeCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wBulkFileTypeCd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip02014wImpBulkId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp02014wBulkFileProcCd(CONSTANTS.SPACE);
         setIp02014wBulkFileTypeCd(CONSTANTS.SPACE_3);
   }

		public static int getIp02014wImpBulkIdFieldLength() {
			return IP_02014W_IMP_BULK_ID_LENGTH;
		}

}
  
