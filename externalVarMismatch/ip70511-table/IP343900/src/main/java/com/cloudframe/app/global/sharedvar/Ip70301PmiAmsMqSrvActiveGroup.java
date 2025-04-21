package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70301PmiAmsMqSrvActiveGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip70301PmiAmsMqSrvActiveGroup")

public class Ip70301PmiAmsMqSrvActiveGroup extends Ip70301PmiAmsMqSrvActiveGroupSerialized  implements InitializingBean {
   

						private char[] ip70301PmiAmsMqSrvActive = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip70301PmiAmsMqSrvActiveGroup
	**/
    public Ip70301PmiAmsMqSrvActiveGroup() {
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
	 *	Returns the value of ip70301PmiAmsMqSrvActive
	 *	@return ip70301PmiAmsMqSrvActive
	 */
   public char[] getIp70301PmiAmsMqSrvActive() throws CFException{
     if (isIp70301PmiAmsMqSrvActiveModified()) { 
        ip70301PmiAmsMqSrvActive = refreshIp70301PmiAmsMqSrvActive();
     }
   		return ip70301PmiAmsMqSrvActive;
   }

  
	/**
	*  set variable ip70301PmiAmsMqSrvActive
	*  Corresponding COBOL Variable is IP70301-PMI-AMS-MQ-SRV-ACTIVE
	*  @param value
	**/
   public void setIp70301PmiAmsMqSrvActive(char[] value) {
      ip70301PmiAmsMqSrvActive = checkIp70301PmiAmsMqSrvActiveConstraints(value);
      serializeIp70301PmiAmsMqSrvActive(ip70301PmiAmsMqSrvActive);
   } 

     /**
	 * 	Update Ip70301PmiAmsMqSrvActive 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70301PmiAmsMqSrvActive(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70301PmiAmsMqSrvActive,ip70301PmiAmsMqSrvActive.length);
   	
   }
   
   public void setIp70301PmiAmsMqSrvActive(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PmiAmsMqSrvActive,ip70301PmiAmsMqSrvActive.length);
   	
   }
   
     /**
	 * 	Update Ip70301PmiAmsMqSrvActive 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70301PmiAmsMqSrvActive(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PmiAmsMqSrvActive+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70301PmiAmsMqSrvActive with another Field
	 *	@param value
	 */
   public void setIp70301PmiAmsMqSrvActive(Field source) {
       replace(source,0,source.length(),beginIp70301PmiAmsMqSrvActive,IP_70301_PMI_AMS_MQ_SRV_ACTIVE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70301PmiAmsMqSrvActive 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70301PmiAmsMqSrvActive(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70301PmiAmsMqSrvActive,IP_70301_PMI_AMS_MQ_SRV_ACTIVE_LEN);
   	
   }
   
     /**
	 * 	Update Ip70301PmiAmsMqSrvActive 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70301PmiAmsMqSrvActive(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PmiAmsMqSrvActive+targetIndex,targetLen);
    
   }
	char[] ip70301PmiAmsMqActveY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp70301PmiAmsMqActveY88()
	 *	@return  Returns true if isIp70301PmiAmsMqActveY88() is "Y"
	 */
   public boolean isIp70301PmiAmsMqActveY88() throws CFException {
      return (  compareChars( getIp70301PmiAmsMqSrvActive() , ip70301PmiAmsMqActveY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp70301PmiAmsMqActveY88True() {  			
    	setIp70301PmiAmsMqSrvActive( ip70301PmiAmsMqActveY8888Value);
   	}
	char[] ip70301PmiAmsMqActveN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp70301PmiAmsMqActveN88()
	 *	@return  Returns true if isIp70301PmiAmsMqActveN88() is "N"
	 */
   public boolean isIp70301PmiAmsMqActveN88() throws CFException {
      return (  compareChars( getIp70301PmiAmsMqSrvActive() , ip70301PmiAmsMqActveN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp70301PmiAmsMqActveN88True() {  			
    	setIp70301PmiAmsMqSrvActive( ip70301PmiAmsMqActveN8888Value);
   	}

	
	
	

		public static int getIp70301PmiAmsMqSrvActiveGroupFieldLength() {
			return IP_70301_PMI_AMS_MQ_SRV_ACTIVE_GROUP_LENGTH;
		}

}
  
