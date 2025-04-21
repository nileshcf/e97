package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip08151PartnStrtGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:11. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip08151PartnStrtGroup")

public class Ip08151PartnStrtGroup extends Ip08151PartnStrtGroupSerialized  implements InitializingBean {
   

						private char[] ip08151PartnStrt = Field.fillLowValue(3);
	
	/**
	* Constructor for Ip08151PartnStrtGroup
	**/
    public Ip08151PartnStrtGroup() {
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
	 *	Returns the value of ip08151PartnStrt
	 *	@return ip08151PartnStrt
	 */
   public char[] getIp08151PartnStrt() throws CFException{
     if (isIp08151PartnStrtModified()) { 
        ip08151PartnStrt = refreshIp08151PartnStrt();
     }
   		return ip08151PartnStrt;
   }

  
	/**
	*  set variable ip08151PartnStrt
	*  Corresponding COBOL Variable is IP08151-PARTN-STRT
	*  @param value
	**/
   public void setIp08151PartnStrt(char[] value) {
      ip08151PartnStrt = checkIp08151PartnStrtConstraints(value);
      serializeIp08151PartnStrt(ip08151PartnStrt);
   } 

     /**
	 * 	Update Ip08151PartnStrt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp08151PartnStrt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp08151PartnStrt,ip08151PartnStrt.length);
   	
   }
   
   public void setIp08151PartnStrt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp08151PartnStrt,ip08151PartnStrt.length);
   	
   }
   
     /**
	 * 	Update Ip08151PartnStrt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp08151PartnStrt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08151PartnStrt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip08151PartnStrt with another Field
	 *	@param value
	 */
   public void setIp08151PartnStrt(Field source) {
       replace(source,0,source.length(),beginIp08151PartnStrt,IP_08151_PARTN_STRT_LEN);
   	
   }  
   
     /**
	 * 	Update Ip08151PartnStrt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp08151PartnStrt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp08151PartnStrt,IP_08151_PARTN_STRT_LEN);
   	
   }
   
     /**
	 * 	Update Ip08151PartnStrt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp08151PartnStrt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08151PartnStrt+targetIndex,targetLen);
    
   }

	
	
	

		public static int getIp08151PartnStrtGroupFieldLength() {
			return IP_08151_PARTN_STRT_GROUP_LENGTH;
		}

}
  
