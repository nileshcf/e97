package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70301IsMqReqSentSwGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip70301IsMqReqSentSwGroup")

public class Ip70301IsMqReqSentSwGroup extends Ip70301IsMqReqSentSwGroupSerialized  implements InitializingBean {
   

						private char[] ip70301IsMqReqSentSw = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip70301IsMqReqSentSwGroup
	**/
    public Ip70301IsMqReqSentSwGroup() {
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
	 *	Returns the value of ip70301IsMqReqSentSw
	 *	@return ip70301IsMqReqSentSw
	 */
   public char[] getIp70301IsMqReqSentSw() throws CFException{
     if (isIp70301IsMqReqSentSwModified()) { 
        ip70301IsMqReqSentSw = refreshIp70301IsMqReqSentSw();
     }
   		return ip70301IsMqReqSentSw;
   }

  
	/**
	*  set variable ip70301IsMqReqSentSw
	*  Corresponding COBOL Variable is IP70301-IS-MQ-REQ-SENT-SW
	*  @param value
	**/
   public void setIp70301IsMqReqSentSw(char[] value) {
      ip70301IsMqReqSentSw = checkIp70301IsMqReqSentSwConstraints(value);
      serializeIp70301IsMqReqSentSw(ip70301IsMqReqSentSw);
   } 

     /**
	 * 	Update Ip70301IsMqReqSentSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70301IsMqReqSentSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70301IsMqReqSentSw,ip70301IsMqReqSentSw.length);
   	
   }
   
   public void setIp70301IsMqReqSentSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301IsMqReqSentSw,ip70301IsMqReqSentSw.length);
   	
   }
   
     /**
	 * 	Update Ip70301IsMqReqSentSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70301IsMqReqSentSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301IsMqReqSentSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70301IsMqReqSentSw with another Field
	 *	@param value
	 */
   public void setIp70301IsMqReqSentSw(Field source) {
       replace(source,0,source.length(),beginIp70301IsMqReqSentSw,IP_70301_IS_MQ_REQ_SENT_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70301IsMqReqSentSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70301IsMqReqSentSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70301IsMqReqSentSw,IP_70301_IS_MQ_REQ_SENT_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip70301IsMqReqSentSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70301IsMqReqSentSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301IsMqReqSentSw+targetIndex,targetLen);
    
   }
	char[] ip70301MqReqSentY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp70301MqReqSentY88()
	 *	@return  Returns true if isIp70301MqReqSentY88() is "Y"
	 */
   public boolean isIp70301MqReqSentY88() throws CFException {
      return (  compareChars( getIp70301IsMqReqSentSw() , ip70301MqReqSentY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp70301MqReqSentY88True() {  			
    	setIp70301IsMqReqSentSw( ip70301MqReqSentY8888Value);
   	}
	char[] ip70301MqReqSentN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp70301MqReqSentN88()
	 *	@return  Returns true if isIp70301MqReqSentN88() is "N"
	 */
   public boolean isIp70301MqReqSentN88() throws CFException {
      return (  compareChars( getIp70301IsMqReqSentSw() , ip70301MqReqSentN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp70301MqReqSentN88True() {  			
    	setIp70301IsMqReqSentSw( ip70301MqReqSentN8888Value);
   	}

	
	
	

		public static int getIp70301IsMqReqSentSwGroupFieldLength() {
			return IP_70301_IS_MQ_REQ_SENT_SW_GROUP_LENGTH;
		}

}
  
