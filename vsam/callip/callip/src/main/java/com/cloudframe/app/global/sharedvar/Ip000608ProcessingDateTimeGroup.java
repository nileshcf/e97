package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip000608ProcessingDateTimeGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:59. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip000608ProcessingDateTimeGroup")

public class Ip000608ProcessingDateTimeGroup extends Ip000608ProcessingDateTimeGroupSerialized  implements InitializingBean {
   

						private char[] ip000608ProcessingDateTime = Field.fillLowValue(10);
	
	/**
	* Constructor for Ip000608ProcessingDateTimeGroup
	**/
    public Ip000608ProcessingDateTimeGroup() {
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
	 *	Returns the value of ip000608ProcessingDateTime
	 *	@return ip000608ProcessingDateTime
	 */
   public char[] getIp000608ProcessingDateTime() throws CFException{
     if (isIp000608ProcessingDateTimeModified()) { 
        ip000608ProcessingDateTime = refreshIp000608ProcessingDateTime();
     }
   		return ip000608ProcessingDateTime;
   }

  
	/**
	*  set variable ip000608ProcessingDateTime
	*  Corresponding COBOL Variable is IP000608-PROCESSING-DATE-TIME
	*  @param value
	**/
   public void setIp000608ProcessingDateTime(char[] value) {
      ip000608ProcessingDateTime = checkIp000608ProcessingDateTimeConstraints(value);
      serializeIp000608ProcessingDateTime(ip000608ProcessingDateTime);
   } 

     /**
	 * 	Update Ip000608ProcessingDateTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp000608ProcessingDateTime,ip000608ProcessingDateTime.length);
   	
   }
   
   public void setIp000608ProcessingDateTime(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp000608ProcessingDateTime,ip000608ProcessingDateTime.length);
   	
   }
   
     /**
	 * 	Update Ip000608ProcessingDateTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp000608ProcessingDateTime+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip000608ProcessingDateTime with another Field
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(Field source) {
       replace(source,0,source.length(),beginIp000608ProcessingDateTime,IP_000608_PROCESSING_DATE_TIME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip000608ProcessingDateTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp000608ProcessingDateTime,IP_000608_PROCESSING_DATE_TIME_LEN);
   	
   }
   
     /**
	 * 	Update Ip000608ProcessingDateTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp000608ProcessingDateTime+targetIndex,targetLen);
    
   }

	
	
	

		public static int getIp000608ProcessingDateTimeGroupFieldLength() {
			return IP_000608_PROCESSING_DATE_TIME_GROUP_LENGTH;
		}

}
  
