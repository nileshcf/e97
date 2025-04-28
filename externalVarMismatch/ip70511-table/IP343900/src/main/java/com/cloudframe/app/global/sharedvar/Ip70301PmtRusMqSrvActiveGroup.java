package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70301PmtRusMqSrvActiveGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:02. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip70301PmtRusMqSrvActiveGroup")

public class Ip70301PmtRusMqSrvActiveGroup extends Ip70301PmtRusMqSrvActiveGroupSerialized  implements InitializingBean {
   

						private char[] ip70301PmtRusMqSrvActive = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip70301PmtRusMqSrvActiveGroup
	**/
    public Ip70301PmtRusMqSrvActiveGroup() {
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
	 *	Returns the value of ip70301PmtRusMqSrvActive
	 *	@return ip70301PmtRusMqSrvActive
	 */
   public char[] getIp70301PmtRusMqSrvActive() throws CFException{
     if (isIp70301PmtRusMqSrvActiveModified()) { 
        ip70301PmtRusMqSrvActive = refreshIp70301PmtRusMqSrvActive();
     }
   		return ip70301PmtRusMqSrvActive;
   }

  
	/**
	*  set variable ip70301PmtRusMqSrvActive
	*  Corresponding COBOL Variable is IP70301-PMT-RUS-MQ-SRV-ACTIVE
	*  @param value
	**/
   public void setIp70301PmtRusMqSrvActive(char[] value) {
      ip70301PmtRusMqSrvActive = checkIp70301PmtRusMqSrvActiveConstraints(value);
      serializeIp70301PmtRusMqSrvActive(ip70301PmtRusMqSrvActive);
   } 

     /**
	 * 	Update Ip70301PmtRusMqSrvActive 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70301PmtRusMqSrvActive(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70301PmtRusMqSrvActive,ip70301PmtRusMqSrvActive.length);
   	
   }
   
   public void setIp70301PmtRusMqSrvActive(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PmtRusMqSrvActive,ip70301PmtRusMqSrvActive.length);
   	
   }
   
     /**
	 * 	Update Ip70301PmtRusMqSrvActive 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70301PmtRusMqSrvActive(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PmtRusMqSrvActive+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70301PmtRusMqSrvActive with another Field
	 *	@param value
	 */
   public void setIp70301PmtRusMqSrvActive(Field source) {
       replace(source,0,source.length(),beginIp70301PmtRusMqSrvActive,IP_70301_PMT_RUS_MQ_SRV_ACTIVE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70301PmtRusMqSrvActive 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70301PmtRusMqSrvActive(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70301PmtRusMqSrvActive,IP_70301_PMT_RUS_MQ_SRV_ACTIVE_LEN);
   	
   }
   
     /**
	 * 	Update Ip70301PmtRusMqSrvActive 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70301PmtRusMqSrvActive(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PmtRusMqSrvActive+targetIndex,targetLen);
    
   }
	char[] ip70301PmtRusMqActveY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp70301PmtRusMqActveY88()
	 *	@return  Returns true if isIp70301PmtRusMqActveY88() is "Y"
	 */
   public boolean isIp70301PmtRusMqActveY88() throws CFException {
      return (  compareChars( getIp70301PmtRusMqSrvActive() , ip70301PmtRusMqActveY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp70301PmtRusMqActveY88True() {  			
    	setIp70301PmtRusMqSrvActive( ip70301PmtRusMqActveY8888Value);
   	}
	char[] ip70301PmtRusMqActveN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp70301PmtRusMqActveN88()
	 *	@return  Returns true if isIp70301PmtRusMqActveN88() is "N"
	 */
   public boolean isIp70301PmtRusMqActveN88() throws CFException {
      return (  compareChars( getIp70301PmtRusMqSrvActive() , ip70301PmtRusMqActveN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp70301PmtRusMqActveN88True() {  			
    	setIp70301PmtRusMqSrvActive( ip70301PmtRusMqActveN8888Value);
   	}

	
	
	

		public static int getIp70301PmtRusMqSrvActiveGroupFieldLength() {
			return IP_70301_PMT_RUS_MQ_SRV_ACTIVE_GROUP_LENGTH;
		}

}
  
