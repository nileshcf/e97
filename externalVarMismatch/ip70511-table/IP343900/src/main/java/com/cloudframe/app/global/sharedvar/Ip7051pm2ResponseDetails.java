package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip7051pm2ResponseDetails is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:25. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip7051pm2ResponseDetails extends Ip7051pm2ResponseDetailsSerialized { 
   

						private char[] ip7051pm2ResQMgrName = Field.fillLowValue(48);

						private char[] ip7051pm2ResQName = Field.fillLowValue(48);
	
	/**
	* Constructor for Ip7051pm2ResponseDetails
	**/
    public Ip7051pm2ResponseDetails() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip7051pm2ResponseDetails. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip7051pm2ResponseDetails(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip7051pm2ResQMgrName
	 *	@return ip7051pm2ResQMgrName
	 */
   public char[] getIp7051pm2ResQMgrName() throws CFException{
     if (isIp7051pm2ResQMgrNameModified()) { 
        ip7051pm2ResQMgrName = refreshIp7051pm2ResQMgrName();
     }
   		return ip7051pm2ResQMgrName;
   }

  
	/**
	*  set variable ip7051pm2ResQMgrName
	*  Corresponding COBOL Variable is IP7051PM2-RES-Q-MGR-NAME
	*  @param value
	**/
   public void setIp7051pm2ResQMgrName(char[] value) {
      ip7051pm2ResQMgrName = checkIp7051pm2ResQMgrNameConstraints(value);
      serializeIp7051pm2ResQMgrName(ip7051pm2ResQMgrName);
   } 

     /**
	 * 	Update Ip7051pm2ResQMgrName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7051pm2ResQMgrName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7051pm2ResQMgrName,ip7051pm2ResQMgrName.length);
   	
   }
   
   public void setIp7051pm2ResQMgrName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pm2ResQMgrName,ip7051pm2ResQMgrName.length);
   	
   }
   
     /**
	 * 	Update Ip7051pm2ResQMgrName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pm2ResQMgrName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pm2ResQMgrName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7051pm2ResQMgrName with another Field
	 *	@param value
	 */
   public void setIp7051pm2ResQMgrName(Field source) {
       replace(source,0,source.length(),beginIp7051pm2ResQMgrName,IP_7051PM_2_RES_QMGR_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7051pm2ResQMgrName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7051pm2ResQMgrName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7051pm2ResQMgrName,IP_7051PM_2_RES_QMGR_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip7051pm2ResQMgrName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pm2ResQMgrName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pm2ResQMgrName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip7051pm2ResQName
	 *	@return ip7051pm2ResQName
	 */
   public char[] getIp7051pm2ResQName() throws CFException{
     if (isIp7051pm2ResQNameModified()) { 
        ip7051pm2ResQName = refreshIp7051pm2ResQName();
     }
   		return ip7051pm2ResQName;
   }

  
	/**
	*  set variable ip7051pm2ResQName
	*  Corresponding COBOL Variable is IP7051PM2-RES-Q-NAME
	*  @param value
	**/
   public void setIp7051pm2ResQName(char[] value) {
      ip7051pm2ResQName = checkIp7051pm2ResQNameConstraints(value);
      serializeIp7051pm2ResQName(ip7051pm2ResQName);
   } 

     /**
	 * 	Update Ip7051pm2ResQName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7051pm2ResQName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7051pm2ResQName,ip7051pm2ResQName.length);
   	
   }
   
   public void setIp7051pm2ResQName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pm2ResQName,ip7051pm2ResQName.length);
   	
   }
   
     /**
	 * 	Update Ip7051pm2ResQName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pm2ResQName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pm2ResQName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7051pm2ResQName with another Field
	 *	@param value
	 */
   public void setIp7051pm2ResQName(Field source) {
       replace(source,0,source.length(),beginIp7051pm2ResQName,IP_7051PM_2_RES_QNAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7051pm2ResQName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7051pm2ResQName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7051pm2ResQName,IP_7051PM_2_RES_QNAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip7051pm2ResQName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pm2ResQName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pm2ResQName+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip7051pm2ResponseDetails
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp7051pm2ResQMgrName(CONSTANTS.SPACE_48);
         setIp7051pm2ResQName(CONSTANTS.SPACE_48);
   }

		public static int getIp7051pm2ResponseDetailsFieldLength() {
			return IP_7051PM_2_RESPONSE_DETAILS_LENGTH;
		}

}
  
