package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip69931InputFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip69931InputFields extends Ip69931InputFieldsSerialized { 
   

						private char[] ip69931ProcessingAgreement = Field.fillLowValue(11);

						private char[] ip69931ApplicationSystemId = Field.fillLowValue(3);
	
	/**
	* Constructor for Ip69931InputFields
	**/
    public Ip69931InputFields() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip69931InputFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip69931InputFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip69931ProcessingAgreement
	 *	@return ip69931ProcessingAgreement
	 */
   public char[] getIp69931ProcessingAgreement() throws CFException{
     if (isIp69931ProcessingAgreementModified()) { 
        ip69931ProcessingAgreement = refreshIp69931ProcessingAgreement();
     }
   		return ip69931ProcessingAgreement;
   }

  
	/**
	*  set variable ip69931ProcessingAgreement
	*  Corresponding COBOL Variable is IP69931-PROCESSING-AGREEMENT
	*  @param value
	**/
   public void setIp69931ProcessingAgreement(char[] value) {
      ip69931ProcessingAgreement = checkIp69931ProcessingAgreementConstraints(value);
      serializeIp69931ProcessingAgreement(ip69931ProcessingAgreement);
   } 

     /**
	 * 	Update Ip69931ProcessingAgreement 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp69931ProcessingAgreement(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp69931ProcessingAgreement,ip69931ProcessingAgreement.length);
   	
   }
   
   public void setIp69931ProcessingAgreement(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp69931ProcessingAgreement,ip69931ProcessingAgreement.length);
   	
   }
   
     /**
	 * 	Update Ip69931ProcessingAgreement 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp69931ProcessingAgreement(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp69931ProcessingAgreement+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip69931ProcessingAgreement with another Field
	 *	@param value
	 */
   public void setIp69931ProcessingAgreement(Field source) {
       replace(source,0,source.length(),beginIp69931ProcessingAgreement,IP_69931_PROCESSING_AGREEMENT_LEN);
   	
   }  
   
     /**
	 * 	Update Ip69931ProcessingAgreement 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp69931ProcessingAgreement(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp69931ProcessingAgreement,IP_69931_PROCESSING_AGREEMENT_LEN);
   	
   }
   
     /**
	 * 	Update Ip69931ProcessingAgreement 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp69931ProcessingAgreement(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp69931ProcessingAgreement+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip69931ApplicationSystemId
	 *	@return ip69931ApplicationSystemId
	 */
   public char[] getIp69931ApplicationSystemId() throws CFException{
     if (isIp69931ApplicationSystemIdModified()) { 
        ip69931ApplicationSystemId = refreshIp69931ApplicationSystemId();
     }
   		return ip69931ApplicationSystemId;
   }

  
	/**
	*  set variable ip69931ApplicationSystemId
	*  Corresponding COBOL Variable is IP69931-APPLICATION-SYSTEM-ID
	*  @param value
	**/
   public void setIp69931ApplicationSystemId(char[] value) {
      ip69931ApplicationSystemId = checkIp69931ApplicationSystemIdConstraints(value);
      serializeIp69931ApplicationSystemId(ip69931ApplicationSystemId);
   } 

     /**
	 * 	Update Ip69931ApplicationSystemId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp69931ApplicationSystemId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp69931ApplicationSystemId,ip69931ApplicationSystemId.length);
   	
   }
   
   public void setIp69931ApplicationSystemId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp69931ApplicationSystemId,ip69931ApplicationSystemId.length);
   	
   }
   
     /**
	 * 	Update Ip69931ApplicationSystemId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp69931ApplicationSystemId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp69931ApplicationSystemId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip69931ApplicationSystemId with another Field
	 *	@param value
	 */
   public void setIp69931ApplicationSystemId(Field source) {
       replace(source,0,source.length(),beginIp69931ApplicationSystemId,IP_69931_APPLICATION_SYSTEM_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip69931ApplicationSystemId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp69931ApplicationSystemId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp69931ApplicationSystemId,IP_69931_APPLICATION_SYSTEM_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip69931ApplicationSystemId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp69931ApplicationSystemId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp69931ApplicationSystemId+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip69931InputFields
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp69931ProcessingAgreement(CONSTANTS.SPACE_11);
         setIp69931ApplicationSystemId(CONSTANTS.SPACE_3);
   }

		public static int getIp69931InputFieldsFieldLength() {
			return IP_69931_INPUT_FIELDS_LENGTH;
		}

}
  
