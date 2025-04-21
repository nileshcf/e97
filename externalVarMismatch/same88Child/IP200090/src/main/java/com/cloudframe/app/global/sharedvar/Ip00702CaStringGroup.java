package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00702CaStringGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:08. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip00702CaStringGroup")

public class Ip00702CaStringGroup extends Ip00702CaStringGroupSerialized  implements InitializingBean {
   

						private char[] ip00702CaString = Field.fillLowValue(2048);
	
	/**
	* Constructor for Ip00702CaStringGroup
	**/
    public Ip00702CaStringGroup() {
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
	 *	Returns the value of ip00702CaString
	 *	@return ip00702CaString
	 */
   public char[] getIp00702CaString() throws CFException{
     if (isIp00702CaStringModified()) { 
        ip00702CaString = refreshIp00702CaString();
     }
   		return ip00702CaString;
   }

  
	/**
	*  set variable ip00702CaString
	*  Corresponding COBOL Variable is IP00702-CA-STRING
	*  @param value
	**/
   public void setIp00702CaString(char[] value) {
      ip00702CaString = checkIp00702CaStringConstraints(value);
      serializeIp00702CaString(ip00702CaString);
   } 

     /**
	 * 	Update Ip00702CaString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00702CaString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00702CaString,ip00702CaString.length);
   	
   }
   
   public void setIp00702CaString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00702CaString,ip00702CaString.length);
   	
   }
   
     /**
	 * 	Update Ip00702CaString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00702CaString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00702CaString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00702CaString with another Field
	 *	@param value
	 */
   public void setIp00702CaString(Field source) {
       replace(source,0,source.length(),beginIp00702CaString,IP_00702_CA_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00702CaString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00702CaString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00702CaString,IP_00702_CA_STRING_LEN);
   	
   }
   
     /**
	 * 	Update Ip00702CaString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00702CaString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00702CaString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getIp00702CaStringGroupFieldLength() {
			return IP_00702_CA_STRING_GROUP_LENGTH;
		}

}
  
