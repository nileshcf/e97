package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70301IsCemreqMqSrvActveGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:15. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip70301IsCemreqMqSrvActveGroup")

public class Ip70301IsCemreqMqSrvActveGroup extends Ip70301IsCemreqMqSrvActveGroupSerialized  implements InitializingBean {
   

						private char[] ip70301IsCemreqMqSrvActve = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip70301IsCemreqMqSrvActveGroup
	**/
    public Ip70301IsCemreqMqSrvActveGroup() {
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
	 *	Returns the value of ip70301IsCemreqMqSrvActve
	 *	@return ip70301IsCemreqMqSrvActve
	 */
   public char[] getIp70301IsCemreqMqSrvActve() throws CFException{
     if (isIp70301IsCemreqMqSrvActveModified()) { 
        ip70301IsCemreqMqSrvActve = refreshIp70301IsCemreqMqSrvActve();
     }
   		return ip70301IsCemreqMqSrvActve;
   }

  
	/**
	*  set variable ip70301IsCemreqMqSrvActve
	*  Corresponding COBOL Variable is IP70301-IS-CEMREQ-MQ-SRV-ACTVE
	*  @param value
	**/
   public void setIp70301IsCemreqMqSrvActve(char[] value) {
      ip70301IsCemreqMqSrvActve = checkIp70301IsCemreqMqSrvActveConstraints(value);
      serializeIp70301IsCemreqMqSrvActve(ip70301IsCemreqMqSrvActve);
   } 

     /**
	 * 	Update Ip70301IsCemreqMqSrvActve 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70301IsCemreqMqSrvActve(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70301IsCemreqMqSrvActve,ip70301IsCemreqMqSrvActve.length);
   	
   }
   
   public void setIp70301IsCemreqMqSrvActve(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301IsCemreqMqSrvActve,ip70301IsCemreqMqSrvActve.length);
   	
   }
   
     /**
	 * 	Update Ip70301IsCemreqMqSrvActve 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70301IsCemreqMqSrvActve(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301IsCemreqMqSrvActve+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70301IsCemreqMqSrvActve with another Field
	 *	@param value
	 */
   public void setIp70301IsCemreqMqSrvActve(Field source) {
       replace(source,0,source.length(),beginIp70301IsCemreqMqSrvActve,IP_70301_IS_CEMREQ_MQ_SRV_ACTVE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70301IsCemreqMqSrvActve 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70301IsCemreqMqSrvActve(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70301IsCemreqMqSrvActve,IP_70301_IS_CEMREQ_MQ_SRV_ACTVE_LEN);
   	
   }
   
     /**
	 * 	Update Ip70301IsCemreqMqSrvActve 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70301IsCemreqMqSrvActve(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301IsCemreqMqSrvActve+targetIndex,targetLen);
    
   }
	char[] ip70301CemreqMqActveY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp70301CemreqMqActveY88()
	 *	@return  Returns true if isIp70301CemreqMqActveY88() is "Y"
	 */
   public boolean isIp70301CemreqMqActveY88() throws CFException {
      return (  compareChars( getIp70301IsCemreqMqSrvActve() , ip70301CemreqMqActveY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp70301CemreqMqActveY88True() {  			
    	setIp70301IsCemreqMqSrvActve( ip70301CemreqMqActveY8888Value);
   	}
	char[] ip70301CemreqMqActveN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp70301CemreqMqActveN88()
	 *	@return  Returns true if isIp70301CemreqMqActveN88() is "N"
	 */
   public boolean isIp70301CemreqMqActveN88() throws CFException {
      return (  compareChars( getIp70301IsCemreqMqSrvActve() , ip70301CemreqMqActveN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp70301CemreqMqActveN88True() {  			
    	setIp70301IsCemreqMqSrvActve( ip70301CemreqMqActveN8888Value);
   	}

	
	
	

		public static int getIp70301IsCemreqMqSrvActveGroupFieldLength() {
			return IP_70301_IS_CEMREQ_MQ_SRV_ACTVE_GROUP_LENGTH;
		}

}
  
