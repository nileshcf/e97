package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70301FastpayMqSrvActiveGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:25. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip70301FastpayMqSrvActiveGroup")

public class Ip70301FastpayMqSrvActiveGroup extends Ip70301FastpayMqSrvActiveGroupSerialized  implements InitializingBean {
   

						private char[] ip70301FastpayMqSrvActive = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip70301FastpayMqSrvActiveGroup
	**/
    public Ip70301FastpayMqSrvActiveGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip70301FastpayMqSrvActive
	 *	@return ip70301FastpayMqSrvActive
	 */
   public char[] getIp70301FastpayMqSrvActive() throws CFException{
     if (isIp70301FastpayMqSrvActiveModified()) { 
        ip70301FastpayMqSrvActive = refreshIp70301FastpayMqSrvActive();
     }
   		return ip70301FastpayMqSrvActive;
   }

  
	/**
	*  set variable ip70301FastpayMqSrvActive
	*  Corresponding COBOL Variable is IP70301-FASTPAY-MQ-SRV-ACTIVE
	*  @param value
	**/
   public void setIp70301FastpayMqSrvActive(char[] value) {
      ip70301FastpayMqSrvActive = checkIp70301FastpayMqSrvActiveConstraints(value);
      serializeIp70301FastpayMqSrvActive(ip70301FastpayMqSrvActive);
   } 

     /**
	 * 	Update Ip70301FastpayMqSrvActive 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70301FastpayMqSrvActive(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70301FastpayMqSrvActive,ip70301FastpayMqSrvActive.length);
   	
   }
   
   public void setIp70301FastpayMqSrvActive(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301FastpayMqSrvActive,ip70301FastpayMqSrvActive.length);
   	
   }
   
     /**
	 * 	Update Ip70301FastpayMqSrvActive 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70301FastpayMqSrvActive(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301FastpayMqSrvActive+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70301FastpayMqSrvActive with another Field
	 *	@param value
	 */
   public void setIp70301FastpayMqSrvActive(Field source) {
       replace(source,0,source.length(),beginIp70301FastpayMqSrvActive,IP_70301_FASTPAY_MQ_SRV_ACTIVE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70301FastpayMqSrvActive 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70301FastpayMqSrvActive(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70301FastpayMqSrvActive,IP_70301_FASTPAY_MQ_SRV_ACTIVE_LEN);
   	
   }
   
     /**
	 * 	Update Ip70301FastpayMqSrvActive 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70301FastpayMqSrvActive(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301FastpayMqSrvActive+targetIndex,targetLen);
    
   }
	char[] ip70301FastpayMqActiveY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp70301FastpayMqActiveY88()
	 *	@return  Returns true if isIp70301FastpayMqActiveY88() is "Y"
	 */
   public boolean isIp70301FastpayMqActiveY88() throws CFException {
      return (  compareChars( getIp70301FastpayMqSrvActive() , ip70301FastpayMqActiveY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp70301FastpayMqActiveY88True() {  			
    	setIp70301FastpayMqSrvActive( ip70301FastpayMqActiveY8888Value);
   	}
	char[] ip70301FastpayMqActiveN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp70301FastpayMqActiveN88()
	 *	@return  Returns true if isIp70301FastpayMqActiveN88() is "N"
	 */
   public boolean isIp70301FastpayMqActiveN88() throws CFException {
      return (  compareChars( getIp70301FastpayMqSrvActive() , ip70301FastpayMqActiveN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp70301FastpayMqActiveN88True() {  			
    	setIp70301FastpayMqSrvActive( ip70301FastpayMqActiveN8888Value);
   	}

	
	
	

		public static int getIp70301FastpayMqSrvActiveGroupFieldLength() {
			return IP_70301_FASTPAY_MQ_SRV_ACTIVE_GROUP_LENGTH;
		}

}
  
