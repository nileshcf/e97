package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00754EntryFoundGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip00754EntryFoundGroup")

public class Ip00754EntryFoundGroup extends Ip00754EntryFoundGroupSerialized  implements InitializingBean {
   

						private char[] ip00754EntryFound = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip00754EntryFoundGroup
	**/
    public Ip00754EntryFoundGroup() {
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
	 *	Returns the value of ip00754EntryFound
	 *	@return ip00754EntryFound
	 */
   public char[] getIp00754EntryFound() throws CFException{
     if (isIp00754EntryFoundModified()) { 
        ip00754EntryFound = refreshIp00754EntryFound();
     }
   		return ip00754EntryFound;
   }

  
	/**
	*  set variable ip00754EntryFound
	*  Corresponding COBOL Variable is IP00754-ENTRY-FOUND
	*  @param value
	**/
   public void setIp00754EntryFound(char[] value) {
      ip00754EntryFound = checkIp00754EntryFoundConstraints(value);
      serializeIp00754EntryFound(ip00754EntryFound);
   } 

     /**
	 * 	Update Ip00754EntryFound 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00754EntryFound(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00754EntryFound,ip00754EntryFound.length);
   	
   }
   
   public void setIp00754EntryFound(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00754EntryFound,ip00754EntryFound.length);
   	
   }
   
     /**
	 * 	Update Ip00754EntryFound 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00754EntryFound(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00754EntryFound+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00754EntryFound with another Field
	 *	@param value
	 */
   public void setIp00754EntryFound(Field source) {
       replace(source,0,source.length(),beginIp00754EntryFound,IP_00754_ENTRY_FOUND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00754EntryFound 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00754EntryFound(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00754EntryFound,IP_00754_ENTRY_FOUND_LEN);
   	
   }
   
     /**
	 * 	Update Ip00754EntryFound 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00754EntryFound(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00754EntryFound+targetIndex,targetLen);
    
   }
	char[] ip00754EntryFoundY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00754EntryFoundY88()
	 *	@return  Returns true if isIp00754EntryFoundY88() is "Y"
	 */
   public boolean isIp00754EntryFoundY88() throws CFException {
      return (  compareChars( getIp00754EntryFound() , ip00754EntryFoundY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00754EntryFoundY88True() {  			
    	setIp00754EntryFound( ip00754EntryFoundY8888Value);
   	}
	char[] ip00754EntryFoundN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp00754EntryFoundN88()
	 *	@return  Returns true if isIp00754EntryFoundN88() is "N"
	 */
   public boolean isIp00754EntryFoundN88() throws CFException {
      return (  compareChars( getIp00754EntryFound() , ip00754EntryFoundN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp00754EntryFoundN88True() {  			
    	setIp00754EntryFound( ip00754EntryFoundN8888Value);
   	}

	
	
	

		public static int getIp00754EntryFoundGroupFieldLength() {
			return IP_00754_ENTRY_FOUND_GROUP_LENGTH;
		}

}
  
