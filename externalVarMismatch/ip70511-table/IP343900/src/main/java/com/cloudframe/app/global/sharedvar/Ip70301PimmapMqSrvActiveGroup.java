package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70301PimmapMqSrvActiveGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:06. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip70301PimmapMqSrvActiveGroup")

public class Ip70301PimmapMqSrvActiveGroup extends Ip70301PimmapMqSrvActiveGroupSerialized  implements InitializingBean {
   

						private char[] ip70301PimmapMqSrvActive = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip70301PimmapMqSrvActiveGroup
	**/
    public Ip70301PimmapMqSrvActiveGroup() {
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
	 *	Returns the value of ip70301PimmapMqSrvActive
	 *	@return ip70301PimmapMqSrvActive
	 */
   public char[] getIp70301PimmapMqSrvActive() throws CFException{
     if (isIp70301PimmapMqSrvActiveModified()) { 
        ip70301PimmapMqSrvActive = refreshIp70301PimmapMqSrvActive();
     }
   		return ip70301PimmapMqSrvActive;
   }

  
	/**
	*  set variable ip70301PimmapMqSrvActive
	*  Corresponding COBOL Variable is IP70301-PIMMAP-MQ-SRV-ACTIVE
	*  @param value
	**/
   public void setIp70301PimmapMqSrvActive(char[] value) {
      ip70301PimmapMqSrvActive = checkIp70301PimmapMqSrvActiveConstraints(value);
      serializeIp70301PimmapMqSrvActive(ip70301PimmapMqSrvActive);
   } 

     /**
	 * 	Update Ip70301PimmapMqSrvActive 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70301PimmapMqSrvActive(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70301PimmapMqSrvActive,ip70301PimmapMqSrvActive.length);
   	
   }
   
   public void setIp70301PimmapMqSrvActive(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PimmapMqSrvActive,ip70301PimmapMqSrvActive.length);
   	
   }
   
     /**
	 * 	Update Ip70301PimmapMqSrvActive 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70301PimmapMqSrvActive(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PimmapMqSrvActive+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70301PimmapMqSrvActive with another Field
	 *	@param value
	 */
   public void setIp70301PimmapMqSrvActive(Field source) {
       replace(source,0,source.length(),beginIp70301PimmapMqSrvActive,IP_70301_PIMMAP_MQ_SRV_ACTIVE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70301PimmapMqSrvActive 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70301PimmapMqSrvActive(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70301PimmapMqSrvActive,IP_70301_PIMMAP_MQ_SRV_ACTIVE_LEN);
   	
   }
   
     /**
	 * 	Update Ip70301PimmapMqSrvActive 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70301PimmapMqSrvActive(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PimmapMqSrvActive+targetIndex,targetLen);
    
   }
	char[] ip70301PimmapMqActveY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp70301PimmapMqActveY88()
	 *	@return  Returns true if isIp70301PimmapMqActveY88() is "Y"
	 */
   public boolean isIp70301PimmapMqActveY88() throws CFException {
      return (  compareChars( getIp70301PimmapMqSrvActive() , ip70301PimmapMqActveY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp70301PimmapMqActveY88True() {  			
    	setIp70301PimmapMqSrvActive( ip70301PimmapMqActveY8888Value);
   	}
	char[] ip70301PimmapMqActveN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp70301PimmapMqActveN88()
	 *	@return  Returns true if isIp70301PimmapMqActveN88() is "N"
	 */
   public boolean isIp70301PimmapMqActveN88() throws CFException {
      return (  compareChars( getIp70301PimmapMqSrvActive() , ip70301PimmapMqActveN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp70301PimmapMqActveN88True() {  			
    	setIp70301PimmapMqSrvActive( ip70301PimmapMqActveN8888Value);
   	}

	
	
	

		public static int getIp70301PimmapMqSrvActiveGroupFieldLength() {
			return IP_70301_PIMMAP_MQ_SRV_ACTIVE_GROUP_LENGTH;
		}

}
  
