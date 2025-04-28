package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70511ResponseDetails is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip70511ResponseDetails extends Ip70511ResponseDetailsSerialized { 
   

						private char[] ip70511ResQMgrName = Field.fillLowValue(48);

						private char[] ip70511ResQName = Field.fillLowValue(48);
	
	/**
	* Constructor for Ip70511ResponseDetails
	**/
    public Ip70511ResponseDetails() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip70511ResponseDetails. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip70511ResponseDetails(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip70511ResQMgrName
	 *	@return ip70511ResQMgrName
	 */
   public char[] getIp70511ResQMgrName() throws CFException{
     if (isIp70511ResQMgrNameModified()) { 
        ip70511ResQMgrName = refreshIp70511ResQMgrName();
     }
   		return ip70511ResQMgrName;
   }

  
	/**
	*  set variable ip70511ResQMgrName
	*  Corresponding COBOL Variable is IP70511-RES-Q-MGR-NAME
	*  @param value
	**/
   public void setIp70511ResQMgrName(char[] value) {
      ip70511ResQMgrName = checkIp70511ResQMgrNameConstraints(value);
      serializeIp70511ResQMgrName(ip70511ResQMgrName);
   } 

     /**
	 * 	Update Ip70511ResQMgrName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70511ResQMgrName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70511ResQMgrName,ip70511ResQMgrName.length);
   	
   }
   
   public void setIp70511ResQMgrName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70511ResQMgrName,ip70511ResQMgrName.length);
   	
   }
   
     /**
	 * 	Update Ip70511ResQMgrName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70511ResQMgrName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70511ResQMgrName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70511ResQMgrName with another Field
	 *	@param value
	 */
   public void setIp70511ResQMgrName(Field source) {
       replace(source,0,source.length(),beginIp70511ResQMgrName,IP_70511_RES_QMGR_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70511ResQMgrName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70511ResQMgrName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70511ResQMgrName,IP_70511_RES_QMGR_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip70511ResQMgrName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70511ResQMgrName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70511ResQMgrName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip70511ResQName
	 *	@return ip70511ResQName
	 */
   public char[] getIp70511ResQName() throws CFException{
     if (isIp70511ResQNameModified()) { 
        ip70511ResQName = refreshIp70511ResQName();
     }
   		return ip70511ResQName;
   }

  
	/**
	*  set variable ip70511ResQName
	*  Corresponding COBOL Variable is IP70511-RES-Q-NAME
	*  @param value
	**/
   public void setIp70511ResQName(char[] value) {
      ip70511ResQName = checkIp70511ResQNameConstraints(value);
      serializeIp70511ResQName(ip70511ResQName);
   } 

     /**
	 * 	Update Ip70511ResQName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70511ResQName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70511ResQName,ip70511ResQName.length);
   	
   }
   
   public void setIp70511ResQName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70511ResQName,ip70511ResQName.length);
   	
   }
   
     /**
	 * 	Update Ip70511ResQName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70511ResQName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70511ResQName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70511ResQName with another Field
	 *	@param value
	 */
   public void setIp70511ResQName(Field source) {
       replace(source,0,source.length(),beginIp70511ResQName,IP_70511_RES_QNAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70511ResQName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70511ResQName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70511ResQName,IP_70511_RES_QNAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip70511ResQName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70511ResQName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70511ResQName+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip70511ResponseDetails
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp70511ResQMgrName(CONSTANTS.SPACE_48);
         setIp70511ResQName(CONSTANTS.SPACE_48);
   }

		public static int getIp70511ResponseDetailsFieldLength() {
			return IP_70511_RESPONSE_DETAILS_LENGTH;
		}

}
  
