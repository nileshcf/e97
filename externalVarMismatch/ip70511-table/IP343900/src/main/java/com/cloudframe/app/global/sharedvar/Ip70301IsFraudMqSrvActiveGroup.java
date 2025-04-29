package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70301IsFraudMqSrvActiveGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip70301IsFraudMqSrvActiveGroup")

public class Ip70301IsFraudMqSrvActiveGroup extends Ip70301IsFraudMqSrvActiveGroupSerialized  implements InitializingBean {
   

						private char[] ip70301IsFraudMqSrvActive = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip70301IsFraudMqSrvActiveGroup
	**/
    public Ip70301IsFraudMqSrvActiveGroup() {
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
	 *	Returns the value of ip70301IsFraudMqSrvActive
	 *	@return ip70301IsFraudMqSrvActive
	 */
   public char[] getIp70301IsFraudMqSrvActive() throws CFException{
     if (isIp70301IsFraudMqSrvActiveModified()) { 
        ip70301IsFraudMqSrvActive = refreshIp70301IsFraudMqSrvActive();
     }
   		return ip70301IsFraudMqSrvActive;
   }

  
	/**
	*  set variable ip70301IsFraudMqSrvActive
	*  Corresponding COBOL Variable is IP70301-IS-FRAUD-MQ-SRV-ACTIVE
	*  @param value
	**/
   public void setIp70301IsFraudMqSrvActive(char[] value) {
      ip70301IsFraudMqSrvActive = checkIp70301IsFraudMqSrvActiveConstraints(value);
      serializeIp70301IsFraudMqSrvActive(ip70301IsFraudMqSrvActive);
   } 

     /**
	 * 	Update Ip70301IsFraudMqSrvActive 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70301IsFraudMqSrvActive(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70301IsFraudMqSrvActive,ip70301IsFraudMqSrvActive.length);
   	
   }
   
   public void setIp70301IsFraudMqSrvActive(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301IsFraudMqSrvActive,ip70301IsFraudMqSrvActive.length);
   	
   }
   
     /**
	 * 	Update Ip70301IsFraudMqSrvActive 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70301IsFraudMqSrvActive(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301IsFraudMqSrvActive+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70301IsFraudMqSrvActive with another Field
	 *	@param value
	 */
   public void setIp70301IsFraudMqSrvActive(Field source) {
       replace(source,0,source.length(),beginIp70301IsFraudMqSrvActive,IP_70301_IS_FRAUD_MQ_SRV_ACTIVE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70301IsFraudMqSrvActive 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70301IsFraudMqSrvActive(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70301IsFraudMqSrvActive,IP_70301_IS_FRAUD_MQ_SRV_ACTIVE_LEN);
   	
   }
   
     /**
	 * 	Update Ip70301IsFraudMqSrvActive 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70301IsFraudMqSrvActive(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301IsFraudMqSrvActive+targetIndex,targetLen);
    
   }
	char[] ip70301FraudMqActiveY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp70301FraudMqActiveY88()
	 *	@return  Returns true if isIp70301FraudMqActiveY88() is "Y"
	 */
   public boolean isIp70301FraudMqActiveY88() throws CFException {
      return (  compareChars( getIp70301IsFraudMqSrvActive() , ip70301FraudMqActiveY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp70301FraudMqActiveY88True() {  			
    	setIp70301IsFraudMqSrvActive( ip70301FraudMqActiveY8888Value);
   	}
	char[] ip70301FraudMqActiveN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp70301FraudMqActiveN88()
	 *	@return  Returns true if isIp70301FraudMqActiveN88() is "N"
	 */
   public boolean isIp70301FraudMqActiveN88() throws CFException {
      return (  compareChars( getIp70301IsFraudMqSrvActive() , ip70301FraudMqActiveN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp70301FraudMqActiveN88True() {  			
    	setIp70301IsFraudMqSrvActive( ip70301FraudMqActiveN8888Value);
   	}

	
	
	

		public static int getIp70301IsFraudMqSrvActiveGroupFieldLength() {
			return IP_70301_IS_FRAUD_MQ_SRV_ACTIVE_GROUP_LENGTH;
		}

}
  
