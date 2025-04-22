package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip7051pmrEntryFoundGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:15. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip7051pmrEntryFoundGroup")

public class Ip7051pmrEntryFoundGroup extends Ip7051pmrEntryFoundGroupSerialized  implements InitializingBean {
   

						private char[] ip7051pmrEntryFound = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip7051pmrEntryFoundGroup
	**/
    public Ip7051pmrEntryFoundGroup() {
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
	 *	Returns the value of ip7051pmrEntryFound
	 *	@return ip7051pmrEntryFound
	 */
   public char[] getIp7051pmrEntryFound() throws CFException{
     if (isIp7051pmrEntryFoundModified()) { 
        ip7051pmrEntryFound = refreshIp7051pmrEntryFound();
     }
   		return ip7051pmrEntryFound;
   }

  
	/**
	*  set variable ip7051pmrEntryFound
	*  Corresponding COBOL Variable is IP7051PMR-ENTRY-FOUND
	*  @param value
	**/
   public void setIp7051pmrEntryFound(char[] value) {
      ip7051pmrEntryFound = checkIp7051pmrEntryFoundConstraints(value);
      serializeIp7051pmrEntryFound(ip7051pmrEntryFound);
   } 

     /**
	 * 	Update Ip7051pmrEntryFound 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7051pmrEntryFound(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7051pmrEntryFound,ip7051pmrEntryFound.length);
   	
   }
   
   public void setIp7051pmrEntryFound(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pmrEntryFound,ip7051pmrEntryFound.length);
   	
   }
   
     /**
	 * 	Update Ip7051pmrEntryFound 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pmrEntryFound(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pmrEntryFound+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7051pmrEntryFound with another Field
	 *	@param value
	 */
   public void setIp7051pmrEntryFound(Field source) {
       replace(source,0,source.length(),beginIp7051pmrEntryFound,IP_7051PMR_ENTRY_FOUND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7051pmrEntryFound 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7051pmrEntryFound(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7051pmrEntryFound,IP_7051PMR_ENTRY_FOUND_LEN);
   	
   }
   
     /**
	 * 	Update Ip7051pmrEntryFound 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pmrEntryFound(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pmrEntryFound+targetIndex,targetLen);
    
   }
	char[] ip7051pmrEntryFoundY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp7051pmrEntryFoundY88()
	 *	@return  Returns true if isIp7051pmrEntryFoundY88() is "Y"
	 */
   public boolean isIp7051pmrEntryFoundY88() throws CFException {
      return (  compareChars( getIp7051pmrEntryFound() , ip7051pmrEntryFoundY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp7051pmrEntryFoundY88True() {  			
    	setIp7051pmrEntryFound( ip7051pmrEntryFoundY8888Value);
   	}
	char[] ip7051pmrEntryFoundN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp7051pmrEntryFoundN88()
	 *	@return  Returns true if isIp7051pmrEntryFoundN88() is "N"
	 */
   public boolean isIp7051pmrEntryFoundN88() throws CFException {
      return (  compareChars( getIp7051pmrEntryFound() , ip7051pmrEntryFoundN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp7051pmrEntryFoundN88True() {  			
    	setIp7051pmrEntryFound( ip7051pmrEntryFoundN8888Value);
   	}

	
	
	

		public static int getIp7051pmrEntryFoundGroupFieldLength() {
			return IP_7051PMR_ENTRY_FOUND_GROUP_LENGTH;
		}

}
  
