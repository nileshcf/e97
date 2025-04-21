package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip7051pm2Table is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip7051pm2Table")

public class Ip7051pm2Table extends Ip7051pm2TableSerialized  implements InitializingBean {
   
				private Ip7051pm2TableKey ip7051pm2TableKey = new Ip7051pm2TableKey();

						private char[] ip7051pm2MqBypassSw = Field.fillLowValue(1);
				private Ip7051pm2RequestDetails ip7051pm2RequestDetails = new Ip7051pm2RequestDetails();
				private Ip7051pm2ResponseDetails ip7051pm2ResponseDetails = new Ip7051pm2ResponseDetails();
	
	/**
	* Constructor for Ip7051pm2Table
	**/
    public Ip7051pm2Table() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip7051pm2TableKey.setParent(this,getStartOffset() + 0);
	       			ip7051pm2RequestDetails.setParent(this,getStartOffset() + 33);
	       			ip7051pm2ResponseDetails.setParent(this,getStartOffset() + 129);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip7051pm2TableKey
	 *	@return ip7051pm2TableKey
	 */   
	 public Ip7051pm2TableKey getIp7051pm2TableKey() {
   	return ip7051pm2TableKey;
   }
   /**
	* 	Update Ip7051pm2TableKey with the passed value
	*   Corresponding COBOL Variable is IP7051PM2-TABLE-KEY
	*	@param value
	*/
   public void setIp7051pm2TableKey(char[] value) {
      ip7051pm2TableKey.setString(value); 
   }   
    
     /**
	 * 	Update Ip7051pm2TableKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp7051pm2TableKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip7051pm2TableKey.begin,ip7051pm2TableKey.length());
   }
   
     /**
	 * 	Update Ip7051pm2TableKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pm2TableKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip7051pm2TableKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip7051pm2TableKey with another Field
	 *	@param value
	 */
   public void setIp7051pm2TableKey(Field source) {
   	replace(source,0,source.length(),ip7051pm2TableKey.begin,ip7051pm2TableKey.length());
   }  
   
     /**
	 * 	Update Ip7051pm2TableKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp7051pm2TableKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip7051pm2TableKey.begin,ip7051pm2TableKey.length());
   }
   
     /**
	 * 	Update Ip7051pm2TableKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pm2TableKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip7051pm2TableKey.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip7051pm2MqBypassSw
	 *	@return ip7051pm2MqBypassSw
	 */
   public char[] getIp7051pm2MqBypassSw() throws CFException{
     if (isIp7051pm2MqBypassSwModified()) { 
        ip7051pm2MqBypassSw = refreshIp7051pm2MqBypassSw();
     }
   		return ip7051pm2MqBypassSw;
   }

  
	/**
	*  set variable ip7051pm2MqBypassSw
	*  Corresponding COBOL Variable is IP7051PM2-MQ-BYPASS-SW
	*  @param value
	**/
   public void setIp7051pm2MqBypassSw(char[] value) {
      ip7051pm2MqBypassSw = checkIp7051pm2MqBypassSwConstraints(value);
      serializeIp7051pm2MqBypassSw(ip7051pm2MqBypassSw);
   } 

