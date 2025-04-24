package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip00901BsArMaster is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:32. using version 5.0.0.254
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip00901BsArMaster extends Ip00901BsArMasterSerialized { 
   

						private char[] ip00901EffectiveDate = Field.fillLowValue(10);

						private char[] ip00901ActiveInactive = Field.fillLowValue(1);
				private Ip00901ParameterMasterData ip00901ParameterMasterData = new Ip00901ParameterMasterData();
				private Ip00901TableData ip00901TableData = new Ip00901TableData();
	
	/**
	* Constructor for Ip00901BsArMaster
	**/
    public Ip00901BsArMaster() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			ip00901ParameterMasterData.setParent(this,getStartOffset() + 11);
	       			ip00901TableData.setParent(this,getStartOffset() + 19);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip00901EffectiveDate
	 *	@return ip00901EffectiveDate
	 */
   public char[] getIp00901EffectiveDate() throws CFException{
     if (isIp00901EffectiveDateModified()) { 
        ip00901EffectiveDate = refreshIp00901EffectiveDate();
     }
   		return ip00901EffectiveDate;
   }

  
	/**
	*  set variable ip00901EffectiveDate
	*  Corresponding COBOL Variable is IP00901-EFFECTIVE-DATE
	*  @param value
	**/
   public void setIp00901EffectiveDate(char[] value) {
      ip00901EffectiveDate = checkIp00901EffectiveDateConstraints(value);
      serializeIp00901EffectiveDate(ip00901EffectiveDate);
   } 

     /**
	 * 	Update Ip00901EffectiveDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00901EffectiveDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00901EffectiveDate,ip00901EffectiveDate.length);
   	
   }
   
   public void setIp00901EffectiveDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00901EffectiveDate,ip00901EffectiveDate.length);
   	
   }
   
     /**
	 * 	Update Ip00901EffectiveDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00901EffectiveDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00901EffectiveDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00901EffectiveDate with another Field
	 *	@param value
	 */
   public void setIp00901EffectiveDate(Field source) {
       replace(source,0,source.length(),beginIp00901EffectiveDate,IP_00901_EFFECTIVE_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00901EffectiveDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00901EffectiveDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00901EffectiveDate,IP_00901_EFFECTIVE_DATE_LEN);
   	
   }
   
     /**
	 * 	Update Ip00901EffectiveDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00901EffectiveDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00901EffectiveDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00901ActiveInactive
	 *	@return ip00901ActiveInactive
	 */
   public char[] getIp00901ActiveInactive() throws CFException{
     if (isIp00901ActiveInactiveModified()) { 
        ip00901ActiveInactive = refreshIp00901ActiveInactive();
     }
   		return ip00901ActiveInactive;
   }

  
	/**
	*  set variable ip00901ActiveInactive
	*  Corresponding COBOL Variable is IP00901-ACTIVE-INACTIVE
	*  @param value
	**/
   public void setIp00901ActiveInactive(char[] value) {
      ip00901ActiveInactive = checkIp00901ActiveInactiveConstraints(value);
      serializeIp00901ActiveInactive(ip00901ActiveInactive);
   } 

     /**
	 * 	Update Ip00901ActiveInactive 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00901ActiveInactive(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00901ActiveInactive,ip00901ActiveInactive.length);
   	
   }
   
   public void setIp00901ActiveInactive(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00901ActiveInactive,ip00901ActiveInactive.length);
   	
   }
   
     /**
	 * 	Update Ip00901ActiveInactive 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00901ActiveInactive(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00901ActiveInactive+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00901ActiveInactive with another Field
	 *	@param value
	 */
   public void setIp00901ActiveInactive(Field source) {
       replace(source,0,source.length(),beginIp00901ActiveInactive,IP_00901_ACTIVE_INACTIVE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00901ActiveInactive 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00901ActiveInactive(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00901ActiveInactive,IP_00901_ACTIVE_INACTIVE_LEN);
   	
   }
   
     /**
	 * 	Update Ip00901ActiveInactive 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00901ActiveInactive(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00901ActiveInactive+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00901ParameterMasterData
	 *	@return ip00901ParameterMasterData
	 */   
	 public Ip00901ParameterMasterData getIp00901ParameterMasterData() {
   	return ip00901ParameterMasterData;
   }
   /**
	* 	Update Ip00901ParameterMasterData with the passed value
	*   Corresponding COBOL Variable is IP00901-PARAMETER-MASTER-DATA
	*	@param value
	*/
   public void setIp00901ParameterMasterData(char[] value) {
      ip00901ParameterMasterData.setString(value); 
   }   
    
     /**
	 * 	Update Ip00901ParameterMasterData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp00901ParameterMasterData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00901ParameterMasterData.begin,ip00901ParameterMasterData.length());
   }
   
     /**
	 * 	Update Ip00901ParameterMasterData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00901ParameterMasterData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00901ParameterMasterData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip00901ParameterMasterData with another Field
	 *	@param value
	 */
   public void setIp00901ParameterMasterData(Field source) {
   	replace(source,0,source.length(),ip00901ParameterMasterData.begin,ip00901ParameterMasterData.length());
   }  
   
     /**
	 * 	Update Ip00901ParameterMasterData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp00901ParameterMasterData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00901ParameterMasterData.begin,ip00901ParameterMasterData.length());
   }
   
     /**
	 * 	Update Ip00901ParameterMasterData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00901ParameterMasterData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00901ParameterMasterData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip00901TableData
	 *	@return ip00901TableData
	 */   
	 public Ip00901TableData getIp00901TableData() {
   	return ip00901TableData;
   }
   /**
	* 	Update Ip00901TableData with the passed value
	*   Corresponding COBOL Variable is IP00901-TABLE-DATA
	*	@param value
	*/
   public void setIp00901TableData(char[] value) {
      ip00901TableData.setString(value); 
   }   
    
     /**
	 * 	Update Ip00901TableData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp00901TableData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00901TableData.begin,ip00901TableData.length());
   }
   
     /**
	 * 	Update Ip00901TableData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00901TableData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00901TableData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip00901TableData with another Field
	 *	@param value
	 */
   public void setIp00901TableData(Field source) {
   	replace(source,0,source.length(),ip00901TableData.begin,ip00901TableData.length());
   }  
   
     /**
	 * 	Update Ip00901TableData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp00901TableData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00901TableData.begin,ip00901TableData.length());
   }
   
     /**
	 * 	Update Ip00901TableData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00901TableData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00901TableData.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip00901BsArMaster
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp00901EffectiveDate(CONSTANTS.SPACE_10);
         setIp00901ActiveInactive(CONSTANTS.SPACE);
          ip00901ParameterMasterData.initialize();
     
          ip00901TableData.initialize();
     
   }

		public static int getIp00901BsArMasterFieldLength() {
			return IP_00901_BS_AR_MASTER_LENGTH;
		}

}
  
