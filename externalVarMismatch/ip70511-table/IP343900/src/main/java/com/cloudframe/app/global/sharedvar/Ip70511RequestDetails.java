package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70511RequestDetails is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:15. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip70511RequestDetails extends Ip70511RequestDetailsSerialized { 
   

						private char[] ip70511ReqQMgrName = Field.fillLowValue(48);

						private char[] ip70511ReqQName = Field.fillLowValue(48);
	
	/**
	* Constructor for Ip70511RequestDetails
	**/
    public Ip70511RequestDetails() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip70511RequestDetails. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip70511RequestDetails(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip70511ReqQMgrName
	 *	@return ip70511ReqQMgrName
	 */
   public char[] getIp70511ReqQMgrName() throws CFException{
     if (isIp70511ReqQMgrNameModified()) { 
        ip70511ReqQMgrName = refreshIp70511ReqQMgrName();
     }
   		return ip70511ReqQMgrName;
   }

  
	/**
	*  set variable ip70511ReqQMgrName
	*  Corresponding COBOL Variable is IP70511-REQ-Q-MGR-NAME
	*  @param value
	**/
   public void setIp70511ReqQMgrName(char[] value) {
      ip70511ReqQMgrName = checkIp70511ReqQMgrNameConstraints(value);
      serializeIp70511ReqQMgrName(ip70511ReqQMgrName);
   } 

     /**
	 * 	Update Ip70511ReqQMgrName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70511ReqQMgrName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70511ReqQMgrName,ip70511ReqQMgrName.length);
   	
   }
   
   public void setIp70511ReqQMgrName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70511ReqQMgrName,ip70511ReqQMgrName.length);
   	
   }
   
     /**
	 * 	Update Ip70511ReqQMgrName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70511ReqQMgrName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70511ReqQMgrName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70511ReqQMgrName with another Field
	 *	@param value
	 */
   public void setIp70511ReqQMgrName(Field source) {
       replace(source,0,source.length(),beginIp70511ReqQMgrName,IP_70511_REQ_QMGR_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70511ReqQMgrName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70511ReqQMgrName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70511ReqQMgrName,IP_70511_REQ_QMGR_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip70511ReqQMgrName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70511ReqQMgrName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70511ReqQMgrName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip70511ReqQName
	 *	@return ip70511ReqQName
	 */
   public char[] getIp70511ReqQName() throws CFException{
     if (isIp70511ReqQNameModified()) { 
        ip70511ReqQName = refreshIp70511ReqQName();
     }
   		return ip70511ReqQName;
   }

  
	/**
	*  set variable ip70511ReqQName
	*  Corresponding COBOL Variable is IP70511-REQ-Q-NAME
	*  @param value
	**/
   public void setIp70511ReqQName(char[] value) {
      ip70511ReqQName = checkIp70511ReqQNameConstraints(value);
      serializeIp70511ReqQName(ip70511ReqQName);
   } 

     /**
	 * 	Update Ip70511ReqQName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70511ReqQName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70511ReqQName,ip70511ReqQName.length);
   	
   }
   
   public void setIp70511ReqQName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70511ReqQName,ip70511ReqQName.length);
   	
   }
   
     /**
	 * 	Update Ip70511ReqQName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70511ReqQName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70511ReqQName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70511ReqQName with another Field
	 *	@param value
	 */
   public void setIp70511ReqQName(Field source) {
       replace(source,0,source.length(),beginIp70511ReqQName,IP_70511_REQ_QNAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70511ReqQName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70511ReqQName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70511ReqQName,IP_70511_REQ_QNAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip70511ReqQName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70511ReqQName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70511ReqQName+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip70511RequestDetails
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp70511ReqQMgrName(CONSTANTS.SPACE_48);
         setIp70511ReqQName(CONSTANTS.SPACE_48);
   }

		public static int getIp70511RequestDetailsFieldLength() {
			return IP_70511_REQUEST_DETAILS_LENGTH;
		}

}
  
