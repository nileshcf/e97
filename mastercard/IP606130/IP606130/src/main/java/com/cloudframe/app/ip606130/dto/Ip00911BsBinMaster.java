package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip00911BsBinMaster is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:17. using version 5.0.0.257
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip00911BsBinMaster extends Ip00911BsBinMasterSerialized {
   

						private char[] ip00911EffectiveDate = Field.fillLowValue(10);

						private char[] ip00911ActiveInactive = Field.fillLowValue(1);
				private Ip00911ParameterMasterData ip00911ParameterMasterData = new Ip00911ParameterMasterData();
				private Ip00911TableData ip00911TableData = new Ip00911TableData();
	
	/**
	* Constructor for Ip00911BsBinMaster
	**/
    public Ip00911BsBinMaster() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			ip00911ParameterMasterData.setParent(this,getStartOffset() + 11);
	       			ip00911TableData.setParent(this,getStartOffset() + 19);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip00911EffectiveDate
	 *	@return ip00911EffectiveDate
	 */
   public char[] getIp00911EffectiveDate() throws CFException{
     if (isIp00911EffectiveDateModified()) { 
        ip00911EffectiveDate = refreshIp00911EffectiveDate();
     }
   		return ip00911EffectiveDate;
   }

  
	/**
	*  set variable ip00911EffectiveDate
	*  Corresponding COBOL Variable is IP00911-EFFECTIVE-DATE
	*  @param value
	**/
   public void setIp00911EffectiveDate(char[] value) {
      ip00911EffectiveDate = checkIp00911EffectiveDateConstraints(value);
      serializeIp00911EffectiveDate(ip00911EffectiveDate);
   } 

     /**
	 * 	Update Ip00911EffectiveDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00911EffectiveDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00911EffectiveDate,ip00911EffectiveDate.length);
   	
   }
   
   public void setIp00911EffectiveDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00911EffectiveDate,ip00911EffectiveDate.length);
   	
   }
   
     /**
	 * 	Update Ip00911EffectiveDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00911EffectiveDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00911EffectiveDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00911EffectiveDate with another Field
	 *	@param value
	 */
   public void setIp00911EffectiveDate(Field source) {
       replace(source,0,source.length(),beginIp00911EffectiveDate,IP_00911_EFFECTIVE_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00911EffectiveDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00911EffectiveDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00911EffectiveDate,IP_00911_EFFECTIVE_DATE_LEN);
   	
   }
   
     /**
	 * 	Update Ip00911EffectiveDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00911EffectiveDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00911EffectiveDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00911ActiveInactive
	 *	@return ip00911ActiveInactive
	 */
   public char[] getIp00911ActiveInactive() throws CFException{
     if (isIp00911ActiveInactiveModified()) { 
        ip00911ActiveInactive = refreshIp00911ActiveInactive();
     }
   		return ip00911ActiveInactive;
   }

  
	/**
	*  set variable ip00911ActiveInactive
	*  Corresponding COBOL Variable is IP00911-ACTIVE-INACTIVE
	*  @param value
	**/
   public void setIp00911ActiveInactive(char[] value) {
      ip00911ActiveInactive = checkIp00911ActiveInactiveConstraints(value);
      serializeIp00911ActiveInactive(ip00911ActiveInactive);
   } 

     /**
	 * 	Update Ip00911ActiveInactive 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00911ActiveInactive(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00911ActiveInactive,ip00911ActiveInactive.length);
   	
   }
   
   public void setIp00911ActiveInactive(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00911ActiveInactive,ip00911ActiveInactive.length);
   	
   }
   
     /**
	 * 	Update Ip00911ActiveInactive 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00911ActiveInactive(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00911ActiveInactive+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00911ActiveInactive with another Field
	 *	@param value
	 */
   public void setIp00911ActiveInactive(Field source) {
       replace(source,0,source.length(),beginIp00911ActiveInactive,IP_00911_ACTIVE_INACTIVE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00911ActiveInactive 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00911ActiveInactive(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00911ActiveInactive,IP_00911_ACTIVE_INACTIVE_LEN);
   	
   }
   
     /**
	 * 	Update Ip00911ActiveInactive 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00911ActiveInactive(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00911ActiveInactive+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00911ParameterMasterData
	 *	@return ip00911ParameterMasterData
	 */   
	 public Ip00911ParameterMasterData getIp00911ParameterMasterData() {
   	return ip00911ParameterMasterData;
   }
   /**
	* 	Update Ip00911ParameterMasterData with the passed value
	*   Corresponding COBOL Variable is IP00911-PARAMETER-MASTER-DATA
	*	@param value
	*/
   public void setIp00911ParameterMasterData(char[] value) {
      ip00911ParameterMasterData.setString(value); 
   }   
    
     /**
	 * 	Update Ip00911ParameterMasterData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp00911ParameterMasterData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00911ParameterMasterData.begin,ip00911ParameterMasterData.length());
   }
   
     /**
	 * 	Update Ip00911ParameterMasterData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00911ParameterMasterData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00911ParameterMasterData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip00911ParameterMasterData with another Field
	 *	@param value
	 */
   public void setIp00911ParameterMasterData(Field source) {
   	replace(source,0,source.length(),ip00911ParameterMasterData.begin,ip00911ParameterMasterData.length());
   }  
   
     /**
	 * 	Update Ip00911ParameterMasterData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp00911ParameterMasterData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00911ParameterMasterData.begin,ip00911ParameterMasterData.length());
   }
   
     /**
	 * 	Update Ip00911ParameterMasterData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00911ParameterMasterData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00911ParameterMasterData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip00911TableData
	 *	@return ip00911TableData
	 */   
	 public Ip00911TableData getIp00911TableData() {
   	return ip00911TableData;
   }
   /**
	* 	Update Ip00911TableData with the passed value
	*   Corresponding COBOL Variable is IP00911-TABLE-DATA
	*	@param value
	*/
   public void setIp00911TableData(char[] value) {
      ip00911TableData.setString(value); 
   }   
    
     /**
	 * 	Update Ip00911TableData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp00911TableData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00911TableData.begin,ip00911TableData.length());
   }
   
     /**
	 * 	Update Ip00911TableData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00911TableData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00911TableData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip00911TableData with another Field
	 *	@param value
	 */
   public void setIp00911TableData(Field source) {
   	replace(source,0,source.length(),ip00911TableData.begin,ip00911TableData.length());
   }  
   
     /**
	 * 	Update Ip00911TableData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp00911TableData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00911TableData.begin,ip00911TableData.length());
   }
   
     /**
	 * 	Update Ip00911TableData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00911TableData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00911TableData.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip00911BsBinMaster
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp00911EffectiveDate(CONSTANTS.SPACE_10);
         setIp00911ActiveInactive(CONSTANTS.SPACE);
          ip00911ParameterMasterData.initialize();
     
          ip00911TableData.initialize();
     
   }

		public static int getIp00911BsBinMasterFieldLength() {
			return IP_00911_BS_BIN_MASTER_LENGTH;
		}

}
  
