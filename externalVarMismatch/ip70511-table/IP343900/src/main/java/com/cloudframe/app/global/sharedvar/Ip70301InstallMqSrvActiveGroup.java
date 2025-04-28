package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70301InstallMqSrvActiveGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip70301InstallMqSrvActiveGroup")

public class Ip70301InstallMqSrvActiveGroup extends Ip70301InstallMqSrvActiveGroupSerialized  implements InitializingBean {
   

						private char[] ip70301InstallMqSrvActive = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip70301InstallMqSrvActiveGroup
	**/
    public Ip70301InstallMqSrvActiveGroup() {
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
	 *	Returns the value of ip70301InstallMqSrvActive
	 *	@return ip70301InstallMqSrvActive
	 */
   public char[] getIp70301InstallMqSrvActive() throws CFException{
     if (isIp70301InstallMqSrvActiveModified()) { 
        ip70301InstallMqSrvActive = refreshIp70301InstallMqSrvActive();
     }
   		return ip70301InstallMqSrvActive;
   }

  
	/**
	*  set variable ip70301InstallMqSrvActive
	*  Corresponding COBOL Variable is IP70301-INSTALL-MQ-SRV-ACTIVE
	*  @param value
	**/
   public void setIp70301InstallMqSrvActive(char[] value) {
      ip70301InstallMqSrvActive = checkIp70301InstallMqSrvActiveConstraints(value);
      serializeIp70301InstallMqSrvActive(ip70301InstallMqSrvActive);
   } 

     /**
	 * 	Update Ip70301InstallMqSrvActive 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70301InstallMqSrvActive(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70301InstallMqSrvActive,ip70301InstallMqSrvActive.length);
   	
   }
   
   public void setIp70301InstallMqSrvActive(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301InstallMqSrvActive,ip70301InstallMqSrvActive.length);
   	
   }
   
     /**
	 * 	Update Ip70301InstallMqSrvActive 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70301InstallMqSrvActive(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301InstallMqSrvActive+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70301InstallMqSrvActive with another Field
	 *	@param value
	 */
   public void setIp70301InstallMqSrvActive(Field source) {
       replace(source,0,source.length(),beginIp70301InstallMqSrvActive,IP_70301_INSTALL_MQ_SRV_ACTIVE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70301InstallMqSrvActive 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70301InstallMqSrvActive(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70301InstallMqSrvActive,IP_70301_INSTALL_MQ_SRV_ACTIVE_LEN);
   	
   }
   
     /**
	 * 	Update Ip70301InstallMqSrvActive 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70301InstallMqSrvActive(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301InstallMqSrvActive+targetIndex,targetLen);
    
   }
	char[] ip70301InstallMqActveY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp70301InstallMqActveY88()
	 *	@return  Returns true if isIp70301InstallMqActveY88() is "Y"
	 */
   public boolean isIp70301InstallMqActveY88() throws CFException {
      return (  compareChars( getIp70301InstallMqSrvActive() , ip70301InstallMqActveY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp70301InstallMqActveY88True() {  			
    	setIp70301InstallMqSrvActive( ip70301InstallMqActveY8888Value);
   	}
	char[] ip70301InstallMqActveN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp70301InstallMqActveN88()
	 *	@return  Returns true if isIp70301InstallMqActveN88() is "N"
	 */
   public boolean isIp70301InstallMqActveN88() throws CFException {
      return (  compareChars( getIp70301InstallMqSrvActive() , ip70301InstallMqActveN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp70301InstallMqActveN88True() {  			
    	setIp70301InstallMqSrvActive( ip70301InstallMqActveN8888Value);
   	}

	
	
	

		public static int getIp70301InstallMqSrvActiveGroupFieldLength() {
			return IP_70301_INSTALL_MQ_SRV_ACTIVE_GROUP_LENGTH;
		}

}
  
