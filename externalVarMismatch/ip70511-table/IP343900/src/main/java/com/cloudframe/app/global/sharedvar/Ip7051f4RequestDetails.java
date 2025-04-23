package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip7051f4RequestDetails is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip7051f4RequestDetails extends Ip7051f4RequestDetailsSerialized { 
   

						private char[] ip7051f4ReqQMgrName = Field.fillLowValue(48);

						private char[] ip7051f4ReqQName = Field.fillLowValue(48);
	
	/**
	* Constructor for Ip7051f4RequestDetails
	**/
    public Ip7051f4RequestDetails() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip7051f4RequestDetails. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip7051f4RequestDetails(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip7051f4ReqQMgrName
	 *	@return ip7051f4ReqQMgrName
	 */
   public char[] getIp7051f4ReqQMgrName() throws CFException{
     if (isIp7051f4ReqQMgrNameModified()) { 
        ip7051f4ReqQMgrName = refreshIp7051f4ReqQMgrName();
     }
   		return ip7051f4ReqQMgrName;
   }

  
	/**
	*  set variable ip7051f4ReqQMgrName
	*  Corresponding COBOL Variable is IP7051F4-REQ-Q-MGR-NAME
	*  @param value
	**/
   public void setIp7051f4ReqQMgrName(char[] value) {
      ip7051f4ReqQMgrName = checkIp7051f4ReqQMgrNameConstraints(value);
      serializeIp7051f4ReqQMgrName(ip7051f4ReqQMgrName);
   } 

     /**
	 * 	Update Ip7051f4ReqQMgrName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7051f4ReqQMgrName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7051f4ReqQMgrName,ip7051f4ReqQMgrName.length);
   	
   }
   
   public void setIp7051f4ReqQMgrName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051f4ReqQMgrName,ip7051f4ReqQMgrName.length);
   	
   }
   
     /**
	 * 	Update Ip7051f4ReqQMgrName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051f4ReqQMgrName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051f4ReqQMgrName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7051f4ReqQMgrName with another Field
	 *	@param value
	 */
   public void setIp7051f4ReqQMgrName(Field source) {
       replace(source,0,source.length(),beginIp7051f4ReqQMgrName,IP_7051F_4_REQ_QMGR_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7051f4ReqQMgrName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7051f4ReqQMgrName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7051f4ReqQMgrName,IP_7051F_4_REQ_QMGR_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip7051f4ReqQMgrName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051f4ReqQMgrName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051f4ReqQMgrName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip7051f4ReqQName
	 *	@return ip7051f4ReqQName
	 */
   public char[] getIp7051f4ReqQName() throws CFException{
     if (isIp7051f4ReqQNameModified()) { 
        ip7051f4ReqQName = refreshIp7051f4ReqQName();
     }
   		return ip7051f4ReqQName;
   }

  
	/**
	*  set variable ip7051f4ReqQName
	*  Corresponding COBOL Variable is IP7051F4-REQ-Q-NAME
	*  @param value
	**/
   public void setIp7051f4ReqQName(char[] value) {
      ip7051f4ReqQName = checkIp7051f4ReqQNameConstraints(value);
      serializeIp7051f4ReqQName(ip7051f4ReqQName);
   } 

     /**
	 * 	Update Ip7051f4ReqQName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7051f4ReqQName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7051f4ReqQName,ip7051f4ReqQName.length);
   	
   }
   
   public void setIp7051f4ReqQName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051f4ReqQName,ip7051f4ReqQName.length);
   	
   }
   
     /**
	 * 	Update Ip7051f4ReqQName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051f4ReqQName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051f4ReqQName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7051f4ReqQName with another Field
	 *	@param value
	 */
   public void setIp7051f4ReqQName(Field source) {
       replace(source,0,source.length(),beginIp7051f4ReqQName,IP_7051F_4_REQ_QNAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7051f4ReqQName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7051f4ReqQName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7051f4ReqQName,IP_7051F_4_REQ_QNAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip7051f4ReqQName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051f4ReqQName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051f4ReqQName+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip7051f4RequestDetails
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp7051f4ReqQMgrName(CONSTANTS.SPACE_48);
         setIp7051f4ReqQName(CONSTANTS.SPACE_48);
   }

		public static int getIp7051f4RequestDetailsFieldLength() {
			return IP_7051F_4_REQUEST_DETAILS_LENGTH;
		}

}
  
