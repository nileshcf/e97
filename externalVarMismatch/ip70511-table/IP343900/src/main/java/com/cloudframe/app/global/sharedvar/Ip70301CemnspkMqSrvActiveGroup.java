package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70301CemnspkMqSrvActiveGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:06. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip70301CemnspkMqSrvActiveGroup")

public class Ip70301CemnspkMqSrvActiveGroup extends Ip70301CemnspkMqSrvActiveGroupSerialized  implements InitializingBean {
   

						private char[] ip70301CemnspkMqSrvActive = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip70301CemnspkMqSrvActiveGroup
	**/
    public Ip70301CemnspkMqSrvActiveGroup() {
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
	 *	Returns the value of ip70301CemnspkMqSrvActive
	 *	@return ip70301CemnspkMqSrvActive
	 */
   public char[] getIp70301CemnspkMqSrvActive() throws CFException{
     if (isIp70301CemnspkMqSrvActiveModified()) { 
        ip70301CemnspkMqSrvActive = refreshIp70301CemnspkMqSrvActive();
     }
   		return ip70301CemnspkMqSrvActive;
   }

  
	/**
	*  set variable ip70301CemnspkMqSrvActive
	*  Corresponding COBOL Variable is IP70301-CEMNSPK-MQ-SRV-ACTIVE
	*  @param value
	**/
   public void setIp70301CemnspkMqSrvActive(char[] value) {
      ip70301CemnspkMqSrvActive = checkIp70301CemnspkMqSrvActiveConstraints(value);
      serializeIp70301CemnspkMqSrvActive(ip70301CemnspkMqSrvActive);
   } 

     /**
	 * 	Update Ip70301CemnspkMqSrvActive 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70301CemnspkMqSrvActive(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70301CemnspkMqSrvActive,ip70301CemnspkMqSrvActive.length);
   	
   }
   
   public void setIp70301CemnspkMqSrvActive(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301CemnspkMqSrvActive,ip70301CemnspkMqSrvActive.length);
   	
   }
   
     /**
	 * 	Update Ip70301CemnspkMqSrvActive 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70301CemnspkMqSrvActive(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301CemnspkMqSrvActive+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70301CemnspkMqSrvActive with another Field
	 *	@param value
	 */
   public void setIp70301CemnspkMqSrvActive(Field source) {
       replace(source,0,source.length(),beginIp70301CemnspkMqSrvActive,IP_70301_CEMNSPK_MQ_SRV_ACTIVE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70301CemnspkMqSrvActive 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70301CemnspkMqSrvActive(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70301CemnspkMqSrvActive,IP_70301_CEMNSPK_MQ_SRV_ACTIVE_LEN);
   	
   }
   
     /**
	 * 	Update Ip70301CemnspkMqSrvActive 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70301CemnspkMqSrvActive(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301CemnspkMqSrvActive+targetIndex,targetLen);
    
   }
	char[] ip70301CemnspkMqActveY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp70301CemnspkMqActveY88()
	 *	@return  Returns true if isIp70301CemnspkMqActveY88() is "Y"
	 */
   public boolean isIp70301CemnspkMqActveY88() throws CFException {
      return (  compareChars( getIp70301CemnspkMqSrvActive() , ip70301CemnspkMqActveY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp70301CemnspkMqActveY88True() {  			
    	setIp70301CemnspkMqSrvActive( ip70301CemnspkMqActveY8888Value);
   	}
	char[] ip70301CemnspkMqActveN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp70301CemnspkMqActveN88()
	 *	@return  Returns true if isIp70301CemnspkMqActveN88() is "N"
	 */
   public boolean isIp70301CemnspkMqActveN88() throws CFException {
      return (  compareChars( getIp70301CemnspkMqSrvActive() , ip70301CemnspkMqActveN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp70301CemnspkMqActveN88True() {  			
    	setIp70301CemnspkMqSrvActive( ip70301CemnspkMqActveN8888Value);
   	}

	
	
	

		public static int getIp70301CemnspkMqSrvActiveGroupFieldLength() {
			return IP_70301_CEMNSPK_MQ_SRV_ACTIVE_GROUP_LENGTH;
		}

}
  
