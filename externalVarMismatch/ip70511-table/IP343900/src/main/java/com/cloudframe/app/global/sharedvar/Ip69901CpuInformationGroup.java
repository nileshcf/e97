package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip69901CpuInformationGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:25. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip69901CpuInformationGroup")

public class Ip69901CpuInformationGroup extends Ip69901CpuInformationGroupSerialized  implements InitializingBean {
   

						private char[] ip69901CpuInformation = Field.fillLowValue(4);
	
	/**
	* Constructor for Ip69901CpuInformationGroup
	**/
    public Ip69901CpuInformationGroup() {
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
	 *	Returns the value of ip69901CpuInformation
	 *	@return ip69901CpuInformation
	 */
   public char[] getIp69901CpuInformation() throws CFException{
     if (isIp69901CpuInformationModified()) { 
        ip69901CpuInformation = refreshIp69901CpuInformation();
     }
   		return ip69901CpuInformation;
   }

  
	/**
	*  set variable ip69901CpuInformation
	*  Corresponding COBOL Variable is IP69901-CPU-INFORMATION
	*  @param value
	**/
   public void setIp69901CpuInformation(char[] value) {
      ip69901CpuInformation = checkIp69901CpuInformationConstraints(value);
      serializeIp69901CpuInformation(ip69901CpuInformation);
   } 

     /**
	 * 	Update Ip69901CpuInformation 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp69901CpuInformation(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp69901CpuInformation,ip69901CpuInformation.length);
   	
   }
   
   public void setIp69901CpuInformation(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp69901CpuInformation,ip69901CpuInformation.length);
   	
   }
   
     /**
	 * 	Update Ip69901CpuInformation 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp69901CpuInformation(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp69901CpuInformation+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip69901CpuInformation with another Field
	 *	@param value
	 */
   public void setIp69901CpuInformation(Field source) {
       replace(source,0,source.length(),beginIp69901CpuInformation,IP_69901_CPU_INFORMATION_LEN);
   	
   }  
   
     /**
	 * 	Update Ip69901CpuInformation 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp69901CpuInformation(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp69901CpuInformation,IP_69901_CPU_INFORMATION_LEN);
   	
   }
   
     /**
	 * 	Update Ip69901CpuInformation 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp69901CpuInformation(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp69901CpuInformation+targetIndex,targetLen);
    
   }
	char[] ip69901CpuIsCpua8888Value = "CPUA".toCharArray();
	/**
	 *	Test condition "CPUA" for isIp69901CpuIsCpua88()
	 *	@return  Returns true if isIp69901CpuIsCpua88() is "CPUA"
	 */
   public boolean isIp69901CpuIsCpua88() throws CFException {
      return (  compareChars( getIp69901CpuInformation() , ip69901CpuIsCpua8888Value)  == 0  );
   }


	/**
	*  set values "CPUA"
	*/
   	public void setIp69901CpuIsCpua88True() {  			
    	setIp69901CpuInformation( ip69901CpuIsCpua8888Value);
   	}
	char[] ip69901CpuIsCpuh8888Value = "CPUH".toCharArray();
	/**
	 *	Test condition "CPUH" for isIp69901CpuIsCpuh88()
	 *	@return  Returns true if isIp69901CpuIsCpuh88() is "CPUH"
	 */
   public boolean isIp69901CpuIsCpuh88() throws CFException {
      return (  compareChars( getIp69901CpuInformation() , ip69901CpuIsCpuh8888Value)  == 0  );
   }


	/**
	*  set values "CPUH"
	*/
   	public void setIp69901CpuIsCpuh88True() {  			
    	setIp69901CpuInformation( ip69901CpuIsCpuh8888Value);
   	}

	
	
	

		public static int getIp69901CpuInformationGroupFieldLength() {
			return IP_69901_CPU_INFORMATION_GROUP_LENGTH;
		}

}
  
