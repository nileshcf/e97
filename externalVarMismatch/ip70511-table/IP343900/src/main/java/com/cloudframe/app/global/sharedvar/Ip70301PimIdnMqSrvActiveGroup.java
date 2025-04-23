package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70301PimIdnMqSrvActiveGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip70301PimIdnMqSrvActiveGroup")

public class Ip70301PimIdnMqSrvActiveGroup extends Ip70301PimIdnMqSrvActiveGroupSerialized  implements InitializingBean {
   

						private char[] ip70301PimIdnMqSrvActive = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip70301PimIdnMqSrvActiveGroup
	**/
    public Ip70301PimIdnMqSrvActiveGroup() {
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
	 *	Returns the value of ip70301PimIdnMqSrvActive
	 *	@return ip70301PimIdnMqSrvActive
	 */
   public char[] getIp70301PimIdnMqSrvActive() throws CFException{
     if (isIp70301PimIdnMqSrvActiveModified()) { 
        ip70301PimIdnMqSrvActive = refreshIp70301PimIdnMqSrvActive();
     }
   		return ip70301PimIdnMqSrvActive;
   }

  
	/**
	*  set variable ip70301PimIdnMqSrvActive
	*  Corresponding COBOL Variable is IP70301-PIM-IDN-MQ-SRV-ACTIVE
	*  @param value
	**/
   public void setIp70301PimIdnMqSrvActive(char[] value) {
      ip70301PimIdnMqSrvActive = checkIp70301PimIdnMqSrvActiveConstraints(value);
      serializeIp70301PimIdnMqSrvActive(ip70301PimIdnMqSrvActive);
   } 

     /**
	 * 	Update Ip70301PimIdnMqSrvActive 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70301PimIdnMqSrvActive(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70301PimIdnMqSrvActive,ip70301PimIdnMqSrvActive.length);
   	
   }
   
   public void setIp70301PimIdnMqSrvActive(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PimIdnMqSrvActive,ip70301PimIdnMqSrvActive.length);
   	
   }
   
     /**
	 * 	Update Ip70301PimIdnMqSrvActive 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70301PimIdnMqSrvActive(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PimIdnMqSrvActive+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70301PimIdnMqSrvActive with another Field
	 *	@param value
	 */
   public void setIp70301PimIdnMqSrvActive(Field source) {
       replace(source,0,source.length(),beginIp70301PimIdnMqSrvActive,IP_70301_PIM_IDN_MQ_SRV_ACTIVE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70301PimIdnMqSrvActive 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70301PimIdnMqSrvActive(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70301PimIdnMqSrvActive,IP_70301_PIM_IDN_MQ_SRV_ACTIVE_LEN);
   	
   }
   
     /**
	 * 	Update Ip70301PimIdnMqSrvActive 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70301PimIdnMqSrvActive(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PimIdnMqSrvActive+targetIndex,targetLen);
    
   }
	char[] ip70301PimIdnMqActveY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp70301PimIdnMqActveY88()
	 *	@return  Returns true if isIp70301PimIdnMqActveY88() is "Y"
	 */
   public boolean isIp70301PimIdnMqActveY88() throws CFException {
      return (  compareChars( getIp70301PimIdnMqSrvActive() , ip70301PimIdnMqActveY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp70301PimIdnMqActveY88True() {  			
    	setIp70301PimIdnMqSrvActive( ip70301PimIdnMqActveY8888Value);
   	}
	char[] ip70301PimIdnMqActveN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp70301PimIdnMqActveN88()
	 *	@return  Returns true if isIp70301PimIdnMqActveN88() is "N"
	 */
   public boolean isIp70301PimIdnMqActveN88() throws CFException {
      return (  compareChars( getIp70301PimIdnMqSrvActive() , ip70301PimIdnMqActveN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp70301PimIdnMqActveN88True() {  			
    	setIp70301PimIdnMqSrvActive( ip70301PimIdnMqActveN8888Value);
   	}

	
	
	

		public static int getIp70301PimIdnMqSrvActiveGroupFieldLength() {
			return IP_70301_PIM_IDN_MQ_SRV_ACTIVE_GROUP_LENGTH;
		}

}
  
