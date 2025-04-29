package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70301PmtIndMqSrvActiveGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:26. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip70301PmtIndMqSrvActiveGroup")

public class Ip70301PmtIndMqSrvActiveGroup extends Ip70301PmtIndMqSrvActiveGroupSerialized  implements InitializingBean {
   

						private char[] ip70301PmtIndMqSrvActive = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip70301PmtIndMqSrvActiveGroup
	**/
    public Ip70301PmtIndMqSrvActiveGroup() {
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
	 *	Returns the value of ip70301PmtIndMqSrvActive
	 *	@return ip70301PmtIndMqSrvActive
	 */
   public char[] getIp70301PmtIndMqSrvActive() throws CFException{
     if (isIp70301PmtIndMqSrvActiveModified()) { 
        ip70301PmtIndMqSrvActive = refreshIp70301PmtIndMqSrvActive();
     }
   		return ip70301PmtIndMqSrvActive;
   }

  
	/**
	*  set variable ip70301PmtIndMqSrvActive
	*  Corresponding COBOL Variable is IP70301-PMT-IND-MQ-SRV-ACTIVE
	*  @param value
	**/
   public void setIp70301PmtIndMqSrvActive(char[] value) {
      ip70301PmtIndMqSrvActive = checkIp70301PmtIndMqSrvActiveConstraints(value);
      serializeIp70301PmtIndMqSrvActive(ip70301PmtIndMqSrvActive);
   } 

     /**
	 * 	Update Ip70301PmtIndMqSrvActive 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70301PmtIndMqSrvActive(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70301PmtIndMqSrvActive,ip70301PmtIndMqSrvActive.length);
   	
   }
   
   public void setIp70301PmtIndMqSrvActive(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PmtIndMqSrvActive,ip70301PmtIndMqSrvActive.length);
   	
   }
   
     /**
	 * 	Update Ip70301PmtIndMqSrvActive 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70301PmtIndMqSrvActive(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PmtIndMqSrvActive+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70301PmtIndMqSrvActive with another Field
	 *	@param value
	 */
   public void setIp70301PmtIndMqSrvActive(Field source) {
       replace(source,0,source.length(),beginIp70301PmtIndMqSrvActive,IP_70301_PMT_IND_MQ_SRV_ACTIVE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70301PmtIndMqSrvActive 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70301PmtIndMqSrvActive(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70301PmtIndMqSrvActive,IP_70301_PMT_IND_MQ_SRV_ACTIVE_LEN);
   	
   }
   
     /**
	 * 	Update Ip70301PmtIndMqSrvActive 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70301PmtIndMqSrvActive(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PmtIndMqSrvActive+targetIndex,targetLen);
    
   }
	char[] ip70301PmtIndMqActveY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp70301PmtIndMqActveY88()
	 *	@return  Returns true if isIp70301PmtIndMqActveY88() is "Y"
	 */
   public boolean isIp70301PmtIndMqActveY88() throws CFException {
      return (  compareChars( getIp70301PmtIndMqSrvActive() , ip70301PmtIndMqActveY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp70301PmtIndMqActveY88True() {  			
    	setIp70301PmtIndMqSrvActive( ip70301PmtIndMqActveY8888Value);
   	}
	char[] ip70301PmtIndMqActveN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp70301PmtIndMqActveN88()
	 *	@return  Returns true if isIp70301PmtIndMqActveN88() is "N"
	 */
   public boolean isIp70301PmtIndMqActveN88() throws CFException {
      return (  compareChars( getIp70301PmtIndMqSrvActive() , ip70301PmtIndMqActveN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp70301PmtIndMqActveN88True() {  			
    	setIp70301PmtIndMqSrvActive( ip70301PmtIndMqActveN8888Value);
   	}

	
	
	

		public static int getIp70301PmtIndMqSrvActiveGroupFieldLength() {
			return IP_70301_PMT_IND_MQ_SRV_ACTIVE_GROUP_LENGTH;
		}

}
  
