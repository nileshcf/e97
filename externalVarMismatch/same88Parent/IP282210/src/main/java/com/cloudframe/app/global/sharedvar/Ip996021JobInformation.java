package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip996021JobInformation is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:33. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip996021JobInformation")

public class Ip996021JobInformation extends Ip996021JobInformationSerialized  implements InitializingBean {
   

						private char[] ip996021JobId = Field.fillLowValue(8);

						private char[] ip996021JobName = Field.fillLowValue(8);

						private char[] ip996021UserId = Field.fillLowValue(8);

						private char[] ip996021LparName = Field.fillLowValue(4);

	
	/**
	* Constructor for Ip996021JobInformation
	**/
    public Ip996021JobInformation() {
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
	 *	Returns the value of ip996021JobId
	 *	@return ip996021JobId
	 */
   public char[] getIp996021JobId() throws CFException{
     if (isIp996021JobIdModified()) { 
        ip996021JobId = refreshIp996021JobId();
     }
   		return ip996021JobId;
   }

  
	/**
	*  set variable ip996021JobId
	*  Corresponding COBOL Variable is IP996021-JOB-ID
	*  @param value
	**/
   public void setIp996021JobId(char[] value) {
      ip996021JobId = checkIp996021JobIdConstraints(value);
      serializeIp996021JobId(ip996021JobId);
   } 

     /**
	 * 	Update Ip996021JobId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp996021JobId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp996021JobId,ip996021JobId.length);
   	
   }
   
   public void setIp996021JobId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp996021JobId,ip996021JobId.length);
   	
   }
   
     /**
	 * 	Update Ip996021JobId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp996021JobId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp996021JobId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip996021JobId with another Field
	 *	@param value
	 */
   public void setIp996021JobId(Field source) {
       replace(source,0,source.length(),beginIp996021JobId,IP_996021_JOB_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip996021JobId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp996021JobId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp996021JobId,IP_996021_JOB_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip996021JobId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp996021JobId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp996021JobId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip996021JobName
	 *	@return ip996021JobName
	 */
   public char[] getIp996021JobName() throws CFException{
     if (isIp996021JobNameModified()) { 
        ip996021JobName = refreshIp996021JobName();
     }
   		return ip996021JobName;
   }

  
	/**
	*  set variable ip996021JobName
	*  Corresponding COBOL Variable is IP996021-JOB-NAME
	*  @param value
	**/
   public void setIp996021JobName(char[] value) {
      ip996021JobName = checkIp996021JobNameConstraints(value);
      serializeIp996021JobName(ip996021JobName);
   } 

     /**
	 * 	Update Ip996021JobName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp996021JobName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp996021JobName,ip996021JobName.length);
   	
   }
   
   public void setIp996021JobName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp996021JobName,ip996021JobName.length);
   	
   }
   
     /**
	 * 	Update Ip996021JobName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp996021JobName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp996021JobName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip996021JobName with another Field
	 *	@param value
	 */
   public void setIp996021JobName(Field source) {
       replace(source,0,source.length(),beginIp996021JobName,IP_996021_JOB_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip996021JobName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp996021JobName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp996021JobName,IP_996021_JOB_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip996021JobName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp996021JobName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp996021JobName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip996021UserId
	 *	@return ip996021UserId
	 */
   public char[] getIp996021UserId() throws CFException{
     if (isIp996021UserIdModified()) { 
        ip996021UserId = refreshIp996021UserId();
     }
   		return ip996021UserId;
   }

  
	/**
	*  set variable ip996021UserId
	*  Corresponding COBOL Variable is IP996021-USER-ID
	*  @param value
	**/
   public void setIp996021UserId(char[] value) {
      ip996021UserId = checkIp996021UserIdConstraints(value);
      serializeIp996021UserId(ip996021UserId);
   } 

     /**
	 * 	Update Ip996021UserId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp996021UserId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp996021UserId,ip996021UserId.length);
   	
   }
   
   public void setIp996021UserId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp996021UserId,ip996021UserId.length);
   	
   }
   
     /**
	 * 	Update Ip996021UserId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp996021UserId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp996021UserId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip996021UserId with another Field
	 *	@param value
	 */
   public void setIp996021UserId(Field source) {
       replace(source,0,source.length(),beginIp996021UserId,IP_996021_USER_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip996021UserId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp996021UserId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp996021UserId,IP_996021_USER_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip996021UserId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp996021UserId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp996021UserId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip996021LparName
	 *	@return ip996021LparName
	 */
   public char[] getIp996021LparName() throws CFException{
     if (isIp996021LparNameModified()) { 
        ip996021LparName = refreshIp996021LparName();
     }
   		return ip996021LparName;
   }

  
	/**
	*  set variable ip996021LparName
	*  Corresponding COBOL Variable is IP996021-LPAR-NAME
	*  @param value
	**/
   public void setIp996021LparName(char[] value) {
      ip996021LparName = checkIp996021LparNameConstraints(value);
      serializeIp996021LparName(ip996021LparName);
   } 

     /**
	 * 	Update Ip996021LparName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp996021LparName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp996021LparName,ip996021LparName.length);
   	
   }
   
   public void setIp996021LparName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp996021LparName,ip996021LparName.length);
   	
   }
   
     /**
	 * 	Update Ip996021LparName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp996021LparName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp996021LparName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip996021LparName with another Field
	 *	@param value
	 */
   public void setIp996021LparName(Field source) {
       replace(source,0,source.length(),beginIp996021LparName,IP_996021_LPAR_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip996021LparName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp996021LparName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp996021LparName,IP_996021_LPAR_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip996021LparName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp996021LparName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp996021LparName+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip996021JobInformation
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp996021JobId(CONSTANTS.SPACE_8);
         setIp996021JobName(CONSTANTS.SPACE_8);
         setIp996021UserId(CONSTANTS.SPACE_8);
         setIp996021LparName(CONSTANTS.SPACE_4);
   }

		public static int getIp996021JobInformationFieldLength() {
			return IP_996021_JOB_INFORMATION_LENGTH;
		}

}
  
