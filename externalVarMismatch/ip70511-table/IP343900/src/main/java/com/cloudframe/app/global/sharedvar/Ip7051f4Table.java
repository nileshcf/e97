package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip7051f4Table is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:26. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip7051f4Table")

public class Ip7051f4Table extends Ip7051f4TableSerialized  implements InitializingBean {
   
				private Ip7051f4TableKey ip7051f4TableKey = new Ip7051f4TableKey();

						private char[] ip7051f4MqBypassSw = Field.fillLowValue(1);
				private Ip7051f4RequestDetails ip7051f4RequestDetails = new Ip7051f4RequestDetails();
				private Ip7051f4ResponseDetails ip7051f4ResponseDetails = new Ip7051f4ResponseDetails();
	
	/**
	* Constructor for Ip7051f4Table
	**/
    public Ip7051f4Table() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip7051f4TableKey.setParent(this,getStartOffset() + 0);
	       			ip7051f4RequestDetails.setParent(this,getStartOffset() + 33);
	       			ip7051f4ResponseDetails.setParent(this,getStartOffset() + 129);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip7051f4TableKey
	 *	@return ip7051f4TableKey
	 */   
	 public Ip7051f4TableKey getIp7051f4TableKey() {
   	return ip7051f4TableKey;
   }
   /**
	* 	Update Ip7051f4TableKey with the passed value
	*   Corresponding COBOL Variable is IP7051F4-TABLE-KEY
	*	@param value
	*/
   public void setIp7051f4TableKey(char[] value) {
      ip7051f4TableKey.setString(value); 
   }   
    
     /**
	 * 	Update Ip7051f4TableKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp7051f4TableKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip7051f4TableKey.begin,ip7051f4TableKey.length());
   }
   
     /**
	 * 	Update Ip7051f4TableKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051f4TableKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip7051f4TableKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip7051f4TableKey with another Field
	 *	@param value
	 */
   public void setIp7051f4TableKey(Field source) {
   	replace(source,0,source.length(),ip7051f4TableKey.begin,ip7051f4TableKey.length());
   }  
   
     /**
	 * 	Update Ip7051f4TableKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp7051f4TableKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip7051f4TableKey.begin,ip7051f4TableKey.length());
   }
   
     /**
	 * 	Update Ip7051f4TableKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051f4TableKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip7051f4TableKey.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip7051f4MqBypassSw
	 *	@return ip7051f4MqBypassSw
	 */
   public char[] getIp7051f4MqBypassSw() throws CFException{
     if (isIp7051f4MqBypassSwModified()) { 
        ip7051f4MqBypassSw = refreshIp7051f4MqBypassSw();
     }
   		return ip7051f4MqBypassSw;
   }

  
	/**
	*  set variable ip7051f4MqBypassSw
	*  Corresponding COBOL Variable is IP7051F4-MQ-BYPASS-SW
	*  @param value
	**/
   public void setIp7051f4MqBypassSw(char[] value) {
      ip7051f4MqBypassSw = checkIp7051f4MqBypassSwConstraints(value);
      serializeIp7051f4MqBypassSw(ip7051f4MqBypassSw);
   } 

