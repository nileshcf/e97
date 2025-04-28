package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip7051pmrResponseDetails is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip7051pmrResponseDetails extends Ip7051pmrResponseDetailsSerialized { 
   

						private char[] ip7051pmrResQMgrName = Field.fillLowValue(48);

						private char[] ip7051pmrResQName = Field.fillLowValue(48);
	
	/**
	* Constructor for Ip7051pmrResponseDetails
	**/
    public Ip7051pmrResponseDetails() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip7051pmrResponseDetails. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip7051pmrResponseDetails(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip7051pmrResQMgrName
	 *	@return ip7051pmrResQMgrName
	 */
   public char[] getIp7051pmrResQMgrName() throws CFException{
     if (isIp7051pmrResQMgrNameModified()) { 
        ip7051pmrResQMgrName = refreshIp7051pmrResQMgrName();
     }
   		return ip7051pmrResQMgrName;
   }

  
	/**
	*  set variable ip7051pmrResQMgrName
	*  Corresponding COBOL Variable is IP7051PMR-RES-Q-MGR-NAME
	*  @param value
	**/
   public void setIp7051pmrResQMgrName(char[] value) {
      ip7051pmrResQMgrName = checkIp7051pmrResQMgrNameConstraints(value);
      serializeIp7051pmrResQMgrName(ip7051pmrResQMgrName);
   } 

     /**
	 * 	Update Ip7051pmrResQMgrName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7051pmrResQMgrName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7051pmrResQMgrName,ip7051pmrResQMgrName.length);
   	
   }
   
   public void setIp7051pmrResQMgrName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pmrResQMgrName,ip7051pmrResQMgrName.length);
   	
   }
   
     /**
	 * 	Update Ip7051pmrResQMgrName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pmrResQMgrName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pmrResQMgrName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7051pmrResQMgrName with another Field
	 *	@param value
	 */
   public void setIp7051pmrResQMgrName(Field source) {
       replace(source,0,source.length(),beginIp7051pmrResQMgrName,IP_7051PMR_RES_QMGR_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7051pmrResQMgrName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7051pmrResQMgrName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7051pmrResQMgrName,IP_7051PMR_RES_QMGR_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip7051pmrResQMgrName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pmrResQMgrName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pmrResQMgrName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip7051pmrResQName
	 *	@return ip7051pmrResQName
	 */
   public char[] getIp7051pmrResQName() throws CFException{
     if (isIp7051pmrResQNameModified()) { 
        ip7051pmrResQName = refreshIp7051pmrResQName();
     }
   		return ip7051pmrResQName;
   }

  
	/**
	*  set variable ip7051pmrResQName
	*  Corresponding COBOL Variable is IP7051PMR-RES-Q-NAME
	*  @param value
	**/
   public void setIp7051pmrResQName(char[] value) {
      ip7051pmrResQName = checkIp7051pmrResQNameConstraints(value);
      serializeIp7051pmrResQName(ip7051pmrResQName);
   } 

     /**
	 * 	Update Ip7051pmrResQName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7051pmrResQName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7051pmrResQName,ip7051pmrResQName.length);
   	
   }
   
   public void setIp7051pmrResQName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pmrResQName,ip7051pmrResQName.length);
   	
   }
   
     /**
	 * 	Update Ip7051pmrResQName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pmrResQName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pmrResQName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7051pmrResQName with another Field
	 *	@param value
	 */
   public void setIp7051pmrResQName(Field source) {
       replace(source,0,source.length(),beginIp7051pmrResQName,IP_7051PMR_RES_QNAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7051pmrResQName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7051pmrResQName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7051pmrResQName,IP_7051PMR_RES_QNAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip7051pmrResQName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pmrResQName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pmrResQName+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip7051pmrResponseDetails
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp7051pmrResQMgrName(CONSTANTS.SPACE_48);
         setIp7051pmrResQName(CONSTANTS.SPACE_48);
   }

		public static int getIp7051pmrResponseDetailsFieldLength() {
			return IP_7051PMR_RESPONSE_DETAILS_LENGTH;
		}

}
  
