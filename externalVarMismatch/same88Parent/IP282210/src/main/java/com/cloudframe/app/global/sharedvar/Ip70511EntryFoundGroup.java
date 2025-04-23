package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70511EntryFoundGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:30. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip70511EntryFoundGroup")

public class Ip70511EntryFoundGroup extends Ip70511EntryFoundGroupSerialized  implements InitializingBean {
   

						private char[] ip70511EntryFound = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip70511EntryFoundGroup
	**/
    public Ip70511EntryFoundGroup() {
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
	 *	Returns the value of ip70511EntryFound
	 *	@return ip70511EntryFound
	 */
   public char[] getIp70511EntryFound() throws CFException{
     if (isIp70511EntryFoundModified()) { 
        ip70511EntryFound = refreshIp70511EntryFound();
     }
   		return ip70511EntryFound;
   }

  
	/**
	*  set variable ip70511EntryFound
	*  Corresponding COBOL Variable is IP70511-ENTRY-FOUND
	*  @param value
	**/
   public void setIp70511EntryFound(char[] value) {
      ip70511EntryFound = checkIp70511EntryFoundConstraints(value);
      serializeIp70511EntryFound(ip70511EntryFound);
   } 

     /**
	 * 	Update Ip70511EntryFound 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70511EntryFound(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70511EntryFound,ip70511EntryFound.length);
   	
   }
   
   public void setIp70511EntryFound(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70511EntryFound,ip70511EntryFound.length);
   	
   }
   
     /**
	 * 	Update Ip70511EntryFound 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70511EntryFound(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70511EntryFound+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70511EntryFound with another Field
	 *	@param value
	 */
   public void setIp70511EntryFound(Field source) {
       replace(source,0,source.length(),beginIp70511EntryFound,IP_70511_ENTRY_FOUND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70511EntryFound 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70511EntryFound(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70511EntryFound,IP_70511_ENTRY_FOUND_LEN);
   	
   }
   
     /**
	 * 	Update Ip70511EntryFound 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70511EntryFound(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70511EntryFound+targetIndex,targetLen);
    
   }
	char[] ip70511EntryFoundY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp70511EntryFoundY88()
	 *	@return  Returns true if isIp70511EntryFoundY88() is "Y"
	 */
   public boolean isIp70511EntryFoundY88() throws CFException {
      return (  compareChars( getIp70511EntryFound() , ip70511EntryFoundY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp70511EntryFoundY88True() {  			
    	setIp70511EntryFound( ip70511EntryFoundY8888Value);
   	}
	char[] ip70511EntryFoundN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp70511EntryFoundN88()
	 *	@return  Returns true if isIp70511EntryFoundN88() is "N"
	 */
   public boolean isIp70511EntryFoundN88() throws CFException {
      return (  compareChars( getIp70511EntryFound() , ip70511EntryFoundN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp70511EntryFoundN88True() {  			
    	setIp70511EntryFound( ip70511EntryFoundN8888Value);
   	}

	
	
	

		public static int getIp70511EntryFoundGroupFieldLength() {
			return IP_70511_ENTRY_FOUND_GROUP_LENGTH;
		}

}
  