     /**
	 * 	Update Ip7051f4MqBypassSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7051f4MqBypassSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7051f4MqBypassSw,ip7051f4MqBypassSw.length);
   	
   }
   
   public void setIp7051f4MqBypassSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051f4MqBypassSw,ip7051f4MqBypassSw.length);
   	
   }
   
     /**
	 * 	Update Ip7051f4MqBypassSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051f4MqBypassSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051f4MqBypassSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7051f4MqBypassSw with another Field
	 *	@param value
	 */
   public void setIp7051f4MqBypassSw(Field source) {
       replace(source,0,source.length(),beginIp7051f4MqBypassSw,IP_7051F_4_MQ_BYPASS_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7051f4MqBypassSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7051f4MqBypassSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7051f4MqBypassSw,IP_7051F_4_MQ_BYPASS_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip7051f4MqBypassSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051f4MqBypassSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051f4MqBypassSw+targetIndex,targetLen);
    
   }
	char[] ip7051f4MqBypassY88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp7051f4MqBypassY()
	 *	@return  Returns true if isIp7051f4MqBypassY() is "Y"
	 */
   public boolean isIp7051f4MqBypassY() throws CFException {
      return (  compareChars( getIp7051f4MqBypassSw() , ip7051f4MqBypassY88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp7051f4MqBypassYTrue() {  			
    	setIp7051f4MqBypassSw( ip7051f4MqBypassY88Value);
   	}
	char[] ip7051f4MqBypassN88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp7051f4MqBypassN()
	 *	@return  Returns true if isIp7051f4MqBypassN() is "N"
	 */
   public boolean isIp7051f4MqBypassN() throws CFException {
      return (  compareChars( getIp7051f4MqBypassSw() , ip7051f4MqBypassN88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp7051f4MqBypassNTrue() {  			
    	setIp7051f4MqBypassSw( ip7051f4MqBypassN88Value);
   	}
	/**
	 *	Returns the value of ip7051f4RequestDetails
	 *	@return ip7051f4RequestDetails
	 */   
	 public Ip7051f4RequestDetails getIp7051f4RequestDetails() {
   	return ip7051f4RequestDetails;
   }
   /**
	* 	Update Ip7051f4RequestDetails with the passed value
	*   Corresponding COBOL Variable is IP7051F4-REQUEST-DETAILS
	*	@param value
	*/
   public void setIp7051f4RequestDetails(char[] value) {
      ip7051f4RequestDetails.setString(value); 
   }   
    
     /**
	 * 	Update Ip7051f4RequestDetails 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp7051f4RequestDetails(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip7051f4RequestDetails.begin,ip7051f4RequestDetails.length());
   }
   
     /**
	 * 	Update Ip7051f4RequestDetails 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051f4RequestDetails(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip7051f4RequestDetails.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip7051f4RequestDetails with another Field
	 *	@param value
	 */
   public void setIp7051f4RequestDetails(Field source) {
   	replace(source,0,source.length(),ip7051f4RequestDetails.begin,ip7051f4RequestDetails.length());
   }  
   
     /**
	 * 	Update Ip7051f4RequestDetails 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp7051f4RequestDetails(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip7051f4RequestDetails.begin,ip7051f4RequestDetails.length());
   }
   
     /**
	 * 	Update Ip7051f4RequestDetails 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051f4RequestDetails(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip7051f4RequestDetails.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip7051f4ResponseDetails
	 *	@return ip7051f4ResponseDetails
	 */   
	 public Ip7051f4ResponseDetails getIp7051f4ResponseDetails() {
   	return ip7051f4ResponseDetails;
   }
   /**
	* 	Update Ip7051f4ResponseDetails with the passed value
	*   Corresponding COBOL Variable is IP7051F4-RESPONSE-DETAILS
	*	@param value
	*/
   public void setIp7051f4ResponseDetails(char[] value) {
      ip7051f4ResponseDetails.setString(value); 
   }   
    
     /**
	 * 	Update Ip7051f4ResponseDetails 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp7051f4ResponseDetails(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip7051f4ResponseDetails.begin,ip7051f4ResponseDetails.length());
   }
   
     /**
	 * 	Update Ip7051f4ResponseDetails 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051f4ResponseDetails(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip7051f4ResponseDetails.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip7051f4ResponseDetails with another Field
	 *	@param value
	 */
   public void setIp7051f4ResponseDetails(Field source) {
   	replace(source,0,source.length(),ip7051f4ResponseDetails.begin,ip7051f4ResponseDetails.length());
   }  
   
     /**
	 * 	Update Ip7051f4ResponseDetails 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp7051f4ResponseDetails(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip7051f4ResponseDetails.begin,ip7051f4ResponseDetails.length());
   }
   
     /**
	 * 	Update Ip7051f4ResponseDetails 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051f4ResponseDetails(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip7051f4ResponseDetails.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip7051f4Table
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip7051f4TableKey.initialize();
     
         setIp7051f4MqBypassSw(CONSTANTS.SPACE);
          ip7051f4RequestDetails.initialize();
     
          ip7051f4ResponseDetails.initialize();
     
   }

		public static int getIp7051f4TableFieldLength() {
			return IP_7051F_4_TABLE_LENGTH;
		}

}
  
