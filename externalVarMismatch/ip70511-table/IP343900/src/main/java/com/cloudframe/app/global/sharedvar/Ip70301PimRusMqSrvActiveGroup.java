package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70301PimRusMqSrvActiveGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip70301PimRusMqSrvActiveGroup")

public class Ip70301PimRusMqSrvActiveGroup extends Ip70301PimRusMqSrvActiveGroupSerialized  implements InitializingBean {
   

						private char[] ip70301PimRusMqSrvActive = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip70301PimRusMqSrvActiveGroup
	**/
    public Ip70301PimRusMqSrvActiveGroup() {
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
	 *	Returns the value of ip70301PimRusMqSrvActive
	 *	@return ip70301PimRusMqSrvActive
	 */
   public char[] getIp70301PimRusMqSrvActive() throws CFException{
     if (isIp70301PimRusMqSrvActiveModified()) { 
        ip70301PimRusMqSrvActive = refreshIp70301PimRusMqSrvActive();
     }
   		return ip70301PimRusMqSrvActive;
   }

  
	/**
	*  set variable ip70301PimRusMqSrvActive
	*  Corresponding COBOL Variable is IP70301-PIM-RUS-MQ-SRV-ACTIVE
	*  @param value
	**/
   public void setIp70301PimRusMqSrvActive(char[] value) {
      ip70301PimRusMqSrvActive = checkIp70301PimRusMqSrvActiveConstraints(value);
      serializeIp70301PimRusMqSrvActive(ip70301PimRusMqSrvActive);
   } 

     /**
	 * 	Update Ip70301PimRusMqSrvActive 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70301PimRusMqSrvActive(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70301PimRusMqSrvActive,ip70301PimRusMqSrvActive.length);
   	
   }
   
   public void setIp70301PimRusMqSrvActive(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PimRusMqSrvActive,ip70301PimRusMqSrvActive.length);
   	
   }
   
     /**
	 * 	Update Ip70301PimRusMqSrvActive 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70301PimRusMqSrvActive(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PimRusMqSrvActive+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70301PimRusMqSrvActive with another Field
	 *	@param value
	 */
   public void setIp70301PimRusMqSrvActive(Field source) {
       replace(source,0,source.length(),beginIp70301PimRusMqSrvActive,IP_70301_PIM_RUS_MQ_SRV_ACTIVE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70301PimRusMqSrvActive 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70301PimRusMqSrvActive(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70301PimRusMqSrvActive,IP_70301_PIM_RUS_MQ_SRV_ACTIVE_LEN);
   	
   }
   
     /**
	 * 	Update Ip70301PimRusMqSrvActive 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70301PimRusMqSrvActive(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PimRusMqSrvActive+targetIndex,targetLen);
    
   }
	char[] ip70301PimRusMqActveY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp70301PimRusMqActveY88()
	 *	@return  Returns true if isIp70301PimRusMqActveY88() is "Y"
	 */
   public boolean isIp70301PimRusMqActveY88() throws CFException {
      return (  compareChars( getIp70301PimRusMqSrvActive() , ip70301PimRusMqActveY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp70301PimRusMqActveY88True() {  			
    	setIp70301PimRusMqSrvActive( ip70301PimRusMqActveY8888Value);
   	}
	char[] ip70301PimRusMqActveN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp70301PimRusMqActveN88()
	 *	@return  Returns true if isIp70301PimRusMqActveN88() is "N"
	 */
   public boolean isIp70301PimRusMqActveN88() throws CFException {
      return (  compareChars( getIp70301PimRusMqSrvActive() , ip70301PimRusMqActveN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp70301PimRusMqActveN88True() {  			
    	setIp70301PimRusMqSrvActive( ip70301PimRusMqActveN8888Value);
   	}

	
	
	

		public static int getIp70301PimRusMqSrvActiveGroupFieldLength() {
			return IP_70301_PIM_RUS_MQ_SRV_ACTIVE_GROUP_LENGTH;
		}

}
  
