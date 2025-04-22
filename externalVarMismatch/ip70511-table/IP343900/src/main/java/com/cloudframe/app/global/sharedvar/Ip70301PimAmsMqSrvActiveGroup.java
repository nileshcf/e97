package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70301PimAmsMqSrvActiveGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip70301PimAmsMqSrvActiveGroup")

public class Ip70301PimAmsMqSrvActiveGroup extends Ip70301PimAmsMqSrvActiveGroupSerialized  implements InitializingBean {
   

						private char[] ip70301PimAmsMqSrvActive = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip70301PimAmsMqSrvActiveGroup
	**/
    public Ip70301PimAmsMqSrvActiveGroup() {
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
	 *	Returns the value of ip70301PimAmsMqSrvActive
	 *	@return ip70301PimAmsMqSrvActive
	 */
   public char[] getIp70301PimAmsMqSrvActive() throws CFException{
     if (isIp70301PimAmsMqSrvActiveModified()) { 
        ip70301PimAmsMqSrvActive = refreshIp70301PimAmsMqSrvActive();
     }
   		return ip70301PimAmsMqSrvActive;
   }

  
	/**
	*  set variable ip70301PimAmsMqSrvActive
	*  Corresponding COBOL Variable is IP70301-PIM-AMS-MQ-SRV-ACTIVE
	*  @param value
	**/
   public void setIp70301PimAmsMqSrvActive(char[] value) {
      ip70301PimAmsMqSrvActive = checkIp70301PimAmsMqSrvActiveConstraints(value);
      serializeIp70301PimAmsMqSrvActive(ip70301PimAmsMqSrvActive);
   } 

     /**
	 * 	Update Ip70301PimAmsMqSrvActive 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70301PimAmsMqSrvActive(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70301PimAmsMqSrvActive,ip70301PimAmsMqSrvActive.length);
   	
   }
   
   public void setIp70301PimAmsMqSrvActive(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PimAmsMqSrvActive,ip70301PimAmsMqSrvActive.length);
   	
   }
   
     /**
	 * 	Update Ip70301PimAmsMqSrvActive 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70301PimAmsMqSrvActive(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PimAmsMqSrvActive+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70301PimAmsMqSrvActive with another Field
	 *	@param value
	 */
   public void setIp70301PimAmsMqSrvActive(Field source) {
       replace(source,0,source.length(),beginIp70301PimAmsMqSrvActive,IP_70301_PIM_AMS_MQ_SRV_ACTIVE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70301PimAmsMqSrvActive 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70301PimAmsMqSrvActive(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70301PimAmsMqSrvActive,IP_70301_PIM_AMS_MQ_SRV_ACTIVE_LEN);
   	
   }
   
     /**
	 * 	Update Ip70301PimAmsMqSrvActive 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70301PimAmsMqSrvActive(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PimAmsMqSrvActive+targetIndex,targetLen);
    
   }
	char[] ip70301PimAmsMqActveY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp70301PimAmsMqActveY88()
	 *	@return  Returns true if isIp70301PimAmsMqActveY88() is "Y"
	 */
   public boolean isIp70301PimAmsMqActveY88() throws CFException {
      return (  compareChars( getIp70301PimAmsMqSrvActive() , ip70301PimAmsMqActveY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp70301PimAmsMqActveY88True() {  			
    	setIp70301PimAmsMqSrvActive( ip70301PimAmsMqActveY8888Value);
   	}
	char[] ip70301PimAmsMqActveN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp70301PimAmsMqActveN88()
	 *	@return  Returns true if isIp70301PimAmsMqActveN88() is "N"
	 */
   public boolean isIp70301PimAmsMqActveN88() throws CFException {
      return (  compareChars( getIp70301PimAmsMqSrvActive() , ip70301PimAmsMqActveN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp70301PimAmsMqActveN88True() {  			
    	setIp70301PimAmsMqSrvActive( ip70301PimAmsMqActveN8888Value);
   	}

	
	
	

		public static int getIp70301PimAmsMqSrvActiveGroupFieldLength() {
			return IP_70301_PIM_AMS_MQ_SRV_ACTIVE_GROUP_LENGTH;
		}

}
  
