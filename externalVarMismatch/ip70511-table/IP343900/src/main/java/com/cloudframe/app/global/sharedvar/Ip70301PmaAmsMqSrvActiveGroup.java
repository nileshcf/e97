package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70301PmaAmsMqSrvActiveGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:02. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip70301PmaAmsMqSrvActiveGroup")

public class Ip70301PmaAmsMqSrvActiveGroup extends Ip70301PmaAmsMqSrvActiveGroupSerialized  implements InitializingBean {
   

						private char[] ip70301PmaAmsMqSrvActive = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip70301PmaAmsMqSrvActiveGroup
	**/
    public Ip70301PmaAmsMqSrvActiveGroup() {
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
	 *	Returns the value of ip70301PmaAmsMqSrvActive
	 *	@return ip70301PmaAmsMqSrvActive
	 */
   public char[] getIp70301PmaAmsMqSrvActive() throws CFException{
     if (isIp70301PmaAmsMqSrvActiveModified()) { 
        ip70301PmaAmsMqSrvActive = refreshIp70301PmaAmsMqSrvActive();
     }
   		return ip70301PmaAmsMqSrvActive;
   }

  
	/**
	*  set variable ip70301PmaAmsMqSrvActive
	*  Corresponding COBOL Variable is IP70301-PMA-AMS-MQ-SRV-ACTIVE
	*  @param value
	**/
   public void setIp70301PmaAmsMqSrvActive(char[] value) {
      ip70301PmaAmsMqSrvActive = checkIp70301PmaAmsMqSrvActiveConstraints(value);
      serializeIp70301PmaAmsMqSrvActive(ip70301PmaAmsMqSrvActive);
   } 

     /**
	 * 	Update Ip70301PmaAmsMqSrvActive 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70301PmaAmsMqSrvActive(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70301PmaAmsMqSrvActive,ip70301PmaAmsMqSrvActive.length);
   	
   }
   
   public void setIp70301PmaAmsMqSrvActive(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PmaAmsMqSrvActive,ip70301PmaAmsMqSrvActive.length);
   	
   }
   
     /**
	 * 	Update Ip70301PmaAmsMqSrvActive 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70301PmaAmsMqSrvActive(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PmaAmsMqSrvActive+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70301PmaAmsMqSrvActive with another Field
	 *	@param value
	 */
   public void setIp70301PmaAmsMqSrvActive(Field source) {
       replace(source,0,source.length(),beginIp70301PmaAmsMqSrvActive,IP_70301_PMA_AMS_MQ_SRV_ACTIVE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70301PmaAmsMqSrvActive 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70301PmaAmsMqSrvActive(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70301PmaAmsMqSrvActive,IP_70301_PMA_AMS_MQ_SRV_ACTIVE_LEN);
   	
   }
   
     /**
	 * 	Update Ip70301PmaAmsMqSrvActive 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70301PmaAmsMqSrvActive(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PmaAmsMqSrvActive+targetIndex,targetLen);
    
   }
	char[] ip70301PmaAmsMqActveY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp70301PmaAmsMqActveY88()
	 *	@return  Returns true if isIp70301PmaAmsMqActveY88() is "Y"
	 */
   public boolean isIp70301PmaAmsMqActveY88() throws CFException {
      return (  compareChars( getIp70301PmaAmsMqSrvActive() , ip70301PmaAmsMqActveY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp70301PmaAmsMqActveY88True() {  			
    	setIp70301PmaAmsMqSrvActive( ip70301PmaAmsMqActveY8888Value);
   	}
	char[] ip70301PmaAmsMqActveN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp70301PmaAmsMqActveN88()
	 *	@return  Returns true if isIp70301PmaAmsMqActveN88() is "N"
	 */
   public boolean isIp70301PmaAmsMqActveN88() throws CFException {
      return (  compareChars( getIp70301PmaAmsMqSrvActive() , ip70301PmaAmsMqActveN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp70301PmaAmsMqActveN88True() {  			
    	setIp70301PmaAmsMqSrvActive( ip70301PmaAmsMqActveN8888Value);
   	}

	
	
	

		public static int getIp70301PmaAmsMqSrvActiveGroupFieldLength() {
			return IP_70301_PMA_AMS_MQ_SRV_ACTIVE_GROUP_LENGTH;
		}

}
  
