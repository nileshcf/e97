package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70301PmaIdnMqSrvActiveGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip70301PmaIdnMqSrvActiveGroup")

public class Ip70301PmaIdnMqSrvActiveGroup extends Ip70301PmaIdnMqSrvActiveGroupSerialized  implements InitializingBean {
   

						private char[] ip70301PmaIdnMqSrvActive = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip70301PmaIdnMqSrvActiveGroup
	**/
    public Ip70301PmaIdnMqSrvActiveGroup() {
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
	 *	Returns the value of ip70301PmaIdnMqSrvActive
	 *	@return ip70301PmaIdnMqSrvActive
	 */
   public char[] getIp70301PmaIdnMqSrvActive() throws CFException{
     if (isIp70301PmaIdnMqSrvActiveModified()) { 
        ip70301PmaIdnMqSrvActive = refreshIp70301PmaIdnMqSrvActive();
     }
   		return ip70301PmaIdnMqSrvActive;
   }

  
	/**
	*  set variable ip70301PmaIdnMqSrvActive
	*  Corresponding COBOL Variable is IP70301-PMA-IDN-MQ-SRV-ACTIVE
	*  @param value
	**/
   public void setIp70301PmaIdnMqSrvActive(char[] value) {
      ip70301PmaIdnMqSrvActive = checkIp70301PmaIdnMqSrvActiveConstraints(value);
      serializeIp70301PmaIdnMqSrvActive(ip70301PmaIdnMqSrvActive);
   } 

     /**
	 * 	Update Ip70301PmaIdnMqSrvActive 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70301PmaIdnMqSrvActive(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70301PmaIdnMqSrvActive,ip70301PmaIdnMqSrvActive.length);
   	
   }
   
   public void setIp70301PmaIdnMqSrvActive(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PmaIdnMqSrvActive,ip70301PmaIdnMqSrvActive.length);
   	
   }
   
     /**
	 * 	Update Ip70301PmaIdnMqSrvActive 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70301PmaIdnMqSrvActive(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PmaIdnMqSrvActive+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70301PmaIdnMqSrvActive with another Field
	 *	@param value
	 */
   public void setIp70301PmaIdnMqSrvActive(Field source) {
       replace(source,0,source.length(),beginIp70301PmaIdnMqSrvActive,IP_70301_PMA_IDN_MQ_SRV_ACTIVE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70301PmaIdnMqSrvActive 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70301PmaIdnMqSrvActive(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70301PmaIdnMqSrvActive,IP_70301_PMA_IDN_MQ_SRV_ACTIVE_LEN);
   	
   }
   
     /**
	 * 	Update Ip70301PmaIdnMqSrvActive 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70301PmaIdnMqSrvActive(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PmaIdnMqSrvActive+targetIndex,targetLen);
    
   }
	char[] ip70301PmaIdnMqActveY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp70301PmaIdnMqActveY88()
	 *	@return  Returns true if isIp70301PmaIdnMqActveY88() is "Y"
	 */
   public boolean isIp70301PmaIdnMqActveY88() throws CFException {
      return (  compareChars( getIp70301PmaIdnMqSrvActive() , ip70301PmaIdnMqActveY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp70301PmaIdnMqActveY88True() {  			
    	setIp70301PmaIdnMqSrvActive( ip70301PmaIdnMqActveY8888Value);
   	}
	char[] ip70301PmaIdnMqActveN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp70301PmaIdnMqActveN88()
	 *	@return  Returns true if isIp70301PmaIdnMqActveN88() is "N"
	 */
   public boolean isIp70301PmaIdnMqActveN88() throws CFException {
      return (  compareChars( getIp70301PmaIdnMqSrvActive() , ip70301PmaIdnMqActveN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp70301PmaIdnMqActveN88True() {  			
    	setIp70301PmaIdnMqSrvActive( ip70301PmaIdnMqActveN8888Value);
   	}

	
	
	

		public static int getIp70301PmaIdnMqSrvActiveGroupFieldLength() {
			return IP_70301_PMA_IDN_MQ_SRV_ACTIVE_GROUP_LENGTH;
		}

}
  
