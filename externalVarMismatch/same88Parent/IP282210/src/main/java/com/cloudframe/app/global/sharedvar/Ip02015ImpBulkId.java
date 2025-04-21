package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02015ImpBulkId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:05. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip02015ImpBulkId extends Ip02015ImpBulkIdSerialized { 
   

						private char[] ip02015BulkFileProcCd = Field.fillLowValue(1);

						private char[] ip02015BulkFileTypeCd = Field.fillLowValue(3);
	
	/**
	* Constructor for Ip02015ImpBulkId
	**/
    public Ip02015ImpBulkId() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip02015ImpBulkId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02015ImpBulkId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip02015BulkFileProcCd
	 *	@return ip02015BulkFileProcCd
	 */
   public char[] getIp02015BulkFileProcCd() throws CFException{
     if (isIp02015BulkFileProcCdModified()) { 
        ip02015BulkFileProcCd = refreshIp02015BulkFileProcCd();
     }
   		return ip02015BulkFileProcCd;
   }

  
	/**
	*  set variable ip02015BulkFileProcCd
	*  Corresponding COBOL Variable is IP02015-BULK-FILE-PROC-CD
	*  @param value
	**/
   public void setIp02015BulkFileProcCd(char[] value) {
      ip02015BulkFileProcCd = checkIp02015BulkFileProcCdConstraints(value);
      serializeIp02015BulkFileProcCd(ip02015BulkFileProcCd);
   } 

     /**
	 * 	Update Ip02015BulkFileProcCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015BulkFileProcCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02015BulkFileProcCd,ip02015BulkFileProcCd.length);
   	
   }
   
   public void setIp02015BulkFileProcCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015BulkFileProcCd,ip02015BulkFileProcCd.length);
   	
   }
   
     /**
	 * 	Update Ip02015BulkFileProcCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015BulkFileProcCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015BulkFileProcCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02015BulkFileProcCd with another Field
	 *	@param value
	 */
   public void setIp02015BulkFileProcCd(Field source) {
       replace(source,0,source.length(),beginIp02015BulkFileProcCd,IP_02015_BULK_FILE_PROC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02015BulkFileProcCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015BulkFileProcCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02015BulkFileProcCd,IP_02015_BULK_FILE_PROC_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip02015BulkFileProcCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015BulkFileProcCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015BulkFileProcCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02015BulkFileTypeCd
	 *	@return ip02015BulkFileTypeCd
	 */
   public char[] getIp02015BulkFileTypeCd() throws CFException{
     if (isIp02015BulkFileTypeCdModified()) { 
        ip02015BulkFileTypeCd = refreshIp02015BulkFileTypeCd();
     }
   		return ip02015BulkFileTypeCd;
   }

  
	/**
	*  set variable ip02015BulkFileTypeCd
	*  Corresponding COBOL Variable is IP02015-BULK-FILE-TYPE-CD
	*  @param value
	**/
   public void setIp02015BulkFileTypeCd(char[] value) {
      ip02015BulkFileTypeCd = checkIp02015BulkFileTypeCdConstraints(value);
      serializeIp02015BulkFileTypeCd(ip02015BulkFileTypeCd);
   } 

     /**
	 * 	Update Ip02015BulkFileTypeCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015BulkFileTypeCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02015BulkFileTypeCd,ip02015BulkFileTypeCd.length);
   	
   }
   
   public void setIp02015BulkFileTypeCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015BulkFileTypeCd,ip02015BulkFileTypeCd.length);
   	
   }
   
     /**
	 * 	Update Ip02015BulkFileTypeCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015BulkFileTypeCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015BulkFileTypeCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02015BulkFileTypeCd with another Field
	 *	@param value
	 */
   public void setIp02015BulkFileTypeCd(Field source) {
       replace(source,0,source.length(),beginIp02015BulkFileTypeCd,IP_02015_BULK_FILE_TYPE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02015BulkFileTypeCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015BulkFileTypeCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02015BulkFileTypeCd,IP_02015_BULK_FILE_TYPE_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip02015BulkFileTypeCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015BulkFileTypeCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015BulkFileTypeCd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip02015ImpBulkId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp02015BulkFileProcCd(CONSTANTS.SPACE);
         setIp02015BulkFileTypeCd(CONSTANTS.SPACE_3);
   }

		public static int getIp02015ImpBulkIdFieldLength() {
			return IP_02015_IMP_BULK_ID_LENGTH;
		}

}
  
