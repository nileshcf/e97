package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70301PimIndMqSrvActiveGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip70301PimIndMqSrvActiveGroup")

public class Ip70301PimIndMqSrvActiveGroup extends Ip70301PimIndMqSrvActiveGroupSerialized  implements InitializingBean {
   

						private char[] ip70301PimIndMqSrvActive = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip70301PimIndMqSrvActiveGroup
	**/
    public Ip70301PimIndMqSrvActiveGroup() {
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
	 *	Returns the value of ip70301PimIndMqSrvActive
	 *	@return ip70301PimIndMqSrvActive
	 */
   public char[] getIp70301PimIndMqSrvActive() throws CFException{
     if (isIp70301PimIndMqSrvActiveModified()) { 
        ip70301PimIndMqSrvActive = refreshIp70301PimIndMqSrvActive();
     }
   		return ip70301PimIndMqSrvActive;
   }

  
	/**
	*  set variable ip70301PimIndMqSrvActive
	*  Corresponding COBOL Variable is IP70301-PIM-IND-MQ-SRV-ACTIVE
	*  @param value
	**/
   public void setIp70301PimIndMqSrvActive(char[] value) {
      ip70301PimIndMqSrvActive = checkIp70301PimIndMqSrvActiveConstraints(value);
      serializeIp70301PimIndMqSrvActive(ip70301PimIndMqSrvActive);
   } 

     /**
	 * 	Update Ip70301PimIndMqSrvActive 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70301PimIndMqSrvActive(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70301PimIndMqSrvActive,ip70301PimIndMqSrvActive.length);
   	
   }
   
   public void setIp70301PimIndMqSrvActive(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PimIndMqSrvActive,ip70301PimIndMqSrvActive.length);
   	
   }
   
     /**
	 * 	Update Ip70301PimIndMqSrvActive 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70301PimIndMqSrvActive(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PimIndMqSrvActive+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70301PimIndMqSrvActive with another Field
	 *	@param value
	 */
   public void setIp70301PimIndMqSrvActive(Field source) {
       replace(source,0,source.length(),beginIp70301PimIndMqSrvActive,IP_70301_PIM_IND_MQ_SRV_ACTIVE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70301PimIndMqSrvActive 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70301PimIndMqSrvActive(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70301PimIndMqSrvActive,IP_70301_PIM_IND_MQ_SRV_ACTIVE_LEN);
   	
   }
   
     /**
	 * 	Update Ip70301PimIndMqSrvActive 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70301PimIndMqSrvActive(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PimIndMqSrvActive+targetIndex,targetLen);
    
   }
	char[] ip70301PimIndMqActveY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp70301PimIndMqActveY88()
	 *	@return  Returns true if isIp70301PimIndMqActveY88() is "Y"
	 */
   public boolean isIp70301PimIndMqActveY88() throws CFException {
      return (  compareChars( getIp70301PimIndMqSrvActive() , ip70301PimIndMqActveY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp70301PimIndMqActveY88True() {  			
    	setIp70301PimIndMqSrvActive( ip70301PimIndMqActveY8888Value);
   	}
	char[] ip70301PimIndMqActveN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp70301PimIndMqActveN88()
	 *	@return  Returns true if isIp70301PimIndMqActveN88() is "N"
	 */
   public boolean isIp70301PimIndMqActveN88() throws CFException {
      return (  compareChars( getIp70301PimIndMqSrvActive() , ip70301PimIndMqActveN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp70301PimIndMqActveN88True() {  			
    	setIp70301PimIndMqSrvActive( ip70301PimIndMqActveN8888Value);
   	}

	
	
	

		public static int getIp70301PimIndMqSrvActiveGroupFieldLength() {
			return IP_70301_PIM_IND_MQ_SRV_ACTIVE_GROUP_LENGTH;
		}

}
  
