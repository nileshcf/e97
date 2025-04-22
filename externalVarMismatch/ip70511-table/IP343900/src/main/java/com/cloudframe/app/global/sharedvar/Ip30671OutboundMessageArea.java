package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip30671OutboundMessageArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip30671OutboundMessageArea")

public class Ip30671OutboundMessageArea extends Ip30671OutboundMessageAreaSerialized  implements InitializingBean {
   

						private char[] ip30671SortKey = Field.fillLowValue(212);

						private char[] ip30671MessageArea = Field.fillLowValue(32544);
	
	/**
	* Constructor for Ip30671OutboundMessageArea
	**/
    public Ip30671OutboundMessageArea() {
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
	 *	Returns the value of ip30671SortKey
	 *	@return ip30671SortKey
	 */
   public char[] getIp30671SortKey() throws CFException{
     if (isIp30671SortKeyModified()) { 
        ip30671SortKey = refreshIp30671SortKey();
     }
   		return ip30671SortKey;
   }

  
	/**
	*  set variable ip30671SortKey
	*  Corresponding COBOL Variable is IP30671-SORT-KEY
	*  @param value
	**/
   public void setIp30671SortKey(char[] value) {
      ip30671SortKey = checkIp30671SortKeyConstraints(value);
      serializeIp30671SortKey(ip30671SortKey);
   } 

     /**
	 * 	Update Ip30671SortKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp30671SortKey(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp30671SortKey,ip30671SortKey.length);
   	
   }
   
   public void setIp30671SortKey(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp30671SortKey,ip30671SortKey.length);
   	
   }
   
     /**
	 * 	Update Ip30671SortKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp30671SortKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp30671SortKey+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip30671SortKey with another Field
	 *	@param value
	 */
   public void setIp30671SortKey(Field source) {
       replace(source,0,source.length(),beginIp30671SortKey,IP_30671_SORT_KEY_LEN);
   	
   }  
   
     /**
	 * 	Update Ip30671SortKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp30671SortKey(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp30671SortKey,IP_30671_SORT_KEY_LEN);
   	
   }
   
     /**
	 * 	Update Ip30671SortKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp30671SortKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp30671SortKey+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip30671MessageArea
	 *	@return ip30671MessageArea
	 */
   public char[] getIp30671MessageArea() throws CFException{
     if (isIp30671MessageAreaModified()) { 
        ip30671MessageArea = refreshIp30671MessageArea();
     }
   		return ip30671MessageArea;
   }

  
	/**
	*  set variable ip30671MessageArea
	*  Corresponding COBOL Variable is IP30671-MESSAGE-AREA
	*  @param value
	**/
   public void setIp30671MessageArea(char[] value) {
      ip30671MessageArea = checkIp30671MessageAreaConstraints(value);
      serializeIp30671MessageArea(ip30671MessageArea);
   } 

     /**
	 * 	Update Ip30671MessageArea 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp30671MessageArea(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp30671MessageArea,ip30671MessageArea.length);
   	
   }
   
   public void setIp30671MessageArea(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp30671MessageArea,ip30671MessageArea.length);
   	
   }
   
     /**
	 * 	Update Ip30671MessageArea 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp30671MessageArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp30671MessageArea+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip30671MessageArea with another Field
	 *	@param value
	 */
   public void setIp30671MessageArea(Field source) {
       replace(source,0,source.length(),beginIp30671MessageArea,IP_30671_MESSAGE_AREA_LEN);
   	
   }  
   
     /**
	 * 	Update Ip30671MessageArea 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp30671MessageArea(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp30671MessageArea,IP_30671_MESSAGE_AREA_LEN);
   	
   }
   
     /**
	 * 	Update Ip30671MessageArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp30671MessageArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp30671MessageArea+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip30671OutboundMessageArea
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp30671SortKey(CONSTANTS.SPACE_212);
         setIp30671MessageArea(CONSTANTS.SPACE_32544);
   }

		public static int getIp30671OutboundMessageAreaFieldLength() {
			return IP_30671_OUTBOUND_MESSAGE_AREA_LENGTH;
		}

}
  
