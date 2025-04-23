package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip7051pmrTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip7051pmrTable")

public class Ip7051pmrTable extends Ip7051pmrTableSerialized  implements InitializingBean {
   
				private Ip7051pmrTableKey ip7051pmrTableKey = new Ip7051pmrTableKey();

						private char[] ip7051pmrMqBypassSw = Field.fillLowValue(1);
				private Ip7051pmrRequestDetails ip7051pmrRequestDetails = new Ip7051pmrRequestDetails();
				private Ip7051pmrResponseDetails ip7051pmrResponseDetails = new Ip7051pmrResponseDetails();
	
	/**
	* Constructor for Ip7051pmrTable
	**/
    public Ip7051pmrTable() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip7051pmrTableKey.setParent(this,getStartOffset() + 0);
	       			ip7051pmrRequestDetails.setParent(this,getStartOffset() + 33);
	       			ip7051pmrResponseDetails.setParent(this,getStartOffset() + 129);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip7051pmrTableKey
	 *	@return ip7051pmrTableKey
	 */   
	 public Ip7051pmrTableKey getIp7051pmrTableKey() {
   	return ip7051pmrTableKey;
   }
   /**
	* 	Update Ip7051pmrTableKey with the passed value
	*   Corresponding COBOL Variable is IP7051PMR-TABLE-KEY
	*	@param value
	*/
   public void setIp7051pmrTableKey(char[] value) {
      ip7051pmrTableKey.setString(value); 
   }   
    
     /**
	 * 	Update Ip7051pmrTableKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp7051pmrTableKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip7051pmrTableKey.begin,ip7051pmrTableKey.length());
   }
   
     /**
	 * 	Update Ip7051pmrTableKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pmrTableKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip7051pmrTableKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip7051pmrTableKey with another Field
	 *	@param value
	 */
   public void setIp7051pmrTableKey(Field source) {
   	replace(source,0,source.length(),ip7051pmrTableKey.begin,ip7051pmrTableKey.length());
   }  
   
     /**
	 * 	Update Ip7051pmrTableKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp7051pmrTableKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip7051pmrTableKey.begin,ip7051pmrTableKey.length());
   }
   
     /**
	 * 	Update Ip7051pmrTableKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pmrTableKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip7051pmrTableKey.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip7051pmrMqBypassSw
	 *	@return ip7051pmrMqBypassSw
	 */
   public char[] getIp7051pmrMqBypassSw() throws CFException{
     if (isIp7051pmrMqBypassSwModified()) { 
        ip7051pmrMqBypassSw = refreshIp7051pmrMqBypassSw();
     }
   		return ip7051pmrMqBypassSw;
   }

  
	/**
	*  set variable ip7051pmrMqBypassSw
	*  Corresponding COBOL Variable is IP7051PMR-MQ-BYPASS-SW
	*  @param value
	**/
   public void setIp7051pmrMqBypassSw(char[] value) {
      ip7051pmrMqBypassSw = checkIp7051pmrMqBypassSwConstraints(value);
      serializeIp7051pmrMqBypassSw(ip7051pmrMqBypassSw);
   } 

