package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70301PmaRusMqSrvActiveGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip70301PmaRusMqSrvActiveGroup")

public class Ip70301PmaRusMqSrvActiveGroup extends Ip70301PmaRusMqSrvActiveGroupSerialized  implements InitializingBean {
   

						private char[] ip70301PmaRusMqSrvActive = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip70301PmaRusMqSrvActiveGroup
	**/
    public Ip70301PmaRusMqSrvActiveGroup() {
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
	 *	Returns the value of ip70301PmaRusMqSrvActive
	 *	@return ip70301PmaRusMqSrvActive
	 */
   public char[] getIp70301PmaRusMqSrvActive() throws CFException{
     if (isIp70301PmaRusMqSrvActiveModified()) { 
        ip70301PmaRusMqSrvActive = refreshIp70301PmaRusMqSrvActive();
     }
   		return ip70301PmaRusMqSrvActive;
   }

  
	/**
	*  set variable ip70301PmaRusMqSrvActive
	*  Corresponding COBOL Variable is IP70301-PMA-RUS-MQ-SRV-ACTIVE
	*  @param value
	**/
   public void setIp70301PmaRusMqSrvActive(char[] value) {
      ip70301PmaRusMqSrvActive = checkIp70301PmaRusMqSrvActiveConstraints(value);
      serializeIp70301PmaRusMqSrvActive(ip70301PmaRusMqSrvActive);
   } 

     /**
	 * 	Update Ip70301PmaRusMqSrvActive 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70301PmaRusMqSrvActive(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70301PmaRusMqSrvActive,ip70301PmaRusMqSrvActive.length);
   	
   }
   
   public void setIp70301PmaRusMqSrvActive(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PmaRusMqSrvActive,ip70301PmaRusMqSrvActive.length);
   	
   }
   
     /**
	 * 	Update Ip70301PmaRusMqSrvActive 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70301PmaRusMqSrvActive(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PmaRusMqSrvActive+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70301PmaRusMqSrvActive with another Field
	 *	@param value
	 */
   public void setIp70301PmaRusMqSrvActive(Field source) {
       replace(source,0,source.length(),beginIp70301PmaRusMqSrvActive,IP_70301_PMA_RUS_MQ_SRV_ACTIVE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70301PmaRusMqSrvActive 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70301PmaRusMqSrvActive(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70301PmaRusMqSrvActive,IP_70301_PMA_RUS_MQ_SRV_ACTIVE_LEN);
   	
   }
   
     /**
	 * 	Update Ip70301PmaRusMqSrvActive 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70301PmaRusMqSrvActive(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PmaRusMqSrvActive+targetIndex,targetLen);
    
   }
	char[] ip70301PmaRusMqActveY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp70301PmaRusMqActveY88()
	 *	@return  Returns true if isIp70301PmaRusMqActveY88() is "Y"
	 */
   public boolean isIp70301PmaRusMqActveY88() throws CFException {
      return (  compareChars( getIp70301PmaRusMqSrvActive() , ip70301PmaRusMqActveY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp70301PmaRusMqActveY88True() {  			
    	setIp70301PmaRusMqSrvActive( ip70301PmaRusMqActveY8888Value);
   	}
	char[] ip70301PmaRusMqActveN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp70301PmaRusMqActveN88()
	 *	@return  Returns true if isIp70301PmaRusMqActveN88() is "N"
	 */
   public boolean isIp70301PmaRusMqActveN88() throws CFException {
      return (  compareChars( getIp70301PmaRusMqSrvActive() , ip70301PmaRusMqActveN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp70301PmaRusMqActveN88True() {  			
    	setIp70301PmaRusMqSrvActive( ip70301PmaRusMqActveN8888Value);
   	}

	
	
	

		public static int getIp70301PmaRusMqSrvActiveGroupFieldLength() {
			return IP_70301_PMA_RUS_MQ_SRV_ACTIVE_GROUP_LENGTH;
		}

}
  
