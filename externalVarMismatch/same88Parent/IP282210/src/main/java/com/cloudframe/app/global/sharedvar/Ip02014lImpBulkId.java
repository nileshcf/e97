package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02014lImpBulkId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:33. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip02014lImpBulkId extends Ip02014lImpBulkIdSerialized { 
   

						private char[] ip02014lBulkFileProcCd = Field.fillLowValue(1);

						private char[] ip02014lBulkFileTypeCd = Field.fillLowValue(3);
	
	/**
	* Constructor for Ip02014lImpBulkId
	**/
    public Ip02014lImpBulkId() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip02014lImpBulkId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02014lImpBulkId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip02014lBulkFileProcCd
	 *	@return ip02014lBulkFileProcCd
	 */
   public char[] getIp02014lBulkFileProcCd() throws CFException{
     if (isIp02014lBulkFileProcCdModified()) { 
        ip02014lBulkFileProcCd = refreshIp02014lBulkFileProcCd();
     }
   		return ip02014lBulkFileProcCd;
   }

  
	/**
	*  set variable ip02014lBulkFileProcCd
	*  Corresponding COBOL Variable is IP02014L-BULK-FILE-PROC-CD
	*  @param value
	**/
   public void setIp02014lBulkFileProcCd(char[] value) {
      ip02014lBulkFileProcCd = checkIp02014lBulkFileProcCdConstraints(value);
      serializeIp02014lBulkFileProcCd(ip02014lBulkFileProcCd);
   } 

     /**
	 * 	Update Ip02014lBulkFileProcCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014lBulkFileProcCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014lBulkFileProcCd,ip02014lBulkFileProcCd.length);
   	
   }
   
   public void setIp02014lBulkFileProcCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lBulkFileProcCd,ip02014lBulkFileProcCd.length);
   	
   }
   
     /**
	 * 	Update Ip02014lBulkFileProcCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lBulkFileProcCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lBulkFileProcCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014lBulkFileProcCd with another Field
	 *	@param value
	 */
   public void setIp02014lBulkFileProcCd(Field source) {
       replace(source,0,source.length(),beginIp02014lBulkFileProcCd,IP_02014L_BULK_FILE_PROC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014lBulkFileProcCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014lBulkFileProcCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014lBulkFileProcCd,IP_02014L_BULK_FILE_PROC_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014lBulkFileProcCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lBulkFileProcCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lBulkFileProcCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014lBulkFileTypeCd
	 *	@return ip02014lBulkFileTypeCd
	 */
   public char[] getIp02014lBulkFileTypeCd() throws CFException{
     if (isIp02014lBulkFileTypeCdModified()) { 
        ip02014lBulkFileTypeCd = refreshIp02014lBulkFileTypeCd();
     }
   		return ip02014lBulkFileTypeCd;
   }

  
	/**
	*  set variable ip02014lBulkFileTypeCd
	*  Corresponding COBOL Variable is IP02014L-BULK-FILE-TYPE-CD
	*  @param value
	**/
   public void setIp02014lBulkFileTypeCd(char[] value) {
      ip02014lBulkFileTypeCd = checkIp02014lBulkFileTypeCdConstraints(value);
      serializeIp02014lBulkFileTypeCd(ip02014lBulkFileTypeCd);
   } 

     /**
	 * 	Update Ip02014lBulkFileTypeCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014lBulkFileTypeCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014lBulkFileTypeCd,ip02014lBulkFileTypeCd.length);
   	
   }
   
   public void setIp02014lBulkFileTypeCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lBulkFileTypeCd,ip02014lBulkFileTypeCd.length);
   	
   }
   
     /**
	 * 	Update Ip02014lBulkFileTypeCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lBulkFileTypeCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lBulkFileTypeCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014lBulkFileTypeCd with another Field
	 *	@param value
	 */
   public void setIp02014lBulkFileTypeCd(Field source) {
       replace(source,0,source.length(),beginIp02014lBulkFileTypeCd,IP_02014L_BULK_FILE_TYPE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014lBulkFileTypeCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014lBulkFileTypeCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014lBulkFileTypeCd,IP_02014L_BULK_FILE_TYPE_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014lBulkFileTypeCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lBulkFileTypeCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lBulkFileTypeCd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip02014lImpBulkId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp02014lBulkFileProcCd(CONSTANTS.SPACE);
         setIp02014lBulkFileTypeCd(CONSTANTS.SPACE_3);
   }

		public static int getIp02014lImpBulkIdFieldLength() {
			return IP_02014L_IMP_BULK_ID_LENGTH;
		}

}
  