     /**
	 * 	Update Ip7051pmrMqBypassSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7051pmrMqBypassSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7051pmrMqBypassSw,ip7051pmrMqBypassSw.length);
   	
   }
   
   public void setIp7051pmrMqBypassSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pmrMqBypassSw,ip7051pmrMqBypassSw.length);
   	
   }
   
     /**
	 * 	Update Ip7051pmrMqBypassSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pmrMqBypassSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pmrMqBypassSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7051pmrMqBypassSw with another Field
	 *	@param value
	 */
   public void setIp7051pmrMqBypassSw(Field source) {
       replace(source,0,source.length(),beginIp7051pmrMqBypassSw,IP_7051PMR_MQ_BYPASS_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7051pmrMqBypassSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7051pmrMqBypassSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7051pmrMqBypassSw,IP_7051PMR_MQ_BYPASS_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip7051pmrMqBypassSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pmrMqBypassSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pmrMqBypassSw+targetIndex,targetLen);
    
   }
	char[] ip7051pmrMqBypassY88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp7051pmrMqBypassY()
	 *	@return  Returns true if isIp7051pmrMqBypassY() is "Y"
	 */
   public boolean isIp7051pmrMqBypassY() throws CFException {
      return (  compareChars( getIp7051pmrMqBypassSw() , ip7051pmrMqBypassY88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp7051pmrMqBypassYTrue() {  			
    	setIp7051pmrMqBypassSw( ip7051pmrMqBypassY88Value);
   	}
	char[] ip7051pmrMqBypassN88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp7051pmrMqBypassN()
	 *	@return  Returns true if isIp7051pmrMqBypassN() is "N"
	 */
   public boolean isIp7051pmrMqBypassN() throws CFException {
      return (  compareChars( getIp7051pmrMqBypassSw() , ip7051pmrMqBypassN88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp7051pmrMqBypassNTrue() {  			
    	setIp7051pmrMqBypassSw( ip7051pmrMqBypassN88Value);
   	}
	/**
	 *	Returns the value of ip7051pmrRequestDetails
	 *	@return ip7051pmrRequestDetails
	 */   
	 public Ip7051pmrRequestDetails getIp7051pmrRequestDetails() {
   	return ip7051pmrRequestDetails;
   }
   /**
	* 	Update Ip7051pmrRequestDetails with the passed value
	*   Corresponding COBOL Variable is IP7051PMR-REQUEST-DETAILS
	*	@param value
	*/
   public void setIp7051pmrRequestDetails(char[] value) {
      ip7051pmrRequestDetails.setString(value); 
   }   
    
     /**
	 * 	Update Ip7051pmrRequestDetails 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp7051pmrRequestDetails(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip7051pmrRequestDetails.begin,ip7051pmrRequestDetails.length());
   }
   
     /**
	 * 	Update Ip7051pmrRequestDetails 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pmrRequestDetails(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip7051pmrRequestDetails.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip7051pmrRequestDetails with another Field
	 *	@param value
	 */
   public void setIp7051pmrRequestDetails(Field source) {
   	replace(source,0,source.length(),ip7051pmrRequestDetails.begin,ip7051pmrRequestDetails.length());
   }  
   
     /**
	 * 	Update Ip7051pmrRequestDetails 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp7051pmrRequestDetails(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip7051pmrRequestDetails.begin,ip7051pmrRequestDetails.length());
   }
   
     /**
	 * 	Update Ip7051pmrRequestDetails 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pmrRequestDetails(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip7051pmrRequestDetails.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip7051pmrResponseDetails
	 *	@return ip7051pmrResponseDetails
	 */   
	 public Ip7051pmrResponseDetails getIp7051pmrResponseDetails() {
   	return ip7051pmrResponseDetails;
   }
   /**
	* 	Update Ip7051pmrResponseDetails with the passed value
	*   Corresponding COBOL Variable is IP7051PMR-RESPONSE-DETAILS
	*	@param value
	*/
   public void setIp7051pmrResponseDetails(char[] value) {
      ip7051pmrResponseDetails.setString(value); 
   }   
    
     /**
	 * 	Update Ip7051pmrResponseDetails 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp7051pmrResponseDetails(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip7051pmrResponseDetails.begin,ip7051pmrResponseDetails.length());
   }
   
     /**
	 * 	Update Ip7051pmrResponseDetails 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pmrResponseDetails(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip7051pmrResponseDetails.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip7051pmrResponseDetails with another Field
	 *	@param value
	 */
   public void setIp7051pmrResponseDetails(Field source) {
   	replace(source,0,source.length(),ip7051pmrResponseDetails.begin,ip7051pmrResponseDetails.length());
   }  
   
     /**
	 * 	Update Ip7051pmrResponseDetails 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp7051pmrResponseDetails(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip7051pmrResponseDetails.begin,ip7051pmrResponseDetails.length());
   }
   
     /**
	 * 	Update Ip7051pmrResponseDetails 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pmrResponseDetails(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip7051pmrResponseDetails.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip7051pmrTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip7051pmrTableKey.initialize();
     
         setIp7051pmrMqBypassSw(CONSTANTS.SPACE);
          ip7051pmrRequestDetails.initialize();
     
          ip7051pmrResponseDetails.initialize();
     
   }

		public static int getIp7051pmrTableFieldLength() {
			return IP_7051PMR_TABLE_LENGTH;
		}

}
  
