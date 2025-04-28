package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip00911CentralSiteFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:57. using version 5.0.0.256
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip00911CentralSiteFields extends Ip00911CentralSiteFieldsSerialized { 
   

						private char[] ip00911IsoBinInd = Field.fillLowValue(1);

						private char[] ip00911Filler = Field.fillLowValue(3);
	
	/**
	* Constructor for Ip00911CentralSiteFields
	**/
    public Ip00911CentralSiteFields() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip00911CentralSiteFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00911CentralSiteFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip00911IsoBinInd
	 *	@return ip00911IsoBinInd
	 */
   public char[] getIp00911IsoBinInd() throws CFException{
     if (isIp00911IsoBinIndModified()) { 
        ip00911IsoBinInd = refreshIp00911IsoBinInd();
     }
   		return ip00911IsoBinInd;
   }

  
	/**
	*  set variable ip00911IsoBinInd
	*  Corresponding COBOL Variable is IP00911-ISO-BIN-IND
	*  @param value
	**/
   public void setIp00911IsoBinInd(char[] value) {
      ip00911IsoBinInd = checkIp00911IsoBinIndConstraints(value);
      serializeIp00911IsoBinInd(ip00911IsoBinInd);
   } 

     /**
	 * 	Update Ip00911IsoBinInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00911IsoBinInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00911IsoBinInd,ip00911IsoBinInd.length);
   	
   }
   
   public void setIp00911IsoBinInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00911IsoBinInd,ip00911IsoBinInd.length);
   	
   }
   
     /**
	 * 	Update Ip00911IsoBinInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00911IsoBinInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00911IsoBinInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00911IsoBinInd with another Field
	 *	@param value
	 */
   public void setIp00911IsoBinInd(Field source) {
       replace(source,0,source.length(),beginIp00911IsoBinInd,IP_00911_ISO_BIN_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00911IsoBinInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00911IsoBinInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00911IsoBinInd,IP_00911_ISO_BIN_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip00911IsoBinInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00911IsoBinInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00911IsoBinInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00911Filler
	 *	@return ip00911Filler
	 */
   public char[] getIp00911Filler() throws CFException{
     if (isIp00911FillerModified()) { 
        ip00911Filler = refreshIp00911Filler();
     }
   		return ip00911Filler;
   }

  
	/**
	*  set variable ip00911Filler
	*  Corresponding COBOL Variable is IP00911-FILLER
	*  @param value
	**/
   public void setIp00911Filler(char[] value) {
      ip00911Filler = checkIp00911FillerConstraints(value);
      serializeIp00911Filler(ip00911Filler);
   } 

     /**
	 * 	Update Ip00911Filler 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00911Filler(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00911Filler,ip00911Filler.length);
   	
   }
   
   public void setIp00911Filler(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00911Filler,ip00911Filler.length);
   	
   }
   
     /**
	 * 	Update Ip00911Filler 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00911Filler(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00911Filler+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00911Filler with another Field
	 *	@param value
	 */
   public void setIp00911Filler(Field source) {
       replace(source,0,source.length(),beginIp00911Filler,IP_00911_FILLER_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00911Filler 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00911Filler(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00911Filler,IP_00911_FILLER_LEN);
   	
   }
   
     /**
	 * 	Update Ip00911Filler 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00911Filler(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00911Filler+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip00911CentralSiteFields
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp00911IsoBinInd(CONSTANTS.SPACE);
         setIp00911Filler(CONSTANTS.SPACE_3);
   }

		public static int getIp00911CentralSiteFieldsFieldLength() {
			return IP_00911_CENTRAL_SITE_FIELDS_LENGTH;
		}

}
  
