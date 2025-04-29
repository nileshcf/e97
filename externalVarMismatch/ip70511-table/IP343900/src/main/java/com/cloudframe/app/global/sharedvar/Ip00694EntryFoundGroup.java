package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00694EntryFoundGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip00694EntryFoundGroup")

public class Ip00694EntryFoundGroup extends Ip00694EntryFoundGroupSerialized  implements InitializingBean {
   

						private char[] ip00694EntryFound = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip00694EntryFoundGroup
	**/
    public Ip00694EntryFoundGroup() {
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
	 *	Returns the value of ip00694EntryFound
	 *	@return ip00694EntryFound
	 */
   public char[] getIp00694EntryFound() throws CFException{
     if (isIp00694EntryFoundModified()) { 
        ip00694EntryFound = refreshIp00694EntryFound();
     }
   		return ip00694EntryFound;
   }

  
	/**
	*  set variable ip00694EntryFound
	*  Corresponding COBOL Variable is IP00694-ENTRY-FOUND
	*  @param value
	**/
   public void setIp00694EntryFound(char[] value) {
      ip00694EntryFound = checkIp00694EntryFoundConstraints(value);
      serializeIp00694EntryFound(ip00694EntryFound);
   } 

     /**
	 * 	Update Ip00694EntryFound 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00694EntryFound(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00694EntryFound,ip00694EntryFound.length);
   	
   }
   
   public void setIp00694EntryFound(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00694EntryFound,ip00694EntryFound.length);
   	
   }
   
     /**
	 * 	Update Ip00694EntryFound 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00694EntryFound(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00694EntryFound+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00694EntryFound with another Field
	 *	@param value
	 */
   public void setIp00694EntryFound(Field source) {
       replace(source,0,source.length(),beginIp00694EntryFound,IP_00694_ENTRY_FOUND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00694EntryFound 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00694EntryFound(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00694EntryFound,IP_00694_ENTRY_FOUND_LEN);
   	
   }
   
     /**
	 * 	Update Ip00694EntryFound 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00694EntryFound(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00694EntryFound+targetIndex,targetLen);
    
   }
	char[] ip00694EntryFoundY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00694EntryFoundY88()
	 *	@return  Returns true if isIp00694EntryFoundY88() is "Y"
	 */
   public boolean isIp00694EntryFoundY88() throws CFException {
      return (  compareChars( getIp00694EntryFound() , ip00694EntryFoundY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00694EntryFoundY88True() {  			
    	setIp00694EntryFound( ip00694EntryFoundY8888Value);
   	}
	char[] ip00694EntryFoundN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp00694EntryFoundN88()
	 *	@return  Returns true if isIp00694EntryFoundN88() is "N"
	 */
   public boolean isIp00694EntryFoundN88() throws CFException {
      return (  compareChars( getIp00694EntryFound() , ip00694EntryFoundN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp00694EntryFoundN88True() {  			
    	setIp00694EntryFound( ip00694EntryFoundN8888Value);
   	}

	
	
	

		public static int getIp00694EntryFoundGroupFieldLength() {
			return IP_00694_ENTRY_FOUND_GROUP_LENGTH;
		}

}
  
