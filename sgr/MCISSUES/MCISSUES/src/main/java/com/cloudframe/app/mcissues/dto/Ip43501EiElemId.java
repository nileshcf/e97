package com.cloudframe.app.mcissues.dto;

/**
*  The class Ip43501EiElemId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip43501EiElemId extends Ip43501EiElemIdSerialized { 
   

						private char[] ip43501EiElementId = Field.fillLowValue(5);

						private char[] ip43501EiSubElementId = Field.fillLowValue(5);
	
	/**
	* Constructor for Ip43501EiElemId
	**/
    public Ip43501EiElemId() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip43501EiElemId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip43501EiElemId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip43501EiElementId
	 *	@return ip43501EiElementId
	 */
   public char[] getIp43501EiElementId() throws CFException{
     if (isIp43501EiElementIdModified()) { 
        ip43501EiElementId = refreshIp43501EiElementId();
     }
   		return ip43501EiElementId;
   }

  
	/**
	*  set variable ip43501EiElementId
	*  Corresponding COBOL Variable is IP43501-EI-ELEMENT-ID
	*  @param value
	**/
   public void setIp43501EiElementId(char[] value) {
      ip43501EiElementId = checkIp43501EiElementIdConstraints(value);
      serializeIp43501EiElementId(ip43501EiElementId);
   } 

     /**
	 * 	Update Ip43501EiElementId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp43501EiElementId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp43501EiElementId,ip43501EiElementId.length);
   	
   }
   
   public void setIp43501EiElementId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501EiElementId,ip43501EiElementId.length);
   	
   }
   
     /**
	 * 	Update Ip43501EiElementId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp43501EiElementId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501EiElementId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip43501EiElementId with another Field
	 *	@param value
	 */
   public void setIp43501EiElementId(Field source) {
       replace(source,0,source.length(),beginIp43501EiElementId,IP_43501_EI_ELEMENT_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip43501EiElementId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp43501EiElementId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp43501EiElementId,IP_43501_EI_ELEMENT_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip43501EiElementId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp43501EiElementId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501EiElementId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip43501EiSubElementId
	 *	@return ip43501EiSubElementId
	 */
   public char[] getIp43501EiSubElementId() throws CFException{
     if (isIp43501EiSubElementIdModified()) { 
        ip43501EiSubElementId = refreshIp43501EiSubElementId();
     }
   		return ip43501EiSubElementId;
   }

  
	/**
	*  set variable ip43501EiSubElementId
	*  Corresponding COBOL Variable is IP43501-EI-SUB-ELEMENT-ID
	*  @param value
	**/
   public void setIp43501EiSubElementId(char[] value) {
      ip43501EiSubElementId = checkIp43501EiSubElementIdConstraints(value);
      serializeIp43501EiSubElementId(ip43501EiSubElementId);
   } 

     /**
	 * 	Update Ip43501EiSubElementId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp43501EiSubElementId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp43501EiSubElementId,ip43501EiSubElementId.length);
   	
   }
   
   public void setIp43501EiSubElementId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501EiSubElementId,ip43501EiSubElementId.length);
   	
   }
   
     /**
	 * 	Update Ip43501EiSubElementId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp43501EiSubElementId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501EiSubElementId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip43501EiSubElementId with another Field
	 *	@param value
	 */
   public void setIp43501EiSubElementId(Field source) {
       replace(source,0,source.length(),beginIp43501EiSubElementId,IP_43501_EI_SUB_ELEMENT_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip43501EiSubElementId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp43501EiSubElementId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp43501EiSubElementId,IP_43501_EI_SUB_ELEMENT_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip43501EiSubElementId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp43501EiSubElementId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501EiSubElementId+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip43501EiElemId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp43501EiElementId(CONSTANTS.SPACE_5);
         setIp43501EiSubElementId(CONSTANTS.SPACE_5);
   }

		public static int getIp43501EiElemIdFieldLength() {
			return IP_43501_EI_ELEM_ID_LENGTH;
		}

}
  
