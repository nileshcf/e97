package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70301IsItCallFromWlmGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip70301IsItCallFromWlmGroup")

public class Ip70301IsItCallFromWlmGroup extends Ip70301IsItCallFromWlmGroupSerialized  implements InitializingBean {
   

						private char[] ip70301IsItCallFromWlm = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip70301IsItCallFromWlmGroup
	**/
    public Ip70301IsItCallFromWlmGroup() {
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
	 *	Returns the value of ip70301IsItCallFromWlm
	 *	@return ip70301IsItCallFromWlm
	 */
   public char[] getIp70301IsItCallFromWlm() throws CFException{
     if (isIp70301IsItCallFromWlmModified()) { 
        ip70301IsItCallFromWlm = refreshIp70301IsItCallFromWlm();
     }
   		return ip70301IsItCallFromWlm;
   }

  
	/**
	*  set variable ip70301IsItCallFromWlm
	*  Corresponding COBOL Variable is IP70301-IS-IT-CALL-FROM-WLM
	*  @param value
	**/
   public void setIp70301IsItCallFromWlm(char[] value) {
      ip70301IsItCallFromWlm = checkIp70301IsItCallFromWlmConstraints(value);
      serializeIp70301IsItCallFromWlm(ip70301IsItCallFromWlm);
   } 

     /**
	 * 	Update Ip70301IsItCallFromWlm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70301IsItCallFromWlm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70301IsItCallFromWlm,ip70301IsItCallFromWlm.length);
   	
   }
   
   public void setIp70301IsItCallFromWlm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301IsItCallFromWlm,ip70301IsItCallFromWlm.length);
   	
   }
   
     /**
	 * 	Update Ip70301IsItCallFromWlm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70301IsItCallFromWlm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301IsItCallFromWlm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70301IsItCallFromWlm with another Field
	 *	@param value
	 */
   public void setIp70301IsItCallFromWlm(Field source) {
       replace(source,0,source.length(),beginIp70301IsItCallFromWlm,IP_70301_IS_IT_CALL_FROM_WLM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70301IsItCallFromWlm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70301IsItCallFromWlm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70301IsItCallFromWlm,IP_70301_IS_IT_CALL_FROM_WLM_LEN);
   	
   }
   
     /**
	 * 	Update Ip70301IsItCallFromWlm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70301IsItCallFromWlm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301IsItCallFromWlm+targetIndex,targetLen);
    
   }
	char[] ip70301ItIsFromWlm8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp70301ItIsFromWlm88()
	 *	@return  Returns true if isIp70301ItIsFromWlm88() is "Y"
	 */
   public boolean isIp70301ItIsFromWlm88() throws CFException {
      return (  compareChars( getIp70301IsItCallFromWlm() , ip70301ItIsFromWlm8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp70301ItIsFromWlm88True() {  			
    	setIp70301IsItCallFromWlm( ip70301ItIsFromWlm8888Value);
   	}
	char[] ip70301ItIsNotFromWlm8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp70301ItIsNotFromWlm88()
	 *	@return  Returns true if isIp70301ItIsNotFromWlm88() is "N"
	 */
   public boolean isIp70301ItIsNotFromWlm88() throws CFException {
      return (  compareChars( getIp70301IsItCallFromWlm() , ip70301ItIsNotFromWlm8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp70301ItIsNotFromWlm88True() {  			
    	setIp70301IsItCallFromWlm( ip70301ItIsNotFromWlm8888Value);
   	}

	
	
	

		public static int getIp70301IsItCallFromWlmGroupFieldLength() {
			return IP_70301_IS_IT_CALL_FROM_WLM_GROUP_LENGTH;
		}

}
  
