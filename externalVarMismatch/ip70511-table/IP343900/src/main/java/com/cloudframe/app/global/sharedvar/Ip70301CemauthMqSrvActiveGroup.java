package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70301CemauthMqSrvActiveGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:06. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip70301CemauthMqSrvActiveGroup")

public class Ip70301CemauthMqSrvActiveGroup extends Ip70301CemauthMqSrvActiveGroupSerialized  implements InitializingBean {
   

						private char[] ip70301CemauthMqSrvActive = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip70301CemauthMqSrvActiveGroup
	**/
    public Ip70301CemauthMqSrvActiveGroup() {
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
	 *	Returns the value of ip70301CemauthMqSrvActive
	 *	@return ip70301CemauthMqSrvActive
	 */
   public char[] getIp70301CemauthMqSrvActive() throws CFException{
     if (isIp70301CemauthMqSrvActiveModified()) { 
        ip70301CemauthMqSrvActive = refreshIp70301CemauthMqSrvActive();
     }
   		return ip70301CemauthMqSrvActive;
   }

  
	/**
	*  set variable ip70301CemauthMqSrvActive
	*  Corresponding COBOL Variable is IP70301-CEMAUTH-MQ-SRV-ACTIVE
	*  @param value
	**/
   public void setIp70301CemauthMqSrvActive(char[] value) {
      ip70301CemauthMqSrvActive = checkIp70301CemauthMqSrvActiveConstraints(value);
      serializeIp70301CemauthMqSrvActive(ip70301CemauthMqSrvActive);
   } 

     /**
	 * 	Update Ip70301CemauthMqSrvActive 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70301CemauthMqSrvActive(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70301CemauthMqSrvActive,ip70301CemauthMqSrvActive.length);
   	
   }
   
   public void setIp70301CemauthMqSrvActive(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301CemauthMqSrvActive,ip70301CemauthMqSrvActive.length);
   	
   }
   
     /**
	 * 	Update Ip70301CemauthMqSrvActive 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70301CemauthMqSrvActive(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301CemauthMqSrvActive+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70301CemauthMqSrvActive with another Field
	 *	@param value
	 */
   public void setIp70301CemauthMqSrvActive(Field source) {
       replace(source,0,source.length(),beginIp70301CemauthMqSrvActive,IP_70301_CEMAUTH_MQ_SRV_ACTIVE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70301CemauthMqSrvActive 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70301CemauthMqSrvActive(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70301CemauthMqSrvActive,IP_70301_CEMAUTH_MQ_SRV_ACTIVE_LEN);
   	
   }
   
     /**
	 * 	Update Ip70301CemauthMqSrvActive 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70301CemauthMqSrvActive(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301CemauthMqSrvActive+targetIndex,targetLen);
    
   }
	char[] ip70301CemauthMqActveY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp70301CemauthMqActveY88()
	 *	@return  Returns true if isIp70301CemauthMqActveY88() is "Y"
	 */
   public boolean isIp70301CemauthMqActveY88() throws CFException {
      return (  compareChars( getIp70301CemauthMqSrvActive() , ip70301CemauthMqActveY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp70301CemauthMqActveY88True() {  			
    	setIp70301CemauthMqSrvActive( ip70301CemauthMqActveY8888Value);
   	}
	char[] ip70301CemauthMqActveN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp70301CemauthMqActveN88()
	 *	@return  Returns true if isIp70301CemauthMqActveN88() is "N"
	 */
   public boolean isIp70301CemauthMqActveN88() throws CFException {
      return (  compareChars( getIp70301CemauthMqSrvActive() , ip70301CemauthMqActveN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp70301CemauthMqActveN88True() {  			
    	setIp70301CemauthMqSrvActive( ip70301CemauthMqActveN8888Value);
   	}

	
	
	

		public static int getIp70301CemauthMqSrvActiveGroupFieldLength() {
			return IP_70301_CEMAUTH_MQ_SRV_ACTIVE_GROUP_LENGTH;
		}

}
  
