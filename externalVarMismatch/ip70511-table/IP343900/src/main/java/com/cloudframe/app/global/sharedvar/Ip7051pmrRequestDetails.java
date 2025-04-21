package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip7051pmrRequestDetails is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip7051pmrRequestDetails extends Ip7051pmrRequestDetailsSerialized { 
   

						private char[] ip7051pmrReqQMgrName = Field.fillLowValue(48);

						private char[] ip7051pmrReqQName = Field.fillLowValue(48);
	
	/**
	* Constructor for Ip7051pmrRequestDetails
	**/
    public Ip7051pmrRequestDetails() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip7051pmrRequestDetails. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip7051pmrRequestDetails(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip7051pmrReqQMgrName
	 *	@return ip7051pmrReqQMgrName
	 */
   public char[] getIp7051pmrReqQMgrName() throws CFException{
     if (isIp7051pmrReqQMgrNameModified()) { 
        ip7051pmrReqQMgrName = refreshIp7051pmrReqQMgrName();
     }
   		return ip7051pmrReqQMgrName;
   }

  
	/**
	*  set variable ip7051pmrReqQMgrName
	*  Corresponding COBOL Variable is IP7051PMR-REQ-Q-MGR-NAME
	*  @param value
	**/
   public void setIp7051pmrReqQMgrName(char[] value) {
      ip7051pmrReqQMgrName = checkIp7051pmrReqQMgrNameConstraints(value);
      serializeIp7051pmrReqQMgrName(ip7051pmrReqQMgrName);
   } 

     /**
	 * 	Update Ip7051pmrReqQMgrName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7051pmrReqQMgrName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7051pmrReqQMgrName,ip7051pmrReqQMgrName.length);
   	
   }
   
   public void setIp7051pmrReqQMgrName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pmrReqQMgrName,ip7051pmrReqQMgrName.length);
   	
   }
   
     /**
	 * 	Update Ip7051pmrReqQMgrName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pmrReqQMgrName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pmrReqQMgrName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7051pmrReqQMgrName with another Field
	 *	@param value
	 */
   public void setIp7051pmrReqQMgrName(Field source) {
       replace(source,0,source.length(),beginIp7051pmrReqQMgrName,IP_7051PMR_REQ_QMGR_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7051pmrReqQMgrName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7051pmrReqQMgrName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7051pmrReqQMgrName,IP_7051PMR_REQ_QMGR_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip7051pmrReqQMgrName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pmrReqQMgrName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pmrReqQMgrName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip7051pmrReqQName
	 *	@return ip7051pmrReqQName
	 */
   public char[] getIp7051pmrReqQName() throws CFException{
     if (isIp7051pmrReqQNameModified()) { 
        ip7051pmrReqQName = refreshIp7051pmrReqQName();
     }
   		return ip7051pmrReqQName;
   }

  
	/**
	*  set variable ip7051pmrReqQName
	*  Corresponding COBOL Variable is IP7051PMR-REQ-Q-NAME
	*  @param value
	**/
   public void setIp7051pmrReqQName(char[] value) {
      ip7051pmrReqQName = checkIp7051pmrReqQNameConstraints(value);
      serializeIp7051pmrReqQName(ip7051pmrReqQName);
   } 

     /**
	 * 	Update Ip7051pmrReqQName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7051pmrReqQName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7051pmrReqQName,ip7051pmrReqQName.length);
   	
   }
   
   public void setIp7051pmrReqQName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pmrReqQName,ip7051pmrReqQName.length);
   	
   }
   
     /**
	 * 	Update Ip7051pmrReqQName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pmrReqQName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pmrReqQName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7051pmrReqQName with another Field
	 *	@param value
	 */
   public void setIp7051pmrReqQName(Field source) {
       replace(source,0,source.length(),beginIp7051pmrReqQName,IP_7051PMR_REQ_QNAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7051pmrReqQName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7051pmrReqQName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7051pmrReqQName,IP_7051PMR_REQ_QNAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip7051pmrReqQName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pmrReqQName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pmrReqQName+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip7051pmrRequestDetails
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp7051pmrReqQMgrName(CONSTANTS.SPACE_48);
         setIp7051pmrReqQName(CONSTANTS.SPACE_48);
   }

		public static int getIp7051pmrRequestDetailsFieldLength() {
			return IP_7051PMR_REQUEST_DETAILS_LENGTH;
		}

}
  
