package com.cloudframe.app.sf320010.dto;

/**
*  The class RpC8Detail1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RpC8Detail1 extends RpC8Detail1Serialized {
   

						private char[] rpC8Det1Cc = Field.fillLowValue(1);


						private char[] rpC8Det1Alert = Field.fillLowValue(8);


						private char[] rpC8Det1RemMipId = Field.fillLowValue(3);


						private char[] rpC8Det1OperId = Field.fillLowValue(7);


						private char[] rpC8Det1LogDate = Field.fillLowValue(8);


						private char[] rpC8Det1LogTime = Field.fillLowValue(8);


						private char[] rpC8Det1LocMipId = Field.fillLowValue(3);


						private char[] rpC8Det1LogType = Field.fillLowValue(1);


						private char[] rpC8Det1LogDesc = Field.fillLowValue(45);

	
	/**
	* Constructor for RpC8Detail1
	**/
    public RpC8Detail1() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(6)
             , getStartOffset() + 1
             ,6
             );
       replaceValue( // serialize and save the value
             fillSpace(7)
             , getStartOffset() + 15
             ,7
             );
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 25
             ,3
             );
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 35
             ,3
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 46
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 56
             ,3
             );
       replaceValue( // serialize and save the value
             fillSpace(7)
             , getStartOffset() + 62
             ,7
             );
       replaceValue( // serialize and save the value
             fillSpace(6)
             , getStartOffset() + 70
             ,6
             );
       replaceValue( // serialize and save the value
             fillSpace(11)
             , getStartOffset() + 121
             ,11
             );
    }


 

	/**
	 *	Returns the value of rpC8Det1Cc
	 *	@return rpC8Det1Cc
	 */
   public char[] getRpC8Det1Cc() throws CFException{
     if (isRpC8Det1CcModified()) { 
        rpC8Det1Cc = refreshRpC8Det1Cc();
     }
   		return rpC8Det1Cc;
   }

  
	/**
	*  set variable rpC8Det1Cc
	*  Corresponding COBOL Variable is RP-C8-DET-1-CC
	*  @param value
	**/
   public void setRpC8Det1Cc(char[] value) {
      rpC8Det1Cc = checkRpC8Det1CcConstraints(value);
      serializeRpC8Det1Cc(rpC8Det1Cc);
   } 

     /**
	 * 	Update RpC8Det1Cc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpC8Det1Cc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpC8Det1Cc,rpC8Det1Cc.length);
   	
   }
   
   public void setRpC8Det1Cc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpC8Det1Cc,rpC8Det1Cc.length);
   	
   }
   
     /**
	 * 	Update RpC8Det1Cc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpC8Det1Cc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC8Det1Cc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpC8Det1Cc with another Field
	 *	@param value
	 */
   public void setRpC8Det1Cc(Field source) {
       replace(source,0,source.length(),beginRpC8Det1Cc,RP_C_8_DET_1_CC_LEN);
   	
   }  
   
     /**
	 * 	Update RpC8Det1Cc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpC8Det1Cc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpC8Det1Cc,RP_C_8_DET_1_CC_LEN);
   	
   }
   
     /**
	 * 	Update RpC8Det1Cc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpC8Det1Cc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC8Det1Cc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpC8Det1Alert
	 *	@return rpC8Det1Alert
	 */
   public char[] getRpC8Det1Alert() throws CFException{
     if (isRpC8Det1AlertModified()) { 
        rpC8Det1Alert = refreshRpC8Det1Alert();
     }
   		return rpC8Det1Alert;
   }

  
	/**
	*  set variable rpC8Det1Alert
	*  Corresponding COBOL Variable is RP-C8-DET-1-ALERT
	*  @param value
	**/
   public void setRpC8Det1Alert(char[] value) {
      rpC8Det1Alert = checkRpC8Det1AlertConstraints(value);
      serializeRpC8Det1Alert(rpC8Det1Alert);
   } 

     /**
	 * 	Update RpC8Det1Alert 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpC8Det1Alert(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpC8Det1Alert,rpC8Det1Alert.length);
   	
   }
   
   public void setRpC8Det1Alert(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpC8Det1Alert,rpC8Det1Alert.length);
   	
   }
   
     /**
	 * 	Update RpC8Det1Alert 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpC8Det1Alert(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC8Det1Alert+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpC8Det1Alert with another Field
	 *	@param value
	 */
   public void setRpC8Det1Alert(Field source) {
       replace(source,0,source.length(),beginRpC8Det1Alert,RP_C_8_DET_1_ALERT_LEN);
   	
   }  
   
     /**
	 * 	Update RpC8Det1Alert 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpC8Det1Alert(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpC8Det1Alert,RP_C_8_DET_1_ALERT_LEN);
   	
   }
   
     /**
	 * 	Update RpC8Det1Alert 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpC8Det1Alert(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC8Det1Alert+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpC8Det1RemMipId
	 *	@return rpC8Det1RemMipId
	 */
   public char[] getRpC8Det1RemMipId() throws CFException{
     if (isRpC8Det1RemMipIdModified()) { 
        rpC8Det1RemMipId = refreshRpC8Det1RemMipId();
     }
   		return rpC8Det1RemMipId;
   }

  
	/**
	*  set variable rpC8Det1RemMipId
	*  Corresponding COBOL Variable is RP-C8-DET-1-REM-MIP-ID
	*  @param value
	**/
   public void setRpC8Det1RemMipId(char[] value) {
      rpC8Det1RemMipId = checkRpC8Det1RemMipIdConstraints(value);
      serializeRpC8Det1RemMipId(rpC8Det1RemMipId);
   } 

     /**
	 * 	Update RpC8Det1RemMipId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpC8Det1RemMipId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpC8Det1RemMipId,rpC8Det1RemMipId.length);
   	
   }
   
   public void setRpC8Det1RemMipId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpC8Det1RemMipId,rpC8Det1RemMipId.length);
   	
   }
   
     /**
	 * 	Update RpC8Det1RemMipId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpC8Det1RemMipId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC8Det1RemMipId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpC8Det1RemMipId with another Field
	 *	@param value
	 */
   public void setRpC8Det1RemMipId(Field source) {
       replace(source,0,source.length(),beginRpC8Det1RemMipId,RP_C_8_DET_1_REM_MIP_ID_LEN);
   	
   }  
   
     /**
	 * 	Update RpC8Det1RemMipId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpC8Det1RemMipId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpC8Det1RemMipId,RP_C_8_DET_1_REM_MIP_ID_LEN);
   	
   }
   
     /**
	 * 	Update RpC8Det1RemMipId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpC8Det1RemMipId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC8Det1RemMipId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpC8Det1OperId
	 *	@return rpC8Det1OperId
	 */
   public char[] getRpC8Det1OperId() throws CFException{
     if (isRpC8Det1OperIdModified()) { 
        rpC8Det1OperId = refreshRpC8Det1OperId();
     }
   		return rpC8Det1OperId;
   }

  
	/**
	*  set variable rpC8Det1OperId
	*  Corresponding COBOL Variable is RP-C8-DET-1-OPER-ID
	*  @param value
	**/
   public void setRpC8Det1OperId(char[] value) {
      rpC8Det1OperId = checkRpC8Det1OperIdConstraints(value);
      serializeRpC8Det1OperId(rpC8Det1OperId);
   } 

     /**
	 * 	Update RpC8Det1OperId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpC8Det1OperId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpC8Det1OperId,rpC8Det1OperId.length);
   	
   }
   
   public void setRpC8Det1OperId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpC8Det1OperId,rpC8Det1OperId.length);
   	
   }
   
     /**
	 * 	Update RpC8Det1OperId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpC8Det1OperId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC8Det1OperId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpC8Det1OperId with another Field
	 *	@param value
	 */
   public void setRpC8Det1OperId(Field source) {
       replace(source,0,source.length(),beginRpC8Det1OperId,RP_C_8_DET_1_OPER_ID_LEN);
   	
   }  
   
     /**
	 * 	Update RpC8Det1OperId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpC8Det1OperId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpC8Det1OperId,RP_C_8_DET_1_OPER_ID_LEN);
   	
   }
   
     /**
	 * 	Update RpC8Det1OperId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpC8Det1OperId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC8Det1OperId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpC8Det1LogDate
	 *	@return rpC8Det1LogDate
	 */
   public char[] getRpC8Det1LogDate() throws CFException{
     if (isRpC8Det1LogDateModified()) { 
        rpC8Det1LogDate = refreshRpC8Det1LogDate();
     }
   		return rpC8Det1LogDate;
   }

  
	/**
	*  set variable rpC8Det1LogDate
	*  Corresponding COBOL Variable is RP-C8-DET-1-LOG-DATE
	*  @param value
	**/
   public void setRpC8Det1LogDate(char[] value) {
      rpC8Det1LogDate = checkRpC8Det1LogDateConstraints(value);
      serializeRpC8Det1LogDate(rpC8Det1LogDate);
   } 

     /**
	 * 	Update RpC8Det1LogDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpC8Det1LogDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpC8Det1LogDate,rpC8Det1LogDate.length);
   	
   }
   
   public void setRpC8Det1LogDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpC8Det1LogDate,rpC8Det1LogDate.length);
   	
   }
   
     /**
	 * 	Update RpC8Det1LogDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpC8Det1LogDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC8Det1LogDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpC8Det1LogDate with another Field
	 *	@param value
	 */
   public void setRpC8Det1LogDate(Field source) {
       replace(source,0,source.length(),beginRpC8Det1LogDate,RP_C_8_DET_1_LOG_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update RpC8Det1LogDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpC8Det1LogDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpC8Det1LogDate,RP_C_8_DET_1_LOG_DATE_LEN);
   	
   }
   
     /**
	 * 	Update RpC8Det1LogDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpC8Det1LogDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC8Det1LogDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpC8Det1LogTime
	 *	@return rpC8Det1LogTime
	 */
   public char[] getRpC8Det1LogTime() throws CFException{
     if (isRpC8Det1LogTimeModified()) { 
        rpC8Det1LogTime = refreshRpC8Det1LogTime();
     }
   		return rpC8Det1LogTime;
   }

  
	/**
	*  set variable rpC8Det1LogTime
	*  Corresponding COBOL Variable is RP-C8-DET-1-LOG-TIME
	*  @param value
	**/
   public void setRpC8Det1LogTime(char[] value) {
      rpC8Det1LogTime = checkRpC8Det1LogTimeConstraints(value);
      serializeRpC8Det1LogTime(rpC8Det1LogTime);
   } 

     /**
	 * 	Update RpC8Det1LogTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpC8Det1LogTime(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpC8Det1LogTime,rpC8Det1LogTime.length);
   	
   }
   
   public void setRpC8Det1LogTime(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpC8Det1LogTime,rpC8Det1LogTime.length);
   	
   }
   
     /**
	 * 	Update RpC8Det1LogTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpC8Det1LogTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC8Det1LogTime+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpC8Det1LogTime with another Field
	 *	@param value
	 */
   public void setRpC8Det1LogTime(Field source) {
       replace(source,0,source.length(),beginRpC8Det1LogTime,RP_C_8_DET_1_LOG_TIME_LEN);
   	
   }  
   
     /**
	 * 	Update RpC8Det1LogTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpC8Det1LogTime(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpC8Det1LogTime,RP_C_8_DET_1_LOG_TIME_LEN);
   	
   }
   
     /**
	 * 	Update RpC8Det1LogTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpC8Det1LogTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC8Det1LogTime+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpC8Det1LocMipId
	 *	@return rpC8Det1LocMipId
	 */
   public char[] getRpC8Det1LocMipId() throws CFException{
     if (isRpC8Det1LocMipIdModified()) { 
        rpC8Det1LocMipId = refreshRpC8Det1LocMipId();
     }
   		return rpC8Det1LocMipId;
   }

  
	/**
	*  set variable rpC8Det1LocMipId
	*  Corresponding COBOL Variable is RP-C8-DET-1-LOC-MIP-ID
	*  @param value
	**/
   public void setRpC8Det1LocMipId(char[] value) {
      rpC8Det1LocMipId = checkRpC8Det1LocMipIdConstraints(value);
      serializeRpC8Det1LocMipId(rpC8Det1LocMipId);
   } 

     /**
	 * 	Update RpC8Det1LocMipId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpC8Det1LocMipId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpC8Det1LocMipId,rpC8Det1LocMipId.length);
   	
   }
   
   public void setRpC8Det1LocMipId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpC8Det1LocMipId,rpC8Det1LocMipId.length);
   	
   }
   
     /**
	 * 	Update RpC8Det1LocMipId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpC8Det1LocMipId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC8Det1LocMipId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpC8Det1LocMipId with another Field
	 *	@param value
	 */
   public void setRpC8Det1LocMipId(Field source) {
       replace(source,0,source.length(),beginRpC8Det1LocMipId,RP_C_8_DET_1_LOC_MIP_ID_LEN);
   	
   }  
   
     /**
	 * 	Update RpC8Det1LocMipId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpC8Det1LocMipId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpC8Det1LocMipId,RP_C_8_DET_1_LOC_MIP_ID_LEN);
   	
   }
   
     /**
	 * 	Update RpC8Det1LocMipId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpC8Det1LocMipId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC8Det1LocMipId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpC8Det1LogType
	 *	@return rpC8Det1LogType
	 */
   public char[] getRpC8Det1LogType() throws CFException{
     if (isRpC8Det1LogTypeModified()) { 
        rpC8Det1LogType = refreshRpC8Det1LogType();
     }
   		return rpC8Det1LogType;
   }

  
	/**
	*  set variable rpC8Det1LogType
	*  Corresponding COBOL Variable is RP-C8-DET-1-LOG-TYPE
	*  @param value
	**/
   public void setRpC8Det1LogType(char[] value) {
      rpC8Det1LogType = checkRpC8Det1LogTypeConstraints(value);
      serializeRpC8Det1LogType(rpC8Det1LogType);
   } 

     /**
	 * 	Update RpC8Det1LogType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpC8Det1LogType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpC8Det1LogType,rpC8Det1LogType.length);
   	
   }
   
   public void setRpC8Det1LogType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpC8Det1LogType,rpC8Det1LogType.length);
   	
   }
   
     /**
	 * 	Update RpC8Det1LogType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpC8Det1LogType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC8Det1LogType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpC8Det1LogType with another Field
	 *	@param value
	 */
   public void setRpC8Det1LogType(Field source) {
       replace(source,0,source.length(),beginRpC8Det1LogType,RP_C_8_DET_1_LOG_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update RpC8Det1LogType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpC8Det1LogType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpC8Det1LogType,RP_C_8_DET_1_LOG_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update RpC8Det1LogType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpC8Det1LogType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC8Det1LogType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpC8Det1LogDesc
	 *	@return rpC8Det1LogDesc
	 */
   public char[] getRpC8Det1LogDesc() throws CFException{
     if (isRpC8Det1LogDescModified()) { 
        rpC8Det1LogDesc = refreshRpC8Det1LogDesc();
     }
   		return rpC8Det1LogDesc;
   }

  
	/**
	*  set variable rpC8Det1LogDesc
	*  Corresponding COBOL Variable is RP-C8-DET-1-LOG-DESC
	*  @param value
	**/
   public void setRpC8Det1LogDesc(char[] value) {
      rpC8Det1LogDesc = checkRpC8Det1LogDescConstraints(value);
      serializeRpC8Det1LogDesc(rpC8Det1LogDesc);
   } 

     /**
	 * 	Update RpC8Det1LogDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpC8Det1LogDesc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpC8Det1LogDesc,rpC8Det1LogDesc.length);
   	
   }
   
   public void setRpC8Det1LogDesc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpC8Det1LogDesc,rpC8Det1LogDesc.length);
   	
   }
   
     /**
	 * 	Update RpC8Det1LogDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpC8Det1LogDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC8Det1LogDesc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpC8Det1LogDesc with another Field
	 *	@param value
	 */
   public void setRpC8Det1LogDesc(Field source) {
       replace(source,0,source.length(),beginRpC8Det1LogDesc,RP_C_8_DET_1_LOG_DESC_LEN);
   	
   }  
   
     /**
	 * 	Update RpC8Det1LogDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpC8Det1LogDesc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpC8Det1LogDesc,RP_C_8_DET_1_LOG_DESC_LEN);
   	
   }
   
     /**
	 * 	Update RpC8Det1LogDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpC8Det1LogDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC8Det1LogDesc+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRpC8Detail1FieldLength() {
			return RP_C_8_DETAIL_1_LENGTH;
		}

}
  
