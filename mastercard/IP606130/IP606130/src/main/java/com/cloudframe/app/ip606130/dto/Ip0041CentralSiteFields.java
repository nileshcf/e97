package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip0041CentralSiteFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:32. using version 5.0.0.254
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip0041CentralSiteFields extends Ip0041CentralSiteFieldsSerialized { 
   

						private char[] ip0041IsoBinInd = Field.fillLowValue(1);

						private char[] ip0041Filler = Field.fillLowValue(5);
	
	/**
	* Constructor for Ip0041CentralSiteFields
	**/
    public Ip0041CentralSiteFields() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip0041CentralSiteFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0041CentralSiteFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip0041IsoBinInd
	 *	@return ip0041IsoBinInd
	 */
   public char[] getIp0041IsoBinInd() throws CFException{
     if (isIp0041IsoBinIndModified()) { 
        ip0041IsoBinInd = refreshIp0041IsoBinInd();
     }
   		return ip0041IsoBinInd;
   }

  
	/**
	*  set variable ip0041IsoBinInd
	*  Corresponding COBOL Variable is IP0041-ISO-BIN-IND
	*  @param value
	**/
   public void setIp0041IsoBinInd(char[] value) {
      ip0041IsoBinInd = checkIp0041IsoBinIndConstraints(value);
      serializeIp0041IsoBinInd(ip0041IsoBinInd);
   } 

     /**
	 * 	Update Ip0041IsoBinInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0041IsoBinInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0041IsoBinInd,ip0041IsoBinInd.length);
   	
   }
   
   public void setIp0041IsoBinInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0041IsoBinInd,ip0041IsoBinInd.length);
   	
   }
   
     /**
	 * 	Update Ip0041IsoBinInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0041IsoBinInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0041IsoBinInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0041IsoBinInd with another Field
	 *	@param value
	 */
   public void setIp0041IsoBinInd(Field source) {
       replace(source,0,source.length(),beginIp0041IsoBinInd,IP_0041_ISO_BIN_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0041IsoBinInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0041IsoBinInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0041IsoBinInd,IP_0041_ISO_BIN_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0041IsoBinInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0041IsoBinInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0041IsoBinInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0041Filler
	 *	@return ip0041Filler
	 */
   public char[] getIp0041Filler() throws CFException{
     if (isIp0041FillerModified()) { 
        ip0041Filler = refreshIp0041Filler();
     }
   		return ip0041Filler;
   }

  
	/**
	*  set variable ip0041Filler
	*  Corresponding COBOL Variable is IP0041-FILLER
	*  @param value
	**/
   public void setIp0041Filler(char[] value) {
      ip0041Filler = checkIp0041FillerConstraints(value);
      serializeIp0041Filler(ip0041Filler);
   } 

     /**
	 * 	Update Ip0041Filler 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0041Filler(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0041Filler,ip0041Filler.length);
   	
   }
   
   public void setIp0041Filler(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0041Filler,ip0041Filler.length);
   	
   }
   
     /**
	 * 	Update Ip0041Filler 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0041Filler(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0041Filler+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0041Filler with another Field
	 *	@param value
	 */
   public void setIp0041Filler(Field source) {
       replace(source,0,source.length(),beginIp0041Filler,IP_0041_FILLER_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0041Filler 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0041Filler(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0041Filler,IP_0041_FILLER_LEN);
   	
   }
   
     /**
	 * 	Update Ip0041Filler 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0041Filler(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0041Filler+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip0041CentralSiteFields
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp0041IsoBinInd(CONSTANTS.SPACE);
         setIp0041Filler(CONSTANTS.SPACE_5);
   }

		public static int getIp0041CentralSiteFieldsFieldLength() {
			return IP_0041_CENTRAL_SITE_FIELDS_LENGTH;
		}

}
  
