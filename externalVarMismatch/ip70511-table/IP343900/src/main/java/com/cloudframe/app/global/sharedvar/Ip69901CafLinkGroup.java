package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip69901CafLinkGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip69901CafLinkGroup")

public class Ip69901CafLinkGroup extends Ip69901CafLinkGroupSerialized  implements InitializingBean {
   

						private char[] ip69901CafLink = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip69901CafLinkGroup
	**/
    public Ip69901CafLinkGroup() {
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
	 *	Returns the value of ip69901CafLink
	 *	@return ip69901CafLink
	 */
   public char[] getIp69901CafLink() throws CFException{
     if (isIp69901CafLinkModified()) { 
        ip69901CafLink = refreshIp69901CafLink();
     }
   		return ip69901CafLink;
   }

  
	/**
	*  set variable ip69901CafLink
	*  Corresponding COBOL Variable is IP69901-CAF-LINK
	*  @param value
	**/
   public void setIp69901CafLink(char[] value) {
      ip69901CafLink = checkIp69901CafLinkConstraints(value);
      serializeIp69901CafLink(ip69901CafLink);
   } 

     /**
	 * 	Update Ip69901CafLink 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp69901CafLink(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp69901CafLink,ip69901CafLink.length);
   	
   }
   
   public void setIp69901CafLink(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp69901CafLink,ip69901CafLink.length);
   	
   }
   
     /**
	 * 	Update Ip69901CafLink 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp69901CafLink(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp69901CafLink+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip69901CafLink with another Field
	 *	@param value
	 */
   public void setIp69901CafLink(Field source) {
       replace(source,0,source.length(),beginIp69901CafLink,IP_69901_CAF_LINK_LEN);
   	
   }  
   
     /**
	 * 	Update Ip69901CafLink 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp69901CafLink(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp69901CafLink,IP_69901_CAF_LINK_LEN);
   	
   }
   
     /**
	 * 	Update Ip69901CafLink 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp69901CafLink(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp69901CafLink+targetIndex,targetLen);
    
   }
	char[] ip69901CafInit8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp69901CafInit88()
	 *	@return  Returns true if isIp69901CafInit88() is "Y"
	 */
   public boolean isIp69901CafInit88() throws CFException {
      return (  compareChars( getIp69901CafLink() , ip69901CafInit8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp69901CafInit88True() {  			
    	setIp69901CafLink( ip69901CafInit8888Value);
   	}
	char[] ip69901CafReset8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp69901CafReset88()
	 *	@return  Returns true if isIp69901CafReset88() is "N"
	 */
   public boolean isIp69901CafReset88() throws CFException {
      return (  compareChars( getIp69901CafLink() , ip69901CafReset8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp69901CafReset88True() {  			
    	setIp69901CafLink( ip69901CafReset8888Value);
   	}

	
	
	

		public static int getIp69901CafLinkGroupFieldLength() {
			return IP_69901_CAF_LINK_GROUP_LENGTH;
		}

}
  
