package com.cloudframe.app.sf320010.dto;

/**
*  The class RpBdDetail is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:07. using version 5.0.0.256
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RpBdDetail extends RpBdDetailSerialized {
   

						private char[] rpBdCc = new char[1];


						private char[] rpBdBulkId = Field.fillLowValue(14);


						private char[] rpBdMipId = Field.fillLowValue(3);


						private char[] rpBdPathId = Field.fillLowValue(1);


						private char[] rpBdStatus = Field.fillLowValue(1);


						private char[] rpBdErrorCode = Field.fillLowValue(1);


						private char[] rpBdJulianDay = Field.fillLowValue(3);


						private char[] rpBdTime = Field.fillLowValue(6);


								private char[] rpBdNbr1kSpoolRcds = Field.fillLowValue(9);


								private char[] rpBdNbrBytesTrans = Field.fillLowValue(9);


								private char[] rpBdNbrBlocksTrans = Field.fillLowValue(9);

	
	/**
	* Constructor for RpBdDetail
	**/
    public RpBdDetail() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setRpBdCc("0".toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(7)
             , getStartOffset() + 1
             ,7
             );
       replaceValue( // serialize and save the value
             fillSpace(5)
             , getStartOffset() + 22
             ,5
             );
       replaceValue( // serialize and save the value
             fillSpace(7)
             , getStartOffset() + 30
             ,7
             );
       replaceValue( // serialize and save the value
             fillSpace(8)
             , getStartOffset() + 38
             ,8
             );
       replaceValue( // serialize and save the value
             fillSpace(9)
             , getStartOffset() + 47
             ,9
             );
       replaceValue( // serialize and save the value
             fillSpace(10)
             , getStartOffset() + 57
             ,10
             );
       replaceValue( // serialize and save the value
             fillSpace(7)
             , getStartOffset() + 70
             ,7
             );
       replaceValue( // serialize and save the value
             fillSpace(5)
             , getStartOffset() + 83
             ,5
             );
       replaceValue( // serialize and save the value
             fillSpace(5)
             , getStartOffset() + 97
             ,5
             );
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 111
             ,3
             );
       replaceValue( // serialize and save the value
             fillSpace(10)
             , getStartOffset() + 123
             ,10
             );
    }


 

	/**
	 *	Returns the value of rpBdCc
	 *	@return rpBdCc
	 */
   public char[] getRpBdCc() throws CFException{
     if (isRpBdCcModified()) { 
        rpBdCc = refreshRpBdCc();
     }
   		return rpBdCc;
   }

  
	/**
	*  set variable rpBdCc
	*  Corresponding COBOL Variable is RP-BD-CC
	*  @param value
	**/
   public void setRpBdCc(char[] value) {
      rpBdCc = checkRpBdCcConstraints(value);
      serializeRpBdCc(rpBdCc);
   } 

     /**
	 * 	Update RpBdCc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpBdCc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpBdCc,rpBdCc.length);
   	
   }
   
   public void setRpBdCc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpBdCc,rpBdCc.length);
   	
   }
   
     /**
	 * 	Update RpBdCc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpBdCc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpBdCc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpBdCc with another Field
	 *	@param value
	 */
   public void setRpBdCc(Field source) {
       replace(source,0,source.length(),beginRpBdCc,RP_BD_CC_LEN);
   	
   }  
   
     /**
	 * 	Update RpBdCc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpBdCc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpBdCc,RP_BD_CC_LEN);
   	
   }
   
     /**
	 * 	Update RpBdCc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpBdCc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpBdCc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpBdBulkId
	 *	@return rpBdBulkId
	 */
   public char[] getRpBdBulkId() throws CFException{
     if (isRpBdBulkIdModified()) { 
        rpBdBulkId = refreshRpBdBulkId();
     }
   		return rpBdBulkId;
   }

  
	/**
	*  set variable rpBdBulkId
	*  Corresponding COBOL Variable is RP-BD-BULK-ID
	*  @param value
	**/
   public void setRpBdBulkId(char[] value) {
      rpBdBulkId = checkRpBdBulkIdConstraints(value);
      serializeRpBdBulkId(rpBdBulkId);
   } 

     /**
	 * 	Update RpBdBulkId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpBdBulkId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpBdBulkId,rpBdBulkId.length);
   	
   }
   
   public void setRpBdBulkId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpBdBulkId,rpBdBulkId.length);
   	
   }
   
     /**
	 * 	Update RpBdBulkId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpBdBulkId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpBdBulkId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpBdBulkId with another Field
	 *	@param value
	 */
   public void setRpBdBulkId(Field source) {
       replace(source,0,source.length(),beginRpBdBulkId,RP_BD_BULK_ID_LEN);
   	
   }  
   
     /**
	 * 	Update RpBdBulkId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpBdBulkId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpBdBulkId,RP_BD_BULK_ID_LEN);
   	
   }
   
     /**
	 * 	Update RpBdBulkId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpBdBulkId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpBdBulkId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpBdMipId
	 *	@return rpBdMipId
	 */
   public char[] getRpBdMipId() throws CFException{
     if (isRpBdMipIdModified()) { 
        rpBdMipId = refreshRpBdMipId();
     }
   		return rpBdMipId;
   }

  
	/**
	*  set variable rpBdMipId
	*  Corresponding COBOL Variable is RP-BD-MIP-ID
	*  @param value
	**/
   public void setRpBdMipId(char[] value) {
      rpBdMipId = checkRpBdMipIdConstraints(value);
      serializeRpBdMipId(rpBdMipId);
   } 

     /**
	 * 	Update RpBdMipId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpBdMipId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpBdMipId,rpBdMipId.length);
   	
   }
   
   public void setRpBdMipId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpBdMipId,rpBdMipId.length);
   	
   }
   
     /**
	 * 	Update RpBdMipId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpBdMipId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpBdMipId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpBdMipId with another Field
	 *	@param value
	 */
   public void setRpBdMipId(Field source) {
       replace(source,0,source.length(),beginRpBdMipId,RP_BD_MIP_ID_LEN);
   	
   }  
   
     /**
	 * 	Update RpBdMipId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpBdMipId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpBdMipId,RP_BD_MIP_ID_LEN);
   	
   }
   
     /**
	 * 	Update RpBdMipId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpBdMipId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpBdMipId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpBdPathId
	 *	@return rpBdPathId
	 */
   public char[] getRpBdPathId() throws CFException{
     if (isRpBdPathIdModified()) { 
        rpBdPathId = refreshRpBdPathId();
     }
   		return rpBdPathId;
   }

  
	/**
	*  set variable rpBdPathId
	*  Corresponding COBOL Variable is RP-BD-PATH-ID
	*  @param value
	**/
   public void setRpBdPathId(char[] value) {
      rpBdPathId = checkRpBdPathIdConstraints(value);
      serializeRpBdPathId(rpBdPathId);
   } 

     /**
	 * 	Update RpBdPathId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpBdPathId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpBdPathId,rpBdPathId.length);
   	
   }
   
   public void setRpBdPathId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpBdPathId,rpBdPathId.length);
   	
   }
   
     /**
	 * 	Update RpBdPathId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpBdPathId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpBdPathId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpBdPathId with another Field
	 *	@param value
	 */
   public void setRpBdPathId(Field source) {
       replace(source,0,source.length(),beginRpBdPathId,RP_BD_PATH_ID_LEN);
   	
   }  
   
     /**
	 * 	Update RpBdPathId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpBdPathId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpBdPathId,RP_BD_PATH_ID_LEN);
   	
   }
   
     /**
	 * 	Update RpBdPathId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpBdPathId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpBdPathId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpBdStatus
	 *	@return rpBdStatus
	 */
   public char[] getRpBdStatus() throws CFException{
     if (isRpBdStatusModified()) { 
        rpBdStatus = refreshRpBdStatus();
     }
   		return rpBdStatus;
   }

  
	/**
	*  set variable rpBdStatus
	*  Corresponding COBOL Variable is RP-BD-STATUS
	*  @param value
	**/
   public void setRpBdStatus(char[] value) {
      rpBdStatus = checkRpBdStatusConstraints(value);
      serializeRpBdStatus(rpBdStatus);
   } 

     /**
	 * 	Update RpBdStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpBdStatus(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpBdStatus,rpBdStatus.length);
   	
   }
   
   public void setRpBdStatus(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpBdStatus,rpBdStatus.length);
   	
   }
   
     /**
	 * 	Update RpBdStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpBdStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpBdStatus+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpBdStatus with another Field
	 *	@param value
	 */
   public void setRpBdStatus(Field source) {
       replace(source,0,source.length(),beginRpBdStatus,RP_BD_STATUS_LEN);
   	
   }  
   
     /**
	 * 	Update RpBdStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpBdStatus(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpBdStatus,RP_BD_STATUS_LEN);
   	
   }
   
     /**
	 * 	Update RpBdStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpBdStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpBdStatus+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpBdErrorCode
	 *	@return rpBdErrorCode
	 */
   public char[] getRpBdErrorCode() throws CFException{
     if (isRpBdErrorCodeModified()) { 
        rpBdErrorCode = refreshRpBdErrorCode();
     }
   		return rpBdErrorCode;
   }

  
	/**
	*  set variable rpBdErrorCode
	*  Corresponding COBOL Variable is RP-BD-ERROR-CODE
	*  @param value
	**/
   public void setRpBdErrorCode(char[] value) {
      rpBdErrorCode = checkRpBdErrorCodeConstraints(value);
      serializeRpBdErrorCode(rpBdErrorCode);
   } 

     /**
	 * 	Update RpBdErrorCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpBdErrorCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpBdErrorCode,rpBdErrorCode.length);
   	
   }
   
   public void setRpBdErrorCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpBdErrorCode,rpBdErrorCode.length);
   	
   }
   
     /**
	 * 	Update RpBdErrorCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpBdErrorCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpBdErrorCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpBdErrorCode with another Field
	 *	@param value
	 */
   public void setRpBdErrorCode(Field source) {
       replace(source,0,source.length(),beginRpBdErrorCode,RP_BD_ERROR_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update RpBdErrorCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpBdErrorCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpBdErrorCode,RP_BD_ERROR_CODE_LEN);
   	
   }
   
     /**
	 * 	Update RpBdErrorCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpBdErrorCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpBdErrorCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpBdJulianDay
	 *	@return rpBdJulianDay
	 */
   public char[] getRpBdJulianDay() throws CFException{
     if (isRpBdJulianDayModified()) { 
        rpBdJulianDay = refreshRpBdJulianDay();
     }
   		return rpBdJulianDay;
   }

  
	/**
	*  set variable rpBdJulianDay
	*  Corresponding COBOL Variable is RP-BD-JULIAN-DAY
	*  @param value
	**/
   public void setRpBdJulianDay(char[] value) {
      rpBdJulianDay = checkRpBdJulianDayConstraints(value);
      serializeRpBdJulianDay(rpBdJulianDay);
   } 

     /**
	 * 	Update RpBdJulianDay 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpBdJulianDay(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpBdJulianDay,rpBdJulianDay.length);
   	
   }
   
   public void setRpBdJulianDay(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpBdJulianDay,rpBdJulianDay.length);
   	
   }
   
     /**
	 * 	Update RpBdJulianDay 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpBdJulianDay(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpBdJulianDay+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpBdJulianDay with another Field
	 *	@param value
	 */
   public void setRpBdJulianDay(Field source) {
       replace(source,0,source.length(),beginRpBdJulianDay,RP_BD_JULIAN_DAY_LEN);
   	
   }  
   
     /**
	 * 	Update RpBdJulianDay 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpBdJulianDay(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpBdJulianDay,RP_BD_JULIAN_DAY_LEN);
   	
   }
   
     /**
	 * 	Update RpBdJulianDay 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpBdJulianDay(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpBdJulianDay+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpBdTime
	 *	@return rpBdTime
	 */
   public char[] getRpBdTime() throws CFException{
     if (isRpBdTimeModified()) { 
        rpBdTime = refreshRpBdTime();
     }
   		return rpBdTime;
   }

  
	/**
	*  set variable rpBdTime
	*  Corresponding COBOL Variable is RP-BD-TIME
	*  @param value
	**/
   public void setRpBdTime(char[] value) {
      rpBdTime = checkRpBdTimeConstraints(value);
      serializeRpBdTime(rpBdTime);
   } 

     /**
	 * 	Update RpBdTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpBdTime(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpBdTime,rpBdTime.length);
   	
   }
   
   public void setRpBdTime(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpBdTime,rpBdTime.length);
   	
   }
   
     /**
	 * 	Update RpBdTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpBdTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpBdTime+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpBdTime with another Field
	 *	@param value
	 */
   public void setRpBdTime(Field source) {
       replace(source,0,source.length(),beginRpBdTime,RP_BD_TIME_LEN);
   	
   }  
   
     /**
	 * 	Update RpBdTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpBdTime(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpBdTime,RP_BD_TIME_LEN);
   	
   }
   
     /**
	 * 	Update RpBdTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpBdTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpBdTime+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpBdNbr1kSpoolRcds
	 *	@return rpBdNbr1kSpoolRcds
	 */
   public char[] getRpBdNbr1kSpoolRcds() throws CFException{
     if (isRpBdNbr1kSpoolRcdsModified()) { 
        rpBdNbr1kSpoolRcds = refreshRpBdNbr1kSpoolRcds();
     }
   		return rpBdNbr1kSpoolRcds;
   }

  
	/**
	*  set variable rpBdNbr1kSpoolRcds
	*  Corresponding COBOL Variable is RP-BD-NBR-1K-SPOOL-RCDS
	*  @param value
	**/
   public void setRpBdNbr1kSpoolRcds(char[] value) {
      rpBdNbr1kSpoolRcds = checkRpBdNbr1kSpoolRcdsConstraints(value);
      serializeRpBdNbr1kSpoolRcds(rpBdNbr1kSpoolRcds);
   } 

     /**
	 * 	Update RpBdNbr1kSpoolRcds 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpBdNbr1kSpoolRcds(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpBdNbr1kSpoolRcds,rpBdNbr1kSpoolRcds.length);
   	
   }
   
   public void setRpBdNbr1kSpoolRcds(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpBdNbr1kSpoolRcds,rpBdNbr1kSpoolRcds.length);
   	
   }
   
     /**
	 * 	Update RpBdNbr1kSpoolRcds 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpBdNbr1kSpoolRcds(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpBdNbr1kSpoolRcds+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpBdNbr1kSpoolRcds with another Field
	 *	@param value
	 */
   public void setRpBdNbr1kSpoolRcds(Field source) {
       replace(source,0,source.length(),beginRpBdNbr1kSpoolRcds,RP_BD_NBR_1K_SPOOL_RCDS_LEN);
   	
   }  
   
     /**
	 * 	Update RpBdNbr1kSpoolRcds 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpBdNbr1kSpoolRcds(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpBdNbr1kSpoolRcds,RP_BD_NBR_1K_SPOOL_RCDS_LEN);
   	
   }
   
     /**
	 * 	Update RpBdNbr1kSpoolRcds 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpBdNbr1kSpoolRcds(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpBdNbr1kSpoolRcds+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpBdNbrBytesTrans
	 *	@return rpBdNbrBytesTrans
	 */
   public char[] getRpBdNbrBytesTrans() throws CFException{
     if (isRpBdNbrBytesTransModified()) { 
        rpBdNbrBytesTrans = refreshRpBdNbrBytesTrans();
     }
   		return rpBdNbrBytesTrans;
   }

  
	/**
	*  set variable rpBdNbrBytesTrans
	*  Corresponding COBOL Variable is RP-BD-NBR-BYTES-TRANS
	*  @param value
	**/
   public void setRpBdNbrBytesTrans(char[] value) {
      rpBdNbrBytesTrans = checkRpBdNbrBytesTransConstraints(value);
      serializeRpBdNbrBytesTrans(rpBdNbrBytesTrans);
   } 

     /**
	 * 	Update RpBdNbrBytesTrans 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpBdNbrBytesTrans(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpBdNbrBytesTrans,rpBdNbrBytesTrans.length);
   	
   }
   
   public void setRpBdNbrBytesTrans(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpBdNbrBytesTrans,rpBdNbrBytesTrans.length);
   	
   }
   
     /**
	 * 	Update RpBdNbrBytesTrans 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpBdNbrBytesTrans(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpBdNbrBytesTrans+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpBdNbrBytesTrans with another Field
	 *	@param value
	 */
   public void setRpBdNbrBytesTrans(Field source) {
       replace(source,0,source.length(),beginRpBdNbrBytesTrans,RP_BD_NBR_BYTES_TRANS_LEN);
   	
   }  
   
     /**
	 * 	Update RpBdNbrBytesTrans 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpBdNbrBytesTrans(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpBdNbrBytesTrans,RP_BD_NBR_BYTES_TRANS_LEN);
   	
   }
   
     /**
	 * 	Update RpBdNbrBytesTrans 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpBdNbrBytesTrans(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpBdNbrBytesTrans+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpBdNbrBlocksTrans
	 *	@return rpBdNbrBlocksTrans
	 */
   public char[] getRpBdNbrBlocksTrans() throws CFException{
     if (isRpBdNbrBlocksTransModified()) { 
        rpBdNbrBlocksTrans = refreshRpBdNbrBlocksTrans();
     }
   		return rpBdNbrBlocksTrans;
   }

  
	/**
	*  set variable rpBdNbrBlocksTrans
	*  Corresponding COBOL Variable is RP-BD-NBR-BLOCKS-TRANS
	*  @param value
	**/
   public void setRpBdNbrBlocksTrans(char[] value) {
      rpBdNbrBlocksTrans = checkRpBdNbrBlocksTransConstraints(value);
      serializeRpBdNbrBlocksTrans(rpBdNbrBlocksTrans);
   } 

     /**
	 * 	Update RpBdNbrBlocksTrans 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpBdNbrBlocksTrans(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpBdNbrBlocksTrans,rpBdNbrBlocksTrans.length);
   	
   }
   
   public void setRpBdNbrBlocksTrans(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpBdNbrBlocksTrans,rpBdNbrBlocksTrans.length);
   	
   }
   
     /**
	 * 	Update RpBdNbrBlocksTrans 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpBdNbrBlocksTrans(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpBdNbrBlocksTrans+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpBdNbrBlocksTrans with another Field
	 *	@param value
	 */
   public void setRpBdNbrBlocksTrans(Field source) {
       replace(source,0,source.length(),beginRpBdNbrBlocksTrans,RP_BD_NBR_BLOCKS_TRANS_LEN);
   	
   }  
   
     /**
	 * 	Update RpBdNbrBlocksTrans 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpBdNbrBlocksTrans(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpBdNbrBlocksTrans,RP_BD_NBR_BLOCKS_TRANS_LEN);
   	
   }
   
     /**
	 * 	Update RpBdNbrBlocksTrans 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpBdNbrBlocksTrans(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpBdNbrBlocksTrans+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRpBdDetailFieldLength() {
			return RP_BD_DETAIL_LENGTH;
		}

}
  
