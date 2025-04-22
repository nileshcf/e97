package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70301AlmRspMqSrvActiveGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip70301AlmRspMqSrvActiveGroup")

public class Ip70301AlmRspMqSrvActiveGroup extends Ip70301AlmRspMqSrvActiveGroupSerialized  implements InitializingBean {
   

						private char[] ip70301AlmRspMqSrvActive = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip70301AlmRspMqSrvActiveGroup
	**/
    public Ip70301AlmRspMqSrvActiveGroup() {
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
	 *	Returns the value of ip70301AlmRspMqSrvActive
	 *	@return ip70301AlmRspMqSrvActive
	 */
   public char[] getIp70301AlmRspMqSrvActive() throws CFException{
     if (isIp70301AlmRspMqSrvActiveModified()) { 
        ip70301AlmRspMqSrvActive = refreshIp70301AlmRspMqSrvActive();
     }
   		return ip70301AlmRspMqSrvActive;
   }

  
	/**
	*  set variable ip70301AlmRspMqSrvActive
	*  Corresponding COBOL Variable is IP70301-ALM-RSP-MQ-SRV-ACTIVE
	*  @param value
	**/
   public void setIp70301AlmRspMqSrvActive(char[] value) {
      ip70301AlmRspMqSrvActive = checkIp70301AlmRspMqSrvActiveConstraints(value);
      serializeIp70301AlmRspMqSrvActive(ip70301AlmRspMqSrvActive);
   } 

     /**
	 * 	Update Ip70301AlmRspMqSrvActive 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70301AlmRspMqSrvActive(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70301AlmRspMqSrvActive,ip70301AlmRspMqSrvActive.length);
   	
   }
   
   public void setIp70301AlmRspMqSrvActive(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301AlmRspMqSrvActive,ip70301AlmRspMqSrvActive.length);
   	
   }
   
     /**
	 * 	Update Ip70301AlmRspMqSrvActive 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70301AlmRspMqSrvActive(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301AlmRspMqSrvActive+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70301AlmRspMqSrvActive with another Field
	 *	@param value
	 */
   public void setIp70301AlmRspMqSrvActive(Field source) {
       replace(source,0,source.length(),beginIp70301AlmRspMqSrvActive,IP_70301_ALM_RSP_MQ_SRV_ACTIVE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70301AlmRspMqSrvActive 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70301AlmRspMqSrvActive(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70301AlmRspMqSrvActive,IP_70301_ALM_RSP_MQ_SRV_ACTIVE_LEN);
   	
   }
   
     /**
	 * 	Update Ip70301AlmRspMqSrvActive 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70301AlmRspMqSrvActive(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301AlmRspMqSrvActive+targetIndex,targetLen);
    
   }
	char[] ip70301AlmRspMqActveY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp70301AlmRspMqActveY88()
	 *	@return  Returns true if isIp70301AlmRspMqActveY88() is "Y"
	 */
   public boolean isIp70301AlmRspMqActveY88() throws CFException {
      return (  compareChars( getIp70301AlmRspMqSrvActive() , ip70301AlmRspMqActveY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp70301AlmRspMqActveY88True() {  			
    	setIp70301AlmRspMqSrvActive( ip70301AlmRspMqActveY8888Value);
   	}
	char[] ip70301AlmRspMqActveN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp70301AlmRspMqActveN88()
	 *	@return  Returns true if isIp70301AlmRspMqActveN88() is "N"
	 */
   public boolean isIp70301AlmRspMqActveN88() throws CFException {
      return (  compareChars( getIp70301AlmRspMqSrvActive() , ip70301AlmRspMqActveN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp70301AlmRspMqActveN88True() {  			
    	setIp70301AlmRspMqSrvActive( ip70301AlmRspMqActveN8888Value);
   	}

	
	
	

		public static int getIp70301AlmRspMqSrvActiveGroupFieldLength() {
			return IP_70301_ALM_RSP_MQ_SRV_ACTIVE_GROUP_LENGTH;
		}

}
  
