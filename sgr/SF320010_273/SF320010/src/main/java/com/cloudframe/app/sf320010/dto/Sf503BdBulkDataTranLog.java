package com.cloudframe.app.sf320010.dto;

/**
*  The class Sf503BdBulkDataTranLog is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:12. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf503BdBulkDataTranLog extends Sf503BdBulkDataTranLogSerialized { 
   

						private char[] sf503BdBulkId = Field.fillLowValue(14);

						private char[] sf503BdMipId = Field.fillLowValue(3);

						private char[] sf503BdPathId = Field.fillLowValue(1);

						private char[] sf503BdStatus = Field.fillLowValue(1);

						private char[] sf503BdErrorCode = Field.fillLowValue(1);

						private char[] sf503BdJulianDay = Field.fillLowValue(3);

						private char[] sf503BdTime = Field.fillLowValue(6);

								private long sf503BdNbr1kSpoolRcds;

								private long sf503BdNbrBytesTrans;

								private long sf503BdNbrBlocksTrans;
	
	/**
	* Constructor for Sf503BdBulkDataTranLog
	**/
    public Sf503BdBulkDataTranLog() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf503BdBulkDataTranLog. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503BdBulkDataTranLog(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sf503BdBulkId
	 *	@return sf503BdBulkId
	 */
   public char[] getSf503BdBulkId() throws CFException{
     if (isSf503BdBulkIdModified()) { 
        sf503BdBulkId = refreshSf503BdBulkId();
     }
   		return sf503BdBulkId;
   }

  
	/**
	*  set variable sf503BdBulkId
	*  Corresponding COBOL Variable is SF503-BD-BULK-ID
	*  @param value
	**/
   public void setSf503BdBulkId(char[] value) {
      sf503BdBulkId = checkSf503BdBulkIdConstraints(value);
      serializeSf503BdBulkId(sf503BdBulkId);
   } 

     /**
	 * 	Update Sf503BdBulkId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503BdBulkId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503BdBulkId,sf503BdBulkId.length);
   	
   }
   
   public void setSf503BdBulkId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503BdBulkId,sf503BdBulkId.length);
   	
   }
   
     /**
	 * 	Update Sf503BdBulkId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503BdBulkId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503BdBulkId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503BdBulkId with another Field
	 *	@param value
	 */
   public void setSf503BdBulkId(Field source) {
       replace(source,0,source.length(),beginSf503BdBulkId,SF_503_BD_BULK_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503BdBulkId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503BdBulkId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503BdBulkId,SF_503_BD_BULK_ID_LEN);
   	
   }
   
     /**
	 * 	Update Sf503BdBulkId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503BdBulkId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503BdBulkId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf503BdMipId
	 *	@return sf503BdMipId
	 */
   public char[] getSf503BdMipId() throws CFException{
     if (isSf503BdMipIdModified()) { 
        sf503BdMipId = refreshSf503BdMipId();
     }
   		return sf503BdMipId;
   }

  
	/**
	*  set variable sf503BdMipId
	*  Corresponding COBOL Variable is SF503-BD-MIP-ID
	*  @param value
	**/
   public void setSf503BdMipId(char[] value) {
      sf503BdMipId = checkSf503BdMipIdConstraints(value);
      serializeSf503BdMipId(sf503BdMipId);
   } 

     /**
	 * 	Update Sf503BdMipId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503BdMipId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503BdMipId,sf503BdMipId.length);
   	
   }
   
   public void setSf503BdMipId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503BdMipId,sf503BdMipId.length);
   	
   }
   
     /**
	 * 	Update Sf503BdMipId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503BdMipId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503BdMipId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503BdMipId with another Field
	 *	@param value
	 */
   public void setSf503BdMipId(Field source) {
       replace(source,0,source.length(),beginSf503BdMipId,SF_503_BD_MIP_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503BdMipId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503BdMipId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503BdMipId,SF_503_BD_MIP_ID_LEN);
   	
   }
   
     /**
	 * 	Update Sf503BdMipId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503BdMipId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503BdMipId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf503BdPathId
	 *	@return sf503BdPathId
	 */
   public char[] getSf503BdPathId() throws CFException{
     if (isSf503BdPathIdModified()) { 
        sf503BdPathId = refreshSf503BdPathId();
     }
   		return sf503BdPathId;
   }

  
	/**
	*  set variable sf503BdPathId
	*  Corresponding COBOL Variable is SF503-BD-PATH-ID
	*  @param value
	**/
   public void setSf503BdPathId(char[] value) {
      sf503BdPathId = checkSf503BdPathIdConstraints(value);
      serializeSf503BdPathId(sf503BdPathId);
   } 

     /**
	 * 	Update Sf503BdPathId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503BdPathId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503BdPathId,sf503BdPathId.length);
   	
   }
   
   public void setSf503BdPathId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503BdPathId,sf503BdPathId.length);
   	
   }
   
     /**
	 * 	Update Sf503BdPathId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503BdPathId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503BdPathId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503BdPathId with another Field
	 *	@param value
	 */
   public void setSf503BdPathId(Field source) {
       replace(source,0,source.length(),beginSf503BdPathId,SF_503_BD_PATH_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503BdPathId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503BdPathId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503BdPathId,SF_503_BD_PATH_ID_LEN);
   	
   }
   
     /**
	 * 	Update Sf503BdPathId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503BdPathId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503BdPathId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf503BdStatus
	 *	@return sf503BdStatus
	 */
   public char[] getSf503BdStatus() throws CFException{
     if (isSf503BdStatusModified()) { 
        sf503BdStatus = refreshSf503BdStatus();
     }
   		return sf503BdStatus;
   }

  
	/**
	*  set variable sf503BdStatus
	*  Corresponding COBOL Variable is SF503-BD-STATUS
	*  @param value
	**/
   public void setSf503BdStatus(char[] value) {
      sf503BdStatus = checkSf503BdStatusConstraints(value);
      serializeSf503BdStatus(sf503BdStatus);
   } 

     /**
	 * 	Update Sf503BdStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503BdStatus(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503BdStatus,sf503BdStatus.length);
   	
   }
   
   public void setSf503BdStatus(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503BdStatus,sf503BdStatus.length);
   	
   }
   
     /**
	 * 	Update Sf503BdStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503BdStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503BdStatus+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503BdStatus with another Field
	 *	@param value
	 */
   public void setSf503BdStatus(Field source) {
       replace(source,0,source.length(),beginSf503BdStatus,SF_503_BD_STATUS_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503BdStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503BdStatus(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503BdStatus,SF_503_BD_STATUS_LEN);
   	
   }
   
     /**
	 * 	Update Sf503BdStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503BdStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503BdStatus+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf503BdErrorCode
	 *	@return sf503BdErrorCode
	 */
   public char[] getSf503BdErrorCode() throws CFException{
     if (isSf503BdErrorCodeModified()) { 
        sf503BdErrorCode = refreshSf503BdErrorCode();
     }
   		return sf503BdErrorCode;
   }

  
	/**
	*  set variable sf503BdErrorCode
	*  Corresponding COBOL Variable is SF503-BD-ERROR-CODE
	*  @param value
	**/
   public void setSf503BdErrorCode(char[] value) {
      sf503BdErrorCode = checkSf503BdErrorCodeConstraints(value);
      serializeSf503BdErrorCode(sf503BdErrorCode);
   } 

     /**
	 * 	Update Sf503BdErrorCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503BdErrorCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503BdErrorCode,sf503BdErrorCode.length);
   	
   }
   
   public void setSf503BdErrorCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503BdErrorCode,sf503BdErrorCode.length);
   	
   }
   
     /**
	 * 	Update Sf503BdErrorCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503BdErrorCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503BdErrorCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503BdErrorCode with another Field
	 *	@param value
	 */
   public void setSf503BdErrorCode(Field source) {
       replace(source,0,source.length(),beginSf503BdErrorCode,SF_503_BD_ERROR_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503BdErrorCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503BdErrorCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503BdErrorCode,SF_503_BD_ERROR_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Sf503BdErrorCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503BdErrorCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503BdErrorCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf503BdJulianDay
	 *	@return sf503BdJulianDay
	 */
   public char[] getSf503BdJulianDay() throws CFException{
     if (isSf503BdJulianDayModified()) { 
        sf503BdJulianDay = refreshSf503BdJulianDay();
     }
   		return sf503BdJulianDay;
   }

  
	/**
	*  set variable sf503BdJulianDay
	*  Corresponding COBOL Variable is SF503-BD-JULIAN-DAY
	*  @param value
	**/
   public void setSf503BdJulianDay(char[] value) {
      sf503BdJulianDay = checkSf503BdJulianDayConstraints(value);
      serializeSf503BdJulianDay(sf503BdJulianDay);
   } 

     /**
	 * 	Update Sf503BdJulianDay 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503BdJulianDay(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503BdJulianDay,sf503BdJulianDay.length);
   	
   }
   
   public void setSf503BdJulianDay(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503BdJulianDay,sf503BdJulianDay.length);
   	
   }
   
     /**
	 * 	Update Sf503BdJulianDay 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503BdJulianDay(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503BdJulianDay+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503BdJulianDay with another Field
	 *	@param value
	 */
   public void setSf503BdJulianDay(Field source) {
       replace(source,0,source.length(),beginSf503BdJulianDay,SF_503_BD_JULIAN_DAY_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503BdJulianDay 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503BdJulianDay(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503BdJulianDay,SF_503_BD_JULIAN_DAY_LEN);
   	
   }
   
     /**
	 * 	Update Sf503BdJulianDay 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503BdJulianDay(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503BdJulianDay+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf503BdTime
	 *	@return sf503BdTime
	 */
   public char[] getSf503BdTime() throws CFException{
     if (isSf503BdTimeModified()) { 
        sf503BdTime = refreshSf503BdTime();
     }
   		return sf503BdTime;
   }

  
	/**
	*  set variable sf503BdTime
	*  Corresponding COBOL Variable is SF503-BD-TIME
	*  @param value
	**/
   public void setSf503BdTime(char[] value) {
      sf503BdTime = checkSf503BdTimeConstraints(value);
      serializeSf503BdTime(sf503BdTime);
   } 

     /**
	 * 	Update Sf503BdTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503BdTime(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503BdTime,sf503BdTime.length);
   	
   }
   
   public void setSf503BdTime(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503BdTime,sf503BdTime.length);
   	
   }
   
     /**
	 * 	Update Sf503BdTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503BdTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503BdTime+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503BdTime with another Field
	 *	@param value
	 */
   public void setSf503BdTime(Field source) {
       replace(source,0,source.length(),beginSf503BdTime,SF_503_BD_TIME_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503BdTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503BdTime(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503BdTime,SF_503_BD_TIME_LEN);
   	
   }
   
     /**
	 * 	Update Sf503BdTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503BdTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503BdTime+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf503BdNbr1kSpoolRcds
	 *	@return sf503BdNbr1kSpoolRcds
	 */
	public long getSf503BdNbr1kSpoolRcds() throws CFException {
        if (isSf503BdNbr1kSpoolRcdsModified()) { 
           sf503BdNbr1kSpoolRcds = refreshSf503BdNbr1kSpoolRcds();
        }
   		return sf503BdNbr1kSpoolRcds;
	}
	
	/**
	 * 	Update Sf503BdNbr1kSpoolRcds with the passed value
	 *  Corresponding COBOL Variable is SF503-BD-NBR-1K-SPOOL-RCDS
	 *	@param number
	 */
	public void setSf503BdNbr1kSpoolRcds(long number) {
	     // Truncate if the number is beyond +/- Max range
	    sf503BdNbr1kSpoolRcds = checkSf503BdNbr1kSpoolRcdsMaxLimit(number); 
		serializeSf503BdNbr1kSpoolRcds(sf503BdNbr1kSpoolRcds);
	}


	/**
	 *	Returns the value of sf503BdNbrBytesTrans
	 *	@return sf503BdNbrBytesTrans
	 */
	public long getSf503BdNbrBytesTrans() throws CFException {
        if (isSf503BdNbrBytesTransModified()) { 
           sf503BdNbrBytesTrans = refreshSf503BdNbrBytesTrans();
        }
   		return sf503BdNbrBytesTrans;
	}
	
	/**
	 * 	Update Sf503BdNbrBytesTrans with the passed value
	 *  Corresponding COBOL Variable is SF503-BD-NBR-BYTES-TRANS
	 *	@param number
	 */
	public void setSf503BdNbrBytesTrans(long number) {
	     // Truncate if the number is beyond +/- Max range
	    sf503BdNbrBytesTrans = checkSf503BdNbrBytesTransMaxLimit(number); 
		serializeSf503BdNbrBytesTrans(sf503BdNbrBytesTrans);
	}


	/**
	 *	Returns the value of sf503BdNbrBlocksTrans
	 *	@return sf503BdNbrBlocksTrans
	 */
	public long getSf503BdNbrBlocksTrans() throws CFException {
        if (isSf503BdNbrBlocksTransModified()) { 
           sf503BdNbrBlocksTrans = refreshSf503BdNbrBlocksTrans();
        }
   		return sf503BdNbrBlocksTrans;
	}
	
	/**
	 * 	Update Sf503BdNbrBlocksTrans with the passed value
	 *  Corresponding COBOL Variable is SF503-BD-NBR-BLOCKS-TRANS
	 *	@param number
	 */
	public void setSf503BdNbrBlocksTrans(long number) {
	     // Truncate if the number is beyond +/- Max range
	    sf503BdNbrBlocksTrans = checkSf503BdNbrBlocksTransMaxLimit(number); 
		serializeSf503BdNbrBlocksTrans(sf503BdNbrBlocksTrans);
	}



	
	
	

		public static int getSf503BdBulkDataTranLogFieldLength() {
			return SF_503_BD_BULK_DATA_TRAN_LOG_LENGTH;
		}

}
  
