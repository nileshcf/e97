package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00174CentralSiteFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip00174CentralSiteFields extends Ip00174CentralSiteFieldsSerialized { 
   

						private char[] ip00174CryptoFlagInd = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip00174CentralSiteFields
	**/
    public Ip00174CentralSiteFields() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip00174CentralSiteFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00174CentralSiteFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip00174CryptoFlagInd
	 *	@return ip00174CryptoFlagInd
	 */
   public char[] getIp00174CryptoFlagInd() throws CFException{
     if (isIp00174CryptoFlagIndModified()) { 
        ip00174CryptoFlagInd = refreshIp00174CryptoFlagInd();
     }
   		return ip00174CryptoFlagInd;
   }

  
	/**
	*  set variable ip00174CryptoFlagInd
	*  Corresponding COBOL Variable is IP00174-CRYPTO-FLAG-IND
	*  @param value
	**/
   public void setIp00174CryptoFlagInd(char[] value) {
      ip00174CryptoFlagInd = checkIp00174CryptoFlagIndConstraints(value);
      serializeIp00174CryptoFlagInd(ip00174CryptoFlagInd);
   } 

     /**
	 * 	Update Ip00174CryptoFlagInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00174CryptoFlagInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00174CryptoFlagInd,ip00174CryptoFlagInd.length);
   	
   }
   
   public void setIp00174CryptoFlagInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00174CryptoFlagInd,ip00174CryptoFlagInd.length);
   	
   }
   
     /**
	 * 	Update Ip00174CryptoFlagInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00174CryptoFlagInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00174CryptoFlagInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00174CryptoFlagInd with another Field
	 *	@param value
	 */
   public void setIp00174CryptoFlagInd(Field source) {
       replace(source,0,source.length(),beginIp00174CryptoFlagInd,IP_00174_CRYPTO_FLAG_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00174CryptoFlagInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00174CryptoFlagInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00174CryptoFlagInd,IP_00174_CRYPTO_FLAG_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip00174CryptoFlagInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00174CryptoFlagInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00174CryptoFlagInd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip00174CentralSiteFields
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp00174CryptoFlagInd(CONSTANTS.SPACE);
   }

		public static int getIp00174CentralSiteFieldsFieldLength() {
			return IP_00174_CENTRAL_SITE_FIELDS_LENGTH;
		}

}
  
