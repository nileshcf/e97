package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip0041BinTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:21. using version 5.0.0.254
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip0041BinTable extends Ip0041BinTableSerialized {
   

						private char[] ip0041EffectiveDate = Field.fillLowValue(10);

						private char[] ip0041ActiveInactive = Field.fillLowValue(1);
				private Ip0041ParameterMasterData ip0041ParameterMasterData = new Ip0041ParameterMasterData();
				private Ip0041TableData ip0041TableData = new Ip0041TableData();
	
	/**
	* Constructor for Ip0041BinTable
	**/
    public Ip0041BinTable() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			ip0041ParameterMasterData.setParent(this,getStartOffset() + 11);
	       			ip0041TableData.setParent(this,getStartOffset() + 19);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip0041EffectiveDate
	 *	@return ip0041EffectiveDate
	 */
   public char[] getIp0041EffectiveDate() throws CFException{
     if (isIp0041EffectiveDateModified()) { 
        ip0041EffectiveDate = refreshIp0041EffectiveDate();
     }
   		return ip0041EffectiveDate;
   }

  
	/**
	*  set variable ip0041EffectiveDate
	*  Corresponding COBOL Variable is IP0041-EFFECTIVE-DATE
	*  @param value
	**/
   public void setIp0041EffectiveDate(char[] value) {
      ip0041EffectiveDate = checkIp0041EffectiveDateConstraints(value);
      serializeIp0041EffectiveDate(ip0041EffectiveDate);
   } 

     /**
	 * 	Update Ip0041EffectiveDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0041EffectiveDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0041EffectiveDate,ip0041EffectiveDate.length);
   	
   }
   
   public void setIp0041EffectiveDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0041EffectiveDate,ip0041EffectiveDate.length);
   	
   }
   
     /**
	 * 	Update Ip0041EffectiveDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0041EffectiveDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0041EffectiveDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0041EffectiveDate with another Field
	 *	@param value
	 */
   public void setIp0041EffectiveDate(Field source) {
       replace(source,0,source.length(),beginIp0041EffectiveDate,IP_0041_EFFECTIVE_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0041EffectiveDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0041EffectiveDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0041EffectiveDate,IP_0041_EFFECTIVE_DATE_LEN);
   	
   }
   
     /**
	 * 	Update Ip0041EffectiveDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0041EffectiveDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0041EffectiveDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0041ActiveInactive
	 *	@return ip0041ActiveInactive
	 */
   public char[] getIp0041ActiveInactive() throws CFException{
     if (isIp0041ActiveInactiveModified()) { 
        ip0041ActiveInactive = refreshIp0041ActiveInactive();
     }
   		return ip0041ActiveInactive;
   }

  
	/**
	*  set variable ip0041ActiveInactive
	*  Corresponding COBOL Variable is IP0041-ACTIVE-INACTIVE
	*  @param value
	**/
   public void setIp0041ActiveInactive(char[] value) {
      ip0041ActiveInactive = checkIp0041ActiveInactiveConstraints(value);
      serializeIp0041ActiveInactive(ip0041ActiveInactive);
   } 

     /**
	 * 	Update Ip0041ActiveInactive 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0041ActiveInactive(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0041ActiveInactive,ip0041ActiveInactive.length);
   	
   }
   
   public void setIp0041ActiveInactive(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0041ActiveInactive,ip0041ActiveInactive.length);
   	
   }
   
     /**
	 * 	Update Ip0041ActiveInactive 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0041ActiveInactive(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0041ActiveInactive+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0041ActiveInactive with another Field
	 *	@param value
	 */
   public void setIp0041ActiveInactive(Field source) {
       replace(source,0,source.length(),beginIp0041ActiveInactive,IP_0041_ACTIVE_INACTIVE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0041ActiveInactive 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0041ActiveInactive(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0041ActiveInactive,IP_0041_ACTIVE_INACTIVE_LEN);
   	
   }
   
     /**
	 * 	Update Ip0041ActiveInactive 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0041ActiveInactive(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0041ActiveInactive+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0041ParameterMasterData
	 *	@return ip0041ParameterMasterData
	 */   
	 public Ip0041ParameterMasterData getIp0041ParameterMasterData() {
   	return ip0041ParameterMasterData;
   }
   /**
	* 	Update Ip0041ParameterMasterData with the passed value
	*   Corresponding COBOL Variable is IP0041-PARAMETER-MASTER-DATA
	*	@param value
	*/
   public void setIp0041ParameterMasterData(char[] value) {
      ip0041ParameterMasterData.setString(value); 
   }   
    
     /**
	 * 	Update Ip0041ParameterMasterData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp0041ParameterMasterData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0041ParameterMasterData.begin,ip0041ParameterMasterData.length());
   }
   
     /**
	 * 	Update Ip0041ParameterMasterData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0041ParameterMasterData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0041ParameterMasterData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip0041ParameterMasterData with another Field
	 *	@param value
	 */
   public void setIp0041ParameterMasterData(Field source) {
   	replace(source,0,source.length(),ip0041ParameterMasterData.begin,ip0041ParameterMasterData.length());
   }  
   
     /**
	 * 	Update Ip0041ParameterMasterData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp0041ParameterMasterData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0041ParameterMasterData.begin,ip0041ParameterMasterData.length());
   }
   
     /**
	 * 	Update Ip0041ParameterMasterData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0041ParameterMasterData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0041ParameterMasterData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip0041TableData
	 *	@return ip0041TableData
	 */   
	 public Ip0041TableData getIp0041TableData() {
   	return ip0041TableData;
   }
   /**
	* 	Update Ip0041TableData with the passed value
	*   Corresponding COBOL Variable is IP0041-TABLE-DATA
	*	@param value
	*/
   public void setIp0041TableData(char[] value) {
      ip0041TableData.setString(value); 
   }   
    
     /**
	 * 	Update Ip0041TableData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp0041TableData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0041TableData.begin,ip0041TableData.length());
   }
   
     /**
	 * 	Update Ip0041TableData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0041TableData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0041TableData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip0041TableData with another Field
	 *	@param value
	 */
   public void setIp0041TableData(Field source) {
   	replace(source,0,source.length(),ip0041TableData.begin,ip0041TableData.length());
   }  
   
     /**
	 * 	Update Ip0041TableData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp0041TableData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0041TableData.begin,ip0041TableData.length());
   }
   
     /**
	 * 	Update Ip0041TableData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0041TableData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0041TableData.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip0041BinTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp0041EffectiveDate(CONSTANTS.SPACE_10);
         setIp0041ActiveInactive(CONSTANTS.SPACE);
          ip0041ParameterMasterData.initialize();
     
          ip0041TableData.initialize();
     
   }

		public static int getIp0041BinTableFieldLength() {
			return IP_0041_BIN_TABLE_LENGTH;
		}

}
  
