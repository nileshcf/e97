package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00174EntryFoundGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip00174EntryFoundGroup")

public class Ip00174EntryFoundGroup extends Ip00174EntryFoundGroupSerialized  implements InitializingBean {
   

						private char[] ip00174EntryFound = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip00174EntryFoundGroup
	**/
    public Ip00174EntryFoundGroup() {
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
	 *	Returns the value of ip00174EntryFound
	 *	@return ip00174EntryFound
	 */
   public char[] getIp00174EntryFound() throws CFException{
     if (isIp00174EntryFoundModified()) { 
        ip00174EntryFound = refreshIp00174EntryFound();
     }
   		return ip00174EntryFound;
   }

  
	/**
	*  set variable ip00174EntryFound
	*  Corresponding COBOL Variable is IP00174-ENTRY-FOUND
	*  @param value
	**/
   public void setIp00174EntryFound(char[] value) {
      ip00174EntryFound = checkIp00174EntryFoundConstraints(value);
      serializeIp00174EntryFound(ip00174EntryFound);
   } 

     /**
	 * 	Update Ip00174EntryFound 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00174EntryFound(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00174EntryFound,ip00174EntryFound.length);
   	
   }
   
   public void setIp00174EntryFound(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00174EntryFound,ip00174EntryFound.length);
   	
   }
   
     /**
	 * 	Update Ip00174EntryFound 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00174EntryFound(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00174EntryFound+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00174EntryFound with another Field
	 *	@param value
	 */
   public void setIp00174EntryFound(Field source) {
       replace(source,0,source.length(),beginIp00174EntryFound,IP_00174_ENTRY_FOUND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00174EntryFound 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00174EntryFound(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00174EntryFound,IP_00174_ENTRY_FOUND_LEN);
   	
   }
   
     /**
	 * 	Update Ip00174EntryFound 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00174EntryFound(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00174EntryFound+targetIndex,targetLen);
    
   }
	char[] ip00174EntryFoundY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00174EntryFoundY88()
	 *	@return  Returns true if isIp00174EntryFoundY88() is "Y"
	 */
   public boolean isIp00174EntryFoundY88() throws CFException {
      return (  compareChars( getIp00174EntryFound() , ip00174EntryFoundY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00174EntryFoundY88True() {  			
    	setIp00174EntryFound( ip00174EntryFoundY8888Value);
   	}
	char[] ip00174EntryFoundN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp00174EntryFoundN88()
	 *	@return  Returns true if isIp00174EntryFoundN88() is "N"
	 */
   public boolean isIp00174EntryFoundN88() throws CFException {
      return (  compareChars( getIp00174EntryFound() , ip00174EntryFoundN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp00174EntryFoundN88True() {  			
    	setIp00174EntryFound( ip00174EntryFoundN8888Value);
   	}

	
	
	

		public static int getIp00174EntryFoundGroupFieldLength() {
			return IP_00174_ENTRY_FOUND_GROUP_LENGTH;
		}

}
  
