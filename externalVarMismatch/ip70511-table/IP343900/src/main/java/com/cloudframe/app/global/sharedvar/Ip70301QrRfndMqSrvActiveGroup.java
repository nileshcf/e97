package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70301QrRfndMqSrvActiveGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip70301QrRfndMqSrvActiveGroup")

public class Ip70301QrRfndMqSrvActiveGroup extends Ip70301QrRfndMqSrvActiveGroupSerialized  implements InitializingBean {
   

						private char[] ip70301QrRfndMqSrvActive = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip70301QrRfndMqSrvActiveGroup
	**/
    public Ip70301QrRfndMqSrvActiveGroup() {
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
	 *	Returns the value of ip70301QrRfndMqSrvActive
	 *	@return ip70301QrRfndMqSrvActive
	 */
   public char[] getIp70301QrRfndMqSrvActive() throws CFException{
     if (isIp70301QrRfndMqSrvActiveModified()) { 
        ip70301QrRfndMqSrvActive = refreshIp70301QrRfndMqSrvActive();
     }
   		return ip70301QrRfndMqSrvActive;
   }

  
	/**
	*  set variable ip70301QrRfndMqSrvActive
	*  Corresponding COBOL Variable is IP70301-QR-RFND-MQ-SRV-ACTIVE
	*  @param value
	**/
   public void setIp70301QrRfndMqSrvActive(char[] value) {
      ip70301QrRfndMqSrvActive = checkIp70301QrRfndMqSrvActiveConstraints(value);
      serializeIp70301QrRfndMqSrvActive(ip70301QrRfndMqSrvActive);
   } 

     /**
	 * 	Update Ip70301QrRfndMqSrvActive 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70301QrRfndMqSrvActive(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70301QrRfndMqSrvActive,ip70301QrRfndMqSrvActive.length);
   	
   }
   
   public void setIp70301QrRfndMqSrvActive(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301QrRfndMqSrvActive,ip70301QrRfndMqSrvActive.length);
   	
   }
   
     /**
	 * 	Update Ip70301QrRfndMqSrvActive 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70301QrRfndMqSrvActive(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301QrRfndMqSrvActive+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70301QrRfndMqSrvActive with another Field
	 *	@param value
	 */
   public void setIp70301QrRfndMqSrvActive(Field source) {
       replace(source,0,source.length(),beginIp70301QrRfndMqSrvActive,IP_70301_QR_RFND_MQ_SRV_ACTIVE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70301QrRfndMqSrvActive 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70301QrRfndMqSrvActive(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70301QrRfndMqSrvActive,IP_70301_QR_RFND_MQ_SRV_ACTIVE_LEN);
   	
   }
   
     /**
	 * 	Update Ip70301QrRfndMqSrvActive 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70301QrRfndMqSrvActive(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301QrRfndMqSrvActive+targetIndex,targetLen);
    
   }
	char[] ip70301QrRnfdMqActveY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp70301QrRnfdMqActveY88()
	 *	@return  Returns true if isIp70301QrRnfdMqActveY88() is "Y"
	 */
   public boolean isIp70301QrRnfdMqActveY88() throws CFException {
      return (  compareChars( getIp70301QrRfndMqSrvActive() , ip70301QrRnfdMqActveY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp70301QrRnfdMqActveY88True() {  			
    	setIp70301QrRfndMqSrvActive( ip70301QrRnfdMqActveY8888Value);
   	}
	char[] ip70301QrRfndMqActveN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp70301QrRfndMqActveN88()
	 *	@return  Returns true if isIp70301QrRfndMqActveN88() is "N"
	 */
   public boolean isIp70301QrRfndMqActveN88() throws CFException {
      return (  compareChars( getIp70301QrRfndMqSrvActive() , ip70301QrRfndMqActveN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp70301QrRfndMqActveN88True() {  			
    	setIp70301QrRfndMqSrvActive( ip70301QrRfndMqActveN8888Value);
   	}

	
	
	

		public static int getIp70301QrRfndMqSrvActiveGroupFieldLength() {
			return IP_70301_QR_RFND_MQ_SRV_ACTIVE_GROUP_LENGTH;
		}

}
  
