package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70301IsCemresMqSrvActveGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip70301IsCemresMqSrvActveGroup")

public class Ip70301IsCemresMqSrvActveGroup extends Ip70301IsCemresMqSrvActveGroupSerialized  implements InitializingBean {
   

						private char[] ip70301IsCemresMqSrvActve = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip70301IsCemresMqSrvActveGroup
	**/
    public Ip70301IsCemresMqSrvActveGroup() {
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
	 *	Returns the value of ip70301IsCemresMqSrvActve
	 *	@return ip70301IsCemresMqSrvActve
	 */
   public char[] getIp70301IsCemresMqSrvActve() throws CFException{
     if (isIp70301IsCemresMqSrvActveModified()) { 
        ip70301IsCemresMqSrvActve = refreshIp70301IsCemresMqSrvActve();
     }
   		return ip70301IsCemresMqSrvActve;
   }

  
	/**
	*  set variable ip70301IsCemresMqSrvActve
	*  Corresponding COBOL Variable is IP70301-IS-CEMRES-MQ-SRV-ACTVE
	*  @param value
	**/
   public void setIp70301IsCemresMqSrvActve(char[] value) {
      ip70301IsCemresMqSrvActve = checkIp70301IsCemresMqSrvActveConstraints(value);
      serializeIp70301IsCemresMqSrvActve(ip70301IsCemresMqSrvActve);
   } 

     /**
	 * 	Update Ip70301IsCemresMqSrvActve 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70301IsCemresMqSrvActve(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70301IsCemresMqSrvActve,ip70301IsCemresMqSrvActve.length);
   	
   }
   
   public void setIp70301IsCemresMqSrvActve(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301IsCemresMqSrvActve,ip70301IsCemresMqSrvActve.length);
   	
   }
   
     /**
	 * 	Update Ip70301IsCemresMqSrvActve 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70301IsCemresMqSrvActve(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301IsCemresMqSrvActve+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70301IsCemresMqSrvActve with another Field
	 *	@param value
	 */
   public void setIp70301IsCemresMqSrvActve(Field source) {
       replace(source,0,source.length(),beginIp70301IsCemresMqSrvActve,IP_70301_IS_CEMRES_MQ_SRV_ACTVE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70301IsCemresMqSrvActve 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70301IsCemresMqSrvActve(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70301IsCemresMqSrvActve,IP_70301_IS_CEMRES_MQ_SRV_ACTVE_LEN);
   	
   }
   
     /**
	 * 	Update Ip70301IsCemresMqSrvActve 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70301IsCemresMqSrvActve(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301IsCemresMqSrvActve+targetIndex,targetLen);
    
   }
	char[] ip70301CemresMqActveY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp70301CemresMqActveY88()
	 *	@return  Returns true if isIp70301CemresMqActveY88() is "Y"
	 */
   public boolean isIp70301CemresMqActveY88() throws CFException {
      return (  compareChars( getIp70301IsCemresMqSrvActve() , ip70301CemresMqActveY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp70301CemresMqActveY88True() {  			
    	setIp70301IsCemresMqSrvActve( ip70301CemresMqActveY8888Value);
   	}
	char[] ip70301CemresMqActveN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp70301CemresMqActveN88()
	 *	@return  Returns true if isIp70301CemresMqActveN88() is "N"
	 */
   public boolean isIp70301CemresMqActveN88() throws CFException {
      return (  compareChars( getIp70301IsCemresMqSrvActve() , ip70301CemresMqActveN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp70301CemresMqActveN88True() {  			
    	setIp70301IsCemresMqSrvActve( ip70301CemresMqActveN8888Value);
   	}

	
	
	

		public static int getIp70301IsCemresMqSrvActveGroupFieldLength() {
			return IP_70301_IS_CEMRES_MQ_SRV_ACTVE_GROUP_LENGTH;
		}

}
  
