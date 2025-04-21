package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip7051f4ResponseDetails is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip7051f4ResponseDetails extends Ip7051f4ResponseDetailsSerialized { 
   

						private char[] ip7051f4ResQMgrName = Field.fillLowValue(48);

						private char[] ip7051f4ResQName = Field.fillLowValue(48);
	
	/**
	* Constructor for Ip7051f4ResponseDetails
	**/
    public Ip7051f4ResponseDetails() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip7051f4ResponseDetails. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip7051f4ResponseDetails(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip7051f4ResQMgrName
	 *	@return ip7051f4ResQMgrName
	 */
   public char[] getIp7051f4ResQMgrName() throws CFException{
     if (isIp7051f4ResQMgrNameModified()) { 
        ip7051f4ResQMgrName = refreshIp7051f4ResQMgrName();
     }
   		return ip7051f4ResQMgrName;
   }

  
	/**
	*  set variable ip7051f4ResQMgrName
	*  Corresponding COBOL Variable is IP7051F4-RES-Q-MGR-NAME
	*  @param value
	**/
   public void setIp7051f4ResQMgrName(char[] value) {
      ip7051f4ResQMgrName = checkIp7051f4ResQMgrNameConstraints(value);
      serializeIp7051f4ResQMgrName(ip7051f4ResQMgrName);
   } 

     /**
	 * 	Update Ip7051f4ResQMgrName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7051f4ResQMgrName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7051f4ResQMgrName,ip7051f4ResQMgrName.length);
   	
   }
   
   public void setIp7051f4ResQMgrName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051f4ResQMgrName,ip7051f4ResQMgrName.length);
   	
   }
   
     /**
	 * 	Update Ip7051f4ResQMgrName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051f4ResQMgrName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051f4ResQMgrName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7051f4ResQMgrName with another Field
	 *	@param value
	 */
   public void setIp7051f4ResQMgrName(Field source) {
       replace(source,0,source.length(),beginIp7051f4ResQMgrName,IP_7051F_4_RES_QMGR_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7051f4ResQMgrName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7051f4ResQMgrName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7051f4ResQMgrName,IP_7051F_4_RES_QMGR_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip7051f4ResQMgrName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051f4ResQMgrName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051f4ResQMgrName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip7051f4ResQName
	 *	@return ip7051f4ResQName
	 */
   public char[] getIp7051f4ResQName() throws CFException{
     if (isIp7051f4ResQNameModified()) { 
        ip7051f4ResQName = refreshIp7051f4ResQName();
     }
   		return ip7051f4ResQName;
   }

  
	/**
	*  set variable ip7051f4ResQName
	*  Corresponding COBOL Variable is IP7051F4-RES-Q-NAME
	*  @param value
	**/
   public void setIp7051f4ResQName(char[] value) {
      ip7051f4ResQName = checkIp7051f4ResQNameConstraints(value);
      serializeIp7051f4ResQName(ip7051f4ResQName);
   } 

     /**
	 * 	Update Ip7051f4ResQName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7051f4ResQName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7051f4ResQName,ip7051f4ResQName.length);
   	
   }
   
   public void setIp7051f4ResQName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051f4ResQName,ip7051f4ResQName.length);
   	
   }
   
     /**
	 * 	Update Ip7051f4ResQName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051f4ResQName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051f4ResQName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7051f4ResQName with another Field
	 *	@param value
	 */
   public void setIp7051f4ResQName(Field source) {
       replace(source,0,source.length(),beginIp7051f4ResQName,IP_7051F_4_RES_QNAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7051f4ResQName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7051f4ResQName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7051f4ResQName,IP_7051F_4_RES_QNAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip7051f4ResQName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051f4ResQName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051f4ResQName+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip7051f4ResponseDetails
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp7051f4ResQMgrName(CONSTANTS.SPACE_48);
         setIp7051f4ResQName(CONSTANTS.SPACE_48);
   }

		public static int getIp7051f4ResponseDetailsFieldLength() {
			return IP_7051F_4_RESPONSE_DETAILS_LENGTH;
		}

}
  
