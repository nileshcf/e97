package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip30331Pds501Value is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:17. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip30331Pds501Value extends Ip30331Pds501ValueSerialized { 
   

						private char[] ip30331UsageCode = Field.fillLowValue(2);

						private char[] ip30331IndstyRefNum = Field.fillLowValue(3);
	
	/**
	* Constructor for Ip30331Pds501Value
	**/
    public Ip30331Pds501Value() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip30331Pds501Value. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip30331Pds501Value(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip30331UsageCode
	 *	@return ip30331UsageCode
	 */
   public char[] getIp30331UsageCode() throws CFException{
     if (isIp30331UsageCodeModified()) { 
        ip30331UsageCode = refreshIp30331UsageCode();
     }
   		return ip30331UsageCode;
   }

  
	/**
	*  set variable ip30331UsageCode
	*  Corresponding COBOL Variable is IP30331-USAGE-CODE
	*  @param value
	**/
   public void setIp30331UsageCode(char[] value) {
      ip30331UsageCode = checkIp30331UsageCodeConstraints(value);
      serializeIp30331UsageCode(ip30331UsageCode);
   } 

     /**
	 * 	Update Ip30331UsageCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp30331UsageCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp30331UsageCode,ip30331UsageCode.length);
   	
   }
   
   public void setIp30331UsageCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp30331UsageCode,ip30331UsageCode.length);
   	
   }
   
     /**
	 * 	Update Ip30331UsageCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp30331UsageCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp30331UsageCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip30331UsageCode with another Field
	 *	@param value
	 */
   public void setIp30331UsageCode(Field source) {
       replace(source,0,source.length(),beginIp30331UsageCode,IP_30331_USAGE_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip30331UsageCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp30331UsageCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp30331UsageCode,IP_30331_USAGE_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Ip30331UsageCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp30331UsageCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp30331UsageCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip30331IndstyRefNum
	 *	@return ip30331IndstyRefNum
	 */
   public char[] getIp30331IndstyRefNum() throws CFException{
     if (isIp30331IndstyRefNumModified()) { 
        ip30331IndstyRefNum = refreshIp30331IndstyRefNum();
     }
   		return ip30331IndstyRefNum;
   }

  
	/**
	*  set variable ip30331IndstyRefNum
	*  Corresponding COBOL Variable is IP30331-INDSTY-REF-NUM
	*  @param value
	**/
   public void setIp30331IndstyRefNum(char[] value) {
      ip30331IndstyRefNum = checkIp30331IndstyRefNumConstraints(value);
      serializeIp30331IndstyRefNum(ip30331IndstyRefNum);
   } 

     /**
	 * 	Update Ip30331IndstyRefNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp30331IndstyRefNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp30331IndstyRefNum,ip30331IndstyRefNum.length);
   	
   }
   
   public void setIp30331IndstyRefNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp30331IndstyRefNum,ip30331IndstyRefNum.length);
   	
   }
   
     /**
	 * 	Update Ip30331IndstyRefNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp30331IndstyRefNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp30331IndstyRefNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip30331IndstyRefNum with another Field
	 *	@param value
	 */
   public void setIp30331IndstyRefNum(Field source) {
       replace(source,0,source.length(),beginIp30331IndstyRefNum,IP_30331_INDSTY_REF_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip30331IndstyRefNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp30331IndstyRefNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp30331IndstyRefNum,IP_30331_INDSTY_REF_NUM_LEN);
   	
   }
   
     /**
	 * 	Update Ip30331IndstyRefNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp30331IndstyRefNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp30331IndstyRefNum+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip30331Pds501Value
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp30331UsageCode(CONSTANTS.SPACE_2);
         setIp30331IndstyRefNum(CONSTANTS.SPACE_3);
   }

		public static int getIp30331Pds501ValueFieldLength() {
			return IP_30331_PDS_501_VALUE_LENGTH;
		}

}
  
