package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70511Table is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip70511Table")

public class Ip70511Table extends Ip70511TableSerialized  implements InitializingBean {
   
				private Ip70511TableKey ip70511TableKey = new Ip70511TableKey();

						private char[] ip70511MqBypassSw = Field.fillLowValue(1);
				private Ip70511RequestDetails ip70511RequestDetails = new Ip70511RequestDetails();
				private Ip70511ResponseDetails ip70511ResponseDetails = new Ip70511ResponseDetails();
	
	/**
	* Constructor for Ip70511Table
	**/
    public Ip70511Table() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip70511TableKey.setParent(this,getStartOffset() + 0);
	       			ip70511RequestDetails.setParent(this,getStartOffset() + 33);
	       			ip70511ResponseDetails.setParent(this,getStartOffset() + 129);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip70511TableKey
	 *	@return ip70511TableKey
	 */   
	 public Ip70511TableKey getIp70511TableKey() {
   	return ip70511TableKey;
   }
   /**
	* 	Update Ip70511TableKey with the passed value
	*   Corresponding COBOL Variable is IP70511-TABLE-KEY
	*	@param value
	*/
   public void setIp70511TableKey(char[] value) {
      ip70511TableKey.setString(value); 
   }   
    
     /**
	 * 	Update Ip70511TableKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp70511TableKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip70511TableKey.begin,ip70511TableKey.length());
   }
   
     /**
	 * 	Update Ip70511TableKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70511TableKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip70511TableKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip70511TableKey with another Field
	 *	@param value
	 */
   public void setIp70511TableKey(Field source) {
   	replace(source,0,source.length(),ip70511TableKey.begin,ip70511TableKey.length());
   }  
   
     /**
	 * 	Update Ip70511TableKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp70511TableKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip70511TableKey.begin,ip70511TableKey.length());
   }
   
     /**
	 * 	Update Ip70511TableKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70511TableKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip70511TableKey.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip70511MqBypassSw
	 *	@return ip70511MqBypassSw
	 */
   public char[] getIp70511MqBypassSw() throws CFException{
     if (isIp70511MqBypassSwModified()) { 
        ip70511MqBypassSw = refreshIp70511MqBypassSw();
     }
   		return ip70511MqBypassSw;
   }

  
	/**
	*  set variable ip70511MqBypassSw
	*  Corresponding COBOL Variable is IP70511-MQ-BYPASS-SW
	*  @param value
	**/
   public void setIp70511MqBypassSw(char[] value) {
      ip70511MqBypassSw = checkIp70511MqBypassSwConstraints(value);
      serializeIp70511MqBypassSw(ip70511MqBypassSw);
   } 

     /**
	 * 	Update Ip70511MqBypassSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70511MqBypassSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70511MqBypassSw,ip70511MqBypassSw.length);
   	
   }
   
   public void setIp70511MqBypassSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70511MqBypassSw,ip70511MqBypassSw.length);
   	
   }
   
     /**
	 * 	Update Ip70511MqBypassSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70511MqBypassSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70511MqBypassSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70511MqBypassSw with another Field
	 *	@param value
	 */
   public void setIp70511MqBypassSw(Field source) {
       replace(source,0,source.length(),beginIp70511MqBypassSw,IP_70511_MQ_BYPASS_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70511MqBypassSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70511MqBypassSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70511MqBypassSw,IP_70511_MQ_BYPASS_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip70511MqBypassSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70511MqBypassSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70511MqBypassSw+targetIndex,targetLen);
    
   }
	char[] ip70511MqBypassY88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp70511MqBypassY()
	 *	@return  Returns true if isIp70511MqBypassY() is "Y"
	 */
   public boolean isIp70511MqBypassY() throws CFException {
      return (  compareChars( getIp70511MqBypassSw() , ip70511MqBypassY88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp70511MqBypassYTrue() {  			
    	setIp70511MqBypassSw( ip70511MqBypassY88Value);
   	}
	char[] ip70511MqBypassN88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp70511MqBypassN()
	 *	@return  Returns true if isIp70511MqBypassN() is "N"
	 */
   public boolean isIp70511MqBypassN() throws CFException {
      return (  compareChars( getIp70511MqBypassSw() , ip70511MqBypassN88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp70511MqBypassNTrue() {  			
    	setIp70511MqBypassSw( ip70511MqBypassN88Value);
   	}
	/**
	 *	Returns the value of ip70511RequestDetails
	 *	@return ip70511RequestDetails
	 */   
	 public Ip70511RequestDetails getIp70511RequestDetails() {
   	return ip70511RequestDetails;
   }
   /**
	* 	Update Ip70511RequestDetails with the passed value
	*   Corresponding COBOL Variable is IP70511-REQUEST-DETAILS
	*	@param value
	*/
   public void setIp70511RequestDetails(char[] value) {
      ip70511RequestDetails.setString(value); 
   }   
    
     /**
	 * 	Update Ip70511RequestDetails 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp70511RequestDetails(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip70511RequestDetails.begin,ip70511RequestDetails.length());
   }
   
     /**
	 * 	Update Ip70511RequestDetails 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70511RequestDetails(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip70511RequestDetails.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip70511RequestDetails with another Field
	 *	@param value
	 */
   public void setIp70511RequestDetails(Field source) {
   	replace(source,0,source.length(),ip70511RequestDetails.begin,ip70511RequestDetails.length());
   }  
   
     /**
	 * 	Update Ip70511RequestDetails 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp70511RequestDetails(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip70511RequestDetails.begin,ip70511RequestDetails.length());
   }
   
     /**
	 * 	Update Ip70511RequestDetails 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70511RequestDetails(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip70511RequestDetails.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip70511ResponseDetails
	 *	@return ip70511ResponseDetails
	 */   
	 public Ip70511ResponseDetails getIp70511ResponseDetails() {
   	return ip70511ResponseDetails;
   }
   /**
	* 	Update Ip70511ResponseDetails with the passed value
	*   Corresponding COBOL Variable is IP70511-RESPONSE-DETAILS
	*	@param value
	*/
   public void setIp70511ResponseDetails(char[] value) {
      ip70511ResponseDetails.setString(value); 
   }   
    
     /**
	 * 	Update Ip70511ResponseDetails 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp70511ResponseDetails(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip70511ResponseDetails.begin,ip70511ResponseDetails.length());
   }
   
     /**
	 * 	Update Ip70511ResponseDetails 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70511ResponseDetails(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip70511ResponseDetails.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip70511ResponseDetails with another Field
	 *	@param value
	 */
   public void setIp70511ResponseDetails(Field source) {
   	replace(source,0,source.length(),ip70511ResponseDetails.begin,ip70511ResponseDetails.length());
   }  
   
     /**
	 * 	Update Ip70511ResponseDetails 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp70511ResponseDetails(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip70511ResponseDetails.begin,ip70511ResponseDetails.length());
   }
   
     /**
	 * 	Update Ip70511ResponseDetails 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70511ResponseDetails(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip70511ResponseDetails.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip70511Table
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip70511TableKey.initialize();
     
         setIp70511MqBypassSw(CONSTANTS.SPACE);
          ip70511RequestDetails.initialize();
     
          ip70511ResponseDetails.initialize();
     
   }

		public static int getIp70511TableFieldLength() {
			return IP_70511_TABLE_LENGTH;
		}

}
  
