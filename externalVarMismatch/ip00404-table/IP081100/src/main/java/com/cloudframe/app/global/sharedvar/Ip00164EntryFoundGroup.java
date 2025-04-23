package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00164EntryFoundGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip00164EntryFoundGroup")

public class Ip00164EntryFoundGroup extends Ip00164EntryFoundGroupSerialized  implements InitializingBean {
   

						private char[] ip00164EntryFound = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip00164EntryFoundGroup
	**/
    public Ip00164EntryFoundGroup() {
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
	 *	Returns the value of ip00164EntryFound
	 *	@return ip00164EntryFound
	 */
   public char[] getIp00164EntryFound() throws CFException{
     if (isIp00164EntryFoundModified()) { 
        ip00164EntryFound = refreshIp00164EntryFound();
     }
   		return ip00164EntryFound;
   }

  
	/**
	*  set variable ip00164EntryFound
	*  Corresponding COBOL Variable is IP00164-ENTRY-FOUND
	*  @param value
	**/
   public void setIp00164EntryFound(char[] value) {
      ip00164EntryFound = checkIp00164EntryFoundConstraints(value);
      serializeIp00164EntryFound(ip00164EntryFound);
   } 

     /**
	 * 	Update Ip00164EntryFound 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00164EntryFound(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00164EntryFound,ip00164EntryFound.length);
   	
   }
   
   public void setIp00164EntryFound(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00164EntryFound,ip00164EntryFound.length);
   	
   }
   
     /**
	 * 	Update Ip00164EntryFound 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00164EntryFound(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00164EntryFound+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00164EntryFound with another Field
	 *	@param value
	 */
   public void setIp00164EntryFound(Field source) {
       replace(source,0,source.length(),beginIp00164EntryFound,IP_00164_ENTRY_FOUND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00164EntryFound 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00164EntryFound(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00164EntryFound,IP_00164_ENTRY_FOUND_LEN);
   	
   }
   
     /**
	 * 	Update Ip00164EntryFound 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00164EntryFound(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00164EntryFound+targetIndex,targetLen);
    
   }
	char[] ip00164EntryFoundY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00164EntryFoundY88()
	 *	@return  Returns true if isIp00164EntryFoundY88() is "Y"
	 */
   public boolean isIp00164EntryFoundY88() throws CFException {
      return (  compareChars( getIp00164EntryFound() , ip00164EntryFoundY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00164EntryFoundY88True() {  			
    	setIp00164EntryFound( ip00164EntryFoundY8888Value);
   	}
	char[] ip00164EntryFoundN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp00164EntryFoundN88()
	 *	@return  Returns true if isIp00164EntryFoundN88() is "N"
	 */
   public boolean isIp00164EntryFoundN88() throws CFException {
      return (  compareChars( getIp00164EntryFound() , ip00164EntryFoundN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp00164EntryFoundN88True() {  			
    	setIp00164EntryFound( ip00164EntryFoundN8888Value);
   	}

	
	
	

		public static int getIp00164EntryFoundGroupFieldLength() {
			return IP_00164_ENTRY_FOUND_GROUP_LENGTH;
		}

}
  
