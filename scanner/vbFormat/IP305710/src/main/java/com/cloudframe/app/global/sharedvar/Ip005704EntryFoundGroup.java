package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip005704EntryFoundGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:31. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip005704EntryFoundGroup")

public class Ip005704EntryFoundGroup extends Ip005704EntryFoundGroupSerialized  implements InitializingBean {
   

						private char[] ip005704EntryFound = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip005704EntryFoundGroup
	**/
    public Ip005704EntryFoundGroup() {
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
	 *	Returns the value of ip005704EntryFound
	 *	@return ip005704EntryFound
	 */
   public char[] getIp005704EntryFound() throws CFException{
     if (isIp005704EntryFoundModified()) { 
        ip005704EntryFound = refreshIp005704EntryFound();
     }
   		return ip005704EntryFound;
   }

  
	/**
	*  set variable ip005704EntryFound
	*  Corresponding COBOL Variable is IP005704-ENTRY-FOUND
	*  @param value
	**/
   public void setIp005704EntryFound(char[] value) {
      ip005704EntryFound = checkIp005704EntryFoundConstraints(value);
      serializeIp005704EntryFound(ip005704EntryFound);
   } 

     /**
	 * 	Update Ip005704EntryFound 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp005704EntryFound(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp005704EntryFound,ip005704EntryFound.length);
   	
   }
   
   public void setIp005704EntryFound(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp005704EntryFound,ip005704EntryFound.length);
   	
   }
   
     /**
	 * 	Update Ip005704EntryFound 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp005704EntryFound(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp005704EntryFound+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip005704EntryFound with another Field
	 *	@param value
	 */
   public void setIp005704EntryFound(Field source) {
       replace(source,0,source.length(),beginIp005704EntryFound,IP_005704_ENTRY_FOUND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip005704EntryFound 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp005704EntryFound(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp005704EntryFound,IP_005704_ENTRY_FOUND_LEN);
   	
   }
   
     /**
	 * 	Update Ip005704EntryFound 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp005704EntryFound(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp005704EntryFound+targetIndex,targetLen);
    
   }
	char[] ip005704EntryFoundY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp005704EntryFoundY88()
	 *	@return  Returns true if isIp005704EntryFoundY88() is "Y"
	 */
   public boolean isIp005704EntryFoundY88() throws CFException {
      return (  compareChars( getIp005704EntryFound() , ip005704EntryFoundY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp005704EntryFoundY88True() {  			
    	setIp005704EntryFound( ip005704EntryFoundY8888Value);
   	}
	char[] ip005704EntryFoundN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp005704EntryFoundN88()
	 *	@return  Returns true if isIp005704EntryFoundN88() is "N"
	 */
   public boolean isIp005704EntryFoundN88() throws CFException {
      return (  compareChars( getIp005704EntryFound() , ip005704EntryFoundN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp005704EntryFoundN88True() {  			
    	setIp005704EntryFound( ip005704EntryFoundN8888Value);
   	}

	
	
	

		public static int getIp005704EntryFoundGroupFieldLength() {
			return IP_005704_ENTRY_FOUND_GROUP_LENGTH;
		}

}
  
