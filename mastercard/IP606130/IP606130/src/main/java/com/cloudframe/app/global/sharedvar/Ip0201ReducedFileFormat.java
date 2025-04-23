package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip0201ReducedFileFormat is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:21. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip0201ReducedFileFormat")

public class Ip0201ReducedFileFormat extends Ip0201ReducedFileFormatSerialized  implements InitializingBean {
   

						private char[] ip0201EffectiveDate = Field.fillLowValue(5);

						private char[] ip0201EffectiveHour = Field.fillLowValue(2);

						private char[] ip0201ActionCode = Field.fillLowValue(1);

						private char[] ip0201TblSubId = Field.fillLowValue(3);

						private char[] ip0201TableData = Field.fillLowValue(32745);
	
	/**
	* Constructor for Ip0201ReducedFileFormat
	**/
    public Ip0201ReducedFileFormat() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip0201EffectiveDate
	 *	@return ip0201EffectiveDate
	 */
   public char[] getIp0201EffectiveDate() throws CFException{
     if (isIp0201EffectiveDateModified()) { 
        ip0201EffectiveDate = refreshIp0201EffectiveDate();
     }
   		return ip0201EffectiveDate;
   }

  
	/**
	*  set variable ip0201EffectiveDate
	*  Corresponding COBOL Variable is IP0201-EFFECTIVE-DATE
	*  @param value
	**/
   public void setIp0201EffectiveDate(char[] value) {
      ip0201EffectiveDate = checkIp0201EffectiveDateConstraints(value);
      serializeIp0201EffectiveDate(ip0201EffectiveDate);
   } 

     /**
	 * 	Update Ip0201EffectiveDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0201EffectiveDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0201EffectiveDate,ip0201EffectiveDate.length);
   	
   }
   
   public void setIp0201EffectiveDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0201EffectiveDate,ip0201EffectiveDate.length);
   	
   }
   
     /**
	 * 	Update Ip0201EffectiveDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0201EffectiveDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0201EffectiveDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0201EffectiveDate with another Field
	 *	@param value
	 */
   public void setIp0201EffectiveDate(Field source) {
       replace(source,0,source.length(),beginIp0201EffectiveDate,IP_0201_EFFECTIVE_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0201EffectiveDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0201EffectiveDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0201EffectiveDate,IP_0201_EFFECTIVE_DATE_LEN);
   	
   }
   
     /**
	 * 	Update Ip0201EffectiveDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0201EffectiveDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0201EffectiveDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0201EffectiveHour
	 *	@return ip0201EffectiveHour
	 */
   public char[] getIp0201EffectiveHour() throws CFException{
     if (isIp0201EffectiveHourModified()) { 
        ip0201EffectiveHour = refreshIp0201EffectiveHour();
     }
   		return ip0201EffectiveHour;
   }

  
	/**
	*  set variable ip0201EffectiveHour
	*  Corresponding COBOL Variable is IP0201-EFFECTIVE-HOUR
	*  @param value
	**/
   public void setIp0201EffectiveHour(char[] value) {
      ip0201EffectiveHour = checkIp0201EffectiveHourConstraints(value);
      serializeIp0201EffectiveHour(ip0201EffectiveHour);
   } 

