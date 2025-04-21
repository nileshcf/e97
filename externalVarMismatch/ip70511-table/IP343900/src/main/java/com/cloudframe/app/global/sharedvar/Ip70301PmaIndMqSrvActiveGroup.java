package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70301PmaIndMqSrvActiveGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip70301PmaIndMqSrvActiveGroup")

public class Ip70301PmaIndMqSrvActiveGroup extends Ip70301PmaIndMqSrvActiveGroupSerialized  implements InitializingBean {
   

						private char[] ip70301PmaIndMqSrvActive = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip70301PmaIndMqSrvActiveGroup
	**/
    public Ip70301PmaIndMqSrvActiveGroup() {
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
	 *	Returns the value of ip70301PmaIndMqSrvActive
	 *	@return ip70301PmaIndMqSrvActive
	 */
   public char[] getIp70301PmaIndMqSrvActive() throws CFException{
     if (isIp70301PmaIndMqSrvActiveModified()) { 
        ip70301PmaIndMqSrvActive = refreshIp70301PmaIndMqSrvActive();
     }
   		return ip70301PmaIndMqSrvActive;
   }

  
	/**
	*  set variable ip70301PmaIndMqSrvActive
	*  Corresponding COBOL Variable is IP70301-PMA-IND-MQ-SRV-ACTIVE
	*  @param value
	**/
   public void setIp70301PmaIndMqSrvActive(char[] value) {
      ip70301PmaIndMqSrvActive = checkIp70301PmaIndMqSrvActiveConstraints(value);
      serializeIp70301PmaIndMqSrvActive(ip70301PmaIndMqSrvActive);
   } 

     /**
	 * 	Update Ip70301PmaIndMqSrvActive 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70301PmaIndMqSrvActive(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70301PmaIndMqSrvActive,ip70301PmaIndMqSrvActive.length);
   	
   }
   
   public void setIp70301PmaIndMqSrvActive(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PmaIndMqSrvActive,ip70301PmaIndMqSrvActive.length);
   	
   }
   
     /**
	 * 	Update Ip70301PmaIndMqSrvActive 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70301PmaIndMqSrvActive(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PmaIndMqSrvActive+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70301PmaIndMqSrvActive with another Field
	 *	@param value
	 */
   public void setIp70301PmaIndMqSrvActive(Field source) {
       replace(source,0,source.length(),beginIp70301PmaIndMqSrvActive,IP_70301_PMA_IND_MQ_SRV_ACTIVE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70301PmaIndMqSrvActive 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70301PmaIndMqSrvActive(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70301PmaIndMqSrvActive,IP_70301_PMA_IND_MQ_SRV_ACTIVE_LEN);
   	
   }
   
     /**
	 * 	Update Ip70301PmaIndMqSrvActive 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70301PmaIndMqSrvActive(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PmaIndMqSrvActive+targetIndex,targetLen);
    
   }
	char[] ip70301PmaIndMqActveY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp70301PmaIndMqActveY88()
	 *	@return  Returns true if isIp70301PmaIndMqActveY88() is "Y"
	 */
   public boolean isIp70301PmaIndMqActveY88() throws CFException {
      return (  compareChars( getIp70301PmaIndMqSrvActive() , ip70301PmaIndMqActveY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp70301PmaIndMqActveY88True() {  			
    	setIp70301PmaIndMqSrvActive( ip70301PmaIndMqActveY8888Value);
   	}
	char[] ip70301PmaIndMqActveN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp70301PmaIndMqActveN88()
	 *	@return  Returns true if isIp70301PmaIndMqActveN88() is "N"
	 */
   public boolean isIp70301PmaIndMqActveN88() throws CFException {
      return (  compareChars( getIp70301PmaIndMqSrvActive() , ip70301PmaIndMqActveN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp70301PmaIndMqActveN88True() {  			
    	setIp70301PmaIndMqSrvActive( ip70301PmaIndMqActveN8888Value);
   	}

	
	
	

		public static int getIp70301PmaIndMqSrvActiveGroupFieldLength() {
			return IP_70301_PMA_IND_MQ_SRV_ACTIVE_GROUP_LENGTH;
		}

}
  