     /**
	 * 	Update Ip7051pm2MqBypassSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7051pm2MqBypassSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7051pm2MqBypassSw,ip7051pm2MqBypassSw.length);
   	
   }
   
   public void setIp7051pm2MqBypassSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pm2MqBypassSw,ip7051pm2MqBypassSw.length);
   	
   }
   
     /**
	 * 	Update Ip7051pm2MqBypassSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pm2MqBypassSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pm2MqBypassSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7051pm2MqBypassSw with another Field
	 *	@param value
	 */
   public void setIp7051pm2MqBypassSw(Field source) {
       replace(source,0,source.length(),beginIp7051pm2MqBypassSw,IP_7051PM_2_MQ_BYPASS_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7051pm2MqBypassSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7051pm2MqBypassSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7051pm2MqBypassSw,IP_7051PM_2_MQ_BYPASS_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip7051pm2MqBypassSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pm2MqBypassSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pm2MqBypassSw+targetIndex,targetLen);
    
   }
	char[] ip7051pm2MqBypassY88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp7051pm2MqBypassY()
	 *	@return  Returns true if isIp7051pm2MqBypassY() is "Y"
	 */
   public boolean isIp7051pm2MqBypassY() throws CFException {
      return (  compareChars( getIp7051pm2MqBypassSw() , ip7051pm2MqBypassY88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp7051pm2MqBypassYTrue() {  			
    	setIp7051pm2MqBypassSw( ip7051pm2MqBypassY88Value);
   	}
	char[] ip7051pm2MqBypassN88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp7051pm2MqBypassN()
	 *	@return  Returns true if isIp7051pm2MqBypassN() is "N"
	 */
   public boolean isIp7051pm2MqBypassN() throws CFException {
      return (  compareChars( getIp7051pm2MqBypassSw() , ip7051pm2MqBypassN88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp7051pm2MqBypassNTrue() {  			
    	setIp7051pm2MqBypassSw( ip7051pm2MqBypassN88Value);
   	}
	/**
	 *	Returns the value of ip7051pm2RequestDetails
	 *	@return ip7051pm2RequestDetails
	 */   
	 public Ip7051pm2RequestDetails getIp7051pm2RequestDetails() {
   	return ip7051pm2RequestDetails;
   }
   /**
	* 	Update Ip7051pm2RequestDetails with the passed value
	*   Corresponding COBOL Variable is IP7051PM2-REQUEST-DETAILS
	*	@param value
	*/
   public void setIp7051pm2RequestDetails(char[] value) {
      ip7051pm2RequestDetails.setString(value); 
   }   
    
     /**
	 * 	Update Ip7051pm2RequestDetails 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp7051pm2RequestDetails(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip7051pm2RequestDetails.begin,ip7051pm2RequestDetails.length());
   }
   
     /**
	 * 	Update Ip7051pm2RequestDetails 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pm2RequestDetails(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip7051pm2RequestDetails.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip7051pm2RequestDetails with another Field
	 *	@param value
	 */
   public void setIp7051pm2RequestDetails(Field source) {
   	replace(source,0,source.length(),ip7051pm2RequestDetails.begin,ip7051pm2RequestDetails.length());
   }  
   
     /**
	 * 	Update Ip7051pm2RequestDetails 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp7051pm2RequestDetails(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip7051pm2RequestDetails.begin,ip7051pm2RequestDetails.length());
   }
   
     /**
	 * 	Update Ip7051pm2RequestDetails 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pm2RequestDetails(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip7051pm2RequestDetails.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip7051pm2ResponseDetails
	 *	@return ip7051pm2ResponseDetails
	 */   
	 public Ip7051pm2ResponseDetails getIp7051pm2ResponseDetails() {
   	return ip7051pm2ResponseDetails;
   }
   /**
	* 	Update Ip7051pm2ResponseDetails with the passed value
	*   Corresponding COBOL Variable is IP7051PM2-RESPONSE-DETAILS
	*	@param value
	*/
   public void setIp7051pm2ResponseDetails(char[] value) {
      ip7051pm2ResponseDetails.setString(value); 
   }   
    
     /**
	 * 	Update Ip7051pm2ResponseDetails 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp7051pm2ResponseDetails(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip7051pm2ResponseDetails.begin,ip7051pm2ResponseDetails.length());
   }
   
     /**
	 * 	Update Ip7051pm2ResponseDetails 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pm2ResponseDetails(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip7051pm2ResponseDetails.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip7051pm2ResponseDetails with another Field
	 *	@param value
	 */
   public void setIp7051pm2ResponseDetails(Field source) {
   	replace(source,0,source.length(),ip7051pm2ResponseDetails.begin,ip7051pm2ResponseDetails.length());
   }  
   
     /**
	 * 	Update Ip7051pm2ResponseDetails 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp7051pm2ResponseDetails(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip7051pm2ResponseDetails.begin,ip7051pm2ResponseDetails.length());
   }
   
     /**
	 * 	Update Ip7051pm2ResponseDetails 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pm2ResponseDetails(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip7051pm2ResponseDetails.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip7051pm2Table
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip7051pm2TableKey.initialize();
     
         setIp7051pm2MqBypassSw(CONSTANTS.SPACE);
          ip7051pm2RequestDetails.initialize();
     
          ip7051pm2ResponseDetails.initialize();
     
   }

		public static int getIp7051pm2TableFieldLength() {
			return IP_7051PM_2_TABLE_LENGTH;
		}

}
  
