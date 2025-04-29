package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip5000ParameterMasterRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:24. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip5000ParameterMasterRec")

public class Ip5000ParameterMasterRec extends Ip5000ParameterMasterRecSerialized  implements InitializingBean {
   

						private char[] ip5000EffectiveDate = Field.fillLowValue(10);

						private char[] ip5000ActionCode = Field.fillLowValue(1);
				private Ip5000ParameterMasterData ip5000ParameterMasterData = new Ip5000ParameterMasterData();
	
	/**
	* Constructor for Ip5000ParameterMasterRec
	**/
    public Ip5000ParameterMasterRec() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip5000ParameterMasterData.setParent(this,getStartOffset() + 11);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip5000EffectiveDate
	 *	@return ip5000EffectiveDate
	 */
   public char[] getIp5000EffectiveDate() throws CFException{
     if (isIp5000EffectiveDateModified()) { 
        ip5000EffectiveDate = refreshIp5000EffectiveDate();
     }
   		return ip5000EffectiveDate;
   }

  
	/**
	*  set variable ip5000EffectiveDate
	*  Corresponding COBOL Variable is IP5000-EFFECTIVE-DATE
	*  @param value
	**/
   public void setIp5000EffectiveDate(char[] value) {
      ip5000EffectiveDate = checkIp5000EffectiveDateConstraints(value);
      serializeIp5000EffectiveDate(ip5000EffectiveDate);
   } 

     /**
	 * 	Update Ip5000EffectiveDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp5000EffectiveDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp5000EffectiveDate,ip5000EffectiveDate.length);
   	
   }
   
   public void setIp5000EffectiveDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp5000EffectiveDate,ip5000EffectiveDate.length);
   	
   }
   
     /**
	 * 	Update Ip5000EffectiveDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp5000EffectiveDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp5000EffectiveDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip5000EffectiveDate with another Field
	 *	@param value
	 */
   public void setIp5000EffectiveDate(Field source) {
       replace(source,0,source.length(),beginIp5000EffectiveDate,IP_5000_EFFECTIVE_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip5000EffectiveDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp5000EffectiveDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp5000EffectiveDate,IP_5000_EFFECTIVE_DATE_LEN);
   	
   }
   
     /**
	 * 	Update Ip5000EffectiveDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp5000EffectiveDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp5000EffectiveDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip5000ActionCode
	 *	@return ip5000ActionCode
	 */
   public char[] getIp5000ActionCode() throws CFException{
     if (isIp5000ActionCodeModified()) { 
        ip5000ActionCode = refreshIp5000ActionCode();
     }
   		return ip5000ActionCode;
   }

  
	/**
	*  set variable ip5000ActionCode
	*  Corresponding COBOL Variable is IP5000-ACTION-CODE
	*  @param value
	**/
   public void setIp5000ActionCode(char[] value) {
      ip5000ActionCode = checkIp5000ActionCodeConstraints(value);
      serializeIp5000ActionCode(ip5000ActionCode);
   } 

     /**
	 * 	Update Ip5000ActionCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp5000ActionCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp5000ActionCode,ip5000ActionCode.length);
   	
   }
   
   public void setIp5000ActionCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp5000ActionCode,ip5000ActionCode.length);
   	
   }
   
     /**
	 * 	Update Ip5000ActionCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp5000ActionCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp5000ActionCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip5000ActionCode with another Field
	 *	@param value
	 */
   public void setIp5000ActionCode(Field source) {
       replace(source,0,source.length(),beginIp5000ActionCode,IP_5000_ACTION_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip5000ActionCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp5000ActionCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp5000ActionCode,IP_5000_ACTION_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Ip5000ActionCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp5000ActionCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp5000ActionCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip5000ParameterMasterData
	 *	@return ip5000ParameterMasterData
	 */   
	 public Ip5000ParameterMasterData getIp5000ParameterMasterData() {
   	return ip5000ParameterMasterData;
   }
   /**
	* 	Update Ip5000ParameterMasterData with the passed value
	*   Corresponding COBOL Variable is IP5000-PARAMETER-MASTER-DATA
	*	@param value
	*/
   public void setIp5000ParameterMasterData(char[] value) {
      ip5000ParameterMasterData.setString(value); 
   }   
    
     /**
	 * 	Update Ip5000ParameterMasterData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp5000ParameterMasterData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip5000ParameterMasterData.begin,ip5000ParameterMasterData.length());
   }
   
     /**
	 * 	Update Ip5000ParameterMasterData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp5000ParameterMasterData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip5000ParameterMasterData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip5000ParameterMasterData with another Field
	 *	@param value
	 */
   public void setIp5000ParameterMasterData(Field source) {
   	replace(source,0,source.length(),ip5000ParameterMasterData.begin,ip5000ParameterMasterData.length());
   }  
   
     /**
	 * 	Update Ip5000ParameterMasterData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp5000ParameterMasterData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip5000ParameterMasterData.begin,ip5000ParameterMasterData.length());
   }
   
     /**
	 * 	Update Ip5000ParameterMasterData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp5000ParameterMasterData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip5000ParameterMasterData.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip5000ParameterMasterRec
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp5000EffectiveDate(CONSTANTS.SPACE_10);
         setIp5000ActionCode(CONSTANTS.SPACE);
          ip5000ParameterMasterData.initialize();
     
   }

		public static int getIp5000ParameterMasterRecFieldLength() {
			return IP_5000_PARAMETER_MASTER_REC_LENGTH;
		}

}
  
