package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70301PmiIndMqSrvActiveGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip70301PmiIndMqSrvActiveGroup")

public class Ip70301PmiIndMqSrvActiveGroup extends Ip70301PmiIndMqSrvActiveGroupSerialized  implements InitializingBean {
   

						private char[] ip70301PmiIndMqSrvActive = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip70301PmiIndMqSrvActiveGroup
	**/
    public Ip70301PmiIndMqSrvActiveGroup() {
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
	 *	Returns the value of ip70301PmiIndMqSrvActive
	 *	@return ip70301PmiIndMqSrvActive
	 */
   public char[] getIp70301PmiIndMqSrvActive() throws CFException{
     if (isIp70301PmiIndMqSrvActiveModified()) { 
        ip70301PmiIndMqSrvActive = refreshIp70301PmiIndMqSrvActive();
     }
   		return ip70301PmiIndMqSrvActive;
   }

  
	/**
	*  set variable ip70301PmiIndMqSrvActive
	*  Corresponding COBOL Variable is IP70301-PMI-IND-MQ-SRV-ACTIVE
	*  @param value
	**/
   public void setIp70301PmiIndMqSrvActive(char[] value) {
      ip70301PmiIndMqSrvActive = checkIp70301PmiIndMqSrvActiveConstraints(value);
      serializeIp70301PmiIndMqSrvActive(ip70301PmiIndMqSrvActive);
   } 

     /**
	 * 	Update Ip70301PmiIndMqSrvActive 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70301PmiIndMqSrvActive(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70301PmiIndMqSrvActive,ip70301PmiIndMqSrvActive.length);
   	
   }
   
   public void setIp70301PmiIndMqSrvActive(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PmiIndMqSrvActive,ip70301PmiIndMqSrvActive.length);
   	
   }
   
     /**
	 * 	Update Ip70301PmiIndMqSrvActive 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70301PmiIndMqSrvActive(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PmiIndMqSrvActive+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70301PmiIndMqSrvActive with another Field
	 *	@param value
	 */
   public void setIp70301PmiIndMqSrvActive(Field source) {
       replace(source,0,source.length(),beginIp70301PmiIndMqSrvActive,IP_70301_PMI_IND_MQ_SRV_ACTIVE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70301PmiIndMqSrvActive 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70301PmiIndMqSrvActive(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70301PmiIndMqSrvActive,IP_70301_PMI_IND_MQ_SRV_ACTIVE_LEN);
   	
   }
   
     /**
	 * 	Update Ip70301PmiIndMqSrvActive 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70301PmiIndMqSrvActive(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PmiIndMqSrvActive+targetIndex,targetLen);
    
   }
	char[] ip70301PmiIndMqActveY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp70301PmiIndMqActveY88()
	 *	@return  Returns true if isIp70301PmiIndMqActveY88() is "Y"
	 */
   public boolean isIp70301PmiIndMqActveY88() throws CFException {
      return (  compareChars( getIp70301PmiIndMqSrvActive() , ip70301PmiIndMqActveY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp70301PmiIndMqActveY88True() {  			
    	setIp70301PmiIndMqSrvActive( ip70301PmiIndMqActveY8888Value);
   	}
	char[] ip70301PmiIndMqActveN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp70301PmiIndMqActveN88()
	 *	@return  Returns true if isIp70301PmiIndMqActveN88() is "N"
	 */
   public boolean isIp70301PmiIndMqActveN88() throws CFException {
      return (  compareChars( getIp70301PmiIndMqSrvActive() , ip70301PmiIndMqActveN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp70301PmiIndMqActveN88True() {  			
    	setIp70301PmiIndMqSrvActive( ip70301PmiIndMqActveN8888Value);
   	}

	
	
	

		public static int getIp70301PmiIndMqSrvActiveGroupFieldLength() {
			return IP_70301_PMI_IND_MQ_SRV_ACTIVE_GROUP_LENGTH;
		}

}
  
