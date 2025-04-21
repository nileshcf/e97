package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02014ImpBulkId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip02014ImpBulkId extends Ip02014ImpBulkIdSerialized { 
   

						private char[] ip02014BulkFileProcCd = Field.fillLowValue(1);

						private char[] ip02014BulkFileTypeCd = Field.fillLowValue(3);
	
	/**
	* Constructor for Ip02014ImpBulkId
	**/
    public Ip02014ImpBulkId() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip02014ImpBulkId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02014ImpBulkId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip02014BulkFileProcCd
	 *	@return ip02014BulkFileProcCd
	 */
   public char[] getIp02014BulkFileProcCd() throws CFException{
     if (isIp02014BulkFileProcCdModified()) { 
        ip02014BulkFileProcCd = refreshIp02014BulkFileProcCd();
     }
   		return ip02014BulkFileProcCd;
   }

  
	/**
	*  set variable ip02014BulkFileProcCd
	*  Corresponding COBOL Variable is IP02014-BULK-FILE-PROC-CD
	*  @param value
	**/
   public void setIp02014BulkFileProcCd(char[] value) {
      ip02014BulkFileProcCd = checkIp02014BulkFileProcCdConstraints(value);
      serializeIp02014BulkFileProcCd(ip02014BulkFileProcCd);
   } 

     /**
	 * 	Update Ip02014BulkFileProcCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014BulkFileProcCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014BulkFileProcCd,ip02014BulkFileProcCd.length);
   	
   }
   
   public void setIp02014BulkFileProcCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014BulkFileProcCd,ip02014BulkFileProcCd.length);
   	
   }
   
     /**
	 * 	Update Ip02014BulkFileProcCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014BulkFileProcCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014BulkFileProcCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014BulkFileProcCd with another Field
	 *	@param value
	 */
   public void setIp02014BulkFileProcCd(Field source) {
       replace(source,0,source.length(),beginIp02014BulkFileProcCd,IP_02014_BULK_FILE_PROC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014BulkFileProcCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014BulkFileProcCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014BulkFileProcCd,IP_02014_BULK_FILE_PROC_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014BulkFileProcCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014BulkFileProcCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014BulkFileProcCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014BulkFileTypeCd
	 *	@return ip02014BulkFileTypeCd
	 */
   public char[] getIp02014BulkFileTypeCd() throws CFException{
     if (isIp02014BulkFileTypeCdModified()) { 
        ip02014BulkFileTypeCd = refreshIp02014BulkFileTypeCd();
     }
   		return ip02014BulkFileTypeCd;
   }

  
	/**
	*  set variable ip02014BulkFileTypeCd
	*  Corresponding COBOL Variable is IP02014-BULK-FILE-TYPE-CD
	*  @param value
	**/
   public void setIp02014BulkFileTypeCd(char[] value) {
      ip02014BulkFileTypeCd = checkIp02014BulkFileTypeCdConstraints(value);
      serializeIp02014BulkFileTypeCd(ip02014BulkFileTypeCd);
   } 

     /**
	 * 	Update Ip02014BulkFileTypeCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014BulkFileTypeCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014BulkFileTypeCd,ip02014BulkFileTypeCd.length);
   	
   }
   
   public void setIp02014BulkFileTypeCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014BulkFileTypeCd,ip02014BulkFileTypeCd.length);
   	
   }
   
     /**
	 * 	Update Ip02014BulkFileTypeCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014BulkFileTypeCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014BulkFileTypeCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014BulkFileTypeCd with another Field
	 *	@param value
	 */
   public void setIp02014BulkFileTypeCd(Field source) {
       replace(source,0,source.length(),beginIp02014BulkFileTypeCd,IP_02014_BULK_FILE_TYPE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014BulkFileTypeCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014BulkFileTypeCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014BulkFileTypeCd,IP_02014_BULK_FILE_TYPE_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014BulkFileTypeCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014BulkFileTypeCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014BulkFileTypeCd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip02014ImpBulkId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp02014BulkFileProcCd(CONSTANTS.SPACE);
         setIp02014BulkFileTypeCd(CONSTANTS.SPACE_3);
   }

		public static int getIp02014ImpBulkIdFieldLength() {
			return IP_02014_IMP_BULK_ID_LENGTH;
		}

}
  
