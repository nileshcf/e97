package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip005704SrchProdClassGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip005704SrchProdClassGroup")

public class Ip005704SrchProdClassGroup extends Ip005704SrchProdClassGroupSerialized  implements InitializingBean {
   

						private char[] ip005704SrchProdClass = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip005704SrchProdClassGroup
	**/
    public Ip005704SrchProdClassGroup() {
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
	 *	Returns the value of ip005704SrchProdClass
	 *	@return ip005704SrchProdClass
	 */
   public char[] getIp005704SrchProdClass() throws CFException{
     if (isIp005704SrchProdClassModified()) { 
        ip005704SrchProdClass = refreshIp005704SrchProdClass();
     }
   		return ip005704SrchProdClass;
   }

  
	/**
	*  set variable ip005704SrchProdClass
	*  Corresponding COBOL Variable is IP005704-SRCH-PROD-CLASS
	*  @param value
	**/
   public void setIp005704SrchProdClass(char[] value) {
      ip005704SrchProdClass = checkIp005704SrchProdClassConstraints(value);
      serializeIp005704SrchProdClass(ip005704SrchProdClass);
   } 

     /**
	 * 	Update Ip005704SrchProdClass 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp005704SrchProdClass(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp005704SrchProdClass,ip005704SrchProdClass.length);
   	
   }
   
   public void setIp005704SrchProdClass(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp005704SrchProdClass,ip005704SrchProdClass.length);
   	
   }
   
     /**
	 * 	Update Ip005704SrchProdClass 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp005704SrchProdClass(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp005704SrchProdClass+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip005704SrchProdClass with another Field
	 *	@param value
	 */
   public void setIp005704SrchProdClass(Field source) {
       replace(source,0,source.length(),beginIp005704SrchProdClass,IP_005704_SRCH_PROD_CLASS_LEN);
   	
   }  
   
     /**
	 * 	Update Ip005704SrchProdClass 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp005704SrchProdClass(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp005704SrchProdClass,IP_005704_SRCH_PROD_CLASS_LEN);
   	
   }
   
     /**
	 * 	Update Ip005704SrchProdClass 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp005704SrchProdClass(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp005704SrchProdClass+targetIndex,targetLen);
    
   }
	char[] ip005704SrchProdClass8888Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isIp005704SrchProdClass88()
	 *	@return  Returns true if isIp005704SrchProdClass88() is "1"
	 */
   public boolean isIp005704SrchProdClass88() throws CFException {
      return (  compareChars( getIp005704SrchProdClass() , ip005704SrchProdClass8888Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setIp005704SrchProdClass88True() {  			
    	setIp005704SrchProdClass( ip005704SrchProdClass8888Value);
   	}

	
	
	

		public static int getIp005704SrchProdClassGroupFieldLength() {
			return IP_005704_SRCH_PROD_CLASS_GROUP_LENGTH;
		}

}
  