     /**
	 * 	Update Ip0201EffectiveHour 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0201EffectiveHour(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0201EffectiveHour,ip0201EffectiveHour.length);
   	
   }
   
   public void setIp0201EffectiveHour(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0201EffectiveHour,ip0201EffectiveHour.length);
   	
   }
   
     /**
	 * 	Update Ip0201EffectiveHour 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0201EffectiveHour(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0201EffectiveHour+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0201EffectiveHour with another Field
	 *	@param value
	 */
   public void setIp0201EffectiveHour(Field source) {
       replace(source,0,source.length(),beginIp0201EffectiveHour,IP_0201_EFFECTIVE_HOUR_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0201EffectiveHour 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0201EffectiveHour(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0201EffectiveHour,IP_0201_EFFECTIVE_HOUR_LEN);
   	
   }
   
     /**
	 * 	Update Ip0201EffectiveHour 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0201EffectiveHour(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0201EffectiveHour+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0201ActionCode
	 *	@return ip0201ActionCode
	 */
   public char[] getIp0201ActionCode() throws CFException{
     if (isIp0201ActionCodeModified()) { 
        ip0201ActionCode = refreshIp0201ActionCode();
     }
   		return ip0201ActionCode;
   }

  
	/**
	*  set variable ip0201ActionCode
	*  Corresponding COBOL Variable is IP0201-ACTION-CODE
	*  @param value
	**/
   public void setIp0201ActionCode(char[] value) {
      ip0201ActionCode = checkIp0201ActionCodeConstraints(value);
      serializeIp0201ActionCode(ip0201ActionCode);
   } 

     /**
	 * 	Update Ip0201ActionCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0201ActionCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0201ActionCode,ip0201ActionCode.length);
   	
   }
   
   public void setIp0201ActionCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0201ActionCode,ip0201ActionCode.length);
   	
   }
   
     /**
	 * 	Update Ip0201ActionCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0201ActionCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0201ActionCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0201ActionCode with another Field
	 *	@param value
	 */
   public void setIp0201ActionCode(Field source) {
       replace(source,0,source.length(),beginIp0201ActionCode,IP_0201_ACTION_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0201ActionCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0201ActionCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0201ActionCode,IP_0201_ACTION_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Ip0201ActionCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0201ActionCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0201ActionCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0201TblSubId
	 *	@return ip0201TblSubId
	 */
   public char[] getIp0201TblSubId() throws CFException{
     if (isIp0201TblSubIdModified()) { 
        ip0201TblSubId = refreshIp0201TblSubId();
     }
   		return ip0201TblSubId;
   }

  
	/**
	*  set variable ip0201TblSubId
	*  Corresponding COBOL Variable is IP0201-TBL-SUB-ID
	*  @param value
	**/
   public void setIp0201TblSubId(char[] value) {
      ip0201TblSubId = checkIp0201TblSubIdConstraints(value);
      serializeIp0201TblSubId(ip0201TblSubId);
   } 

     /**
	 * 	Update Ip0201TblSubId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0201TblSubId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0201TblSubId,ip0201TblSubId.length);
   	
   }
   
   public void setIp0201TblSubId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0201TblSubId,ip0201TblSubId.length);
   	
   }
   
     /**
	 * 	Update Ip0201TblSubId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0201TblSubId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0201TblSubId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0201TblSubId with another Field
	 *	@param value
	 */
   public void setIp0201TblSubId(Field source) {
       replace(source,0,source.length(),beginIp0201TblSubId,IP_0201_TBL_SUB_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0201TblSubId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0201TblSubId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0201TblSubId,IP_0201_TBL_SUB_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip0201TblSubId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0201TblSubId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0201TblSubId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0201TableData
	 *	@return ip0201TableData
	 */
   public char[] getIp0201TableData() throws CFException{
     if (isIp0201TableDataModified()) { 
        ip0201TableData = refreshIp0201TableData();
     }
   		return ip0201TableData;
   }

  
	/**
	*  set variable ip0201TableData
	*  Corresponding COBOL Variable is IP0201-TABLE-DATA
	*  @param value
	**/
   public void setIp0201TableData(char[] value) {
      ip0201TableData = checkIp0201TableDataConstraints(value);
      serializeIp0201TableData(ip0201TableData);
   } 

     /**
	 * 	Update Ip0201TableData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0201TableData(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0201TableData,ip0201TableData.length);
   	
   }
   
   public void setIp0201TableData(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0201TableData,ip0201TableData.length);
   	
   }
   
     /**
	 * 	Update Ip0201TableData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0201TableData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0201TableData+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0201TableData with another Field
	 *	@param value
	 */
   public void setIp0201TableData(Field source) {
       replace(source,0,source.length(),beginIp0201TableData,IP_0201_TABLE_DATA_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0201TableData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0201TableData(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0201TableData,IP_0201_TABLE_DATA_LEN);
   	
   }
   
     /**
	 * 	Update Ip0201TableData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0201TableData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0201TableData+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip0201ReducedFileFormat
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp0201EffectiveDate(CONSTANTS.SPACE_5);
         setIp0201EffectiveHour(CONSTANTS.SPACE_2);
         setIp0201ActionCode(CONSTANTS.SPACE);
         setIp0201TblSubId(CONSTANTS.SPACE_3);
         setIp0201TableData(CONSTANTS.SPACE_32745);
   }

		public static int getIp0201ReducedFileFormatFieldLength() {
			return IP_0201_REDUCED_FILE_FORMAT_LENGTH;
		}

}
  
