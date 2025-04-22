package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip7051pm2RequestDetails is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:15. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip7051pm2RequestDetails extends Ip7051pm2RequestDetailsSerialized { 
   

						private char[] ip7051pm2ReqQMgrName = Field.fillLowValue(48);

						private char[] ip7051pm2ReqQName = Field.fillLowValue(48);
	
	/**
	* Constructor for Ip7051pm2RequestDetails
	**/
    public Ip7051pm2RequestDetails() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip7051pm2RequestDetails. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip7051pm2RequestDetails(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip7051pm2ReqQMgrName
	 *	@return ip7051pm2ReqQMgrName
	 */
   public char[] getIp7051pm2ReqQMgrName() throws CFException{
     if (isIp7051pm2ReqQMgrNameModified()) { 
        ip7051pm2ReqQMgrName = refreshIp7051pm2ReqQMgrName();
     }
   		return ip7051pm2ReqQMgrName;
   }

  
	/**
	*  set variable ip7051pm2ReqQMgrName
	*  Corresponding COBOL Variable is IP7051PM2-REQ-Q-MGR-NAME
	*  @param value
	**/
   public void setIp7051pm2ReqQMgrName(char[] value) {
      ip7051pm2ReqQMgrName = checkIp7051pm2ReqQMgrNameConstraints(value);
      serializeIp7051pm2ReqQMgrName(ip7051pm2ReqQMgrName);
   } 

     /**
	 * 	Update Ip7051pm2ReqQMgrName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7051pm2ReqQMgrName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7051pm2ReqQMgrName,ip7051pm2ReqQMgrName.length);
   	
   }
   
   public void setIp7051pm2ReqQMgrName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pm2ReqQMgrName,ip7051pm2ReqQMgrName.length);
   	
   }
   
     /**
	 * 	Update Ip7051pm2ReqQMgrName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pm2ReqQMgrName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pm2ReqQMgrName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7051pm2ReqQMgrName with another Field
	 *	@param value
	 */
   public void setIp7051pm2ReqQMgrName(Field source) {
       replace(source,0,source.length(),beginIp7051pm2ReqQMgrName,IP_7051PM_2_REQ_QMGR_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7051pm2ReqQMgrName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7051pm2ReqQMgrName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7051pm2ReqQMgrName,IP_7051PM_2_REQ_QMGR_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip7051pm2ReqQMgrName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pm2ReqQMgrName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pm2ReqQMgrName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip7051pm2ReqQName
	 *	@return ip7051pm2ReqQName
	 */
   public char[] getIp7051pm2ReqQName() throws CFException{
     if (isIp7051pm2ReqQNameModified()) { 
        ip7051pm2ReqQName = refreshIp7051pm2ReqQName();
     }
   		return ip7051pm2ReqQName;
   }

  
	/**
	*  set variable ip7051pm2ReqQName
	*  Corresponding COBOL Variable is IP7051PM2-REQ-Q-NAME
	*  @param value
	**/
   public void setIp7051pm2ReqQName(char[] value) {
      ip7051pm2ReqQName = checkIp7051pm2ReqQNameConstraints(value);
      serializeIp7051pm2ReqQName(ip7051pm2ReqQName);
   } 

     /**
	 * 	Update Ip7051pm2ReqQName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7051pm2ReqQName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7051pm2ReqQName,ip7051pm2ReqQName.length);
   	
   }
   
   public void setIp7051pm2ReqQName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pm2ReqQName,ip7051pm2ReqQName.length);
   	
   }
   
     /**
	 * 	Update Ip7051pm2ReqQName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pm2ReqQName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pm2ReqQName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7051pm2ReqQName with another Field
	 *	@param value
	 */
   public void setIp7051pm2ReqQName(Field source) {
       replace(source,0,source.length(),beginIp7051pm2ReqQName,IP_7051PM_2_REQ_QNAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7051pm2ReqQName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7051pm2ReqQName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7051pm2ReqQName,IP_7051PM_2_REQ_QNAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip7051pm2ReqQName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pm2ReqQName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pm2ReqQName+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip7051pm2RequestDetails
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp7051pm2ReqQMgrName(CONSTANTS.SPACE_48);
         setIp7051pm2ReqQName(CONSTANTS.SPACE_48);
   }

		public static int getIp7051pm2RequestDetailsFieldLength() {
			return IP_7051PM_2_REQUEST_DETAILS_LENGTH;
		}

}
  
