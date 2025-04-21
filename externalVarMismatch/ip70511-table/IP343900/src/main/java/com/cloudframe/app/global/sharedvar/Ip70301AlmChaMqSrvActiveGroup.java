package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70301AlmChaMqSrvActiveGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip70301AlmChaMqSrvActiveGroup")

public class Ip70301AlmChaMqSrvActiveGroup extends Ip70301AlmChaMqSrvActiveGroupSerialized  implements InitializingBean {
   

						private char[] ip70301AlmChaMqSrvActive = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip70301AlmChaMqSrvActiveGroup
	**/
    public Ip70301AlmChaMqSrvActiveGroup() {
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
	 *	Returns the value of ip70301AlmChaMqSrvActive
	 *	@return ip70301AlmChaMqSrvActive
	 */
   public char[] getIp70301AlmChaMqSrvActive() throws CFException{
     if (isIp70301AlmChaMqSrvActiveModified()) { 
        ip70301AlmChaMqSrvActive = refreshIp70301AlmChaMqSrvActive();
     }
   		return ip70301AlmChaMqSrvActive;
   }

  
	/**
	*  set variable ip70301AlmChaMqSrvActive
	*  Corresponding COBOL Variable is IP70301-ALM-CHA-MQ-SRV-ACTIVE
	*  @param value
	**/
   public void setIp70301AlmChaMqSrvActive(char[] value) {
      ip70301AlmChaMqSrvActive = checkIp70301AlmChaMqSrvActiveConstraints(value);
      serializeIp70301AlmChaMqSrvActive(ip70301AlmChaMqSrvActive);
   } 

     /**
	 * 	Update Ip70301AlmChaMqSrvActive 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70301AlmChaMqSrvActive(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70301AlmChaMqSrvActive,ip70301AlmChaMqSrvActive.length);
   	
   }
   
   public void setIp70301AlmChaMqSrvActive(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301AlmChaMqSrvActive,ip70301AlmChaMqSrvActive.length);
   	
   }
   
     /**
	 * 	Update Ip70301AlmChaMqSrvActive 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70301AlmChaMqSrvActive(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301AlmChaMqSrvActive+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70301AlmChaMqSrvActive with another Field
	 *	@param value
	 */
   public void setIp70301AlmChaMqSrvActive(Field source) {
       replace(source,0,source.length(),beginIp70301AlmChaMqSrvActive,IP_70301_ALM_CHA_MQ_SRV_ACTIVE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70301AlmChaMqSrvActive 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70301AlmChaMqSrvActive(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70301AlmChaMqSrvActive,IP_70301_ALM_CHA_MQ_SRV_ACTIVE_LEN);
   	
   }
   
     /**
	 * 	Update Ip70301AlmChaMqSrvActive 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70301AlmChaMqSrvActive(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301AlmChaMqSrvActive+targetIndex,targetLen);
    
   }
	char[] ip70301AlmChaMqActveY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp70301AlmChaMqActveY88()
	 *	@return  Returns true if isIp70301AlmChaMqActveY88() is "Y"
	 */
   public boolean isIp70301AlmChaMqActveY88() throws CFException {
      return (  compareChars( getIp70301AlmChaMqSrvActive() , ip70301AlmChaMqActveY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp70301AlmChaMqActveY88True() {  			
    	setIp70301AlmChaMqSrvActive( ip70301AlmChaMqActveY8888Value);
   	}
	char[] ip70301AlmChaMqActveN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp70301AlmChaMqActveN88()
	 *	@return  Returns true if isIp70301AlmChaMqActveN88() is "N"
	 */
   public boolean isIp70301AlmChaMqActveN88() throws CFException {
      return (  compareChars( getIp70301AlmChaMqSrvActive() , ip70301AlmChaMqActveN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp70301AlmChaMqActveN88True() {  			
    	setIp70301AlmChaMqSrvActive( ip70301AlmChaMqActveN8888Value);
   	}

	
	
	

		public static int getIp70301AlmChaMqSrvActiveGroupFieldLength() {
			return IP_70301_ALM_CHA_MQ_SRV_ACTIVE_GROUP_LENGTH;
		}

}
  
