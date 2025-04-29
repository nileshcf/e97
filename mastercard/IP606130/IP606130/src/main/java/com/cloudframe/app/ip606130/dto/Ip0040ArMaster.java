package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip0040ArMaster is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:24. using version 5.0.0.254
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip0040ArMaster extends Ip0040ArMasterSerialized {
   

						private char[] ip0040EffectiveDate = Field.fillLowValue(10);

						private char[] ip0040ActiveInactive = Field.fillLowValue(1);
				private Ip0040ParameterMasterData ip0040ParameterMasterData = new Ip0040ParameterMasterData();
				private Ip0040TableData ip0040TableData = new Ip0040TableData();

						private char[] ip0040Filler = Field.fillLowValue(5);
	
	/**
	* Constructor for Ip0040ArMaster
	**/
    public Ip0040ArMaster() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			ip0040ParameterMasterData.setParent(this,getStartOffset() + 11);
	       			ip0040TableData.setParent(this,getStartOffset() + 19);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip0040EffectiveDate
	 *	@return ip0040EffectiveDate
	 */
   public char[] getIp0040EffectiveDate() throws CFException{
     if (isIp0040EffectiveDateModified()) { 
        ip0040EffectiveDate = refreshIp0040EffectiveDate();
     }
   		return ip0040EffectiveDate;
   }

  
	/**
	*  set variable ip0040EffectiveDate
	*  Corresponding COBOL Variable is IP0040-EFFECTIVE-DATE
	*  @param value
	**/
   public void setIp0040EffectiveDate(char[] value) {
      ip0040EffectiveDate = checkIp0040EffectiveDateConstraints(value);
      serializeIp0040EffectiveDate(ip0040EffectiveDate);
   } 

     /**
	 * 	Update Ip0040EffectiveDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040EffectiveDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040EffectiveDate,ip0040EffectiveDate.length);
   	
   }
   
   public void setIp0040EffectiveDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040EffectiveDate,ip0040EffectiveDate.length);
   	
   }
   
     /**
	 * 	Update Ip0040EffectiveDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040EffectiveDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040EffectiveDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040EffectiveDate with another Field
	 *	@param value
	 */
   public void setIp0040EffectiveDate(Field source) {
       replace(source,0,source.length(),beginIp0040EffectiveDate,IP_0040_EFFECTIVE_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040EffectiveDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040EffectiveDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040EffectiveDate,IP_0040_EFFECTIVE_DATE_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040EffectiveDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040EffectiveDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040EffectiveDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040ActiveInactive
	 *	@return ip0040ActiveInactive
	 */
   public char[] getIp0040ActiveInactive() throws CFException{
     if (isIp0040ActiveInactiveModified()) { 
        ip0040ActiveInactive = refreshIp0040ActiveInactive();
     }
   		return ip0040ActiveInactive;
   }

  
	/**
	*  set variable ip0040ActiveInactive
	*  Corresponding COBOL Variable is IP0040-ACTIVE-INACTIVE
	*  @param value
	**/
   public void setIp0040ActiveInactive(char[] value) {
      ip0040ActiveInactive = checkIp0040ActiveInactiveConstraints(value);
      serializeIp0040ActiveInactive(ip0040ActiveInactive);
   } 

     /**
	 * 	Update Ip0040ActiveInactive 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040ActiveInactive(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040ActiveInactive,ip0040ActiveInactive.length);
   	
   }
   
   public void setIp0040ActiveInactive(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040ActiveInactive,ip0040ActiveInactive.length);
   	
   }
   
     /**
	 * 	Update Ip0040ActiveInactive 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040ActiveInactive(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040ActiveInactive+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040ActiveInactive with another Field
	 *	@param value
	 */
   public void setIp0040ActiveInactive(Field source) {
       replace(source,0,source.length(),beginIp0040ActiveInactive,IP_0040_ACTIVE_INACTIVE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040ActiveInactive 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040ActiveInactive(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040ActiveInactive,IP_0040_ACTIVE_INACTIVE_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040ActiveInactive 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040ActiveInactive(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040ActiveInactive+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040ParameterMasterData
	 *	@return ip0040ParameterMasterData
	 */   
	 public Ip0040ParameterMasterData getIp0040ParameterMasterData() {
   	return ip0040ParameterMasterData;
   }
   /**
	* 	Update Ip0040ParameterMasterData with the passed value
	*   Corresponding COBOL Variable is IP0040-PARAMETER-MASTER-DATA
	*	@param value
	*/
   public void setIp0040ParameterMasterData(char[] value) {
      ip0040ParameterMasterData.setString(value); 
   }   
    
     /**
	 * 	Update Ip0040ParameterMasterData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp0040ParameterMasterData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0040ParameterMasterData.begin,ip0040ParameterMasterData.length());
   }
   
     /**
	 * 	Update Ip0040ParameterMasterData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040ParameterMasterData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0040ParameterMasterData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip0040ParameterMasterData with another Field
	 *	@param value
	 */
   public void setIp0040ParameterMasterData(Field source) {
   	replace(source,0,source.length(),ip0040ParameterMasterData.begin,ip0040ParameterMasterData.length());
   }  
   
     /**
	 * 	Update Ip0040ParameterMasterData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp0040ParameterMasterData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0040ParameterMasterData.begin,ip0040ParameterMasterData.length());
   }
   
     /**
	 * 	Update Ip0040ParameterMasterData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040ParameterMasterData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0040ParameterMasterData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip0040TableData
	 *	@return ip0040TableData
	 */   
	 public Ip0040TableData getIp0040TableData() {
   	return ip0040TableData;
   }
   /**
	* 	Update Ip0040TableData with the passed value
	*   Corresponding COBOL Variable is IP0040-TABLE-DATA
	*	@param value
	*/
   public void setIp0040TableData(char[] value) {
      ip0040TableData.setString(value); 
   }   
    
     /**
	 * 	Update Ip0040TableData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp0040TableData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0040TableData.begin,ip0040TableData.length());
   }
   
     /**
	 * 	Update Ip0040TableData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040TableData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0040TableData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip0040TableData with another Field
	 *	@param value
	 */
   public void setIp0040TableData(Field source) {
   	replace(source,0,source.length(),ip0040TableData.begin,ip0040TableData.length());
   }  
   
     /**
	 * 	Update Ip0040TableData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp0040TableData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0040TableData.begin,ip0040TableData.length());
   }
   
     /**
	 * 	Update Ip0040TableData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040TableData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0040TableData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip0040Filler
	 *	@return ip0040Filler
	 */
   public char[] getIp0040Filler() throws CFException{
     if (isIp0040FillerModified()) { 
        ip0040Filler = refreshIp0040Filler();
     }
   		return ip0040Filler;
   }

  
	/**
	*  set variable ip0040Filler
	*  Corresponding COBOL Variable is IP0040-FILLER
	*  @param value
	**/
   public void setIp0040Filler(char[] value) {
      ip0040Filler = checkIp0040FillerConstraints(value);
      serializeIp0040Filler(ip0040Filler);
   } 

     /**
	 * 	Update Ip0040Filler 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040Filler(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040Filler,ip0040Filler.length);
   	
   }
   
   public void setIp0040Filler(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040Filler,ip0040Filler.length);
   	
   }
   
     /**
	 * 	Update Ip0040Filler 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040Filler(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040Filler+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040Filler with another Field
	 *	@param value
	 */
   public void setIp0040Filler(Field source) {
       replace(source,0,source.length(),beginIp0040Filler,IP_0040_FILLER_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040Filler 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040Filler(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040Filler,IP_0040_FILLER_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040Filler 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040Filler(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040Filler+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip0040ArMaster
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp0040EffectiveDate(CONSTANTS.SPACE_10);
         setIp0040ActiveInactive(CONSTANTS.SPACE);
          ip0040ParameterMasterData.initialize();
     
          ip0040TableData.initialize();
     
         setIp0040Filler(CONSTANTS.SPACE_5);
   }

		public static int getIp0040ArMasterFieldLength() {
			return IP_0040_AR_MASTER_LENGTH;
		}

}
  
